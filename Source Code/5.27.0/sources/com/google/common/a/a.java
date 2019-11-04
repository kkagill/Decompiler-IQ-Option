package com.google.common.a;

import com.google.common.base.d;

/* compiled from: Escaper */
public abstract class a {
    private final d<String, String> XU = new d<String, String>() {
        /* renamed from: bR */
        public String apply(String str) {
            return a.this.escape(str);
        }
    };

    public abstract String escape(String str);

    protected a() {
    }
}
