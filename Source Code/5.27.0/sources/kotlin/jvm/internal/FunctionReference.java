package kotlin.jvm.internal;

import kotlin.reflect.a;
import kotlin.reflect.e;

public class FunctionReference extends CallableReference implements h, e {
    private final int arity;

    public FunctionReference(int i) {
        this.arity = i;
    }

    public FunctionReference(int i, Object obj) {
        super(obj);
        this.arity = i;
    }

    public int bnH() {
        return this.arity;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bnI */
    public e bnz() {
        return (e) super.bnz();
    }

    /* Access modifiers changed, original: protected */
    public a bnw() {
        return k.a(this);
    }

    /* JADX WARNING: Missing block: B:16:0x004e, code skipped:
            if (kotlin.jvm.internal.i.y(bnx(), r5.bnx()) != false) goto L_0x0052;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof kotlin.jvm.internal.FunctionReference;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (kotlin.jvm.internal.FunctionReference) r5;
        r1 = r4.RW();
        if (r1 != 0) goto L_0x0018;
    L_0x0011:
        r1 = r5.RW();
        if (r1 != 0) goto L_0x0051;
    L_0x0017:
        goto L_0x0026;
    L_0x0018:
        r1 = r4.RW();
        r3 = r5.RW();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0026:
        r1 = r4.getName();
        r3 = r5.getName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0034:
        r1 = r4.RX();
        r3 = r5.RX();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0042:
        r1 = r4.bnx();
        r5 = r5.bnx();
        r5 = kotlin.jvm.internal.i.y(r1, r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        r0 = r5 instanceof kotlin.reflect.e;
        if (r0 == 0) goto L_0x0060;
    L_0x0057:
        r0 = r4.bny();
        r5 = r5.equals(r0);
        return r5;
    L_0x0060:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.FunctionReference.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((RW() == null ? 0 : RW().hashCode() * 31) + getName().hashCode()) * 31) + RX().hashCode();
    }

    public String toString() {
        FunctionReference bny = bny();
        if (bny != this) {
            return bny.toString();
        }
        String str;
        if ("<init>".equals(getName())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("function ");
            stringBuilder.append(getName());
            stringBuilder.append(" (Kotlin reflection is not available)");
            str = stringBuilder.toString();
        }
        return str;
    }
}
