package com.google.common.a;

/* compiled from: Platform */
final class b {
    private static final ThreadLocal<char[]> XW = new ThreadLocal<char[]>() {
        /* Access modifiers changed, original: protected */
        /* renamed from: uF */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    static char[] uE() {
        return (char[]) XW.get();
    }
}
