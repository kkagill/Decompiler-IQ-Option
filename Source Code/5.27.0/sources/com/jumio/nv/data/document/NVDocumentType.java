package com.jumio.nv.data.document;

import android.content.Context;
import com.jumio.nv.R;

public enum NVDocumentType {
    PASSPORT,
    VISA,
    DRIVER_LICENSE,
    IDENTITY_CARD;

    /* renamed from: com.jumio.nv.data.document.NVDocumentType$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.jumio.nv.data.document.NVDocumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.jumio.nv.data.document.NVDocumentType.PASSPORT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.jumio.nv.data.document.NVDocumentType.VISA;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.jumio.nv.data.document.NVDocumentType.DRIVER_LICENSE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.data.document.NVDocumentType$AnonymousClass1.<clinit>():void");
        }
    }

    public static NVDocumentType fromString(String str) {
        if (str.equals("DRIVING_LICENSE") || str.equals("DRIVER_LICENSE")) {
            return DRIVER_LICENSE;
        }
        if (str.equals("ID_CARD")) {
            return IDENTITY_CARD;
        }
        if (str.equals("PASSPORT")) {
            return PASSPORT;
        }
        if (str.equals("VISA")) {
            return VISA;
        }
        return null;
    }

    public String toString() {
        int i = AnonymousClass1.a[ordinal()];
        if (i == 1) {
            return "PASSPORT";
        }
        if (i == 2) {
            return "VISA";
        }
        if (i != 3) {
            return i != 4 ? "" : "ID_CARD";
        } else {
            return "DRIVING_LICENSE";
        }
    }

    public String getLocalizedName(Context context) {
        int i = AnonymousClass1.a[ordinal()];
        i = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : R.string.netverify_documenttype_idcard : R.string.netverify_documenttype_driverlicense : R.string.netverify_documenttype_visa : R.string.netverify_documenttype_passport;
        return i != 0 ? context.getString(i) : "";
    }
}
