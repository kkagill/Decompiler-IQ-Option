package com.jumio.dv.models;

import android.app.Activity;
import com.jumio.commons.PersistWith;
import com.jumio.core.mvp.model.StaticModel;

@PersistWith("DvSettingsModel")
public class DvSettingsModel implements StaticModel {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private boolean i = false;
    private boolean j = true;
    private transient Activity k;

    public DvSettingsModel() {
        String str = "";
        this.a = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    public String getMerchantScanReference() {
        return this.c;
    }

    public void setMerchantScanReference(String str) {
        this.c = str;
    }

    public String getMerchantReportingCriteria() {
        return this.f;
    }

    public void setMerchantReportingCriteria(String str) {
        this.f = str;
    }

    public String getCustomerId() {
        return this.d;
    }

    public void setCustomerId(String str) {
        this.d = str;
    }

    public String getCountry() {
        return this.a;
    }

    public void setCountry(String str) {
        this.a = str;
    }

    public boolean isCameraFrontfacing() {
        return this.i;
    }

    public void setCameraFacingFront(boolean z) {
        this.i = z;
    }

    public Activity getContext() {
        return this.k;
    }

    public void setContext(Activity activity) {
        this.k = activity;
    }

    public void setType(String str) {
        this.b = str;
    }

    public String getType() {
        return this.b;
    }

    public String getDocumentName() {
        return this.h;
    }

    public void setDocumentName(String str) {
        this.h = str;
    }

    public String getCallbackUrl() {
        return this.e;
    }

    public void setCallbackUrl(String str) {
        this.e = str;
    }

    public String getCustomDocumentCode() {
        return this.g;
    }

    public void setCustomDocumentCode(String str) {
        this.g = str;
    }

    public boolean isEnableExtraction() {
        return this.j;
    }

    public void setEnableExtraction(boolean z) {
        this.j = z;
    }
}
