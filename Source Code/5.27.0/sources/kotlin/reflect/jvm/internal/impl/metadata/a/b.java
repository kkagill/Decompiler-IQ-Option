package kotlin.reflect.jvm.internal.impl.metadata.a;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;

/* compiled from: Flags */
public class b {
    public static final c<MemberKind> fnA = c.a(fns, MemberKind.values());
    public static final a fnB = c.a(fnA);
    public static final a fnC = c.a(fnB);
    public static final a fnD = c.a(fnC);
    public static final a fnE = c.a(fnD);
    public static final a fnF = c.a(fnE);
    public static final a fnG = c.a(fnF);
    public static final a fnH = c.a(fnG);
    public static final a fnI = c.a(fnA);
    public static final a fnJ = c.a(fnI);
    public static final a fnK = c.a(fnJ);
    public static final a fnL = c.a(fnK);
    public static final a fnM = c.a(fnL);
    public static final a fnN = c.a(fnM);
    public static final a fnO = c.a(fnN);
    public static final a fnP = c.a(fnO);
    public static final a fnQ = c.a(fnP);
    public static final a fnR = c.a(fnq);
    public static final a fnS = c.a(fnR);
    public static final a fnT = c.a(fnS);
    public static final a fnU = c.a(fns);
    public static final a fnV = c.a(fnU);
    public static final a fnW = c.a(fnV);
    public static final a fnX = c.bHo();
    public static final a fnY = c.a(fnX);
    public static final a fnZ = c.bHo();
    public static final a fnp = c.bHo();
    public static final a fnq = c.bHo();
    public static final c<Visibility> fnr = c.a(fnq, Visibility.values());
    public static final c<Modality> fns = c.a(fnr, Modality.values());
    public static final c<Kind> fnt = c.a(fns, Kind.values());
    public static final a fnu = c.a(fnt);
    public static final a fnv = c.a(fnu);
    public static final a fnw = c.a(fnv);
    public static final a fnx = c.a(fnw);
    public static final a fny = c.a(fnx);
    public static final a fnz = c.a(fnr);

    /* compiled from: Flags */
    public static abstract class c<E> {
        public final int fob;
        public final int offset;

        public abstract int dI(E e);

        public abstract E get(int i);

        public static <E extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> c<E> a(c<?> cVar, E[] eArr) {
            return new b(cVar.offset + cVar.fob, eArr);
        }

        public static a bHo() {
            return new a(0);
        }

        public static a a(c<?> cVar) {
            return new a(cVar.offset + cVar.fob);
        }

        private c(int i, int i2) {
            this.offset = i;
            this.fob = i2;
        }
    }

    /* compiled from: Flags */
    public static class a extends c<Boolean> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        public a(int i) {
            super(i, 1);
        }

        /* renamed from: lB */
        public Boolean get(int i) {
            boolean z = true;
            if ((i & (1 << this.offset)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null) {
                $$$reportNull$$$0(0);
            }
            return valueOf;
        }

        /* renamed from: y */
        public int dI(Boolean bool) {
            return bool.booleanValue() ? 1 << this.offset : 0;
        }
    }

    /* compiled from: Flags */
    private static class b<E extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> extends c<E> {
        private final E[] foa;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        public b(int i, E[] eArr) {
            super(i, S(eArr));
            this.foa = eArr;
        }

        private static <E> int S(E[] eArr) {
            if (eArr == null) {
                $$$reportNull$$$0(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Empty enum: ");
            stringBuilder.append(eArr.getClass());
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: lC */
        public E get(int i) {
            i = (i & (((1 << this.fob) - 1) << this.offset)) >> this.offset;
            for (kotlin.reflect.jvm.internal.impl.protobuf.h.a aVar : this.foa) {
                if (aVar.getNumber() == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public int dI(E e) {
            return e.getNumber() << this.offset;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    private static /* synthetic */ void $$$reportNull$$$0(int r5) {
        /*
        r0 = 3;
        r0 = new java.lang.Object[r0];
        r1 = 1;
        r2 = 0;
        r3 = 2;
        if (r5 == r1) goto L_0x002c;
    L_0x0008:
        if (r5 == r3) goto L_0x0027;
    L_0x000a:
        r4 = 5;
        if (r5 == r4) goto L_0x002c;
    L_0x000d:
        r4 = 6;
        if (r5 == r4) goto L_0x0022;
    L_0x0010:
        r4 = 8;
        if (r5 == r4) goto L_0x002c;
    L_0x0014:
        r4 = 9;
        if (r5 == r4) goto L_0x0022;
    L_0x0018:
        r4 = 11;
        if (r5 == r4) goto L_0x002c;
    L_0x001c:
        r4 = "visibility";
        r0[r2] = r4;
        goto L_0x0030;
    L_0x0022:
        r4 = "memberKind";
        r0[r2] = r4;
        goto L_0x0030;
    L_0x0027:
        r4 = "kind";
        r0[r2] = r4;
        goto L_0x0030;
    L_0x002c:
        r4 = "modality";
        r0[r2] = r4;
    L_0x0030:
        r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        r0[r1] = r2;
        switch(r5) {
            case 3: goto L_0x004b;
            case 4: goto L_0x0046;
            case 5: goto L_0x0046;
            case 6: goto L_0x0046;
            case 7: goto L_0x0041;
            case 8: goto L_0x0041;
            case 9: goto L_0x0041;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            default: goto L_0x0037;
        };
    L_0x0037:
        r5 = "getClassFlags";
        r0[r3] = r5;
        goto L_0x004f;
    L_0x003c:
        r5 = "getAccessorFlags";
        r0[r3] = r5;
        goto L_0x004f;
    L_0x0041:
        r5 = "getPropertyFlags";
        r0[r3] = r5;
        goto L_0x004f;
    L_0x0046:
        r5 = "getFunctionFlags";
        r0[r3] = r5;
        goto L_0x004f;
    L_0x004b:
        r5 = "getConstructorFlags";
        r0[r3] = r5;
    L_0x004f:
        r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        r5 = java.lang.String.format(r5, r0);
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.$$$reportNull$$$0(int):void");
    }

    public static int a(boolean z, Visibility visibility, Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (modality == null) {
            $$$reportNull$$$0(11);
        }
        return ((((fnq.dI(Boolean.valueOf(z)) | fns.dI(modality)) | fnr.dI(visibility)) | fnU.dI(Boolean.valueOf(z2))) | fnV.dI(Boolean.valueOf(z3))) | fnW.dI(Boolean.valueOf(z4));
    }
}
