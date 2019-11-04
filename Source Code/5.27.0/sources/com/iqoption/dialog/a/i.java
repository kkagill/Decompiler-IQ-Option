package com.iqoption.dialog.a;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.iqoption.app.b;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.e;
import com.iqoption.x.R;
import java.util.Date;

/* compiled from: UIConfig */
final class i {
    private final String cHM = b.DG().DO();
    @ColorInt
    final int cHN;
    @ColorInt
    final int cHO;
    @ColorInt
    final int cHP;
    @ColorInt
    final int cHQ;
    private final int cIg;

    i(Context context, int i) {
        this.cIg = i;
        this.cHQ = ContextCompat.getColor(context, R.color.green);
        this.cHP = ContextCompat.getColor(context, R.color.red);
        this.cHN = ContextCompat.getColor(context, R.color.white);
        this.cHO = ContextCompat.getColor(context, R.color.grey_blur_70);
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String u(double d) {
        return e.f(d, this.cIg);
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String ay(long j) {
        return TimeUtil.bRw.format(new Date(j));
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String bz(long j) {
        return TimeUtil.bRx.format(new Date(j));
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String aQ(long j) {
        return TimeUtil.bRq.format(Long.valueOf(j));
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String bA(long j) {
        return TimeUtil.bRr.format(Long.valueOf(j));
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public String v(double d) {
        return e.a(d, 2, this.cHM);
    }
}
