package com.iqoption.withdraw.fields;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.withdraw.response.LimitDirection;
import com.iqoption.core.microservices.withdraw.response.PayoutFieldType;
import com.iqoption.core.microservices.withdraw.response.WithdrawMethodType;
import com.iqoption.core.microservices.withdraw.response.q;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.withdraw.a.ae;
import com.iqoption.withdraw.a.o;
import com.iqoption.withdraw.a.s;
import com.iqoption.withdraw.a.u;
import com.iqoption.withdraw.a.y;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 n2\u00020\u0001:\u0004mnopB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eH\u0002J\u0018\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0014H\u0002J\u0018\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u0014H\u0002J,\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020403j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000204`52\u0006\u00106\u001a\u00020\u0014H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u000eH\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0002J\u0014\u0010;\u001a\u0004\u0018\u00010\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010=\u001a\u00020\u000eH\u0002J\b\u0010>\u001a\u00020\u000eH\u0002J\u0010\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020\u0004H\u0002J\b\u0010A\u001a\u00020'H\u0002J\b\u0010B\u001a\u00020'H\u0002J\b\u0010C\u001a\u00020\u0014H\u0002J\u0010\u0010D\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u000eH\u0002J\u0012\u0010E\u001a\u00020'2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J&\u0010H\u001a\u0004\u0018\u00010\u00112\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010M\u001a\u00020'H\u0016J\u0010\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020GH\u0016J\u001a\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010R\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010S\u001a\u00020'H\u0002J\b\u0010T\u001a\u00020'H\u0002J\u0010\u0010U\u001a\u00020'2\u0006\u0010V\u001a\u00020\u000eH\u0002J\u0010\u0010W\u001a\u00020'2\u0006\u00101\u001a\u00020\u0014H\u0002J\u001a\u0010X\u001a\u00020'2\b\u0010V\u001a\u0004\u0018\u00010\u000e2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0018\u0010Y\u001a\u00020'2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0014H\u0002J\u0010\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020\u0016H\u0002J\u0018\u0010]\u001a\u00020'2\u0006\u0010^\u001a\u00020:2\u0006\u00108\u001a\u00020\u000eH\u0002J\b\u0010_\u001a\u00020'H\u0002J\u0010\u0010`\u001a\u00020'2\u0006\u00109\u001a\u00020\u0019H\u0002J \u0010a\u001a\u00020'2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020'H\u0002J \u0010i\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00042\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020kH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X.¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000¨\u0006q"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "amountHolder", "Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawFieldsBinding;", "decimalFormat", "Ljava/text/DecimalFormat;", "getDecimalFormat", "()Ljava/text/DecimalFormat;", "decimalFormat$delegate", "Lkotlin/Lazy;", "delayedAmountExceededLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "feeContentViews", "", "Landroid/view/View;", "[Landroid/view/View;", "feeInProgress", "", "fieldsData", "Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "fieldsValidationMap", "", "", "handler", "Landroid/os/Handler;", "lastShownFields", "", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "restoredState", "Lcom/iqoption/withdraw/fields/WithdrawState;", "showAmountErrorRunnable", "Ljava/lang/Runnable;", "showCommissionProgressRunnable", "viewModel", "Lcom/iqoption/withdraw/fields/WithdrawFieldsViewModel;", "applyContentLength", "", "edit", "Landroid/widget/EditText;", "field", "applyImeOptions", "isLastField", "applyInputType", "isAmount", "areAllFieldsValid", "changeWithdrawButtonProgress", "progress", "collectValues", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "valuesAsString", "formatAmountWithWalletMask", "limit", "amount", "", "getAmountExceededLimit", "value", "getAmountLowerLimit", "getAmountUpperLimit", "hideFieldError", "holder", "hideInsufficientFoundsUI", "hideKeyboardIfOpened", "isFitWithoutCommission", "limitErrorMessage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "view", "performMethodSelection", "performWithdraw", "scheduleCommissionProgress", "scheduleShowFieldLimitError", "amountExceededLimit", "setCommissionProgressImmediate", "showFieldLimitError", "showFieldRegexpError", "isEmpty", "showFields", "data", "showInsufficientFoundsUI", "walletAmount", "showWithdrawFail", "showWithdrawSuccess", "updateCommissionContainerVisibility", "payoutSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "updateWithdrawButton", "validateField", "regexpError", "Lcom/iqoption/withdraw/fields/ValidationUIMode;", "limitError", "AmountFeeTextWatcher", "Companion", "FieldOnFocusChangeListener", "TextWatcher", "withdraw_release"})
/* compiled from: WithdrawFieldsFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    public static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "decimalFormat", "getDecimalFormat()Ljava/text/DecimalFormat;"))};
    public static final b erB = new b();
    private HashMap apm;
    private final Map<String, Boolean> cyx = new LinkedHashMap();
    private final Runnable erA = new k(this);
    private com.iqoption.withdraw.a.c erp;
    private g erq;
    private c err;
    private List<com.iqoption.core.microservices.withdraw.response.h> ers;
    private com.iqoption.withdraw.fields.a.b ert;
    private i eru;
    private final kotlin.d erv = g.c(WithdrawFieldsFragment$decimalFormat$2.erE);
    private View[] erw;
    private com.iqoption.core.microservices.withdraw.response.a erx;
    private boolean ery;
    private final Runnable erz = new j(this);
    private final Handler handler = new Handler();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment$Companion;", "", "()V", "STATE_WITHDRAW", "", "TAG", "newInstance", "Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;", "withdraw_release"})
    /* compiled from: WithdrawFieldsFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final d bcs() {
            return new d();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment$FieldOnFocusChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "holder", "Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;", "(Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;)V", "onFocusChange", "", "view", "Landroid/view/View;", "hasFocus", "", "withdraw_release"})
    /* compiled from: WithdrawFieldsFragment.kt */
    public final class c implements OnFocusChangeListener {
        final /* synthetic */ d erC;
        private final com.iqoption.withdraw.fields.a.b erD;

        public c(d dVar, com.iqoption.withdraw.fields.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "holder");
            this.erC = dVar;
            this.erD = bVar;
        }

        public void onFocusChange(View view, boolean z) {
            this.erC.a(this.erD, z ? ValidationUIMode.HIDE_ERROR_IF_VALID : ValidationUIMode.UPDATE_UI_IMMEDIATE, ValidationUIMode.UPDATE_UI_IMMEDIATE);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class e implements OnEditorActionListener {
        final /* synthetic */ d erC;

        e(d dVar) {
            this.erC = dVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.erC.aqd();
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/withdraw/fields/WithdrawFieldsFragment$onViewCreated$3$1"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ d erC;

        f(d dVar) {
            this.erC = dVar;
        }

        public final void onClick(View view) {
            this.erC.bcl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class j implements Runnable {
        final /* synthetic */ d erC;

        j(d dVar) {
            this.erC = dVar;
        }

        public final void run() {
            com.iqoption.withdraw.fields.a.b c = this.erC.ert;
            if (c != null) {
                d dVar = this.erC;
                dVar.a(dVar.erx, c);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class k implements Runnable {
        final /* synthetic */ d erC;

        k(d dVar) {
            this.erC = dVar;
        }

        public final void run() {
            this.erC.fD(true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment$AmountFeeTextWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "(Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;)V", "afterTextChanged", "", "text", "Landroid/text/Editable;", "withdraw_release"})
    /* compiled from: WithdrawFieldsFragment.kt */
    public final class a extends ah {
        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            c b = d.this.err;
            Double d = null;
            com.iqoption.core.microservices.withdraw.response.c bcf = b != null ? b.bcf() : null;
            if (bcf != null) {
                com.iqoption.withdraw.fields.a.b c = d.this.ert;
                if (c != null) {
                    String value = c.getValue();
                    if (value != null) {
                        d = s.mV(value);
                    }
                }
                d.d(d.this).a(bcf, d);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment$TextWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "holder", "Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;", "(Lcom/iqoption/withdraw/fields/WithdrawFieldsFragment;Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;)V", "afterTextChanged", "", "text", "Landroid/text/Editable;", "withdraw_release"})
    /* compiled from: WithdrawFieldsFragment.kt */
    public final class d extends ah {
        final /* synthetic */ d erC;
        private final com.iqoption.withdraw.fields.a.b erD;

        public d(d dVar, com.iqoption.withdraw.fields.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "holder");
            this.erC = dVar;
            this.erD = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            super.afterTextChanged(editable);
            this.erC.a(this.erD, ValidationUIMode.HIDE_ERROR_IF_VALID, ValidationUIMode.UPDATE_UI_DELAYED);
            this.erC.bck();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "value", "Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class g<T> implements Observer<c> {
        final /* synthetic */ d erC;

        g(d dVar) {
            this.erC = dVar;
        }

        /* renamed from: c */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                this.erC.a(cVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/withdraw/fields/FeeResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class h<T> implements Observer<com.iqoption.core.ui.d<b>> {
        final /* synthetic */ d erC;

        h(d dVar) {
            this.erC = dVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<b> dVar) {
            int i = e.aob[dVar.akW().ordinal()];
            if (i != 1) {
                CharSequence charSequence = null;
                if (i == 2) {
                    this.erC.handler.removeCallbacks(this.erC.erA);
                    this.erC.fD(false);
                    TextView textView = d.h(this.erC).epU.eqG;
                    kotlin.jvm.internal.i.e(textView, "binding.withdrawFee.withdrawFeeValue");
                    b bVar = (b) dVar.getData();
                    textView.setText(bVar != null ? bVar.bcc() : null);
                    textView = d.h(this.erC).epU.eqF;
                    kotlin.jvm.internal.i.e(textView, "binding.withdrawFee.withdrawFeeTotalValue");
                    b bVar2 = (b) dVar.getData();
                    if (bVar2 != null) {
                        charSequence = bVar2.bcd();
                    }
                    textView.setText(charSequence);
                    return;
                } else if (i == 3) {
                    com.iqoption.core.d.a(com.iqoption.withdraw.d.f.unknown_error_occurred, 0, 2, null);
                    return;
                } else {
                    return;
                }
            }
            this.erC.handler.removeCallbacks(this.erC.erA);
            this.erC.bcr();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawFieldsFragment.kt */
    static final class i<T> implements Observer<q> {
        final /* synthetic */ d erC;
        final /* synthetic */ double erF;
        final /* synthetic */ c erG;

        i(d dVar, double d, c cVar) {
            this.erC = dVar;
            this.erF = d;
            this.erG = cVar;
        }

        /* renamed from: a */
        public final void onChanged(q qVar) {
            if (qVar == null || !qVar.isSuccessful()) {
                this.erC.bcm();
            } else {
                this.erC.kl(com.iqoption.core.util.e.a(this.erF, this.erG.VM(), false, 2, null));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class l extends com.iqoption.core.ext.g {
        final /* synthetic */ d erC;
        final /* synthetic */ com.iqoption.withdraw.fields.a.b erH;
        final /* synthetic */ c erI;

        public l(d dVar, com.iqoption.withdraw.fields.a.b bVar, c cVar) {
            this.erC = dVar;
            this.erH = bVar;
            this.erI = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.erH.setValue(this.erC.bci().format(this.erI.bcg()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/withdraw/fields/WithdrawFieldsFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class m extends com.iqoption.core.ext.g {
        final /* synthetic */ d erC;
        final /* synthetic */ ImageView erJ;
        final /* synthetic */ double erK;
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.j erL;
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.c erM;
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.i erN;
        final /* synthetic */ com.iqoption.core.microservices.configuration.a.d erO;

        public m(ImageView imageView, double d, com.iqoption.core.microservices.withdraw.response.j jVar, d dVar, com.iqoption.core.microservices.withdraw.response.c cVar, com.iqoption.core.microservices.withdraw.response.i iVar, com.iqoption.core.microservices.configuration.a.d dVar2) {
            this.erJ = imageView;
            this.erK = d;
            this.erL = jVar;
            this.erC = dVar;
            this.erM = cVar;
            this.erN = iVar;
            this.erO = dVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int[] iArr = new int[2];
            this.erJ.getLocationInWindow(iArr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(h.b(this.erK, this.erL, this.erO));
            com.iqoption.core.microservices.withdraw.response.j jVar = this.erL;
            if (jVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            double d = (double) null;
            String str = ", ";
            if (jVar.getMin() > d) {
                stringBuilder.append(str);
                stringBuilder.append(this.erC.getString(com.iqoption.withdraw.d.f.minimum_short_n1, com.iqoption.core.util.e.a(this.erL.getMin(), this.erO, true)));
            }
            if (this.erL.getMax() > d) {
                stringBuilder.append(str);
                stringBuilder.append(this.erC.getString(com.iqoption.withdraw.d.f.maximum_short_n1, com.iqoption.core.util.e.a(this.erL.getMax(), this.erO, true)));
            }
            String string = this.erC.getString(com.iqoption.withdraw.d.f.commission_will_be_taken_n1, stringBuilder);
            kotlin.jvm.internal.i.e(string, "getString(R.string.commi…1, feeDescriptionBuilder)");
            d.d(this.erC).a(new com.iqoption.withdraw.c(string, iArr[0], iArr[1]));
        }
    }

    private final DecimalFormat bci() {
        kotlin.d dVar = this.erv;
        kotlin.reflect.j jVar = anY[0];
        return (DecimalFormat) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ g d(d dVar) {
        g gVar = dVar.erq;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return gVar;
    }

    public static final /* synthetic */ com.iqoption.withdraw.a.c h(d dVar) {
        com.iqoption.withdraw.a.c cVar = dVar.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return cVar;
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private final void a(com.iqoption.core.microservices.withdraw.response.a aVar) {
        this.erx = aVar;
        this.handler.postDelayed(this.erz, 500);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eru = bundle != null ? (i) bundle.getParcelable("STATE_WITHDRAW") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.erp = (com.iqoption.withdraw.a.c) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.withdraw.d.e.fragment_withdraw_fields, viewGroup, false, 4, null);
        com.iqoption.withdraw.a.c cVar = this.erp;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        s sVar = cVar.epU;
        View[] viewArr = new View[5];
        TextView textView = sVar.eqC;
        kotlin.jvm.internal.i.e(textView, "withdrawFeeLabel");
        viewArr[0] = textView;
        textView = sVar.eqG;
        kotlin.jvm.internal.i.e(textView, "withdrawFeeValue");
        viewArr[1] = textView;
        textView = sVar.eqE;
        kotlin.jvm.internal.i.e(textView, "withdrawFeeTotalLabel");
        viewArr[2] = textView;
        ImageView imageView = sVar.eqB;
        kotlin.jvm.internal.i.e(imageView, "withdrawFeeInfo");
        viewArr[3] = imageView;
        TextView textView2 = sVar.eqF;
        kotlin.jvm.internal.i.e(textView2, "withdrawFeeTotalValue");
        viewArr[4] = textView2;
        this.erw = viewArr;
        cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return cVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().findFragmentByTag(com.iqoption.withdraw.fields.verify.f.esn.Bx()) == null) {
            getChildFragmentManager().beginTransaction().add(com.iqoption.withdraw.d.d.withdrawFieldsVerifyContainer, com.iqoption.withdraw.fields.verify.f.esn.bcE(), com.iqoption.withdraw.fields.verify.f.esn.Bx()).commitNow();
        }
        this.ers = (List) null;
        this.erq = g.erT.bB(this);
        g gVar = this.erq;
        String str = "viewModel";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(gVar.bcv(), new g(this));
        gVar = this.erq;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.bcu();
        gVar = this.erq;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(gVar.bcw(), new h(this));
        com.iqoption.withdraw.a.c cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Button button = cVar.epT.eqK;
        button.setEnabled(false);
        button.setOnClickListener(new f(this));
    }

    public void onDestroyView() {
        this.handler.removeCallbacks(this.erz);
        this.handler.removeCallbacks(this.erA);
        super.onDestroyView();
        Bj();
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        c cVar = this.err;
        if (cVar != null) {
            com.iqoption.core.microservices.withdraw.response.c bcf = cVar.bcf();
            HashMap fB = fB(true);
            if (fB != null) {
                bundle.putParcelable("STATE_WITHDRAW", new i(bcf, fB));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
        }
        super.onSaveInstanceState(bundle);
    }

    private final void a(c cVar) {
        this.err = cVar;
        Fade fade = new Fade();
        fade.setDuration(300);
        com.iqoption.withdraw.a.c cVar2 = this.erp;
        String str = "binding";
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = cVar2.getRoot();
        if (root != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) root, fade);
            com.iqoption.core.microservices.withdraw.response.a bco = bco();
            com.iqoption.core.microservices.withdraw.response.a bcp = bcp();
            double doubleValue = cVar.VL().aeo().doubleValue();
            boolean z = false;
            Object obj = (doubleValue == 0.0d || doubleValue < bcp.getValue() || bco.getValue() == 0.0d) ? 1 : null;
            if (obj != null) {
                a(doubleValue, bcp);
                return;
            }
            bcj();
            com.iqoption.core.microservices.withdraw.response.c bcf = cVar.bcf();
            cVar2 = this.erp;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            y yVar = cVar2.epT;
            kotlin.jvm.internal.i.e(yVar, "binding.withdrawButtonLayout");
            root = yVar.getRoot();
            kotlin.jvm.internal.i.e(root, "binding.withdrawButtonLayout.root");
            root.setVisibility(0);
            List ajD = bcf.ajD();
            if ((kotlin.jvm.internal.i.y(this.ers, ajD) ^ 1) != 0) {
                this.ers = ajD;
                b(cVar);
            } else {
                Map map = this.cyx;
                com.iqoption.withdraw.fields.a.b bVar = this.ert;
                if (bVar == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                map.put("amount", Boolean.valueOf(a(bVar, ValidationUIMode.UPDATE_UI_IMMEDIATE, ValidationUIMode.UPDATE_UI_IMMEDIATE)));
                bck();
            }
            a(cVar.bbS(), bcf, cVar.VM());
            com.iqoption.withdraw.fields.verify.f fVar = (com.iqoption.withdraw.fields.verify.f) getChildFragmentManager().findFragmentByTag(com.iqoption.withdraw.fields.verify.f.esn.Bx());
            if (fVar != null) {
                if (cVar.bch() == WithdrawMethodType.COMMON) {
                    z = true;
                }
                fVar.fE(z);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void a(double d, com.iqoption.core.microservices.withdraw.response.a aVar) {
        CharSequence string;
        com.iqoption.withdraw.a.c cVar = this.erp;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = cVar.epX;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawFieldsSufficientFounds");
        linearLayout.setVisibility(8);
        cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ae aeVar = cVar.epW;
        kotlin.jvm.internal.i.e(aeVar, "binding.withdrawFieldsInsufficientFounds");
        View root = aeVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.withdrawFieldsInsufficientFounds.root");
        root.setVisibility(0);
        cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = cVar.epW.erb;
        kotlin.jvm.internal.i.e(textView, "binding.withdrawFieldsIn…fficientFoundsDescription");
        if (d > 0.0d) {
            string = getString(com.iqoption.withdraw.d.f.withdraw_lower_than_n1, b(aVar));
        } else {
            string = getString(com.iqoption.withdraw.d.f.your_balance_is_n1, R(d));
        }
        textView.setText(string);
    }

    private final void bcj() {
        com.iqoption.withdraw.a.c cVar = this.erp;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = cVar.epX;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawFieldsSufficientFounds");
        linearLayout.setVisibility(0);
        cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ae aeVar = cVar.epW;
        kotlin.jvm.internal.i.e(aeVar, "binding.withdrawFieldsInsufficientFounds");
        View root = aeVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.withdrawFieldsInsufficientFounds.root");
        root.setVisibility(8);
    }

    private final void a(com.iqoption.core.microservices.withdraw.response.i iVar, com.iqoption.core.microservices.withdraw.response.c cVar, com.iqoption.core.microservices.configuration.a.d dVar) {
        com.iqoption.withdraw.a.c cVar2 = this.erp;
        String str = "binding";
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.core.microservices.withdraw.response.j ajC = cVar.ajC();
        double ajB = cVar.ajB();
        int i = 0;
        if (ajB > ((double) null)) {
            i = 1;
        }
        int a = 1 ^ com.iqoption.withdraw.k.epD.a(iVar, cVar);
        String str2 = "withdrawFee.root";
        String str3 = "withdrawFee";
        String str4 = "withdrawNoFee.root";
        String str5 = "withdrawNoFee";
        if (i == 0 && a == 0) {
            u uVar = cVar2.epZ;
            kotlin.jvm.internal.i.e(uVar, str5);
            View root = uVar.getRoot();
            kotlin.jvm.internal.i.e(root, str4);
            com.iqoption.core.ext.a.ak(root);
            s sVar = cVar2.epU;
            kotlin.jvm.internal.i.e(sVar, str3);
            root = sVar.getRoot();
            kotlin.jvm.internal.i.e(root, str2);
            com.iqoption.core.ext.a.al(root);
            return;
        }
        u uVar2 = cVar2.epZ;
        kotlin.jvm.internal.i.e(uVar2, str5);
        View root2 = uVar2.getRoot();
        kotlin.jvm.internal.i.e(root2, str4);
        com.iqoption.core.ext.a.al(root2);
        s sVar2 = cVar2.epU;
        kotlin.jvm.internal.i.e(sVar2, str3);
        View root3 = sVar2.getRoot();
        kotlin.jvm.internal.i.e(root3, str2);
        com.iqoption.core.ext.a.ak(root3);
        cVar2 = this.erp;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = cVar2.epU.eqB;
        kotlin.jvm.internal.i.e(imageView, "binding.withdrawFee.withdrawFeeInfo");
        imageView.setOnClickListener(new m(imageView, ajB, ajC, this, cVar, iVar, dVar));
    }

    private final void b(c cVar) {
        com.iqoption.core.microservices.withdraw.response.c bcf = cVar.bcf();
        i iVar = this.eru;
        if (!com.iqoption.core.microservices.withdraw.response.m.a(iVar != null ? iVar.bcx() : null, bcf)) {
            this.eru = (i) null;
        }
        List ajD = bcf.ajD();
        com.iqoption.withdraw.a.c cVar2 = this.erp;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = cVar2.epV;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawFieldsContainer");
        linearLayout.removeAllViews();
        this.cyx.clear();
        Iterator it = ajD.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            ViewDataBinding viewDataBinding;
            com.iqoption.withdraw.fields.a.b aVar;
            Iterator it2;
            int i2;
            com.iqoption.core.microservices.withdraw.response.h hVar = (com.iqoption.core.microservices.withdraw.response.h) it.next();
            boolean c = f.a(hVar);
            if (c) {
                o oVar = (o) com.iqoption.core.ext.a.a(this, com.iqoption.withdraw.d.e.item_payout_amount_field, (ViewGroup) linearLayout, z);
                viewDataBinding = oVar;
                aVar = new com.iqoption.withdraw.fields.a.a(oVar, hVar);
                String a = com.iqoption.core.util.e.a(cVar.bcg(), cVar.VM(), true);
                TextView textView = oVar.eqx;
                String str = "amountBinding.withdrawAmountLimit";
                kotlin.jvm.internal.i.e(textView, str);
                ViewDataBinding viewDataBinding2 = viewDataBinding;
                it2 = it;
                textView.setText(getString(com.iqoption.withdraw.d.f.maximum_short_n1, a));
                TextView textView2 = oVar.eqx;
                kotlin.jvm.internal.i.e(textView2, str);
                textView2.setOnClickListener(new l(this, aVar, cVar));
                ((com.iqoption.withdraw.fields.a.a) aVar).aqn().setOnFocusChangeListener(new c(this, aVar));
                viewDataBinding = viewDataBinding2;
                i2 = 1;
            } else {
                c cVar3 = cVar;
                it2 = it;
                i2 = 1;
                viewDataBinding = com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.withdraw.d.e.item_payout_regular_field, (ViewGroup) linearLayout, false, 4, null);
                aVar = new com.iqoption.withdraw.fields.a.c((com.iqoption.withdraw.a.q) viewDataBinding, hVar);
                ((com.iqoption.withdraw.fields.a.c) aVar).setEditOnFocusChangeListener(new c(this, aVar));
            }
            View root = viewDataBinding.getRoot();
            kotlin.jvm.internal.i.e(root, "binding.root");
            root.setTag(aVar);
            String hq = LocalizationUtil.hq(hVar.ajJ());
            CharSequence charSequence = hq;
            Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
            if (obj != null) {
                hq = hVar.ajI();
            }
            aVar.hI(hq);
            aVar.setPlaceholder(hVar.aaQ());
            boolean z2 = i == ajD.size() - i2;
            EditText aqn = aVar.aqn();
            aqn.addTextChangedListener(new d(this, aVar));
            b(aqn, z2);
            c(aqn, c);
            a(aqn, hVar);
            if (c) {
                com.iqoption.withdraw.fields.a.b bVar = this.ert;
                if (bVar != null) {
                    String value = bVar.getValue();
                    if (value != null) {
                        aVar.setValue(value);
                    }
                }
                this.ert = aVar;
                com.iqoption.core.ui.widget.f.a[] aVarArr = new com.iqoption.core.ui.widget.f.a[i2];
                z = false;
                aVarArr[0] = new com.iqoption.core.ui.widget.f.a(2);
                aqn.setFilters((InputFilter[]) aVarArr);
                g gVar = this.erq;
                if (gVar == null) {
                    kotlin.jvm.internal.i.lG("viewModel");
                }
                String value2 = aVar.getValue();
                gVar.a(bcf, value2 != null ? s.mV(value2) : null);
                aqn.addTextChangedListener(new a());
            } else {
                z = false;
            }
            i iVar2 = this.eru;
            if (iVar2 != null) {
                Map aaO = iVar2.aaO();
                if (aaO != null) {
                    aqn.setText((CharSequence) aaO.get(hVar.getName()));
                }
            }
            if (z2 && ajD.size() > 2) {
                linearLayout.addView(new Space(com.iqoption.core.ext.a.q(this)), new LayoutParams(-1, com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelOffset(com.iqoption.withdraw.d.b.dp20)));
            }
            linearLayout.addView(root);
            this.cyx.put(hVar.getName(), Boolean.valueOf(a(aVar, ValidationUIMode.SKIP_UI_UPDATES, ValidationUIMode.SKIP_UI_UPDATES)));
            i++;
            it = it2;
        }
        bck();
        this.eru = (i) null;
    }

    private final void b(EditText editText, boolean z) {
        if (z) {
            editText.setImeOptions(268435462);
            editText.setOnEditorActionListener(new e(this));
            return;
        }
        editText.setImeOptions(268435461);
    }

    private final void c(EditText editText, boolean z) {
        if (z) {
            editText.setInputType(8194);
        }
    }

    private final void a(EditText editText, com.iqoption.core.microservices.withdraw.response.h hVar) {
        editText.setSingleLine(e.axg[hVar.ajK().ordinal()] == 1);
        if (hVar.ajK() == PayoutFieldType.TEXT) {
            editText.setFilters((InputFilter[]) new LengthFilter[]{new LengthFilter(255)});
        }
    }

    private final void bck() {
        com.iqoption.withdraw.a.c cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Button button = cVar.epT.eqK;
        kotlin.jvm.internal.i.e(button, "binding.withdrawButtonLayout.withdrawButton");
        button.setEnabled(bcn());
    }

    private final void bcl() {
        aqd();
        View view = getView();
        if (view != null) {
            view = view.findFocus();
            if (view != null) {
                view.clearFocus();
            }
        }
        fC(true);
        HashMap fB = fB(false);
        Object obj = fB.get("amount");
        if (obj != null) {
            double doubleValue = ((Double) obj).doubleValue();
            c cVar = this.err;
            if (cVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            g gVar = this.erq;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            gVar.a(cVar.bcf(), fB).observe(this, new i(this, doubleValue, cVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
    }

    private final HashMap<String, Object> fB(boolean z) {
        HashMap hashMap = new HashMap();
        com.iqoption.withdraw.a.c cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = cVar.epV;
        kotlin.jvm.internal.i.e(linearLayout, "binding.withdrawFieldsContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "child");
            Object tag = childAt.getTag();
            if (!(tag instanceof com.iqoption.withdraw.fields.a.b)) {
                tag = null;
            }
            com.iqoption.withdraw.fields.a.b bVar = (com.iqoption.withdraw.fields.a.b) tag;
            if (bVar != null) {
                String name = bVar.bcy().getName();
                String value = bVar.getValue();
                if (value == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                if (z || !f.a(bVar.bcy())) {
                    hashMap.put(name, value);
                } else {
                    hashMap.put(name, Double.valueOf(Double.parseDouble(value)));
                }
            }
        }
        return hashMap;
    }

    private final void bcm() {
        fC(false);
        com.iqoption.withdraw.d.b.etC.a((Fragment) this, false, null);
    }

    private final void kl(String str) {
        fC(false);
        com.iqoption.withdraw.d.b.etC.a((Fragment) this, true, str);
    }

    private final void fC(boolean z) {
        com.iqoption.withdraw.a.c cVar = this.erp;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        y yVar = cVar.epT;
        ContentLoadingProgressBar contentLoadingProgressBar = yVar.eqL;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "withdrawButtonProgress");
        boolean z2 = false;
        contentLoadingProgressBar.setVisibility(z ? 0 : 8);
        Button button = yVar.eqK;
        kotlin.jvm.internal.i.e(button, "withdrawButton");
        if (!z && bcn()) {
            z2 = true;
        }
        button.setEnabled(z2);
    }

    private final boolean bcn() {
        if (!(this.ery || (this.cyx.isEmpty() ^ 1) == 0)) {
            for (Object next : this.cyx.values()) {
                if ((((Boolean) next).booleanValue() ^ 1) != 0) {
                    break;
                }
            }
            Object next2 = null;
            if (next2 == null) {
                return true;
            }
        }
        return false;
    }

    private final String b(com.iqoption.core.microservices.withdraw.response.a aVar) {
        return R(aVar.getValue());
    }

    private final String R(double d) {
        c cVar = this.err;
        if (cVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return com.iqoption.core.util.e.a(d, 0, cVar.VM().getMask(), false, false, false, false, null, null, 253, null);
    }

    private final void aqd() {
        if (akX()) {
            Context activity = getActivity();
            View view = getView();
            if (view == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            v.a(activity, view);
        }
    }

    private final com.iqoption.core.microservices.withdraw.response.a km(String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj != null) {
            return null;
        }
        double parseDouble = Double.parseDouble(str);
        com.iqoption.core.microservices.withdraw.response.a bco = bco();
        if (parseDouble > bco.getValue()) {
            return bco;
        }
        bco = bcp();
        if (parseDouble < bco.getValue()) {
            return bco;
        }
        return null;
    }

    private final com.iqoption.core.microservices.withdraw.response.a bco() {
        c cVar = this.err;
        if (cVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        com.iqoption.core.microservices.withdraw.response.c bcf = cVar.bcf();
        Double d = null;
        com.iqoption.core.microservices.withdraw.response.e eVar = (com.iqoption.core.microservices.withdraw.response.e) (!(bcf instanceof com.iqoption.core.microservices.withdraw.response.e) ? null : bcf);
        if (eVar != null) {
            d = Double.valueOf(eVar.ajG());
        }
        Double d2 = d;
        c cVar2 = this.err;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        double doubleValue = cVar2.VL().aeo().doubleValue();
        cVar2 = this.err;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return com.iqoption.core.microservices.withdraw.response.b.a(doubleValue, Double.valueOf(cVar2.bcg()), bcf.ajB(), d2, bcf.ajE());
    }

    private final com.iqoption.core.microservices.withdraw.response.a bcp() {
        c cVar = this.err;
        if (cVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return com.iqoption.core.microservices.withdraw.response.b.a(cVar.bcf().ajE());
    }

    private final boolean bcq() {
        com.iqoption.withdraw.fields.a.b bVar = this.ert;
        if (bVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String value = bVar.getValue();
        if (value == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        if ((u.Y(value) ^ 1) != 0) {
            double parseDouble = Double.parseDouble(value);
            c cVar = this.err;
            if (cVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if (parseDouble <= cVar.VL().aeo().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    private final boolean a(com.iqoption.withdraw.fields.a.b r8, com.iqoption.withdraw.fields.ValidationUIMode r9, com.iqoption.withdraw.fields.ValidationUIMode r10) {
        /*
        r7 = this;
        r0 = r8.bcy();
        r1 = r8.getValue();
        r2 = com.iqoption.withdraw.fields.f.a(r0, r1);
        r3 = 1;
        r2 = r2 ^ r3;
        r4 = 0;
        if (r2 == 0) goto L_0x0035;
    L_0x0011:
        r5 = 2;
        r5 = new com.iqoption.withdraw.fields.ValidationUIMode[r5];
        r6 = com.iqoption.withdraw.fields.ValidationUIMode.UPDATE_UI_IMMEDIATE;
        r5[r4] = r6;
        r6 = com.iqoption.withdraw.fields.ValidationUIMode.UPDATE_UI_DELAYED;
        r5[r3] = r6;
        r5 = com.iqoption.core.ext.c.b(r9, r5);
        if (r5 == 0) goto L_0x0035;
    L_0x0022:
        r9 = r1;
        r9 = (java.lang.CharSequence) r9;
        if (r9 == 0) goto L_0x0030;
    L_0x0027:
        r9 = kotlin.text.u.Y(r9);
        if (r9 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0030;
    L_0x002e:
        r9 = 0;
        goto L_0x0031;
    L_0x0030:
        r9 = 1;
    L_0x0031:
        r7.a(r8, r9);
        goto L_0x0046;
    L_0x0035:
        if (r2 != 0) goto L_0x0046;
    L_0x0037:
        r5 = com.iqoption.withdraw.fields.ValidationUIMode.Companion;
        r5 = r5.bce();
        r9 = r5.contains(r9);
        if (r9 == 0) goto L_0x0046;
    L_0x0043:
        r7.a(r8);
    L_0x0046:
        r9 = com.iqoption.withdraw.fields.f.a(r0);
        if (r9 == 0) goto L_0x0051;
    L_0x004c:
        r1 = r7.km(r1);
        goto L_0x0052;
    L_0x0051:
        r1 = 0;
    L_0x0052:
        if (r1 == 0) goto L_0x0056;
    L_0x0054:
        r5 = 1;
        goto L_0x0057;
    L_0x0056:
        r5 = 0;
    L_0x0057:
        if (r9 == 0) goto L_0x008a;
    L_0x0059:
        r9 = r7.handler;
        r6 = r7.erz;
        r9.removeCallbacks(r6);
        if (r5 == 0) goto L_0x006a;
    L_0x0062:
        r9 = com.iqoption.withdraw.fields.ValidationUIMode.UPDATE_UI_IMMEDIATE;
        if (r10 != r9) goto L_0x006a;
    L_0x0066:
        r7.a(r1, r8);
        goto L_0x008a;
    L_0x006a:
        if (r5 == 0) goto L_0x0079;
    L_0x006c:
        r9 = com.iqoption.withdraw.fields.ValidationUIMode.UPDATE_UI_DELAYED;
        if (r10 != r9) goto L_0x0079;
    L_0x0070:
        if (r1 != 0) goto L_0x0075;
    L_0x0072:
        kotlin.jvm.internal.i.bnJ();
    L_0x0075:
        r7.a(r1);
        goto L_0x008a;
    L_0x0079:
        if (r5 != 0) goto L_0x008a;
    L_0x007b:
        r9 = com.iqoption.withdraw.fields.ValidationUIMode.Companion;
        r9 = r9.bce();
        r9 = r9.contains(r10);
        if (r9 == 0) goto L_0x008a;
    L_0x0087:
        r7.a(r8);
    L_0x008a:
        if (r2 != 0) goto L_0x008f;
    L_0x008c:
        if (r5 != 0) goto L_0x008f;
    L_0x008e:
        goto L_0x0090;
    L_0x008f:
        r3 = 0;
    L_0x0090:
        r8 = r7.cyx;
        r9 = r0.getName();
        r10 = java.lang.Boolean.valueOf(r3);
        r8.put(r9, r10);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.d.a(com.iqoption.withdraw.fields.a.b, com.iqoption.withdraw.fields.ValidationUIMode, com.iqoption.withdraw.fields.ValidationUIMode):boolean");
    }

    private final void a(com.iqoption.withdraw.fields.a.b bVar) {
        bVar.kn(null);
    }

    private final void a(com.iqoption.withdraw.fields.a.b bVar, boolean z) {
        int i;
        if (z) {
            i = com.iqoption.withdraw.d.f.not_filled;
        } else {
            i = com.iqoption.withdraw.d.f.incorrect;
        }
        bVar.kn(com.iqoption.core.ext.a.q(this).getString(i));
    }

    private final void a(com.iqoption.core.microservices.withdraw.response.a aVar, com.iqoption.withdraw.fields.a.b bVar) {
        bVar.kn(aVar != null ? c(aVar) : null);
    }

    private final void bcr() {
        this.handler.postDelayed(this.erA, 500);
    }

    private final void fD(boolean z) {
        String str = "feeContentViews";
        String str2 = "binding";
        String str3 = "binding.withdrawFee.withdrawFeeProgress";
        int i = 0;
        com.iqoption.withdraw.a.c cVar;
        ContentLoadingProgressBar contentLoadingProgressBar;
        View[] viewArr;
        int length;
        if (z) {
            cVar = this.erp;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            contentLoadingProgressBar = cVar.epU.eqD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
            contentLoadingProgressBar.setVisibility(0);
            viewArr = this.erw;
            if (viewArr == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            length = viewArr.length;
            while (i < length) {
                com.iqoption.core.ext.a.hide(viewArr[i]);
                i++;
            }
        } else {
            cVar = this.erp;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            contentLoadingProgressBar = cVar.epU.eqD;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str3);
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
            viewArr = this.erw;
            if (viewArr == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            length = viewArr.length;
            while (i < length) {
                com.iqoption.core.ext.a.ak(viewArr[i]);
                i++;
            }
        }
        this.ery = z;
        bck();
    }

    private final String c(com.iqoption.core.microservices.withdraw.response.a aVar) {
        int i = e.aFX[aVar.ajx().ordinal()];
        String string;
        if (i == 1) {
            Object string2;
            if (bcq()) {
                string2 = getString(com.iqoption.withdraw.d.f.the_requested_amount_should_not_include_fee);
            } else {
                string2 = getString(com.iqoption.withdraw.d.f.you_cannot_withdraw_exceed_balance);
            }
            kotlin.jvm.internal.i.e(string2, "if (isFitWithoutCommissi…_withdraw_exceed_balance)");
            return string2;
        } else if (i == 2) {
            if (aVar.ajy() == LimitDirection.UPPER) {
                string = getString(com.iqoption.withdraw.d.f.max_withdraw_in_one_transaction);
            } else {
                string = getString(com.iqoption.withdraw.d.f.withdraw_lower_than_n1, b(aVar));
            }
            kotlin.jvm.internal.i.e(string, "if (limit.direction == U…untWithWalletMask(limit))");
            return string;
        } else if (i == 3) {
            string = getString(com.iqoption.withdraw.d.f.amount_cannot_exeed);
            kotlin.jvm.internal.i.e(string, "getString(R.string.amount_cannot_exeed)");
            return string;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
