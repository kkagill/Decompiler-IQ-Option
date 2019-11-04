package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "R", "invoke"})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_parameters$1 extends Lambda implements kotlin.jvm.a.a<ArrayList<KParameter>> {
    final /* synthetic */ e this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((KParameter) t).getName(), ((KParameter) t2).getName());
        }
    }

    KCallableImpl$_parameters$1(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: asK */
    public final ArrayList<KParameter> invoke() {
        int i;
        int i2;
        final CallableMemberDescriptor box = this.this$0.box();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (this.this$0.isBound()) {
            i = 0;
        } else {
            final ah b = ae.b(box);
            if (b != null) {
                arrayList.add(new n(this.this$0, 0, Kind.INSTANCE, new kotlin.jvm.a.a<ah>() {
                    /* renamed from: boD */
                    public final ah invoke() {
                        return b;
                    }
                }));
                i = 1;
            } else {
                i = 0;
            }
            final ah bsK = box.bsK();
            if (bsK != null) {
                i2 = i + 1;
                arrayList.add(new n(this.this$0, i, Kind.EXTENSION_RECEIVER, new kotlin.jvm.a.a<ah>() {
                    /* renamed from: boD */
                    public final ah invoke() {
                        return bsK;
                    }
                }));
                i = i2;
            }
        }
        List bsP = box.bsP();
        kotlin.jvm.internal.i.e(bsP, "descriptor.valueParameters");
        int size = bsP.size();
        while (i3 < size) {
            i2 = i + 1;
            arrayList.add(new n(this.this$0, i, Kind.VALUE, new kotlin.jvm.a.a<ar>() {
                /* renamed from: boE */
                public final ar invoke() {
                    Object obj = box.bsP().get(i3);
                    kotlin.jvm.internal.i.e(obj, "descriptor.valueParameters[i]");
                    return (ar) obj;
                }
            }));
            i3++;
            i = i2;
        }
        if (this.this$0.boB() && (box instanceof b)) {
            List list = arrayList;
            if (list.size() > 1) {
                q.a(list, new a());
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
