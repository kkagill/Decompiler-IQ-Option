package com.iqoption.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.common.collect.Sets;
import com.google.common.collect.s;
import com.google.gson.reflect.TypeToken;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.b.e;
import com.iqoption.app.managers.k;
import com.iqoption.core.data.d.b;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.system.b.c;
import com.iqoption.util.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: Preferences */
public class d extends c {
    private static final String TAG = "com.iqoption.app.d";
    private static volatile d asP;
    private volatile SharedPreferences asQ;
    private volatile SharedPreferences asR;

    public static synchronized d aP(Context context) {
        d dVar;
        synchronized (d.class) {
            if (asP == null) {
                synchronized (d.class) {
                    if (asP == null) {
                        asP = new d(context);
                    }
                }
            }
            dVar = asP;
        }
        return dVar;
    }

    public static d Fa() {
        return aP(IQApp.Eu());
    }

    private d(Context context) {
        this.asQ = context.getApplicationContext().getSharedPreferences("IQOptions", 0);
        this.asR = context.getApplicationContext().getSharedPreferences("app_pref_name", 0);
    }

    public final SharedPreferences Fb() {
        return this.asQ;
    }

    @NonNull
    public final SharedPreferences W(long j) {
        IQApp Eu = IQApp.Eu();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IQOptions-user-");
        stringBuilder.append(j);
        return Eu.getSharedPreferences(stringBuilder.toString(), 0);
    }

    @SuppressLint({"ApplySharedPref"})
    public void dH(String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "logout").setParameters(u.anp().o("reason", str).anr()).build());
        String str2 = "";
        String str3 = "price_movements_push_ids";
        this.asR.edit().remove("dfa405f2049312ca").putLong("75ce4279b0ae", 0).putLong("time_request_two_step_auth_confirm", 0).putLong("time_request_two_step_auth_login", 0).putString("two_step_auth_user", str2).putString("two_step_auth_password", str2).putString("two_step_auth_phone_mask", str2).putInt("security_tab", -1).putLong("time_install", 0).putBoolean("is_auto_subscribe_pricemovements_firebase_push_done", false).putBoolean("is_price_movements_attention_shown_and_confirmed", false).putString("3bab737a076b", null).putLong("a63e971afa3e", 0).putStringSet(str3, Collections.emptySet()).putBoolean("features_from_socket", false).commit();
        this.asQ.edit().remove("gdpr_accepted").remove("gdpr_email_accepted").remove("gdpr_push_accepted").remove("gdpr_call_accepted").remove("gdpr_third_party_accepted").remove("client_category_id").remove("forget_user_status").remove("forget_user_created").remove("forget_user_expired").commit();
    }

    public double Fc() {
        int i = this.asQ.getInt("last_bet", 0);
        double d = (double) i;
        if (i < 100) {
            return d;
        }
        Double.isNaN(d);
        return d / 100.0d;
    }

    public void j(double d) {
        this.asQ.edit().putString("last_amount", Double.toString(d)).apply();
    }

    public double Fd() {
        try {
            return Double.parseDouble(this.asQ.getString("last_amount", ""));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public void k(double d) {
        if (d > 0.0d) {
            try {
                Object Fe = Fe();
                Iterator it = Fe.iterator();
                while (it.hasNext()) {
                    if (((Double) it.next()).equals(Double.valueOf(d))) {
                        return;
                    }
                }
                Fe.addFirst(Double.valueOf(d));
                if (Fe.size() > 10) {
                    Fe.removeLast();
                }
                this.asQ.edit().putString("last_amounts", w.aWM().toJson(Fe)).apply();
            } catch (Exception unused) {
            }
        }
    }

    public LinkedList<Double> Fe() {
        LinkedList linkedList = new LinkedList();
        try {
            LinkedList linkedList2 = (LinkedList) w.aWM().fromJson(this.asQ.getString("last_amounts", ""), new TypeToken<LinkedList<Double>>() {
            }.getType());
            if (linkedList2 != null) {
                linkedList.addAll(linkedList2);
            }
        } catch (Exception unused) {
        }
        if (linkedList.size() == 0) {
            linkedList.add(Double.valueOf(Fd()));
        }
        return linkedList;
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        String string = this.asQ.getString("option_type", "");
        return !TextUtils.isEmpty(string) ? InstrumentType.fromServerValue(string) : null;
    }

    public String Ff() {
        return this.asQ.getString("retarget_promo", "");
    }

    public void dI(String str) {
        this.asQ.edit().putString("retarget_promo", str).apply();
    }

    public String Fg() {
        return this.asQ.getString("retarget_message", "");
    }

    public void dJ(String str) {
        this.asQ.edit().putString("retarget_message", str).apply();
    }

    public void dK(int i) {
        this.asQ.edit().putInt("loyal", i).apply();
    }

    public int Fh() {
        return this.asQ.getInt("loyal", 0);
    }

    public int Fi() {
        return this.asQ.getInt("bet_count", 0);
    }

    public void dL(int i) {
        this.asQ.edit().putInt("bet_count", i).apply();
    }

    public void aT(boolean z) {
        this.asQ.edit().putBoolean("foreground_app_state", z).apply();
    }

    public boolean Fj() {
        return this.asQ.getBoolean("foreground_app_state", false);
    }

    public void Fk() {
        this.asQ.edit().putBoolean("trial_was_registration", true).apply();
    }

    public boolean Fl() {
        return this.asQ.getBoolean("trial_was_registration", false);
    }

    public boolean Fm() {
        return this.asQ.getBoolean("one_click_buying", false);
    }

    public void aU(boolean z) {
        this.asQ.edit().putBoolean("one_click_buying", z).apply();
    }

    public static boolean a(d dVar) {
        if (dVar.Er()) {
            return false;
        }
        return b.WB().Wv();
    }

    public boolean Fn() {
        return this.asQ.getBoolean("margin_add_on", a(this));
    }

    public void aV(boolean z) {
        this.asQ.edit().putBoolean("margin_add_on", z).apply();
    }

    public boolean Fo() {
        return this.asQ.getBoolean("trailig_stop_setting", false);
    }

    public void aW(boolean z) {
        this.asQ.edit().putBoolean("trailig_stop_setting", z).apply();
    }

    public boolean Fp() {
        return this.asQ.getBoolean("hi_low_chart", true);
    }

    public void aX(boolean z) {
        this.asQ.edit().putBoolean("hi_low_chart", z).apply();
    }

    public void X(long j) {
        this.asQ.edit().putLong("download_update_id", j).apply();
    }

    public long Fq() {
        return this.asQ.getLong("download_update_id", -1);
    }

    public int Fr() {
        return this.asQ.getInt("countExpiratesFinished", 0);
    }

    public void dM(int i) {
        this.asQ.edit().putInt("countExpiratesFinished", i).apply();
    }

    public String getVersion() {
        return this.asQ.getString("version", "");
    }

    public void dK(String str) {
        this.asQ.edit().putString("version", str).apply();
    }

    public int Fs() {
        return this.asQ.getInt("app_lounch_count", 0);
    }

    public boolean Ft() {
        return !b.WB().Wv() || Fv() > 1;
    }

    public void Fu() {
        this.asQ.edit().putInt("app_lounch_count", Fs() + 1).apply();
    }

    public long Fv() {
        return this.asQ.getLong("trade_room_launch_count", 0);
    }

    public void Fw() {
        this.asQ.edit().putLong("trade_room_launch_count", Fv() + 1).apply();
    }

    public boolean Fx() {
        return this.asQ.getBoolean("achieve_5000", false);
    }

    public void aY(boolean z) {
        this.asQ.edit().putBoolean("achieve_5000", z).apply();
    }

    public boolean Fy() {
        return this.asQ.getBoolean("is_send_apps_flyer_device_id", false);
    }

    public void aZ(boolean z) {
        this.asQ.edit().putBoolean("is_send_apps_flyer_device_id", z).apply();
    }

    public boolean Fz() {
        return this.asQ.getInt("regulation_state", -1) != -1;
    }

    public boolean Er() {
        int i = this.asQ.getInt("regulation_state", -1);
        return i == asO || i == -1;
    }

    public void dN(int i) {
        this.asQ.edit().putInt("regulation_state", i).apply();
    }

    public int dL(String str) {
        return this.asQ.getInt(str, 0);
    }

    public void r(String str, int i) {
        this.asQ.edit().putInt(str, i).apply();
    }

    public void ba(boolean z) {
        this.asR.edit().putBoolean("trade_now_was_invoked", z).apply();
    }

    public void bb(boolean z) {
        this.asR.edit().putBoolean("should_play_sound", z).apply();
    }

    public boolean FA() {
        return this.asR.getBoolean("should_play_sound", false);
    }

    public void bc(boolean z) {
        this.asR.edit().putBoolean("tick_notification", z).apply();
    }

    public boolean FB() {
        return this.asR.getBoolean("tick_notification", true);
    }

    public void bd(boolean z) {
        this.asR.edit().putBoolean("small_deal_expirable", z).apply();
    }

    public boolean FC() {
        return this.asR.getBoolean("small_deal_expirable", true);
    }

    public void be(boolean z) {
        this.asR.edit().putBoolean("small_deal_non_expirable", z).apply();
    }

    public boolean FD() {
        return this.asR.getBoolean("small_deal_non_expirable", true);
    }

    public void bf(boolean z) {
        this.asR.edit().putBoolean("fx_options_next_expiration_popup", z).apply();
    }

    public boolean FE() {
        return this.asR.getBoolean("fx_options_next_expiration_popup", true);
    }

    public String DB() {
        return this.asR.getString("aff", null);
    }

    public void dM(String str) {
        this.asR.edit().putString("aff", str).apply();
    }

    public String FF() {
        return this.asR.getString("afftrack", null);
    }

    public void dN(String str) {
        this.asR.edit().putString("afftrack", str).apply();
    }

    public String FG() {
        return this.asR.getString("retrack", null);
    }

    public void dO(String str) {
        this.asR.edit().putString("retrack", str).apply();
    }

    public void Y(long j) {
        this.asR.edit().putLong("time_retrack", j).apply();
    }

    public long FH() {
        return this.asR.getLong("time_retrack", 0);
    }

    public void dP(String str) {
        this.asR.edit().putString("device_id", str).apply();
    }

    public String getDeviceId() {
        return this.asR.getString("device_id", "");
    }

    public void bg(boolean z) {
        this.asQ.edit().putBoolean("first_launch_after_update_app", z).apply();
    }

    public void bh(boolean z) {
        this.asQ.edit().putBoolean("first_launch_after_install", z).apply();
    }

    public void dQ(String str) {
        this.asR.edit().putString("fcm_token", str).apply();
    }

    public void dR(String str) {
        if (!TextUtils.equals(str, FI())) {
            this.asR.edit().putString("fcm_token", str).apply();
            IQApp.Ex().bt(new com.iqoption.core.b.b(str));
        }
    }

    public String FI() {
        return this.asR.getString("fcm_token", "");
    }

    public void Z(long j) {
        this.asR.edit().putLong("time_request_two_step_auth_confirm", j).apply();
    }

    public long FJ() {
        return this.asR.getLong("time_request_two_step_auth_confirm", 0);
    }

    public void dO(int i) {
        this.asR.edit().putInt("two_step_auth_confirm_code", i).apply();
    }

    public int FK() {
        return this.asR.getInt("two_step_auth_confirm_code", 0);
    }

    public void dP(int i) {
        this.asR.edit().putInt("security_tab", i).apply();
    }

    public int FL() {
        return this.asR.getInt("security_tab", -1);
    }

    public void aa(long j) {
        ab(System.currentTimeMillis() + ((long) PasscodeFragment.cZU));
        long FM = FM();
        if (j != FM) {
            this.asR.edit().putLong("dfa405f2049312ca", j).apply();
            IQApp.Ex().bd(new e.b().setValue(Long.valueOf(j)));
            if (FM == -1) {
                IQApp Eu = IQApp.Eu();
                k.f(Eu, 536870912);
                if (c.bL(Eu)) {
                    k.f(Eu, 1073741824);
                }
            }
        }
    }

    public long FM() {
        return this.asR.getLong("dfa405f2049312ca", -1);
    }

    public void ab(long j) {
        this.asR.edit().putLong("75ce4279b0ae", j).apply();
    }

    public long FN() {
        return this.asR.getLong("75ce4279b0ae", 0);
    }

    public long FO() {
        return this.asQ.getLong("time_install", 0);
    }

    public void ac(long j) {
        this.asQ.edit().putLong("time_install", j).apply();
    }

    public boolean FP() {
        return this.asQ.getBoolean("user_is_mql", false);
    }

    public void bi(boolean z) {
        this.asQ.edit().putBoolean("user_is_mql", z).apply();
    }

    public void dQ(int i) {
        this.asR.edit().putInt("count_use_feature", i).apply();
    }

    public int FQ() {
        return this.asR.getInt("count_use_feature", 0);
    }

    public boolean FR() {
        return this.asQ.getBoolean("mode_amount_keyboard", false);
    }

    public void bj(boolean z) {
        this.asQ.edit().putBoolean("mode_amount_keyboard", z).apply();
    }

    public boolean FS() {
        return this.asQ.getBoolean("first_launch_keyboard", true);
    }

    public void FT() {
        this.asQ.edit().putBoolean("first_launch_keyboard", false).apply();
    }

    public void dS(String str) {
        this.asR.edit().putString("coefficient_string", str).apply();
    }

    public String FU() {
        return this.asR.getString("coefficient_string", "2.0");
    }

    public void dR(int i) {
        this.asR.edit().putInt("keyboard_preset_type", i).apply();
    }

    public int FV() {
        return this.asR.getInt("keyboard_preset_type", CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    public boolean FW() {
        return this.asQ.getBoolean("is_price_movements_attention_shown_and_confirmed", false);
    }

    public void bk(boolean z) {
        this.asQ.edit().putBoolean("is_price_movements_attention_shown_and_confirmed", z).apply();
    }

    public Set<Long> FX() {
        return Sets.x(s.a(this.asQ.getStringSet("price_movements_push_ids", Collections.emptySet()), -$$Lambda$iVmS8LTWYngF4JqCHb6KMZ1G1bw.INSTANCE));
    }

    public void a(long j, boolean z) {
        Iterable FX = FX();
        if (z) {
            FX.add(Long.valueOf(j));
        } else {
            FX.remove(Long.valueOf(j));
        }
        this.asQ.edit().putStringSet("price_movements_push_ids", Sets.x(s.a(FX, -$$Lambda$C4jfa8iR5Gsy3ngb1_5aQPBc2HU.INSTANCE))).apply();
    }

    public void ad(long j) {
        this.asR.edit().putLong("app_close_time", j).apply();
    }

    public long FY() {
        return this.asR.getLong("app_close_time", 0);
    }

    public void ae(long j) {
        this.asR.edit().putLong("app_suspend_time", j).apply();
    }

    public boolean dT(String str) {
        SharedPreferences sharedPreferences = this.asQ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showed_whats_new");
        stringBuilder.append(str);
        return sharedPreferences.getBoolean(stringBuilder.toString(), false);
    }

    public void c(boolean z, String str) {
        Editor edit = this.asQ.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showed_whats_new");
        stringBuilder.append(str);
        edit.putBoolean(stringBuilder.toString(), z).apply();
    }

    public boolean FZ() {
        return this.asQ.getBoolean("more_opportunities_shown", false);
    }

    public void bl(boolean z) {
        this.asQ.edit().putBoolean("more_opportunities_shown", z).apply();
    }

    public boolean Ga() {
        return this.asQ.getBoolean("more_opportunities_button_clicked", false);
    }

    public void bm(boolean z) {
        this.asQ.edit().putBoolean("more_opportunities_button_clicked", z).apply();
    }

    public boolean Gb() {
        return this.asQ.getBoolean("more_opportunities_button_clicked", false);
    }

    public void bn(boolean z) {
        this.asQ.edit().putBoolean("more_opportunities_button_clicked", z).apply();
    }

    public boolean Gc() {
        return this.asQ.getBoolean("fx_button_clicked", false);
    }

    public void bo(boolean z) {
        this.asQ.edit().putBoolean("fx_button_clicked", z).apply();
    }

    @Nullable
    public StatusType af(long j) {
        String string = W(j).getString("pro_trader_application_status", null);
        if (string != null) {
            return StatusType.fromServerValue(string);
        }
        return null;
    }

    public void a(long j, @Nullable StatusType statusType) {
        W(j).edit().putString("pro_trader_application_status", statusType != null ? statusType.getServerValue() : null).apply();
    }

    public boolean Gd() {
        return this.asQ.getBoolean("sell_with_confirmation_forex", true);
    }

    public void bp(boolean z) {
        this.asQ.edit().putBoolean("sell_with_confirmation_forex", z).apply();
    }

    public boolean Ge() {
        return this.asQ.getBoolean("latest_movements_state", true);
    }

    public void bq(boolean z) {
        this.asQ.edit().putBoolean("latest_movements_state", z).apply();
    }

    public boolean Gf() {
        return this.asQ.getBoolean("expiration_panel_state", true);
    }

    public void br(boolean z) {
        this.asQ.edit().putBoolean("expiration_panel_state", z).apply();
    }

    public boolean Gg() {
        return this.asQ.getBoolean("investment_amount_state", false);
    }

    public void bs(boolean z) {
        this.asQ.edit().putBoolean("investment_amount_state", z).apply();
    }

    public void h(Boolean bool) {
        this.asQ.edit().putBoolean("isRegistrationLaunchKyc", bool.booleanValue()).apply();
    }

    public void bt(boolean z) {
        this.asQ.edit().putBoolean("margin_add_on_was_enabled", z).apply();
    }

    public boolean Gh() {
        return this.asQ.getBoolean("margin_add_on_was_enabled", false);
    }

    public void dS(int i) {
        this.asQ.edit().putInt("margin_add_on_missed_deals", i).apply();
    }

    public int Gi() {
        return this.asQ.getInt("margin_add_on_missed_deals", 0);
    }

    public void Gj() {
        this.asQ.edit().putInt("margin_add_on_dialog_shown", Gk() + 1).apply();
    }

    public int Gk() {
        return this.asQ.getInt("margin_add_on_dialog_shown", 0);
    }

    public void dU(String str) {
        this.asQ.edit().putString("feature_identity", str).apply();
    }

    public void bu(boolean z) {
        this.asQ.edit().putBoolean("features_from_socket", z).apply();
    }

    public boolean Gl() {
        return this.asQ.getBoolean("features_from_socket", false);
    }

    public String Gm() {
        return this.asQ.getString("feature_identity", "");
    }

    public void dV(String str) {
        this.asQ.edit().putString("welcome_feature_name", str).apply();
    }

    public static boolean dW(String str) {
        return Fa().asQ.getBoolean(str, true);
    }

    public static boolean dX(String str) {
        return Fa().asQ.getBoolean(str, false);
    }

    public static boolean get(String str, boolean z) {
        return aP(IQApp.Eu()).asQ.getBoolean(str, z);
    }

    public static boolean i(String str, boolean z) {
        Fa().asQ.edit().putBoolean(str, z).apply();
        return z;
    }

    public static int getInt(String str) {
        return Fa().asQ.getInt(str, 0);
    }

    public static void setInt(String str, int i) {
        Fa().asQ.edit().putInt(str, i).apply();
    }

    public static long getLong(String str) {
        return Fa().asQ.getLong(str, 0);
    }

    public static void setLong(String str, long j) {
        Fa().asQ.edit().putLong(str, j).apply();
    }
}
