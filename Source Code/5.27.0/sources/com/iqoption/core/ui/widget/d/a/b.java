package com.iqoption.core.ui.widget.d.a;

import android.text.TextWatcher;
import androidx.annotation.Nullable;
import com.iqoption.core.ui.widget.d.a;

/* compiled from: DateFormattingTextWatcher */
public class b implements TextWatcher, a {
    private boolean bEv = false;
    private boolean bEw;
    @Nullable
    private com.iqoption.core.ui.widget.d.b bNy;
    private a bNz = new a();

    private void ajX() {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.bEv && !this.bEw && i2 > 0 && e(charSequence, i, i2)) {
            ajX();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.bEv && !this.bEw && i3 > 0 && e(charSequence, i, i3)) {
            ajX();
        }
    }

    /* JADX WARNING: Missing block: B:44:0x00b5, code skipped:
            return;
     */
    public synchronized void afterTextChanged(android.text.Editable r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.bEw;	 Catch:{ all -> 0x00b6 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x0007:
        r10 = r10.length();	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        r9.bEw = r1;	 Catch:{ all -> 0x00b6 }
        monitor-exit(r9);
        return;
    L_0x0013:
        r0 = r9.bEv;	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r9);
        return;
    L_0x0019:
        r0 = android.text.Selection.getSelectionEnd(r10);	 Catch:{ all -> 0x00b6 }
        r0 = r9.j(r10, r0);	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x00b4;
    L_0x0023:
        r9.bEv = r1;	 Catch:{ all -> 0x00b6 }
        r1 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r1 = r1.xk();	 Catch:{ all -> 0x00b6 }
        r4 = 0;
        r5 = r10.length();	 Catch:{ all -> 0x00b6 }
        r7 = 0;
        r8 = r0.length();	 Catch:{ all -> 0x00b6 }
        r3 = r10;
        r6 = r0;
        r3.replace(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00b6 }
        r3 = r10.toString();	 Catch:{ all -> 0x00b6 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        android.text.Selection.setSelection(r10, r1);	 Catch:{ all -> 0x00b6 }
    L_0x0047:
        r9.bEv = r2;	 Catch:{ all -> 0x00b6 }
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x00b4;
    L_0x004d:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amF();	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x0063;
    L_0x0055:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amC();	 Catch:{ all -> 0x00b6 }
        if (r10 != 0) goto L_0x0063;
    L_0x005d:
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        r10.amI();	 Catch:{ all -> 0x00b6 }
        goto L_0x00b4;
    L_0x0063:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amG();	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x0079;
    L_0x006b:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amD();	 Catch:{ all -> 0x00b6 }
        if (r10 != 0) goto L_0x0079;
    L_0x0073:
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        r10.amI();	 Catch:{ all -> 0x00b6 }
        goto L_0x00b4;
    L_0x0079:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amH();	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x008f;
    L_0x0081:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.amE();	 Catch:{ all -> 0x00b6 }
        if (r10 != 0) goto L_0x008f;
    L_0x0089:
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        r10.amI();	 Catch:{ all -> 0x00b6 }
        goto L_0x00b4;
    L_0x008f:
        r10 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r10 = r10.isCompleted();	 Catch:{ all -> 0x00b6 }
        if (r10 == 0) goto L_0x00af;
    L_0x0097:
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        r0 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r0 = r0.getDay();	 Catch:{ all -> 0x00b6 }
        r1 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r1 = r1.getMonth();	 Catch:{ all -> 0x00b6 }
        r2 = r9.bNz;	 Catch:{ all -> 0x00b6 }
        r2 = r2.getYear();	 Catch:{ all -> 0x00b6 }
        r10.n(r0, r1, r2);	 Catch:{ all -> 0x00b6 }
        goto L_0x00b4;
    L_0x00af:
        r10 = r9.bNy;	 Catch:{ all -> 0x00b6 }
        r10.amJ();	 Catch:{ all -> 0x00b6 }
    L_0x00b4:
        monitor-exit(r9);
        return;
    L_0x00b6:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.d.a.b.afterTextChanged(android.text.Editable):void");
    }

    public boolean isValid() {
        return this.bNz.isValid();
    }

    public boolean amC() {
        return this.bNz.amC();
    }

    public boolean amD() {
        return this.bNz.amD();
    }

    public boolean amE() {
        return this.bNz.amE();
    }

    public boolean amF() {
        return this.bNz.amF();
    }

    public boolean amG() {
        return this.bNz.amG();
    }

    public boolean amH() {
        return this.bNz.amH();
    }

    public int getDay() {
        return this.bNz.getDay();
    }

    public int getMonth() {
        return this.bNz.getMonth();
    }

    public int getYear() {
        return this.bNz.getYear();
    }

    public void setValidationListener(com.iqoption.core.ui.widget.d.b bVar) {
        this.bNy = bVar;
    }

    private String j(CharSequence charSequence, int i) {
        i--;
        this.bNz.clear();
        int length = charSequence.length();
        String str = null;
        char c = 0;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (Character.isDigit(charAt)) {
                if (c != 0) {
                    str = c(c, z);
                    z = false;
                }
                c = charAt;
            }
            if (i2 == i) {
                z = true;
            }
        }
        return c != 0 ? c(c, z) : str;
    }

    private String c(char c, boolean z) {
        if (z) {
            return this.bNz.j(c);
        }
        return this.bNz.i(c);
    }

    private boolean e(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!Character.isDigit(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }
}
