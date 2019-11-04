package com.google.android.gms.maps.internal;

public final class zza {
    public static byte zza(Boolean bool) {
        return bool != null ? bool.booleanValue() ? (byte) 1 : (byte) 0 : (byte) -1;
    }

    public static Boolean zza(byte b) {
        return b != (byte) 0 ? b != (byte) 1 ? null : Boolean.TRUE : Boolean.FALSE;
    }
}
