package com.iqoption.chat.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "invoke", "com/iqoption/chat/fragment/MessageOptionsDialog$onCreateView$1$clickListener$1"})
/* compiled from: MessageOptionsDialog.kt */
final class MessageOptionsDialog$onCreateView$$inlined$apply$lambda$2 extends Lambda implements b<View, l> {
    final /* synthetic */ Object $arg$inlined;
    final /* synthetic */ LayoutInflater $inflater$inlined;
    final /* synthetic */ List $opts$inlined;
    final /* synthetic */ n this$0;

    MessageOptionsDialog$onCreateView$$inlined$apply$lambda$2(n nVar, Object obj, List list, LayoutInflater layoutInflater) {
        this.this$0 = nVar;
        this.$arg$inlined = obj;
        this.$opts$inlined = list;
        this.$inflater$inlined = layoutInflater;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        ae((View) obj);
        return l.eVB;
    }

    public final void ae(View view) {
        kotlin.jvm.internal.i.f(view, "it");
        n.b c = this.this$0.aTV;
        if (c != null) {
            Object tag = view.getTag();
            if (tag != null) {
                c.a((String) tag, ((TextView) view).getText().toString(), this.$arg$inlined);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
        this.this$0.onClose();
    }
}
