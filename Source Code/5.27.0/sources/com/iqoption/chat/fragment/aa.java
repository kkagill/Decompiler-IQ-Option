package com.iqoption.chat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.chat.a.ai;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.m;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001a\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/chat/fragment/SearchRoomFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentSearchRoomBinding;", "isSearchStarted", "", "search", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "searchProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "searchSwitcher", "Lcom/iqoption/chat/tmp/LottieStateSwitcher;", "transition", "Landroidx/transition/TransitionSet;", "viewModel", "Lcom/iqoption/chat/viewmodel/SearchRoomViewModel;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "", "outState", "onViewCreated", "view", "setSearchStarted", "started", "Companion", "chat_release"})
/* compiled from: SearchRoomFragment.kt */
public final class aa extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = aa.class.getName();
    public static final a aVn = new a();
    private final com.iqoption.core.rx.d<String> aVg = com.iqoption.core.rx.d.bER.akd();
    private final io.reactivex.e<String> aVh = this.aVg.i(150, TimeUnit.SECONDS).c(com.iqoption.core.rx.i.aki());
    private ai aVi;
    private com.iqoption.chat.d.a aVj;
    private m aVk;
    private final TransitionSet aVl;
    private boolean aVm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/chat/fragment/SearchRoomFragment$Companion;", "", "()V", "STATE_IS_SEARCHING", "", "STATE_SEARCH_TEXT", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "chat_release"})
    /* compiled from: SearchRoomFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return aa.TAG;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/SearchRoomFragment$onViewCreated$1$1"})
    /* compiled from: SearchRoomFragment.kt */
    static final class b<T> implements Observer<CharSequence> {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ aa aVo;

        b(aa aaVar, Bundle bundle) {
            this.aVo = aaVar;
            this.$savedInstanceState$inlined = bundle;
        }

        /* renamed from: y */
        public final void onChanged(CharSequence charSequence) {
            this.aVo.cg(charSequence != null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/SearchRoomFragment$onViewCreated$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "chat_release"})
    /* compiled from: SearchRoomFragment.kt */
    public static final class c extends g {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ aa aVo;

        c(aa aaVar, Bundle bundle) {
            this.aVo = aaVar;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == com.iqoption.chat.e.g.btnBack) {
                this.aVo.back();
            } else if (id != com.iqoption.chat.e.g.btnSearch) {
            } else {
                if (!this.aVo.aVm) {
                    aa.c(this.aVo).Qr();
                } else if (aa.b(this.aVo).aRC.length() == 0) {
                    aa.c(this.aVo).stopSearch();
                } else {
                    EditText editText = aa.b(this.aVo).aRC;
                    kotlin.jvm.internal.i.e(editText, "binding.searchInput");
                    editText.setText((CharSequence) null);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "com/iqoption/chat/fragment/SearchRoomFragment$onViewCreated$1$2"})
    /* compiled from: SearchRoomFragment.kt */
    static final class d<T> implements io.reactivex.b.f<String> {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ aa aVo;

        d(aa aaVar, Bundle bundle) {
            this.aVo = aaVar;
            this.$savedInstanceState$inlined = bundle;
        }

        /* renamed from: fa */
        public final void accept(String str) {
            if (this.aVo.aVm) {
                m c = aa.c(this.aVo);
                kotlin.jvm.internal.i.e(str, "it");
                c.A(str);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\b¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/SearchRoomFragment$onViewCreated$1$4", "Lcom/iqoption/core/util/TextWatcherAdapter;", "prev", "", "afterTextChanged", "", "s", "Landroid/text/Editable;", "chat_release"})
    /* compiled from: SearchRoomFragment.kt */
    public static final class e extends ah {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ aa aVo;
        private String aVp;

        e(aa aaVar, Bundle bundle) {
            this.aVo = aaVar;
            this.$savedInstanceState$inlined = bundle;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            String str = this.aVp;
            if (str == null || !TextUtils.equals(str, editable.toString())) {
                this.aVo.aVg.onNext(editable.toString());
                this.aVp = editable.toString();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SearchRoomFragment.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f aVq = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public aa() {
        TransitionSet duration = new AutoTransition().setOrdering(0).setDuration(300);
        kotlin.jvm.internal.i.e(duration, "AutoTransition().setOrde…OGETHER).setDuration(300)");
        this.aVl = duration;
    }

    public static final /* synthetic */ ai b(aa aaVar) {
        ai aiVar = aaVar.aVi;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aiVar;
    }

    public static final /* synthetic */ m c(aa aaVar) {
        m mVar = aaVar.aVk;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return mVar;
    }

    private final void cg(boolean z) {
        if (this.aVm != z) {
            this.aVm = z;
            ai aiVar = this.aVi;
            String str = "binding";
            if (aiVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TransitionManager.beginDelayedTransition(aiVar.aRA, this.aVl);
            String str2 = "binding.titleText";
            String str3 = "binding.searchInput";
            ai aiVar2;
            EditText editText;
            TextView textView;
            if (z) {
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = aiVar2.aRC;
                kotlin.jvm.internal.i.e(editText, str3);
                editText.setVisibility(0);
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                aiVar2.aRC.requestFocus();
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = aiVar2.aRD;
                kotlin.jvm.internal.i.e(textView, str2);
                textView.setVisibility(8);
                Context context = getContext();
                aiVar = this.aVi;
                if (aiVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                v.b(context, aiVar.aRC);
            } else {
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = aiVar2.aRC;
                kotlin.jvm.internal.i.e(editText, str3);
                editText.setVisibility(8);
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = aiVar2.aRC;
                kotlin.jvm.internal.i.e(editText, str3);
                editText.setText((CharSequence) null);
                aiVar2 = this.aVi;
                if (aiVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = aiVar2.aRD;
                kotlin.jvm.internal.i.e(textView, str2);
                textView.setVisibility(0);
                v.j(getActivity());
            }
            com.iqoption.chat.d.a aVar = this.aVj;
            str2 = "searchSwitcher";
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            if (!aVar.SY()) {
                aVar = this.aVj;
                if (aVar == null) {
                    kotlin.jvm.internal.i.lG(str2);
                }
                aVar.reset();
            }
            aVar = this.aVj;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            aVar.SX();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ai aiVar = (ai) com.iqoption.core.ext.a.a((Fragment) this, h.chat_fragment_search_room, viewGroup, false, 4, null);
        v.j(getActivity());
        this.aVi = aiVar;
        View root = aiVar.getRoot();
        kotlin.jvm.internal.i.e(root, "inflateBinding<ChatFragm…ing = this\n        }.root");
        return root;
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ai aiVar = this.aVi;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        this.aVk = m.aYM.i(com.iqoption.core.ext.a.r(this));
        m mVar = this.aVk;
        String str = "viewModel";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(mVar.TV(), new b(this, bundle));
        Fragment fragment = this;
        if (!com.iqoption.chat.b.b.ST().j(fragment)) {
            com.iqoption.chat.b.b.ST().a(fragment, w.aVc.SR());
        }
        if (bundle != null) {
            this.aVm = bundle.getBoolean("state.isSearching");
            if (this.aVm) {
                mVar = this.aVk;
                if (mVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                CharSequence charSequence = bundle.getCharSequence("state.searchText");
                if (charSequence == null) {
                    charSequence = "";
                }
                mVar.A(charSequence);
            }
        }
        ImageView imageView = aiVar.aHK;
        kotlin.jvm.internal.i.e(imageView, "btnBack");
        com.iqoption.core.ext.a.d((View) imageView, getResources().getBoolean(com.iqoption.chat.e.b.isPro) ^ 1);
        OnClickListener cVar = new c(this, bundle);
        aiVar.aHK.setOnClickListener(cVar);
        aiVar.aRz.setOnClickListener(cVar);
        LottieAnimationView lottieAnimationView = aiVar.aRz;
        str = "btnSearch";
        kotlin.jvm.internal.i.e(lottieAnimationView, str);
        lottieAnimationView.setSpeed(2.0f);
        LottieAnimationView lottieAnimationView2 = aiVar.aRz;
        kotlin.jvm.internal.i.e(lottieAnimationView2, str);
        this.aVj = new com.iqoption.chat.d.b(lottieAnimationView2, new float[]{0.0f, 0.5f, 1.0f});
        this.aVh.a((io.reactivex.b.f) new d(this, bundle), (io.reactivex.b.f) f.aVq);
        aiVar.aRC.addTextChangedListener(new e(this, bundle));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        String str = "viewModel";
        if (this.aVm) {
            m mVar = this.aVk;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            mVar.stopSearch();
            return true;
        }
        v.j(com.iqoption.core.ext.a.r(this));
        boolean a = super.a(fragmentManager);
        if (!a) {
            m mVar2 = this.aVk;
            if (mVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            mVar2.onClose();
        }
        return a;
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state.isSearching", this.aVm);
        m mVar = this.aVk;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bundle.putCharSequence("state.searchText", (CharSequence) mVar.TV().getValue());
    }
}
