package com.iqoption.deposit;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/CurrencyProgressAnimations;", "", "()V", "defaultErrorAnimation", "Lcom/iqoption/deposit/CurrencyAnimation;", "defaultErrorLightAnimation", "defaultSuccessAnimation", "defaultSuccessLightAnimation", "makeAnimationsFromResIds", "Lcom/iqoption/deposit/CurrencyAnimations;", "progressRes", "", "successRes", "errorRes", "deposit_release"})
/* compiled from: CurrencyProgressAnimations.kt */
public final class c {
    public static final c cwH = new c();

    private c() {
    }

    public final b aoj() {
        return new b("lottie/completion/buy_sell_success_light.json");
    }

    public final b aok() {
        return new b("lottie/completion/buy_sell_fail_light.json");
    }
}
