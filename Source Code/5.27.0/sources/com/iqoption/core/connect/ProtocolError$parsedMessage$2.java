package com.iqoption.core.connect;

import androidx.core.app.NotificationCompat;
import com.google.gson.stream.JsonReader;
import com.iqoption.core.ext.c;
import java.io.IOException;
import java.io.StringReader;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: Errors.kt */
final class ProtocolError$parsedMessage$2 extends Lambda implements a<String> {
    final /* synthetic */ i this$0;

    ProtocolError$parsedMessage$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        String str = "front.";
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(this.this$0.getMessage()));
            jsonReader.setLenient(true);
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (kotlin.jvm.internal.i.y(jsonReader.nextName(), NotificationCompat.CATEGORY_MESSAGE)) {
                    String nextName;
                    String str2;
                    jsonReader.beginObject();
                    String str3 = (String) null;
                    String str4 = (String) null;
                    while (jsonReader.hasNext()) {
                        nextName = jsonReader.nextName();
                        if (i.aZZ.contains(nextName)) {
                            str4 = jsonReader.nextString();
                        } else if (u.v(nextName, "token", true)) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    nextName = (String) null;
                    if (str3 == null) {
                        str2 = nextName;
                    } else if (u.a(str3, str, false, 2, null)) {
                        str2 = c.fT(str3);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(str3);
                        str2 = c.fT(stringBuilder.toString());
                    }
                    if (str2 == null) {
                        str2 = str4;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
        } catch (IOException unused) {
        }
        return "";
    }
}
