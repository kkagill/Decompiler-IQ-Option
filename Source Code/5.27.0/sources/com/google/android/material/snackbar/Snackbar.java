package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.a.b;
import com.google.android.material.a.h;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] No = new int[]{b.snackbarButtonStyle};
    private final AccessibilityManager Nb;
    private boolean Nn;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends e {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* Access modifiers changed, original: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = getChildCount();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, a aVar) {
        super(viewGroup, view, aVar);
        this.Nb = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public void show() {
        super.show();
    }

    public void dismiss() {
        super.dismiss();
    }

    @NonNull
    public static Snackbar a(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        ViewGroup G = G(view);
        if (G != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(G.getContext()).inflate(an(G.getContext()) ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, G, false);
            Snackbar snackbar = new Snackbar(G, snackbarContentLayout, snackbarContentLayout);
            snackbar.f(charSequence);
            snackbar.aQ(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    protected static boolean an(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(No);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Snackbar a(@NonNull View view, @StringRes int i, int i2) {
        return a(view, view.getResources().getText(i), i2);
    }

    private static ViewGroup G(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @NonNull
    public Snackbar f(@NonNull CharSequence charSequence) {
        ((SnackbarContentLayout) this.MI.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @NonNull
    public Snackbar a(@StringRes int i, OnClickListener onClickListener) {
        return a(getContext().getText(i), onClickListener);
    }

    @NonNull
    public Snackbar a(CharSequence charSequence, final OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.MI.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.Nn = false;
        } else {
            this.Nn = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    Snackbar.this.aR(1);
                }
            });
        }
        return this;
    }

    public int getDuration() {
        if (this.Nn && this.Nb.isTouchExplorationEnabled()) {
            return -2;
        }
        return super.getDuration();
    }

    @NonNull
    public Snackbar aW(@ColorInt int i) {
        ((SnackbarContentLayout) this.MI.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }
}
