package com.iqoption.kyc.profile.steps.country;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.iqoption.core.microservices.configuration.a.c;
import com.iqoption.kyc.b.bc;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0010"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryHolder;", "Lcom/iqoption/kyc/profile/steps/country/BaseKycCountryHolder;", "Lcom/iqoption/kyc/profile/steps/country/KycCountryItem;", "binding", "Lcom/iqoption/kyc/databinding/ItemCountryBinding;", "callbacks", "Lcom/iqoption/kyc/profile/steps/country/OnCountryCallbacks;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/kyc/databinding/ItemCountryBinding;Lcom/iqoption/kyc/profile/steps/country/OnCountryCallbacks;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "checkedListener", "com/iqoption/kyc/profile/steps/country/KycCountryHolder$checkedListener$1", "Lcom/iqoption/kyc/profile/steps/country/KycCountryHolder$checkedListener$1;", "bind", "", "item", "kyc_release"})
/* compiled from: CountryHolders.kt */
public final class f extends a<g> {
    private final k dBS;
    private final a dBZ = new a(this);
    private final bc dCa;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/kyc/profile/steps/country/KycCountryHolder$checkedListener$1", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "kyc_release"})
    /* compiled from: CountryHolders.kt */
    public static final class a implements OnCheckedChangeListener {
        final /* synthetic */ f dCb;

        a(f fVar) {
            this.dCb = fVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            g gVar = (g) this.dCb.and();
            if (z && gVar != null) {
                this.dCb.dBS.g(gVar.LB());
            }
        }
    }

    public f(bc bcVar, k kVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bcVar, "binding");
        kotlin.jvm.internal.i.f(kVar, "callbacks");
        View root = bcVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar, null);
        this.dCa = bcVar;
        this.dBS = kVar;
        this.dCa.dwi.setOnCheckedChangeListener(this.dBZ);
    }

    /* renamed from: a */
    public void bB(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "item");
        this.dCa.dwi.setOnCheckedChangeListener(null);
        c LB = gVar.LB();
        AppCompatRadioButton appCompatRadioButton = this.dCa.dwi;
        String str = "binding.kycCountry";
        kotlin.jvm.internal.i.e(appCompatRadioButton, str);
        appCompatRadioButton.setText(LB.getName());
        AppCompatRadioButton appCompatRadioButton2 = this.dCa.dwi;
        kotlin.jvm.internal.i.e(appCompatRadioButton2, str);
        appCompatRadioButton2.setChecked(gVar.asM());
        this.dCa.dwi.setOnCheckedChangeListener(this.dBZ);
    }
}
