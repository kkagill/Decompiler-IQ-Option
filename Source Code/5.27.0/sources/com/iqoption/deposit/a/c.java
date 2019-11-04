package com.iqoption.deposit.a;

import android.text.Editable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/constructor/BaseEditFieldHolder;", "Lcom/iqoption/deposit/constructor/FieldHolder;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "name", "", "isRequired", "", "listener", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "(Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;Ljava/lang/String;ZLcom/iqoption/deposit/constructor/InfoClickListener;)V", "getProperty", "()Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "value", "deposit_release"})
/* compiled from: FieldHolders.kt */
public abstract class c extends f {
    private final ExtraParamProperty cyK;

    /* Access modifiers changed, original: protected|final */
    public final ExtraParamProperty aqh() {
        return this.cyK;
    }

    public c(ExtraParamProperty extraParamProperty, String str, boolean z, g gVar) {
        kotlin.jvm.internal.i.f(extraParamProperty, "property");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        super(str, z, gVar);
        this.cyK = extraParamProperty;
    }

    public ExtraParamProperty aqg() {
        return this.cyK;
    }

    public String value() {
        Editable text = aqn().getText();
        kotlin.jvm.internal.i.e(text, "editText().text");
        return v.trim(text).toString();
    }
}
