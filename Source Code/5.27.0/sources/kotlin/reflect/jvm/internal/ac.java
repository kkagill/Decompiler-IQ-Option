package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, bng = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflect-api"})
/* compiled from: RuntimeTypeMapper.kt */
public final class ac {
    private static final String f(Method method) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        stringBuilder.append(i.a((Object[]) parameterTypes, (CharSequence) "", (CharSequence) "(", (CharSequence) ")", 0, null, (b) RuntimeTypeMapperKt$signature$1.eYo, 24, null));
        Class returnType = method.getReturnType();
        kotlin.jvm.internal.i.e(returnType, "returnType");
        stringBuilder.append(kotlin.reflect.jvm.internal.structure.b.V(returnType));
        return stringBuilder.toString();
    }
}
