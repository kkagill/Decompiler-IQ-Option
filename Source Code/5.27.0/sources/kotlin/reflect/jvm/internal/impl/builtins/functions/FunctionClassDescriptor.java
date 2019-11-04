package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.a.m;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: FunctionClassDescriptor.kt */
public final class FunctionClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {
    private static final kotlin.reflect.jvm.internal.impl.name.a fbG = new kotlin.reflect.jvm.internal.impl.name.a(g.eZp, f.ms("Function"));
    private static final kotlin.reflect.jvm.internal.impl.name.a fbH = new kotlin.reflect.jvm.internal.impl.name.a(i.brd(), f.ms("KFunction"));
    public static final a fbI = new a();
    private final int arity;
    private final h eZz;
    private final b fbC = new b();
    private final c fbD = new c(this.eZz, this);
    private final y fbE;
    private final Kind fbF;
    private final List<ao> ws;

    /* compiled from: FunctionClassDescriptor.kt */
    public enum Kind {
        Function(r2, r3),
        SuspendFunction(r2, r3),
        KFunction(i.brd(), r3),
        KSuspendFunction(i.brd(), r3);
        
        public static final a Companion = null;
        private final String classNamePrefix;
        private final kotlin.reflect.jvm.internal.impl.name.b packageFqName;

        /* compiled from: FunctionClassDescriptor.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Kind a(kotlin.reflect.jvm.internal.impl.name.b bVar, String str) {
                kotlin.jvm.internal.i.f(bVar, "packageFqName");
                kotlin.jvm.internal.i.f(str, "className");
                for (Kind kind : Kind.values()) {
                    Object obj = (kotlin.jvm.internal.i.y(kind.getPackageFqName(), bVar) && u.a(str, kind.getClassNamePrefix(), false, 2, null)) ? 1 : null;
                    if (obj != null) {
                        return kind;
                    }
                }
                return null;
            }
        }

        private Kind(kotlin.reflect.jvm.internal.impl.name.b bVar, String str) {
            this.packageFqName = bVar;
            this.classNamePrefix = str;
        }

        public final String getClassNamePrefix() {
            return this.classNamePrefix;
        }

        public final kotlin.reflect.jvm.internal.impl.name.b getPackageFqName() {
            return this.packageFqName;
        }

        static {
            Companion = new a();
        }

        public final f numberedClassName(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.classNamePrefix);
            stringBuilder.append(i);
            f ms = f.ms(stringBuilder.toString());
            kotlin.jvm.internal.i.e(ms, "Name.identifier(\"$classNamePrefix$arity\")");
            return ms;
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.name.a brM() {
            return FunctionClassDescriptor.fbG;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a brN() {
            return FunctionClassDescriptor.fbH;
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {
        public boolean brS() {
            return true;
        }

        public b() {
            super(FunctionClassDescriptor.this.eZz);
        }

        /* Access modifiers changed, original: protected */
        public Collection<w> brO() {
            ArrayList arrayList = new ArrayList(2);
            FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1 functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1 = new FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1(this, arrayList);
            int i = b.aob[FunctionClassDescriptor.this.brJ().ordinal()];
            if (i == 1) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(FunctionClassDescriptor.fbI.brM());
            } else if (i == 2) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(FunctionClassDescriptor.fbI.brN());
            } else if (i == 3) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(FunctionClassDescriptor.fbI.brM());
            } else if (i == 4) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(FunctionClassDescriptor.fbI.brN());
            }
            i = b.axg[FunctionClassDescriptor.this.brJ().ordinal()];
            if (i == 1) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(new kotlin.reflect.jvm.internal.impl.name.a(g.eZp, Kind.Function.numberedClassName(FunctionClassDescriptor.this.bnH())));
            } else if (i == 2) {
                functionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1.g(new kotlin.reflect.jvm.internal.impl.name.a(c.fsQ, Kind.SuspendFunction.numberedClassName(FunctionClassDescriptor.this.bnH())));
            }
            return u.T(arrayList);
        }

        public List<ao> getParameters() {
            return FunctionClassDescriptor.this.ws;
        }

        /* renamed from: brP */
        public FunctionClassDescriptor brR() {
            return FunctionClassDescriptor.this;
        }

        public String toString() {
            return brR().toString();
        }

        /* Access modifiers changed, original: protected */
        public am brT() {
            return kotlin.reflect.jvm.internal.impl.descriptors.am.a.fcX;
        }
    }

    public boolean AZ() {
        return false;
    }

    public boolean brA() {
        return false;
    }

    public boolean brB() {
        return false;
    }

    public boolean brC() {
        return false;
    }

    public boolean brD() {
        return false;
    }

    public Void brp() {
        return null;
    }

    public Void brv() {
        return null;
    }

    public boolean bry() {
        return false;
    }

    public boolean brz() {
        return false;
    }

    public /* synthetic */ d brq() {
        return (d) brp();
    }

    public /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.c brw() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.c) brv();
    }

    public final Kind brJ() {
        return this.fbF;
    }

    public final int bnH() {
        return this.arity;
    }

    public FunctionClassDescriptor(h hVar, y yVar, Kind kind, int i) {
        kotlin.jvm.internal.i.f(hVar, "storageManager");
        kotlin.jvm.internal.i.f(yVar, "containingDeclaration");
        kotlin.jvm.internal.i.f(kind, "functionKind");
        super(hVar, kind.numberedClassName(i));
        this.eZz = hVar;
        this.fbE = yVar;
        this.fbF = kind;
        this.arity = i;
        final ArrayList arrayList = new ArrayList();
        AnonymousClass1 anonymousClass1 = new m<Variance, String, l>(this) {
            final /* synthetic */ FunctionClassDescriptor this$0;

            public /* synthetic */ Object w(Object obj, Object obj2) {
                a((Variance) obj, (String) obj2);
                return l.eVB;
            }

            public final void a(Variance variance, String str) {
                kotlin.jvm.internal.i.f(variance, "variance");
                kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
                arrayList.add(ah.a(this.this$0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), false, variance, f.ms(str), arrayList.size()));
            }
        };
        Iterable fVar = new kotlin.g.f(1, this.arity);
        Collection arrayList2 = new ArrayList(n.e(fVar, 10));
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((z) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('P');
            stringBuilder.append(nextInt);
            anonymousClass1.a(variance, stringBuilder.toString());
            arrayList2.add(l.eVB);
        }
        List list = (List) arrayList2;
        anonymousClass1.a(Variance.OUT_VARIANCE, "R");
        this.ws = u.T(arrayList);
    }

    /* renamed from: bri */
    public y brj() {
        return this.fbE;
    }

    /* renamed from: brk */
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c brl() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
    }

    public an brm() {
        return this.fbC;
    }

    /* renamed from: brn */
    public c bro() {
        return this.fbD;
    }

    /* renamed from: brr */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.c> brs() {
        return m.emptyList();
    }

    public ClassKind brt() {
        return ClassKind.INTERFACE;
    }

    public Modality bru() {
        return Modality.ABSTRACT;
    }

    public aw brx() {
        aw awVar = av.fde;
        kotlin.jvm.internal.i.e(awVar, "Visibilities.PUBLIC");
        return awVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
    }

    public aj brF() {
        aj ajVar = aj.fcV;
        kotlin.jvm.internal.i.e(ajVar, "SourceElement.NO_SOURCE");
        return ajVar;
    }

    /* renamed from: brG */
    public List<d> brH() {
        return m.emptyList();
    }

    public List<ao> brI() {
        return this.ws;
    }

    public String toString() {
        String boi = bsZ().boi();
        kotlin.jvm.internal.i.e(boi, "name.asString()");
        return boi;
    }
}
