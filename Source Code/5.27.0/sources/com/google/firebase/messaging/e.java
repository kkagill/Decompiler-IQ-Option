package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.iqoption.dto.entity.position.Position;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

public final class e {
    private static final AtomicInteger aeC = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context acP;
    private final String aeD;
    private Bundle zzdv;

    public e(Context context, String str) {
        this.acP = context;
        this.aeD = str;
    }

    public final d z(Bundle bundle) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        Builder builder = new Builder(this.acP, cn(d(bundle, "gcm.n.android_channel_id")));
        builder.setAutoCancel(true);
        builder.setContentTitle(A(bundle));
        String f = f(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(f)) {
            builder.setContentText(f);
            builder.setStyle(new BigTextStyle().bigText(f));
        }
        builder.setSmallIcon(cl(d(bundle, "gcm.n.icon")));
        f = C(bundle);
        PendingIntent pendingIntent2 = null;
        if (TextUtils.isEmpty(f)) {
            uri = null;
        } else {
            if (!Position.CLOSE_REASON_DEFAULT.equals(f)) {
                if (this.acP.getResources().getIdentifier(f, "raw", this.aeD) != 0) {
                    String str = this.aeD;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(f).length());
                    stringBuilder.append("android.resource://");
                    stringBuilder.append(str);
                    stringBuilder.append("/raw/");
                    stringBuilder.append(f);
                    uri = Uri.parse(stringBuilder.toString());
                }
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            builder.setSound(uri);
        }
        f = d(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(f)) {
            uri = D(bundle);
            if (uri != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.aeD);
                intent.setData(uri);
            } else {
                intent = this.acP.getPackageManager().getLaunchIntentForPackage(this.aeD);
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            intent = new Intent(f);
            intent.setPackage(this.aeD);
            intent.setFlags(268435456);
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.startsWith("google.c.")) {
                    it.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str3 : bundle2.keySet()) {
                if (str3.startsWith("gcm.n.") || str3.startsWith("gcm.notification.")) {
                    intent.removeExtra(str3);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.acP, aeC.incrementAndGet(), intent, 1073741824);
            if (E(bundle)) {
                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                a(intent, bundle);
                intent.putExtra("pending_intent", pendingIntent);
                pendingIntent = d(aeC.incrementAndGet(), intent);
            }
        }
        builder.setContentIntent(pendingIntent);
        if (E(bundle)) {
            Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            a(intent2, bundle);
            pendingIntent2 = d(aeC.incrementAndGet(), intent2);
        }
        if (pendingIntent2 != null) {
            builder.setDeleteIntent(pendingIntent2);
        }
        Integer cm = cm(d(bundle, "gcm.n.color"));
        if (cm != null) {
            builder.setColor(cm.intValue());
        }
        String d = d(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(d)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder stringBuilder2 = new StringBuilder(37);
            stringBuilder2.append("FCM-Notification:");
            stringBuilder2.append(uptimeMillis);
            d = stringBuilder2.toString();
        }
        return new d(builder, d, 0);
    }

    @NonNull
    private final CharSequence A(Bundle bundle) {
        String f = f(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        try {
            return cz(0).loadLabel(this.acP.getPackageManager());
        } catch (NameNotFoundException e) {
            f = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 35);
            stringBuilder.append("Couldn't get own application info: ");
            stringBuilder.append(f);
            Log.e("FirebaseMessaging", stringBuilder.toString());
            return "";
        }
    }

    public static boolean B(Bundle bundle) {
        return "1".equals(d(bundle, "gcm.n.e")) || d(bundle, "gcm.n.icon") != null;
    }

    public static String d(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static Object[] e(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        String d = d(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(d);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException unused) {
            str = String.valueOf(str);
            str = (str2.length() != 0 ? str.concat(str2) : new String(str)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 41) + String.valueOf(d).length());
            stringBuilder.append("Malformed ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(d);
            stringBuilder.append("  Default value will be used.");
            Log.w("FirebaseMessaging", stringBuilder.toString());
            return null;
        }
    }

    private final String f(Bundle bundle, String str) {
        String d = d(bundle, str);
        if (TextUtils.isEmpty(d)) {
            return h(bundle, str);
        }
        return d;
    }

    public static String g(Bundle bundle, String str) {
        str = String.valueOf(str);
        String str2 = "_loc_key";
        return d(bundle, str2.length() != 0 ? str.concat(str2) : new String(str));
    }

    private final String h(Bundle bundle, String str) {
        String g = g(bundle, str);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        Resources resources = this.acP.getResources();
        int identifier = resources.getIdentifier(g, "string", this.aeD);
        String str2 = " Default value will be used.";
        String str3 = "FirebaseMessaging";
        String valueOf;
        if (identifier == 0) {
            valueOf = String.valueOf(str);
            g = "_loc_key";
            valueOf = (g.length() != 0 ? valueOf.concat(g) : new String(valueOf)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 49) + String.valueOf(str).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(" resource not found: ");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            Log.w(str3, stringBuilder.toString());
            return null;
        }
        Object[] e = e(bundle, str);
        if (e == null) {
            return resources.getString(identifier);
        }
        try {
            e = resources.getString(identifier, e);
            return e;
        } catch (MissingFormatArgumentException e2) {
            valueOf = Arrays.toString(e);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 58) + String.valueOf(valueOf).length());
            stringBuilder2.append("Missing format argument for ");
            stringBuilder2.append(str);
            stringBuilder2.append(": ");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(str2);
            Log.w(str3, stringBuilder2.toString(), e2);
            return null;
        }
    }

    @TargetApi(26)
    private final boolean zzb(int i) {
        String str = "FirebaseMessaging";
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        StringBuilder stringBuilder;
        try {
            if (!(this.acP.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            stringBuilder = new StringBuilder(77);
            stringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return false;
        } catch (NotFoundException unused) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Couldn't find resource ");
            stringBuilder.append(i);
            stringBuilder.append(", treating it as an invalid icon");
            Log.e(str, stringBuilder.toString());
            return false;
        }
    }

    private final int cl(String str) {
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.acP.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.aeD);
            if (identifier != 0 && zzb(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.aeD);
            if (identifier2 != 0 && zzb(identifier2)) {
                return identifier2;
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("Icon resource ");
            stringBuilder.append(str);
            stringBuilder.append(" not found. Notification will use default icon.");
            Log.w(str2, stringBuilder.toString());
        }
        int i = wX().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !zzb(i)) {
            try {
                i = cz(0).icon;
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                stringBuilder2.append("Couldn't get own application info: ");
                stringBuilder2.append(valueOf);
                Log.w(str2, stringBuilder2.toString());
            }
        }
        if (i == 0 || !zzb(i)) {
            i = 17301651;
        }
        return i;
    }

    private final Integer cm(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            Object str3;
            try {
                str3 = Integer.valueOf(Color.parseColor(str3));
                return str3;
            } catch (IllegalArgumentException unused) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 54);
                stringBuilder.append("Color ");
                stringBuilder.append(str3);
                stringBuilder.append(" not valid. Notification will use default color.");
                Log.w(str2, stringBuilder.toString());
            }
        }
        int i = wX().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(this.acP, i));
            } catch (NotFoundException unused2) {
                Log.w(str2, "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    public static String C(Bundle bundle) {
        String d = d(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(d) ? d(bundle, "gcm.n.sound") : d;
    }

    @Nullable
    static Uri D(@NonNull Bundle bundle) {
        CharSequence d = d(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(d)) {
            d = d(bundle, "gcm.n.link");
        }
        return !TextUtils.isEmpty(d) ? Uri.parse(d) : null;
    }

    private final synchronized Bundle wX() {
        if (this.zzdv != null) {
            return this.zzdv;
        }
        try {
            ApplicationInfo cz = cz(128);
            if (!(cz == null || cz.metaData == null)) {
                this.zzdv = cz.metaData;
                return this.zzdv;
            }
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
            stringBuilder.append("Couldn't get own application info: ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseMessaging", stringBuilder.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    private final String cn(String str) {
        if (!PlatformVersion.isAtLeastO()) {
            return null;
        }
        int i = 0;
        try {
            i = cz(i).targetSdkVersion;
        } catch (NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.acP.getSystemService(NotificationManager.class);
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 122);
            stringBuilder.append("Notification Channel requested (");
            stringBuilder.append(str);
            stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w(str2, stringBuilder.toString());
        }
        str = wX().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (TextUtils.isEmpty(str)) {
            Log.w(str2, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        } else if (notificationManager.getNotificationChannel(str) != null) {
            return str;
        } else {
            Log.w(str2, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        str = "fcm_fallback_notification_channel";
        if (notificationManager.getNotificationChannel(str) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(str, this.acP.getString(this.acP.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.aeD)), 3));
        }
        return str;
    }

    private final ApplicationInfo cz(int i) {
        return this.acP.getPackageManager().getApplicationInfo(this.aeD, i);
    }

    private static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private final PendingIntent d(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.acP, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.acP, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    private static boolean E(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.e"))) {
                return true;
            }
        }
        return false;
    }
}
