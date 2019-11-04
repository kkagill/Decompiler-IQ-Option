package com.iqoption.deposit.light.constructor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import com.iqoption.core.ui.d.c;
import com.iqoption.deposit.a.e;
import com.iqoption.deposit.b.z;
import com.iqoption.deposit.o.f;
import java.util.HashMap;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0014J(\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J(\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006/"}, bng = {"Lcom/iqoption/deposit/light/constructor/ConstructorLightFragment;", "Lcom/iqoption/deposit/constructor/BaseConstructorFragment;", "()V", "<set-?>", "Lcom/iqoption/deposit/databinding/FragmentPaymentFieldsLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentPaymentFieldsLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentPaymentFieldsLightBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "contentContainer", "Landroid/widget/LinearLayout;", "createSelectorIntegerMenuEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "params", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;", "createSelectorStringMenuEntry", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringMenuParams;", "fieldsContainer", "fieldsNoInput", "Landroid/widget/TextView;", "inflateEditFieldHolder", "Lcom/iqoption/deposit/light/constructor/EditLightFieldHolder;", "name", "", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "container", "Landroid/view/ViewGroup;", "isRequired", "", "isLastField", "inflateSelectIntegerFieldHolder", "Lcom/iqoption/deposit/constructor/BaseSelectIntegerFieldHolder;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty;", "inflateSelectStringFieldHolder", "Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "deposit_release"})
/* compiled from: ConstructorLightFragment.kt */
public final class a extends com.iqoption.deposit.a.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentPaymentFieldsLightBinding;"))};
    public static final a cEF = new a();
    private HashMap apm;
    private final d bIb = kotlin.f.a.eWg.bnQ();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/light/constructor/ConstructorLightFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: ConstructorLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final c apA() {
            return new c(Bx(), a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    private final void a(z zVar) {
        this.bIb.a(this, anY[0], zVar);
    }

    private final z arN() {
        return (z) this.bIb.b(this, anY[0]);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "ConstructorLightFragment::class.java.name");
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((z) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_payment_fields_light, viewGroup, false, 4, null));
        return arN().getRoot();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: arO */
    public LinearLayout aqe() {
        LinearLayout linearLayout = arN().cCK;
        kotlin.jvm.internal.i.e(linearLayout, "binding.paymentContentContainer");
        return linearLayout;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: arH */
    public LinearLayout apg() {
        LinearLayout linearLayout = arN().cCL;
        kotlin.jvm.internal.i.e(linearLayout, "binding.paymentFieldsContainer");
        return linearLayout;
    }

    /* Access modifiers changed, original: protected */
    public TextView aqf() {
        TextView textView = arN().cCM;
        kotlin.jvm.internal.i.e(textView, "binding.paymentFieldsNoInput");
        return textView;
    }

    /* Access modifiers changed, original: protected */
    public b b(String str, ExtraParamProperty extraParamProperty, ViewGroup viewGroup, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(extraParamProperty, "property");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return new b((com.iqoption.deposit.b.c) com.iqoption.core.ext.a.a(viewGroup, f.constructor_text_edit_field_light, null, false, 6, null), extraParamProperty, str, z, this);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.deposit.a.d b(String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar, ViewGroup viewGroup, boolean z) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(aVar, "property");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return new c((com.iqoption.deposit.b.a) com.iqoption.core.ext.a.a(viewGroup, f.constructor_spinner_field_light, null, false, 6, null), aVar, str, z, this);
    }

    /* Access modifiers changed, original: protected */
    public e b(String str, com.iqoption.core.microservices.billing.response.extraparams.c cVar, ViewGroup viewGroup, boolean z) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(cVar, "property");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return new d((com.iqoption.deposit.b.a) com.iqoption.core.ext.a.a(viewGroup, f.constructor_spinner_field_light, null, false, 6, null), cVar, str, z, this);
    }

    /* Access modifiers changed, original: protected */
    public c a(com.iqoption.deposit.a.a.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        return com.iqoption.deposit.light.constructor.selector.integer.c.cEO.b(cVar);
    }

    /* Access modifiers changed, original: protected */
    public c a(com.iqoption.deposit.a.a.b.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "params");
        return com.iqoption.deposit.light.constructor.selector.string.c.cET.b(dVar);
    }
}
