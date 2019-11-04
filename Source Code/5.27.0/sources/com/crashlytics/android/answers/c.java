package com.crashlytics.android.answers;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: AnswersAttributes */
class c {
    final Map<String, Object> nN;

    public String toString() {
        return new JSONObject(this.nN).toString();
    }
}
