package com.iqoption.fragment.dialog.popup.whatsnew.depositpage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.ext.g;
import com.iqoption.e.aax;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/WhatsNewDepositHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callback", "Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/WhatsNewDepositHolder$Callback;", "binding", "Lcom/iqoption/databinding/WhatsNewDepositItemBinding;", "(Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/WhatsNewDepositHolder$Callback;Lcom/iqoption/databinding/WhatsNewDepositItemBinding;)V", "<set-?>", "Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;", "bound", "getBound", "()Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;", "setBound", "(Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "Callback", "app_optionXRelease"})
/* compiled from: WhatsNewDepositHolder.kt */
public final class c extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(c.class), "bound", "getBound()Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;"))};
    private final d bHX;
    private final b dgq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/WhatsNewDepositHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/fragment/dialog/popup/whatsnew/depositpage/BankItem;", "app_optionXRelease"})
    /* compiled from: WhatsNewDepositHolder.kt */
    public interface b {
        void onItemClick(BankItem bankItem);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ c this$0;

        public a(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.dgq.onItemClick(this.this$0.aCW());
        }
    }

    public final BankItem aCW() {
        return (BankItem) this.bHX.b(this, anY[0]);
    }

    public final void e(BankItem bankItem) {
        kotlin.jvm.internal.i.f(bankItem, "<set-?>");
        this.bHX.a(this, anY[0], bankItem);
    }

    public c(b bVar, aax aax) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(aax, "binding");
        super(aax.getRoot());
        this.dgq = bVar;
        LinearLayout linearLayout = aax.bZU;
        kotlin.jvm.internal.i.e(linearLayout, "binding.container");
        linearLayout.setOnClickListener(new a(this));
        this.bHX = com.iqoption.core.d.c.j(new WhatsNewDepositHolder$$special$$inlined$bindable$1(aax, this, aax));
    }
}
