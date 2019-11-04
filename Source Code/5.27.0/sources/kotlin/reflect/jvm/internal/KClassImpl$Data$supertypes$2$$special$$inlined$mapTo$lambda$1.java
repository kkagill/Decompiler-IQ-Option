package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends Lambda implements a<Type> {
    final /* synthetic */ w $kotlinType;
    final /* synthetic */ KClassImpl$Data$supertypes$2 this$0;

    KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(w wVar, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        this.$kotlinType = wVar;
        this.this$0 = kClassImpl$Data$supertypes$2;
        super(0);
    }

    /* renamed from: boG */
    public final Type invoke() {
        f brQ = this.$kotlinType.bMZ().brQ();
        StringBuilder stringBuilder;
        if (brQ instanceof d) {
            Class a = ae.a((d) brQ);
            if (a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported superclass of ");
                stringBuilder.append(this.this$0.this$0);
                stringBuilder.append(": ");
                stringBuilder.append(brQ);
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            } else if (kotlin.jvm.internal.i.y(g.this.bnC().getSuperclass(), a)) {
                Type genericSuperclass = g.this.bnC().getGenericSuperclass();
                kotlin.jvm.internal.i.e(genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class[] interfaces = g.this.bnC().getInterfaces();
                kotlin.jvm.internal.i.e(interfaces, "jClass.interfaces");
                int indexOf = i.indexOf(interfaces, a);
                if (indexOf >= 0) {
                    Object obj = g.this.bnC().getGenericInterfaces()[indexOf];
                    kotlin.jvm.internal.i.e(obj, "jClass.genericInterfaces[index]");
                    return obj;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("No superclass of ");
                stringBuilder.append(this.this$0.this$0);
                stringBuilder.append(" in Java reflection for ");
                stringBuilder.append(brQ);
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Supertype not a class: ");
        stringBuilder.append(brQ);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }
}
