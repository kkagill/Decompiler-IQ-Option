package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;

/* compiled from: DeserializedDescriptorResolver.kt */
public final class d {
    private static final Set<Kind> flI = ak.df(Kind.CLASS);
    private static final Set<Kind> flJ = al.setOf(Kind.FILE_FACADE, Kind.MULTIFILE_CLASS_PART);
    private static final g flK = new g(1, 1, 2);
    private static final g flL = new g(1, 1, 11);
    private static final g flM = new g(1, 1, 13);
    public static final a flN = new a();
    public h flH;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g byv() {
            return d.flM;
        }
    }

    public final h bys() {
        h hVar = this.flH;
        if (hVar == null) {
            i.lG("components");
        }
        return hVar;
    }

    public final void a(c cVar) {
        i.f(cVar, "components");
        this.flH = cVar.bys();
    }

    private final boolean byt() {
        h hVar = this.flH;
        if (hVar == null) {
            i.lG("components");
        }
        return hVar.bNZ().byt();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d e(n nVar) {
        i.f(nVar, "kotlinClass");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.d f = f(nVar);
        if (f == null) {
            return null;
        }
        h hVar = this.flH;
        if (hVar == null) {
            i.lG("components");
        }
        return hVar.bNX().a(nVar.getClassId(), f);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.d f(n nVar) {
        i.f(nVar, "kotlinClass");
        String[] a = a(nVar, flI);
        if (a != null) {
            String[] byZ = nVar.bqj().byZ();
            if (byZ != null) {
                Pair a2;
                try {
                    a2 = j.a(a, byZ);
                } catch (InvalidProtocolBufferException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not read data from ");
                    stringBuilder.append(nVar.getLocation());
                    throw new IllegalStateException(stringBuilder.toString(), e);
                } catch (Throwable th) {
                    if (!byt() && !nVar.bqj().byW().bJQ()) {
                        a2 = null;
                    }
                }
                if (a2 == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h hVar = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h) a2.bnj();
                return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d(hVar, (Class) a2.bnk(), nVar.bqj().byW(), new p(nVar, g(nVar), h(nVar)));
            }
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(y yVar, n nVar) {
        i.f(yVar, "descriptor");
        i.f(nVar, "kotlinClass");
        String[] a = a(nVar, flJ);
        if (a != null) {
            String[] byZ = nVar.bqj().byZ();
            if (byZ != null) {
                Pair b;
                try {
                    b = j.b(a, byZ);
                } catch (InvalidProtocolBufferException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not read data from ");
                    stringBuilder.append(nVar.getLocation());
                    throw new IllegalStateException(stringBuilder.toString(), e);
                } catch (Throwable th) {
                    if (!byt() && !nVar.bqj().byW().bJQ()) {
                        b = null;
                    }
                }
                if (b == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h hVar = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h) b.bnj();
                Package packageR = (Package) b.bnk();
                c cVar = hVar;
                kotlin.reflect.jvm.internal.impl.metadata.a.a byW = nVar.bqj().byW();
                e hVar2 = new h(nVar, packageR, cVar, g(nVar), h(nVar));
                h hVar3 = this.flH;
                if (hVar3 == null) {
                    i.lG("components");
                }
                return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g(yVar, packageR, cVar, byW, hVar2, hVar3, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.flO);
            }
        }
        return null;
    }

    private final n<g> g(n nVar) {
        return (byt() || nVar.bqj().byW().bJQ()) ? null : new n(nVar.bqj().byW(), g.foQ, nVar.getLocation(), nVar.getClassId());
    }

    private final boolean h(n nVar) {
        h hVar = this.flH;
        if (hVar == null) {
            i.lG("components");
        }
        return (hVar.bNZ().bOi() && (nVar.bqj().byU() || i.y(nVar.bqj().byW(), flK))) || i(nVar);
    }

    private final boolean i(n nVar) {
        h hVar = this.flH;
        if (hVar == null) {
            i.lG("components");
        }
        return !hVar.bNZ().byt() && nVar.bqj().byU() && i.y(nVar.bqj().byW(), flL);
    }

    public final String[] a(n nVar, Set<? extends Kind> set) {
        i.f(nVar, "kotlinClass");
        i.f(set, "expectedKinds");
        KotlinClassHeader bqj = nVar.bqj();
        String[] byX = bqj.byX();
        if (byX == null) {
            byX = bqj.byY();
        }
        return (byX == null || !set.contains(bqj.byV())) ? null : byX;
    }
}
