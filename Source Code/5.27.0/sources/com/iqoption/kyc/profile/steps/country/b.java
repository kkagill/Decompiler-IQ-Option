package com.iqoption.kyc.profile.steps.country;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.adapter.a;
import com.iqoption.kyc.b.bc;
import com.iqoption.kyc.b.be;
import com.iqoption.kyc.o.e;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/kyc/profile/steps/country/BaseKycCountryHolder;", "Lcom/iqoption/kyc/profile/steps/country/KycCountryAdapterItem;", "callbacks", "Lcom/iqoption/kyc/profile/steps/country/OnCountryCallbacks;", "(Lcom/iqoption/kyc/profile/steps/country/OnCountryCallbacks;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "kyc_release"})
/* compiled from: KycCountryAdapter.kt */
public final class b extends a<a<?>, c> {
    private final k dBS;

    public b(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "callbacks");
        this.dBS = kVar;
    }

    /* renamed from: N */
    public a<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 0) {
            return new i((be) com.iqoption.core.ext.a.a(viewGroup, e.item_country_title, null, false, 6, null), this);
        } else if (i == 1) {
            return new f((bc) com.iqoption.core.ext.a.a(viewGroup, e.item_country, null, false, 6, null), this.dBS, this);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected case ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(a<?> aVar, int i) {
        kotlin.jvm.internal.i.f(aVar, "holder");
        c cVar = (c) fp(i);
        int itemViewType = aVar.getItemViewType();
        if (itemViewType == 0) {
            i iVar = (i) aVar;
            if (cVar != null) {
                iVar.bV((j) cVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.kyc.profile.steps.country.KycTitleItem");
        } else if (itemViewType == 1) {
            f fVar = (f) aVar;
            if (cVar != null) {
                fVar.bV((g) cVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.kyc.profile.steps.country.KycCountryItem");
        }
    }

    public int getItemViewType(int i) {
        return ((c) fp(i)).asd();
    }
}
