package com.iqoption.core.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.i.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0006\u0010\u001c\u001a\u00020\u000eJ@\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bH\u0016J8\u0010&\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0016J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/core/ui/behavior/ScrollAwareBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animation", "Landroidx/dynamicanimation/animation/DynamicAnimation;", "changeVisibilityDeltaThreshold", "", "dySum", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "isVisible", "scrollAwareType", "Lcom/iqoption/core/ui/behavior/ScrollAwareType;", "animateVisibility", "", "view", "childHeight", "", "child", "isShown", "onNestedPreScroll", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "target", "dx", "dy", "consumed", "", "type", "onStartNestedScroll", "directTargetChild", "axes", "setScrollAwareType", "setVisibility", "core_release"})
/* compiled from: ScrollAwareBehavior.kt */
public final class ScrollAwareBehavior extends Behavior<View> {
    private ScrollAwareType bHN;
    private final int bHO;
    private DynamicAnimation<?> bHP;
    private int bHQ;
    private boolean enabled;
    private boolean isVisible;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a implements OnGlobalLayoutListener {
        final /* synthetic */ View aBq;
        final /* synthetic */ ScrollAwareBehavior bHR;
        final /* synthetic */ View bHS;
        final /* synthetic */ boolean bHT;
        final /* synthetic */ View bgH;

        public a(View view, View view2, ScrollAwareBehavior scrollAwareBehavior, View view3, boolean z) {
            this.bgH = view;
            this.aBq = view2;
            this.bHR = scrollAwareBehavior;
            this.bHS = view3;
            this.bHT = z;
        }

        public void onGlobalLayout() {
            if (ViewCompat.isLaidOut(this.aBq)) {
                this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view = this.bHS;
                view.setTranslationY(this.bHT ? 0.0f : this.bHR.aw(view));
            }
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        kotlin.jvm.internal.i.f(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.f(view, "child");
        kotlin.jvm.internal.i.f(view2, "directTargetChild");
        kotlin.jvm.internal.i.f(view3, "target");
        return i == 2;
    }

    public ScrollAwareBehavior(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet);
        this.enabled = true;
        this.bHN = ScrollAwareType.DOWN_SCROLL_HIDE;
        this.bHO = context.getResources().getDimensionPixelOffset(d.dp100);
        this.isVisible = true;
    }

    public /* synthetic */ ScrollAwareBehavior(Context context, AttributeSet attributeSet, int i, f fVar) {
        if ((i & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        this(context, attributeSet);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        kotlin.jvm.internal.i.f(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.f(view, "child");
        kotlin.jvm.internal.i.f(view2, "target");
        kotlin.jvm.internal.i.f(iArr, "consumed");
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
        boolean z = false;
        if (this.isVisible && i2 < 0) {
            this.bHQ = 0;
        } else if (!this.isVisible && i2 > 0) {
            this.bHQ = 0;
        }
        this.bHQ += i2;
        if (this.enabled) {
            Boolean valueOf = (!this.isVisible || this.bHQ <= this.bHO) ? (this.isVisible || this.bHQ >= (-this.bHO)) ? null : Boolean.valueOf(false) : Boolean.valueOf(true);
            if (valueOf != null) {
                i2 = a.aob[this.bHN.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        z = valueOf.booleanValue();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!valueOf.booleanValue()) {
                    z = true;
                }
                e(view, z);
            }
        }
    }

    public final void e(View view, boolean z) {
        float f;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        this.bHQ = 0;
        this.isVisible = z;
        if (z) {
            f = 0.0f;
        } else {
            f = aw(view);
        }
        DynamicAnimation dynamicAnimation = this.bHP;
        if (dynamicAnimation != null) {
            dynamicAnimation.cancel();
        }
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.TRANSLATION_Y, f);
        SpringForce spring = springAnimation.getSpring();
        String str = "it.spring";
        kotlin.jvm.internal.i.e(spring, str);
        spring.setDampingRatio(0.75f);
        spring = springAnimation.getSpring();
        kotlin.jvm.internal.i.e(spring, str);
        spring.setStiffness(50.0f);
        springAnimation.start();
        this.bHP = springAnimation;
    }

    public final void f(View view, boolean z) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        DynamicAnimation dynamicAnimation = this.bHP;
        if (dynamicAnimation != null) {
            dynamicAnimation.cancel();
        }
        this.bHP = (DynamicAnimation) null;
        this.bHQ = 0;
        this.isVisible = z;
        if (ViewCompat.isLaidOut(view)) {
            float f;
            if (z) {
                f = 0.0f;
            } else {
                f = aw(view);
            }
            view.setTranslationY(f);
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, view, this, view, z));
    }

    private final float aw(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            return (((float) view.getHeight()) + ((float) marginLayoutParams.topMargin)) + ((float) marginLayoutParams.bottomMargin);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final boolean a(ScrollAwareType scrollAwareType) {
        kotlin.jvm.internal.i.f(scrollAwareType, "scrollAwareType");
        if (this.bHN == scrollAwareType) {
            return false;
        }
        this.bHN = scrollAwareType;
        return true;
    }

    public final boolean isShown() {
        return this.isVisible;
    }
}
