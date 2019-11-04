package kotlin.reflect.jvm.internal.impl.name;

import kotlin.TypeCastException;
import kotlin.jvm.internal.i;

/* compiled from: FqNamesUtil.kt */
public final class d {
    public static final boolean a(b bVar, b bVar2) {
        i.f(bVar, "$this$isSubpackageOf");
        i.f(bVar2, "packageName");
        if (i.y(bVar, bVar2) || bVar2.isRoot()) {
            return true;
        }
        String boi = bVar.boi();
        i.e(boi, "this.asString()");
        String boi2 = bVar2.boi();
        i.e(boi2, "packageName.asString()");
        return bj(boi, boi2);
    }

    private static final boolean bj(String str, String str2) {
        return u.a(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final b b(b bVar, b bVar2) {
        i.f(bVar, "$this$tail");
        i.f(bVar2, "prefix");
        if (!a(bVar, bVar2) || bVar2.isRoot()) {
            return bVar;
        }
        if (i.y(bVar, bVar2)) {
            bVar = b.fpl;
            i.e(bVar, "FqName.ROOT");
            return bVar;
        }
        String boi = bVar.boi();
        i.e(boi, "asString()");
        int length = bVar2.boi().length() + 1;
        if (boi != null) {
            boi = boi.substring(length);
            i.e(boi, "(this as java.lang.String).substring(startIndex)");
            return new b(boi);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static final boolean mr(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        State state2 = state;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = e.aob[state2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                state2 = State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                state2 = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (state2 != State.AFTER_DOT) {
            z = true;
        }
        return z;
    }
}
