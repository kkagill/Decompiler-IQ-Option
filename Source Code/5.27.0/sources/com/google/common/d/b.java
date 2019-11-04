package com.google.common.d;

import com.google.common.a.a;

/* compiled from: UrlEscapers */
public final class b {
    private static final a Zc = new a("-_.*", true);
    private static final a Zd = new a("-._~!$'()*,;&=@:+", false);
    private static final a Ze = new a("-._~!$'()*,;&=@:+/?", false);

    public static a vd() {
        return Zd;
    }
}
