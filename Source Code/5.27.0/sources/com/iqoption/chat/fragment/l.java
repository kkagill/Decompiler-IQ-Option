package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.ag;
import com.iqoption.chat.component.r;
import com.iqoption.chat.component.s;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.k;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#H\u0002J\u001e\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002010\u00172\b\b\u0002\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u000206H\u0014J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000¨\u0006B"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentImagePreviewSliderBinding;", "chatName", "", "current", "Landroidx/lifecycle/MutableLiveData;", "", "enterPreview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "getEnterPreview", "()Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "setEnterPreview", "(Lcom/iqoption/chat/viewmodel/AttachmentPreview;)V", "exitPreview", "getExitPreview", "setExitPreview", "getDestPreview", "Lkotlin/Function0;", "Landroid/widget/ImageView;", "getPreviewView", "Lkotlin/Function1;", "getSelectorView", "getSourcePreview", "getSourceSelector", "images", "", "onSend", "Ljava/io/File;", "", "picasso", "Lcom/squareup/picasso/Picasso;", "skipSharedElements", "", "transitionViewModel", "Lcom/iqoption/chat/viewmodel/TransitionViewModel;", "getTransitionViewModel", "()Lcom/iqoption/chat/viewmodel/TransitionViewModel;", "transitionViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;", "close", "createTransition", "Landroidx/transition/Transition;", "isEnter", "getDisplayer", "Lcom/squareup/picasso/RequestCreator;", "scale", "", "getPicasso", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ImagesAdapter", "Size", "chat_release"})
/* compiled from: ImagePreviewSliderFragment.kt */
public final class l extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = l.class.getName();
    public static final a aTB = new a();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(l.class), "transitionViewModel", "getTransitionViewModel()Lcom/iqoption/chat/viewmodel/TransitionViewModel;"))};
    private ag aOX;
    private com.iqoption.chat.viewmodel.a aSi;
    private String aSl = "";
    private kotlin.jvm.a.b<? super List<? extends File>, kotlin.l> aSm;
    private boolean aTA;
    private final kotlin.d aTq = g.c(new ImagePreviewSliderFragment$transitionViewModel$2(this));
    public com.iqoption.chat.viewmodel.b aTr;
    public com.iqoption.chat.viewmodel.b aTs;
    private List<com.iqoption.chat.viewmodel.b> aTt = m.emptyList();
    private MutableLiveData<Integer> aTu = new MutableLiveData();
    private kotlin.jvm.a.b<? super com.iqoption.chat.viewmodel.b, ? extends ImageView> aTv;
    private kotlin.jvm.a.b<? super com.iqoption.chat.viewmodel.b, ? extends ImageView> aTw;
    private final kotlin.jvm.a.a<ImageView> aTx = new ImagePreviewSliderFragment$getSourcePreview$1(this);
    private final kotlin.jvm.a.a<ImageView> aTy = new ImagePreviewSliderFragment$getDestPreview$1(this);
    private final kotlin.jvm.a.a<ImageView> aTz = new ImagePreviewSliderFragment$getSourceSelector$1(this);
    private Picasso picasso;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jl\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f\u0012\u0004\u0012\u00020\u00160\u0011R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment;", "chatName", "images", "", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "current", "", "getPreview", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "getSelector", "onSend", "Ljava/io/File;", "", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return l.TAG;
        }

        public final l a(String str, List<com.iqoption.chat.viewmodel.b> list, int i, kotlin.jvm.a.b<? super com.iqoption.chat.viewmodel.b, ? extends ImageView> bVar, kotlin.jvm.a.b<? super com.iqoption.chat.viewmodel.b, ? extends ImageView> bVar2, kotlin.jvm.a.b<? super List<? extends File>, kotlin.l> bVar3) {
            kotlin.jvm.internal.i.f(str, "chatName");
            kotlin.jvm.internal.i.f(list, "images");
            kotlin.jvm.internal.i.f(bVar, "getPreview");
            kotlin.jvm.internal.i.f(bVar2, "getSelector");
            kotlin.jvm.internal.i.f(bVar3, "onSend");
            l lVar = new l();
            lVar.setRetainInstance(true);
            lVar.aSl = str;
            lVar.aTt = list;
            lVar.aTu.setValue(Integer.valueOf(i));
            lVar.aTv = bVar;
            lVar.aTw = bVar2;
            lVar.aSm = bVar3;
            return lVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment$Size;", "", "w", "", "h", "(II)V", "getH", "()I", "getW", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    private static final class c {
        private final int h;
        private final int w;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if ((this.w == cVar.w ? 1 : null) != null) {
                        if ((this.h == cVar.h ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.w * 31) + this.h;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size(w=");
            stringBuilder.append(this.w);
            stringBuilder.append(", h=");
            stringBuilder.append(this.h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(int i, int i2) {
            this.w = i;
            this.h = i2;
        }

        public final int Sq() {
            return this.w;
        }

        public final int Sr() {
            return this.h;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment$ImagesAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "displayer", "Lkotlin/Function1;", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "Lcom/squareup/picasso/RequestCreator;", "images", "", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    private static final class b extends PagerAdapter {
        private final kotlin.jvm.a.b<com.iqoption.chat.viewmodel.b, RequestCreator> aTC;
        private final List<com.iqoption.chat.viewmodel.b> aTt;

        public b(kotlin.jvm.a.b<? super com.iqoption.chat.viewmodel.b, ? extends RequestCreator> bVar, List<com.iqoption.chat.viewmodel.b> list) {
            kotlin.jvm.internal.i.f(bVar, "displayer");
            kotlin.jvm.internal.i.f(list, "images");
            this.aTC = bVar;
            this.aTt = list;
        }

        public boolean isViewFromObject(View view, Object obj) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(obj, "object");
            return kotlin.jvm.internal.i.y(view, obj);
        }

        public int getCount() {
            return this.aTt.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "container");
            AppCompatImageView appCompatImageView = new AppCompatImageView(viewGroup.getContext());
            appCompatImageView.setScaleType(ScaleType.CENTER_INSIDE);
            com.iqoption.chat.viewmodel.b bVar = (com.iqoption.chat.viewmodel.b) this.aTt.get(i);
            appCompatImageView.setTag(bVar);
            ((RequestCreator) this.aTC.invoke(bVar)).into((ImageView) appCompatImageView);
            viewGroup.addView(appCompatImageView);
            return appCompatImageView;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            kotlin.jvm.internal.i.f(viewGroup, "container");
            kotlin.jvm.internal.i.f(obj, "object");
            viewGroup.removeView((View) obj);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    public static final class e implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ l this$0;

        e(l lVar) {
            this.this$0 = lVar;
        }

        public Transition RY() {
            return this.this$0.cf(true);
        }

        public Transition RZ() {
            return this.this$0.cf(true);
        }

        public Transition Sa() {
            return this.this$0.cf(false);
        }

        public Transition Sb() {
            return this.this$0.cf(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$onCreateView$1$1"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    static final class f<T> implements Observer<Integer> {
        final /* synthetic */ ag aTF;
        final /* synthetic */ l this$0;

        f(ag agVar, l lVar) {
            this.aTF = agVar;
            this.this$0 = lVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                if (num.intValue() == 0) {
                    num = Integer.valueOf(1);
                }
                TextView textView = this.aTF.alH;
                kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                l lVar = this.this$0;
                int i = com.iqoption.chat.e.j.n1_photos_to_n2_chat;
                Object[] objArr = new Object[2];
                objArr[0] = this.this$0.getResources().getQuantityString(com.iqoption.chat.e.i.photos, num.intValue(), new Object[]{num});
                objArr[1] = this.this$0.aSl;
                textView.setText(lVar.getString(i, objArr));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$onCreateView$1$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    public static final class g implements OnPageChangeListener {
        final /* synthetic */ ag aTF;
        final /* synthetic */ l this$0;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        g(ag agVar, l lVar) {
            this.aTF = agVar;
            this.this$0 = lVar;
        }

        public void onPageSelected(int i) {
            this.this$0.aTu.setValue(Integer.valueOf(i));
            ImageView imageView = this.aTF.aQL;
            kotlin.jvm.internal.i.e(imageView, "selector");
            imageView.setSelected(((com.iqoption.chat.viewmodel.b) this.this$0.aTt.get(i)).isSelected());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$onCreateView$1$3"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    static final class h<T> implements Observer<Integer> {
        final /* synthetic */ ag aTF;
        final /* synthetic */ l this$0;

        h(ag agVar, l lVar) {
            this.aTF = agVar;
            this.this$0 = lVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                ImageView imageView = this.aTF.aQL;
                kotlin.jvm.internal.i.e(imageView, "selector");
                imageView.setSelected(((com.iqoption.chat.viewmodel.b) this.this$0.aTt.get(num.intValue())).isSelected());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ ag aTG;
        final /* synthetic */ l this$0;

        public i(ag agVar, l lVar) {
            this.aTG = agVar;
            this.this$0 = lVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Integer num = (Integer) l.k(this.this$0).Tb().getValue();
            kotlin.jvm.a.b l;
            kotlin.l lVar;
            if (num != null && num.intValue() == 0) {
                l = this.this$0.aSm;
                if (l != null) {
                    List f = this.this$0.aTt;
                    ViewPager viewPager = this.aTG.aRy;
                    kotlin.jvm.internal.i.e(viewPager, "pager");
                    lVar = (kotlin.l) l.invoke(l.listOf(((com.iqoption.chat.viewmodel.b) f.get(viewPager.getCurrentItem())).fI()));
                }
            } else {
                l = this.this$0.aSm;
                if (l != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : this.this$0.aTt) {
                        if (((com.iqoption.chat.viewmodel.b) next).isSelected()) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<com.iqoption.chat.viewmodel.b> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                    for (com.iqoption.chat.viewmodel.b fI : iterable) {
                        arrayList2.add(fI.fI());
                    }
                    lVar = (kotlin.l) l.invoke((List) arrayList2);
                }
            }
            this.this$0.aTA = true;
            this.this$0.close();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class j extends com.iqoption.core.ext.g {
        final /* synthetic */ ag aTG;
        final /* synthetic */ l this$0;

        public j(ag agVar, l lVar) {
            this.aTG = agVar;
            this.this$0 = lVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            List f = this.this$0.aTt;
            ViewPager viewPager = this.aTG.aRy;
            kotlin.jvm.internal.i.e(viewPager, "pager");
            com.iqoption.chat.viewmodel.b bVar = (com.iqoption.chat.viewmodel.b) f.get(viewPager.getCurrentItem());
            Integer num = (Integer) l.k(this.this$0).Tb().getValue();
            if (num == null || num.intValue() != 3 || bVar.isSelected()) {
                l.k(this.this$0).i(bVar);
                ImageView imageView = this.aTG.aQL;
                imageView.setSelected(imageView.isSelected() ^ 1);
                kotlin.jvm.internal.i.e(imageView, "selector.apply { isSelected = !isSelected }");
                return;
            }
            String string = this.this$0.getString(com.iqoption.chat.e.j.you_can_send_maximum);
            kotlin.jvm.internal.i.e(string, "getString(R.string.you_can_send_maximum)");
            com.iqoption.core.d.a(string, 0, 2, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    public static final class d extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ l this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$createAnimator$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: ImagePreviewSliderFragment.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ s aTD;
            final /* synthetic */ d this$0;

            a(AnimatorSet animatorSet, s sVar, d dVar) {
                this.aSC = animatorSet;
                this.aTD = sVar;
                this.this$0 = dVar;
            }

            public void onAnimationStart(Animator animator) {
                l lVar = this.this$0.this$0;
                List f = this.this$0.this$0.aTt;
                Object value = this.this$0.this$0.aTu.getValue();
                if (value == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(value, "current.value!!");
                lVar.f((com.iqoption.chat.viewmodel.b) f.get(((Number) value).intValue()));
                this.this$0.this$0.Sn().j(this.this$0.this$0.So());
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\t"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$createAnimator$1$1$2$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "chat_release", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$$special$$inlined$apply$lambda$2", "com/iqoption/chat/fragment/ImagePreviewSliderFragment$createTransition$1$$special$$inlined$animators$lambda$2"})
        /* compiled from: ImagePreviewSliderFragment.kt */
        public static final class b extends AnimatorListenerAdapter {
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ s aTD;
            final /* synthetic */ d this$0;

            b(AnimatorSet animatorSet, s sVar, d dVar) {
                this.aSC = animatorSet;
                this.aTD = sVar;
                this.this$0 = dVar;
            }

            public void onAnimationStart(Animator animator) {
                l lVar = this.this$0.this$0;
                List f = this.this$0.this$0.aTt;
                Object value = this.this$0.this$0.aTu.getValue();
                if (value == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(value, "current.value!!");
                lVar.g((com.iqoption.chat.viewmodel.b) f.get(((Number) value).intValue()));
                if ((kotlin.jvm.internal.i.y(this.this$0.this$0.So(), this.this$0.this$0.Sp()) ^ 1) != 0) {
                    this.this$0.this$0.Sn().k(this.this$0.this$0.So());
                    this.this$0.this$0.Sn().j(this.this$0.this$0.Sp());
                }
            }

            public void onAnimationEnd(Animator animator) {
                View root = l.e(this.this$0.this$0).getRoot();
                kotlin.jvm.internal.i.e(root, "binding.root");
                root.setAlpha(0.0f);
                this.this$0.this$0.Sn().k(this.this$0.this$0.Sp());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        d(l lVar, boolean z) {
            this.this$0 = lVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(lVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            s sVar = new s(this.this$0.aTx, this.this$0.aTy, this.this$0.aTz, new ImagePreviewSliderFragment$createTransition$1$createAnimator$$inlined$apply$lambda$1(this), l.e(this.this$0));
            List arrayList = new ArrayList();
            com.iqoption.core.graphics.animation.a.a XT;
            if (this.aSB) {
                XT = new r(sVar).XT();
                if (!(XT == null || XT.bC(sVar) == null)) {
                    animatorSet.addListener(new a(animatorSet, sVar, this));
                }
            } else {
                XT = new r(sVar).XT();
                if (!(XT == null || XT.bD(sVar) == null)) {
                    animatorSet.addListener(new b(animatorSet, sVar, this));
                }
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 250);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    private final com.iqoption.chat.viewmodel.r Sn() {
        kotlin.d dVar = this.aTq;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.chat.viewmodel.r) dVar.getValue();
    }

    public static final /* synthetic */ ag e(l lVar) {
        ag agVar = lVar.aOX;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return agVar;
    }

    public static final /* synthetic */ com.iqoption.chat.viewmodel.a k(l lVar) {
        com.iqoption.chat.viewmodel.a aVar = lVar.aSi;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return aVar;
    }

    public final com.iqoption.chat.viewmodel.b So() {
        com.iqoption.chat.viewmodel.b bVar = this.aTr;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("enterPreview");
        }
        return bVar;
    }

    public final void f(com.iqoption.chat.viewmodel.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "<set-?>");
        this.aTr = bVar;
    }

    public final com.iqoption.chat.viewmodel.b Sp() {
        com.iqoption.chat.viewmodel.b bVar = this.aTs;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("exitPreview");
        }
        return bVar;
    }

    public final void g(com.iqoption.chat.viewmodel.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "<set-?>");
        this.aTs = bVar;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new e(this);
    }

    private final Transition cf(boolean z) {
        return new d(this, z);
    }

    private final Picasso getPicasso() {
        Picasso picasso = this.picasso;
        if (picasso != null) {
            return picasso;
        }
        picasso = Picasso.with(requireContext());
        this.picasso = picasso;
        kotlin.jvm.internal.i.e(picasso, "Picasso.with(requireCont…()).also { picasso = it }");
        return picasso;
    }

    static /* synthetic */ kotlin.jvm.a.b a(l lVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lVar.J(f);
    }

    private final kotlin.jvm.a.b<com.iqoption.chat.viewmodel.b, RequestCreator> J(float f) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (c) null;
        ImagePreviewSliderFragment$getDisplayer$1 imagePreviewSliderFragment$getDisplayer$1 = new ImagePreviewSliderFragment$getDisplayer$1(this, objectRef, f);
        objectRef = new ObjectRef();
        objectRef.element = (Transformation) null;
        return new ImagePreviewSliderFragment$getDisplayer$3(this, imagePreviewSliderFragment$getDisplayer$1, f, new ImagePreviewSliderFragment$getDisplayer$2(objectRef, f, imagePreviewSliderFragment$getDisplayer$1));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.aTt.isEmpty() || this.aSm == null) {
            close();
            return null;
        }
        ag agVar = (ag) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.chat.e.h.chat_fragment_image_preview_slider, viewGroup, false, 4, null);
        this.aOX = agVar;
        this.aSi = com.iqoption.chat.viewmodel.a.aWz.Tg();
        com.iqoption.chat.viewmodel.a aVar = this.aSi;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        a(aVar.Tb(), new f(agVar, this));
        View root = agVar.getRoot();
        String str = "root";
        kotlin.jvm.internal.i.e(root, str);
        View root2 = agVar.getRoot();
        kotlin.jvm.internal.i.e(root2, str);
        Drawable background = root2.getBackground();
        kotlin.jvm.internal.i.e(background, "root.background");
        root.setBackground(new com.iqoption.core.graphics.a.e(background));
        Object value = this.aTu.getValue();
        if (value == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(value, "current.value!!");
        int intValue = ((Number) value).intValue();
        kotlin.jvm.a.b a = a(this, 0.0f, 1, null);
        ViewPager viewPager = agVar.aRy;
        String str2 = "pager";
        kotlin.jvm.internal.i.e(viewPager, str2);
        viewPager.setAdapter(new b(a, this.aTt));
        ViewPager viewPager2 = agVar.aRy;
        kotlin.jvm.internal.i.e(viewPager2, str2);
        viewPager2.setCurrentItem(intValue);
        agVar.aRy.addOnPageChangeListener(new g(agVar, this));
        this.aTu.observe(this, new h(agVar, this));
        ImageView imageView = agVar.aRw;
        kotlin.jvm.internal.i.e(imageView, "btnSend");
        imageView.setOnClickListener(new i(agVar, this));
        imageView = agVar.aQL;
        kotlin.jvm.internal.i.e(imageView, "selector");
        imageView.setOnClickListener(new j(agVar, this));
        return agVar.getRoot();
    }

    private final void close() {
        com.iqoption.chat.b.a ST = com.iqoption.chat.b.b.ST();
        Fragment fragment = this;
        String Bx = a.aSp.Bx();
        kotlin.jvm.internal.i.e(Bx, "AttachmentPickerFragment.TAG");
        ST.a(fragment, Bx, true);
    }
}
