package com.google.firebase.c;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final class a extends e {
    private final String aeJ;
    private final String version;

    a(String str, String str2) {
        if (str != null) {
            this.aeJ = str;
            if (str2 != null) {
                this.version = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String xa() {
        return this.aeJ;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LibraryVersion{libraryName=");
        stringBuilder.append(this.aeJ);
        stringBuilder.append(", version=");
        stringBuilder.append(this.version);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!(this.aeJ.equals(eVar.xa()) && this.version.equals(eVar.getVersion()))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.aeJ.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }
}
