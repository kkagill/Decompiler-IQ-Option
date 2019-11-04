package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.b;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* compiled from: JvmProtoBufUtil.kt */
public final class j {
    private static final f foY;
    public static final j foZ = new j();

    static {
        f bKU = f.bKU();
        JvmProtoBuf.a(bKU);
        i.e(bKU, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        foY = bKU;
    }

    private j() {
    }

    public final f bJR() {
        return foY;
    }

    public static final Pair<h, Class> a(String[] strArr, String[] strArr2) {
        i.f(strArr, "data");
        i.f(strArr2, "strings");
        byte[] k = b.k(strArr);
        i.e(k, "BitEncoding.decodeBytes(data)");
        return a(k, strArr2);
    }

    public static final Pair<h, Class> a(byte[] bArr, String[] strArr) {
        i.f(bArr, "bytes");
        i.f(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(foZ.a(byteArrayInputStream, strArr), Class.a(byteArrayInputStream, foY));
    }

    public static final Pair<h, Package> b(String[] strArr, String[] strArr2) {
        i.f(strArr, "data");
        i.f(strArr2, "strings");
        byte[] k = b.k(strArr);
        i.e(k, "BitEncoding.decodeBytes(data)");
        return b(k, strArr2);
    }

    public static final Pair<h, Package> b(byte[] bArr, String[] strArr) {
        i.f(bArr, "bytes");
        i.f(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(foZ.a(byteArrayInputStream, strArr), Package.c(byteArrayInputStream, foY));
    }

    public static final Pair<h, Function> c(String[] strArr, String[] strArr2) {
        i.f(strArr, "data");
        i.f(strArr2, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(b.k(strArr));
        return new Pair(foZ.a(byteArrayInputStream, strArr2), Function.b(byteArrayInputStream, foY));
    }

    private final h a(InputStream inputStream, String[] strArr) {
        StringTableTypes e = StringTableTypes.e(inputStream, foY);
        i.e(e, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new h(e, strArr);
    }

    public final b a(Function function, c cVar, h hVar) {
        String b;
        i.f(function, "proto");
        i.f(cVar, "nameResolver");
        i.f(hVar, "typeTable");
        ExtendableMessage extendableMessage = function;
        e eVar = JvmProtoBuf.f26for;
        i.e(eVar, "JvmProtoBuf.methodSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar);
        int bCg = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.bCg() : jvmMethodSignature.bCg();
        if (jvmMethodSignature == null || !jvmMethodSignature.bIq()) {
            Collection dc = m.dc(g.b(function, hVar));
            List bBp = function.bBp();
            i.e(bBp, "proto.valueParameterList");
            Iterable<ValueParameter> iterable = bBp;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (ValueParameter valueParameter : iterable) {
                i.e(valueParameter, "it");
                arrayList.add(g.a(valueParameter, hVar));
            }
            Iterable<Type> b2 = u.b(dc, (Iterable) (List) arrayList);
            Collection arrayList2 = new ArrayList(n.e(b2, 10));
            for (Type b3 : b2) {
                String b4 = foZ.b(b3, cVar);
                if (b4 == null) {
                    return null;
                }
                arrayList2.add(b4);
            }
            bBp = (List) arrayList2;
            b = b(g.a(function, hVar), cVar);
            if (b == null) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(u.a(bBp, "", "(", ")", 0, null, null, 56, null));
            stringBuilder.append(b);
            b = stringBuilder.toString();
        } else {
            b = cVar.getString(jvmMethodSignature.bIr());
        }
        return new b(cVar.getString(bCg), b);
    }

    public final b a(Constructor constructor, c cVar, h hVar) {
        String a;
        i.f(constructor, "proto");
        i.f(cVar, "nameResolver");
        i.f(hVar, "typeTable");
        ExtendableMessage extendableMessage = constructor;
        e eVar = JvmProtoBuf.foq;
        i.e(eVar, "JvmProtoBuf.constructorSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : cVar.getString(jvmMethodSignature.bCg());
        if (jvmMethodSignature == null || !jvmMethodSignature.bIq()) {
            List bBp = constructor.bBp();
            i.e(bBp, "proto.valueParameterList");
            Iterable<ValueParameter> iterable = bBp;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (ValueParameter valueParameter : iterable) {
                j jVar = foZ;
                i.e(valueParameter, "it");
                String b = jVar.b(g.a(valueParameter, hVar), cVar);
                if (b == null) {
                    return null;
                }
                arrayList.add(b);
            }
            a = u.a((List) arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            a = cVar.getString(jvmMethodSignature.bIr());
        }
        return new b(string, a);
    }

    public static /* synthetic */ a a(j jVar, Property property, c cVar, h hVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jVar.a(property, cVar, hVar, z);
    }

    /* JADX WARNING: Missing block: B:19:0x005e, code skipped:
            if (r4 != null) goto L_0x0060;
     */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.a a(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.a.c r5, kotlin.reflect.jvm.internal.impl.metadata.a.h r6, boolean r7) {
        /*
        r3 = this;
        r0 = "proto";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "nameResolver";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = "typeTable";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r4;
        r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r0;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.fot;
        r2 = "JvmProtoBuf.propertySignature";
        kotlin.jvm.internal.i.e(r1, r2);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.f.a(r0, r1);
        r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x006a;
    L_0x0023:
        r2 = r0.bIM();
        if (r2 == 0) goto L_0x002e;
    L_0x0029:
        r0 = r0.bIN();
        goto L_0x002f;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        if (r0 != 0) goto L_0x0034;
    L_0x0031:
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        return r1;
    L_0x0034:
        if (r0 == 0) goto L_0x0041;
    L_0x0036:
        r7 = r0.hasName();
        if (r7 == 0) goto L_0x0041;
    L_0x003c:
        r7 = r0.bCg();
        goto L_0x0045;
    L_0x0041:
        r7 = r4.bCg();
    L_0x0045:
        if (r0 == 0) goto L_0x0056;
    L_0x0047:
        r2 = r0.bIq();
        if (r2 == 0) goto L_0x0056;
    L_0x004d:
        r4 = r0.bIr();
        r4 = r5.getString(r4);
        goto L_0x0060;
    L_0x0056:
        r4 = kotlin.reflect.jvm.internal.impl.metadata.a.g.a(r4, r6);
        r4 = r3.b(r4, r5);
        if (r4 == 0) goto L_0x006a;
    L_0x0060:
        r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f$a;
        r5 = r5.getString(r7);
        r6.<init>(r5, r4);
        return r6;
    L_0x006a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j.a(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.a.c, kotlin.reflect.jvm.internal.impl.metadata.a.h, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f$a");
    }

    private final String b(Type type, c cVar) {
        return type.bEE() ? c.mn(cVar.lD(type.bEF())) : null;
    }

    public static final boolean g(Property property) {
        i.f(property, "proto");
        kotlin.reflect.jvm.internal.impl.metadata.a.b.a bJO = e.foO.bJO();
        Object e = property.e(JvmProtoBuf.fou);
        i.e(e, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean lB = bJO.get(((Number) e).intValue());
        i.e(lB, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return lB.booleanValue();
    }
}
