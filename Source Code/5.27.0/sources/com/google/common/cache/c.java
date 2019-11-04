package com.google.common.cache;

import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.base.i;

/* compiled from: CacheStats */
public final class c {
    private final long Ti;
    private final long Tj;
    private final long Tk;
    private final long Tl;
    private final long Tm;
    private final long Tn;

    public c(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z = true;
        i.checkArgument(j7 >= 0);
        i.checkArgument(j8 >= 0);
        i.checkArgument(j9 >= 0);
        i.checkArgument(j10 >= 0);
        i.checkArgument(j11 >= 0);
        if (j12 < 0) {
            z = false;
        }
        i.checkArgument(z);
        this.Ti = j7;
        this.Tj = j8;
        this.Tk = j9;
        this.Tl = j10;
        this.Tm = j11;
        this.Tn = j12;
    }

    public int hashCode() {
        return f.hashCode(Long.valueOf(this.Ti), Long.valueOf(this.Tj), Long.valueOf(this.Tk), Long.valueOf(this.Tl), Long.valueOf(this.Tm), Long.valueOf(this.Tn));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.Ti == cVar.Ti && this.Tj == cVar.Tj && this.Tk == cVar.Tk && this.Tl == cVar.Tl && this.Tm == cVar.Tm && this.Tn == cVar.Tn) {
            return true;
        }
        return false;
    }

    public String toString() {
        return e.aj(this).d("hitCount", this.Ti).d("missCount", this.Tj).d("loadSuccessCount", this.Tk).d("loadExceptionCount", this.Tl).d("totalLoadTime", this.Tm).d("evictionCount", this.Tn).toString();
    }
}
