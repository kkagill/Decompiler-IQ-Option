package com.rd;

import androidx.annotation.Nullable;

/* compiled from: IndicatorManager */
public class a implements com.rd.animation.a.b.a {
    private com.rd.draw.a eHg = new com.rd.draw.a();
    private com.rd.animation.a eHh = new com.rd.animation.a(this.eHg.bhe(), this);
    private a eHi;

    /* compiled from: IndicatorManager */
    interface a {
        void bhg();
    }

    a(@Nullable a aVar) {
        this.eHi = aVar;
    }

    public com.rd.animation.a bhd() {
        return this.eHh;
    }

    public com.rd.draw.data.a bhe() {
        return this.eHg.bhe();
    }

    public com.rd.draw.a bhf() {
        return this.eHg;
    }

    public void a(@Nullable com.rd.animation.b.a aVar) {
        this.eHg.b(aVar);
        a aVar2 = this.eHi;
        if (aVar2 != null) {
            aVar2.bhg();
        }
    }
}
