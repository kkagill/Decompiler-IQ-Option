package com.iqoption.chat.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.iqoption.chat.f;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001J\u0015\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001J%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001J<\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001J0\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H&R\u0012\u0010\u0005\u001a\u00020\u0006X\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006$"}, bng = {"Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "Lcom/iqoption/chat/Resourcer;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "(Lcom/iqoption/chat/fragment/DelegateContext;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getColor", "", "id", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getPlural", "", "quantity", "formatQuantity", "", "getPluralFormat", "", "kotlin.jvm.PlatformType", "formatArgs", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getPxFloat", "", "getPxInt", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "onRoomLoaded", "", "room", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "Companion", "chat_release"})
/* compiled from: RoomTopBarDelegates.kt */
public abstract class x implements f {
    public static final a aVf = new a();
    private final /* synthetic */ g aUC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/chat/fragment/RoomTopBarDelegate$Companion;", "", "()V", "create", "Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "type", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "chat_release"})
    /* compiled from: RoomTopBarDelegates.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final x a(ChatRoomType chatRoomType, g gVar) {
            kotlin.jvm.internal.i.f(chatRoomType, "type");
            kotlin.jvm.internal.i.f(gVar, "delegateContext");
            int i = y.aob[chatRoomType.ordinal()];
            boolean z = true;
            if (i == 1) {
                return new q(gVar);
            }
            if (i != 2 && i != 3) {
                return new p(gVar);
            }
            if (chatRoomType != ChatRoomType.SUPPORT) {
                z = false;
            }
            return new ad(gVar, z);
        }
    }

    public String a(@PluralsRes int i, int i2, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aUC.a(i, i2, objArr);
    }

    public abstract void d(k kVar);

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

    public x(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "delegateContext");
        this.aUC = gVar;
    }
}
