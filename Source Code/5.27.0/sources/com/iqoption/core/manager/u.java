package com.iqoption.core.manager;

import com.iqoption.core.microservices.auth.response.AuthCode;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class u {
    public static final /* synthetic */ int[] aFX = new int[AuthCode.values().length];
    public static final /* synthetic */ int[] aFY = new int[AuthCode.values().length];
    public static final /* synthetic */ int[] aob = new int[AuthCode.values().length];
    public static final /* synthetic */ int[] axg = new int[AuthCode.values().length];
    public static final /* synthetic */ int[] bjZ = new int[AuthCode.values().length];

    static {
        aob[AuthCode.SUCCESS.ordinal()] = 1;
        aob[AuthCode.REQUESTS_LIMIT_EXCEEDED.ordinal()] = 2;
        axg[AuthCode.VERIFY.ordinal()] = 1;
        aFX[AuthCode.SUCCESS.ordinal()] = 1;
        aFX[AuthCode.INVALID_CREDENTIALS.ordinal()] = 2;
        aFX[AuthCode.DUPLICATE_EMAIL.ordinal()] = 3;
        aFX[AuthCode.DUPLICATE_PHONE.ordinal()] = 4;
        aFX[AuthCode.DUPLICATE_SOCIAL_ACCOUNT.ordinal()] = 5;
        aFX[AuthCode.PASSWORD_TOO_SHORT.ordinal()] = 6;
        aFX[AuthCode.INVALID_IDENTIFIER.ordinal()] = 7;
        aFX[AuthCode.INVALID_EMAIL.ordinal()] = 8;
        aFX[AuthCode.INVALID_PHONE.ordinal()] = 9;
        aFX[AuthCode.NOT_REGISTERED.ordinal()] = 10;
        aFX[AuthCode.COUNTRY_NOT_ALLOWED.ordinal()] = 11;
        aFX[AuthCode.BLOCKED.ordinal()] = 12;
        aFX[AuthCode.NOT_FOUND.ordinal()] = 13;
        aFX[AuthCode.USER_NOT_FOUND.ordinal()] = 14;
        aFX[AuthCode.NEWPASSWORD_MISMATCH.ordinal()] = 15;
        aFX[AuthCode.NEWPASSWORD_TOO_SHORT.ordinal()] = 16;
        aFX[AuthCode.REQUESTS_LIMIT_EXCEEDED.ordinal()] = 17;
        aFY[AuthCode.SUCCESS.ordinal()] = 1;
        aFY[AuthCode.INVALID_CODE.ordinal()] = 2;
        aFY[AuthCode.REQUESTS_LIMIT_EXCEEDED.ordinal()] = 3;
        bjZ[AuthCode.SUCCESS.ordinal()] = 1;
        bjZ[AuthCode.REQUESTS_LIMIT_EXCEEDED.ordinal()] = 2;
    }
}
