package com.iqoption.core.microservices;

import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/microservices/DigitalMSHelper;", "", "()V", "DIGITAL_OPTIONS_MICROSERVICE", "", "getDOMSName", "core_release"})
/* compiled from: DigitalMSHelper.kt */
public final class a {
    public static final a blx = new a();

    private a() {
    }

    public static final String Zd() {
        com.iqoption.core.microservices.features.a.a ei = d.EH().ei("digital-ms");
        return kotlin.jvm.internal.i.y(ei != null ? ei.getStatus() : null, "enabled") ? "digital-options" : null;
    }
}
