package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.f;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: MemberDeserializer.kt */
public final class p {
    private final b flx = new b(this.fvy.bys().bNY(), this.fvy.bys().bOf());
    private final j fvy;

    private final int mu(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public p(j jVar) {
        i.f(jVar, "c");
        this.fvy = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x032f  */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ae h(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r38) {
        /*
        r37 = this;
        r0 = r37;
        r15 = r38;
        r1 = "proto";
        kotlin.jvm.internal.i.f(r15, r1);
        r1 = r38.bAb();
        if (r1 == 0) goto L_0x0014;
    L_0x000f:
        r1 = r38.getFlags();
        goto L_0x001c;
    L_0x0014:
        r1 = r38.bCO();
        r1 = r0.mu(r1);
    L_0x001c:
        r14 = r1;
        r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h;
        r1 = r13;
        r2 = r0.fvy;
        r2 = r2.brj();
        r3 = 0;
        r12 = r15;
        r12 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r12;
        r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY;
        r4 = r0.a(r12, r14, r4);
        r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fns;
        r6 = r6.get(r14);
        r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r6;
        r5 = r5.a(r6);
        r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r7 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r7 = r7.get(r14);
        r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r7;
        r6 = r6.a(r7);
        r7 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnI;
        r7 = r7.get(r14);
        r8 = "Flags.IS_VAR.get(flags)";
        kotlin.jvm.internal.i.e(r7, r8);
        r7 = r7.booleanValue();
        r8 = r0.fvy;
        r8 = r8.bot();
        r9 = r38.bCg();
        r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r8, r9);
        r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r10 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnA;
        r10 = r10.get(r14);
        r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r10;
        r9 = r9.a(r10);
        r10 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnM;
        r10 = r10.get(r14);
        r11 = "Flags.IS_LATEINIT.get(flags)";
        kotlin.jvm.internal.i.e(r10, r11);
        r10 = r10.booleanValue();
        r11 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnL;
        r11 = r11.get(r14);
        r3 = "Flags.IS_CONST.get(flags)";
        kotlin.jvm.internal.i.e(r11, r3);
        r11 = r11.booleanValue();
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnO;
        r3 = r3.get(r14);
        r16 = r12;
        r12 = "Flags.IS_EXTERNAL_PROPERTY.get(flags)";
        kotlin.jvm.internal.i.e(r3, r12);
        r12 = r3.booleanValue();
        r3 = r16;
        r21 = r3;
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnP;
        r3 = r3.get(r14);
        r16 = r13;
        r13 = "Flags.IS_DELEGATED.get(flags)";
        kotlin.jvm.internal.i.e(r3, r13);
        r13 = r3.booleanValue();
        r3 = r16;
        r22 = r3;
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnQ;
        r3 = r3.get(r14);
        r16 = r14;
        r14 = "Flags.IS_EXPECT_PROPERTY.get(flags)";
        kotlin.jvm.internal.i.e(r3, r14);
        r14 = r3.booleanValue();
        r3 = r16;
        r23 = r3;
        r3 = r0.fvy;
        r16 = r3.bot();
        r3 = r0.fvy;
        r17 = r3.bou();
        r3 = r0.fvy;
        r18 = r3.bOo();
        r3 = r0.fvy;
        r19 = r3.bOp();
        r3 = r15;
        r15 = r38;
        r26 = r21;
        r25 = r22;
        r24 = r23;
        r3 = 0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r1 = r0.fvy;
        r2 = r25;
        r28 = r2;
        r28 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r28;
        r3 = r38.bAx();
        r4 = "proto.typeParameterList";
        kotlin.jvm.internal.i.e(r3, r4);
        r30 = 0;
        r31 = 0;
        r32 = 0;
        r33 = 0;
        r34 = 60;
        r35 = 0;
        r27 = r1;
        r29 = r3;
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.a(r27, r28, r29, r30, r31, r32, r33, r34, r35);
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnJ;
        r13 = r24;
        r3 = r3.get(r13);
        r4 = "Flags.HAS_GETTER.get(flags)";
        kotlin.jvm.internal.i.e(r3, r4);
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0140;
    L_0x0131:
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.g.f(r38);
        if (r4 == 0) goto L_0x0140;
    L_0x0137:
        r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER;
        r14 = r26;
        r4 = r0.a(r14, r4);
        goto L_0x0148;
    L_0x0140:
        r14 = r26;
        r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r4 = r4.bug();
    L_0x0148:
        r5 = r1.bOm();
        r6 = r0.fvy;
        r6 = r6.bou();
        r15 = r38;
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.g.a(r15, r6);
        r5 = r5.r(r6);
        r6 = r1.bOm();
        r6 = r6.bOu();
        r7 = r37.bsL();
        r8 = r0.fvy;
        r8 = r8.bou();
        r8 = kotlin.reflect.jvm.internal.impl.metadata.a.g.b(r15, r8);
        r9 = 0;
        if (r8 == 0) goto L_0x0187;
    L_0x0175:
        r10 = r1.bOm();
        r8 = r10.r(r8);
        if (r8 == 0) goto L_0x0187;
    L_0x017f:
        r10 = r2;
        r10 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r10;
        r4 = kotlin.reflect.jvm.internal.impl.resolve.b.a(r10, r8, r4);
        goto L_0x0188;
    L_0x0187:
        r4 = r9;
    L_0x0188:
        r2.a(r5, r6, r7, r4);
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnq;
        r4 = r4.get(r13);
        r5 = "Flags.HAS_ANNOTATIONS.get(flags)";
        kotlin.jvm.internal.i.e(r4, r5);
        r16 = r4.booleanValue();
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r4 = r4.get(r13);
        r17 = r4;
        r17 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r17;
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fns;
        r4 = r4.get(r13);
        r18 = r4;
        r18 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r18;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.a(r16, r17, r18, r19, r20, r21);
        r12 = 1;
        if (r3 == 0) goto L_0x0245;
    L_0x01bb:
        r3 = r38.bDv();
        if (r3 == 0) goto L_0x01c6;
    L_0x01c1:
        r3 = r38.bDw();
        goto L_0x01c7;
    L_0x01c6:
        r3 = r4;
    L_0x01c7:
        r5 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnU;
        r5 = r5.get(r3);
        r6 = "Flags.IS_NOT_DEFAULT.get(getterFlags)";
        kotlin.jvm.internal.i.e(r5, r6);
        r5 = r5.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnV;
        r6 = r6.get(r3);
        r7 = "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)";
        kotlin.jvm.internal.i.e(r6, r7);
        r22 = r6.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnW;
        r6 = r6.get(r3);
        r7 = "Flags.IS_INLINE_ACCESSOR.get(getterFlags)";
        kotlin.jvm.internal.i.e(r6, r7);
        r23 = r6.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER;
        r6 = r0.a(r14, r3, r6);
        if (r5 == 0) goto L_0x0230;
    L_0x01fc:
        r7 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.aa;
        r17 = r2;
        r17 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r17;
        r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r10 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fns;
        r10 = r10.get(r3);
        r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r10;
        r19 = r8.a(r10);
        r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r10 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r3 = r10.get(r3);
        r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r3;
        r20 = r8.a(r3);
        r21 = r5 ^ 1;
        r24 = r2.bsT();
        r25 = 0;
        r26 = kotlin.reflect.jvm.internal.impl.descriptors.aj.fcV;
        r16 = r7;
        r18 = r6;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        goto L_0x023c;
    L_0x0230:
        r3 = r2;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r3;
        r7 = kotlin.reflect.jvm.internal.impl.resolve.b.a(r3, r6);
        r3 = "DescriptorFactory.create…er(property, annotations)";
        kotlin.jvm.internal.i.e(r7, r3);
    L_0x023c:
        r3 = r2.bsN();
        r7.S(r3);
        r3 = r7;
        goto L_0x0246;
    L_0x0245:
        r3 = r9;
    L_0x0246:
        r5 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnK;
        r5 = r5.get(r13);
        r6 = "Flags.HAS_SETTER.get(flags)";
        kotlin.jvm.internal.i.e(r5, r6);
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x031b;
    L_0x0257:
        r5 = r38.bDx();
        if (r5 == 0) goto L_0x0261;
    L_0x025d:
        r4 = r38.bDy();
    L_0x0261:
        r5 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnU;
        r5 = r5.get(r4);
        r6 = "Flags.IS_NOT_DEFAULT.get(setterFlags)";
        kotlin.jvm.internal.i.e(r5, r6);
        r5 = r5.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnV;
        r6 = r6.get(r4);
        r7 = "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)";
        kotlin.jvm.internal.i.e(r6, r7);
        r22 = r6.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnW;
        r6 = r6.get(r4);
        r7 = "Flags.IS_INLINE_ACCESSOR.get(setterFlags)";
        kotlin.jvm.internal.i.e(r6, r7);
        r23 = r6.booleanValue();
        r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER;
        r6 = r0.a(r14, r4, r6);
        if (r5 == 0) goto L_0x0305;
    L_0x0296:
        r11 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ab;
        r17 = r2;
        r17 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r17;
        r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r8 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fns;
        r8 = r8.get(r4);
        r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r8;
        r19 = r7.a(r8);
        r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r8 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r4 = r8.get(r4);
        r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r4;
        r20 = r7.a(r4);
        r21 = r5 ^ 1;
        r24 = r2.bsT();
        r25 = 0;
        r26 = kotlin.reflect.jvm.internal.impl.descriptors.aj.fcV;
        r16 = r11;
        r18 = r6;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        r5 = r11;
        r5 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r5;
        r6 = kotlin.collections.m.emptyList();
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r16 = 60;
        r17 = 0;
        r4 = r1;
        r36 = r11;
        r11 = r16;
        r16 = r3;
        r3 = 1;
        r12 = r17;
        r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r4 = r4.bOn();
        r5 = r38.bDu();
        r5 = kotlin.collections.l.listOf(r5);
        r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER;
        r4 = r4.a(r5, r14, r6);
        r4 = kotlin.collections.u.bY(r4);
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r4;
        r5 = r36;
        r5.c(r4);
        r9 = r5;
        goto L_0x031e;
    L_0x0305:
        r16 = r3;
        r3 = 1;
        r4 = r2;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r4;
        r5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r5 = r5.bug();
        r9 = kotlin.reflect.jvm.internal.impl.resolve.b.a(r4, r6, r5);
        r4 = "DescriptorFactory.create…ptor */\n                )";
        kotlin.jvm.internal.i.e(r9, r4);
        goto L_0x031e;
    L_0x031b:
        r16 = r3;
        r3 = 1;
    L_0x031e:
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnN;
        r4 = r4.get(r13);
        r5 = "Flags.HAS_CONSTANT.get(flags)";
        kotlin.jvm.internal.i.e(r4, r5);
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0343;
    L_0x032f:
        r4 = r0.fvy;
        r4 = r4.bqz();
        r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3;
        r5.<init>(r0, r15, r2);
        r5 = (kotlin.jvm.a.a) r5;
        r4 = r4.g(r5);
        r2.a(r4);
    L_0x0343:
        r4 = r9;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ag) r4;
        r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o;
        r6 = 0;
        r6 = r0.a(r15, r6);
        r13 = r2;
        r13 = (kotlin.reflect.jvm.internal.impl.descriptors.ae) r13;
        r5.<init>(r6, r13);
        r5 = (kotlin.reflect.jvm.internal.impl.descriptors.q) r5;
        r6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o;
        r3 = r0.a(r15, r3);
        r6.<init>(r3, r13);
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.q) r6;
        r3 = r2;
        r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor) r3;
        r1 = r1.bOm();
        r7 = r0.a(r3, r1);
        r1 = r2;
        r2 = r16;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r1.a(r2, r3, r4, r5, r6);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.p.h(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property):kotlin.reflect.jvm.internal.impl.descriptors.ae");
    }

    private final CoroutinesCompatibilityMode a(DeserializedMemberDescriptor deserializedMemberDescriptor, v vVar) {
        if (!c(deserializedMemberDescriptor)) {
            return CoroutinesCompatibilityMode.COMPATIBLE;
        }
        CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        a(vVar);
        if (vVar.bOv()) {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.INCOMPATIBLE;
        } else {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
        }
        return coroutinesCompatibilityMode;
    }

    private final void a(v vVar) {
        for (ao bod : vVar.bOu()) {
            bod.bod();
        }
    }

    private final void a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i iVar, ah ahVar, ah ahVar2, List<? extends ao> list, List<? extends ar> list2, w wVar, Modality modality, aw awVar, Map<? extends a<?>, ?> map, boolean z) {
        w wVar2 = wVar;
        iVar.a(ahVar, ahVar2, list, list2, wVar2, modality, awVar, map, a(iVar, ahVar, list2, list, wVar2, z));
    }

    private final CoroutinesCompatibilityMode a(b bVar, ah ahVar, Collection<? extends ar> collection, Collection<? extends ao> collection2, w wVar, boolean z) {
        if (!c(bVar)) {
            return CoroutinesCompatibilityMode.COMPATIBLE;
        }
        if (i.y(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.T(bVar), u.fvH)) {
            return CoroutinesCompatibilityMode.COMPATIBLE;
        }
        Iterable<ar> iterable = collection;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ar bpT : iterable) {
            arrayList.add(bpT.bpT());
        }
        List b = u.b((Collection) (List) arrayList, (Iterable) m.dc(ahVar != null ? ahVar.bpT() : null));
        if (wVar != null && ax(wVar)) {
            return CoroutinesCompatibilityMode.INCOMPATIBLE;
        }
        Object obj;
        Object obj2;
        Iterable<ao> iterable2 = collection2;
        if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
            for (ao bod : iterable2) {
                List bod2 = bod.bod();
                i.e(bod2, "typeParameter.upperBounds");
                Iterable<w> iterable3 = bod2;
                if (!((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty())) {
                    for (w wVar2 : iterable3) {
                        i.e(wVar2, "it");
                        if (ax(wVar2)) {
                            obj = 1;
                            continue;
                            break;
                        }
                    }
                }
                obj = null;
                continue;
                if (obj != null) {
                    obj2 = 1;
                    break;
                }
            }
        }
        obj2 = null;
        if (obj2 != null) {
            return CoroutinesCompatibilityMode.INCOMPATIBLE;
        }
        CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        Iterable<w> iterable4 = b;
        Collection arrayList2 = new ArrayList(n.e(iterable4, 10));
        for (w wVar3 : iterable4) {
            i.e(wVar3, "type");
            if (f.e(wVar3) && wVar3.btD().size() <= 3) {
                Iterable<ap> btD = wVar3.btD();
                if (!((btD instanceof Collection) && ((Collection) btD).isEmpty())) {
                    for (ap bpT2 : btD) {
                        w bpT3 = bpT2.bpT();
                        i.e(bpT3, "it.type");
                        if (ax(bpT3)) {
                            obj = 1;
                            break;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    obj = CoroutinesCompatibilityMode.INCOMPATIBLE;
                } else {
                    obj = CoroutinesCompatibilityMode.NEEDS_WRAPPER;
                }
            } else if (ax(wVar3)) {
                obj = CoroutinesCompatibilityMode.INCOMPATIBLE;
            } else {
                obj = CoroutinesCompatibilityMode.COMPATIBLE;
            }
            arrayList2.add(obj);
        }
        CoroutinesCompatibilityMode coroutinesCompatibilityMode2 = (CoroutinesCompatibilityMode) u.w((List) arrayList2);
        if (coroutinesCompatibilityMode2 == null) {
            coroutinesCompatibilityMode2 = CoroutinesCompatibilityMode.COMPATIBLE;
        }
        if (z) {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.NEEDS_WRAPPER;
        } else {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
        }
        return (CoroutinesCompatibilityMode) c.d(coroutinesCompatibilityMode, coroutinesCompatibilityMode2);
    }

    private final boolean ax(w wVar) {
        return kotlin.reflect.jvm.internal.impl.types.b.a.b(wVar, MemberDeserializer$containsSuspendFunctionType$1.fvz);
    }

    private final boolean c(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        if (!this.fvy.bys().bNZ().bOl()) {
            return false;
        }
        Object obj;
        Iterable<kotlin.reflect.jvm.internal.impl.metadata.a.i> bOA = deserializedMemberDescriptor.bOA();
        if (!((bOA instanceof Collection) && ((Collection) bOA).isEmpty())) {
            for (kotlin.reflect.jvm.internal.impl.metadata.a.i iVar : bOA) {
                Object obj2;
                if (i.y(iVar.bHp(), new kotlin.reflect.jvm.internal.impl.metadata.a.i.b(1, 3, 0, 4, null)) && iVar.bHq() == VersionKind.LANGUAGE_VERSION) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    obj = null;
                    break;
                }
            }
        }
        obj = 1;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0200  */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ai h(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r36) {
        /*
        r35 = this;
        r11 = r35;
        r10 = r36;
        r0 = "proto";
        kotlin.jvm.internal.i.f(r10, r0);
        r0 = r36.bAb();
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r36.getFlags();
        goto L_0x001c;
    L_0x0014:
        r0 = r36.bCO();
        r0 = r11.mu(r0);
    L_0x001c:
        r9 = r0;
        r0 = r10;
        r0 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r0;
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION;
        r15 = r11.a(r0, r9, r1);
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.g(r36);
        if (r1 == 0) goto L_0x0033;
    L_0x002c:
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION;
        r1 = r11.a(r0, r1);
        goto L_0x0039;
    L_0x0033:
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r1 = r1.bug();
    L_0x0039:
        r2 = r11.fvy;
        r2 = r2.brj();
        r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(r2);
        r3 = r11.fvy;
        r3 = r3.bot();
        r4 = r36.bCg();
        r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r3, r4);
        r2 = r2.C(r3);
        r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.u.fvH;
        r2 = kotlin.jvm.internal.i.y(r2, r3);
        if (r2 == 0) goto L_0x0064;
    L_0x005d:
        r2 = kotlin.reflect.jvm.internal.impl.metadata.a.k.fon;
        r2 = r2.bHs();
        goto L_0x006a;
    L_0x0064:
        r2 = r11.fvy;
        r2 = r2.bOo();
    L_0x006a:
        r21 = r2;
        r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i;
        r2 = r11.fvy;
        r13 = r2.brj();
        r14 = 0;
        r2 = r11.fvy;
        r2 = r2.bot();
        r3 = r36.bCg();
        r16 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r2, r3);
        r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnA;
        r3 = r3.get(r9);
        r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r3;
        r17 = r2.a(r3);
        r2 = r11.fvy;
        r19 = r2.bot();
        r2 = r11.fvy;
        r20 = r2.bou();
        r2 = r11.fvy;
        r22 = r2.bOp();
        r23 = 0;
        r24 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r25 = 0;
        r12 = r8;
        r18 = r36;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
        r2 = r11.fvy;
        r27 = r8;
        r27 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r27;
        r3 = r36.bAx();
        r4 = "proto.typeParameterList";
        kotlin.jvm.internal.i.e(r3, r4);
        r29 = 0;
        r30 = 0;
        r31 = 0;
        r32 = 0;
        r33 = 60;
        r34 = 0;
        r26 = r2;
        r28 = r3;
        r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.a(r26, r27, r28, r29, r30, r31, r32, r33, r34);
        r3 = r11.fvy;
        r3 = r3.bou();
        r3 = kotlin.reflect.jvm.internal.impl.metadata.a.g.b(r10, r3);
        if (r3 == 0) goto L_0x00f0;
    L_0x00de:
        r4 = r2.bOm();
        r3 = r4.r(r3);
        if (r3 == 0) goto L_0x00f0;
    L_0x00e8:
        r4 = r8;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r4;
        r1 = kotlin.reflect.jvm.internal.impl.resolve.b.a(r4, r3, r1);
        goto L_0x00f1;
    L_0x00f0:
        r1 = 0;
    L_0x00f1:
        r3 = r1;
        r4 = r35.bsL();
        r1 = r2.bOm();
        r5 = r1.bOu();
        r1 = r2.bOn();
        r6 = r36.bBp();
        r7 = "proto.valueParameterList";
        kotlin.jvm.internal.i.e(r6, r7);
        r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION;
        r6 = r1.a(r6, r0, r7);
        r0 = r2.bOm();
        r1 = r11.fvy;
        r1 = r1.bou();
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.a(r10, r1);
        r7 = r0.r(r1);
        r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fns;
        r1 = r1.get(r9);
        r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r1;
        r12 = r0.a(r1);
        r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r1 = r1.get(r9);
        r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r1;
        r13 = r0.a(r1);
        r14 = kotlin.collections.af.emptyMap();
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnG;
        r0 = r0.get(r9);
        r15 = "Flags.IS_SUSPEND.get(flags)";
        kotlin.jvm.internal.i.e(r0, r15);
        r16 = r0.booleanValue();
        r0 = r35;
        r1 = r8;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r12;
        r12 = r8;
        r8 = r13;
        r13 = r9;
        r9 = r14;
        r14 = r10;
        r10 = r16;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnB;
        r0 = r0.get(r13);
        r1 = "Flags.IS_OPERATOR.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gr(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnC;
        r0 = r0.get(r13);
        r1 = "Flags.IS_INFIX.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gs(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnF;
        r0 = r0.get(r13);
        r1 = "Flags.IS_EXTERNAL_FUNCTION.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gt(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnD;
        r0 = r0.get(r13);
        r1 = "Flags.IS_INLINE.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gu(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnE;
        r0 = r0.get(r13);
        r1 = "Flags.IS_TAILREC.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gv(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnG;
        r0 = r0.get(r13);
        kotlin.jvm.internal.i.e(r0, r15);
        r0 = r0.booleanValue();
        r12.gA(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnH;
        r0 = r0.get(r13);
        r1 = "Flags.IS_EXPECT_FUNCTION.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r12.gw(r0);
        r0 = r11.fvy;
        r0 = r0.bys();
        r0 = r0.bOg();
        r8 = r12;
        r8 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r8;
        r1 = r11.fvy;
        r1 = r1.bou();
        r2 = r11.fvy;
        r2 = r2.bOm();
        r0 = r0.a(r14, r8, r1, r2);
        if (r0 == 0) goto L_0x020d;
    L_0x0200:
        r1 = r0.getFirst();
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a.a) r1;
        r0 = r0.bni();
        r12.a(r1, r0);
    L_0x020d:
        r8 = r12;
        r8 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r8;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.p.h(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function):kotlin.reflect.jvm.internal.impl.descriptors.ai");
    }

    public final an g(TypeAlias typeAlias) {
        TypeAlias typeAlias2 = typeAlias;
        i.f(typeAlias2, "proto");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        List bFA = typeAlias.bFA();
        i.e(bFA, "proto.annotationList");
        Iterable<Annotation> iterable = bFA;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Annotation annotation : iterable) {
            b bVar = this.flx;
            i.e(annotation, "it");
            arrayList.add(bVar.c(annotation, this.fvy.bot()));
        }
        j jVar = new j(this.fvy.bqz(), this.fvy.brj(), aVar.cc((List) arrayList), q.b(this.fvy.bot(), typeAlias.bCg()), s.fvC.a((Visibility) kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr.get(typeAlias.getFlags())), typeAlias, this.fvy.bot(), this.fvy.bou(), this.fvy.bOo(), this.fvy.bOp());
        j jVar2 = this.fvy;
        k kVar = jVar;
        List bAx = typeAlias.bAx();
        i.e(bAx, "proto.typeParameterList");
        j a = j.a(jVar2, kVar, bAx, null, null, null, null, 60, null);
        jVar.a(a.bOm().bOu(), a.bOm().s(g.a(typeAlias2, this.fvy.bou())), a.bOm().s(g.b(typeAlias2, this.fvy.bou())), a((DeserializedMemberDescriptor) jVar, a.bOm()));
        return jVar;
    }

    private final ah bsL() {
        k brj = this.fvy.brj();
        if (!(brj instanceof d)) {
            brj = null;
        }
        d dVar = (d) brj;
        return dVar != null ? dVar.bte() : null;
    }

    /* JADX WARNING: Missing block: B:14:0x00c2, code skipped:
            if (c(r8) != false) goto L_0x00c6;
     */
    public final kotlin.reflect.jvm.internal.impl.descriptors.c a(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r32, boolean r33) {
        /*
        r31 = this;
        r7 = r31;
        r0 = r32;
        r1 = "proto";
        kotlin.jvm.internal.i.f(r0, r1);
        r1 = r7.fvy;
        r1 = r1.brj();
        if (r1 == 0) goto L_0x00fc;
    L_0x0011:
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1;
        r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c;
        r10 = 0;
        r2 = r0;
        r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2;
        r3 = r32.getFlags();
        r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION;
        r11 = r7.a(r2, r3, r4);
        r13 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION;
        r3 = r7.fvy;
        r15 = r3.bot();
        r3 = r7.fvy;
        r16 = r3.bou();
        r3 = r7.fvy;
        r17 = r3.bOo();
        r3 = r7.fvy;
        r18 = r3.bOp();
        r19 = 0;
        r20 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r21 = 0;
        r8 = r6;
        r9 = r1;
        r12 = r33;
        r14 = r32;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        r3 = r7.fvy;
        r23 = r6;
        r23 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r23;
        r24 = kotlin.collections.m.emptyList();
        r25 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r29 = 60;
        r30 = 0;
        r22 = r3;
        r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.a(r22, r23, r24, r25, r26, r27, r28, r29, r30);
        r3 = r3.bOn();
        r4 = r32.bBp();
        r5 = "proto.valueParameterList";
        kotlin.jvm.internal.i.e(r4, r5);
        r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION;
        r2 = r3.a(r4, r2, r5);
        r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.fvC;
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnr;
        r0 = r32.getFlags();
        r0 = r4.get(r0);
        r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r0;
        r0 = r3.a(r0);
        r6.a(r2, r0);
        r0 = r1.bsY();
        r0 = (kotlin.reflect.jvm.internal.impl.types.w) r0;
        r6.Q(r0);
        r0 = r7.fvy;
        r0 = r0.brj();
        r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d;
        if (r1 != 0) goto L_0x00a4;
    L_0x00a3:
        r0 = 0;
    L_0x00a4:
        r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) r0;
        r1 = 1;
        if (r0 == 0) goto L_0x00c5;
    L_0x00a9:
        r0 = r0.bOB();
        if (r0 == 0) goto L_0x00c5;
    L_0x00af:
        r0 = r0.bOm();
        if (r0 == 0) goto L_0x00c5;
    L_0x00b5:
        r0 = r0.bOv();
        if (r0 != r1) goto L_0x00c5;
    L_0x00bb:
        r0 = r6;
        r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor) r0;
        r0 = r7.c(r0);
        if (r0 == 0) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00c6;
    L_0x00c5:
        r1 = 0;
    L_0x00c6:
        if (r1 == 0) goto L_0x00cc;
    L_0x00c8:
        r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        r9 = r6;
        goto L_0x00f5;
    L_0x00cc:
        r1 = r6;
        r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b) r1;
        r2 = 0;
        r0 = r6.bsP();
        r3 = "descriptor.valueParameters";
        kotlin.jvm.internal.i.e(r0, r3);
        r3 = r0;
        r3 = (java.util.Collection) r3;
        r0 = r6.bsM();
        r4 = "descriptor.typeParameters";
        kotlin.jvm.internal.i.e(r0, r4);
        r4 = r0;
        r4 = (java.util.Collection) r4;
        r5 = r6.bsN();
        r8 = 0;
        r0 = r31;
        r9 = r6;
        r6 = r8;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
    L_0x00f5:
        r9.a(r0);
        r6 = r9;
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r6;
        return r6;
    L_0x00fc:
        r0 = new kotlin.TypeCastException;
        r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.p.a(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, boolean):kotlin.reflect.jvm.internal.impl.descriptors.c");
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.f a(n nVar, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (kotlin.reflect.jvm.internal.impl.metadata.a.b.fnq.get(i).booleanValue()) {
            return new l(this.fvy.bqz(), new MemberDeserializer$getAnnotations$1(this, nVar, annotatedCallableKind));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.f a(Property property, boolean z) {
        if (kotlin.reflect.jvm.internal.impl.metadata.a.b.fnq.get(property.getFlags()).booleanValue()) {
            return new l(this.fvy.bqz(), new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, property));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.f a(n nVar, AnnotatedCallableKind annotatedCallableKind) {
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a(this.fvy.bqz(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, nVar, annotatedCallableKind));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ee  */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ar> a(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> r27, kotlin.reflect.jvm.internal.impl.protobuf.n r28, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r29) {
        /*
        r26 = this;
        r8 = r26;
        r0 = r8.fvy;
        r0 = r0.brj();
        if (r0 == 0) goto L_0x0122;
    L_0x000a:
        r21 = r0;
        r21 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r21;
        r0 = r21.brj();
        r1 = "callableDescriptor.containingDeclaration";
        kotlin.jvm.internal.i.e(r0, r1);
        r22 = r8.X(r0);
        r0 = r27;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r2 = kotlin.collections.n.e(r0, r2);
        r1.<init>(r2);
        r15 = r1;
        r15 = (java.util.Collection) r15;
        r23 = r0.iterator();
        r24 = 0;
        r12 = 0;
    L_0x0034:
        r0 = r23.hasNext();
        if (r0 == 0) goto L_0x0117;
    L_0x003a:
        r0 = r23.next();
        r25 = r12 + 1;
        if (r12 >= 0) goto L_0x0045;
    L_0x0042:
        kotlin.collections.m.bno();
    L_0x0045:
        r9 = r0;
        r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r9;
        r0 = r9.bAb();
        if (r0 == 0) goto L_0x0054;
    L_0x004e:
        r0 = r9.getFlags();
        r10 = r0;
        goto L_0x0055;
    L_0x0054:
        r10 = 0;
    L_0x0055:
        if (r22 == 0) goto L_0x008b;
    L_0x0057:
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnq;
        r0 = r0.get(r10);
        r1 = "Flags.HAS_ANNOTATIONS.get(flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x008b;
    L_0x0068:
        r11 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l;
        r0 = r8.fvy;
        r13 = r0.bqz();
        r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1;
        r0 = r14;
        r1 = r12;
        r2 = r9;
        r3 = r26;
        r4 = r22;
        r5 = r28;
        r6 = r29;
        r7 = r21;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r14 = (kotlin.jvm.a.a) r14;
        r11.<init>(r13, r14);
        r11 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.f) r11;
        r13 = r11;
        goto L_0x0092;
    L_0x008b:
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r0 = r0.bug();
        r13 = r0;
    L_0x0092:
        r11 = 0;
        r0 = r8.fvy;
        r0 = r0.bot();
        r1 = r9.bCg();
        r14 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r0, r1);
        r0 = r8.fvy;
        r0 = r0.bOm();
        r1 = r8.fvy;
        r1 = r1.bou();
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.a(r9, r1);
        r0 = r0.r(r1);
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnR;
        r1 = r1.get(r10);
        r2 = "Flags.DECLARES_DEFAULT_VALUE.get(flags)";
        kotlin.jvm.internal.i.e(r1, r2);
        r16 = r1.booleanValue();
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnS;
        r1 = r1.get(r10);
        r2 = "Flags.IS_CROSSINLINE.get(flags)";
        kotlin.jvm.internal.i.e(r1, r2);
        r17 = r1.booleanValue();
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnT;
        r1 = r1.get(r10);
        r2 = "Flags.IS_NOINLINE.get(flags)";
        kotlin.jvm.internal.i.e(r1, r2);
        r18 = r1.booleanValue();
        r1 = r8.fvy;
        r1 = r1.bou();
        r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.b(r9, r1);
        if (r1 == 0) goto L_0x00f9;
    L_0x00ee:
        r2 = r8.fvy;
        r2 = r2.bOm();
        r1 = r2.r(r1);
        goto L_0x00fa;
    L_0x00f9:
        r1 = 0;
    L_0x00fa:
        r19 = r1;
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.aj.fcV;
        r2 = "SourceElement.NO_SOURCE";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ai;
        r9 = r2;
        r10 = r21;
        r3 = r15;
        r15 = r0;
        r20 = r1;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r3.add(r2);
        r15 = r3;
        r12 = r25;
        goto L_0x0034;
    L_0x0117:
        r3 = r15;
        r15 = r3;
        r15 = (java.util.List) r15;
        r15 = (java.lang.Iterable) r15;
        r0 = kotlin.collections.u.T(r15);
        return r0;
    L_0x0122:
        r0 = new kotlin.TypeCastException;
        r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor";
        r0.<init>(r1);
        goto L_0x012b;
    L_0x012a:
        throw r0;
    L_0x012b:
        goto L_0x012a;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.p.a(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind):java.util.List");
    }

    private final r X(k kVar) {
        if (kVar instanceof y) {
            return new r.b(((y) kVar).btB(), this.fvy.bot(), this.fvy.bou(), this.fvy.bOp());
        }
        return kVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d ? ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) kVar).bOC() : null;
    }
}
