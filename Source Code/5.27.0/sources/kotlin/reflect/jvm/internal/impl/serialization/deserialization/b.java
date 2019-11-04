package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AnnotationDeserializer.kt */
public final class b {
    private final x fbm;
    private final v fbz;

    public b(v vVar, x xVar) {
        i.f(vVar, "module");
        i.f(xVar, "notFoundClasses");
        this.fbz = vVar;
        this.fbm = xVar;
    }

    private final g btw() {
        return this.fbz.btw();
    }

    public final c c(Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        i.f(annotation, "proto");
        i.f(cVar, "nameResolver");
        d j = j(q.a(cVar, annotation.getId()));
        Map emptyMap = af.emptyMap();
        if (annotation.bzi() != 0) {
            k kVar = j;
            if (!p.Y(kVar) && kotlin.reflect.jvm.internal.impl.resolve.c.I(kVar)) {
                Collection brs = j.brs();
                i.e(brs, "annotationClass.constructors");
                kotlin.reflect.jvm.internal.impl.descriptors.c cVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) u.O(brs);
                if (cVar2 != null) {
                    String str;
                    List bsP = cVar2.bsP();
                    i.e(bsP, "constructor.valueParameters");
                    Iterable iterable = bsP;
                    Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(iterable, 10)), 16));
                    Iterator it = iterable.iterator();
                    while (true) {
                        str = "it";
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        ar arVar = (ar) next;
                        i.e(arVar, str);
                        linkedHashMap.put(arVar.bsZ(), next);
                    }
                    List<Argument> bzh = annotation.bzh();
                    i.e(bzh, "proto.argumentList");
                    Collection arrayList = new ArrayList();
                    for (Argument argument : bzh) {
                        i.e(argument, str);
                        Pair a = a(argument, linkedHashMap, cVar);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    emptyMap = af.ac((List) arrayList);
                }
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(j.bsY(), emptyMap, aj.fcV);
    }

    private final Pair<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a(Argument argument, Map<f, ? extends ar> map, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        ar arVar = (ar) map.get(q.b(cVar, argument.getNameId()));
        if (arVar == null) {
            return null;
        }
        f b = q.b(cVar, argument.getNameId());
        w bpT = arVar.bpT();
        i.e(bpT, "parameter.type");
        Value bzu = argument.bzu();
        i.e(bzu, "proto.value");
        return new Pair(b, a(bpT, bzu, cVar));
    }

    /* JADX WARNING: Missing block: B:59:0x01ea, code skipped:
            if (kotlin.reflect.jvm.internal.impl.types.b.a.c(r11.g(r8.fbz), r9) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Missing block: B:60:0x01ed, code skipped:
            r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.k.ftE;
            r1 = new java.lang.StringBuilder();
            r1.append("Unexpected argument value: type ");
            r1.append(r11.g(r8.fbz));
            r1.append(" is not a subtype of ");
            r1.append(r9);
            r1.append(" (value.type = ");
            r1.append(r10.bzK());
            r1.append(')');
     */
    /* JADX WARNING: Missing block: B:64:?, code skipped:
            return r0.mG(r1.toString());
     */
    /* JADX WARNING: Missing block: B:65:?, code skipped:
            return r11;
     */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(kotlin.reflect.jvm.internal.impl.types.w r9, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r10, kotlin.reflect.jvm.internal.impl.metadata.a.c r11) {
        /*
        r8 = this;
        r0 = "expectedType";
        kotlin.jvm.internal.i.f(r9, r0);
        r0 = "value";
        kotlin.jvm.internal.i.f(r10, r0);
        r0 = "nameResolver";
        kotlin.jvm.internal.i.f(r11, r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnZ;
        r1 = r10.getFlags();
        r0 = r0.get(r1);
        r1 = "Flags.IS_UNSIGNED.get(value.flags)";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.booleanValue();
        r1 = r10.bzK();
        r2 = 41;
        if (r1 == 0) goto L_0x0225;
    L_0x002b:
        r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.c.aob;
        r1 = r1.ordinal();
        r1 = r3[r1];
        r3 = 0;
        r4 = 1;
        switch(r1) {
            case 1: goto L_0x01ca;
            case 2: goto L_0x01bc;
            case 3: goto L_0x01a5;
            case 4: goto L_0x018f;
            case 5: goto L_0x017b;
            case 6: goto L_0x016f;
            case 7: goto L_0x0162;
            case 8: goto L_0x014e;
            case 9: goto L_0x013c;
            case 10: goto L_0x0126;
            case 11: goto L_0x010c;
            case 12: goto L_0x00f4;
            case 13: goto L_0x003a;
            default: goto L_0x0038;
        };
    L_0x0038:
        goto L_0x0225;
    L_0x003a:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.o(r9);
        if (r0 != 0) goto L_0x0046;
    L_0x0040:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.p(r9);
        if (r0 == 0) goto L_0x0047;
    L_0x0046:
        r3 = 1;
    L_0x0047:
        r0 = r10.bzX();
        r1 = "arrayElements";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r0;
        r1 = (java.util.Collection) r1;
        r1 = r1.isEmpty();
        r1 = r1 ^ r4;
        if (r1 == 0) goto L_0x008b;
    L_0x005a:
        r1 = kotlin.collections.u.bU(r0);
        r4 = "arrayElements.first()";
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r1;
        r1 = r8.a(r1, r11);
        r4 = r8.btw();
        r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
        r4 = r4.n(r1);
        if (r4 == 0) goto L_0x0079;
    L_0x0075:
        r1 = r4;
        r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
        goto L_0x00aa;
    L_0x0079:
        r4 = r8.btw();
        r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        r1 = r4.a(r5, r1);
        r4 = "builtIns.getArrayType(Va…RIANT, actualElementType)";
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
        goto L_0x00aa;
    L_0x008b:
        if (r3 == 0) goto L_0x008f;
    L_0x008d:
        r1 = r9;
        goto L_0x00aa;
    L_0x008f:
        r1 = r8.btw();
        r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        r5 = r8.btw();
        r5 = r5.bqM();
        r5 = (kotlin.reflect.jvm.internal.impl.types.w) r5;
        r1 = r1.a(r4, r5);
        r4 = "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)";
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
    L_0x00aa:
        r4 = r8.btw();
        if (r3 == 0) goto L_0x00b2;
    L_0x00b0:
        r3 = r9;
        goto L_0x00b3;
    L_0x00b2:
        r3 = r1;
    L_0x00b3:
        r3 = r4.m(r3);
        r4 = "builtIns.getArrayElement…ype else actualArrayType)";
        kotlin.jvm.internal.i.e(r3, r4);
        r4 = kotlin.reflect.jvm.internal.impl.resolve.constants.h.ftB;
        r0 = (java.lang.Iterable) r0;
        r5 = new java.util.ArrayList;
        r6 = 10;
        r6 = kotlin.collections.n.e(r0, r6);
        r5.<init>(r6);
        r5 = (java.util.Collection) r5;
        r0 = r0.iterator();
    L_0x00d1:
        r6 = r0.hasNext();
        if (r6 == 0) goto L_0x00ea;
    L_0x00d7:
        r6 = r0.next();
        r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r6;
        r7 = "it";
        kotlin.jvm.internal.i.e(r6, r7);
        r6 = r8.a(r3, r6, r11);
        r5.add(r6);
        goto L_0x00d1;
    L_0x00ea:
        r5 = (java.util.List) r5;
        r11 = r4.a(r5, r1);
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x00f4:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a;
        r1 = r10.bzW();
        r3 = "value.annotation";
        kotlin.jvm.internal.i.e(r1, r3);
        r11 = r8.c(r1, r11);
        r0.<init>(r11);
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x010c:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.j;
        r1 = r10.bzS();
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.a(r11, r1);
        r3 = r10.bzU();
        r11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b(r11, r3);
        r0.<init>(r1, r11);
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x0126:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.p;
        r1 = r10.bzS();
        r11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.a(r11, r1);
        r1 = r10.bAa();
        r0.<init>(r11, r1);
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x013c:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t;
        r1 = r10.bzQ();
        r11 = r11.getString(r1);
        r0.<init>(r11);
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x014e:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.c;
        r0 = r10.bzM();
        r5 = 0;
        r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x015b;
    L_0x015a:
        r3 = 1;
    L_0x015b:
        r11.<init>(r3);
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x0162:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.i;
        r0 = r10.OF();
        r11.<init>(r0);
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x016f:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.l;
        r0 = r10.aU();
        r11.<init>(r0);
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x017b:
        r3 = r10.bzM();
        if (r0 == 0) goto L_0x0187;
    L_0x0181:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.w;
        r11.<init>(r3);
        goto L_0x018c;
    L_0x0187:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.q;
        r11.<init>(r3);
    L_0x018c:
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x018f:
        r3 = r10.bzM();
        r11 = (int) r3;
        if (r0 == 0) goto L_0x019c;
    L_0x0196:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.v;
        r0.<init>(r11);
        goto L_0x01a1;
    L_0x019c:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.m;
        r0.<init>(r11);
    L_0x01a1:
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x01a5:
        r3 = r10.bzM();
        r11 = (int) r3;
        r11 = (short) r11;
        if (r0 == 0) goto L_0x01b3;
    L_0x01ad:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.x;
        r0.<init>(r11);
        goto L_0x01b8;
    L_0x01b3:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.s;
        r0.<init>(r11);
    L_0x01b8:
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x01bc:
        r11 = new kotlin.reflect.jvm.internal.impl.resolve.constants.e;
        r0 = r10.bzM();
        r1 = (int) r0;
        r0 = (char) r1;
        r11.<init>(r0);
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
        goto L_0x01e0;
    L_0x01ca:
        r3 = r10.bzM();
        r11 = (int) r3;
        r11 = (byte) r11;
        if (r0 == 0) goto L_0x01d8;
    L_0x01d2:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.u;
        r0.<init>(r11);
        goto L_0x01dd;
    L_0x01d8:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.d;
        r0.<init>(r11);
    L_0x01dd:
        r11 = r0;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
    L_0x01e0:
        r0 = r8.fbz;
        r0 = r11.g(r0);
        r0 = kotlin.reflect.jvm.internal.impl.types.b.a.c(r0, r9);
        if (r0 == 0) goto L_0x01ed;
    L_0x01ec:
        goto L_0x0224;
    L_0x01ed:
        r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.k.ftE;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = "Unexpected argument value: type ";
        r1.append(r3);
        r3 = r8.fbz;
        r11 = r11.g(r3);
        r1.append(r11);
        r11 = " is not a subtype of ";
        r1.append(r11);
        r1.append(r9);
        r9 = " (value.type = ";
        r1.append(r9);
        r9 = r10.bzK();
        r1.append(r9);
        r1.append(r2);
        r9 = r1.toString();
        r9 = r0.mG(r9);
        r11 = r9;
        r11 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r11;
    L_0x0224:
        return r11;
    L_0x0225:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r0 = "Unsupported annotation argument type: ";
        r11.append(r0);
        r10 = r10.bzK();
        r11.append(r10);
        r10 = " (expected ";
        r11.append(r10);
        r11.append(r9);
        r11.append(r2);
        r9 = r11.toString();
        r10 = new java.lang.IllegalStateException;
        r9 = r9.toString();
        r10.<init>(r9);
        r10 = (java.lang.Throwable) r10;
        goto L_0x0252;
    L_0x0251:
        throw r10;
    L_0x0252:
        goto L_0x0251;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.a(kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value, kotlin.reflect.jvm.internal.impl.metadata.a.c):kotlin.reflect.jvm.internal.impl.resolve.constants.g");
    }

    private final ad a(Value value, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar) {
        g btw = btw();
        Type bzK = value.bzK();
        if (bzK != null) {
            ad bqP;
            switch (c.axg[bzK.ordinal()]) {
                case 1:
                    bqP = btw.bqP();
                    i.e(bqP, "byteType");
                    return bqP;
                case 2:
                    bqP = btw.bqV();
                    i.e(bqP, "charType");
                    return bqP;
                case 3:
                    bqP = btw.bqQ();
                    i.e(bqP, "shortType");
                    return bqP;
                case 4:
                    bqP = btw.bqR();
                    i.e(bqP, "intType");
                    return bqP;
                case 5:
                    bqP = btw.bqS();
                    i.e(bqP, "longType");
                    return bqP;
                case 6:
                    bqP = btw.bqT();
                    i.e(bqP, "floatType");
                    return bqP;
                case 7:
                    bqP = btw.bqU();
                    i.e(bqP, "doubleType");
                    return bqP;
                case 8:
                    bqP = btw.bqW();
                    i.e(bqP, "booleanType");
                    return bqP;
                case 9:
                    bqP = btw.bqY();
                    i.e(bqP, "stringType");
                    return bqP;
                case 10:
                    throw new IllegalStateException("Arrays of class literals are not supported yet".toString());
                case 11:
                    bqP = j(q.a(cVar, value.bzS())).bsY();
                    i.e(bqP, "resolveClass(nameResolve…lue.classId)).defaultType");
                    return bqP;
                case 12:
                    Annotation bzW = value.bzW();
                    i.e(bzW, "value.annotation");
                    bqP = j(q.a(cVar, bzW.getId())).bsY();
                    i.e(bqP, "resolveClass(nameResolve…notation.id)).defaultType");
                    return bqP;
                case 13:
                    throw new IllegalStateException("Array of arrays is impossible".toString());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown type: ");
        stringBuilder.append(value.bzK());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final d j(a aVar) {
        return r.a(this.fbz, aVar, this.fbm);
    }
}
