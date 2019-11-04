package com.iqoption.mobbtech.connect.request.a.a;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.core.c.a;
import com.iqoption.mobbtech.connect.a.b;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.mobbtech.connect.response.f;
import okhttp3.Request;

/* compiled from: RequestTaskCallback */
public class c<T> extends b<T> {
    protected b<T> dIB;
    private o<T> dIC = new o<T>() {
        public void onSuccess(@Nullable T t) {
            if (c.this.dIB != null && t != null) {
                c.this.dIB.onSuccess(t);
            }
        }

        public void l(Throwable th) {
            if (c.this.dIB != null) {
                f aPQ;
                if (th instanceof MobbErrorException) {
                    aPQ = ((MobbErrorException) th).aPQ();
                } else {
                    aPQ = new f();
                    aPQ.jq(c.this.dIt);
                    aPQ.setMessage(c.this.errorMessage);
                }
                aPQ.gr(c.this.responseCode);
                c.this.dIB.a(aPQ);
            }
        }
    };

    public c(Class<T> cls, Request request, b<T> bVar, String str) {
        super((Class) cls, request, str);
        this.dIB = bVar;
    }

    public t<T> aPF() {
        t aPF = super.aPF();
        p.a(aPF, this.dIC, a.biN);
        return aPF;
    }

    public t<T> aPG() {
        t aPG = super.aPG();
        p.a(aPG, this.dIC, a.biN);
        return aPG;
    }
}
