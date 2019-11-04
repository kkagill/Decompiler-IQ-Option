package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.k;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

public final class JvmModuleProtoBuf {

    public interface a extends o {
    }

    public interface b extends o {
    }

    public static final class Module extends GeneratedMessageLite implements a {
        public static p<Module> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<Module>() {
            /* renamed from: X */
            public Module b(e eVar, f fVar) {
                return new Module(eVar, fVar);
            }
        };
        private static final Module foo = new Module(true);
        private List<Annotation> annotation_;
        private int bitField0_;
        private l jvmPackageName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<PackageParts> metadataParts_;
        private List<PackageParts> packageParts_;
        private QualifiedNameTable qualifiedNameTable_;
        private StringTable stringTable_;
        private final d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<Module, a> implements a {
            private List<Annotation> annotation_ = Collections.emptyList();
            private int bitField0_;
            private l jvmPackageName_ = k.fqy;
            private List<PackageParts> metadataParts_ = Collections.emptyList();
            private List<PackageParts> packageParts_ = Collections.emptyList();
            private QualifiedNameTable qualifiedNameTable_ = QualifiedNameTable.bDH();
            private StringTable stringTable_ = StringTable.bEi();

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bHH() {
                return new a();
            }

            /* renamed from: bHI */
            public a clone() {
                return bHH().a(bHK());
            }

            /* renamed from: bHu */
            public Module bzq() {
                return Module.bHt();
            }

            /* renamed from: bHJ */
            public Module bzG() {
                Module bHK = bHK();
                if (bHK.isInitialized()) {
                    return bHK;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bHK);
            }

            public Module bHK() {
                Module module = new Module((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.packageParts_ = Collections.unmodifiableList(this.packageParts_);
                    this.bitField0_ &= -2;
                }
                module.packageParts_ = this.packageParts_;
                if ((this.bitField0_ & 2) == 2) {
                    this.metadataParts_ = Collections.unmodifiableList(this.metadataParts_);
                    this.bitField0_ &= -3;
                }
                module.metadataParts_ = this.metadataParts_;
                if ((this.bitField0_ & 4) == 4) {
                    this.jvmPackageName_ = this.jvmPackageName_.bLA();
                    this.bitField0_ &= -5;
                }
                module.jvmPackageName_ = this.jvmPackageName_;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                module.stringTable_ = this.stringTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                module.qualifiedNameTable_ = this.qualifiedNameTable_;
                if ((this.bitField0_ & 32) == 32) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -33;
                }
                module.annotation_ = this.annotation_;
                module.bitField0_ = i2;
                return module;
            }

            /* renamed from: g */
            public a a(Module module) {
                if (module == Module.bHt()) {
                    return this;
                }
                if (!module.packageParts_.isEmpty()) {
                    if (this.packageParts_.isEmpty()) {
                        this.packageParts_ = module.packageParts_;
                        this.bitField0_ &= -2;
                    } else {
                        bHL();
                        this.packageParts_.addAll(module.packageParts_);
                    }
                }
                if (!module.metadataParts_.isEmpty()) {
                    if (this.metadataParts_.isEmpty()) {
                        this.metadataParts_ = module.metadataParts_;
                        this.bitField0_ &= -3;
                    } else {
                        bHM();
                        this.metadataParts_.addAll(module.metadataParts_);
                    }
                }
                if (!module.jvmPackageName_.isEmpty()) {
                    if (this.jvmPackageName_.isEmpty()) {
                        this.jvmPackageName_ = module.jvmPackageName_;
                        this.bitField0_ &= -5;
                    } else {
                        bHN();
                        this.jvmPackageName_.addAll(module.jvmPackageName_);
                    }
                }
                if (module.bHA()) {
                    e(module.bHB());
                }
                if (module.bHC()) {
                    e(module.bHD());
                }
                if (!module.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = module.annotation_;
                        this.bitField0_ &= -33;
                    } else {
                        bFJ();
                        this.annotation_.addAll(module.annotation_);
                    }
                }
                e(bLf().a(module.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < bHw(); i++) {
                    if (!lI(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < bHy(); i++) {
                    if (!lJ(i).isInitialized()) {
                        return false;
                    }
                }
                if (bHC() && !bHD().isInitialized()) {
                    return false;
                }
                for (i = 0; i < bFB(); i++) {
                    if (!lf(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: Y */
            public a f(e eVar, f fVar) {
                Module module;
                Throwable th;
                Module module2 = null;
                try {
                    Module module3 = (Module) Module.fmO.b(eVar, fVar);
                    if (module3 != null) {
                        a(module3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    module = (Module) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    module2 = module;
                }
                if (module2 != null) {
                    a(module2);
                }
                throw th;
            }

            private void bHL() {
                if ((this.bitField0_ & 1) != 1) {
                    this.packageParts_ = new ArrayList(this.packageParts_);
                    this.bitField0_ |= 1;
                }
            }

            public int bHw() {
                return this.packageParts_.size();
            }

            public PackageParts lI(int i) {
                return (PackageParts) this.packageParts_.get(i);
            }

            private void bHM() {
                if ((this.bitField0_ & 2) != 2) {
                    this.metadataParts_ = new ArrayList(this.metadataParts_);
                    this.bitField0_ |= 2;
                }
            }

            public int bHy() {
                return this.metadataParts_.size();
            }

            public PackageParts lJ(int i) {
                return (PackageParts) this.metadataParts_.get(i);
            }

            private void bHN() {
                if ((this.bitField0_ & 4) != 4) {
                    this.jvmPackageName_ = new k(this.jvmPackageName_);
                    this.bitField0_ |= 4;
                }
            }

            public a e(StringTable stringTable) {
                if ((this.bitField0_ & 8) != 8 || this.stringTable_ == StringTable.bEi()) {
                    this.stringTable_ = stringTable;
                } else {
                    this.stringTable_ = StringTable.a(this.stringTable_).a(stringTable).bEr();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public boolean bHC() {
                return (this.bitField0_ & 16) == 16;
            }

            public QualifiedNameTable bHD() {
                return this.qualifiedNameTable_;
            }

            public a e(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 16) != 16 || this.qualifiedNameTable_ == QualifiedNameTable.bDH()) {
                    this.qualifiedNameTable_ = qualifiedNameTable;
                } else {
                    this.qualifiedNameTable_ = QualifiedNameTable.a(this.qualifiedNameTable_).a(qualifiedNameTable).bDQ();
                }
                this.bitField0_ |= 16;
                return this;
            }

            private void bFJ() {
                if ((this.bitField0_ & 32) != 32) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 32;
                }
            }

            public int bFB() {
                return this.annotation_.size();
            }

            public Annotation lf(int i) {
                return (Annotation) this.annotation_.get(i);
            }
        }

        private Module(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private Module(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.fpH;
        }

        public static Module bHt() {
            return foo;
        }

        /* renamed from: bHu */
        public Module bzq() {
            return foo;
        }

        private Module(e eVar, f fVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            bzj();
            OutputStream bKp = d.bKp();
            CodedOutputStream b = CodedOutputStream.b(bKp, 1);
            Object obj = null;
            int i = 0;
            while (obj == null) {
                try {
                    int bKv = eVar.bKv();
                    if (bKv != 0) {
                        if (bKv == 10) {
                            if ((i & 1) != 1) {
                                this.packageParts_ = new ArrayList();
                                i |= 1;
                            }
                            this.packageParts_.add(eVar.a(PackageParts.fmO, fVar));
                        } else if (bKv == 18) {
                            if ((i & 2) != 2) {
                                this.metadataParts_ = new ArrayList();
                                i |= 2;
                            }
                            this.metadataParts_.add(eVar.a(PackageParts.fmO, fVar));
                        } else if (bKv != 26) {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.a aVar = null;
                            if (bKv == 34) {
                                if ((this.bitField0_ & 1) == 1) {
                                    aVar = this.stringTable_.bzo();
                                }
                                this.stringTable_ = (StringTable) eVar.a(StringTable.fmO, fVar);
                                if (aVar != null) {
                                    aVar.a(this.stringTable_);
                                    this.stringTable_ = aVar.bEr();
                                }
                                this.bitField0_ |= 1;
                            } else if (bKv == 42) {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.a bDM;
                                if ((this.bitField0_ & 2) == 2) {
                                    bDM = this.qualifiedNameTable_.bzo();
                                }
                                this.qualifiedNameTable_ = (QualifiedNameTable) eVar.a(QualifiedNameTable.fmO, fVar);
                                if (bDM != null) {
                                    bDM.a(this.qualifiedNameTable_);
                                    this.qualifiedNameTable_ = bDM.bDQ();
                                }
                                this.bitField0_ |= 2;
                            } else if (bKv == 50) {
                                if ((i & 32) != 32) {
                                    this.annotation_ = new ArrayList();
                                    i |= 32;
                                }
                                this.annotation_.add(eVar.a(Annotation.fmO, fVar));
                            } else if (a(eVar, b, fVar, bKv)) {
                            }
                        } else {
                            d bKD = eVar.bKD();
                            if ((i & 4) != 4) {
                                this.jvmPackageName_ = new k();
                                i |= 4;
                            }
                            this.jvmPackageName_.f(bKD);
                        }
                    }
                    obj = 1;
                } catch (InvalidProtocolBufferException e) {
                    throw e.g(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).g(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.packageParts_ = Collections.unmodifiableList(this.packageParts_);
                    }
                    if ((i & 2) == 2) {
                        this.metadataParts_ = Collections.unmodifiableList(this.metadataParts_);
                    }
                    if ((i & 4) == 4) {
                        this.jvmPackageName_ = this.jvmPackageName_.bLA();
                    }
                    if ((i & 32) == 32) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
                this.packageParts_ = Collections.unmodifiableList(this.packageParts_);
            }
            if ((i & 2) == 2) {
                this.metadataParts_ = Collections.unmodifiableList(this.metadataParts_);
            }
            if ((i & 4) == 4) {
                this.jvmPackageName_ = this.jvmPackageName_.bLA();
            }
            if ((i & 32) == 32) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            foo.bzj();
        }

        public p<Module> bzg() {
            return fmO;
        }

        public List<PackageParts> bHv() {
            return this.packageParts_;
        }

        public int bHw() {
            return this.packageParts_.size();
        }

        public PackageParts lI(int i) {
            return (PackageParts) this.packageParts_.get(i);
        }

        public List<PackageParts> bHx() {
            return this.metadataParts_;
        }

        public int bHy() {
            return this.metadataParts_.size();
        }

        public PackageParts lJ(int i) {
            return (PackageParts) this.metadataParts_.get(i);
        }

        public q bHz() {
            return this.jvmPackageName_;
        }

        public boolean bHA() {
            return (this.bitField0_ & 1) == 1;
        }

        public StringTable bHB() {
            return this.stringTable_;
        }

        public boolean bHC() {
            return (this.bitField0_ & 2) == 2;
        }

        public QualifiedNameTable bHD() {
            return this.qualifiedNameTable_;
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

        private void bzj() {
            this.packageParts_ = Collections.emptyList();
            this.metadataParts_ = Collections.emptyList();
            this.jvmPackageName_ = k.fqy;
            this.stringTable_ = StringTable.bEi();
            this.qualifiedNameTable_ = QualifiedNameTable.bDH();
            this.annotation_ = Collections.emptyList();
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
            while (i < bHw()) {
                if (lI(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < bHy()) {
                if (lJ(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!bHC() || bHD().isInitialized()) {
                i = 0;
                while (i < bFB()) {
                    if (lf(i).isInitialized()) {
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
            int i;
            bzk();
            int i2 = 0;
            for (i = 0; i < this.packageParts_.size(); i++) {
                codedOutputStream.b(1, (n) this.packageParts_.get(i));
            }
            for (i = 0; i < this.metadataParts_.size(); i++) {
                codedOutputStream.b(2, (n) this.metadataParts_.get(i));
            }
            for (i = 0; i < this.jvmPackageName_.size(); i++) {
                codedOutputStream.a(3, this.jvmPackageName_.mj(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.b(4, this.stringTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.b(5, this.qualifiedNameTable_);
            }
            while (i2 < this.annotation_.size()) {
                codedOutputStream.b(6, (n) this.annotation_.get(i2));
                i2++;
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            i = 0;
            int i3 = 0;
            for (i2 = 0; i2 < this.packageParts_.size(); i2++) {
                i3 += CodedOutputStream.d(1, (n) this.packageParts_.get(i2));
            }
            for (i2 = 0; i2 < this.metadataParts_.size(); i2++) {
                i3 += CodedOutputStream.d(2, (n) this.metadataParts_.get(i2));
            }
            int i4 = 0;
            for (i2 = 0; i2 < this.jvmPackageName_.size(); i2++) {
                i4 += CodedOutputStream.c(this.jvmPackageName_.mj(i2));
            }
            i3 = (i3 + i4) + (bHz().size() * 1);
            if ((this.bitField0_ & 1) == 1) {
                i3 += CodedOutputStream.d(4, this.stringTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i3 += CodedOutputStream.d(5, this.qualifiedNameTable_);
            }
            while (i < this.annotation_.size()) {
                i3 += CodedOutputStream.d(6, (n) this.annotation_.get(i));
                i++;
            }
            i3 += this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static Module k(InputStream inputStream) {
            return (Module) fmO.m(inputStream);
        }

        public static a bHE() {
            return a.bHH();
        }

        /* renamed from: bHF */
        public a bzp() {
            return bHE();
        }

        public static a a(Module module) {
            return bHE().a(module);
        }

        /* renamed from: bHG */
        public a bzo() {
            return a(this);
        }
    }

    public static final class PackageParts extends GeneratedMessageLite implements b {
        public static p<PackageParts> fmO = new kotlin.reflect.jvm.internal.impl.protobuf.b<PackageParts>() {
            /* renamed from: Z */
            public PackageParts b(e eVar, f fVar) {
                return new PackageParts(eVar, fVar);
            }
        };
        private static final PackageParts fop = new PackageParts(true);
        private int bitField0_;
        private int classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize;
        private List<Integer> classWithJvmPackageNameMultifileFacadeShortNameId_;
        private int classWithJvmPackageNamePackageIdMemoizedSerializedSize;
        private List<Integer> classWithJvmPackageNamePackageId_;
        private l classWithJvmPackageNameShortName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int multifileFacadeShortNameIdMemoizedSerializedSize;
        private List<Integer> multifileFacadeShortNameId_;
        private l multifileFacadeShortName_;
        private Object packageFqName_;
        private l shortClassName_;
        private final d unknownFields;

        public static final class a extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a<PackageParts, a> implements b {
            private int bitField0_;
            private List<Integer> classWithJvmPackageNameMultifileFacadeShortNameId_ = Collections.emptyList();
            private List<Integer> classWithJvmPackageNamePackageId_ = Collections.emptyList();
            private l classWithJvmPackageNameShortName_ = k.fqy;
            private List<Integer> multifileFacadeShortNameId_ = Collections.emptyList();
            private l multifileFacadeShortName_ = k.fqy;
            private Object packageFqName_ = "";
            private l shortClassName_ = k.fqy;

            private void bzy() {
            }

            private a() {
                bzy();
            }

            private static a bId() {
                return new a();
            }

            /* renamed from: bIe */
            public a clone() {
                return bId().a(bIg());
            }

            /* renamed from: bHQ */
            public PackageParts bzq() {
                return PackageParts.bHP();
            }

            /* renamed from: bIf */
            public PackageParts bzG() {
                PackageParts bIg = bIg();
                if (bIg.isInitialized()) {
                    return bIg;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.a.a.a(bIg);
            }

            public PackageParts bIg() {
                PackageParts packageParts = new PackageParts((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a) this, null);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                packageParts.packageFqName_ = this.packageFqName_;
                if ((this.bitField0_ & 2) == 2) {
                    this.shortClassName_ = this.shortClassName_.bLA();
                    this.bitField0_ &= -3;
                }
                packageParts.shortClassName_ = this.shortClassName_;
                if ((this.bitField0_ & 4) == 4) {
                    this.multifileFacadeShortNameId_ = Collections.unmodifiableList(this.multifileFacadeShortNameId_);
                    this.bitField0_ &= -5;
                }
                packageParts.multifileFacadeShortNameId_ = this.multifileFacadeShortNameId_;
                if ((this.bitField0_ & 8) == 8) {
                    this.multifileFacadeShortName_ = this.multifileFacadeShortName_.bLA();
                    this.bitField0_ &= -9;
                }
                packageParts.multifileFacadeShortName_ = this.multifileFacadeShortName_;
                if ((this.bitField0_ & 16) == 16) {
                    this.classWithJvmPackageNameShortName_ = this.classWithJvmPackageNameShortName_.bLA();
                    this.bitField0_ &= -17;
                }
                packageParts.classWithJvmPackageNameShortName_ = this.classWithJvmPackageNameShortName_;
                if ((this.bitField0_ & 32) == 32) {
                    this.classWithJvmPackageNameMultifileFacadeShortNameId_ = Collections.unmodifiableList(this.classWithJvmPackageNameMultifileFacadeShortNameId_);
                    this.bitField0_ &= -33;
                }
                packageParts.classWithJvmPackageNameMultifileFacadeShortNameId_ = this.classWithJvmPackageNameMultifileFacadeShortNameId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.classWithJvmPackageNamePackageId_ = Collections.unmodifiableList(this.classWithJvmPackageNamePackageId_);
                    this.bitField0_ &= -65;
                }
                packageParts.classWithJvmPackageNamePackageId_ = this.classWithJvmPackageNamePackageId_;
                packageParts.bitField0_ = i;
                return packageParts;
            }

            /* renamed from: j */
            public a a(PackageParts packageParts) {
                if (packageParts == PackageParts.bHP()) {
                    return this;
                }
                if (packageParts.bHR()) {
                    this.bitField0_ |= 1;
                    this.packageFqName_ = packageParts.packageFqName_;
                }
                if (!packageParts.shortClassName_.isEmpty()) {
                    if (this.shortClassName_.isEmpty()) {
                        this.shortClassName_ = packageParts.shortClassName_;
                        this.bitField0_ &= -3;
                    } else {
                        bIh();
                        this.shortClassName_.addAll(packageParts.shortClassName_);
                    }
                }
                if (!packageParts.multifileFacadeShortNameId_.isEmpty()) {
                    if (this.multifileFacadeShortNameId_.isEmpty()) {
                        this.multifileFacadeShortNameId_ = packageParts.multifileFacadeShortNameId_;
                        this.bitField0_ &= -5;
                    } else {
                        bIi();
                        this.multifileFacadeShortNameId_.addAll(packageParts.multifileFacadeShortNameId_);
                    }
                }
                if (!packageParts.multifileFacadeShortName_.isEmpty()) {
                    if (this.multifileFacadeShortName_.isEmpty()) {
                        this.multifileFacadeShortName_ = packageParts.multifileFacadeShortName_;
                        this.bitField0_ &= -9;
                    } else {
                        bIj();
                        this.multifileFacadeShortName_.addAll(packageParts.multifileFacadeShortName_);
                    }
                }
                if (!packageParts.classWithJvmPackageNameShortName_.isEmpty()) {
                    if (this.classWithJvmPackageNameShortName_.isEmpty()) {
                        this.classWithJvmPackageNameShortName_ = packageParts.classWithJvmPackageNameShortName_;
                        this.bitField0_ &= -17;
                    } else {
                        bIk();
                        this.classWithJvmPackageNameShortName_.addAll(packageParts.classWithJvmPackageNameShortName_);
                    }
                }
                if (!packageParts.classWithJvmPackageNameMultifileFacadeShortNameId_.isEmpty()) {
                    if (this.classWithJvmPackageNameMultifileFacadeShortNameId_.isEmpty()) {
                        this.classWithJvmPackageNameMultifileFacadeShortNameId_ = packageParts.classWithJvmPackageNameMultifileFacadeShortNameId_;
                        this.bitField0_ &= -33;
                    } else {
                        bIl();
                        this.classWithJvmPackageNameMultifileFacadeShortNameId_.addAll(packageParts.classWithJvmPackageNameMultifileFacadeShortNameId_);
                    }
                }
                if (!packageParts.classWithJvmPackageNamePackageId_.isEmpty()) {
                    if (this.classWithJvmPackageNamePackageId_.isEmpty()) {
                        this.classWithJvmPackageNamePackageId_ = packageParts.classWithJvmPackageNamePackageId_;
                        this.bitField0_ &= -65;
                    } else {
                        bIm();
                        this.classWithJvmPackageNamePackageId_.addAll(packageParts.classWithJvmPackageNamePackageId_);
                    }
                }
                e(bLf().a(packageParts.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                return bHR();
            }

            /* renamed from: aa */
            public a f(e eVar, f fVar) {
                PackageParts packageParts;
                Throwable th;
                PackageParts packageParts2 = null;
                try {
                    PackageParts packageParts3 = (PackageParts) PackageParts.fmO.b(eVar, fVar);
                    if (packageParts3 != null) {
                        a(packageParts3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    packageParts = (PackageParts) e.bLo();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    packageParts2 = packageParts;
                }
                if (packageParts2 != null) {
                    a(packageParts2);
                }
                throw th;
            }

            public boolean bHR() {
                return (this.bitField0_ & 1) == 1;
            }

            private void bIh() {
                if ((this.bitField0_ & 2) != 2) {
                    this.shortClassName_ = new k(this.shortClassName_);
                    this.bitField0_ |= 2;
                }
            }

            private void bIi() {
                if ((this.bitField0_ & 4) != 4) {
                    this.multifileFacadeShortNameId_ = new ArrayList(this.multifileFacadeShortNameId_);
                    this.bitField0_ |= 4;
                }
            }

            private void bIj() {
                if ((this.bitField0_ & 8) != 8) {
                    this.multifileFacadeShortName_ = new k(this.multifileFacadeShortName_);
                    this.bitField0_ |= 8;
                }
            }

            private void bIk() {
                if ((this.bitField0_ & 16) != 16) {
                    this.classWithJvmPackageNameShortName_ = new k(this.classWithJvmPackageNameShortName_);
                    this.bitField0_ |= 16;
                }
            }

            private void bIl() {
                if ((this.bitField0_ & 32) != 32) {
                    this.classWithJvmPackageNameMultifileFacadeShortNameId_ = new ArrayList(this.classWithJvmPackageNameMultifileFacadeShortNameId_);
                    this.bitField0_ |= 32;
                }
            }

            private void bIm() {
                if ((this.bitField0_ & 64) != 64) {
                    this.classWithJvmPackageNamePackageId_ = new ArrayList(this.classWithJvmPackageNamePackageId_);
                    this.bitField0_ |= 64;
                }
            }
        }

        private PackageParts(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a aVar) {
            super(aVar);
            this.multifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = aVar.bLf();
        }

        private PackageParts(boolean z) {
            this.multifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.fpH;
        }

        public static PackageParts bHP() {
            return fop;
        }

        /* renamed from: bHQ */
        public PackageParts bzq() {
            return fop;
        }

        /* JADX WARNING: Missing block: B:59:0x017b, code skipped:
            r14 = r18;
     */
        /* JADX WARNING: Missing block: B:61:0x0181, code skipped:
            r5 = 1;
     */
        private PackageParts(kotlin.reflect.jvm.internal.impl.protobuf.e r17, kotlin.reflect.jvm.internal.impl.protobuf.f r18) {
            /*
            r16 = this;
            r1 = r16;
            r0 = r17;
            r16.<init>();
            r2 = -1;
            r1.multifileFacadeShortNameIdMemoizedSerializedSize = r2;
            r1.classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize = r2;
            r1.classWithJvmPackageNamePackageIdMemoizedSerializedSize = r2;
            r1.memoizedIsInitialized = r2;
            r1.memoizedSerializedSize = r2;
            r16.bzj();
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.d.bKp();
            r3 = 1;
            r4 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.b(r2, r3);
            r5 = 0;
            r6 = 0;
        L_0x0020:
            r7 = 16;
            r8 = 8;
            r9 = 2;
            r10 = 32;
            r11 = 64;
            r12 = 4;
            if (r5 != 0) goto L_0x01fd;
        L_0x002c:
            r13 = r17.bKv();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            switch(r13) {
                case 0: goto L_0x017f;
                case 10: goto L_0x0170;
                case 18: goto L_0x0159;
                case 24: goto L_0x013e;
                case 26: goto L_0x010b;
                case 34: goto L_0x00f3;
                case 42: goto L_0x00db;
                case 48: goto L_0x00bf;
                case 50: goto L_0x008b;
                case 56: goto L_0x006f;
                case 58: goto L_0x003b;
                default: goto L_0x0033;
            };	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
        L_0x0033:
            r14 = r18;
            r7 = r1.a(r0, r4, r14, r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x0184;
        L_0x003b:
            r13 = r17.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13 = r0.lV(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 32;
            if (r14 == r10) goto L_0x0056;
        L_0x0047:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x0056;
        L_0x004d:
            r14 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.classWithJvmPackageNameMultifileFacadeShortNameId_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 32;
        L_0x0056:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x006a;
        L_0x005c:
            r14 = r1.classWithJvmPackageNameMultifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = java.lang.Integer.valueOf(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.add(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x0056;
        L_0x006a:
            r0.lW(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x006f:
            r13 = r6 & 32;
            if (r13 == r10) goto L_0x007c;
        L_0x0073:
            r13 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.classWithJvmPackageNameMultifileFacadeShortNameId_ = r13;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 32;
        L_0x007c:
            r13 = r1.classWithJvmPackageNameMultifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = java.lang.Integer.valueOf(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.add(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x008b:
            r13 = r17.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13 = r0.lV(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 64;
            if (r14 == r11) goto L_0x00a6;
        L_0x0097:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x00a6;
        L_0x009d:
            r14 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.classWithJvmPackageNamePackageId_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 64;
        L_0x00a6:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x00ba;
        L_0x00ac:
            r14 = r1.classWithJvmPackageNamePackageId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = java.lang.Integer.valueOf(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.add(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x00a6;
        L_0x00ba:
            r0.lW(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x00bf:
            r13 = r6 & 64;
            if (r13 == r11) goto L_0x00cc;
        L_0x00c3:
            r13 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.classWithJvmPackageNamePackageId_ = r13;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 64;
        L_0x00cc:
            r13 = r1.classWithJvmPackageNamePackageId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = java.lang.Integer.valueOf(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.add(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x00db:
            r13 = r17.bKD();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 16;
            if (r14 == r7) goto L_0x00ec;
        L_0x00e3:
            r14 = new kotlin.reflect.jvm.internal.impl.protobuf.k;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.classWithJvmPackageNameShortName_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 16;
        L_0x00ec:
            r14 = r1.classWithJvmPackageNameShortName_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.f(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x00f3:
            r13 = r17.bKD();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 8;
            if (r14 == r8) goto L_0x0104;
        L_0x00fb:
            r14 = new kotlin.reflect.jvm.internal.impl.protobuf.k;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.multifileFacadeShortName_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 8;
        L_0x0104:
            r14 = r1.multifileFacadeShortName_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.f(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x010b:
            r13 = r17.bKK();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13 = r0.lV(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 4;
            if (r14 == r12) goto L_0x0126;
        L_0x0117:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x0126;
        L_0x011d:
            r14 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.multifileFacadeShortNameId_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 4;
        L_0x0126:
            r14 = r17.bKQ();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            if (r14 <= 0) goto L_0x013a;
        L_0x012c:
            r14 = r1.multifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r15 = java.lang.Integer.valueOf(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.add(r15);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x0126;
        L_0x013a:
            r0.lW(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x013e:
            r13 = r6 & 4;
            if (r13 == r12) goto L_0x014b;
        L_0x0142:
            r13 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.multifileFacadeShortNameId_ = r13;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 4;
        L_0x014b:
            r13 = r1.multifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r17.bKy();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = java.lang.Integer.valueOf(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r13.add(r14);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x0159:
            r13 = r17.bKD();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r6 & 2;
            if (r14 == r9) goto L_0x016a;
        L_0x0161:
            r14 = new kotlin.reflect.jvm.internal.impl.protobuf.k;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.shortClassName_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r6 = r6 | 2;
        L_0x016a:
            r14 = r1.shortClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14.f(r13);	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            goto L_0x017b;
        L_0x0170:
            r13 = r17.bKD();	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r14 = r14 | r3;
            r1.bitField0_ = r14;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
            r1.packageFqName_ = r13;	 Catch:{ InvalidProtocolBufferException -> 0x0198, IOException -> 0x0189 }
        L_0x017b:
            r14 = r18;
            goto L_0x0020;
        L_0x017f:
            r14 = r18;
        L_0x0181:
            r5 = 1;
            goto L_0x0020;
        L_0x0184:
            if (r7 != 0) goto L_0x0020;
        L_0x0186:
            goto L_0x0181;
        L_0x0187:
            r0 = move-exception;
            goto L_0x019e;
        L_0x0189:
            r0 = move-exception;
            r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0187 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0187 }
            r3.<init>(r0);	 Catch:{ all -> 0x0187 }
            r0 = r3.g(r1);	 Catch:{ all -> 0x0187 }
            throw r0;	 Catch:{ all -> 0x0187 }
        L_0x0198:
            r0 = move-exception;
            r0 = r0.g(r1);	 Catch:{ all -> 0x0187 }
            throw r0;	 Catch:{ all -> 0x0187 }
        L_0x019e:
            r3 = r6 & 2;
            if (r3 != r9) goto L_0x01aa;
        L_0x01a2:
            r3 = r1.shortClassName_;
            r3 = r3.bLA();
            r1.shortClassName_ = r3;
        L_0x01aa:
            r3 = r6 & 4;
            if (r3 != r12) goto L_0x01b6;
        L_0x01ae:
            r3 = r1.multifileFacadeShortNameId_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.multifileFacadeShortNameId_ = r3;
        L_0x01b6:
            r3 = r6 & 8;
            if (r3 != r8) goto L_0x01c2;
        L_0x01ba:
            r3 = r1.multifileFacadeShortName_;
            r3 = r3.bLA();
            r1.multifileFacadeShortName_ = r3;
        L_0x01c2:
            r3 = r6 & 16;
            if (r3 != r7) goto L_0x01ce;
        L_0x01c6:
            r3 = r1.classWithJvmPackageNameShortName_;
            r3 = r3.bLA();
            r1.classWithJvmPackageNameShortName_ = r3;
        L_0x01ce:
            r3 = r6 & 64;
            if (r3 != r11) goto L_0x01da;
        L_0x01d2:
            r3 = r1.classWithJvmPackageNamePackageId_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.classWithJvmPackageNamePackageId_ = r3;
        L_0x01da:
            r3 = r6 & 32;
            if (r3 != r10) goto L_0x01e6;
        L_0x01de:
            r3 = r1.classWithJvmPackageNameMultifileFacadeShortNameId_;
            r3 = java.util.Collections.unmodifiableList(r3);
            r1.classWithJvmPackageNameMultifileFacadeShortNameId_ = r3;
        L_0x01e6:
            r4.flush();	 Catch:{ IOException -> 0x01e9, all -> 0x01f0 }
        L_0x01e9:
            r2 = r2.bKt();
            r1.unknownFields = r2;
            goto L_0x01f9;
        L_0x01f0:
            r0 = move-exception;
            r3 = r0;
            r0 = r2.bKt();
            r1.unknownFields = r0;
            throw r3;
        L_0x01f9:
            r16.bLe();
            throw r0;
        L_0x01fd:
            r0 = r6 & 2;
            if (r0 != r9) goto L_0x0209;
        L_0x0201:
            r0 = r1.shortClassName_;
            r0 = r0.bLA();
            r1.shortClassName_ = r0;
        L_0x0209:
            r0 = r6 & 4;
            if (r0 != r12) goto L_0x0215;
        L_0x020d:
            r0 = r1.multifileFacadeShortNameId_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r1.multifileFacadeShortNameId_ = r0;
        L_0x0215:
            r0 = r6 & 8;
            if (r0 != r8) goto L_0x0221;
        L_0x0219:
            r0 = r1.multifileFacadeShortName_;
            r0 = r0.bLA();
            r1.multifileFacadeShortName_ = r0;
        L_0x0221:
            r0 = r6 & 16;
            if (r0 != r7) goto L_0x022d;
        L_0x0225:
            r0 = r1.classWithJvmPackageNameShortName_;
            r0 = r0.bLA();
            r1.classWithJvmPackageNameShortName_ = r0;
        L_0x022d:
            r0 = r6 & 64;
            if (r0 != r11) goto L_0x0239;
        L_0x0231:
            r0 = r1.classWithJvmPackageNamePackageId_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r1.classWithJvmPackageNamePackageId_ = r0;
        L_0x0239:
            r0 = r6 & 32;
            if (r0 != r10) goto L_0x0245;
        L_0x023d:
            r0 = r1.classWithJvmPackageNameMultifileFacadeShortNameId_;
            r0 = java.util.Collections.unmodifiableList(r0);
            r1.classWithJvmPackageNameMultifileFacadeShortNameId_ = r0;
        L_0x0245:
            r4.flush();	 Catch:{ IOException -> 0x0248, all -> 0x024f }
        L_0x0248:
            r0 = r2.bKt();
            r1.unknownFields = r0;
            goto L_0x0258;
        L_0x024f:
            r0 = move-exception;
            r3 = r0;
            r0 = r2.bKt();
            r1.unknownFields = r0;
            throw r3;
        L_0x0258:
            r16.bLe();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
        }

        static {
            fop.bzj();
        }

        public p<PackageParts> bzg() {
            return fmO;
        }

        public boolean bHR() {
            return (this.bitField0_ & 1) == 1;
        }

        public String bHS() {
            Object obj = this.packageFqName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            d dVar = (d) obj;
            String bKm = dVar.bKm();
            if (dVar.bKn()) {
                this.packageFqName_ = bKm;
            }
            return bKm;
        }

        public d bHT() {
            Object obj = this.packageFqName_;
            if (!(obj instanceof String)) {
                return (d) obj;
            }
            d mx = d.mx((String) obj);
            this.packageFqName_ = mx;
            return mx;
        }

        public q bHU() {
            return this.shortClassName_;
        }

        public List<Integer> bHV() {
            return this.multifileFacadeShortNameId_;
        }

        public q bHW() {
            return this.multifileFacadeShortName_;
        }

        public q bHX() {
            return this.classWithJvmPackageNameShortName_;
        }

        public List<Integer> bHY() {
            return this.classWithJvmPackageNameMultifileFacadeShortNameId_;
        }

        public List<Integer> bHZ() {
            return this.classWithJvmPackageNamePackageId_;
        }

        private void bzj() {
            this.packageFqName_ = "";
            this.shortClassName_ = k.fqy;
            this.multifileFacadeShortNameId_ = Collections.emptyList();
            this.multifileFacadeShortName_ = k.fqy;
            this.classWithJvmPackageNameShortName_ = k.fqy;
            this.classWithJvmPackageNameMultifileFacadeShortNameId_ = Collections.emptyList();
            this.classWithJvmPackageNamePackageId_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (bHR()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void a(CodedOutputStream codedOutputStream) {
            int i;
            bzk();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a(1, bHT());
            }
            int i2 = 0;
            for (i = 0; i < this.shortClassName_.size(); i++) {
                codedOutputStream.a(2, this.shortClassName_.mj(i));
            }
            if (bHV().size() > 0) {
                codedOutputStream.K(26);
                codedOutputStream.K(this.multifileFacadeShortNameIdMemoizedSerializedSize);
            }
            for (i = 0; i < this.multifileFacadeShortNameId_.size(); i++) {
                codedOutputStream.A(((Integer) this.multifileFacadeShortNameId_.get(i)).intValue());
            }
            for (i = 0; i < this.multifileFacadeShortName_.size(); i++) {
                codedOutputStream.a(4, this.multifileFacadeShortName_.mj(i));
            }
            for (i = 0; i < this.classWithJvmPackageNameShortName_.size(); i++) {
                codedOutputStream.a(5, this.classWithJvmPackageNameShortName_.mj(i));
            }
            if (bHZ().size() > 0) {
                codedOutputStream.K(50);
                codedOutputStream.K(this.classWithJvmPackageNamePackageIdMemoizedSerializedSize);
            }
            for (i = 0; i < this.classWithJvmPackageNamePackageId_.size(); i++) {
                codedOutputStream.A(((Integer) this.classWithJvmPackageNamePackageId_.get(i)).intValue());
            }
            if (bHY().size() > 0) {
                codedOutputStream.K(58);
                codedOutputStream.K(this.classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize);
            }
            while (i2 < this.classWithJvmPackageNameMultifileFacadeShortNameId_.size()) {
                codedOutputStream.A(((Integer) this.classWithJvmPackageNameMultifileFacadeShortNameId_.get(i2)).intValue());
                i2++;
            }
            codedOutputStream.d(this.unknownFields);
        }

        public int bzk() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3;
            int i4 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.b(1, bHT()) + 0 : 0;
            int i5 = 0;
            for (i2 = 0; i2 < this.shortClassName_.size(); i2++) {
                i5 += CodedOutputStream.c(this.shortClassName_.mj(i2));
            }
            i = (i + i5) + (bHU().size() * 1);
            i5 = 0;
            for (i2 = 0; i2 < this.multifileFacadeShortNameId_.size(); i2++) {
                i5 += CodedOutputStream.E(((Integer) this.multifileFacadeShortNameId_.get(i2)).intValue());
            }
            i += i5;
            if (!bHV().isEmpty()) {
                i = (i + 1) + CodedOutputStream.E(i5);
            }
            this.multifileFacadeShortNameIdMemoizedSerializedSize = i5;
            i5 = 0;
            for (i2 = 0; i2 < this.multifileFacadeShortName_.size(); i2++) {
                i5 += CodedOutputStream.c(this.multifileFacadeShortName_.mj(i2));
            }
            i = (i + i5) + (bHW().size() * 1);
            i5 = 0;
            for (i2 = 0; i2 < this.classWithJvmPackageNameShortName_.size(); i2++) {
                i5 += CodedOutputStream.c(this.classWithJvmPackageNameShortName_.mj(i2));
            }
            i = (i + i5) + (bHX().size() * 1);
            i2 = 0;
            for (i3 = 0; i3 < this.classWithJvmPackageNamePackageId_.size(); i3++) {
                i2 += CodedOutputStream.E(((Integer) this.classWithJvmPackageNamePackageId_.get(i3)).intValue());
            }
            i += i2;
            if (!bHZ().isEmpty()) {
                i = (i + 1) + CodedOutputStream.E(i2);
            }
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = i2;
            i3 = 0;
            while (i4 < this.classWithJvmPackageNameMultifileFacadeShortNameId_.size()) {
                i3 += CodedOutputStream.E(((Integer) this.classWithJvmPackageNameMultifileFacadeShortNameId_.get(i4)).intValue());
                i4++;
            }
            i += i3;
            if (!bHY().isEmpty()) {
                i = (i + 1) + CodedOutputStream.E(i3);
            }
            this.classWithJvmPackageNameMultifileFacadeShortNameIdMemoizedSerializedSize = i3;
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static a bIa() {
            return a.bId();
        }

        /* renamed from: bIb */
        public a bzp() {
            return bIa();
        }

        public static a a(PackageParts packageParts) {
            return bIa().a(packageParts);
        }

        /* renamed from: bIc */
        public a bzo() {
            return a(this);
        }
    }
}
