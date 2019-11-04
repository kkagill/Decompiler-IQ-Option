package com.iqoption.chat.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/chat/viewmodel/TransitionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "event", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/chat/viewmodel/TransitionViewModel$Event;", "getEvent", "()Landroidx/lifecycle/LiveData;", "eventData", "Landroidx/lifecycle/MutableLiveData;", "hideSource", "", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "showSource", "Companion", "Event", "chat_release"})
/* compiled from: TransitionViewModel.kt */
public final class r extends ViewModel {
    private static final String TAG = r.class.getSimpleName();
    public static final a aZc = new a();
    private final MutableLiveData<b> aZa = new MutableLiveData();
    private final LiveData<b> aZb = this.aZa;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/viewmodel/TransitionViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/chat/viewmodel/TransitionViewModel;", "f", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/FragmentActivity;", "chat_release"})
    /* compiled from: TransitionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final r n(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment.requireActivity()).get(r.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f.…ionViewModel::class.java]");
            return (r) viewModel;
        }

        public final r j(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(r.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(a)…ionViewModel::class.java]");
            return (r) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/viewmodel/TransitionViewModel$Event;", "", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "isHidden", "", "(Lcom/iqoption/chat/viewmodel/AttachmentPreview;Z)V", "()Z", "getPreview", "()Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "chat_release"})
    /* compiled from: TransitionViewModel.kt */
    public static final class b {
        private final boolean aIY;
        private final b aYN;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (kotlin.jvm.internal.i.y(this.aYN, bVar.aYN)) {
                        if ((this.aIY == bVar.aIY ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            b bVar = this.aYN;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            int i = this.aIY;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Event(preview=");
            stringBuilder.append(this.aYN);
            stringBuilder.append(", isHidden=");
            stringBuilder.append(this.aIY);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(b bVar, boolean z) {
            kotlin.jvm.internal.i.f(bVar, "preview");
            this.aYN = bVar;
            this.aIY = z;
        }

        public final b TW() {
            return this.aYN;
        }

        public final boolean isHidden() {
            return this.aIY;
        }
    }

    public final LiveData<b> Uf() {
        return this.aZb;
    }

    public final void j(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        this.aZa.setValue(new b(bVar, true));
    }

    public final void k(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        this.aZa.setValue(new b(bVar, false));
    }
}
