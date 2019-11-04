package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.g;
import kotlin.reflect.jvm.internal.impl.types.b.a;

/* compiled from: dynamicTypes.kt */
public final class m extends q {
    private final f fdr;

    public String a(b bVar, g gVar) {
        i.f(bVar, "renderer");
        i.f(gVar, "options");
        return "dynamic";
    }

    public boolean boc() {
        return false;
    }

    /* renamed from: he */
    public m gL(boolean z) {
        return this;
    }

    public m(kotlin.reflect.jvm.internal.impl.builtins.g gVar, f fVar) {
        i.f(gVar, "builtIns");
        i.f(fVar, "annotations");
        ad bqK = gVar.bqK();
        i.e(bqK, "builtIns.nothingType");
        ad bqN = gVar.bqN();
        i.e(bqN, "builtIns.nullableAnyType");
        super(bqK, bqN);
        this.fdr = fVar;
    }

    public f brE() {
        return this.fdr;
    }

    public ad bxe() {
        return bPs();
    }

    /* renamed from: o */
    public m f(f fVar) {
        i.f(fVar, "newAnnotations");
        return new m(a.bo(bxe()), fVar);
    }
}
