package com.iqoption;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.dialogs.b.ac;
import com.iqoption.dialogs.d.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, bng = {"Lcom/iqoption/InfoPopupHelper;", "", "listener", "Lcom/iqoption/InfoPopupHelper$OnInfoListener;", "(Lcom/iqoption/InfoPopupHelper$OnInfoListener;)V", "infoPopup", "Landroid/widget/PopupWindow;", "getListener", "()Lcom/iqoption/InfoPopupHelper$OnInfoListener;", "closeIfExist", "", "createPopup", "rootView", "Landroid/view/ViewGroup;", "info", "", "showPopup", "", "activity", "Landroid/app/Activity;", "anchorX", "", "anchorY", "OnInfoListener", "dialogs_release"})
/* compiled from: InfoPopupHelper.kt */
public final class c {
    private PopupWindow aiN;
    private final a aiO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, bng = {"Lcom/iqoption/InfoPopupHelper$OnInfoListener;", "", "onInfoClosed", "", "onInfoOpened", "dialogs_release"})
    /* compiled from: InfoPopupHelper.kt */
    public interface a {
        void zE();

        void zF();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "onDismiss", "com/iqoption/InfoPopupHelper$createPopup$1$1"})
    /* compiled from: InfoPopupHelper.kt */
    static final class b implements OnDismissListener {
        final /* synthetic */ c aiP;
        final /* synthetic */ ac aiQ;
        final /* synthetic */ View aiR;

        b(c cVar, ac acVar, View view) {
            this.aiP = cVar;
            this.aiQ = acVar;
            this.aiR = view;
        }

        public final void onDismiss() {
            this.aiP.aiN = (PopupWindow) null;
            this.aiP.zD().zF();
        }
    }

    public c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        this.aiO = aVar;
    }

    public final a zD() {
        return this.aiO;
    }

    public final void a(Activity activity, ViewGroup viewGroup, CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.i.f(activity, "activity");
        kotlin.jvm.internal.i.f(viewGroup, "rootView");
        kotlin.jvm.internal.i.f(charSequence, "info");
        PopupWindow a = a(viewGroup, charSequence);
        Window window = activity.getWindow();
        kotlin.jvm.internal.i.e(window, "activity.window");
        a.showAtLocation(window.getDecorView(), 0, i, i2 - activity.getResources().getDimensionPixelOffset(com.iqoption.dialogs.d.b.dp16));
    }

    public final PopupWindow a(ViewGroup viewGroup, CharSequence charSequence) {
        kotlin.jvm.internal.i.f(viewGroup, "rootView");
        kotlin.jvm.internal.i.f(charSequence, "info");
        this.aiO.zE();
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.i.e(context, "context");
        ac acVar = (ac) com.iqoption.core.ext.a.a(context, e.layout_info_popup, viewGroup, false, 4, null);
        TextView textView = acVar.cMH;
        kotlin.jvm.internal.i.e(textView, "popupBinding.infoPopupText");
        textView.setText(charSequence);
        View root = acVar.getRoot();
        kotlin.jvm.internal.i.e(root, "popupBinding.root");
        root.measure(MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 0), 0);
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(acVar.getRoot());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(root.getMeasuredWidth());
        popupWindow.setHeight(root.getMeasuredHeight());
        popupWindow.setOnDismissListener(new b(this, acVar, root));
        this.aiN = popupWindow;
        return popupWindow;
    }

    public final boolean zC() {
        PopupWindow popupWindow = this.aiN;
        if (popupWindow == null) {
            return false;
        }
        popupWindow.dismiss();
        this.aiO.zF();
        this.aiN = (PopupWindow) null;
        return true;
    }
}
