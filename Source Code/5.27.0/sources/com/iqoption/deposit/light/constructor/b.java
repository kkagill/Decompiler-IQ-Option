package com.iqoption.deposit.light.constructor;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.PlaceholderedField;
import com.iqoption.deposit.a.c;
import com.iqoption.deposit.a.g;
import com.iqoption.deposit.o.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/deposit/light/constructor/EditLightFieldHolder;", "Lcom/iqoption/deposit/constructor/BaseEditFieldHolder;", "binding", "Lcom/iqoption/deposit/databinding/ConstructorTextEditFieldLightBinding;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "name", "", "isRequired", "", "listener", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "(Lcom/iqoption/deposit/databinding/ConstructorTextEditFieldLightBinding;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;Ljava/lang/String;ZLcom/iqoption/deposit/constructor/InfoClickListener;)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ConstructorTextEditFieldLightBinding;", "paymentField", "Lcom/iqoption/core/ui/widget/PlaceholderedField;", "editText", "Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "infoButton", "Landroid/widget/ImageView;", "setEditOnFocusChangeListener", "", "Landroid/view/View$OnFocusChangeListener;", "setPlaceholder", "placeholder", "setTitle", "title", "showError", "message", "view", "Landroid/view/View;", "deposit_release"})
/* compiled from: FieldHoldersLight.kt */
public final class b extends c {
    private final PlaceholderedField cEG;
    private final com.iqoption.deposit.b.c cEH;

    public b(com.iqoption.deposit.b.c cVar, ExtraParamProperty extraParamProperty, String str, boolean z, g gVar) {
        kotlin.jvm.internal.i.f(cVar, "binding");
        kotlin.jvm.internal.i.f(extraParamProperty, "property");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        super(extraParamProperty, str, z, gVar);
        this.cEH = cVar;
        this.cEH.cAI.getInput().setHintTextAppearance(h.TextInputLayoutAppearanceGrey);
        PlaceholderedField placeholderedField = this.cEH.cAI;
        kotlin.jvm.internal.i.e(placeholderedField, "binding.constructorPaymentField");
        this.cEG = placeholderedField;
    }

    public View aqm() {
        View root = this.cEH.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    public ExtraParamProperty aqg() {
        return aqh();
    }

    /* renamed from: arP */
    public IQTextInputEditText aqn() {
        return this.cEH.cAI.getEdit();
    }

    public ImageView aqo() {
        ImageView imageView = this.cEH.cAG;
        kotlin.jvm.internal.i.e(imageView, "binding.constructorPaymentInfo");
        return imageView;
    }

    public void setTitle(String str) {
        this.cEG.setHint(str);
    }

    public void hH(String str) {
        com.iqoption.deposit.light.b.b(this.cEG.getEdit(), str);
        aqp();
    }

    public final void setPlaceholder(String str) {
        this.cEG.setPlaceholder(str);
    }

    public final void setEditOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.cEG.setEditOnFocusChangeListener(onFocusChangeListener);
    }
}
