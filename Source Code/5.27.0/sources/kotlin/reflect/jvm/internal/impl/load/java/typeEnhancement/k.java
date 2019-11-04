package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w;
import kotlin.j;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: predefinedEnhancementInfo.kt */
final class k {
    private final Map<String, h> fle = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {
        private final String className;
        final /* synthetic */ k flf;

        /* compiled from: predefinedEnhancementInfo.kt */
        public final class a {
            private Pair<String, o> flg = j.x("V", null);
            private final String flh;
            final /* synthetic */ a fli;
            private final List<Pair<String, o>> ws = new ArrayList();

            public a(a aVar, String str) {
                i.f(str, "functionName");
                this.fli = aVar;
                this.flh = str;
            }

            public final void a(String str, d... dVarArr) {
                Object obj;
                i.f(str, "type");
                i.f(dVarArr, "qualifiers");
                Collection collection = this.ws;
                if ((dVarArr.length == 0 ? 1 : null) != null) {
                    obj = null;
                } else {
                    Iterable<w> H = i.H(dVarArr);
                    Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(H, 10)), 16));
                    for (w wVar : H) {
                        linkedHashMap.put(Integer.valueOf(wVar.getIndex()), (d) wVar.getValue());
                    }
                    obj = new o(linkedHashMap);
                }
                collection.add(j.x(str, obj));
            }

            public final void b(String str, d... dVarArr) {
                i.f(str, "type");
                i.f(dVarArr, "qualifiers");
                Iterable<w> H = i.H(dVarArr);
                Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(n.e(H, 10)), 16));
                for (w wVar : H) {
                    linkedHashMap.put(Integer.valueOf(wVar.getIndex()), (d) wVar.getValue());
                }
                this.flg = j.x(str, new o(linkedHashMap));
            }

            public final void a(JvmPrimitiveType jvmPrimitiveType) {
                i.f(jvmPrimitiveType, "type");
                this.flg = j.x(jvmPrimitiveType.getDesc(), null);
            }

            public final Pair<String, h> byl() {
                u uVar = u.fmf;
                String className = this.fli.getClassName();
                String str = this.flh;
                Iterable<Pair> iterable = this.ws;
                Collection arrayList = new ArrayList(n.e(iterable, 10));
                for (Pair first : iterable) {
                    arrayList.add((String) first.getFirst());
                }
                String bf = uVar.bf(className, uVar.a(str, (List) arrayList, (String) this.flg.getFirst()));
                o oVar = (o) this.flg.bni();
                Iterable<Pair> iterable2 = this.ws;
                Collection arrayList2 = new ArrayList(n.e(iterable2, 10));
                for (Pair bni : iterable2) {
                    arrayList2.add((o) bni.bni());
                }
                return j.x(bf, new h(oVar, (List) arrayList2));
            }
        }

        public a(k kVar, String str) {
            i.f(str, "className");
            this.flf = kVar;
            this.className = str;
        }

        public final String getClassName() {
            return this.className;
        }

        public final void f(String str, b<? super a, l> bVar) {
            i.f(str, ConditionalUserProperty.NAME);
            i.f(bVar, "block");
            Map a = this.flf.fle;
            a aVar = new a(this, str);
            bVar.invoke(aVar);
            Pair byl = aVar.byl();
            a.put(byl.getFirst(), byl.bni());
        }
    }

    public final Map<String, h> build() {
        return this.fle;
    }
}
