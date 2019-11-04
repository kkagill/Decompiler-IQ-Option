package com.iqoption.service;

import java.io.StringReader;
import okhttp3.Response;

/* compiled from: WebSocketDelegate */
abstract class d {

    /* compiled from: WebSocketDelegate */
    public static abstract class a {
        public void a(int i, String str, StringReader stringReader) {
        }

        public void a(int i, Throwable th, Response response) {
        }

        public void ha(int i) {
        }

        public void hb(int i) {
        }
    }

    public abstract void a(String str, int i, a aVar);

    public abstract void aTm();

    public abstract void fk(String str);

    d() {
    }
}
