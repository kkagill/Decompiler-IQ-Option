package com.iqoption.charttools.model.indicator;

import com.google.gson.JsonArray;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\n"}, bng = {"checkKeysAndValues", "", "keys", "", "", "values", "Lcom/google/gson/JsonArray;", "([Ljava/lang/String;Lcom/google/gson/JsonArray;)V", "jointFirstLettersOfWords", "sentence", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class y {
    private static final void a(String[] strArr, JsonArray jsonArray) {
        if (strArr.length != jsonArray.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys and values does not match: ");
            stringBuilder.append(strArr);
            stringBuilder.append(", ");
            stringBuilder.append(jsonArray);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static final String eO(String str) {
        CharSequence charSequence = str;
        char[] cArr = new char[1];
        int i = 0;
        cArr[0] = ' ';
        List b = v.b(charSequence, cArr, false, 0, 6, null);
        if (b.size() <= 1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i < b.size()) {
            int i2 = i + 1;
            Character ae = x.ae((CharSequence) b.get(i));
            if (ae != null) {
                stringBuilder.append(ae.charValue());
            }
            i = i2;
        }
        return stringBuilder.toString();
    }
}
