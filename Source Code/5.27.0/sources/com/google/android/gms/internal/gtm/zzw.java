package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@ShowFirstParty
public final class zzw extends zzi<zzw> {
    private ProductAction zzrx;
    private final Map<String, List<Product>> zzry = new HashMap();
    private final List<Promotion> zzrz = new ArrayList();
    private final List<Product> zzsa = new ArrayList();

    public final ProductAction zzbn() {
        return this.zzrx;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zzsa.isEmpty()) {
            hashMap.put("products", this.zzsa);
        }
        if (!this.zzrz.isEmpty()) {
            hashMap.put("promotions", this.zzrz);
        }
        if (!this.zzry.isEmpty()) {
            hashMap.put("impressions", this.zzry);
        }
        hashMap.put("productAction", this.zzrx);
        return zzi.zza((Object) hashMap);
    }

    public final List<Product> zzbo() {
        return Collections.unmodifiableList(this.zzsa);
    }

    public final Map<String, List<Product>> zzbp() {
        return this.zzry;
    }

    public final List<Promotion> zzbq() {
        return Collections.unmodifiableList(this.zzrz);
    }

    public final /* synthetic */ void zzb(zzi zzi) {
        zzw zzw = (zzw) zzi;
        zzw.zzsa.addAll(this.zzsa);
        zzw.zzrz.addAll(this.zzrz);
        for (Entry entry : this.zzry.entrySet()) {
            String str = (String) entry.getKey();
            for (Product product : (List) entry.getValue()) {
                if (product != null) {
                    Object obj = str == null ? "" : str;
                    if (!zzw.zzry.containsKey(obj)) {
                        zzw.zzry.put(obj, new ArrayList());
                    }
                    ((List) zzw.zzry.get(obj)).add(product);
                }
            }
        }
        ProductAction productAction = this.zzrx;
        if (productAction != null) {
            zzw.zzrx = productAction;
        }
    }
}
