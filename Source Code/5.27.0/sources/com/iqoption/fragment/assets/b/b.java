package com.iqoption.fragment.assets.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.cd;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetCategoryViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetsCategoryItemBinding;", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetCategoryViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/assets/viewholder/AssetCategoryViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: AssetCategoryViewHolder.kt */
public final class b extends e<cd, com.iqoption.fragment.assets.model.e> {
    private final b ddh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetCategoryViewHolder$Callback;", "", "onCategoryClick", "", "item", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "app_optionXRelease"})
    /* compiled from: AssetCategoryViewHolder.kt */
    public interface b {
        void b(com.iqoption.fragment.assets.model.e eVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b ddi;

        public a(b bVar) {
            this.ddi = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.assets.model.e eVar = (com.iqoption.fragment.assets.model.e) this.ddi.and();
            if (eVar != null) {
                View view2;
                String str = "itemView";
                if (eVar.Ng()) {
                    view2 = this.ddi.itemView;
                    kotlin.jvm.internal.i.e(view2, str);
                    if (!view2.isActivated()) {
                        view2 = this.ddi.itemView;
                        kotlin.jvm.internal.i.e(view2, str);
                        view2.setActivated(true);
                        this.ddi.ddh.b(eVar);
                    }
                }
                if (eVar.isSelectable()) {
                    view2 = this.ddi.itemView;
                    kotlin.jvm.internal.i.e(view2, str);
                    if (!view2.isSelected()) {
                        view2 = this.ddi.itemView;
                        kotlin.jvm.internal.i.e(view2, str);
                        view2.setSelected(true);
                    }
                }
                this.ddi.ddh.b(eVar);
            }
        }
    }

    public b(b bVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.assets_category_item, viewGroup, aVar);
        this.ddh = bVar;
        LinearLayout linearLayout = ((cd) getBinding()).bXu;
        kotlin.jvm.internal.i.e(linearLayout, "binding.categoryContent");
        linearLayout.setOnClickListener(new a(this));
    }

    public void a(cd cdVar, com.iqoption.fragment.assets.model.e eVar) {
        kotlin.jvm.internal.i.f(cdVar, "$this$bind");
        kotlin.jvm.internal.i.f(eVar, "item");
        if (eVar.aAO() != 0) {
            cdVar.aRh.setImageResource(eVar.aAO());
        } else {
            cdVar.aRh.setImageDrawable(null);
        }
        TextView textView = cdVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(eVar.getTitle());
        LinearLayout linearLayout = cdVar.bXu;
        String str = "categoryContent";
        kotlin.jvm.internal.i.e(linearLayout, str);
        linearLayout.setActivated(eVar.nq());
        linearLayout = cdVar.bXu;
        kotlin.jvm.internal.i.e(linearLayout, str);
        linearLayout.setSelected(eVar.isSelected());
        LinearLayout linearLayout2 = cdVar.bXu;
        kotlin.jvm.internal.i.e(linearLayout2, str);
        linearLayout2.setTag(eVar.getId());
    }
}
