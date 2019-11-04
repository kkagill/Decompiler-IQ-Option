package kotlin.text;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
/* compiled from: StringNumberConversionsJVM.kt */
final class l {
    public static final Regex fBS;
    public static final l fBT = new l();

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[eE][+-]?");
        String str = "(\\p{Digit}+)";
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        String str2 = "(0[xX]";
        stringBuilder3.append(str2);
        String str3 = "(\\p{XDigit}+)";
        stringBuilder3.append(str3);
        stringBuilder3.append("(\\.)?)|");
        stringBuilder3.append(str2);
        stringBuilder3.append(str3);
        stringBuilder3.append("?(\\.)");
        stringBuilder3.append(str3);
        stringBuilder3.append(')');
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append('(');
        stringBuilder5.append(str);
        stringBuilder5.append("(\\.)?(");
        stringBuilder5.append(str);
        stringBuilder5.append("?)(");
        stringBuilder5.append(stringBuilder2);
        String str4 = ")?)|";
        stringBuilder5.append(str4);
        stringBuilder5.append("(\\.(");
        stringBuilder5.append(str);
        stringBuilder5.append(")(");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(str4);
        stringBuilder5.append("((");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")[pP][+-]?");
        stringBuilder5.append(str);
        stringBuilder5.append(')');
        stringBuilder2 = stringBuilder5.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        stringBuilder6.append(stringBuilder2);
        stringBuilder6.append(")[fFdD]?))[\\x00-\\x20]*");
        fBS = new Regex(stringBuilder6.toString());
    }

    private l() {
    }
}
