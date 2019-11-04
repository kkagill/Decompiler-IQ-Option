package com.iqoption.core.data.d;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.config.ApiConfig.Type;
import com.iqoption.core.data.config.h;
import com.iqoption.core.data.d.c.b;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020.8F@FX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0002042\u0006\u0010%\u001a\u0002048F@FX\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R$\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR$\u0010F\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R$\u0010I\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R$\u0010M\u001a\u00020L2\u0006\u0010%\u001a\u00020L8F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010R\u001a\u0002042\u0006\u0010%\u001a\u0002048F@FX\u000e¢\u0006\f\u001a\u0004\bS\u00107\"\u0004\bT\u00109R$\u0010U\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR$\u0010W\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bW\u0010@\"\u0004\bX\u0010BR$\u0010Y\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR$\u0010[\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\b[\u0010@\"\u0004\b\\\u0010BR(\u0010]\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*R$\u0010`\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\ba\u0010@\"\u0004\bb\u0010BR$\u0010c\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bd\u0010(\"\u0004\be\u0010*R\u000e\u0010f\u001a\u00020gX\u0004¢\u0006\u0002\n\u0000R(\u0010h\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bi\u0010(\"\u0004\bj\u0010*R0\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040k2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040k8F@FX\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR0\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00040k2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040k8F@FX\u000e¢\u0006\f\u001a\u0004\br\u0010n\"\u0004\bs\u0010pR$\u0010t\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bu\u0010@\"\u0004\bv\u0010BR$\u0010w\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\bx\u0010@\"\u0004\by\u0010BR$\u0010z\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\f\u001a\u0004\b{\u0010@\"\u0004\b|\u0010BR$\u0010}\u001a\u0002042\u0006\u0010%\u001a\u0002048F@FX\u000e¢\u0006\f\u001a\u0004\b~\u00107\"\u0004\b\u00109R'\u0010\u0001\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010@\"\u0005\b\u0001\u0010BR'\u0010\u0001\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010@\"\u0005\b\u0001\u0010BR'\u0010\u0001\u001a\u0002042\u0006\u0010%\u001a\u0002048F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R'\u0010\u0001\u001a\u0002042\u0006\u0010%\u001a\u0002048F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R'\u0010\u0001\u001a\u00020=2\u0006\u0010%\u001a\u00020=8F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010@\"\u0005\b\u0001\u0010B¨\u0006\u0001"}, bng = {"Lcom/iqoption/core/data/prefs/AppPrefs;", "", "()V", "AFF", "", "AFFTRACK", "APP_LAUNCH_COUNT", "DEBUG_EMULATE_PHASE_CHANGES", "DEBUG_FEATURES", "DEBUG_HOST", "DEBUG_HOST_TYPE", "DEBUG_IS_WHITE_LABEL", "DEBUG_NOT_MARK_REQUIREMENT_AS_SHOWN", "DEBUG_REGULATED_COUNTRY_ID", "DEBUG_SHOW_ANALYTICS_LOG", "DEBUG_SHOW_WEB_SOCKET_LOG", "DEBUG_STETHO_ENABLED", "DEBUG_TEST_GOOGLE_PAY", "DEVICE_ID", "FCM_REGISTERED", "FCM_TOKEN", "INSTRUMENT_RUNTIME_VERSION", "IS_APP_OPENED", "IS_LOG_API_CALL", "IS_SEND_APPS_FLYER_DEVICE_ID", "LOCALIZATION_VERSION", "LOGIN_EMAIL", "PASSCODE", "PASSCODE_EXPIRATION_TIME", "PREF_NAME_APP", "RECOVERY_CONFIG_ADDRESSES", "RETRACK", "S3_CONFIG_ADDRESSES", "STANDARD_LIBRARY_VERSION", "TIME_REQUEST_TWO_STEP_AUTH_LOGIN", "TIME_RETRACK", "TRADE_NOW_WAS_INVOKED", "value", "aff", "getAff", "()Ljava/lang/String;", "setAff", "(Ljava/lang/String;)V", "afftrack", "getAfftrack", "setAfftrack", "", "appLaunchCount", "getAppLaunchCount", "()I", "setAppLaunchCount", "(I)V", "", "debugRegulatedCountryId", "getDebugRegulatedCountryId", "()J", "setDebugRegulatedCountryId", "(J)V", "deviceId", "getDeviceId", "setDeviceId", "", "emulatePhaseChanges", "getEmulatePhaseChanges", "()Z", "setEmulatePhaseChanges", "(Z)V", "fcmRegistered", "getFcmRegistered", "setFcmRegistered", "fcmToken", "getFcmToken", "setFcmToken", "host", "getHost", "setHost", "Lcom/iqoption/core/data/config/ApiConfig$Type;", "hostType", "getHostType", "()Lcom/iqoption/core/data/config/ApiConfig$Type;", "setHostType", "(Lcom/iqoption/core/data/config/ApiConfig$Type;)V", "instrumentRuntimeVersion", "getInstrumentRuntimeVersion", "setInstrumentRuntimeVersion", "isAppOpened", "setAppOpened", "isDebugFeatures", "setDebugFeatures", "isDebugWhiteLabel", "setDebugWhiteLabel", "isSendAppsFlyerDeviceId", "setSendAppsFlyerDeviceId", "localizationVersion", "getLocalizationVersion", "setLocalizationVersion", "logApiCalls", "getLogApiCalls", "setLogApiCalls", "loginEmail", "getLoginEmail", "setLoginEmail", "prefs", "Lcom/iqoption/core/data/prefs/Prefs;", "reTrack", "getReTrack", "setReTrack", "", "recoveryConfigAddresses", "getRecoveryConfigAddresses", "()Ljava/util/List;", "setRecoveryConfigAddresses", "(Ljava/util/List;)V", "s3ConfigAddresses", "getS3ConfigAddresses", "setS3ConfigAddresses", "shouldNotMarkRequirementAsShown", "getShouldNotMarkRequirementAsShown", "setShouldNotMarkRequirementAsShown", "showAnalyticsLog", "getShowAnalyticsLog", "setShowAnalyticsLog", "showWebSocketLog", "getShowWebSocketLog", "setShowWebSocketLog", "standardLibraryVersion", "getStandardLibraryVersion", "setStandardLibraryVersion", "stethoEnabled", "getStethoEnabled", "setStethoEnabled", "testGooglePayEnabled", "getTestGooglePayEnabled", "setTestGooglePayEnabled", "timeReTrack", "getTimeReTrack", "setTimeReTrack", "timeRequestTwoStepAuthLogin", "getTimeRequestTwoStepAuthLogin", "setTimeRequestTwoStepAuthLogin", "tradeNowWasInvoked", "getTradeNowWasInvoked", "setTradeNowWasInvoked", "core_release"})
/* compiled from: AppPrefs.kt */
public final class a {
    private static final c bdh = c.bdl.fL("app_pref_name");
    public static final a bdi = new a();

    static {
        bdh.remove("two_step_auth_user");
        bdh.remove("two_step_auth_password");
    }

    private a() {
    }

    public final String DB() {
        return b.a(bdh, "aff", null, 2, null);
    }

    public final String DA() {
        return b.a(bdh, "retrack", null, 2, null);
    }

    public final long VY() {
        return b.a(bdh, "time_retrack", 0, 2, null);
    }

    public final String VZ() {
        String a = b.a(bdh, "login_email", null, 2, null);
        return a != null ? a : "";
    }

    public final void fJ(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        bdh.put("login_email", str);
    }

    public final long Wa() {
        return b.a(bdh, "time_request_two_step_auth_login", 0, 2, null);
    }

    public final void aC(long j) {
        bdh.put("time_request_two_step_auth_login", j);
    }

    public final String Wb() {
        return b.a(bdh, "localization_version", null, 2, null);
    }

    public final void fK(String str) {
        String str2 = "localization_version";
        if (str != null) {
            bdh.put(str2, str);
        } else {
            bdh.remove(str2);
        }
    }

    public final long Wc() {
        return b.a(bdh, "standard_library_version", 0, 2, null);
    }

    public final void aD(long j) {
        bdh.put("standard_library_version", j);
    }

    public final long Wd() {
        return b.a(bdh, "instrument_runtime_version", 0, 2, null);
    }

    public final void aE(long j) {
        bdh.put("instrument_runtime_version", j);
    }

    public final List<String> We() {
        String a = b.a(bdh, "recovery_config_addresses", null, 2, null);
        if (a != null) {
            List<String> b = v.b((CharSequence) a, new String[]{","}, false, 0, 6, null);
            if (b != null) {
                return b;
            }
        }
        return m.emptyList();
    }

    public final void ap(List<String> list) {
        kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
        bdh.put("recovery_config_addresses", u.a(list, ",", null, null, 0, null, null, 62, null));
    }

    public final List<String> Wf() {
        String a = b.a(bdh, "s3_config_addresses", null, 2, null);
        if (a != null) {
            List<String> b = v.b((CharSequence) a, new String[]{","}, false, 0, 6, null);
            if (b != null) {
                return b;
            }
        }
        return m.emptyList();
    }

    public final void aq(List<String> list) {
        kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
        bdh.put("s3_config_addresses", u.a(list, ",", null, null, 0, null, null, 62, null));
    }

    public final String Wg() {
        String a = b.a(bdh, "fcm_token", null, 2, null);
        return a != null ? a : "";
    }

    public final boolean Wh() {
        return bdh.n("trade_now_was_invoked", false);
    }

    public final void ba(boolean z) {
        bdh.put("trade_now_was_invoked", z);
    }

    public final String getHost() {
        String a = b.a(bdh, "debug_host", null, 2, null);
        return a != null ? a : h.bbU;
    }

    public final void setHost(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        bdh.put("debug_host", str);
    }

    public final Type Wi() {
        String a = b.a(bdh, "debug_host_type", null, 2, null);
        if (a != null) {
            try {
                Type valueOf = Type.valueOf(a);
                if (valueOf != null) {
                    return valueOf;
                }
            } catch (Exception unused) {
                return Type.PROD;
            }
        }
        return Type.PROD;
    }

    public final void b(Type type) {
        kotlin.jvm.internal.i.f(type, ConditionalUserProperty.VALUE);
        bdh.put("debug_host_type", type.name());
    }

    public final boolean Wj() {
        return bdh.n("is_log_api_call", false);
    }

    public final void ci(boolean z) {
        bdh.put("is_log_api_call", z);
    }

    public final long Wk() {
        return bdh.getLong("debug_regulated_country_id", -1);
    }

    public final void aF(long j) {
        bdh.put("debug_regulated_country_id", j);
    }

    public final boolean Wl() {
        return bdh.n("debug_show_web_socket_log", false);
    }

    public final void cj(boolean z) {
        bdh.put("debug_show_web_socket_log", z);
    }

    public final boolean Wm() {
        return bdh.n("debug_show_analytics_log", false);
    }

    public final void ck(boolean z) {
        bdh.put("debug_show_analytics_log", z);
    }

    public final boolean Wn() {
        return bdh.n("debug_stetho_enabled", false);
    }

    public final void cl(boolean z) {
        bdh.put("debug_stetho_enabled", z);
    }

    public final boolean Wo() {
        return bdh.n("debug_test_google_pay", false);
    }

    public final void cm(boolean z) {
        bdh.put("debug_test_google_pay", z);
    }

    public final boolean Wp() {
        return bdh.n("debug_is_white_label", false);
    }

    public final void cn(boolean z) {
        bdh.put("debug_is_white_label", z);
    }

    public final boolean Wq() {
        return bdh.n("debug_emulate_phase_changes", false);
    }

    public final void co(boolean z) {
        bdh.put("debug_emulate_phase_changes", z);
    }

    public final boolean Wr() {
        return bdh.n("debug_features", false);
    }

    public final void cp(boolean z) {
        bdh.put("debug_features", z);
    }

    public final boolean Ws() {
        return bdh.n("debug_not_mark_requirement_as_shown", false);
    }

    public final void cq(boolean z) {
        bdh.put("debug_not_mark_requirement_as_shown", z);
    }
}
