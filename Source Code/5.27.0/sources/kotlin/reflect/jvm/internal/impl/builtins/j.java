package kotlin.reflect.jvm.internal.impl.builtins;

import com.iqoption.dto.entity.ActiveQuote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.m;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.w;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: suspendFunctionTypes.kt */
public final class j {
    private static final w fbs;
    private static final w fbt;

    public static final w bre() {
        return fbs;
    }

    static {
        v bPo = p.bPo();
        String str = "ErrorUtils.getErrorModule()";
        i.e(bPo, str);
        b bVar = c.fsR;
        i.e(bVar, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        w wVar = new w(new m(bPo, bVar), ClassKind.INTERFACE, false, false, c.fsT.bKc(), aj.fcV, LockBasedStorageManager.fwt);
        wVar.c(Modality.ABSTRACT);
        wVar.d(av.fde);
        k kVar = wVar;
        f bug = f.fdA.bug();
        Variance variance = Variance.IN_VARIANCE;
        String str2 = ActiveQuote.PHASE_TRADING;
        wVar.cg(l.listOf(ah.a(kVar, bug, false, variance, kotlin.reflect.jvm.internal.impl.name.f.ms(str2), 0)));
        wVar.buS();
        fbs = wVar;
        v bPo2 = p.bPo();
        i.e(bPo2, str);
        b bVar2 = c.fsQ;
        i.e(bVar2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        w wVar2 = new w(new m(bPo2, bVar2), ClassKind.INTERFACE, false, false, c.fsU.bKc(), aj.fcV, LockBasedStorageManager.fwt);
        wVar2.c(Modality.ABSTRACT);
        wVar2.d(av.fde);
        wVar2.cg(l.listOf(ah.a(wVar2, f.fdA.bug(), false, Variance.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.f.ms(str2), 0)));
        wVar2.buS();
        fbt = wVar2;
    }

    public static final w brf() {
        return fbt;
    }

    public static final ad a(kotlin.reflect.jvm.internal.impl.types.w wVar, boolean z) {
        i.f(wVar, "suspendFunType");
        boolean e = f.e(wVar);
        if (!kotlin.m.eVC || e) {
            Object brm;
            g bo = a.bo(wVar);
            f brE = wVar.brE();
            kotlin.reflect.jvm.internal.impl.types.w i = f.i(wVar);
            Iterable<ap> k = f.k(wVar);
            Collection arrayList = new ArrayList(n.e(k, 10));
            for (ap bpT : k) {
                arrayList.add(bpT.bpT());
            }
            arrayList = (List) arrayList;
            f bug = f.fdA.bug();
            if (z) {
                brm = fbt.brm();
            } else {
                brm = fbs.brm();
            }
            i.e(brm, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
            List i2 = u.i(arrayList, (Object) x.c(bug, brm, l.listOf(a.bp(f.j(wVar))), false));
            ad bqN = a.bo(wVar).bqN();
            i.e(bqN, "suspendFunType.builtIns.nullableAnyType");
            return f.a(bo, brE, i, i2, null, bqN, false, 64, null).gM(wVar.boc());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This type should be suspend function type: ");
        stringBuilder.append(wVar);
        throw new AssertionError(stringBuilder.toString());
    }

    public static final boolean a(b bVar, boolean z) {
        if (z) {
            return i.y(bVar, c.fsU);
        }
        return i.y(bVar, c.fsT);
    }
}
