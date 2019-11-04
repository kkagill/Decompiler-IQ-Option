package com.jumio.dv.a;

import com.iqoption.dto.entity.ActiveQuote;
import com.jumio.dv.R;
import com.jumio.sdk.exception.JumioErrorCase;

/* compiled from: DvErrorCase */
public enum a implements JumioErrorCase {
    GENERAL_NETWORK_ERROR(ActiveQuote.PHASE_CLOSING_AUCTION, R.string.dv_error_network_problems, true),
    CERTIFICATE_ERROR("B", R.string.dv_error_auth_failed, false),
    AUTH_FAILED(ActiveQuote.PHASE_CLOSED, R.string.dv_error_auth_failed, false),
    INVALID_CREDENTIALS("D", R.string.dv_error_auth_failed, false),
    DEVICE_IS_OFFLINE("E", R.string.dv_error_device_is_offline, true),
    OCR_LOADING_FAILED("F", R.string.dv_error_startup_error, false),
    CANCEL_TYPE_USER("G", R.string.dv_error_cancelled_by_user, false),
    NO_CAMERA_CONNECTION("H", R.string.dv_error_no_camera_connection, false),
    ALE_KEY_NOT_VALID(ActiveQuote.PHASE_INTRADAY_AUCTION, R.string.dv_error_certificate_not_valid_anymore, false),
    INVALID_DOCUMENT_TYPE("K", R.string.dv_error_invalid_document_type, false);
    
    protected String k;
    protected int l;
    protected boolean m;

    private a(String str, int i, boolean z) {
        this.k = str;
        this.l = i;
        this.m = z;
    }

    public String code() {
        return this.k;
    }

    public int message() {
        return this.l;
    }

    public boolean retry() {
        return this.m;
    }
}
