package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.p;

public final class JvmProtoBuf {
    public static final e<Class, Integer> foA;
    public static final e<Package, Integer> foB;
    public static final e<Package, List<Property>> foC = GeneratedMessageLite.a(Package.bDh(), Property.bDr(), null, 102, FieldType.MESSAGE, false, Property.class);
    public static final e<Constructor, JvmMethodSignature> foq = GeneratedMessageLite.a(Constructor.bBn(), JvmMethodSignature.bIA(), JvmMethodSignature.bIA(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    /* renamed from: for */
    public static final e<Function, JvmMethodSignature> f26for = GeneratedMessageLite.a(Function.bCL(), JvmMethodSignature.bIA(), JvmMethodSignature.bIA(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    public static final e<Function, Integer> fos;
    public static final e<Property, JvmPropertySignature> fot = GeneratedMessageLite.a(Property.bDr(), JvmPropertySignature.bIK(), JvmPropertySignature.bIK(), null, 100, FieldType.MESSAGE, JvmPropertySignature.class);
    public static final e<Property, Integer> fou;
    public static final e<Type, List<Annotation>> fov = GeneratedMessageLite.a(Type.bEu(), Annotation.bze(), null, 100, FieldType.MESSAGE, false, Annotation.class);
    public static final e<Type, Boolean> fow = GeneratedMessageLite.a(Type.bEu(), Boolean.valueOf(false), null, null, 101, FieldType.BOOL, Boolean.class);
    public static final e<TypeParameter, List<Annotation>> fox = GeneratedMessageLite.a(TypeParameter.bFL(), Annotation.bze(), null, 100, FieldType.MESSAGE, false, Annotation.class);
    public static final e<Class, Integer> foy;
    public static final e<Class, List<Property>> foz = GeneratedMessageLite.a(Class.bAr(), Property.bDr(), null, 102, FieldType.MESSAGE, false, Property.class);

    public interface a extends o {
    }

    public interface b extends o {
    }

    public interface c extends o {
    }

    public interface d extends o {
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements a {
        public static p<JvmFieldSignature> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<JvmFieldSignature>() {
            /* renamed from: ab */
            public JvmFieldSignature b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new JvmFieldSignature(eVar, fVar);
            }
        };
        private static final JvmFieldSignature foD = new JvmFieldSignature(true);
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<JvmFieldSignature, a> implements a {
            private int bitField0_;
            private int desc_;
            private int name_;

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bIv() {
                return new a();
            }

            /* renamed from: bIw */
            public a clone() {
                return bIv().a(bIy());
            }

            /* renamed from: bIp */
            public JvmFieldSignature bzq() {
                return JvmFieldSignature.bIo();
            }

            /* renamed from: bIx */
            public JvmFieldSignature bzG() {
                JvmFieldSignature bIy = bIy();
                if (bIy.isInitialized()) {
                    return bIy;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bIy);
            }

            public JvmFieldSignature bIy() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmFieldSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.desc_;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            /* renamed from: c */
            public a a(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.bIo()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    lK(jvmFieldSignature.bCg());
                }
                if (jvmFieldSignature.bIq()) {
                    lL(jvmFieldSignature.bIr());
                }
                e(bLf().a(jvmFieldSignature.unknownFields));
                return this;
            }

            /* renamed from: ac */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                JvmFieldSignature jvmFieldSignature;
                Throwable th;
                JvmFieldSignature jvmFieldSignature2 = null;
                try {
                    JvmFieldSignature jvmFieldSignature3 = (JvmFieldSignature) JvmFieldSignature.fmO.b(eVar, fVar);
                    if (jvmFieldSignature3 != null) {
                        a(jvmFieldSignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmFieldSignature = (JvmFieldSignature) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    jvmFieldSignature2 = jvmFieldSignature;
                }
                if (jvmFieldSignature2 != null) {
                    a(jvmFieldSignature2);
                }
                throw th;
            }

            public a lK(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public a lL(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static JvmFieldSignature bIo() {
            return foD;
        }

        /* renamed from: bIp */
        public JvmFieldSignature bzq() {
            return foD;
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            bzj();
            OutputStream bKp = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            CodedOutputStream b = CodedOutputStream.b(bKp, 1);
            Object obj = null;
            while (obj == null) {
                try {
                    int bKv = eVar.bKv();
                    if (bKv != 0) {
                        if (bKv == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = eVar.bKy();
                        } else if (bKv == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = eVar.bKy();
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    try {
                        b.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bKp.bKt();
                    }
                    this.unknownFields = bKp.bKt();
                    bLe();
                }
            }
            try {
                b.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bKp.bKt();
            }
            this.unknownFields = bKp.bKt();
            bLe();
        }

        static {
            foD.bzj();
        }

        public p<JvmFieldSignature> bzg() {
            return fmO;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean bIq() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bIr() {
            return this.desc_;
        }

        private void bzj() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.desc_);
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.bl(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.desc_);
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bIs() {
            return a.bIv();
        }

        /* renamed from: bIt */
        public a bzp() {
            return bIs();
        }

        public static a a(JvmFieldSignature jvmFieldSignature) {
            return bIs().a(jvmFieldSignature);
        }

        /* renamed from: bIu */
        public a bzo() {
            return a(this);
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements b {
        public static p<JvmMethodSignature> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<JvmMethodSignature>() {
            /* renamed from: ad */
            public JvmMethodSignature b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new JvmMethodSignature(eVar, fVar);
            }
        };
        private static final JvmMethodSignature foE = new JvmMethodSignature(true);
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<JvmMethodSignature, a> implements b {
            private int bitField0_;
            private int desc_;
            private int name_;

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bIF() {
                return new a();
            }

            /* renamed from: bIG */
            public a clone() {
                return bIF().a(bII());
            }

            /* renamed from: bIB */
            public JvmMethodSignature bzq() {
                return JvmMethodSignature.bIA();
            }

            /* renamed from: bIH */
            public JvmMethodSignature bzG() {
                JvmMethodSignature bII = bII();
                if (bII.isInitialized()) {
                    return bII;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bII);
            }

            public JvmMethodSignature bII() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmMethodSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.desc_;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            /* renamed from: c */
            public a a(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.bIA()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    lM(jvmMethodSignature.bCg());
                }
                if (jvmMethodSignature.bIq()) {
                    lN(jvmMethodSignature.bIr());
                }
                e(bLf().a(jvmMethodSignature.unknownFields));
                return this;
            }

            /* renamed from: ae */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                JvmMethodSignature jvmMethodSignature;
                Throwable th;
                JvmMethodSignature jvmMethodSignature2 = null;
                try {
                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) JvmMethodSignature.fmO.b(eVar, fVar);
                    if (jvmMethodSignature3 != null) {
                        a(jvmMethodSignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmMethodSignature = (JvmMethodSignature) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    jvmMethodSignature2 = jvmMethodSignature;
                }
                if (jvmMethodSignature2 != null) {
                    a(jvmMethodSignature2);
                }
                throw th;
            }

            public a lM(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public a lN(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static JvmMethodSignature bIA() {
            return foE;
        }

        /* renamed from: bIB */
        public JvmMethodSignature bzq() {
            return foE;
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            bzj();
            OutputStream bKp = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            CodedOutputStream b = CodedOutputStream.b(bKp, 1);
            Object obj = null;
            while (obj == null) {
                try {
                    int bKv = eVar.bKv();
                    if (bKv != 0) {
                        if (bKv == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = eVar.bKy();
                        } else if (bKv == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = eVar.bKy();
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    try {
                        b.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bKp.bKt();
                    }
                    this.unknownFields = bKp.bKt();
                    bLe();
                }
            }
            try {
                b.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bKp.bKt();
            }
            this.unknownFields = bKp.bKt();
            bLe();
        }

        static {
            foE.bzj();
        }

        public p<JvmMethodSignature> bzg() {
            return fmO;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean bIq() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bIr() {
            return this.desc_;
        }

        private void bzj() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.desc_);
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.bl(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.desc_);
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bIC() {
            return a.bIF();
        }

        /* renamed from: bID */
        public a bzp() {
            return bIC();
        }

        public static a a(JvmMethodSignature jvmMethodSignature) {
            return bIC().a(jvmMethodSignature);
        }

        /* renamed from: bIE */
        public a bzo() {
            return a(this);
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements c {
        public static p<JvmPropertySignature> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<JvmPropertySignature>() {
            /* renamed from: af */
            public JvmPropertySignature b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new JvmPropertySignature(eVar, fVar);
            }
        };
        private static final JvmPropertySignature foF = new JvmPropertySignature(true);
        private int bitField0_;
        private JvmFieldSignature field_;
        private JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private JvmMethodSignature setter_;
        private JvmMethodSignature syntheticMethod_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<JvmPropertySignature, a> implements c {
            private int bitField0_;
            private JvmFieldSignature field_ = JvmFieldSignature.bIo();
            private JvmMethodSignature getter_ = JvmMethodSignature.bIA();
            private JvmMethodSignature setter_ = JvmMethodSignature.bIA();
            private JvmMethodSignature syntheticMethod_ = JvmMethodSignature.bIA();

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bIX() {
                return new a();
            }

            /* renamed from: bIY */
            public a clone() {
                return bIX().a(bJa());
            }

            /* renamed from: bIL */
            public JvmPropertySignature bzq() {
                return JvmPropertySignature.bIK();
            }

            /* renamed from: bIZ */
            public JvmPropertySignature bzG() {
                JvmPropertySignature bJa = bJa();
                if (bJa.isInitialized()) {
                    return bJa;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bJa);
            }

            public JvmPropertySignature bJa() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmPropertySignature.field_ = this.field_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.syntheticMethod_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.getter_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.setter_;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            /* renamed from: c */
            public a a(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.bIK()) {
                    return this;
                }
                if (jvmPropertySignature.bIM()) {
                    d(jvmPropertySignature.bIN());
                }
                if (jvmPropertySignature.bIO()) {
                    d(jvmPropertySignature.bIP());
                }
                if (jvmPropertySignature.bIQ()) {
                    e(jvmPropertySignature.bIR());
                }
                if (jvmPropertySignature.bIS()) {
                    f(jvmPropertySignature.bIT());
                }
                e(bLf().a(jvmPropertySignature.unknownFields));
                return this;
            }

            /* renamed from: ag */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                JvmPropertySignature jvmPropertySignature;
                Throwable th;
                JvmPropertySignature jvmPropertySignature2 = null;
                try {
                    JvmPropertySignature jvmPropertySignature3 = (JvmPropertySignature) JvmPropertySignature.fmO.b(eVar, fVar);
                    if (jvmPropertySignature3 != null) {
                        a(jvmPropertySignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmPropertySignature = (JvmPropertySignature) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    jvmPropertySignature2 = jvmPropertySignature;
                }
                if (jvmPropertySignature2 != null) {
                    a(jvmPropertySignature2);
                }
                throw th;
            }

            public a d(JvmFieldSignature jvmFieldSignature) {
                if ((this.bitField0_ & 1) != 1 || this.field_ == JvmFieldSignature.bIo()) {
                    this.field_ = jvmFieldSignature;
                } else {
                    this.field_ = JvmFieldSignature.a(this.field_).a(jvmFieldSignature).bIy();
                }
                this.bitField0_ |= 1;
                return this;
            }

            public a d(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 2) != 2 || this.syntheticMethod_ == JvmMethodSignature.bIA()) {
                    this.syntheticMethod_ = jvmMethodSignature;
                } else {
                    this.syntheticMethod_ = JvmMethodSignature.a(this.syntheticMethod_).a(jvmMethodSignature).bII();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public a e(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 4) != 4 || this.getter_ == JvmMethodSignature.bIA()) {
                    this.getter_ = jvmMethodSignature;
                } else {
                    this.getter_ = JvmMethodSignature.a(this.getter_).a(jvmMethodSignature).bII();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public a f(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 8) != 8 || this.setter_ == JvmMethodSignature.bIA()) {
                    this.setter_ = jvmMethodSignature;
                } else {
                    this.setter_ = JvmMethodSignature.a(this.setter_).a(jvmMethodSignature).bII();
                }
                this.bitField0_ |= 8;
                return this;
            }
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static JvmPropertySignature bIK() {
            return foF;
        }

        /* renamed from: bIL */
        public JvmPropertySignature bzq() {
            return foF;
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            bzj();
            OutputStream bKp = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            CodedOutputStream b = CodedOutputStream.b(bKp, 1);
            Object obj = null;
            while (obj == null) {
                try {
                    int bKv = eVar.bKv();
                    if (bKv != 0) {
                        a aVar = null;
                        a bIE;
                        if (bKv == 10) {
                            if ((this.bitField0_ & 1) == 1) {
                                aVar = this.field_.bzo();
                            }
                            this.field_ = (JvmFieldSignature) eVar.a(JvmFieldSignature.fmO, fVar);
                            if (aVar != null) {
                                aVar.a(this.field_);
                                this.field_ = aVar.bIy();
                            }
                            this.bitField0_ |= 1;
                        } else if (bKv == 18) {
                            if ((this.bitField0_ & 2) == 2) {
                                bIE = this.syntheticMethod_.bzo();
                            }
                            this.syntheticMethod_ = (JvmMethodSignature) eVar.a(JvmMethodSignature.fmO, fVar);
                            if (bIE != null) {
                                bIE.a(this.syntheticMethod_);
                                this.syntheticMethod_ = bIE.bII();
                            }
                            this.bitField0_ |= 2;
                        } else if (bKv == 26) {
                            if ((this.bitField0_ & 4) == 4) {
                                bIE = this.getter_.bzo();
                            }
                            this.getter_ = (JvmMethodSignature) eVar.a(JvmMethodSignature.fmO, fVar);
                            if (bIE != null) {
                                bIE.a(this.getter_);
                                this.getter_ = bIE.bII();
                            }
                            this.bitField0_ |= 4;
                        } else if (bKv == 34) {
                            if ((this.bitField0_ & 8) == 8) {
                                bIE = this.setter_.bzo();
                            }
                            this.setter_ = (JvmMethodSignature) eVar.a(JvmMethodSignature.fmO, fVar);
                            if (bIE != null) {
                                bIE.a(this.setter_);
                                this.setter_ = bIE.bII();
                            }
                            this.bitField0_ |= 8;
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    try {
                        b.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bKp.bKt();
                    }
                    this.unknownFields = bKp.bKt();
                    bLe();
                }
            }
            try {
                b.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bKp.bKt();
            }
            this.unknownFields = bKp.bKt();
            bLe();
        }

        static {
            foF.bzj();
        }

        public p<JvmPropertySignature> bzg() {
            return fmO;
        }

        public boolean bIM() {
            return (this.bitField0_ & 1) == 1;
        }

        public JvmFieldSignature bIN() {
            return this.field_;
        }

        public boolean bIO() {
            return (this.bitField0_ & 2) == 2;
        }

        public JvmMethodSignature bIP() {
            return this.syntheticMethod_;
        }

        public boolean bIQ() {
            return (this.bitField0_ & 4) == 4;
        }

        public JvmMethodSignature bIR() {
            return this.getter_;
        }

        public boolean bIS() {
            return (this.bitField0_ & 8) == 8;
        }

        public JvmMethodSignature bIT() {
            return this.setter_;
        }

        private void bzj() {
            this.field_ = JvmFieldSignature.bIo();
            this.syntheticMethod_ = JvmMethodSignature.bIA();
            this.getter_ = JvmMethodSignature.bIA();
            this.setter_ = JvmMethodSignature.bIA();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.b(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.b(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.b(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.b(4, this.setter_);
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.d(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.d(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.d(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.d(4, this.setter_);
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bIU() {
            return a.bIX();
        }

        /* renamed from: bIV */
        public a bzp() {
            return bIU();
        }

        public static a a(JvmPropertySignature jvmPropertySignature) {
            return bIU().a(jvmPropertySignature);
        }

        /* renamed from: bIW */
        public a bzo() {
            return a(this);
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements d {
        public static p<StringTableTypes> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<StringTableTypes>() {
            /* renamed from: ah */
            public StringTableTypes b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new StringTableTypes(eVar, fVar);
            }
        };
        private static final StringTableTypes foG = new StringTableTypes(true);
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public interface b extends o {
        }

        public static final class Record extends GeneratedMessageLite implements b {
            public static p<Record> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Record>() {
                /* renamed from: aj */
                public Record b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    return new Record(eVar, fVar);
                }
            };
            private static final Record foH = new Record(true);
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Operation operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

            public enum Operation implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Operation> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Operation>() {
                        /* renamed from: lQ */
                        public Operation kb(int i) {
                            return Operation.valueOf(i);
                        }
                    };
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i != 1) {
                        return i != 2 ? null : DESC_TO_CLASS_ID;
                    } else {
                        return INTERNAL_TO_CLASS_ID;
                    }
                }

                private Operation(int i, int i2) {
                    this.value = i2;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Record, a> implements b {
                private int bitField0_;
                private Operation operation_ = Operation.NONE;
                private int predefinedIndex_;
                private int range_ = 1;
                private List<Integer> replaceChar_ = Collections.emptyList();
                private Object string_ = "";
                private List<Integer> substringIndex_ = Collections.emptyList();

                private void bzy() {
                }

                public final boolean isInitialized() {
                    return true;
                }

                private a() {
                    bzy();
                }

                private static a bJH() {
                    return new a();
                }

                /* renamed from: bJI */
                public a clone() {
                    return bJH().a(bJK());
                }

                /* renamed from: bJr */
                public Record bzq() {
                    return Record.bJq();
                }

                /* renamed from: bJJ */
                public Record bzG() {
                    Record bJK = bJK();
                    if (bJK.isInitialized()) {
                        return bJK;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bJK);
                }

                public Record bJK() {
                    Record record = new Record((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    record.range_ = this.range_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.predefinedIndex_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.string_;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.operation_;
                    if ((this.bitField0_ & 16) == 16) {
                        this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        this.bitField0_ &= -17;
                    }
                    record.substringIndex_ = this.substringIndex_;
                    if ((this.bitField0_ & 32) == 32) {
                        this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        this.bitField0_ &= -33;
                    }
                    record.replaceChar_ = this.replaceChar_;
                    record.bitField0_ = i2;
                    return record;
                }

                /* renamed from: f */
                public a a(Record record) {
                    if (record == Record.bJq()) {
                        return this;
                    }
                    if (record.bJs()) {
                        lO(record.bJt());
                    }
                    if (record.bJu()) {
                        lP(record.bJv());
                    }
                    if (record.bJw()) {
                        this.bitField0_ |= 4;
                        this.string_ = record.string_;
                    }
                    if (record.bJy()) {
                        a(record.bJz());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.substringIndex_.isEmpty()) {
                            this.substringIndex_ = record.substringIndex_;
                            this.bitField0_ &= -17;
                        } else {
                            bJL();
                            this.substringIndex_.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.replaceChar_.isEmpty()) {
                            this.replaceChar_ = record.replaceChar_;
                            this.bitField0_ &= -33;
                        } else {
                            bJM();
                            this.replaceChar_.addAll(record.replaceChar_);
                        }
                    }
                    e(bLf().a(record.unknownFields));
                    return this;
                }

                /* renamed from: ak */
                public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    Record record;
                    Throwable th;
                    Record record2 = null;
                    try {
                        Record record3 = (Record) Record.fmO.b(eVar, fVar);
                        if (record3 != null) {
                            a(record3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        record = (Record) e.bLo();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        record2 = record;
                    }
                    if (record2 != null) {
                        a(record2);
                    }
                    throw th;
                }

                public a lO(int i) {
                    this.bitField0_ |= 1;
                    this.range_ = i;
                    return this;
                }

                public a lP(int i) {
                    this.bitField0_ |= 2;
                    this.predefinedIndex_ = i;
                    return this;
                }

                public a a(Operation operation) {
                    if (operation != null) {
                        this.bitField0_ |= 8;
                        this.operation_ = operation;
                        return this;
                    }
                    throw new NullPointerException();
                }

                private void bJL() {
                    if ((this.bitField0_ & 16) != 16) {
                        this.substringIndex_ = new ArrayList(this.substringIndex_);
                        this.bitField0_ |= 16;
                    }
                }

                private void bJM() {
                    if ((this.bitField0_ & 32) != 32) {
                        this.replaceChar_ = new ArrayList(this.replaceChar_);
                        this.bitField0_ |= 32;
                    }
                }
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
                super(aVar);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = aVar.bLf();
            }

            private Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
            }

            public static Record bJq() {
                return foH;
            }

            /* renamed from: bJr */
            public Record bzq() {
                return foH;
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                bzj();
                OutputStream bKp = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
                CodedOutputStream b = CodedOutputStream.b(bKp, 1);
                Object obj = null;
                int i = 0;
                while (obj == null) {
                    try {
                        int bKv = eVar.bKv();
                        if (bKv != 0) {
                            if (bKv == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = eVar.bKy();
                            } else if (bKv == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = eVar.bKy();
                            } else if (bKv == 24) {
                                int bKF = eVar.bKF();
                                Operation valueOf = Operation.valueOf(bKF);
                                if (valueOf == null) {
                                    b.K(bKv);
                                    b.K(bKF);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = valueOf;
                                }
                            } else if (bKv == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(Integer.valueOf(eVar.bKy()));
                            } else if (bKv == 34) {
                                bKv = eVar.lV(eVar.bKK());
                                if ((i & 16) != 16 && eVar.bKQ() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                while (eVar.bKQ() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(eVar.bKy()));
                                }
                                eVar.lW(bKv);
                            } else if (bKv == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(Integer.valueOf(eVar.bKy()));
                            } else if (bKv == 42) {
                                bKv = eVar.lV(eVar.bKK());
                                if ((i & 32) != 32 && eVar.bKQ() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                while (eVar.bKQ() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(eVar.bKy()));
                                }
                                eVar.lW(bKv);
                            } else if (bKv == 50) {
                                kotlin.reflect.jvm.internal.impl.protobuf.d bKD = eVar.bKD();
                                this.bitField0_ |= 4;
                                this.string_ = bKD;
                            } else if (a(eVar, b, fVar, bKv)) {
                            }
                        }
                        obj = 1;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.g(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if ((i & 32) == 32) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        }
                        try {
                            b.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = bKp.bKt();
                        }
                        this.unknownFields = bKp.bKt();
                        bLe();
                    }
                }
                if ((i & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                }
                try {
                    b.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = bKp.bKt();
                }
                this.unknownFields = bKp.bKt();
                bLe();
            }

            static {
                foH.bzj();
            }

            public p<Record> bzg() {
                return fmO;
            }

            public boolean bJs() {
                return (this.bitField0_ & 1) == 1;
            }

            public int bJt() {
                return this.range_;
            }

            public boolean bJu() {
                return (this.bitField0_ & 2) == 2;
            }

            public int bJv() {
                return this.predefinedIndex_;
            }

            public boolean bJw() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String bKm = dVar.bKm();
                if (dVar.bKn()) {
                    this.string_ = bKm;
                }
                return bKm;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d bJx() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d mx = kotlin.reflect.jvm.internal.impl.protobuf.d.mx((String) obj);
                this.string_ = mx;
                return mx;
            }

            public boolean bJy() {
                return (this.bitField0_ & 8) == 8;
            }

            public Operation bJz() {
                return this.operation_;
            }

            public List<Integer> bJA() {
                return this.substringIndex_;
            }

            public int bJB() {
                return this.substringIndex_.size();
            }

            public List<Integer> bJC() {
                return this.replaceChar_;
            }

            public int bJD() {
                return this.replaceChar_.size();
            }

            private void bzj() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public void a(CodedOutputStream codedOutputStream) {
                bzk();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.bk(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.bk(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.c(3, this.operation_.getNumber());
                }
                if (bJA().size() > 0) {
                    codedOutputStream.K(34);
                    codedOutputStream.K(this.substringIndexMemoizedSerializedSize);
                }
                int i = 0;
                for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    codedOutputStream.A(((Integer) this.substringIndex_.get(i2)).intValue());
                }
                if (bJC().size() > 0) {
                    codedOutputStream.K(42);
                    codedOutputStream.K(this.replaceCharMemoizedSerializedSize);
                }
                while (i < this.replaceChar_.size()) {
                    codedOutputStream.A(((Integer) this.replaceChar_.get(i)).intValue());
                    i++;
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.a(6, bJx());
                }
                codedOutputStream.d(this.unknownFields);
            }

            public int bzk() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2;
                int i3 = 0;
                i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.range_) + 0 : 0;
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.bl(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.f(3, this.operation_.getNumber());
                }
                int i4 = 0;
                for (i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    i4 += CodedOutputStream.E(((Integer) this.substringIndex_.get(i2)).intValue());
                }
                i += i4;
                if (!bJA().isEmpty()) {
                    i = (i + 1) + CodedOutputStream.E(i4);
                }
                this.substringIndexMemoizedSerializedSize = i4;
                i2 = 0;
                while (i3 < this.replaceChar_.size()) {
                    i2 += CodedOutputStream.E(((Integer) this.replaceChar_.get(i3)).intValue());
                    i3++;
                }
                i += i2;
                if (!bJC().isEmpty()) {
                    i = (i + 1) + CodedOutputStream.E(i2);
                }
                this.replaceCharMemoizedSerializedSize = i2;
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.b(6, bJx());
                }
                i += this.unknownFields.size();
                this.memoizedSerializedSize = i;
                return i;
            }

            public static a bJE() {
                return a.bJH();
            }

            /* renamed from: bJF */
            public a bzp() {
                return bJE();
            }

            public static a a(Record record) {
                return bJE().a(record);
            }

            /* renamed from: bJG */
            public a bzo() {
                return a(this);
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<StringTableTypes, a> implements d {
            private int bitField0_;
            private List<Integer> localName_ = Collections.emptyList();
            private List<Record> record_ = Collections.emptyList();

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bJj() {
                return new a();
            }

            /* renamed from: bJk */
            public a clone() {
                return bJj().a(bJm());
            }

            /* renamed from: bJd */
            public StringTableTypes bzq() {
                return StringTableTypes.bJc();
            }

            /* renamed from: bJl */
            public StringTableTypes bzG() {
                StringTableTypes bJm = bJm();
                if (bJm.isInitialized()) {
                    return bJm;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bJm);
            }

            public StringTableTypes bJm() {
                StringTableTypes stringTableTypes = new StringTableTypes((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                if ((this.bitField0_ & 1) == 1) {
                    this.record_ = Collections.unmodifiableList(this.record_);
                    this.bitField0_ &= -2;
                }
                stringTableTypes.record_ = this.record_;
                if ((this.bitField0_ & 2) == 2) {
                    this.localName_ = Collections.unmodifiableList(this.localName_);
                    this.bitField0_ &= -3;
                }
                stringTableTypes.localName_ = this.localName_;
                return stringTableTypes;
            }

            /* renamed from: e */
            public a a(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.bJc()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.record_.isEmpty()) {
                        this.record_ = stringTableTypes.record_;
                        this.bitField0_ &= -2;
                    } else {
                        bJn();
                        this.record_.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.localName_.isEmpty()) {
                        this.localName_ = stringTableTypes.localName_;
                        this.bitField0_ &= -3;
                    } else {
                        bJo();
                        this.localName_.addAll(stringTableTypes.localName_);
                    }
                }
                e(bLf().a(stringTableTypes.unknownFields));
                return this;
            }

            /* renamed from: ai */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                StringTableTypes stringTableTypes;
                Throwable th;
                StringTableTypes stringTableTypes2 = null;
                try {
                    StringTableTypes stringTableTypes3 = (StringTableTypes) StringTableTypes.fmO.b(eVar, fVar);
                    if (stringTableTypes3 != null) {
                        a(stringTableTypes3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTableTypes = (StringTableTypes) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    stringTableTypes2 = stringTableTypes;
                }
                if (stringTableTypes2 != null) {
                    a(stringTableTypes2);
                }
                throw th;
            }

            private void bJn() {
                if ((this.bitField0_ & 1) != 1) {
                    this.record_ = new ArrayList(this.record_);
                    this.bitField0_ |= 1;
                }
            }

            private void bJo() {
                if ((this.bitField0_ & 2) != 2) {
                    this.localName_ = new ArrayList(this.localName_);
                    this.bitField0_ |= 2;
                }
            }
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static StringTableTypes bJc() {
            return foG;
        }

        /* renamed from: bJd */
        public StringTableTypes bzq() {
            return foG;
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            bzj();
            OutputStream bKp = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            CodedOutputStream b = CodedOutputStream.b(bKp, 1);
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int bKv = eVar.bKv();
                    if (bKv != 0) {
                        if (bKv == 10) {
                            if ((i & 1) != 1) {
                                this.record_ = new ArrayList();
                                i |= 1;
                            }
                            this.record_.add(eVar.a(Record.fmO, fVar));
                        } else if (bKv == 40) {
                            if ((i & 2) != 2) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            this.localName_.add(Integer.valueOf(eVar.bKy()));
                        } else if (bKv == 42) {
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 2) != 2 && eVar.bKQ() > 0) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            while (eVar.bKQ() > 0) {
                                this.localName_.add(Integer.valueOf(eVar.bKy()));
                            }
                            eVar.lW(bKv);
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if ((i & 2) == 2) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
                    }
                    try {
                        b.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bKp.bKt();
                    }
                    this.unknownFields = bKp.bKt();
                    bLe();
                }
            }
            if ((i & 1) == 1) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if ((i & 2) == 2) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
            }
            try {
                b.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bKp.bKt();
            }
            this.unknownFields = bKp.bKt();
            bLe();
        }

        static {
            foG.bzj();
        }

        public p<StringTableTypes> bzg() {
            return fmO;
        }

        public List<Record> bJe() {
            return this.record_;
        }

        public List<Integer> bJf() {
            return this.localName_;
        }

        private void bzj() {
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            int i = 0;
            for (int i2 = 0; i2 < this.record_.size(); i2++) {
                codedOutputStream.b(1, (n) this.record_.get(i2));
            }
            if (bJf().size() > 0) {
                codedOutputStream.K(42);
                codedOutputStream.K(this.localNameMemoizedSerializedSize);
            }
            while (i < this.localName_.size()) {
                codedOutputStream.A(((Integer) this.localName_.get(i)).intValue());
                i++;
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3 = 0;
            for (i2 = 0; i2 < this.record_.size(); i2++) {
                i3 += CodedOutputStream.d(1, (n) this.record_.get(i2));
            }
            i2 = 0;
            for (i = 0; i < this.localName_.size(); i++) {
                i2 += CodedOutputStream.E(((Integer) this.localName_.get(i)).intValue());
            }
            i3 += i2;
            if (!bJf().isEmpty()) {
                i3 = (i3 + 1) + CodedOutputStream.E(i2);
            }
            this.localNameMemoizedSerializedSize = i2;
            i3 += this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static StringTableTypes e(InputStream inputStream, f fVar) {
            return (StringTableTypes) fmO.j(inputStream, fVar);
        }

        public static a bJg() {
            return a.bJj();
        }

        /* renamed from: bJh */
        public a bzp() {
            return bJg();
        }

        public static a a(StringTableTypes stringTableTypes) {
            return bJg().a(stringTableTypes);
        }

        /* renamed from: bJi */
        public a bzo() {
            return a(this);
        }
    }

    public static void a(f fVar) {
        fVar.a(foq);
        fVar.a(f26for);
        fVar.a(fos);
        fVar.a(fot);
        fVar.a(fou);
        fVar.a(fov);
        fVar.a(fow);
        fVar.a(fox);
        fVar.a(foy);
        fVar.a(foz);
        fVar.a(foA);
        fVar.a(foB);
        fVar.a(foC);
    }

    static {
        n bCL = Function.bCL();
        Integer valueOf = Integer.valueOf(0);
        fos = GeneratedMessageLite.a(bCL, (Object) valueOf, null, null, 101, FieldType.INT32, Integer.class);
        fou = GeneratedMessageLite.a(Property.bDr(), (Object) valueOf, null, null, 101, FieldType.INT32, Integer.class);
        foy = GeneratedMessageLite.a(Class.bAr(), (Object) valueOf, null, null, 101, FieldType.INT32, Integer.class);
        Object obj = valueOf;
        foA = GeneratedMessageLite.a(Class.bAr(), obj, null, null, 103, FieldType.INT32, Integer.class);
        foB = GeneratedMessageLite.a(Package.bDh(), obj, null, null, 101, FieldType.INT32, Integer.class);
    }
}
