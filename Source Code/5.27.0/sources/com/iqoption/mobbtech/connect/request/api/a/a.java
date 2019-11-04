package com.iqoption.mobbtech.connect.request.api.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.rx.i;
import com.iqoption.core.util.w;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.result.BuybackResult;
import com.iqoption.gl.c;
import com.iqoption.mobbtech.connect.request.a.a.b;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse;
import com.iqoption.mobbtech.connect.response.ArrayBuybackResponse.Map;
import com.iqoption.service.websocket.IQBusException;
import com.iqoption.util.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: OptionRequests */
public class a {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.a.a";
    protected static final Set<Long> dIl = Sets.ux();
    public static final j<Long> dIm = -$$Lambda$4r9n1HY2Y-VqOTh-L0ryzqPM-y0.INSTANCE;

    protected a() {
    }

    public static boolean y(Long l) {
        return dIl.contains(l);
    }

    public static t<?> d(Context context, long j) {
        return a(context, ImmutableList.aJ(Long.valueOf(j)));
    }

    public static t<?> a(Context context, final ImmutableList<Long> immutableList) {
        dIl.addAll(immutableList);
        k.i(context, 2);
        t UA = b.z(Map.class).fo("sell-options").fp("2.0").k("options_ids", immutableList.toArray(new Long[0])).UA();
        v.b(UA, new o<Map>() {
            /* renamed from: b */
            public void onSuccess(Map map) {
                ArrayBuybackResponse aPM = ArrayBuybackResponse.aPM();
                Iterator it = map.entrySet().iterator();
                String str = null;
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!TextUtils.isEmpty(((BuybackResult) entry.getValue()).error)) {
                        str = ((BuybackResult) entry.getValue()).error;
                        aPM.dIF.add(entry.getKey());
                        a.dIl.remove(entry.getKey());
                        it.remove();
                    }
                }
                if (str != null) {
                    IQApp.Ex().bd(aPM);
                    com.iqoption.app.a.b.dY(str);
                }
                if (!w.C(map)) {
                    a.dIl.removeAll(map.keySet());
                    IQApp.Ex().bd(map);
                }
            }

            public void l(Throwable th) {
                ArrayBuybackResponse aPM = ArrayBuybackResponse.aPM();
                aPM.dIF.addAll(immutableList);
                a.dIl.removeAll(immutableList);
                IQApp.Ex().bd(aPM);
                com.iqoption.app.a.b.aQ(IQApp.Eu());
            }
        });
        return UA;
    }

    public static void a(String str, int i, final InstrumentType instrumentType, long j, double d, long j2, int i2, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_balance_id", Long.valueOf(j2));
        hashMap.put("active_id", Integer.valueOf(i));
        hashMap.put("option_type_id", Integer.valueOf(com.iqoption.core.microservices.tradingengine.response.active.a.S(instrumentType)));
        hashMap.put("direction", z ? NotificationCompat.CATEGORY_CALL : "put");
        hashMap.put(Position.CLOSE_REASON_EXPIRED, Long.valueOf(j));
        hashMap.put("refund_value", Integer.valueOf(0));
        hashMap.put(PendingOrderWrapper.PRICE, Double.valueOf(d));
        hashMap.put(ConditionalUserProperty.VALUE, Double.valueOf(c.aIy().tabGetActualValue(str)));
        hashMap.put("platform_id", Integer.valueOf(17));
        hashMap.put("profit_percent", Integer.valueOf(i2));
        t UA = b.z(Object.class).fo("open-option").b(hashMap).UA();
        com.iqoption.core.analytics.a.b.aZL.a(UA, new com.iqoption.core.analytics.a.b.c());
        if (z2) {
            v.b(UA, new o<Object>() {
                private static /* synthetic */ void Q(Throwable th) {
                }

                public void onSuccess(Object obj) {
                }

                public void l(Throwable th) {
                    if (th instanceof IQBusException) {
                        IQBusException iQBusException = (IQBusException) th;
                        if (iQBusException.status == 4117) {
                            com.iqoption.core.microservices.risks.a.bxY.c(instrumentType, com.iqoption.app.b.DG().Et()).h(i.aki()).a(-$$Lambda$a$2$-Nqlo5XvaUNBf0z4lJXbz_3Foak.INSTANCE, -$$Lambda$a$2$Q3-wSINSA5FM_LrMBk2TlSGmQ8U.INSTANCE);
                        }
                        com.iqoption.app.a.b.dY(iQBusException.getMessage().trim());
                    }
                }
            });
        }
    }
}
