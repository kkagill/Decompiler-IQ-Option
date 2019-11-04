package com.iqoption.popup;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: PopupManager */
public class b {
    private static final String TAG = "com.iqoption.popup.b";
    private PriorityQueue<a> dKz = new PriorityQueue(24, a.dKx);

    public void a(Runnable runnable, String str) {
        a(runnable, str, PopupPriority.NORMAL);
    }

    public synchronized void a(Runnable runnable, String str, PopupPriority popupPriority) {
        a aVar = new a(str, popupPriority, SystemClock.elapsedRealtime(), runnable);
        if (this.dKz.isEmpty()) {
            this.dKz.add(aVar);
            runnable.run();
        } else if (!js(str)) {
            this.dKz.add(aVar);
        }
    }

    public synchronized void jr(String str) {
        a jt = jt(str);
        if (jt != null) {
            this.dKz.remove(jt);
        }
        if (!(jt == null || this.dKz.isEmpty())) {
            ((a) this.dKz.iterator().next()).aQl().run();
        }
    }

    public boolean js(String str) {
        return jt(str) != null;
    }

    public void onStop() {
        if (!this.dKz.isEmpty()) {
            a aVar = (a) this.dKz.iterator().next();
            this.dKz.clear();
            this.dKz.add(aVar);
        }
    }

    public boolean isShowing() {
        return this.dKz.isEmpty() ^ 1;
    }

    @Nullable
    private a jt(@NonNull String str) {
        Iterator it = this.dKz.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getTag().equals(str)) {
                return aVar;
            }
        }
        return null;
    }
}
