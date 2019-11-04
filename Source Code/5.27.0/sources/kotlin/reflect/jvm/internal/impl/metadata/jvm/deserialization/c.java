package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.iqoption.dto.entity.ActiveQuote;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.g.d;
import kotlin.jvm.internal.i;

/* compiled from: ClassMapperLite.kt */
public final class c {
    public static final c foJ = new c();
    private static final Map<String, String> map;

    static {
        StringBuilder stringBuilder;
        String str;
        StringBuilder stringBuilder2;
        String stringBuilder3;
        Map linkedHashMap = new LinkedHashMap();
        List listOf = m.listOf("Boolean", "Z", "Char", ActiveQuote.PHASE_CLOSED, "Byte", "B", "Short", "S", "Int", ActiveQuote.PHASE_INTRADAY_AUCTION, "Float", "F", "Long", "J", "Double", "D");
        d a = m.a((d) m.F(listOf), 2);
        int first = a.getFirst();
        int last = a.getLast();
        int bnR = a.bnR();
        if (bnR < 0 ? first < last : first > last) {
            while (true) {
                stringBuilder = new StringBuilder();
                str = "kotlin/";
                stringBuilder.append(str);
                stringBuilder.append((String) listOf.get(first));
                int i = first + 1;
                linkedHashMap.put(stringBuilder.toString(), listOf.get(i));
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append((String) listOf.get(first));
                stringBuilder.append("Array");
                String stringBuilder4 = stringBuilder.toString();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append('[');
                stringBuilder5.append((String) listOf.get(i));
                linkedHashMap.put(stringBuilder4, stringBuilder5.toString());
                if (first == last) {
                    break;
                }
                first += bnR;
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        ClassMapperLite$map$1$1 classMapperLite$map$1$1 = new ClassMapperLite$map$1$1(linkedHashMap);
        classMapperLite$map$1$1.ab("Any", "java/lang/Object");
        classMapperLite$map$1$1.ab("Nothing", "java/lang/Void");
        classMapperLite$map$1$1.ab("Annotation", "java/lang/annotation/Annotation");
        for (String str2 : m.listOf("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("java/lang/");
            stringBuilder2.append(str2);
            classMapperLite$map$1$1.ab(str2, stringBuilder2.toString());
        }
        for (String str22 : m.listOf("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("collections/");
            stringBuilder2.append(str22);
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            str = "java/util/";
            stringBuilder.append(str);
            stringBuilder.append(str22);
            classMapperLite$map$1$1.ab(stringBuilder3, stringBuilder.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("collections/Mutable");
            stringBuilder2.append(str22);
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str22);
            classMapperLite$map$1$1.ab(stringBuilder3, stringBuilder.toString());
        }
        String str3 = "java/lang/Iterable";
        classMapperLite$map$1$1.ab("collections/Iterable", str3);
        classMapperLite$map$1$1.ab("collections/MutableIterable", str3);
        str3 = "java/util/Map$Entry";
        classMapperLite$map$1$1.ab("collections/Map.Entry", str3);
        classMapperLite$map$1$1.ab("collections/MutableMap.MutableEntry", str3);
        for (bnR = 0; bnR <= 22; bnR++) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Function");
            stringBuilder2.append(bnR);
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin/jvm/functions/Function");
            stringBuilder.append(bnR);
            classMapperLite$map$1$1.ab(stringBuilder3, stringBuilder.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("reflect/KFunction");
            stringBuilder2.append(bnR);
            classMapperLite$map$1$1.ab(stringBuilder2.toString(), "kotlin/reflect/KFunction");
        }
        for (String str222 : m.listOf("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str222);
            stringBuilder2.append(".Companion");
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin/jvm/internal/");
            stringBuilder.append(str222);
            stringBuilder.append("CompanionObject");
            classMapperLite$map$1$1.ab(stringBuilder3, stringBuilder.toString());
        }
        map = linkedHashMap;
    }

    private c() {
    }

    public static final String mn(String str) {
        i.f(str, "classId");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(u.a(str, '.', '$', false, 4, null));
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
