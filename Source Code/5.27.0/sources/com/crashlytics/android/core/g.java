package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;

/* compiled from: CompositeCreateReportSpiCall */
class g implements t {
    private final v pu;
    private final af pv;

    /* compiled from: CompositeCreateReportSpiCall */
    /* renamed from: com.crashlytics.android.core.g$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pw = new int[Type.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.crashlytics.android.core.Report.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            pw = r0;
            r0 = pw;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.crashlytics.android.core.Report.Type.JAVA;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = pw;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.crashlytics.android.core.Report.Type.NATIVE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.g$AnonymousClass1.<clinit>():void");
        }
    }

    public g(v vVar, af afVar) {
        this.pu = vVar;
        this.pv = afVar;
    }

    public boolean a(s sVar) {
        int i = AnonymousClass1.pw[sVar.qM.fL().ordinal()];
        if (i == 1) {
            this.pu.a(sVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.pv.a(sVar);
            return true;
        }
    }
}
