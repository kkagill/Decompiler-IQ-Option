package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;

/* compiled from: TypeTable.kt */
public final class h {
    private final List<Type> types;

    public h(TypeTable typeTable) {
        i.f(typeTable, "typeTable");
        h hVar = this;
        List bGg = typeTable.bGg();
        if (typeTable.bGi()) {
            int bGj = typeTable.bGj();
            List bGg2 = typeTable.bGg();
            i.e(bGg2, "typeTable.typeList");
            Iterable iterable = bGg2;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                Object next2 = (Type) next2;
                if (i >= bGj) {
                    next2 = next2.bzo().gO(true).bzG();
                }
                arrayList.add(next2);
                i = i2;
            }
            bGg = (List) arrayList;
        } else {
            i.e(bGg, "originalTypes");
        }
        this.types = bGg;
    }

    public final Type lG(int i) {
        return (Type) this.types.get(i);
    }
}
