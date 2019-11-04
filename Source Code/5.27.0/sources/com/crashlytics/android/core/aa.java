package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

/* compiled from: LogFileManager */
class aa {
    private static final b ru = new b();
    private final Context context;
    private final a rv;
    private y rw;

    /* compiled from: LogFileManager */
    public interface a {
        File fb();
    }

    /* compiled from: LogFileManager */
    private static final class b implements y {
        public void b(long j, String str) {
        }

        public d fE() {
            return null;
        }

        public byte[] fF() {
            return null;
        }

        public void fG() {
        }

        public void fH() {
        }

        private b() {
        }
    }

    aa(Context context, a aVar) {
        this(context, aVar, null);
    }

    aa(Context context, a aVar, String str) {
        this.context = context;
        this.rv = aVar;
        this.rw = ru;
        aC(str);
    }

    /* Access modifiers changed, original: final */
    public final void aC(String str) {
        this.rw.fG();
        this.rw = ru;
        if (str != null) {
            if (CommonUtils.a(this.context, "com.crashlytics.CollectCustomLogs", true)) {
                a(aD(str), 65536);
            } else {
                c.biX().d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(long j, String str) {
        this.rw.b(j, str);
    }

    /* Access modifiers changed, original: 0000 */
    public d fM() {
        return this.rw.fE();
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] fN() {
        return this.rw.fF();
    }

    /* Access modifiers changed, original: 0000 */
    public void fO() {
        this.rw.fH();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Set<String> set) {
        File[] listFiles = this.rv.fb().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(h(file))) {
                    file.delete();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(File file, int i) {
        this.rw = new am(file, i);
    }

    private File aD(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("crashlytics-userlog-");
        stringBuilder.append(str);
        stringBuilder.append(".temp");
        return new File(this.rv.fb(), stringBuilder.toString());
    }

    private String h(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }
}
