package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Map;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;

/* compiled from: ClassMapperLite.kt */
final class ClassMapperLite$map$1$1 extends Lambda implements m<String, String, l> {
    final /* synthetic */ Map $this_apply;

    ClassMapperLite$map$1$1(Map map) {
        this.$this_apply = map;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        ab((String) obj, (String) obj2);
        return l.eVB;
    }

    public final void ab(String str, String str2) {
        i.f(str, "kotlinSimpleName");
        i.f(str2, "javaInternalName");
        Map map = this.$this_apply;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("kotlin/");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(str2);
        stringBuilder.append(';');
        map.put(str, stringBuilder.toString());
    }
}
