package com.iqoption.deposit;

import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c;
import com.iqoption.core.ui.fragment.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH&J\b\u0010\u0010\u001a\u00020\nH&¨\u0006\u0011"}, bng = {"Lcom/iqoption/deposit/PayFieldsContainerFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "collectParams", "", "", "", "payMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "requestFullScreenFields", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "setFieldsEnabled", "", "enabled", "validate", "deposit_release"})
/* compiled from: PayFieldsContainerFragment.kt */
public abstract class n extends d {
    private HashMap apm;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract boolean a(i iVar);

    public abstract Map<String, Object> aoR();

    public abstract c aoS();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public abstract boolean validate();
}
