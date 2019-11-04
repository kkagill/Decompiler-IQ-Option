package kotlin.reflect.jvm;

import kotlin.Pair;
import kotlin.c;
import kotlin.i;
import kotlin.reflect.e;
import kotlin.reflect.jvm.internal.a;
import kotlin.reflect.jvm.internal.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, bng = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflect-api"})
/* compiled from: reflectLambda.kt */
public final class d {
    public static final <R> e<R> a(c<? extends R> cVar) {
        kotlin.jvm.internal.i.f(cVar, "$this$reflect");
        i iVar = (i) cVar.getClass().getAnnotation(i.class);
        if (iVar != null) {
            String[] bnf = iVar.bnf();
            boolean z = true;
            if ((bnf.length == 0 ? 1 : null) != null) {
                bnf = null;
            }
            if (bnf != null) {
                Pair c = j.c(bnf, iVar.bng());
                h hVar = (h) c.bnj();
                Function function = (Function) c.bnk();
                int[] bne = iVar.bne();
                if ((iVar.bnh() & 8) == 0) {
                    z = false;
                }
                g gVar = new g(bne, z);
                Class cls = cVar.getClass();
                n nVar = function;
                kotlin.reflect.jvm.internal.impl.metadata.a.c cVar2 = hVar;
                TypeTable bAP = function.bAP();
                kotlin.jvm.internal.i.e(bAP, "proto.typeTable");
                ai aiVar = (ai) ae.a(cls, nVar, cVar2, new kotlin.reflect.jvm.internal.impl.metadata.a.h(bAP), gVar, ReflectLambdaKt$reflect$descriptor$1.eWB);
                if (aiVar != null) {
                    return new kotlin.reflect.jvm.internal.i(a.eWC, aiVar);
                }
            }
        }
        return null;
    }
}
