package com.iqoption.chat.fragment;

import android.widget.TextView;
import com.iqoption.chat.a.bi;
import com.iqoption.chat.e.j;
import com.iqoption.core.microservices.chat.response.k;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"setStaticSubtitle", "", "invoke", "com/iqoption/chat/fragment/PublicRoomTopBarDelegate$onRoomLoaded$1$1"})
/* compiled from: RoomTopBarDelegates.kt */
final class PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1 extends Lambda implements a<l> {
    final /* synthetic */ k $room$inlined;
    final /* synthetic */ bi $this_apply;
    final /* synthetic */ q this$0;

    PublicRoomTopBarDelegate$onRoomLoaded$$inlined$apply$lambda$1(bi biVar, q qVar, k kVar) {
        this.$this_apply = biVar;
        this.this$0 = qVar;
        this.$room$inlined = kVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        MY();
        return l.eVB;
    }

    public final void MY() {
        String str = "subtitle";
        TextView textView;
        if (this.$room$inlined.acz() > 0) {
            textView = this.$this_apply.aRu;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(this.this$0.getString(j.n1_online, Integer.valueOf(this.$room$inlined.acz())));
            textView = this.$this_apply.aRu;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setVisibility(0);
            return;
        }
        textView = this.$this_apply.aRu;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setVisibility(8);
    }
}
