package org.yaml.snakeyaml.scanner;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.tokens.Token;
import org.yaml.snakeyaml.tokens.Token.ID;
import org.yaml.snakeyaml.tokens.b;
import org.yaml.snakeyaml.tokens.d;
import org.yaml.snakeyaml.tokens.e;
import org.yaml.snakeyaml.tokens.f;
import org.yaml.snakeyaml.tokens.g;
import org.yaml.snakeyaml.tokens.h;
import org.yaml.snakeyaml.tokens.i;
import org.yaml.snakeyaml.tokens.j;
import org.yaml.snakeyaml.tokens.k;
import org.yaml.snakeyaml.tokens.l;
import org.yaml.snakeyaml.tokens.m;
import org.yaml.snakeyaml.tokens.n;
import org.yaml.snakeyaml.tokens.o;
import org.yaml.snakeyaml.tokens.p;
import org.yaml.snakeyaml.tokens.q;
import org.yaml.snakeyaml.tokens.r;
import org.yaml.snakeyaml.tokens.s;
import org.yaml.snakeyaml.tokens.t;
import org.yaml.snakeyaml.tokens.u;

/* compiled from: ScannerImpl */
public final class c implements b {
    private static final Pattern fMB = Pattern.compile("[^0-9A-Fa-f]");
    public static final Map<Character, String> fMC = new HashMap();
    public static final Map<Character, Integer> fMD = new HashMap();
    private boolean done = false;
    private int fJF = -1;
    private final org.yaml.snakeyaml.reader.a fME;
    private int fMF = 0;
    private List<Token> fMG;
    private int fMH = 0;
    private org.yaml.snakeyaml.d.a<Integer> fMI;
    private boolean fMJ = true;
    private Map<Integer, d> fMK;

    /* compiled from: ScannerImpl */
    private static class a {
        private final int fML;
        private final Boolean uZ;

        public a(Boolean bool, int i) {
            this.uZ = bool;
            this.fML = i;
        }

        public boolean bVV() {
            Boolean bool = this.uZ;
            return bool == null || bool.booleanValue();
        }

        public boolean bVW() {
            Boolean bool = this.uZ;
            return bool != null && bool.booleanValue();
        }

        public int bVX() {
            return this.fML;
        }
    }

    static {
        fMC.put(Character.valueOf('0'), "\u0000");
        fMC.put(Character.valueOf('a'), "\u0007");
        fMC.put(Character.valueOf('b'), "\b");
        fMC.put(Character.valueOf('t'), "\t");
        fMC.put(Character.valueOf('n'), "\n");
        fMC.put(Character.valueOf('v'), "\u000b");
        fMC.put(Character.valueOf('f'), "\f");
        fMC.put(Character.valueOf('r'), "\r");
        fMC.put(Character.valueOf('e'), "\u001b");
        fMC.put(Character.valueOf(' '), " ");
        fMC.put(Character.valueOf('\"'), "\"");
        fMC.put(Character.valueOf('\\'), "\\");
        fMC.put(Character.valueOf('N'), "");
        fMC.put(Character.valueOf('_'), " ");
        fMC.put(Character.valueOf('L'), " ");
        fMC.put(Character.valueOf('P'), " ");
        fMD.put(Character.valueOf('x'), Integer.valueOf(2));
        fMD.put(Character.valueOf('u'), Integer.valueOf(4));
        fMD.put(Character.valueOf('U'), Integer.valueOf(8));
    }

    public c(org.yaml.snakeyaml.reader.a aVar) {
        this.fME = aVar;
        this.fMG = new ArrayList(100);
        this.fMI = new org.yaml.snakeyaml.d.a(10);
        this.fMK = new LinkedHashMap();
        bVm();
    }

    public boolean a(ID... idArr) {
        while (bVg()) {
            bVh();
        }
        if (!this.fMG.isEmpty()) {
            if (idArr.length == 0) {
                return true;
            }
            ID bVZ = ((Token) this.fMG.get(0)).bVZ();
            for (ID id : idArr) {
                if (bVZ == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public Token bVe() {
        while (bVg()) {
            bVh();
        }
        return (Token) this.fMG.get(0);
    }

    public Token bVf() {
        this.fMH++;
        return (Token) this.fMG.remove(0);
    }

    private boolean bVg() {
        boolean z = false;
        if (this.done) {
            return false;
        }
        if (this.fMG.isEmpty()) {
            return true;
        }
        bVj();
        if (bVi() == this.fMH) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fc  */
    private void bVh() {
        /*
        r5 = this;
        r5.bVO();
        r5.bVj();
        r0 = r5.fME;
        r0 = r0.bUy();
        r5.nZ(r0);
        r0 = r5.fME;
        r0 = r0.peek();
        if (r0 == 0) goto L_0x012f;
    L_0x0017:
        r1 = 42;
        if (r0 == r1) goto L_0x012b;
    L_0x001b:
        r1 = 58;
        if (r0 == r1) goto L_0x00a7;
    L_0x001f:
        r1 = 91;
        if (r0 == r1) goto L_0x00a3;
    L_0x0023:
        r1 = 93;
        if (r0 == r1) goto L_0x009f;
    L_0x0027:
        r1 = 33;
        if (r0 == r1) goto L_0x009b;
    L_0x002b:
        r1 = 34;
        if (r0 == r1) goto L_0x0097;
    L_0x002f:
        r1 = 62;
        if (r0 == r1) goto L_0x008f;
    L_0x0033:
        r1 = 63;
        if (r0 == r1) goto L_0x0085;
    L_0x0037:
        switch(r0) {
            case 37: goto L_0x007b;
            case 38: goto L_0x0077;
            case 39: goto L_0x0073;
            default: goto L_0x003a;
        };
    L_0x003a:
        switch(r0) {
            case 44: goto L_0x006f;
            case 45: goto L_0x005b;
            case 46: goto L_0x0051;
            default: goto L_0x003d;
        };
    L_0x003d:
        switch(r0) {
            case 123: goto L_0x004d;
            case 124: goto L_0x0045;
            case 125: goto L_0x0041;
            default: goto L_0x0040;
        };
    L_0x0040:
        goto L_0x00b1;
    L_0x0041:
        r5.bVu();
        return;
    L_0x0045:
        r1 = r5.fMF;
        if (r1 != 0) goto L_0x00b1;
    L_0x0049:
        r5.bVC();
        return;
    L_0x004d:
        r5.bVs();
        return;
    L_0x0051:
        r1 = r5.bVJ();
        if (r1 == 0) goto L_0x00b1;
    L_0x0057:
        r5.bVq();
        return;
    L_0x005b:
        r1 = r5.bVI();
        if (r1 == 0) goto L_0x0065;
    L_0x0061:
        r5.bVp();
        return;
    L_0x0065:
        r1 = r5.bVK();
        if (r1 == 0) goto L_0x00b1;
    L_0x006b:
        r5.bVw();
        return;
    L_0x006f:
        r5.bVv();
        return;
    L_0x0073:
        r5.bVE();
        return;
    L_0x0077:
        r5.bVA();
        return;
    L_0x007b:
        r1 = r5.bVH();
        if (r1 == 0) goto L_0x00b1;
    L_0x0081:
        r5.bVo();
        return;
    L_0x0085:
        r1 = r5.bVL();
        if (r1 == 0) goto L_0x00b1;
    L_0x008b:
        r5.bVx();
        return;
    L_0x008f:
        r1 = r5.fMF;
        if (r1 != 0) goto L_0x00b1;
    L_0x0093:
        r5.bVD();
        return;
    L_0x0097:
        r5.bVF();
        return;
    L_0x009b:
        r5.bVB();
        return;
    L_0x009f:
        r5.bVt();
        return;
    L_0x00a3:
        r5.bVr();
        return;
    L_0x00a7:
        r1 = r5.bVM();
        if (r1 == 0) goto L_0x00b1;
    L_0x00ad:
        r5.bVy();
        return;
    L_0x00b1:
        r1 = r5.bVN();
        if (r1 == 0) goto L_0x00bb;
    L_0x00b7:
        r5.bVG();
        return;
    L_0x00bb:
        r1 = java.lang.Character.toChars(r0);
        r1 = java.lang.String.valueOf(r1);
        r2 = fMC;
        r2 = r2.keySet();
        r2 = r2.iterator();
    L_0x00cd:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00f8;
    L_0x00d3:
        r3 = r2.next();
        r3 = (java.lang.Character) r3;
        r4 = fMC;
        r4 = r4.get(r3);
        r4 = (java.lang.String) r4;
        r4 = r4.equals(r1);
        if (r4 == 0) goto L_0x00cd;
    L_0x00e7:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "\\";
        r1.append(r2);
        r1.append(r3);
        r1 = r1.toString();
    L_0x00f8:
        r2 = 9;
        if (r0 != r2) goto L_0x010d;
    L_0x00fc:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = "(TAB)";
        r0.append(r1);
        r1 = r0.toString();
    L_0x010d:
        r0 = 2;
        r0 = new java.lang.Object[r0];
        r2 = 0;
        r0[r2] = r1;
        r2 = 1;
        r0[r2] = r1;
        r1 = "found character '%s' that cannot start any token. (Do not use %s for indentation)";
        r0 = java.lang.String.format(r1, r0);
        r1 = new org.yaml.snakeyaml.scanner.ScannerException;
        r2 = 0;
        r3 = r5.fME;
        r3 = r3.bUZ();
        r4 = "while scanning for the next token";
        r1.<init>(r4, r2, r0, r3);
        throw r1;
    L_0x012b:
        r5.bVz();
        return;
    L_0x012f:
        r5.bVn();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.scanner.c.bVh():void");
    }

    private int bVi() {
        return !this.fMK.isEmpty() ? ((d) this.fMK.values().iterator().next()).bVY() : -1;
    }

    private void bVj() {
        if (!this.fMK.isEmpty()) {
            Iterator it = this.fMK.values().iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.bUx() != this.fME.bUx() || this.fME.getIndex() - dVar.getIndex() > 1024) {
                    if (dVar.wo()) {
                        throw new ScannerException("while scanning a simple key", dVar.bUZ(), "could not find expected ':'", this.fME.bUZ());
                    }
                    it.remove();
                }
            }
        }
    }

    private void bVk() {
        boolean z = this.fMF == 0 && this.fJF == this.fME.bUy();
        if (!this.fMJ && z) {
            throw new YAMLException("A simple key is required only if it is the first token in the current line");
        } else if (this.fMJ) {
            bVl();
            this.fMK.put(Integer.valueOf(this.fMF), new d(this.fMH + this.fMG.size(), z, this.fME.getIndex(), this.fME.bUx(), this.fME.bUy(), this.fME.bUZ()));
        }
    }

    private void bVl() {
        d dVar = (d) this.fMK.remove(Integer.valueOf(this.fMF));
        if (dVar != null && dVar.wo()) {
            throw new ScannerException("while scanning a simple key", dVar.bUZ(), "could not find expected ':'", this.fME.bUZ());
        }
    }

    private void nZ(int i) {
        if (this.fMF == 0) {
            while (this.fJF > i) {
                Mark bUZ = this.fME.bUZ();
                this.fJF = ((Integer) this.fMI.pop()).intValue();
                this.fMG.add(new org.yaml.snakeyaml.tokens.c(bUZ, bUZ));
            }
        }
    }

    private boolean oa(int i) {
        int i2 = this.fJF;
        if (i2 >= i) {
            return false;
        }
        this.fMI.push(Integer.valueOf(i2));
        this.fJF = i;
        return true;
    }

    private void bVm() {
        Mark bUZ = this.fME.bUZ();
        this.fMG.add(new r(bUZ, bUZ));
    }

    private void bVn() {
        nZ(-1);
        bVl();
        this.fMJ = false;
        this.fMK.clear();
        Mark bUZ = this.fME.bUZ();
        this.fMG.add(new q(bUZ, bUZ));
        this.done = true;
    }

    private void bVo() {
        nZ(-1);
        bVl();
        this.fMJ = false;
        this.fMG.add(bVP());
    }

    private void bVp() {
        hw(true);
    }

    private void bVq() {
        hw(false);
    }

    private void hw(boolean z) {
        Object iVar;
        nZ(-1);
        bVl();
        this.fMJ = false;
        Mark bUZ = this.fME.bUZ();
        this.fME.nS(3);
        Mark bUZ2 = this.fME.bUZ();
        if (z) {
            iVar = new i(bUZ, bUZ2);
        } else {
            iVar = new h(bUZ, bUZ2);
        }
        this.fMG.add(iVar);
    }

    private void bVr() {
        hx(false);
    }

    private void bVs() {
        hx(true);
    }

    private void hx(boolean z) {
        Object lVar;
        bVk();
        this.fMF++;
        this.fMJ = true;
        Mark bUZ = this.fME.bUZ();
        this.fME.nS(1);
        Mark bUZ2 = this.fME.bUZ();
        if (z) {
            lVar = new l(bUZ, bUZ2);
        } else {
            lVar = new n(bUZ, bUZ2);
        }
        this.fMG.add(lVar);
    }

    private void bVt() {
        hy(false);
    }

    private void bVu() {
        hy(true);
    }

    private void hy(boolean z) {
        Object kVar;
        bVl();
        this.fMF--;
        this.fMJ = false;
        Mark bUZ = this.fME.bUZ();
        this.fME.bVa();
        Mark bUZ2 = this.fME.bUZ();
        if (z) {
            kVar = new k(bUZ, bUZ2);
        } else {
            kVar = new m(bUZ, bUZ2);
        }
        this.fMG.add(kVar);
    }

    private void bVv() {
        this.fMJ = true;
        bVl();
        Mark bUZ = this.fME.bUZ();
        this.fME.bVa();
        this.fMG.add(new j(bUZ, this.fME.bUZ()));
    }

    private void bVw() {
        Mark bUZ;
        if (this.fMF == 0) {
            if (!this.fMJ) {
                throw new ScannerException(null, null, "sequence entries are not allowed here", this.fME.bUZ());
            } else if (oa(this.fME.bUy())) {
                bUZ = this.fME.bUZ();
                this.fMG.add(new f(bUZ, bUZ));
            }
        }
        this.fMJ = true;
        bVl();
        bUZ = this.fME.bUZ();
        this.fME.bVa();
        this.fMG.add(new d(bUZ, this.fME.bUZ()));
    }

    private void bVx() {
        Mark bUZ;
        if (this.fMF == 0) {
            if (!this.fMJ) {
                throw new ScannerException(null, null, "mapping keys are not allowed here", this.fME.bUZ());
            } else if (oa(this.fME.bUy())) {
                bUZ = this.fME.bUZ();
                this.fMG.add(new e(bUZ, bUZ));
            }
        }
        this.fMJ = this.fMF == 0;
        bVl();
        bUZ = this.fME.bUZ();
        this.fME.bVa();
        this.fMG.add(new o(bUZ, this.fME.bUZ()));
    }

    private void bVy() {
        Mark bUZ;
        d dVar = (d) this.fMK.remove(Integer.valueOf(this.fMF));
        boolean z = false;
        if (dVar != null) {
            this.fMG.add(dVar.bVY() - this.fMH, new o(dVar.bUZ(), dVar.bUZ()));
            if (this.fMF == 0 && oa(dVar.bUy())) {
                this.fMG.add(dVar.bVY() - this.fMH, new e(dVar.bUZ(), dVar.bUZ()));
            }
            this.fMJ = false;
        } else if (this.fMF != 0 || this.fMJ) {
            if (this.fMF == 0 && oa(this.fME.bUy())) {
                bUZ = this.fME.bUZ();
                this.fMG.add(new e(bUZ, bUZ));
            }
            if (this.fMF == 0) {
                z = true;
            }
            this.fMJ = z;
            bVl();
        } else {
            throw new ScannerException(null, null, "mapping values are not allowed here", this.fME.bUZ());
        }
        bUZ = this.fME.bUZ();
        this.fME.bVa();
        this.fMG.add(new u(bUZ, this.fME.bUZ()));
    }

    private void bVz() {
        bVk();
        this.fMJ = false;
        this.fMG.add(hz(false));
    }

    private void bVA() {
        bVk();
        this.fMJ = false;
        this.fMG.add(hz(true));
    }

    private void bVB() {
        bVk();
        this.fMJ = false;
        this.fMG.add(bVQ());
    }

    private void bVC() {
        J('|');
    }

    private void bVD() {
        J('>');
    }

    private void J(char c) {
        this.fMJ = true;
        bVl();
        this.fMG.add(L(c));
    }

    private void bVE() {
        K('\'');
    }

    private void bVF() {
        K('\"');
    }

    private void K(char c) {
        bVk();
        this.fMJ = false;
        this.fMG.add(M(c));
    }

    private void bVG() {
        bVk();
        this.fMJ = false;
        this.fMG.add(bVS());
    }

    private boolean bVH() {
        return this.fME.bUy() == 0;
    }

    private boolean bVI() {
        if (this.fME.bUy() == 0) {
            if ("---".equals(this.fME.nU(3)) && a.fMu.nX(this.fME.nT(3))) {
                return true;
            }
        }
        return false;
    }

    private boolean bVJ() {
        if (this.fME.bUy() == 0) {
            if ("...".equals(this.fME.nU(3)) && a.fMu.nX(this.fME.nT(3))) {
                return true;
            }
        }
        return false;
    }

    private boolean bVK() {
        return a.fMu.nX(this.fME.nT(1));
    }

    private boolean bVL() {
        if (this.fMF != 0) {
            return true;
        }
        return a.fMu.nX(this.fME.nT(1));
    }

    private boolean bVM() {
        if (this.fMF != 0) {
            return true;
        }
        return a.fMu.nX(this.fME.nT(1));
    }

    private boolean bVN() {
        int peek = this.fME.peek();
        if (a.fMu.m(peek, "-?:,[]{}#&*!|>'\"%@`")) {
            return true;
        }
        if (a.fMu.nY(this.fME.nT(1))) {
            if (peek == 45) {
                return true;
            }
            if (this.fMF == 0 && "?:".indexOf(peek) != -1) {
                return true;
            }
        }
        return false;
    }

    private void bVO() {
        if (this.fME.getIndex() == 0 && this.fME.peek() == 65279) {
            this.fME.bVa();
        }
        Object obj = null;
        while (obj == null) {
            int i = 0;
            while (this.fME.nT(i) == 32) {
                i++;
            }
            if (i > 0) {
                this.fME.nS(i);
            }
            if (this.fME.peek() == 35) {
                i = 0;
                while (a.fMs.nY(this.fME.nT(i))) {
                    i++;
                }
                if (i > 0) {
                    this.fME.nS(i);
                }
            }
            if (bVU().length() == 0) {
                obj = 1;
            } else if (this.fMF == 0) {
                this.fMJ = true;
            }
        }
    }

    private Token bVP() {
        List d;
        Mark bUZ;
        Mark bUZ2 = this.fME.bUZ();
        this.fME.bVa();
        String c = c(bUZ2);
        if ("YAML".equals(c)) {
            d = d(bUZ2);
            bUZ = this.fME.bUZ();
        } else if ("TAG".equals(c)) {
            d = f(bUZ2);
            bUZ = this.fME.bUZ();
        } else {
            bUZ = this.fME.bUZ();
            int i = 0;
            while (a.fMs.nY(this.fME.nT(i))) {
                i++;
            }
            if (i > 0) {
                this.fME.nS(i);
            }
            d = null;
        }
        i(bUZ2);
        return new g(c, d, bUZ2, bUZ);
    }

    private String c(Mark mark) {
        int i = 0;
        int nT = this.fME.nT(0);
        while (a.fMx.nX(nT)) {
            i++;
            nT = this.fME.nT(i);
        }
        String str = ")";
        String str2 = "(";
        String str3 = "expected alphabetic or numeric character, but found ";
        String str4 = "while scanning a directive";
        StringBuilder stringBuilder;
        if (i != 0) {
            String nV = this.fME.nV(i);
            i = this.fME.peek();
            if (!a.fMt.nY(i)) {
                return nV;
            }
            nV = String.valueOf(Character.toChars(i));
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(nV);
            stringBuilder.append(str2);
            stringBuilder.append(i);
            stringBuilder.append(str);
            throw new ScannerException(str4, mark, stringBuilder.toString(), this.fME.bUZ());
        }
        String valueOf = String.valueOf(Character.toChars(nT));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        stringBuilder.append(nT);
        stringBuilder.append(str);
        throw new ScannerException(str4, mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private List<Integer> d(Mark mark) {
        while (this.fME.peek() == 32) {
            this.fME.bVa();
        }
        Integer e = e(mark);
        int peek = this.fME.peek();
        String str = ")";
        String str2 = "(";
        String str3 = "while scanning a directive";
        String valueOf;
        StringBuilder stringBuilder;
        if (peek == 46) {
            this.fME.bVa();
            Integer e2 = e(mark);
            int peek2 = this.fME.peek();
            if (a.fMt.nY(peek2)) {
                valueOf = String.valueOf(Character.toChars(peek2));
                stringBuilder = new StringBuilder();
                stringBuilder.append("expected a digit or ' ', but found ");
                stringBuilder.append(valueOf);
                stringBuilder.append(str2);
                stringBuilder.append(peek2);
                stringBuilder.append(str);
                throw new ScannerException(str3, mark, stringBuilder.toString(), this.fME.bUZ());
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(e);
            arrayList.add(e2);
            return arrayList;
        }
        valueOf = String.valueOf(Character.toChars(peek));
        stringBuilder = new StringBuilder();
        stringBuilder.append("expected a digit or '.', but found ");
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        stringBuilder.append(peek);
        stringBuilder.append(str);
        throw new ScannerException(str3, mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private Integer e(Mark mark) {
        int peek = this.fME.peek();
        if (Character.isDigit(peek)) {
            int i = 0;
            while (Character.isDigit(this.fME.nT(i))) {
                i++;
            }
            return Integer.valueOf(Integer.parseInt(this.fME.nV(i)));
        }
        String valueOf = String.valueOf(Character.toChars(peek));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected a digit, but found ");
        stringBuilder.append(valueOf);
        stringBuilder.append("(");
        stringBuilder.append(peek);
        stringBuilder.append(")");
        throw new ScannerException("while scanning a directive", mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private List<String> f(Mark mark) {
        while (this.fME.peek() == 32) {
            this.fME.bVa();
        }
        String g = g(mark);
        while (this.fME.peek() == 32) {
            this.fME.bVa();
        }
        String h = h(mark);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g);
        arrayList.add(h);
        return arrayList;
    }

    private String g(Mark mark) {
        String a = a("directive", mark);
        int peek = this.fME.peek();
        if (peek == 32) {
            return a;
        }
        a = String.valueOf(Character.toChars(peek));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected ' ', but found ");
        stringBuilder.append(a);
        stringBuilder.append("(");
        stringBuilder.append(peek);
        stringBuilder.append(")");
        throw new ScannerException("while scanning a directive", mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private String h(Mark mark) {
        String b = b("directive", mark);
        int peek = this.fME.peek();
        if (!a.fMt.nY(peek)) {
            return b;
        }
        b = String.valueOf(Character.toChars(peek));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected ' ', but found ");
        stringBuilder.append(b);
        stringBuilder.append("(");
        stringBuilder.append(peek);
        stringBuilder.append(")");
        throw new ScannerException("while scanning a directive", mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private void i(Mark mark) {
        while (this.fME.peek() == 32) {
            this.fME.bVa();
        }
        if (this.fME.peek() == 35) {
            while (a.fMs.nY(this.fME.peek())) {
                this.fME.bVa();
            }
        }
        int peek = this.fME.peek();
        if (bVU().length() == 0 && peek != 0) {
            String valueOf = String.valueOf(Character.toChars(peek));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected a comment or a line break, but found ");
            stringBuilder.append(valueOf);
            stringBuilder.append("(");
            stringBuilder.append(peek);
            stringBuilder.append(")");
            throw new ScannerException("while scanning a directive", mark, stringBuilder.toString(), this.fME.bUZ());
        }
    }

    private Token hz(boolean z) {
        Mark bUZ = this.fME.bUZ();
        String str = this.fME.peek() == 42 ? "alias" : "anchor";
        this.fME.bVa();
        int i = 0;
        int nT = this.fME.nT(0);
        while (a.fMx.nX(nT)) {
            i++;
            nT = this.fME.nT(i);
        }
        String str2 = ")";
        String str3 = "(";
        String str4 = "expected alphabetic or numeric character, but found ";
        String str5 = "while scanning an ";
        String valueOf;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        if (i != 0) {
            String nV = this.fME.nV(i);
            nT = this.fME.peek();
            if (a.fMu.m(nT, "?:,]}%@`")) {
                valueOf = String.valueOf(Character.toChars(nT));
                stringBuilder = new StringBuilder();
                stringBuilder.append(str5);
                stringBuilder.append(str);
                str = stringBuilder.toString();
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append(valueOf);
                stringBuilder2.append(str3);
                stringBuilder2.append(nT);
                stringBuilder2.append(str2);
                throw new ScannerException(str, bUZ, stringBuilder2.toString(), this.fME.bUZ());
            }
            Mark bUZ2 = this.fME.bUZ();
            if (z) {
                return new b(nV, bUZ, bUZ2);
            }
            return new org.yaml.snakeyaml.tokens.a(nV, bUZ, bUZ2);
        }
        valueOf = String.valueOf(Character.toChars(nT));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str5);
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str4);
        stringBuilder2.append(valueOf);
        stringBuilder2.append(str3);
        stringBuilder2.append(nT);
        stringBuilder2.append(str2);
        throw new ScannerException(str, bUZ, stringBuilder2.toString(), this.fME.bUZ());
    }

    private Token bVQ() {
        String valueOf;
        StringBuilder stringBuilder;
        Mark bUZ = this.fME.bUZ();
        int i = 1;
        int nT = this.fME.nT(1);
        String str = ")";
        String str2 = "' (";
        String str3 = "while scanning a tag";
        String str4 = "!";
        String str5 = "tag";
        String str6 = null;
        if (nT == 60) {
            this.fME.nS(2);
            str4 = b(str5, bUZ);
            nT = this.fME.peek();
            if (nT == 62) {
                this.fME.bVa();
            } else {
                valueOf = String.valueOf(Character.toChars(nT));
                stringBuilder = new StringBuilder();
                stringBuilder.append("expected '>', but found '");
                stringBuilder.append(valueOf);
                stringBuilder.append(str2);
                stringBuilder.append(nT);
                stringBuilder.append(str);
                throw new ScannerException(str3, bUZ, stringBuilder.toString(), this.fME.bUZ());
            }
        } else if (a.fMu.nX(nT)) {
            this.fME.bVa();
        } else {
            int i2 = 1;
            while (a.fMt.nY(nT)) {
                if (nT == 33) {
                    break;
                }
                i2++;
                nT = this.fME.nT(i2);
            }
            i = 0;
            if (i != 0) {
                str4 = a(str5, bUZ);
            } else {
                this.fME.bVa();
            }
            str6 = str4;
            str4 = b(str5, bUZ);
        }
        nT = this.fME.peek();
        if (!a.fMt.nY(nT)) {
            return new s(new t(str6, str4), bUZ, this.fME.bUZ());
        }
        valueOf = String.valueOf(Character.toChars(nT));
        stringBuilder = new StringBuilder();
        stringBuilder.append("expected ' ', but found '");
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        stringBuilder.append(nT);
        stringBuilder.append(str);
        throw new ScannerException(str3, bUZ, stringBuilder.toString(), this.fME.bUZ());
    }

    private Token L(char c) {
        String str;
        int intValue;
        Mark mark;
        Mark mark2;
        Object obj = c == '>' ? 1 : null;
        StringBuilder stringBuilder = new StringBuilder();
        Mark bUZ = this.fME.bUZ();
        this.fME.bVa();
        a j = j(bUZ);
        int bVX = j.bVX();
        k(bUZ);
        int i = this.fJF + 1;
        if (i < 1) {
            i = 1;
        }
        Object[] bVR;
        if (bVX == -1) {
            bVR = bVR();
            str = (String) bVR[0];
            intValue = ((Integer) bVR[1]).intValue();
            mark = (Mark) bVR[2];
            i = Math.max(i, intValue);
        } else {
            i = (i + bVX) - 1;
            bVR = ob(i);
            str = (String) bVR[0];
            mark = (Mark) bVR[1];
        }
        String str2 = "";
        while (this.fME.bUy() == i && this.fME.peek() != 0) {
            stringBuilder.append(str);
            str = " \t";
            Object obj2 = str.indexOf(this.fME.peek()) == -1 ? 1 : null;
            intValue = 0;
            while (a.fMs.nY(this.fME.nT(intValue))) {
                intValue++;
            }
            stringBuilder.append(this.fME.nV(intValue));
            str2 = bVU();
            Object[] ob = ob(i);
            String str3 = (String) ob[0];
            mark2 = (Mark) ob[1];
            if (this.fME.bUy() != i || this.fME.peek() == 0) {
                str = str3;
                break;
            }
            if (obj == null || !"\n".equals(str2) || obj2 == null || str.indexOf(this.fME.peek()) != -1) {
                stringBuilder.append(str2);
            } else if (str3.length() == 0) {
                stringBuilder.append(" ");
            }
            mark = mark2;
            str = str3;
        }
        mark2 = mark;
        if (j.bVV()) {
            stringBuilder.append(str2);
        }
        if (j.bVW()) {
            stringBuilder.append(str);
        }
        return new p(stringBuilder.toString(), false, bUZ, mark2, ScalarStyle.createStyle(Character.valueOf(c)));
    }

    private a j(Mark mark) {
        int peek = this.fME.peek();
        String str = "expected indentation indicator in the range 1-9, but found 0";
        String str2 = "while scanning a block scalar";
        Boolean bool = null;
        int i = -1;
        Boolean bool2;
        if (peek == 45 || peek == 43) {
            if (peek == 43) {
                bool2 = Boolean.TRUE;
            } else {
                bool2 = Boolean.FALSE;
            }
            bool = bool2;
            this.fME.bVa();
            peek = this.fME.peek();
            if (Character.isDigit(peek)) {
                i = Integer.parseInt(String.valueOf(Character.toChars(peek)));
                if (i != 0) {
                    this.fME.bVa();
                } else {
                    throw new ScannerException(str2, mark, str, this.fME.bUZ());
                }
            }
        } else if (Character.isDigit(peek)) {
            i = Integer.parseInt(String.valueOf(Character.toChars(peek)));
            if (i != 0) {
                this.fME.bVa();
                peek = this.fME.peek();
                if (peek == 45 || peek == 43) {
                    if (peek == 43) {
                        bool2 = Boolean.TRUE;
                    } else {
                        bool2 = Boolean.FALSE;
                    }
                    bool = bool2;
                    this.fME.bVa();
                }
            } else {
                throw new ScannerException(str2, mark, str, this.fME.bUZ());
            }
        }
        peek = this.fME.peek();
        if (!a.fMt.nY(peek)) {
            return new a(bool, i);
        }
        str = String.valueOf(Character.toChars(peek));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected chomping or indentation indicators, but found ");
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(peek);
        stringBuilder.append(")");
        throw new ScannerException(str2, mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private String k(Mark mark) {
        while (this.fME.peek() == 32) {
            this.fME.bVa();
        }
        if (this.fME.peek() == 35) {
            while (a.fMs.nY(this.fME.peek())) {
                this.fME.bVa();
            }
        }
        int peek = this.fME.peek();
        String bVU = bVU();
        if (bVU.length() != 0 || peek == 0) {
            return bVU;
        }
        bVU = String.valueOf(Character.toChars(peek));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected a comment or a line break, but found ");
        stringBuilder.append(bVU);
        stringBuilder.append("(");
        stringBuilder.append(peek);
        stringBuilder.append(")");
        throw new ScannerException("while scanning a block scalar", mark, stringBuilder.toString(), this.fME.bUZ());
    }

    private Object[] bVR() {
        StringBuilder stringBuilder = new StringBuilder();
        Mark bUZ = this.fME.bUZ();
        int i = 0;
        while (a.fMq.l(this.fME.peek(), " \r")) {
            if (this.fME.peek() != 32) {
                stringBuilder.append(bVU());
                bUZ = this.fME.bUZ();
            } else {
                this.fME.bVa();
                if (this.fME.bUy() > i) {
                    i = this.fME.bUy();
                }
            }
        }
        return new Object[]{stringBuilder.toString(), Integer.valueOf(i), bUZ};
    }

    private Object[] ob(int i) {
        int bUy;
        StringBuilder stringBuilder = new StringBuilder();
        Mark bUZ = this.fME.bUZ();
        for (bUy = this.fME.bUy(); bUy < i && this.fME.peek() == 32; bUy++) {
            this.fME.bVa();
        }
        while (true) {
            String bVU = bVU();
            if (bVU.length() != 0) {
                stringBuilder.append(bVU);
                bUZ = this.fME.bUZ();
                for (bUy = this.fME.bUy(); bUy < i && this.fME.peek() == 32; bUy++) {
                    this.fME.bVa();
                }
            } else {
                return new Object[]{stringBuilder.toString(), bUZ};
            }
        }
    }

    private Token M(char c) {
        boolean z = c == '\"';
        StringBuilder stringBuilder = new StringBuilder();
        Mark bUZ = this.fME.bUZ();
        int peek = this.fME.peek();
        this.fME.bVa();
        stringBuilder.append(a(z, bUZ));
        while (this.fME.peek() != peek) {
            stringBuilder.append(l(bUZ));
            stringBuilder.append(a(z, bUZ));
        }
        this.fME.bVa();
        return new p(stringBuilder.toString(), false, bUZ, this.fME.bUZ(), ScalarStyle.createStyle(Character.valueOf(c)));
    }

    private String a(boolean z, Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int i = 0;
            while (a.fMu.m(this.fME.nT(i), "'\"\\")) {
                i++;
            }
            if (i != 0) {
                stringBuilder.append(this.fME.nV(i));
            }
            i = this.fME.peek();
            if (!z && i == 39 && this.fME.nT(1) == 39) {
                stringBuilder.append("'");
                this.fME.nS(2);
            } else if ((z && i == 39) || (!z && "\"\\".indexOf(i) != -1)) {
                stringBuilder.appendCodePoint(i);
                this.fME.bVa();
            } else if (z && i == 92) {
                this.fME.bVa();
                i = this.fME.peek();
                if (!Character.isSupplementaryCodePoint(i)) {
                    char c = (char) i;
                    if (fMC.containsKey(Character.valueOf(c))) {
                        stringBuilder.append((String) fMC.get(Character.valueOf(c)));
                        this.fME.bVa();
                    }
                }
                String str = "while scanning a double-quoted scalar";
                if (!Character.isSupplementaryCodePoint(i)) {
                    char c2 = (char) i;
                    if (fMD.containsKey(Character.valueOf(c2))) {
                        i = ((Integer) fMD.get(Character.valueOf(c2))).intValue();
                        this.fME.bVa();
                        String nU = this.fME.nU(i);
                        if (fMB.matcher(nU).find()) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("expected escape sequence of ");
                            stringBuilder.append(i);
                            stringBuilder.append(" hexadecimal numbers, but found: ");
                            stringBuilder.append(nU);
                            throw new ScannerException(str, mark, stringBuilder.toString(), this.fME.bUZ());
                        }
                        stringBuilder.append(new String(Character.toChars(Integer.parseInt(nU, 16))));
                        this.fME.nS(i);
                    }
                }
                if (bVU().length() != 0) {
                    stringBuilder.append(m(mark));
                } else {
                    String valueOf = String.valueOf(Character.toChars(i));
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("found unknown escape character ");
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append("(");
                    stringBuilder2.append(i);
                    stringBuilder2.append(")");
                    throw new ScannerException(str, mark, stringBuilder2.toString(), this.fME.bUZ());
                }
            }
        }
        return stringBuilder.toString();
    }

    private String l(Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            if (" \t".indexOf(this.fME.nT(i)) == -1) {
                break;
            }
            i++;
        }
        String nV = this.fME.nV(i);
        if (this.fME.peek() != 0) {
            String bVU = bVU();
            if (bVU.length() != 0) {
                String m = m(mark);
                if (!"\n".equals(bVU)) {
                    stringBuilder.append(bVU);
                } else if (m.length() == 0) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(m);
            } else {
                stringBuilder.append(nV);
            }
            return stringBuilder.toString();
        }
        throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected end of stream", this.fME.bUZ());
    }

    private String m(Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String nU = this.fME.nU(3);
            if (("---".equals(nU) || "...".equals(nU)) && a.fMu.nX(this.fME.nT(3))) {
                throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected document separator", this.fME.bUZ());
            }
            while (true) {
                if (" \t".indexOf(this.fME.peek()) == -1) {
                    break;
                }
                this.fME.bVa();
            }
            nU = bVU();
            if (nU.length() == 0) {
                return stringBuilder.toString();
            }
            stringBuilder.append(nU);
        }
    }

    private Token bVS() {
        StringBuilder stringBuilder = new StringBuilder();
        Mark bUZ = this.fME.bUZ();
        int i = this.fJF + 1;
        String str = "";
        Mark mark = bUZ;
        String str2 = str;
        while (this.fME.peek() != 35) {
            int i2 = 0;
            while (true) {
                int nT = this.fME.nT(i2);
                if (!a.fMu.nX(nT)) {
                    if (nT == 58) {
                        if (a.fMu.l(this.fME.nT(i2 + 1), this.fMF != 0 ? ",[]{}" : str)) {
                            break;
                        }
                    }
                    if (this.fMF != 0 && ",?[]{}".indexOf(nT) != -1) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i2 != 0) {
                this.fMJ = false;
                stringBuilder.append(str2);
                stringBuilder.append(this.fME.nV(i2));
                mark = this.fME.bUZ();
                str2 = bVT();
                if (str2.length() == 0 || this.fME.peek() == 35 || (this.fMF == 0 && this.fME.bUy() < i)) {
                    break;
                }
            } else {
                break;
            }
        }
        return new p(stringBuilder.toString(), bUZ, mark, true);
    }

    private String bVT() {
        int i = 0;
        while (true) {
            if (this.fME.nT(i) != 32 && this.fME.nT(i) != 9) {
                break;
            }
            i++;
        }
        String nV = this.fME.nV(i);
        String bVU = bVU();
        if (bVU.length() == 0) {
            return nV;
        }
        this.fMJ = true;
        nV = this.fME.nU(3);
        String str = "---";
        String str2 = "";
        if (!str.equals(nV)) {
            String str3 = "...";
            if (!(str3.equals(nV) && a.fMu.nX(this.fME.nT(3)))) {
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    if (this.fME.peek() == 32) {
                        this.fME.bVa();
                    } else {
                        String bVU2 = bVU();
                        if (bVU2.length() != 0) {
                            stringBuilder.append(bVU2);
                            bVU2 = this.fME.nU(3);
                            if (str.equals(bVU2) || (str3.equals(bVU2) && a.fMu.nX(this.fME.nT(3)))) {
                                return str2;
                            }
                        } else if (!"\n".equals(bVU)) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(bVU);
                            stringBuilder2.append(stringBuilder);
                            return stringBuilder2.toString();
                        } else if (stringBuilder.length() == 0) {
                            return " ";
                        } else {
                            return stringBuilder.toString();
                        }
                    }
                }
                return str2;
            }
        }
        return str2;
    }

    private String a(String str, Mark mark) {
        int peek = this.fME.peek();
        String str2 = ")";
        String str3 = "(";
        String str4 = "expected '!', but found ";
        String str5 = "while scanning a ";
        String valueOf;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        if (peek == 33) {
            int i = 1;
            peek = this.fME.nT(1);
            if (peek != 32) {
                int i2 = 1;
                while (a.fMx.nX(peek)) {
                    i2++;
                    peek = this.fME.nT(i2);
                }
                if (peek == 33) {
                    i = 1 + i2;
                } else {
                    this.fME.nS(i2);
                    valueOf = String.valueOf(Character.toChars(peek));
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str5);
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str4);
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(peek);
                    stringBuilder2.append(str2);
                    throw new ScannerException(str, mark, stringBuilder2.toString(), this.fME.bUZ());
                }
            }
            return this.fME.nV(i);
        }
        valueOf = String.valueOf(Character.toChars(peek));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str5);
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str4);
        stringBuilder2.append(valueOf);
        stringBuilder2.append(str3);
        stringBuilder2.append(peek);
        stringBuilder2.append(str2);
        throw new ScannerException(str, mark, stringBuilder2.toString(), this.fME.bUZ());
    }

    private String b(String str, Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        int nT = this.fME.nT(0);
        int i = 0;
        while (a.fMw.nX(nT)) {
            if (nT == 37) {
                stringBuilder.append(this.fME.nV(i));
                stringBuilder.append(c(str, mark));
                i = 0;
            } else {
                i++;
            }
            nT = this.fME.nT(i);
        }
        if (i != 0) {
            stringBuilder.append(this.fME.nV(i));
        }
        if (stringBuilder.length() != 0) {
            return stringBuilder.toString();
        }
        String valueOf = String.valueOf(Character.toChars(nT));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("while scanning a ");
        stringBuilder2.append(str);
        str = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("expected URI, but found ");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("(");
        stringBuilder2.append(nT);
        stringBuilder2.append(")");
        throw new ScannerException(str, mark, stringBuilder2.toString(), this.fME.bUZ());
    }

    private String c(String str, Mark mark) {
        int i = 1;
        while (this.fME.nT(i * 3) == 37) {
            i++;
        }
        Mark bUZ = this.fME.bUZ();
        ByteBuffer allocate = ByteBuffer.allocate(i);
        while (true) {
            String str2 = "while scanning a ";
            if (this.fME.peek() == 37) {
                this.fME.bVa();
                try {
                    allocate.put((byte) Integer.parseInt(this.fME.nU(2), 16));
                    this.fME.nS(2);
                } catch (NumberFormatException unused) {
                    i = this.fME.peek();
                    String valueOf = String.valueOf(Character.toChars(i));
                    int nT = this.fME.nT(1);
                    String valueOf2 = String.valueOf(Character.toChars(nT));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("expected URI escape sequence of 2 hexadecimal numbers, but found ");
                    stringBuilder2.append(valueOf);
                    valueOf = "(";
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(i);
                    stringBuilder2.append(") and ");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(nT);
                    stringBuilder2.append(")");
                    throw new ScannerException(str, mark, stringBuilder2.toString(), this.fME.bUZ());
                }
            }
            allocate.flip();
            try {
                str = org.yaml.snakeyaml.d.c.a(allocate);
                return str;
            } catch (CharacterCodingException e) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str2);
                stringBuilder3.append(str);
                str = stringBuilder3.toString();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("expected URI in UTF-8: ");
                stringBuilder3.append(e.getMessage());
                throw new ScannerException(str, mark, stringBuilder3.toString(), bUZ);
            }
        }
    }

    private String bVU() {
        int peek = this.fME.peek();
        if (peek == 13 || peek == 10 || peek == 133) {
            if (peek == 13 && 10 == this.fME.nT(1)) {
                this.fME.nS(2);
            } else {
                this.fME.bVa();
            }
            return "\n";
        } else if (peek != 8232 && peek != 8233) {
            return "";
        } else {
            this.fME.bVa();
            return String.valueOf(Character.toChars(peek));
        }
    }
}
