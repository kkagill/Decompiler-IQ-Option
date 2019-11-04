package com.iqoption.fragment.leftpanel;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.ql;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelItemBtnViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/LeftPanelItemBtnBinding;", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "callback", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemBtnViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "(Lcom/iqoption/fragment/leftpanel/LeftPanelItemBtnViewHolder$Callback;Landroid/view/ViewGroup;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: LeftPanelItemBtnViewHolder.kt */
public final class g extends e<ql, f> {
    private final b dkb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelItemBtnViewHolder$Callback;", "", "getIcon", "Landroid/graphics/drawable/Drawable;", "resId", "", "onClickExpanded", "", "app_optionXRelease"})
    /* compiled from: LeftPanelItemBtnViewHolder.kt */
    public interface b {
        void aEH();

        Drawable getIcon(int i);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ g dkc;

        public a(g gVar) {
            this.dkc = gVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.dkc.dkb.aEH();
        }
    }

    public g(b bVar, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(R.layout.left_panel_item_btn, viewGroup, null, 4, null);
        this.dkb = bVar;
        ImageView imageView = ((ql) getBinding()).aRh;
        kotlin.jvm.internal.i.e(imageView, "binding.icon");
        imageView.setOnClickListener(new a(this));
    }

    public void a(ql qlVar, f fVar) {
        kotlin.jvm.internal.i.f(qlVar, "$this$bind");
        kotlin.jvm.internal.i.f(fVar, "item");
        ImageView imageView = qlVar.aRh;
        String str = "icon";
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setSelected(fVar.isSelected());
        imageView = qlVar.aRh;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setContentDescription(fVar.aEJ().getEventName());
        qlVar.aRh.setImageDrawable(this.dkb.getIcon(fVar.aEJ().getIcon()));
    }
}
