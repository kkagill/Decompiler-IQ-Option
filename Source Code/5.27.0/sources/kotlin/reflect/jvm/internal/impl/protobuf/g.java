package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType;

/* compiled from: FieldSet */
final class g<FieldDescriptorType extends a<FieldDescriptorType>> {
    private static final g fqc = new g(true);
    private final s<FieldDescriptorType, Object> fpZ = s.ml(16);
    private boolean fqa;
    private boolean fqb = false;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        kotlin.reflect.jvm.internal.impl.protobuf.n.a a(kotlin.reflect.jvm.internal.impl.protobuf.n.a aVar, n nVar);

        FieldType bLa();

        JavaType bLb();

        boolean bLc();

        boolean bLd();

        int getNumber();
    }

    private g() {
    }

    private g(boolean z) {
        bKY();
    }

    public static <T extends a<T>> g<T> bKW() {
        return new g();
    }

    public static <T extends a<T>> g<T> bKX() {
        return fqc;
    }

    public void bKY() {
        if (!this.fqa) {
            this.fpZ.bKY();
            this.fqa = true;
        }
    }

    /* renamed from: bKZ */
    public g<FieldDescriptorType> clone() {
        Entry mm;
        g bKW = bKW();
        for (int i = 0; i < this.fpZ.bLF(); i++) {
            mm = this.fpZ.mm(i);
            bKW.a((a) mm.getKey(), mm.getValue());
        }
        for (Entry mm2 : this.fpZ.bLG()) {
            bKW.a((a) mm2.getKey(), mm2.getValue());
        }
        bKW.fqb = this.fqb;
        return bKW;
    }

    public Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        if (this.fqb) {
            return new b(this.fpZ.entrySet().iterator());
        }
        return this.fpZ.entrySet().iterator();
    }

    public boolean a(FieldDescriptorType fieldDescriptorType) {
        if (!fieldDescriptorType.bLc()) {
            return this.fpZ.get(fieldDescriptorType) != null;
        } else {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
    }

    public Object b(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.fpZ.get(fieldDescriptorType);
        return obj instanceof i ? ((i) obj).bLy() : obj;
    }

    public void a(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.bLc()) {
            a(fieldDescriptorType.bLa(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object a : arrayList) {
                a(fieldDescriptorType.bLa(), a);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof i) {
            this.fqb = true;
        }
        this.fpZ.put((Comparable) fieldDescriptorType, obj);
    }

    public int c(FieldDescriptorType fieldDescriptorType) {
        if (fieldDescriptorType.bLc()) {
            Object b = b(fieldDescriptorType);
            if (b == null) {
                return 0;
            }
            return ((List) b).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public Object a(FieldDescriptorType fieldDescriptorType, int i) {
        if (fieldDescriptorType.bLc()) {
            Object b = b(fieldDescriptorType);
            if (b != null) {
                return ((List) b).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void b(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.bLc()) {
            List arrayList;
            a(fieldDescriptorType.bLa(), obj);
            Object b = b(fieldDescriptorType);
            if (b == null) {
                arrayList = new ArrayList();
                this.fpZ.put((Comparable) fieldDescriptorType, (Object) arrayList);
            } else {
                arrayList = (List) b;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i) == false) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:7:0x001c, code skipped:
            r1 = true;
     */
    /* JADX WARNING: Missing block: B:11:0x0024, code skipped:
            if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a) == false) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            if ((r3 instanceof byte[]) == false) goto L_0x0041;
     */
    private static void a(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
        if (r3 == 0) goto L_0x004c;
    L_0x0002:
        r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.AnonymousClass1.fqd;
        r2 = r2.getJavaType();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x003f;
            case 2: goto L_0x003c;
            case 3: goto L_0x0039;
            case 4: goto L_0x0036;
            case 5: goto L_0x0033;
            case 6: goto L_0x0030;
            case 7: goto L_0x0027;
            case 8: goto L_0x001e;
            case 9: goto L_0x0014;
            default: goto L_0x0013;
        };
    L_0x0013:
        goto L_0x0041;
    L_0x0014:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n;
        if (r2 != 0) goto L_0x001c;
    L_0x0018:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i;
        if (r2 == 0) goto L_0x0041;
    L_0x001c:
        r1 = 1;
        goto L_0x0041;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x001c;
    L_0x0022:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a;
        if (r2 == 0) goto L_0x0041;
    L_0x0026:
        goto L_0x001c;
    L_0x0027:
        r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d;
        if (r2 != 0) goto L_0x001c;
    L_0x002b:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0041;
    L_0x002f:
        goto L_0x001c;
    L_0x0030:
        r1 = r3 instanceof java.lang.String;
        goto L_0x0041;
    L_0x0033:
        r1 = r3 instanceof java.lang.Boolean;
        goto L_0x0041;
    L_0x0036:
        r1 = r3 instanceof java.lang.Double;
        goto L_0x0041;
    L_0x0039:
        r1 = r3 instanceof java.lang.Float;
        goto L_0x0041;
    L_0x003c:
        r1 = r3 instanceof java.lang.Long;
        goto L_0x0041;
    L_0x003f:
        r1 = r3 instanceof java.lang.Integer;
    L_0x0041:
        if (r1 == 0) goto L_0x0044;
    L_0x0043:
        return;
    L_0x0044:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x004c:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        goto L_0x0053;
    L_0x0052:
        throw r2;
    L_0x0053:
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.a(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fpZ.bLF(); i++) {
            if (!l(this.fpZ.mm(i))) {
                return false;
            }
        }
        for (Entry l : this.fpZ.bLG()) {
            if (!l(l)) {
                return false;
            }
        }
        return true;
    }

    private boolean l(Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.bLb() == JavaType.MESSAGE) {
            if (aVar.bLc()) {
                for (n isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof n) {
                if (!((n) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof i) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    static int a(FieldType fieldType, boolean z) {
        return z ? 2 : fieldType.getWireType();
    }

    public void a(g<FieldDescriptorType> gVar) {
        for (int i = 0; i < gVar.fpZ.bLF(); i++) {
            m(gVar.fpZ.mm(i));
        }
        for (Entry m : gVar.fpZ.bLG()) {
            m(m);
        }
    }

    private Object dJ(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void m(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof i) {
            value = ((i) value).bLy();
        }
        Object b;
        if (comparable.bLc()) {
            b = b(comparable);
            if (b == null) {
                b = new ArrayList();
            }
            for (Object dJ : (List) value) {
                ((List) b).add(dJ(dJ));
            }
            this.fpZ.put(comparable, b);
        } else if (comparable.bLb() == JavaType.MESSAGE) {
            b = b(comparable);
            if (b == null) {
                this.fpZ.put(comparable, dJ(value));
                return;
            }
            this.fpZ.put(comparable, comparable.a(((n) b).bzo(), (n) value).bzG());
        } else {
            this.fpZ.put(comparable, dJ(value));
        }
    }

    public static Object a(e eVar, FieldType fieldType, boolean z) {
        switch (fieldType) {
            case DOUBLE:
                return Double.valueOf(eVar.readDouble());
            case FLOAT:
                return Float.valueOf(eVar.readFloat());
            case INT64:
                return Long.valueOf(eVar.bKx());
            case UINT64:
                return Long.valueOf(eVar.bKw());
            case INT32:
                return Integer.valueOf(eVar.bKy());
            case FIXED64:
                return Long.valueOf(eVar.bKz());
            case FIXED32:
                return Integer.valueOf(eVar.bKA());
            case BOOL:
                return Boolean.valueOf(eVar.bKB());
            case STRING:
                if (z) {
                    return eVar.bKC();
                }
                return eVar.readString();
            case BYTES:
                return eVar.bKD();
            case UINT32:
                return Integer.valueOf(eVar.bKE());
            case SFIXED32:
                return Integer.valueOf(eVar.bKG());
            case SFIXED64:
                return Long.valueOf(eVar.bKH());
            case SINT32:
                return Integer.valueOf(eVar.bKI());
            case SINT64:
                return Long.valueOf(eVar.bKJ());
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void a(CodedOutputStream codedOutputStream, FieldType fieldType, int i, Object obj) {
        if (fieldType == FieldType.GROUP) {
            codedOutputStream.a(i, (n) obj);
            return;
        }
        codedOutputStream.h(i, a(fieldType, false));
        a(codedOutputStream, fieldType, obj);
    }

    private static void a(CodedOutputStream codedOutputStream, FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                codedOutputStream.V(((Double) obj).doubleValue());
                return;
            case FLOAT:
                codedOutputStream.l(((Float) obj).floatValue());
                return;
            case INT64:
                codedOutputStream.dg(((Long) obj).longValue());
                return;
            case UINT64:
                codedOutputStream.j(((Long) obj).longValue());
                return;
            case INT32:
                codedOutputStream.A(((Integer) obj).intValue());
                return;
            case FIXED64:
                codedOutputStream.dh(((Long) obj).longValue());
                return;
            case FIXED32:
                codedOutputStream.me(((Integer) obj).intValue());
                return;
            case BOOL:
                codedOutputStream.x(((Boolean) obj).booleanValue());
                return;
            case STRING:
                codedOutputStream.my((String) obj);
                return;
            case BYTES:
                if (obj instanceof d) {
                    codedOutputStream.b((d) obj);
                    return;
                } else {
                    codedOutputStream.ab((byte[]) obj);
                    return;
                }
            case UINT32:
                codedOutputStream.B(((Integer) obj).intValue());
                return;
            case SFIXED32:
                codedOutputStream.mf(((Integer) obj).intValue());
                return;
            case SFIXED64:
                codedOutputStream.di(((Long) obj).longValue());
                return;
            case SINT32:
                codedOutputStream.D(((Integer) obj).intValue());
                return;
            case SINT64:
                codedOutputStream.dj(((Long) obj).longValue());
                return;
            case GROUP:
                codedOutputStream.c((n) obj);
                return;
            case MESSAGE:
                codedOutputStream.d((n) obj);
                return;
            case ENUM:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a) {
                    codedOutputStream.C(((kotlin.reflect.jvm.internal.impl.protobuf.h.a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.C(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void a(a<?> aVar, Object obj, CodedOutputStream codedOutputStream) {
        FieldType bLa = aVar.bLa();
        int number = aVar.getNumber();
        if (aVar.bLc()) {
            List<Object> list = (List) obj;
            if (aVar.bLd()) {
                codedOutputStream.h(number, 2);
                int i = 0;
                for (Object b : list) {
                    i += b(bLa, b);
                }
                codedOutputStream.K(i);
                for (Object obj2 : list) {
                    a(codedOutputStream, bLa, obj2);
                }
                return;
            }
            for (Object obj22 : list) {
                a(codedOutputStream, bLa, number, obj22);
            }
        } else if (obj22 instanceof i) {
            a(codedOutputStream, bLa, number, ((i) obj22).bLy());
        } else {
            a(codedOutputStream, bLa, number, obj22);
        }
    }

    public int bzk() {
        Entry mm;
        int i = 0;
        for (int i2 = 0; i2 < this.fpZ.bLF(); i2++) {
            mm = this.fpZ.mm(i2);
            i += c((a) mm.getKey(), mm.getValue());
        }
        for (Entry mm2 : this.fpZ.bLG()) {
            i += c((a) mm2.getKey(), mm2.getValue());
        }
        return i;
    }

    private static int a(FieldType fieldType, int i, Object obj) {
        i = CodedOutputStream.J(i);
        if (fieldType == FieldType.GROUP) {
            i *= 2;
        }
        return i + b(fieldType, obj);
    }

    private static int b(FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                return CodedOutputStream.W(((Double) obj).doubleValue());
            case FLOAT:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case INT64:
                return CodedOutputStream.dk(((Long) obj).longValue());
            case UINT64:
                return CodedOutputStream.k(((Long) obj).longValue());
            case INT32:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case FIXED64:
                return CodedOutputStream.dl(((Long) obj).longValue());
            case FIXED32:
                return CodedOutputStream.mg(((Integer) obj).intValue());
            case BOOL:
                return CodedOutputStream.y(((Boolean) obj).booleanValue());
            case STRING:
                return CodedOutputStream.mz((String) obj);
            case BYTES:
                if (obj instanceof d) {
                    return CodedOutputStream.c((d) obj);
                }
                return CodedOutputStream.ac((byte[]) obj);
            case UINT32:
                return CodedOutputStream.F(((Integer) obj).intValue());
            case SFIXED32:
                return CodedOutputStream.mh(((Integer) obj).intValue());
            case SFIXED64:
                return CodedOutputStream.dm(((Long) obj).longValue());
            case SINT32:
                return CodedOutputStream.H(((Integer) obj).intValue());
            case SINT64:
                return CodedOutputStream.dn(((Long) obj).longValue());
            case GROUP:
                return CodedOutputStream.e((n) obj);
            case MESSAGE:
                if (obj instanceof i) {
                    return CodedOutputStream.a((i) obj);
                }
                return CodedOutputStream.f((n) obj);
            case ENUM:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.h.a) {
                    return CodedOutputStream.G(((kotlin.reflect.jvm.internal.impl.protobuf.h.a) obj).getNumber());
                }
                return CodedOutputStream.G(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(a<?> aVar, Object obj) {
        FieldType bLa = aVar.bLa();
        int number = aVar.getNumber();
        if (!aVar.bLc()) {
            return a(bLa, number, obj);
        }
        int i = 0;
        if (aVar.bLd()) {
            for (Object obj2 : (List) obj2) {
                i += b(bLa, obj2);
            }
            return (CodedOutputStream.J(number) + i) + CodedOutputStream.L(i);
        }
        for (Object obj22 : (List) obj22) {
            i += a(bLa, number, obj22);
        }
        return i;
    }
}
