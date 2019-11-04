package com.iqoption.feed;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.feed.a.k;
import com.iqoption.feed.i.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/feed/FeedMenuFragment;", "Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "Lcom/iqoption/feed/databinding/MacroFeedOptionsBinding;", "()V", "feedAdapterItem", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "getFeedAdapterItem", "()Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "feedAdapterItem$delegate", "Lkotlin/Lazy;", "listener", "Lcom/iqoption/feed/FeedMenuListener;", "getListener", "()Lcom/iqoption/feed/FeedMenuListener;", "setListener", "(Lcom/iqoption/feed/FeedMenuListener;)V", "onBottomSheetClosed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "provideViewBinding", "container", "Landroid/view/ViewGroup;", "Companion", "feed_release"})
/* compiled from: FeedMenuFragment.kt */
public final class c extends com.iqoption.bottomsheet.a<k> {
    public static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(c.class), "feedAdapterItem", "getFeedAdapterItem()Lcom/iqoption/feed/feedlist/FeedAdapterItem;"))};
    public static final a cOj = new a();
    private HashMap apm;
    private d cOh;
    private final kotlin.d cOi = g.c(new FeedMenuFragment$feedAdapterItem$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/feed/FeedMenuFragment$Companion;", "", "()V", "ARG_FEED_ITEM", "", "TAG", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "item", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "feed_release"})
    /* compiled from: FeedMenuFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c a(com.iqoption.feed.feedlist.d dVar) {
            com.iqoption.feed.feedlist.d dVar2 = dVar;
            kotlin.jvm.internal.i.f(dVar2, "item");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_FEED_ITEM", dVar2);
            return new com.iqoption.core.ui.d.c(c.TAG, c.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: FeedMenuFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ c this$0;

        b(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            d ave = this.this$0.ave();
            if (ave != null) {
                ave.b(this.this$0.avf());
            }
            ave = this.this$0.ave();
            if (ave != null) {
                ave.onClose();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: FeedMenuFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ c this$0;

        c(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            d ave = this.this$0.ave();
            if (ave != null) {
                ave.c(this.this$0.avf());
            }
            ave = this.this$0.ave();
            if (ave != null) {
                ave.onClose();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: FeedMenuFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ c this$0;

        d(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            d ave = this.this$0.ave();
            if (ave != null) {
                ave.d(this.this$0.avf());
            }
            ave = this.this$0.ave();
            if (ave != null) {
                ave.onClose();
            }
        }
    }

    public static final com.iqoption.core.ui.d.c a(com.iqoption.feed.feedlist.d dVar) {
        return cOj.a(dVar);
    }

    private final com.iqoption.feed.feedlist.d avf() {
        kotlin.d dVar = this.cOi;
        j jVar = anY[0];
        return (com.iqoption.feed.feedlist.d) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final void a(d dVar) {
        this.cOh = dVar;
    }

    public final d ave() {
        return this.cOh;
    }

    /* renamed from: q */
    public k j(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return (k) com.iqoption.core.ext.a.a(viewGroup, f.macro_feed_options, null, false, 6, null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ((k) getBinding()).cPQ.setOnClickListener(new b(this));
        ((k) getBinding()).cPN.setOnClickListener(new c(this));
        ((k) getBinding()).cPO.setOnClickListener(new d(this));
    }

    public void KR() {
        d dVar = this.cOh;
        if (dVar != null) {
            dVar.onClose();
        }
    }
}
