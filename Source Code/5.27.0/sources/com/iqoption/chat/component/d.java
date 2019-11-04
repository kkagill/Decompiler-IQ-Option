package com.iqoption.chat.component;

import androidx.databinding.ViewDataBinding;
import kotlin.f.a;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/chat/component/AttachmentViewHolder;", "T", "Landroidx/databinding/ViewDataBinding;", "Lcom/iqoption/chat/component/MessageViewHolder;", "binding", "(Landroidx/databinding/ViewDataBinding;)V", "<set-?>", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "attachment", "getAttachment", "()Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "setAttachment", "(Lcom/iqoption/core/microservices/chat/response/ChatAttachment;)V", "attachment$delegate", "Lkotlin/properties/ReadWriteProperty;", "chat_release"})
/* compiled from: MessageViewHolders.kt */
public class d<T extends ViewDataBinding> extends ab<T> {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(d.class), "attachment", "getAttachment()Lcom/iqoption/core/microservices/chat/response/ChatAttachment;"))};
    private final kotlin.f.d aOz = a.eWg.bnQ();

    public final com.iqoption.core.microservices.chat.response.a QU() {
        return (com.iqoption.core.microservices.chat.response.a) this.aOz.b(this, anY[0]);
    }

    public final void a(com.iqoption.core.microservices.chat.response.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "<set-?>");
        this.aOz.a(this, anY[0], aVar);
    }

    public d(T t) {
        kotlin.jvm.internal.i.f(t, "binding");
        super(t);
    }
}
