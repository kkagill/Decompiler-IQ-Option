package com.facebook.internal;

import com.facebook.f;
import java.util.Collection;

/* compiled from: ServerProtocol */
public final class x {
    private static final String TAG = "com.facebook.internal.x";
    public static final Collection<String> zH = z.b("service_disabled", "AndroidAuthKillSwitchException");
    public static final Collection<String> zI = z.b("access_denied", "OAuthAccessDeniedException");

    public static final String kK() {
        return "v3.3";
    }

    public static final String kH() {
        return String.format("m.%s", new Object[]{f.gT()});
    }

    public static final String kI() {
        return String.format("https://graph.%s", new Object[]{f.gT()});
    }

    public static final String kJ() {
        return String.format("https://graph-video.%s", new Object[]{f.gT()});
    }
}
