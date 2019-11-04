package com.iqoption.fragment.leftmenu.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ext.g;
import com.iqoption.e.pz;
import com.iqoption.fragment.leftmenu.b.c;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/leftmenu/holder/VerifyNotificationHolder;", "Lcom/iqoption/fragment/leftmenu/LeftMenuAdapter$ViewHolder;", "binding", "Lcom/iqoption/databinding/LeftMenuItemNotificationBinding;", "listener", "Lcom/iqoption/fragment/leftmenu/holder/OnVerifyNotificationClickListener;", "(Lcom/iqoption/databinding/LeftMenuItemNotificationBinding;Lcom/iqoption/fragment/leftmenu/holder/OnVerifyNotificationClickListener;)V", "warning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "bind", "", "verifyWarning", "app_optionXRelease"})
/* compiled from: VerifyNotificationHolder.kt */
public final class e extends c {
    private com.iqoption.deposit.verification.e<?> djw;
    private final pz djx;
    private final a djy;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ e djz;

        public a(e eVar) {
            this.djz = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            a a = this.djz.djy;
            com.iqoption.deposit.verification.e b = this.djz.djw;
            if (b == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            a.onVerifyNotificationClick(b);
        }
    }

    public e(pz pzVar, a aVar) {
        kotlin.jvm.internal.i.f(pzVar, "binding");
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        super(pzVar, R.layout.left_menu_item_notification);
        this.djx = pzVar;
        this.djy = aVar;
        TextView textView = this.djx.cmC;
        kotlin.jvm.internal.i.e(textView, "binding.itemLabel");
        textView.setOnClickListener(new a(this));
    }

    public final void b(com.iqoption.deposit.verification.e<?> eVar) {
        kotlin.jvm.internal.i.f(eVar, "verifyWarning");
        this.djw = eVar;
        TextView textView = this.djx.cmC;
        kotlin.jvm.internal.i.e(textView, "binding.itemLabel");
        textView.setText(eVar.getMessage());
        int a = com.iqoption.deposit.verification.c.a(eVar.ath());
        Context context = textView.getContext();
        kotlin.jvm.internal.i.e(context, "context");
        Drawable n = com.iqoption.core.ext.a.n(context, a);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp20);
        n.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        com.iqoption.core.ext.a.c(textView, n);
    }
}
