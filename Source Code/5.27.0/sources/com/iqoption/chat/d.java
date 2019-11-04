package com.iqoption.chat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat.Builder;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.e.j;
import com.iqoption.core.ext.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J0\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/chat/Notificator;", "", "()V", "GENERAL_CHANNEL_ID", "", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "ensureGeneralChannel", "", "getBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "getString", "id", "", "getUploadNotification", "Landroid/app/Notification;", "smallIcon", "largeIcon", "Landroid/graphics/Bitmap;", "title", "", "contentIntent", "Landroid/app/PendingIntent;", "chat_release"})
/* compiled from: Notificator.kt */
public final class d {
    private static final Resources aOg = com.iqoption.core.d.Uo().getResources();
    public static final d aOh = new d();

    private d() {
    }

    private final String getString(int i) {
        return aOg.getString(i);
    }

    private final Builder QQ() {
        if (VERSION.SDK_INT >= 26) {
            QR();
        }
        return new Builder(com.iqoption.core.d.Uo(), "General");
    }

    @RequiresApi(26)
    private final void QR() {
        com.iqoption.core.d.EA();
        NotificationManager bb = a.bb(com.iqoption.core.d.Uo());
        String str = "General";
        if (bb.getNotificationChannel(str) == null) {
            bb.createNotificationChannel(new NotificationChannel(str, aOh.getString(j.general), 3));
        }
    }

    public static /* synthetic */ Notification a(d dVar, int i, Bitmap bitmap, CharSequence charSequence, PendingIntent pendingIntent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 17301640;
        }
        if ((i2 & 2) != 0) {
            bitmap = BitmapFactory.decodeResource(aOg, com.iqoption.core.d.EJ());
        }
        if ((i2 & 4) != 0) {
            String string = aOg.getString(j.uploading);
            kotlin.jvm.internal.i.e(string, "resources.getString(R.string.uploading)");
            charSequence = string;
        }
        if ((i2 & 8) != 0) {
            pendingIntent = PendingIntent.getActivity(com.iqoption.core.d.Uo(), 0, new Intent(com.iqoption.core.d.Uo(), com.iqoption.core.d.EK()).addFlags(536870912), 268435456);
            kotlin.jvm.internal.i.e(pendingIntent, "PendingIntent.getActivit…tent.FLAG_CANCEL_CURRENT)");
        }
        return dVar.a(i, bitmap, charSequence, pendingIntent);
    }

    public final Notification a(int i, Bitmap bitmap, CharSequence charSequence, PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.f(charSequence, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(pendingIntent, "contentIntent");
        Notification build = QQ().setSmallIcon(i).setLargeIcon(bitmap).setContentTitle(charSequence).setContentIntent(pendingIntent).setProgress(100, 0, true).setOngoing(true).build();
        kotlin.jvm.internal.i.e(build, "getBuilder()\n           …\n                .build()");
        return build;
    }
}
