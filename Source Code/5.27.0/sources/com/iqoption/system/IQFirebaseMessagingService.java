package com.iqoption.system;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.c;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.b.a;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.event.OtnEmissionExecuted;
import com.iqoption.util.w;
import com.iqoption.x.R;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IQFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "com.iqoption.system.IQFirebaseMessagingService";

    public void ck(String str) {
        super.ck(str);
        try {
            d.aP(getApplicationContext()).dR(str);
            ((a) IQApp.Eu().asx.get()).c(IQApp.Eu(), str);
        } catch (Exception unused) {
        }
    }

    public static void aUz() {
        try {
            IQApp Eu = IQApp.Eu();
            if (Eu != null) {
                FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(new -$$Lambda$IQFirebaseMessagingService$-44d7r1qlrnG0LteEQdp7wmZfSA(Eu));
            }
        } catch (Exception unused) {
        }
    }

    private static void aUA() {
        com.google.firebase.messaging.a.wS().ci("global");
    }

    public static void bK(Context context) {
        if (context != null) {
            try {
                FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(new -$$Lambda$IQFirebaseMessagingService$Ae17qg1VYfhcIovYqBKr-4YQYWQ(context));
            } catch (Exception unused) {
            }
        }
    }

    public void a(c cVar) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FCM From: ");
        stringBuilder.append(cVar.wU());
        Log.d(str, stringBuilder.toString());
        final Map wV = cVar.wV();
        final c.a wW = cVar.wW();
        com.iqoption.core.c.a.biL.execute(new Runnable() {
            public void run() {
                c.a aVar = wW;
                if (aVar != null) {
                    String body = aVar.getBody();
                    String title = wW.getTitle();
                    if (!TextUtils.isEmpty(body)) {
                        wV.put("text", body);
                    }
                    if (!TextUtils.isEmpty(title)) {
                        wV.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, title);
                    }
                }
                Context applicationContext = IQFirebaseMessagingService.this.getApplicationContext();
                NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
                Map map = wV;
                if (map != null) {
                    String str = "type";
                    if (map.containsKey(str)) {
                        try {
                            String str2 = (String) wV.get(str);
                            int parseInt = Integer.parseInt(str2);
                            boolean DR = b.aK(applicationContext).DR();
                            boolean Gp = com.iqoption.app.a.b.Gp();
                            com.iqoption.app.managers.feature.c Iw = com.iqoption.app.managers.feature.c.Iw();
                            Object obj = -1;
                            int hashCode = str2.hashCode();
                            if (hashCode != 49) {
                                if (hashCode != 50) {
                                    if (hashCode != 53) {
                                        if (hashCode != 1638) {
                                            if (hashCode != 1660) {
                                                if (hashCode != 1667) {
                                                    if (hashCode != 1664) {
                                                        if (hashCode != 1665) {
                                                            if (hashCode != 1691) {
                                                                if (hashCode != 1692) {
                                                                    if (hashCode != 1694) {
                                                                        if (hashCode != 1695) {
                                                                            switch (hashCode) {
                                                                                case 1600:
                                                                                    if (str2.equals("22")) {
                                                                                        obj = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1601:
                                                                                    if (str2.equals("23")) {
                                                                                        obj = 10;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1602:
                                                                                    if (str2.equals("24")) {
                                                                                        obj = 3;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1603:
                                                                                    if (str2.equals("25")) {
                                                                                        obj = 4;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1604:
                                                                                    if (str2.equals("26")) {
                                                                                        obj = 7;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 1605:
                                                                                    if (str2.equals("27")) {
                                                                                        obj = 6;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        } else if (str2.equals("54")) {
                                                                            obj = 17;
                                                                        }
                                                                    } else if (str2.equals("53")) {
                                                                        obj = 16;
                                                                    }
                                                                } else if (str2.equals("51")) {
                                                                    obj = 9;
                                                                }
                                                            } else if (str2.equals("50")) {
                                                                obj = 12;
                                                            }
                                                        } else if (str2.equals("45")) {
                                                            obj = 15;
                                                        }
                                                    } else if (str2.equals("44")) {
                                                        obj = 14;
                                                    }
                                                } else if (str2.equals("47")) {
                                                    obj = 5;
                                                }
                                            } else if (str2.equals("40")) {
                                                obj = 11;
                                            }
                                        } else if (str2.equals("39")) {
                                            obj = 8;
                                        }
                                    } else if (str2.equals("5")) {
                                        obj = 13;
                                    }
                                } else if (str2.equals("2")) {
                                    obj = 1;
                                }
                            } else if (str2.equals("1")) {
                                obj = null;
                            }
                            switch (obj) {
                                case null:
                                case 1:
                                    if (!Gp && DR) {
                                        IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                        break;
                                    }
                                case 2:
                                    if (!Gp && DR && IQFirebaseMessagingService.this.J(wV)) {
                                        IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                        break;
                                    }
                                case 3:
                                    if (!(Iw.ep("hide-emission") || !DR || Gp)) {
                                        IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                        break;
                                    }
                                case 4:
                                    if (Iw.ej("pending-order") && DR && !Gp) {
                                        IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                        break;
                                    }
                                case 5:
                                    if (Iw.ej(Order.ON_MKT_OPEN)) {
                                        IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                        break;
                                    }
                                    break;
                                case 6:
                                case 7:
                                    if (!Iw.ej("margin-add-on")) {
                                        break;
                                    }
                                case 8:
                                    IQFirebaseMessagingService.this.a(applicationContext, parseInt, wV, notificationManager);
                                    break;
                                case 9:
                                    IQFirebaseMessagingService.this.K(wV);
                                    break;
                                default:
                                    if (DR) {
                                        if (!Gp) {
                                            IQFirebaseMessagingService.this.b(applicationContext, parseInt, wV, notificationManager);
                                            break;
                                        }
                                        IQFirebaseMessagingService.this.d(applicationContext, wV);
                                        break;
                                    }
                                    break;
                            }
                            JsonObject jsonObject = new JsonObject();
                            for (Entry entry : wV.entrySet()) {
                                jsonObject.add((String) entry.getKey(), new JsonPrimitive((String) entry.getValue()));
                            }
                            JsonObject jsonObject2 = new JsonObject();
                            jsonObject2.add("parameters", jsonObject);
                            jsonObject2.add("push_type", new JsonPrimitive(str2));
                            EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "app-received-push").setParameters(jsonObject2).build());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        });
    }

    private void a(Context context, int i, Map<String, String> map, NotificationManager notificationManager) {
        String str = (String) map.get("text");
        String str2 = (String) map.get(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        String str3 = (String) map.get("link");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            Builder e = e(context, str, str2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str3));
            e.setContentIntent(PendingIntent.getActivity(context, i, intent, 268435456));
            notificationManager.notify(i, e.build());
        }
    }

    private boolean J(Map<String, String> map) {
        String str = "signal";
        if (map.containsKey(str)) {
            SignalLegacy fromJson = SignalLegacy.fromJson((String) map.get(str));
            if (fromJson != null) {
                return com.iqoption.fragment.d.b.c(fromJson);
            }
        }
        return false;
    }

    private void d(Context context, Map<String, String> map) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(a(new Intent("com.iqoption.push.broadcast.event"), (Map) map));
    }

    private void b(Context context, int i, Map<String, String> map, NotificationManager notificationManager) {
        String str = (String) map.get("text");
        String str2 = (String) map.get(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        if (!TextUtils.isEmpty(str)) {
            Builder e = e(context, str, str2);
            Intent a = a(new Intent(context, TradeRoomActivity.class), (Map) map);
            a.setFlags(32768);
            e.setContentIntent(PendingIntent.getActivity(context, i, a, 268435456));
            notificationManager.notify(i, e.build());
        }
    }

    private Builder e(Context context, String str, String str2) {
        CharSequence str22;
        Builder smallIcon = new Builder(context).setSmallIcon(R.drawable.ic_notification);
        if (TextUtils.isEmpty(str22)) {
            str22 = context.getString(R.string.app_name);
        }
        Builder autoCancel = smallIcon.setContentTitle(str22).setContentText(str).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher)).setStyle(new BigTextStyle().bigText(str)).setDefaults(-1).setAutoCancel(true);
        if (VERSION.SDK_INT >= 21) {
            autoCancel.setCategory(NotificationCompat.CATEGORY_PROMO);
            autoCancel.setVisibility(1);
        }
        return autoCancel;
    }

    private Intent a(Intent intent, Map<String, String> map) {
        String str = "o_type";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "a_id";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "o_id";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "group_id";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "text";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "type";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "signal";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "invitation_type";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = OtnEmissionExecuted.COMMISSION_VOLUME_ENROLLED;
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = OtnEmissionExecuted.TOTAL_COMMISSIONS_ENROLLED;
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = OtnEmissionExecuted.COUNT;
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "active_id";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = "instrument_type";
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        str = PendingOrderWrapper.PRICE;
        if (map.containsKey(str)) {
            intent.putExtra(str, (String) map.get(str));
        }
        if (map.containsKey(PendingOrderWrapper.SIDE)) {
            intent.putExtra(PendingOrderWrapper.SIDE, (String) map.get(PendingOrderWrapper.SIDE));
        }
        if (map.containsKey(PendingOrderWrapper.POSITION_ID)) {
            intent.putExtra(PendingOrderWrapper.POSITION_ID, (String) map.get(PendingOrderWrapper.POSITION_ID));
        }
        a(intent, (Map) map, "id", "card_number", NotificationCompat.CATEGORY_STATUS, Position.CLOSE_REASON_EXPIRED, "payment_method_id", "asset_id", "timestamp", "alert_type", ConditionalUserProperty.VALUE);
        return intent;
    }

    private void a(Intent intent, Map<String, String> map, String... strArr) {
        for (Object obj : strArr) {
            if (map.containsKey(obj)) {
                intent.putExtra(obj, (String) map.get(obj));
            }
        }
    }

    private void K(Map<String, String> map) {
        List list = (List) w.aWL().fromJson((String) map.get("addresses"), new TypeToken<List<String>>() {
        }.getType());
        boolean z = list != null;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("has_config", Boolean.valueOf(z));
        com.iqoption.core.d.Um().EC().b("get_config", 0.0d, jsonObject, true).Cc();
        if (z) {
            IQApp.Ev().am(list);
        }
    }
}
