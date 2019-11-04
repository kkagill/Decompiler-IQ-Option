package com.iqoption.fragment.assets;

import android.view.View;
import android.widget.ImageView;
import com.iqoption.e.cv;
import com.iqoption.fragment.assets.b.h;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "invoke", "com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$5$endPadding$2"})
/* compiled from: AssetsFragment.kt */
final class AssetsFragment$onCreateView$$inlined$apply$lambda$5$1 extends Lambda implements a<Integer> {
    final /* synthetic */ h this$0;

    AssetsFragment$onCreateView$$inlined$apply$lambda$5$1(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Integer.valueOf(Lk());
    }

    public final int Lk() {
        cv cvVar = (cv) com.iqoption.core.ext.a.a(this.this$0.this$0, (int) R.layout.assets_item_actions, null, false, 4, null);
        String str = "btnAlert";
        ImageView imageView;
        if (this.this$0.this$0.aAk()) {
            imageView = cvVar.bWQ;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
        } else {
            imageView = cvVar.bWQ;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        }
        View root = cvVar.getRoot();
        root.measure(com.iqoption.core.ext.a.makeMeasureSpec(com.iqoption.core.ext.a.i(root, (int) R.dimen.assets_content_min_width), Integer.MIN_VALUE), com.iqoption.core.ext.a.makeMeasureSpec(0, 0));
        View root2 = cvVar.getRoot();
        kotlin.jvm.internal.i.e(root2, "inflateBinding<AssetsIte…                   }.root");
        return root2.getMeasuredWidth();
    }
}
