package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class az {
    private final KeyPair aem;
    private final long aen;

    @VisibleForTesting
    az(KeyPair keyPair, long j) {
        this.aem = keyPair;
        this.aen = j;
    }

    /* Access modifiers changed, original: final */
    public final KeyPair getKeyPair() {
        return this.aem;
    }

    /* Access modifiers changed, original: final */
    public final long getCreationTime() {
        return this.aen;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        if (this.aen == azVar.aen && this.aem.getPublic().equals(azVar.aem.getPublic()) && this.aem.getPrivate().equals(azVar.aem.getPrivate())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.aem.getPublic(), this.aem.getPrivate(), Long.valueOf(this.aen));
    }

    private final String zzv() {
        return Base64.encodeToString(this.aem.getPublic().getEncoded(), 11);
    }

    private final String wR() {
        return Base64.encodeToString(this.aem.getPrivate().getEncoded(), 11);
    }
}
