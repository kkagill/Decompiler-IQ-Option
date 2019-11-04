package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import kotlin.reflect.jvm.internal.impl.metadata.a.d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* compiled from: ModuleMapping.kt */
public final class k {
    public static final k fpd = new k(af.emptyMap(), new a(m.emptyList()), "EMPTY");
    public static final k fpe = new k(af.emptyMap(), new a(m.emptyList()), "CORRUPTED");
    public static final a fpf = new a();
    private final Map<String, m> fpa;
    private final a fpb;
    private final String fpc;

    /* compiled from: ModuleMapping.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final k a(byte[] bArr, String str, boolean z, boolean z2, b<? super g, l> bVar) {
            byte[] bArr2 = bArr;
            String str2 = str;
            b<? super g, l> bVar2 = bVar;
            i.f(str2, "debugName");
            i.f(bVar2, "reportIncompatibleVersionError");
            if (bArr2 == null) {
                return k.fpd;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
            try {
                int[] iArr = new int[dataInputStream.readInt()];
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = dataInputStream.readInt();
                }
                g gVar = new g(Arrays.copyOf(iArr, iArr.length));
                if (z || gVar.bJQ()) {
                    g gVar2 = new g(iArr, ((kotlin.reflect.jvm.internal.impl.metadata.a.l.d((kotlin.reflect.jvm.internal.impl.metadata.a.a) gVar) ? dataInputStream.readInt() : 0) & 1) != 0);
                    if (z || gVar2.bJQ()) {
                        Module k = Module.k(dataInputStream);
                        if (k == null) {
                            return k.fpd;
                        }
                        String str3;
                        String str4;
                        PackageParts packageParts;
                        Object obj;
                        m mVar;
                        String str5;
                        String bh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = k.bHv().iterator();
                        while (true) {
                            str3 = "proto.shortClassNameList";
                            str4 = "proto";
                            if (!it.hasNext()) {
                                break;
                            }
                            String str6;
                            String str7;
                            packageParts = (PackageParts) it.next();
                            i.e(packageParts, str4);
                            str4 = packageParts.bHS();
                            Map map = linkedHashMap;
                            i.e(str4, "packageFqName");
                            obj = map.get(str4);
                            if (obj == null) {
                                obj = new m(str4);
                                map.put(str4, obj);
                            }
                            mVar = (m) obj;
                            q bHU = packageParts.bHU();
                            i.e(bHU, str3);
                            Iterator it2 = bHU.iterator();
                            int i2 = 0;
                            while (true) {
                                str6 = "proto.multifileFacadeShortNameList";
                                str7 = "partShortName";
                                if (!it2.hasNext()) {
                                    break;
                                }
                                str5 = (String) it2.next();
                                i.e(str5, str7);
                                str5 = l.bg(str4, str5);
                                a aVar = this;
                                List bHV = packageParts.bHV();
                                i.e(bHV, "proto.multifileFacadeShortNameIdList");
                                q bHW = packageParts.bHW();
                                i.e(bHW, str6);
                                mVar.bi(str5, aVar.a(bHV, bHW, i2, str4));
                                i2++;
                            }
                            if (z2) {
                                q<String> bHX = packageParts.bHX();
                                i.e(bHX, "proto.classWithJvmPackageNameShortNameList");
                                int i3 = 0;
                                for (String bh2 : bHX) {
                                    List bHZ = packageParts.bHZ();
                                    String str8 = "proto.classWithJvmPackageNamePackageIdList";
                                    i.e(bHZ, str8);
                                    Integer num = (Integer) u.h(bHZ, i3);
                                    if (num == null) {
                                        bHZ = packageParts.bHZ();
                                        i.e(bHZ, str8);
                                        num = (Integer) u.bX(bHZ);
                                    }
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        q bHz = k.bHz();
                                        i.e(bHz, "moduleProto.jvmPackageNameList");
                                        str5 = (String) u.h(bHz, intValue);
                                        if (str5 != null) {
                                            i.e(bh2, str7);
                                            bh2 = l.bg(str5, bh2);
                                            a aVar2 = this;
                                            List bHY = packageParts.bHY();
                                            i.e(bHY, "proto.classWithJvmPackag…fileFacadeShortNameIdList");
                                            q bHW2 = packageParts.bHW();
                                            i.e(bHW2, str6);
                                            mVar.bi(bh2, aVar2.a(bHY, bHW2, i3, str5));
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        for (PackageParts packageParts2 : k.bHx()) {
                            Map map2 = linkedHashMap;
                            i.e(packageParts2, str4);
                            String bHS = packageParts2.bHS();
                            bh2 = "proto.packageFqName";
                            i.e(bHS, bh2);
                            obj = map2.get(bHS);
                            if (obj == null) {
                                str5 = packageParts2.bHS();
                                i.e(str5, bh2);
                                obj = new m(str5);
                                map2.put(bHS, obj);
                            }
                            mVar = (m) obj;
                            q<String> bHU2 = packageParts2.bHU();
                            i.e(bHU2, str3);
                            for (String mo : bHU2) {
                                mVar.mo(mo);
                            }
                        }
                        StringTable bHB = k.bHB();
                        i.e(bHB, "moduleProto.stringTable");
                        QualifiedNameTable bHD = k.bHD();
                        i.e(bHD, "moduleProto.qualifiedNameTable");
                        d dVar = new d(bHB, bHD);
                        List bFA = k.bFA();
                        i.e(bFA, "moduleProto.annotationList");
                        Iterable<Annotation> iterable = bFA;
                        Collection arrayList = new ArrayList(n.e(iterable, 10));
                        for (Annotation annotation : iterable) {
                            i.e(annotation, str4);
                            arrayList.add(dVar.lD(annotation.getId()));
                        }
                        return new k(linkedHashMap, new a((List) arrayList), str2, null);
                    }
                    bVar2.invoke(gVar2);
                    return k.fpd;
                }
                bVar2.invoke(gVar);
                return k.fpd;
            } catch (IOException unused) {
                return k.fpe;
            }
        }

        private final String a(List<Integer> list, List<String> list2, int i, String str) {
            Integer num = (Integer) u.h(list, i);
            num = num != null ? Integer.valueOf(num.intValue() - 1) : null;
            String str2 = num != null ? (String) u.h(list2, num.intValue()) : null;
            if (str2 != null) {
                return l.bg(str, str2);
            }
            return null;
        }
    }

    private k(Map<String, m> map, a aVar, String str) {
        this.fpa = map;
        this.fpb = aVar;
        this.fpc = str;
    }

    public /* synthetic */ k(Map map, a aVar, String str, f fVar) {
        this(map, aVar, str);
    }

    public final Map<String, m> bJS() {
        return this.fpa;
    }

    public String toString() {
        return this.fpc;
    }
}
