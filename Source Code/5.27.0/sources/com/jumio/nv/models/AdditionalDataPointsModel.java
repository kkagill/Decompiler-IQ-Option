package com.jumio.nv.models;

import android.text.TextUtils;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.PersistWith;
import com.jumio.commons.log.Log;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.IsoCountryConverter;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;

@PersistWith("AdditionalDataPointsModel")
public class AdditionalDataPointsModel implements StaticModel {
    private String a;
    private int b = 0;
    private int c = 0;
    private ArrayList<String> d;
    private int e;
    private boolean f = false;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public AdditionalDataPointsModel() {
        String str = "";
        this.a = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = str;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
    }

    public void setAnalyticsDataModel(String str, int i, int i2, ArrayList<String> arrayList, int i3, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = arrayList;
        this.e = i3;
        this.f = z;
        this.h = str2;
    }

    public MetaInfo getAdditionalDataPointsMap() {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("locale", this.a);
        metaInfo.put("srX", Integer.valueOf(this.b));
        metaInfo.put("srY", Integer.valueOf(this.c));
        ArrayList arrayList = this.d;
        metaInfo.put("supportedLocales", arrayList != null ? new JSONArray(arrayList) : "");
        metaInfo.put("timezone", Integer.valueOf(this.e));
        metaInfo.put("isRooted", Boolean.valueOf(this.f));
        metaInfo.put("countryForIP", this.g);
        metaInfo.put("localeCountry", this.h);
        metaInfo.put("issuingCountry", this.i);
        MetaInfo metaInfo2 = new MetaInfo();
        metaInfo2.put("country", this.j);
        metaInfo2.put("state", this.k);
        metaInfo2.put("zip", this.l);
        metaInfo.put("geocoded", metaInfo2);
        metaInfo.put("numOfVerifications", Integer.valueOf(this.m));
        metaInfo.put("numOfRetakes", Integer.valueOf(this.n));
        metaInfo.put("numOfCancels", Integer.valueOf(this.o));
        a();
        metaInfo.put("numOfCountries", Integer.valueOf(this.p));
        metaInfo.put("secInSdk", Integer.valueOf(this.q));
        return metaInfo;
    }

    private void a() {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(this.h)) {
            hashSet.add(this.h);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashSet.add(this.j);
        }
        if (!TextUtils.isEmpty(this.i)) {
            hashSet.add(this.i);
        }
        if (!TextUtils.isEmpty(this.g)) {
            hashSet.add(this.g);
        }
        this.p = hashSet.size();
    }

    public void setGeocodedInformation(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.k = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.l = str3;
            }
            if (!TextUtils.isEmpty(str)) {
                this.j = IsoCountryConverter.convertToAlpha3(str);
            }
        } catch (Exception e) {
            Log.e("Failed to convert geocoded information", e);
        }
    }

    public void setIssuingCountry(String str) {
        this.i = str;
    }

    public void setCountryForIp(String str) {
        this.g = str;
    }

    public String getIssuingCountry() {
        return this.i;
    }

    public void setNumberOfVerifications(int i) {
        this.m = i;
    }

    public void setNumberOfRetakes(int i) {
        this.n = i;
    }

    public void setNumberOfCancels(int i) {
        this.o = i;
    }

    public void setSecondsInSdk(int i) {
        this.q = i;
    }
}
