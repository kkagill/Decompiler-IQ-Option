package com.iqoption.welcome.slide;

import android.view.View;
import com.iqoption.core.ext.a;
import com.iqoption.welcome.g.d;
import com.iqoption.welcome.h;
import com.iqoption.welcome.p;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "invoke", "com/iqoption/welcome/slide/WelcomeSlidesFragment$onCreateView$1$clickListener$1"})
/* compiled from: WelcomeSlidesFragment.kt */
final class WelcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1 extends Lambda implements b<View, l> {
    final /* synthetic */ e this$0;

    WelcomeSlidesFragment$onCreateView$$inlined$apply$lambda$1(e eVar) {
        this.this$0 = eVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        ae((View) obj);
        return l.eVB;
    }

    public final void ae(View view) {
        kotlin.jvm.internal.i.f(view, "v");
        int id = view.getId();
        if (id == d.btnLogin) {
            p.ekx.bo(a.v(this.this$0)).a(com.iqoption.welcome.d.eke);
        } else if (id == d.btnRegister) {
            p.ekx.bo(a.v(this.this$0)).a(new h(false, 1, null));
        }
    }
}
