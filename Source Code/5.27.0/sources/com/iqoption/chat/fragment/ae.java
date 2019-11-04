package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.Observer;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.chat.a.k;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.s;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.core.util.v;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Target;
import com.squareup.picasso.Transformation;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0014J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\u0018\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\u0006\u0010(\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006*"}, bng = {"Lcom/iqoption/chat/fragment/UserInfoDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatDialogUserInfoBinding;", "value", "", "countryId", "getCountryId", "()J", "setCountryId", "(J)V", "countryTarget", "Lcom/squareup/picasso/Target;", "userId", "getUserId", "setUserId", "viewModel", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel;", "createTransition", "Landroidx/transition/Transition;", "isEnter", "", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setDrawableLeft", "", "view", "Landroid/widget/TextView;", "drawable", "Landroid/graphics/drawable/Drawable;", "setDrawableRight", "update", "Companion", "chat_release"})
/* compiled from: UserInfoDialog.kt */
public final class ae extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = ae.class.getSimpleName();
    public static final a aVD = new a();
    private s aVA;
    private k aVB;
    private Target aVC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, bng = {"Lcom/iqoption/chat/fragment/UserInfoDialog$Companion;", "", "()V", "ARG_COUNTRY_ID", "", "ARG_USER_ID", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/UserInfoDialog;", "userId", "", "countryId", "chat_release"})
    /* compiled from: UserInfoDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return ae.TAG;
        }

        public final ae m(long j, long j2) {
            ae aeVar = new ae();
            aeVar.setArguments(new Bundle());
            aeVar.az(j);
            aeVar.V(j2);
            return aeVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/UserInfoDialog$onCreateView$1$closeClickListener$1"})
    /* compiled from: UserInfoDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ ae aVE;

        d(ae aeVar) {
            this.aVE = aeVar;
        }

        public final void onClick(View view) {
            com.iqoption.chat.b.b.ST().k(this.aVE);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/UserInfoDialog$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: UserInfoDialog.kt */
    public static final class c implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ ae aVE;

        c(ae aeVar) {
            this.aVE = aeVar;
        }

        public Transition RY() {
            return this.aVE.cf(true);
        }

        public Transition RZ() {
            return this.aVE.cf(true);
        }

        public Transition Sa() {
            return this.aVE.cf(false);
        }

        public Transition Sb() {
            return this.aVE.cf(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/UserInfoViewModel$UserInfo;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/UserInfoDialog$onCreateView$1$3"})
    /* compiled from: UserInfoDialog.kt */
    static final class e<T> implements Observer<com.iqoption.chat.viewmodel.s.b> {
        final /* synthetic */ ae aVE;
        final /* synthetic */ k aVG;
        final /* synthetic */ Drawable aVH;
        final /* synthetic */ Picasso aVI;
        final /* synthetic */ com.iqoption.core.ui.picasso.a aVJ;
        final /* synthetic */ Drawable aVK;
        final /* synthetic */ int aVL;

        e(k kVar, Drawable drawable, Picasso picasso, com.iqoption.core.ui.picasso.a aVar, Drawable drawable2, int i, ae aeVar) {
            this.aVG = kVar;
            this.aVH = drawable;
            this.aVI = picasso;
            this.aVJ = aVar;
            this.aVK = drawable2;
            this.aVL = i;
            this.aVE = aeVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.chat.viewmodel.s.b bVar) {
            if (bVar != null) {
                CharSequence charSequence;
                CharSequence Uh = bVar.Uh();
                int i = 1;
                Object obj = (Uh == null || Uh.length() == 0) ? 1 : null;
                if (obj != null) {
                    this.aVG.aQW.setImageDrawable(this.aVH);
                } else {
                    this.aVI.load(bVar.Uh()).placeholder(this.aVH).resizeDimen(com.iqoption.chat.e.d.dp44, com.iqoption.chat.e.d.dp44).centerCrop().transform((Transformation) this.aVJ).into(this.aVG.aQW);
                }
                TextView textView = this.aVG.aRc;
                kotlin.jvm.internal.i.e(textView, "vipBadge");
                textView.setVisibility(bVar.Em() ? 0 : 8);
                textView = this.aVG.amZ;
                String str = ConditionalUserProperty.NAME;
                kotlin.jvm.internal.i.e(textView, str);
                List b = v.b((CharSequence) bVar.getName(), new String[]{" "}, false, 0, 6, null);
                int size = b.size();
                if (size == 0) {
                    charSequence = "";
                } else if (size != 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String) b.get(0));
                    stringBuilder.append(' ');
                    stringBuilder.append(x.ad((CharSequence) b.get(1)));
                    stringBuilder.append('.');
                    charSequence = stringBuilder.toString();
                } else {
                    charSequence = (CharSequence) b.get(0);
                }
                textView.setText(charSequence);
                Uh = bVar.Uj();
                if (!(Uh == null || Uh.length() == 0)) {
                    i = 0;
                }
                String str2 = "country";
                if (i != 0) {
                    ae aeVar = this.aVE;
                    TextView textView2 = this.aVG.aQY;
                    kotlin.jvm.internal.i.e(textView2, str2);
                    aeVar.setDrawableLeft(textView2, null);
                } else {
                    this.aVI.load(bVar.Uj()).placeholder(this.aVK).resizeDimen(com.iqoption.chat.e.d.dp14, com.iqoption.chat.e.d.dp14).centerCrop().transform((Transformation) this.aVJ).into(ae.b(this.aVE));
                }
                TextView textView3 = this.aVG.aQY;
                kotlin.jvm.internal.i.e(textView3, str2);
                textView3.setText(bVar.getCountry());
                textView = this.aVG.anC;
                kotlin.jvm.internal.i.e(textView, "date");
                textView.setText(new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Long.valueOf(bVar.Ui())));
                ae aeVar2;
                if (bVar.Ey()) {
                    aeVar2 = this.aVE;
                    textView = this.aVG.amZ;
                    kotlin.jvm.internal.i.e(textView, str);
                    aeVar2.setDrawableRight(textView, com.iqoption.core.ext.a.a((Drawable) com.iqoption.core.graphics.a.c.b(com.iqoption.chat.e.d.dp8, 0, 2, null), this.aVL));
                    return;
                }
                aeVar2 = this.aVE;
                textView = this.aVG.amZ;
                kotlin.jvm.internal.i.e(textView, str);
                aeVar2.setDrawableRight(textView, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, bng = {"com/iqoption/chat/fragment/UserInfoDialog$onCreateView$1$1", "Lcom/squareup/picasso/Target;", "onBitmapFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onBitmapLoaded", "bitmap", "Landroid/graphics/Bitmap;", "from", "Lcom/squareup/picasso/Picasso$LoadedFrom;", "onPrepareLoad", "placeHolderDrawable", "chat_release"})
    /* compiled from: UserInfoDialog.kt */
    public static final class f implements Target {
        final /* synthetic */ k aVG;
        final /* synthetic */ WeakReference aVM;

        public void onBitmapFailed(Drawable drawable) {
        }

        f(k kVar, WeakReference weakReference) {
            this.aVG = kVar;
            this.aVM = weakReference;
        }

        public void onPrepareLoad(Drawable drawable) {
            kotlin.jvm.internal.i.f(drawable, "placeHolderDrawable");
            int c = com.iqoption.core.ext.a.c((ViewDataBinding) this.aVG, com.iqoption.chat.e.d.dp14);
            drawable.setBounds(0, 0, c, c);
            k kVar = (k) this.aVM.get();
            TextView textView = this.aVG.aQY;
            kotlin.jvm.internal.i.e(textView, "country");
            com.iqoption.core.ext.a.c(textView, drawable);
        }

        public void onBitmapLoaded(Bitmap bitmap, LoadedFrom loadedFrom) {
            kotlin.jvm.internal.i.f(bitmap, "bitmap");
            kotlin.jvm.internal.i.f(loadedFrom, "from");
            k kVar = (k) this.aVM.get();
            TextView textView = this.aVG.aQY;
            kotlin.jvm.internal.i.e(textView, "country");
            View root = this.aVG.getRoot();
            kotlin.jvm.internal.i.e(root, "root");
            com.iqoption.core.ext.a.a(textView, (Drawable) new BitmapDrawable(root.getResources(), bitmap));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/UserInfoDialog$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: UserInfoDialog.kt */
    public static final class b extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ ae aVE;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/chat/fragment/UserInfoDialog$createTransition$1$createAnimator$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/UserInfoDialog$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/UserInfoDialog$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: UserInfoDialog.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ b aVF;

            a(AnimatorSet animatorSet, b bVar, ViewGroup viewGroup) {
                this.aSC = animatorSet;
                this.aVF = bVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(ae.a(this.aVF.aVE).getRoot());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        b(ae aeVar, boolean z) {
            this.aVE = aeVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(aeVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            String str = "binding.frame";
            String str2 = "binding.root";
            if (this.aSB) {
                com.iqoption.chat.e.a aVar = com.iqoption.chat.e.a.aWr;
                View root = ae.a(this.aVE).getRoot();
                kotlin.jvm.internal.i.e(root, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout = ae.a(this.aVE).aQN;
                kotlin.jvm.internal.i.e(maxSizeCardViewLayout, str);
                arrayList.add(com.iqoption.chat.e.a.a(aVar, root, maxSizeCardViewLayout, 0, 4, null));
            } else {
                viewGroup.getOverlay().add(ae.a(this.aVE).getRoot());
                com.iqoption.chat.e.a aVar2 = com.iqoption.chat.e.a.aWr;
                View root2 = ae.a(this.aVE).getRoot();
                kotlin.jvm.internal.i.e(root2, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout2 = ae.a(this.aVE).aQN;
                kotlin.jvm.internal.i.e(maxSizeCardViewLayout2, str);
                arrayList.add(com.iqoption.chat.e.a.b(aVar2, root2, maxSizeCardViewLayout2, 0, 4, null));
                animatorSet.addListener(new a(animatorSet, this, viewGroup));
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 250);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    public static final /* synthetic */ k a(ae aeVar) {
        k kVar = aeVar.aVB;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar;
    }

    public static final /* synthetic */ Target b(ae aeVar) {
        Target target = aeVar.aVC;
        if (target == null) {
            kotlin.jvm.internal.i.lG("countryTarget");
        }
        return target;
    }

    public final long getUserId() {
        return com.iqoption.core.ext.a.s(this).getLong("arg.userId");
    }

    public final void az(long j) {
        com.iqoption.core.ext.a.s(this).putLong("arg.userId", j);
    }

    public final long El() {
        return com.iqoption.core.ext.a.s(this).getLong("arg.countryId");
    }

    public final void V(long j) {
        com.iqoption.core.ext.a.s(this).putLong("arg.countryId", j);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new c(this);
    }

    private final Transition cf(boolean z) {
        return new b(this, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, h.chat_dialog_user_info, viewGroup, false);
        k kVar = (k) inflate;
        v.j(com.iqoption.core.ext.a.r(this));
        kotlin.jvm.internal.i.e(kVar, "this");
        this.aVB = kVar;
        OnClickListener dVar = new d(this);
        kVar.aHP.setOnClickListener(dVar);
        kVar.aQX.setOnClickListener(dVar);
        Picasso with = Picasso.with(com.iqoption.core.ext.a.q(this));
        com.iqoption.core.ui.picasso.a aVar = new com.iqoption.core.ui.picasso.a();
        k kVar2 = this.aVB;
        if (kVar2 == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        this.aVC = new f(kVar, com.iqoption.core.ext.c.bJ(kVar2));
        ViewDataBinding viewDataBinding = kVar;
        int a = com.iqoption.core.ext.a.a(viewDataBinding, com.iqoption.chat.e.c.green);
        Drawable e = com.iqoption.core.ext.a.e(viewDataBinding, com.iqoption.chat.e.e.chat_dialog_user_info_country_placeholder);
        Drawable e2 = com.iqoption.core.ext.a.e(viewDataBinding, com.iqoption.chat.e.e.chat_message_avatar_placeholder);
        s o = s.aZe.o(this);
        this.aVA = o;
        update();
        o.Ug().observe(this, new e(kVar, e2, with, aVar, e, a, this));
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate<…\n            })\n        }");
        return kVar.getRoot();
    }

    public final void setDrawableLeft(TextView textView, Drawable drawable) {
        kotlin.jvm.internal.i.f(textView, Promotion.ACTION_VIEW);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

    public final void setDrawableRight(TextView textView, Drawable drawable) {
        kotlin.jvm.internal.i.f(textView, Promotion.ACTION_VIEW);
        textView.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
    }

    public final void update() {
        s sVar = this.aVA;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        sVar.o(getUserId(), El());
    }
}
