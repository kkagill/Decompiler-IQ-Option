package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ag;
import kotlin.reflect.jvm.internal.impl.types.ah;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: TypeDeserializer.kt */
public final class v {
    private final String fpc;
    private final b<Integer, d> fvI;
    private final b<Integer, f> fvJ;
    private final Map<Integer, ao> fvK;
    private final v fvL;
    private final String fvM;
    private boolean fvN;
    private final j fvy;

    public v(j jVar, v vVar, List<TypeParameter> list, String str, String str2, boolean z) {
        Map emptyMap;
        i.f(jVar, "c");
        i.f(list, "typeParameterProtos");
        i.f(str, "debugName");
        i.f(str2, "containerPresentableName");
        this.fvy = jVar;
        this.fvL = vVar;
        this.fpc = str;
        this.fvM = str2;
        this.fvN = z;
        this.fvI = this.fvy.bqz().r(new TypeDeserializer$classDescriptors$1(this));
        this.fvJ = this.fvy.bqz().r(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            emptyMap = af.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new k(this.fvy, typeParameter, i));
                i++;
            }
            emptyMap = linkedHashMap;
        }
        this.fvK = emptyMap;
    }

    public /* synthetic */ v(j jVar, v vVar, List list, String str, String str2, boolean z, int i, f fVar) {
        this(jVar, vVar, list, str, str2, (i & 32) != 0 ? false : z);
    }

    public final boolean bOv() {
        return this.fvN;
    }

    public final List<ao> bOu() {
        return u.T(this.fvK.values());
    }

    public final w r(Type type) {
        i.f(type, "proto");
        if (!type.bEy()) {
            return s(type);
        }
        String string = this.fvy.bot().getString(type.bEz());
        ad s = s(type);
        Type a = g.a(type, this.fvy.bou());
        if (a == null) {
            i.bnJ();
        }
        return this.fvy.bys().bOd().a(type, string, s, s(a));
    }

    public final ad s(Type type) {
        i.f(type, "proto");
        ad mx = type.bEE() ? mx(type.bEF()) : type.bEK() ? mx(type.bEL()) : null;
        if (mx != null) {
            return mx;
        }
        an t = t(type);
        if (p.Y(t.brQ())) {
            ad a = p.a(t.toString(), t);
            i.e(a, "ErrorUtils.createErrorTy….toString(), constructor)");
            return a;
        }
        a aVar = new a(this.fvy.bqz(), new TypeDeserializer$simpleType$annotations$1(this, type));
        Iterable u = new TypeDeserializer$simpleType$1(this).invoke(type);
        Collection arrayList = new ArrayList(n.e(u, 10));
        int i = 0;
        for (Object next : u) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            Argument argument = (Argument) next;
            List parameters = t.getParameters();
            i.e(parameters, "constructor.parameters");
            arrayList.add(a((ao) u.h(parameters, i), argument));
            i = i2;
        }
        List T = u.T((List) arrayList);
        Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnp.get(type.getFlags());
        i.e(lB, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (lB.booleanValue()) {
            mx = a(aVar, t, T, type.bEx());
        } else {
            mx = x.c(aVar, t, T, type.bEx());
        }
        type = g.c(type, this.fvy.bou());
        return type != null ? ag.b(mx, s(type)) : mx;
    }

    private final an t(Type type) {
        TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1 = new TypeDeserializer$typeConstructor$1(this, type);
        an brm;
        if (type.bEE()) {
            d dVar = (d) this.fvI.invoke(Integer.valueOf(type.bEF()));
            if (dVar == null) {
                dVar = typeDeserializer$typeConstructor$1.mz(type.bEF());
            }
            brm = dVar.brm();
            i.e(brm, "(classDescriptors(proto.…assName)).typeConstructor");
            return brm;
        } else if (type.bEG()) {
            an mv = mv(type.bEH());
            if (mv != null) {
                return mv;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown type parameter ");
            stringBuilder.append(type.bEH());
            stringBuilder.append(". Please try recompiling module containing \"");
            stringBuilder.append(this.fvM);
            stringBuilder.append('\"');
            brm = p.mM(stringBuilder.toString());
            i.e(brm, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return brm;
        } else if (type.bEI()) {
            kotlin.reflect.jvm.internal.impl.descriptors.k brj = this.fvy.brj();
            String string = this.fvy.bot().getString(type.bEJ());
            for (Object next : bOu()) {
                if (i.y(((ao) next).bsZ().boi(), string)) {
                    break;
                }
            }
            Object next2 = null;
            ao aoVar = (ao) next2;
            if (aoVar != null) {
                an brm2 = aoVar.brm();
                if (brm2 != null) {
                    return brm2;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Deserialized type parameter ");
            stringBuilder2.append(string);
            stringBuilder2.append(" in ");
            stringBuilder2.append(brj);
            brm = p.mM(stringBuilder2.toString());
            i.e(brm, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return brm;
        } else if (type.bEK()) {
            f fVar = (f) this.fvJ.invoke(Integer.valueOf(type.bEL()));
            if (fVar == null) {
                fVar = typeDeserializer$typeConstructor$1.mz(type.bEL());
            }
            brm = fVar.brm();
            i.e(brm, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return brm;
        } else {
            brm = p.mM("Unknown type");
            i.e(brm, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return brm;
        }
    }

    private final ad a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, an anVar, List<? extends ap> list, boolean z) {
        int size = anVar.getParameters().size() - list.size();
        ad adVar = null;
        if (size == 0) {
            adVar = b(fVar, anVar, list, z);
        } else if (size == 1) {
            size = list.size() - 1;
            if (size >= 0) {
                d jQ = anVar.btw().jQ(size);
                i.e(jQ, "functionTypeConstructor.…getSuspendFunction(arity)");
                an brm = jQ.brm();
                i.e(brm, "functionTypeConstructor.…on(arity).typeConstructor");
                adVar = x.c(fVar, brm, list, z);
            }
        }
        if (adVar != null) {
            return adVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad suspend function in metadata with constructor: ");
        stringBuilder.append(anVar);
        adVar = p.g(stringBuilder.toString(), list);
        i.e(adVar, "ErrorUtils.createErrorTy…      arguments\n        )");
        return adVar;
    }

    private final ad b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, an anVar, List<? extends ap> list, boolean z) {
        w c = x.c(fVar, anVar, list, z);
        if (kotlin.reflect.jvm.internal.impl.builtins.f.d(c)) {
            return ay(c);
        }
        return null;
    }

    private final ad ay(w wVar) {
        boolean bOl = this.fvy.bys().bNZ().bOl();
        ap apVar = (ap) u.bX(kotlin.reflect.jvm.internal.impl.builtins.f.k(wVar));
        Object obj = null;
        if (apVar != null) {
            w bpT = apVar.bpT();
            if (bpT != null) {
                i.e(bpT, "funType.getValueParamete…ll()?.type ?: return null");
                f brQ = bpT.bMZ().brQ();
                kotlin.reflect.jvm.internal.impl.name.b x = brQ != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(brQ) : null;
                boolean z = true;
                if (bpT.btD().size() != 1 || (!j.a(x, true) && !j.a(x, false))) {
                    return (ad) wVar;
                }
                bpT = ((ap) u.bY(bpT.btD())).bpT();
                i.e(bpT, "continuationArgumentType.arguments.single().type");
                kotlin.reflect.jvm.internal.impl.descriptors.k brj = this.fvy.brj();
                if (!(brj instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
                    brj = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) brj;
                if (aVar != null) {
                    obj = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.T(aVar);
                }
                if (i.y(obj, u.fvH)) {
                    return a(wVar, bpT);
                }
                if (!(this.fvN || (bOl && j.a(x, bOl ^ 1)))) {
                    z = false;
                }
                this.fvN = z;
                return a(wVar, bpT);
            }
        }
        return null;
    }

    private final ad a(w wVar, w wVar2) {
        kotlin.reflect.jvm.internal.impl.builtins.g bo = kotlin.reflect.jvm.internal.impl.types.b.a.bo(wVar);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = wVar.brE();
        w i = kotlin.reflect.jvm.internal.impl.builtins.f.i(wVar);
        Iterable<ap> i2 = u.i(kotlin.reflect.jvm.internal.impl.builtins.f.k(wVar), 1);
        Collection arrayList = new ArrayList(n.e(i2, 10));
        for (ap bpT : i2) {
            arrayList.add(bpT.bpT());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.f.a(bo, brE, i, (List) arrayList, null, wVar2, true).gM(wVar.boc());
    }

    private final an mv(int i) {
        ao aoVar = (ao) this.fvK.get(Integer.valueOf(i));
        if (aoVar != null) {
            an brm = aoVar.brm();
            if (brm != null) {
                return brm;
            }
        }
        v vVar = this.fvL;
        return vVar != null ? vVar.mv(i) : null;
    }

    private final d mw(int i) {
        kotlin.reflect.jvm.internal.impl.name.a a = q.a(this.fvy.bot(), i);
        if (a.bJW()) {
            return this.fvy.bys().m(a);
        }
        return r.a(this.fvy.bys().bNY(), a);
    }

    private final ad mx(int i) {
        return q.a(this.fvy.bot(), i).bJW() ? this.fvy.bys().bOc().bOq() : null;
    }

    private final f my(int i) {
        kotlin.reflect.jvm.internal.impl.name.a a = q.a(this.fvy.bot(), i);
        if (a.bJW()) {
            return null;
        }
        return r.b(this.fvy.bys().bNY(), a);
    }

    private final ap a(ao aoVar, Argument argument) {
        if (argument.bFa() == Projection.STAR) {
            ap alVar;
            if (aoVar == null) {
                ad bqN = this.fvy.bys().bNY().btw().bqN();
                i.e(bqN, "c.components.moduleDescr….builtIns.nullableAnyType");
                alVar = new al(bqN);
            } else {
                alVar = new ah(aoVar);
            }
            return alVar;
        }
        s sVar = s.fvC;
        Projection bFa = argument.bFa();
        i.e(bFa, "typeArgumentProto.projection");
        Variance b = sVar.b(bFa);
        Type a = g.a(argument, this.fvy.bou());
        if (a != null) {
            return new ar(b, r(a));
        }
        return new ar(p.mK("No type recorded"));
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fpc);
        if (this.fvL == null) {
            str = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(". Child of ");
            stringBuilder2.append(this.fvL.fpc);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
