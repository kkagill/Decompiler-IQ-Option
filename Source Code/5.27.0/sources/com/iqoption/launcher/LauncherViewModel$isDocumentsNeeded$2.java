package com.iqoption.launcher;

import androidx.lifecycle.MutableLiveData;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "error", "", "invoke"})
/* compiled from: LauncherViewModel.kt */
final class LauncherViewModel$isDocumentsNeeded$2 extends Lambda implements b<Throwable, l> {
    final /* synthetic */ MutableLiveData $liveData;
    final /* synthetic */ a this$0;

    LauncherViewModel$isDocumentsNeeded$2(a aVar, MutableLiveData mutableLiveData) {
        this.this$0 = aVar;
        this.$liveData = mutableLiveData;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        J((Throwable) obj);
        return l.eVB;
    }

    public final void J(Throwable th) {
        this.$liveData.postValue(Boolean.valueOf(com.iqoption.app.b.aK(this.this$0.getApplication()).asi));
    }
}
