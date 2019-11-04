package com.iqoption.core.ui.animation.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\u0012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H\u0016¢\u0006\u0002\u0010\u0019R'\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/PropertyTransition;", "Landroidx/transition/Transition;", "properties", "", "Landroid/util/Property;", "Landroid/view/View;", "", "([Landroid/util/Property;)V", "getProperties", "()[Landroid/util/Property;", "[Landroid/util/Property;", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "captureValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startVals", "endVals", "getTransitionProperties", "", "()[Ljava/lang/String;", "Companion", "core_release"})
/* compiled from: PropertyTransition.kt */
public final class d extends Transition {
    private static final String[] bHJ = new String[]{"propertyTransition:property"};
    private static final Property<View, Float> bHK = new b(Float.TYPE, "scrollX");
    private static final Property<View, Float> bHL = new c(Float.TYPE, "scrollY");
    public static final a bHM = new a();
    private final Property<View, Float>[] bHI;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/ui/animation/transitions/PropertyTransition$Companion;", "", "()V", "PROPERTY_NAME", "", "SCROLL_X", "Landroid/util/Property;", "Landroid/view/View;", "", "getSCROLL_X", "()Landroid/util/Property;", "SCROLL_Y", "getSCROLL_Y", "TRANSITION_PROPERTIES", "", "getTRANSITION_PROPERTIES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "core_release"})
    /* compiled from: PropertyTransition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/PropertyTransition$Companion$SCROLL_X$1", "Landroid/util/Property;", "Landroid/view/View;", "", "get", "v", "(Landroid/view/View;)Ljava/lang/Float;", "set", "", "value", "core_release"})
    /* compiled from: PropertyTransition.kt */
    public static final class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            n((View) obj, ((Number) obj2).floatValue());
        }

        public void n(View view, float f) {
            kotlin.jvm.internal.i.f(view, "v");
            view.setScrollX((int) f);
        }

        public Float get(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            return Float.valueOf((float) view.getScrollX());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, bng = {"com/iqoption/core/ui/animation/transitions/PropertyTransition$Companion$SCROLL_Y$1", "Landroid/util/Property;", "Landroid/view/View;", "", "get", "v", "(Landroid/view/View;)Ljava/lang/Float;", "set", "", "value", "core_release"})
    /* compiled from: PropertyTransition.kt */
    public static final class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            n((View) obj, ((Number) obj2).floatValue());
        }

        public void n(View view, float f) {
            kotlin.jvm.internal.i.f(view, "v");
            view.setScrollY((int) f);
        }

        public Float get(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            return Float.valueOf((float) view.getScrollY());
        }
    }

    public d(Property<View, Float>... propertyArr) {
        kotlin.jvm.internal.i.f(propertyArr, "properties");
        this.bHI = propertyArr;
    }

    public String[] getTransitionProperties() {
        return bHJ;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
        captureValues(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.i.f(transitionValues, "transitionValues");
        captureValues(transitionValues);
    }

    private final void captureValues(TransitionValues transitionValues) {
        Map map = transitionValues.values;
        kotlin.jvm.internal.i.e(map, "transitionValues.values");
        Property[] propertyArr = this.bHI;
        Collection arrayList = new ArrayList(propertyArr.length);
        for (Property property : propertyArr) {
            arrayList.add((Float) property.get(transitionValues.view));
        }
        map.put("propertyTransition:property", (List) arrayList);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map map = transitionValues.values;
        String str = "propertyTransition:property";
        Object obj = map.get(str);
        String str2 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>";
        if (obj != null) {
            List list = (List) obj;
            Object obj2 = transitionValues2.values.get(str);
            if (obj2 != null) {
                List list2 = (List) obj2;
                AnimatorSet animatorSet = new AnimatorSet();
                Property[] propertyArr = this.bHI;
                Collection arrayList = new ArrayList(propertyArr.length);
                int length = propertyArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Property property = propertyArr[i];
                    int i3 = i2 + 1;
                    property.set(transitionValues2.view, list.get(i2));
                    arrayList.add(ObjectAnimator.ofFloat(transitionValues2.view, property, new float[]{((Number) list2.get(i2)).floatValue()}));
                    i++;
                    i2 = i3;
                }
                animatorSet.playTogether((List) arrayList);
                return animatorSet;
            }
            throw new TypeCastException(str2);
        }
        throw new TypeCastException(str2);
    }
}
