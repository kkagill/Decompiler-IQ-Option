package com.iqoption.chat.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.microservices.chat.response.e;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u0016\u0010\u001a\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "()V", "isSupportAvatarLoading", "", "()Z", "supportAvatar", "Landroidx/lifecycle/LiveData;", "", "getSupportAvatar", "()Landroidx/lifecycle/LiveData;", "supportAvatarData", "Landroidx/lifecycle/MutableLiveData;", "supportAvatarLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "supportRoomId", "getSupportRoomId", "()Ljava/lang/String;", "setSupportRoomId", "(Ljava/lang/String;)V", "userId", "", "loadSupportAvatar", "", "onCleared", "onMessageEvent", "messages", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Companion", "chat_release"})
/* compiled from: SupportRoomViewModel.kt */
public final class q extends com.iqoption.core.ui.f.d implements com.iqoption.chat.c.a.a {
    private static final String TAG = q.class.getSimpleName();
    private static final kotlin.d aWy = g.c(SupportRoomViewModel$Companion$instance$2.aYY);
    public static final a aYX = new a();
    public String aYU;
    private final MutableLiveData<String> aYV = new MutableLiveData();
    private final AtomicBoolean aYW = new AtomicBoolean();
    private final long userId = com.iqoption.core.d.EA().getUserId();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, bng = {"Lcom/iqoption/chat/viewmodel/SupportRoomViewModel$Companion;", "", "()V", "NO_AVATAR", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;", "getInstance", "()Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;", "instance$delegate", "Lkotlin/Lazy;", "get", "chat_release"})
    /* compiled from: SupportRoomViewModel.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "instance", "getInstance()Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;"))};

        private final q Uc() {
            kotlin.d Te = q.aWy;
            a aVar = q.aYX;
            j jVar = anY[0];
            return (q) Te.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final q Ud() {
            return Uc();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "apply"})
    /* compiled from: SupportRoomViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ q aYZ;

        b(q qVar) {
            this.aYZ = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A:{SYNTHETIC, RETURN} */
        /* renamed from: aj */
        public final java.lang.String apply(java.util.List<com.iqoption.core.microservices.chat.response.e> r11) {
            /*
            r10 = this;
            r0 = "it";
            kotlin.jvm.internal.i.f(r11, r0);
            r11 = (java.lang.Iterable) r11;
            r11 = r11.iterator();
        L_0x000b:
            r0 = r11.hasNext();
            r1 = 0;
            r2 = 0;
            r3 = 1;
            if (r0 == 0) goto L_0x0035;
        L_0x0014:
            r0 = r11.next();
            r4 = r0;
            r4 = (com.iqoption.core.microservices.chat.response.e) r4;
            r5 = r4.acc();
            r7 = r10.aYZ;
            r7 = r7.userId;
            r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r9 == 0) goto L_0x0031;
        L_0x0029:
            r4 = r4.ach();
            if (r4 != 0) goto L_0x0031;
        L_0x002f:
            r4 = 1;
            goto L_0x0032;
        L_0x0031:
            r4 = 0;
        L_0x0032:
            if (r4 == 0) goto L_0x000b;
        L_0x0034:
            goto L_0x0036;
        L_0x0035:
            r0 = r2;
        L_0x0036:
            r11 = r0;
            r11 = (com.iqoption.core.microservices.chat.response.e) r11;
            if (r11 == 0) goto L_0x0061;
        L_0x003b:
            r0 = r11.acf();
            r0 = (java.lang.CharSequence) r0;
            if (r0 == 0) goto L_0x004c;
        L_0x0043:
            r0 = kotlin.text.u.Y(r0);
            if (r0 == 0) goto L_0x004a;
        L_0x0049:
            goto L_0x004c;
        L_0x004a:
            r0 = 0;
            goto L_0x004d;
        L_0x004c:
            r0 = 1;
        L_0x004d:
            r0 = r0 ^ r3;
            if (r0 == 0) goto L_0x0051;
        L_0x0050:
            goto L_0x0052;
        L_0x0051:
            r11 = r2;
        L_0x0052:
            if (r11 == 0) goto L_0x0061;
        L_0x0054:
            r0 = com.iqoption.core.d.EE();
            r11 = r11.acf();
            r11 = r0.fA(r11);
            goto L_0x0062;
        L_0x0061:
            r11 = r2;
        L_0x0062:
            r0 = r11;
            r0 = (java.lang.CharSequence) r0;
            if (r0 == 0) goto L_0x006d;
        L_0x0067:
            r0 = r0.length();
            if (r0 != 0) goto L_0x006e;
        L_0x006d:
            r1 = 1;
        L_0x006e:
            r0 = r1 ^ 1;
            if (r0 == 0) goto L_0x0073;
        L_0x0072:
            goto L_0x0074;
        L_0x0073:
            r11 = r2;
        L_0x0074:
            if (r11 == 0) goto L_0x0077;
        L_0x0076:
            goto L_0x0079;
        L_0x0077:
            r11 = "no_avatar";
        L_0x0079:
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.viewmodel.q$b.apply(java.util.List):java.lang.String");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SupportRoomViewModel.kt */
    static final class c<T> implements f<String> {
        final /* synthetic */ q aYZ;

        c(q qVar) {
            this.aYZ = qVar;
        }

        /* renamed from: fa */
        public final void accept(String str) {
            this.aYZ.aYW.set(false);
            this.aYZ.aYV.postValue(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SupportRoomViewModel.kt */
    static final class d<T> implements f<Throwable> {
        final /* synthetic */ q aYZ;

        d(q qVar) {
            this.aYZ = qVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aYZ.aYW.set(false);
            this.aYZ.aYV.postValue("no_avatar");
        }
    }

    public q() {
        com.iqoption.chat.c.a.aVS.a(this);
    }

    public final void fm(String str) {
        kotlin.jvm.internal.i.f(str, "<set-?>");
        this.aYU = str;
    }

    public final LiveData<String> TZ() {
        return this.aYV;
    }

    public final boolean Ua() {
        return this.aYW.get();
    }

    public void aa(List<e> list) {
        kotlin.jvm.internal.i.f(list, "messages");
        for (Object next : list) {
            String SJ = ((e) next).SJ();
            String str = this.aYU;
            if (str == null) {
                kotlin.jvm.internal.i.lG("supportRoomId");
            }
            if (kotlin.jvm.internal.i.y(SJ, str)) {
                break;
            }
        }
        Object next2 = null;
        e eVar = (e) next2;
        if (eVar != null && (kotlin.jvm.internal.i.y(eVar.acf(), (String) this.aYV.getValue()) ^ 1) != 0) {
            Ub();
        }
    }

    public final void Ub() {
        if (!this.aYW.get()) {
            this.aYW.set(true);
            com.iqoption.chat.c.a aVar = com.iqoption.chat.c.a.aVS;
            String str = this.aYU;
            if (str == null) {
                kotlin.jvm.internal.i.lG("supportRoomId");
            }
            com.iqoption.chat.c.a.a(aVar, str, 0, 10, 2, null).t(new b(this)).h(com.iqoption.core.rx.i.aki()).a((f) new c(this), (f) new d(this));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        com.iqoption.chat.c.a.aVS.b(this);
    }
}
