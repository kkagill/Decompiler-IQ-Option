package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.m;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class f implements m {
    public static final f flP = new f();

    private f() {
    }

    public w a(Type type, String str, ad adVar, ad adVar2) {
        i.f(type, "proto");
        i.f(str, "flexibleId");
        i.f(adVar, "lowerBound");
        i.f(adVar2, "upperBound");
        if ((i.y(str, "kotlin.jvm.PlatformType") ^ 1) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error java flexible type with id: ");
            stringBuilder.append(str);
            stringBuilder.append(". (");
            stringBuilder.append(adVar);
            stringBuilder.append("..");
            stringBuilder.append(adVar2);
            stringBuilder.append(')');
            ad mK = p.mK(stringBuilder.toString());
            i.e(mK, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return mK;
        } else if (type.c(JvmProtoBuf.fow)) {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f(adVar, adVar2);
        } else {
            return x.a(adVar, adVar2);
        }
    }
}
