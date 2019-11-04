package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType;

public abstract class GeneratedMessageLite extends a implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fqd = new int[JavaType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values();
            r0 = r0.length;
            r0 = new int[r0];
            fqd = r0;
            r0 = fqd;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fqd;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$AnonymousClass1.<clinit>():void");
        }
    }

    public static class e<ContainingType extends n, Type> {
        final Type defaultValue;
        final ContainingType fqo;
        final n fqp;
        final d fqq;
        final Class fqr;
        final Method fqs;

        e(ContainingType containingType, Type type, n nVar, d dVar, Class cls) {
            if (containingType == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.bLa() == FieldType.MESSAGE && nVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.fqo = containingType;
                this.defaultValue = type;
                this.fqp = nVar;
                this.fqq = dVar;
                this.fqr = cls;
                if (kotlin.reflect.jvm.internal.impl.protobuf.h.a.class.isAssignableFrom(cls)) {
                    this.fqs = GeneratedMessageLite.b(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.fqs = null;
            }
        }

        public ContainingType bLm() {
            return this.fqo;
        }

        public int getNumber() {
            return this.fqq.getNumber();
        }

        public n bLn() {
            return this.fqp;
        }

        /* Access modifiers changed, original: 0000 */
        public Object dK(Object obj) {
            if (!this.fqq.bLc()) {
                return dL(obj);
            }
            if (this.fqq.bLb() != JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object dL : (List) obj) {
                arrayList.add(dL(dL));
            }
            return arrayList;
        }

        /* Access modifiers changed, original: 0000 */
        public Object dL(Object obj) {
            if (this.fqq.bLb() != JavaType.ENUM) {
                return obj;
            }
            return GeneratedMessageLite.b(this.fqs, null, (Integer) obj);
        }

        /* Access modifiers changed, original: 0000 */
        public Object dM(Object obj) {
            return this.fqq.bLb() == JavaType.ENUM ? Integer.valueOf(((kotlin.reflect.jvm.internal.impl.protobuf.h.a) obj).getNumber()) : obj;
        }
    }

    public interface c extends o {
    }

    static final class d implements kotlin.reflect.jvm.internal.impl.protobuf.g.a<d> {
        final kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> fqk;
        final FieldType fql;
        final boolean fqm;
        final boolean fqn;
        final int number;

        d(kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> bVar, int i, FieldType fieldType, boolean z, boolean z2) {
            this.fqk = bVar;
            this.number = i;
            this.fql = fieldType;
            this.fqm = z;
            this.fqn = z2;
        }

        public int getNumber() {
            return this.number;
        }

        public FieldType bLa() {
            return this.fql;
        }

        public JavaType bLb() {
            return this.fql.getJavaType();
        }

        public boolean bLc() {
            return this.fqm;
        }

        public boolean bLd() {
            return this.fqn;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> bLl() {
            return this.fqk;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.n.a a(kotlin.reflect.jvm.internal.impl.protobuf.n.a aVar, n nVar) {
            return ((a) aVar).a((GeneratedMessageLite) nVar);
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.number - dVar.number;
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite, BuilderType extends a> extends kotlin.reflect.jvm.internal.impl.protobuf.a.a<BuilderType> {
        private d unknownFields = d.fpH;

        public abstract BuilderType a(MessageType messageType);

        /* renamed from: bzD */
        public abstract MessageType bzq();

        protected a() {
        }

        /* renamed from: bzE */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final d bLf() {
            return this.unknownFields;
        }

        public final BuilderType e(d dVar) {
            this.unknownFields = dVar;
            return this;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements c<MessageType> {
        private final g<d> extensions;

        protected class a {
            private final Iterator<Entry<d, Object>> fqg;
            private Entry<d, Object> fqh;
            private final boolean fqi;

            /* synthetic */ a(ExtendableMessage extendableMessage, boolean z, AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private a(boolean z) {
                this.fqg = ExtendableMessage.this.extensions.iterator();
                if (this.fqg.hasNext()) {
                    this.fqh = (Entry) this.fqg.next();
                }
                this.fqi = z;
            }

            public void b(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Entry entry = this.fqh;
                    if (entry != null && ((d) entry.getKey()).getNumber() < i) {
                        kotlin.reflect.jvm.internal.impl.protobuf.g.a aVar = (d) this.fqh.getKey();
                        if (this.fqi && aVar.bLb() == JavaType.MESSAGE && !aVar.bLc()) {
                            codedOutputStream.c(aVar.getNumber(), (n) this.fqh.getValue());
                        } else {
                            g.a(aVar, this.fqh.getValue(), codedOutputStream);
                        }
                        if (this.fqg.hasNext()) {
                            this.fqh = (Entry) this.fqg.next();
                        } else {
                            this.fqh = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        protected ExtendableMessage() {
            this.extensions = g.bKW();
        }

        protected ExtendableMessage(b<MessageType, ?> bVar) {
            this.extensions = bVar.bLh();
        }

        private void b(e<MessageType, ?> eVar) {
            if (eVar.bLm() != bzq()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> boolean c(e<MessageType, Type> eVar) {
            b((e) eVar);
            return this.extensions.a(eVar.fqq);
        }

        public final <Type> int d(e<MessageType, List<Type>> eVar) {
            b((e) eVar);
            return this.extensions.c(eVar.fqq);
        }

        public final <Type> Type e(e<MessageType, Type> eVar) {
            b((e) eVar);
            Object b = this.extensions.b(eVar.fqq);
            if (b == null) {
                return eVar.defaultValue;
            }
            return eVar.dK(b);
        }

        public final <Type> Type a(e<MessageType, List<Type>> eVar, int i) {
            b((e) eVar);
            return eVar.dL(this.extensions.a(eVar.fqq, i));
        }

        /* Access modifiers changed, original: protected */
        public boolean bLi() {
            return this.extensions.isInitialized();
        }

        /* Access modifiers changed, original: protected */
        public boolean a(e eVar, CodedOutputStream codedOutputStream, f fVar, int i) {
            return GeneratedMessageLite.a(this.extensions, bzq(), eVar, codedOutputStream, fVar, i);
        }

        /* Access modifiers changed, original: protected */
        public void bLe() {
            this.extensions.bKY();
        }

        /* Access modifiers changed, original: protected */
        public a bLj() {
            return new a(this, false, null);
        }

        /* Access modifiers changed, original: protected */
        public int bLk() {
            return this.extensions.bzk();
        }
    }

    public static abstract class b<MessageType extends ExtendableMessage<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements c<MessageType> {
        private g<d> extensions = g.bKX();
        private boolean fqf;

        protected b() {
        }

        private void bLg() {
            if (!this.fqf) {
                this.extensions = this.extensions.clone();
                this.fqf = true;
            }
        }

        private g<d> bLh() {
            this.extensions.bKY();
            this.fqf = false;
            return this.extensions;
        }

        /* renamed from: bBl */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* Access modifiers changed, original: protected */
        public boolean bLi() {
            return this.extensions.isInitialized();
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(MessageType messageType) {
            bLg();
            this.extensions.a(messageType.extensions);
        }
    }

    /* Access modifiers changed, original: protected */
    public void bLe() {
    }

    protected GeneratedMessageLite() {
    }

    protected GeneratedMessageLite(a aVar) {
    }

    public p<? extends n> bzg() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* Access modifiers changed, original: protected */
    public boolean a(e eVar, CodedOutputStream codedOutputStream, f fVar, int i) {
        return eVar.a(i, codedOutputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    private static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.n> boolean a(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.d> r4, MessageType r5, kotlin.reflect.jvm.internal.impl.protobuf.e r6, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.f r8, int r9) {
        /*
        r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.mp(r9);
        r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.mq(r9);
        r5 = r8.a(r5, r1);
        r1 = 0;
        r2 = 1;
        if (r5 != 0) goto L_0x0013;
    L_0x0010:
        r0 = 1;
    L_0x0011:
        r3 = 0;
        goto L_0x003f;
    L_0x0013:
        r3 = r5.fqq;
        r3 = r3.bLa();
        r3 = kotlin.reflect.jvm.internal.impl.protobuf.g.a(r3, r1);
        if (r0 != r3) goto L_0x0021;
    L_0x001f:
        r0 = 0;
        goto L_0x0011;
    L_0x0021:
        r3 = r5.fqq;
        r3 = r3.fqm;
        if (r3 == 0) goto L_0x0010;
    L_0x0027:
        r3 = r5.fqq;
        r3 = r3.fql;
        r3 = r3.isPackable();
        if (r3 == 0) goto L_0x0010;
    L_0x0031:
        r3 = r5.fqq;
        r3 = r3.bLa();
        r3 = kotlin.reflect.jvm.internal.impl.protobuf.g.a(r3, r2);
        if (r0 != r3) goto L_0x0010;
    L_0x003d:
        r0 = 0;
        r3 = 1;
    L_0x003f:
        if (r0 == 0) goto L_0x0046;
    L_0x0041:
        r4 = r6.a(r9, r7);
        return r4;
    L_0x0046:
        if (r3 == 0) goto L_0x0096;
    L_0x0048:
        r7 = r6.bKK();
        r7 = r6.lV(r7);
        r8 = r5.fqq;
        r8 = r8.bLa();
        r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM;
        if (r8 != r9) goto L_0x007b;
    L_0x005a:
        r8 = r6.bKQ();
        if (r8 <= 0) goto L_0x0091;
    L_0x0060:
        r8 = r6.bKF();
        r9 = r5.fqq;
        r9 = r9.bLl();
        r8 = r9.kb(r8);
        if (r8 != 0) goto L_0x0071;
    L_0x0070:
        return r2;
    L_0x0071:
        r9 = r5.fqq;
        r8 = r5.dM(r8);
        r4.b(r9, r8);
        goto L_0x005a;
    L_0x007b:
        r8 = r6.bKQ();
        if (r8 <= 0) goto L_0x0091;
    L_0x0081:
        r8 = r5.fqq;
        r8 = r8.bLa();
        r8 = kotlin.reflect.jvm.internal.impl.protobuf.g.a(r6, r8, r1);
        r9 = r5.fqq;
        r4.b(r9, r8);
        goto L_0x007b;
    L_0x0091:
        r6.lW(r7);
        goto L_0x0122;
    L_0x0096:
        r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AnonymousClass1.fqd;
        r3 = r5.fqq;
        r3 = r3.bLb();
        r3 = r3.ordinal();
        r0 = r0[r3];
        if (r0 == r2) goto L_0x00cd;
    L_0x00a6:
        r8 = 2;
        if (r0 == r8) goto L_0x00b4;
    L_0x00a9:
        r7 = r5.fqq;
        r7 = r7.bLa();
        r6 = kotlin.reflect.jvm.internal.impl.protobuf.g.a(r6, r7, r1);
        goto L_0x0107;
    L_0x00b4:
        r6 = r6.bKF();
        r8 = r5.fqq;
        r8 = r8.bLl();
        r8 = r8.kb(r6);
        if (r8 != 0) goto L_0x00cb;
    L_0x00c4:
        r7.K(r9);
        r7.B(r6);
        return r2;
    L_0x00cb:
        r6 = r8;
        goto L_0x0107;
    L_0x00cd:
        r7 = 0;
        r9 = r5.fqq;
        r9 = r9.bLc();
        if (r9 != 0) goto L_0x00e4;
    L_0x00d6:
        r9 = r5.fqq;
        r9 = r4.b(r9);
        r9 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r9;
        if (r9 == 0) goto L_0x00e4;
    L_0x00e0:
        r7 = r9.bzo();
    L_0x00e4:
        if (r7 != 0) goto L_0x00ee;
    L_0x00e6:
        r7 = r5.bLn();
        r7 = r7.bzp();
    L_0x00ee:
        r9 = r5.fqq;
        r9 = r9.bLa();
        r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP;
        if (r9 != r0) goto L_0x0100;
    L_0x00f8:
        r9 = r5.getNumber();
        r6.a(r9, r7, r8);
        goto L_0x0103;
    L_0x0100:
        r6.a(r7, r8);
    L_0x0103:
        r6 = r7.bzG();
    L_0x0107:
        r7 = r5.fqq;
        r7 = r7.bLc();
        if (r7 == 0) goto L_0x0119;
    L_0x010f:
        r7 = r5.fqq;
        r5 = r5.dM(r6);
        r4.b(r7, r5);
        goto L_0x0122;
    L_0x0119:
        r7 = r5.fqq;
        r5 = r5.dM(r6);
        r4.a(r7, r5);
    L_0x0122:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    public static <ContainingType extends n, Type> e<ContainingType, Type> a(ContainingType containingType, Type type, n nVar, kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> bVar, int i, FieldType fieldType, Class cls) {
        return new e(containingType, type, nVar, new d(bVar, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends n, Type> e<ContainingType, Type> a(ContainingType containingType, n nVar, kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> bVar, int i, FieldType fieldType, boolean z, Class cls) {
        return new e(containingType, Collections.emptyList(), nVar, new d(bVar, i, fieldType, true, z), cls);
    }

    static Method b(Class cls, String str, Class... clsArr) {
        try {
            cls = cls.getMethod(str, clsArr);
            return cls;
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            str = String.valueOf(String.valueOf(str));
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 45) + str.length());
            stringBuilder.append("Generated message class \"");
            stringBuilder.append(valueOf);
            stringBuilder.append("\" missing method \"");
            stringBuilder.append(str);
            stringBuilder.append("\".");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    static Object b(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}
