package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.c {
    private static final boolean fmF = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    private static final Map<kotlin.reflect.jvm.internal.impl.name.a, Kind> fmG = new HashMap();
    private d fmA = null;
    private String[] fmB = null;
    private String[] fmC = null;
    private String fmD = null;
    private int fmE = 0;
    private int[] fmH = null;
    private Kind fmI = null;
    private String packageName = null;
    private String[] strings = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private static abstract class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.b {
        private final List<String> fmJ = new ArrayList();

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(2);
            }
        }

        public void b(kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (aVar == null) {
                $$$reportNull$$$0(0);
            }
            if (fVar == null) {
                $$$reportNull$$$0(1);
            }
        }

        public abstract void j(String[] strArr);

        public void dE(Object obj) {
            if (obj instanceof String) {
                this.fmJ.add((String) obj);
            }
        }

        public void byq() {
            List list = this.fmJ;
            j((String[]) list.toArray(new String[list.size()]));
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.a {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 3 || i == 4) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 9) {
                objArr[0] = "classId";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else if (i == 6) {
                objArr[0] = "enumClassId";
            } else if (i != 7) {
                objArr[0] = ConditionalUserProperty.NAME;
            } else {
                objArr[0] = "enumEntryName";
            }
            if (i == 3) {
                objArr[1] = "dataArrayVisitor";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "stringsArrayVisitor";
            }
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                    objArr[2] = "visitEnum";
                    break;
                case 8:
                case 9:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar) {
            if (fVar == null) {
                $$$reportNull$$$0(8);
            }
            if (aVar == null) {
                $$$reportNull$$$0(9);
            }
            return null;
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar2) {
            if (fVar == null) {
                $$$reportNull$$$0(5);
            }
            if (aVar == null) {
                $$$reportNull$$$0(6);
            }
            if (fVar2 == null) {
                $$$reportNull$$$0(7);
            }
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2) {
            if (fVar == null) {
                $$$reportNull$$$0(0);
            }
            if (fVar2 == null) {
                $$$reportNull$$$0(1);
            }
        }

        public void byq() {
        }

        private b() {
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
            if (fVar != null) {
                String boi = fVar.boi();
                if ("k".equals(boi)) {
                    if (obj instanceof Integer) {
                        a.this.fmI = Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(boi)) {
                    if (obj instanceof int[]) {
                        a.this.fmH = (int[]) obj;
                    }
                } else if ("bv".equals(boi)) {
                    if (obj instanceof int[]) {
                        a.this.fmA = new d((int[]) obj);
                    }
                } else if ("xs".equals(boi)) {
                    if (obj instanceof String) {
                        a.this.fmD = (String) obj;
                    }
                } else if ("xi".equals(boi)) {
                    if (obj instanceof Integer) {
                        a.this.fmE = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(boi) && (obj instanceof String)) {
                    a.this.packageName = (String) obj;
                }
            }
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.b A(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(2);
            }
            String boi = fVar.boi();
            if ("d1".equals(boi)) {
                return bzc();
            }
            return "d2".equals(boi) ? bzd() : null;
        }

        private kotlin.reflect.jvm.internal.impl.load.kotlin.n.b bzc() {
            return new a() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
                }

                /* Access modifiers changed, original: protected */
                public void j(String[] strArr) {
                    if (strArr == null) {
                        AnonymousClass1.$$$reportNull$$$0(0);
                    }
                    a.this.fmB = strArr;
                }
            };
        }

        private kotlin.reflect.jvm.internal.impl.load.kotlin.n.b bzd() {
            return new a() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
                }

                /* Access modifiers changed, original: protected */
                public void j(String[] strArr) {
                    if (strArr == null) {
                        AnonymousClass2.$$$reportNull$$$0(0);
                    }
                    a.this.strings = strArr;
                }
            };
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class c implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.a {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 3 || i == 4) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 9) {
                objArr[0] = "classId";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else if (i == 6) {
                objArr[0] = "enumClassId";
            } else if (i != 7) {
                objArr[0] = ConditionalUserProperty.NAME;
            } else {
                objArr[0] = "enumEntryName";
            }
            if (i == 3) {
                objArr[1] = "dataArrayVisitor";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "stringsArrayVisitor";
            }
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                    objArr[2] = "visitEnum";
                    break;
                case 8:
                case 9:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar) {
            if (fVar == null) {
                $$$reportNull$$$0(8);
            }
            if (aVar == null) {
                $$$reportNull$$$0(9);
            }
            return null;
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar2) {
            if (fVar == null) {
                $$$reportNull$$$0(5);
            }
            if (aVar == null) {
                $$$reportNull$$$0(6);
            }
            if (fVar2 == null) {
                $$$reportNull$$$0(7);
            }
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2) {
            if (fVar == null) {
                $$$reportNull$$$0(0);
            }
            if (fVar2 == null) {
                $$$reportNull$$$0(1);
            }
        }

        public void byq() {
        }

        private c() {
        }

        public void a(kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
            if (fVar != null) {
                String boi = fVar.boi();
                if ("version".equals(boi)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        a.this.fmH = iArr;
                        if (a.this.fmA == null) {
                            a.this.fmA = new d(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(boi)) {
                    a.this.fmD = obj instanceof String ? (String) obj : null;
                }
            }
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.b A(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(2);
            }
            String boi = fVar.boi();
            if ("data".equals(boi) || "filePartClassNames".equals(boi)) {
                return bzc();
            }
            return "strings".equals(boi) ? bzd() : null;
        }

        private kotlin.reflect.jvm.internal.impl.load.kotlin.n.b bzc() {
            return new a() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
                }

                /* Access modifiers changed, original: protected */
                public void j(String[] strArr) {
                    if (strArr == null) {
                        AnonymousClass1.$$$reportNull$$$0(0);
                    }
                    a.this.fmB = strArr;
                }
            };
        }

        private kotlin.reflect.jvm.internal.impl.load.kotlin.n.b bzd() {
            return new a() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
                }

                /* Access modifiers changed, original: protected */
                public void j(String[] strArr) {
                    if (strArr == null) {
                        AnonymousClass2.$$$reportNull$$$0(0);
                    }
                    a.this.strings = strArr;
                }
            };
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void byq() {
    }

    static {
        fmG.put(kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b("kotlin.jvm.internal.KotlinClass")), Kind.CLASS);
        fmG.put(kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b("kotlin.jvm.internal.KotlinFileFacade")), Kind.FILE_FACADE);
        fmG.put(kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b("kotlin.jvm.internal.KotlinMultifileClass")), Kind.MULTIFILE_CLASS);
        fmG.put(kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b("kotlin.jvm.internal.KotlinMultifileClassPart")), Kind.MULTIFILE_CLASS_PART);
        fmG.put(kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b("kotlin.jvm.internal.KotlinSyntheticClass")), Kind.SYNTHETIC_CLASS);
    }

    public KotlinClassHeader bza() {
        if (this.fmI != null) {
            int[] iArr = this.fmH;
            if (iArr != null) {
                g gVar = new g(iArr, (this.fmE & 8) != 0);
                if (!gVar.bJQ()) {
                    this.fmC = this.fmB;
                    this.fmB = null;
                } else if (bzb() && this.fmB == null) {
                    return null;
                }
                Kind kind = this.fmI;
                d dVar = this.fmA;
                if (dVar == null) {
                    dVar = d.foL;
                }
                return new KotlinClassHeader(kind, gVar, dVar, this.fmB, this.fmC, this.strings, this.fmD, this.fmE, this.packageName);
            }
        }
        return null;
    }

    private boolean bzb() {
        return this.fmI == Kind.CLASS || this.fmI == Kind.FILE_FACADE || this.fmI == Kind.MULTIFILE_CLASS_PART;
    }

    public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(1);
        }
        if (aVar.bJZ().equals(n.fhk)) {
            return new b();
        }
        if (fmF || this.fmI != null) {
            return null;
        }
        Kind kind = (Kind) fmG.get(aVar);
        if (kind == null) {
            return null;
        }
        this.fmI = kind;
        return new c();
    }
}
