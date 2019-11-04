package kotlin.reflect.jvm.internal.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.i;
import kotlin.reflect.jvm.internal.structure.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, bng = {"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"})
/* compiled from: ReflectKotlinClass.kt */
final class m {
    public static final m eZf = new m();

    private m() {
    }

    public final String h(Method method) {
        kotlin.jvm.internal.i.f(method, "method");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Object obj : method.getParameterTypes()) {
            kotlin.jvm.internal.i.e(obj, "parameterType");
            stringBuilder.append(b.V(obj));
        }
        stringBuilder.append(")");
        Class returnType = method.getReturnType();
        kotlin.jvm.internal.i.e(returnType, "method.returnType");
        stringBuilder.append(b.V(returnType));
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "sb.toString()");
        return stringBuilder2;
    }

    public final String a(Constructor<?> constructor) {
        kotlin.jvm.internal.i.f(constructor, "constructor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Object obj : constructor.getParameterTypes()) {
            kotlin.jvm.internal.i.e(obj, "parameterType");
            stringBuilder.append(b.V(obj));
        }
        stringBuilder.append(")V");
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "sb.toString()");
        return stringBuilder2;
    }

    public final String c(Field field) {
        kotlin.jvm.internal.i.f(field, "field");
        Class type = field.getType();
        kotlin.jvm.internal.i.e(type, "field.type");
        return b.V(type);
    }
}
