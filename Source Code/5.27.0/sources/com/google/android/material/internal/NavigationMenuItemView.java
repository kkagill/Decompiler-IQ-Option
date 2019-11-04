package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.a.d;
import com.google.android.material.a.e;
import com.google.android.material.a.f;
import com.google.android.material.a.h;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends e implements ItemView {
    private static final int[] CHECKED_STATE_SET = new int[]{16842912};
    private boolean KD;
    boolean KF;
    private final CheckedTextView KJ;
    private FrameLayout KK;
    private MenuItemImpl KL;
    private ColorStateList KO;
    private boolean KQ;
    private Drawable KS;
    private final AccessibilityDelegateCompat KT;
    private final int iconSize;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KT = new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.KF);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, this, true);
        this.iconSize = context.getResources().getDimensionPixelSize(d.design_navigation_icon_size);
        this.KJ = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.KJ.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(this.KJ, this.KT);
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.KL = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.setBackground(this, ob());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        oa();
    }

    private boolean nZ() {
        return this.KL.getTitle() == null && this.KL.getIcon() == null && this.KL.getActionView() != null;
    }

    private void oa() {
        FrameLayout frameLayout;
        LayoutParams layoutParams;
        if (nZ()) {
            this.KJ.setVisibility(8);
            frameLayout = this.KK;
            if (frameLayout != null) {
                layoutParams = (LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.KK.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.KJ.setVisibility(0);
        frameLayout = this.KK;
        if (frameLayout != null) {
            layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            layoutParams.width = -2;
            this.KK.setLayoutParams(layoutParams);
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.KK == null) {
                this.KK = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.KK.removeAllViews();
            this.KK.addView(view);
        }
    }

    private StateListDrawable ob() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public MenuItemImpl getItemData() {
        return this.KL;
    }

    public void setTitle(CharSequence charSequence) {
        this.KJ.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.KF != z) {
            this.KF = z;
            this.KT.sendAccessibilityEvent(this.KJ, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.KJ.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        int i;
        if (drawable != null) {
            if (this.KQ) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.KO);
            }
            i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.KD) {
            if (this.KS == null) {
                this.KS = ResourcesCompat.getDrawable(getResources(), e.navigation_empty_icon, getContext().getTheme());
                drawable = this.KS;
                if (drawable != null) {
                    i = this.iconSize;
                    drawable.setBounds(0, 0, i, i);
                }
            }
            drawable = this.KS;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.KJ, drawable, null, null, null);
    }

    /* Access modifiers changed, original: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.KL;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.KL.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    /* Access modifiers changed, original: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.KO = colorStateList;
        this.KQ = this.KO != null;
        MenuItemImpl menuItemImpl = this.KL;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.KJ, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.KJ.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.KD = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.KJ.setCompoundDrawablePadding(i);
    }
}
