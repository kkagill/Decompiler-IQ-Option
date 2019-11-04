package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class SessionEvent {
    public final ab oR;
    public final Type oS;
    public final Map<String, String> oT;
    public final String oU;
    public final Map<String, Object> oV;
    public final String oW;
    public final Map<String, Object> oX;
    private String oY;
    public final long timestamp;

    enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    static class a {
        final Type oS;
        Map<String, String> oT = null;
        String oU = null;
        Map<String, Object> oV = null;
        String oW = null;
        Map<String, Object> oX = null;
        final long timestamp = System.currentTimeMillis();

        public a(Type type) {
            this.oS = type;
        }

        public a j(Map<String, String> map) {
            this.oT = map;
            return this;
        }

        public a k(Map<String, Object> map) {
            this.oV = map;
            return this;
        }

        public SessionEvent a(ab abVar) {
            return new SessionEvent(abVar, this.timestamp, this.oS, this.oT, this.oU, this.oV, this.oW, this.oX);
        }
    }

    public static a a(Type type, Activity activity) {
        return new a(type).j(Collections.singletonMap("activity", activity.getClass().getName()));
    }

    public static a g(long j) {
        return new a(Type.INSTALL).j(Collections.singletonMap("installedAt", String.valueOf(j)));
    }

    public static a am(String str) {
        return new a(Type.CRASH).j(Collections.singletonMap("sessionId", str));
    }

    public static a o(String str, String str2) {
        return am(str).k(Collections.singletonMap("exceptionName", str2));
    }

    private SessionEvent(ab abVar, long j, Type type, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.oR = abVar;
        this.timestamp = j;
        this.oS = type;
        this.oT = map;
        this.oU = str;
        this.oV = map2;
        this.oW = str2;
        this.oX = map3;
    }

    public String toString() {
        if (this.oY == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append("timestamp=");
            stringBuilder.append(this.timestamp);
            stringBuilder.append(", type=");
            stringBuilder.append(this.oS);
            stringBuilder.append(", details=");
            stringBuilder.append(this.oT);
            stringBuilder.append(", customType=");
            stringBuilder.append(this.oU);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.oV);
            stringBuilder.append(", predefinedType=");
            stringBuilder.append(this.oW);
            stringBuilder.append(", predefinedAttributes=");
            stringBuilder.append(this.oX);
            stringBuilder.append(", metadata=[");
            stringBuilder.append(this.oR);
            stringBuilder.append("]]");
            this.oY = stringBuilder.toString();
        }
        return this.oY;
    }
}
