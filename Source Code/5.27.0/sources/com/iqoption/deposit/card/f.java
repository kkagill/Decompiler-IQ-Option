package com.iqoption.deposit.card;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.e;
import com.airbnb.lottie.o;
import com.iqoption.deposit.b.br;
import com.iqoption.deposit.o.g;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"Lcom/iqoption/deposit/card/NfcScanFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/core/ui/fragment/FragmentNewIntent;", "()V", "adapter", "Landroid/nfc/NfcAdapter;", "binding", "Lcom/iqoption/deposit/databinding/NfcScanFragmentBinding;", "navigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "getNavigator", "()Lcom/iqoption/core/ui/navigation/StackNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "scanViewModel", "Lcom/iqoption/deposit/card/ScanViewModel;", "scanner", "Lcom/iqoption/deposit/card/NfcCardScanner;", "initViews", "", "loadAnim", "path", "", "loadCallback", "Lkotlin/Function1;", "Lcom/airbnb/lottie/LottieComposition;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFirstAnimationComplete", "onNewIntent", "", "intent", "Landroid/content/Intent;", "onPause", "onResume", "showNfcSettingsDialog", "Companion", "deposit_release"})
/* compiled from: NfcScanFragment.kt */
public final class f extends com.iqoption.core.ui.fragment.d implements com.iqoption.core.ui.fragment.c {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(f.class), "navigator", "getNavigator()Lcom/iqoption/core/ui/navigation/StackNavigator;"))};
    public static final a cxR = new a();
    private HashMap apm;
    private NfcAdapter cxM;
    private ScanViewModel cxN;
    private br cxO;
    private final e cxP = new e();
    private final kotlin.d cxQ = g.c(new NfcScanFragment$navigator$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, bng = {"Lcom/iqoption/deposit/card/NfcScanFragment$Companion;", "", "()V", "FIRST_ANIM_PATH", "", "SECOND_ANIM_PATH", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: NfcScanFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return f.TAG;
        }

        public final com.iqoption.core.ui.d.c apA() {
            return new com.iqoption.core.ui.d.c(Bx(), f.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "onCompositionLoaded"})
    /* compiled from: NfcScanFragment.kt */
    static final class b implements o {
        final /* synthetic */ kotlin.jvm.a.b cxV;

        b(kotlin.jvm.a.b bVar) {
            this.cxV = bVar;
        }

        public final void d(e eVar) {
            if (eVar != null) {
                kotlin.jvm.a.b bVar = this.cxV;
                kotlin.jvm.internal.i.e(eVar, "it");
                bVar.invoke(eVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "nfcCardResource", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: NfcScanFragment.kt */
    static final class c<T> implements Observer<com.iqoption.core.ui.d<com.iqoption.deposit.card.e.a>> {
        final /* synthetic */ f this$0;

        c(f fVar) {
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<com.iqoption.deposit.card.e.a> dVar) {
            if (dVar != null) {
                int i = g.aob[dVar.akW().ordinal()];
                if (i == 1) {
                    return;
                }
                if (i == 2) {
                    com.iqoption.core.d.a(g.unknown_error_occurred, 0, 2, null);
                    this.this$0.apw().alG();
                } else if (i == 3) {
                    if (dVar.getData() != null) {
                        ScanViewModel b = f.b(this.this$0);
                        Object data = dVar.getData();
                        if (data == null) {
                            kotlin.jvm.internal.i.bnJ();
                        }
                        b.d((com.iqoption.deposit.card.e.a) data);
                    } else {
                        com.iqoption.core.d.a(g.unknown_error_occurred, 0, 2, null);
                    }
                    this.this$0.apw().alG();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, bng = {"com/iqoption/deposit/card/NfcScanFragment$showNfcSettingsDialog$dialog$1", "Lcom/iqoption/dialogs/SimpleDialog$Config;", "actionConfig1", "Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "getActionConfig1", "()Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "actionConfig2", "getActionConfig2", "styling", "Lcom/iqoption/dialogs/SimpleDialog$Styling;", "getStyling", "()Lcom/iqoption/dialogs/SimpleDialog$Styling;", "text", "", "getText", "()Ljava/lang/CharSequence;", "title", "getTitle", "deposit_release"})
    /* compiled from: NfcScanFragment.kt */
    public static final class d implements com.iqoption.dialogs.f.c {
        private final com.iqoption.dialogs.f.d cxW = com.iqoption.dialogs.f.cLt.auF();
        final /* synthetic */ f this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, bng = {"com/iqoption/deposit/card/NfcScanFragment$showNfcSettingsDialog$dialog$1$actionConfig1$1", "Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "onClick", "", "dialog", "Lcom/iqoption/dialogs/SimpleDialog;", "deposit_release"})
        /* compiled from: NfcScanFragment.kt */
        public static final class a implements com.iqoption.dialogs.f.a {
            final /* synthetic */ d cxX;

            a(d dVar) {
                this.cxX = dVar;
            }

            public CharSequence getLabel() {
                String string = this.cxX.this$0.getString(g.ok);
                kotlin.jvm.internal.i.e(string, "getString(R.string.ok)");
                return string;
            }

            public void a(com.iqoption.dialogs.f fVar) {
                kotlin.jvm.internal.i.f(fVar, "dialog");
                FragmentActivity activity = this.cxX.this$0.getActivity();
                if (activity != null) {
                    activity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
                }
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, bng = {"com/iqoption/deposit/card/NfcScanFragment$showNfcSettingsDialog$dialog$1$actionConfig2$1", "Lcom/iqoption/dialogs/SimpleDialog$ActionConfig;", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "onClick", "", "dialog", "Lcom/iqoption/dialogs/SimpleDialog;", "deposit_release"})
        /* compiled from: NfcScanFragment.kt */
        public static final class b implements com.iqoption.dialogs.f.a {
            final /* synthetic */ d cxX;

            b(d dVar) {
                this.cxX = dVar;
            }

            public CharSequence getLabel() {
                String string = this.cxX.this$0.getString(g.cancel);
                kotlin.jvm.internal.i.e(string, "getString(R.string.cancel)");
                return string;
            }

            public void a(com.iqoption.dialogs.f fVar) {
                kotlin.jvm.internal.i.f(fVar, "dialog");
                if (this.cxX.this$0.isAdded()) {
                    this.cxX.this$0.apw().alG();
                }
            }
        }

        d(f fVar) {
            this.this$0 = fVar;
        }

        public boolean apF() {
            return com.iqoption.dialogs.f.c.a.c(this);
        }

        public CharSequence apG() {
            return com.iqoption.dialogs.f.c.a.b(this);
        }

        public int getMaxWidth() {
            return com.iqoption.dialogs.f.c.a.d(this);
        }

        public void onDismiss() {
            com.iqoption.dialogs.f.c.a.e(this);
        }

        public com.iqoption.dialogs.f.d apC() {
            return this.cxW;
        }

        public CharSequence getTitle() {
            String string = this.this$0.getString(g.nfc_disabled);
            kotlin.jvm.internal.i.e(string, "getString(R.string.nfc_disabled)");
            return string;
        }

        public CharSequence getText() {
            String string = this.this$0.getString(g.please_turn_on_nfc);
            kotlin.jvm.internal.i.e(string, "getString(R.string.please_turn_on_nfc)");
            return string;
        }

        public com.iqoption.dialogs.f.a apD() {
            return new a(this);
        }

        public com.iqoption.dialogs.f.a apE() {
            return new b(this);
        }
    }

    private final com.iqoption.core.ui.d.g apw() {
        kotlin.d dVar = this.cxQ;
        j jVar = anY[0];
        return (com.iqoption.core.ui.d.g) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ ScanViewModel b(f fVar) {
        ScanViewModel scanViewModel = fVar.cxN;
        if (scanViewModel == null) {
            kotlin.jvm.internal.i.lG("scanViewModel");
        }
        return scanViewModel;
    }

    public static final /* synthetic */ br c(f fVar) {
        br brVar = fVar.cxO;
        if (brVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return brVar;
    }

    static {
        String name = f.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cxM = NfcAdapter.getDefaultAdapter(getContext());
        this.cxN = ScanViewModel.cxY.E(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.cxM == null) {
            apw().alG();
        }
        this.cxO = (br) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.nfc_scan_fragment, viewGroup, false, 4, null);
        apy();
        br brVar = this.cxO;
        if (brVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return brVar.getRoot();
    }

    public void onResume() {
        super.onResume();
        NfcAdapter nfcAdapter = this.cxM;
        if (nfcAdapter == null) {
            return;
        }
        if (nfcAdapter.isEnabled()) {
            IntentFilter[] intentFilterArr = new IntentFilter[]{new IntentFilter("android.nfc.action.TECH_DISCOVERED"), new IntentFilter("android.nfc.action.TAG_DISCOVERED")};
            String[][] strArr = new String[1][];
            strArr[0] = new String[]{NfcA.class.getName(), IsoDep.class.getName(), NfcB.class.getName()};
            strArr = strArr;
            nfcAdapter.enableForegroundDispatch(getActivity(), PendingIntent.getActivity(com.iqoption.core.ext.a.r(this), 0, new Intent(com.iqoption.core.ext.a.r(this), com.iqoption.core.ext.a.r(this).getClass()).addFlags(536870912), 0), intentFilterArr, strArr);
            return;
        }
        apx();
    }

    public void onPause() {
        super.onPause();
        NfcAdapter nfcAdapter = this.cxM;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(getActivity());
        }
    }

    public boolean o(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        if (!this.cxP.p(intent)) {
            return false;
        }
        this.cxP.q(intent).observe(this, new c(this));
        return true;
    }

    private final void apx() {
        com.iqoption.core.ext.a.t(this).beginTransaction().add(com.iqoption.deposit.o.e.nfcScanTitle, com.iqoption.dialogs.f.cLt.a(new d(this)), com.iqoption.dialogs.f.cLt.Bx()).commitAllowingStateLoss();
    }

    private final void apy() {
        String string = getString(g.tip);
        kotlin.jvm.internal.i.e(string, "getString(R.string.tip)");
        String string2 = getString(g.tip_nfc_n1, string);
        kotlin.jvm.internal.i.e(string2, "getString(R.string.tip_nfc_n1, tipString)");
        CharSequence charSequence = string2;
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new StyleSpan(1), v.a(charSequence, string, 0, false, 6, null), string.length(), 17);
        br brVar = this.cxO;
        if (brVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = brVar.cDL;
        kotlin.jvm.internal.i.e(textView, "binding.tipText");
        textView.setText(spannableString);
        d("lottie/nfc/nfc_1.json", new NfcScanFragment$initViews$1(this));
    }

    private final void apz() {
        br brVar = this.cxO;
        if (brVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewCompat.animate(brVar.cDL).alpha(1.0f).setDuration(200).start();
        d("lottie/nfc/nfc_2.json", new NfcScanFragment$onFirstAnimationComplete$1(this));
    }

    private final void d(String str, kotlin.jvm.a.b<? super e, l> bVar) {
        com.airbnb.lottie.e.a.a(getContext(), str, new b(bVar));
    }
}
