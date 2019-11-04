package com.iqoption.core.data.d;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import com.iqoption.core.data.d.c.b;
import com.iqoption.core.manager.LogoutClearList;
import com.iqoption.core.manager.LogoutClearList.Clearable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010}\u001a\u00020~J\b\u0010\u001a\u00020~H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)8F@FX\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020)2\u0006\u0010(\u001a\u00020)8F@FX\u000e¢\u0006\f\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R$\u00107\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010;\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R$\u0010A\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u0011\u0010C\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bC\u0010<R\u0011\u0010D\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0011\u0010E\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bE\u0010<R$\u0010F\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R$\u0010H\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R$\u0010J\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bJ\u0010<\"\u0004\bK\u0010>R$\u0010L\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R$\u0010N\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010<\"\u0004\bO\u0010>R$\u0010P\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bP\u0010<\"\u0004\bQ\u0010>R$\u0010R\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R$\u0010T\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bT\u0010<\"\u0004\bU\u0010>R\u0011\u0010V\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bV\u0010<R$\u0010W\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bW\u0010<\"\u0004\bX\u0010>R\u0011\u0010Y\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bY\u0010<R$\u0010Z\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R$\u0010\\\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b\\\u0010<\"\u0004\b]\u0010>R$\u0010^\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R$\u0010`\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b`\u0010<\"\u0004\ba\u0010>R$\u0010b\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bb\u0010<\"\u0004\bc\u0010>R$\u0010d\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bd\u0010<\"\u0004\be\u0010>R$\u0010f\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bf\u0010<\"\u0004\bg\u0010>R$\u0010h\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bh\u0010<\"\u0004\bi\u0010>R$\u0010j\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R(\u0010l\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bm\u00101\"\u0004\bn\u00103R\u000e\u0010o\u001a\u00020pX\u0004¢\u0006\u0002\n\u0000R$\u0010q\u001a\u00020:2\u0006\u0010(\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\br\u0010<\"\u0004\bs\u0010>R$\u0010u\u001a\u00020t2\u0006\u0010(\u001a\u00020t8F@FX\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010z\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b{\u00101\"\u0004\b|\u00103¨\u0006\u0001"}, bng = {"Lcom/iqoption/core/data/prefs/UserPrefs;", "Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "()V", "ALERTS_PULSE", "", "AMOUNT_VALUE", "AUTOLOGIN_TOKEN", "COEFFICIENT_VALUE", "EMAIL", "EXPIRATION_PANEL", "FIRST_DO_SELL_EXPERIENCE", "HIDE_BALANCE_CONTROLS", "IDENTITY", "IS_HIGH_LOW_CHART", "LOCALIZATION_JSON", "MARGIN_ADD_ON", "MEDIUM_SIGNAL", "ONE_CLICK_BUYING", "PASSCODE", "PASSWORD", "POPUP_MARGIN_ADD_ON", "POPUP_REFRESH_PRACTICE", "POPUP_TRADE_ON_PRACTICE", "PREF_NAME_USER", "REGULATED_STATE_CYSEC", "", "REGULATED_STATE_UNKNOWN", "REGULATION_STATE", "SELL_WITH_CONFIRM", "SHOULD_WRITE_REGISTRATION_LAUNCH", "SHOW_INVESTMENT", "SHOW_LIVE_DEALS", "SHOW_PRICE_MOVEMENTS", "SHOW_TICK_DEALS", "SHOW_TRADER_MOOD", "SOUND", "STRONG_SIGNAL", "TRAILING_STOP", "USER_ID", "VERIFY_CARD_STATUSES", "value", "", "amountCalculator", "getAmountCalculator", "()D", "setAmountCalculator", "(D)V", "autoLoginToken", "getAutoLoginToken", "()Ljava/lang/String;", "setAutoLoginToken", "(Ljava/lang/String;)V", "coefficientAmountCalculator", "getCoefficientAmountCalculator", "setCoefficientAmountCalculator", "identity", "getIdentity", "setIdentity", "", "isAlertsPulseEnabled", "()Z", "setAlertsPulseEnabled", "(Z)V", "isExpirationPanel", "setExpirationPanel", "isFirstDOSellExperience", "setFirstDOSellExperience", "isFirstDemoBetSentOld", "isFirstDepositSentOld", "isFirstRealBetSentOld", "isHideBalanceControls", "setHideBalanceControls", "isHighLowChart", "setHighLowChart", "isMarginAddOn", "setMarginAddOn", "isMediumSignal", "setMediumSignal", "isOneClickBuying", "setOneClickBuying", "isPopupMarginAddOnShowed", "setPopupMarginAddOnShowed", "isPopupRefreshPracticeShowed", "setPopupRefreshPracticeShowed", "isPopupTradeOnPracticeShowed", "setPopupTradeOnPracticeShowed", "isRegistrationLaunchOld", "isRegulated", "setRegulated", "isRegulationInitialized", "isSellWithConfirm", "setSellWithConfirm", "isShowInvestment", "setShowInvestment", "isShowLiveDeals", "setShowLiveDeals", "isShowPriceMovements", "setShowPriceMovements", "isShowTickDealsNotifications", "setShowTickDealsNotifications", "isShowTraderMood", "setShowTraderMood", "isSoundEnabled", "setSoundEnabled", "isStrongSignal", "setStrongSignal", "isTrailingStop", "setTrailingStop", "passcode", "getPasscode", "setPasscode", "prefs", "Lcom/iqoption/core/data/prefs/Prefs;", "shouldWriteRegistrationLaunch", "getShouldWriteRegistrationLaunch", "setShouldWriteRegistrationLaunch", "", "userId", "getUserId", "()J", "setUserId", "(J)V", "verifyCardStatusesJson", "getVerifyCardStatusesJson", "setVerifyCardStatusesJson", "clearLocalizationJson", "", "clearOnLogout", "core_release"})
/* compiled from: UserPrefs.kt */
public final class e implements Clearable {
    private static final c bdh = c.bdl.fL("IQOptions");
    public static final e bdq;

    static {
        e eVar = new e();
        bdq = eVar;
        LogoutClearList.a(eVar);
    }

    private e() {
    }

    public void clearOnLogout() {
        String identity = getIdentity();
        bdh.clear();
        bdh.put("identity", identity);
    }

    public final void WC() {
        bdh.remove("localization_json");
    }

    public final boolean Er() {
        int i = bdh.getInt("regulation_state", -1);
        return i == 1 || i == -1;
    }

    public final boolean Fz() {
        return bdh.getInt("regulation_state", -1) != -1;
    }

    public final String getIdentity() {
        String a = b.a(bdh, "identity", null, 2, null);
        return a != null ? a : "";
    }

    public final void setIdentity(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        bdh.put("identity", str);
    }

    public final long getUserId() {
        return bdh.getLong("user_id", -1);
    }

    public final void az(long j) {
        bdh.put("user_id", j);
    }

    public final String Eh() {
        return b.a(bdh, "autologin_token", null, 2, null);
    }

    public final void dD(String str) {
        String str2 = "autologin_token";
        if (str != null) {
            bdh.put(str2, str);
        } else {
            bdh.remove(str2);
        }
    }

    public final boolean WD() {
        return bdh.n("show_trader_mood", true);
    }

    public final void cv(boolean z) {
        bdh.put("show_trader_mood", z);
    }

    public final boolean WE() {
        return bdh.n("show_live_deals", false);
    }

    public final void cw(boolean z) {
        bdh.put("show_live_deals", z);
    }

    public final boolean WF() {
        return bdh.n("isRegistrationLaunch", false);
    }

    public final boolean WG() {
        return bdh.n("shouldWriteRegistrationLaunch", false);
    }

    public final void cx(boolean z) {
        bdh.put("shouldWriteRegistrationLaunch", z);
    }

    public final boolean WH() {
        String str = "blue_first_deposit";
        if (!b.a(bdh, str, false, 2, null)) {
            c cVar = bdh;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(d.EA().getUserId());
            if (!b.a(cVar, stringBuilder.toString(), false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean WI() {
        String str = "first_real_bet_sent";
        if (!b.a(bdh, str, false, 2, null)) {
            c cVar = bdh;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(d.EA().getUserId());
            if (!b.a(cVar, stringBuilder.toString(), false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean WJ() {
        String str = "first_demo_bet_sent";
        if (!b.a(bdh, str, false, 2, null)) {
            c cVar = bdh;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(d.EA().getUserId());
            if (!b.a(cVar, stringBuilder.toString(), false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean WK() {
        return bdh.n("alerts_pulse", true);
    }

    public final void cy(boolean z) {
        bdh.put("alerts_pulse", z);
    }

    public final String WL() {
        return b.a(bdh, "verify_card_statuses", null, 2, null);
    }

    public final void fM(String str) {
        bdh.put("verify_card_statuses", str);
    }
}
