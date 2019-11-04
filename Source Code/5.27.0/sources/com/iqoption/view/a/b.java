package com.iqoption.view.a;

import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.app.managers.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/* compiled from: GlobalTimer */
public class b {
    private static final n<b> dne = Suppliers.a(-$$Lambda$b$IseZdqAHgtYxa3SeptC684L74Ok.INSTANCE);
    private final com.iqoption.system.a egL = new com.iqoption.system.a(200) {
        public void aRW() {
            b.this.egO = b.this.egO + 1;
            if (b.this.egO > b.this.egN) {
                b.this.egO = 0;
            }
            long Ib = l.HZ().Ib();
            synchronized (b.this.egM) {
                HashMap hashMap = new HashMap(b.this.egM);
            }
            for (Entry entry : hashMap.entrySet()) {
                if (b.this.egO % ((Integer) entry.getValue()).intValue() == 0) {
                    ((a) entry.getKey()).onTick(Ib);
                }
            }
        }
    };
    private final HashMap<a, Integer> egM = new HashMap(100);
    private int egN = 1;
    private int egO = 0;

    /* compiled from: GlobalTimer */
    public interface a {
        void onTick(long j);
    }

    private b() {
    }

    public static b aYv() {
        return (b) dne.get();
    }

    private void aYw() {
        this.egN = this.egM.isEmpty() ? 0 : ((Integer) Collections.max(this.egM.values())).intValue();
    }

    public void a(a aVar, Integer num) {
        synchronized (this.egM) {
            this.egM.put(aVar, num);
            if (this.egM.size() == 1) {
                this.egL.aUy();
            }
        }
        aYw();
    }

    public void a(a aVar) {
        a(aVar, Integer.valueOf(1));
    }

    public void b(a aVar) {
        synchronized (this.egM) {
            this.egM.remove(aVar);
            if (this.egM.size() == 0) {
                this.egL.cancel();
            }
        }
        aYw();
    }
}
