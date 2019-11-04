package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.a.h;
import com.google.android.material.a.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.g;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    private static final boolean My;
    private static final int[] Mz = new int[]{com.google.android.material.a.b.snackbarStyle};
    static final Handler handler = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).oq();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).aT(message.arg1);
                return true;
            }
        }
    });
    private final ViewGroup MB;
    protected final e MI;
    private final a MJ;
    private Behavior Na;
    private final AccessibilityManager Nb;
    final a Nc = new a() {
        public void show() {
            BaseTransientBottomBar.handler.sendMessage(BaseTransientBottomBar.handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void aV(int i) {
            BaseTransientBottomBar.handler.sendMessage(BaseTransientBottomBar.handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };
    private List<a<B>> callbacks;
    private final Context context;
    private int duration;

    public static abstract class a<B> {
        public void a(B b, int i) {
        }

        public void ab(B b) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class b {
        private a Nc;

        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.n(0.1f);
            swipeDismissBehavior.o(0.6f);
            swipeDismissBehavior.az(0);
        }

        public void b(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.Nc = baseTransientBottomBar.Nc;
        }

        public boolean B(View view) {
            return view instanceof e;
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.ou().d(this.Nc);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.ou().c(this.Nc);
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected interface c {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected interface d {
        void a(View view, int i, int i2, int i3, int i4);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected static class e extends FrameLayout {
        private final AccessibilityManager Nb;
        private final TouchExplorationStateChangeListener Nj;
        private d Nk;
        private c Nl;

        protected e(Context context) {
            this(context, null);
        }

        protected e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.Nb = (AccessibilityManager) context.getSystemService("accessibility");
            this.Nj = new TouchExplorationStateChangeListener() {
                public void onTouchExplorationStateChanged(boolean z) {
                    e.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.Nb, this.Nj);
            setClickableOrFocusableBasedOnAccessibility(this.Nb.isTouchExplorationEnabled());
        }

        private void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(z ^ 1);
            setFocusable(z);
        }

        /* Access modifiers changed, original: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            d dVar = this.Nk;
            if (dVar != null) {
                dVar.a(this, i, i2, i3, i4);
            }
        }

        /* Access modifiers changed, original: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            c cVar = this.Nl;
            if (cVar != null) {
                cVar.onViewAttachedToWindow(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        /* Access modifiers changed, original: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            c cVar = this.Nl;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(this);
            }
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(this.Nb, this.Nj);
        }

        /* Access modifiers changed, original: 0000 */
        public void setOnLayoutChangeListener(d dVar) {
            this.Nk = dVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void setOnAttachStateChangeListener(c cVar) {
            this.Nl = cVar;
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final b Ni = new b(this);

        private void b(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.Ni.b(baseTransientBottomBar);
        }

        public boolean B(View view) {
            return this.Ni.B(view);
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.Ni.a(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        My = z;
    }

    protected BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.MB = viewGroup;
            this.MJ = aVar;
            this.context = viewGroup.getContext();
            g.al(this.context);
            this.MI = (e) LayoutInflater.from(this.context).inflate(om(), this.MB, false);
            this.MI.addView(view);
            ViewCompat.setAccessibilityLiveRegion(this.MI, 1);
            ViewCompat.setImportantForAccessibility(this.MI, 1);
            ViewCompat.setFitsSystemWindows(this.MI, true);
            ViewCompat.setOnApplyWindowInsetsListener(this.MI, new OnApplyWindowInsetsListener() {
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
            ViewCompat.setAccessibilityDelegate(this.MI, new AccessibilityDelegateCompat() {
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.performAccessibilityAction(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.dismiss();
                    return true;
                }
            });
            this.Nb = (AccessibilityManager) this.context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* Access modifiers changed, original: protected */
    @LayoutRes
    public int om() {
        return on() ? h.mtrl_layout_snackbar : h.design_layout_snackbar;
    }

    /* Access modifiers changed, original: protected */
    public boolean on() {
        TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(Mz);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    @NonNull
    public B aQ(int i) {
        this.duration = i;
        return this;
    }

    public int getDuration() {
        return this.duration;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    public void show() {
        b.ou().a(getDuration(), this.Nc);
    }

    public void dismiss() {
        aR(3);
    }

    /* Access modifiers changed, original: protected */
    public void aR(int i) {
        b.ou().a(this.Nc, i);
    }

    @NonNull
    public B a(@NonNull a<B> aVar) {
        if (aVar == null) {
            return this;
        }
        if (this.callbacks == null) {
            this.callbacks = new ArrayList();
        }
        this.callbacks.add(aVar);
        return this;
    }

    public boolean oo() {
        return b.ou().e(this.Nc);
    }

    /* Access modifiers changed, original: protected */
    public SwipeDismissBehavior<? extends View> op() {
        return new Behavior();
    }

    /* Access modifiers changed, original: final */
    public final void oq() {
        if (this.MI.getParent() == null) {
            LayoutParams layoutParams = this.MI.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.Na;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = op();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).b(this);
                }
                swipeDismissBehavior.a(new com.google.android.material.behavior.SwipeDismissBehavior.a() {
                    public void C(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.aR(0);
                    }

                    public void aA(int i) {
                        if (i == 0) {
                            b.ou().d(BaseTransientBottomBar.this.Nc);
                        } else if (i == 1 || i == 2) {
                            b.ou().c(BaseTransientBottomBar.this.Nc);
                        }
                    }
                });
                layoutParams2.setBehavior(swipeDismissBehavior);
                layoutParams2.insetEdge = 80;
            }
            this.MB.addView(this.MI);
        }
        this.MI.setOnAttachStateChangeListener(new c() {
            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (BaseTransientBottomBar.this.oo()) {
                    BaseTransientBottomBar.handler.post(new Runnable() {
                        public void run() {
                            BaseTransientBottomBar.this.aU(3);
                        }
                    });
                }
            }
        });
        if (!ViewCompat.isLaidOut(this.MI)) {
            this.MI.setOnLayoutChangeListener(new d() {
                public void a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.MI.setOnLayoutChangeListener(null);
                    if (BaseTransientBottomBar.this.shouldAnimate()) {
                        BaseTransientBottomBar.this.or();
                    } else {
                        BaseTransientBottomBar.this.ot();
                    }
                }
            });
        } else if (shouldAnimate()) {
            or();
        } else {
            ot();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void or() {
        final int os = os();
        if (My) {
            ViewCompat.offsetTopAndBottom(this.MI, os);
        } else {
            this.MI.setTranslationY((float) os);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{os, 0});
        valueAnimator.setInterpolator(com.google.android.material.a.a.DH);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.MJ.m(70, 180);
            }

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.ot();
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            private int Nf = os;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.My) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.MI, intValue - this.Nf);
                } else {
                    BaseTransientBottomBar.this.MI.setTranslationY((float) intValue);
                }
                this.Nf = intValue;
            }
        });
        valueAnimator.start();
    }

    private void aS(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, os()});
        valueAnimator.setInterpolator(com.google.android.material.a.a.DH);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.MJ.n(0, 180);
            }

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.aU(i);
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            private int Nf = 0;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.My) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.MI, intValue - this.Nf);
                } else {
                    BaseTransientBottomBar.this.MI.setTranslationY((float) intValue);
                }
                this.Nf = intValue;
            }
        });
        valueAnimator.start();
    }

    private int os() {
        int height = this.MI.getHeight();
        LayoutParams layoutParams = this.MI.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* Access modifiers changed, original: final */
    public final void aT(int i) {
        if (shouldAnimate() && this.MI.getVisibility() == 0) {
            aS(i);
        } else {
            aU(i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ot() {
        b.ou().b(this.Nc);
        List list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((a) this.callbacks.get(size)).ab(this);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aU(int i) {
        b.ou().a(this.Nc);
        List list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((a) this.callbacks.get(size)).a(this, i);
            }
        }
        ViewParent parent = this.MI.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.MI);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean shouldAnimate() {
        List enabledAccessibilityServiceList = this.Nb.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }
}
