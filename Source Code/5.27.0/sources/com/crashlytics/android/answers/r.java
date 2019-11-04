package com.crashlytics.android.answers;

import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import io.fabric.sdk.android.c;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: FirebaseAnalyticsEventMapper */
public class r {
    private static final Set<String> oD = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    public q c(SessionEvent sessionEvent) {
        boolean z = true;
        Object obj = (!Type.CUSTOM.equals(sessionEvent.oS) || sessionEvent.oU == null) ? null : 1;
        Object obj2 = (!Type.PREDEFINED.equals(sessionEvent.oS) || sessionEvent.oW == null) ? null : 1;
        if (obj == null && obj2 == null) {
            return null;
        }
        Bundle d;
        String d2;
        if (obj2 != null) {
            d = d(sessionEvent);
        } else {
            d = new Bundle();
            if (sessionEvent.oV != null) {
                a(d, sessionEvent.oV);
            }
        }
        if (obj2 != null) {
            String str = (String) sessionEvent.oX.get("success");
            if (str == null || Boolean.parseBoolean(str)) {
                z = false;
            }
            d2 = d(sessionEvent.oW, z);
        } else {
            d2 = aj(sessionEvent.oU);
        }
        c.biX().d("Answers", "Logging event into firebase...");
        return new q(d2, d);
    }

    private String aj(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        StringBuilder stringBuilder;
        if (oD.contains(str)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        str = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        if (str.length() > 40) {
            str = str.substring(0, 40);
        }
        return str;
    }

    private String ak(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        str = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fabric_");
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        if (str.length() > 40) {
            str = str.substring(0, 40);
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Missing block: B:30:0x005c, code skipped:
            if (r11.equals(r1) != false) goto L_0x00ca;
     */
    private java.lang.String d(java.lang.String r11, boolean r12) {
        /*
        r10 = this;
        r0 = 0;
        r1 = "purchase";
        r2 = "signUp";
        r3 = -1;
        r4 = 2;
        r5 = 1;
        r6 = "login";
        if (r12 == 0) goto L_0x0049;
    L_0x000c:
        r12 = r11.hashCode();
        r7 = -902468296; // 0xffffffffca356d38 float:-2972494.0 double:NaN;
        if (r12 == r7) goto L_0x0030;
    L_0x0015:
        r7 = 103149417; // 0x625ef69 float:3.1208942E-35 double:5.09625833E-316;
        if (r12 == r7) goto L_0x0028;
    L_0x001a:
        r7 = 1743324417; // 0x67e90501 float:2.2008074E24 double:8.61316704E-315;
        if (r12 == r7) goto L_0x0020;
    L_0x001f:
        goto L_0x0038;
    L_0x0020:
        r12 = r11.equals(r1);
        if (r12 == 0) goto L_0x0038;
    L_0x0026:
        r12 = 0;
        goto L_0x0039;
    L_0x0028:
        r12 = r11.equals(r6);
        if (r12 == 0) goto L_0x0038;
    L_0x002e:
        r12 = 2;
        goto L_0x0039;
    L_0x0030:
        r12 = r11.equals(r2);
        if (r12 == 0) goto L_0x0038;
    L_0x0036:
        r12 = 1;
        goto L_0x0039;
    L_0x0038:
        r12 = -1;
    L_0x0039:
        if (r12 == 0) goto L_0x0046;
    L_0x003b:
        if (r12 == r5) goto L_0x0043;
    L_0x003d:
        if (r12 == r4) goto L_0x0040;
    L_0x003f:
        goto L_0x0049;
    L_0x0040:
        r11 = "failed_login";
        return r11;
    L_0x0043:
        r11 = "failed_sign_up";
        return r11;
    L_0x0046:
        r11 = "failed_ecommerce_purchase";
        return r11;
    L_0x0049:
        r12 = r11.hashCode();
        r7 = "share";
        r8 = "search";
        r9 = "invite";
        switch(r12) {
            case -2131650889: goto L_0x00be;
            case -1183699191: goto L_0x00b5;
            case -938102371: goto L_0x00ab;
            case -906336856: goto L_0x00a3;
            case -902468296: goto L_0x009b;
            case -389087554: goto L_0x0091;
            case 23457852: goto L_0x0087;
            case 103149417: goto L_0x007e;
            case 109400031: goto L_0x0076;
            case 196004670: goto L_0x006b;
            case 1664021448: goto L_0x0060;
            case 1743324417: goto L_0x0058;
            default: goto L_0x0056;
        };
    L_0x0056:
        goto L_0x00c9;
    L_0x0058:
        r12 = r11.equals(r1);
        if (r12 == 0) goto L_0x00c9;
    L_0x005e:
        goto L_0x00ca;
    L_0x0060:
        r12 = "startCheckout";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x0068:
        r0 = 2;
        goto L_0x00ca;
    L_0x006b:
        r12 = "levelStart";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x0073:
        r0 = 10;
        goto L_0x00ca;
    L_0x0076:
        r12 = r11.equals(r7);
        if (r12 == 0) goto L_0x00c9;
    L_0x007c:
        r0 = 5;
        goto L_0x00ca;
    L_0x007e:
        r12 = r11.equals(r6);
        if (r12 == 0) goto L_0x00c9;
    L_0x0084:
        r0 = 8;
        goto L_0x00ca;
    L_0x0087:
        r12 = "addToCart";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x008f:
        r0 = 1;
        goto L_0x00ca;
    L_0x0091:
        r12 = "contentView";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x0099:
        r0 = 3;
        goto L_0x00ca;
    L_0x009b:
        r12 = r11.equals(r2);
        if (r12 == 0) goto L_0x00c9;
    L_0x00a1:
        r0 = 7;
        goto L_0x00ca;
    L_0x00a3:
        r12 = r11.equals(r8);
        if (r12 == 0) goto L_0x00c9;
    L_0x00a9:
        r0 = 4;
        goto L_0x00ca;
    L_0x00ab:
        r12 = "rating";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x00b3:
        r0 = 6;
        goto L_0x00ca;
    L_0x00b5:
        r12 = r11.equals(r9);
        if (r12 == 0) goto L_0x00c9;
    L_0x00bb:
        r0 = 9;
        goto L_0x00ca;
    L_0x00be:
        r12 = "levelEnd";
        r12 = r11.equals(r12);
        if (r12 == 0) goto L_0x00c9;
    L_0x00c6:
        r0 = 11;
        goto L_0x00ca;
    L_0x00c9:
        r0 = -1;
    L_0x00ca:
        switch(r0) {
            case 0: goto L_0x00eb;
            case 1: goto L_0x00e8;
            case 2: goto L_0x00e5;
            case 3: goto L_0x00e2;
            case 4: goto L_0x00e1;
            case 5: goto L_0x00e0;
            case 6: goto L_0x00dd;
            case 7: goto L_0x00da;
            case 8: goto L_0x00d9;
            case 9: goto L_0x00d8;
            case 10: goto L_0x00d5;
            case 11: goto L_0x00d2;
            default: goto L_0x00cd;
        };
    L_0x00cd:
        r11 = r10.aj(r11);
        return r11;
    L_0x00d2:
        r11 = "level_end";
        return r11;
    L_0x00d5:
        r11 = "level_start";
        return r11;
    L_0x00d8:
        return r9;
    L_0x00d9:
        return r6;
    L_0x00da:
        r11 = "sign_up";
        return r11;
    L_0x00dd:
        r11 = "rate_content";
        return r11;
    L_0x00e0:
        return r7;
    L_0x00e1:
        return r8;
    L_0x00e2:
        r11 = "select_content";
        return r11;
    L_0x00e5:
        r11 = "begin_checkout";
        return r11;
    L_0x00e8:
        r11 = "add_to_cart";
        return r11;
    L_0x00eb:
        r11 = "ecommerce_purchase";
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.r.d(java.lang.String, boolean):java.lang.String");
    }

    private Bundle d(SessionEvent sessionEvent) {
        Bundle bundle = new Bundle();
        boolean equals = ProductAction.ACTION_PURCHASE.equals(sessionEvent.oW);
        String str = "itemType";
        String str2 = "item_category";
        String str3 = "itemName";
        String str4 = "itemId";
        String str5 = "itemPrice";
        String str6 = ConditionalUserProperty.VALUE;
        String str7 = "item_name";
        String str8 = "item_id";
        String str9 = "currency";
        if (equals) {
            a(bundle, str8, (String) sessionEvent.oX.get(str4));
            a(bundle, str7, (String) sessionEvent.oX.get(str3));
            a(bundle, str2, (String) sessionEvent.oX.get(str));
            a(bundle, str6, S(sessionEvent.oX.get(str5)));
            a(bundle, str9, (String) sessionEvent.oX.get(str9));
        } else {
            if ("addToCart".equals(sessionEvent.oW)) {
                a(bundle, str8, (String) sessionEvent.oX.get(str4));
                a(bundle, str7, (String) sessionEvent.oX.get(str3));
                a(bundle, str2, (String) sessionEvent.oX.get(str));
                a(bundle, PendingOrderWrapper.PRICE, S(sessionEvent.oX.get(str5)));
                a(bundle, str6, S(sessionEvent.oX.get(str5)));
                a(bundle, str9, (String) sessionEvent.oX.get(str9));
                bundle.putLong("quantity", 1);
            } else {
                if ("startCheckout".equals(sessionEvent.oW)) {
                    a(bundle, "quantity", Long.valueOf((long) ((Integer) sessionEvent.oX.get("itemCount")).intValue()));
                    a(bundle, str6, S(sessionEvent.oX.get("totalPrice")));
                    a(bundle, str9, (String) sessionEvent.oX.get(str9));
                } else {
                    str = "contentName";
                    str2 = "contentId";
                    str3 = "contentType";
                    str4 = "content_type";
                    if ("contentView".equals(sessionEvent.oW)) {
                        a(bundle, str4, (String) sessionEvent.oX.get(str3));
                        a(bundle, str8, (String) sessionEvent.oX.get(str2));
                        a(bundle, str7, (String) sessionEvent.oX.get(str));
                    } else {
                        if ("search".equals(sessionEvent.oW)) {
                            a(bundle, "search_term", (String) sessionEvent.oX.get(SearchIntents.EXTRA_QUERY));
                        } else {
                            str5 = "method";
                            if ("share".equals(sessionEvent.oW)) {
                                a(bundle, str5, (String) sessionEvent.oX.get(str5));
                                a(bundle, str4, (String) sessionEvent.oX.get(str3));
                                a(bundle, str8, (String) sessionEvent.oX.get(str2));
                                a(bundle, str7, (String) sessionEvent.oX.get(str));
                            } else {
                                str6 = "rating";
                                if (str6.equals(sessionEvent.oW)) {
                                    a(bundle, str6, String.valueOf(sessionEvent.oX.get(str6)));
                                    a(bundle, str4, (String) sessionEvent.oX.get(str3));
                                    a(bundle, str8, (String) sessionEvent.oX.get(str2));
                                    a(bundle, str7, (String) sessionEvent.oX.get(str));
                                } else {
                                    if ("signUp".equals(sessionEvent.oW)) {
                                        a(bundle, str5, (String) sessionEvent.oX.get(str5));
                                    } else {
                                        if ("login".equals(sessionEvent.oW)) {
                                            a(bundle, str5, (String) sessionEvent.oX.get(str5));
                                        } else {
                                            if ("invite".equals(sessionEvent.oW)) {
                                                a(bundle, str5, (String) sessionEvent.oX.get(str5));
                                            } else {
                                                if ("levelStart".equals(sessionEvent.oW)) {
                                                    a(bundle, "level_name", (String) sessionEvent.oX.get("levelName"));
                                                } else {
                                                    if ("levelEnd".equals(sessionEvent.oW)) {
                                                        a(bundle, "score", R(sessionEvent.oX.get("score")));
                                                        a(bundle, "level_name", (String) sessionEvent.oX.get("levelName"));
                                                        a(bundle, "success", al((String) sessionEvent.oX.get("success")));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a(bundle, sessionEvent.oV);
        return bundle;
    }

    private void a(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    private void a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    private void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private void a(Bundle bundle, String str, Double d) {
        d = R(d);
        if (d != null) {
            bundle.putDouble(str, d.doubleValue());
        }
    }

    private Double R(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    private Integer al(String str) {
        return str == null ? null : Integer.valueOf(str.equals("true"));
    }

    private Double S(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(a.nK).doubleValue());
    }

    private void a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String ak = ak((String) entry.getKey());
            if (value instanceof String) {
                bundle.putString(ak, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(ak, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(ak, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(ak, ((Integer) entry.getValue()).intValue());
            }
        }
    }
}
