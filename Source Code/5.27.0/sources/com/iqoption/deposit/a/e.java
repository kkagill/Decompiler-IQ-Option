package com.iqoption.deposit.a;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.billing.response.extraparams.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, bng = {"Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "Lcom/iqoption/deposit/constructor/FieldHolder;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "name", "", "isRequired", "", "listener", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "(Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;Ljava/lang/String;ZLcom/iqoption/deposit/constructor/InfoClickListener;)V", "getProperty", "()Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "value", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "deposit_release"})
/* compiled from: FieldHolders.kt */
public abstract class e extends f {
    private final c cyM;
    private String value;

    public final c aql() {
        return this.cyM;
    }

    public e(c cVar, String str, boolean z, g gVar) {
        kotlin.jvm.internal.i.f(cVar, "property");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        super(str, z, gVar);
        this.cyM = cVar;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    /* renamed from: aqk */
    public c aqg() {
        return this.cyM;
    }

    public String value() {
        String str = this.value;
        return str != null ? str : "";
    }
}
