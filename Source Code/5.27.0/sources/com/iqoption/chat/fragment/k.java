package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.ae;
import com.iqoption.chat.e.h;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\u000f¨\u0006)"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentImagePreviewBinding;", "picasso", "Lcom/squareup/picasso/Picasso;", "kotlin.jvm.PlatformType", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "picasso$delegate", "Lkotlin/Lazy;", "subTitle", "", "getSubTitle", "()Ljava/lang/String;", "subTitle$delegate", "url", "getUrl", "url$delegate", "close", "", "createTransition", "Landroidx/transition/Transition;", "isEnter", "", "download", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "chat_release"})
/* compiled from: ImagePreviewFragment.kt */
public final class k extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = k.class.getName();
    public static final a aTi = new a();
    static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "url", "getUrl()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "subTitle", "getSubTitle()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "picasso", "getPicasso()Lcom/squareup/picasso/Picasso;"))};
    private final kotlin.d aTe = g.c(new ImagePreviewFragment$url$2(this));
    private final kotlin.d aTf = g.c(new ImagePreviewFragment$subTitle$2(this));
    private final kotlin.d aTg = g.c(new ImagePreviewFragment$picasso$2(this));
    private ae aTh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/fragment/ImagePreviewFragment$Companion;", "", "()V", "ARG_SUBTITLE", "", "ARG_URL", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/ImagePreviewFragment;", "url", "subTitle", "chat_release"})
    /* compiled from: ImagePreviewFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return k.TAG;
        }

        public final k aa(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "url");
            kotlin.jvm.internal.i.f(str2, "subTitle");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putString("arg.url", str);
            bundle.putString("arg.subTitle", str2);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/ImagePreviewFragment$onCreateView$1$1"})
    /* compiled from: ImagePreviewFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ k this$0;

        d(k kVar) {
            this.this$0 = kVar;
        }

        public final void onClick(View view) {
            this.this$0.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/ImagePreviewFragment$onCreateView$1$2"})
    /* compiled from: ImagePreviewFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ k this$0;

        e(k kVar) {
            this.this$0 = kVar;
        }

        public final void onClick(View view) {
            this.this$0.Sl();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0012¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/ImagePreviewFragment$onCreateView$1$3", "Landroid/view/View$OnTouchListener;", "background", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "edge", "", "skip", "", "startY", "viewsToMoveUp", "", "Landroid/view/View;", "[Landroid/view/View;", "onTouch", "v", "event", "Landroid/view/MotionEvent;", "chat_release"})
    /* compiled from: ImagePreviewFragment.kt */
    public static final class f implements OnTouchListener {
        private float Mi;
        private final Drawable aTj;
        private final float aTk = com.iqoption.core.ext.a.b((ViewDataBinding) this.aTn, com.iqoption.chat.e.d.dp100);
        private final View[] aTl;
        private boolean aTm;
        final /* synthetic */ ae aTn;
        final /* synthetic */ k this$0;

        f(ae aeVar, k kVar) {
            this.aTn = aeVar;
            this.this$0 = kVar;
            View root = this.aTn.getRoot();
            kotlin.jvm.internal.i.e(root, "root");
            this.aTj = root.getBackground();
            View[] viewArr = new View[4];
            ImageView imageView = this.aTn.aHK;
            kotlin.jvm.internal.i.e(imageView, "btnBack");
            viewArr[0] = imageView;
            imageView = this.aTn.aRt;
            kotlin.jvm.internal.i.e(imageView, "btnDownload");
            viewArr[1] = imageView;
            TextView textView = this.aTn.alH;
            kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
            viewArr[2] = textView;
            textView = this.aTn.aRu;
            kotlin.jvm.internal.i.e(textView, "subtitle");
            viewArr[3] = textView;
            this.aTl = viewArr;
        }

        /* JADX WARNING: Missing block: B:7:0x001e, code skipped:
            if (r9 != 3) goto L_0x00db;
     */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
            r8 = this;
            r0 = "v";
            kotlin.jvm.internal.i.f(r9, r0);
            r9 = "event";
            kotlin.jvm.internal.i.f(r10, r9);
            r9 = r10.getActionMasked();
            r0 = "preview";
            r1 = 0;
            r2 = 1;
            if (r9 == 0) goto L_0x00be;
        L_0x0015:
            r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r4 = 0;
            if (r9 == r2) goto L_0x0069;
        L_0x001a:
            r5 = 2;
            if (r9 == r5) goto L_0x0022;
        L_0x001d:
            r0 = 3;
            if (r9 == r0) goto L_0x0069;
        L_0x0020:
            goto L_0x00db;
        L_0x0022:
            r9 = r8.aTm;
            if (r9 == 0) goto L_0x0027;
        L_0x0026:
            return r2;
        L_0x0027:
            r9 = r10.getY();
            r10 = r8.Mi;
            r9 = r9 - r10;
            r10 = r8.aTn;
            r10 = r10.aQK;
            kotlin.jvm.internal.i.e(r10, r0);
            r10.setTranslationY(r9);
            r10 = r8.aTl;
            r0 = r10.length;
        L_0x003b:
            if (r1 >= r0) goto L_0x004a;
        L_0x003d:
            r6 = r10[r1];
            r7 = java.lang.Math.abs(r9);
            r7 = -r7;
            r6.setTranslationY(r7);
            r1 = r1 + 1;
            goto L_0x003b;
        L_0x004a:
            r10 = r8.aTj;
            r0 = "background";
            kotlin.jvm.internal.i.e(r10, r0);
            r0 = (float) r3;
            r1 = (float) r2;
            r9 = java.lang.Math.abs(r9);
            r3 = r8.aTk;
            r6 = 0;
            r9 = com.iqoption.core.ext.c.a(r9, r3, r4, r5, r6);
            r1 = r1 - r9;
            r0 = r0 * r1;
            r9 = kotlin.e.c.au(r0);
            r10.setAlpha(r9);
            goto L_0x00db;
        L_0x0069:
            r9 = r8.aTm;
            if (r9 == 0) goto L_0x006e;
        L_0x006d:
            return r2;
        L_0x006e:
            r9 = r10.getY();
            r10 = r8.Mi;
            r9 = r9 - r10;
            r9 = java.lang.Math.abs(r9);
            r10 = r8.aTk;
            r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
            if (r9 < 0) goto L_0x0085;
        L_0x007f:
            r9 = r8.this$0;
            r9.close();
            goto L_0x00db;
        L_0x0085:
            r9 = r8.aTn;
            r9 = r9.aQK;
            r9 = r9.animate();
            r9 = r9.translationY(r4);
            r9.start();
            r9 = r8.aTl;
            r10 = r9.length;
            r0 = 0;
        L_0x0098:
            if (r0 >= r10) goto L_0x00aa;
        L_0x009a:
            r5 = r9[r0];
            r5 = r5.animate();
            r5 = r5.translationY(r4);
            r5.start();
            r0 = r0 + 1;
            goto L_0x0098;
        L_0x00aa:
            r9 = r8.aTj;
            r10 = com.iqoption.core.graphics.animation.c.bhK;
            r10 = r10.XE();
            r0 = new int[r2];
            r0[r1] = r3;
            r9 = android.animation.ObjectAnimator.ofInt(r9, r10, r0);
            r9.start();
            goto L_0x00db;
        L_0x00be:
            r9 = r10.getY();
            r3 = r8.aTn;
            r3 = r3.aQK;
            kotlin.jvm.internal.i.e(r3, r0);
            r0 = r3.getTop();
            r0 = (float) r0;
            r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r9 >= 0) goto L_0x00d3;
        L_0x00d2:
            r1 = 1;
        L_0x00d3:
            r8.aTm = r1;
            r9 = r10.getY();
            r8.Mi = r9;
        L_0x00db:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.fragment.k$f.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release", "com/iqoption/chat/fragment/ImagePreviewFragment$$special$$inlined$doOnPreDraw$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g implements OnPreDrawListener {
        final /* synthetic */ View aTo;
        final /* synthetic */ ae aTp;
        final /* synthetic */ k this$0;

        public g(View view, ae aeVar, k kVar) {
            this.aTo = view;
            this.aTp = aeVar;
            this.this$0 = kVar;
        }

        public boolean onPreDraw() {
            this.aTo.getViewTreeObserver().removeOnPreDrawListener(this);
            this.this$0.getPicasso().load(this.this$0.getUrl()).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).into(this.aTp.aQK);
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/ImagePreviewFragment$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: ImagePreviewFragment.kt */
    public static final class c implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ k this$0;

        c(k kVar) {
            this.this$0 = kVar;
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

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/ImagePreviewFragment$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: ImagePreviewFragment.kt */
    public static final class b extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ k this$0;

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        b(k kVar, boolean z) {
            this.this$0 = kVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(kVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            String str = "binding.root";
            View root;
            ObjectAnimator ofInt;
            if (this.aSB) {
                root = k.e(this.this$0).getRoot();
                kotlin.jvm.internal.i.e(root, str);
                ofInt = ObjectAnimator.ofInt(root.getBackground(), com.iqoption.core.graphics.animation.c.bhK.XE(), new int[]{0, 255});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofInt(bin… Drawables.ALPHA, 0, 255)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aHK, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…Back, View.ALPHA, 0f, 1f)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aRt, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…load, View.ALPHA, 0f, 1f)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).alH, View.ALPHA, new float[]{0.0f, 1.0f});
                str = "ObjectAnimator.ofFloat(b…itle, View.ALPHA, 0f, 1f)";
                kotlin.jvm.internal.i.e(ofInt, str);
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aRu, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofInt, str);
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aQK, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…view, View.ALPHA, 0f, 1f)");
                arrayList.add(ofInt);
            } else {
                root = k.e(this.this$0).getRoot();
                kotlin.jvm.internal.i.e(root, str);
                ofInt = ObjectAnimator.ofInt(root.getBackground(), com.iqoption.core.graphics.animation.c.bhK.XE(), new int[]{0});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofInt(bin…ound, Drawables.ALPHA, 0)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aHK, View.ALPHA, new float[]{0.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b….btnBack, View.ALPHA, 0f)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aRt, View.ALPHA, new float[]{0.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…Download, View.ALPHA, 0f)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).alH, View.ALPHA, new float[]{0.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…ng.title, View.ALPHA, 0f)");
                arrayList.add(ofInt);
                ofInt = ObjectAnimator.ofFloat(k.e(this.this$0).aRu, View.ALPHA, new float[]{0.0f});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofFloat(b…subtitle, View.ALPHA, 0f)");
                arrayList.add(ofInt);
                ImageView imageView = k.e(this.this$0).aQK;
                r0 = new PropertyValuesHolder[3];
                r0[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
                r0[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{2.0f});
                r0[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{2.0f});
                ofInt = ObjectAnimator.ofPropertyValuesHolder(imageView, r0);
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofPropert…fFloat(View.SCALE_Y, 2f))");
                arrayList.add(ofInt);
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 250);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    private final String Sk() {
        kotlin.d dVar = this.aTf;
        j jVar = anY[1];
        return (String) dVar.getValue();
    }

    private final Picasso getPicasso() {
        kotlin.d dVar = this.aTg;
        j jVar = anY[2];
        return (Picasso) dVar.getValue();
    }

    private final String getUrl() {
        kotlin.d dVar = this.aTe;
        j jVar = anY[0];
        return (String) dVar.getValue();
    }

    public static final /* synthetic */ ae e(k kVar) {
        ae aeVar = kVar.aTh;
        if (aeVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aeVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ae aeVar = (ae) com.iqoption.core.ext.a.a((Fragment) this, h.chat_fragment_image_preview, viewGroup, false, 4, null);
        this.aTh = aeVar;
        aeVar.aHK.setOnClickListener(new d(this));
        aeVar.aRt.setOnClickListener(new e(this));
        TextView textView = aeVar.aRu;
        kotlin.jvm.internal.i.e(textView, "subtitle");
        textView.setText(Sk());
        aeVar.getRoot().setOnTouchListener(new f(aeVar, this));
        View root = aeVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        root.getViewTreeObserver().addOnPreDrawListener(new g(root, aeVar, this));
        return aeVar.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    private final void close() {
        com.iqoption.chat.b.b.ST().k(this);
    }

    private final void Sl() {
        Uri parse = Uri.parse(getUrl());
        DownloadManager bc = com.iqoption.core.ext.a.bc(com.iqoption.core.ext.a.q(this));
        Request request = new Request(parse);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ssid=");
        stringBuilder.append(com.iqoption.core.connect.http.c.baF.UL());
        request = request.addRequestHeader("Cookie", stringBuilder.toString());
        Context context = getContext();
        String str = Environment.DIRECTORY_DOWNLOADS;
        kotlin.jvm.internal.i.e(parse, "uri");
        bc.enqueue(request.setDestinationInExternalFilesDir(context, str, parse.getLastPathSegment()).setNotificationVisibility(1));
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new c(this);
    }

    private final Transition cf(boolean z) {
        return new b(this, z);
    }
}
