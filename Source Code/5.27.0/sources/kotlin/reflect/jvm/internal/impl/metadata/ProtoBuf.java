package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class ProtoBuf {

    public enum MemberKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);
        
        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<MemberKind> internalValueMap;
        private final int value;

        static {
            internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<MemberKind>() {
                /* renamed from: kG */
                public MemberKind kb(int i) {
                    return MemberKind.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i != 2) {
                return i != 3 ? null : SYNTHESIZED;
            } else {
                return DELEGATION;
            }
        }

        private MemberKind(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Modality implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);
        
        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Modality> internalValueMap;
        private final int value;

        static {
            internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Modality>() {
                /* renamed from: kH */
                public Modality kb(int i) {
                    return Modality.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i != 2) {
                return i != 3 ? null : SEALED;
            } else {
                return ABSTRACT;
            }
        }

        private Modality(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Visibility implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);
        
        private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Visibility> internalValueMap;
        private final int value;

        static {
            internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Visibility>() {
                /* renamed from: lA */
                public Visibility kb(int i) {
                    return Visibility.valueOf(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i != 4) {
                return i != 5 ? null : LOCAL;
            } else {
                return PRIVATE_TO_THIS;
            }
        }

        private Visibility(int i, int i2) {
            this.value = i2;
        }
    }

    public interface a extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface d extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface e extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface g extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface k extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface l extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface p extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface r extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface s extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    public interface b extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface c extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface f extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface h extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface i extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface j extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface m extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface n extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface o extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public interface q extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c {
    }

    public static final class Annotation extends GeneratedMessageLite implements a {
        private static final Annotation fmN = new Annotation(true);
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Annotation> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Annotation>() {
            /* renamed from: a */
            public Annotation b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Annotation(eVar, fVar);
            }
        };
        private List<Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public interface a extends kotlin.reflect.jvm.internal.impl.protobuf.o {
        }

        public static final class Argument extends GeneratedMessageLite implements a {
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Argument>() {
                /* renamed from: c */
                public Argument b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new Argument(eVar, fVar);
                }
            };
            private static final Argument fmP = new Argument(true);
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
            private Value value_;

            public interface b extends kotlin.reflect.jvm.internal.impl.protobuf.o {
            }

            public static final class Value extends GeneratedMessageLite implements b {
                public static kotlin.reflect.jvm.internal.impl.protobuf.p<Value> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Value>() {
                    /* renamed from: g */
                    public Value b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                        return new Value(eVar, fVar);
                    }
                };
                private static final Value fmQ = new Value(true);
                private Annotation annotation_;
                private int arrayDimensionCount_;
                private List<Value> arrayElement_;
                private int bitField0_;
                private int classId_;
                private double doubleValue_;
                private int enumValueId_;
                private int flags_;
                private float floatValue_;
                private long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int stringValue_;
                private Type type_;
                private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

                public enum Type implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);
                    
                    private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Type> internalValueMap;
                    private final int value;

                    static {
                        internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Type>() {
                            /* renamed from: ka */
                            public Type kb(int i) {
                                return Type.valueOf(i);
                            }
                        };
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    private Type(int i, int i2) {
                        this.value = i2;
                    }
                }

                public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Value, a> implements b {
                    private Annotation annotation_ = Annotation.bze();
                    private int arrayDimensionCount_;
                    private List<Value> arrayElement_ = Collections.emptyList();
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private int flags_;
                    private float floatValue_;
                    private long intValue_;
                    private int stringValue_;
                    private Type type_ = Type.BYTE;

                    private void bzy() {
                    }

                    private a() {
                        bzy();
                    }

                    private static a bAf() {
                        return new a();
                    }

                    /* renamed from: bAg */
                    public a clone() {
                        return bAf().a(bAi());
                    }

                    /* renamed from: bzJ */
                    public Value bzq() {
                        return Value.bzI();
                    }

                    /* renamed from: bAh */
                    public Value bzG() {
                        Value bAi = bAi();
                        if (bAi.isInitialized()) {
                            return bAi;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bAi);
                    }

                    public Value bAi() {
                        Value value = new Value((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        value.type_ = this.type_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.intValue_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.floatValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.doubleValue_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.stringValue_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.classId_;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.enumValueId_;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.annotation_ = this.annotation_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        value.arrayElement_ = this.arrayElement_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.flags_ = this.flags_;
                        value.bitField0_ = i2;
                        return value;
                    }

                    /* renamed from: e */
                    public a a(Value value) {
                        if (value == Value.bzI()) {
                            return this;
                        }
                        if (value.hasType()) {
                            a(value.bzK());
                        }
                        if (value.bzL()) {
                            de(value.bzM());
                        }
                        if (value.bzN()) {
                            ax(value.aU());
                        }
                        if (value.bzO()) {
                            U(value.OF());
                        }
                        if (value.bzP()) {
                            jV(value.bzQ());
                        }
                        if (value.bzR()) {
                            jW(value.bzS());
                        }
                        if (value.bzT()) {
                            jX(value.bzU());
                        }
                        if (value.bzV()) {
                            d(value.bzW());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                bAj();
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.bzZ()) {
                            jY(value.bAa());
                        }
                        if (value.bAb()) {
                            jZ(value.getFlags());
                        }
                        e(bLf().a(value.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (bzV() && !bzW().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < bzY(); i++) {
                            if (!jU(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* renamed from: h */
                    public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                        Value value;
                        Throwable th;
                        Value value2 = null;
                        try {
                            Value value3 = (Value) Value.fmO.b(eVar, fVar);
                            if (value3 != null) {
                                a(value3);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            value = (Value) e.bLo();
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            value2 = value;
                        }
                        if (value2 != null) {
                            a(value2);
                        }
                        throw th;
                    }

                    public a a(Type type) {
                        if (type != null) {
                            this.bitField0_ |= 1;
                            this.type_ = type;
                            return this;
                        }
                        throw new NullPointerException();
                    }

                    public a de(long j) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j;
                        return this;
                    }

                    public a ax(float f) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f;
                        return this;
                    }

                    public a U(double d) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d;
                        return this;
                    }

                    public a jV(int i) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i;
                        return this;
                    }

                    public a jW(int i) {
                        this.bitField0_ |= 32;
                        this.classId_ = i;
                        return this;
                    }

                    public a jX(int i) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i;
                        return this;
                    }

                    public boolean bzV() {
                        return (this.bitField0_ & 128) == 128;
                    }

                    public Annotation bzW() {
                        return this.annotation_;
                    }

                    public a d(Annotation annotation) {
                        if ((this.bitField0_ & 128) != 128 || this.annotation_ == Annotation.bze()) {
                            this.annotation_ = annotation;
                        } else {
                            this.annotation_ = Annotation.a(this.annotation_).a(annotation).bAo();
                        }
                        this.bitField0_ |= 128;
                        return this;
                    }

                    private void bAj() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.arrayElement_ = new ArrayList(this.arrayElement_);
                            this.bitField0_ |= 256;
                        }
                    }

                    public int bzY() {
                        return this.arrayElement_.size();
                    }

                    public Value jU(int i) {
                        return (Value) this.arrayElement_.get(i);
                    }

                    public a jY(int i) {
                        this.bitField0_ |= 512;
                        this.arrayDimensionCount_ = i;
                        return this;
                    }

                    public a jZ(int i) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i;
                        return this;
                    }
                }

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
                    super(aVar);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = aVar.bLf();
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
                }

                public static Value bzI() {
                    return fmQ;
                }

                /* renamed from: bzJ */
                public Value bzq() {
                    return fmQ;
                }

                private Value(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            switch (bKv) {
                                case 0:
                                    obj = 1;
                                    break;
                                case 8:
                                    int bKF = eVar.bKF();
                                    Type valueOf = Type.valueOf(bKF);
                                    if (valueOf != null) {
                                        this.bitField0_ |= 1;
                                        this.type_ = valueOf;
                                        break;
                                    }
                                    b.K(bKv);
                                    b.K(bKF);
                                    break;
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.intValue_ = eVar.bKJ();
                                    break;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = eVar.readFloat();
                                    break;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = eVar.readDouble();
                                    break;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = eVar.bKy();
                                    break;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = eVar.bKy();
                                    break;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = eVar.bKy();
                                    break;
                                case 66:
                                    b bVar = null;
                                    if ((this.bitField0_ & 128) == 128) {
                                        bVar = this.annotation_.bzo();
                                    }
                                    this.annotation_ = (Annotation) eVar.a(Annotation.fmO, fVar);
                                    if (bVar != null) {
                                        bVar.a(this.annotation_);
                                        this.annotation_ = bVar.bAo();
                                    }
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    if ((i & 256) != 256) {
                                        this.arrayElement_ = new ArrayList();
                                        i |= 256;
                                    }
                                    this.arrayElement_.add(eVar.a(fmO, fVar));
                                    break;
                                case 80:
                                    this.bitField0_ |= 512;
                                    this.flags_ = eVar.bKy();
                                    break;
                                case 88:
                                    this.bitField0_ |= 256;
                                    this.arrayDimensionCount_ = eVar.bKy();
                                    break;
                                default:
                                    if (a(eVar, b, fVar, bKv)) {
                                        break;
                                    }
                                    obj = 1;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                        } catch (Throwable th) {
                            if ((i & 256) == 256) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                    if ((i & 256) == 256) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                    fmQ.bzj();
                }

                public kotlin.reflect.jvm.internal.impl.protobuf.p<Value> bzg() {
                    return fmO;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                public Type bzK() {
                    return this.type_;
                }

                public boolean bzL() {
                    return (this.bitField0_ & 2) == 2;
                }

                public long bzM() {
                    return this.intValue_;
                }

                public boolean bzN() {
                    return (this.bitField0_ & 4) == 4;
                }

                public float aU() {
                    return this.floatValue_;
                }

                public boolean bzO() {
                    return (this.bitField0_ & 8) == 8;
                }

                public double OF() {
                    return this.doubleValue_;
                }

                public boolean bzP() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int bzQ() {
                    return this.stringValue_;
                }

                public boolean bzR() {
                    return (this.bitField0_ & 32) == 32;
                }

                public int bzS() {
                    return this.classId_;
                }

                public boolean bzT() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int bzU() {
                    return this.enumValueId_;
                }

                public boolean bzV() {
                    return (this.bitField0_ & 128) == 128;
                }

                public Annotation bzW() {
                    return this.annotation_;
                }

                public List<Value> bzX() {
                    return this.arrayElement_;
                }

                public int bzY() {
                    return this.arrayElement_.size();
                }

                public Value jU(int i) {
                    return (Value) this.arrayElement_.get(i);
                }

                public boolean bzZ() {
                    return (this.bitField0_ & 256) == 256;
                }

                public int bAa() {
                    return this.arrayDimensionCount_;
                }

                public boolean bAb() {
                    return (this.bitField0_ & 512) == 512;
                }

                public int getFlags() {
                    return this.flags_;
                }

                private void bzj() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.bze();
                    this.arrayElement_ = Collections.emptyList();
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!bzV() || bzW().isInitialized()) {
                        int i = 0;
                        while (i < bzY()) {
                            if (jU(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void a(CodedOutputStream codedOutputStream) {
                    bzk();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.c(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.y(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.a(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.e(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.bk(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.bk(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.bk(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.b(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.b(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.bk(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.bk(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.d(this.unknownFields);
                }

                public int bzk() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.f(1, this.type_.getNumber()) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.z(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.b(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.f(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.bl(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.bl(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i += CodedOutputStream.bl(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        i += CodedOutputStream.d(8, this.annotation_);
                    }
                    while (i2 < this.arrayElement_.size()) {
                        i += CodedOutputStream.d(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.arrayElement_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        i += CodedOutputStream.bl(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        i += CodedOutputStream.bl(11, this.arrayDimensionCount_);
                    }
                    i += this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static a bAc() {
                    return a.bAf();
                }

                /* renamed from: bAd */
                public a bzp() {
                    return bAc();
                }

                public static a b(Value value) {
                    return bAc().a(value);
                }

                /* renamed from: bAe */
                public a bzo() {
                    return b(this);
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Argument, a> implements a {
                private int bitField0_;
                private int nameId_;
                private Value value_ = Value.bzI();

                private void bzy() {
                }

                private a() {
                    bzy();
                }

                private static a bzz() {
                    return new a();
                }

                /* renamed from: bzA */
                public a clone() {
                    return bzz().a(bzC());
                }

                /* renamed from: bzs */
                public Argument bzq() {
                    return Argument.bzr();
                }

                /* renamed from: bzB */
                public Argument bzG() {
                    Argument bzC = bzC();
                    if (bzC.isInitialized()) {
                        return bzC;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bzC);
                }

                public Argument bzC() {
                    Argument argument = new Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                /* renamed from: c */
                public a a(Argument argument) {
                    if (argument == Argument.bzr()) {
                        return this;
                    }
                    if (argument.bzt()) {
                        jT(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        a(argument.bzu());
                    }
                    e(bLf().a(argument.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    if (bzt() && hasValue() && bzu().isInitialized()) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: d */
                public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    Argument argument;
                    Throwable th;
                    Argument argument2 = null;
                    try {
                        Argument argument3 = (Argument) Argument.fmO.b(eVar, fVar);
                        if (argument3 != null) {
                            a(argument3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.bLo();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        a(argument2);
                    }
                    throw th;
                }

                public boolean bzt() {
                    return (this.bitField0_ & 1) == 1;
                }

                public a jT(int i) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i;
                    return this;
                }

                public boolean hasValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Value bzu() {
                    return this.value_;
                }

                public a a(Value value) {
                    if ((this.bitField0_ & 2) != 2 || this.value_ == Value.bzI()) {
                        this.value_ = value;
                    } else {
                        this.value_ = Value.b(this.value_).a(value).bAi();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
                super(aVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = aVar.bLf();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
            }

            public static Argument bzr() {
                return fmP;
            }

            /* renamed from: bzs */
            public Argument bzq() {
                return fmP;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.nameId_ = eVar.bKy();
                            } else if (bKv == 18) {
                                a aVar = null;
                                if ((this.bitField0_ & 2) == 2) {
                                    aVar = this.value_.bzo();
                                }
                                this.value_ = (Value) eVar.a(Value.fmO, fVar);
                                if (aVar != null) {
                                    aVar.a(this.value_);
                                    this.value_ = aVar.bAi();
                                }
                                this.bitField0_ |= 2;
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
                fmP.bzj();
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> bzg() {
                return fmO;
            }

            public boolean bzt() {
                return (this.bitField0_ & 1) == 1;
            }

            public int getNameId() {
                return this.nameId_;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            public Value bzu() {
                return this.value_;
            }

            private void bzj() {
                this.nameId_ = 0;
                this.value_ = Value.bzI();
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                if (!bzt()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (bzu().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }

            public void a(CodedOutputStream codedOutputStream) {
                bzk();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.bk(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.b(2, this.value_);
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
                    i = 0 + CodedOutputStream.bl(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.d(2, this.value_);
                }
                i += this.unknownFields.size();
                this.memoizedSerializedSize = i;
                return i;
            }

            public static a bzv() {
                return a.bzz();
            }

            /* renamed from: bzw */
            public a bzp() {
                return bzv();
            }

            public static a a(Argument argument) {
                return bzv().a(argument);
            }

            /* renamed from: bzx */
            public a bzo() {
                return a(this);
            }
        }

        public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Annotation, b> implements a {
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int id_;

            private void bzy() {
            }

            private b() {
                bzy();
            }

            private static b bAl() {
                return new b();
            }

            /* renamed from: bAm */
            public b clone() {
                return bAl().a(bAo());
            }

            /* renamed from: bzf */
            public Annotation bzq() {
                return Annotation.bze();
            }

            /* renamed from: bAn */
            public Annotation bzG() {
                Annotation bAo = bAo();
                if (bAo.isInitialized()) {
                    return bAo;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bAo);
            }

            public Annotation bAo() {
                Annotation annotation = new Annotation((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                annotation.id_ = this.id_;
                if ((this.bitField0_ & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                annotation.argument_ = this.argument_;
                annotation.bitField0_ = i;
                return annotation;
            }

            /* renamed from: e */
            public b a(Annotation annotation) {
                if (annotation == Annotation.bze()) {
                    return this;
                }
                if (annotation.hasId()) {
                    kc(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        bAp();
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                e(bLf().a(annotation.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < bzi(); i++) {
                    if (!jS(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: i */
            public b f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Annotation annotation;
                Throwable th;
                Annotation annotation2 = null;
                try {
                    Annotation annotation3 = (Annotation) Annotation.fmO.b(eVar, fVar);
                    if (annotation3 != null) {
                        a(annotation3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    annotation = (Annotation) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    annotation2 = annotation;
                }
                if (annotation2 != null) {
                    a(annotation2);
                }
                throw th;
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public b kc(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            private void bAp() {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
            }

            public int bzi() {
                return this.argument_.size();
            }

            public Argument jS(int i) {
                return (Argument) this.argument_.get(i);
            }
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Annotation bze() {
            return fmN;
        }

        /* renamed from: bzf */
        public Annotation bzq() {
            return fmN;
        }

        private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            this.id_ = eVar.bKy();
                        } else if (bKv == 18) {
                            if ((i & 2) != 2) {
                                this.argument_ = new ArrayList();
                                i |= 2;
                            }
                            this.argument_.add(eVar.a(Argument.fmO, fVar));
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
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
            if ((i & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
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
            fmN.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Annotation> bzg() {
            return fmO;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getId() {
            return this.id_;
        }

        public List<Argument> bzh() {
            return this.argument_;
        }

        public int bzi() {
            return this.argument_.size();
        }

        public Argument jS(int i) {
            return (Argument) this.argument_.get(i);
        }

        private void bzj() {
            this.id_ = 0;
            this.argument_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (hasId()) {
                int i = 0;
                while (i < bzi()) {
                    if (jS(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.b(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.argument_.get(i));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.id_) + 0 : 0;
            while (i2 < this.argument_.size()) {
                i += CodedOutputStream.d(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.argument_.get(i2));
                i2++;
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static b bzl() {
            return b.bAl();
        }

        /* renamed from: bzm */
        public b bzp() {
            return bzl();
        }

        public static b a(Annotation annotation) {
            return bzl().a(annotation);
        }

        /* renamed from: bzn */
        public b bzo() {
            return a(this);
        }
    }

    public static final class Contract extends GeneratedMessageLite implements d {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Contract> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Contract>() {
            /* renamed from: n */
            public Contract b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Contract(eVar, fVar);
            }
        };
        private static final Contract fmT = new Contract(true);
        private List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Contract, a> implements d {
            private int bitField0_;
            private List<Effect> effect_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bBG() {
                return new a();
            }

            /* renamed from: bBH */
            public a clone() {
                return bBG().a(bBJ());
            }

            /* renamed from: bBB */
            public Contract bzq() {
                return Contract.bBA();
            }

            /* renamed from: bBI */
            public Contract bzG() {
                Contract bBJ = bBJ();
                if (bBJ.isInitialized()) {
                    return bBJ;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bBJ);
            }

            public Contract bBJ() {
                Contract contract = new Contract((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                contract.effect_ = this.effect_;
                return contract;
            }

            /* renamed from: d */
            public a a(Contract contract) {
                if (contract == Contract.bBA()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        bBK();
                        this.effect_.addAll(contract.effect_);
                    }
                }
                e(bLf().a(contract.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bBC(); i++) {
                    if (!kq(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: o */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Contract contract;
                Throwable th;
                Contract contract2 = null;
                try {
                    Contract contract3 = (Contract) Contract.fmO.b(eVar, fVar);
                    if (contract3 != null) {
                        a(contract3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    contract = (Contract) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    contract2 = contract;
                }
                if (contract2 != null) {
                    a(contract2);
                }
                throw th;
            }

            private void bBK() {
                if ((this.bitField0_ & 1) != 1) {
                    this.effect_ = new ArrayList(this.effect_);
                    this.bitField0_ |= 1;
                }
            }

            public int bBC() {
                return this.effect_.size();
            }

            public Effect kq(int i) {
                return (Effect) this.effect_.get(i);
            }
        }

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Contract bBA() {
            return fmT;
        }

        /* renamed from: bBB */
        public Contract bzq() {
            return fmT;
        }

        private Contract(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.effect_ = new ArrayList();
                                i |= 1;
                            }
                            this.effect_.add(eVar.a(Effect.fmO, fVar));
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
                        this.effect_ = Collections.unmodifiableList(this.effect_);
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
                this.effect_ = Collections.unmodifiableList(this.effect_);
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
            fmT.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Contract> bzg() {
            return fmO;
        }

        public int bBC() {
            return this.effect_.size();
        }

        public Effect kq(int i) {
            return (Effect) this.effect_.get(i);
        }

        private void bzj() {
            this.effect_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bBC()) {
                if (kq(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.b(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.effect_.get(i));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.effect_.size(); i++) {
                i2 += CodedOutputStream.d(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.effect_.get(i));
            }
            i2 += this.unknownFields.size();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public static a bBD() {
            return a.bBG();
        }

        /* renamed from: bBE */
        public a bzp() {
            return bBD();
        }

        public static a a(Contract contract) {
            return bBD().a(contract);
        }

        /* renamed from: bBF */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Effect extends GeneratedMessageLite implements e {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Effect> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Effect>() {
            /* renamed from: p */
            public Effect b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Effect(eVar, fVar);
            }
        };
        private static final Effect fmU = new Effect(true);
        private int bitField0_;
        private Expression conclusionOfConditionalEffect_;
        private List<Expression> effectConstructorArgument_;
        private EffectType effectType_;
        private InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public enum EffectType implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<EffectType> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<EffectType>() {
                    /* renamed from: ks */
                    public EffectType kb(int i) {
                        return EffectType.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i != 1) {
                    return i != 2 ? null : RETURNS_NOT_NULL;
                } else {
                    return CALLS;
                }
            }

            private EffectType(int i, int i2) {
                this.value = i2;
            }
        }

        public enum InvocationKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<InvocationKind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<InvocationKind>() {
                    /* renamed from: kt */
                    public InvocationKind kb(int i) {
                        return InvocationKind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i != 1) {
                    return i != 2 ? null : AT_LEAST_ONCE;
                } else {
                    return EXACTLY_ONCE;
                }
            }

            private InvocationKind(int i, int i2) {
                this.value = i2;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Effect, a> implements e {
            private int bitField0_;
            private Expression conclusionOfConditionalEffect_ = Expression.bCp();
            private List<Expression> effectConstructorArgument_ = Collections.emptyList();
            private EffectType effectType_ = EffectType.RETURNS_CONSTANT;
            private InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bBY() {
                return new a();
            }

            /* renamed from: bBZ */
            public a clone() {
                return bBY().a(bCb());
            }

            /* renamed from: bBN */
            public Effect bzq() {
                return Effect.bBM();
            }

            /* renamed from: bCa */
            public Effect bzG() {
                Effect bCb = bCb();
                if (bCb.isInitialized()) {
                    return bCb;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bCb);
            }

            public Effect bCb() {
                Effect effect = new Effect((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                effect.effectType_ = this.effectType_;
                if ((this.bitField0_ & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.kind_;
                effect.bitField0_ = i2;
                return effect;
            }

            /* renamed from: d */
            public a a(Effect effect) {
                if (effect == Effect.bBM()) {
                    return this;
                }
                if (effect.bBO()) {
                    a(effect.bBP());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        bCc();
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.bBR()) {
                    a(effect.bBS());
                }
                if (effect.bBT()) {
                    a(effect.bBU());
                }
                e(bLf().a(effect.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bBQ(); i++) {
                    if (!kr(i).isInitialized()) {
                        return false;
                    }
                }
                if (!bBR() || bBS().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* renamed from: q */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Effect effect;
                Throwable th;
                Effect effect2 = null;
                try {
                    Effect effect3 = (Effect) Effect.fmO.b(eVar, fVar);
                    if (effect3 != null) {
                        a(effect3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    effect = (Effect) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    effect2 = effect;
                }
                if (effect2 != null) {
                    a(effect2);
                }
                throw th;
            }

            public a a(EffectType effectType) {
                if (effectType != null) {
                    this.bitField0_ |= 1;
                    this.effectType_ = effectType;
                    return this;
                }
                throw new NullPointerException();
            }

            private void bCc() {
                if ((this.bitField0_ & 2) != 2) {
                    this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                    this.bitField0_ |= 2;
                }
            }

            public int bBQ() {
                return this.effectConstructorArgument_.size();
            }

            public Expression kr(int i) {
                return (Expression) this.effectConstructorArgument_.get(i);
            }

            public boolean bBR() {
                return (this.bitField0_ & 4) == 4;
            }

            public Expression bBS() {
                return this.conclusionOfConditionalEffect_;
            }

            public a a(Expression expression) {
                if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.bCp()) {
                    this.conclusionOfConditionalEffect_ = expression;
                } else {
                    this.conclusionOfConditionalEffect_ = Expression.b(this.conclusionOfConditionalEffect_).a(expression).bCH();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public a a(InvocationKind invocationKind) {
                if (invocationKind != null) {
                    this.bitField0_ |= 8;
                    this.kind_ = invocationKind;
                    return this;
                }
                throw new NullPointerException();
            }
        }

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Effect bBM() {
            return fmU;
        }

        /* renamed from: bBN */
        public Effect bzq() {
            return fmU;
        }

        private Effect(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                        int bKF;
                        if (bKv == 8) {
                            bKF = eVar.bKF();
                            EffectType valueOf = EffectType.valueOf(bKF);
                            if (valueOf == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = valueOf;
                            }
                        } else if (bKv == 18) {
                            if ((i & 2) != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                i |= 2;
                            }
                            this.effectConstructorArgument_.add(eVar.a(Expression.fmO, fVar));
                        } else if (bKv == 26) {
                            a aVar = null;
                            if ((this.bitField0_ & 2) == 2) {
                                aVar = this.conclusionOfConditionalEffect_.bzo();
                            }
                            this.conclusionOfConditionalEffect_ = (Expression) eVar.a(Expression.fmO, fVar);
                            if (aVar != null) {
                                aVar.a(this.conclusionOfConditionalEffect_);
                                this.conclusionOfConditionalEffect_ = aVar.bCH();
                            }
                            this.bitField0_ |= 2;
                        } else if (bKv == 32) {
                            bKF = eVar.bKF();
                            InvocationKind valueOf2 = InvocationKind.valueOf(bKF);
                            if (valueOf2 == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = valueOf2;
                            }
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            if ((i & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            fmU.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Effect> bzg() {
            return fmO;
        }

        public boolean bBO() {
            return (this.bitField0_ & 1) == 1;
        }

        public EffectType bBP() {
            return this.effectType_;
        }

        public int bBQ() {
            return this.effectConstructorArgument_.size();
        }

        public Expression kr(int i) {
            return (Expression) this.effectConstructorArgument_.get(i);
        }

        public boolean bBR() {
            return (this.bitField0_ & 2) == 2;
        }

        public Expression bBS() {
            return this.conclusionOfConditionalEffect_;
        }

        public boolean bBT() {
            return (this.bitField0_ & 4) == 4;
        }

        public InvocationKind bBU() {
            return this.kind_;
        }

        private void bzj() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.emptyList();
            this.conclusionOfConditionalEffect_ = Expression.bCp();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bBQ()) {
                if (kr(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!bBR() || bBS().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.c(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.b(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.b(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.c(4, this.kind_.getNumber());
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.f(1, this.effectType_.getNumber()) + 0 : 0;
            while (i2 < this.effectConstructorArgument_.size()) {
                i += CodedOutputStream.d(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.effectConstructorArgument_.get(i2));
                i2++;
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.d(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.f(4, this.kind_.getNumber());
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bBV() {
            return a.bBY();
        }

        /* renamed from: bBW */
        public a bzp() {
            return bBV();
        }

        public static a a(Effect effect) {
            return bBV().a(effect);
        }

        /* renamed from: bBX */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Expression extends GeneratedMessageLite implements g {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Expression> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Expression>() {
            /* renamed from: t */
            public Expression b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Expression(eVar, fVar);
            }
        };
        private static final Expression fmW = new Expression(true);
        private List<Expression> andArgument_;
        private int bitField0_;
        private ConstantValue constantValue_;
        private int flags_;
        private int isInstanceTypeId_;
        private Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Expression> orArgument_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private int valueParameterReference_;

        public enum ConstantValue implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<ConstantValue> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<ConstantValue>() {
                    /* renamed from: kA */
                    public ConstantValue kb(int i) {
                        return ConstantValue.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i != 1) {
                    return i != 2 ? null : NULL;
                } else {
                    return FALSE;
                }
            }

            private ConstantValue(int i, int i2) {
                this.value = i2;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Expression, a> implements g {
            private List<Expression> andArgument_ = Collections.emptyList();
            private int bitField0_;
            private ConstantValue constantValue_ = ConstantValue.TRUE;
            private int flags_;
            private int isInstanceTypeId_;
            private Type isInstanceType_ = Type.bEu();
            private List<Expression> orArgument_ = Collections.emptyList();
            private int valueParameterReference_;

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bCE() {
                return new a();
            }

            /* renamed from: bCF */
            public a clone() {
                return bCE().a(bCH());
            }

            /* renamed from: bCq */
            public Expression bzq() {
                return Expression.bCp();
            }

            /* renamed from: bCG */
            public Expression bzG() {
                Expression bCH = bCH();
                if (bCH.isInitialized()) {
                    return bCH;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bCH);
            }

            public Expression bCH() {
                Expression expression = new Expression((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                expression.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.constantValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.isInstanceType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                expression.orArgument_ = this.orArgument_;
                expression.bitField0_ = i2;
                return expression;
            }

            /* renamed from: f */
            public a a(Expression expression) {
                if (expression == Expression.bCp()) {
                    return this;
                }
                if (expression.bAb()) {
                    kx(expression.getFlags());
                }
                if (expression.bCr()) {
                    ky(expression.bCs());
                }
                if (expression.bCt()) {
                    a(expression.bCu());
                }
                if (expression.bCv()) {
                    a(expression.bCw());
                }
                if (expression.bCx()) {
                    kz(expression.bCy());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        bCI();
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        bCJ();
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                e(bLf().a(expression.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (bCv() && !bCw().isInitialized()) {
                    return false;
                }
                int i;
                for (i = 0; i < bCz(); i++) {
                    if (!kv(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bCA(); i++) {
                    if (!kw(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: u */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Expression expression;
                Throwable th;
                Expression expression2 = null;
                try {
                    Expression expression3 = (Expression) Expression.fmO.b(eVar, fVar);
                    if (expression3 != null) {
                        a(expression3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    expression = (Expression) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    expression2 = expression;
                }
                if (expression2 != null) {
                    a(expression2);
                }
                throw th;
            }

            public a kx(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public a ky(int i) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i;
                return this;
            }

            public a a(ConstantValue constantValue) {
                if (constantValue != null) {
                    this.bitField0_ |= 4;
                    this.constantValue_ = constantValue;
                    return this;
                }
                throw new NullPointerException();
            }

            public boolean bCv() {
                return (this.bitField0_ & 8) == 8;
            }

            public Type bCw() {
                return this.isInstanceType_;
            }

            public a a(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.bEu()) {
                    this.isInstanceType_ = type;
                } else {
                    this.isInstanceType_ = Type.f(this.isInstanceType_).a(type).bFo();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public a kz(int i) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i;
                return this;
            }

            private void bCI() {
                if ((this.bitField0_ & 32) != 32) {
                    this.andArgument_ = new ArrayList(this.andArgument_);
                    this.bitField0_ |= 32;
                }
            }

            public int bCz() {
                return this.andArgument_.size();
            }

            public Expression kv(int i) {
                return (Expression) this.andArgument_.get(i);
            }

            private void bCJ() {
                if ((this.bitField0_ & 64) != 64) {
                    this.orArgument_ = new ArrayList(this.orArgument_);
                    this.bitField0_ |= 64;
                }
            }

            public int bCA() {
                return this.orArgument_.size();
            }

            public Expression kw(int i) {
                return (Expression) this.orArgument_.get(i);
            }
        }

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Expression bCp() {
            return fmW;
        }

        /* renamed from: bCq */
        public Expression bzq() {
            return fmW;
        }

        private Expression(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            this.flags_ = eVar.bKy();
                        } else if (bKv == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = eVar.bKy();
                        } else if (bKv == 24) {
                            int bKF = eVar.bKF();
                            ConstantValue valueOf = ConstantValue.valueOf(bKF);
                            if (valueOf == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = valueOf;
                            }
                        } else if (bKv == 34) {
                            b bVar = null;
                            if ((this.bitField0_ & 8) == 8) {
                                bVar = this.isInstanceType_.bzo();
                            }
                            this.isInstanceType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.isInstanceType_);
                                this.isInstanceType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 8;
                        } else if (bKv == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = eVar.bKy();
                        } else if (bKv == 50) {
                            if ((i & 32) != 32) {
                                this.andArgument_ = new ArrayList();
                                i |= 32;
                            }
                            this.andArgument_.add(eVar.a(fmO, fVar));
                        } else if (bKv == 58) {
                            if ((i & 64) != 64) {
                                this.orArgument_ = new ArrayList();
                                i |= 64;
                            }
                            this.orArgument_.add(eVar.a(fmO, fVar));
                        } else if (a(eVar, b, fVar, bKv)) {
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    }
                    if ((i & 64) == 64) {
                        this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            if ((i & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            fmW.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Expression> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean bCr() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCs() {
            return this.valueParameterReference_;
        }

        public boolean bCt() {
            return (this.bitField0_ & 4) == 4;
        }

        public ConstantValue bCu() {
            return this.constantValue_;
        }

        public boolean bCv() {
            return (this.bitField0_ & 8) == 8;
        }

        public Type bCw() {
            return this.isInstanceType_;
        }

        public boolean bCx() {
            return (this.bitField0_ & 16) == 16;
        }

        public int bCy() {
            return this.isInstanceTypeId_;
        }

        public int bCz() {
            return this.andArgument_.size();
        }

        public Expression kv(int i) {
            return (Expression) this.andArgument_.get(i);
        }

        public int bCA() {
            return this.orArgument_.size();
        }

        public Expression kw(int i) {
            return (Expression) this.orArgument_.get(i);
        }

        private void bzj() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.bEu();
            this.isInstanceTypeId_ = 0;
            this.andArgument_ = Collections.emptyList();
            this.orArgument_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (!bCv() || bCw().isInitialized()) {
                int i = 0;
                while (i < bCz()) {
                    if (kv(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bCA()) {
                    if (kw(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.c(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.b(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.bk(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.b(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.b(7, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.orArgument_.get(i2));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.f(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.d(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.bl(5, this.isInstanceTypeId_);
            }
            int i3 = i;
            for (i = 0; i < this.andArgument_.size(); i++) {
                i3 += CodedOutputStream.d(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.andArgument_.get(i));
            }
            while (i2 < this.orArgument_.size()) {
                i3 += CodedOutputStream.d(7, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.orArgument_.get(i2));
                i2++;
            }
            i3 += this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static a bCB() {
            return a.bCE();
        }

        /* renamed from: bCC */
        public a bzp() {
            return bCB();
        }

        public static a b(Expression expression) {
            return bCB().a(expression);
        }

        /* renamed from: bCD */
        public a bzo() {
            return b(this);
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements k {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedNameTable> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedNameTable>() {
            /* renamed from: B */
            public QualifiedNameTable b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new QualifiedNameTable(eVar, fVar);
            }
        };
        private static final QualifiedNameTable fna = new QualifiedNameTable(true);
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<QualifiedName> qualifiedName_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public interface b extends kotlin.reflect.jvm.internal.impl.protobuf.o {
        }

        public static final class QualifiedName extends GeneratedMessageLite implements b {
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedName> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedName>() {
                /* renamed from: D */
                public QualifiedName b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new QualifiedName(eVar, fVar);
                }
            };
            private static final QualifiedName fnb = new QualifiedName(true);
            private int bitField0_;
            private Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int parentQualifiedName_;
            private int shortName_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

            public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);
                
                private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind>() {
                        /* renamed from: kS */
                        public Kind kb(int i) {
                            return Kind.valueOf(i);
                        }
                    };
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i != 1) {
                        return i != 2 ? null : LOCAL;
                    } else {
                        return PACKAGE;
                    }
                }

                private Kind(int i, int i2) {
                    this.value = i2;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<QualifiedName, a> implements b {
                private int bitField0_;
                private Kind kind_ = Kind.PACKAGE;
                private int parentQualifiedName_ = -1;
                private int shortName_;

                private void bzy() {
                }

                private a() {
                    bzy();
                }

                private static a bEd() {
                    return new a();
                }

                /* renamed from: bEe */
                public a clone() {
                    return bEd().a(bEg());
                }

                /* renamed from: bDU */
                public QualifiedName bzq() {
                    return QualifiedName.bDT();
                }

                /* renamed from: bEf */
                public QualifiedName bzG() {
                    QualifiedName bEg = bEg();
                    if (bEg.isInitialized()) {
                        return bEg;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bEg);
                }

                public QualifiedName bEg() {
                    QualifiedName qualifiedName = new QualifiedName((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.shortName_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.kind_;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                /* renamed from: c */
                public a a(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.bDT()) {
                        return this;
                    }
                    if (qualifiedName.bDV()) {
                        kQ(qualifiedName.bDW());
                    }
                    if (qualifiedName.bDX()) {
                        kR(qualifiedName.bDY());
                    }
                    if (qualifiedName.bBT()) {
                        a(qualifiedName.bDZ());
                    }
                    e(bLf().a(qualifiedName.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    return bDX();
                }

                /* renamed from: E */
                public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    QualifiedName qualifiedName;
                    Throwable th;
                    QualifiedName qualifiedName2 = null;
                    try {
                        QualifiedName qualifiedName3 = (QualifiedName) QualifiedName.fmO.b(eVar, fVar);
                        if (qualifiedName3 != null) {
                            a(qualifiedName3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        qualifiedName = (QualifiedName) e.bLo();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        qualifiedName2 = qualifiedName;
                    }
                    if (qualifiedName2 != null) {
                        a(qualifiedName2);
                    }
                    throw th;
                }

                public a kQ(int i) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i;
                    return this;
                }

                public boolean bDX() {
                    return (this.bitField0_ & 2) == 2;
                }

                public a kR(int i) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i;
                    return this;
                }

                public a a(Kind kind) {
                    if (kind != null) {
                        this.bitField0_ |= 4;
                        this.kind_ = kind;
                        return this;
                    }
                    throw new NullPointerException();
                }
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
                super(aVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = aVar.bLf();
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
            }

            public static QualifiedName bDT() {
                return fnb;
            }

            /* renamed from: bDU */
            public QualifiedName bzq() {
                return fnb;
            }

            private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.parentQualifiedName_ = eVar.bKy();
                            } else if (bKv == 16) {
                                this.bitField0_ |= 2;
                                this.shortName_ = eVar.bKy();
                            } else if (bKv == 24) {
                                int bKF = eVar.bKF();
                                Kind valueOf = Kind.valueOf(bKF);
                                if (valueOf == null) {
                                    b.K(bKv);
                                    b.K(bKF);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = valueOf;
                                }
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
                fnb.bzj();
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedName> bzg() {
                return fmO;
            }

            public boolean bDV() {
                return (this.bitField0_ & 1) == 1;
            }

            public int bDW() {
                return this.parentQualifiedName_;
            }

            public boolean bDX() {
                return (this.bitField0_ & 2) == 2;
            }

            public int bDY() {
                return this.shortName_;
            }

            public boolean bBT() {
                return (this.bitField0_ & 4) == 4;
            }

            public Kind bDZ() {
                return this.kind_;
            }

            private void bzj() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                if (bDX()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            public void a(CodedOutputStream codedOutputStream) {
                bzk();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.bk(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.bk(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.c(3, this.kind_.getNumber());
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
                    i = 0 + CodedOutputStream.bl(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.bl(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.f(3, this.kind_.getNumber());
                }
                i += this.unknownFields.size();
                this.memoizedSerializedSize = i;
                return i;
            }

            public static a bEa() {
                return a.bEd();
            }

            /* renamed from: bEb */
            public a bzp() {
                return bEa();
            }

            public static a a(QualifiedName qualifiedName) {
                return bEa().a(qualifiedName);
            }

            /* renamed from: bEc */
            public a bzo() {
                return a(this);
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<QualifiedNameTable, a> implements k {
            private int bitField0_;
            private List<QualifiedName> qualifiedName_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bDN() {
                return new a();
            }

            /* renamed from: bDO */
            public a clone() {
                return bDN().a(bDQ());
            }

            /* renamed from: bDI */
            public QualifiedNameTable bzq() {
                return QualifiedNameTable.bDH();
            }

            /* renamed from: bDP */
            public QualifiedNameTable bzG() {
                QualifiedNameTable bDQ = bDQ();
                if (bDQ.isInitialized()) {
                    return bDQ;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bDQ);
            }

            public QualifiedNameTable bDQ() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            /* renamed from: d */
            public a a(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.bDH()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        bDR();
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                e(bLf().a(qualifiedNameTable.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bDJ(); i++) {
                    if (!kP(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: C */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                QualifiedNameTable qualifiedNameTable;
                Throwable th;
                QualifiedNameTable qualifiedNameTable2 = null;
                try {
                    QualifiedNameTable qualifiedNameTable3 = (QualifiedNameTable) QualifiedNameTable.fmO.b(eVar, fVar);
                    if (qualifiedNameTable3 != null) {
                        a(qualifiedNameTable3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedNameTable = (QualifiedNameTable) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    qualifiedNameTable2 = qualifiedNameTable;
                }
                if (qualifiedNameTable2 != null) {
                    a(qualifiedNameTable2);
                }
                throw th;
            }

            private void bDR() {
                if ((this.bitField0_ & 1) != 1) {
                    this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                    this.bitField0_ |= 1;
                }
            }

            public int bDJ() {
                return this.qualifiedName_.size();
            }

            public QualifiedName kP(int i) {
                return (QualifiedName) this.qualifiedName_.get(i);
            }
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static QualifiedNameTable bDH() {
            return fna;
        }

        /* renamed from: bDI */
        public QualifiedNameTable bzq() {
            return fna;
        }

        private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.qualifiedName_ = new ArrayList();
                                i |= 1;
                            }
                            this.qualifiedName_.add(eVar.a(QualifiedName.fmO, fVar));
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
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            fna.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<QualifiedNameTable> bzg() {
            return fmO;
        }

        public int bDJ() {
            return this.qualifiedName_.size();
        }

        public QualifiedName kP(int i) {
            return (QualifiedName) this.qualifiedName_.get(i);
        }

        private void bzj() {
            this.qualifiedName_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bDJ()) {
                if (kP(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.b(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.qualifiedName_.get(i));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.qualifiedName_.size(); i++) {
                i2 += CodedOutputStream.d(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.qualifiedName_.get(i));
            }
            i2 += this.unknownFields.size();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public static a bDK() {
            return a.bDN();
        }

        /* renamed from: bDL */
        public a bzp() {
            return bDK();
        }

        public static a a(QualifiedNameTable qualifiedNameTable) {
            return bDK().a(qualifiedNameTable);
        }

        /* renamed from: bDM */
        public a bzo() {
            return a(this);
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements l {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<StringTable> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<StringTable>() {
            /* renamed from: F */
            public StringTable b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new StringTable(eVar, fVar);
            }
        };
        private static final StringTable fnc = new StringTable(true);
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private kotlin.reflect.jvm.internal.impl.protobuf.l string_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<StringTable, a> implements l {
            private int bitField0_;
            private kotlin.reflect.jvm.internal.impl.protobuf.l string_ = kotlin.reflect.jvm.internal.impl.protobuf.k.fqy;

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bEo() {
                return new a();
            }

            /* renamed from: bEp */
            public a clone() {
                return bEo().a(bEr());
            }

            /* renamed from: bEj */
            public StringTable bzq() {
                return StringTable.bEi();
            }

            /* renamed from: bEq */
            public StringTable bzG() {
                StringTable bEr = bEr();
                if (bEr.isInitialized()) {
                    return bEr;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bEr);
            }

            public StringTable bEr() {
                StringTable stringTable = new StringTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.bLA();
                    this.bitField0_ &= -2;
                }
                stringTable.string_ = this.string_;
                return stringTable;
            }

            /* renamed from: d */
            public a a(StringTable stringTable) {
                if (stringTable == StringTable.bEi()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        bEs();
                        this.string_.addAll(stringTable.string_);
                    }
                }
                e(bLf().a(stringTable.unknownFields));
                return this;
            }

            /* renamed from: G */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                StringTable stringTable;
                Throwable th;
                StringTable stringTable2 = null;
                try {
                    StringTable stringTable3 = (StringTable) StringTable.fmO.b(eVar, fVar);
                    if (stringTable3 != null) {
                        a(stringTable3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTable = (StringTable) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    stringTable2 = stringTable;
                }
                if (stringTable2 != null) {
                    a(stringTable2);
                }
                throw th;
            }

            private void bEs() {
                if ((this.bitField0_ & 1) != 1) {
                    this.string_ = new kotlin.reflect.jvm.internal.impl.protobuf.k(this.string_);
                    this.bitField0_ |= 1;
                }
            }
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static StringTable bEi() {
            return fnc;
        }

        /* renamed from: bEj */
        public StringTable bzq() {
            return fnc;
        }

        private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            kotlin.reflect.jvm.internal.impl.protobuf.d bKD = eVar.bKD();
                            if ((i & 1) != 1) {
                                this.string_ = new kotlin.reflect.jvm.internal.impl.protobuf.k();
                                i |= 1;
                            }
                            this.string_.f(bKD);
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
                        this.string_ = this.string_.bLA();
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
                this.string_ = this.string_.bLA();
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
            fnc.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<StringTable> bzg() {
            return fmO;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.q bEk() {
            return this.string_;
        }

        public String getString(int i) {
            return (String) this.string_.get(i);
        }

        private void bzj() {
            this.string_ = kotlin.reflect.jvm.internal.impl.protobuf.k.fqy;
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
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.a(1, this.string_.mj(i));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.string_.size(); i3++) {
                i2 += CodedOutputStream.c(this.string_.mj(i3));
            }
            i = ((0 + i2) + (bEk().size() * 1)) + this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bEl() {
            return a.bEo();
        }

        /* renamed from: bEm */
        public a bzp() {
            return bEl();
        }

        public static a a(StringTable stringTable) {
            return bEl().a(stringTable);
        }

        /* renamed from: bEn */
        public a bzo() {
            return a(this);
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements p {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeTable> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<TypeTable>() {
            /* renamed from: P */
            public TypeTable b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new TypeTable(eVar, fVar);
            }
        };
        private static final TypeTable fnh = new TypeTable(true);
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Type> type_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<TypeTable, a> implements p {
            private int bitField0_;
            private int firstNullable_ = -1;
            private List<Type> type_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bGn() {
                return new a();
            }

            /* renamed from: bGo */
            public a clone() {
                return bGn().a(bGq());
            }

            /* renamed from: bGf */
            public TypeTable bzq() {
                return TypeTable.bGe();
            }

            /* renamed from: bGp */
            public TypeTable bzG() {
                TypeTable bGq = bGq();
                if (bGq.isInitialized()) {
                    return bGq;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bGq);
            }

            public TypeTable bGq() {
                TypeTable typeTable = new TypeTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                typeTable.type_ = this.type_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                typeTable.firstNullable_ = this.firstNullable_;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            /* renamed from: g */
            public a a(TypeTable typeTable) {
                if (typeTable == TypeTable.bGe()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        bGr();
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.bGi()) {
                    lp(typeTable.bGj());
                }
                e(bLf().a(typeTable.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bGh(); i++) {
                    if (!lo(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: Q */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                TypeTable typeTable;
                Throwable th;
                TypeTable typeTable2 = null;
                try {
                    TypeTable typeTable3 = (TypeTable) TypeTable.fmO.b(eVar, fVar);
                    if (typeTable3 != null) {
                        a(typeTable3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeTable = (TypeTable) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeTable2 = typeTable;
                }
                if (typeTable2 != null) {
                    a(typeTable2);
                }
                throw th;
            }

            private void bGr() {
                if ((this.bitField0_ & 1) != 1) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            public int bGh() {
                return this.type_.size();
            }

            public Type lo(int i) {
                return (Type) this.type_.get(i);
            }

            public a lp(int i) {
                this.bitField0_ |= 2;
                this.firstNullable_ = i;
                return this;
            }
        }

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static TypeTable bGe() {
            return fnh;
        }

        /* renamed from: bGf */
        public TypeTable bzq() {
            return fnh;
        }

        private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.type_ = new ArrayList();
                                i |= 1;
                            }
                            this.type_.add(eVar.a(Type.fmO, fVar));
                        } else if (bKv == 16) {
                            this.bitField0_ |= 1;
                            this.firstNullable_ = eVar.bKy();
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
                        this.type_ = Collections.unmodifiableList(this.type_);
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
                this.type_ = Collections.unmodifiableList(this.type_);
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
            fnh.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeTable> bzg() {
            return fmO;
        }

        public List<Type> bGg() {
            return this.type_;
        }

        public int bGh() {
            return this.type_.size();
        }

        public Type lo(int i) {
            return (Type) this.type_.get(i);
        }

        public boolean bGi() {
            return (this.bitField0_ & 1) == 1;
        }

        public int bGj() {
            return this.firstNullable_;
        }

        private void bzj() {
            this.type_ = Collections.emptyList();
            this.firstNullable_ = -1;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bGh()) {
                if (lo(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.b(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(2, this.firstNullable_);
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.type_.size(); i++) {
                i2 += CodedOutputStream.d(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.bl(2, this.firstNullable_);
            }
            i2 += this.unknownFields.size();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public static a bGk() {
            return a.bGn();
        }

        /* renamed from: bGl */
        public a bzp() {
            return bGk();
        }

        public static a d(TypeTable typeTable) {
            return bGk().a(typeTable);
        }

        /* renamed from: bGm */
        public a bzo() {
            return d(this);
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements r {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirement> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirement>() {
            /* renamed from: T */
            public VersionRequirement b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new VersionRequirement(eVar, fVar);
            }
        };
        private static final VersionRequirement fnj = new VersionRequirement(true);
        private int bitField0_;
        private int errorCode_;
        private Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int message_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private int versionFull_;
        private VersionKind versionKind_;
        private int version_;

        public enum Level implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Level> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Level>() {
                    /* renamed from: ly */
                    public Level kb(int i) {
                        return Level.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i != 1) {
                    return i != 2 ? null : HIDDEN;
                } else {
                    return ERROR;
                }
            }

            private Level(int i, int i2) {
                this.value = i2;
            }
        }

        public enum VersionKind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<VersionKind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<VersionKind>() {
                    /* renamed from: lz */
                    public VersionKind kb(int i) {
                        return VersionKind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i != 1) {
                    return i != 2 ? null : API_VERSION;
                } else {
                    return COMPILER_VERSION;
                }
            }

            private VersionKind(int i, int i2) {
                this.value = i2;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<VersionRequirement, a> implements r {
            private int bitField0_;
            private int errorCode_;
            private Level level_ = Level.ERROR;
            private int message_;
            private int versionFull_;
            private VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;
            private int version_;

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bGW() {
                return new a();
            }

            /* renamed from: bGX */
            public a clone() {
                return bGW().a(bGZ());
            }

            /* renamed from: bGI */
            public VersionRequirement bzq() {
                return VersionRequirement.bGH();
            }

            /* renamed from: bGY */
            public VersionRequirement bzG() {
                VersionRequirement bGZ = bGZ();
                if (bGZ.isInitialized()) {
                    return bGZ;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bGZ);
            }

            public VersionRequirement bGZ() {
                VersionRequirement versionRequirement = new VersionRequirement((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                versionRequirement.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.versionFull_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.level_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.errorCode_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.message_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.versionKind_;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            /* renamed from: c */
            public a a(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.bGH()) {
                    return this;
                }
                if (versionRequirement.bGJ()) {
                    lu(versionRequirement.getVersion());
                }
                if (versionRequirement.bGK()) {
                    lv(versionRequirement.bGL());
                }
                if (versionRequirement.bGM()) {
                    a(versionRequirement.bGN());
                }
                if (versionRequirement.bGO()) {
                    lw(versionRequirement.getErrorCode());
                }
                if (versionRequirement.bGP()) {
                    lx(versionRequirement.bGQ());
                }
                if (versionRequirement.bGR()) {
                    a(versionRequirement.bGS());
                }
                e(bLf().a(versionRequirement.unknownFields));
                return this;
            }

            /* renamed from: U */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                VersionRequirement versionRequirement;
                Throwable th;
                VersionRequirement versionRequirement2 = null;
                try {
                    VersionRequirement versionRequirement3 = (VersionRequirement) VersionRequirement.fmO.b(eVar, fVar);
                    if (versionRequirement3 != null) {
                        a(versionRequirement3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirement = (VersionRequirement) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    versionRequirement2 = versionRequirement;
                }
                if (versionRequirement2 != null) {
                    a(versionRequirement2);
                }
                throw th;
            }

            public a lu(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                return this;
            }

            public a lv(int i) {
                this.bitField0_ |= 2;
                this.versionFull_ = i;
                return this;
            }

            public a a(Level level) {
                if (level != null) {
                    this.bitField0_ |= 4;
                    this.level_ = level;
                    return this;
                }
                throw new NullPointerException();
            }

            public a lw(int i) {
                this.bitField0_ |= 8;
                this.errorCode_ = i;
                return this;
            }

            public a lx(int i) {
                this.bitField0_ |= 16;
                this.message_ = i;
                return this;
            }

            public a a(VersionKind versionKind) {
                if (versionKind != null) {
                    this.bitField0_ |= 32;
                    this.versionKind_ = versionKind;
                    return this;
                }
                throw new NullPointerException();
            }
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static VersionRequirement bGH() {
            return fnj;
        }

        /* renamed from: bGI */
        public VersionRequirement bzq() {
            return fnj;
        }

        private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                        int bKF;
                        if (bKv == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = eVar.bKy();
                        } else if (bKv == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = eVar.bKy();
                        } else if (bKv == 24) {
                            bKF = eVar.bKF();
                            Level valueOf = Level.valueOf(bKF);
                            if (valueOf == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = valueOf;
                            }
                        } else if (bKv == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = eVar.bKy();
                        } else if (bKv == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = eVar.bKy();
                        } else if (bKv == 48) {
                            bKF = eVar.bKF();
                            VersionKind valueOf2 = VersionKind.valueOf(bKF);
                            if (valueOf2 == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = valueOf2;
                            }
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
            fnj.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirement> bzg() {
            return fmO;
        }

        public boolean bGJ() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean bGK() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bGL() {
            return this.versionFull_;
        }

        public boolean bGM() {
            return (this.bitField0_ & 4) == 4;
        }

        public Level bGN() {
            return this.level_;
        }

        public boolean bGO() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public boolean bGP() {
            return (this.bitField0_ & 16) == 16;
        }

        public int bGQ() {
            return this.message_;
        }

        public boolean bGR() {
            return (this.bitField0_ & 32) == 32;
        }

        public VersionKind bGS() {
            return this.versionKind_;
        }

        private void bzj() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
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
                codedOutputStream.bk(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.c(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.bk(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.bk(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.c(6, this.versionKind_.getNumber());
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
                i = 0 + CodedOutputStream.bl(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.f(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.bl(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.bl(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.f(6, this.versionKind_.getNumber());
            }
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bGT() {
            return a.bGW();
        }

        /* renamed from: bGU */
        public a bzp() {
            return bGT();
        }

        public static a a(VersionRequirement versionRequirement) {
            return bGT().a(versionRequirement);
        }

        /* renamed from: bGV */
        public a bzo() {
            return a(this);
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements s {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirementTable> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirementTable>() {
            /* renamed from: V */
            public VersionRequirementTable b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new VersionRequirementTable(eVar, fVar);
            }
        };
        private static final VersionRequirementTable fnk = new VersionRequirementTable(true);
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<VersionRequirement> requirement_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<VersionRequirementTable, a> implements s {
            private int bitField0_;
            private List<VersionRequirement> requirement_ = Collections.emptyList();

            private void bzy() {
            }

            public final boolean isInitialized() {
                return true;
            }

            private a() {
                bzy();
            }

            private static a bHi() {
                return new a();
            }

            /* renamed from: bHj */
            public a clone() {
                return bHi().a(bHl());
            }

            /* renamed from: bHc */
            public VersionRequirementTable bzq() {
                return VersionRequirementTable.bHb();
            }

            /* renamed from: bHk */
            public VersionRequirementTable bzG() {
                VersionRequirementTable bHl = bHl();
                if (bHl.isInitialized()) {
                    return bHl;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bHl);
            }

            public VersionRequirementTable bHl() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            /* renamed from: f */
            public a a(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.bHb()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        bHm();
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                e(bLf().a(versionRequirementTable.unknownFields));
                return this;
            }

            /* renamed from: W */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                VersionRequirementTable versionRequirementTable;
                Throwable th;
                VersionRequirementTable versionRequirementTable2 = null;
                try {
                    VersionRequirementTable versionRequirementTable3 = (VersionRequirementTable) VersionRequirementTable.fmO.b(eVar, fVar);
                    if (versionRequirementTable3 != null) {
                        a(versionRequirementTable3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirementTable = (VersionRequirementTable) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    versionRequirementTable2 = versionRequirementTable;
                }
                if (versionRequirementTable2 != null) {
                    a(versionRequirementTable2);
                }
                throw th;
            }

            private void bHm() {
                if ((this.bitField0_ & 1) != 1) {
                    this.requirement_ = new ArrayList(this.requirement_);
                    this.bitField0_ |= 1;
                }
            }
        }

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static VersionRequirementTable bHb() {
            return fnk;
        }

        /* renamed from: bHc */
        public VersionRequirementTable bzq() {
            return fnk;
        }

        private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                this.requirement_ = new ArrayList();
                                i |= 1;
                            }
                            this.requirement_.add(eVar.a(VersionRequirement.fmO, fVar));
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
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            fnk.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<VersionRequirementTable> bzg() {
            return fmO;
        }

        public List<VersionRequirement> bHd() {
            return this.requirement_;
        }

        public int bHe() {
            return this.requirement_.size();
        }

        private void bzj() {
            this.requirement_ = Collections.emptyList();
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
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.b(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.requirement_.get(i));
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.requirement_.size(); i++) {
                i2 += CodedOutputStream.d(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.requirement_.get(i));
            }
            i2 += this.unknownFields.size();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public static a bHf() {
            return a.bHi();
        }

        /* renamed from: bHg */
        public a bzp() {
            return bHf();
        }

        public static a c(VersionRequirementTable versionRequirementTable) {
            return bHf().a(versionRequirementTable);
        }

        /* renamed from: bHh */
        public a bzo() {
            return c(this);
        }
    }

    public static final class Class extends ExtendableMessage<Class> implements b {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Class> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Class>() {
            /* renamed from: j */
            public Class b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Class(eVar, fVar);
            }
        };
        private static final Class fmR = new Class(true);
        private int bitField0_;
        private int companionObjectName_;
        private List<Constructor> constructor_;
        private List<EnumEntry> enumEntry_;
        private int flags_;
        private int fqName_;
        private List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nestedClassNameMemoizedSerializedSize;
        private List<Integer> nestedClassName_;
        private List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        private List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        private List<Integer> supertypeId_;
        private List<Type> supertype_;
        private List<TypeAlias> typeAlias_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private VersionRequirementTable versionRequirementTable_;
        private List<Integer> versionRequirement_;

        public enum Kind implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Kind>() {
                    /* renamed from: kn */
                    public Kind kb(int i) {
                        return Kind.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            private Kind(int i, int i2) {
                this.value = i2;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Class, a> implements b {
            private int bitField0_;
            private int companionObjectName_;
            private List<Constructor> constructor_ = Collections.emptyList();
            private List<EnumEntry> enumEntry_ = Collections.emptyList();
            private int flags_ = 6;
            private int fqName_;
            private List<Function> function_ = Collections.emptyList();
            private List<Integer> nestedClassName_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<Integer> sealedSubclassFqName_ = Collections.emptyList();
            private List<Integer> supertypeId_ = Collections.emptyList();
            private List<Type> supertype_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.bGe();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.bHb();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bAW() {
                return new a();
            }

            /* renamed from: bAX */
            public a clone() {
                return bAW().a(bAZ());
            }

            /* renamed from: bAs */
            public Class bzq() {
                return Class.bAr();
            }

            /* renamed from: bAY */
            public Class bzG() {
                Class bAZ = bAZ();
                if (bAZ.isInitialized()) {
                    return bAZ;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bAZ);
            }

            public Class bAZ() {
                Class classR = new Class((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                classR.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                classR.fqName_ = this.fqName_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                classR.companionObjectName_ = this.companionObjectName_;
                if ((this.bitField0_ & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                classR.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                classR.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                classR.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                classR.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & 128) == 128) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -129;
                }
                classR.constructor_ = this.constructor_;
                if ((this.bitField0_ & 256) == 256) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -257;
                }
                classR.function_ = this.function_;
                if ((this.bitField0_ & 512) == 512) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -513;
                }
                classR.property_ = this.property_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -1025;
                }
                classR.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -2049;
                }
                classR.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -4097;
                }
                classR.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                classR.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                classR.versionRequirement_ = this.versionRequirement_;
                if ((i & 32768) == 32768) {
                    i2 |= 16;
                }
                classR.versionRequirementTable_ = this.versionRequirementTable_;
                classR.bitField0_ = i2;
                return classR;
            }

            /* renamed from: n */
            public a a(Class classR) {
                if (classR == Class.bAr()) {
                    return this;
                }
                if (classR.bAb()) {
                    kk(classR.getFlags());
                }
                if (classR.bAt()) {
                    kl(classR.bAu());
                }
                if (classR.bAv()) {
                    km(classR.bAw());
                }
                if (!classR.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = classR.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        bBa();
                        this.typeParameter_.addAll(classR.typeParameter_);
                    }
                }
                if (!classR.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = classR.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        bBb();
                        this.supertype_.addAll(classR.supertype_);
                    }
                }
                if (!classR.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = classR.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        bBc();
                        this.supertypeId_.addAll(classR.supertypeId_);
                    }
                }
                if (!classR.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = classR.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        bBd();
                        this.nestedClassName_.addAll(classR.nestedClassName_);
                    }
                }
                if (!classR.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = classR.constructor_;
                        this.bitField0_ &= -129;
                    } else {
                        bBe();
                        this.constructor_.addAll(classR.constructor_);
                    }
                }
                if (!classR.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = classR.function_;
                        this.bitField0_ &= -257;
                    } else {
                        bBf();
                        this.function_.addAll(classR.function_);
                    }
                }
                if (!classR.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = classR.property_;
                        this.bitField0_ &= -513;
                    } else {
                        bBg();
                        this.property_.addAll(classR.property_);
                    }
                }
                if (!classR.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = classR.typeAlias_;
                        this.bitField0_ &= -1025;
                    } else {
                        bBh();
                        this.typeAlias_.addAll(classR.typeAlias_);
                    }
                }
                if (!classR.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = classR.enumEntry_;
                        this.bitField0_ &= -2049;
                    } else {
                        bBi();
                        this.enumEntry_.addAll(classR.enumEntry_);
                    }
                }
                if (!classR.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = classR.sealedSubclassFqName_;
                        this.bitField0_ &= -4097;
                    } else {
                        bBj();
                        this.sealedSubclassFqName_.addAll(classR.sealedSubclassFqName_);
                    }
                }
                if (classR.bAO()) {
                    a(classR.bAP());
                }
                if (!classR.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = classR.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        bBk();
                        this.versionRequirement_.addAll(classR.versionRequirement_);
                    }
                }
                if (classR.bAR()) {
                    a(classR.bAS());
                }
                a((ExtendableMessage) classR);
                e(bLf().a(classR.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!bAt()) {
                    return false;
                }
                int i;
                for (i = 0; i < bAy(); i++) {
                    if (!kd(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAA(); i++) {
                    if (!ke(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAE(); i++) {
                    if (!kf(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAG(); i++) {
                    if (!kg(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAI(); i++) {
                    if (!kh(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAK(); i++) {
                    if (!ki(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAM(); i++) {
                    if (!kj(i).isInitialized()) {
                        return false;
                    }
                }
                if ((!bAO() || bAP().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: k */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Class classR;
                Throwable th;
                Class classR2 = null;
                try {
                    Class classR3 = (Class) Class.fmO.b(eVar, fVar);
                    if (classR3 != null) {
                        a(classR3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    classR = (Class) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    classR2 = classR;
                }
                if (classR2 != null) {
                    a(classR2);
                }
                throw th;
            }

            public a kk(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean bAt() {
                return (this.bitField0_ & 2) == 2;
            }

            public a kl(int i) {
                this.bitField0_ |= 2;
                this.fqName_ = i;
                return this;
            }

            public a km(int i) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i;
                return this;
            }

            private void bBa() {
                if ((this.bitField0_ & 8) != 8) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 8;
                }
            }

            public int bAy() {
                return this.typeParameter_.size();
            }

            public TypeParameter kd(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            private void bBb() {
                if ((this.bitField0_ & 16) != 16) {
                    this.supertype_ = new ArrayList(this.supertype_);
                    this.bitField0_ |= 16;
                }
            }

            public int bAA() {
                return this.supertype_.size();
            }

            public Type ke(int i) {
                return (Type) this.supertype_.get(i);
            }

            private void bBc() {
                if ((this.bitField0_ & 32) != 32) {
                    this.supertypeId_ = new ArrayList(this.supertypeId_);
                    this.bitField0_ |= 32;
                }
            }

            private void bBd() {
                if ((this.bitField0_ & 64) != 64) {
                    this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                    this.bitField0_ |= 64;
                }
            }

            private void bBe() {
                if ((this.bitField0_ & 128) != 128) {
                    this.constructor_ = new ArrayList(this.constructor_);
                    this.bitField0_ |= 128;
                }
            }

            public int bAE() {
                return this.constructor_.size();
            }

            public Constructor kf(int i) {
                return (Constructor) this.constructor_.get(i);
            }

            private void bBf() {
                if ((this.bitField0_ & 256) != 256) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 256;
                }
            }

            public int bAG() {
                return this.function_.size();
            }

            public Function kg(int i) {
                return (Function) this.function_.get(i);
            }

            private void bBg() {
                if ((this.bitField0_ & 512) != 512) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 512;
                }
            }

            public int bAI() {
                return this.property_.size();
            }

            public Property kh(int i) {
                return (Property) this.property_.get(i);
            }

            private void bBh() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 1024;
                }
            }

            public int bAK() {
                return this.typeAlias_.size();
            }

            public TypeAlias ki(int i) {
                return (TypeAlias) this.typeAlias_.get(i);
            }

            private void bBi() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.enumEntry_ = new ArrayList(this.enumEntry_);
                    this.bitField0_ |= 2048;
                }
            }

            public int bAM() {
                return this.enumEntry_.size();
            }

            public EnumEntry kj(int i) {
                return (EnumEntry) this.enumEntry_.get(i);
            }

            private void bBj() {
                if ((this.bitField0_ & 4096) != 4096) {
                    this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                    this.bitField0_ |= 4096;
                }
            }

            public boolean bAO() {
                return (this.bitField0_ & 8192) == 8192;
            }

            public TypeTable bAP() {
                return this.typeTable_;
            }

            public a a(TypeTable typeTable) {
                if ((this.bitField0_ & 8192) != 8192 || this.typeTable_ == TypeTable.bGe()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.d(this.typeTable_).a(typeTable).bGq();
                }
                this.bitField0_ |= 8192;
                return this;
            }

            private void bBk() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
            }

            public a a(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 32768) != 32768 || this.versionRequirementTable_ == VersionRequirementTable.bHb()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.c(this.versionRequirementTable_).a(versionRequirementTable).bHl();
                }
                this.bitField0_ |= 32768;
                return this;
            }
        }

        private Class(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Class, ?> bVar) {
            super(bVar);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Class bAr() {
            return fmR;
        }

        /* renamed from: bAs */
        public Class bzq() {
            return fmR;
        }

        /* JADX WARNING: Missing block: B:106:0x02c4, code skipped:
            r7 = 1;
     */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.e r18, kotlin.reflect.jvm.internal.impl.protobuf.f r19) {
            /*
            r17 = this;
            r1 = r17;
            r2 = r18;
            r3 = r19;
            r17.<init>();
            r4 = -1;
            r1.supertypeIdMemoizedSerializedSize = r4;
            r1.nestedClassNameMemoizedSerializedSize = r4;
            r1.sealedSubclassFqNameMemoizedSerializedSize = r4;
            r1.memoizedIsInitialized = r4;
            r1.memoizedSerializedSize = r4;
            r17.bzj();
            r4 = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            r5 = 1;
            r6 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.b(r4, r5);
            r7 = 0;
            r8 = 0;
        L_0x0022:
            r9 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            r10 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
            r14 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
            r15 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r5 = 16;
            r13 = 8;
            if (r7 != 0) goto L_0x038d;
        L_0x0030:
            r12 = r18.bKv();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r16 = 0;
            switch(r12) {
                case 0: goto L_0x02c3;
                case 8: goto L_0x02b6;
                case 16: goto L_0x0298;
                case 18: goto L_0x0263;
                case 24: goto L_0x0256;
                case 32: goto L_0x0249;
                case 42: goto L_0x0230;
                case 50: goto L_0x0214;
                case 56: goto L_0x01f6;
                case 58: goto L_0x01c0;
                case 66: goto L_0x01a4;
                case 74: goto L_0x0188;
                case 82: goto L_0x016c;
                case 90: goto L_0x0152;
                case 106: goto L_0x0138;
                case 128: goto L_0x011c;
                case 130: goto L_0x00e8;
                case 242: goto L_0x00bd;
                case 248: goto L_0x00a1;
                case 250: goto L_0x006b;
                case 258: goto L_0x0040;
                default: goto L_0x0039;
            };	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x0039:
            r11 = 1;
            r5 = r1.a(r2, r6, r3, r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02c6;
        L_0x0040:
            r12 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = r12 & r5;
            if (r12 != r5) goto L_0x004b;
        L_0x0045:
            r12 = r1.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r16 = r12.bzo();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x004b:
            r12 = r16;
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.versionRequirementTable_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r12 == 0) goto L_0x0064;
        L_0x0059:
            r11 = r1.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12.a(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r12.bHl();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.versionRequirementTable_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x0064:
            r11 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r11 | r5;
            r1.bitField0_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x006b:
            r11 = r18.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.lV(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = r8 & 16384;
            if (r12 == r14) goto L_0x0086;
        L_0x0077:
            r12 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r12 <= 0) goto L_0x0086;
        L_0x007d:
            r12 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.versionRequirement_ = r12;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 16384;
        L_0x0086:
            r12 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r12 <= 0) goto L_0x009c;
        L_0x008c:
            r12 = r1.versionRequirement_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r16 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = java.lang.Integer.valueOf(r16);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = 16;
            goto L_0x0086;
        L_0x009c:
            r2.lW(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x00a1:
            r5 = r8 & 16384;
            if (r5 == r14) goto L_0x00ae;
        L_0x00a5:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.versionRequirement_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 16384;
        L_0x00ae:
            r5 = r1.versionRequirement_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x00bd:
            r5 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r5 & r13;
            if (r5 != r13) goto L_0x00c8;
        L_0x00c2:
            r5 = r1.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r16 = r5.bzo();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x00c8:
            r5 = r16;
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.typeTable_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r5 == 0) goto L_0x00e1;
        L_0x00d6:
            r11 = r1.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.a(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r5.bGq();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.typeTable_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x00e1:
            r5 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r5 | r13;
            r1.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x00e8:
            r5 = r18.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r2.lV(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r8 & 4096;
            if (r11 == r15) goto L_0x0103;
        L_0x00f4:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x0103;
        L_0x00fa:
            r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.sealedSubclassFqName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 4096;
        L_0x0103:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x0117;
        L_0x0109:
            r11 = r1.sealedSubclassFqName_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = java.lang.Integer.valueOf(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.add(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x0103;
        L_0x0117:
            r2.lW(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x011c:
            r5 = r8 & 4096;
            if (r5 == r15) goto L_0x0129;
        L_0x0120:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.sealedSubclassFqName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 4096;
        L_0x0129:
            r5 = r1.sealedSubclassFqName_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0138:
            r5 = r8 & 2048;
            if (r5 == r9) goto L_0x0145;
        L_0x013c:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.enumEntry_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 2048;
        L_0x0145:
            r5 = r1.enumEntry_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0152:
            r5 = r8 & 1024;
            if (r5 == r10) goto L_0x015f;
        L_0x0156:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.typeAlias_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 1024;
        L_0x015f:
            r5 = r1.typeAlias_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x016c:
            r5 = r8 & 512;
            r11 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
            if (r5 == r11) goto L_0x017b;
        L_0x0172:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.property_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 512;
        L_0x017b:
            r5 = r1.property_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0188:
            r5 = r8 & 256;
            r11 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r5 == r11) goto L_0x0197;
        L_0x018e:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.function_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 256;
        L_0x0197:
            r5 = r1.function_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x01a4:
            r5 = r8 & 128;
            r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r5 == r11) goto L_0x01b3;
        L_0x01aa:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.constructor_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 128;
        L_0x01b3:
            r5 = r1.constructor_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x01c0:
            r5 = r18.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r2.lV(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r8 & 64;
            r12 = 64;
            if (r11 == r12) goto L_0x01dd;
        L_0x01ce:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x01dd;
        L_0x01d4:
            r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.nestedClassName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 64;
        L_0x01dd:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x01f1;
        L_0x01e3:
            r11 = r1.nestedClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = java.lang.Integer.valueOf(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.add(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x01dd;
        L_0x01f1:
            r2.lW(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x01f6:
            r5 = r8 & 64;
            r11 = 64;
            if (r5 == r11) goto L_0x0205;
        L_0x01fc:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.nestedClassName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 64;
        L_0x0205:
            r5 = r1.nestedClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0214:
            r5 = r8 & 16;
            r11 = 16;
            if (r5 == r11) goto L_0x0223;
        L_0x021a:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.supertype_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 16;
        L_0x0223:
            r5 = r1.supertype_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0230:
            r5 = r8 & 8;
            if (r5 == r13) goto L_0x023d;
        L_0x0234:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.typeParameter_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 8;
        L_0x023d:
            r5 = r1.typeParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.fmO;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r2.a(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0249:
            r5 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r5 | 4;
            r1.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.companionObjectName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0256:
            r5 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r5 | 2;
            r1.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.fqName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0263:
            r5 = r18.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r2.lV(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r8 & 32;
            r12 = 32;
            if (r11 == r12) goto L_0x0280;
        L_0x0271:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x0280;
        L_0x0277:
            r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.supertypeId_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 32;
        L_0x0280:
            r11 = r18.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            if (r11 <= 0) goto L_0x0294;
        L_0x0286:
            r11 = r1.supertypeId_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r12 = java.lang.Integer.valueOf(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11.add(r12);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x0280;
        L_0x0294:
            r2.lW(r5);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02b4;
        L_0x0298:
            r5 = r8 & 32;
            r11 = 32;
            if (r5 == r11) goto L_0x02a7;
        L_0x029e:
            r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.supertypeId_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r8 = r8 | 32;
        L_0x02a7:
            r5 = r1.supertypeId_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
        L_0x02b4:
            r11 = 1;
            goto L_0x02c9;
        L_0x02b6:
            r5 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r11 = 1;
            r5 = r5 | r11;
            r1.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r5 = r18.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            r1.flags_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x02df, IOException -> 0x02cf }
            goto L_0x02c9;
        L_0x02c3:
            r11 = 1;
        L_0x02c4:
            r7 = 1;
            goto L_0x02c9;
        L_0x02c6:
            if (r5 != 0) goto L_0x02c9;
        L_0x02c8:
            goto L_0x02c4;
        L_0x02c9:
            r5 = 1;
            goto L_0x0022;
        L_0x02cc:
            r0 = move-exception;
            r2 = r0;
            goto L_0x02e6;
        L_0x02cf:
            r0 = move-exception;
            r2 = r0;
            r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x02cc }
            r2 = r2.getMessage();	 Catch:{ all -> 0x02cc }
            r3.<init>(r2);	 Catch:{ all -> 0x02cc }
            r2 = r3.g(r1);	 Catch:{ all -> 0x02cc }
            throw r2;	 Catch:{ all -> 0x02cc }
        L_0x02df:
            r0 = move-exception;
            r2 = r0;
            r2 = r2.g(r1);	 Catch:{ all -> 0x02cc }
            throw r2;	 Catch:{ all -> 0x02cc }
        L_0x02e6:
            r3 = r8 & 32;
            r5 = 32;
            if (r3 != r5) goto L_0x02f4;
        L_0x02ec:
            r3 = r1.supertypeId_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.supertypeId_ = r3;
        L_0x02f4:
            r3 = r8 & 8;
            if (r3 != r13) goto L_0x0300;
        L_0x02f8:
            r3 = r1.typeParameter_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.typeParameter_ = r3;
        L_0x0300:
            r3 = r8 & 16;
            r5 = 16;
            if (r3 != r5) goto L_0x030e;
        L_0x0306:
            r3 = r1.supertype_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.supertype_ = r3;
        L_0x030e:
            r3 = r8 & 64;
            r5 = 64;
            if (r3 != r5) goto L_0x031c;
        L_0x0314:
            r3 = r1.nestedClassName_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.nestedClassName_ = r3;
        L_0x031c:
            r3 = r8 & 128;
            r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r3 != r5) goto L_0x032a;
        L_0x0322:
            r3 = r1.constructor_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.constructor_ = r3;
        L_0x032a:
            r3 = r8 & 256;
            r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r3 != r5) goto L_0x0338;
        L_0x0330:
            r3 = r1.function_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.function_ = r3;
        L_0x0338:
            r3 = r8 & 512;
            r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
            if (r3 != r5) goto L_0x0346;
        L_0x033e:
            r3 = r1.property_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.property_ = r3;
        L_0x0346:
            r3 = r8 & 1024;
            if (r3 != r10) goto L_0x0352;
        L_0x034a:
            r3 = r1.typeAlias_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.typeAlias_ = r3;
        L_0x0352:
            r3 = r8 & 2048;
            if (r3 != r9) goto L_0x035e;
        L_0x0356:
            r3 = r1.enumEntry_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.enumEntry_ = r3;
        L_0x035e:
            r3 = r8 & 4096;
            if (r3 != r15) goto L_0x036a;
        L_0x0362:
            r3 = r1.sealedSubclassFqName_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.sealedSubclassFqName_ = r3;
        L_0x036a:
            r3 = r8 & 16384;
            if (r3 != r14) goto L_0x0376;
        L_0x036e:
            r3 = r1.versionRequirement_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.versionRequirement_ = r3;
        L_0x0376:
            r6.flush();	 Catch:{ IOException -> 0x0379, all -> 0x0380 }
        L_0x0379:
            r3 = r4.bKt();
            r1.unknownFields = r3;
            goto L_0x0389;
        L_0x0380:
            r0 = move-exception;
            r2 = r0;
            r3 = r4.bKt();
            r1.unknownFields = r3;
            throw r2;
        L_0x0389:
            r17.bLe();
            throw r2;
        L_0x038d:
            r2 = r8 & 32;
            r3 = 32;
            if (r2 != r3) goto L_0x039b;
        L_0x0393:
            r2 = r1.supertypeId_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.supertypeId_ = r2;
        L_0x039b:
            r2 = r8 & 8;
            if (r2 != r13) goto L_0x03a7;
        L_0x039f:
            r2 = r1.typeParameter_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.typeParameter_ = r2;
        L_0x03a7:
            r2 = r8 & 16;
            r3 = 16;
            if (r2 != r3) goto L_0x03b5;
        L_0x03ad:
            r2 = r1.supertype_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.supertype_ = r2;
        L_0x03b5:
            r2 = r8 & 64;
            r3 = 64;
            if (r2 != r3) goto L_0x03c3;
        L_0x03bb:
            r2 = r1.nestedClassName_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.nestedClassName_ = r2;
        L_0x03c3:
            r2 = r8 & 128;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r2 != r3) goto L_0x03d1;
        L_0x03c9:
            r2 = r1.constructor_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.constructor_ = r2;
        L_0x03d1:
            r2 = r8 & 256;
            r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r2 != r3) goto L_0x03df;
        L_0x03d7:
            r2 = r1.function_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.function_ = r2;
        L_0x03df:
            r2 = r8 & 512;
            r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
            if (r2 != r3) goto L_0x03ed;
        L_0x03e5:
            r2 = r1.property_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.property_ = r2;
        L_0x03ed:
            r2 = r8 & 1024;
            if (r2 != r10) goto L_0x03f9;
        L_0x03f1:
            r2 = r1.typeAlias_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.typeAlias_ = r2;
        L_0x03f9:
            r2 = r8 & 2048;
            if (r2 != r9) goto L_0x0405;
        L_0x03fd:
            r2 = r1.enumEntry_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.enumEntry_ = r2;
        L_0x0405:
            r2 = r8 & 4096;
            if (r2 != r15) goto L_0x0411;
        L_0x0409:
            r2 = r1.sealedSubclassFqName_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.sealedSubclassFqName_ = r2;
        L_0x0411:
            r2 = r8 & 16384;
            if (r2 != r14) goto L_0x041d;
        L_0x0415:
            r2 = r1.versionRequirement_;
            r2 = java.util.Collections.unmodifiableList(r2);
            r1.versionRequirement_ = r2;
        L_0x041d:
            r6.flush();	 Catch:{ IOException -> 0x0420, all -> 0x0427 }
        L_0x0420:
            r2 = r4.bKt();
            r1.unknownFields = r2;
            goto L_0x0430;
        L_0x0427:
            r0 = move-exception;
            r2 = r0;
            r3 = r4.bKt();
            r1.unknownFields = r3;
            throw r2;
        L_0x0430:
            r17.bLe();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
        }

        static {
            fmR.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Class> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean bAt() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bAu() {
            return this.fqName_;
        }

        public boolean bAv() {
            return (this.bitField0_ & 4) == 4;
        }

        public int bAw() {
            return this.companionObjectName_;
        }

        public List<TypeParameter> bAx() {
            return this.typeParameter_;
        }

        public int bAy() {
            return this.typeParameter_.size();
        }

        public TypeParameter kd(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public List<Type> bAz() {
            return this.supertype_;
        }

        public int bAA() {
            return this.supertype_.size();
        }

        public Type ke(int i) {
            return (Type) this.supertype_.get(i);
        }

        public List<Integer> bAB() {
            return this.supertypeId_;
        }

        public List<Integer> bAC() {
            return this.nestedClassName_;
        }

        public List<Constructor> bAD() {
            return this.constructor_;
        }

        public int bAE() {
            return this.constructor_.size();
        }

        public Constructor kf(int i) {
            return (Constructor) this.constructor_.get(i);
        }

        public List<Function> bAF() {
            return this.function_;
        }

        public int bAG() {
            return this.function_.size();
        }

        public Function kg(int i) {
            return (Function) this.function_.get(i);
        }

        public List<Property> bAH() {
            return this.property_;
        }

        public int bAI() {
            return this.property_.size();
        }

        public Property kh(int i) {
            return (Property) this.property_.get(i);
        }

        public List<TypeAlias> bAJ() {
            return this.typeAlias_;
        }

        public int bAK() {
            return this.typeAlias_.size();
        }

        public TypeAlias ki(int i) {
            return (TypeAlias) this.typeAlias_.get(i);
        }

        public List<EnumEntry> bAL() {
            return this.enumEntry_;
        }

        public int bAM() {
            return this.enumEntry_.size();
        }

        public EnumEntry kj(int i) {
            return (EnumEntry) this.enumEntry_.get(i);
        }

        public List<Integer> bAN() {
            return this.sealedSubclassFqName_;
        }

        public boolean bAO() {
            return (this.bitField0_ & 8) == 8;
        }

        public TypeTable bAP() {
            return this.typeTable_;
        }

        public List<Integer> bAQ() {
            return this.versionRequirement_;
        }

        public boolean bAR() {
            return (this.bitField0_ & 16) == 16;
        }

        public VersionRequirementTable bAS() {
            return this.versionRequirementTable_;
        }

        private void bzj() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.supertype_ = Collections.emptyList();
            this.supertypeId_ = Collections.emptyList();
            this.nestedClassName_ = Collections.emptyList();
            this.constructor_ = Collections.emptyList();
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.enumEntry_ = Collections.emptyList();
            this.sealedSubclassFqName_ = Collections.emptyList();
            this.typeTable_ = TypeTable.bGe();
            this.versionRequirement_ = Collections.emptyList();
            this.versionRequirementTable_ = VersionRequirementTable.bHb();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (bAt()) {
                int i = 0;
                while (i < bAy()) {
                    if (kd(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAA()) {
                    if (ke(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAE()) {
                    if (kf(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAG()) {
                    if (kg(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAI()) {
                    if (kh(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAK()) {
                    if (ki(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                i = 0;
                while (i < bAM()) {
                    if (kj(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (bAO() && !bAP().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (bLi()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            int i;
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.flags_);
            }
            if (bAB().size() > 0) {
                codedOutputStream.K(18);
                codedOutputStream.K(this.supertypeIdMemoizedSerializedSize);
            }
            int i2 = 0;
            for (i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.A(((Integer) this.supertypeId_.get(i)).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.bk(4, this.companionObjectName_);
            }
            for (i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.b(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            for (i = 0; i < this.supertype_.size(); i++) {
                codedOutputStream.b(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.supertype_.get(i));
            }
            if (bAC().size() > 0) {
                codedOutputStream.K(58);
                codedOutputStream.K(this.nestedClassNameMemoizedSerializedSize);
            }
            for (i = 0; i < this.nestedClassName_.size(); i++) {
                codedOutputStream.A(((Integer) this.nestedClassName_.get(i)).intValue());
            }
            for (i = 0; i < this.constructor_.size(); i++) {
                codedOutputStream.b(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.constructor_.get(i));
            }
            for (i = 0; i < this.function_.size(); i++) {
                codedOutputStream.b(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.function_.get(i));
            }
            for (i = 0; i < this.property_.size(); i++) {
                codedOutputStream.b(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.property_.get(i));
            }
            for (i = 0; i < this.typeAlias_.size(); i++) {
                codedOutputStream.b(11, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeAlias_.get(i));
            }
            for (i = 0; i < this.enumEntry_.size(); i++) {
                codedOutputStream.b(13, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.enumEntry_.get(i));
            }
            if (bAN().size() > 0) {
                codedOutputStream.K(130);
                codedOutputStream.K(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (i = 0; i < this.sealedSubclassFqName_.size(); i++) {
                codedOutputStream.A(((Integer) this.sealedSubclassFqName_.get(i)).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.b(30, this.typeTable_);
            }
            while (i2 < this.versionRequirement_.size()) {
                codedOutputStream.bk(31, ((Integer) this.versionRequirement_.get(i2)).intValue());
                i2++;
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.b(32, this.versionRequirementTable_);
            }
            bLj.b(19000, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.flags_) + 0 : 0;
            int i4 = 0;
            for (i2 = 0; i2 < this.supertypeId_.size(); i2++) {
                i4 += CodedOutputStream.E(((Integer) this.supertypeId_.get(i2)).intValue());
            }
            i += i4;
            if (!bAB().isEmpty()) {
                i = (i + 1) + CodedOutputStream.E(i4);
            }
            this.supertypeIdMemoizedSerializedSize = i4;
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.bl(4, this.companionObjectName_);
            }
            i2 = i;
            for (i = 0; i < this.typeParameter_.size(); i++) {
                i2 += CodedOutputStream.d(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            for (i = 0; i < this.supertype_.size(); i++) {
                i2 += CodedOutputStream.d(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.supertype_.get(i));
            }
            int i5 = 0;
            for (i = 0; i < this.nestedClassName_.size(); i++) {
                i5 += CodedOutputStream.E(((Integer) this.nestedClassName_.get(i)).intValue());
            }
            i2 += i5;
            if (!bAC().isEmpty()) {
                i2 = (i2 + 1) + CodedOutputStream.E(i5);
            }
            this.nestedClassNameMemoizedSerializedSize = i5;
            for (i = 0; i < this.constructor_.size(); i++) {
                i2 += CodedOutputStream.d(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.constructor_.get(i));
            }
            for (i = 0; i < this.function_.size(); i++) {
                i2 += CodedOutputStream.d(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.function_.get(i));
            }
            for (i = 0; i < this.property_.size(); i++) {
                i2 += CodedOutputStream.d(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.property_.get(i));
            }
            for (i = 0; i < this.typeAlias_.size(); i++) {
                i2 += CodedOutputStream.d(11, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeAlias_.get(i));
            }
            for (i = 0; i < this.enumEntry_.size(); i++) {
                i2 += CodedOutputStream.d(13, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.enumEntry_.get(i));
            }
            i5 = 0;
            for (i = 0; i < this.sealedSubclassFqName_.size(); i++) {
                i5 += CodedOutputStream.E(((Integer) this.sealedSubclassFqName_.get(i)).intValue());
            }
            i2 += i5;
            if (!bAN().isEmpty()) {
                i2 = (i2 + 2) + CodedOutputStream.E(i5);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = i5;
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.d(30, this.typeTable_);
            }
            i = 0;
            while (i3 < this.versionRequirement_.size()) {
                i += CodedOutputStream.E(((Integer) this.versionRequirement_.get(i3)).intValue());
                i3++;
            }
            i2 = (i2 + i) + (bAQ().size() * 2);
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.d(32, this.versionRequirementTable_);
            }
            i2 = (i2 + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public static Class a(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return (Class) fmO.k(inputStream, fVar);
        }

        public static a bAT() {
            return a.bAW();
        }

        /* renamed from: bAU */
        public a bzp() {
            return bAT();
        }

        public static a a(Class classR) {
            return bAT().a(classR);
        }

        /* renamed from: bAV */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Constructor extends ExtendableMessage<Constructor> implements c {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Constructor> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Constructor>() {
            /* renamed from: l */
            public Constructor b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Constructor(eVar, fVar);
            }
        };
        private static final Constructor fmS = new Constructor(true);
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Constructor, a> implements c {
            private int bitField0_;
            private int flags_ = 6;
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bBu() {
                return new a();
            }

            /* renamed from: bBv */
            public a clone() {
                return bBu().a(bBx());
            }

            /* renamed from: bBo */
            public Constructor bzq() {
                return Constructor.bBn();
            }

            /* renamed from: bBw */
            public Constructor bzG() {
                Constructor bBx = bBx();
                if (bBx.isInitialized()) {
                    return bBx;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bBx);
            }

            public Constructor bBx() {
                Constructor constructor = new Constructor((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                constructor.flags_ = this.flags_;
                if ((this.bitField0_ & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                constructor.versionRequirement_ = this.versionRequirement_;
                constructor.bitField0_ = i;
                return constructor;
            }

            /* renamed from: e */
            public a a(Constructor constructor) {
                if (constructor == Constructor.bBn()) {
                    return this;
                }
                if (constructor.bAb()) {
                    kp(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        bBy();
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        bBk();
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                a((ExtendableMessage) constructor);
                e(bLf().a(constructor.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bBq(); i++) {
                    if (!ko(i).isInitialized()) {
                        return false;
                    }
                }
                if (bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: m */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Constructor constructor;
                Throwable th;
                Constructor constructor2 = null;
                try {
                    Constructor constructor3 = (Constructor) Constructor.fmO.b(eVar, fVar);
                    if (constructor3 != null) {
                        a(constructor3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    constructor = (Constructor) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    constructor2 = constructor;
                }
                if (constructor2 != null) {
                    a(constructor2);
                }
                throw th;
            }

            public a kp(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            private void bBy() {
                if ((this.bitField0_ & 2) != 2) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2;
                }
            }

            public int bBq() {
                return this.valueParameter_.size();
            }

            public ValueParameter ko(int i) {
                return (ValueParameter) this.valueParameter_.get(i);
            }

            private void bBk() {
                if ((this.bitField0_ & 4) != 4) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 4;
                }
            }
        }

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Constructor, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Constructor bBn() {
            return fmS;
        }

        /* renamed from: bBo */
        public Constructor bzq() {
            return fmS;
        }

        private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            this.flags_ = eVar.bKy();
                        } else if (bKv == 18) {
                            if ((i & 2) != 2) {
                                this.valueParameter_ = new ArrayList();
                                i |= 2;
                            }
                            this.valueParameter_.add(eVar.a(ValueParameter.fmO, fVar));
                        } else if (bKv == 248) {
                            if ((i & 4) != 4) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                        } else if (bKv == Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 4) != 4 && eVar.bKQ() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            while (eVar.bKQ() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
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
                    if ((i & 2) == 2) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i & 4) == 4) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            if ((i & 2) == 2) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 4) == 4) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            fmS.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Constructor> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public List<ValueParameter> bBp() {
            return this.valueParameter_;
        }

        public int bBq() {
            return this.valueParameter_.size();
        }

        public ValueParameter ko(int i) {
            return (ValueParameter) this.valueParameter_.get(i);
        }

        public List<Integer> bAQ() {
            return this.versionRequirement_;
        }

        private void bzj() {
            this.flags_ = 6;
            this.valueParameter_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bBq()) {
                if (ko(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (bLi()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.b(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.bk(31, ((Integer) this.versionRequirement_.get(i2)).intValue());
            }
            bLj.b(19000, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int bl = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.flags_) + 0 : 0;
            for (i = 0; i < this.valueParameter_.size(); i++) {
                bl += CodedOutputStream.d(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.valueParameter_.get(i));
            }
            i = 0;
            while (i2 < this.versionRequirement_.size()) {
                i += CodedOutputStream.E(((Integer) this.versionRequirement_.get(i2)).intValue());
                i2++;
            }
            bl = (((bl + i) + (bAQ().size() * 2)) + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = bl;
            return bl;
        }

        public static a bBr() {
            return a.bBu();
        }

        /* renamed from: bBs */
        public a bzp() {
            return bBr();
        }

        public static a a(Constructor constructor) {
            return bBr().a(constructor);
        }

        /* renamed from: bBt */
        public a bzo() {
            return a(this);
        }
    }

    public static final class EnumEntry extends ExtendableMessage<EnumEntry> implements f {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<EnumEntry> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<EnumEntry>() {
            /* renamed from: r */
            public EnumEntry b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new EnumEntry(eVar, fVar);
            }
        };
        private static final EnumEntry fmV = new EnumEntry(true);
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<EnumEntry, a> implements f {
            private int bitField0_;
            private int name_;

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bCk() {
                return new a();
            }

            /* renamed from: bCl */
            public a clone() {
                return bCk().a(bCn());
            }

            /* renamed from: bCf */
            public EnumEntry bzq() {
                return EnumEntry.bCe();
            }

            /* renamed from: bCm */
            public EnumEntry bzG() {
                EnumEntry bCn = bCn();
                if (bCn.isInitialized()) {
                    return bCn;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bCn);
            }

            public EnumEntry bCn() {
                EnumEntry enumEntry = new EnumEntry((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                enumEntry.name_ = this.name_;
                enumEntry.bitField0_ = i;
                return enumEntry;
            }

            /* renamed from: c */
            public a a(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.bCe()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    ku(enumEntry.bCg());
                }
                a((ExtendableMessage) enumEntry);
                e(bLf().a(enumEntry.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                return bLi();
            }

            /* renamed from: s */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                EnumEntry enumEntry;
                Throwable th;
                EnumEntry enumEntry2 = null;
                try {
                    EnumEntry enumEntry3 = (EnumEntry) EnumEntry.fmO.b(eVar, fVar);
                    if (enumEntry3 != null) {
                        a(enumEntry3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    enumEntry = (EnumEntry) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    enumEntry2 = enumEntry;
                }
                if (enumEntry2 != null) {
                    a(enumEntry2);
                }
                throw th;
            }

            public a ku(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }
        }

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<EnumEntry, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static EnumEntry bCe() {
            return fmV;
        }

        /* renamed from: bCf */
        public EnumEntry bzq() {
            return fmV;
        }

        private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
            fmV.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<EnumEntry> bzg() {
            return fmO;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int bCg() {
            return this.name_;
        }

        private void bzj() {
            this.name_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (bLi()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.name_);
            }
            bLj.b(200, codedOutputStream);
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
            i = (i + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bCh() {
            return a.bCk();
        }

        /* renamed from: bCi */
        public a bzp() {
            return bCh();
        }

        public static a a(EnumEntry enumEntry) {
            return bCh().a(enumEntry);
        }

        /* renamed from: bCj */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Function extends ExtendableMessage<Function> implements h {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Function> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Function>() {
            /* renamed from: v */
            public Function b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Function(eVar, fVar);
            }
        };
        private static final Function fmX = new Function(true);
        private int bitField0_;
        private Contract contract_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Function, a> implements h {
            private int bitField0_;
            private Contract contract_ = Contract.bBA();
            private int flags_ = 6;
            private int name_;
            private int oldFlags_ = 6;
            private int receiverTypeId_;
            private Type receiverType_ = Type.bEu();
            private int returnTypeId_;
            private Type returnType_ = Type.bEu();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.bGe();
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bDc() {
                return new a();
            }

            /* renamed from: bDd */
            public a clone() {
                return bDc().a(bDf());
            }

            /* renamed from: bCM */
            public Function bzq() {
                return Function.bCL();
            }

            /* renamed from: bDe */
            public Function bzG() {
                Function bDf = bDf();
                if (bDf.isInitialized()) {
                    return bDf;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bDf);
            }

            public Function bDf() {
                Function function = new Function((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                function.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                function.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -257;
                }
                function.valueParameter_ = this.valueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 128;
                }
                function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -1025;
                }
                function.versionRequirement_ = this.versionRequirement_;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                function.contract_ = this.contract_;
                function.bitField0_ = i2;
                return function;
            }

            /* renamed from: f */
            public a a(Function function) {
                if (function == Function.bCL()) {
                    return this;
                }
                if (function.bAb()) {
                    kB(function.getFlags());
                }
                if (function.bCN()) {
                    kC(function.bCO());
                }
                if (function.hasName()) {
                    kD(function.bCg());
                }
                if (function.bCP()) {
                    b(function.bCQ());
                }
                if (function.bCR()) {
                    kE(function.bCS());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        bBa();
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.bCT()) {
                    c(function.bCU());
                }
                if (function.bCV()) {
                    kF(function.bCW());
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -257;
                    } else {
                        bBy();
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.bAO()) {
                    b(function.bAP());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -1025;
                    } else {
                        bBk();
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.bCX()) {
                    e(function.bCY());
                }
                a((ExtendableMessage) function);
                e(bLf().a(function.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (bCP() && !bCQ().isInitialized()) {
                    return false;
                }
                int i;
                for (i = 0; i < bAy(); i++) {
                    if (!kd(i).isInitialized()) {
                        return false;
                    }
                }
                if (bCT() && !bCU().isInitialized()) {
                    return false;
                }
                for (i = 0; i < bBq(); i++) {
                    if (!ko(i).isInitialized()) {
                        return false;
                    }
                }
                if (bAO() && !bAP().isInitialized()) {
                    return false;
                }
                if ((!bCX() || bCY().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: w */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Function function;
                Throwable th;
                Function function2 = null;
                try {
                    Function function3 = (Function) Function.fmO.b(eVar, fVar);
                    if (function3 != null) {
                        a(function3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    function = (Function) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    function2 = function;
                }
                if (function2 != null) {
                    a(function2);
                }
                throw th;
            }

            public a kB(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public a kC(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public a kD(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public boolean bCP() {
                return (this.bitField0_ & 8) == 8;
            }

            public Type bCQ() {
                return this.returnType_;
            }

            public a b(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.bEu()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.f(this.returnType_).a(type).bFo();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public a kE(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void bBa() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public int bAy() {
                return this.typeParameter_.size();
            }

            public TypeParameter kd(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public boolean bCT() {
                return (this.bitField0_ & 64) == 64;
            }

            public Type bCU() {
                return this.receiverType_;
            }

            public a c(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.bEu()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.f(this.receiverType_).a(type).bFo();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public a kF(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            private void bBy() {
                if ((this.bitField0_ & 256) != 256) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 256;
                }
            }

            public int bBq() {
                return this.valueParameter_.size();
            }

            public ValueParameter ko(int i) {
                return (ValueParameter) this.valueParameter_.get(i);
            }

            public boolean bAO() {
                return (this.bitField0_ & 512) == 512;
            }

            public TypeTable bAP() {
                return this.typeTable_;
            }

            public a b(TypeTable typeTable) {
                if ((this.bitField0_ & 512) != 512 || this.typeTable_ == TypeTable.bGe()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.d(this.typeTable_).a(typeTable).bGq();
                }
                this.bitField0_ |= 512;
                return this;
            }

            private void bBk() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 1024;
                }
            }

            public boolean bCX() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public Contract bCY() {
                return this.contract_;
            }

            public a e(Contract contract) {
                if ((this.bitField0_ & 2048) != 2048 || this.contract_ == Contract.bBA()) {
                    this.contract_ = contract;
                } else {
                    this.contract_ = Contract.a(this.contract_).a(contract).bBJ();
                }
                this.bitField0_ |= 2048;
                return this;
            }
        }

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Function, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Function(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Function bCL() {
            return fmX;
        }

        /* renamed from: bCM */
        public Function bzq() {
            return fmX;
        }

        private Function(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                    b bVar = null;
                    switch (bKv) {
                        case 0:
                            obj = 1;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = eVar.bKy();
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = eVar.bKy();
                            break;
                        case 26:
                            if ((this.bitField0_ & 8) == 8) {
                                bVar = this.returnType_.bzo();
                            }
                            this.returnType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.returnType_);
                                this.returnType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 8;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i |= 32;
                            }
                            this.typeParameter_.add(eVar.a(TypeParameter.fmO, fVar));
                            break;
                        case 42:
                            if ((this.bitField0_ & 32) == 32) {
                                bVar = this.receiverType_.bzo();
                            }
                            this.receiverType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.receiverType_);
                                this.receiverType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 32;
                            break;
                        case 50:
                            if ((i & 256) != 256) {
                                this.valueParameter_ = new ArrayList();
                                i |= 256;
                            }
                            this.valueParameter_.add(eVar.a(ValueParameter.fmO, fVar));
                            break;
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = eVar.bKy();
                            break;
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = eVar.bKy();
                            break;
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = eVar.bKy();
                            break;
                        case 242:
                            a bGm;
                            if ((this.bitField0_ & 128) == 128) {
                                bGm = this.typeTable_.bzo();
                            }
                            this.typeTable_ = (TypeTable) eVar.a(TypeTable.fmO, fVar);
                            if (bGm != null) {
                                bGm.a(this.typeTable_);
                                this.typeTable_ = bGm.bGq();
                            }
                            this.bitField0_ |= 128;
                            break;
                        case 248:
                            if ((i & 1024) != 1024) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 1024;
                            }
                            this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            break;
                        case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 1024) != 1024 && eVar.bKQ() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 1024;
                            }
                            while (eVar.bKQ() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            }
                            eVar.lW(bKv);
                            break;
                        case 258:
                            a bBF;
                            if ((this.bitField0_ & 256) == 256) {
                                bBF = this.contract_.bzo();
                            }
                            this.contract_ = (Contract) eVar.a(Contract.fmO, fVar);
                            if (bBF != null) {
                                bBF.a(this.contract_);
                                this.contract_ = bBF.bBJ();
                            }
                            this.bitField0_ |= 256;
                            break;
                        default:
                            if (a(eVar, b, fVar, bKv)) {
                                break;
                            }
                            obj = 1;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 256) == 256) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i & 1024) == 1024) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            if ((i & 32) == 32) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 256) == 256) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 1024) == 1024) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            fmX.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Function> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean bCN() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCO() {
            return this.oldFlags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean bCP() {
            return (this.bitField0_ & 8) == 8;
        }

        public Type bCQ() {
            return this.returnType_;
        }

        public boolean bCR() {
            return (this.bitField0_ & 16) == 16;
        }

        public int bCS() {
            return this.returnTypeId_;
        }

        public List<TypeParameter> bAx() {
            return this.typeParameter_;
        }

        public int bAy() {
            return this.typeParameter_.size();
        }

        public TypeParameter kd(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public boolean bCT() {
            return (this.bitField0_ & 32) == 32;
        }

        public Type bCU() {
            return this.receiverType_;
        }

        public boolean bCV() {
            return (this.bitField0_ & 64) == 64;
        }

        public int bCW() {
            return this.receiverTypeId_;
        }

        public List<ValueParameter> bBp() {
            return this.valueParameter_;
        }

        public int bBq() {
            return this.valueParameter_.size();
        }

        public ValueParameter ko(int i) {
            return (ValueParameter) this.valueParameter_.get(i);
        }

        public boolean bAO() {
            return (this.bitField0_ & 128) == 128;
        }

        public TypeTable bAP() {
            return this.typeTable_;
        }

        public List<Integer> bAQ() {
            return this.versionRequirement_;
        }

        public boolean bCX() {
            return (this.bitField0_ & 256) == 256;
        }

        public Contract bCY() {
            return this.contract_;
        }

        private void bzj() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.bEu();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.bEu();
            this.receiverTypeId_ = 0;
            this.valueParameter_ = Collections.emptyList();
            this.typeTable_ = TypeTable.bGe();
            this.versionRequirement_ = Collections.emptyList();
            this.contract_ = Contract.bBA();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!bCP() || bCQ().isInitialized()) {
                int i = 0;
                while (i < bAy()) {
                    if (kd(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (!bCT() || bCU().isInitialized()) {
                    i = 0;
                    while (i < bBq()) {
                        if (ko(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (bAO() && !bAP().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (bCX() && !bCY().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (bLi()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.bk(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.b(3, this.returnType_);
            }
            int i = 0;
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.b(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.b(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                codedOutputStream.b(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.bk(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.bk(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.b(30, this.typeTable_);
            }
            while (i < this.versionRequirement_.size()) {
                codedOutputStream.bk(31, ((Integer) this.versionRequirement_.get(i)).intValue());
                i++;
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.b(32, this.contract_);
            }
            bLj.b(19000, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 2) == 2 ? CodedOutputStream.bl(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.bl(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.d(3, this.returnType_);
            }
            int i3 = i;
            for (i = 0; i < this.typeParameter_.size(); i++) {
                i3 += CodedOutputStream.d(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                i3 += CodedOutputStream.d(5, this.receiverType_);
            }
            for (i = 0; i < this.valueParameter_.size(); i++) {
                i3 += CodedOutputStream.d(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.valueParameter_.get(i));
            }
            if ((this.bitField0_ & 16) == 16) {
                i3 += CodedOutputStream.bl(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i3 += CodedOutputStream.bl(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                i3 += CodedOutputStream.bl(9, this.flags_);
            }
            if ((this.bitField0_ & 128) == 128) {
                i3 += CodedOutputStream.d(30, this.typeTable_);
            }
            i = 0;
            while (i2 < this.versionRequirement_.size()) {
                i += CodedOutputStream.E(((Integer) this.versionRequirement_.get(i2)).intValue());
                i2++;
            }
            i3 = (i3 + i) + (bAQ().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                i3 += CodedOutputStream.d(32, this.contract_);
            }
            i3 = (i3 + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static Function b(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return (Function) fmO.k(inputStream, fVar);
        }

        public static a bCZ() {
            return a.bDc();
        }

        /* renamed from: bDa */
        public a bzp() {
            return bCZ();
        }

        public static a a(Function function) {
            return bCZ().a(function);
        }

        /* renamed from: bDb */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Package extends ExtendableMessage<Package> implements i {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Package> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Package>() {
            /* renamed from: x */
            public Package b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Package(eVar, fVar);
            }
        };
        private static final Package fmY = new Package(true);
        private int bitField0_;
        private List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Property> property_;
        private List<TypeAlias> typeAlias_;
        private TypeTable typeTable_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private VersionRequirementTable versionRequirementTable_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Package, a> implements i {
            private int bitField0_;
            private List<Function> function_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.bGe();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.bHb();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bDm() {
                return new a();
            }

            /* renamed from: bDn */
            public a clone() {
                return bDm().a(bDp());
            }

            /* renamed from: bDi */
            public Package bzq() {
                return Package.bDh();
            }

            /* renamed from: bDo */
            public Package bzG() {
                Package bDp = bDp();
                if (bDp.isInitialized()) {
                    return bDp;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bDp);
            }

            public Package bDp() {
                Package packageR = new Package((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                packageR.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                packageR.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                packageR.typeAlias_ = this.typeAlias_;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                packageR.typeTable_ = this.typeTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                packageR.versionRequirementTable_ = this.versionRequirementTable_;
                packageR.bitField0_ = i2;
                return packageR;
            }

            /* renamed from: f */
            public a a(Package packageR) {
                if (packageR == Package.bDh()) {
                    return this;
                }
                if (!packageR.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = packageR.function_;
                        this.bitField0_ &= -2;
                    } else {
                        bBf();
                        this.function_.addAll(packageR.function_);
                    }
                }
                if (!packageR.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = packageR.property_;
                        this.bitField0_ &= -3;
                    } else {
                        bBg();
                        this.property_.addAll(packageR.property_);
                    }
                }
                if (!packageR.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = packageR.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        bBh();
                        this.typeAlias_.addAll(packageR.typeAlias_);
                    }
                }
                if (packageR.bAO()) {
                    c(packageR.bAP());
                }
                if (packageR.bAR()) {
                    b(packageR.bAS());
                }
                a((ExtendableMessage) packageR);
                e(bLf().a(packageR.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < bAG(); i++) {
                    if (!kg(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAI(); i++) {
                    if (!kh(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bAK(); i++) {
                    if (!ki(i).isInitialized()) {
                        return false;
                    }
                }
                if ((!bAO() || bAP().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: y */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Package packageR;
                Throwable th;
                Package packageR2 = null;
                try {
                    Package packageR3 = (Package) Package.fmO.b(eVar, fVar);
                    if (packageR3 != null) {
                        a(packageR3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    packageR = (Package) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    packageR2 = packageR;
                }
                if (packageR2 != null) {
                    a(packageR2);
                }
                throw th;
            }

            private void bBf() {
                if ((this.bitField0_ & 1) != 1) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 1;
                }
            }

            public int bAG() {
                return this.function_.size();
            }

            public Function kg(int i) {
                return (Function) this.function_.get(i);
            }

            private void bBg() {
                if ((this.bitField0_ & 2) != 2) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 2;
                }
            }

            public int bAI() {
                return this.property_.size();
            }

            public Property kh(int i) {
                return (Property) this.property_.get(i);
            }

            private void bBh() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4;
                }
            }

            public int bAK() {
                return this.typeAlias_.size();
            }

            public TypeAlias ki(int i) {
                return (TypeAlias) this.typeAlias_.get(i);
            }

            public boolean bAO() {
                return (this.bitField0_ & 8) == 8;
            }

            public TypeTable bAP() {
                return this.typeTable_;
            }

            public a c(TypeTable typeTable) {
                if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.bGe()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.d(this.typeTable_).a(typeTable).bGq();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public a b(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.bHb()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.c(this.versionRequirementTable_).a(versionRequirementTable).bHl();
                }
                this.bitField0_ |= 16;
                return this;
            }
        }

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Package, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Package bDh() {
            return fmY;
        }

        /* renamed from: bDi */
        public Package bzq() {
            return fmY;
        }

        private Package(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                        if (bKv == 26) {
                            if ((i & 1) != 1) {
                                this.function_ = new ArrayList();
                                i |= 1;
                            }
                            this.function_.add(eVar.a(Function.fmO, fVar));
                        } else if (bKv == 34) {
                            if ((i & 2) != 2) {
                                this.property_ = new ArrayList();
                                i |= 2;
                            }
                            this.property_.add(eVar.a(Property.fmO, fVar));
                        } else if (bKv != 42) {
                            a aVar = null;
                            if (bKv == 242) {
                                if ((this.bitField0_ & 1) == 1) {
                                    aVar = this.typeTable_.bzo();
                                }
                                this.typeTable_ = (TypeTable) eVar.a(TypeTable.fmO, fVar);
                                if (aVar != null) {
                                    aVar.a(this.typeTable_);
                                    this.typeTable_ = aVar.bGq();
                                }
                                this.bitField0_ |= 1;
                            } else if (bKv == 258) {
                                a bHh;
                                if ((this.bitField0_ & 2) == 2) {
                                    bHh = this.versionRequirementTable_.bzo();
                                }
                                this.versionRequirementTable_ = (VersionRequirementTable) eVar.a(VersionRequirementTable.fmO, fVar);
                                if (bHh != null) {
                                    bHh.a(this.versionRequirementTable_);
                                    this.versionRequirementTable_ = bHh.bHl();
                                }
                                this.bitField0_ |= 2;
                            } else if (a(eVar, b, fVar, bKv)) {
                            }
                        } else {
                            if ((i & 4) != 4) {
                                this.typeAlias_ = new ArrayList();
                                i |= 4;
                            }
                            this.typeAlias_.add(eVar.a(TypeAlias.fmO, fVar));
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if ((i & 2) == 2) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if ((i & 4) == 4) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if ((i & 2) == 2) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if ((i & 4) == 4) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
            fmY.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Package> bzg() {
            return fmO;
        }

        public List<Function> bAF() {
            return this.function_;
        }

        public int bAG() {
            return this.function_.size();
        }

        public Function kg(int i) {
            return (Function) this.function_.get(i);
        }

        public List<Property> bAH() {
            return this.property_;
        }

        public int bAI() {
            return this.property_.size();
        }

        public Property kh(int i) {
            return (Property) this.property_.get(i);
        }

        public List<TypeAlias> bAJ() {
            return this.typeAlias_;
        }

        public int bAK() {
            return this.typeAlias_.size();
        }

        public TypeAlias ki(int i) {
            return (TypeAlias) this.typeAlias_.get(i);
        }

        public boolean bAO() {
            return (this.bitField0_ & 1) == 1;
        }

        public TypeTable bAP() {
            return this.typeTable_;
        }

        public boolean bAR() {
            return (this.bitField0_ & 2) == 2;
        }

        public VersionRequirementTable bAS() {
            return this.versionRequirementTable_;
        }

        private void bzj() {
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.typeTable_ = TypeTable.bGe();
            this.versionRequirementTable_ = VersionRequirementTable.bHb();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bAG()) {
                if (kg(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < bAI()) {
                if (kh(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < bAK()) {
                if (ki(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (bAO() && !bAP().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bLi()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            int i;
            bzk();
            a bLj = bLj();
            for (i = 0; i < this.function_.size(); i++) {
                codedOutputStream.b(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.function_.get(i));
            }
            for (i = 0; i < this.property_.size(); i++) {
                codedOutputStream.b(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.property_.get(i));
            }
            for (int i2 = 0; i2 < this.typeAlias_.size(); i2++) {
                codedOutputStream.b(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeAlias_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.b(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.b(32, this.versionRequirementTable_);
            }
            bLj.b(200, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3 = 0;
            for (i2 = 0; i2 < this.function_.size(); i2++) {
                i3 += CodedOutputStream.d(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.function_.get(i2));
            }
            for (i2 = 0; i2 < this.property_.size(); i2++) {
                i3 += CodedOutputStream.d(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.property_.get(i2));
            }
            for (i = 0; i < this.typeAlias_.size(); i++) {
                i3 += CodedOutputStream.d(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeAlias_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                i3 += CodedOutputStream.d(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i3 += CodedOutputStream.d(32, this.versionRequirementTable_);
            }
            i3 = (i3 + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static Package c(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return (Package) fmO.k(inputStream, fVar);
        }

        public static a bDj() {
            return a.bDm();
        }

        /* renamed from: bDk */
        public a bzp() {
            return bDj();
        }

        public static a a(Package packageR) {
            return bDj().a(packageR);
        }

        /* renamed from: bDl */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Property extends ExtendableMessage<Property> implements j {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Property> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Property>() {
            /* renamed from: z */
            public Property b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Property(eVar, fVar);
            }
        };
        private static final Property fmZ = new Property(true);
        private int bitField0_;
        private int flags_;
        private int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private int setterFlags_;
        private ValueParameter setterValueParameter_;
        private List<TypeParameter> typeParameter_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private List<Integer> versionRequirement_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Property, a> implements j {
            private int bitField0_;
            private int flags_ = 518;
            private int getterFlags_;
            private int name_;
            private int oldFlags_ = 2054;
            private int receiverTypeId_;
            private Type receiverType_ = Type.bEu();
            private int returnTypeId_;
            private Type returnType_ = Type.bEu();
            private int setterFlags_;
            private ValueParameter setterValueParameter_ = ValueParameter.bGt();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bDC() {
                return new a();
            }

            /* renamed from: bDD */
            public a clone() {
                return bDC().a(bDF());
            }

            /* renamed from: bDs */
            public Property bzq() {
                return Property.bDr();
            }

            /* renamed from: bDE */
            public Property bzG() {
                Property bDF = bDF();
                if (bDF.isInitialized()) {
                    return bDF;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bDF);
            }

            public Property bDF() {
                Property property = new Property((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                property.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                property.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.receiverTypeId_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                property.setterValueParameter_ = this.setterValueParameter_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                property.getterFlags_ = this.getterFlags_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -2049;
                }
                property.versionRequirement_ = this.versionRequirement_;
                property.bitField0_ = i2;
                return property;
            }

            /* renamed from: e */
            public a a(Property property) {
                if (property == Property.bDr()) {
                    return this;
                }
                if (property.bAb()) {
                    kI(property.getFlags());
                }
                if (property.bCN()) {
                    kJ(property.bCO());
                }
                if (property.hasName()) {
                    kK(property.bCg());
                }
                if (property.bCP()) {
                    d(property.bCQ());
                }
                if (property.bCR()) {
                    kL(property.bCS());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        bBa();
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.bCT()) {
                    e(property.bCU());
                }
                if (property.bCV()) {
                    kM(property.bCW());
                }
                if (property.bDt()) {
                    a(property.bDu());
                }
                if (property.bDv()) {
                    kN(property.bDw());
                }
                if (property.bDx()) {
                    kO(property.bDy());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -2049;
                    } else {
                        bBk();
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                a((ExtendableMessage) property);
                e(bLf().a(property.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (bCP() && !bCQ().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < bAy(); i++) {
                    if (!kd(i).isInitialized()) {
                        return false;
                    }
                }
                if (bCT() && !bCU().isInitialized()) {
                    return false;
                }
                if ((!bDt() || bDu().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: A */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Property property;
                Throwable th;
                Property property2 = null;
                try {
                    Property property3 = (Property) Property.fmO.b(eVar, fVar);
                    if (property3 != null) {
                        a(property3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    property = (Property) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    property2 = property;
                }
                if (property2 != null) {
                    a(property2);
                }
                throw th;
            }

            public a kI(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public a kJ(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public a kK(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public boolean bCP() {
                return (this.bitField0_ & 8) == 8;
            }

            public Type bCQ() {
                return this.returnType_;
            }

            public a d(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.bEu()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.f(this.returnType_).a(type).bFo();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public a kL(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            private void bBa() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            public int bAy() {
                return this.typeParameter_.size();
            }

            public TypeParameter kd(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public boolean bCT() {
                return (this.bitField0_ & 64) == 64;
            }

            public Type bCU() {
                return this.receiverType_;
            }

            public a e(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.bEu()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.f(this.receiverType_).a(type).bFo();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public a kM(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            public boolean bDt() {
                return (this.bitField0_ & 256) == 256;
            }

            public ValueParameter bDu() {
                return this.setterValueParameter_;
            }

            public a a(ValueParameter valueParameter) {
                if ((this.bitField0_ & 256) != 256 || this.setterValueParameter_ == ValueParameter.bGt()) {
                    this.setterValueParameter_ = valueParameter;
                } else {
                    this.setterValueParameter_ = ValueParameter.b(this.setterValueParameter_).a(valueParameter).bGF();
                }
                this.bitField0_ |= 256;
                return this;
            }

            public a kN(int i) {
                this.bitField0_ |= 512;
                this.getterFlags_ = i;
                return this;
            }

            public a kO(int i) {
                this.bitField0_ |= 1024;
                this.setterFlags_ = i;
                return this;
            }

            private void bBk() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 2048;
                }
            }
        }

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Property, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Property(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Property bDr() {
            return fmZ;
        }

        /* renamed from: bDs */
        public Property bzq() {
            return fmZ;
        }

        private Property(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                    b bVar = null;
                    switch (bKv) {
                        case 0:
                            obj = 1;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = eVar.bKy();
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = eVar.bKy();
                            break;
                        case 26:
                            if ((this.bitField0_ & 8) == 8) {
                                bVar = this.returnType_.bzo();
                            }
                            this.returnType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.returnType_);
                                this.returnType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 8;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i |= 32;
                            }
                            this.typeParameter_.add(eVar.a(TypeParameter.fmO, fVar));
                            break;
                        case 42:
                            if ((this.bitField0_ & 32) == 32) {
                                bVar = this.receiverType_.bzo();
                            }
                            this.receiverType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.receiverType_);
                                this.receiverType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 32;
                            break;
                        case 50:
                            a bGB;
                            if ((this.bitField0_ & 128) == 128) {
                                bGB = this.setterValueParameter_.bzo();
                            }
                            this.setterValueParameter_ = (ValueParameter) eVar.a(ValueParameter.fmO, fVar);
                            if (bGB != null) {
                                bGB.a(this.setterValueParameter_);
                                this.setterValueParameter_ = bGB.bGF();
                            }
                            this.bitField0_ |= 128;
                            break;
                        case 56:
                            this.bitField0_ |= 256;
                            this.getterFlags_ = eVar.bKy();
                            break;
                        case 64:
                            this.bitField0_ |= 512;
                            this.setterFlags_ = eVar.bKy();
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = eVar.bKy();
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = eVar.bKy();
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = eVar.bKy();
                            break;
                        case 248:
                            if ((i & 2048) != 2048) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 2048;
                            }
                            this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            break;
                        case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 2048) != 2048 && eVar.bKQ() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 2048;
                            }
                            while (eVar.bKQ() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            }
                            eVar.lW(bKv);
                            break;
                        default:
                            if (a(eVar, b, fVar, bKv)) {
                                break;
                            }
                            obj = 1;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 2048) == 2048) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            if ((i & 32) == 32) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 2048) == 2048) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            fmZ.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Property> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean bCN() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCO() {
            return this.oldFlags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean bCP() {
            return (this.bitField0_ & 8) == 8;
        }

        public Type bCQ() {
            return this.returnType_;
        }

        public boolean bCR() {
            return (this.bitField0_ & 16) == 16;
        }

        public int bCS() {
            return this.returnTypeId_;
        }

        public List<TypeParameter> bAx() {
            return this.typeParameter_;
        }

        public int bAy() {
            return this.typeParameter_.size();
        }

        public TypeParameter kd(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public boolean bCT() {
            return (this.bitField0_ & 32) == 32;
        }

        public Type bCU() {
            return this.receiverType_;
        }

        public boolean bCV() {
            return (this.bitField0_ & 64) == 64;
        }

        public int bCW() {
            return this.receiverTypeId_;
        }

        public boolean bDt() {
            return (this.bitField0_ & 128) == 128;
        }

        public ValueParameter bDu() {
            return this.setterValueParameter_;
        }

        public boolean bDv() {
            return (this.bitField0_ & 256) == 256;
        }

        public int bDw() {
            return this.getterFlags_;
        }

        public boolean bDx() {
            return (this.bitField0_ & 512) == 512;
        }

        public int bDy() {
            return this.setterFlags_;
        }

        public List<Integer> bAQ() {
            return this.versionRequirement_;
        }

        private void bzj() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.bEu();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.bEu();
            this.receiverTypeId_ = 0;
            this.setterValueParameter_ = ValueParameter.bGt();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!bCP() || bCQ().isInitialized()) {
                int i = 0;
                while (i < bAy()) {
                    if (kd(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (bCT() && !bCU().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (bDt() && !bDu().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (bLi()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.bk(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.b(3, this.returnType_);
            }
            int i = 0;
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.b(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.b(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.b(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.bk(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.bk(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.bk(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.bk(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(11, this.flags_);
            }
            while (i < this.versionRequirement_.size()) {
                codedOutputStream.bk(31, ((Integer) this.versionRequirement_.get(i)).intValue());
                i++;
            }
            bLj.b(19000, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 2) == 2 ? CodedOutputStream.bl(1, this.oldFlags_) + 0 : 0;
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.bl(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.d(3, this.returnType_);
            }
            int i3 = i;
            for (i = 0; i < this.typeParameter_.size(); i++) {
                i3 += CodedOutputStream.d(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                i3 += CodedOutputStream.d(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                i3 += CodedOutputStream.d(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                i3 += CodedOutputStream.bl(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                i3 += CodedOutputStream.bl(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i3 += CodedOutputStream.bl(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i3 += CodedOutputStream.bl(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                i3 += CodedOutputStream.bl(11, this.flags_);
            }
            i = 0;
            while (i2 < this.versionRequirement_.size()) {
                i += CodedOutputStream.E(((Integer) this.versionRequirement_.get(i2)).intValue());
                i2++;
            }
            i3 = (((i3 + i) + (bAQ().size() * 2)) + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static a bDz() {
            return a.bDC();
        }

        /* renamed from: bDA */
        public a bzp() {
            return bDz();
        }

        public static a a(Property property) {
            return bDz().a(property);
        }

        /* renamed from: bDB */
        public a bzo() {
            return a(this);
        }
    }

    public static final class Type extends ExtendableMessage<Type> implements n {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<Type> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Type>() {
            /* renamed from: H */
            public Type b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Type(eVar, fVar);
            }
        };
        private static final Type fnd = new Type(true);
        private int abbreviatedTypeId_;
        private Type abbreviatedType_;
        private List<Argument> argument_;
        private int bitField0_;
        private int className_;
        private int flags_;
        private int flexibleTypeCapabilitiesId_;
        private int flexibleUpperBoundId_;
        private Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean nullable_;
        private int outerTypeId_;
        private Type outerType_;
        private int typeAliasName_;
        private int typeParameterName_;
        private int typeParameter_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

        public interface a extends kotlin.reflect.jvm.internal.impl.protobuf.o {
        }

        public static final class Argument extends GeneratedMessageLite implements a {
            public static kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Argument>() {
                /* renamed from: I */
                public Argument b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new Argument(eVar, fVar);
                }
            };
            private static final Argument fne = new Argument(true);
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Projection projection_;
            private int typeId_;
            private Type type_;
            private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;

            public enum Projection implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);
                
                private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Projection> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Projection>() {
                        /* renamed from: kV */
                        public Projection kb(int i) {
                            return Projection.valueOf(i);
                        }
                    };
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i != 2) {
                        return i != 3 ? null : STAR;
                    } else {
                        return INV;
                    }
                }

                private Projection(int i, int i2) {
                    this.value = i2;
                }
            }

            public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Argument, a> implements a {
                private int bitField0_;
                private Projection projection_ = Projection.INV;
                private int typeId_;
                private Type type_ = Type.bEu();

                private void bzy() {
                }

                private a() {
                    bzy();
                }

                private static a bFg() {
                    return new a();
                }

                /* renamed from: bFh */
                public a clone() {
                    return bFg().a(bFj());
                }

                /* renamed from: bEY */
                public Argument bzq() {
                    return Argument.bEX();
                }

                /* renamed from: bFi */
                public Argument bzG() {
                    Argument bFj = bFj();
                    if (bFj.isInitialized()) {
                        return bFj;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bFj);
                }

                public Argument bFj() {
                    Argument argument = new Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    argument.projection_ = this.projection_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.type_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.typeId_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                /* renamed from: c */
                public a a(Argument argument) {
                    if (argument == Argument.bEX()) {
                        return this;
                    }
                    if (argument.bEZ()) {
                        a(argument.bFa());
                    }
                    if (argument.hasType()) {
                        i(argument.bFb());
                    }
                    if (argument.bFc()) {
                        kU(argument.getTypeId());
                    }
                    e(bLf().a(argument.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    return !hasType() || bFb().isInitialized();
                }

                /* renamed from: J */
                public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    Argument argument;
                    Throwable th;
                    Argument argument2 = null;
                    try {
                        Argument argument3 = (Argument) Argument.fmO.b(eVar, fVar);
                        if (argument3 != null) {
                            a(argument3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.bLo();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        a(argument2);
                    }
                    throw th;
                }

                public a a(Projection projection) {
                    if (projection != null) {
                        this.bitField0_ |= 1;
                        this.projection_ = projection;
                        return this;
                    }
                    throw new NullPointerException();
                }

                public boolean hasType() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Type bFb() {
                    return this.type_;
                }

                public a i(Type type) {
                    if ((this.bitField0_ & 2) != 2 || this.type_ == Type.bEu()) {
                        this.type_ = type;
                    } else {
                        this.type_ = Type.f(this.type_).a(type).bFo();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public a kU(int i) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i;
                    return this;
                }
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
                super(aVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = aVar.bLf();
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
            }

            public static Argument bEX() {
                return fne;
            }

            /* renamed from: bEY */
            public Argument bzq() {
                return fne;
            }

            private Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                                int bKF = eVar.bKF();
                                Projection valueOf = Projection.valueOf(bKF);
                                if (valueOf == null) {
                                    b.K(bKv);
                                    b.K(bKF);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.projection_ = valueOf;
                                }
                            } else if (bKv == 18) {
                                b bVar = null;
                                if ((this.bitField0_ & 2) == 2) {
                                    bVar = this.type_.bzo();
                                }
                                this.type_ = (Type) eVar.a(Type.fmO, fVar);
                                if (bVar != null) {
                                    bVar.a(this.type_);
                                    this.type_ = bVar.bFo();
                                }
                                this.bitField0_ |= 2;
                            } else if (bKv == 24) {
                                this.bitField0_ |= 4;
                                this.typeId_ = eVar.bKy();
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
                fne.bzj();
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.p<Argument> bzg() {
                return fmO;
            }

            public boolean bEZ() {
                return (this.bitField0_ & 1) == 1;
            }

            public Projection bFa() {
                return this.projection_;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public Type bFb() {
                return this.type_;
            }

            public boolean bFc() {
                return (this.bitField0_ & 4) == 4;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            private void bzj() {
                this.projection_ = Projection.INV;
                this.type_ = Type.bEu();
                this.typeId_ = 0;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                if (!hasType() || bFb().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            public void a(CodedOutputStream codedOutputStream) {
                bzk();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.c(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.b(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.bk(3, this.typeId_);
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
                    i = 0 + CodedOutputStream.f(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.d(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.bl(3, this.typeId_);
                }
                i += this.unknownFields.size();
                this.memoizedSerializedSize = i;
                return i;
            }

            public static a bFd() {
                return a.bFg();
            }

            /* renamed from: bFe */
            public a bzp() {
                return bFd();
            }

            public static a a(Argument argument) {
                return bFd().a(argument);
            }

            /* renamed from: bFf */
            public a bzo() {
                return a(this);
            }
        }

        public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Type, b> implements n {
            private int abbreviatedTypeId_;
            private Type abbreviatedType_ = Type.bEu();
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int className_;
            private int flags_;
            private int flexibleTypeCapabilitiesId_;
            private int flexibleUpperBoundId_;
            private Type flexibleUpperBound_ = Type.bEu();
            private boolean nullable_;
            private int outerTypeId_;
            private Type outerType_ = Type.bEu();
            private int typeAliasName_;
            private int typeParameterName_;
            private int typeParameter_;

            private void bzy() {
            }

            private b() {
                bzy();
            }

            private static b bFl() {
                return new b();
            }

            /* renamed from: bFm */
            public b clone() {
                return bFl().a(bFo());
            }

            /* renamed from: bEv */
            public Type bzq() {
                return Type.bEu();
            }

            /* renamed from: bFn */
            public Type bzG() {
                Type bFo = bFo();
                if (bFo.isInitialized()) {
                    return bFo;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bFo);
            }

            public Type bFo() {
                Type type = new Type((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                type.argument_ = this.argument_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                type.nullable_ = this.nullable_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.className_ = this.className_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.typeParameter_ = this.typeParameter_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.typeParameterName_ = this.typeParameterName_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.typeAliasName_ = this.typeAliasName_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.outerType_ = this.outerType_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.outerTypeId_ = this.outerTypeId_;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.abbreviatedType_ = this.abbreviatedType_;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.flags_ = this.flags_;
                type.bitField0_ = i2;
                return type;
            }

            /* renamed from: j */
            public b a(Type type) {
                if (type == Type.bEu()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        bAp();
                        this.argument_.addAll(type.argument_);
                    }
                }
                if (type.bEw()) {
                    gO(type.bEx());
                }
                if (type.bEy()) {
                    kW(type.bEz());
                }
                if (type.bEA()) {
                    k(type.bEB());
                }
                if (type.bEC()) {
                    kX(type.bED());
                }
                if (type.bEE()) {
                    kY(type.bEF());
                }
                if (type.bEG()) {
                    kZ(type.bEH());
                }
                if (type.bEI()) {
                    la(type.bEJ());
                }
                if (type.bEK()) {
                    lb(type.bEL());
                }
                if (type.bEM()) {
                    l(type.bEN());
                }
                if (type.bEO()) {
                    lc(type.bEP());
                }
                if (type.bEQ()) {
                    m(type.bER());
                }
                if (type.bES()) {
                    ld(type.bET());
                }
                if (type.bAb()) {
                    le(type.getFlags());
                }
                a((ExtendableMessage) type);
                e(bLf().a(type.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < bzi(); i++) {
                    if (!kT(i).isInitialized()) {
                        return false;
                    }
                }
                if (bEA() && !bEB().isInitialized()) {
                    return false;
                }
                if (bEM() && !bEN().isInitialized()) {
                    return false;
                }
                if ((!bEQ() || bER().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: K */
            public b f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                Type type;
                Throwable th;
                Type type2 = null;
                try {
                    Type type3 = (Type) Type.fmO.b(eVar, fVar);
                    if (type3 != null) {
                        a(type3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    type = (Type) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    type2 = type;
                }
                if (type2 != null) {
                    a(type2);
                }
                throw th;
            }

            private void bAp() {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
            }

            public int bzi() {
                return this.argument_.size();
            }

            public Argument kT(int i) {
                return (Argument) this.argument_.get(i);
            }

            public b gO(boolean z) {
                this.bitField0_ |= 2;
                this.nullable_ = z;
                return this;
            }

            public b kW(int i) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i;
                return this;
            }

            public boolean bEA() {
                return (this.bitField0_ & 8) == 8;
            }

            public Type bEB() {
                return this.flexibleUpperBound_;
            }

            public b k(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.bEu()) {
                    this.flexibleUpperBound_ = type;
                } else {
                    this.flexibleUpperBound_ = Type.f(this.flexibleUpperBound_).a(type).bFo();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public b kX(int i) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i;
                return this;
            }

            public b kY(int i) {
                this.bitField0_ |= 32;
                this.className_ = i;
                return this;
            }

            public b kZ(int i) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i;
                return this;
            }

            public b la(int i) {
                this.bitField0_ |= 128;
                this.typeParameterName_ = i;
                return this;
            }

            public b lb(int i) {
                this.bitField0_ |= 256;
                this.typeAliasName_ = i;
                return this;
            }

            public boolean bEM() {
                return (this.bitField0_ & 512) == 512;
            }

            public Type bEN() {
                return this.outerType_;
            }

            public b l(Type type) {
                if ((this.bitField0_ & 512) != 512 || this.outerType_ == Type.bEu()) {
                    this.outerType_ = type;
                } else {
                    this.outerType_ = Type.f(this.outerType_).a(type).bFo();
                }
                this.bitField0_ |= 512;
                return this;
            }

            public b lc(int i) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i;
                return this;
            }

            public boolean bEQ() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public Type bER() {
                return this.abbreviatedType_;
            }

            public b m(Type type) {
                if ((this.bitField0_ & 2048) != 2048 || this.abbreviatedType_ == Type.bEu()) {
                    this.abbreviatedType_ = type;
                } else {
                    this.abbreviatedType_ = Type.f(this.abbreviatedType_).a(type).bFo();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public b ld(int i) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i;
                return this;
            }

            public b le(int i) {
                this.bitField0_ |= 8192;
                this.flags_ = i;
                return this;
            }
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Type, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static Type bEu() {
            return fnd;
        }

        /* renamed from: bEv */
        public Type bzq() {
            return fnd;
        }

        private Type(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                    b bVar = null;
                    switch (bKv) {
                        case 0:
                            obj = 1;
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = eVar.bKy();
                            break;
                        case 18:
                            if ((i & 1) != 1) {
                                this.argument_ = new ArrayList();
                                i |= 1;
                            }
                            this.argument_.add(eVar.a(Argument.fmO, fVar));
                            break;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = eVar.bKB();
                            break;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = eVar.bKy();
                            break;
                        case 42:
                            if ((this.bitField0_ & 4) == 4) {
                                bVar = this.flexibleUpperBound_.bzo();
                            }
                            this.flexibleUpperBound_ = (Type) eVar.a(fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.flexibleUpperBound_);
                                this.flexibleUpperBound_ = bVar.bFo();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = eVar.bKy();
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = eVar.bKy();
                            break;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = eVar.bKy();
                            break;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = eVar.bKy();
                            break;
                        case 82:
                            if ((this.bitField0_ & 256) == 256) {
                                bVar = this.outerType_.bzo();
                            }
                            this.outerType_ = (Type) eVar.a(fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.outerType_);
                                this.outerType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 256;
                            break;
                        case 88:
                            this.bitField0_ |= 512;
                            this.outerTypeId_ = eVar.bKy();
                            break;
                        case 96:
                            this.bitField0_ |= 128;
                            this.typeAliasName_ = eVar.bKy();
                            break;
                        case 106:
                            if ((this.bitField0_ & 1024) == 1024) {
                                bVar = this.abbreviatedType_.bzo();
                            }
                            this.abbreviatedType_ = (Type) eVar.a(fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.abbreviatedType_);
                                this.abbreviatedType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 1024;
                            break;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = eVar.bKy();
                            break;
                        default:
                            if (a(eVar, b, fVar, bKv)) {
                                break;
                            }
                            obj = 1;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
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
                this.argument_ = Collections.unmodifiableList(this.argument_);
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
            fnd.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<Type> bzg() {
            return fmO;
        }

        public List<Argument> bzh() {
            return this.argument_;
        }

        public int bzi() {
            return this.argument_.size();
        }

        public Argument kT(int i) {
            return (Argument) this.argument_.get(i);
        }

        public boolean bEw() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean bEx() {
            return this.nullable_;
        }

        public boolean bEy() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bEz() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public boolean bEA() {
            return (this.bitField0_ & 4) == 4;
        }

        public Type bEB() {
            return this.flexibleUpperBound_;
        }

        public boolean bEC() {
            return (this.bitField0_ & 8) == 8;
        }

        public int bED() {
            return this.flexibleUpperBoundId_;
        }

        public boolean bEE() {
            return (this.bitField0_ & 16) == 16;
        }

        public int bEF() {
            return this.className_;
        }

        public boolean bEG() {
            return (this.bitField0_ & 32) == 32;
        }

        public int bEH() {
            return this.typeParameter_;
        }

        public boolean bEI() {
            return (this.bitField0_ & 64) == 64;
        }

        public int bEJ() {
            return this.typeParameterName_;
        }

        public boolean bEK() {
            return (this.bitField0_ & 128) == 128;
        }

        public int bEL() {
            return this.typeAliasName_;
        }

        public boolean bEM() {
            return (this.bitField0_ & 256) == 256;
        }

        public Type bEN() {
            return this.outerType_;
        }

        public boolean bEO() {
            return (this.bitField0_ & 512) == 512;
        }

        public int bEP() {
            return this.outerTypeId_;
        }

        public boolean bEQ() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public Type bER() {
            return this.abbreviatedType_;
        }

        public boolean bES() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public int bET() {
            return this.abbreviatedTypeId_;
        }

        public boolean bAb() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public int getFlags() {
            return this.flags_;
        }

        private void bzj() {
            this.argument_ = Collections.emptyList();
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = bEu();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = bEu();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = bEu();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < bzi()) {
                if (kT(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (bEA() && !bEB().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bEM() && !bEN().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bEQ() && !bER().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bLi()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.bk(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.b(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.c(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.b(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.bk(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.bk(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.bk(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.bk(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.b(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.bk(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.bk(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.b(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.bk(14, this.abbreviatedTypeId_);
            }
            bLj.b(200, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.bl(1, this.flags_) + 0 : 0;
            while (i2 < this.argument_.size()) {
                i += CodedOutputStream.d(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.argument_.get(i2));
                i2++;
            }
            if ((this.bitField0_ & 1) == 1) {
                i += CodedOutputStream.d(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.d(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.bl(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.bl(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.bl(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i += CodedOutputStream.bl(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                i += CodedOutputStream.d(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                i += CodedOutputStream.bl(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                i += CodedOutputStream.bl(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                i += CodedOutputStream.d(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                i += CodedOutputStream.bl(14, this.abbreviatedTypeId_);
            }
            i = (i + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static b bEU() {
            return b.bFl();
        }

        /* renamed from: bEV */
        public b bzp() {
            return bEU();
        }

        public static b f(Type type) {
            return bEU().a(type);
        }

        /* renamed from: bEW */
        public b bzo() {
            return f(this);
        }
    }

    public static final class TypeAlias extends ExtendableMessage<TypeAlias> implements m {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeAlias> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<TypeAlias>() {
            /* renamed from: L */
            public TypeAlias b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new TypeAlias(eVar, fVar);
            }
        };
        private static final TypeAlias fnf = new TypeAlias(true);
        private List<Annotation> annotation_;
        private int bitField0_;
        private int expandedTypeId_;
        private Type expandedType_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private List<TypeParameter> typeParameter_;
        private int underlyingTypeId_;
        private Type underlyingType_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private List<Integer> versionRequirement_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<TypeAlias, a> implements m {
            private List<Annotation> annotation_ = Collections.emptyList();
            private int bitField0_;
            private int expandedTypeId_;
            private Type expandedType_ = Type.bEu();
            private int flags_ = 6;
            private int name_;
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private int underlyingTypeId_;
            private Type underlyingType_ = Type.bEu();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bFF() {
                return new a();
            }

            /* renamed from: bFG */
            public a clone() {
                return bFF().a(bFI());
            }

            /* renamed from: bFr */
            public TypeAlias bzq() {
                return TypeAlias.bFq();
            }

            /* renamed from: bFH */
            public TypeAlias bzG() {
                TypeAlias bFI = bFI();
                if (bFI.isInitialized()) {
                    return bFI;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bFI);
            }

            public TypeAlias bFI() {
                TypeAlias typeAlias = new TypeAlias((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                typeAlias.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.name_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                typeAlias.typeParameter_ = this.typeParameter_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.underlyingType_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.expandedType_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                typeAlias.versionRequirement_ = this.versionRequirement_;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            /* renamed from: f */
            public a a(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.bFq()) {
                    return this;
                }
                if (typeAlias.bAb()) {
                    lg(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    lh(typeAlias.bCg());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        bBa();
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.bFs()) {
                    n(typeAlias.bFt());
                }
                if (typeAlias.bFu()) {
                    li(typeAlias.bFv());
                }
                if (typeAlias.bFw()) {
                    o(typeAlias.bFx());
                }
                if (typeAlias.bFy()) {
                    lj(typeAlias.bFz());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        bFJ();
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        bBk();
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                a((ExtendableMessage) typeAlias);
                e(bLf().a(typeAlias.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                int i;
                for (i = 0; i < bAy(); i++) {
                    if (!kd(i).isInitialized()) {
                        return false;
                    }
                }
                if (bFs() && !bFt().isInitialized()) {
                    return false;
                }
                if (bFw() && !bFx().isInitialized()) {
                    return false;
                }
                for (i = 0; i < bFB(); i++) {
                    if (!lf(i).isInitialized()) {
                        return false;
                    }
                }
                if (bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: M */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                TypeAlias typeAlias;
                Throwable th;
                TypeAlias typeAlias2 = null;
                try {
                    TypeAlias typeAlias3 = (TypeAlias) TypeAlias.fmO.b(eVar, fVar);
                    if (typeAlias3 != null) {
                        a(typeAlias3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeAlias = (TypeAlias) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeAlias2 = typeAlias;
                }
                if (typeAlias2 != null) {
                    a(typeAlias2);
                }
                throw th;
            }

            public a lg(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public a lh(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            private void bBa() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 4;
                }
            }

            public int bAy() {
                return this.typeParameter_.size();
            }

            public TypeParameter kd(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public boolean bFs() {
                return (this.bitField0_ & 8) == 8;
            }

            public Type bFt() {
                return this.underlyingType_;
            }

            public a n(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.bEu()) {
                    this.underlyingType_ = type;
                } else {
                    this.underlyingType_ = Type.f(this.underlyingType_).a(type).bFo();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public a li(int i) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i;
                return this;
            }

            public boolean bFw() {
                return (this.bitField0_ & 32) == 32;
            }

            public Type bFx() {
                return this.expandedType_;
            }

            public a o(Type type) {
                if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.bEu()) {
                    this.expandedType_ = type;
                } else {
                    this.expandedType_ = Type.f(this.expandedType_).a(type).bFo();
                }
                this.bitField0_ |= 32;
                return this;
            }

            public a lj(int i) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i;
                return this;
            }

            private void bFJ() {
                if ((this.bitField0_ & 128) != 128) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 128;
                }
            }

            public int bFB() {
                return this.annotation_.size();
            }

            public Annotation lf(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            private void bBk() {
                if ((this.bitField0_ & 256) != 256) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 256;
                }
            }
        }

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<TypeAlias, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static TypeAlias bFq() {
            return fnf;
        }

        /* renamed from: bFr */
        public TypeAlias bzq() {
            return fnf;
        }

        private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                    b bVar = null;
                    switch (bKv) {
                        case 0:
                            obj = 1;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = eVar.bKy();
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.name_ = eVar.bKy();
                            break;
                        case 26:
                            if ((i & 4) != 4) {
                                this.typeParameter_ = new ArrayList();
                                i |= 4;
                            }
                            this.typeParameter_.add(eVar.a(TypeParameter.fmO, fVar));
                            break;
                        case 34:
                            if ((this.bitField0_ & 4) == 4) {
                                bVar = this.underlyingType_.bzo();
                            }
                            this.underlyingType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.underlyingType_);
                                this.underlyingType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = eVar.bKy();
                            break;
                        case 50:
                            if ((this.bitField0_ & 16) == 16) {
                                bVar = this.expandedType_.bzo();
                            }
                            this.expandedType_ = (Type) eVar.a(Type.fmO, fVar);
                            if (bVar != null) {
                                bVar.a(this.expandedType_);
                                this.expandedType_ = bVar.bFo();
                            }
                            this.bitField0_ |= 16;
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = eVar.bKy();
                            break;
                        case 66:
                            if ((i & 128) != 128) {
                                this.annotation_ = new ArrayList();
                                i |= 128;
                            }
                            this.annotation_.add(eVar.a(Annotation.fmO, fVar));
                            break;
                        case 248:
                            if ((i & 256) != 256) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            break;
                        case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 256) != 256 && eVar.bKQ() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 256;
                            }
                            while (eVar.bKQ() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(eVar.bKy()));
                            }
                            eVar.lW(bKv);
                            break;
                        default:
                            if (a(eVar, b, fVar, bKv)) {
                                break;
                            }
                            obj = 1;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 128) == 128) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 256) == 256) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            if ((i & 4) == 4) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if ((i & 128) == 128) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i & 256) == 256) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            fnf.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeAlias> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCg() {
            return this.name_;
        }

        public List<TypeParameter> bAx() {
            return this.typeParameter_;
        }

        public int bAy() {
            return this.typeParameter_.size();
        }

        public TypeParameter kd(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public boolean bFs() {
            return (this.bitField0_ & 4) == 4;
        }

        public Type bFt() {
            return this.underlyingType_;
        }

        public boolean bFu() {
            return (this.bitField0_ & 8) == 8;
        }

        public int bFv() {
            return this.underlyingTypeId_;
        }

        public boolean bFw() {
            return (this.bitField0_ & 16) == 16;
        }

        public Type bFx() {
            return this.expandedType_;
        }

        public boolean bFy() {
            return (this.bitField0_ & 32) == 32;
        }

        public int bFz() {
            return this.expandedTypeId_;
        }

        public List<Annotation> bFA() {
            return this.annotation_;
        }

        public int bFB() {
            return this.annotation_.size();
        }

        public Annotation lf(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public List<Integer> bAQ() {
            return this.versionRequirement_;
        }

        private void bzj() {
            this.flags_ = 6;
            this.name_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.underlyingType_ = Type.bEu();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.bEu();
            this.expandedTypeId_ = 0;
            this.annotation_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (hasName()) {
                int i = 0;
                while (i < bAy()) {
                    if (kd(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (bFs() && !bFt().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (!bFw() || bFx().isInitialized()) {
                    i = 0;
                    while (i < bFB()) {
                        if (lf(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (bLi()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            int i;
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.name_);
            }
            for (i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.b(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.b(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.bk(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.b(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.bk(7, this.expandedTypeId_);
            }
            for (i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.b(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.annotation_.get(i));
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.bk(31, ((Integer) this.versionRequirement_.get(i2)).intValue());
            }
            bLj.b(200, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.flags_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.name_);
            }
            int i3 = i;
            for (i = 0; i < this.typeParameter_.size(); i++) {
                i3 += CodedOutputStream.d(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                i3 += CodedOutputStream.d(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i3 += CodedOutputStream.bl(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i3 += CodedOutputStream.d(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i3 += CodedOutputStream.bl(7, this.expandedTypeId_);
            }
            for (i = 0; i < this.annotation_.size(); i++) {
                i3 += CodedOutputStream.d(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.annotation_.get(i));
            }
            i = 0;
            while (i2 < this.versionRequirement_.size()) {
                i += CodedOutputStream.E(((Integer) this.versionRequirement_.get(i2)).intValue());
                i2++;
            }
            i3 = (((i3 + i) + (bAQ().size() * 2)) + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static TypeAlias d(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return (TypeAlias) fmO.j(inputStream, fVar);
        }

        public static a bFC() {
            return a.bFF();
        }

        /* renamed from: bFD */
        public a bzp() {
            return bFC();
        }

        public static a a(TypeAlias typeAlias) {
            return bFC().a(typeAlias);
        }

        /* renamed from: bFE */
        public a bzo() {
            return a(this);
        }
    }

    public static final class TypeParameter extends ExtendableMessage<TypeParameter> implements o {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<TypeParameter> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<TypeParameter>() {
            /* renamed from: N */
            public TypeParameter b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new TypeParameter(eVar, fVar);
            }
        };
        private static final TypeParameter fng = new TypeParameter(true);
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private boolean reified_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        private List<Integer> upperBoundId_;
        private List<Type> upperBound_;
        private Variance variance_;

        public enum Variance implements kotlin.reflect.jvm.internal.impl.protobuf.h.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);
            
            private static kotlin.reflect.jvm.internal.impl.protobuf.h.b<Variance> internalValueMap;
            private final int value;

            static {
                internalValueMap = new kotlin.reflect.jvm.internal.impl.protobuf.h.b<Variance>() {
                    /* renamed from: ln */
                    public Variance kb(int i) {
                        return Variance.valueOf(i);
                    }
                };
            }

            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i != 1) {
                    return i != 2 ? null : INV;
                } else {
                    return OUT;
                }
            }

            private Variance(int i, int i2) {
                this.value = i2;
            }
        }

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<TypeParameter, a> implements o {
            private int bitField0_;
            private int id_;
            private int name_;
            private boolean reified_;
            private List<Integer> upperBoundId_ = Collections.emptyList();
            private List<Type> upperBound_ = Collections.emptyList();
            private Variance variance_ = Variance.INV;

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bFX() {
                return new a();
            }

            /* renamed from: bFY */
            public a clone() {
                return bFX().a(bGa());
            }

            /* renamed from: bFM */
            public TypeParameter bzq() {
                return TypeParameter.bFL();
            }

            /* renamed from: bFZ */
            public TypeParameter bzG() {
                TypeParameter bGa = bGa();
                if (bGa.isInitialized()) {
                    return bGa;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bGa);
            }

            public TypeParameter bGa() {
                TypeParameter typeParameter = new TypeParameter((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                typeParameter.id_ = this.id_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.reified_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.variance_;
                if ((this.bitField0_ & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                typeParameter.upperBoundId_ = this.upperBoundId_;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            /* renamed from: e */
            public a a(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.bFL()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    ll(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    lm(typeParameter.bCg());
                }
                if (typeParameter.bFN()) {
                    gP(typeParameter.bFO());
                }
                if (typeParameter.bFP()) {
                    a(typeParameter.bFQ());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        bGb();
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        bGc();
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                a((ExtendableMessage) typeParameter);
                e(bLf().a(typeParameter.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < bFS(); i++) {
                    if (!lk(i).isInitialized()) {
                        return false;
                    }
                }
                if (bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: O */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                TypeParameter typeParameter;
                Throwable th;
                TypeParameter typeParameter2 = null;
                try {
                    TypeParameter typeParameter3 = (TypeParameter) TypeParameter.fmO.b(eVar, fVar);
                    if (typeParameter3 != null) {
                        a(typeParameter3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeParameter = (TypeParameter) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeParameter2 = typeParameter;
                }
                if (typeParameter2 != null) {
                    a(typeParameter2);
                }
                throw th;
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public a ll(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public a lm(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public a gP(boolean z) {
                this.bitField0_ |= 4;
                this.reified_ = z;
                return this;
            }

            public a a(Variance variance) {
                if (variance != null) {
                    this.bitField0_ |= 8;
                    this.variance_ = variance;
                    return this;
                }
                throw new NullPointerException();
            }

            private void bGb() {
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
            }

            public int bFS() {
                return this.upperBound_.size();
            }

            public Type lk(int i) {
                return (Type) this.upperBound_.get(i);
            }

            private void bGc() {
                if ((this.bitField0_ & 32) != 32) {
                    this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                    this.bitField0_ |= 32;
                }
            }
        }

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<TypeParameter, ?> bVar) {
            super(bVar);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static TypeParameter bFL() {
            return fng;
        }

        /* renamed from: bFM */
        public TypeParameter bzq() {
            return fng;
        }

        private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.upperBoundIdMemoizedSerializedSize = -1;
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
                            this.id_ = eVar.bKy();
                        } else if (bKv == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = eVar.bKy();
                        } else if (bKv == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = eVar.bKB();
                        } else if (bKv == 32) {
                            int bKF = eVar.bKF();
                            Variance valueOf = Variance.valueOf(bKF);
                            if (valueOf == null) {
                                b.K(bKv);
                                b.K(bKF);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = valueOf;
                            }
                        } else if (bKv == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add(eVar.a(Type.fmO, fVar));
                        } else if (bKv == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(eVar.bKy()));
                        } else if (bKv == 50) {
                            bKv = eVar.lV(eVar.bKK());
                            if ((i & 32) != 32 && eVar.bKQ() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (eVar.bKQ() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(eVar.bKy()));
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
                    if ((i & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
            fng.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<TypeParameter> bzg() {
            return fmO;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getId() {
            return this.id_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean bFN() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean bFO() {
            return this.reified_;
        }

        public boolean bFP() {
            return (this.bitField0_ & 8) == 8;
        }

        public Variance bFQ() {
            return this.variance_;
        }

        public List<Type> bFR() {
            return this.upperBound_;
        }

        public int bFS() {
            return this.upperBound_.size();
        }

        public Type lk(int i) {
            return (Type) this.upperBound_.get(i);
        }

        public List<Integer> bFT() {
            return this.upperBoundId_;
        }

        private void bzj() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            this.upperBound_ = Collections.emptyList();
            this.upperBoundId_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasName()) {
                int i = 0;
                while (i < bFS()) {
                    if (lk(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (bLi()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.c(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.c(4, this.variance_.getNumber());
            }
            int i = 0;
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                codedOutputStream.b(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.upperBound_.get(i2));
            }
            if (bFT().size() > 0) {
                codedOutputStream.K(50);
                codedOutputStream.K(this.upperBoundIdMemoizedSerializedSize);
            }
            while (i < this.upperBoundId_.size()) {
                codedOutputStream.A(((Integer) this.upperBoundId_.get(i)).intValue());
                i++;
            }
            bLj.b(1000, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.bl(1, this.id_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.d(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.f(4, this.variance_.getNumber());
            }
            int i3 = i;
            for (i = 0; i < this.upperBound_.size(); i++) {
                i3 += CodedOutputStream.d(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.upperBound_.get(i));
            }
            i = 0;
            while (i2 < this.upperBoundId_.size()) {
                i += CodedOutputStream.E(((Integer) this.upperBoundId_.get(i2)).intValue());
                i2++;
            }
            i3 += i;
            if (!bFT().isEmpty()) {
                i3 = (i3 + 1) + CodedOutputStream.E(i);
            }
            this.upperBoundIdMemoizedSerializedSize = i;
            i3 = (i3 + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static a bFU() {
            return a.bFX();
        }

        /* renamed from: bFV */
        public a bzp() {
            return bFU();
        }

        public static a a(TypeParameter typeParameter) {
            return bFU().a(typeParameter);
        }

        /* renamed from: bFW */
        public a bzo() {
            return a(this);
        }
    }

    public static final class ValueParameter extends ExtendableMessage<ValueParameter> implements q {
        public static kotlin.reflect.jvm.internal.impl.protobuf.p<ValueParameter> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<ValueParameter>() {
            /* renamed from: R */
            public ValueParameter b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new ValueParameter(eVar, fVar);
            }
        };
        private static final ValueParameter fni = new ValueParameter(true);
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int typeId_;
        private Type type_;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d unknownFields;
        private int varargElementTypeId_;
        private Type varargElementType_;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<ValueParameter, a> implements q {
            private int bitField0_;
            private int flags_;
            private int name_;
            private int typeId_;
            private Type type_ = Type.bEu();
            private int varargElementTypeId_;
            private Type varargElementType_ = Type.bEu();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bGC() {
                return new a();
            }

            /* renamed from: bGD */
            public a clone() {
                return bGC().a(bGF());
            }

            /* renamed from: bGu */
            public ValueParameter bzq() {
                return ValueParameter.bGt();
            }

            /* renamed from: bGE */
            public ValueParameter bzG() {
                ValueParameter bGF = bGF();
                if (bGF.isInitialized()) {
                    return bGF;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bGF);
            }

            public ValueParameter bGF() {
                ValueParameter valueParameter = new ValueParameter((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                valueParameter.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.type_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.typeId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.varargElementType_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            /* renamed from: d */
            public a a(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.bGt()) {
                    return this;
                }
                if (valueParameter.bAb()) {
                    lq(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    lr(valueParameter.bCg());
                }
                if (valueParameter.hasType()) {
                    p(valueParameter.bFb());
                }
                if (valueParameter.bFc()) {
                    ls(valueParameter.getTypeId());
                }
                if (valueParameter.bGv()) {
                    q(valueParameter.bGw());
                }
                if (valueParameter.bGx()) {
                    lt(valueParameter.bGy());
                }
                a((ExtendableMessage) valueParameter);
                e(bLf().a(valueParameter.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !bFb().isInitialized()) {
                    return false;
                }
                if ((!bGv() || bGw().isInitialized()) && bLi()) {
                    return true;
                }
                return false;
            }

            /* renamed from: S */
            public a f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                ValueParameter valueParameter;
                Throwable th;
                ValueParameter valueParameter2 = null;
                try {
                    ValueParameter valueParameter3 = (ValueParameter) ValueParameter.fmO.b(eVar, fVar);
                    if (valueParameter3 != null) {
                        a(valueParameter3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    valueParameter = (ValueParameter) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    valueParameter2 = valueParameter;
                }
                if (valueParameter2 != null) {
                    a(valueParameter2);
                }
                throw th;
            }

            public a lq(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public a lr(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public boolean hasType() {
                return (this.bitField0_ & 4) == 4;
            }

            public Type bFb() {
                return this.type_;
            }

            public a p(Type type) {
                if ((this.bitField0_ & 4) != 4 || this.type_ == Type.bEu()) {
                    this.type_ = type;
                } else {
                    this.type_ = Type.f(this.type_).a(type).bFo();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public a ls(int i) {
                this.bitField0_ |= 8;
                this.typeId_ = i;
                return this;
            }

            public boolean bGv() {
                return (this.bitField0_ & 16) == 16;
            }

            public Type bGw() {
                return this.varargElementType_;
            }

            public a q(Type type) {
                if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.bEu()) {
                    this.varargElementType_ = type;
                } else {
                    this.varargElementType_ = Type.f(this.varargElementType_).a(type).bFo();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public a lt(int i) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i;
                return this;
            }
        }

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<ValueParameter, ?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.bLf();
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = kotlin.reflect.jvm.internal.impl.protobuf.d.fpH;
        }

        public static ValueParameter bGt() {
            return fni;
        }

        /* renamed from: bGu */
        public ValueParameter bzq() {
            return fni;
        }

        private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
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
                            this.flags_ = eVar.bKy();
                        } else if (bKv != 16) {
                            b bVar = null;
                            if (bKv == 26) {
                                if ((this.bitField0_ & 4) == 4) {
                                    bVar = this.type_.bzo();
                                }
                                this.type_ = (Type) eVar.a(Type.fmO, fVar);
                                if (bVar != null) {
                                    bVar.a(this.type_);
                                    this.type_ = bVar.bFo();
                                }
                                this.bitField0_ |= 4;
                            } else if (bKv == 34) {
                                if ((this.bitField0_ & 16) == 16) {
                                    bVar = this.varargElementType_.bzo();
                                }
                                this.varargElementType_ = (Type) eVar.a(Type.fmO, fVar);
                                if (bVar != null) {
                                    bVar.a(this.varargElementType_);
                                    this.varargElementType_ = bVar.bFo();
                                }
                                this.bitField0_ |= 16;
                            } else if (bKv == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = eVar.bKy();
                            } else if (bKv == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = eVar.bKy();
                            } else if (a(eVar, b, fVar, bKv)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = eVar.bKy();
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
            fni.bzj();
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.p<ValueParameter> bzg() {
            return fmO;
        }

        public boolean bAb() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getFlags() {
            return this.flags_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public int bCg() {
            return this.name_;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public Type bFb() {
            return this.type_;
        }

        public boolean bFc() {
            return (this.bitField0_ & 8) == 8;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public boolean bGv() {
            return (this.bitField0_ & 16) == 16;
        }

        public Type bGw() {
            return this.varargElementType_;
        }

        public boolean bGx() {
            return (this.bitField0_ & 32) == 32;
        }

        public int bGy() {
            return this.varargElementTypeId_;
        }

        private void bzj() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.bEu();
            this.typeId_ = 0;
            this.varargElementType_ = Type.bEu();
            this.varargElementTypeId_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasType() && !bFb().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bGv() && !bGw().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (bLi()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void a(CodedOutputStream codedOutputStream) {
            bzk();
            a bLj = bLj();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.bk(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.bk(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.b(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.b(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.bk(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.bk(6, this.varargElementTypeId_);
            }
            bLj.b(200, codedOutputStream);
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.bl(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.bl(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.d(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.d(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.bl(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.bl(6, this.varargElementTypeId_);
            }
            i = (i + bLk()) + this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bGz() {
            return a.bGC();
        }

        /* renamed from: bGA */
        public a bzp() {
            return bGz();
        }

        public static a b(ValueParameter valueParameter) {
            return bGz().a(valueParameter);
        }

        /* renamed from: bGB */
        public a bzo() {
            return b(this);
        }
    }
}
