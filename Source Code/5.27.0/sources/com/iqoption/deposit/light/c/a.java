package com.iqoption.deposit.light.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.util.e;
import com.iqoption.deposit.b.m;
import com.iqoption.deposit.hold.f;
import com.iqoption.deposit.o;
import com.iqoption.deposit.o.g;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/deposit/light/hold/DepositHoldLightFragment;", "Lcom/iqoption/deposit/hold/BaseDepositHoldFragment;", "()V", "binding", "Lcom/iqoption/deposit/databinding/FragmentDepositHoldLightBinding;", "cardButton", "Landroid/widget/TextView;", "cardButtonIcon", "Landroid/widget/ImageView;", "cardWarning", "createDepositHoldViewModel", "Lcom/iqoption/deposit/hold/DepositHoldViewModel;", "kycButton", "kycButtonIcon", "kycWarning", "onAllHoldWarningsResolved", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "timeLink", "timeWarning", "Landroidx/databinding/ViewStubProxy;", "Companion", "deposit_release"})
/* compiled from: DepositHoldLightFragment.kt */
public final class a extends com.iqoption.deposit.hold.a {
    public static final a cEV = new a();
    private HashMap apm;
    private m cEU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/deposit/light/hold/DepositHoldLightFragment$Companion;", "", "()V", "createNavigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: DepositHoldLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aqV() {
            return com.iqoption.core.ui.d.c.a.a(c.bJi, a.class, null, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: DepositHoldLightFragment.kt */
    static final class b<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ a cEW;

        b(a aVar) {
            this.cEW = aVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) {
                f a = this.cEW.arh();
                if (a != null) {
                    a.bu(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) aVar).aaB());
                }
                com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b bVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) aVar;
                String a2 = e.a(bVar.aaC(), 0, bVar.getMask(), false, false, null, 29, null);
                TextView textView = a.b(this.cEW).cBO;
                kotlin.jvm.internal.i.e(textView, "binding.holdKycTitle");
                textView.setText(this.cEW.getString(g.your_card_was_pre_authorized_for_n1, a2));
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public ImageView arp() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public ImageView arq() {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ m b(a aVar) {
        m mVar = aVar.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cEU = (m) com.iqoption.core.ext.a.a((Fragment) this, o.f.fragment_deposit_hold_light, viewGroup, false, 4, null);
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String str = "binding";
        String str2 = "binding.holdKycIcon";
        m mVar;
        ImageView imageView;
        if (com.iqoption.core.ext.a.p(this)) {
            mVar = this.cEU;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            imageView = mVar.cBN;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.al(imageView);
        } else {
            mVar = this.cEU;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            imageView = mVar.cBN;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
        }
        f arh = arh();
        if (arh != null) {
            LiveData aoy = arh.aoy();
            if (aoy != null) {
                aoy.observe(this, new b(this));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public TextView arl() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mVar.cBQ.cDs;
        if (textView == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(textView, "binding.layoutDepositHol…ink.depositHoldShowMore!!");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public ViewStubProxy arm() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewStubProxy viewStubProxy = mVar.cBR;
        kotlin.jvm.internal.i.e(viewStubProxy, "binding.layoutDepositHoldTimeWarningExpanded");
        return viewStubProxy;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: arW */
    public TextView arn() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mVar.cBL;
        kotlin.jvm.internal.i.e(textView, "binding.depositHoldKycButton");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: arX */
    public TextView aro() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mVar.cBK;
        kotlin.jvm.internal.i.e(textView, "binding.depositHoldCardButton");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public TextView arr() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mVar.cBP;
        kotlin.jvm.internal.i.e(textView, "binding.holdKycWarning");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public TextView ars() {
        m mVar = this.cEU;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mVar.cBM;
        kotlin.jvm.internal.i.e(textView, "binding.holdCardWarning");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public f art() {
        return f.cDZ.a(this, true);
    }

    /* Access modifiers changed, original: protected */
    public void ari() {
        super.ari();
        com.iqoption.deposit.navigator.b.cGp.T(this);
    }
}
