package com.iqoption.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.util.concurrent.p;
import com.iqoption.activity.OfflineActivity;
import com.iqoption.chat.fragment.e;
import com.iqoption.chat.viewmodel.c;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.Network;
import com.iqoption.x.R;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, bng = {"Lcom/iqoption/chat/ChatActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "chatViewModel", "Lcom/iqoption/chat/viewmodel/ChatViewModel;", "getChatViewModel", "()Lcom/iqoption/chat/viewmodel/ChatViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "checkOffline", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "openWebSocket", "Companion", "InitSocketCallback", "app_optionXRelease"})
/* compiled from: ChatActivity.kt */
public final class ChatActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG = ChatActivity.class.getName();
    public static final a aNV = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(ChatActivity.class), "chatViewModel", "getChatViewModel()Lcom/iqoption/chat/viewmodel/ChatViewModel;"))};
    private final d aNU = g.c(new ChatActivity$chatViewModel$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/chat/ChatActivity$Companion;", "", "()V", "EXTRA_ROOM_ID", "", "EXTRA_ROOM_TYPE", "TAG", "kotlin.jvm.PlatformType", "openChat", "", "context", "Landroid/content/Context;", "roomId", "roomType", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "openChats", "app_optionXRelease"})
    /* compiled from: ChatActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void aW(Context context) {
            kotlin.jvm.internal.i.f(context, "context");
            context.startActivity(new Intent(context, ChatActivity.class).addFlags(536870912));
        }

        public final void a(Context context, String str, ChatRoomType chatRoomType) {
            kotlin.jvm.internal.i.f(context, "context");
            kotlin.jvm.internal.i.f(chatRoomType, "roomType");
            context.startActivity(new Intent(context, ChatActivity.class).addFlags(536870912).putExtra("extra.roomId", str).putExtra("extra.roomType", chatRoomType.toString()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/chat/ChatActivity$InitSocketCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/chat/ChatActivity;", "", "referent", "(Lcom/iqoption/chat/ChatActivity;)V", "onFailure", "", "t", "", "app_optionXRelease"})
    /* compiled from: ChatActivity.kt */
    private static final class b extends com.iqoption.system.c.b<ChatActivity, Object> {
        public b(ChatActivity chatActivity) {
            kotlin.jvm.internal.i.f(chatActivity, "referent");
            super(chatActivity, Object.class);
        }

        /* renamed from: a */
        public void c(ChatActivity chatActivity, Throwable th) {
            kotlin.jvm.internal.i.f(chatActivity, "referent");
            chatActivity.finish();
        }
    }

    private final c QN() {
        d dVar = this.aNU;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    public static final void aW(Context context) {
        aNV.aW(context);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_chat);
        QN().fd(getIntent().getStringExtra("extra.roomId"));
        c QN = QN();
        String stringExtra = getIntent().getStringExtra("extra.roomType");
        QN.a(stringExtra != null ? ChatRoomType.valueOf(stringExtra) : null);
        QN().Tk();
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.i.e(supportFragmentManager, "supportFragmentManager");
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
            beginTransaction.add(R.id.container, new e(), e.class.getSimpleName());
            beginTransaction.commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
    }

    public void onStart() {
        super.onStart();
        if (!Ac()) {
            zX();
        }
    }

    public void onStop() {
        super.onStop();
        WebSocketHandler.aTn().n(TAG, 30000);
    }

    private final boolean Ac() {
        if (Network.ebO.aWS()) {
            return false;
        }
        OfflineActivity.h(this);
        finish();
        return true;
    }

    private final void zX() {
        com.iqoption.m.a aTn = WebSocketHandler.aTn();
        kotlin.jvm.internal.i.e(aTn, "socket");
        if (!aTn.DR()) {
            finish();
        }
        p.a(aTn.cj(TAG), new b(this), com.iqoption.core.c.a.biN);
    }
}
