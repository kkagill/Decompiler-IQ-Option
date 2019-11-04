package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

public class a {
    private static final Pattern aeo = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private static a aep;
    private final FirebaseInstanceId adC;

    public static synchronized a wS() {
        a aVar;
        synchronized (a.class) {
            if (aep == null) {
                aep = new a(FirebaseInstanceId.getInstance());
            }
            aVar = aep;
        }
        return aVar;
    }

    private a(FirebaseInstanceId firebaseInstanceId) {
        this.adC = firebaseInstanceId;
    }

    public Task<Void> ci(String str) {
        CharSequence str2;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
            str2 = str2.substring(8);
        }
        if (str2 == null || !aeo.matcher(str2).matches()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 78);
            stringBuilder.append("Invalid topic name: ");
            stringBuilder.append(str2);
            stringBuilder.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.adC;
        String str3 = "S!";
        str2 = String.valueOf(str2);
        return firebaseInstanceId.zza(str2.length() != 0 ? str3.concat(str2) : new String(str3));
    }
}
