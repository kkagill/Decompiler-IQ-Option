package com.iqoption.core.data.d;

import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR$\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u0006'"}, bng = {"Lcom/iqoption/core/data/prefs/CrossLogoutUserPrefs;", "", "userId", "", "(J)V", "value", "", "isFirstDemoBetSent", "()Z", "setFirstDemoBetSent", "(Z)V", "isFirstDepositSent", "setFirstDepositSent", "isFirstRealBetSent", "setFirstRealBetSent", "isProTraderLeftMenuHidden", "setProTraderLeftMenuHidden", "isRegistrationLaunch", "setRegistrationLaunch", "prefs", "Lcom/iqoption/core/data/prefs/Prefs;", "", "selectedActiveId", "getSelectedActiveId", "()I", "setSelectedActiveId", "(I)V", "Lcom/iqoption/core/data/model/InstrumentType;", "selectedInstrumentType", "getSelectedInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "setSelectedInstrumentType", "(Lcom/iqoption/core/data/model/InstrumentType;)V", "timeRequestPhoneConfirm", "getTimeRequestPhoneConfirm", "()J", "setTimeRequestPhoneConfirm", "getUserId", "Companion", "core_release"})
/* compiled from: CrossLogoutUserPrefs.kt */
public final class b {
    private static b bdj;
    public static final a bdk = new a();
    private final c bdh;
    private final long userId;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/data/prefs/CrossLogoutUserPrefs$Companion;", "", "()V", "BLUE_FIRST_DEPOSIT", "", "FIRST_DEMO_BET_SEND", "FIRST_REAL_BET_SEND", "IS_REGISTRATION_LAUNCH", "PRO_TRADER_LEFT_MENU_HIDDEN", "SELECTED_ACTIVE_ID", "SELECTED_INSTRUMENT_TYPE", "TIME_REQUEST_PHONE_CONFIRM", "instance", "Lcom/iqoption/core/data/prefs/CrossLogoutUserPrefs;", "get", "userId", "", "getForCurrentUser", "core_release"})
    /* compiled from: CrossLogoutUserPrefs.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b WB() {
            return aH(d.EA().getUserId());
        }

        /* JADX WARNING: Missing block: B:8:0x0018, code skipped:
            if (r0 != null) goto L_0x003c;
     */
        public final com.iqoption.core.data.d.b aH(long r8) {
            /*
            r7 = this;
            r0 = com.iqoption.core.data.d.b.bdj;
            r1 = 0;
            r2 = 1;
            r3 = 0;
            if (r0 == 0) goto L_0x001b;
        L_0x0009:
            r4 = r0.getUserId();
            r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
            if (r6 != 0) goto L_0x0013;
        L_0x0011:
            r4 = 1;
            goto L_0x0014;
        L_0x0013:
            r4 = 0;
        L_0x0014:
            if (r4 == 0) goto L_0x0017;
        L_0x0016:
            goto L_0x0018;
        L_0x0017:
            r0 = r1;
        L_0x0018:
            if (r0 == 0) goto L_0x001b;
        L_0x001a:
            goto L_0x003c;
        L_0x001b:
            monitor-enter(r7);
            r0 = com.iqoption.core.data.d.b.bdj;	 Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0033;
        L_0x0022:
            r4 = r0.getUserId();	 Catch:{ all -> 0x003d }
            r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
            if (r6 != 0) goto L_0x002b;
        L_0x002a:
            goto L_0x002c;
        L_0x002b:
            r2 = 0;
        L_0x002c:
            if (r2 == 0) goto L_0x002f;
        L_0x002e:
            goto L_0x0030;
        L_0x002f:
            r0 = r1;
        L_0x0030:
            if (r0 == 0) goto L_0x0033;
        L_0x0032:
            goto L_0x003b;
        L_0x0033:
            r0 = new com.iqoption.core.data.d.b;	 Catch:{ all -> 0x003d }
            r0.<init>(r8);	 Catch:{ all -> 0x003d }
            com.iqoption.core.data.d.b.bdj = r0;	 Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r7);
        L_0x003c:
            return r0;
        L_0x003d:
            r8 = move-exception;
            monitor-exit(r7);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.data.d.b$a.aH(long):com.iqoption.core.data.d.b");
        }
    }

    public static final b WB() {
        return bdk.WB();
    }

    public static final b aH(long j) {
        return bdk.aH(j);
    }

    public b(long j) {
        this.userId = j;
        com.iqoption.core.data.d.c.a aVar = c.bdl;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IQOptions-user-");
        stringBuilder.append(this.userId);
        this.bdh = aVar.fL(stringBuilder.toString());
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int Wt() {
        return this.bdh.getInt("selected_active_id", -1);
    }

    public final void eI(int i) {
        this.bdh.put("selected_active_id", i);
    }

    public final InstrumentType Wu() {
        return InstrumentType.Companion.fromServerValueNullable(com.iqoption.core.data.d.c.b.a(this.bdh, "selected_instrument_type_value", null, 2, null));
    }

    public final void D(InstrumentType instrumentType) {
        this.bdh.put("selected_instrument_type_value", instrumentType != null ? instrumentType.getServerValue() : null);
    }

    public final boolean Wv() {
        return com.iqoption.core.data.d.c.b.a(this.bdh, "isRegistrationLaunch", false, 2, null) || e.bdq.WF() || e.bdq.WG();
    }

    public final void cr(boolean z) {
        this.bdh.put("isRegistrationLaunch", z);
    }

    public final boolean Ww() {
        return com.iqoption.core.data.d.c.b.a(this.bdh, "blue_first_deposit", false, 2, null) || e.bdq.WH();
    }

    public final void cs(boolean z) {
        this.bdh.put("blue_first_deposit", z);
    }

    public final boolean Wx() {
        return com.iqoption.core.data.d.c.b.a(this.bdh, "first_real_bet_sent", false, 2, null) || e.bdq.WI();
    }

    public final void ct(boolean z) {
        this.bdh.put("first_real_bet_sent", z);
    }

    public final boolean Wy() {
        return com.iqoption.core.data.d.c.b.a(this.bdh, "first_demo_bet_sent", false, 2, null) || e.bdq.WJ();
    }

    public final void cu(boolean z) {
        this.bdh.put("first_demo_bet_sent", z);
    }

    public final long Wz() {
        return com.iqoption.core.data.d.c.b.a(this.bdh, "time_request_phone_confirm", 0, 2, null);
    }

    public final void aG(long j) {
        this.bdh.put("time_request_phone_confirm", j);
    }
}
