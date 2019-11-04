package com.iqoption.core.microservices.auth.response;

import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/auth/response/LoginError;", "", "()V", "code", "", "title", "", "(ILjava/lang/String;)V", "getCode", "()I", "getTitle", "()Ljava/lang/String;", "Companion", "core_release"})
/* compiled from: LoginError.kt */
public final class b {
    public static final a blN = new a();
    @SerializedName("code")
    private final int code;
    @SerializedName("title")
    private final String title;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/auth/response/LoginError$Companion;", "", "()V", "CODE_2FA_CODE_RESEND_LIMIT_EXCEEDED", "", "CODE_2FA_INVALID_CODE", "CODE_2FA_SMS_CODE_REQUIRED", "CODE_2FA_SMS_CODE_RESEND", "CODE_ACCOUNT_IS_BLOCKED", "CODE_ALREADY_LOGGED_IN", "CODE_COULD_NOT_LOGIN", "CODE_INVALID_CREDENTIALS", "CODE_INVALID_EMAIL_OR_PHONE", "CODE_INVALID_PASSWORD", "CODE_LOGIN_LIMIT_EXCEEDED", "CODE_PHONE_IS_NOT_ACTIVATED", "CODE_UNKNOWN_ERROR", "core_release"})
    /* compiled from: LoginError.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public b(int i, String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        this.code = i;
        this.title = str;
    }

    public final int getCode() {
        return this.code;
    }

    public /* synthetic */ b(int i, String str, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        this(i, str);
    }

    public final String getTitle() {
        return this.title;
    }

    public b() {
        this(0, null, 2, null);
    }
}
