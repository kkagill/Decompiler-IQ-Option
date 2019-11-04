package com.iqoption.service.websocket;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.gson.stream.JsonReader;
import com.iqoption.core.connect.l;
import com.iqoption.core.ext.c;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class IQBusException extends RuntimeException implements l {
    private static Set<String> dSv = new HashSet(Arrays.asList(new String[]{"error", "message", "error_message", "errorMessage"}));
    private String parsedMessage;
    public final String socketMessage;
    public final int status;

    public int getCode() {
        return 0;
    }

    public IQBusException(int i, String str) {
        super(String.format(Locale.US, "IQBus error, status = %d, msg = %s", new Object[]{Integer.valueOf(i), str}));
        this.status = i;
        this.socketMessage = str;
    }

    @NonNull
    public String getMessage() {
        String str = "front.";
        String str2 = this.socketMessage;
        if (str2 != null) {
            String str3 = this.parsedMessage;
            if (str3 != null) {
                return str3;
            }
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str2));
                jsonReader.setLenient(true);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals(NotificationCompat.CATEGORY_MESSAGE)) {
                        jsonReader.beginObject();
                        str2 = null;
                        String str4 = null;
                        String str5 = str4;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (dSv.contains(nextName)) {
                                str5 = jsonReader.nextString();
                            } else if (nextName.equalsIgnoreCase("token")) {
                                str4 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (str4 != null) {
                            if (str4.startsWith(str)) {
                                str2 = c.fT(str4);
                            } else {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str);
                                stringBuilder.append(str4);
                                str2 = c.fT(stringBuilder.toString());
                            }
                        }
                        if (str2 == null) {
                            str2 = str5;
                        }
                        if (str2 != null) {
                            this.parsedMessage = str2;
                            return str2;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
            } catch (IOException unused) {
            }
        }
        return "";
    }
}
