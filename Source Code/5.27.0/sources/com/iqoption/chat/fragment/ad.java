package com.iqoption.chat.fragment;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.bn;
import com.iqoption.chat.e;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.k.c;
import com.iqoption.core.microservices.chat.response.k;
import com.iqoption.core.util.LocalizationUtil;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/chat/fragment/SupportRoomTopBarDelegate;", "Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "showOnline", "", "(Lcom/iqoption/chat/fragment/DelegateContext;Z)V", "binding", "Lcom/iqoption/chat/databinding/ChatRoomSupportToolbarBinding;", "onRoomLoaded", "", "room", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "chat_release"})
/* compiled from: RoomTopBarDelegates.kt */
public final class ad extends x {
    private final g aUp;
    private final bn aVw = ((bn) z.e(this.aUp, h.chat_room_support_toolbar));
    private final boolean aVx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/RoomViewModel$TypingInfo;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/SupportRoomTopBarDelegate$onRoomLoaded$1$1"})
    /* compiled from: RoomTopBarDelegates.kt */
    static final class a<T> implements Observer<c> {
        final /* synthetic */ k $room$inlined;
        final /* synthetic */ bn aVy;
        final /* synthetic */ ad aVz;

        a(bn bnVar, ad adVar, k kVar) {
            this.aVy = bnVar;
            this.aVz = adVar;
            this.$room$inlined = kVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                int count = cVar.getCount();
                String str = "typing";
                if (count != 0) {
                    TextView textView = this.aVy.aRT;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setText(this.aVz.a(e.i.typing, count, cVar.getName()));
                    return;
                }
                TextView textView2 = this.aVy.aRT;
                kotlin.jvm.internal.i.e(textView2, str);
                textView2.setText((CharSequence) null);
            }
        }
    }

    public ad(g gVar, boolean z) {
        kotlin.jvm.internal.i.f(gVar, "delegateContext");
        super(gVar);
        this.aUp = gVar;
        this.aVx = z;
    }

    public void d(k kVar) {
        if (kVar != null) {
            bn bnVar = this.aVw;
            TextView textView = bnVar.alH;
            kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
            textView.setText(LocalizationUtil.hq(kVar.getName()));
            textView = bnVar.aRu;
            String str = "subtitle";
            kotlin.jvm.internal.i.e(textView, str);
            TextView textView2 = bnVar.aRu;
            kotlin.jvm.internal.i.e(textView2, str);
            String obj = textView2.getText().toString();
            if (obj != null) {
                obj = obj.toLowerCase();
                kotlin.jvm.internal.i.e(obj, "(this as java.lang.String).toLowerCase()");
                textView.setText(obj);
                ImageView imageView;
                if (this.aVx) {
                    textView = bnVar.aRu;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setVisibility(0);
                    imageView = bnVar.aRS;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                } else {
                    textView = bnVar.aRu;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setVisibility(8);
                    imageView = bnVar.aRS;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
                this.aUp.Sf().TI().observe(this.aUp, new a(bnVar, this, kVar));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
