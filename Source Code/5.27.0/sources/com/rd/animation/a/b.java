package com.rd.animation.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.DropAnimation;
import com.rd.animation.type.c;
import com.rd.animation.type.d;
import com.rd.animation.type.e;
import com.rd.animation.type.f;
import com.rd.animation.type.g;
import com.rd.animation.type.h;
import com.rd.animation.type.i;

/* compiled from: ValueController */
public class b {
    private h eHA;
    private DropAnimation eHB;
    private g eHC;
    private e eHD;
    private a eHE;
    private com.rd.animation.type.b eHv;
    private d eHw;
    private i eHx;
    private f eHy;
    private c eHz;

    /* compiled from: ValueController */
    public interface a {
        void a(@Nullable com.rd.animation.b.a aVar);
    }

    public b(@Nullable a aVar) {
        this.eHE = aVar;
    }

    @NonNull
    public com.rd.animation.type.b bhy() {
        if (this.eHv == null) {
            this.eHv = new com.rd.animation.type.b(this.eHE);
        }
        return this.eHv;
    }

    @NonNull
    public d bhz() {
        if (this.eHw == null) {
            this.eHw = new d(this.eHE);
        }
        return this.eHw;
    }

    @NonNull
    public i bhA() {
        if (this.eHx == null) {
            this.eHx = new i(this.eHE);
        }
        return this.eHx;
    }

    @NonNull
    public f bhB() {
        if (this.eHy == null) {
            this.eHy = new f(this.eHE);
        }
        return this.eHy;
    }

    @NonNull
    public c bhC() {
        if (this.eHz == null) {
            this.eHz = new c(this.eHE);
        }
        return this.eHz;
    }

    @NonNull
    public h bhD() {
        if (this.eHA == null) {
            this.eHA = new h(this.eHE);
        }
        return this.eHA;
    }

    @NonNull
    public DropAnimation bhE() {
        if (this.eHB == null) {
            this.eHB = new DropAnimation(this.eHE);
        }
        return this.eHB;
    }

    @NonNull
    public g bhF() {
        if (this.eHC == null) {
            this.eHC = new g(this.eHE);
        }
        return this.eHC;
    }

    @NonNull
    public e bhG() {
        if (this.eHD == null) {
            this.eHD = new e(this.eHE);
        }
        return this.eHD;
    }
}
