package com.iqoption.fragment.leftmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.e;
import com.iqoption.core.microservices.chat.response.k;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.t;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/fragment/leftmenu/SupportUnreadIndicatorViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/chat/repository/RoomRepository$LastSeenMessageListener;", "Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "()V", "supportLastSeenMessage", "", "supportRoomId", "supportUnreadCount", "Landroidx/lifecycle/LiveData;", "", "getSupportUnreadCount", "()Landroidx/lifecycle/LiveData;", "supportUnreadCountLoadingIndicator", "Ljava/util/concurrent/atomic/AtomicBoolean;", "supportUnreadCountMutableData", "Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "onLastSeenMessageChanged", "roomId", "messageId", "onMessageEvent", "messages", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "reloadSupportUnreadCount", "Companion", "app_optionXRelease"})
/* compiled from: SupportUnreadIndicatorViewModel.kt */
public final class h extends com.iqoption.core.ui.f.d implements com.iqoption.chat.c.a.a, com.iqoption.chat.c.b.b {
    private static final String TAG = h.class.getSimpleName();
    public static final a djl = new a();
    private String aYU;
    private final AtomicBoolean dji = new AtomicBoolean();
    private String djj;
    private final MutableLiveData<Integer> djk = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/leftmenu/SupportUnreadIndicatorViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/fragment/leftmenu/SupportUnreadIndicatorViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: SupportUnreadIndicatorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "apply"})
    /* compiled from: SupportUnreadIndicatorViewModel.kt */
    static final class b<T, R> implements g<T, t<? extends R>> {
        final /* synthetic */ h djm;

        b(h hVar) {
            this.djm = hVar;
        }

        /* renamed from: aW */
        public final p<Integer> apply(List<k> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                Object obj;
                if (((k) next).SG() == ChatRoomType.SUPPORT) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            final k kVar = (k) next2;
            if (kVar == null) {
                return p.cI(Integer.valueOf(0));
            }
            this.djm.aYU = kVar.getId();
            this.djm.djj = kVar.acx();
            return com.iqoption.chat.c.a.a(com.iqoption.chat.c.a.aVS, kVar.getId(), 0, 10, 2, null).t(new g<T, R>() {
                public /* synthetic */ Object apply(Object obj) {
                    return Integer.valueOf(ax((List) obj));
                }

                public final int ax(List<e> list) {
                    kotlin.jvm.internal.i.f(list, "messages");
                    int i = 0;
                    if (!list.isEmpty()) {
                        long userId = com.iqoption.app.b.DG().getUserId();
                        while (i != list.size()) {
                            e eVar = (e) list.get(i);
                            if (kotlin.jvm.internal.i.y(eVar.getId(), kVar.acx()) || eVar.acc() == userId) {
                                break;
                            }
                            i++;
                        }
                    }
                    return i;
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"})
    /* compiled from: SupportUnreadIndicatorViewModel.kt */
    static final class c<T> implements f<Integer> {
        final /* synthetic */ h djm;

        c(h hVar) {
            this.djm = hVar;
        }

        /* renamed from: m */
        public final void accept(Integer num) {
            this.djm.djk.postValue(num);
            this.djm.dji.set(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SupportUnreadIndicatorViewModel.kt */
    static final class d<T> implements f<Throwable> {
        final /* synthetic */ h djm;

        d(h hVar) {
            this.djm = hVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.djm.djk.postValue(Integer.valueOf(0));
            this.djm.dji.set(false);
        }
    }

    public h() {
        com.iqoption.chat.c.b.aVX.a((com.iqoption.chat.c.b.b) this);
        com.iqoption.chat.c.a.aVS.a(this);
        aEy();
    }

    public final LiveData<Integer> aEx() {
        return this.djk;
    }

    public void aa(List<e> list) {
        kotlin.jvm.internal.i.f(list, "messages");
        Iterable<e> iterable = list;
        Object obj = null;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (e SJ : iterable) {
                if (kotlin.jvm.internal.i.y(SJ.SJ(), this.aYU)) {
                    obj = 1;
                    break;
                }
            }
        }
        if (obj != null) {
            aEy();
        }
    }

    private final void aEy() {
        if (!this.dji.get()) {
            this.dji.set(true);
            com.iqoption.chat.c.b.aVX.SU().q(new b(this)).h(com.iqoption.core.rx.i.aki()).a((f) new c(this), (f) new d(this));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        com.iqoption.chat.c.b.aVX.b((com.iqoption.chat.c.b.b) this);
        com.iqoption.chat.c.a.aVS.b(this);
    }
}
