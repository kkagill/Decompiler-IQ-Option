package com.iqoption.chat.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "invoke"})
/* compiled from: LastMessagesViewModel.kt */
final class LastMessagesViewModel$postLastMessage$1 extends Lambda implements b<MutableLiveData<e>, l> {
    final /* synthetic */ e $message;

    LastMessagesViewModel$postLastMessage$1(e eVar) {
        this.$message = eVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((MutableLiveData) obj);
        return l.eVB;
    }

    public final void a(MutableLiveData<e> mutableLiveData) {
        kotlin.jvm.internal.i.f(mutableLiveData, "it");
        mutableLiveData.postValue(this.$message);
    }
}
