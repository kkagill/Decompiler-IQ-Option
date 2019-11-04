package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* compiled from: TypeSubstitution.kt */
public abstract class ao extends as {
    public static final a fxv = new a();

    /* compiled from: TypeSubstitution.kt */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        public static final class a extends ao {
            final /* synthetic */ Map fxw;
            final /* synthetic */ boolean fxx;

            a(Map map, boolean z) {
                this.fxw = map;
                this.fxx = z;
            }

            public ap d(an anVar) {
                i.f(anVar, "key");
                return (ap) this.fxw.get(anVar);
            }

            public boolean isEmpty() {
                return this.fxw.isEmpty();
            }

            public boolean bPm() {
                return this.fxx;
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ ao a(a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.b(map, z);
        }

        public final ao b(Map<an, ? extends ap> map, boolean z) {
            i.f(map, "map");
            return new a(map, z);
        }

        public final as aS(w wVar) {
            i.f(wVar, "kotlinType");
            return b(wVar.bMZ(), wVar.btD());
        }

        public final as b(an anVar, List<? extends ap> list) {
            i.f(anVar, "typeConstructor");
            i.f(list, "arguments");
            List parameters = anVar.getParameters();
            String str = "typeConstructor.parameters";
            i.e(parameters, str);
            kotlin.reflect.jvm.internal.impl.descriptors.ao aoVar = (kotlin.reflect.jvm.internal.impl.descriptors.ao) u.bX(parameters);
            if (!(aoVar != null ? aoVar.bsU() : false)) {
                return new u(parameters, list);
            }
            a aVar = this;
            List parameters2 = anVar.getParameters();
            i.e(parameters2, str);
            Iterable<kotlin.reflect.jvm.internal.impl.descriptors.ao> iterable = parameters2;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (kotlin.reflect.jvm.internal.impl.descriptors.ao aoVar2 : iterable) {
                i.e(aoVar2, "it");
                arrayList.add(aoVar2.brm());
            }
            return a(aVar, af.ac(u.e((Iterable) (List) arrayList, (Iterable) list)), false, 2, null);
        }
    }

    public static final ao Z(Map<an, ? extends ap> map) {
        return a.a(fxv, map, false, 2, null);
    }

    public static final as b(an anVar, List<? extends ap> list) {
        return fxv.b(anVar, (List) list);
    }

    public abstract ap d(an anVar);

    public ap Y(w wVar) {
        i.f(wVar, "key");
        return d(wVar.bMZ());
    }
}
