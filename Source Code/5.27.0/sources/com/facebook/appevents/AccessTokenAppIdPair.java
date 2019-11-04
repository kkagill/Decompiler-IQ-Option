package com.facebook.appevents;

import com.facebook.a;
import com.facebook.f;
import com.facebook.internal.z;
import java.io.Serializable;

class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        private SerializationProxyV1(String str, String str2) {
            this.accessTokenString = str;
            this.appId = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(a aVar) {
        this(aVar.getToken(), f.go());
    }

    public AccessTokenAppIdPair(String str, String str2) {
        if (z.aB(str)) {
            str = null;
        }
        this.accessTokenString = str;
        this.applicationId = str2;
    }

    public String ia() {
        return this.accessTokenString;
    }

    public String go() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.applicationId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (z.c(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && z.c(accessTokenAppIdPair.applicationId, this.applicationId)) {
            z = true;
        }
        return z;
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }
}
