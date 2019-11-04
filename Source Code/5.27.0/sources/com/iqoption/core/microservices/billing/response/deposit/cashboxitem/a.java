package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import android.os.Parcelable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "Landroid/os/Parcelable;", "disabledReason", "", "getDisabledReason", "()Ljava/lang/String;", "isDisabled", "", "()Z", "category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "getImageUrl", "getName", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "core_release"})
/* compiled from: CashboxItem.kt */
public interface a extends Parcelable {

    @i(bne = {1, 1, 15})
    /* compiled from: CashboxItem.kt */
    public static final class a {
        public static boolean g(a aVar) {
            return false;
        }

        public static String h(a aVar) {
            return null;
        }
    }

    String ZK();

    CashboxItemType ZL();

    boolean ZY();

    String ZZ();

    String getName();
}
