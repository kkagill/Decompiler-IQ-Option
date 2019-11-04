package com.iqoption.core.manager;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.features.a.a;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/features/response/Feature;", "name", "", "version", "", "invoke"})
/* compiled from: Toggles.kt */
final class Toggles$initVersionsAndDefaults$2 extends Lambda implements m<String, Integer, a> {
    public static final Toggles$initVersionsAndDefaults$2 bla = new Toggles$initVersionsAndDefaults$2();

    Toggles$initVersionsAndDefaults$2() {
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return C((String) obj, ((Number) obj2).intValue());
    }

    public final a C(String str, int i) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        int hashCode = str.hashCode();
        String str2 = "enabled";
        if (hashCode != 113960) {
            if (hashCode == 229040601 && str.equals("show-social-login")) {
                return new a(str, str2, i);
            }
        } else if (str.equals("sla")) {
            return new a(str, str2, i);
        }
        return null;
    }
}
