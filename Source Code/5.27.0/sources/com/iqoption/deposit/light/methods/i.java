package com.iqoption.deposit.light.methods;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.billing.f;
import com.iqoption.core.d;
import com.iqoption.core.microservices.billing.response.deposit.TimeScale;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c;
import com.iqoption.core.microservices.billing.response.deposit.g;
import com.iqoption.deposit.k;
import com.iqoption.deposit.o;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bJ\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodsLightViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "currentMethod", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "hasSucceededCryptoDeposits", "", "loadedCashbox", "Lcom/iqoption/billing/CashboxDisplayData;", "selectMethod", "", "cashboxItem", "Companion", "deposit_release"})
/* compiled from: MethodsLightViewModel.kt */
public final class i extends AndroidViewModel {
    public static final a cFx = new a();
    private k cxD;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodsLightViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/light/methods/MethodsLightViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "getMethodDescription", "", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "context", "Landroid/content/Context;", "getMethodLockedReason", "getMethodTimeString", "deposit_release"})
    /* compiled from: MethodsLightViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final i M(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(i.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ghtViewModel::class.java]");
            i iVar = (i) viewModel;
            iVar.cxD = k.cxn.C(fragment);
            return iVar;
        }

        public final String a(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar, Context context) {
            kotlin.jvm.internal.i.f(aVar, "cashboxItem");
            kotlin.jvm.internal.i.f(context, "context");
            Integer num = null;
            if (!(aVar instanceof c)) {
                aVar = null;
            }
            c cVar = (c) aVar;
            if (cVar != null) {
                g aaF = cVar.aaF();
                if ((aaF != null ? aaF.aay() : null) == TimeScale.INSTANT) {
                    return context.getString(o.g.instantly);
                }
                if (aaF != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    if (aaF.getMin() != null) {
                        stringBuilder.append(String.valueOf(aaF.getMin()));
                    }
                    CharSequence charSequence = stringBuilder;
                    Object obj = null;
                    if (!((charSequence.length() > 0 ? 1 : null) == null || aaF.aax() == null)) {
                        stringBuilder.append("-");
                        stringBuilder.append(String.valueOf(aaF.aax()));
                    }
                    if (charSequence.length() > 0) {
                        obj = 1;
                    }
                    if (!(obj == null || aaF.aay() == null)) {
                        TimeScale aay = aaF.aay();
                        if (aay != null) {
                            int i = j.aob[aay.ordinal()];
                            if (i == 1) {
                                num = Integer.valueOf(o.g.minutes);
                            } else if (i == 2) {
                                num = Integer.valueOf(o.g.hour3);
                            } else if (i == 3) {
                                num = Integer.valueOf(o.g.days);
                            }
                        }
                        if (num != null) {
                            String string = context.getString(num.intValue());
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(' ');
                            stringBuilder2.append(string);
                            stringBuilder.append(stringBuilder2.toString());
                        }
                    }
                    return stringBuilder.toString();
                }
            }
            return null;
        }

        public final String b(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar, Context context) {
            kotlin.jvm.internal.i.f(aVar, "cashboxItem");
            kotlin.jvm.internal.i.f(context, "context");
            String str = null;
            if (!aVar.ZY()) {
                return null;
            }
            String ZZ = aVar.ZZ();
            if (!(ZZ == null || (u.Y(ZZ) ^ 1) == 0)) {
                str = ZZ;
            }
            if (str == null) {
                str = context.getString(o.g.temporarily_unavailable);
            }
            return str;
        }

        public static /* synthetic */ String a(a aVar, com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar2, Context context, int i, Object obj) {
            if ((i & 2) != 0) {
                context = d.Uo();
            }
            return aVar.c(aVar2, context);
        }

        public final String c(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar, Context context) {
            kotlin.jvm.internal.i.f(aVar, "cashboxItem");
            kotlin.jvm.internal.i.f(context, "context");
            a aVar2 = this;
            String b = aVar2.b(aVar, context);
            return b != null ? b : aVar2.a(aVar, context);
        }
    }

    public i(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final boolean asn() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kotlin.jvm.internal.i.y((Boolean) kVar.aow().getValue(), Boolean.valueOf(true));
    }

    public final LiveData<f> aox() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aox();
    }

    public final void i(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "cashboxItem");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.i(aVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }
}
