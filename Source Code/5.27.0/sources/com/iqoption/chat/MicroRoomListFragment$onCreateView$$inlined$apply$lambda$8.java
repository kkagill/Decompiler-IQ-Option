package com.iqoption.chat;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.iqoption.core.analytics.d;
import com.iqoption.core.ext.a;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "<anonymous parameter 1>", "", "invoke", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$6"})
/* compiled from: MicroRoomListFragment.kt */
final class MicroRoomListFragment$onCreateView$$inlined$apply$lambda$8 extends Lambda implements m<k, Integer, l> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ c this$0;

    MicroRoomListFragment$onCreateView$$inlined$apply$lambda$8(c cVar, FragmentActivity fragmentActivity) {
        this.this$0 = cVar;
        this.$activity$inlined = fragmentActivity;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        a((k) obj, ((Number) obj2).intValue());
        return l.eVB;
    }

    public final void a(k kVar, int i) {
        kotlin.jvm.internal.i.f(kVar, "it");
        d EC = com.iqoption.core.d.EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("room_id", kVar.getId());
        jsonObject.addProperty("room_locale", kVar.getLocale());
        jsonObject.addProperty("room_is_regulated", Boolean.valueOf(kVar.Er()));
        jsonObject.addProperty("room_is_public", Boolean.valueOf(kVar.isPublic()));
        jsonObject.addProperty("room_type", kVar.SG().name());
        EC.a("chat_open-room", jsonObject);
        ChatActivity.aNV.a(a.q(this.this$0), kVar.getId(), kVar.SG());
    }
}
