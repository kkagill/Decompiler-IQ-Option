package com.iqoption.view;

import com.iqoption.view.b.a;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/view/BackListenersManager;", "Lcom/iqoption/view/BackController$OnBackListener;", "Lcom/iqoption/view/BackController;", "()V", "listeners", "Ljava/util/LinkedList;", "addBackListener", "", "onBackListener", "onBackPressed", "", "removeBackListener", "app_optionXRelease"})
/* compiled from: BackListenersManager.kt */
public final class c implements b, a {
    private final LinkedList<a> eeh = new LinkedList();

    public void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "onBackListener");
        this.eeh.addFirst(aVar);
    }

    public void b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "onBackListener");
        this.eeh.remove(aVar);
    }

    public boolean onBackPressed() {
        Iterator it = this.eeh.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).onBackPressed()) {
                return true;
            }
        }
        return false;
    }
}
