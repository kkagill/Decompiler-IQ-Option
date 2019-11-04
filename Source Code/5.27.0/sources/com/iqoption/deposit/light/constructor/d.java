package com.iqoption.deposit.light.constructor;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.billing.response.extraparams.c;
import com.iqoption.deposit.a.e;
import com.iqoption.deposit.a.g;
import com.iqoption.deposit.b.a;
import com.iqoption.deposit.light.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, bng = {"Lcom/iqoption/deposit/light/constructor/SelectStringLightFieldHolder;", "Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "binding", "Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "name", "", "isRequired", "", "listener", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "(Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;Ljava/lang/String;ZLcom/iqoption/deposit/constructor/InfoClickListener;)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;", "editText", "Landroid/widget/EditText;", "infoButton", "Landroid/widget/ImageView;", "setTitle", "", "title", "showError", "message", "value", "view", "Landroid/view/View;", "deposit_release"})
/* compiled from: FieldHoldersLight.kt */
public final class d extends e {
    private final a cEI;

    public d(a aVar, c cVar, String str, boolean z, g gVar) {
        kotlin.jvm.internal.i.f(aVar, "binding");
        kotlin.jvm.internal.i.f(cVar, "property");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        super(cVar, str, z, gVar);
        this.cEI = aVar;
    }

    /* renamed from: aqk */
    public c aqg() {
        return aql();
    }

    public View aqm() {
        View root = this.cEI.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public String value() {
        String value = getValue();
        return value != null ? value : "";
    }

    public EditText aqn() {
        EditText editText = this.cEI.cAH;
        kotlin.jvm.internal.i.e(editText, "binding.constructorSpinnerEdit");
        return editText;
    }

    public ImageView aqo() {
        ImageView imageView = this.cEI.cAG;
        kotlin.jvm.internal.i.e(imageView, "binding.constructorPaymentInfo");
        return imageView;
    }

    public void setTitle(String str) {
        EditText editText = this.cEI.cAH;
        kotlin.jvm.internal.i.e(editText, "binding.constructorSpinnerEdit");
        editText.setHint(str);
    }

    public void hH(String str) {
        EditText editText = this.cEI.cAH;
        kotlin.jvm.internal.i.e(editText, "binding.constructorSpinnerEdit");
        b.b(editText, str);
    }
}
