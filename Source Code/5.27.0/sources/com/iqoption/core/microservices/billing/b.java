package com.iqoption.core.microservices.billing;

import com.iqoption.core.d;
import com.iqoption.core.microservices.features.a.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/billing/GooglePayFeatureUtils;", "", "()V", "isGooglePayFeatureEnabled", "", "core_release"})
/* compiled from: GooglePayFeatureUtils.kt */
public final class b {
    public static final b bmm = new b();

    private b() {
    }

    public final boolean Zw() {
        a ei = d.EH().ei("google-pay");
        String status = ei != null ? ei.getStatus() : null;
        if (status != null) {
            int hashCode = status.hashCode();
            if (hashCode != -1631036443) {
                if (hashCode != -1609594047) {
                    if (hashCode == 1893652276 && status.equals("enabled-iq") && !d.Un().Di()) {
                        return true;
                    }
                } else if (status.equals("enabled")) {
                    return true;
                }
            } else if (status.equals("enabled-broker")) {
                return d.Un().Di();
            }
        }
        return false;
    }
}
