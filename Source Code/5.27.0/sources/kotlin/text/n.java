package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, bng = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, bnh = 1)
/* compiled from: Indent.kt */
class n {
    public static /* synthetic */ String b(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return bl(str, str2);
    }

    public static final String bl(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "$this$trimMargin");
        kotlin.jvm.internal.i.f(str2, "marginPrefix");
        return u(str, "", str2);
    }

    public static final String u(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str3;
        kotlin.jvm.internal.i.f(str4, "$this$replaceIndentByMargin");
        kotlin.jvm.internal.i.f(str2, "newIndent");
        kotlin.jvm.internal.i.f(str5, "marginPrefix");
        if ((u.Y(str5) ^ 1) != 0) {
            List ac = v.ac(str4);
            int length = str.length() + (str2.length() * ac.size());
            b mT = mT(str2);
            int bQ = m.bQ(ac);
            Collection arrayList = new ArrayList();
            int i = 0;
            for (Object next : ac) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                Object obj = (String) next;
                Object obj2 = null;
                if ((i == 0 || i == bQ) && u.Y((CharSequence) obj)) {
                    obj = null;
                } else {
                    int i3;
                    CharSequence charSequence = (CharSequence) obj;
                    int length2 = charSequence.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        if ((b.isWhitespace(charSequence.charAt(i4)) ^ 1) != 0) {
                            i3 = i4;
                            break;
                        }
                    }
                    i3 = -1;
                    if (i3 != -1) {
                        int i5 = i3;
                        if (u.a((String) obj, str3, i3, false, 4, null)) {
                            i3 = i5 + str3.length();
                            if (obj != null) {
                                obj2 = obj.substring(i3);
                                kotlin.jvm.internal.i.e(obj2, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (obj2 != null) {
                        str4 = (String) mT.invoke(obj2);
                        if (str4 != null) {
                            obj = str4;
                        }
                    }
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            str4 = ((StringBuilder) u.a((List) arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            kotlin.jvm.internal.i.e(str4, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return str4;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    private static final b<String, String> mT(String str) {
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return StringsKt__IndentKt$getIndentFunction$1.fBU;
        }
        return new StringsKt__IndentKt$getIndentFunction$2(str);
    }
}
