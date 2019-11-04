package com.iqoption.chat.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.connect.bus.IQBusState;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.ui.f.d;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, bng = {"Lcom/iqoption/chat/viewmodel/ChatViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "chatMessageDisposable", "Lio/reactivex/disposables/Disposable;", "chatStateDisposable", "selectedRoomId", "", "getSelectedRoomId", "()Ljava/lang/String;", "setSelectedRoomId", "(Ljava/lang/String;)V", "selectedRoomType", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "getSelectedRoomType", "()Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "setSelectedRoomType", "(Lcom/iqoption/core/microservices/chat/response/ChatRoomType;)V", "onCleared", "", "subscribe", "Companion", "chat_release"})
/* compiled from: ChatViewModel.kt */
public final class c extends d {
    public static final a aWI = new a();
    private String aWE;
    private ChatRoomType aWF;
    private io.reactivex.disposables.b aWG;
    private io.reactivex.disposables.b aWH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/chat/viewmodel/ChatViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/chat/viewmodel/ChatViewModel;", "f", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/FragmentActivity;", "chat_release"})
    /* compiled from: ChatViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c g(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/connect/bus/IQBusState;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChatViewModel.kt */
    static final class b<T> implements f<IQBusState> {
        final /* synthetic */ c aWJ;

        b(c cVar) {
            this.aWJ = cVar;
        }

        /* renamed from: a */
        public final void accept(IQBusState iQBusState) {
            if (iQBusState == IQBusState.CONNECTED) {
                io.reactivex.disposables.b a = this.aWJ.aWG;
                if (a != null) {
                    a.dispose();
                }
                a = this.aWJ.aWH;
                if (a != null) {
                    a.dispose();
                }
                this.aWJ.aWG = com.iqoption.core.microservices.chat.a.bpz.abJ().d(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass1.aWK, (f) AnonymousClass2.aWL);
                this.aWJ.aWH = com.iqoption.core.microservices.chat.a.bpz.abD().d(com.iqoption.core.rx.i.aki()).a((f) AnonymousClass3.aWM, (f) AnonymousClass4.aWN);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChatViewModel.kt */
    static final class c<T> implements f<Throwable> {
        public static final c aWO = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final String Ti() {
        return this.aWE;
    }

    public final void fd(String str) {
        this.aWE = str;
    }

    public final ChatRoomType Tj() {
        return this.aWF;
    }

    public final void a(ChatRoomType chatRoomType) {
        this.aWF = chatRoomType;
    }

    public final void Tk() {
        if (!com.iqoption.core.d.Un().Dq()) {
            io.reactivex.disposables.b a = com.iqoption.core.d.Up().Ux().a((f) new b(this), (f) c.aWO);
            kotlin.jvm.internal.i.e(a, "iqbus.stateStream.subscr…          \n            })");
            b(a);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        io.reactivex.disposables.b bVar = this.aWG;
        if (bVar != null) {
            bVar.dispose();
        }
        bVar = this.aWH;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
