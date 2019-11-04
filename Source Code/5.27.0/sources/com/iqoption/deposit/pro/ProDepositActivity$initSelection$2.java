package com.iqoption.deposit.pro;

import android.content.Intent;
import com.iqoption.deposit.l;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/InitSelectOption;", "invoke"})
/* compiled from: ProDepositActivity.kt */
final class ProDepositActivity$initSelection$2 extends Lambda implements a<l> {
    final /* synthetic */ a this$0;

    ProDepositActivity$initSelection$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: ata */
    public final l invoke() {
        Intent intent = this.this$0.getIntent();
        return intent != null ? (l) intent.getParcelableExtra("ARG_INIT_SELECTION") : null;
    }
}
