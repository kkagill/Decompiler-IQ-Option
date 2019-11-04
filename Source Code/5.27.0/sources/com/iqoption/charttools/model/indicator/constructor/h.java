package com.iqoption.charttools.model.indicator.constructor;

import com.google.gson.JsonArray;
import com.iqoption.core.ext.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "", "json", "Lcom/google/gson/JsonArray;", "(Lcom/google/gson/JsonArray;)V", "next", "", "nextBoolean", "", "fallback", "nextDouble", "", "nextInt", "nextString", "", "Companion", "techtools_release"})
/* compiled from: ValuesIterator.kt */
public final class h {
    private static final h aKe = new h(null);
    public static final a aKf = new a();
    private final JsonArray aKd;
    private int next;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "getEMPTY", "()Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "techtools_release"})
    /* compiled from: ValuesIterator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h OV() {
            return h.aKe;
        }
    }

    public h(JsonArray jsonArray) {
        this.aKd = jsonArray;
    }

    public final int nextInt(int i) {
        JsonArray jsonArray = this.aKd;
        int i2 = this.next;
        this.next = i2 + 1;
        return d.a(jsonArray, i2, i);
    }

    public final double nextDouble(double d) {
        JsonArray jsonArray = this.aKd;
        int i = this.next;
        this.next = i + 1;
        return d.a(jsonArray, i, d);
    }

    public final String eR(String str) {
        kotlin.jvm.internal.i.f(str, "fallback");
        JsonArray jsonArray = this.aKd;
        int i = this.next;
        this.next = i + 1;
        return d.a(jsonArray, i, str);
    }
}
