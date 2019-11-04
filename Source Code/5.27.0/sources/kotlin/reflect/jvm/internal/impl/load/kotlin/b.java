package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.entity.ActiveQuote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.h;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.p;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.reflect.jvm.internal.impl.resolve.constants.u;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class b extends AbstractBinaryClassAnnotationAndConstantLoader<c, g<?>> {
    private final x fbm;
    private final v fbz;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b flx = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b(this.fbz, this.fbm);

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.a {
        final /* synthetic */ d flA;
        final /* synthetic */ List flB;
        final /* synthetic */ aj flC;
        private final HashMap<f, g<?>> fly = new HashMap();
        final /* synthetic */ b flz;

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.a {
            final /* synthetic */ ArrayList $list;
            final /* synthetic */ f $name;
            private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.n.a flD;
            final /* synthetic */ a flE;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.n.a flF;

            public kotlin.reflect.jvm.internal.impl.load.kotlin.n.b A(f fVar) {
                i.f(fVar, ConditionalUserProperty.NAME);
                return this.flD.A(fVar);
            }

            public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar) {
                i.f(fVar, ConditionalUserProperty.NAME);
                i.f(aVar, "classId");
                return this.flD.a(fVar, aVar);
            }

            public void a(f fVar, Object obj) {
                this.flD.a(fVar, obj);
            }

            public void a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, f fVar2) {
                i.f(fVar, ConditionalUserProperty.NAME);
                i.f(aVar, "enumClassId");
                i.f(fVar2, "enumEntryName");
                this.flD.a(fVar, aVar, fVar2);
            }

            public void a(f fVar, kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                i.f(fVar, ConditionalUserProperty.NAME);
                i.f(fVar2, ConditionalUserProperty.VALUE);
                this.flD.a(fVar, fVar2);
            }

            a(a aVar, kotlin.reflect.jvm.internal.impl.load.kotlin.n.a aVar2, f fVar, ArrayList arrayList) {
                this.flE = aVar;
                this.flF = aVar2;
                this.$name = fVar;
                this.$list = arrayList;
                this.flD = aVar2;
            }

            public void byq() {
                this.flF.byq();
                this.flE.fly.put(this.$name, new kotlin.reflect.jvm.internal.impl.resolve.constants.a((c) u.bY(this.$list)));
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.n.b {
            final /* synthetic */ f $name;
            final /* synthetic */ a flE;
            private final ArrayList<g<?>> flG = new ArrayList();

            b(a aVar, f fVar) {
                this.flE = aVar;
                this.$name = fVar;
            }

            public void dE(Object obj) {
                this.flG.add(this.flE.b(this.$name, obj));
            }

            public void b(kotlin.reflect.jvm.internal.impl.name.a aVar, f fVar) {
                i.f(aVar, "enumClassId");
                i.f(fVar, "enumEntryName");
                this.flG.add(new j(aVar, fVar));
            }

            public void a(kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
                i.f(fVar, ConditionalUserProperty.VALUE);
                this.flG.add(new p(fVar));
            }

            public void byq() {
                ar b = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(this.$name, this.flE.flA);
                if (b != null) {
                    Map a = this.flE.fly;
                    f fVar = this.$name;
                    h hVar = h.ftB;
                    List i = kotlin.reflect.jvm.internal.impl.utils.a.i(this.flG);
                    w bpT = b.bpT();
                    i.e(bpT, "parameter.type");
                    a.put(fVar, hVar.a(i, bpT));
                }
            }
        }

        a(b bVar, d dVar, List list, aj ajVar) {
            this.flz = bVar;
            this.flA = dVar;
            this.flB = list;
            this.flC = ajVar;
        }

        public void a(f fVar, Object obj) {
            if (fVar != null) {
                this.fly.put(fVar, b(fVar, obj));
            }
        }

        public void a(f fVar, kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(fVar2, ConditionalUserProperty.VALUE);
            this.fly.put(fVar, new p(fVar2));
        }

        public void a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, f fVar2) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(aVar, "enumClassId");
            i.f(fVar2, "enumEntryName");
            this.fly.put(fVar, new j(aVar, fVar2));
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.b A(f fVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            return new b(this, fVar);
        }

        public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(aVar, "classId");
            ArrayList arrayList = new ArrayList();
            b bVar = this.flz;
            aj ajVar = aj.fcV;
            i.e(ajVar, "SourceElement.NO_SOURCE");
            kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a = bVar.a(aVar, ajVar, arrayList);
            if (a == null) {
                i.bnJ();
            }
            return new a(this, a, fVar, arrayList);
        }

        public void byq() {
            this.flB.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.flA.bsY(), this.fly, this.flC));
        }

        private final g<?> b(f fVar, Object obj) {
            g<?> dQ = h.ftB.dQ(obj);
            if (dQ != null) {
                return dQ;
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.k.a aVar = k.ftE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported annotation argument: ");
            stringBuilder.append(fVar);
            return aVar.mG(stringBuilder.toString());
        }
    }

    public b(v vVar, x xVar, kotlin.reflect.jvm.internal.impl.storage.h hVar, l lVar) {
        i.f(vVar, "module");
        i.f(xVar, "notFoundClasses");
        i.f(hVar, "storageManager");
        i.f(lVar, "kotlinClassFinder");
        super(hVar, lVar);
        this.fbz = vVar;
        this.fbm = xVar;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: b */
    public c a(Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        i.f(annotation, "proto");
        i.f(cVar, "nameResolver");
        return this.flx.c(annotation, cVar);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: t */
    public g<?> s(String str, Object obj) {
        i.f(str, "desc");
        i.f(obj, "initializer");
        boolean z = false;
        if (v.b((CharSequence) "ZBCS", (CharSequence) str, false, 2, null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals(ActiveQuote.PHASE_CLOSED)) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return h.ftB.dQ(obj);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: b */
    public g<?> dD(g<?> gVar) {
        i.f(gVar, "constant");
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.d) {
            return new u(((Number) ((kotlin.reflect.jvm.internal.impl.resolve.constants.d) gVar).getValue()).byteValue());
        }
        if (gVar instanceof s) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.x(((Number) ((s) gVar).getValue()).shortValue());
        }
        if (gVar instanceof m) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.v(((Number) ((m) gVar).getValue()).intValue());
        }
        return gVar instanceof q ? new kotlin.reflect.jvm.internal.impl.resolve.constants.w(((Number) ((q) gVar).getValue()).longValue()) : gVar;
    }

    /* Access modifiers changed, original: protected */
    public kotlin.reflect.jvm.internal.impl.load.kotlin.n.a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar, List<c> list) {
        i.f(aVar, "annotationClassId");
        i.f(ajVar, "source");
        i.f(list, "result");
        return new a(this, j(aVar), list, ajVar);
    }

    private final d j(kotlin.reflect.jvm.internal.impl.name.a aVar) {
        return r.a(this.fbz, aVar, this.fbm);
    }
}
