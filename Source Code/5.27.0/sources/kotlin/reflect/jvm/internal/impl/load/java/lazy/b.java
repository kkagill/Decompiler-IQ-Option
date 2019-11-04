package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.f;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.load.java.components.j;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.load.java.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: context.kt */
public final class b {
    private final h eZz;
    private final v fbz;
    private final am feg;
    private final l fiA;
    private final d fiB;
    private final k fiC;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l fiD;
    private final g fiE;
    private final f fiF;
    private final j fiG;
    private final kotlin.reflect.jvm.internal.impl.load.java.a.b fiH;
    private final j fiI;
    private final t fiJ;
    private final c fiK;
    private final kotlin.reflect.jvm.internal.impl.builtins.h fiL;
    private final AnnotationTypeQualifierResolver fiM;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j fiN;
    private final i fiO;
    private final c fiP;
    private final kotlin.reflect.jvm.internal.impl.load.java.h fiz;

    public b(h hVar, kotlin.reflect.jvm.internal.impl.load.java.h hVar2, l lVar, d dVar, k kVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar2, g gVar, f fVar, j jVar, kotlin.reflect.jvm.internal.impl.load.java.a.b bVar, j jVar2, t tVar, am amVar, c cVar, v vVar, kotlin.reflect.jvm.internal.impl.builtins.h hVar3, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar3, i iVar, c cVar2) {
        h hVar4 = hVar;
        kotlin.reflect.jvm.internal.impl.load.java.h hVar5 = hVar2;
        l lVar3 = lVar;
        d dVar2 = dVar;
        k kVar2 = kVar;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar4 = lVar2;
        g gVar2 = gVar;
        f fVar2 = fVar;
        j jVar4 = jVar;
        kotlin.reflect.jvm.internal.impl.load.java.a.b bVar2 = bVar;
        j jVar5 = jVar2;
        t tVar2 = tVar;
        am amVar2 = amVar;
        c cVar3 = cVar;
        v vVar2 = vVar;
        kotlin.reflect.jvm.internal.impl.builtins.h hVar6 = hVar3;
        kotlin.jvm.internal.i.f(hVar4, "storageManager");
        kotlin.jvm.internal.i.f(hVar5, "finder");
        kotlin.jvm.internal.i.f(lVar3, "kotlinClassFinder");
        kotlin.jvm.internal.i.f(dVar2, "deserializedDescriptorResolver");
        kotlin.jvm.internal.i.f(kVar2, "signaturePropagator");
        kotlin.jvm.internal.i.f(lVar4, "errorReporter");
        kotlin.jvm.internal.i.f(gVar2, "javaResolverCache");
        kotlin.jvm.internal.i.f(fVar2, "javaPropertyInitializerEvaluator");
        kotlin.jvm.internal.i.f(jVar4, "samConversionResolver");
        kotlin.jvm.internal.i.f(bVar2, "sourceElementFactory");
        kotlin.jvm.internal.i.f(jVar5, "moduleClassResolver");
        kotlin.jvm.internal.i.f(tVar2, "packagePartProvider");
        kotlin.jvm.internal.i.f(amVar2, "supertypeLoopChecker");
        kotlin.jvm.internal.i.f(cVar3, "lookupTracker");
        kotlin.jvm.internal.i.f(vVar2, "module");
        kotlin.jvm.internal.i.f(hVar3, "reflectionTypes");
        kotlin.jvm.internal.i.f(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        kotlin.jvm.internal.i.f(jVar3, "signatureEnhancement");
        kotlin.jvm.internal.i.f(iVar, "javaClassesTracker");
        kotlin.jvm.internal.i.f(cVar2, "settings");
        kotlin.reflect.jvm.internal.impl.builtins.h hVar7 = hVar3;
        this.eZz = hVar4;
        this.fiz = hVar5;
        this.fiA = lVar3;
        this.fiB = dVar2;
        this.fiC = kVar2;
        this.fiD = lVar4;
        this.fiE = gVar2;
        this.fiF = fVar2;
        this.fiG = jVar4;
        this.fiH = bVar2;
        this.fiI = jVar5;
        this.fiJ = tVar2;
        this.feg = amVar2;
        this.fiK = cVar3;
        this.fbz = vVar;
        this.fiL = hVar7;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar6 = jVar3;
        this.fiM = annotationTypeQualifierResolver;
        this.fiN = jVar6;
        c cVar4 = cVar2;
        this.fiO = iVar;
        this.fiP = cVar4;
    }

    public final h bqz() {
        return this.eZz;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.h bvQ() {
        return this.fiz;
    }

    public final l bvR() {
        return this.fiA;
    }

    public final d bvS() {
        return this.fiB;
    }

    public final k bvT() {
        return this.fiC;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l bvU() {
        return this.fiD;
    }

    public final g bvV() {
        return this.fiE;
    }

    public final f bvW() {
        return this.fiF;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.a.b bvX() {
        return this.fiH;
    }

    public final j bvY() {
        return this.fiI;
    }

    public final t bvZ() {
        return this.fiJ;
    }

    public final am brT() {
        return this.feg;
    }

    public final c bwa() {
        return this.fiK;
    }

    public final v bql() {
        return this.fbz;
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.h bwb() {
        return this.fiL;
    }

    public final AnnotationTypeQualifierResolver bwc() {
        return this.fiM;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j bwd() {
        return this.fiN;
    }

    public final i bwe() {
        return this.fiO;
    }

    public final c bwf() {
        return this.fiP;
    }

    public final b a(g gVar) {
        g gVar2 = gVar;
        kotlin.jvm.internal.i.f(gVar, "javaResolverCache");
        return new b(this.eZz, this.fiz, this.fiA, this.fiB, this.fiC, this.fiD, gVar2, this.fiF, this.fiG, this.fiH, this.fiI, this.fiJ, this.feg, this.fiK, this.fbz, this.fiL, this.fiM, this.fiN, this.fiO, this.fiP);
    }
}
