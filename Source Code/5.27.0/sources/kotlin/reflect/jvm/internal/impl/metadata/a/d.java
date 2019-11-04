package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;

/* compiled from: NameResolverImpl.kt */
public final class d implements c {
    private final StringTable foc;
    private final QualifiedNameTable fod;

    public d(StringTable stringTable, QualifiedNameTable qualifiedNameTable) {
        i.f(stringTable, "strings");
        i.f(qualifiedNameTable, "qualifiedNames");
        this.foc = stringTable;
        this.fod = qualifiedNameTable;
    }

    public String getString(int i) {
        String string = this.foc.getString(i);
        i.e(string, "strings.getString(index)");
        return string;
    }

    public String lD(int i) {
        Triple lF = lF(i);
        List list = (List) lF.bnj();
        String a = u.a((List) lF.bnk(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u.a(list, "/", null, null, 0, null, null, 62, null));
        stringBuilder.append('/');
        stringBuilder.append(a);
        return stringBuilder.toString();
    }

    public boolean lE(int i) {
        return ((Boolean) lF(i).bnl()).booleanValue();
    }

    private final Triple<List<String>, List<String>, Boolean> lF(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            QualifiedName kP = this.fod.kP(i);
            StringTable stringTable = this.foc;
            i.e(kP, "proto");
            String string = stringTable.getString(kP.bDY());
            Kind bDZ = kP.bDZ();
            if (bDZ == null) {
                i.bnJ();
            }
            int i2 = e.aob[bDZ.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else if (i2 == 3) {
                linkedList2.addFirst(string);
                z = true;
            }
            i = kP.bDW();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
