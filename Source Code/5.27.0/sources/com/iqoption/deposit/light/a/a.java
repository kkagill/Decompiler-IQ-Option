package com.iqoption.deposit.light.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.util.ah;
import com.iqoption.deposit.hold.HoldWarningState;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0 H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\u0012\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u0011H\u0016J\b\u0010-\u001a\u00020\u0011H\u0016J\u001a\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u00100\u001a\u00020\u000fH\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0011H\u0002J\u0010\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00112\u0006\u00105\u001a\u000206H\u0016J\u0010\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u000206H\u0002J\b\u0010=\u001a\u000206H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006?"}, bng = {"Lcom/iqoption/deposit/light/card/CardPaymentLightFragment;", "Lcom/iqoption/deposit/card/BaseCardPaymentFragment;", "()V", "<set-?>", "Lcom/iqoption/deposit/databinding/FragmentCardPaymentLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentCardPaymentLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentCardPaymentLightBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "depositHoldWarningManager", "Lcom/iqoption/deposit/hold/DepositHoldWarningManager;", "cardTypeIcon", "Landroid/widget/ImageView;", "clearFieldError", "", "editText", "Landroid/widget/EditText;", "clearMonthAndYearError", "clearWarnings", "createCardNumberValidator", "Lcom/iqoption/deposit/card/CardNumberValidator;", "cvvEditText", "fieldsContainer", "Landroid/widget/LinearLayout;", "fillMonthAndYear", "month", "", "year", "getMonthAndYear", "Lkotlin/Pair;", "holderEditText", "numberEditText", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "onViewCreated", "view", "scanCardView", "scanFragmentNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "scrollParentToBottom", "setFieldsEnabled", "enabled", "", "setMonthAndYearEnabled", "updateHoldWarningVisibility", "state", "Lcom/iqoption/deposit/hold/HoldWarningState;", "updatePassTransformationMethod", "show", "validate", "Companion", "deposit_release"})
/* compiled from: CardPaymentLightFragment.kt */
public final class a extends com.iqoption.deposit.card.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentCardPaymentLightBinding;"))};
    public static final a cEA = new a();
    private HashMap apm;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private com.iqoption.deposit.hold.g cEz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/light/card/CardPaymentLightFragment$Companion;", "", "()V", "DATE_SEPARATOR", "", "MONTH_LENGTH", "", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: CardPaymentLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c apA() {
            return new com.iqoption.core.ui.d.c(Bx(), a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: CardPaymentLightFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a cEB;

        c(a aVar) {
            this.cEB = aVar;
        }

        public final void onClick(View view) {
            a aVar = this.cEB;
            ToggleButton toggleButton = aVar.arG().cAR;
            kotlin.jvm.internal.i.e(toggleButton, "binding.passwordToggle");
            aVar.cN(toggleButton.isChecked());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"com/iqoption/deposit/light/card/CardPaymentLightFragment$onViewCreated$2", "Lcom/iqoption/core/util/TextWatcherAdapter;", "wasDeleting", "", "afterTextChanged", "", "source", "Landroid/text/Editable;", "onTextChanged", "s", "", "start", "", "before", "count", "setTextWithoutCallback", "text", "", "deposit_release"})
    /* compiled from: CardPaymentLightFragment.kt */
    public static final class d extends ah {
        private boolean cEC;
        final /* synthetic */ EditText cED;

        d(EditText editText) {
            this.cED = editText;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
            super.onTextChanged(charSequence, i, i2, i3);
            boolean z = i3 == 0 && i2 > 0;
            this.cEC = z;
        }

        public void afterTextChanged(Editable editable) {
            int length;
            String substring;
            kotlin.jvm.internal.i.f(editable, "source");
            super.afterTextChanged(editable);
            CharSequence charSequence = editable;
            if ((charSequence.length() == 0 ? 1 : null) == null) {
                String str = "/";
                StringBuilder stringBuilder;
                if (kotlin.jvm.internal.i.y(editable.toString(), str)) {
                    hK(null);
                } else if (this.cEC && editable.length() == 2) {
                    String obj = editable.toString();
                    length = editable.length() - 1;
                    if (obj != null) {
                        substring = obj.substring(0, length);
                        kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(substring);
                        stringBuilder.append(str);
                        hK(stringBuilder.toString());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (v.a(charSequence, "/", 0, false, 6, null) < 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(editable.toString());
                    stringBuilder.append(str);
                    hK(stringBuilder.toString());
                }
            }
            substring = this.cED.getText().toString();
            int selectionStart = this.cED.getSelectionStart();
            int selectionEnd = this.cED.getSelectionEnd();
            if (substring.length() > 1 && selectionStart == selectionEnd) {
                selectionEnd = u.a(substring, "/", "", false, 4, null).length();
                length = substring.length();
                int i = length - 1;
                if (selectionEnd < 2) {
                    this.cED.setSelection(i, i);
                } else if (selectionStart == i) {
                    this.cED.setSelection(length, length);
                }
            }
        }

        private final void hK(String str) {
            TextWatcher textWatcher = this;
            this.cED.removeTextChangedListener(textWatcher);
            EditText editText = this.cED;
            if (str == null) {
                str = "";
            }
            editText.setText(str);
            this.cED.addTextChangedListener(textWatcher);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/deposit/hold/HoldWarningState;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: CardPaymentLightFragment.kt */
    static final class f<T> implements Observer<HoldWarningState> {
        final /* synthetic */ a cEB;

        f(a aVar) {
            this.cEB = aVar;
        }

        /* renamed from: d */
        public final void onChanged(HoldWarningState holdWarningState) {
            a aVar = this.cEB;
            if (holdWarningState == null) {
                holdWarningState = HoldWarningState.UNDEFINED;
            }
            aVar.c(holdWarningState);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ a cEB;

        public g(a aVar) {
            this.cEB = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.d.EC().di("deposit-page_card-info-verification-needed");
            this.cEB.arJ();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/light/card/CardPaymentLightFragment$createCardNumberValidator$1", "Lcom/iqoption/deposit/card/CardNumberValidator;", "afterTextChanged", "", "source", "Landroid/text/Editable;", "deposit_release"})
    /* compiled from: CardPaymentLightFragment.kt */
    public static final class b extends com.iqoption.deposit.card.c {
        final /* synthetic */ a cEB;

        b(a aVar) {
            this.cEB = aVar;
        }

        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            com.iqoption.deposit.hold.g c = a.c(this.cEB);
            boolean isValid = isValid();
            String value = getValue();
            kotlin.jvm.internal.i.e(value, ConditionalUserProperty.VALUE);
            c.a(new com.iqoption.deposit.hold.k(isValid, value));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/light/card/CardPaymentLightFragment$onViewCreated$3", "Lcom/iqoption/deposit/light/card/ValidateTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "deposit_release"})
    /* compiled from: CardPaymentLightFragment.kt */
    public static final class e extends b {
        final /* synthetic */ a cEB;

        e(a aVar, EditText editText) {
            this.cEB = aVar;
            super(editText);
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            Pair b = this.cEB.apd();
            Integer num = (Integer) b.bnj();
            Integer num2 = (Integer) b.bnk();
            if (num != null) {
                a.c(this.cEB).a(new com.iqoption.deposit.hold.j(true, num.intValue()));
            } else {
                a.c(this.cEB).a(com.iqoption.deposit.hold.g.cEi);
            }
            if (num2 != null) {
                a.c(this.cEB).b(new com.iqoption.deposit.hold.j(true, num2.intValue()));
            } else {
                a.c(this.cEB).b(com.iqoption.deposit.hold.g.cEi);
            }
        }
    }

    private final void a(com.iqoption.deposit.b.e eVar) {
        this.bIb.a(this, anY[0], eVar);
    }

    private final com.iqoption.deposit.b.e arG() {
        return (com.iqoption.deposit.b.e) this.bIb.b(this, anY[0]);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = com.iqoption.deposit.card.a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cEz = new com.iqoption.deposit.hold.g();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((com.iqoption.deposit.b.e) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_card_payment_light, viewGroup, false, 4, null));
        return arG().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        arG().cAR.setOnClickListener(new c(this));
        EditText editText = arG().cAN;
        String str = "binding.cardMonthAndYear";
        kotlin.jvm.internal.i.e(editText, str);
        editText.addTextChangedListener(new d(editText));
        editText = arG().cAO;
        EditText editText2 = arG().cAO;
        String str2 = "binding.cardNumber";
        kotlin.jvm.internal.i.e(editText2, str2);
        editText.addTextChangedListener(new b(editText2));
        editText = arG().cAM;
        editText2 = arG().cAM;
        String str3 = "binding.cardHolderName";
        kotlin.jvm.internal.i.e(editText2, str3);
        editText.addTextChangedListener(new b(editText2));
        editText = arG().cAN;
        editText2 = arG().cAN;
        kotlin.jvm.internal.i.e(editText2, str);
        editText.addTextChangedListener(new e(this, editText2));
        editText = arG().cAK;
        editText2 = arG().cAK;
        String str4 = "binding.cardCvv";
        kotlin.jvm.internal.i.e(editText2, str4);
        editText.addTextChangedListener(new b(editText2));
        editText = arG().cAO;
        kotlin.jvm.internal.i.e(editText, str2);
        a(editText, "deposit-page_card-number");
        editText = arG().cAM;
        kotlin.jvm.internal.i.e(editText, str3);
        a(editText, "deposit-page_card-holder");
        editText = arG().cAN;
        kotlin.jvm.internal.i.e(editText, str);
        a(editText, "deposit-page_expiry-date");
        editText = arG().cAK;
        kotlin.jvm.internal.i.e(editText, str4);
        a(editText, "deposit-page_cvv");
        com.iqoption.deposit.hold.g gVar = this.cEz;
        str = "depositHoldWarningManager";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.arw().observe(this, new f(this));
        gVar = this.cEz;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.start();
    }

    public void onResume() {
        super.onResume();
        ToggleButton toggleButton = arG().cAR;
        kotlin.jvm.internal.i.e(toggleButton, "binding.passwordToggle");
        cN(toggleButton.isChecked());
    }

    public void onDestroyView() {
        com.iqoption.deposit.hold.g gVar = this.cEz;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("depositHoldWarningManager");
        }
        gVar.stop();
        super.onDestroyView();
        Bj();
    }

    private final void cN(boolean z) {
        TransformationMethod instance;
        EditText editText = arG().cAK;
        String str = "binding.cardCvv";
        kotlin.jvm.internal.i.e(editText, str);
        int selectionStart = editText.getSelectionStart();
        EditText editText2 = arG().cAK;
        kotlin.jvm.internal.i.e(editText2, str);
        int selectionEnd = editText2.getSelectionEnd();
        if (z) {
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            instance = PasswordTransformationMethod.getInstance();
        }
        EditText editText3 = arG().cAK;
        kotlin.jvm.internal.i.e(editText3, str);
        editText3.setTransformationMethod(instance);
        arG().cAK.setSelection(selectionStart, selectionEnd);
    }

    public boolean validate() {
        if (aoU() == null) {
            return false;
        }
        if (aoU() instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e) {
            return true;
        }
        String str;
        EditText editText;
        if (a(aoU())) {
            str = "binding.cardNumber";
            if (aoZ()) {
                editText = arG().cAO;
                kotlin.jvm.internal.i.e(editText, str);
                com.iqoption.deposit.light.b.b(editText, null);
                str = "binding.cardHolderName";
                if (apa()) {
                    editText = arG().cAM;
                    kotlin.jvm.internal.i.e(editText, str);
                    com.iqoption.deposit.light.b.b(editText, null);
                    Pair apb = apb();
                    if (((Boolean) apb.getFirst()).booleanValue() && ((Boolean) apb.bni()).booleanValue()) {
                        str = null;
                    } else if (((Boolean) apb.getFirst()).booleanValue()) {
                        str = getString(com.iqoption.deposit.o.g.incorrect_year);
                    } else {
                        str = getString(com.iqoption.deposit.o.g.incorrect_month);
                    }
                    EditText editText2 = arG().cAN;
                    kotlin.jvm.internal.i.e(editText2, "binding.cardMonthAndYear");
                    com.iqoption.deposit.light.b.b(editText2, str);
                    if (!(((Boolean) apb.getFirst()).booleanValue() && ((Boolean) apb.bni()).booleanValue())) {
                        return false;
                    }
                }
                editText = arG().cAM;
                kotlin.jvm.internal.i.e(editText, str);
                com.iqoption.deposit.light.b.b(editText, getString(com.iqoption.deposit.o.g.incorrect_card_holder));
                return false;
            }
            editText = arG().cAO;
            kotlin.jvm.internal.i.e(editText, str);
            com.iqoption.deposit.light.b.b(editText, getString(com.iqoption.deposit.o.g.incorrect_card_number));
            return false;
        }
        str = "binding.cardCvv";
        if (apc()) {
            editText = arG().cAK;
            kotlin.jvm.internal.i.e(editText, str);
            com.iqoption.deposit.light.b.b(editText, null);
            return true;
        }
        editText = arG().cAK;
        kotlin.jvm.internal.i.e(editText, str);
        com.iqoption.deposit.light.b.b(editText, getString(com.iqoption.deposit.o.g.incorrect_cvv_code));
        return false;
    }

    public void e(EditText editText) {
        kotlin.jvm.internal.i.f(editText, "editText");
        com.iqoption.deposit.light.b.b(editText, null);
    }

    public void apo() {
        EditText editText = arG().cAN;
        kotlin.jvm.internal.i.e(editText, "binding.cardMonthAndYear");
        com.iqoption.deposit.light.b.b(editText, null);
    }

    public com.iqoption.core.ui.d.c apf() {
        return com.iqoption.deposit.light.menu.scan.d.cFi.asc();
    }

    /* renamed from: arH */
    public LinearLayout apg() {
        LinearLayout linearLayout = arG().cAL;
        kotlin.jvm.internal.i.e(linearLayout, "binding.cardFieldsContainer");
        return linearLayout;
    }

    public EditText aph() {
        EditText editText = arG().cAO;
        kotlin.jvm.internal.i.e(editText, "binding.cardNumber");
        return editText;
    }

    /* renamed from: arI */
    public ImageView apj() {
        ImageView imageView = arG().cAS;
        kotlin.jvm.internal.i.e(imageView, "binding.scanCard");
        return imageView;
    }

    public ImageView apk() {
        ImageView imageView = arG().cAP;
        kotlin.jvm.internal.i.e(imageView, "binding.cardType");
        return imageView;
    }

    public EditText apl() {
        EditText editText = arG().cAM;
        kotlin.jvm.internal.i.e(editText, "binding.cardHolderName");
        return editText;
    }

    public EditText apm() {
        EditText editText = arG().cAK;
        kotlin.jvm.internal.i.e(editText, "binding.cardCvv");
        return editText;
    }

    public void av(String str, String str2) {
        String str3 = "";
        if (str == null && str2 == null) {
            arG().cAN.setText(str3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (str == null) {
            str = str3;
        }
        stringBuilder.append(str);
        stringBuilder.append("/");
        if (str2 == null) {
            str2 = str3;
        }
        stringBuilder.append(str2);
        arG().cAN.setText(stringBuilder);
    }

    public void cM(boolean z) {
        EditText editText = arG().cAN;
        kotlin.jvm.internal.i.e(editText, "binding.cardMonthAndYear");
        editText.setEnabled(z);
    }

    public Pair<String, String> apn() {
        EditText editText = arG().cAN;
        kotlin.jvm.internal.i.e(editText, "binding.cardMonthAndYear");
        Editable text = editText.getText();
        kotlin.jvm.internal.i.e(text, "binding.cardMonthAndYear.text");
        List b = v.b((CharSequence) text, new String[]{"/"}, false, 0, 6, null);
        if (b.size() >= 2) {
            return new Pair(b.get(0), b.get(1));
        }
        String str = "";
        return new Pair(str, str);
    }

    public com.iqoption.deposit.card.c app() {
        return new b(this);
    }

    private final void c(HoldWarningState holdWarningState) {
        ViewStubProxy viewStubProxy = arG().cAQ;
        kotlin.jvm.internal.i.e(viewStubProxy, "binding.depositHoldWarning");
        String str = "depositHoldWarning.root";
        String str2 = "binding.verificationLink";
        TextView textView;
        View root;
        if (holdWarningState == HoldWarningState.SHOW) {
            textView = arG().cAT;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            textView = arG().cAT;
            kotlin.jvm.internal.i.e(textView, str2);
            String obj = textView.getText().toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
            spannableStringBuilder.setSpan(new UnderlineSpan(), 0, obj.length(), 0);
            textView = arG().cAT;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(spannableStringBuilder);
            textView = arG().cAT;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setOnClickListener(new g(this));
            if (!viewStubProxy.isInflated()) {
                ViewStub viewStub = viewStubProxy.getViewStub();
                if (viewStub == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                viewStub.inflate();
            }
            root = viewStubProxy.getRoot();
            kotlin.jvm.internal.i.e(root, str);
            com.iqoption.core.ext.a.ak(root);
        } else if (holdWarningState == HoldWarningState.HIDE) {
            textView = arG().cAT;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            if (viewStubProxy.isInflated()) {
                root = viewStubProxy.getRoot();
                kotlin.jvm.internal.i.e(root, str);
                com.iqoption.core.ext.a.al(root);
            }
        }
    }

    private final void arJ() {
        View view = getView();
        while (true) {
            ViewParent parent = view != null ? view.getParent() : null;
            if (!(parent instanceof View)) {
                parent = null;
            }
            view = (View) parent;
            if (view != null) {
                if (view instanceof ScrollView) {
                    ((ScrollView) view).fullScroll(130);
                } else if (view instanceof NestedScrollView) {
                    ((NestedScrollView) view).fullScroll(130);
                }
            } else {
                return;
            }
        }
    }

    public void clearWarnings() {
        c(HoldWarningState.HIDE);
    }
}
