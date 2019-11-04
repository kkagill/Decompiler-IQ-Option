package com.iqoption.deposit.a;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty.PropertyType;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.deposit.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH$J2\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H$J\u0010\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020)H$J\b\u0010*\u001a\u00020\u001eH$J\b\u0010+\u001a\u00020,H$J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u0006H\u0002J\b\u00100\u001a\u00020\u0013H\u0002J0\u00101\u001a\u0002022\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H$J(\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u0002062\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0007H$J(\u00107\u001a\u0002082\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u0002092\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0007H$J\u001a\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020.2\b\u0010<\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010=\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0012\u0010@\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0016J\b\u0010E\u001a\u00020\u0013H\u0016J\u001a\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020H2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010I\u001a\u00020\u000fH\u0016J0\u0010J\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J(\u0010K\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u0002062\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0007H\u0002J(\u0010L\u001a\u00020.2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u0002092\u0006\u0010#\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0007H\u0002J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u0007H\u0016J\u0010\u0010R\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010S\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0002J \u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u000206H\u0002J\u0010\u0010V\u001a\u00020\u00132\u0006\u0010;\u001a\u000208H\u0002J\b\u0010W\u001a\u00020\u0007H\u0016J\u0018\u0010X\u001a\u00020\u00072\u0006\u0010;\u001a\u00020.2\u0006\u0010Y\u001a\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006["}, bng = {"Lcom/iqoption/deposit/constructor/BaseConstructorFragment;", "Lcom/iqoption/deposit/PayFieldsContainerFragment;", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "()V", "fieldsValidationMap", "", "", "", "infoPopupEvent", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "infoPopupHelper", "Lcom/iqoption/InfoPopupHelper;", "lastSelectedInfoButton", "Landroid/widget/ImageView;", "paymentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "viewModel", "Lcom/iqoption/deposit/constructor/PaymentMethodFieldsViewModel;", "applyImeOptions", "", "edit", "Landroid/widget/EditText;", "isLastField", "changeInfoSelection", "infoButton", "selected", "collectParams", "", "", "contentContainer", "Landroid/view/ViewGroup;", "createFieldView", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "name", "container", "createSelectorIntegerMenuEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "params", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;", "createSelectorStringMenuEntry", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringMenuParams;", "fieldsContainer", "fieldsNoInput", "Landroid/widget/TextView;", "findHolderByName", "Lcom/iqoption/deposit/constructor/FieldHolder;", "fieldName", "hideKeyboardIfOpened", "inflateEditFieldHolder", "Lcom/iqoption/deposit/light/constructor/EditLightFieldHolder;", "isRequired", "inflateSelectIntegerFieldHolder", "Lcom/iqoption/deposit/constructor/BaseSelectIntegerFieldHolder;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty;", "inflateSelectStringFieldHolder", "Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "isValidField", "holder", "value", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInfoClicked", "info", "onStop", "onViewCreated", "view", "Landroid/view/View;", "payMethod", "prepareEditFieldHolder", "prepareSelectIntegerFieldHolder", "prepareSelectStringFieldHolder", "requestFullScreenFields", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "setFieldsEnabled", "enabled", "setPaymentMethod", "showInfoPopup", "showSelectIntegerMenu", "editText", "showSelectStringMenu", "validate", "validateField", "showError", "Companion", "deposit_release"})
/* compiled from: BaseConstructorFragment.kt */
public abstract class a extends n implements g {
    private static final String TAG;
    public static final a cyB = new a();
    private HashMap apm;
    private com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d bnL;
    private ImageView cyA;
    private h cyw;
    private final Map<String, Boolean> cyx = new LinkedHashMap();
    private final com.iqoption.c cyy = new com.iqoption.c(new c(this));
    private com.iqoption.core.analytics.b cyz;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/constructor/BaseConstructorFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "deposit_release"})
    /* compiled from: BaseConstructorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class b implements OnEditorActionListener {
        final /* synthetic */ a cyC;

        b(a aVar) {
            this.cyC = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.cyC.aqd();
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focused", "", "onFocusChange", "com/iqoption/deposit/constructor/BaseConstructorFragment$prepareEditFieldHolder$1$2"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class h implements OnFocusChangeListener {
        final /* synthetic */ a cyC;
        final /* synthetic */ com.iqoption.deposit.light.constructor.b cyD;
        final /* synthetic */ boolean cyE;
        final /* synthetic */ ExtraParamProperty cyF;
        final /* synthetic */ String cyG;

        h(a aVar, com.iqoption.deposit.light.constructor.b bVar, boolean z, ExtraParamProperty extraParamProperty, String str) {
            this.cyC = aVar;
            this.cyD = bVar;
            this.cyE = z;
            this.cyF = extraParamProperty;
            this.cyG = str;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                JsonObject atf = com.iqoption.deposit.d.a.cGB.atf();
                atf.add("field_name", new JsonPrimitive(this.cyG));
                com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d a = this.cyC.bnL;
                com.iqoption.core.d.Um().EC().c("deposit-page_field", a != null ? (double) a.getId() : 0.0d, atf);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/iqoption/deposit/constructor/BaseConstructorFragment$prepareSelectIntegerFieldHolder$1$2"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class j implements OnFocusChangeListener {
        final /* synthetic */ a cyC;
        final /* synthetic */ String cyG;
        final /* synthetic */ d cyH;
        final /* synthetic */ com.iqoption.core.microservices.billing.response.extraparams.a cyI;

        j(a aVar, d dVar, String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar2) {
            this.cyC = aVar;
            this.cyH = dVar;
            this.cyG = str;
            this.cyI = aVar2;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.cyC.a(this.cyH.aqn(), this.cyG, this.cyI);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/iqoption/deposit/constructor/BaseConstructorFragment$prepareSelectStringFieldHolder$1$2"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class l implements OnFocusChangeListener {
        final /* synthetic */ a cyC;
        final /* synthetic */ e cyJ;

        l(a aVar, e eVar) {
            this.cyC = aVar;
            this.cyJ = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.cyC.a(this.cyJ);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, bng = {"com/iqoption/deposit/constructor/BaseConstructorFragment$infoPopupHelper$1", "Lcom/iqoption/InfoPopupHelper$OnInfoListener;", "onInfoClosed", "", "onInfoOpened", "deposit_release"})
    /* compiled from: BaseConstructorFragment.kt */
    public static final class c implements com.iqoption.c.a {
        final /* synthetic */ a cyC;

        c(a aVar) {
            this.cyC = aVar;
        }

        public void zE() {
            this.cyC.cyz = com.iqoption.core.d.EC().dl("deposit-by-constructor-info_show");
        }

        public void zF() {
            com.iqoption.core.analytics.b c = this.cyC.cyz;
            if (c != null) {
                c.Cc();
            }
            this.cyC.cyz = (com.iqoption.core.analytics.b) null;
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d a = this.cyC.bnL;
            jsonObject.addProperty("payment_method-id", (Number) a != null ? Long.valueOf(a.getId()) : null);
            EC.a("deposit-by-constructor-info_ok", jsonObject);
            ImageView d = this.cyC.cyA;
            if (d != null) {
                this.cyC.a(d, false);
            }
            this.cyC.cyA = (ImageView) null;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ a cyC;

        d(a aVar) {
            this.cyC = aVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) {
                this.cyC.a((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "item", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class e<T> implements Observer<com.iqoption.deposit.a.a.a.b> {
        final /* synthetic */ a cyC;

        e(a aVar) {
            this.cyC = aVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.deposit.a.a.a.b bVar) {
            if (bVar != null) {
                f a = this.cyC.hG(bVar.aqs());
                if (!(a instanceof d)) {
                    a = null;
                }
                d dVar = (d) a;
                if (dVar != null) {
                    dVar.hH(null);
                    dVar.aqn().setText(String.valueOf(bVar.getValue()));
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "item", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseConstructorFragment.kt */
    static final class f<T> implements Observer<com.iqoption.deposit.a.a.b.c> {
        final /* synthetic */ a cyC;

        f(a aVar) {
            this.cyC = aVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.deposit.a.a.b.c cVar) {
            if (cVar != null) {
                f a = this.cyC.hG(cVar.aqs());
                if (!(a instanceof e)) {
                    a = null;
                }
                e eVar = (e) a;
                if (eVar != null) {
                    eVar.hH(null);
                    EditText aqn = eVar.aqn();
                    eVar.setValue(cVar.getValue());
                    aqn.setText(cVar.getDescription());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/deposit/constructor/BaseConstructorFragment$prepareEditFieldHolder$1$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "text", "Landroid/text/Editable;", "deposit_release"})
    /* compiled from: BaseConstructorFragment.kt */
    public static final class g extends ah {
        final /* synthetic */ a cyC;
        final /* synthetic */ com.iqoption.deposit.light.constructor.b cyD;
        final /* synthetic */ boolean cyE;
        final /* synthetic */ ExtraParamProperty cyF;
        final /* synthetic */ String cyG;

        g(a aVar, com.iqoption.deposit.light.constructor.b bVar, boolean z, ExtraParamProperty extraParamProperty, String str) {
            this.cyC = aVar;
            this.cyD = bVar;
            this.cyE = z;
            this.cyF = extraParamProperty;
            this.cyG = str;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "text");
            super.afterTextChanged(editable);
            this.cyC.a((f) this.cyD, false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/deposit/constructor/BaseConstructorFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ a cyC;
        final /* synthetic */ String cyG;
        final /* synthetic */ d cyH;
        final /* synthetic */ com.iqoption.core.microservices.billing.response.extraparams.a cyI;

        public i(a aVar, d dVar, String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar2) {
            this.cyC = aVar;
            this.cyH = dVar;
            this.cyG = str;
            this.cyI = aVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cyC.a(this.cyH.aqn(), this.cyG, this.cyI);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/deposit/constructor/BaseConstructorFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class k extends com.iqoption.core.ext.g {
        final /* synthetic */ a cyC;
        final /* synthetic */ e cyJ;

        public k(a aVar, e eVar) {
            this.cyC = aVar;
            this.cyJ = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cyC.a(this.cyJ);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract com.iqoption.core.ui.d.c a(com.iqoption.deposit.a.a.a.c cVar);

    public abstract com.iqoption.core.ui.d.c a(com.iqoption.deposit.a.a.b.d dVar);

    public boolean a(com.iqoption.deposit.i iVar) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        return false;
    }

    public abstract ViewGroup apg();

    public abstract ViewGroup aqe();

    public abstract TextView aqf();

    public abstract d b(String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar, ViewGroup viewGroup, boolean z);

    public abstract e b(String str, com.iqoption.core.microservices.billing.response.extraparams.c cVar, ViewGroup viewGroup, boolean z);

    public abstract com.iqoption.deposit.light.constructor.b b(String str, ExtraParamProperty extraParamProperty, ViewGroup viewGroup, boolean z, boolean z2);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "BaseConstructorFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cyw = h.cyS.G(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        this.bnL = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) null;
        h hVar = this.cyw;
        String str = "viewModel";
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        hVar.aqq().observe(lifecycleOwner, new d(this));
        hVar = this.cyw;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        hVar.aqr().observe(lifecycleOwner, new e(this));
        hVar = this.cyw;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        hVar.aoH().observe(lifecycleOwner, new f(this));
    }

    private final f hG(String str) {
        ViewGroup apg = apg();
        int childCount = apg.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = apg.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "container.getChildAt(i)");
            Object tag = childAt.getTag();
            if (tag != null) {
                f fVar = (f) tag;
                if (kotlin.jvm.internal.i.y(fVar.getName(), str)) {
                    return fVar;
                }
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.constructor.FieldHolder");
            }
        }
        return null;
    }

    private final void a(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar) {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar2 = dVar;
        ViewGroup apg = apg();
        int childCount = apg.getChildCount();
        int i = 0;
        while (true) {
            String str = null;
            if (i < childCount) {
                View childAt = apg.getChildAt(i);
                kotlin.jvm.internal.i.e(childAt, "child");
                Object tag = childAt.getTag();
                if (tag != null) {
                    com.iqoption.deposit.light.b.b(((f) tag).aqn(), null);
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.constructor.FieldHolder");
                }
            } else if (!kotlin.jvm.internal.i.y(this.bnL, dVar2)) {
                this.bnL = dVar2;
                this.cyx.clear();
                apg.removeAllViews();
                com.iqoption.core.microservices.billing.response.extraparams.e aaH = dVar.aaH();
                if (aaH != null) {
                    str = aaH.aaT();
                }
                String str2 = str;
                if (str2 != null) {
                    String str3;
                    ExtraParamProperty extraParamProperty;
                    int size = str2.size();
                    ArrayList aaS = aaH.aaS();
                    if (aaS != null) {
                        Iterator it = aaS.iterator();
                        childCount = 0;
                        while (it.hasNext()) {
                            str3 = (String) it.next();
                            HashMap aaT = aaH.aaT();
                            if (aaT == null) {
                                kotlin.jvm.internal.i.bnJ();
                            }
                            extraParamProperty = (ExtraParamProperty) aaT.get(str3);
                            if (extraParamProperty != null) {
                                int i2 = childCount + 1;
                                kotlin.jvm.internal.i.e(str3, ConditionalUserProperty.NAME);
                                int i3 = i2;
                                a(dVar, extraParamProperty, str3, i2 == size, apg);
                                childCount = i3;
                            }
                        }
                    } else {
                        childCount = 0;
                    }
                    for (Entry entry : ((Map) str2).entrySet()) {
                        str3 = (String) entry.getKey();
                        extraParamProperty = (ExtraParamProperty) entry.getValue();
                        if (aaS == null || !aaS.contains(str3)) {
                            int i4 = childCount + 1;
                            a(dVar, extraParamProperty, str3, i4 == size, apg);
                            childCount = i4;
                        }
                    }
                }
                ViewGroup aqe = aqe();
                if (dVar.aaE()) {
                    com.iqoption.core.ext.a.al(aqe);
                    com.iqoption.core.ext.a.ak(aqf());
                    String string = getString(com.iqoption.deposit.o.g.payment_methods_need_verification);
                    kotlin.jvm.internal.i.e(string, "getString(R.string.payme…ethods_need_verification)");
                    com.iqoption.deposit.h.cwJ.a(this, aqf(), string, false);
                } else if (com.iqoption.core.microservices.billing.response.deposit.c.f(dVar2)) {
                    com.iqoption.core.ext.a.al(aqf());
                    com.iqoption.core.ext.a.al(aqe);
                } else if (apg.getChildCount() == 0) {
                    com.iqoption.core.ext.a.al(aqe);
                    com.iqoption.core.ext.a.ak(aqf());
                    aqf().setText(com.iqoption.deposit.o.g.you_will_be_redirected_to_payment_gate);
                } else {
                    com.iqoption.core.ext.a.ak(aqe);
                    com.iqoption.core.ext.a.al(aqf());
                }
                return;
            } else {
                return;
            }
        }
    }

    private final void a(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar, ExtraParamProperty extraParamProperty, String str, boolean z, ViewGroup viewGroup) {
        if (extraParamProperty != null) {
            f a;
            com.iqoption.core.microservices.billing.response.extraparams.e aaH = dVar.aaH();
            if (aaH == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            ArrayList aaS = aaH.aaS();
            if (aaS == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            boolean contains = aaS.contains(str);
            int i = b.aob[extraParamProperty.aaK().ordinal()];
            if (i == 1) {
                a = a(str, (com.iqoption.core.microservices.billing.response.extraparams.a) extraParamProperty, viewGroup, contains);
            } else if (i != 2) {
                a = a(str, extraParamProperty, viewGroup, contains, z);
            } else {
                a = a(str, (com.iqoption.core.microservices.billing.response.extraparams.c) extraParamProperty, viewGroup, contains);
            }
            a.hI(extraParamProperty.getHint());
            View aqm = a.aqm();
            aqm.setTag(a);
            viewGroup.addView(aqm);
            this.cyx.put(str, Boolean.valueOf(a(a, false)));
        }
    }

    private final f a(String str, ExtraParamProperty extraParamProperty, ViewGroup viewGroup, boolean z, boolean z2) {
        com.iqoption.deposit.light.constructor.b b = b(str, extraParamProperty, viewGroup, z, z2);
        z = extraParamProperty instanceof com.iqoption.core.microservices.billing.response.extraparams.d;
        if (z) {
            com.iqoption.core.microservices.billing.response.extraparams.d dVar = (com.iqoption.core.microservices.billing.response.extraparams.d) extraParamProperty;
            if (dVar.aaR() != null) {
                InputFilter[] filters = b.aqn().getFilters();
                IQTextInputEditText arP = b.aqn();
                kotlin.jvm.internal.i.e(filters, "filters");
                Integer aaR = dVar.aaR();
                if (aaR == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                arP.setFilters((InputFilter[]) h.a((Object[]) filters, (Object) new LengthFilter(aaR.intValue())));
            }
        }
        b.setTitle(extraParamProperty.getTitle());
        IQTextInputEditText arP2 = b.aqn();
        arP2.addTextChangedListener(new g(this, b, z2, extraParamProperty, str));
        b((EditText) arP2, z2);
        arP2.setSingleLine(true);
        if (extraParamProperty.aaK() == PropertyType.integerType) {
            arP2.setInputType(8194);
            arP2.setKeyListener(DigitsKeyListener.getInstance(false, true));
        }
        b.setEditOnFocusChangeListener(new h(this, b, z2, extraParamProperty, str));
        str = null;
        if (!z) {
            extraParamProperty = null;
        }
        com.iqoption.core.microservices.billing.response.extraparams.d dVar2 = (com.iqoption.core.microservices.billing.response.extraparams.d) extraParamProperty;
        if (dVar2 != null) {
            str = dVar2.aaQ();
        }
        b.setPlaceholder(str);
        return b;
    }

    private final f a(String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar, ViewGroup viewGroup, boolean z) {
        d b = b(str, aVar, viewGroup, z);
        b.setTitle(aVar.getTitle());
        EditText aqn = b.aqn();
        aqn.setInputType(0);
        aqn.setOnClickListener(new i(this, b, str, aVar));
        aqn.setOnFocusChangeListener(new j(this, b, str, aVar));
        return b;
    }

    private final void a(EditText editText, String str, com.iqoption.core.microservices.billing.response.extraparams.a aVar) {
        CharSequence obj = editText.getText().toString();
        Integer valueOf = (obj.length() == 0 ? 1 : null) != null ? null : Integer.valueOf(com.iqoption.core.ext.c.B(obj));
        List aaM = aVar.aaM();
        if (aaM == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        com.iqoption.core.ui.d.g.b(com.iqoption.deposit.navigator.b.cGp.P(this), a(new com.iqoption.deposit.a.a.a.c(str, aaM, valueOf)), false, 2, null);
    }

    private final f a(String str, com.iqoption.core.microservices.billing.response.extraparams.c cVar, ViewGroup viewGroup, boolean z) {
        e b = b(str, cVar, viewGroup, z);
        b.setTitle(cVar.getTitle());
        EditText aqn = b.aqn();
        aqn.setInputType(0);
        aqn.setOnClickListener(new k(this, b));
        aqn.setOnFocusChangeListener(new l(this, b));
        return b;
    }

    private final void a(e eVar) {
        Object tag = eVar.aqn().getTag();
        if (!(tag instanceof String)) {
            tag = null;
        }
        String str = (String) tag;
        Map aaO = eVar.aql().aaO();
        if (aaO == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Iterable<Entry> entrySet = aaO.entrySet();
        Collection arrayList = new ArrayList(n.e(entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new com.iqoption.deposit.a.a.b.c(eVar.getName(), (String) entry.getKey(), (String) entry.getValue()));
        }
        com.iqoption.core.ui.d.g.b(com.iqoption.deposit.navigator.b.cGp.P(this), a(new com.iqoption.deposit.a.a.b.d((List) arrayList, str)), false, 2, null);
    }

    public boolean validate() {
        ViewGroup apg = apg();
        int childCount = apg.getChildCount();
        if (childCount == 0) {
            return true;
        }
        int i = 0;
        while (i < childCount) {
            View childAt = apg.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "child");
            Object tag = childAt.getTag();
            if (tag == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.constructor.FieldHolder");
            } else if (!a((f) tag, true)) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    private final boolean a(f fVar, boolean z) {
        boolean z2 = true;
        int a = a(fVar, fVar.value()) ^ 1;
        if (a == 0 || !z) {
            fVar.hH(null);
        } else {
            String aaL = fVar.aqg().aaL();
            if (aaL == null) {
                aaL = getString(com.iqoption.deposit.o.g.incorrect_value);
                kotlin.jvm.internal.i.e(aaL, "getString(R.string.incorrect_value)");
            }
            fVar.hH(aaL);
        }
        if (a != 0) {
            z2 = false;
        }
        this.cyx.put(fVar.getName(), Boolean.valueOf(z2));
        return z2;
    }

    private final boolean a(f fVar, String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        Object obj2 = (obj == null || fVar.wo()) ? null : 1;
        ExtraParamProperty aqg = fVar.aqg();
        if (obj == null && (aqg instanceof com.iqoption.core.microservices.billing.response.extraparams.d)) {
            com.iqoption.core.microservices.billing.response.extraparams.d dVar = (com.iqoption.core.microservices.billing.response.extraparams.d) aqg;
            CharSequence pattern = dVar.getPattern();
            Object obj3 = (pattern == null || pattern.length() == 0) ? 1 : null;
            if (obj3 == null) {
                return Pattern.matches(dVar.getPattern(), charSequence);
            }
        }
        if (obj == null || obj2 != null) {
            return true;
        }
        return false;
    }

    public Map<String, Object> aoR() {
        ViewGroup apg = apg();
        int childCount = apg.getChildCount();
        Map linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < childCount) {
            View childAt = apg.getChildAt(i);
            kotlin.jvm.internal.i.e(childAt, "child");
            Object tag = childAt.getTag();
            if (tag != null) {
                f fVar = (f) tag;
                linkedHashMap.put(fVar.getName(), fVar.value());
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.constructor.FieldHolder");
            }
        }
        return linkedHashMap;
    }

    /* renamed from: aqc */
    public com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d aoS() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = this.bnL;
        if (dVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return dVar;
    }

    private final void b(EditText editText, boolean z) {
        if (z) {
            editText.setImeOptions(268435462);
            editText.setOnEditorActionListener(new b(this));
            return;
        }
        editText.setImeOptions(268435461);
    }

    private final void aqd() {
        Context r = com.iqoption.core.ext.a.r(this);
        View view = getView();
        if (view == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        v.a(r, view);
    }

    public void a(ImageView imageView, String str) {
        kotlin.jvm.internal.i.f(imageView, "infoButton");
        kotlin.jvm.internal.i.f(str, "info");
        com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
        JsonObject jsonObject = new JsonObject();
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = this.bnL;
        jsonObject.addProperty("payment_method-id", (Number) dVar != null ? Long.valueOf(dVar.getId()) : null);
        EC.a("deposit-by-constructor-info", jsonObject);
        b(imageView, str);
    }

    private final void a(ImageView imageView, boolean z) {
        int i;
        if (z) {
            this.cyA = imageView;
            i = com.iqoption.deposit.o.d.ic_info_selected;
        } else {
            i = com.iqoption.deposit.o.d.ic_info_normal;
        }
        imageView.setImageDrawable(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), i));
    }

    private final void b(ImageView imageView, String str) {
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            a(imageView, true);
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            this.cyy.a(com.iqoption.core.ext.a.r(this), viewGroup, str, iArr[0], iArr[1]);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        return !this.cyy.zC() ? super.a(fragmentManager) : true;
    }

    public void onStop() {
        super.onStop();
        this.cyy.zC();
    }
}
