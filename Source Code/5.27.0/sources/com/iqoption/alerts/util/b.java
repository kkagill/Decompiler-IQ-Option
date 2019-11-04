package com.iqoption.alerts.util;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/alerts/util/MarginPositionController;", "Lcom/iqoption/alerts/util/PositionController;", "margins", "Landroid/graphics/Rect;", "gravity", "", "contentId", "animPivot", "(Landroid/graphics/Rect;III)V", "onCreateView", "", "view", "Landroid/view/View;", "Companion", "alerts_release"})
/* compiled from: MarginPositionController.kt */
public final class b extends c {
    public static final a aqu = new a();
    private final Rect aqt;
    private final int gravity;

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/alerts/util/MarginPositionController$Companion;", "", "()V", "ARG_GRAVITY", "", "ARG_MARGINS", "fromArgs", "Lcom/iqoption/alerts/util/MarginPositionController;", "contentId", "", "args", "Landroid/os/Bundle;", "makeArgs", "margins", "Landroid/graphics/Rect;", "gravity", "animPivot", "alerts_release"})
    /* compiled from: MarginPositionController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Bundle a(Rect rect, int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.margins", rect);
            bundle.putInt("arg.gravity", i);
            bundle.putInt("arg.animPivot", i2);
            return bundle;
        }

        public final b d(@IdRes int i, Bundle bundle) {
            kotlin.jvm.internal.i.f(bundle, "args");
            return new b((Rect) bundle.getParcelable("arg.margins"), bundle.getInt("arg.gravity", 8388659), i, bundle.getInt("arg.animPivot", 0));
        }
    }

    public b(Rect rect, int i, @IdRes int i2, int i3) {
        super(i2, i3);
        this.aqt = rect;
        this.gravity = i;
    }

    public void O(View view) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = this.gravity;
            Rect rect = this.aqt;
            if (rect != null) {
                layoutParams2.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }
}
