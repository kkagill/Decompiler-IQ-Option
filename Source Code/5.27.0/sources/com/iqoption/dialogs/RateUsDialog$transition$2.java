package com.iqoption.dialogs;

import androidx.transition.AutoTransition;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroidx/transition/AutoTransition;", "invoke"})
/* compiled from: RateUsDialog.kt */
final class RateUsDialog$transition$2 extends Lambda implements a<AutoTransition> {
    public static final RateUsDialog$transition$2 cLn = new RateUsDialog$transition$2();

    RateUsDialog$transition$2() {
        super(0);
    }

    /* renamed from: auC */
    public final AutoTransition invoke() {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setOrdering(0);
        autoTransition.setDuration(200);
        return autoTransition;
    }
}
