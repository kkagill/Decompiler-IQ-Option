package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.internal.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AsYouTypeFormatter */
public class b {
    private static final PhoneMetadata afa = new PhoneMetadata().cF("NA");
    private static final Pattern afd = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    private static final Pattern afe = Pattern.compile("[- ]");
    private static final Pattern aff = Pattern.compile(" ");
    private String aeP;
    private StringBuilder aeQ = new StringBuilder();
    private String aeR;
    private StringBuilder aeS;
    private StringBuilder aeT;
    private boolean aeU;
    private boolean aeV;
    private boolean aeW;
    private boolean aeX;
    private final PhoneNumberUtil aeY;
    private String aeZ;
    private PhoneMetadata afb;
    private PhoneMetadata afc;
    private int afg;
    private int afh;
    private int afi;
    private StringBuilder afj;
    private boolean afk;
    private String afl;
    private StringBuilder afm;
    private List<NumberFormat> afn;
    private c afo;

    b(String str) {
        String str2 = "";
        this.aeP = str2;
        this.aeR = str2;
        this.aeS = new StringBuilder();
        this.aeT = new StringBuilder();
        this.aeU = true;
        this.aeV = false;
        this.aeW = false;
        this.aeX = false;
        this.aeY = PhoneNumberUtil.xt();
        this.afg = 0;
        this.afh = 0;
        this.afi = 0;
        this.afj = new StringBuilder();
        this.afk = false;
        this.afl = str2;
        this.afm = new StringBuilder();
        this.afn = new ArrayList();
        this.afo = new c(64);
        this.aeZ = str;
        this.afc = cp(this.aeZ);
        this.afb = this.afc;
    }

    private PhoneMetadata cp(String str) {
        PhoneMetadata cp = this.aeY.cp(this.aeY.cD(this.aeY.cx(str)));
        if (cp != null) {
            return cp;
        }
        return afa;
    }

    private boolean xg() {
        Iterator it = this.afn.iterator();
        while (it.hasNext()) {
            NumberFormat numberFormat = (NumberFormat) it.next();
            String pattern = numberFormat.getPattern();
            if (this.aeR.equals(pattern)) {
                return false;
            }
            if (a(numberFormat)) {
                this.aeR = pattern;
                this.afk = afe.matcher(numberFormat.xv()).find();
                this.afg = 0;
                return true;
            }
            it.remove();
        }
        this.aeU = false;
        return false;
    }

    private void cq(String str) {
        Object obj = (this.aeW && this.afl.length() == 0) ? 1 : null;
        List xS;
        if (obj == null || this.afc.xV() <= 0) {
            xS = this.afc.xS();
        } else {
            xS = this.afc.xU();
        }
        for (NumberFormat numberFormat : xS) {
            if (this.afl.length() <= 0 || !PhoneNumberUtil.cv(numberFormat.xv()) || numberFormat.xw() || numberFormat.xx()) {
                if (this.afl.length() != 0 || this.aeW || PhoneNumberUtil.cv(numberFormat.xv()) || numberFormat.xw()) {
                    if (afd.matcher(numberFormat.getFormat()).matches()) {
                        this.afn.add(numberFormat);
                    }
                }
            }
        }
        cr(str);
    }

    private void cr(String str) {
        int length = str.length() - 3;
        Iterator it = this.afn.iterator();
        while (it.hasNext()) {
            NumberFormat numberFormat = (NumberFormat) it.next();
            if (numberFormat.xu() != 0) {
                if (!this.afo.cR(numberFormat.cE(Math.min(length, numberFormat.xu() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private boolean a(NumberFormat numberFormat) {
        String pattern = numberFormat.getPattern();
        this.aeQ.setLength(0);
        String T = T(pattern, numberFormat.getFormat());
        if (T.length() <= 0) {
            return false;
        }
        this.aeQ.append(T);
        return true;
    }

    private String T(String str, String str2) {
        Matcher matcher = this.afo.cR(str).matcher("999999999999999");
        matcher.find();
        String group = matcher.group();
        if (group.length() < this.afm.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", " ");
    }

    public void clear() {
        String str = "";
        this.aeP = str;
        this.aeS.setLength(0);
        this.aeT.setLength(0);
        this.aeQ.setLength(0);
        this.afg = 0;
        this.aeR = str;
        this.afj.setLength(0);
        this.afl = str;
        this.afm.setLength(0);
        this.aeU = true;
        this.aeV = false;
        this.afi = 0;
        this.afh = 0;
        this.aeW = false;
        this.aeX = false;
        this.afn.clear();
        this.afk = false;
        if (!this.afc.equals(this.afb)) {
            this.afc = cp(this.aeZ);
        }
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
        this.aeS.append(c);
        if (z) {
            this.afh = this.aeS.length();
        }
        if (k(c)) {
            c = b(c, z);
        } else {
            this.aeU = false;
            this.aeV = true;
        }
        if (this.aeU) {
            int length = this.aeT.length();
            if (length == 0 || length == 1 || length == 2) {
                return this.aeS.toString();
            }
            if (length == 3) {
                if (xp()) {
                    this.aeX = true;
                } else {
                    this.afl = xo();
                    return xl();
                }
            }
            if (this.aeX) {
                if (xq()) {
                    this.aeX = false;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.afj);
                stringBuilder.append(this.afm.toString());
                return stringBuilder.toString();
            } else if (this.afn.size() <= 0) {
                return xl();
            } else {
                String l = l(c);
                String xj = xj();
                if (xj.length() > 0) {
                    return xj;
                }
                cr(this.afm.toString());
                if (xg()) {
                    return xm();
                }
                if (this.aeU) {
                    l = cs(l);
                } else {
                    l = this.aeS.toString();
                }
                return l;
            }
        } else if (this.aeV) {
            return this.aeS.toString();
        } else {
            if (xp()) {
                if (xq()) {
                    return xh();
                }
            } else if (xi()) {
                this.afj.append(' ');
                return xh();
            }
            return this.aeS.toString();
        }
    }

    private String xh() {
        this.aeU = true;
        this.aeX = false;
        this.afn.clear();
        this.afg = 0;
        this.aeQ.setLength(0);
        this.aeR = "";
        return xl();
    }

    private boolean xi() {
        if (this.afl.length() > 0) {
            this.afm.insert(0, this.afl);
            this.afj.setLength(this.afj.lastIndexOf(this.afl));
        }
        return this.afl.equals(xo()) ^ 1;
    }

    private boolean k(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        if (this.aeS.length() == 1 && PhoneNumberUtil.afH.matcher(Character.toString(c)).matches()) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public String xj() {
        for (NumberFormat numberFormat : this.afn) {
            Matcher matcher = this.afo.cR(numberFormat.getPattern()).matcher(this.afm);
            if (matcher.matches()) {
                this.afk = afe.matcher(numberFormat.xv()).find();
                return cs(matcher.replaceAll(numberFormat.getFormat()));
            }
        }
        return "";
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

    private String cs(String str) {
        int length = this.afj.length();
        StringBuilder stringBuilder;
        if (!this.afk || length <= 0 || this.afj.charAt(length - 1) == ' ') {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.afj);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(new String(this.afj));
        stringBuilder.append(' ');
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private String xl() {
        if (this.afm.length() < 3) {
            return cs(this.afm.toString());
        }
        cq(this.afm.toString());
        String xj = xj();
        if (xj.length() > 0) {
            return xj;
        }
        return xg() ? xm() : this.aeS.toString();
    }

    private String xm() {
        int length = this.afm.length();
        if (length <= 0) {
            return this.afj.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = l(this.afm.charAt(i));
        }
        return this.aeU ? cs(str) : this.aeS.toString();
    }

    private boolean xn() {
        if (this.afc.xK() != 1 || this.afm.charAt(0) != '1' || this.afm.charAt(1) == '0' || this.afm.charAt(1) == '1') {
            return false;
        }
        return true;
    }

    private String xo() {
        int i = 1;
        if (xn()) {
            StringBuilder stringBuilder = this.afj;
            stringBuilder.append('1');
            stringBuilder.append(' ');
            this.aeW = true;
        } else {
            if (this.afc.xO()) {
                Matcher matcher = this.afo.cR(this.afc.xP()).matcher(this.afm);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.aeW = true;
                    i = matcher.end();
                    this.afj.append(this.afm.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.afm.substring(0, i);
        this.afm.delete(0, i);
        return substring;
    }

    private boolean xp() {
        c cVar = this.afo;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\+|");
        stringBuilder.append(this.afc.xL());
        Matcher matcher = cVar.cR(stringBuilder.toString()).matcher(this.aeT);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.aeW = true;
        int end = matcher.end();
        this.afm.setLength(0);
        this.afm.append(this.aeT.substring(end));
        this.afj.setLength(0);
        this.afj.append(this.aeT.substring(0, end));
        if (this.aeT.charAt(0) != '+') {
            this.afj.append(' ');
        }
        return true;
    }

    private boolean xq() {
        if (this.afm.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int a = this.aeY.a(this.afm, stringBuilder);
        if (a == 0) {
            return false;
        }
        this.afm.setLength(0);
        this.afm.append(stringBuilder);
        String cD = this.aeY.cD(a);
        if ("001".equals(cD)) {
            this.afc = this.aeY.cA(a);
        } else if (!cD.equals(this.aeZ)) {
            this.afc = cp(cD);
        }
        cD = Integer.toString(a);
        StringBuilder stringBuilder2 = this.afj;
        stringBuilder2.append(cD);
        stringBuilder2.append(' ');
        this.afl = "";
        return true;
    }

    private char b(char c, boolean z) {
        if (c == '+') {
            this.aeT.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            this.aeT.append(c);
            this.afm.append(c);
        }
        if (z) {
            this.afi = this.aeT.length();
        }
        return c;
    }

    private String l(char c) {
        Matcher matcher = aff.matcher(this.aeQ);
        if (matcher.find(this.afg)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.aeQ.replace(0, replaceFirst.length(), replaceFirst);
            this.afg = matcher.start();
            return this.aeQ.substring(0, this.afg + 1);
        }
        if (this.afn.size() == 1) {
            this.aeU = false;
        }
        this.aeR = "";
        return this.aeS.toString();
    }
}
