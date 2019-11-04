package com.iqoption.kyc.document.history;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.c;
import io.reactivex.b.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/document/history/KycDocumentsHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getDocumentHistory", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "Companion", "kyc_release"})
/* compiled from: KycDocumentsHistoryViewModel.kt */
public final class d extends ViewModel {
    public static final a dxC = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/document/history/KycDocumentsHistoryViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/document/history/KycDocumentsHistoryViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycDocumentsHistoryViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d aq(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…oryViewModel::class.java)");
            return (d) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "it", "", "apply"})
    /* compiled from: KycDocumentsHistoryViewModel.kt */
    static final class b<T, R> implements g<Throwable, List<? extends c>> {
        public static final b dxD = new b();

        b() {
        }

        /* renamed from: r */
        public final List<c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    public final LiveData<List<c>> n(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "type");
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.kyc.a.c(verificationType).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).u(b.dxD).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }
}
