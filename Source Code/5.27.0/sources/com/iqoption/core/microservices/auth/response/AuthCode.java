package com.iqoption.core.microservices.auth.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002%&B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/auth/response/AuthCode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "VERIFY", "INVALID_CREDENTIALS", "BLOCKED", "REQUESTS_LIMIT_EXCEEDED", "INTERNAL_ERROR", "DUPLICATE_EMAIL", "DUPLICATE_PHONE", "DUPLICATE_SOCIAL_ACCOUNT", "PASSWORD_TOO_SHORT", "INVALID_ACCEPTED", "TERMS_NOT_ACCEPTED", "INVALID_IDENTIFIER", "INVALID_COUNTRY_ID", "INVALID_LOCALE_ID", "INVALID_EMAIL", "INVALID_PHONE", "COUNTRY_NOT_ALLOWED", "BAD_ACCESS_TOKEN", "BAD_REQUEST", "BAD_TOKEN", "BAD_SSID", "USER_NOT_FOUND", "NOT_FOUND", "INVALID_CODE", "NOT_REGISTERED", "OLDPASSWORD_MISMATCH", "NEWPASSWORD_MISMATCH", "NEWPASSWORD_TOO_SHORT", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: AuthCode.kt */
public enum AuthCode {
    SUCCESS("success"),
    VERIFY("verify"),
    INVALID_CREDENTIALS("invalid_credentials"),
    BLOCKED("blocked"),
    REQUESTS_LIMIT_EXCEEDED("requests_limit_exceeded"),
    INTERNAL_ERROR("internal_error"),
    DUPLICATE_EMAIL("duplicate_email"),
    DUPLICATE_PHONE("duplicate_phone"),
    DUPLICATE_SOCIAL_ACCOUNT("duplicate_social_account"),
    PASSWORD_TOO_SHORT("password_too_short"),
    INVALID_ACCEPTED("invalid_accepted"),
    TERMS_NOT_ACCEPTED("terms_not_accepted"),
    INVALID_IDENTIFIER("invalid_identifier"),
    INVALID_COUNTRY_ID("invalid_country_id"),
    INVALID_LOCALE_ID("invalid_locale_id"),
    INVALID_EMAIL("invalid_email"),
    INVALID_PHONE("invalid_phone"),
    COUNTRY_NOT_ALLOWED("country_not_allowed"),
    BAD_ACCESS_TOKEN("bad_access_token"),
    BAD_REQUEST("bad_request"),
    BAD_TOKEN("bad_token"),
    BAD_SSID("bad_ssid"),
    USER_NOT_FOUND("user_not_found"),
    NOT_FOUND("not_found"),
    INVALID_CODE("invalid_code"),
    NOT_REGISTERED("not_registered"),
    OLDPASSWORD_MISMATCH("oldpassword_mismatch"),
    NEWPASSWORD_MISMATCH("newpassword_mismatch"),
    NEWPASSWORD_TOO_SHORT("newpassword_too_short"),
    UNKNOWN("_UNKNOWN");
    
    public static final b Companion = null;
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/auth/response/AuthCode$Companion;", "", "()V", "from", "Lcom/iqoption/core/microservices/auth/response/AuthCode;", "value", "", "core_release"})
    /* compiled from: AuthCode.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final AuthCode from(String str) {
            for (AuthCode authCode : AuthCode.values()) {
                if (u.v(authCode.getValue(), str, true)) {
                    break;
                }
            }
            AuthCode authCode2 = null;
            return authCode2 != null ? authCode2 : AuthCode.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/auth/response/AuthCode$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/auth/response/AuthCode;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: AuthCode.kt */
    public static final class a extends TypeAdapter<AuthCode> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AuthCode authCode) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(authCode != null ? authCode.getValue() : null);
        }

        /* renamed from: j */
        public AuthCode read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return AuthCode.Companion.from(jsonReader.nextString());
        }
    }

    public static final AuthCode from(String str) {
        return Companion.from(str);
    }

    private AuthCode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new b();
    }
}
