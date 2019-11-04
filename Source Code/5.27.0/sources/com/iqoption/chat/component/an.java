package com.iqoption.chat.component;

import com.iqoption.chat.a.bq;
import com.iqoption.core.microservices.chat.response.m;
import kotlin.f.a;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/component/SuggestionViewHolder;", "Lcom/iqoption/chat/component/ViewHolder;", "Lcom/iqoption/chat/databinding/ChatSuggestionMessageItemBinding;", "binding", "(Lcom/iqoption/chat/databinding/ChatSuggestionMessageItemBinding;)V", "<set-?>", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "suggestion", "getSuggestion", "()Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "setSuggestion", "(Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;)V", "suggestion$delegate", "Lkotlin/properties/ReadWriteProperty;", "chat_release"})
/* compiled from: MessageViewHolders.kt */
public final class an extends ax<bq> {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(an.class), "suggestion", "getSuggestion()Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;"))};
    private final d aQG = a.eWg.bnQ();

    public final m RQ() {
        return (m) this.aQG.b(this, anY[0]);
    }

    public final void a(m mVar) {
        kotlin.jvm.internal.i.f(mVar, "<set-?>");
        this.aQG.a(this, anY[0], mVar);
    }

    public an(bq bqVar) {
        kotlin.jvm.internal.i.f(bqVar, "binding");
        super(bqVar);
    }
}
