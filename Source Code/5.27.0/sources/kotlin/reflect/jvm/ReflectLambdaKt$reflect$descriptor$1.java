package kotlin.reflect.jvm;

import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/SimpleFunctionDescriptor;", "R", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;", "Lkotlin/ParameterName;", "name", "proto", "invoke"})
/* compiled from: reflectLambda.kt */
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements m<p, Function, ai> {
    public static final ReflectLambdaKt$reflect$descriptor$1 eWB = new ReflectLambdaKt$reflect$descriptor$1();

    ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    public final d RW() {
        return k.G(p.class);
    }

    public final String RX() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public final String getName() {
        return "loadFunction";
    }

    /* renamed from: a */
    public final ai w(p pVar, Function function) {
        kotlin.jvm.internal.i.f(pVar, "p1");
        kotlin.jvm.internal.i.f(function, "p2");
        return pVar.h(function);
    }
}
