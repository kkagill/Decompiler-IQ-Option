package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke", "kotlin/reflect/jvm/internal/KTypeImpl$arguments$2$1$type$1"})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 extends Lambda implements a<Type> {
    final /* synthetic */ int $i;
    final /* synthetic */ d $parameterizedTypeArguments$inlined;
    final /* synthetic */ j $parameterizedTypeArguments$metadata$inlined;
    final /* synthetic */ KTypeImpl$arguments$2 this$0;

    KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(int i, KTypeImpl$arguments$2 kTypeImpl$arguments$2, d dVar, j jVar) {
        this.$i = i;
        this.this$0 = kTypeImpl$arguments$2;
        this.$parameterizedTypeArguments$inlined = dVar;
        this.$parameterizedTypeArguments$metadata$inlined = jVar;
        super(0);
    }

    /* renamed from: boG */
    public final Type invoke() {
        Type bpS = this.this$0.this$0.bpS();
        Object componentType;
        StringBuilder stringBuilder;
        if (bpS instanceof Class) {
            Class cls = (Class) bpS;
            componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            kotlin.jvm.internal.i.e(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
            return (Type) componentType;
        } else if (bpS instanceof GenericArrayType) {
            if (this.$i == 0) {
                bpS = ((GenericArrayType) bpS).getGenericComponentType();
                kotlin.jvm.internal.i.e(bpS, "javaType.genericComponentType");
                return bpS;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Array type has been queried for a non-0th argument: ");
            stringBuilder.append(this.this$0.this$0);
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        } else if (bpS instanceof ParameterizedType) {
            d dVar = this.$parameterizedTypeArguments$inlined;
            j jVar = this.$parameterizedTypeArguments$metadata$inlined;
            componentType = (Type) ((List) dVar.getValue()).get(this.$i);
            if (componentType instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) componentType;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                kotlin.jvm.internal.i.e(lowerBounds, "argument.lowerBounds");
                Type type = (Type) i.z(lowerBounds);
                if (type != null) {
                    componentType = type;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    kotlin.jvm.internal.i.e(upperBounds, "argument.upperBounds");
                    componentType = (Type) i.y(upperBounds);
                }
            }
            kotlin.jvm.internal.i.e(componentType, "if (argument !is Wildcar…ument.upperBounds.first()");
            return componentType;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Non-generic type has been queried for arguments: ");
            stringBuilder.append(this.this$0.this$0);
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }
}
