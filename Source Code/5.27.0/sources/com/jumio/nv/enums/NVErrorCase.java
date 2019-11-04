package com.jumio.nv.enums;

import com.iqoption.dto.entity.ActiveQuote;
import com.jumio.nv.R;
import com.jumio.sdk.exception.JumioErrorCase;

public enum NVErrorCase implements JumioErrorCase {
    GENERAL_NETWORK_ERROR(ActiveQuote.PHASE_CLOSING_AUCTION, R.string.netverify_error_network_problems, true),
    CERTIFICATE_ERROR("B", R.string.netverify_error_auth_failed, false),
    AUTH_FAILED(ActiveQuote.PHASE_CLOSED, R.string.netverify_error_auth_failed, false),
    INVALID_CREDENTIALS("D", R.string.netverify_error_auth_failed, false),
    DEVICE_IS_OFFLINE("E", R.string.netverify_error_device_is_offline, true),
    OCR_LOADING_FAILED("F", R.string.netverify_error_startup_error, false),
    GOOGLE_VISION_LOADING_FAILED("K", R.string.netverify_error_startup_error, false),
    CANCEL_TYPE_USER("G", R.string.netverify_error_cancelled_by_user, false),
    NO_CAMERA_CONNECTION("H", R.string.netverify_error_no_camera_connection, false),
    ALE_KEY_NOT_VALID(ActiveQuote.PHASE_INTRADAY_AUCTION, R.string.netverify_error_certificate_not_valid_anymore, false),
    TRANSACTION_FINISHED("J", R.string.netverify_error_transaction_already_finished, false),
    ADDRESS_MISSING("Y", R.string.netverify_helpview_description_usdl_fallback, true),
    NO_FACE_ON_BACK("Z", R.string.netverify_helpview_description_flip_document, true);
    
    protected String code;
    protected int message;
    protected boolean retry;

    private NVErrorCase(String str, int i, boolean z) {
        this.code = str;
        this.message = i;
        this.retry = z;
    }

    public String code() {
        return this.code;
    }

    public int message() {
        return this.message;
    }

    public boolean retry() {
        return this.retry;
    }
}
