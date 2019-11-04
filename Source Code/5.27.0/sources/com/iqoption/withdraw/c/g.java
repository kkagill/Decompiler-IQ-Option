package com.iqoption.withdraw.c;

import com.iqoption.core.microservices.withdraw.response.h;
import java.util.Comparator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, bng = {"FIELDS_AMOUNT_COMPARATOR", "Ljava/util/Comparator;", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "withdraw_release"})
/* compiled from: WithdrawMethodsViewModel.kt */
public final class g {
    private static final Comparator<h> ett = a.etu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "first", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "kotlin.jvm.PlatformType", "second", "compare"})
    /* compiled from: WithdrawMethodsViewModel.kt */
    static final class a<T> implements Comparator<h> {
        public static final a etu = new a();

        a() {
        }

        /* renamed from: a */
        public final int compare(h hVar, h hVar2) {
            String str = "amount";
            if (kotlin.jvm.internal.i.y(str, hVar.getName())) {
                return 1;
            }
            return kotlin.jvm.internal.i.y(str, hVar2.getName()) ? -1 : 0;
        }
    }
}
