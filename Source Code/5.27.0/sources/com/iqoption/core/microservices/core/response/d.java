package com.iqoption.core.microservices.core.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/core/response/Kyc;", "", "()V", "status", "", "isPhoneFilled", "", "isPhoneNeeded", "isProfileFilled", "isProfileNeeded", "isRegulatedUser", "daysLeftToVerify", "isPhoneConfirmed", "isDocumentsNeeded", "isDocumentsApproved", "isDocumentsDeclined", "isDocumentsUploaded", "isDocumentPoaUploaded", "isDocumentPoiUploaded", "isDocumentsUploadSkipped", "isPhoneConfirmationSkipped", "(IZZZZZIZZZZZZZZZ)V", "getDaysLeftToVerify", "()I", "()Z", "getStatus", "core_release"})
/* compiled from: Kyc.kt */
public final class d {
    @SerializedName("isRegulatedUser")
    private final boolean asf;
    @SerializedName("isProfileNeeded")
    private final boolean asg;
    @SerializedName("isPhoneNeeded")
    private final boolean ash;
    @SerializedName("isDocumentsNeeded")
    private final boolean asi;
    @SerializedName("isDocumentsDeclined")
    private final boolean asj;
    @SerializedName("isProfileFilled")
    private final boolean asl;
    @SerializedName("isPhoneFilled")
    private final boolean asm;
    @SerializedName("isDocumentsUploaded")
    private final boolean asn;
    @SerializedName("isPhoneConfirmationSkipped")
    private final boolean aso;
    @SerializedName("isDocumentsUploadSkipped")
    private final boolean asq;
    @SerializedName("daysLeftToVerify")
    private final int bsn;
    @SerializedName("isPhoneConfirmed")
    private final boolean bso;
    @SerializedName("isDocumentsApproved")
    private final boolean bsp;
    @SerializedName("isDocumentPoaUploaded")
    private final boolean bsq;
    @SerializedName("isDocumentPoiUploaded")
    private final boolean bsr;
    @SerializedName("status")
    private final int status;

    public d(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.status = i;
        this.asm = z;
        this.ash = z2;
        this.asl = z3;
        this.asg = z4;
        this.asf = z5;
        this.bsn = i2;
        this.bso = z6;
        this.asi = z7;
        this.bsp = z8;
        this.asj = z9;
        this.asn = z10;
        this.bsq = z11;
        this.bsr = z12;
        this.asq = z13;
        this.aso = z14;
    }

    public final boolean adg() {
        return this.asf;
    }

    public /* synthetic */ d(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, f fVar) {
        int i4 = i3;
        int i5 = (i4 & 1) != 0 ? 0 : i;
        this(i5, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? false : z3, (i4 & 16) != 0 ? false : z4, (i4 & 32) != 0 ? false : z5, (i4 & 64) != 0 ? -1 : i2, (i4 & 128) != 0 ? false : z6, (i4 & 256) != 0 ? false : z7, (i4 & 512) != 0 ? false : z8, (i4 & 1024) != 0 ? false : z9, (i4 & 2048) != 0 ? false : z10, (i4 & 4096) != 0 ? false : z11, (i4 & 8192) != 0 ? false : z12, (i4 & 16384) != 0 ? false : z13, (i4 & 32768) != 0 ? false : z14);
    }

    public d() {
        this(0, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, false, 65534, null);
    }
}
