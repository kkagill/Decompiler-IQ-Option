package com.iqoption.withdraw.b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import com.iqoption.core.d;
import com.iqoption.core.microservices.withdraw.response.Status;
import com.iqoption.core.microservices.withdraw.response.o;
import com.iqoption.core.util.c;
import com.iqoption.core.util.e;
import com.iqoption.withdraw.a.aa;
import com.iqoption.withdraw.d.b;
import io.card.payment.CardType;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/withdraw/history/PayoutViewHolder;", "Lcom/iqoption/withdraw/history/WithdrawHistoryViewHolder;", "binding", "Lcom/iqoption/withdraw/databinding/WithdrawHistoryPayoutItemBinding;", "cancelClickListener", "Lcom/iqoption/withdraw/history/CancelClickListener;", "(Lcom/iqoption/withdraw/databinding/WithdrawHistoryPayoutItemBinding;Lcom/iqoption/withdraw/history/CancelClickListener;)V", "getBinding", "()Lcom/iqoption/withdraw/databinding/WithdrawHistoryPayoutItemBinding;", "bind", "", "item", "Lcom/iqoption/withdraw/history/PayoutItem;", "getCardData", "Lcom/iqoption/withdraw/history/CardData;", "payout", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "setAmount", "setCloseButton", "setCommission", "setErrorStatusAndMessage", "setName", "cardData", "setRightPadding", "view", "Landroid/view/View;", "rightPadding", "", "withdraw_release"})
/* compiled from: WithdrawHistoryHolders.kt */
public final class f extends n {
    private final aa esG;
    private final b esH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawHistoryHolders.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ f esI;
        final /* synthetic */ o esJ;

        a(f fVar, o oVar) {
            this.esI = fVar;
            this.esJ = oVar;
        }

        public final void onClick(View view) {
            this.esI.esH.a(this.esJ);
        }
    }

    public f(aa aaVar, b bVar) {
        kotlin.jvm.internal.i.f(aaVar, "binding");
        kotlin.jvm.internal.i.f(bVar, "cancelClickListener");
        super(aaVar);
        this.esG = aaVar;
        this.esH = bVar;
    }

    public final void a(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "item");
        o bcO = eVar.bcO();
        a(bcO, c(bcO));
        TextView textView = this.esG.eqW;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawTime");
        textView.setText(com.iqoption.core.util.i.ay(bcO.ajT().getTime()));
        c(eVar);
        b(eVar);
        b(bcO);
        d(eVar);
    }

    private final void b(o oVar) {
        Integer valueOf;
        View root = this.esG.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        String message = oVar.getMessage();
        TextView textView = this.esG.eqR;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawComment");
        int i = g.aob[oVar.ajR().ordinal()];
        int i2 = 1;
        if (i == 1 || i == 2) {
            valueOf = Integer.valueOf(com.iqoption.withdraw.d.f.failed);
        } else if (i == 3) {
            valueOf = Integer.valueOf(com.iqoption.withdraw.d.f.declined);
        } else if (i == 4 || i == 5) {
            valueOf = Integer.valueOf(com.iqoption.withdraw.d.f.canceled);
        } else {
            valueOf = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (valueOf != null) {
            spannableStringBuilder.append(d.getString(valueOf.intValue()));
        }
        CharSequence charSequence = message;
        int i3 = (charSequence == null || u.Y(charSequence)) ? 1 : 0;
        i3 ^= 1;
        if (i3 != 0) {
            if ((((CharSequence) spannableStringBuilder).length() > 0 ? 1 : null) != null) {
                spannableStringBuilder.append(": ");
            }
        }
        CharSequence charSequence2 = spannableStringBuilder;
        if ((charSequence2.length() > 0 ? 1 : null) != null) {
            kotlin.jvm.internal.i.e(context, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(com.iqoption.core.ext.a.k(context, com.iqoption.withdraw.d.a.red)), 0, spannableStringBuilder.length(), 33);
        }
        if (i3 != 0) {
            spannableStringBuilder.append(charSequence);
        }
        if (charSequence2.length() <= 0) {
            i2 = 0;
        }
        if (i2 != 0) {
            textView.setVisibility(0);
            textView.setText(charSequence2);
            return;
        }
        textView.setVisibility(8);
    }

    private final void b(e eVar) {
        CharSequence string;
        Double aiZ = eVar.bcO().aiZ();
        double doubleValue = aiZ != null ? aiZ.doubleValue() : 0.0d;
        TextView textView = this.esG.eqS;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawCommission");
        if (doubleValue > ((double) 0)) {
            int i = com.iqoption.withdraw.d.f.commission_n1;
            Object[] objArr = new Object[1];
            objArr[0] = e.a(doubleValue, eVar.getMinorUnits(), eVar.getMask(), true, false, false, false, null, null, 248, null);
            string = d.getString(i, objArr);
        } else {
            string = d.getString(com.iqoption.withdraw.d.f.no_commission);
        }
        textView.setText(string);
    }

    private final void c(e eVar) {
        int i;
        Status ajR = eVar.bcO().ajR();
        String str = "binding.withdrawProgressIcon";
        ImageView imageView;
        if (m.esS.contains(ajR) || m.esT.contains(ajR)) {
            imageView = this.esG.eqV;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        } else {
            imageView = this.esG.eqV;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
        }
        String a = e.a(eVar.bcO().aeo(), eVar.getMinorUnits(), eVar.getMask(), false, false, null, 28, null);
        TextView textView = this.esG.eqY;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawValue");
        textView.setText(a);
        if (m.esS.contains(ajR)) {
            i = com.iqoption.withdraw.d.a.green;
        } else {
            i = com.iqoption.withdraw.d.a.black;
        }
        View root = this.esG.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        textView = this.esG.eqY;
        kotlin.jvm.internal.i.e(context, "context");
        textView.setTextColor(com.iqoption.core.ext.a.k(context, i));
    }

    private final c c(o oVar) {
        com.iqoption.core.microservices.withdraw.response.f ajV = oVar.ajV();
        if (ajV == null) {
            return null;
        }
        String pan = ajV.getPan();
        CardType hm = c.hm(pan);
        if (hm == null) {
            hm = CardType.UNKNOWN;
        }
        int length = pan.length() - 4;
        if (pan != null) {
            pan = pan.substring(length);
            kotlin.jvm.internal.i.e(pan, "(this as java.lang.String).substring(startIndex)");
            return new c(hm, pan);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final void a(o oVar, c cVar) {
        String stringBuilder;
        if (cVar != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(cVar.getCardType());
            stringBuilder2.append(" **");
            stringBuilder2.append(cVar.bcN());
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = oVar.ajU();
        }
        TextView textView = this.esG.eqX;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawTitle");
        textView.setText(stringBuilder);
    }

    private final void d(e eVar) {
        int i;
        Object obj = 1;
        String str = "binding.withdrawCancelProgress";
        String str2 = "binding.withdrawCancel";
        ImageView imageView;
        if (eVar.bcP()) {
            ContentLoadingProgressBar contentLoadingProgressBar = this.esG.eqQ;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            contentLoadingProgressBar.setVisibility(0);
            imageView = this.esG.eqO;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setVisibility(8);
        } else {
            ContentLoadingProgressBar contentLoadingProgressBar2 = this.esG.eqQ;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar2, str);
            contentLoadingProgressBar2.setVisibility(8);
            o bcO = eVar.bcO();
            if (bcO.ajS()) {
                ImageView imageView2 = this.esG.eqO;
                kotlin.jvm.internal.i.e(imageView2, str2);
                imageView2.setVisibility(0);
                this.esG.eqO.setOnClickListener(new a(this, bcO));
            } else {
                imageView = this.esG.eqO;
                kotlin.jvm.internal.i.e(imageView, str2);
                imageView.setVisibility(8);
                obj = null;
            }
        }
        if (obj != null) {
            i = b.dp10;
        } else {
            i = b.dp6;
        }
        View root = this.esG.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        kotlin.jvm.internal.i.e(context, "binding.root.context");
        i = context.getResources().getDimensionPixelOffset(i);
        TextView textView = this.esG.eqY;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawValue");
        u(textView, i);
        textView = this.esG.eqS;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawCommission");
        u(textView, i);
    }

    private final void u(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }
}
