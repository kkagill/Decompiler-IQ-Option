package com.iqoption.chat.fragment;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.bi;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.k.c;
import com.iqoption.core.microservices.chat.response.k;
import com.iqoption.core.util.LocalizationUtil;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/chat/fragment/PublicRoomTopBarDelegate;", "Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "(Lcom/iqoption/chat/fragment/DelegateContext;)V", "binding", "Lcom/iqoption/chat/databinding/ChatRoomPublicToolbarBinding;", "onRoomLoaded", "", "room", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "chat_release"})
/* compiled from: RoomTopBarDelegates.kt */
public final class q extends x {
    private final bi aUo = ((bi) z.e(this.aUp, h.chat_room_public_toolbar));
    private final g aUp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/RoomViewModel$TypingInfo;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/PublicRoomTopBarDelegate$onRoomLoaded$1$3"})
    /* compiled from: RoomTopBarDelegates.kt */
    static final class a<T> implements Observer<c> {
        final /* synthetic */ PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2 aUq;
        final /* synthetic */ PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1 aUr;

        a(PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2 publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2, PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1 publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1) {
            this.aUq = publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2;
            this.aUr = publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                int count = cVar.getCount();
                if (count != 0) {
                    this.aUq.y(cVar.getName(), count);
                } else {
                    this.aUr.MY();
                }
            }
        }
    }

    public q(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "delegateContext");
        super(gVar);
        this.aUp = gVar;
    }

    public void d(k kVar) {
        if (kVar != null) {
            bi biVar = this.aUo;
            TextView textView = biVar.alH;
            kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
            textView.setText(LocalizationUtil.hq(kVar.getName()));
            PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1 publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1 = new PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1(biVar, this, kVar);
            PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2 publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2 = new PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2(biVar, this, kVar);
            publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1.MY();
            this.aUp.Sf().TI().observe(this.aUp, new a(publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$2, publicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1));
        }
    }
}
