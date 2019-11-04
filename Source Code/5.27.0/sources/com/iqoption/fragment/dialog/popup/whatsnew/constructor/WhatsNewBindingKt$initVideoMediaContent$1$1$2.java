package com.iqoption.fragment.dialog.popup.whatsnew.constructor;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.e.hi;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, bng = {"com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$initVideoMediaContent$1$1$2", "Landroidx/lifecycle/LifecycleObserver;", "onPlayVideo", "", "onStopVideo", "app_optionXRelease"})
/* compiled from: WhatsNewBinding.kt */
public final class WhatsNewBindingKt$initVideoMediaContent$1$1$2 implements LifecycleObserver {
    final /* synthetic */ hi dfP;

    WhatsNewBindingKt$initVideoMediaContent$1$1$2(hi hiVar) {
        this.dfP = hiVar;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onPlayVideo() {
        this.dfP.cdK.start();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onStopVideo() {
        this.dfP.cdK.pause();
    }
}
