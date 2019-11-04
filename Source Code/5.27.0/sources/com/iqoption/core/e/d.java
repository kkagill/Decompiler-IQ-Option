package com.iqoption.core.e;

import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.b;
import java.util.Locale;

/* compiled from: PhoneNumberFormattingTextWatcherCompat */
public class d implements TextWatcher {
    private boolean bEv;
    private boolean bEw;
    private b bEx;

    public d() {
        this(Locale.getDefault().getCountry());
    }

    public d(String str) {
        this.bEv = false;
        if (str != null) {
            this.bEx = PhoneNumberUtil.xt().cz(str);
            return;
        }
        throw new IllegalArgumentException();
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

    /* JADX WARNING: Missing block: B:24:0x004a, code skipped:
            return;
     */
    public synchronized void afterTextChanged(android.text.Editable r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.bEw;	 Catch:{ all -> 0x004b }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x0007:
        r11 = r11.length();	 Catch:{ all -> 0x004b }
        if (r11 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        r10.bEw = r1;	 Catch:{ all -> 0x004b }
        monitor-exit(r10);
        return;
    L_0x0013:
        r0 = r10.bEv;	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r10);
        return;
    L_0x0019:
        r0 = android.text.Selection.getSelectionEnd(r11);	 Catch:{ all -> 0x004b }
        r0 = r10.j(r11, r0);	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0049;
    L_0x0023:
        r3 = r10.bEx;	 Catch:{ all -> 0x004b }
        r9 = r3.xk();	 Catch:{ all -> 0x004b }
        r10.bEv = r1;	 Catch:{ all -> 0x004b }
        r4 = 0;
        r5 = r11.length();	 Catch:{ all -> 0x004b }
        r7 = 0;
        r8 = r0.length();	 Catch:{ all -> 0x004b }
        r3 = r11;
        r6 = r0;
        r3.replace(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x004b }
        r1 = r11.toString();	 Catch:{ all -> 0x004b }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        android.text.Selection.setSelection(r11, r9);	 Catch:{ all -> 0x004b }
    L_0x0047:
        r10.bEv = r2;	 Catch:{ all -> 0x004b }
    L_0x0049:
        monitor-exit(r10);
        return;
    L_0x004b:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.e.d.afterTextChanged(android.text.Editable):void");
    }

    private String j(CharSequence charSequence, int i) {
        i--;
        this.bEx.clear();
        int length = charSequence.length();
        String str = null;
        char c = 0;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
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
            return this.bEx.j(c);
        }
        return this.bEx.i(c);
    }

    private void ajX() {
        this.bEw = true;
        this.bEx.clear();
    }

    private boolean e(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }
}
