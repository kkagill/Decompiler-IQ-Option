package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$toIndexed$1 extends Lambda implements m<w, h, l> {
    final /* synthetic */ ArrayList $list;

    SignatureEnhancement$SignatureParts$toIndexed$1(ArrayList arrayList) {
        this.$list = arrayList;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        a((w) obj, (h) obj2);
        return l.eVB;
    }

    public final void a(w wVar, h hVar) {
        i.f(wVar, "type");
        i.f(hVar, "ownerContext");
        hVar = a.b(hVar, wVar.brE());
        ArrayList arrayList = this.$list;
        d bwj = hVar.bwj();
        arrayList.add(new n(wVar, bwj != null ? bwj.c(QualifierApplicabilityType.TYPE_USE) : null));
        for (ap apVar : wVar.btD()) {
            String str = "arg.type";
            w bpT;
            if (apVar.bPC()) {
                ArrayList arrayList2 = this.$list;
                bpT = apVar.bpT();
                i.e(bpT, str);
                arrayList2.add(new n(bpT, null));
            } else {
                SignatureEnhancement$SignatureParts$toIndexed$1 signatureEnhancement$SignatureParts$toIndexed$1 = this;
                bpT = apVar.bpT();
                i.e(bpT, str);
                signatureEnhancement$SignatureParts$toIndexed$1.a(bpT, hVar);
            }
        }
    }
}
