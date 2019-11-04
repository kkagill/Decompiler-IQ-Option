package com.jumio.nv.models;

import android.app.Activity;
import android.graphics.Bitmap.CompressFormat;
import com.jumio.commons.PersistWith;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import java.util.ArrayList;

@PersistWith("MerchantSettingsModel")
public class MerchantSettingsModel implements StaticModel {
    private NVDocumentVariant a;
    private String b;
    private String c;
    private boolean d = true;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private transient Activity i;
    private boolean j;
    private NVDocumentType k;
    private ArrayList<NVDocumentType> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private CompressFormat u;
    private int v;

    public MerchantSettingsModel() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = false;
        this.n = true;
        this.s = false;
    }

    public boolean isFaceMatchEnabled() {
        return this.n;
    }

    public void setFaceMatchEnabled(boolean z) {
        this.n = z;
    }

    public boolean isFaceMatchSet() {
        return this.o;
    }

    public void setFaceMatchSet(boolean z) {
        this.o = z;
    }

    public String getMerchantScanReference() {
        return this.b;
    }

    public void setMerchantScanReference(String str) {
        this.b = str;
    }

    public String getMerchantReportingCriteria() {
        return this.c;
    }

    public void setMerchantReportingCriteria(String str) {
        this.c = str;
    }

    public boolean requireVerification() {
        return this.d;
    }

    public String getCustomerId() {
        return this.e;
    }

    public void setCustomerId(String str) {
        this.e = str;
    }

    public String getCallbackUrl() {
        return this.f;
    }

    public void setCallbackUrl(String str) {
        this.f = str;
    }

    public String getIsoCode() {
        return this.g;
    }

    public void setCountryIsoCode(String str) {
        this.g = str;
    }

    public NVDocumentVariant getDocumentVariant() {
        return this.a;
    }

    public void setDocumentVariant(NVDocumentVariant nVDocumentVariant) {
        this.a = nVDocumentVariant;
    }

    public void setRequireVerification(boolean z) {
        this.d = z;
    }

    public boolean isCameraFrontfacing() {
        return this.h;
    }

    public void setCameraFacingFront(boolean z) {
        this.h = z;
    }

    public Activity getContext() {
        return this.i;
    }

    public void setContext(Activity activity) {
        this.i = activity;
    }

    public void setCountryPreSelected(boolean z) {
        this.j = z;
    }

    public boolean isCountryPreSelected() {
        return this.j;
    }

    public NVDocumentType getDocumentTypeId() {
        return this.k;
    }

    public void setPreSelectedDocumentType(NVDocumentType nVDocumentType) {
        this.k = nVDocumentType;
    }

    public ArrayList<NVDocumentType> getSupportedDocumentTypes() {
        return this.l;
    }

    public void setSupportedDocumentTypes(ArrayList<NVDocumentType> arrayList) {
        this.l = arrayList;
    }

    public void setDocumentVariantPreSelected(boolean z) {
        this.m = z;
    }

    public boolean isDocumentVariantPreSelected() {
        return this.m;
    }

    public void setDataExtractionOnMobileOnly(boolean z) {
        this.p = z;
    }

    public boolean isDataExtractionOnMobileOnly() {
        return this.p;
    }

    public void setEnableEMRTD(boolean z) {
        this.q = z;
    }

    public boolean isEnableEMRTD() {
        return this.q;
    }

    public void setSendDebugInfo(boolean z) {
        this.r = z;
    }

    public boolean isSendDebugInfo() {
        return this.r;
    }

    public boolean hasWaitedForInitialize() {
        return this.s;
    }

    public void setWaitedForInitialize(boolean z) {
        this.s = z;
    }

    public String getOutputDirectory() {
        return this.t;
    }

    public void setOutputDirectory(String str) {
        this.t = str;
    }

    public CompressFormat getOutputFormat() {
        return this.u;
    }

    public void setOutputFormat(CompressFormat compressFormat) {
        this.u = compressFormat;
    }

    public int getOutputLevel() {
        return this.v;
    }

    public void setOutputLevel(int i) {
        this.v = i;
    }
}
