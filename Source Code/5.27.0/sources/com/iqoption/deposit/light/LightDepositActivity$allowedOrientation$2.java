package com.iqoption.deposit.light;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: LightDepositActivity.kt */
final class LightDepositActivity$allowedOrientation$2 extends Lambda implements a<Integer> {
    final /* synthetic */ LightDepositActivity this$0;

    LightDepositActivity$allowedOrientation$2(LightDepositActivity lightDepositActivity) {
        this.this$0 = lightDepositActivity;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Integer.valueOf(Lk());
    }

    public final int Lk() {
        return this.this$0.getIntent().getIntExtra("ARG_ALLOWED_ORIENTATION", 4);
    }
}
