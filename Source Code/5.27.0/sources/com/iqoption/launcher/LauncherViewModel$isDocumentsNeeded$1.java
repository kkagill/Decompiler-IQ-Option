package com.iqoption.launcher;

import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.ext.c;
import com.iqoption.microservice.b.b.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "status", "Lcom/iqoption/microservice/kyc/response/KycDocumentsStatus;", "invoke"})
/* compiled from: LauncherViewModel.kt */
final class LauncherViewModel$isDocumentsNeeded$1 extends Lambda implements b<a, l> {
    final /* synthetic */ MutableLiveData $liveData;

    LauncherViewModel$isDocumentsNeeded$1(MutableLiveData mutableLiveData) {
        this.$liveData = mutableLiveData;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((a) obj);
        return l.eVB;
    }

    public final void a(a aVar) {
        this.$liveData.postValue(Boolean.valueOf(c.b(aVar != null ? aVar.dGL : null, "VERIFYING", "APPROVED") ^ 1));
    }
}
