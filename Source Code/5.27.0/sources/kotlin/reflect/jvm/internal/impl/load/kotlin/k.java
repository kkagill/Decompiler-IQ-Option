package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.c;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: methodSignatureMapping.kt */
final class k implements j<i> {
    public static final k fmb = new k();

    private k() {
    }

    /* renamed from: a */
    public i dH(i iVar) {
        i.f(iVar, "possiblyPrimitiveType");
        if (!(iVar instanceof c)) {
            return iVar;
        }
        c cVar = (c) iVar;
        if (cVar.byF() == null) {
            return iVar;
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c t = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.t(cVar.byF().getWrapperFqName());
        i.e(t, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String byE = t.byE();
        i.e(byE, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return mg(byE);
    }

    /* renamed from: mh */
    public i mf(String str) {
        i.f(str, "representation");
        int i = 0;
        Object obj = str.length() > 0 ? 1 : null;
        if (m.eVC && obj == null) {
            throw new AssertionError("empty string as JvmType");
        }
        char charAt = str.charAt(0);
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            if ((jvmPrimitiveType.getDesc().charAt(0) == charAt ? 1 : null) != null) {
                break;
            }
        }
        JvmPrimitiveType jvmPrimitiveType2 = null;
        if (jvmPrimitiveType2 != null) {
            return new c(jvmPrimitiveType2);
        }
        i cVar;
        if (charAt == 'V') {
            cVar = new c(null);
        } else if (charAt != '[') {
            if (charAt == 'L' && v.b((CharSequence) str, ';', false, 2, null)) {
                i = 1;
            }
            if (m.eVC && i == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type that is not primitive nor array should be Object, but '");
                stringBuilder.append(str);
                stringBuilder.append("' was found");
                throw new AssertionError(stringBuilder.toString());
            }
            str = str.substring(1, str.length() - 1);
            i.e(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            cVar = new b(str);
        } else {
            str = str.substring(1);
            i.e(str, "(this as java.lang.String).substring(startIndex)");
            cVar = new a(mf(str));
        }
        return cVar;
    }

    /* renamed from: mi */
    public b mg(String str) {
        i.f(str, "internalName");
        return new b(str);
    }

    /* renamed from: b */
    public String toString(i iVar) {
        i.f(iVar, "type");
        StringBuilder stringBuilder;
        if (iVar instanceof a) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(toString(((a) iVar).byD()));
            return stringBuilder.toString();
        } else if (iVar instanceof c) {
            JvmPrimitiveType byF = ((c) iVar).byF();
            if (byF != null) {
                String desc = byF.getDesc();
                if (desc != null) {
                    return desc;
                }
            }
            return "V";
        } else if (iVar instanceof b) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("L");
            stringBuilder.append(((b) iVar).byE());
            stringBuilder.append(";");
            return stringBuilder.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: byH */
    public i byG() {
        return mg("java/lang/Class");
    }
}
