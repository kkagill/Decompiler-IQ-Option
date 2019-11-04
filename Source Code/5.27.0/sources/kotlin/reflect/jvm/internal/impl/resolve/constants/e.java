package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class e extends n<Character> {
    public e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqV = vVar.btw().bqV();
        i.e(bqV, "module.builtIns.charType");
        return bqV;
    }

    public String toString() {
        Object[] objArr = new Object[]{Integer.valueOf(((Character) getValue()).charValue()), G(((Character) getValue()).charValue())};
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, objArr.length));
        i.e(format, "java.lang.String.format(this, *args)");
        return format;
    }

    private final String G(char c) {
        switch (c) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                Object ch = H(c) ? Character.toString(c) : "?";
                i.e(ch, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
                return ch;
        }
    }

    private final boolean H(char c) {
        byte type = (byte) Character.getType(c);
        return (type == (byte) 0 || type == (byte) 13 || type == (byte) 14 || type == (byte) 15 || type == (byte) 16 || type == (byte) 18 || type == (byte) 19) ? false : true;
    }
}
