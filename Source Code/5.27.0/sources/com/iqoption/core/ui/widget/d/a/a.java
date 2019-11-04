package com.iqoption.core.ui.widget.d.a;

import androidx.annotation.Nullable;
import com.iqoption.core.ui.widget.d.b;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;

/* compiled from: AsYouTypeDateFormatter */
public class a implements com.iqoption.core.ui.widget.d.a {
    private static final String TAG = "com.iqoption.core.ui.widget.d.a.a";
    private String aeP = "";
    private StringBuilder aeS = new StringBuilder();
    private StringBuilder aeT = new StringBuilder();
    private boolean aeU = true;
    private int afh = 0;
    private int afi = 0;
    @Nullable
    private b bNy;

    public void clear() {
        this.aeP = "";
        this.aeS.setLength(0);
        this.aeT.setLength(0);
        this.aeU = true;
        this.afi = 0;
        this.afh = 0;
    }

    public String i(char c) {
        this.aeP = a(c, false);
        return this.aeP;
    }

    public String j(char c) {
        this.aeP = a(c, true);
        return this.aeP;
    }

    private String a(char c, boolean z) {
        b bVar;
        this.aeS.append(c);
        if (z) {
            this.afh = this.aeS.length();
        }
        if (Character.isDigit(c)) {
            d(c, z);
        } else {
            this.aeU = false;
            bVar = this.bNy;
            if (bVar != null) {
                bVar.amI();
            }
        }
        if (!this.aeU) {
            return this.aeS.toString();
        }
        if (this.aeT.length() >= 4) {
            if (Integer.parseInt(this.aeT.substring(0, 2)) > 31) {
                bVar = this.bNy;
                if (bVar != null) {
                    bVar.amI();
                }
                return this.aeS.substring(0, 4);
            } else if (Integer.parseInt(this.aeT.substring(2, 4)) > 12) {
                bVar = this.bNy;
                if (bVar != null) {
                    bVar.amI();
                }
                return this.aeS.substring(0, 5);
            }
        } else if (this.aeT.length() >= 2 && Integer.parseInt(this.aeT.substring(0, 2)) > 31) {
            bVar = this.bNy;
            if (bVar != null) {
                bVar.amI();
            }
            return this.aeS.substring(0, 2);
        }
        int length = this.aeT.length();
        if (length == 3) {
            this.aeS.insert(2, '.');
            return this.aeS.toString();
        } else if (length != 5) {
            String substring;
            if (this.aeT.length() > 8) {
                StringBuilder stringBuilder = this.aeS;
                substring = stringBuilder.substring(0, Math.min(10, stringBuilder.length()));
            } else {
                substring = this.aeS.toString();
            }
            if (this.bNy != null) {
                if (isCompleted()) {
                    this.bNy.n(getDay(), getMonth(), getYear());
                } else {
                    this.bNy.amJ();
                }
            }
            return substring;
        } else {
            this.aeS.insert(5, '.');
            return this.aeS.toString();
        }
    }

    public boolean isCompleted() {
        return this.aeT.length() >= 8;
    }

    public int xk() {
        if (!this.aeU) {
            return this.afh;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.afi && i2 < this.aeP.length()) {
            if (this.aeT.charAt(i) == this.aeP.charAt(i2)) {
                i++;
            }
            i2++;
        }
        return i2;
    }

    public boolean isValid() {
        return amC() && amD() && amE();
    }

    public boolean amC() {
        if (getYear() > 0 && getMonth() > 0 && getDay() > 0) {
            return o(getYear(), getMonth(), getDay());
        }
        int day = getDay();
        boolean z = day > 0 && day <= 31;
        return z;
    }

    public boolean amD() {
        if (getYear() > 0 && getMonth() > 0 && getDay() > 0) {
            return o(getYear(), getMonth(), getDay());
        }
        int month = getMonth();
        boolean z = month > 0 && month <= 12;
        return z;
    }

    public boolean amE() {
        int year = getYear();
        int year2 = LocalDate.bSL().getYear();
        return year >= year2 + -120 && year <= year2;
    }

    public boolean amF() {
        return this.aeT.length() >= 2;
    }

    public boolean amG() {
        return this.aeT.length() >= 4;
    }

    public boolean amH() {
        return this.aeT.length() >= 8;
    }

    public int getDay() {
        try {
            if (this.aeT.length() >= 2) {
                return Integer.valueOf(this.aeT.substring(0, 2)).intValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getMonth() {
        try {
            if (this.aeT.length() >= 4) {
                return Integer.valueOf(this.aeT.substring(2, 4)).intValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getYear() {
        try {
            if (this.aeT.length() >= 8) {
                return Integer.valueOf(this.aeT.substring(4, 8)).intValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private boolean o(int i, int i2, int i3) {
        try {
            return LocalDate.G(i, i2, i3).c(LocalDate.bSL());
        } catch (DateTimeException unused) {
            return false;
        }
    }

    public void setValidationListener(b bVar) {
        this.bNy = bVar;
    }

    private char d(char c, boolean z) {
        c = Character.forDigit(Character.digit(c, 10), 10);
        this.aeT.append(c);
        if (z) {
            this.afi = this.aeT.length();
        }
        return c;
    }
}
