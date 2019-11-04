package com.iqoption.fragment.leftmenu.content;

import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import com.google.common.base.j;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;

/* compiled from: LeftMenuItem */
public interface a extends d<String> {
    public static final j<a> djo = -$$Lambda$1biPF0lVYNX5wgKCJ_OVpR2ReoU.INSTANCE;
    public static final j<a> djp = -$$Lambda$a$9bcv79CjZFE0UBsJg-GHgDwX1mk.INSTANCE;

    /* compiled from: LeftMenuItem */
    public final /* synthetic */ class -CC {
        public static /* synthetic */ boolean c(a aVar) {
            return aVar != MainMenu.Debug;
        }
    }

    String analyticsEventName();

    a getChild(int i);

    int getChildCount();

    @DrawableRes
    int getCollapseIcon();

    @DrawableRes
    int getExpandIcon();

    @DrawableRes
    int getIcon();

    @StringRes
    int getNameToDisplay();

    int getSize();

    boolean isClickable();

    boolean isEnabled();

    boolean isInProgress();

    boolean isVisible();

    @LayoutRes
    int layoutResId();

    int menuPriority();

    String name();
}
