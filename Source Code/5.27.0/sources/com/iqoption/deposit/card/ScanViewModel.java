package com.iqoption.deposit.card;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.deposit.k;
import com.iqoption.deposit.o.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/deposit/card/ScanViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "setNfcScanCard", "", "data", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "Companion", "ScanItem", "deposit_release"})
/* compiled from: ScanViewModel.kt */
public final class ScanViewModel extends ViewModel {
    public static final a cxY = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "", "titleRes", "", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "CAMERA", "NFC", "deposit_release"})
    /* compiled from: ScanViewModel.kt */
    public enum ScanItem {
        CAMERA(g.scan_by_camera),
        NFC(g.scan_by_nfc);
        
        private final int titleRes;

        private ScanItem(int i) {
            this.titleRes = i;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/card/ScanViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/card/ScanViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: ScanViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final ScanViewModel E(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(ScanViewModel.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…canViewModel::class.java]");
            ScanViewModel scanViewModel = (ScanViewModel) viewModel;
            scanViewModel.cxD = k.cxn.C(fragment);
            return scanViewModel;
        }
    }

    public final void d(com.iqoption.deposit.card.e.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "data");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.a(aVar);
    }
}
