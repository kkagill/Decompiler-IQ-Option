package com.iqoption.core.f;

import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/resources/ResourceFileManager;", "", "()V", "RESOURCE_DIR", "", "baseResourceFileDir", "Ljava/io/File;", "processingResources", "", "fetchFileResource", "", "resId", "url", "force", "", "getResFile", "getResourceFile", "getResourceFilePath", "tryFetchResource", "file", "FetchFileTask", "core_release"})
/* compiled from: ResourceFileManager.kt */
public final class a {
    public static final a bEA = new a();
    private static final File bEy = new File(d.Uo().getFilesDir(), "resource_files");
    private static final Set<String> bEz = new LinkedHashSet();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, bng = {"Lcom/iqoption/core/resources/ResourceFileManager$FetchFileTask;", "Ljava/lang/Runnable;", "resId", "", "completeResultFile", "Ljava/io/File;", "fetchUrl", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V", "getResId", "()Ljava/lang/String;", "run", "", "core_release"})
    /* compiled from: ResourceFileManager.kt */
    public static final class a implements Runnable {
        private final String bEB;
        private final File bEC;
        private final String bED;

        public a(String str, File file, String str2) {
            kotlin.jvm.internal.i.f(str, "resId");
            kotlin.jvm.internal.i.f(file, "completeResultFile");
            kotlin.jvm.internal.i.f(str2, "fetchUrl");
            this.bEB = str;
            this.bEC = file;
            this.bED = str2;
        }

        public void run() {
            BufferedSource bufferedSource = null;
            Response response = (Response) null;
            BufferedSink bufferedSink = (BufferedSink) null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bEC.getAbsolutePath());
            stringBuilder.append(".tmp");
            String stringBuilder2 = stringBuilder.toString();
            File file = new File(stringBuilder2);
            Set a;
            try {
                response = c.UJ().newCall(new Builder().url(this.bED).build()).execute();
                ResponseBody body = response.body();
                if (body != null) {
                    bufferedSource = body.source();
                }
                if (bufferedSource != null) {
                    bufferedSink = Okio.buffer(Okio.sink(file));
                    if (bufferedSink == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    bufferedSink.writeAll(bufferedSource);
                    file.renameTo(this.bEC);
                }
                if (response != null) {
                    response.close();
                }
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                new File(stringBuilder2).delete();
                a = a.bEz;
                synchronized (a) {
                    a.bEz.remove(this.bEB);
                    return;
                }
            } catch (IOException unused) {
                if (response != null) {
                    response.close();
                }
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                new File(stringBuilder2).delete();
                a = a.bEz;
                synchronized (a) {
                    a.bEz.remove(this.bEB);
                }
            } catch (Throwable th) {
                if (response != null) {
                    response.close();
                }
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                new File(stringBuilder2).delete();
                synchronized (a.bEz) {
                    a.bEz.remove(this.bEB);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ResourceFileManager.kt */
    static final class b implements Runnable {
        final /* synthetic */ String bEE;
        final /* synthetic */ File bEF;
        final /* synthetic */ String bEG;

        b(String str, File file, String str2) {
            this.bEE = str;
            this.bEF = file;
            this.bEG = str2;
        }

        public final void run() {
            a aVar = new a(this.bEE, this.bEF, this.bEG);
        }
    }

    private a() {
    }

    public final void e(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "resId");
        kotlin.jvm.internal.i.f(str2, "url");
        File gY = gY(str);
        if (!gY.exists() || z) {
            synchronized (bEz) {
                if (bEz.contains(str)) {
                    return;
                }
                bEz.add(str);
                com.iqoption.core.rx.i.aki().m(new b(str, gY, str2));
            }
        }
    }

    private final File gY(String str) {
        if (!bEy.exists()) {
            bEy.mkdirs();
        }
        return new File(bEy, str);
    }
}
