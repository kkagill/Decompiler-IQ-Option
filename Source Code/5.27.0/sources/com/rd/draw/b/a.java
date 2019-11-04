package com.rd.draw.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import androidx.annotation.NonNull;
import com.rd.draw.b.a.b;
import com.rd.draw.b.a.c;
import com.rd.draw.b.a.d;
import com.rd.draw.b.a.e;
import com.rd.draw.b.a.f;
import com.rd.draw.b.a.g;
import com.rd.draw.b.a.h;
import com.rd.draw.b.a.i;
import com.rd.draw.b.a.j;
import com.rd.draw.b.a.k;

/* compiled from: Drawer */
public class a {
    private b eIL;
    private c eIM;
    private g eIN;
    private k eIO;
    private h eIP;
    private e eIQ;
    private j eIR;
    private d eIS;
    private i eIT;
    private f eIU;
    private int eIV;
    private int eIW;
    private int position;

    public a(@NonNull com.rd.draw.data.a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Style.FILL);
        paint.setAntiAlias(true);
        this.eIL = new b(paint, aVar);
        this.eIM = new c(paint, aVar);
        this.eIN = new g(paint, aVar);
        this.eIO = new k(paint, aVar);
        this.eIP = new h(paint, aVar);
        this.eIQ = new e(paint, aVar);
        this.eIR = new j(paint, aVar);
        this.eIS = new d(paint, aVar);
        this.eIT = new i(paint, aVar);
        this.eIU = new f(paint, aVar);
    }

    public void v(int i, int i2, int i3) {
        this.position = i;
        this.eIV = i2;
        this.eIW = i3;
    }

    public void a(@NonNull Canvas canvas, boolean z) {
        if (this.eIM != null) {
            this.eIL.a(canvas, this.position, z, this.eIV, this.eIW);
        }
    }

    public void a(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        c cVar = this.eIM;
        if (cVar != null) {
            cVar.a(canvas, aVar, this.position, this.eIV, this.eIW);
        }
    }

    public void b(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        g gVar = this.eIN;
        if (gVar != null) {
            gVar.a(canvas, aVar, this.position, this.eIV, this.eIW);
        }
    }

    public void c(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        k kVar = this.eIO;
        if (kVar != null) {
            kVar.a(canvas, aVar, this.eIV, this.eIW);
        }
    }

    public void d(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        h hVar = this.eIP;
        if (hVar != null) {
            hVar.a(canvas, aVar, this.eIV, this.eIW);
        }
    }

    public void e(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        e eVar = this.eIQ;
        if (eVar != null) {
            eVar.a(canvas, aVar, this.position, this.eIV, this.eIW);
        }
    }

    public void f(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        j jVar = this.eIR;
        if (jVar != null) {
            jVar.a(canvas, aVar, this.eIV, this.eIW);
        }
    }

    public void g(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        d dVar = this.eIS;
        if (dVar != null) {
            dVar.a(canvas, aVar, this.eIV, this.eIW);
        }
    }

    public void h(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        i iVar = this.eIT;
        if (iVar != null) {
            iVar.a(canvas, aVar, this.position, this.eIV, this.eIW);
        }
    }

    public void i(@NonNull Canvas canvas, @NonNull com.rd.animation.b.a aVar) {
        f fVar = this.eIU;
        if (fVar != null) {
            fVar.a(canvas, aVar, this.position, this.eIV, this.eIW);
        }
    }
}
