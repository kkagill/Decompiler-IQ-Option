package com.iqoption.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.util.ae;
import com.iqoption.core.util.b.d;
import com.iqoption.dto.Event;
import com.iqoption.i.b;
import com.iqoption.mobbtech.connect.a.c;
import com.iqoption.x.R;
import java.io.File;

/* compiled from: DialogUtils */
public class o {
    public static void b(Context context, final c cVar) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            b.N(new Exception("Calling dialog.show() when activity is finishing"));
        }
        Builder builder = new Builder(context);
        builder.setTitle(context.getString(R.string.attention));
        builder.setMessage(context.getString(ae.anC()));
        builder.setPositiveButton(context.getString(R.string.apply), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                cVar.perform(new Object[0]);
            }
        });
        builder.setNegativeButton(context.getString(R.string.cancel), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog create = builder.create();
        create.getWindow().setFlags(8, 8);
        create.show();
        create.getWindow().clearFlags(8);
        y.aA(create.getWindow().getDecorView());
    }

    public static void a(TradeRoomActivity tradeRoomActivity, boolean z, String str) {
        if (tradeRoomActivity.isFinishing()) {
            b.N(new Exception("Calling dialog.show() when activity is finishing"));
        }
        Builder builder = new Builder(tradeRoomActivity);
        builder.setTitle(tradeRoomActivity.getString(R.string.new_version_is_available));
        builder.setMessage(tradeRoomActivity.getString(z ? R.string.update_dialog_message_critical : R.string.the_new_version_of_the_app_is_available));
        builder.setPositiveButton(tradeRoomActivity.getString(R.string.update), null);
        builder.setCancelable(z ^ 1);
        if (!z) {
            builder.setNegativeButton(tradeRoomActivity.getString(R.string.cancel), -$$Lambda$o$-7OC22KiOC0X_9m_RTN1uaYAmBs.INSTANCE);
        }
        AlertDialog create = builder.create();
        create.getWindow().setFlags(8, 8);
        create.show();
        create.getButton(-1).setOnClickListener(new -$$Lambda$o$vBm3nOy7pvRgk-MZDU_aO2wDNNQ(tradeRoomActivity, str, z, create));
        create.getWindow().clearFlags(8);
        y.aA(create.getWindow().getDecorView());
    }

    private static /* synthetic */ void a(TradeRoomActivity tradeRoomActivity, String str, boolean z, AlertDialog alertDialog, View view) {
        c(tradeRoomActivity, str);
        com.iqoption.app.a.b.Gq();
        if (!z) {
            alertDialog.dismiss();
        }
    }

    public static void c(TradeRoomActivity tradeRoomActivity, String str) {
        if (!com.iqoption.app.managers.feature.c.Iw().ej("not-market-update")) {
            d.a((Context) tradeRoomActivity, com.iqoption.core.d.Un().Dw(), null, null);
        } else if (!TextUtils.isEmpty(str)) {
            DownloadManager downloadManager = (DownloadManager) tradeRoomActivity.getSystemService("download");
            if (downloadManager != null) {
                tradeRoomActivity.zM();
                com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
                if (Fa.Fq() > -1) {
                    downloadManager.remove(new long[]{Fa.Fq()});
                }
                String str2 = "update.apk";
                File file = new File(tradeRoomActivity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str2);
                if (file.exists()) {
                    file.delete();
                }
                Request request = new Request(Uri.parse(str));
                request.setNotificationVisibility(0);
                request.setAllowedNetworkTypes(3);
                request.setVisibleInDownloadsUi(true);
                request.setDestinationInExternalFilesDir(tradeRoomActivity, Environment.DIRECTORY_DOWNLOADS, str2);
                Fa.X(downloadManager.enqueue(request));
            }
        }
    }

    public static void g(final TradeRoomActivity tradeRoomActivity) {
        if (tradeRoomActivity.isFinishing()) {
            b.N(new Exception("Calling dialog.show() when activity is finishing"));
        }
        Builder builder = new Builder(tradeRoomActivity);
        builder.setTitle(tradeRoomActivity.getString(R.string.logout));
        builder.setMessage(tradeRoomActivity.getString(R.string.are_you_sure_you_want_to_logout));
        builder.setPositiveButton(tradeRoomActivity.getString(R.string.logout), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "menu_logout").setValue(Double.valueOf(1.0d)).build());
                tradeRoomActivity.zZ();
            }
        });
        builder.setNegativeButton(tradeRoomActivity.getString(R.string.cancel), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog create = builder.create();
        create.getWindow().setFlags(8, 8);
        create.show();
        create.getWindow().clearFlags(8);
        y.aA(create.getWindow().getDecorView());
    }
}
