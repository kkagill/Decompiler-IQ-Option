package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.utils.d;

/* compiled from: NewCapturedType.kt */
public final class f {
    public static /* synthetic */ ad a(ad adVar, CaptureStatus captureStatus, m mVar, int i, Object obj) {
        if ((i & 4) != 0) {
            mVar = d.bPX();
        }
        return a(adVar, captureStatus, mVar);
    }

    public static final ad a(ad adVar, CaptureStatus captureStatus, m<? super Integer, ? super d, l> mVar) {
        i.f(adVar, "type");
        i.f(captureStatus, NotificationCompat.CATEGORY_STATUS);
        i.f(mVar, "acceptNewCapturedType");
        if (adVar.btD().size() != adVar.bMZ().getParameters().size()) {
            return null;
        }
        ap apVar;
        Object obj;
        List btD = adVar.btD();
        Iterable<ap> iterable = btD;
        Object obj2 = 1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ap apVar2 : iterable) {
                if (apVar2.bPD() == Variance.INVARIANT) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj == null) {
                    obj2 = null;
                    break;
                }
            }
        }
        if (obj2 != null) {
            return null;
        }
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Object obj3 : iterable) {
            if (obj3.bPD() != Variance.INVARIANT) {
                ay bPA = (obj3.bPC() || obj3.bPD() != Variance.IN_VARIANCE) ? null : obj3.bpT().bPA();
                obj3 = a.bp(new d(captureStatus, bPA, obj3));
            }
            arrayList.add(obj3);
        }
        List list = (List) arrayList;
        TypeSubstitutor bPF = ao.fxv.b(adVar.bMZ(), list).bPF();
        int size = btD.size();
        for (int i = 0; i < size; i++) {
            ap apVar3 = (ap) btD.get(i);
            apVar2 = (ap) list.get(i);
            if (apVar3.bPD() != Variance.INVARIANT) {
                Object obj4 = adVar.bMZ().getParameters().get(i);
                i.e(obj4, "type.constructor.parameters[index]");
                List bod = ((kotlin.reflect.jvm.internal.impl.descriptors.ao) obj4).bod();
                i.e(bod, "type.constructor.parameters[index].upperBounds");
                Iterable<w> iterable2 = bod;
                Collection arrayList2 = new ArrayList(n.e(iterable2, 10));
                for (w b : iterable2) {
                    arrayList2.add(g.fxP.e(bPF.b(b, Variance.INVARIANT).bPA()));
                }
                List list2 = (List) arrayList2;
                if (!apVar3.bPC() && apVar3.bPD() == Variance.OUT_VARIANCE) {
                    list2 = u.i((Collection) list2, (Object) g.fxP.e(apVar3.bpT().bPA()));
                }
                w bpT = apVar2.bpT();
                if (bpT != null) {
                    d dVar = (d) bpT;
                    dVar.bMZ().cp(list2);
                    mVar.w(Integer.valueOf(i), dVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
            }
        }
        return x.c(adVar.brE(), adVar.bMZ(), list, adVar.boc());
    }
}
