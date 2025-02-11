package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TransitionInflater {
    private static final ArrayMap<String, Constructor> CONSTRUCTORS = new ArrayMap();
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class};
    private final Context mContext;

    private TransitionInflater(@NonNull Context context) {
        this.mContext = context;
    }

    public static TransitionInflater from(Context context) {
        return new TransitionInflater(context);
    }

    public Transition inflateTransition(int i) {
        XmlResourceParser xml = this.mContext.getResources().getXml(i);
        try {
            Transition createTransitionFromXml = createTransitionFromXml(xml, Xml.asAttributeSet(xml), null);
            xml.close();
            return createTransitionFromXml;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(xml.getPositionDescription());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            throw new InflateException(stringBuilder.toString(), e2);
        } catch (Throwable th) {
            xml.close();
        }
    }

    public TransitionManager inflateTransitionManager(int i, ViewGroup viewGroup) {
        InflateException inflateException;
        XmlResourceParser xml = this.mContext.getResources().getXml(i);
        try {
            TransitionManager createTransitionManagerFromXml = createTransitionManagerFromXml(xml, Xml.asAttributeSet(xml), viewGroup);
            xml.close();
            return createTransitionManagerFromXml;
        } catch (XmlPullParserException e) {
            inflateException = new InflateException(e.getMessage());
            inflateException.initCause(e);
            throw inflateException;
        } catch (IOException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(xml.getPositionDescription());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            inflateException = new InflateException(stringBuilder.toString());
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Throwable th) {
            xml.close();
        }
    }

    private Transition createTransitionFromXml(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) {
        Transition transition2;
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0:
        while (true) {
            transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            transition2 = new Fade(this.mContext, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            transition2 = new ChangeBounds(this.mContext, attributeSet);
                        } else if ("slide".equals(name)) {
                            transition2 = new Slide(this.mContext, attributeSet);
                        } else if ("explode".equals(name)) {
                            transition2 = new Explode(this.mContext, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            transition2 = new ChangeImageTransform(this.mContext, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            transition2 = new ChangeTransform(this.mContext, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            transition2 = new ChangeClipBounds(this.mContext, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            transition2 = new AutoTransition(this.mContext, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            transition2 = new ChangeScroll(this.mContext, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            transition2 = new TransitionSet(this.mContext, attributeSet);
                        } else {
                            String str = "transition";
                            if (str.equals(name)) {
                                transition2 = (Transition) createCustom(attributeSet, Transition.class, str);
                            } else if ("targets".equals(name)) {
                                getTargetIds(xmlPullParser, attributeSet, transition);
                            } else if (!"arcMotion".equals(name)) {
                                str = "pathMotion";
                                if (str.equals(name)) {
                                    if (transition != null) {
                                        transition.setPathMotion((PathMotion) createCustom(attributeSet, PathMotion.class, str));
                                    } else {
                                        throw new RuntimeException("Invalid use of pathMotion element");
                                    }
                                } else if (!"patternPathMotion".equals(name)) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown scene name: ");
                                    stringBuilder.append(xmlPullParser.getName());
                                    throw new RuntimeException(stringBuilder.toString());
                                } else if (transition != null) {
                                    transition.setPathMotion(new PatternPathMotion(this.mContext, attributeSet));
                                } else {
                                    throw new RuntimeException("Invalid use of patternPathMotion element");
                                }
                            } else if (transition != null) {
                                transition.setPathMotion(new ArcMotion(this.mContext, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                createTransitionFromXml(xmlPullParser, attributeSet, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            } else if (transition != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.addTransition(transition2);
        }
        return transition2;
    }

    private Object createCustom(AttributeSet attributeSet, Class cls, String str) {
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                Object newInstance;
                synchronized (CONSTRUCTORS) {
                    Constructor constructor = (Constructor) CONSTRUCTORS.get(attributeValue);
                    if (constructor == null) {
                        Class asSubclass = this.mContext.getClassLoader().loadClass(attributeValue).asSubclass(cls);
                        if (asSubclass != null) {
                            constructor = asSubclass.getConstructor(CONSTRUCTOR_SIGNATURE);
                            constructor.setAccessible(true);
                            CONSTRUCTORS.put(attributeValue, constructor);
                        }
                    }
                    newInstance = constructor.newInstance(new Object[]{this.mContext, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not instantiate ");
                stringBuilder.append(cls);
                stringBuilder.append(" class ");
                stringBuilder.append(attributeValue);
                throw new InflateException(stringBuilder.toString(), e);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" tag must have a 'class' attribute");
        throw new InflateException(stringBuilder2.toString());
    }

    private void getTargetIds(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) {
        StringBuilder stringBuilder;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_TARGET);
                    int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (namedResourceId != 0) {
                        transition.addTarget(namedResourceId);
                    } else {
                        int namedResourceId2 = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (namedResourceId2 != 0) {
                            transition.excludeTarget(namedResourceId2, true);
                        } else {
                            String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (namedString != null) {
                                transition.addTarget(namedString);
                            } else {
                                namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (namedString != null) {
                                    transition.excludeTarget(namedString, true);
                                } else {
                                    String namedString2 = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (namedString2 != null) {
                                        try {
                                            transition.excludeTarget(Class.forName(namedString2), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Could not create ");
                                            stringBuilder.append(namedString2);
                                            throw new RuntimeException(stringBuilder.toString(), e);
                                        }
                                    }
                                    namedString2 = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (namedString2 != null) {
                                        transition.addTarget(Class.forName(namedString2));
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown scene name: ");
                    stringBuilder.append(xmlPullParser.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0056, code skipped:
            return r1;
     */
    private androidx.transition.TransitionManager createTransitionManagerFromXml(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) {
        /*
        r4 = this;
        r0 = r5.getDepth();
        r1 = 0;
    L_0x0005:
        r2 = r5.next();
        r3 = 3;
        if (r2 != r3) goto L_0x0012;
    L_0x000c:
        r3 = r5.getDepth();
        if (r3 <= r0) goto L_0x0056;
    L_0x0012:
        r3 = 1;
        if (r2 == r3) goto L_0x0056;
    L_0x0015:
        r3 = 2;
        if (r2 == r3) goto L_0x0019;
    L_0x0018:
        goto L_0x0005;
    L_0x0019:
        r2 = r5.getName();
        r3 = "transitionManager";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x002c;
    L_0x0026:
        r1 = new androidx.transition.TransitionManager;
        r1.<init>();
        goto L_0x0005;
    L_0x002c:
        r3 = "transition";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0035:
        if (r1 == 0) goto L_0x003b;
    L_0x0037:
        r4.loadTransition(r6, r5, r7, r1);
        goto L_0x0005;
    L_0x003b:
        r6 = new java.lang.RuntimeException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = "Unknown scene name: ";
        r7.append(r0);
        r5 = r5.getName();
        r7.append(r5);
        r5 = r7.toString();
        r6.<init>(r5);
        throw r6;
    L_0x0056:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionInflater.createTransitionManagerFromXml(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.TransitionManager");
    }

    private void loadTransition(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, TransitionManager transitionManager) {
        Scene scene;
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_MANAGER);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int namedResourceId2 = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        Scene scene2 = null;
        if (namedResourceId2 < 0) {
            scene = null;
        } else {
            scene = Scene.getSceneForLayout(viewGroup, namedResourceId2, this.mContext);
        }
        int namedResourceId3 = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (namedResourceId3 >= 0) {
            scene2 = Scene.getSceneForLayout(viewGroup, namedResourceId3, this.mContext);
        }
        if (namedResourceId >= 0) {
            Transition inflateTransition = inflateTransition(namedResourceId);
            if (inflateTransition != null) {
                if (scene2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No toScene for transition ID ");
                    stringBuilder.append(namedResourceId);
                    throw new RuntimeException(stringBuilder.toString());
                } else if (scene == null) {
                    transitionManager.setTransition(scene2, inflateTransition);
                } else {
                    transitionManager.setTransition(scene, scene2, inflateTransition);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
