package com.iqoption.chat.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.iqoption.chat.e.j;
import com.iqoption.chat.f;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.e;
import com.iqoption.core.microservices.chat.response.l;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 02\u00020\u0001:\u000201B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0001J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0001J%\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001J<\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001eH\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0001J\u0013\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0001J0\u0010#\u001a\u00020\u001a2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e0\u001d\"\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0018H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0016J\u0012\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010-H&J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u00062"}, bng = {"Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "Lcom/iqoption/chat/Resourcer;", "params", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "(Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "getDelegateContext", "()Lcom/iqoption/chat/fragment/DelegateContext;", "getParams", "()Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "getColor", "", "id", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getPlural", "", "quantity", "formatQuantity", "", "getPluralFormat", "", "kotlin.jvm.PlatformType", "formatArgs", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getPxFloat", "", "getPxInt", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "isMessageInteractionsAvailable", "onReplyMessage", "", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "withText", "onStateChanged", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "save", "Landroid/os/Bundle;", "Companion", "Params", "chat_release"})
/* compiled from: RoomBottomBarDelegates.kt */
public abstract class s implements f {
    public static final a aUB = new a();
    private final b aUA;
    private final /* synthetic */ g aUC;
    private final g aUp = this.aUA.SC();

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, bng = {"Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Companion;", "", "()V", "create", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "context", "Lcom/iqoption/chat/fragment/DelegateContext;", "type", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "savedState", "Landroid/os/Bundle;", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final s a(g gVar, ChatRoomType chatRoomType, l lVar, Bundle bundle) {
            kotlin.jvm.internal.i.f(gVar, "context");
            kotlin.jvm.internal.i.f(chatRoomType, "type");
            b bVar = new b(gVar, chatRoomType, lVar, bundle);
            if (lVar == null) {
                return new h(bVar);
            }
            int i = t.aob[chatRoomType.ordinal()];
            r6 = i != 1 ? i != 2 ? (i == 3 || i == 4 || i == 5) ? new ab(bVar) : new h(bVar) : lVar.acC() ? new b(bVar, gVar.getString(j.you_have_been_banned, new Object[0])) : new ab(bVar) : lVar.acC() ? new b(bVar, gVar.getString(j.you_have_been_banned, new Object[0])) : lVar.acD() < lVar.acE() ? new b(bVar, u.a(gVar, lVar)) : new ab(bVar);
            return r6;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "type", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "savedState", "Landroid/os/Bundle;", "(Lcom/iqoption/chat/fragment/DelegateContext;Lcom/iqoption/core/microservices/chat/response/ChatRoomType;Lcom/iqoption/core/microservices/chat/response/ChatState;Landroid/os/Bundle;)V", "getDelegateContext", "()Lcom/iqoption/chat/fragment/DelegateContext;", "getSavedState", "()Landroid/os/Bundle;", "getState", "()Lcom/iqoption/core/microservices/chat/response/ChatState;", "getType", "()Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class b {
        private final ChatRoomType aUD;
        private final l aUE;
        private final Bundle aUF;
        private final g aUp;

        public b(g gVar, ChatRoomType chatRoomType, l lVar, Bundle bundle) {
            kotlin.jvm.internal.i.f(gVar, "delegateContext");
            kotlin.jvm.internal.i.f(chatRoomType, "type");
            this.aUp = gVar;
            this.aUD = chatRoomType;
            this.aUE = lVar;
            this.aUF = bundle;
        }

        public final g SC() {
            return this.aUp;
        }

        public final ChatRoomType SG() {
            return this.aUD;
        }

        public final l SH() {
            return this.aUE;
        }

        public final Bundle SI() {
            return this.aUF;
        }
    }

    public Bundle SD() {
        return null;
    }

    public boolean SE() {
        return false;
    }

    public abstract s a(l lVar);

    public String a(@PluralsRes int i, int i2, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aUC.a(i, i2, objArr);
    }

    public int er(@DimenRes int i) {
        return this.aUC.er(i);
    }

    public float es(@DimenRes int i) {
        return this.aUC.es(i);
    }

    public int getColor(@ColorRes int i) {
        return this.aUC.getColor(i);
    }

    public Context getContext() {
        return this.aUC.getContext();
    }

    public Drawable getDrawable(@DrawableRes int i) {
        return this.aUC.getDrawable(i);
    }

    public String getString(@StringRes int i, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aUC.getString(i, objArr);
    }

    protected s(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "params");
        this.aUC = bVar.SC();
        this.aUA = bVar;
    }

    public final b SF() {
        return this.aUA;
    }

    /* Access modifiers changed, original: protected|final */
    public final g SC() {
        return this.aUp;
    }

    public void a(e eVar, boolean z) {
        kotlin.jvm.internal.i.f(eVar, "message");
        throw new UnsupportedOperationException();
    }
}
