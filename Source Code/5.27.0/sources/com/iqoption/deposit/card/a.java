package com.iqoption.deposit.card;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.iqoption.core.util.af;
import com.iqoption.core.util.ah;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import com.iqoption.deposit.n;
import io.card.payment.CardIOActivity;
import io.card.payment.CardType;
import io.card.payment.CreditCard;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\f\b&\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0019H&J\b\u0010\u001f\u001a\u00020\u0019H&J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0016J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u001bH&J\b\u0010&\u001a\u00020'H&J\u001c\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010*\u001a\u0004\u0018\u00010\"H&J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0,H&J\u0018\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010.0,H\u0004J\b\u0010/\u001a\u00020\u001bH&J\b\u00100\u001a\u000201H\u0004J\b\u00102\u001a\u000201H\u0004J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010,H\u0004J\u0012\u00104\u001a\u0002012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0004J\b\u00105\u001a\u000201H\u0004J\b\u00106\u001a\u00020\u001bH&J\"\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020.2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010<\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J-\u0010?\u001a\u00020\u00192\u0006\u00108\u001a\u00020.2\u000e\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0A2\u0006\u0010B\u001a\u00020CH\u0016¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020G2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010H\u001a\u00020\u0019H\u0002J\b\u0010I\u001a\u00020\u0019H\u0002J\b\u0010J\u001a\u00020\u0019H\u0002J\b\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020\"H\u0004J\u0010\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020GH&J\b\u0010S\u001a\u00020TH&J\u0010\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u000fH\u0002J\u0010\u0010W\u001a\u00020\u00192\u0006\u0010X\u001a\u000201H&J\b\u0010Y\u001a\u00020\u0019H\u0002J\u0010\u0010Z\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\\H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006^"}, bng = {"Lcom/iqoption/deposit/card/BaseCardPaymentFragment;", "Lcom/iqoption/deposit/PayFieldsContainerFragment;", "()V", "cardNumberValidator", "Lcom/iqoption/deposit/card/CardNumberValidator;", "getCardNumberValidator", "()Lcom/iqoption/deposit/card/CardNumberValidator;", "cardNumberValidator$delegate", "Lkotlin/Lazy;", "cardType", "Lio/card/payment/CardType;", "cardTypeWatcher", "com/iqoption/deposit/card/BaseCardPaymentFragment$cardTypeWatcher$1", "Lcom/iqoption/deposit/card/BaseCardPaymentFragment$cardTypeWatcher$1;", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getCashboxItem", "()Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "setCashboxItem", "(Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;)V", "viewModel", "Lcom/iqoption/deposit/card/CardPaymentViewModel;", "cardTypeIcon", "Landroid/widget/ImageView;", "clearFieldError", "", "editText", "Landroid/widget/EditText;", "clearFocus", "()Lkotlin/Unit;", "clearMonthAndYearError", "clearWarnings", "collectParams", "", "", "", "createCardNumberValidator", "cvvEditText", "fieldsContainer", "Landroid/view/ViewGroup;", "fillMonthAndYear", "month", "year", "getMonthAndYear", "Lkotlin/Pair;", "getMonthAndYearInt", "", "holderEditText", "isCvvValid", "", "isHolderValid", "isMonthAndYearValid", "isNewCard", "isNumberValid", "numberEditText", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "Landroid/view/View;", "openScan", "openScanCard", "openScanNfc", "payMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "reportEventOnFocusOn", "event", "requestFullScreenFields", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "scanCardView", "scanFragmentNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "setCard", "source", "setMonthAndYearEnabled", "enabled", "updateScanCardButtonVisibility", "vibrate", "milliseconds", "", "Companion", "deposit_release"})
/* compiled from: BaseCardPaymentFragment.kt */
public abstract class a extends n {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "cardNumberValidator", "getCardNumberValidator()Lcom/iqoption/deposit/card/CardNumberValidator;"))};
    private static final Pattern cxv = Pattern.compile("^[a-zA-Z0-9\\s\\.\\-]{2,}$");
    private static final Pattern cxw = Pattern.compile("^[0-9]{3,4}$");
    public static final a cxx = new a();
    private HashMap apm;
    private CardType bDW = CardType.UNKNOWN;
    private final kotlin.d cxr = g.c(new BaseCardPaymentFragment$cardNumberValidator$2(this));
    private com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a cxs;
    private d cxt;
    private final b cxu = new b(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/deposit/card/BaseCardPaymentFragment$Companion;", "", "()V", "CARDHOLDER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "CARD_CVV", "MAX_YEAR_PERIOD", "", "PERMISSION_REQUEST_CODE", "SCAN_REQUEST_CODE", "TAG", "", "getTAG", "()Ljava/lang/String;", "deposit_release"})
    /* compiled from: BaseCardPaymentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focused", "", "onFocusChange"})
    /* compiled from: BaseCardPaymentFragment.kt */
    static final class g implements OnFocusChangeListener {
        final /* synthetic */ String cxy;

        g(String str) {
            this.cxy = str;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                com.iqoption.core.d.Um().EC().c(this.cxy, 0.0d, com.iqoption.deposit.d.a.cGB.atf());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/card/BaseCardPaymentFragment$cardTypeWatcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "source", "Landroid/text/Editable;", "deposit_release"})
    /* compiled from: BaseCardPaymentFragment.kt */
    public static final class b extends ah {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "source");
            super.afterTextChanged(editable);
            CardType hm = com.iqoption.core.util.c.hm(af.H(editable.toString()));
            if (hm == null) {
                hm = CardType.UNKNOWN;
            }
            if (hm != this.this$0.bDW) {
                Drawable e;
                Integer a = com.iqoption.billing.b.a(hm);
                if (a != null) {
                    e = com.iqoption.core.ext.a.e(this.this$0, a.intValue());
                } else {
                    e = null;
                }
                ImageView apk = this.this$0.apk();
                if (e == null) {
                    apk.setVisibility(8);
                } else {
                    apk.setImageDrawable(e);
                    apk.setVisibility(0);
                }
                this.this$0.aoY();
                this.this$0.bDW = hm;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.ape();
            if (NfcAdapter.getDefaultAdapter(com.iqoption.core.ext.a.q(this.this$0)) == null) {
                this.this$0.aoW();
            } else {
                com.iqoption.core.ui.d.g.b(com.iqoption.deposit.navigator.b.cGp.P(this.this$0), this.this$0.apf(), false, 2, null);
            }
            com.iqoption.core.d.Um().EC().a("deposit-page_scan-card-number", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "method", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: BaseCardPaymentFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar != null) {
                this.this$0.j(aVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "scanItem", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseCardPaymentFragment.kt */
    static final class e<T> implements Observer<ScanItem> {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(ScanItem scanItem) {
            if (scanItem != null) {
                int i = b.aob[scanItem.ordinal()];
                if (i == 1) {
                    this.this$0.aoW();
                } else if (i == 2) {
                    this.this$0.aoV();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "nfcCard", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseCardPaymentFragment.kt */
    static final class f<T> implements Observer<com.iqoption.deposit.card.e.a> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.deposit.card.e.a aVar) {
            if (aVar != null) {
                this.this$0.vibrate(50);
                this.this$0.aph().setText(aVar.getCardNumber());
                if (!(aVar.aps() == null || aVar.apt() == null)) {
                    this.this$0.av(aVar.aps(), aVar.apt());
                }
                String apu = aVar.apu();
                if (apu != null) {
                    this.this$0.apl().setText(apu);
                }
            }
        }
    }

    private final c aoT() {
        kotlin.d dVar = this.cxr;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean a(com.iqoption.deposit.i iVar) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        return false;
    }

    public abstract com.iqoption.core.ui.d.c apf();

    public abstract ViewGroup apg();

    public abstract EditText aph();

    public abstract View apj();

    public abstract ImageView apk();

    public abstract EditText apl();

    public abstract EditText apm();

    public abstract Pair<String, String> apn();

    public abstract void apo();

    public abstract c app();

    public abstract void av(String str, String str2);

    public abstract void cM(boolean z);

    public abstract void clearWarnings();

    public abstract void e(EditText editText);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected|final */
    public final com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aoU() {
        return this.cxs;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cxt = d.cxE.D(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aph().addTextChangedListener(this.cxu);
        apj().setOnClickListener(new c(this));
        this.cxs = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) null;
        d dVar = this.cxt;
        String str = "viewModel";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        dVar.aoy().observe(lifecycleOwner, new d(this));
        dVar = this.cxt;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.aoE().observe(lifecycleOwner, new e(this));
        dVar = this.cxt;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.aoF().observe(lifecycleOwner, new f(this));
    }

    private final void aoV() {
        com.iqoption.core.ui.d.g.b(com.iqoption.deposit.navigator.b.cGp.P(this), f.cxR.apA(), false, 2, null);
    }

    private final void aoW() {
        String str = "android.permission.CAMERA";
        if (ContextCompat.checkSelfPermission(com.iqoption.core.ext.a.q(this), str) == 0) {
            aoX();
        } else {
            requestPermissions(new String[]{str}, 255);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.i.f(strArr, "permissions");
        kotlin.jvm.internal.i.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 255) {
            if (((iArr.length == 0 ? 1 : 0) ^ 1) == 0 || iArr[0] != 0) {
                aoX();
            } else {
                aoX();
            }
        }
    }

    private final void aoX() {
        Intent intent = new Intent(com.iqoption.core.ext.a.q(this), CardIOActivity.class);
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true);
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, true);
        intent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        startActivityForResult(intent, 128);
    }

    private final void j(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        e(aph());
        e(apl());
        apo();
        e(apm());
        if (!kotlin.jvm.internal.i.y(this.cxs, aVar) && !(aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b)) {
            clearWarnings();
            this.cxs = aVar;
            if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) {
                aph().removeTextChangedListener(aoT());
                com.iqoption.core.ext.a.al(apg());
            } else if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) {
                com.iqoption.core.ext.a.ak(apg());
                aph().removeTextChangedListener(aoT());
                aph().addTextChangedListener(aoT());
                CharSequence charSequence = null;
                aph().setText(charSequence);
                if (com.iqoption.core.microservices.billing.response.deposit.c.c(aVar)) {
                    com.iqoption.core.ext.a.al(apl());
                } else {
                    com.iqoption.core.ext.a.ak(apl());
                }
                apl().setText(charSequence);
                av(null, null);
                apm().setText(charSequence);
                aoY();
                aph().setEnabled(true);
                apl().setEnabled(true);
                cM(true);
                apm().setEnabled(true);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected case: ");
                stringBuilder.append(aVar);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private final void aoY() {
        if (com.iqoption.core.ext.a.af(apk())) {
            com.iqoption.core.ext.a.al(apj());
            return;
        }
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        if (aVar == null || !com.iqoption.core.microservices.billing.response.deposit.c.d(aVar)) {
            com.iqoption.core.ext.a.ak(apj());
        } else {
            com.iqoption.core.ext.a.al(apj());
        }
    }

    public Map<String, Object> aoR() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) {
            return com.iqoption.core.microservices.billing.a.bmi.aR(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) aVar).aaB());
        }
        String obj = apm().getText().toString();
        Editable text = aph().getText();
        kotlin.jvm.internal.i.e(text, "numberEditText().text");
        String H = af.H(text);
        Pair apd = apd();
        Object first = apd.getFirst();
        if (first == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int intValue = ((Number) first).intValue();
        Object bni = apd.bni();
        if (bni == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int intValue2 = ((Number) bni).intValue();
        String obj2 = apl().getText().toString();
        if (intValue2 < 100) {
            intValue2 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        }
        return com.iqoption.core.microservices.billing.a.bmi.a(H, obj2, intValue, intValue2, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean aoZ() {
        return aoT().isValid();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean apa() {
        boolean z = true;
        if (!com.iqoption.core.ext.a.af(apl())) {
            return true;
        }
        String obj = apl().getText().toString();
        if (obj != null) {
            CharSequence obj2 = v.trim(obj).toString();
            if (TextUtils.isEmpty(obj2) || !cxv.matcher(obj2).matches()) {
                z = false;
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* Access modifiers changed, original: protected|final */
    public final Pair<Boolean, Boolean> apb() {
        String str = "null cannot be cast to non-null type kotlin.CharSequence";
        Pair apn = apn();
        int i = -1;
        int B;
        boolean z;
        try {
            String str2 = (String) apn.getFirst();
            if (str2 != null) {
                B = com.iqoption.core.ext.c.B(v.trim(str2).toString());
                z = true;
                boolean z2;
                try {
                    String str3 = (String) apn.bni();
                    if (str3 != null) {
                        i = com.iqoption.core.ext.c.B(v.trim(str3).toString());
                        z2 = true;
                        if (!z || !z2) {
                            return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
                        }
                        if (1 > B || B > 12) {
                            z = false;
                        }
                        if (i < 100) {
                            i += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
                        }
                        int i2 = Calendar.getInstance().get(1);
                        int i3 = Calendar.getInstance().get(2) + 1;
                        if (i == i2 && B < i3) {
                            z2 = false;
                            z = false;
                        }
                        if (i < i2 || i > i2 + 20) {
                            z2 = false;
                        }
                        return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
                    }
                    throw new TypeCastException(str);
                } catch (Exception unused) {
                    z2 = false;
                }
            } else {
                throw new TypeCastException(str);
            }
        } catch (Exception unused2) {
            z = false;
            B = -1;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean apc() {
        CharSequence obj = apm().getText().toString();
        return !TextUtils.isEmpty(obj) && cxw.matcher(obj).matches();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 128 && intent != null) {
            String str = CardIOActivity.EXTRA_SCAN_RESULT;
            if (intent.hasExtra(str)) {
                Parcelable parcelableExtra = intent.getParcelableExtra(str);
                kotlin.jvm.internal.i.e(parcelableExtra, "data.getParcelableExtra(…tivity.EXTRA_SCAN_RESULT)");
                CreditCard creditCard = (CreditCard) parcelableExtra;
                aph().setText(creditCard.cardNumber);
                if (creditCard.isExpiryValid()) {
                    av(String.valueOf(creditCard.expiryMonth), String.valueOf(creditCard.expiryYear));
                }
                if (creditCard.cardholderName != null) {
                    apl().setText(creditCard.cardholderName);
                }
            }
        }
    }

    private final void vibrate(long j) {
        Object systemService = com.iqoption.core.ext.a.q(this).getSystemService("vibrator");
        if (systemService != null) {
            ((Vibrator) systemService).vibrate(j);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    public com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c aoS() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        if (aVar != null) {
            return (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c) aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.billing.response.deposit.cashboxitem.PayMethod");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        return aVar == null || (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(EditText editText, String str) {
        kotlin.jvm.internal.i.f(editText, "editText");
        kotlin.jvm.internal.i.f(str, "event");
        editText.setOnFocusChangeListener(new g(str));
    }

    /* Access modifiers changed, original: protected|final */
    public final Pair<Integer, Integer> apd() {
        Object valueOf;
        Pair apb = apb();
        boolean booleanValue = ((Boolean) apb.bnj()).booleanValue();
        boolean booleanValue2 = ((Boolean) apb.bnk()).booleanValue();
        Pair apn = apn();
        String str = "null cannot be cast to non-null type kotlin.CharSequence";
        Object obj = null;
        if (booleanValue) {
            String str2 = (String) apn.getFirst();
            if (str2 != null) {
                valueOf = Integer.valueOf(com.iqoption.core.ext.c.B(v.trim(str2).toString()));
            } else {
                throw new TypeCastException(str);
            }
        }
        valueOf = null;
        if (booleanValue2) {
            String str3 = (String) apn.bni();
            if (str3 != null) {
                obj = Integer.valueOf(com.iqoption.core.ext.c.B(v.trim(str3).toString()));
            } else {
                throw new TypeCastException(str);
            }
        }
        return new Pair(valueOf, obj);
    }

    private final l ape() {
        View view = getView();
        if (view != null) {
            view = view.findFocus();
            if (view != null) {
                view.clearFocus();
                return l.eVB;
            }
        }
        return null;
    }
}
