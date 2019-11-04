package com.iqoption.core.ui.widget.i;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/ui/widget/window/OptionsWindow;", "", "()V", "isPrepared", "", "()Z", "isShowing", "window", "Landroid/widget/PopupWindow;", "dismiss", "", "prepare", "content", "Landroid/view/View;", "width", "", "height", "show", "anchor", "Companion", "core_release"})
/* compiled from: OptionsWindow.kt */
public final class a {
    private static final String TAG = a.class.getName();
    public static final a bQb = new a();
    private PopupWindow bQa;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/ui/widget/window/OptionsWindow$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "core_release"})
    /* compiled from: OptionsWindow.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final boolean isShowing() {
        PopupWindow popupWindow = this.bQa;
        return popupWindow != null ? popupWindow.isShowing() : false;
    }

    public final void e(View view, int i, int i2) {
        kotlin.jvm.internal.i.f(view, "content");
        PopupWindow popupWindow = this.bQa;
        if (popupWindow == null) {
            popupWindow = new PopupWindow(view, i, i2, true);
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            Drawable background = view.getBackground();
            if (background != null) {
                popupWindow.setBackgroundDrawable(background);
                view.setBackground((Drawable) null);
            } else {
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            }
            PopupWindowCompat.setOverlapAnchor(popupWindow, true);
            this.bQa = popupWindow;
            return;
        }
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setContentView(view);
        popupWindow.setWidth(i);
        popupWindow.setHeight(i2);
    }

    public final void ak(View view) {
        kotlin.jvm.internal.i.f(view, "anchor");
        PopupWindow popupWindow = this.bQa;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view);
            return;
        }
        throw new IllegalStateException("Window is not prepared to be shown");
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.bQa;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
