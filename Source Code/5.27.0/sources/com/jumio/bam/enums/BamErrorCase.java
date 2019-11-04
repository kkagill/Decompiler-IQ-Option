package com.jumio.bam.enums;

import com.iqoption.dto.entity.ActiveQuote;
import com.jumio.bam.R;
import com.jumio.sdk.exception.JumioErrorCase;

public enum BamErrorCase implements JumioErrorCase {
    CREDIT_CARD_NOT_SUPPORTED("L", R.string.bam_error_view_message_credit_card_not_supported, true),
    CANCEL_TYPE_BACKGROUND("M", R.string.bam_error_view_message_background_execution_not_supported, false),
    CREDIT_CARD_EXPIRED("N", R.string.bam_error_view_message_credit_card_expired, true),
    CERTIFICATE_ERROR("B", R.string.bam_error_view_message_auth_failed, false),
    AUTH_FAILED(ActiveQuote.PHASE_CLOSED, R.string.bam_error_view_message_auth_failed, false),
    INVALID_CREDENTIALS("D", R.string.bam_error_view_message_auth_failed, false),
    OCR_LOADING_FAILED("F", R.string.bam_error_view_message_startup_error, false),
    CANCEL_TYPE_USER("G", R.string.bam_error_view_message_cancelled_by_user, false),
    NO_CAMERA_CONNECTION("H", R.string.bam_error_view_message_no_camera_connection, false),
    ALE_KEY_NOT_VALID(ActiveQuote.PHASE_INTRADAY_AUCTION, R.string.bam_error_view_message_certificate_not_valid_anymore, false),
    CARD_NOT_DETECTED("", 0, true);
    
    private String code;
    private int message;
    private boolean retry;

    private BamErrorCase(String str, int i, boolean z) {
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
