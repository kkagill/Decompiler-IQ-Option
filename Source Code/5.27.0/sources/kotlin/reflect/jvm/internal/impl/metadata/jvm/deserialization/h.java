package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.w;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation;

/* compiled from: JvmNameResolver.kt */
public final class h implements c {
    private static final List<String> foV = m.listOf("kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator");
    private static final Map<String, Integer> foW;
    public static final a foX = new a();
    private final List<Record> bDc;
    private final Set<Integer> foT;
    private final StringTableTypes foU;
    private final String[] strings;

    /* compiled from: JvmNameResolver.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public h(StringTableTypes stringTableTypes, String[] strArr) {
        i.f(stringTableTypes, "types");
        i.f(strArr, "strings");
        this.foU = stringTableTypes;
        this.strings = strArr;
        List bJf = this.foU.bJf();
        this.foT = bJf.isEmpty() ? al.emptySet() : u.V(bJf);
        ArrayList arrayList = new ArrayList();
        List<Record> bJe = this.foU.bJe();
        arrayList.ensureCapacity(bJe.size());
        for (Record record : bJe) {
            i.e(record, "record");
            int bJt = record.bJt();
            for (int i = 0; i < bJt; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        this.bDc = arrayList;
    }

    public String getString(int i) {
        String string;
        int size;
        Integer num;
        int i2 = i;
        Record record = (Record) this.bDc.get(i2);
        if (record.bJw()) {
            string = record.getString();
        } else {
            if (record.bJu()) {
                size = foV.size();
                int bJv = record.bJv();
                if (bJv >= 0 && size > bJv) {
                    string = (String) foV.get(record.bJv());
                }
            }
            string = this.strings[i2];
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        String str3 = "string";
        if (record.bJB() >= 2) {
            List bJA = record.bJA();
            Integer num2 = (Integer) bJA.get(0);
            num = (Integer) bJA.get(1);
            i.e(num2, "begin");
            if (i.compare(0, num2.intValue()) <= 0) {
                int intValue = num2.intValue();
                i.e(num, "end");
                if (i.compare(intValue, num.intValue()) <= 0 && i.compare(num.intValue(), string.length()) <= 0) {
                    i.e(string, str3);
                    int intValue2 = num2.intValue();
                    size = num.intValue();
                    if (string != null) {
                        string = string.substring(intValue2, size);
                        i.e(string, str2);
                    } else {
                        throw new TypeCastException(str);
                    }
                }
            }
        }
        Object obj = string;
        if (record.bJD() >= 2) {
            List bJC = record.bJC();
            num = (Integer) bJC.get(0);
            Integer num3 = (Integer) bJC.get(1);
            i.e(obj, str3);
            obj = u.a((String) obj, (char) num.intValue(), (char) num3.intValue(), false, 4, null);
        }
        Object obj2 = obj;
        Operation bJz = record.bJz();
        if (bJz == null) {
            bJz = Operation.NONE;
        }
        i2 = i.aob[bJz.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i.e(obj2, str3);
                obj2 = u.a((String) obj2, '$', '.', false, 4, null);
            } else if (i2 == 3) {
                String substring;
                if (obj2.length() >= 2) {
                    i.e(obj2, str3);
                    i2 = obj2.length() - 1;
                    if (obj2 != null) {
                        substring = obj2.substring(1, i2);
                        i.e(substring, str2);
                    } else {
                        throw new TypeCastException(str);
                    }
                }
                String str4 = substring;
                i.e(str4, str3);
                obj2 = u.a(str4, '$', '.', false, 4, null);
            }
        }
        i.e(obj2, str3);
        return obj2;
    }

    public String lD(int i) {
        return getString(i);
    }

    public boolean lE(int i) {
        return this.foT.contains(Integer.valueOf(i));
    }

    static {
        Iterable<w> W = u.W(foV);
        Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(W, 10)), 16));
        for (w wVar : W) {
            linkedHashMap.put((String) wVar.getValue(), Integer.valueOf(wVar.getIndex()));
        }
        foW = linkedHashMap;
    }
}
