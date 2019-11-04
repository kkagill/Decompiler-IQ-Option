package com.iqoption.fragment.assets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.text.Editable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;
import com.iqoption.core.util.KeyboardAutoCloser;
import com.iqoption.core.util.KeyboardStateTracker;
import com.iqoption.core.util.v;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.iq;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.assets.model.p;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0014J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020.H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u00063"}, bng = {"Lcom/iqoption/fragment/assets/AssetsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/fragment/assets/adapter/AssetCategoriesAdapter$Callbacks;", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "()V", "binding", "Lcom/iqoption/databinding/FragmentAssetsBinding;", "doAfterAnimation", "Ljava/lang/Runnable;", "isAlertsEnabled", "", "()Z", "isAlertsEnabled$delegate", "Lkotlin/Lazy;", "<set-?>", "isAnimating", "setAnimating", "(Z)V", "isAnimating$delegate", "Lkotlin/properties/ReadWriteProperty;", "offsetX", "", "getOffsetX", "()I", "select", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "getSelect", "()Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "viewModel", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "closeSelf", "", "onCategoryClick", "item", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemAlertClick", "Lcom/iqoption/fragment/assets/model/AssetItem;", "onItemClick", "onItemFavoriteClick", "onItemInfoClick", "Companion", "app_optionXRelease"})
/* compiled from: AssetsFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d implements com.iqoption.fragment.assets.a.b.a, com.iqoption.fragment.assets.b.g {
    public static final String TAG = b.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "isAnimating", "isAnimating()Z")), k.a(new PropertyReference1Impl(k.G(b.class), "isAlertsEnabled", "isAlertsEnabled()Z"))};
    public static final b daQ = new b();
    private HashMap apm;
    private e daL;
    private iq daM;
    private Runnable daN;
    private final kotlin.f.d daO;
    private final kotlin.d daP = g.c(AssetsFragment$isAlertsEnabled$2.daR);

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/assets/AssetsFragment$Companion;", "", "()V", "ARG_OFFSET_X", "", "ARG_SELECT", "TAG", "kotlin.jvm.PlatformType", "newInstance", "Lcom/iqoption/fragment/assets/AssetsFragment;", "offsetX", "", "select", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final b a(int i, AssetCategoryType assetCategoryType) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putInt("arg.offsetX", i);
            if (assetCategoryType != null) {
                bundle.putInt("arg.select", assetCategoryType.ordinal());
            }
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction", "com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$1"})
    /* compiled from: AssetsFragment.kt */
    static final class e implements OnEditorActionListener {
        final /* synthetic */ b daU;
        final /* synthetic */ b this$0;

        e(b bVar, b bVar2) {
            this.this$0 = bVar;
            this.daU = bVar2;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            v.j(this.this$0.getActivity());
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/contentanimators/ContentAnimatorFactory;", "onEnter", "Landroid/animation/Animator;", "content", "Landroid/view/View;", "onExit", "onReenter", "onReturn", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class c implements com.iqoption.core.ui.animation.a.c {
        final /* synthetic */ b this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateTransitionProvider$1$onEnter$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "app_optionXRelease"})
        /* compiled from: AssetsFragment.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ View aiR;
            final /* synthetic */ c daS;

            a(c cVar, View view) {
                this.daS = cVar;
                this.aiR = view;
            }

            public void onAnimationStart(Animator animator) {
                this.daS.this$0.dI(true);
            }

            public void onAnimationEnd(Animator animator) {
                this.daS.this$0.dI(false);
            }
        }

        c(b bVar) {
            this.this$0 = bVar;
        }

        public Animator aq(View view) {
            kotlin.jvm.internal.i.f(view, "content");
            AnimatorSet animatorSet = new AnimatorSet();
            iq iqVar = (iq) com.iqoption.core.ext.a.findBinding(view);
            float b = com.iqoption.core.ext.a.b((ViewDataBinding) iqVar, (int) R.dimen.dp12);
            MaxSizeConstraintLayout maxSizeConstraintLayout = iqVar.cfD;
            String str = "contentAssets";
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout, str);
            b = -b;
            maxSizeConstraintLayout.setTranslationX(b);
            maxSizeConstraintLayout = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout, str);
            maxSizeConstraintLayout.setTranslationY(b);
            MaxSizeConstraintLayout maxSizeConstraintLayout2 = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout2, str);
            maxSizeConstraintLayout2.setAlpha(0.0f);
            maxSizeConstraintLayout2 = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout2, str);
            maxSizeConstraintLayout2.setPivotX(1.0f);
            maxSizeConstraintLayout2 = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout2, str);
            maxSizeConstraintLayout2.setPivotY(1.0f);
            maxSizeConstraintLayout2 = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout2, str);
            maxSizeConstraintLayout2.setScaleX(0.3f);
            maxSizeConstraintLayout2 = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout2, str);
            maxSizeConstraintLayout2.setScaleY(0.3f);
            maxSizeConstraintLayout2 = iqVar.cfD;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[5];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            propertyValuesHolderArr[4] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            animatorSet.play(ObjectAnimator.ofPropertyValuesHolder(maxSizeConstraintLayout2, propertyValuesHolderArr));
            DialogContentLayout dialogContentLayout = iqVar.aoz;
            kotlin.jvm.internal.i.e(dialogContentLayout, "everything");
            dialogContentLayout.setAlpha(0.0f);
            animatorSet.play(ObjectAnimator.ofFloat(iqVar.aoz, View.ALPHA, new float[]{1.0f}));
            animatorSet.addListener(new a(this, view));
            return animatorSet;
        }

        public Animator as(View view) {
            kotlin.jvm.internal.i.f(view, "content");
            AnimatorSet animatorSet = new AnimatorSet();
            iq iqVar = (iq) com.iqoption.core.ext.a.findBinding(view);
            MaxSizeConstraintLayout maxSizeConstraintLayout = iqVar.cfD;
            String str = "contentAssets";
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout, str);
            maxSizeConstraintLayout.setPivotX(1.0f);
            maxSizeConstraintLayout = iqVar.cfD;
            kotlin.jvm.internal.i.e(maxSizeConstraintLayout, str);
            maxSizeConstraintLayout.setPivotY(1.0f);
            float b = com.iqoption.core.ext.a.b((ViewDataBinding) iqVar, (int) R.dimen.dp12);
            MaxSizeConstraintLayout maxSizeConstraintLayout2 = iqVar.cfD;
            r3 = new PropertyValuesHolder[4];
            r3[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{-b});
            r3[2] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.9f});
            r3[3] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.6f});
            animatorSet.play(ObjectAnimator.ofPropertyValuesHolder(maxSizeConstraintLayout2, r3)).with(ObjectAnimator.ofFloat(iqVar.aoz, View.ALPHA, new float[]{0.0f}));
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 300);
            animatorSet.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
            return animator;
        }

        public Animator ar(View view) {
            kotlin.jvm.internal.i.f(view, "content");
            return aq(view);
        }

        public Animator au(View view) {
            kotlin.jvm.internal.i.f(view, "content");
            return as(view);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ iq daT;
        final /* synthetic */ b daU;
        final /* synthetic */ b this$0;

        d(iq iqVar, b bVar, b bVar2) {
            this.daT = iqVar;
            this.this$0 = bVar;
            this.daU = bVar2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == R.id.btnClearSearch) {
                this.daT.cfF.setText("");
            } else if (id == R.id.btnSearch) {
                b.b(this.this$0).axe();
            } else if (id == R.id.everything) {
                this.this$0.aAl();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$2", "Lcom/iqoption/view/text/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class f extends com.iqoption.view.text.j {
        final /* synthetic */ b daU;
        final /* synthetic */ b this$0;

        f(b bVar, b bVar2) {
            this.this$0 = bVar;
            this.daU = bVar2;
        }

        public void afterTextChanged(Editable editable) {
            b.b(this.this$0).A(editable);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\b¸\u0006\u0000"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$4", "Landroidx/lifecycle/Observer;", "", "isFirstCall", "onChanged", "", "isShown", "(Ljava/lang/Boolean;)V", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class g implements Observer<Boolean> {
        final /* synthetic */ iq daT;
        final /* synthetic */ b daU;
        private boolean daV = true;
        final /* synthetic */ b this$0;

        g(iq iqVar, b bVar, b bVar2) {
            this.daT = iqVar;
            this.this$0 = bVar;
            this.daU = bVar2;
        }

        /* renamed from: f */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (this.daV) {
                    this.daV = false;
                } else {
                    TransitionManager.beginDelayedTransition(this.daT.cfD);
                }
                String str = "btnSearch";
                String str2 = "btnClearSearch";
                String str3 = "searchField";
                String str4 = "sortSettingsContainer";
                FrameLayout frameLayout;
                EditText editText;
                ImageView imageView;
                if (bool.booleanValue()) {
                    frameLayout = this.daT.cfG;
                    kotlin.jvm.internal.i.e(frameLayout, str4);
                    com.iqoption.core.ext.a.al(frameLayout);
                    editText = this.daT.cfF;
                    kotlin.jvm.internal.i.e(editText, str3);
                    com.iqoption.core.ext.a.ak(editText);
                    imageView = this.daT.cfz;
                    kotlin.jvm.internal.i.e(imageView, str2);
                    com.iqoption.core.ext.a.ak(imageView);
                    imageView = this.daT.cfA;
                    kotlin.jvm.internal.i.e(imageView, str);
                    imageView.setSelected(true);
                    this.daT.cfF.requestFocus();
                    v.ad(this.daT.cfF);
                    return;
                }
                frameLayout = this.daT.cfG;
                kotlin.jvm.internal.i.e(frameLayout, str4);
                com.iqoption.core.ext.a.ak(frameLayout);
                editText = this.daT.cfF;
                kotlin.jvm.internal.i.e(editText, str3);
                com.iqoption.core.ext.a.al(editText);
                imageView = this.daT.cfz;
                kotlin.jvm.internal.i.e(imageView, str2);
                com.iqoption.core.ext.a.al(imageView);
                imageView = this.daT.cfA;
                kotlin.jvm.internal.i.e(imageView, str);
                imageView.setSelected(false);
                v.j(this.this$0.getActivity());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Ó\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010%\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010'\u001a\u00020!H\u0002J\u000f\u0010(\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0003H\u0016J \u0010/\u001a\u00020+2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0016J\u0010\u00104\u001a\u00020.2\u0006\u0010'\u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000¨\u00065¸\u0006\u0000"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$5", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroidx/lifecycle/Observer;", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "boDelegate", "Lcom/iqoption/fragment/assets/BoHeaderDelegate;", "getBoDelegate", "()Lcom/iqoption/fragment/assets/BoHeaderDelegate;", "boDelegate$delegate", "Lkotlin/Lazy;", "cfdDelegate", "Lcom/iqoption/fragment/assets/CfdHeaderBinding;", "getCfdDelegate", "()Lcom/iqoption/fragment/assets/CfdHeaderBinding;", "cfdDelegate$delegate", "doDelegate", "Lcom/iqoption/fragment/assets/DoHeaderDelegate;", "getDoDelegate", "()Lcom/iqoption/fragment/assets/DoHeaderDelegate;", "doDelegate$delegate", "endPadding", "", "getEndPadding", "()I", "endPadding$delegate", "fxDelegate", "Lcom/iqoption/fragment/assets/FxHeaderDelegate;", "getFxDelegate", "()Lcom/iqoption/fragment/assets/FxHeaderDelegate;", "fxDelegate$delegate", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "prevSorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "scrollOffset", "transition", "Landroidx/transition/TransitionSet;", "getDelegate", "Lcom/iqoption/fragment/assets/HeaderDelegate;", "sorting", "getTopMostPosition", "()Ljava/lang/Integer;", "onChanged", "", "info", "scheduleLayoutAnimation", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "setSortingState", "app_optionXRelease"})
    /* compiled from: AssetsFragment.kt */
    public static final class h extends OnScrollListener implements Observer<com.iqoption.fragment.assets.model.f> {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "endPadding", "getEndPadding()I")), k.a(new PropertyReference1Impl(k.G(h.class), "boDelegate", "getBoDelegate()Lcom/iqoption/fragment/assets/BoHeaderDelegate;")), k.a(new PropertyReference1Impl(k.G(h.class), "doDelegate", "getDoDelegate()Lcom/iqoption/fragment/assets/DoHeaderDelegate;")), k.a(new PropertyReference1Impl(k.G(h.class), "fxDelegate", "getFxDelegate()Lcom/iqoption/fragment/assets/FxHeaderDelegate;")), k.a(new PropertyReference1Impl(k.G(h.class), "cfdDelegate", "getCfdDelegate()Lcom/iqoption/fragment/assets/CfdHeaderBinding;"))};
        private final TransitionSet aVl;
        private final LinearLayoutManager apt;
        final /* synthetic */ iq daT;
        final /* synthetic */ b daU;
        private final kotlin.d daW = g.c(new AssetsFragment$onCreateView$$inlined$apply$lambda$5$1(this));
        private final kotlin.d daX = g.c(new AssetsFragment$onCreateView$$inlined$apply$lambda$5$2(this));
        private final kotlin.d daY = g.c(new AssetsFragment$onCreateView$$inlined$apply$lambda$5$3(this));
        private final kotlin.d daZ = g.c(new AssetsFragment$onCreateView$$inlined$apply$lambda$5$4(this));
        private final kotlin.d dba = g.c(new AssetsFragment$onCreateView$$inlined$apply$lambda$5$5(this));
        private p dbb;
        private int dbc;
        final /* synthetic */ com.iqoption.fragment.assets.a.c dbd;
        final /* synthetic */ b this$0;

        private final g aAm() {
            kotlin.d dVar = this.daX;
            j jVar = anY[1];
            return (g) dVar.getValue();
        }

        private final j aAn() {
            kotlin.d dVar = this.daY;
            j jVar = anY[2];
            return (j) dVar.getValue();
        }

        private final l aAo() {
            kotlin.d dVar = this.daZ;
            j jVar = anY[3];
            return (l) dVar.getValue();
        }

        private final h aAp() {
            kotlin.d dVar = this.dba;
            j jVar = anY[4];
            return (h) dVar.getValue();
        }

        private final int getEndPadding() {
            kotlin.d dVar = this.daW;
            j jVar = anY[0];
            return ((Number) dVar.getValue()).intValue();
        }

        h(iq iqVar, com.iqoption.fragment.assets.a.c cVar, b bVar, b bVar2) {
            this.daT = iqVar;
            this.dbd = cVar;
            this.this$0 = bVar;
            this.daU = bVar2;
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2));
            transitionSet.addTransition(new Fade(1));
            Property[] propertyArr = new Property[1];
            Property property = View.ROTATION;
            kotlin.jvm.internal.i.e(property, "View.ROTATION");
            propertyArr[0] = property;
            transitionSet.addTransition(new com.iqoption.core.ui.animation.transitions.d(propertyArr));
            transitionSet.setOrdering(0);
            this.aVl = transitionSet;
            RecyclerView recyclerView = this.daT.cfy;
            kotlin.jvm.internal.i.e(recyclerView, "assetsList");
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                this.apt = (LinearLayoutManager) layoutManager;
                this.daT.cfy.addOnScrollListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        private final n<?> c(p pVar) {
            int i = c.aob[pVar.aBu().ordinal()];
            if (i == 1) {
                return aAm();
            }
            if (i == 2 || i == 3) {
                return aAn();
            }
            if (i != 4) {
                return aAp();
            }
            return aAo();
        }

        private final boolean d(p pVar) {
            boolean z = false;
            if (kotlin.jvm.internal.i.y(this.dbb, pVar)) {
                return false;
            }
            p pVar2 = this.dbb;
            this.dbb = pVar;
            if (pVar2 != null) {
                TransitionManager.beginDelayedTransition(this.daT.cfG, this.aVl);
            }
            Object c = pVar2 != null ? c(pVar2) : null;
            n c2 = c(pVar);
            if ((kotlin.jvm.internal.i.y(c, c2) ^ 1) != 0) {
                this.daT.cfG.removeAllViews();
                c = c2.getBinding().getRoot();
                kotlin.jvm.internal.i.e(c, "it");
                if (c.getParent() == null) {
                    z = true;
                }
                if (!z) {
                    c = null;
                }
                if (c == null) {
                    c = c2.aAC().getRoot();
                }
                kotlin.jvm.internal.i.e(c, "newDelegate.binding.root…gate.createBinding().root");
                this.daT.cfG.addView(c);
            }
            c2.e(pVar);
            return true;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            this.dbc += i2;
        }

        /* renamed from: a */
        public void onChanged(final com.iqoption.fragment.assets.model.f fVar) {
            if (fVar == null) {
                return;
            }
            if (this.this$0.isAnimating()) {
                this.this$0.daN = new Runnable(this) {
                    final /* synthetic */ h this$0;

                    public final void run() {
                        this.this$0.a(fVar, true);
                    }
                };
            } else {
                a(fVar, false);
            }
        }

        private final void a(com.iqoption.fragment.assets.model.f fVar, boolean z) {
            Integer aAq = aAq();
            boolean z2 = d(fVar.aAS().aAQ()) || this.dbc == 0;
            this.dbd.a(fVar.getItems(), (m) new AssetsFragment$onCreateView$$inlined$apply$lambda$5$7(this, aAq, z2, z));
        }

        private final Integer aAq() {
            View findChildViewUnder = this.daT.cfy.findChildViewUnder(0.0f, 0.0f);
            if (findChildViewUnder == null) {
                return null;
            }
            ViewHolder findContainingViewHolder = this.daT.cfy.findContainingViewHolder(findChildViewUnder);
            if (findContainingViewHolder != null) {
                return Integer.valueOf(findContainingViewHolder.getAdapterPosition());
            }
            return null;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AssetsFragment.kt */
    static final class i<T> implements Observer<List<? extends com.iqoption.fragment.assets.model.e>> {
        final /* synthetic */ com.iqoption.fragment.assets.a.b dbf;

        i(com.iqoption.fragment.assets.a.b bVar) {
            this.dbf = bVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.fragment.assets.model.e> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.dbf, list, null, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, bng = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"})
    /* compiled from: Delegates.kt */
    public static final class a extends kotlin.f.c<Boolean> {
        final /* synthetic */ Object app;
        final /* synthetic */ b this$0;

        public a(Object obj, Object obj2, b bVar) {
            this.app = obj;
            this.this$0 = bVar;
            super(obj2);
        }

        /* Access modifiers changed, original: protected */
        public void a(j<?> jVar, Boolean bool, Boolean bool2) {
            kotlin.jvm.internal.i.f(jVar, "property");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() != booleanValue && !booleanValue && this.this$0.getContext() != null) {
                Runnable d = this.this$0.daN;
                if (d != null) {
                    d.run();
                }
            }
        }
    }

    public static final b a(int i, AssetCategoryType assetCategoryType) {
        return daQ.a(i, assetCategoryType);
    }

    private final void dI(boolean z) {
        this.daO.a(this, anY[0], Boolean.valueOf(z));
    }

    private final boolean isAnimating() {
        return ((Boolean) this.daO.b(this, anY[0])).booleanValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean aAk() {
        kotlin.d dVar = this.daP;
        j jVar = anY[1];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public b() {
        kotlin.f.a aVar = kotlin.f.a.eWg;
        Boolean valueOf = Boolean.valueOf(false);
        this.daO = new a(valueOf, valueOf, this);
    }

    private final int aAi() {
        return com.iqoption.core.ext.a.s(this).getInt("arg.offsetX");
    }

    private final AssetCategoryType aAj() {
        Bundle s = com.iqoption.core.ext.a.s(this);
        String str = "arg.select";
        if (!s.containsKey(str)) {
            s = null;
        }
        if (s == null) {
            return null;
        }
        int i = s.getInt(str);
        for (Enum enumR : AssetCategoryType.values()) {
            if ((enumR.ordinal() == i ? 1 : null) != null) {
                return enumR;
            }
        }
        return null;
    }

    public void b(com.iqoption.fragment.assets.model.e eVar) {
        kotlin.jvm.internal.i.f(eVar, "item");
        e eVar2 = this.daL;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar2.b(eVar);
    }

    public void a(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        e eVar = this.daL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.e(kVar);
        aAl();
    }

    public void b(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        e eVar = this.daL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.h(kVar);
    }

    public void c(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        e eVar = this.daL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.f(kVar);
        aAl();
    }

    public void d(com.iqoption.fragment.assets.model.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        e eVar = this.daL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.g(kVar);
        aAl();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.daM = (iq) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.fragment_assets, viewGroup, false, 4, null);
        this.daL = e.dbs.a(this, aAj());
        d o = d.dbk.o(com.iqoption.core.ext.a.r(this));
        e eVar = this.daL;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.b(o);
        b bVar = this;
        iq iqVar = this.daM;
        String str2 = "binding";
        if (iqVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        DialogContentLayout dialogContentLayout = iqVar.aoz;
        kotlin.jvm.internal.i.e(dialogContentLayout, "everything");
        dialogContentLayout.setAnchorX(aAi());
        OnClickListener dVar = new d(iqVar, this, bVar);
        iqVar.aoz.setOnClickListener(dVar);
        iqVar.cfA.setOnClickListener(dVar);
        iqVar.cfz.setOnClickListener(dVar);
        com.iqoption.fragment.assets.a.b bVar2 = new com.iqoption.fragment.assets.a.b(bVar);
        RecyclerView recyclerView = iqVar.cfB;
        String str3 = "categoriesList";
        kotlin.jvm.internal.i.e(recyclerView, str3);
        recyclerView.setAdapter(bVar2);
        iqVar.cfB.setHasFixedSize(true);
        recyclerView = iqVar.cfB;
        kotlin.jvm.internal.i.e(recyclerView, str3);
        com.iqoption.core.ext.a.b(recyclerView);
        iqVar.cfF.setOnEditorActionListener(new e(this, bVar));
        iqVar.cfF.addTextChangedListener(new f(this, bVar));
        ViewDataBinding viewDataBinding = iqVar;
        com.iqoption.fragment.assets.a.c cVar = new com.iqoption.fragment.assets.a.c(com.iqoption.core.ext.a.a(viewDataBinding, (int) R.color.green), com.iqoption.core.ext.a.a(viewDataBinding, (int) R.color.red), com.iqoption.core.ext.a.a(viewDataBinding, (int) R.color.white), bVar);
        RecyclerView recyclerView2 = iqVar.cfy;
        String str4 = "assetsList";
        kotlin.jvm.internal.i.e(recyclerView2, str4);
        recyclerView2.setAdapter(cVar);
        iqVar.cfy.setHasFixedSize(true);
        recyclerView2 = iqVar.cfy;
        kotlin.jvm.internal.i.e(recyclerView2, str4);
        com.iqoption.core.ext.a.b(recyclerView2);
        e eVar2 = this.daL;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(eVar2.Qe(), new i(bVar2));
        e eVar3 = this.daL;
        if (eVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(eVar3.aAz(), new g(iqVar, this, bVar));
        eVar3 = this.daL;
        if (eVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(eVar3.aAy(), new h(iqVar, cVar, this, bVar));
        getLifecycle().addObserver(new KeyboardAutoCloser(getActivity()));
        getLifecycle().addObserver(new KeyboardStateTracker(new AssetsFragment$onCreateView$2(this)));
        getLifecycle().addObserver(new AssetsFragment$onCreateView$3(o));
        Lifecycle lifecycle = getLifecycle();
        Builder Builder = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "change-asset");
        kotlin.jvm.internal.i.e(Builder, "Event.Builder(Event.CATE…N_OPENED, \"change-asset\")");
        lifecycle.addObserver(new EventSenderLifecycleObserver(Builder, null, 2, null));
        iq iqVar2 = this.daM;
        if (iqVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        return iqVar2.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new com.iqoption.core.ui.animation.transitions.c(this, new c(this), false, null, 12, null);
    }

    private final void aAl() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
