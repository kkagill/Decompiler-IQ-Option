package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$supertypes$2 extends Lambda implements a<List<? extends t>> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$supertypes$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<t> invoke() {
        an brm = this.this$0.boI().brm();
        kotlin.jvm.internal.i.e(brm, "descriptor.typeConstructor");
        Collection<w> bup = brm.bup();
        kotlin.jvm.internal.i.e(bup, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(bup.size());
        for (w wVar : bup) {
            Collection collection = arrayList;
            kotlin.jvm.internal.i.e(wVar, "kotlinType");
            collection.add(new t(wVar, new KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(wVar, this)));
        }
        Collection collection2 = arrayList;
        if (!g.e(this.this$0.boI())) {
            Iterable<t> iterable = arrayList;
            Object obj = 1;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (t bpT : iterable) {
                    Object obj2;
                    d an = c.an(bpT.bpT());
                    kotlin.jvm.internal.i.e(an, "DescriptorUtils.getClassDescriptorForType(it.type)");
                    ClassKind brt = an.brt();
                    kotlin.jvm.internal.i.e(brt, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                    if (brt == ClassKind.INTERFACE || brt == ClassKind.ANNOTATION_CLASS) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 == null) {
                        obj = null;
                        break;
                    }
                }
            }
            if (obj != null) {
                ad bqM = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(this.this$0.boI()).bqM();
                kotlin.jvm.internal.i.e(bqM, "descriptor.builtIns.anyType");
                collection2.add(new t(bqM, AnonymousClass3.eXp));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.i(arrayList);
    }
}
