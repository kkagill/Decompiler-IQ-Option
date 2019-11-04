package com.rd.b;

import android.os.Build.VERSION;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IdUtils */
public class c {
    private static final AtomicInteger eIX = new AtomicInteger(1);

    public static int generateViewId() {
        if (VERSION.SDK_INT < 17) {
            return bic();
        }
        return View.generateViewId();
    }

    private static int bic() {
        int i;
        int i2;
        do {
            i = eIX.get();
            i2 = i + 1;
            if (i2 > ViewCompat.MEASURED_SIZE_MASK) {
                i2 = 1;
            }
        } while (!eIX.compareAndSet(i, i2));
        return i;
    }
}
