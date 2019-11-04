package com.iqoption.chat.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/chat/viewmodel/SearchRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "searchText", "Landroidx/lifecycle/LiveData;", "", "getSearchText", "()Landroidx/lifecycle/LiveData;", "searchTextData", "Landroidx/lifecycle/MutableLiveData;", "onClose", "", "search", "text", "startSearch", "stopSearch", "Companion", "chat_release"})
/* compiled from: SearchRoomViewModel.kt */
public final class m extends ViewModel {
    public static final a aYM = new a();
    private final MutableLiveData<CharSequence> aYK = new MutableLiveData();
    private final LiveData<CharSequence> aYL = this.aYK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/chat/viewmodel/SearchRoomViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/chat/viewmodel/SearchRoomViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "chat_release"})
    /* compiled from: SearchRoomViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final m i(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(m.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…oomViewModel::class.java]");
            return (m) viewModel;
        }
    }

    public final LiveData<CharSequence> TV() {
        return this.aYL;
    }

    public final void A(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "text");
        this.aYK.setValue(charSequence);
    }

    public final void Qr() {
        this.aYK.setValue("");
        d.EC().di("chat_search-chat");
    }

    public final void stopSearch() {
        this.aYK.setValue(null);
    }

    public final void onClose() {
        d.EC().di("chat_return");
    }
}
