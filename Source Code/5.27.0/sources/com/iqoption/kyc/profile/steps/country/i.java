package com.iqoption.kyc.profile.steps.country;

import android.view.View;
import android.widget.TextView;
import com.iqoption.core.ui.widget.recyclerview.a.a;
import com.iqoption.kyc.b.be;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycTitleHolder;", "Lcom/iqoption/kyc/profile/steps/country/BaseKycCountryHolder;", "Lcom/iqoption/kyc/profile/steps/country/KycTitleItem;", "binding", "Lcom/iqoption/kyc/databinding/ItemCountryTitleBinding;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/kyc/databinding/ItemCountryTitleBinding;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "kyc_release"})
/* compiled from: CountryHolders.kt */
public final class i extends a<j> {
    private final be dCf;

    public i(be beVar, a aVar) {
        kotlin.jvm.internal.i.f(beVar, "binding");
        View root = beVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar, null);
        this.dCf = beVar;
    }

    /* renamed from: a */
    public void bB(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        TextView textView = this.dCf.dwj;
        kotlin.jvm.internal.i.e(textView, "binding.kycCountryTitle");
        textView.setText(jVar.getTitle());
    }
}
