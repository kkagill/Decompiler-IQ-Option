package com.microblink.secured;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.microblink.settings.NativeLibraryInfo;
import com.microblink.view.recognition.RecognitionType;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: line */
public final class al {
    a eyJ;
    private Handler mHandler;

    /* compiled from: line */
    class a {
        public AtomicBoolean eyP;
        public AtomicBoolean eyQ;

        /* synthetic */ a(al alVar, byte b) {
            this();
        }

        private a() {
            this.eyP = new AtomicBoolean(false);
            this.eyQ = new AtomicBoolean(false);
        }

        public final void reset() {
            this.eyP.set(false);
            this.eyQ.set(false);
        }
    }

    /* compiled from: line */
    public static class b {
        public static final al eyR = new al();
    }

    /* synthetic */ al(byte b) {
        this();
    }

    private al() {
        this.eyJ = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.eyJ = new a(this, (byte) 0);
    }

    public final void a(final Context context, l lVar) {
        String str = "com.microblink.ping.preferences.userId";
        if (!this.eyJ.eyP.getAndSet(true)) {
            try {
                int i = lVar.ewn == 0 ? 2 : lVar.ewn;
                final c cVar = new c(context);
                long currentTimeMillis = System.currentTimeMillis();
                long j = 0;
                if (cVar.evM != null) {
                    j = cVar.evM.getLong("com.microblink.ping.preferences.lastPing", 0);
                }
                if (currentTimeMillis - j < Long.valueOf((long) i).longValue() * 86400000) {
                    this.eyJ.reset();
                } else if (!this.eyJ.eyQ.getAndSet(true)) {
                    String string;
                    String packageName;
                    com.microblink.secured.z.a aVar = new com.microblink.secured.z.a();
                    aVar.ewm = lVar.ewm;
                    aVar.exT = NativeLibraryInfo.beJ();
                    String str2 = null;
                    if (cVar.evM != null) {
                        string = cVar.evM.getString(str, null);
                        if (string == null) {
                            string = UUID.randomUUID().toString();
                            cVar.evM.edit().putString(str, string).commit();
                        }
                        str2 = string;
                    }
                    aVar.exQ = str2;
                    aVar.exU = Long.valueOf(cVar.beb());
                    aVar.mPackageName = context.getPackageName();
                    if (lVar.euj == null) {
                        packageName = context.getPackageName();
                    } else {
                        packageName = lVar.euj;
                    }
                    aVar.euj = packageName;
                    aVar.exS = false;
                    final z zVar = new z();
                    zVar.mPackageName = aVar.mPackageName;
                    zVar.ewm = aVar.ewm;
                    zVar.euj = aVar.euj;
                    zVar.exQ = aVar.exQ;
                    if (aVar.exU != null) {
                        zVar.exR = aVar.exU.longValue();
                    }
                    if (aVar.exT != null) {
                        zVar.evP = aVar.exT.evP;
                        zVar.exN = aVar.exT.evO.name();
                    }
                    zVar.exP = VERSION.RELEASE;
                    str = Build.MANUFACTURER;
                    if (str != null) {
                        str = str.toUpperCase();
                    }
                    string = Build.MODEL;
                    if (string != null) {
                        string = string.toUpperCase();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(com.microblink.secured.z.a.kr(str));
                    stringBuilder.append(" - ");
                    stringBuilder.append(com.microblink.secured.z.a.kr(string));
                    zVar.exc = stringBuilder.toString();
                    zVar.exS = aVar.exS;
                    AnonymousClass1 anonymousClass1 = new Runnable() {
                        public final void run() {
                            new g(new com.microblink.secured.g.b() {
                                public final void a(d dVar) {
                                    if (!(dVar == null || context == null || dVar.evN != 201)) {
                                        c cVar = cVar;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (cVar.evM != null) {
                                            cVar.evM.edit().putLong("com.microblink.ping.preferences.lastPing", currentTimeMillis).commit();
                                        }
                                        cVar.cE(0);
                                    }
                                    al.this.eyJ.reset();
                                }

                                public final void bec() {
                                    al.this.eyJ.reset();
                                }
                            }).execute(new z[]{zVar});
                        }
                    };
                    if (context instanceof Activity) {
                        ((Activity) context).runOnUiThread(anonymousClass1);
                    } else if (Looper.myLooper().equals(Looper.getMainLooper())) {
                        anonymousClass1.run();
                    } else {
                        this.mHandler.post(anonymousClass1);
                    }
                }
            } catch (Exception unused) {
                this.eyJ.reset();
            }
        }
    }

    public final void a(RecognitionType recognitionType, Context context) {
        if (!this.eyJ.eyQ.get() && recognitionType == RecognitionType.SUCCESSFUL) {
            c cVar = new c(context);
            long beb = cVar.beb();
            if (beb < Long.MAX_VALUE) {
                cVar.cE(beb + 1);
            }
        }
    }
}
