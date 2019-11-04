package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.cm;
import com.iqoption.chat.component.ac;
import com.iqoption.chat.component.aw;
import com.iqoption.chat.component.y;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.util.SoftInputModeSubstitute;
import com.iqoption.core.util.SystemUiSubstitude;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.ai;
import com.iqoption.dto.ToastEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0006\u0010/\u001a\u00020)J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u000202H\u0014J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020)H\u0016J-\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040@2\u0006\u0010A\u001a\u00020BH\u0016¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020:H\u0016J\u001a\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u0002042\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010H\u001a\u00020)H\u0002J\b\u0010I\u001a\u00020)H\u0002J)\u0010J\u001a\u00020\u001e*\u00020\u00042\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040@2\u0006\u0010A\u001a\u00020BH\u0002¢\u0006\u0002\u0010KR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000¨\u0006M"}, bng = {"Lcom/iqoption/chat/fragment/RoomFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "_roomId", "", "_roomType", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "adapter", "Lcom/iqoption/chat/component/MessagesAdapter;", "binding", "Lcom/iqoption/chat/databinding/FragmentRoomBinding;", "delegateContext", "Lcom/iqoption/chat/fragment/DelegateContext;", "interactionViewModel", "Lcom/iqoption/chat/viewmodel/InteractionViewModel;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "rateSupportLastHandledTime", "", "readMessageCommand", "Lcom/iqoption/core/util/DelayedCommand;", "resourcer", "Lcom/iqoption/chat/Resourcer;", "roomId", "getRoomId", "()Ljava/lang/String;", "roomType", "getRoomType", "()Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "scrollToFirst", "", "sendLayoutDelegate", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "topBarDelegate", "Lcom/iqoption/chat/fragment/RoomTopBarDelegate;", "viewModel", "Lcom/iqoption/chat/viewmodel/RoomViewModel;", "createTransition", "Landroidx/transition/Transition;", "isEnter", "onAttach", "", "context", "Landroid/content/Context;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onClose", "onCloseChat", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "onViewCreated", "view", "pickAttachments", "scrollToEnd", "isGranted", "(Ljava/lang/String;[Ljava/lang/String;[I)Z", "Companion", "chat_release"})
/* compiled from: RoomFragment.kt */
public final class v extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a aUR = new a();
    private ac aTS;
    private String aUG;
    private ChatRoomType aUH;
    private com.iqoption.chat.f aUI;
    private com.iqoption.chat.viewmodel.k aUJ;
    private com.iqoption.chat.viewmodel.h aUK;
    private cm aUL;
    private x aUM;
    private s aUN;
    private boolean aUO;
    private final com.iqoption.core.util.k aUP = new com.iqoption.core.util.k(new p(this));
    private long aUQ;
    private g aUp;
    private LinearLayoutManager apt;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, bng = {"Lcom/iqoption/chat/fragment/RoomFragment$Companion;", "", "()V", "ARG_CHAT_ROOM_ID", "", "ARG_CHAT_ROOM_TYPE", "KEY_RATE_SUPPORT_LAST_HANDLED_TIME", "KEY_SEND_LAYOUT_DELEGATE", "OPTION_COPY", "OPTION_DOWNLOAD", "OPTION_REPLY", "OPTION_REPLY_WITH_TEXT", "REQUEST_PERMISSION_ATTACHMENTS", "", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/RoomFragment;", "roomId", "type", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return v.TAG;
        }

        public final v a(String str, ChatRoomType chatRoomType) {
            v vVar = new v();
            Bundle bundle = new Bundle();
            String str2 = "arg.chatRoomType";
            if (str == null || chatRoomType == null) {
                bundle.putString(str2, ChatRoomType.SUPPORT.name());
            } else {
                bundle.putString("arg.chatRoomId", str);
                bundle.putString(str2, chatRoomType.name());
            }
            vVar.setArguments(bundle);
            return vVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$9$1"})
    /* compiled from: RoomFragment.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ v this$0;

        f(v vVar, FragmentActivity fragmentActivity) {
            this.this$0 = vVar;
            this.$activity$inlined = fragmentActivity;
        }

        public final void onClick(View view) {
            this.$activity$inlined.onBackPressed();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/RoomFragment$onViewCreated$9$2"})
    /* compiled from: RoomFragment.kt */
    static final class g implements OnClickListener {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ v this$0;

        g(v vVar, FragmentActivity fragmentActivity) {
            this.this$0 = vVar;
            this.$activity$inlined = fragmentActivity;
        }

        public final void onClick(View view) {
            this.this$0.SM();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$9$BadgeController", "", "badge", "Landroid/view/View;", "(Landroid/view/View;)V", "getBadge", "()Landroid/view/View;", "handler", "Landroid/os/Handler;", "hideCommand", "Ljava/lang/Runnable;", "shown", "", "hide", "", "show", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class o {
        private final Runnable aUY = new a(this);
        private final View aUZ;
        private boolean ajO;
        private final Handler handler = new Handler();

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: RoomFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ o aVa;

            a(o oVar) {
                this.aVa = oVar;
            }

            public final void run() {
                this.aVa.SQ().animate().alpha(0.0f).setDuration(100).start();
            }
        }

        public o(View view) {
            kotlin.jvm.internal.i.f(view, "badge");
            this.aUZ = view;
            this.ajO = this.aUZ.getAlpha() == 1.0f;
        }

        public final View SQ() {
            return this.aUZ;
        }

        public final void show() {
            if (!this.ajO) {
                this.ajO = true;
                this.aUZ.animate().alpha(1.0f).setDuration(100).start();
                this.handler.removeCallbacks(this.aUY);
            }
        }

        public final void hide() {
            if (this.ajO) {
                this.ajO = false;
                this.handler.removeCallbacks(this.aUY);
                this.handler.postDelayed(this.aUY, 500);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: RoomFragment.kt */
    static final class p implements Runnable {
        final /* synthetic */ v this$0;

        p(v vVar) {
            this.this$0 = vVar;
        }

        public final void run() {
            v.b(this.this$0).TM();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class d implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ v this$0;

        d(v vVar) {
            this.this$0 = vVar;
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

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$messageInteractor$1", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "onOptionClick", "", "name", "", "label", "arg", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class e implements com.iqoption.chat.fragment.n.b<com.iqoption.core.microservices.chat.response.e> {
        final /* synthetic */ ac $this_apply;
        final /* synthetic */ v this$0;

        e(ac acVar, v vVar) {
            this.$this_apply = acVar;
            this.this$0 = vVar;
        }

        public void a(String str, String str2, com.iqoption.core.microservices.chat.response.e eVar) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CALL_TO_ACTION_LABEL);
            kotlin.jvm.internal.i.f(eVar, "arg");
            int hashCode = str.hashCode();
            s d;
            if (hashCode != -461908380) {
                if (hashCode != -404201138) {
                    if (hashCode == 368221233 && str.equals("option.reply")) {
                        d = this.this$0.aUN;
                        if (d != null) {
                            d.a(eVar, false);
                        }
                    }
                } else if (str.equals("option.copy")) {
                    if (ag.au("Message", eVar.getText())) {
                        com.iqoption.core.d.z(this.$this_apply.getString(com.iqoption.chat.e.j.message_copied, new Object[0]), 0);
                    }
                }
            } else if (str.equals("option.replyWithText")) {
                d = this.this$0.aUN;
                if (d != null) {
                    d.a(eVar, true);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$9$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class h extends OnScrollListener {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ v this$0;

        h(v vVar, FragmentActivity fragmentActivity) {
            this.this$0 = vVar;
            this.$activity$inlined = fragmentActivity;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            v vVar = this.this$0;
            vVar.aUO = v.m(vVar).findFirstVisibleItemPosition() == 0;
            if (v.h(this.this$0).getItemCount() > 0 && v.b(this.this$0).TH()) {
                View findChildViewUnder = recyclerView.findChildViewUnder(0.0f, 0.0f);
                if (findChildViewUnder != null) {
                    if ((v.h(this.this$0).getItemCount() - 1) - recyclerView.getChildAdapterPosition(findChildViewUnder) <= 5) {
                        v.b(this.this$0).TN();
                    }
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\u000b¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$attachmentInteractor$1", "Lcom/iqoption/chat/fragment/MessageOptionsDialog$InteractionListener;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "onOptionClick", "", "name", "", "label", "arg", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class i implements com.iqoption.chat.fragment.n.b<Pair<? extends com.iqoption.core.microservices.chat.response.e, ? extends com.iqoption.core.microservices.chat.response.a>> {
        final /* synthetic */ ac $this_apply;
        final /* synthetic */ v this$0;

        i(ac acVar, v vVar) {
            this.$this_apply = acVar;
            this.this$0 = vVar;
        }

        public void a(String str, String str2, Pair<com.iqoption.core.microservices.chat.response.e, com.iqoption.core.microservices.chat.response.a> pair) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CALL_TO_ACTION_LABEL);
            kotlin.jvm.internal.i.f(pair, "arg");
            int hashCode = str.hashCode();
            if (hashCode != -2105154079) {
                if (hashCode == 368221233 && str.equals("option.reply")) {
                    s d = this.this$0.aUN;
                    if (d != null) {
                        d.a((com.iqoption.core.microservices.chat.response.e) pair.getFirst(), false);
                    }
                }
            } else if (str.equals("option.download")) {
                Object systemService = this.$this_apply.getContext().getSystemService("download");
                if (systemService != null) {
                    DownloadManager downloadManager = (DownloadManager) systemService;
                    Uri parse = Uri.parse(com.iqoption.core.d.EE().fA(((com.iqoption.core.microservices.chat.response.a) pair.bni()).getPath()));
                    Request request = new Request(parse);
                    request.setNotificationVisibility(1);
                    Context context = this.$this_apply.getContext();
                    String str3 = Environment.DIRECTORY_DOWNLOADS;
                    kotlin.jvm.internal.i.e(parse, "uri");
                    request.setDestinationInExternalFilesDir(context, str3, parse.getLastPathSegment());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ssid=");
                    stringBuilder.append(com.iqoption.core.connect.http.c.baF.UL());
                    request.addRequestHeader("Cookie", stringBuilder.toString());
                    downloadManager.enqueue(request);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$8$4", "Lcom/iqoption/chat/component/MessagesAdapter$RatingChangeListener;", "onRatingChanged", "", "rating", "", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class j implements com.iqoption.chat.component.ac.b {
        final /* synthetic */ v this$0;

        j(v vVar) {
            this.this$0 = vVar;
        }

        public void a(int i, com.iqoption.core.microservices.chat.response.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "message");
            Object obj = eVar.abV().acs() > 0 ? 1 : null;
            if (obj != null && i == 0) {
                v.h(this.this$0).eW(eVar.getId());
            } else if (obj != null || i == 5) {
                com.iqoption.chat.viewmodel.k.a(v.b(this.this$0), eVar.getId(), i, null, 4, null);
            } else {
                com.iqoption.chat.b.b.ST().a((Fragment) this.this$0, i.aSV.a(i, new RoomFragment$onViewCreated$$inlined$apply$lambda$6$1(this, eVar, i), new RoomFragment$onViewCreated$$inlined$apply$lambda$6$2(this, eVar)));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "chatState", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RoomFragment.kt */
    static final class k<T> implements Observer<com.iqoption.core.microservices.chat.response.l> {
        final /* synthetic */ Bundle aUT;
        final /* synthetic */ v this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release"})
        /* compiled from: AndroidExtensions.kt */
        public static final class a implements OnPreDrawListener {
            final /* synthetic */ View aTo;
            final /* synthetic */ k aUU;
            final /* synthetic */ int aUV;

            public a(View view, k kVar, int i) {
                this.aTo = view;
                this.aUU = kVar;
                this.aUV = i;
            }

            public boolean onPreDraw() {
                this.aTo.getViewTreeObserver().removeOnPreDrawListener(this);
                FrameLayout frameLayout = v.a(this.aUU.this$0).aSa;
                kotlin.jvm.internal.i.e(frameLayout, "binding.bottomBarLayout");
                int height = frameLayout.getHeight();
                if (this.aUV == height) {
                    return false;
                }
                RecyclerView recyclerView = v.a(this.aUU.this$0).aSd;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), com.iqoption.core.ext.a.m(com.iqoption.core.d.Uo(), com.iqoption.chat.e.d.dp8) + height);
                recyclerView.requestLayout();
                return true;
            }
        }

        k(v vVar, Bundle bundle) {
            this.this$0 = vVar;
            this.aUT = bundle;
        }

        /* JADX WARNING: Missing block: B:3:0x000c, code skipped:
            if (r1 != null) goto L_0x0023;
     */
        /* renamed from: b */
        public final void onChanged(com.iqoption.core.microservices.chat.response.l r6) {
            /*
            r5 = this;
            r0 = r5.this$0;
            r1 = r0.aUN;
            if (r1 == 0) goto L_0x000f;
        L_0x0008:
            r1 = r1.a(r6);
            if (r1 == 0) goto L_0x000f;
        L_0x000e:
            goto L_0x0023;
        L_0x000f:
            r1 = com.iqoption.chat.fragment.s.aUB;
            r2 = r5.this$0;
            r2 = com.iqoption.chat.fragment.v.e(r2);
            r3 = r5.this$0;
            r3 = r3.SK();
            r4 = r5.aUT;
            r1 = r1.a(r2, r3, r6, r4);
        L_0x0023:
            r0.aUN = r1;
            r6 = r5.this$0;
            r6 = com.iqoption.chat.fragment.v.a(r6);
            r6 = r6.aSa;
            r0 = "binding.bottomBarLayout";
            kotlin.jvm.internal.i.e(r6, r0);
            r6 = r6.getHeight();
            r1 = r5.this$0;
            r1 = com.iqoption.chat.fragment.v.a(r1);
            r1 = r1.aSa;
            kotlin.jvm.internal.i.e(r1, r0);
            r1 = (android.view.View) r1;
            r0 = r1.getViewTreeObserver();
            r2 = new com.iqoption.chat.fragment.v$k$a;
            r2.<init>(r1, r5, r6);
            r2 = (android.view.ViewTreeObserver.OnPreDrawListener) r2;
            r0.addOnPreDrawListener(r2);
            r6 = r5.this$0;
            r6 = r6.getResources();
            r6 = com.iqoption.core.util.ag.a(r6);
            if (r6 == 0) goto L_0x0067;
        L_0x005e:
            r6 = r5.this$0;
            r6 = com.iqoption.chat.fragment.v.e(r6);
            r6.Sg();
        L_0x0067:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.fragment.v$k.onChanged(com.iqoption.core.microservices.chat.response.l):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RoomFragment.kt */
    static final class l<T> implements Observer<com.iqoption.core.microservices.chat.response.k> {
        final /* synthetic */ v this$0;

        l(v vVar) {
            this.this$0 = vVar;
        }

        /* renamed from: e */
        public final void onChanged(com.iqoption.core.microservices.chat.response.k kVar) {
            v.g(this.this$0).d(kVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: RoomFragment.kt */
    static final class m<T> implements Observer<Pair<? extends List<? extends y>, ? extends DiffResult>> {
        final /* synthetic */ AtomicBoolean aUW;
        final /* synthetic */ v this$0;

        m(v vVar, AtomicBoolean atomicBoolean) {
            this.this$0 = vVar;
            this.aUW = atomicBoolean;
        }

        /* renamed from: a */
        public final void onChanged(Pair<? extends List<? extends y>, ? extends DiffResult> pair) {
            if (pair != null) {
                v.h(this.this$0).setLoading(false);
                v.h(this.this$0).b((List) pair.getFirst(), (DiffResult) pair.bni());
                v.a(this.this$0).aSd.invalidateItemDecorations();
                if (this.aUW.get()) {
                    this.this$0.aUP.bm(ToastEntity.ERROR_TOAST_DURATION);
                    this.aUW.set(false);
                } else if (this.this$0.aUO) {
                    v.a(this.this$0).aSd.scrollToPosition(0);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onViewCreated$9$5", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class n extends OnScrollListener {
        final /* synthetic */ o aUX;

        n(o oVar) {
            this.aUX = oVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            if (i2 != 0) {
                this.aUX.show();
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            if (i == 0) {
                this.aUX.hide();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/RoomFragment$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class b extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ v this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\t"}, bng = {"com/iqoption/chat/fragment/RoomFragment$createTransition$1$createAnimator$1$1$2$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/RoomFragment$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/RoomFragment$createTransition$1$$special$$inlined$apply$lambda$2", "com/iqoption/chat/fragment/RoomFragment$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: RoomFragment.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ b aUS;

            a(b bVar, ViewGroup viewGroup) {
                this.aUS = bVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(v.a(this.aUS.this$0).getRoot());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        b(v vVar, boolean z) {
            this.this$0 = vVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(vVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            if (this.aSB) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = ObjectAnimator.ofFloat(v.a(this.this$0).getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
                animatorArr[1] = ObjectAnimator.ofFloat(v.a(this.this$0).getRoot(), View.TRANSLATION_X, new float[]{com.iqoption.core.ext.a.l(com.iqoption.core.d.Uo(), com.iqoption.chat.e.d.dp24), 0.0f});
                animatorSet2.playTogether(animatorArr);
                arrayList.add(animatorSet2);
            } else {
                viewGroup.getOverlay().add(v.a(this.this$0).getRoot());
                AnimatorSet animatorSet3 = new AnimatorSet();
                Animator[] animatorArr2 = new Animator[2];
                animatorArr2[0] = ObjectAnimator.ofFloat(v.a(this.this$0).getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v.a(this.this$0).getRoot(), View.TRANSLATION_X, new float[]{0.0f, com.iqoption.core.ext.a.l(com.iqoption.core.d.Uo(), com.iqoption.chat.e.d.dp24)});
                ofFloat.addListener(new a(this, viewGroup));
                animatorArr2[1] = ofFloat;
                animatorSet3.playTogether(animatorArr2);
                arrayList.add(animatorSet3);
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 300);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, bng = {"com/iqoption/chat/fragment/RoomFragment$onAttach$1", "Lcom/iqoption/chat/fragment/DelegateContext;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "bottomBarLayout", "Landroid/widget/FrameLayout;", "getBottomBarLayout", "()Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "topBarLayout", "getTopBarLayout", "viewModel", "Lcom/iqoption/chat/viewmodel/RoomViewModel;", "getViewModel", "()Lcom/iqoption/chat/viewmodel/RoomViewModel;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "hideKeyboard", "", "openAttachmentPicker", "openCantSendReasonDialog", "message", "", "showKeyboard", "view", "Landroid/view/View;", "chat_release"})
    /* compiled from: RoomFragment.kt */
    public static final class c implements g {
        final /* synthetic */ v this$0;

        c(v vVar) {
            this.this$0 = vVar;
        }

        public String a(@PluralsRes int i, int i2, Object... objArr) {
            kotlin.jvm.internal.i.f(objArr, "formatArgs");
            return com.iqoption.chat.fragment.g.a.a(this, i, i2, objArr);
        }

        public int er(@DimenRes int i) {
            return com.iqoption.chat.fragment.g.a.a(this, i);
        }

        public float es(@DimenRes int i) {
            return com.iqoption.chat.fragment.g.a.b(this, i);
        }

        public int getColor(@ColorRes int i) {
            return com.iqoption.chat.fragment.g.a.c(this, i);
        }

        public Drawable getDrawable(@DrawableRes int i) {
            return com.iqoption.chat.fragment.g.a.d(this, i);
        }

        public String getString(@StringRes int i, Object... objArr) {
            kotlin.jvm.internal.i.f(objArr, "formatArgs");
            return com.iqoption.chat.fragment.g.a.a(this, i, objArr);
        }

        public Context getContext() {
            return com.iqoption.core.ext.a.q(this.this$0);
        }

        public FragmentActivity getActivity() {
            return com.iqoption.core.ext.a.r(this.this$0);
        }

        /* renamed from: SO */
        public FrameLayout Sd() {
            FrameLayout frameLayout = v.a(this.this$0).aSg;
            kotlin.jvm.internal.i.e(frameLayout, "binding.topBarLayout");
            return frameLayout;
        }

        /* renamed from: SP */
        public FrameLayout Se() {
            FrameLayout frameLayout = v.a(this.this$0).aSa;
            kotlin.jvm.internal.i.e(frameLayout, "binding.bottomBarLayout");
            return frameLayout;
        }

        public com.iqoption.chat.viewmodel.k Sf() {
            return v.b(this.this$0);
        }

        public Lifecycle getLifecycle() {
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.i.e(lifecycle, "this@RoomFragment.lifecycle");
            return lifecycle;
        }

        public void ad(View view) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            com.iqoption.core.util.v.b(getActivity(), view);
        }

        public void Sg() {
            com.iqoption.core.util.v.j(getActivity());
        }

        public void x(CharSequence charSequence) {
            kotlin.jvm.internal.i.f(charSequence, "message");
            com.iqoption.chat.b.b.ST().a((Fragment) this.this$0, d.aSz.w(charSequence));
        }

        public void Sh() {
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (com.iqoption.core.ext.a.fP(str)) {
                this.this$0.SL();
            } else {
                this.this$0.requestPermissions(new String[]{str}, 1);
            }
        }
    }

    public static final /* synthetic */ com.iqoption.chat.viewmodel.k b(v vVar) {
        com.iqoption.chat.viewmodel.k kVar = vVar.aUJ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return kVar;
    }

    public static final /* synthetic */ g e(v vVar) {
        g gVar = vVar.aUp;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("delegateContext");
        }
        return gVar;
    }

    public static final /* synthetic */ x g(v vVar) {
        x xVar = vVar.aUM;
        if (xVar == null) {
            kotlin.jvm.internal.i.lG("topBarDelegate");
        }
        return xVar;
    }

    public static final /* synthetic */ ac h(v vVar) {
        ac acVar = vVar.aTS;
        if (acVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return acVar;
    }

    public static final /* synthetic */ LinearLayoutManager m(v vVar) {
        LinearLayoutManager linearLayoutManager = vVar.apt;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.i.lG("layoutManager");
        }
        return linearLayoutManager;
    }

    static {
        String name = v.class.getName();
        kotlin.jvm.internal.i.e(name, "RoomFragment::class.java.name");
        TAG = name;
    }

    private final String SJ() {
        String str = this.aUG;
        if (str != null) {
            return str;
        }
        str = com.iqoption.core.ext.a.s(this).getString("arg.chatRoomId", "unknown");
        this.aUG = str;
        kotlin.jvm.internal.i.e(str, "args.getString(ARG_CHAT_…   _roomId = it\n        }");
        return str;
    }

    private final ChatRoomType SK() {
        ChatRoomType chatRoomType = this.aUH;
        if (chatRoomType != null) {
            return chatRoomType;
        }
        String string = com.iqoption.core.ext.a.s(this).getString("arg.chatRoomType");
        kotlin.jvm.internal.i.e(string, "args.getString(ARG_CHAT_ROOM_TYPE)");
        chatRoomType = ChatRoomType.valueOf(string);
        this.aUH = chatRoomType;
        return chatRoomType;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new d(this);
    }

    private final Transition cf(boolean z) {
        return new b(this, z);
    }

    public void onAttach(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        super.onAttach(context);
        this.aUI = com.iqoption.chat.f.aOi.aX(context);
        this.aUp = new c(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        cm cmVar = (cm) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.chat.e.h.fragment_room, viewGroup, false, 4, null);
        this.aUL = cmVar;
        return cmVar.getRoot();
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        s sVar = this.aUN;
        bundle.putParcelable("key.sendLayoutDelegate", sVar != null ? sVar.SD() : null);
        bundle.putLong("key.rateSupportLastHandledTime", this.aUQ);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FragmentActivity r = com.iqoption.core.ext.a.r(this);
        Activity activity = r;
        getLifecycle().addObserver(new SystemUiSubstitude(activity, 0));
        a((LifecycleObserver) new SoftInputModeSubstitute(activity, 16));
        String str = "delegateContext";
        if (ag.a(getResources())) {
            g gVar = this.aUp;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar.Sg();
        }
        if (bundle != null) {
            this.aUQ = bundle.getLong("key.rateSupportLastHandledTime");
        }
        com.iqoption.chat.viewmodel.h h = com.iqoption.chat.viewmodel.h.aXm.h(com.iqoption.core.ext.a.r(this));
        h.Ty();
        this.aUK = h;
        this.aUJ = com.iqoption.chat.viewmodel.k.aYb.m(this);
        com.iqoption.chat.viewmodel.k kVar = this.aUJ;
        String str2 = "viewModel";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        kVar.b(SJ(), SK());
        v vVar = this;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        com.iqoption.chat.viewmodel.k kVar2 = this.aUJ;
        if (kVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = vVar;
        kVar2.getState().observe(lifecycleOwner, new k(this, bundle));
        com.iqoption.chat.viewmodel.k kVar3 = this.aUJ;
        if (kVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        kVar3.TD().observe(lifecycleOwner, new l(this));
        kVar3 = this.aUJ;
        if (kVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        kVar3.TE().observe(lifecycleOwner, new m(this, atomicBoolean));
        kVar3 = this.aUJ;
        if (kVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        kVar3.TG().observe(lifecycleOwner, new aw(new RoomFragment$onViewCreated$6(this), new RoomFragment$onViewCreated$7(this)));
        com.iqoption.chat.fragment.x.a aVar = x.aVf;
        ChatRoomType SK = SK();
        g gVar2 = this.aUp;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        this.aUM = aVar.a(SK, gVar2);
        com.iqoption.chat.f fVar = this.aUI;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("resourcer");
        }
        ac acVar = new ac(fVar);
        String string = SK() == ChatRoomType.SUPPORT ? acVar.getString(com.iqoption.chat.e.j.any_questions_feel_free_to_ask_and_we_ll, new Object[0]) : SK() == ChatRoomType.FEEDBACK ? acVar.getString(com.iqoption.chat.e.j.please_leave_your_feedback_or_suggestion_here, new Object[0]) : "";
        acVar.eV(string);
        e eVar = new e(acVar, this);
        i iVar = new i(acVar, this);
        RoomFragment$onViewCreated$$inlined$apply$lambda$3 roomFragment$onViewCreated$$inlined$apply$lambda$3 = new RoomFragment$onViewCreated$$inlined$apply$lambda$3(this);
        acVar.c(new RoomFragment$onViewCreated$$inlined$apply$lambda$4(acVar, roomFragment$onViewCreated$$inlined$apply$lambda$3, eVar, this));
        if (SK() == ChatRoomType.GLOBAL) {
            acVar.d(new RoomFragment$onViewCreated$$inlined$apply$lambda$5(this));
        }
        acVar.a((com.iqoption.chat.component.ac.b) new j(this));
        acVar.a((kotlin.jvm.a.m) new RoomFragment$onViewCreated$$inlined$apply$lambda$8(acVar, new RoomFragment$onViewCreated$$inlined$apply$lambda$7(this), new RoomFragment$onViewCreated$8$6(new SimpleDateFormat(acVar.getString(com.iqoption.chat.e.j.d_MMM_at_HH_mm, new Object[0]), Locale.US)), roomFragment$onViewCreated$$inlined$apply$lambda$3, iVar, this));
        acVar.b((kotlin.jvm.a.m) new RoomFragment$onViewCreated$$inlined$apply$lambda$9(this));
        acVar.e(new RoomFragment$onViewCreated$$inlined$apply$lambda$10(this));
        acVar.f(new RoomFragment$onViewCreated$$inlined$apply$lambda$11(this));
        this.aTS = acVar;
        cm cmVar = this.aUL;
        string = "binding";
        if (cmVar == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        cmVar.aHK.setOnClickListener(new f(this, r));
        cmVar.aSb.setOnClickListener(new g(this, r));
        com.iqoption.core.k kVar4 = new com.iqoption.core.k(r);
        com.iqoption.chat.e.b bVar = new com.iqoption.chat.e.b();
        com.iqoption.core.j jVar = kVar4;
        cmVar.aSc.a(jVar, bVar);
        cmVar.aSd.setHasFixedSize(true);
        RecyclerView recyclerView = cmVar.aSd;
        ac acVar2 = this.aTS;
        String str3 = "adapter";
        if (acVar2 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        BadgeView badgeView = cmVar.aSc;
        String str4 = "dateBadge";
        kotlin.jvm.internal.i.e(badgeView, str4);
        recyclerView.addItemDecoration(new m(jVar, bVar, acVar2, badgeView));
        RecyclerView recyclerView2 = cmVar.aSd;
        str2 = "messageList";
        kotlin.jvm.internal.i.e(recyclerView2, str2);
        ac acVar3 = this.aTS;
        if (acVar3 == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        recyclerView2.setAdapter(acVar3);
        recyclerView2 = cmVar.aSd;
        kotlin.jvm.internal.i.e(recyclerView2, str2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.apt = linearLayoutManager;
        linearLayoutManager.setReverseLayout(true);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2 = cmVar.aSd;
        kotlin.jvm.internal.i.e(recyclerView2, str2);
        recyclerView2.setItemAnimator((ItemAnimator) null);
        cmVar.aSd.addOnScrollListener(new h(this, r));
        BadgeView badgeView2 = cmVar.aSc;
        kotlin.jvm.internal.i.e(badgeView2, str4);
        cmVar.aSd.addOnScrollListener(new n(new o(badgeView2)));
        RecyclerView recyclerView3 = cmVar.aSd;
        cm cmVar2 = this.aUL;
        if (cmVar2 == null) {
            kotlin.jvm.internal.i.lG(string);
        }
        FrameLayout frameLayout = cmVar2.aSb;
        kotlin.jvm.internal.i.e(frameLayout, "binding.btnReturn");
        recyclerView3.addOnScrollListener(new r(frameLayout));
        FrameLayout frameLayout2 = cmVar.aSa;
        kotlin.jvm.internal.i.e(frameLayout2, "bottomBarLayout");
        frameLayout2.setLayoutTransition(ai.bRN.anP());
    }

    /* JADX WARNING: Missing block: B:8:0x0020, code skipped:
            if (r0 != null) goto L_0x0025;
     */
    private final void SL() {
        /*
        r3 = this;
        r0 = r3.aUJ;
        if (r0 != 0) goto L_0x000a;
    L_0x0004:
        r1 = "viewModel";
        kotlin.jvm.internal.i.lG(r1);
    L_0x000a:
        r0 = r0.TD();
        r0 = r0.getValue();
        r0 = (com.iqoption.core.microservices.chat.response.k) r0;
        if (r0 == 0) goto L_0x0023;
    L_0x0016:
        r0 = r0.getName();
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = com.iqoption.core.util.LocalizationUtil.hq(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0025;
    L_0x0023:
        r0 = "";
    L_0x0025:
        r1 = "viewModel.chatRoom.value…) }\n                ?: \"\"";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = com.iqoption.chat.fragment.a.aSp;
        r2 = new com.iqoption.chat.fragment.RoomFragment$pickAttachments$f$1;
        r2.<init>(r3);
        r2 = (kotlin.jvm.a.b) r2;
        r0 = r1.b(r0, r2);
        r1 = com.iqoption.chat.b.b.ST();
        r2 = r3;
        r2 = (androidx.fragment.app.Fragment) r2;
        r1.a(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.fragment.v.SL():void");
    }

    private final void SM() {
        cm cmVar = this.aUL;
        if (cmVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        cmVar.aSd.scrollToPosition(0);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.aUP.cancel();
        com.iqoption.chat.viewmodel.h hVar = this.aUK;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("interactionViewModel");
        }
        hVar.Tz();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (fragmentManager != null && fragmentManager.getBackStackEntryCount() > 0) {
            BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1);
            kotlin.jvm.internal.i.e(backStackEntryAt, "childFragmentManager.get….backStackEntryCount - 1)");
            if (kotlin.jvm.internal.i.y(backStackEntryAt.getName(), TAG)) {
                onClose();
                return true;
            }
        }
        return false;
    }

    public final void onClose() {
        this.aUP.execute();
        com.iqoption.chat.viewmodel.h hVar = this.aUK;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("interactionViewModel");
        }
        hVar.fe(SJ());
        SN();
    }

    private final void SN() {
        com.iqoption.core.util.v.j(com.iqoption.core.ext.a.r(this));
        if (com.iqoption.core.ext.a.u(this).getBackStackEntryCount() > 0) {
            com.iqoption.core.ext.a.u(this).popBackStack();
        } else {
            com.iqoption.chat.b.b.ST().k(this);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.i.f(strArr, "permissions");
        kotlin.jvm.internal.i.f(iArr, "grantResults");
        if (i == 1) {
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (a(str, strArr, iArr)) {
                SL();
            } else if (!shouldShowRequestPermissionRationale(str)) {
                str = getString(com.iqoption.chat.e.j.please_grant_permission_external_storage);
                kotlin.jvm.internal.i.e(str, "getString(R.string.pleas…mission_external_storage)");
                com.iqoption.core.d.z(str, 0);
            }
        }
    }

    private final boolean a(String str, String[] strArr, int[] iArr) {
        int indexOf = i.indexOf(strArr, str);
        boolean z = false;
        if (indexOf == -1) {
            return false;
        }
        if (iArr[indexOf] == 0) {
            z = true;
        }
        return z;
    }
}
