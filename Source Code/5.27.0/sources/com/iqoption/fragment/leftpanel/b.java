package com.iqoption.fragment.leftpanel;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "callbacks", "Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter$Callbacks;", "(Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter$Callbacks;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: LeftPanelAdapter.kt */
public final class b extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, f> {
    public static final b djH = new b();
    private final a djG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_ITEM_BTN", "app_optionXRelease"})
    /* compiled from: LeftPanelAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter$Callbacks;", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder$Callback;", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemBtnViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: LeftPanelAdapter.kt */
    public interface a extends com.iqoption.fragment.leftpanel.g.b, h.c {
    }

    public b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.djG = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 0) {
            return new h(this.djG, viewGroup, this);
        }
        if (i == 1) {
            return new g(this.djG, viewGroup);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        if (itemViewType == 0) {
            ((h) cVar).bV(fp(i));
        } else if (itemViewType == 1) {
            ((g) cVar).bV(fp(i));
        }
    }

    public int getItemViewType(int i) {
        switch (((f) fp(i)).aEJ()) {
            case PORTFOIO:
            case MARKET_ANALYSIS:
            case PRICE_MOVEMENTS:
            case VIDEO_EDUCATION:
            case CHATS:
            case OTN:
            case ASSET_INFO:
                return 0;
            case MORE:
                return 1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
