package com.iqoption.chat.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.iqoption.chat.a.be;
import com.iqoption.chat.e.h;
import com.iqoption.chat.e.j;
import com.iqoption.core.d;
import com.iqoption.core.microservices.chat.response.l;
import com.iqoption.core.util.ai;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/fragment/CantSendDelegate;", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "params", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "message", "", "(Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;Ljava/lang/CharSequence;)V", "binding", "Lcom/iqoption/chat/databinding/ChatRoomCantSendLayoutBinding;", "isBanned", "", "getMessage", "()Ljava/lang/CharSequence;", "tradingVolume", "", "onStateChanged", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "chat_release"})
/* compiled from: RoomBottomBarDelegates.kt */
final class b extends s {
    private final be aSt = ((be) com.iqoption.core.ext.a.a(SC().Se(), h.chat_room_cant_send_layout, null, false, 6, null));
    private final Object aSu;
    private final boolean aSv;
    private final CharSequence aSw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/CantSendDelegate$2$1"})
    /* compiled from: RoomBottomBarDelegates.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ b aSx;

        a(b bVar) {
            this.aSx = bVar;
        }

        public final void onClick(View view) {
            d.EC().di("chat_question-sign");
            this.aSx.SC().x(this.aSx.getMessage());
        }
    }

    public b(com.iqoption.chat.fragment.s.b bVar, CharSequence charSequence) {
        kotlin.jvm.internal.i.f(bVar, "params");
        kotlin.jvm.internal.i.f(charSequence, "message");
        super(bVar);
        this.aSw = charSequence;
        l SH = bVar.SH();
        boolean z = false;
        this.aSu = SH != null ? Double.valueOf(SH.acD()) : Integer.valueOf(0);
        l SH2 = bVar.SH();
        if (SH2 != null) {
            z = SH2.acC();
        }
        this.aSv = z;
        ViewGroup Se = SC().Se();
        Se.removeAllViews();
        Se.addView(this.aSt.getRoot());
        be beVar = this.aSt;
        beVar.aRO.setOnClickListener(new a(this));
        LinearLayout linearLayout = beVar.aRl;
        kotlin.jvm.internal.i.e(linearLayout, "contentLayout");
        linearLayout.setLayoutTransition(ai.bRN.anP());
    }

    public final CharSequence getMessage() {
        return this.aSw;
    }

    public s a(l lVar) {
        if (lVar == null) {
            return new h(SF());
        }
        s abVar;
        int i = c.aob[SF().SG().ordinal()];
        b bVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    abVar = new ab(SF());
                } else {
                    abVar = new h(SF());
                }
            } else if (lVar.acC()) {
                if (this.aSv) {
                    bVar = this;
                } else {
                    bVar = new b(SF(), getString(j.you_have_been_banned, new Object[0]));
                }
                abVar = bVar;
            } else {
                abVar = new ab(SF());
            }
        } else if (lVar.acC()) {
            if (this.aSv) {
                bVar = this;
            } else {
                bVar = new b(SF(), getString(j.you_have_been_banned, new Object[0]));
            }
            abVar = bVar;
        } else if (lVar.acD() < lVar.acE()) {
            b bVar2;
            if (kotlin.jvm.internal.i.y(this.aSu, Double.valueOf(lVar.acD()))) {
                bVar2 = this;
            } else {
                bVar2 = new b(SF(), u.a(this, lVar));
            }
            abVar = bVar2;
        } else {
            abVar = new ab(SF());
        }
        return abVar;
    }
}
