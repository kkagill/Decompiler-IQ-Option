package com.iqoption.app.managers.feature;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/app/managers/feature/SpotSettings;", "", "spotInstrumentFeatureName", "", "isSpotSwitcherStateOn", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "isShowSpotSwitcherFeatureEnabled", "()Z", "isSpotEnabled", "isSpotFeatureEnabled", "()Lkotlin/jvm/functions/Function0;", "Companion", "app_optionXRelease"})
/* compiled from: SpotSettings.kt */
public final class d {
    private static final d avV;
    private static final d avW;
    public static final a avX = new a();
    private final String avT;
    private final kotlin.jvm.a.a<Boolean> avU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/app/managers/feature/SpotSettings$Companion;", "", "()V", "ALWWAYS_ENABLE_SPOT", "Lcom/iqoption/app/managers/feature/SpotSettings;", "getALWWAYS_ENABLE_SPOT", "()Lcom/iqoption/app/managers/feature/SpotSettings;", "NO_SPOT", "getNO_SPOT", "app_optionXRelease"})
    /* compiled from: SpotSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d IK() {
            return d.avV;
        }

        public final d IL() {
            return d.avW;
        }
    }

    public d(String str, kotlin.jvm.a.a<Boolean> aVar) {
        kotlin.jvm.internal.i.f(str, "spotInstrumentFeatureName");
        kotlin.jvm.internal.i.f(aVar, "isSpotSwitcherStateOn");
        this.avT = str;
        this.avU = aVar;
    }

    static {
        String str = "";
        avV = new d(str, SpotSettings$Companion$NO_SPOT$1.avZ);
        avW = new d(str, SpotSettings$Companion$ALWWAYS_ENABLE_SPOT$1.avY);
    }

    public final boolean IF() {
        return (((CharSequence) this.avT).length() == 0 ? 1 : null) != null || a.ef(this.avT);
    }

    public final boolean IG() {
        if ((((CharSequence) this.avT).length() == 0 ? 1 : null) != null) {
            return true;
        }
        return kotlin.jvm.internal.i.y("enabled-on", a.eh(this.avT));
    }

    public final boolean IH() {
        if (!IF()) {
            return false;
        }
        if (IG()) {
            return ((Boolean) this.avU.invoke()).booleanValue();
        }
        return true;
    }
}
