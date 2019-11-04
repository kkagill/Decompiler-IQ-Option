package com.iqoption.kyc.profile;

import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, bng = {"findNext", "T", "", "from", "", "predicate", "Lkotlin/Function1;", "", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kyc_release"})
/* compiled from: KycProfileSelectionViewModel.kt */
public final class f {
    private static final <T> T a(List<? extends T> list, int i, b<? super T, Boolean> bVar) {
        int size = list.size();
        for (i++; i < size; i++) {
            Object obj = list.get(i);
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        return null;
    }
}
