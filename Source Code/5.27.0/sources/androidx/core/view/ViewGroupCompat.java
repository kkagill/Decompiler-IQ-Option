package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.R;

public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat() {
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static int getLayoutMode(@NonNull ViewGroup viewGroup) {
        return VERSION.SDK_INT >= 18 ? viewGroup.getLayoutMode() : 0;
    }

    public static void setLayoutMode(@NonNull ViewGroup viewGroup, int i) {
        if (VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(i);
        }
    }

    public static void setTransitionGroup(@NonNull ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(z);
        } else {
            viewGroup.setTag(R.id.tag_transition_group, Boolean.valueOf(z));
        }
    }

    public static boolean isTransitionGroup(@NonNull ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
        boolean z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.getTransitionName(viewGroup) == null) ? false : true;
        return z;
    }

    public static int getNestedScrollAxes(@NonNull ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        return viewGroup instanceof NestedScrollingParent ? ((NestedScrollingParent) viewGroup).getNestedScrollAxes() : 0;
    }
}
