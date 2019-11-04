package com.facebook.appevents.codeless.internal;

import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.NestedScrollingChild;
import com.facebook.internal.z;
import com.google.android.gms.plus.PlusShare;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy */
public class d {
    private static final String TAG = "com.facebook.appevents.codeless.internal.d";
    private static WeakReference<View> wy = new WeakReference(null);
    @Nullable
    private static Method wz = null;

    public static List<View> f(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    public static JSONObject a(View view, JSONObject jSONObject) {
        try {
            String k = k(view);
            String l = l(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", h(view));
            jSONObject.put("id", view.getId());
            String str = "text";
            String str2 = "";
            if (b.e(view)) {
                jSONObject.put(str, str2);
                jSONObject.put("is_user_input", true);
            } else {
                jSONObject.put(str, z.E(z.bp(k), str2));
            }
            jSONObject.put("hint", z.E(z.bp(l), str2));
            if (tag != null) {
                jSONObject.put("tag", z.E(z.bp(tag.toString()), str2));
            }
            if (contentDescription != null) {
                jSONObject.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, z.E(z.bp(contentDescription.toString()), str2));
            }
            jSONObject.put("dimension", m(view));
        } catch (JSONException e) {
            z.a(TAG, e);
        }
        return jSONObject;
    }

    public static JSONObject g(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            wy = new WeakReference(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List f = f(view);
            for (int i = 0; i < f.size(); i++) {
                jSONArray.put(g((View) f.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(TAG, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    private static int h(View view) {
        int i = view instanceof ImageView ? 2 : 0;
        if (i(view)) {
            i |= 32;
        }
        if (j(view)) {
            i |= 512;
        }
        if (view instanceof TextView) {
            i = (i | 1024) | 1;
            if (view instanceof Button) {
                i |= 4;
                if (view instanceof Switch) {
                    i |= 8192;
                } else if (view instanceof CheckBox) {
                    i |= 32768;
                }
            }
            if (view instanceof EditText) {
                return i | 2048;
            }
            return i;
        } else if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i | 4096;
        } else {
            if (view instanceof RatingBar) {
                return i | 65536;
            }
            if (view instanceof RadioGroup) {
                return i | 16384;
            }
            return ((view instanceof ViewGroup) && a(view, (View) wy.get())) ? i | 64 : i;
        }
    }

    public static boolean i(View view) {
        boolean z = false;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return false;
                }
                declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField != null) {
                    if (((OnClickListener) declaredField.get(obj)) != null) {
                        z = true;
                    }
                    return z;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to check if the view is clickable.", e);
        }
        return false;
    }

    private static boolean j(View view) {
        ViewParent parent = view.getParent();
        return (parent instanceof AdapterView) || (parent instanceof NestedScrollingChild);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    public static java.lang.String k(android.view.View r6) {
        /*
        r0 = r6 instanceof android.widget.TextView;
        r1 = 0;
        if (r0 == 0) goto L_0x0020;
    L_0x0005:
        r0 = r6;
        r0 = (android.widget.TextView) r0;
        r1 = r0.getText();
        r0 = r6 instanceof android.widget.Switch;
        if (r0 == 0) goto L_0x00cb;
    L_0x0010:
        r6 = (android.widget.Switch) r6;
        r6 = r6.isChecked();
        if (r6 == 0) goto L_0x001b;
    L_0x0018:
        r6 = "1";
        goto L_0x001d;
    L_0x001b:
        r6 = "0";
    L_0x001d:
        r1 = r6;
        goto L_0x00cb;
    L_0x0020:
        r0 = r6 instanceof android.widget.Spinner;
        if (r0 == 0) goto L_0x0038;
    L_0x0024:
        r6 = (android.widget.Spinner) r6;
        r0 = r6.getCount();
        if (r0 <= 0) goto L_0x00cb;
    L_0x002c:
        r6 = r6.getSelectedItem();
        if (r6 == 0) goto L_0x00cb;
    L_0x0032:
        r1 = r6.toString();
        goto L_0x00cb;
    L_0x0038:
        r0 = r6 instanceof android.widget.DatePicker;
        r2 = 2;
        r3 = 1;
        r4 = 0;
        if (r0 == 0) goto L_0x0069;
    L_0x003f:
        r6 = (android.widget.DatePicker) r6;
        r0 = r6.getYear();
        r1 = r6.getMonth();
        r6 = r6.getDayOfMonth();
        r5 = 3;
        r5 = new java.lang.Object[r5];
        r0 = java.lang.Integer.valueOf(r0);
        r5[r4] = r0;
        r0 = java.lang.Integer.valueOf(r1);
        r5[r3] = r0;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r2] = r6;
        r6 = "%04d-%02d-%02d";
        r1 = java.lang.String.format(r6, r5);
        goto L_0x00cb;
    L_0x0069:
        r0 = r6 instanceof android.widget.TimePicker;
        if (r0 == 0) goto L_0x0094;
    L_0x006d:
        r6 = (android.widget.TimePicker) r6;
        r0 = r6.getCurrentHour();
        r0 = r0.intValue();
        r6 = r6.getCurrentMinute();
        r6 = r6.intValue();
        r1 = new java.lang.Object[r2];
        r0 = java.lang.Integer.valueOf(r0);
        r1[r4] = r0;
        r6 = java.lang.Integer.valueOf(r6);
        r1[r3] = r6;
        r6 = "%02d:%02d";
        r1 = java.lang.String.format(r6, r1);
        goto L_0x00cb;
    L_0x0094:
        r0 = r6 instanceof android.widget.RadioGroup;
        if (r0 == 0) goto L_0x00bd;
    L_0x0098:
        r6 = (android.widget.RadioGroup) r6;
        r0 = r6.getCheckedRadioButtonId();
        r2 = r6.getChildCount();
    L_0x00a2:
        if (r4 >= r2) goto L_0x00cb;
    L_0x00a4:
        r3 = r6.getChildAt(r4);
        r5 = r3.getId();
        if (r5 != r0) goto L_0x00ba;
    L_0x00ae:
        r5 = r3 instanceof android.widget.RadioButton;
        if (r5 == 0) goto L_0x00ba;
    L_0x00b2:
        r3 = (android.widget.RadioButton) r3;
        r6 = r3.getText();
        goto L_0x001d;
    L_0x00ba:
        r4 = r4 + 1;
        goto L_0x00a2;
    L_0x00bd:
        r0 = r6 instanceof android.widget.RatingBar;
        if (r0 == 0) goto L_0x00cb;
    L_0x00c1:
        r6 = (android.widget.RatingBar) r6;
        r6 = r6.getRating();
        r1 = java.lang.String.valueOf(r6);
    L_0x00cb:
        if (r1 != 0) goto L_0x00d0;
    L_0x00cd:
        r6 = "";
        goto L_0x00d4;
    L_0x00d0:
        r6 = r1.toString();
    L_0x00d4:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.d.k(android.view.View):java.lang.String");
    }

    public static String l(View view) {
        CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
        if (hint == null) {
            return "";
        }
        return hint.toString();
    }

    private static JSONObject m(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(TAG, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    @Nullable
    public static AccessibilityDelegate n(View view) {
        try {
            return (AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static OnTouchListener o(View view) {
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            OnTouchListener onTouchListener;
            declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField.get(obj);
            } else {
                onTouchListener = null;
            }
            return onTouchListener;
        } catch (NoSuchFieldException e) {
            z.a(TAG, e);
            return null;
        } catch (ClassNotFoundException e2) {
            z.a(TAG, e2);
            return null;
        } catch (IllegalAccessException e22) {
            z.a(TAG, e22);
            return null;
        }
    }

    @Nullable
    public static View a(float[] fArr, @Nullable View view) {
        iO();
        Method method = wz;
        if (!(method == null || view == null)) {
            try {
                View view2 = (View) method.invoke(null, new Object[]{fArr, view});
                if (view2 != null && view2.getId() > 0) {
                    view2 = (View) view2.getParent();
                    if (view2 == null) {
                        view2 = null;
                    }
                    return view2;
                }
            } catch (IllegalAccessException e) {
                z.a(TAG, e);
            } catch (InvocationTargetException e2) {
                z.a(TAG, e2);
            }
        }
        return null;
    }

    public static boolean a(View view, @Nullable View view2) {
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        view2 = a(r(view), view2);
        if (view2 == null || view2.getId() != view.getId()) {
            return false;
        }
        return true;
    }

    public static boolean p(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }

    @Nullable
    public static View q(View view) {
        while (view != null) {
            if (!p(view)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    private static float[] r(View view) {
        view.getLocationOnScreen(new int[2]);
        return new float[]{(float) r1[0], (float) r1[1]};
    }

    private static void iO() {
        if (wz == null) {
            try {
                wz = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                wz.setAccessible(true);
            } catch (ClassNotFoundException e) {
                z.a(TAG, e);
            } catch (NoSuchMethodException e2) {
                z.a(TAG, e2);
            }
        }
    }
}
