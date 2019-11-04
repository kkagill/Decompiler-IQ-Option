package com.iqoption.service;

import android.text.TextUtils;
import com.iqoption.core.d;
import com.iqoption.service.d.a;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.af;
import com.neovisionaries.ws.client.ag;
import com.neovisionaries.ws.client.ai;
import com.neovisionaries.ws.client.aj;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: NVWebSocketDelegate */
public class b extends d {
    private static final String TAG = "com.iqoption.service.b";
    private af dRF;

    /* Access modifiers changed, original: 0000 */
    public void a(String str, int i, a aVar) {
        final int i2 = i;
        final a aVar2 = aVar;
        try {
            List asList;
            String str2 = "5.27.0";
            String str3 = "platform_version";
            String str4 = "platform";
            String str5 = "lang";
            if (TextUtils.isEmpty("")) {
                asList = Arrays.asList(new String[]{str5, d.getLocale(), str4, Integer.toString(17), str3, str2});
            } else {
                asList = Arrays.asList(new String[]{str5, d.getLocale(), str4, Integer.toString(17), str3, str2, "ws_route", ""});
            }
            this.dRF = new ai().iC(60000).fN(false).kI(str).kD("permessage-deflate").b(new ag() {
                public void a(af afVar, String str) {
                    if (!TextUtils.isEmpty(str)) {
                        aVar2.a(i2, str, new StringReader(str));
                    }
                }

                public void a(af afVar, Map<String, List<String>> map) {
                    aVar2.ha(i2);
                }

                public void a(af afVar, aj ajVar, aj ajVar2, boolean z) {
                    aVar2.hb(i2);
                }

                public void a(af afVar, WebSocketException webSocketException) {
                    super.a(afVar, webSocketException);
                }

                public void a(af afVar, WebSocketException webSocketException, List<aj> list) {
                    super.a(afVar, webSocketException, (List) list);
                }

                public void a(af afVar, WebSocketException webSocketException, aj ajVar) {
                    super.a(afVar, webSocketException, ajVar);
                }

                public void a(af afVar, WebSocketException webSocketException, byte[] bArr) {
                    super.a(afVar, webSocketException, bArr);
                }
            }).aO("Cookie", bq(asList)).bfB();
        } catch (Exception e) {
            aVar2.a(i2, e, null);
        }
    }

    private String bq(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append((String) list.get(i));
            if (i % 2 == 0) {
                stringBuilder.append('=');
            } else {
                stringBuilder.append("; ");
            }
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public void fk(String str) {
        af afVar = this.dRF;
        if (afVar != null) {
            afVar.kE(str);
        }
    }

    public void aTm() {
        af afVar = this.dRF;
        if (afVar != null) {
            try {
                afVar.e(1000, null);
            } catch (Exception unused) {
            }
        }
    }
}
