package com.iqoption.fragment.assets;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.core.util.v;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "isKeyboardVisible", "", "invoke"})
/* compiled from: AssetsFragment.kt */
final class AssetsFragment$onCreateView$2 extends Lambda implements b<Boolean, l> {
    final /* synthetic */ b this$0;

    AssetsFragment$onCreateView$2(b bVar) {
        this.this$0 = bVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        dJ(((Boolean) obj).booleanValue());
        return l.eVB;
    }

    public final void dJ(boolean z) {
        if (z) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                kotlin.jvm.internal.i.e(activity, "it");
                Window window = activity.getWindow();
                kotlin.jvm.internal.i.e(window, "it.window");
                v.aA(window.getDecorView());
            }
        }
    }
}
