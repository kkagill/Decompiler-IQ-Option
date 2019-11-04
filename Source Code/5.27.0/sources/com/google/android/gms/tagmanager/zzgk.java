package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ShowFirstParty
@VisibleForTesting
public final class zzgk extends zzgh {
    private static final String ID = zza.UNIVERSAL_ANALYTICS.toString();
    private static final String zzalx = zzb.ACCOUNT.toString();
    private static final String zzaly = zzb.ANALYTICS_PASS_THROUGH.toString();
    private static final String zzalz = zzb.ENABLE_ECOMMERCE.toString();
    private static final String zzama = zzb.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String zzamb = zzb.ECOMMERCE_MACRO_DATA.toString();
    private static final String zzamc = zzb.ANALYTICS_FIELDS.toString();
    private static final String zzamd = zzb.TRACK_TRANSACTION.toString();
    private static final String zzame = zzb.TRANSACTION_DATALAYER_MAP.toString();
    private static final String zzamf = zzb.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> zzamg = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern zzamh = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzami = Pattern.compile("metric(\\d+)");
    private static Map<String, String> zzamj;
    private static Map<String, String> zzamk;
    private final DataLayer zzaed;
    private final Set<String> zzaml;
    private final zzgf zzamm;

    public zzgk(Context context, DataLayer dataLayer) {
        this(context, dataLayer, new zzgf(context));
    }

    @VisibleForTesting
    private zzgk(Context context, DataLayer dataLayer, zzgf zzgf) {
        super(ID, new String[0]);
        this.zzaed = dataLayer;
        this.zzamm = zzgf;
        this.zzaml = new HashSet();
        this.zzaml.add("");
        this.zzaml.add("0");
        this.zzaml.add("false");
    }

    private static boolean zzc(Map<String, zzl> map, String str) {
        zzl zzl = (zzl) map.get(str);
        if (zzl == null) {
            return false;
        }
        return zzgj.zzg(zzl).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    public final void zzd(java.util.Map<java.lang.String, com.google.android.gms.internal.gtm.zzl> r14) {
        /*
        r13 = this;
        r0 = "actionField";
        r1 = "&t";
        r2 = r13.zzamm;
        r3 = "_GTM_DEFAULT_TRACKER_";
        r2 = r2.zzbm(r3);
        r3 = "collect_adid";
        r3 = zzc(r14, r3);
        r2.enableAdvertisingIdCollection(r3);
        r3 = zzalz;
        r3 = zzc(r14, r3);
        r4 = 0;
        r5 = "name";
        r6 = 0;
        r7 = "&cu";
        if (r3 == 0) goto L_0x02b4;
    L_0x0023:
        r1 = new com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder;
        r1.<init>();
        r3 = zzamc;
        r3 = r14.get(r3);
        r3 = (com.google.android.gms.internal.gtm.zzl) r3;
        r3 = r13.zzj(r3);
        r1.setAll(r3);
        r8 = zzama;
        r8 = zzc(r14, r8);
        if (r8 == 0) goto L_0x004e;
    L_0x003f:
        r14 = r13.zzaed;
        r8 = "ecommerce";
        r14 = r14.get(r8);
        r8 = r14 instanceof java.util.Map;
        if (r8 == 0) goto L_0x0061;
    L_0x004b:
        r14 = (java.util.Map) r14;
        goto L_0x0062;
    L_0x004e:
        r8 = zzamb;
        r14 = r14.get(r8);
        r14 = (com.google.android.gms.internal.gtm.zzl) r14;
        r14 = com.google.android.gms.tagmanager.zzgj.zzh(r14);
        r8 = r14 instanceof java.util.Map;
        if (r8 == 0) goto L_0x0061;
    L_0x005e:
        r14 = (java.util.Map) r14;
        goto L_0x0062;
    L_0x0061:
        r14 = r6;
    L_0x0062:
        if (r14 == 0) goto L_0x02ac;
    L_0x0064:
        r3 = r3.get(r7);
        r3 = (java.lang.String) r3;
        if (r3 != 0) goto L_0x0074;
    L_0x006c:
        r3 = "currencyCode";
        r3 = r14.get(r3);
        r3 = (java.lang.String) r3;
    L_0x0074:
        if (r3 == 0) goto L_0x0079;
    L_0x0076:
        r1.set(r7, r3);
    L_0x0079:
        r3 = "impressions";
        r3 = r14.get(r3);
        r7 = r3 instanceof java.util.List;
        r8 = "Failed to extract a product from DataLayer. ";
        r9 = "list";
        if (r7 == 0) goto L_0x00c4;
    L_0x0087:
        r3 = (java.util.List) r3;
        r3 = r3.iterator();
    L_0x008d:
        r7 = r3.hasNext();
        if (r7 == 0) goto L_0x00c4;
    L_0x0093:
        r7 = r3.next();
        r7 = (java.util.Map) r7;
        r10 = zzf(r7);	 Catch:{ RuntimeException -> 0x00a7 }
        r7 = r7.get(r9);	 Catch:{ RuntimeException -> 0x00a7 }
        r7 = (java.lang.String) r7;	 Catch:{ RuntimeException -> 0x00a7 }
        r1.addImpression(r10, r7);	 Catch:{ RuntimeException -> 0x00a7 }
        goto L_0x008d;
    L_0x00a7:
        r7 = move-exception;
        r7 = r7.getMessage();
        r7 = java.lang.String.valueOf(r7);
        r10 = r7.length();
        if (r10 == 0) goto L_0x00bb;
    L_0x00b6:
        r7 = r8.concat(r7);
        goto L_0x00c0;
    L_0x00bb:
        r7 = new java.lang.String;
        r7.<init>(r8);
    L_0x00c0:
        com.google.android.gms.tagmanager.zzdi.zzav(r7);
        goto L_0x008d;
    L_0x00c4:
        r3 = "promoClick";
        r7 = r14.containsKey(r3);
        r10 = "promotions";
        if (r7 == 0) goto L_0x00db;
    L_0x00ce:
        r6 = r14.get(r3);
        r6 = (java.util.Map) r6;
        r6 = r6.get(r10);
        r6 = (java.util.List) r6;
        goto L_0x00ef;
    L_0x00db:
        r7 = "promoView";
        r11 = r14.containsKey(r7);
        if (r11 == 0) goto L_0x00ef;
    L_0x00e3:
        r6 = r14.get(r7);
        r6 = (java.util.Map) r6;
        r6 = r6.get(r10);
        r6 = (java.util.List) r6;
    L_0x00ef:
        r7 = "id";
        if (r6 == 0) goto L_0x017f;
    L_0x00f3:
        r6 = r6.iterator();
    L_0x00f7:
        r10 = r6.hasNext();
        if (r10 == 0) goto L_0x016b;
    L_0x00fd:
        r10 = r6.next();
        r10 = (java.util.Map) r10;
        r11 = new com.google.android.gms.analytics.ecommerce.Promotion;	 Catch:{ RuntimeException -> 0x014c }
        r11.<init>();	 Catch:{ RuntimeException -> 0x014c }
        r12 = r10.get(r7);	 Catch:{ RuntimeException -> 0x014c }
        r12 = (java.lang.String) r12;	 Catch:{ RuntimeException -> 0x014c }
        if (r12 == 0) goto L_0x0117;
    L_0x0110:
        r12 = java.lang.String.valueOf(r12);	 Catch:{ RuntimeException -> 0x014c }
        r11.setId(r12);	 Catch:{ RuntimeException -> 0x014c }
    L_0x0117:
        r12 = r10.get(r5);	 Catch:{ RuntimeException -> 0x014c }
        r12 = (java.lang.String) r12;	 Catch:{ RuntimeException -> 0x014c }
        if (r12 == 0) goto L_0x0126;
    L_0x011f:
        r12 = java.lang.String.valueOf(r12);	 Catch:{ RuntimeException -> 0x014c }
        r11.setName(r12);	 Catch:{ RuntimeException -> 0x014c }
    L_0x0126:
        r12 = "creative";
        r12 = r10.get(r12);	 Catch:{ RuntimeException -> 0x014c }
        r12 = (java.lang.String) r12;	 Catch:{ RuntimeException -> 0x014c }
        if (r12 == 0) goto L_0x0137;
    L_0x0130:
        r12 = java.lang.String.valueOf(r12);	 Catch:{ RuntimeException -> 0x014c }
        r11.setCreative(r12);	 Catch:{ RuntimeException -> 0x014c }
    L_0x0137:
        r12 = "position";
        r10 = r10.get(r12);	 Catch:{ RuntimeException -> 0x014c }
        r10 = (java.lang.String) r10;	 Catch:{ RuntimeException -> 0x014c }
        if (r10 == 0) goto L_0x0148;
    L_0x0141:
        r10 = java.lang.String.valueOf(r10);	 Catch:{ RuntimeException -> 0x014c }
        r11.setPosition(r10);	 Catch:{ RuntimeException -> 0x014c }
    L_0x0148:
        r1.addPromotion(r11);	 Catch:{ RuntimeException -> 0x014c }
        goto L_0x00f7;
    L_0x014c:
        r10 = move-exception;
        r11 = "Failed to extract a promotion from DataLayer. ";
        r10 = r10.getMessage();
        r10 = java.lang.String.valueOf(r10);
        r12 = r10.length();
        if (r12 == 0) goto L_0x0162;
    L_0x015d:
        r10 = r11.concat(r10);
        goto L_0x0167;
    L_0x0162:
        r10 = new java.lang.String;
        r10.<init>(r11);
    L_0x0167:
        com.google.android.gms.tagmanager.zzdi.zzav(r10);
        goto L_0x00f7;
    L_0x016b:
        r3 = r14.containsKey(r3);
        r5 = "&promoa";
        if (r3 == 0) goto L_0x0179;
    L_0x0173:
        r3 = "click";
        r1.set(r5, r3);
        goto L_0x0180;
    L_0x0179:
        r3 = "view";
        r1.set(r5, r3);
    L_0x017f:
        r4 = 1;
    L_0x0180:
        if (r4 == 0) goto L_0x02ac;
    L_0x0182:
        r3 = zzamg;
        r3 = r3.iterator();
    L_0x0188:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x02ac;
    L_0x018e:
        r4 = r3.next();
        r4 = (java.lang.String) r4;
        r5 = r14.containsKey(r4);
        if (r5 == 0) goto L_0x0188;
    L_0x019a:
        r14 = r14.get(r4);
        r14 = (java.util.Map) r14;
        r3 = "products";
        r3 = r14.get(r3);
        r3 = (java.util.List) r3;
        if (r3 == 0) goto L_0x01df;
    L_0x01aa:
        r3 = r3.iterator();
    L_0x01ae:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x01df;
    L_0x01b4:
        r5 = r3.next();
        r5 = (java.util.Map) r5;
        r5 = zzf(r5);	 Catch:{ RuntimeException -> 0x01c2 }
        r1.addProduct(r5);	 Catch:{ RuntimeException -> 0x01c2 }
        goto L_0x01ae;
    L_0x01c2:
        r5 = move-exception;
        r5 = r5.getMessage();
        r5 = java.lang.String.valueOf(r5);
        r6 = r5.length();
        if (r6 == 0) goto L_0x01d6;
    L_0x01d1:
        r5 = r8.concat(r5);
        goto L_0x01db;
    L_0x01d6:
        r5 = new java.lang.String;
        r5.<init>(r8);
    L_0x01db:
        com.google.android.gms.tagmanager.zzdi.zzav(r5);
        goto L_0x01ae;
    L_0x01df:
        r3 = r14.containsKey(r0);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x0285;
    L_0x01e5:
        r14 = r14.get(r0);	 Catch:{ RuntimeException -> 0x028e }
        r14 = (java.util.Map) r14;	 Catch:{ RuntimeException -> 0x028e }
        r0 = new com.google.android.gms.analytics.ecommerce.ProductAction;	 Catch:{ RuntimeException -> 0x028e }
        r0.<init>(r4);	 Catch:{ RuntimeException -> 0x028e }
        r3 = r14.get(r7);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x01fd;
    L_0x01f6:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionId(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x01fd:
        r3 = "affiliation";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x020c;
    L_0x0205:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionAffiliation(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x020c:
        r3 = "coupon";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x021b;
    L_0x0214:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionCouponCode(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x021b:
        r3 = r14.get(r9);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x0228;
    L_0x0221:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x028e }
        r0.setProductActionList(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x0228:
        r3 = "option";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x0237;
    L_0x0230:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x028e }
        r0.setCheckoutOptions(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x0237:
        r3 = "revenue";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x024a;
    L_0x023f:
        r3 = zzm(r3);	 Catch:{ RuntimeException -> 0x028e }
        r3 = r3.doubleValue();	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionRevenue(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x024a:
        r3 = "tax";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x025e;
    L_0x0253:
        r3 = zzm(r3);	 Catch:{ RuntimeException -> 0x028e }
        r3 = r3.doubleValue();	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionTax(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x025e:
        r3 = "shipping";
        r3 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r3 == 0) goto L_0x0271;
    L_0x0266:
        r3 = zzm(r3);	 Catch:{ RuntimeException -> 0x028e }
        r3 = r3.doubleValue();	 Catch:{ RuntimeException -> 0x028e }
        r0.setTransactionShipping(r3);	 Catch:{ RuntimeException -> 0x028e }
    L_0x0271:
        r3 = "step";
        r14 = r14.get(r3);	 Catch:{ RuntimeException -> 0x028e }
        if (r14 == 0) goto L_0x028a;
    L_0x0279:
        r14 = zzn(r14);	 Catch:{ RuntimeException -> 0x028e }
        r14 = r14.intValue();	 Catch:{ RuntimeException -> 0x028e }
        r0.setCheckoutStep(r14);	 Catch:{ RuntimeException -> 0x028e }
        goto L_0x028a;
    L_0x0285:
        r0 = new com.google.android.gms.analytics.ecommerce.ProductAction;	 Catch:{ RuntimeException -> 0x028e }
        r0.<init>(r4);	 Catch:{ RuntimeException -> 0x028e }
    L_0x028a:
        r1.setProductAction(r0);	 Catch:{ RuntimeException -> 0x028e }
        goto L_0x02ac;
    L_0x028e:
        r14 = move-exception;
        r0 = "Failed to extract a product action from DataLayer. ";
        r14 = r14.getMessage();
        r14 = java.lang.String.valueOf(r14);
        r3 = r14.length();
        if (r3 == 0) goto L_0x02a4;
    L_0x029f:
        r14 = r0.concat(r14);
        goto L_0x02a9;
    L_0x02a4:
        r14 = new java.lang.String;
        r14.<init>(r0);
    L_0x02a9:
        com.google.android.gms.tagmanager.zzdi.zzav(r14);
    L_0x02ac:
        r14 = r1.build();
        r2.send(r14);
        return;
    L_0x02b4:
        r0 = zzaly;
        r0 = zzc(r14, r0);
        if (r0 == 0) goto L_0x02cc;
    L_0x02bc:
        r0 = zzamc;
        r14 = r14.get(r0);
        r14 = (com.google.android.gms.internal.gtm.zzl) r14;
        r14 = r13.zzj(r14);
        r2.send(r14);
        return;
    L_0x02cc:
        r0 = zzamd;
        r0 = zzc(r14, r0);
        if (r0 == 0) goto L_0x0465;
    L_0x02d4:
        r0 = "transactionId";
        r3 = r13.zzbr(r0);
        if (r3 != 0) goto L_0x02e3;
    L_0x02dd:
        r14 = "Cannot find transactionId in data layer.";
        com.google.android.gms.tagmanager.zzdi.zzav(r14);
        return;
    L_0x02e3:
        r8 = new java.util.ArrayList;
        r8.<init>();
        r9 = zzamc;	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r14.get(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = (com.google.android.gms.internal.gtm.zzl) r9;	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r13.zzj(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = "transaction";
        r9.put(r1, r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = zzame;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = r14.get(r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = (com.google.android.gms.internal.gtm.zzl) r10;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r10 == 0) goto L_0x0309;
    L_0x0304:
        r0 = zzi(r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x0341;
    L_0x0309:
        r10 = zzamj;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r10 != 0) goto L_0x033f;
    L_0x030d:
        r10 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "&ti";
        r10.put(r0, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionAffiliation";
        r11 = "&ta";
        r10.put(r0, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionTax";
        r11 = "&tt";
        r10.put(r0, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionShipping";
        r11 = "&ts";
        r10.put(r0, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionTotal";
        r11 = "&tr";
        r10.put(r0, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionCurrency";
        r10.put(r0, r7);	 Catch:{ IllegalArgumentException -> 0x045e }
        zzamj = r10;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x033f:
        r0 = zzamj;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0341:
        r0 = r0.entrySet();	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = r0.iterator();	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0349:
        r10 = r0.hasNext();	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r10 == 0) goto L_0x0369;
    L_0x034f:
        r10 = r0.next();	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = (java.util.Map.Entry) r10;	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = r10.getValue();	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = (java.lang.String) r11;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = r10.getKey();	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = (java.lang.String) r10;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = r13.zzbr(r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        zzd(r9, r11, r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x0349;
    L_0x0369:
        r8.add(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionProducts";
        r9 = r13.zzaed;	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = r9.get(r0);	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r0 != 0) goto L_0x0378;
    L_0x0377:
        goto L_0x039d;
    L_0x0378:
        r6 = r0 instanceof java.util.List;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r6 == 0) goto L_0x0455;
    L_0x037c:
        r6 = r0;
        r6 = (java.util.List) r6;	 Catch:{ IllegalArgumentException -> 0x045e }
        r6 = r6.iterator();	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0383:
        r9 = r6.hasNext();	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r9 == 0) goto L_0x039a;
    L_0x0389:
        r9 = r6.next();	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r9 instanceof java.util.Map;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r9 == 0) goto L_0x0392;
    L_0x0391:
        goto L_0x0383;
    L_0x0392:
        r14 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "Each element of transactionProducts should be of type Map.";
        r14.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x045e }
        throw r14;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x039a:
        r6 = r0;
        r6 = (java.util.List) r6;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x039d:
        if (r6 == 0) goto L_0x0440;
    L_0x039f:
        r0 = r6.iterator();	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x03a3:
        r6 = r0.hasNext();	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r6 == 0) goto L_0x0440;
    L_0x03a9:
        r6 = r0.next();	 Catch:{ IllegalArgumentException -> 0x045e }
        r6 = (java.util.Map) r6;	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r6.get(r5);	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r9 != 0) goto L_0x03bb;
    L_0x03b5:
        r14 = "Unable to send transaction item hit due to missing 'name' field.";
        com.google.android.gms.tagmanager.zzdi.zzav(r14);	 Catch:{ IllegalArgumentException -> 0x045e }
        return;
    L_0x03bb:
        r9 = zzamc;	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r14.get(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = (com.google.android.gms.internal.gtm.zzl) r9;	 Catch:{ IllegalArgumentException -> 0x045e }
        r9 = r13.zzj(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = "item";
        r9.put(r1, r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = "&ti";
        r9.put(r10, r3);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = zzamf;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = r14.get(r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = (com.google.android.gms.internal.gtm.zzl) r10;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r10 == 0) goto L_0x03e0;
    L_0x03db:
        r10 = zzi(r10);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x0413;
    L_0x03e0:
        r10 = zzamk;	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r10 != 0) goto L_0x0411;
    L_0x03e4:
        r10 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x045e }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "&in";
        r10.put(r5, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "sku";
        r12 = "&ic";
        r10.put(r11, r12);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "category";
        r12 = "&iv";
        r10.put(r11, r12);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "price";
        r12 = "&ip";
        r10.put(r11, r12);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "quantity";
        r12 = "&iq";
        r10.put(r11, r12);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = "currency";
        r10.put(r11, r7);	 Catch:{ IllegalArgumentException -> 0x045e }
        zzamk = r10;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0411:
        r10 = zzamk;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0413:
        r10 = r10.entrySet();	 Catch:{ IllegalArgumentException -> 0x045e }
        r10 = r10.iterator();	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x041b:
        r11 = r10.hasNext();	 Catch:{ IllegalArgumentException -> 0x045e }
        if (r11 == 0) goto L_0x043b;
    L_0x0421:
        r11 = r10.next();	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = (java.util.Map.Entry) r11;	 Catch:{ IllegalArgumentException -> 0x045e }
        r12 = r11.getValue();	 Catch:{ IllegalArgumentException -> 0x045e }
        r12 = (java.lang.String) r12;	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = r11.getKey();	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = r6.get(r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        r11 = (java.lang.String) r11;	 Catch:{ IllegalArgumentException -> 0x045e }
        zzd(r9, r12, r11);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x041b;
    L_0x043b:
        r8.add(r9);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x03a3;
    L_0x0440:
        r8 = (java.util.ArrayList) r8;	 Catch:{ IllegalArgumentException -> 0x045e }
        r14 = r8.size();	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x0446:
        if (r4 >= r14) goto L_0x0454;
    L_0x0448:
        r0 = r8.get(r4);	 Catch:{ IllegalArgumentException -> 0x045e }
        r4 = r4 + 1;
        r0 = (java.util.Map) r0;	 Catch:{ IllegalArgumentException -> 0x045e }
        r2.send(r0);	 Catch:{ IllegalArgumentException -> 0x045e }
        goto L_0x0446;
    L_0x0454:
        return;
    L_0x0455:
        r14 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x045e }
        r0 = "transactionProducts should be of type List.";
        r14.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x045e }
        throw r14;	 Catch:{ IllegalArgumentException -> 0x045e }
    L_0x045e:
        r14 = move-exception;
        r0 = "Unable to send transaction";
        com.google.android.gms.tagmanager.zzdi.zza(r0, r14);
        return;
    L_0x0465:
        r14 = "Ignoring unknown tag.";
        com.google.android.gms.tagmanager.zzdi.zzac(r14);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzgk.zzd(java.util.Map):void");
    }

    private final String zzbr(String str) {
        Object obj = this.zzaed.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private static void zzd(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private static Product zzf(Map<String, Object> map) {
        String str;
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        obj = map.get(ConditionalUserProperty.NAME);
        if (obj != null) {
            product.setName(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null) {
            product.setBrand(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null) {
            product.setCategory(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null) {
            product.setVariant(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null) {
            product.setCouponCode(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null) {
            product.setPosition(zzn(obj).intValue());
        }
        obj = map.get(PendingOrderWrapper.PRICE);
        if (obj != null) {
            product.setPrice(zzm(obj).doubleValue());
        }
        obj = map.get("quantity");
        if (obj != null) {
            product.setQuantity(zzn(obj).intValue());
        }
        for (String str2 : map.keySet()) {
            String str22;
            Matcher matcher = zzamh.matcher(str22);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str22)));
                } catch (NumberFormatException unused) {
                    str = "illegal number in custom dimension value: ";
                    str22 = String.valueOf(str22);
                    zzdi.zzac(str22.length() != 0 ? str.concat(str22) : new String(str));
                }
            } else {
                matcher = zzami.matcher(str22);
                if (matcher.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher.group(1)), zzn(map.get(str22)).intValue());
                    } catch (NumberFormatException unused2) {
                        str = "illegal number in custom metric value: ";
                        str22 = String.valueOf(str22);
                        zzdi.zzac(str22.length() != 0 ? str.concat(str22) : new String(str));
                    }
                }
            }
        }
        return product;
    }

    private static Map<String, String> zzi(zzl zzl) {
        Object zzh = zzgj.zzh(zzl);
        if (!(zzh instanceof Map)) {
            return null;
        }
        Map map = (Map) zzh;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private final Map<String, String> zzj(zzl zzl) {
        if (zzl == null) {
            return new HashMap();
        }
        Map zzi = zzi(zzl);
        if (zzi == null) {
            return new HashMap();
        }
        String str = "&aip";
        String str2 = (String) zzi.get(str);
        if (str2 != null && this.zzaml.contains(str2.toLowerCase())) {
            zzi.remove(str);
        }
        return zzi;
    }

    private static Double zzm(Object obj) {
        String valueOf;
        String str = "Cannot convert the object to Double: ";
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static Integer zzn(Object obj) {
        String valueOf;
        String str = "Cannot convert the object to Integer: ";
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            valueOf = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public final /* bridge */ /* synthetic */ zzl zzb(Map map) {
        return super.zzb(map);
    }

    public final /* bridge */ /* synthetic */ boolean zzgw() {
        return super.zzgw();
    }

    public final /* bridge */ /* synthetic */ Set zzig() {
        return super.zzig();
    }

    public final /* bridge */ /* synthetic */ String zzif() {
        return super.zzif();
    }
}
