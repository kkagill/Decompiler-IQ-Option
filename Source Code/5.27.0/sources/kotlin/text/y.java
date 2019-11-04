package kotlin.text;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"})
/* compiled from: StringBuilderJVM.kt */
final class y {
    public static final String fBV;
    public static final y fBW = new y();

    static {
        String property = System.getProperty("line.separator");
        if (property == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        fBV = property;
    }

    private y() {
    }
}
