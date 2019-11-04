package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.a;
import com.google.android.material.a.h;
import com.google.android.material.a.j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> Hl;

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public a c(Context context, boolean z) {
        int i;
        if (z) {
            i = a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        a aVar = new a();
        aVar.QT = h.c(context, i);
        aVar.QU = new j(17, 0.0f, 0.0f);
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    @CallSuper
    public boolean a(View view, View view2, boolean z, boolean z2) {
        a(view2, z);
        return super.a(view, view2, z, z2);
    }

    private void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.Hl = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                Object obj = ((childAt.getLayoutParams() instanceof LayoutParams) && (((LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior)) ? 1 : null;
                if (childAt != view && obj == null) {
                    if (z) {
                        if (VERSION.SDK_INT >= 16) {
                            this.Hl.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    } else {
                        Map map = this.Hl;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.Hl.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (!z) {
                this.Hl = null;
            }
        }
    }
}
