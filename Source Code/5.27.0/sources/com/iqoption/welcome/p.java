package com.iqoption.welcome;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.d;
import java.util.Stack;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/welcome/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "activeScreen", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/welcome/WelcomeViewModel$Transition;", "getActiveScreen", "()Landroidx/lifecycle/LiveData;", "activeScreenData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "screens", "Ljava/util/Stack;", "Lcom/iqoption/welcome/WelcomeScreen;", "back", "", "backTo", "screen", "next", "", "Companion", "Transition", "welcome_release"})
/* compiled from: WelcomeViewModel.kt */
public final class p extends ViewModel {
    public static final a ekx = new a();
    private final Stack<n> eku = new Stack();
    private final com.iqoption.core.data.b.b<b> ekv = new com.iqoption.core.data.b.b();
    private final LiveData<b> ekw = this.ekv;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcome/WelcomeViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcome/WelcomeViewModel;", "f", "Landroidx/fragment/app/Fragment;", "welcome_release"})
    /* compiled from: WelcomeViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final p bo(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(p.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…omeViewModel::class.java]");
            return (p) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/welcome/WelcomeViewModel$Transition;", "", "screen", "Lcom/iqoption/welcome/WelcomeScreen;", "isForward", "", "(Lcom/iqoption/welcome/WelcomeScreen;Z)V", "()Z", "getScreen", "()Lcom/iqoption/welcome/WelcomeScreen;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "welcome_release"})
    /* compiled from: WelcomeViewModel.kt */
    public static final class b {
        private final n eky;
        private final boolean ekz;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (kotlin.jvm.internal.i.y(this.eky, bVar.eky)) {
                        if ((this.ekz == bVar.ekz ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            n nVar = this.eky;
            int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
            int i = this.ekz;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Transition(screen=");
            stringBuilder.append(this.eky);
            stringBuilder.append(", isForward=");
            stringBuilder.append(this.ekz);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(n nVar, boolean z) {
            kotlin.jvm.internal.i.f(nVar, "screen");
            this.eky = nVar;
            this.ekz = z;
        }

        public final n aZH() {
            return this.eky;
        }

        public final boolean aZI() {
            return this.ekz;
        }
    }

    public static final p bo(Fragment fragment) {
        return ekx.bo(fragment);
    }

    public p() {
        a(new j(WelcomeScreenFeature.Companion.getWelcomeScreenFeature(d.EH().ei("new-welcome-screen"))));
    }

    public final LiveData<b> aZF() {
        return this.ekw;
    }

    public final void a(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "screen");
        b bVar = (b) this.ekw.getValue();
        if ((kotlin.jvm.internal.i.y(bVar != null ? bVar.aZH() : null, nVar) ^ 1) != 0) {
            this.ekv.setValue(new b(nVar, true));
            this.eku.push(nVar);
        }
    }

    public final boolean aZG() {
        if (this.eku.size() == 1) {
            return false;
        }
        this.eku.pop();
        com.iqoption.core.data.b.b bVar = this.ekv;
        Object peek = this.eku.peek();
        kotlin.jvm.internal.i.e(peek, "screens.peek()");
        bVar.setValue(new b((n) peek, false));
        return true;
    }

    public final boolean b(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "screen");
        while (this.eku.size() > 1 && (kotlin.jvm.internal.i.y((n) this.eku.peek(), nVar) ^ 1) != 0) {
            this.eku.pop();
        }
        com.iqoption.core.data.b.b bVar = this.ekv;
        Object peek = this.eku.peek();
        kotlin.jvm.internal.i.e(peek, "screens.peek()");
        bVar.setValue(new b((n) peek, false));
        return kotlin.jvm.internal.i.y((n) this.eku.peek(), nVar);
    }
}
