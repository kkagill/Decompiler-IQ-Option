package com.iqoption.tradinghistory.materialcalendar;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.LinkedList;

/* compiled from: DayViewFacade */
public class j {
    private Drawable dZF = null;
    private boolean dZM = false;
    private Drawable dZN = null;
    private final LinkedList<Object> dZO = new LinkedList();
    private boolean dZP = false;

    j() {
    }

    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (drawable != null) {
            this.dZN = drawable;
            this.dZM = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    public void f(@NonNull Drawable drawable) {
        if (drawable != null) {
            this.dZF = drawable;
            this.dZM = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    /* Access modifiers changed, original: 0000 */
    public void reset() {
        this.dZN = null;
        this.dZF = null;
        this.dZO.clear();
        this.dZM = false;
        this.dZP = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(j jVar) {
        Drawable drawable = this.dZF;
        if (drawable != null) {
            jVar.f(drawable);
        }
        drawable = this.dZN;
        if (drawable != null) {
            jVar.setBackgroundDrawable(drawable);
        }
        jVar.dZO.addAll(this.dZO);
        jVar.dZM |= this.dZM;
        jVar.dZP = this.dZP;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aWw() {
        return this.dZM;
    }
}
