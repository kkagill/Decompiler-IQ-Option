package com.iqoption.chat.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.iqoption.chat.e.g;
import io.reactivex.b.f;
import java.io.Closeable;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.i;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/service/SendFileMessageService;", "Landroid/app/IntentService;", "()V", "createRequestBody", "Lokhttp3/RequestBody;", "inputStream", "Ljava/io/InputStream;", "getFileName", "", "uri", "Landroid/net/Uri;", "onCreate", "", "onDestroy", "onHandleIntent", "intent", "Landroid/content/Intent;", "uploadFile", "Companion", "chat_release"})
/* compiled from: SendFileMessageService.kt */
public final class SendFileMessageService extends IntentService {
    private static final String TAG = SendFileMessageService.class.getSimpleName();
    private static final SimpleDateFormat aWk = new SimpleDateFormat("'file_'MMddyyyy'_'HHmmss", Locale.US);
    public static final b aWl = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/chat/service/SendFileMessageService$Companion;", "", "()V", "EXTRA_ROOM_ID", "", "EXTRA_URIS", "FILE_NAME_FORMATTER", "Ljava/text/SimpleDateFormat;", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "UPLOAD_PATH", "sendFiles", "", "context", "Landroid/content/Context;", "roomId", "uris", "", "Landroid/net/Uri;", "chat_release"})
    /* compiled from: SendFileMessageService.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final void a(Context context, String str, List<? extends Uri> list) {
            kotlin.jvm.internal.i.f(context, "context");
            kotlin.jvm.internal.i.f(str, "roomId");
            kotlin.jvm.internal.i.f(list, "uris");
            Intent intent = new Intent(context, SendFileMessageService.class);
            intent.putExtra("extra.roomId", str);
            intent.putExtra("extra.uris", new ArrayList(list));
            ContextCompat.startForegroundService(context, intent);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/ext/GsonExt$fromGson$$inlined$typeOf$2"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<JsonObject> {
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, bng = {"com/iqoption/chat/service/SendFileMessageService$createRequestBody$1", "Lokhttp3/RequestBody;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "chat_release"})
    /* compiled from: SendFileMessageService.kt */
    public static final class c extends RequestBody {
        final /* synthetic */ InputStream aWm;

        public MediaType contentType() {
            return null;
        }

        c(InputStream inputStream) {
            this.aWm = inputStream;
        }

        public long contentLength() {
            return (long) this.aWm.available();
        }

        public void writeTo(BufferedSink bufferedSink) {
            kotlin.jvm.internal.i.f(bufferedSink, "sink");
            Source source = (Source) null;
            try {
                source = Okio.source(this.aWm);
                if (source == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                bufferedSink.writeAll(source);
            } catch (Exception unused) {
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
            }
            Util.closeQuietly((Closeable) source);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SendFileMessageService.kt */
    static final class d<T> implements f<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.e>> {
        public static final d aWn = new d();

        d() {
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.e> cVar) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SendFileMessageService.kt */
    static final class e<T> implements f<Throwable> {
        public static final e aWo = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public SendFileMessageService() {
        super("SendFileMessageService");
    }

    /* Access modifiers changed, original: protected */
    public void onHandleIntent(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        ArrayList<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra.uris");
        String stringExtra = intent.getStringExtra("extra.roomId");
        if (parcelableArrayListExtra != null && (parcelableArrayListExtra.isEmpty() ^ 1) != 0) {
            Collection arrayList = new ArrayList();
            for (Uri uri : parcelableArrayListExtra) {
                kotlin.jvm.internal.i.e(uri, "it");
                String j = j(uri);
                if (j != null) {
                    arrayList.add(j);
                }
            }
            List list = (List) arrayList;
            if ((list.isEmpty() ^ 1) != 0) {
                com.iqoption.core.microservices.chat.a aVar = com.iqoption.core.microservices.chat.a.bpz;
                kotlin.jvm.internal.i.e(stringExtra, "roomId");
                com.iqoption.core.microservices.chat.a.a(aVar, stringExtra, null, null, list, null, 22, null).h(com.iqoption.core.rx.i.aki()).a((f) d.aWn, (f) e.aWo);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b2 A:{Catch:{ Exception -> 0x00d4 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00d4 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r10 = kotlin.l.eVB;
     */
    private final java.lang.String j(android.net.Uri r10) {
        /*
        r9 = this;
        r0 = r9.getContentResolver();
        r0 = r0.openInputStream(r10);
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r1;
        r2 = (java.lang.Throwable) r2;
        r3 = r0;
        r3 = (java.io.InputStream) r3;	 Catch:{ Throwable -> 0x00dc }
        r4 = new okhttp3.Request$Builder;	 Catch:{ Exception -> 0x00d4 }
        r4.<init>();	 Catch:{ Exception -> 0x00d4 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d4 }
        r5.<init>();	 Catch:{ Exception -> 0x00d4 }
        r6 = com.iqoption.core.d.EE();	 Catch:{ Exception -> 0x00d4 }
        r6 = r6.Vg();	 Catch:{ Exception -> 0x00d4 }
        r5.append(r6);	 Catch:{ Exception -> 0x00d4 }
        r6 = "api/v1/file";
        r5.append(r6);	 Catch:{ Exception -> 0x00d4 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x00d4 }
        r4 = r4.url(r5);	 Catch:{ Exception -> 0x00d4 }
        r5 = new okhttp3.MultipartBody$Builder;	 Catch:{ Exception -> 0x00d4 }
        r5.<init>();	 Catch:{ Exception -> 0x00d4 }
        r6 = okhttp3.MultipartBody.FORM;	 Catch:{ Exception -> 0x00d4 }
        r5 = r5.setType(r6);	 Catch:{ Exception -> 0x00d4 }
        r6 = "user_id";
        r7 = com.iqoption.core.d.EA();	 Catch:{ Exception -> 0x00d4 }
        r7 = r7.getUserId();	 Catch:{ Exception -> 0x00d4 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ Exception -> 0x00d4 }
        r5 = r5.addFormDataPart(r6, r7);	 Catch:{ Exception -> 0x00d4 }
        r6 = "file";
        r10 = r9.k(r10);	 Catch:{ Exception -> 0x00d4 }
        r7 = "stream";
        kotlin.jvm.internal.i.e(r3, r7);	 Catch:{ Exception -> 0x00d4 }
        r3 = r9.f(r3);	 Catch:{ Exception -> 0x00d4 }
        r10 = r5.addFormDataPart(r6, r10, r3);	 Catch:{ Exception -> 0x00d4 }
        r10 = r10.build();	 Catch:{ Exception -> 0x00d4 }
        r10 = (okhttp3.RequestBody) r10;	 Catch:{ Exception -> 0x00d4 }
        r10 = r4.post(r10);	 Catch:{ Exception -> 0x00d4 }
        r10 = r10.build();	 Catch:{ Exception -> 0x00d4 }
        r3 = com.iqoption.core.connect.http.c.UK();	 Catch:{ Exception -> 0x00d4 }
        r10 = r3.newCall(r10);	 Catch:{ Exception -> 0x00d4 }
        r10 = r10.execute();	 Catch:{ Exception -> 0x00d4 }
        r3 = r10.code();	 Catch:{ Exception -> 0x00d4 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 != r4) goto L_0x00d6;
    L_0x0086:
        r10 = r10.body();	 Catch:{ Exception -> 0x00d4 }
        if (r10 == 0) goto L_0x00af;
    L_0x008c:
        r10 = r10.string();	 Catch:{ Exception -> 0x00d4 }
        if (r10 == 0) goto L_0x00af;
    L_0x0092:
        r3 = com.iqoption.core.d.Um();	 Catch:{ Exception -> 0x00d4 }
        r3 = r3.Ez();	 Catch:{ Exception -> 0x00d4 }
        r4 = new com.iqoption.chat.service.SendFileMessageService$a;	 Catch:{ Exception -> 0x00d4 }
        r4.<init>();	 Catch:{ Exception -> 0x00d4 }
        r4 = r4.getType();	 Catch:{ Exception -> 0x00d4 }
        r5 = "object : TypeToken<T>() {}.type";
        kotlin.jvm.internal.i.e(r4, r5);	 Catch:{ Exception -> 0x00d4 }
        r10 = r3.fromJson(r10, r4);	 Catch:{ Exception -> 0x00d4 }
        r10 = (com.google.gson.JsonObject) r10;	 Catch:{ Exception -> 0x00d4 }
        goto L_0x00b0;
    L_0x00af:
        r10 = r1;
    L_0x00b0:
        if (r10 == 0) goto L_0x00d6;
    L_0x00b2:
        r3 = "result";
        r10 = r10.get(r3);	 Catch:{ Exception -> 0x00d4 }
        r3 = "json[\"result\"]";
        kotlin.jvm.internal.i.e(r10, r3);	 Catch:{ Exception -> 0x00d4 }
        r10 = r10.getAsJsonObject();	 Catch:{ Exception -> 0x00d4 }
        r3 = "id";
        r10 = r10.get(r3);	 Catch:{ Exception -> 0x00d4 }
        r3 = "json[\"result\"]\n         …      .asJsonObject[\"id\"]";
        kotlin.jvm.internal.i.e(r10, r3);	 Catch:{ Exception -> 0x00d4 }
        r10 = r10.getAsString();	 Catch:{ Exception -> 0x00d4 }
        kotlin.d.b.a(r0, r2);	 Catch:{  }
        return r10;
    L_0x00d4:
        r10 = kotlin.l.eVB;	 Catch:{ Throwable -> 0x00dc }
    L_0x00d6:
        kotlin.d.b.a(r0, r2);
        return r1;
    L_0x00da:
        r10 = move-exception;
        goto L_0x00df;
    L_0x00dc:
        r10 = move-exception;
        r2 = r10;
        throw r2;	 Catch:{ all -> 0x00da }
    L_0x00df:
        kotlin.d.b.a(r0, r2);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.service.SendFileMessageService.j(android.net.Uri):java.lang.String");
    }

    private final String k(Uri uri) {
        String string;
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != 3143036) {
                if (hashCode == 951530617 && scheme.equals("content")) {
                    Cursor query = getContentResolver().query(uri, null, null, null, null);
                    if (query != null) {
                        if (query.moveToFirst()) {
                            string = query.getString(query.getColumnIndex("_display_name"));
                            kotlin.jvm.internal.i.e(string, "cursor.getString(cursor.…bleColumns.DISPLAY_NAME))");
                            return string;
                        }
                        query.close();
                    }
                    return "unknown";
                }
            } else if (scheme.equals("file")) {
                string = uri.getLastPathSegment();
                kotlin.jvm.internal.i.e(string, "uri.lastPathSegment");
                return string;
            }
        }
        string = aWk.format(Long.valueOf(System.currentTimeMillis()));
        kotlin.jvm.internal.i.e(string, "FILE_NAME_FORMATTER.form…stem.currentTimeMillis())");
        return string;
    }

    private final RequestBody f(InputStream inputStream) {
        return new c(inputStream);
    }

    public void onCreate() {
        super.onCreate();
        startForeground(g.notification_send_file_message_service, com.iqoption.chat.d.a(com.iqoption.chat.d.aOh, 0, null, null, null, 15, null));
    }

    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }
}
