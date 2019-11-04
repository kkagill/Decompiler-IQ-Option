package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;

/* compiled from: MemberScope.kt */
public final class d {
    private static int ftX = 1;
    private static final int ftY = fuu.bNA();
    private static final int ftZ = fuu.bNA();
    private static final int fua = fuu.bNA();
    private static final int fub = fuu.bNA();
    private static final int fuc = fuu.bNA();
    private static final int fud = fuu.bNA();
    private static final int fue = (fuu.bNA() - 1);
    private static final int fuf;
    private static final int fug;
    private static final int fuh;
    public static final d fui = new d(fue, null, 2, null);
    public static final d fuj = new d(fuh, null, 2, null);
    public static final d fuk = new d(ftY, null, 2, null);
    public static final d ful = new d(ftZ, null, 2, null);
    public static final d fum = new d(fua, null, 2, null);
    public static final d fun = new d(fuf, null, 2, null);
    public static final d fuo = new d(fub, null, 2, null);
    public static final d fup = new d(fuc, null, 2, null);
    public static final d fuq = new d(fud, null, 2, null);
    public static final d fur = new d(fug, null, 2, null);
    private static final List<a> fus;
    private static final List<a> fut;
    public static final a fuu = new a();
    private final int ftV;
    private final List<c> ftW;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* compiled from: MemberScope.kt */
        private static final class a {
            private final int mask;
            private final String name;

            public a(int i, String str) {
                i.f(str, ConditionalUserProperty.NAME);
                this.mask = i;
                this.name = str;
            }

            public final int bNJ() {
                return this.mask;
            }

            public final String getName() {
                return this.name;
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final int bNA() {
            int bNr = d.ftX;
            d.ftX = d.ftX << 1;
            return bNr;
        }

        public final int bNB() {
            return d.ftY;
        }

        public final int bNC() {
            return d.ftZ;
        }

        public final int bND() {
            return d.fua;
        }

        public final int bNE() {
            return d.fub;
        }

        public final int bNF() {
            return d.fuc;
        }

        public final int bNG() {
            return d.fud;
        }

        public final int bNH() {
            return d.fue;
        }

        public final int bNI() {
            return d.fuf;
        }
    }

    public d(int i, List<? extends c> list) {
        i.f(list, "excludes");
        this.ftW = list;
        for (c bNo : this.ftW) {
            i &= bNo.bNo() ^ -1;
        }
        this.ftV = i;
    }

    public /* synthetic */ d(int i, List list, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            list = m.emptyList();
        }
        this(i, list);
    }

    public final List<c> bNq() {
        return this.ftW;
    }

    public final int bNp() {
        return this.ftV;
    }

    public final boolean mr(int i) {
        return (i & this.ftV) != 0;
    }

    public final d ms(int i) {
        i &= this.ftV;
        if (i == 0) {
            return null;
        }
        return new d(i, this.ftW);
    }

    public String toString() {
        Object obj;
        for (Object next : fus) {
            if (((a) next).bNJ() == this.ftV) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        a aVar = (a) next2;
        String name = aVar != null ? aVar.getName() : null;
        if (name == null) {
            Collection arrayList = new ArrayList();
            for (a aVar2 : fut) {
                obj = mr(aVar2.bNJ()) ? aVar2.getName() : null;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            name = u.a((List) arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DescriptorKindFilter(");
        stringBuilder.append(name);
        stringBuilder.append(", ");
        stringBuilder.append(this.ftW);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static {
        String str;
        String str2;
        String str3;
        Field field;
        Object obj;
        int i = ftY;
        int i2 = ftZ;
        fuf = (i | i2) | fua;
        i = fuc;
        i2 |= i;
        int i3 = fud;
        fug = i2 | i3;
        fuh = i | i3;
        a aVar = fuu;
        Field[] fields = d.class.getFields();
        String str4 = "T::class.java.fields";
        i.e(fields, str4);
        Collection arrayList = new ArrayList();
        int length = fields.length;
        int i4 = 0;
        while (true) {
            str = "it";
            if (i4 >= length) {
                break;
            }
            Object obj2 = fields[i4];
            i.e(obj2, str);
            if (Modifier.isStatic(obj2.getModifiers())) {
                arrayList.add(obj2);
            }
            i4++;
        }
        Collection arrayList2 = new ArrayList();
        Iterator it = ((List) arrayList).iterator();
        while (true) {
            str2 = "field.name";
            str3 = "field";
            if (!it.hasNext()) {
                break;
            }
            Object aVar2;
            field = (Field) it.next();
            obj = field.get(null);
            if (!(obj instanceof d)) {
                obj = null;
            }
            d dVar = (d) obj;
            if (dVar != null) {
                int i5 = dVar.ftV;
                i.e(field, str3);
                String name = field.getName();
                i.e(name, str2);
                aVar2 = new a(i5, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        fus = u.T((List) arrayList2);
        aVar = fuu;
        fields = d.class.getFields();
        i.e(fields, str4);
        Collection arrayList3 = new ArrayList();
        for (Object obj3 : fields) {
            i.e(obj3, str);
            if (Modifier.isStatic(obj3.getModifiers())) {
                arrayList3.add(obj3);
            }
        }
        arrayList2 = new ArrayList();
        for (Object next : (List) arrayList3) {
            field = (Field) next;
            i.e(field, str);
            if (i.y(field.getType(), Integer.TYPE)) {
                arrayList2.add(next);
            }
        }
        arrayList3 = new ArrayList();
        for (Field field2 : (List) arrayList2) {
            Object obj4 = field2.get(null);
            if (obj4 != null) {
                Object aVar3;
                length = ((Integer) obj4).intValue();
                if ((length == ((-length) & length) ? 1 : null) != null) {
                    i.e(field2, str3);
                    String name2 = field2.getName();
                    i.e(name2, str2);
                    aVar3 = new a(length, name2);
                } else {
                    aVar3 = null;
                }
                if (aVar3 != null) {
                    arrayList3.add(aVar3);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        fut = u.T((List) arrayList3);
    }
}
