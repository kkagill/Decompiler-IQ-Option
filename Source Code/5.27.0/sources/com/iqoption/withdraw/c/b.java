package com.iqoption.withdraw.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.microservices.withdraw.response.WithdrawMethodType;
import com.iqoption.core.microservices.withdraw.response.c;
import com.iqoption.withdraw.a.ai;
import com.iqoption.withdraw.d.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/withdraw/methods/MethodHolder;", "", "binding", "Lcom/iqoption/withdraw/databinding/WithdrawMethodCardLayoutBinding;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "mask", "", "(Lcom/iqoption/withdraw/databinding/WithdrawMethodCardLayoutBinding;Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;Ljava/lang/String;)V", "getBinding", "()Lcom/iqoption/withdraw/databinding/WithdrawMethodCardLayoutBinding;", "getMask", "()Ljava/lang/String;", "getMethod", "()Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "withdraw_release"})
/* compiled from: MethodHolders.kt */
public final class b {
    private final c erm;
    private final ai esZ;
    private final String mask;

    public b(ai aiVar, c cVar, String str) {
        kotlin.jvm.internal.i.f(aiVar, "binding");
        kotlin.jvm.internal.i.f(cVar, "method");
        kotlin.jvm.internal.i.f(str, "mask");
        this.esZ = aiVar;
        this.erm = cVar;
        this.mask = str;
        View root = this.esZ.getRoot();
        String str2 = "binding.root";
        kotlin.jvm.internal.i.e(root, str2);
        ImageView imageView = (ImageView) root.findViewById(d.withdrawMethodIcon);
        kotlin.jvm.internal.i.e(imageView, "binding.root.withdrawMethodIcon");
        c.a(imageView, this.erm);
        root = this.esZ.getRoot();
        kotlin.jvm.internal.i.e(root, str2);
        TextView textView = (TextView) root.findViewById(d.withdrawMethodName);
        kotlin.jvm.internal.i.e(textView, "binding.root.withdrawMethodName");
        textView.setText(this.erm.getName());
        root = this.esZ.getRoot();
        kotlin.jvm.internal.i.e(root, str2);
        textView = (TextView) root.findViewById(d.withdrawMethodLimit);
        String str3 = "limitTextView";
        if (this.erm.ajz() == WithdrawMethodType.CARD) {
            kotlin.jvm.internal.i.e(textView, str3);
            c.a(textView, this.erm, this.mask);
            textView.setVisibility(0);
            return;
        }
        kotlin.jvm.internal.i.e(textView, str3);
        textView.setVisibility(8);
    }

    public final ai bcW() {
        return this.esZ;
    }

    public final c bcf() {
        return this.erm;
    }
}
