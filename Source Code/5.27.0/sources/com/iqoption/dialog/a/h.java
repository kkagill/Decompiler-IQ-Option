package com.iqoption.dialog.a;

import androidx.annotation.NonNull;
import com.google.common.base.d;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.b;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.result.PositionResult;
import com.iqoption.mobbtech.connect.request.api.e;
import com.iqoption.util.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PositionsLoader */
final class h {
    private volatile List<Position> bwQ;
    private final long[] cIc;
    private t<List<Position>> future;
    private InstrumentType instrumentType;

    h(long[] jArr, InstrumentType instrumentType) {
        this.cIc = jArr;
        this.instrumentType = instrumentType;
    }

    public t<List<Position>> atH() {
        if (b.DG().DH() == 0) {
            return p.m(new IllegalStateException("balance id = 0"));
        }
        if (this.bwQ != null) {
            return p.bo(this.bwQ);
        }
        if (v.f(this.future)) {
            return this.future;
        }
        ArrayList arrayList = new ArrayList();
        d dVar = -$$Lambda$h$Rwh9EscasssJsQuvY6GdzaBOzK0.INSTANCE;
        for (long c : this.cIc) {
            arrayList.add(v.a(e.c(c, this.instrumentType), dVar));
        }
        this.future = p.B(arrayList);
        v.b(this.future, new o<List<Position>>() {
            /* renamed from: B */
            public void onSuccess(List<Position> list) {
                h.this.bwQ = list;
            }

            public void l(@NonNull Throwable th) {
                h.this.bwQ = null;
            }
        });
        return this.future;
    }

    private static /* synthetic */ Position a(PositionResult positionResult) {
        return positionResult != null ? positionResult.position : null;
    }
}
