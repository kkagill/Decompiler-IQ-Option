package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class a implements kotlin.reflect.jvm.internal.impl.descriptors.a.b {
    public static final a fbA = new a();
    private final h eZz;
    private final v fbz;

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final b a(String str, kotlin.reflect.jvm.internal.impl.name.b bVar) {
            Kind a = Kind.Companion.a(bVar, str);
            b bVar2 = null;
            if (a == null) {
                return null;
            }
            a aVar = this;
            int length = a.getClassNamePrefix().length();
            if (str != null) {
                str = str.substring(length);
                i.e(str, "(this as java.lang.String).substring(startIndex)");
                Integer lY = aVar.lY(str);
                if (lY != null) {
                    bVar2 = new b(a, lY.intValue());
                }
                return bVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public final Kind b(String str, kotlin.reflect.jvm.internal.impl.name.b bVar) {
            i.f(str, "className");
            i.f(bVar, "packageFqName");
            b a = a(str, bVar);
            return a != null ? a.brg() : null;
        }

        private final Integer lY(String str) {
            if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - 48;
                if (charAt < 0 || 9 < charAt) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class b {
        private final int arity;
        private final Kind fbB;

        public final Kind brh() {
            return this.fbB;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (i.y(this.fbB, bVar.fbB)) {
                        if ((this.arity == bVar.arity ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Kind kind = this.fbB;
            return ((kind != null ? kind.hashCode() : 0) * 31) + this.arity;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("KindWithArity(kind=");
            stringBuilder.append(this.fbB);
            stringBuilder.append(", arity=");
            stringBuilder.append(this.arity);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(Kind kind, int i) {
            i.f(kind, "kind");
            this.fbB = kind;
            this.arity = i;
        }

        public final Kind brg() {
            return this.fbB;
        }
    }

    public a(h hVar, v vVar) {
        i.f(hVar, "storageManager");
        i.f(vVar, "module");
        this.eZz = hVar;
        this.fbz = vVar;
    }

    public boolean a(kotlin.reflect.jvm.internal.impl.name.b bVar, f fVar) {
        i.f(bVar, "packageFqName");
        i.f(fVar, ConditionalUserProperty.NAME);
        String boi = fVar.boi();
        i.e(boi, "name.asString()");
        if ((u.a(boi, "Function", false, 2, null) || u.a(boi, "KFunction", false, 2, null) || u.a(boi, "SuspendFunction", false, 2, null) || u.a(boi, "KSuspendFunction", false, 2, null)) && fbA.a(boi, bVar) != null) {
            return true;
        }
        return false;
    }

    public d f(kotlin.reflect.jvm.internal.impl.name.a aVar) {
        i.f(aVar, "classId");
        if (!(aVar.bJW() || aVar.bJY())) {
            String boi = aVar.bJU().boi();
            i.e(boi, "classId.relativeClassName.asString()");
            if (!v.b((CharSequence) boi, (CharSequence) "Function", false, 2, null)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.b packageFqName = aVar.getPackageFqName();
            i.e(packageFqName, "classId.packageFqName");
            b a = fbA.a(boi, packageFqName);
            if (a != null) {
                Kind brh = a.brh();
                int component2 = a.component2();
                Collection arrayList = new ArrayList();
                for (Object next : this.fbz.f(packageFqName).getFragments()) {
                    if (next instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                Collection arrayList2 = new ArrayList();
                for (Object next2 : list) {
                    if (next2 instanceof e) {
                        arrayList2.add(next2);
                    }
                }
                e eVar = (e) u.bV((List) arrayList2);
                if (eVar == null) {
                    eVar = u.bU(list);
                }
                return new FunctionClassDescriptor(this.eZz, eVar, brh, component2);
            }
        }
        return null;
    }

    public Collection<d> d(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "packageFqName");
        return al.emptySet();
    }
}
