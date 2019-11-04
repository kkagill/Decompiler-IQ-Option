package com.iqoption.deposit.crypto.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.r;
import com.iqoption.deposit.b.g;
import com.iqoption.deposit.o;
import com.iqoption.deposit.o.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/deposit/databinding/FragmentCryptoPaymentStatusBinding;", "dateTimeFormat", "Ljava/text/SimpleDateFormat;", "depositObserver", "Landroidx/lifecycle/Observer;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "isCustomAnimationsEnabled", "", "()Z", "prevDepositLiveData", "Landroidx/lifecycle/LiveData;", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusViewModel;", "bindData", "", "cryptoDepositData", "close", "formatAmount", "deposit", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "formatProgress", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEnterAnimation", "onExitAnimation", "onViewCreated", "view", "Companion", "deposit_release"})
/* compiled from: CryptoPaymentStatusFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a cAy = new a();
    private HashMap apm;
    private final boolean bIN = true;
    private final SimpleDateFormat cAt = new SimpleDateFormat("dd MMMM yyyy, HH:mm", Locale.getDefault());
    private d cAu;
    private g cAv;
    private LiveData<Optional<a>> cAw;
    private final Observer<Optional<a>> cAx = new b(this);
    private com.iqoption.core.analytics.c czd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusFragment$Companion;", "", "()V", "TAG", "", "createNavigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: CryptoPaymentStatusFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c aqV() {
            return new com.iqoption.core.ui.d.c(b.TAG, b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "result", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: CryptoPaymentStatusFragment.kt */
    static final class b<T> implements Observer<Optional<a>> {
        final /* synthetic */ b cAz;

        b(b bVar) {
            this.cAz = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<a> optional) {
            if (optional != null) {
                a aVar = (a) optional.pN();
                if (aVar != null) {
                    b bVar = this.cAz;
                    kotlin.jvm.internal.i.e(aVar, "it");
                    bVar.a(aVar);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ b cAz;

        public c(b bVar) {
            this.cAz = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cAz.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "item", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: CryptoPaymentStatusFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ b cAz;

        d(b bVar) {
            this.cAz = bVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar instanceof com.iqoption.core.microservices.billing.response.crypto.a) {
                LiveData b = this.cAz.cAw;
                if (b != null) {
                    b.removeObserver(this.cAz.cAx);
                }
                LiveData bt = b.d(this.cAz).bt(((com.iqoption.core.microservices.billing.response.crypto.a) aVar).ZF());
                b bVar = this.cAz;
                bt.observe(bVar, bVar.cAx);
                this.cAz.cAw = bt;
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ d d(b bVar) {
        d dVar = bVar.cAu;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return dVar;
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cAu = d.cAA.L(this);
        this.cAt.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cAv = (g) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_crypto_payment_status, viewGroup, false, 4, null);
        g gVar = this.cAv;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.czd = com.iqoption.core.d.EC().h("deposit-page_payment-status", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
        g gVar = this.cAv;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.cBc.cDD.setText(o.g.payment_status);
        gVar = this.cAv;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = gVar.cBc.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.cryptoToolbar.toolbarBack");
        imageView.setOnClickListener(new c(this));
        d dVar = this.cAu;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.aoy().observe(this, new d(this));
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.czd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    private final void a(a aVar) {
        int i;
        com.iqoption.core.microservices.billing.response.crypto.a aaf = aVar.aaf();
        a(aVar, aaf);
        Picasso with = Picasso.with(com.iqoption.core.ext.a.q(this));
        kotlin.jvm.internal.i.e(with, "Picasso.with(ctx)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("squarelight-");
        stringBuilder.append(aaf.ZW());
        RequestCreator error = r.a(with, stringBuilder.toString()).placeholder(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.d.ic_payment_method_placeholder_grey)).error(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.d.ic_payment_method_placeholder_grey));
        g gVar = this.cAv;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        error.into(gVar.cBa);
        g gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar2.cAU.setTextColor(com.iqoption.deposit.crypto.a.c(aaf));
        gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = gVar2.cAU;
        kotlin.jvm.internal.i.e(textView, "binding.cryptoStatus");
        textView.setText(com.iqoption.deposit.crypto.a.b(aaf));
        String format = this.cAt.format(Long.valueOf(aaf.ZU() * ((long) 1000)));
        gVar = this.cAv;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView2 = gVar.cBb;
        kotlin.jvm.internal.i.e(textView2, "binding.cryptoStatusTime");
        textView2.setText(format);
        e(aaf);
        Object obj = aaf.ZS() >= aaf.ZT() ? 1 : null;
        if (obj != null) {
            i = o.g.we_have_refunded_your_recent_transaction;
        } else {
            i = o.g.we_will_refund_this_transaction;
        }
        int i2 = c.aob[aaf.ZR().ordinal()];
        String str2 = "binding.cryptoStatusErrorTitle";
        String str3 = "binding.cryptoStatusDescription";
        g gVar3;
        TextView textView3;
        if (i2 == 1) {
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAZ;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            format = LocalizationUtil.hq("front.you_will_get_after_confirmations");
            n nVar = n.eWf;
            if (format == null) {
                format = "";
            }
            Object[] objArr = new Object[]{aaf.ZO(), String.valueOf(aaf.ZT()), aaf.ZQ()};
            format = String.format(format, Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
            gVar3 = this.cAv;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView3 = gVar3.cAY;
            kotlin.jvm.internal.i.e(textView3, str3);
            textView3.setText(format);
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAY;
            kotlin.jvm.internal.i.e(textView, str3);
            com.iqoption.core.ext.a.ak(textView);
        } else if (i2 == 2) {
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAZ;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar2.cAZ.setText(i);
            if ((u.Y(aaf.ZV()) ^ 1) != 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(aaf.ZV());
                stringBuilder2.append(' ');
                stringBuilder2.append(aaf.ZQ());
                format = stringBuilder2.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(aaf.ZM());
                stringBuilder3.append(' ');
                stringBuilder3.append(aaf.ZQ());
                String stringBuilder4 = stringBuilder3.toString();
                format = getString(o.g.you_have_sent_n1_instead_of_the_required_n2, format, stringBuilder4);
            } else {
                format = LocalizationUtil.hq("front.fiat_transaction_failure");
            }
            gVar3 = this.cAv;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView3 = gVar3.cAY;
            kotlin.jvm.internal.i.e(textView3, str3);
            textView3.setText(format);
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAY;
            kotlin.jvm.internal.i.e(textView, str3);
            com.iqoption.core.ext.a.ak(textView);
        } else if (i2 != 3) {
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAZ;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAY;
            kotlin.jvm.internal.i.e(textView, str3);
            com.iqoption.core.ext.a.al(textView);
        } else {
            int i3;
            gVar3 = this.cAv;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView3 = gVar3.cAZ;
            kotlin.jvm.internal.i.e(textView3, str2);
            com.iqoption.core.ext.a.ak(textView3);
            gVar3 = this.cAv;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar3.cAZ.setText(i);
            if (obj != null) {
                i3 = o.g.we_have_got_your_transaction_refunded;
            } else {
                i3 = o.g.we_will_refund_this_transaction;
            }
            gVar3 = this.cAv;
            if (gVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar3.cAY.setText(i3);
            gVar2 = this.cAv;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = gVar2.cAY;
            kotlin.jvm.internal.i.e(textView, str3);
            com.iqoption.core.ext.a.ak(textView);
        }
    }

    /* JADX WARNING: Missing block: B:3:0x0011, code skipped:
            if (r7 != null) goto L_0x001c;
     */
    private final void a(com.iqoption.deposit.crypto.b.a r7, com.iqoption.core.microservices.billing.response.crypto.a r8) {
        /*
        r6 = this;
        r2 = r7.arg();
        if (r2 == 0) goto L_0x0014;
    L_0x0006:
        r0 = r8.ZN();
        r3 = 0;
        r4 = 2;
        r5 = 0;
        r7 = com.iqoption.core.util.e.a(r0, r2, r3, r4, r5);
        if (r7 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x001c;
    L_0x0014:
        r0 = r8.ZN();
        r7 = java.lang.String.valueOf(r0);
    L_0x001c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r7 = " (";
        r0.append(r7);
        r7 = r8.ZM();
        r0.append(r7);
        r7 = 32;
        r0.append(r7);
        r7 = r8.ZQ();
        r0.append(r7);
        r7 = 41;
        r0.append(r7);
        r7 = r0.toString();
        r8 = r6.cAv;
        if (r8 != 0) goto L_0x004e;
    L_0x0049:
        r0 = "binding";
        kotlin.jvm.internal.i.lG(r0);
    L_0x004e:
        r8 = r8.cAV;
        r0 = "binding.cryptoStatusAmount";
        kotlin.jvm.internal.i.e(r8, r0);
        r7 = (java.lang.CharSequence) r7;
        r8.setText(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.crypto.b.b.a(com.iqoption.deposit.crypto.b.a, com.iqoption.core.microservices.billing.response.crypto.a):void");
    }

    private final void e(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
        String str = "binding.cryptoStatusConfirmed";
        String str2 = "binding.cryptoStatusConfirmedProgress";
        String str3 = "binding";
        if ((aVar.ZS() >= aVar.ZT() ? 1 : null) != null) {
            g gVar = this.cAv;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            TextView textView = gVar.cAW;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
            gVar = this.cAv;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            ProgressBar progressBar = gVar.cAX;
            kotlin.jvm.internal.i.e(progressBar, str2);
            com.iqoption.core.ext.a.al(progressBar);
            return;
        }
        int i;
        int i2;
        g gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        TextView textView2 = gVar2.cAW;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.ak(textView2);
        gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        ProgressBar progressBar2 = gVar2.cAX;
        kotlin.jvm.internal.i.e(progressBar2, str2);
        com.iqoption.core.ext.a.ak(progressBar2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aVar.ZS());
        stringBuilder.append('/');
        stringBuilder.append(aVar.ZT());
        String stringBuilder2 = stringBuilder.toString();
        g gVar3 = this.cAv;
        if (gVar3 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        TextView textView3 = gVar3.cAW;
        kotlin.jvm.internal.i.e(textView3, str);
        textView3.setText(getString(o.g.n1_blocks_confirmed, stringBuilder2));
        if (aVar.ZR() == CryptoDepositStatus.FAILED) {
            i = com.iqoption.deposit.o.d.bg_iq_progress;
        } else {
            i = com.iqoption.deposit.o.d.bg_green_progress;
        }
        g gVar4 = this.cAv;
        if (gVar4 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        ProgressBar progressBar3 = gVar4.cAX;
        kotlin.jvm.internal.i.e(progressBar3, str2);
        progressBar3.setProgressDrawable(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), i));
        gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        progressBar2 = gVar2.cAX;
        kotlin.jvm.internal.i.e(progressBar2, str2);
        progressBar2.setMax(aVar.ZT());
        gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        progressBar2 = gVar2.cAX;
        kotlin.jvm.internal.i.e(progressBar2, str2);
        progressBar2.setProgress(aVar.ZS());
        if (aVar.ZR() == CryptoDepositStatus.FAILED) {
            i2 = com.iqoption.deposit.o.b.red;
        } else {
            i2 = com.iqoption.deposit.o.b.green;
        }
        gVar2 = this.cAv;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        gVar2.cAW.setTextColor(com.iqoption.core.ext.a.k(com.iqoption.core.ext.a.q(this), i2));
    }

    private final void close() {
        com.iqoption.deposit.navigator.b.cGp.T(this);
        com.iqoption.core.d.EC().a("deposit-page_payment-status-back", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
    }

    public boolean PU() {
        return this.bIN;
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        g gVar = this.cAv;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = gVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{((float) displayMetrics.widthPixels) / ((float) 2), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        gVar = this.cAv;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void PY() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        g gVar = this.cAv;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = gVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, ((float) displayMetrics.widthPixels) / ((float) 2)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(j.XJ());
        gVar = this.cAv;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }
}
