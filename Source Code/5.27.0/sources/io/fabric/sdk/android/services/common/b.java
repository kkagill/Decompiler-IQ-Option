package io.fabric.sdk.android.services.common;

/* compiled from: AdvertisingInfo */
class b {
    public final String eMM;
    public final boolean eMN;

    b(String str, boolean z) {
        this.eMM = str;
        this.eMN = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.eMN != bVar.eMN) {
            return false;
        }
        String str = this.eMM;
        return str == null ? bVar.eMM == null : str.equals(bVar.eMM);
    }

    public int hashCode() {
        String str = this.eMM;
        return ((str != null ? str.hashCode() : 0) * 31) + this.eMN;
    }
}
