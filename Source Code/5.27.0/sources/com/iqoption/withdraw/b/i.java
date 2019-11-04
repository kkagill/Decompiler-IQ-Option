package com.iqoption.withdraw.b;

import android.widget.TextView;
import com.iqoption.withdraw.a.ac;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/withdraw/history/TitleViewHolder;", "Lcom/iqoption/withdraw/history/WithdrawHistoryViewHolder;", "binding", "Lcom/iqoption/withdraw/databinding/WithdrawHistoryTitleItemBinding;", "(Lcom/iqoption/withdraw/databinding/WithdrawHistoryTitleItemBinding;)V", "getBinding", "()Lcom/iqoption/withdraw/databinding/WithdrawHistoryTitleItemBinding;", "bind", "", "item", "Lcom/iqoption/withdraw/history/TitleItem;", "withdraw_release"})
/* compiled from: WithdrawHistoryHolders.kt */
public final class i extends n {
    private final ac esK;

    public i(ac acVar) {
        kotlin.jvm.internal.i.f(acVar, "binding");
        super(acVar);
        this.esK = acVar;
    }

    public final void a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "item");
        TextView textView = this.esK.era;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawHistoryTitle");
        textView.setText(hVar.getText());
    }
}
