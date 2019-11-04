package com.iqoption.alerts.util;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.widget.DialogContentLayout;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, bng = {"Lcom/iqoption/alerts/util/AnchorPositionController;", "Lcom/iqoption/alerts/util/PositionController;", "anchorX", "", "anchorY", "anchorGravity", "contentId", "animPivot", "(Ljava/lang/Integer;Ljava/lang/Integer;III)V", "Ljava/lang/Integer;", "onCreateView", "", "view", "Landroid/view/View;", "Companion", "alerts_release"})
/* compiled from: AnchorPositionController.kt */
public final class a extends c {
    public static final a aqs = new a();
    private final int anchorGravity;
    private final Integer aqq;
    private final Integer aqr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ/\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/alerts/util/AnchorPositionController$Companion;", "", "()V", "ARG_ANCHOR_GRAVITY", "", "ARG_ANCHOR_X", "ARG_ANCHOR_Y", "fromArgs", "Lcom/iqoption/alerts/util/AnchorPositionController;", "contentId", "", "args", "Landroid/os/Bundle;", "makeArgs", "anchorX", "anchorY", "anchorGravity", "animPivot", "(Ljava/lang/Integer;Ljava/lang/Integer;II)Landroid/os/Bundle;", "alerts_release"})
    /* compiled from: AnchorPositionController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Bundle a(Integer num, Integer num2, int i, int i2) {
            Bundle bundle = new Bundle();
            if (num != null) {
                num.intValue();
                bundle.putInt("arg.anchorX", num.intValue());
            }
            if (num2 != null) {
                num2.intValue();
                bundle.putInt("arg.anchorY", num2.intValue());
            }
            bundle.putInt("arg.anchorGravity", i);
            bundle.putInt("arg.animPivot", i2);
            return bundle;
        }

        public final a c(@IdRes int i, Bundle bundle) {
            kotlin.jvm.internal.i.f(bundle, "args");
            String str = "arg.anchorX";
            Integer num = null;
            Integer valueOf = bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null;
            str = "arg.anchorY";
            if (bundle.containsKey(str)) {
                num = Integer.valueOf(bundle.getInt(str));
            }
            return new a(valueOf, num, bundle.getInt("arg.anchorGravity", 8), i, bundle.getInt("arg.animPivot", 0));
        }
    }

    public a(Integer num, Integer num2, int i, @IdRes int i2, int i3) {
        super(i2, i3);
        this.aqq = num;
        this.aqr = num2;
        this.anchorGravity = i;
    }

    public void O(View view) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        ViewParent parent = view.getParent();
        if (!(parent instanceof DialogContentLayout)) {
            parent = null;
        }
        DialogContentLayout dialogContentLayout = (DialogContentLayout) parent;
        if (dialogContentLayout != null) {
            Integer num = this.aqq;
            if (num != null) {
                dialogContentLayout.setAnchorX(num.intValue());
            }
            num = this.aqr;
            if (num != null) {
                dialogContentLayout.setAnchorY(num.intValue());
            }
            dialogContentLayout.setAnchorGravity(this.anchorGravity);
        }
    }
}
