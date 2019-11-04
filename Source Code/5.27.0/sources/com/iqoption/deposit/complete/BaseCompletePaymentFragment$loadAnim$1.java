package com.iqoption.deposit.complete;

import com.airbnb.lottie.a;
import com.airbnb.lottie.e;
import io.reactivex.subjects.CompletableSubject;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "invoke"})
/* compiled from: BaseCompletePaymentFragment.kt */
final class BaseCompletePaymentFragment$loadAnim$1 extends Lambda implements b<e, l> {
    final /* synthetic */ CompletableSubject $callback;
    final /* synthetic */ a this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: BaseCompletePaymentFragment.kt */
    /* renamed from: com.iqoption.deposit.complete.BaseCompletePaymentFragment$loadAnim$1$1 */
    static final class AnonymousClass1 implements Runnable {
        final /* synthetic */ BaseCompletePaymentFragment$loadAnim$1 cyp;

        AnonymousClass1(BaseCompletePaymentFragment$loadAnim$1 baseCompletePaymentFragment$loadAnim$1) {
            this.cyp = baseCompletePaymentFragment$loadAnim$1;
        }

        public final void run() {
            this.cyp.this$0.apW().aa();
        }
    }

    BaseCompletePaymentFragment$loadAnim$1(a aVar, CompletableSubject completableSubject) {
        this.this$0 = aVar;
        this.$callback = completableSubject;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        f((e) obj);
        return l.eVB;
    }

    public final void f(e eVar) {
        if (this.this$0.isAdded()) {
            if (eVar != null) {
                this.this$0.apW().setComposition(eVar);
                this.this$0.apW().Z();
                Long apX = this.this$0.apX();
                if (apX != null) {
                    this.this$0.apW().ad();
                    this.this$0.apW().postDelayed(new AnonymousClass1(this), apX.longValue());
                }
            }
            this.this$0.cye = (a) null;
            this.$callback.onComplete();
        }
    }
}
