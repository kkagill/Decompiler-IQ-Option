package com.iqoption.core.splash;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.CountDownTimer;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iqoption.core.manager.r;
import com.iqoption.core.util.l;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 B2\u00020\u0001:\u0004ABCDB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\"\u0010&\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001aH\u0002J\u0006\u0010*\u001a\u00020%J\u000e\u0010+\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010(\u001a\u00020%2\u0006\u0010,\u001a\u00020\rJ \u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u0010\f\u001a\u00020\rH\u0002J \u00100\u001a\u00020%2\u0006\u0010\f\u001a\u0002012\u0006\u0010\u001f\u001a\u0002012\u0006\u0010(\u001a\u000201H\u0002J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0002J\u0010\u00104\u001a\u00020%2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00105\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020%2\u0006\u00105\u001a\u00020:H\u0002J\u0012\u0010;\u001a\u00020%2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u0010<\u001a\u00020%J\b\u0010=\u001a\u00020%H\u0002J\"\u0010=\u001a\u00020%2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u0016H\u0002J\u0006\u0010?\u001a\u00020%J\b\u0010@\u001a\u00020%H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, bng = {"Lcom/iqoption/core/splash/SplashLogHelper;", "", "textFront", "Landroid/widget/TextView;", "textLog", "noDurationText", "textTimer", "bottomLeftView", "Landroid/view/View;", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V", "composiDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "front", "", "isShowStateRequested", "", "isShown", "isStatisticSent", "noDurationList", "Ljava/util/ArrayList;", "Lcom/iqoption/core/splash/SplashLogHelper$ApiCallItem;", "reconnectCounter", "", "showSupportLogRunnable", "Ljava/lang/Runnable;", "startTime", "", "state", "Lcom/iqoption/core/splash/SplashLogHelper$LogState;", "getState", "()Lcom/iqoption/core/splash/SplashLogHelper$LogState;", "timer", "Landroid/os/CountDownTimer;", "updateNoDurationTextRunnable", "createLogFile", "Ljava/io/File;", "disposeEventsSubscription", "", "getLaunchStatEventParameters", "Lcom/google/gson/JsonObject;", "log", "duration", "hide", "initEnableLogListener", "msg", "logApiCall", "apiName", "logFront", "logToFile", "", "longLaunchException", "observerEvents", "onApiCallEventBusEventReceived", "event", "Lcom/iqoption/core/event/ApiCallEventBusEvent;", "onFrontEventReceived", "Lcom/iqoption/core/event/FrontEvent;", "onRetryFutureEventReceived", "Lcom/iqoption/core/event/RetryFutureEvent;", "restoreState", "saveState", "sendLaunchStat", "reconnectCount", "show", "updateNoDurationText", "ApiCallItem", "Companion", "LaunchException", "LogState", "core_release"})
/* compiled from: SplashLogHelper.kt */
public final class SplashLogHelper {
    private static final String TAG = SplashLogHelper.class.getName();
    private static c bGD;
    public static final b bGE = new b();
    private final TextView bGA;
    private final TextView bGB;
    private final TextView bGC;
    private final ArrayList<a> bGr = new ArrayList();
    private boolean bGs;
    private CountDownTimer bGt;
    private final int bGu;
    private boolean bGv;
    private final Runnable bGw = new j(this);
    private final Runnable bGx = new i(this);
    private boolean bGy;
    private final io.reactivex.disposables.a bGz = new io.reactivex.disposables.a();
    private final TextView bfA;
    private String bgB;
    private long startTime;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/splash/SplashLogHelper$LaunchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class LaunchException extends Exception {
        public LaunchException(String str) {
            kotlin.jvm.internal.i.f(str, "message");
            super(str);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/splash/SplashLogHelper$ApiCallItem;", "", "apiName", "", "msg", "(Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "obj", "hashCode", "", "toString", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class a {
        private final String ahc;
        private final String bgx;

        public a(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "apiName");
            kotlin.jvm.internal.i.f(str2, NotificationCompat.CATEGORY_MESSAGE);
            this.bgx = str;
            this.ahc = str2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.i.y(this.bgx, ((a) obj).bgx);
            }
            return super.equals(obj);
        }

        public int hashCode() {
            return this.bgx.hashCode();
        }

        public String toString() {
            return this.ahc;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/splash/SplashLogHelper$Companion;", "", "()V", "APPSFLYER_INITIALIZATION", "", "APPSFLYER_LINK", "LAUNCH_STAT_EVENT", "LOG_FILE_NAME", "SHOW_SUPPORT_LOG_DELAY_MILLIS", "", "TAG", "kotlin.jvm.PlatformType", "isLogEnabled", "", "()Z", "logState", "Lcom/iqoption/core/splash/SplashLogHelper$LogState;", "clearLog", "", "context", "Landroid/content/Context;", "deleteLogFile", "getLogFromFile", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final boolean akR() {
            return com.iqoption.core.d.Un().Dp() && com.iqoption.core.d.EH().ej("splash-log") && (com.iqoption.core.d.Un().Ds() || com.iqoption.core.data.d.a.bdi.Wj());
        }

        public final String be(Context context) {
            Throwable th;
            kotlin.jvm.internal.i.f(context, "context");
            context = context.getApplicationContext();
            kotlin.jvm.internal.i.e(context, "context.applicationContext");
            File file = new File(context.getFilesDir(), "api_call.log");
            BufferedInputStream bufferedInputStream = (BufferedInputStream) null;
            try {
                byte[] bArr = new byte[((int) file.length())];
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    bufferedInputStream2.read(bArr, 0, bArr.length);
                    bufferedInputStream2.close();
                    String str = new String(bArr, kotlin.text.d.UTF_8);
                    l.b(bufferedInputStream2);
                    return str;
                } catch (Exception unused) {
                    bufferedInputStream = bufferedInputStream2;
                    l.b(bufferedInputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    l.b(bufferedInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                l.b(bufferedInputStream);
                return "";
            } catch (Throwable th3) {
                th = th3;
                l.b(bufferedInputStream);
                throw th;
            }
        }

        public final void bf(Context context) {
            kotlin.jvm.internal.i.f(context, "context");
            c akQ = SplashLogHelper.bGD;
            if (akQ != null) {
                akQ.clear();
            }
            bg(context);
        }

        private final void bg(Context context) {
            context = context.getApplicationContext();
            kotlin.jvm.internal.i.e(context, "context.applicationContext");
            File file = new File(context.getFilesDir(), "api_call.log");
            if (file.exists()) {
                file.delete();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, bng = {"Lcom/iqoption/core/splash/SplashLogHelper$LogState;", "Landroid/os/Parcelable;", "log", "", "noDuration", "front", "startTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getFront", "()Ljava/lang/String;", "setFront", "(Ljava/lang/String;)V", "getLog", "setLog", "getNoDuration", "setNoDuration", "getStartTime", "()J", "setStartTime", "(J)V", "clear", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class c implements Parcelable {
        public static final Creator CREATOR = new a();
        private String bGF;
        private String bgB;
        private String biU;
        private long startTime;

        @kotlin.i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        public c() {
            this(null, null, null, 0, 15, null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (kotlin.jvm.internal.i.y(this.biU, cVar.biU) && kotlin.jvm.internal.i.y(this.bGF, cVar.bGF) && kotlin.jvm.internal.i.y(this.bgB, cVar.bgB)) {
                        if ((this.startTime == cVar.startTime ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.biU;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.bGF;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.bgB;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.startTime;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LogState(log=");
            stringBuilder.append(this.biU);
            stringBuilder.append(", noDuration=");
            stringBuilder.append(this.bGF);
            stringBuilder.append(", front=");
            stringBuilder.append(this.bgB);
            stringBuilder.append(", startTime=");
            stringBuilder.append(this.startTime);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            parcel.writeString(this.biU);
            parcel.writeString(this.bGF);
            parcel.writeString(this.bgB);
            parcel.writeLong(this.startTime);
        }

        public c(String str, String str2, String str3, long j) {
            this.biU = str;
            this.bGF = str2;
            this.bgB = str3;
            this.startTime = j;
        }

        public /* synthetic */ c(String str, String str2, String str3, long j, int i, f fVar) {
            if ((i & 1) != 0) {
                str = (String) null;
            }
            if ((i & 2) != 0) {
                str2 = (String) null;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = (String) null;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                j = 0;
            }
            this(str, str4, str5, j);
        }

        public final String Yg() {
            return this.biU;
        }

        public final void hc(String str) {
            this.biU = str;
        }

        public final String akS() {
            return this.bGF;
        }

        public final void hd(String str) {
            this.bGF = str;
        }

        public final String Xd() {
            return this.bgB;
        }

        public final void he(String str) {
            this.bgB = str;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setStartTime(long j) {
            this.startTime = j;
        }

        public final void clear() {
            String str = (String) null;
            this.biU = str;
            this.bGF = str;
            this.startTime = 0;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"com/iqoption/core/splash/SplashLogHelper$initEnableLogListener$1", "Landroid/view/View$OnClickListener;", "count", "", "startMillis", "", "onClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class d implements OnClickListener {
        private long bGG;
        final /* synthetic */ SplashLogHelper bGH;
        private int count;

        d(SplashLogHelper splashLogHelper) {
            this.bGH = splashLogHelper;
        }

        public void onClick(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.bGG;
            if (j == 0 || currentTimeMillis - j > ((long) 3000)) {
                this.bGG = currentTimeMillis;
                this.count = 1;
            } else {
                this.count++;
                int i = this.count;
            }
            if (this.count == 5) {
                this.count = 0;
                com.iqoption.core.data.d.a.bdi.ci(1 ^ com.iqoption.core.data.d.a.bdi.Wj());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Technical log ");
                stringBuilder.append(SplashLogHelper.bGE.akR() ? "enabled" : "disabled");
                com.iqoption.core.d.a(stringBuilder.toString(), 0, 2, null);
                if (SplashLogHelper.bGE.akR() && this.bGH.bGs) {
                    this.bGH.show();
                } else if (this.bGH.bGs) {
                    this.bGH.hide();
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SplashLogHelper.kt */
    static final class e implements Runnable {
        final /* synthetic */ SplashLogHelper bGH;
        final /* synthetic */ CharSequence bGI;
        final /* synthetic */ CharSequence bGJ;
        final /* synthetic */ CharSequence bGK;

        e(SplashLogHelper splashLogHelper, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.bGH = splashLogHelper;
            this.bGI = charSequence;
            this.bGJ = charSequence2;
            this.bGK = charSequence3;
        }

        public final void run() {
            BufferedWriter bufferedWriter;
            Throwable th;
            String str = "\n";
            BufferedWriter bufferedWriter2 = (BufferedWriter) null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(this.bGH.akN(), false));
                try {
                    bufferedWriter.append(this.bGI);
                    bufferedWriter.append("\t\t\t\t\t\t\t\t\t\t\t\t");
                    bufferedWriter.append(this.bGJ);
                    bufferedWriter.append(str);
                    bufferedWriter.append(this.bGK);
                    bufferedWriter.append(str);
                    Iterator it = this.bGH.bGr.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.append(((a) it.next()).toString());
                        bufferedWriter.append(str);
                    }
                    bufferedWriter.close();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    th = th2;
                    l.b(bufferedWriter);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedWriter = bufferedWriter2;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = bufferedWriter2;
                l.b(bufferedWriter);
                throw th;
            }
            l.b(bufferedWriter);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/core/splash/SplashLogHelper$show$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "core_release"})
    /* compiled from: SplashLogHelper.kt */
    public static final class h extends CountDownTimer {
        final /* synthetic */ SplashLogHelper bGH;

        public void onFinish() {
        }

        h(SplashLogHelper splashLogHelper, long j, long j2) {
            this.bGH = splashLogHelper;
            super(j, j2);
        }

        public void onTick(long j) {
            j = SystemClock.elapsedRealtime() - this.bGH.startTime;
            j -= TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
            TextView c = this.bGH.bGC;
            n nVar = n.eWf;
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
            Object[] objArr = new Object[]{Long.valueOf(r0), Long.valueOf(j)};
            String format = String.format(locale, "%d,%03dsec", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
            c.setText(format);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SplashLogHelper.kt */
    static final class i implements Runnable {
        final /* synthetic */ SplashLogHelper bGH;

        i(SplashLogHelper splashLogHelper) {
            this.bGH = splashLogHelper;
        }

        public final void run() {
            this.bGH.bGA.setVisibility(0);
            this.bGH.bfA.setVisibility(0);
            this.bGH.bGC.setVisibility(0);
            this.bGH.akM();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SplashLogHelper.kt */
    static final class j implements Runnable {
        final /* synthetic */ SplashLogHelper bGH;

        j(SplashLogHelper splashLogHelper) {
            this.bGH = splashLogHelper;
        }

        public final void run() {
            this.bGH.akK();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/core/event/IQEvent;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SplashLogHelper.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.core.b.d> {
        final /* synthetic */ SplashLogHelper bGH;

        f(SplashLogHelper splashLogHelper) {
            this.bGH = splashLogHelper;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.b.d dVar) {
            if (dVar instanceof com.iqoption.core.b.a) {
                this.bGH.a((com.iqoption.core.b.a) dVar);
            } else if (dVar instanceof com.iqoption.core.b.c) {
                this.bGH.a((com.iqoption.core.b.c) dVar);
            } else if (dVar instanceof com.iqoption.core.b.f) {
                this.bGH.a((com.iqoption.core.b.f) dVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SplashLogHelper.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g bGL = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public SplashLogHelper(TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        kotlin.jvm.internal.i.f(textView, "textFront");
        kotlin.jvm.internal.i.f(textView2, "textLog");
        kotlin.jvm.internal.i.f(textView3, "noDurationText");
        kotlin.jvm.internal.i.f(textView4, "textTimer");
        kotlin.jvm.internal.i.f(view, "bottomLeftView");
        this.bGA = textView;
        this.bGB = textView2;
        this.bfA = textView3;
        this.bGC = textView4;
        this.bGB.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.bfA.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (com.iqoption.core.d.Un().Dp()) {
            ap(view);
        }
        akO();
    }

    private final c akI() {
        c cVar = new c(null, null, null, 0, 15, null);
        cVar.hc(this.bGB.getText().toString());
        cVar.he(this.bGA.getText().toString());
        cVar.hd(this.bfA.getText().toString());
        cVar.setStartTime(this.startTime);
        return cVar;
    }

    private final void a(c cVar) {
        if (cVar != null) {
            this.bGB.setText(cVar.Yg());
            this.bfA.setText(cVar.akS());
            this.bGA.setText(cVar.Xd());
            this.startTime = cVar.getStartTime();
        }
    }

    public final void ap(View view) {
        kotlin.jvm.internal.i.f(view, "bottomLeftView");
        view.setOnClickListener(new d(this));
    }

    public final void show() {
        if (!this.bGy) {
            this.bGy = true;
            this.bGs = true;
            akO();
            a(bGD);
            com.iqoption.core.c.a.biN.removeCallbacks(this.bGx);
            com.iqoption.core.c.a.biN.postDelayed(this.bGx, (long) 60000);
            if (bGE.akR()) {
                this.startTime = SystemClock.elapsedRealtime();
                this.bGB.setVisibility(0);
                this.bGA.setVisibility(0);
                this.bGC.setVisibility(0);
                this.bfA.setVisibility(0);
                this.bGt = new h(this, (long) Integer.MAX_VALUE, 200);
                CountDownTimer countDownTimer = this.bGt;
                if (countDownTimer == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                countDownTimer.start();
            }
        }
    }

    public final void hide() {
        if (this.bGy) {
            this.bGy = false;
            this.bGs = false;
            akP();
            com.iqoption.core.c.a.biN.removeCallbacks(this.bGx);
            com.iqoption.core.c.a.biN.removeCallbacks(this.bGw);
            akL();
            if (bGE.akR()) {
                CountDownTimer countDownTimer = this.bGt;
                if (countDownTimer != null) {
                    if (countDownTimer == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    countDownTimer.cancel();
                }
                this.bGB.setVisibility(8);
                this.bGA.setVisibility(8);
                this.bGC.setVisibility(8);
                this.bfA.setVisibility(8);
                CharSequence text = this.bGA.getText();
                kotlin.jvm.internal.i.e(text, "textFront.text");
                CharSequence text2 = this.bGC.getText();
                kotlin.jvm.internal.i.e(text2, "textTimer.text");
                CharSequence text3 = this.bGB.getText();
                kotlin.jvm.internal.i.e(text3, "textLog.text");
                a(text, text2, text3);
                this.bGB.setText("");
                this.bGr.clear();
            }
        }
    }

    public final void akJ() {
        bGD = akI();
    }

    private final void c(String str, String str2, long j) {
        if (j == -1) {
            this.bGr.add(new a(str, str2));
            com.iqoption.core.c.a.biN.postDelayed(this.bGw, 3000);
            return;
        }
        if (this.bGr.remove(new a(str, str2))) {
            akK();
        }
        CharSequence text = this.bGB.getText();
        kotlin.jvm.internal.i.e(text, "textLog.text");
        if ((text.length() > 0 ? 1 : null) != null) {
            this.bGB.append("\n");
        }
        this.bGB.append(str2);
    }

    private final void akK() {
        com.iqoption.core.c.a.biN.removeCallbacks(this.bGw);
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.bGr.iterator();
        while (it.hasNext()) {
            stringBuilder.append(((a) it.next()).toString());
            stringBuilder.append("\n");
        }
        this.bfA.setText(stringBuilder.toString());
    }

    public final void ag(String str) {
        kotlin.jvm.internal.i.f(str, NotificationCompat.CATEGORY_MESSAGE);
        if (this.bGy) {
            CharSequence text = this.bGB.getText();
            kotlin.jvm.internal.i.e(text, "textLog.text");
            if ((text.length() > 0 ? 1 : null) != null) {
                this.bGB.append("\n");
            }
            this.bGB.append(str);
        }
    }

    private final void hb(String str) {
        this.bGA.setText(str);
    }

    private final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        com.iqoption.core.c.a.biL.execute(new e(this, charSequence, charSequence2, charSequence3));
    }

    private final void akL() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
        if (!this.bGv) {
            c(this.bgB, elapsedRealtime, this.bGu);
        }
        this.bGv = true;
    }

    private final void akM() {
        if (r.bjR.isConnected()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("More than 60000 ms on splash screen\n");
            stringBuilder.append(this.bGB.getText().toString());
            stringBuilder.append(10);
            com.iqoption.core.util.d.d(new LaunchException(stringBuilder.toString()));
        }
    }

    private final File akN() {
        Context context = this.bGB.getContext();
        kotlin.jvm.internal.i.e(context, "textLog.context");
        context = context.getApplicationContext();
        kotlin.jvm.internal.i.e(context, "textLog.context.applicationContext");
        File file = new File(context.getFilesDir(), "api_call.log");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    private final void akO() {
        akP();
        this.bGz.e(com.iqoption.core.d.Um().EI().c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(this), (io.reactivex.b.f) g.bGL));
    }

    private final void akP() {
        this.bGz.clear();
    }

    private final void a(com.iqoption.core.b.a aVar) {
        String str = aVar.bgx;
        String str2 = "event.apiName";
        kotlin.jvm.internal.i.e(str, str2);
        if (!v.b((CharSequence) str, (CharSequence) "api/appsflyer/link", false, 2, null)) {
            if (!com.iqoption.core.d.Un().Ds()) {
                str = aVar.bgx;
                kotlin.jvm.internal.i.e(str, str2);
                if (v.b((CharSequence) str, (CharSequence) "appsflyer-initialization", false, 2, null)) {
                    return;
                }
            }
            if (aVar.bgz == null || (aVar.bgz instanceof SocketTimeoutException)) {
                long j = -1;
                String str3 = "event.toString()";
                Long duration;
                if (VERSION.SDK_INT < 19 || !this.bGB.isAttachedToWindow()) {
                    str = aVar.bgx;
                    kotlin.jvm.internal.i.e(str, str2);
                    str2 = aVar.toString();
                    kotlin.jvm.internal.i.e(str2, str3);
                    duration = aVar.bgy.getDuration();
                    if (duration != null) {
                        j = duration.longValue();
                    }
                    c(str, str2, j);
                } else {
                    str = aVar.bgx;
                    kotlin.jvm.internal.i.e(str, str2);
                    str2 = aVar.toString();
                    kotlin.jvm.internal.i.e(str2, str3);
                    duration = aVar.bgy.getDuration();
                    if (duration != null) {
                        j = duration.longValue();
                    }
                    c(str, str2, j);
                }
            }
        }
    }

    private final void a(com.iqoption.core.b.c cVar) {
        this.bgB = cVar.Xd();
        if (VERSION.SDK_INT < 19 || !this.bGB.isAttachedToWindow()) {
            hb(cVar.toString());
        } else {
            hb(cVar.toString());
        }
    }

    private final void a(com.iqoption.core.b.f fVar) {
        String str = "event.toString()";
        String fVar2;
        if (VERSION.SDK_INT < 19 || !this.bGB.isAttachedToWindow()) {
            fVar2 = fVar.toString();
            kotlin.jvm.internal.i.e(fVar2, str);
            ag(fVar2);
            return;
        }
        fVar2 = fVar.toString();
        kotlin.jvm.internal.i.e(fVar2, str);
        ag(fVar2);
    }

    private final void c(String str, long j, int i) {
        com.iqoption.core.analytics.b b = com.iqoption.core.d.EC().b("launch-stat", (double) i, null, true);
        b.setDuration(Long.valueOf(j));
        b.Cc();
    }
}
