package com.iqoption.videoeducation.a;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.aal;
import com.iqoption.videoeducation.n;
import com.iqoption.x.R;
import java.util.Arrays;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/videoeducation/component/TagItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/VideoEducationTagItemBinding;", "Lcom/iqoption/videoeducation/VideoTagItem;", "callback", "Lcom/iqoption/videoeducation/component/TagItemViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/videoeducation/component/TagItemViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "Companion", "app_optionXRelease"})
/* compiled from: TagItemViewHolder.kt */
public final class a extends e<aal, n> {
    private static final ColorStateList edi = ColorStateList.valueOf(d.getColor(R.color.green));
    private static final ColorStateList edj = ColorStateList.valueOf(d.getColor(R.color.grey_blue_50));
    @Deprecated
    public static final c edk = new c();
    private final b edh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/videoeducation/component/TagItemViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/videoeducation/VideoTagItem;", "app_optionXRelease"})
    /* compiled from: TagItemViewHolder.kt */
    public interface b {
        void a(n nVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, bng = {"Lcom/iqoption/videoeducation/component/TagItemViewHolder$Companion;", "", "()V", "COLOR_ACTIVATED", "Landroid/content/res/ColorStateList;", "kotlin.jvm.PlatformType", "getCOLOR_ACTIVATED", "()Landroid/content/res/ColorStateList;", "COLOR_DEACTIVATED", "getCOLOR_DEACTIVATED", "app_optionXRelease"})
    /* compiled from: TagItemViewHolder.kt */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ a edl;

        public a(a aVar) {
            this.edl = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            n nVar = (n) this.edl.and();
            if (nVar != null) {
                this.edl.edh.a(nVar);
            }
        }
    }

    public a(b bVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.video_education_tag_item, viewGroup, aVar);
        this.edh = bVar;
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this));
    }

    public void a(aal aal, n nVar) {
        kotlin.jvm.internal.i.f(aal, "$this$bind");
        kotlin.jvm.internal.i.f(nVar, "item");
        TextView textView = aal.ani;
        String str = "text";
        kotlin.jvm.internal.i.e(textView, str);
        kotlin.jvm.internal.n nVar2 = kotlin.jvm.internal.n.eWf;
        Object[] objArr = new Object[]{nVar.aXw().On()};
        String format = String.format("# %s", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
        TextView textView2;
        if (nVar.isSelected()) {
            textView2 = aal.ani;
            kotlin.jvm.internal.i.e(textView2, str);
            textView2.setAlpha(1.0f);
            ViewCompat.setBackgroundTintList(aal.ani, edi);
            return;
        }
        textView2 = aal.ani;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setAlpha(0.7f);
        ViewCompat.setBackgroundTintList(aal.ani, edj);
    }
}
