package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.e.h;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.core.util.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u001e\u001f B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/chat/fragment/MessageOptionsDialog;", "T", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "argument", "Ljava/lang/Object;", "binding", "Lcom/iqoption/chat/databinding/ChatDialogMessageOptionsBinding;", "interactionListener", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;", "options", "", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$Option;", "createTransition", "Landroidx/transition/Transition;", "isEnter", "", "onClose", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "InteractionListener", "Option", "chat_release"})
/* compiled from: MessageOptionsDialog.kt */
public final class n<T> extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = n.class.getSimpleName();
    public static final a aTX = new a();
    private T aTT;
    private List<c> aTU;
    private b<? super T> aTV;
    private com.iqoption.chat.a.i aTW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0010¢\u0006\u0002\u0010\u0011R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/fragment/MessageOptionsDialog$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/chat/fragment/MessageOptionsDialog;", "T", "arg", "opts", "", "Lkotlin/Pair;", "interactor", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;", "(Ljava/lang/Object;Ljava/util/List;Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;)Lcom/iqoption/chat/fragment/MessageOptionsDialog;", "chat_release"})
    /* compiled from: MessageOptionsDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return n.TAG;
        }

        public final <T> n<T> a(T t, List<Pair<String, String>> list, b<? super T> bVar) {
            kotlin.jvm.internal.i.f(list, "opts");
            kotlin.jvm.internal.i.f(bVar, "interactor");
            n nVar = new n();
            nVar.aTT = t;
            Iterable<Pair> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (Pair pair : iterable) {
                arrayList.add(new c((String) pair.getFirst(), (String) pair.bni()));
            }
            nVar.aTU = (List) arrayList;
            nVar.aTV = bVar;
            return nVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;", "T", "", "onOptionClick", "", "name", "", "label", "arg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "chat_release"})
    /* compiled from: MessageOptionsDialog.kt */
    public interface b<T> {
        void a(String str, String str2, T t);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/fragment/MessageOptionsDialog$Option;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "label", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getName", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "chat_release"})
    /* compiled from: MessageOptionsDialog.kt */
    public static final class c implements Parcelable {
        public static final a CREATOR = new a();
        private final String label;
        private final String name;

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/chat/fragment/MessageOptionsDialog$Option$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$Option;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/iqoption/chat/fragment/MessageOptionsDialog$Option;", "chat_release"})
        /* compiled from: MessageOptionsDialog.kt */
        public static final class a implements Creator<c> {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            /* renamed from: W */
            public c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "parcel");
                return new c(parcel);
            }

            /* renamed from: eB */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public c(String str, String str2) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CALL_TO_ACTION_LABEL);
            this.name = str;
            this.label = str2;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getName() {
            return this.name;
        }

        public c(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            this(readString, readString2);
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "dest");
            parcel.writeString(this.name);
            parcel.writeString(this.label);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/MessageOptionsDialog$onCreateView$1$1"})
    /* compiled from: MessageOptionsDialog.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ Object $arg$inlined;
        final /* synthetic */ LayoutInflater $inflater$inlined;
        final /* synthetic */ List $opts$inlined;
        final /* synthetic */ n this$0;

        f(n nVar, Object obj, List list, LayoutInflater layoutInflater) {
            this.this$0 = nVar;
            this.$arg$inlined = obj;
            this.$opts$inlined = list;
            this.$inflater$inlined = layoutInflater;
        }

        public final void onClick(View view) {
            this.this$0.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/MessageOptionsDialog$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: MessageOptionsDialog.kt */
    public static final class e implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ n this$0;

        e(n nVar) {
            this.this$0 = nVar;
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

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/MessageOptionsDialog$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: MessageOptionsDialog.kt */
    public static final class d extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ n this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/chat/fragment/MessageOptionsDialog$createTransition$1$createAnimator$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/MessageOptionsDialog$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/MessageOptionsDialog$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: MessageOptionsDialog.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ d aTY;

            a(AnimatorSet animatorSet, d dVar, ViewGroup viewGroup) {
                this.aSC = animatorSet;
                this.aTY = dVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(n.a(this.aTY.this$0).getRoot());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        d(n nVar, boolean z) {
            this.this$0 = nVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(nVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            String str = "binding.frame";
            String str2 = "binding.root";
            if (this.aSB) {
                com.iqoption.chat.e.a aVar = com.iqoption.chat.e.a.aWr;
                View root = n.a(this.this$0).getRoot();
                kotlin.jvm.internal.i.e(root, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout = n.a(this.this$0).aQN;
                kotlin.jvm.internal.i.e(maxSizeCardViewLayout, str);
                arrayList.add(com.iqoption.chat.e.a.a(aVar, root, maxSizeCardViewLayout, 0, 4, null));
            } else {
                viewGroup.getOverlay().add(n.a(this.this$0).getRoot());
                com.iqoption.chat.e.a aVar2 = com.iqoption.chat.e.a.aWr;
                View root2 = n.a(this.this$0).getRoot();
                kotlin.jvm.internal.i.e(root2, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout2 = n.a(this.this$0).aQN;
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

    public static final /* synthetic */ com.iqoption.chat.a.i a(n nVar) {
        com.iqoption.chat.a.i iVar = nVar.aTW;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new e(this);
    }

    private final Transition cf(boolean z) {
        return new d(this, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        Object obj = this.aTT;
        if (obj == null) {
            onClose();
            return null;
        }
        List<c> list = this.aTU;
        if (list == null) {
            onClose();
            return null;
        } else if (this.aTV == null) {
            onClose();
            return null;
        } else {
            com.iqoption.chat.a.i iVar = (com.iqoption.chat.a.i) com.iqoption.core.ext.a.a((Fragment) this, h.chat_dialog_message_options, viewGroup, false, 4, null);
            v.j(getActivity());
            this.aTW = iVar;
            iVar.aHP.setOnClickListener(new f(this, obj, list, layoutInflater));
            kotlin.jvm.a.b messageOptionsDialog$onCreateView$$inlined$apply$lambda$2 = new MessageOptionsDialog$onCreateView$$inlined$apply$lambda$2(this, obj, list, layoutInflater);
            for (c cVar : list) {
                View inflate = layoutInflater.inflate(h.chat_dialog_message_option_item, iVar.aQV, false);
                if (inflate != null) {
                    TextView textView = (TextView) inflate;
                    textView.setTag(cVar.getName());
                    textView.setText(cVar.getLabel());
                    textView.setOnClickListener(new o(messageOptionsDialog$onCreateView$$inlined$apply$lambda$2));
                    iVar.aQV.addView(textView);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            com.iqoption.chat.a.i iVar2 = this.aTW;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            return iVar2.getRoot();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    private final boolean onClose() {
        com.iqoption.chat.b.b.ST().k(this);
        return true;
    }
}
