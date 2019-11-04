package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;

/* compiled from: context.kt */
public final class k {
    private final f fjg;
    private final Collection<QualifierApplicabilityType> fjh;

    public final f bwo() {
        return this.fjg;
    }

    public final Collection<QualifierApplicabilityType> bwp() {
        return this.fjh;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fjh, r3.fjh) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.k) r3;
        r0 = r2.fjg;
        r1 = r3.fjg;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.fjh;
        r3 = r3.fjh;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f fVar = this.fjg;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        Collection collection = this.fjh;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        stringBuilder.append(this.fjg);
        stringBuilder.append(", qualifierApplicabilityTypes=");
        stringBuilder.append(this.fjh);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public k(f fVar, Collection<? extends QualifierApplicabilityType> collection) {
        i.f(fVar, "nullabilityQualifier");
        i.f(collection, "qualifierApplicabilityTypes");
        this.fjg = fVar;
        this.fjh = collection;
    }
}
