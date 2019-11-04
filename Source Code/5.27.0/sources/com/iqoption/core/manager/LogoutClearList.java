package com.iqoption.core.manager;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/manager/LogoutClearList;", "", "()V", "items", "", "Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "add", "", "item", "clear", "remove", "Clearable", "core_release"})
/* compiled from: LogoutClearList.kt */
public final class LogoutClearList {
    public static final LogoutClearList bjO = new LogoutClearList();
    private static final List<Clearable> iA = new ArrayList();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/manager/LogoutClearList$Clearable;", "", "clearOnLogout", "", "core_release"})
    @Keep
    /* compiled from: LogoutClearList.kt */
    public interface Clearable {
        void clearOnLogout();
    }

    private LogoutClearList() {
    }

    public static final void a(Clearable clearable) {
        kotlin.jvm.internal.i.f(clearable, "item");
        iA.add(clearable);
    }

    public static final void clear() {
        for (Clearable clearOnLogout : iA) {
            clearOnLogout.clearOnLogout();
        }
    }
}
