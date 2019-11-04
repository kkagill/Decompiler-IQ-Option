package com.iqoption.withdraw.fields.verify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.withdraw.a.m;
import com.iqoption.withdraw.d.d;
import com.iqoption.withdraw.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyWarningHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawVerifyPageBinding;", "listener", "Lcom/iqoption/withdraw/fields/verify/WarningListener;", "(Lcom/iqoption/withdraw/databinding/FragmentWithdrawVerifyPageBinding;Lcom/iqoption/withdraw/fields/verify/WarningListener;)V", "bind", "", "warning", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getCardDigits", "", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "getVerifyButton", "Landroid/view/View;", "hasDeclined", "", "cards", "", "showCardsWarning", "showDocWarning", "withdrawAction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "withdraw_release"})
/* compiled from: WithdrawVerifyWarningHolder.kt */
public final class i extends ViewHolder {
    private final e esy;
    private final m esz;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawVerifyWarningHolder.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ i esA;
        final /* synthetic */ List esB;

        a(i iVar, List list) {
            this.esA = iVar;
            this.esB = list;
        }

        public final void onClick(View view) {
            if (this.esB.size() == 1) {
                this.esA.esy.m((c) u.bU(this.esB));
            } else {
                this.esA.esy.bcC();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: WithdrawVerifyWarningHolder.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ i esA;

        b(i iVar) {
            this.esA = iVar;
        }

        public final void onClick(View view) {
            this.esA.esy.bcB();
        }
    }

    public i(m mVar, e eVar) {
        kotlin.jvm.internal.i.f(mVar, "binding");
        kotlin.jvm.internal.i.f(eVar, CastExtraArgs.LISTENER);
        super(mVar.getRoot());
        this.esz = mVar;
        this.esy = eVar;
        View root = this.esz.getRoot();
        String str = "binding.root";
        kotlin.jvm.internal.i.e(root, str);
        root = root.findViewById(d.withdrawVerifyButtonContainerRight);
        kotlin.jvm.internal.i.e(root, "binding.root.withdrawVerifyButtonContainerRight");
        com.iqoption.core.ext.a.al(root);
        root = this.esz.getRoot();
        kotlin.jvm.internal.i.e(root, str);
        root = root.findViewById(d.withdrawVerifyButtonContainerBottom);
        kotlin.jvm.internal.i.e(root, "binding.root.withdrawVerifyButtonContainerBottom");
        com.iqoption.core.ext.a.al(root);
        com.iqoption.core.ext.a.ak(bcL());
    }

    public final void b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "warning");
        VerificationWarningType bcz = cVar.bcz();
        int i = j.aob[bcz.ordinal()];
        if (i == 1) {
            a(((b) cVar).bcA());
        } else if (i == 2) {
            bD(((a) cVar).bbR());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected case: ");
            stringBuilder.append(bcz);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void a(com.iqoption.core.microservices.kyc.response.restriction.a aVar) {
        TextView textView = this.esz.eqs;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawVerifyTitle");
        textView.setText(aVar.afw());
        textView = this.esz.eqr;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawVerifyText");
        textView.setText(aVar.afB());
        com.iqoption.core.ext.a.ak(bcL());
        this.esz.getRoot().setOnClickListener(new b(this));
    }

    private final void bD(List<c> list) {
        TextView textView = this.esz.eqr;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawVerifyText");
        TextView textView2 = this.esz.eqs;
        kotlin.jvm.internal.i.e(textView2, "binding.withdrawVerifyTitle");
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            c cVar = (c) next;
            if (!(com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cVar.Lq()) || cVar.Lq() == CardStatus.DECLINED)) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        int size = ((List) arrayList).size();
        if (bE(list)) {
            textView2.setText(f.card_verification_declined);
            textView.setText(f.you_need_to_verify_your_bank_cards_declined);
            com.iqoption.core.ext.a.ak(bcL());
        } else if (size > 1 || (size > 0 && list.size() > 1)) {
            textView2.setText(f.card_verification);
            textView.setText(f.you_need_to_verify_your_bank_cards);
            com.iqoption.core.ext.a.ak(bcL());
        } else if (size > 0) {
            textView2.setText(f.card_verification);
            textView.setText(Le().getString(f.you_need_to_verify_your_bank_card_n1, new Object[]{n((c) u.bU(list))}));
            com.iqoption.core.ext.a.ak(bcL());
        } else {
            textView2.setText(f.card_being_verified);
            textView.setText(f.you_need_to_verify_your_bank_cards_progress);
            com.iqoption.core.ext.a.al(bcL());
        }
        this.esz.getRoot().setOnClickListener(new a(this, list));
    }

    private final boolean bE(List<c> list) {
        for (Object next : list) {
            Object obj;
            if (((c) next).Lq() == CardStatus.DECLINED) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return next2 != null;
    }

    private final String n(c cVar) {
        String number = cVar.getNumber();
        int length = number.length() - 4;
        if (number != null) {
            number = number.substring(length);
            kotlin.jvm.internal.i.e(number, "(this as java.lang.String).substring(startIndex)");
            return number;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final Context Le() {
        View root = this.esz.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root.getContext();
    }

    private final View bcL() {
        Context Le = Le();
        kotlin.jvm.internal.i.e(Le, "context()");
        String str = "binding.root";
        View root;
        if (com.iqoption.core.ext.a.aZ(Le)) {
            root = this.esz.getRoot();
            kotlin.jvm.internal.i.e(root, str);
            root = root.findViewById(d.withdrawVerifyButtonContainerRight);
            kotlin.jvm.internal.i.e(root, "binding.root.withdrawVerifyButtonContainerRight");
            return root;
        }
        root = this.esz.getRoot();
        kotlin.jvm.internal.i.e(root, str);
        root = root.findViewById(d.withdrawVerifyButtonContainerBottom);
        kotlin.jvm.internal.i.e(root, "binding.root.withdrawVerifyButtonContainerBottom");
        return root;
    }
}
