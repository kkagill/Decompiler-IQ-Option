package com.iqoption.fragment.leftpanel;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.qj;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/LeftPanelItemBinding;", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "callback", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: LeftPanelItemViewHolder.kt */
public class h extends e<qj, f> {
    private final c dkd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"})
    /* compiled from: LeftPanelItemViewHolder.kt */
    /* renamed from: com.iqoption.fragment.leftpanel.h$1 */
    static final class AnonymousClass1 implements OnLongClickListener {
        final /* synthetic */ h dke;

        AnonymousClass1(h hVar) {
            this.dke = hVar;
        }

        public final boolean onLongClick(View view) {
            this.dke.dkd.a(this.dke);
            return false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"})
    /* compiled from: LeftPanelItemViewHolder.kt */
    /* renamed from: com.iqoption.fragment.leftpanel.h$2 */
    static final class AnonymousClass2 implements OnTouchListener {
        final /* synthetic */ h dke;

        AnonymousClass2(h hVar) {
            this.dke = hVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.i.e(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.dke.dkd.a(this.dke);
            }
            return false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder$Callback;", "", "getIcon", "Landroid/graphics/drawable/Drawable;", "resId", "", "onClickItem", "", "item", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "onClickVisibleItem", "onStartDrag", "viewHolder", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder;", "app_optionXRelease"})
    /* compiled from: LeftPanelItemViewHolder.kt */
    public interface c {
        void a(f fVar);

        void a(h hVar);

        void b(f fVar);

        Drawable getIcon(int i);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ h dke;

        public a(h hVar) {
            this.dke = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            f fVar = (f) this.dke.and();
            if (fVar != null) {
                this.dke.dkd.a(fVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ h dke;

        public b(h hVar) {
            this.dke = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            f fVar = (f) this.dke.and();
            if (fVar != null) {
                this.dke.dkd.b(fVar);
            }
        }
    }

    public h(c cVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(cVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.left_panel_item, viewGroup, aVar);
        this.dkd = cVar;
        ((qj) getBinding()).getRoot().setOnLongClickListener(new AnonymousClass1(this));
        ((qj) getBinding()).cmQ.setOnTouchListener(new AnonymousClass2(this));
        ImageView imageView = ((qj) getBinding()).aRh;
        kotlin.jvm.internal.i.e(imageView, "binding.icon");
        imageView.setOnClickListener(new a(this));
        imageView = ((qj) getBinding()).cmR;
        kotlin.jvm.internal.i.e(imageView, "binding.visibleIcon");
        imageView.setOnClickListener(new b(this));
    }

    public void a(qj qjVar, f fVar) {
        kotlin.jvm.internal.i.f(qjVar, "$this$bind");
        kotlin.jvm.internal.i.f(fVar, "item");
        qjVar.aRh.setImageDrawable(this.dkd.getIcon(fVar.aEJ().getIcon()));
        ImageView imageView = qjVar.aRh;
        String str = "icon";
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setSelected(fVar.isSelected());
        imageView = qjVar.aRh;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setContentDescription(fVar.aEJ().getEventName());
        FormattedTextView formattedTextView = qjVar.chj;
        kotlin.jvm.internal.i.e(formattedTextView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        formattedTextView.setText(fVar.aEJ().getTitle());
        String str2 = "visibleIcon";
        String str3 = "moveIcon";
        ImageView imageView2;
        if (fVar.isVisible()) {
            imageView2 = qjVar.aRh;
            kotlin.jvm.internal.i.e(imageView2, str);
            imageView2.setAlpha(1.0f);
            imageView2 = qjVar.cmQ;
            kotlin.jvm.internal.i.e(imageView2, str3);
            imageView2.setAlpha(1.0f);
            imageView2 = qjVar.cmR;
            kotlin.jvm.internal.i.e(imageView2, str2);
            imageView2.setSelected(false);
            qjVar.chj.setTextColor(com.iqoption.core.ext.a.a((ViewDataBinding) qjVar, (int) R.color.white));
            return;
        }
        imageView2 = qjVar.aRh;
        kotlin.jvm.internal.i.e(imageView2, str);
        imageView2.setAlpha(0.3f);
        imageView2 = qjVar.cmQ;
        kotlin.jvm.internal.i.e(imageView2, str3);
        imageView2.setAlpha(0.3f);
        imageView2 = qjVar.cmR;
        kotlin.jvm.internal.i.e(imageView2, str2);
        imageView2.setSelected(true);
        qjVar.chj.setTextColor(com.iqoption.core.ext.a.a((ViewDataBinding) qjVar, (int) R.color.grey_blue_30));
    }
}
