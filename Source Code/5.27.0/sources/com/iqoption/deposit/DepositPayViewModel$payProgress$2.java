package com.iqoption.deposit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import io.reactivex.b.g;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: DepositPayViewModel.kt */
final class DepositPayViewModel$payProgress$2 extends Lambda implements a<LiveData<Boolean>> {
    final /* synthetic */ j this$0;

    DepositPayViewModel$payProgress$2(j jVar) {
        this.this$0 = jVar;
        super(0);
    }

    /* renamed from: aov */
    public final LiveData<Boolean> invoke() {
        return LiveDataReactiveStreams.fromPublisher(this.this$0.cwQ.d((g) AnonymousClass1.cwY));
    }
}
