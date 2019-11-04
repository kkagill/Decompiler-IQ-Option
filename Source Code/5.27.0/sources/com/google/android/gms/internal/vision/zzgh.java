package com.google.android.gms.internal.vision;

public enum zzgh {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeo.class, zzeo.class, zzeo.zzrx),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzyb;
    private final Class<?> zzyc;
    private final Object zzyd;

    private zzgh(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzyb = cls;
        this.zzyc = cls2;
        this.zzyd = obj;
    }

    public final Class<?> zzfq() {
        return this.zzyc;
    }
}
