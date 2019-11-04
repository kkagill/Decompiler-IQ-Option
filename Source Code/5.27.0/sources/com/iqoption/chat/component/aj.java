package com.iqoption.chat.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Filter;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Longs;
import com.iqoption.chat.viewmodel.q;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.s;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001qBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\u0018\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020(H\u0002J*\u0010@\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020(2\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020;H\u0002J\u0018\u0010D\u001a\u00020\u00112\u0006\u0010?\u001a\u00020(2\u0006\u0010>\u001a\u00020\nH\u0002J\u0018\u0010E\u001a\u00020\u00112\u0006\u0010?\u001a\u00020(2\u0006\u0010>\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010F\u001a\u00020%J\u0019\u0010G\u001a\u0004\u0018\u0001012\b\u0010H\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010L\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0002J\u0013\u0010M\u001a\u00020\u00142\b\b\u0001\u0010N\u001a\u00020\u0014H\u0001J\u0015\u0010O\u001a\u0004\u0018\u00010P2\b\b\u0001\u0010N\u001a\u00020\u0014H\u0001J\b\u0010Q\u001a\u00020\u0014H\u0016J\u0010\u0010R\u001a\u00020I2\u0006\u0010S\u001a\u00020\u0014H\u0016J\u0010\u0010T\u001a\u0002012\u0006\u0010U\u001a\u000201H\u0002J%\u0010V\u001a\u00020%2\b\b\u0001\u0010N\u001a\u00020\u00142\u0006\u0010W\u001a\u00020\u00142\b\b\u0002\u0010X\u001a\u00020;H\u0001J<\u0010Y\u001a\n 4*\u0004\u0018\u000101012\b\b\u0001\u0010N\u001a\u00020\u00142\u0006\u0010W\u001a\u00020\u00142\u0012\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020\\0[\"\u00020\\H\u0001¢\u0006\u0002\u0010]J\u000e\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u000201J\u0013\u0010`\u001a\u00020a2\b\b\u0001\u0010N\u001a\u00020\u0014H\u0001J\u0013\u0010b\u001a\u00020\u00142\b\b\u0001\u0010N\u001a\u00020\u0014H\u0001J0\u0010c\u001a\u0002012\b\b\u0001\u0010N\u001a\u00020\u00142\u0016\u0010Z\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\\0[\"\u0004\u0018\u00010\\H\u0001¢\u0006\u0002\u0010dJ\u0014\u0010e\u001a\u00020\u00112\f\u0010f\u001a\b\u0012\u0004\u0012\u00020(0'J\u0010\u0010g\u001a\u00020\u00112\u0006\u0010h\u001a\u00020iH\u0016J\u0018\u0010j\u001a\u00020\u00112\u0006\u0010k\u001a\u00020\u00022\u0006\u0010S\u001a\u00020\u0014H\u0016J\u0018\u0010l\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\t2\u0006\u0010n\u001a\u00020\u0014H\u0016J\u000e\u0010o\u001a\u00020\u00112\u0006\u0010A\u001a\u00020BJ\u0018\u0010p\u001a\u00020\u00112\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\u001cX\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\"\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R.\u0010)\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R2\u00102\u001a&\u0012\f\u0012\n 4*\u0004\u0018\u00010(0( 4*\u0012\u0012\f\u0012\n 4*\u0004\u0018\u00010(0(\u0018\u00010303X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020(0'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020109X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000¨\u0006r"}, bng = {"Lcom/iqoption/chat/component/RoomsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/chat/component/RoomViewHolder;", "Lcom/iqoption/chat/Resourcer;", "resourcer", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "roomBindingFactory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lcom/iqoption/chat/component/RoomBinding;", "supportRoomViewModel", "Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;", "messagesViewModel", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "animationCallback", "Lkotlin/Function0;", "", "(Lcom/iqoption/chat/Resourcer;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lcom/iqoption/chat/viewmodel/SupportRoomViewModel;Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;Lkotlin/jvm/functions/Function0;)V", "avatarSize", "", "avatarTransformation", "Lcom/iqoption/core/ui/picasso/PathTransformation;", "getAvatarTransformation", "()Lcom/iqoption/core/ui/picasso/PathTransformation;", "avatarTransformation$delegate", "Lkotlin/Lazy;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dateYearFormat", "filter", "Landroid/widget/Filter;", "filterConstraint", "", "filterListener", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "listener", "Lkotlin/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "loadedMessages", "", "", "ordering", "Lcom/google/common/collect/Ordering;", "kotlin.jvm.PlatformType", "picasso", "Lcom/squareup/picasso/Picasso;", "rooms", "translations", "", "updateOnMessageLoaded", "", "weekDayFormat", "bind", "binding", "room", "bindMessage", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "loading", "bindRoomImage", "bindSupportImage", "constraint", "formatDate", "date", "", "(Ljava/lang/Long;)Ljava/lang/String;", "formatLastMessage", "formatLastMessageContents", "getColor", "id", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getItemCount", "getItemId", "position", "getLocalizedTitle", "key", "getPlural", "quantity", "formatQuantity", "getPluralFormat", "formatArgs", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getPositionByRoomId", "roomId", "getPxFloat", "", "getPxInt", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "initFilter", "list", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "viewType", "setMessage", "setRooms", "Companion", "chat_release"})
/* compiled from: RoomsAdapter.kt */
public final class aj extends Adapter<ai> implements com.iqoption.chat.f {
    private static final String TAG = aj.class.getSimpleName();
    private static final com.iqoption.core.ui.widget.recyclerview.adapter.b aOY = new com.iqoption.core.ui.widget.recyclerview.adapter.b();
    private static final List<ChatRoomType> aQn = m.listOf(ChatRoomType.VIP, ChatRoomType.SUPPORT, ChatRoomType.GLOBAL, ChatRoomType.FEEDBACK, ChatRoomType.NOTIFICATION, ChatRoomType.MODERATION);
    private static final kotlin.jvm.a.b<com.iqoption.core.microservices.chat.response.k, Integer> aQo = RoomsAdapter$Companion$PRIORITY_RESOLVER$1.aQs;
    private static final m<com.iqoption.chat.viewmodel.i, com.iqoption.core.microservices.chat.response.k, Long> aQp = RoomsAdapter$Companion$DATE_RESOLVER$1.aQr;
    public static final a aQq = new a();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(aj.class), "avatarTransformation", "getAvatarTransformation()Lcom/iqoption/core/ui/picasso/PathTransformation;"))};
    private final LifecycleOwner aNp;
    private boolean aPY;
    private kotlin.jvm.a.b<? super List<com.iqoption.core.microservices.chat.response.k>, l> aPZ;
    private final int aPg = er(com.iqoption.chat.e.d.dp40);
    private final /* synthetic */ com.iqoption.chat.f aPw;
    private final Map<String, String> aQa = new LinkedHashMap();
    private final SimpleDateFormat aQb = new SimpleDateFormat("EEE", Locale.getDefault());
    private final SimpleDateFormat aQc = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
    private final Set<String> aQd = new LinkedHashSet();
    private List<com.iqoption.core.microservices.chat.response.k> aQe = m.emptyList();
    private CharSequence aQf = "";
    private Filter aQg;
    private final kotlin.d aQh = g.c(new RoomsAdapter$avatarTransformation$2(this));
    private m<? super com.iqoption.core.microservices.chat.response.k, ? super Integer, l> aQi;
    private final kotlin.jvm.a.b<ViewGroup, ah> aQj;
    private final q aQk;
    private final com.iqoption.chat.viewmodel.i aQl;
    private final kotlin.jvm.a.a<l> aQm;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM", Locale.getDefault());
    private final Ordering<com.iqoption.core.microservices.chat.response.k> ordering = Ordering.from((Comparator) i.aQE).compound((Comparator) new j(this)).compound((Comparator) Ordering.natural().onResultOf(new k(this)));
    private Picasso picasso;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/chat/component/RoomsAdapter$Companion;", "", "()V", "DATE_RESOLVER", "Lkotlin/Function2;", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "", "PRIORITY_RESOLVER", "Lkotlin/Function1;", "", "ROOM_TYPE_PRIORITY", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "SORTING_DELAY", "STABLE_ID_STORE", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/StableIdStore;", "TAG", "", "kotlin.jvm.PlatformType", "chat_release"})
    /* compiled from: RoomsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/chat/component/RoomsAdapter$bind$3$1"})
    /* compiled from: RoomsAdapter.kt */
    static final class b implements Runnable {
        final /* synthetic */ LiveData aQt;
        final /* synthetic */ ah aQu;
        final /* synthetic */ String aQv;
        final /* synthetic */ aj this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/component/RoomsAdapter$bind$3$1$1"})
        /* compiled from: RoomsAdapter.kt */
        /* renamed from: com.iqoption.chat.component.aj$b$1 */
        static final class AnonymousClass1<T> implements Observer<com.iqoption.core.microservices.chat.response.e> {
            final /* synthetic */ b aQw;

            AnonymousClass1(b bVar) {
                this.aQw = bVar;
            }

            /* renamed from: d */
            public final void onChanged(com.iqoption.core.microservices.chat.response.e eVar) {
                this.aQw.this$0.aQd.add(this.aQw.aQv);
                if (eVar != null) {
                    this.aQw.this$0.a(eVar);
                }
            }
        }

        b(LiveData liveData, aj ajVar, ah ahVar, String str) {
            this.aQt = liveData;
            this.this$0 = ajVar;
            this.aQu = ahVar;
            this.aQv = str;
        }

        public final void run() {
            this.aQt.observe(this.this$0.aNp, new AnonymousClass1(this));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: RoomsAdapter.kt */
    static final class c implements Runnable {
        final /* synthetic */ aj this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
        /* compiled from: RoomsAdapter.kt */
        /* renamed from: com.iqoption.chat.component.aj$c$1 */
        static final class AnonymousClass1<T> implements Observer<String> {
            final /* synthetic */ c aQx;

            AnonymousClass1(c cVar) {
                this.aQx = cVar;
            }

            /* renamed from: dg */
            public final void onChanged(String str) {
                aj ajVar = this.aQx.this$0;
                int i = 0;
                for (com.iqoption.core.microservices.chat.response.k SG : this.aQx.this$0.aQe) {
                    if ((SG.SG() == ChatRoomType.SUPPORT ? 1 : null) != null) {
                        break;
                    }
                    i++;
                }
                i = -1;
                ajVar.notifyItemChanged(i);
            }
        }

        c(aj ajVar) {
            this.this$0 = ajVar;
        }

        public final void run() {
            this.this$0.aQk.TZ().observe(this.this$0.aNp, new AnonymousClass1(this));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, bng = {"com/iqoption/chat/component/RoomsAdapter$onAttachedToRecyclerView$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "chat_release"})
    /* compiled from: RoomsAdapter.kt */
    public static final class g implements AnimationListener {
        final /* synthetic */ RecyclerView aQB;
        final /* synthetic */ aj this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/chat/component/RoomsAdapter$onAttachedToRecyclerView$1$1$onAnimationEnd$1"})
        /* compiled from: RoomsAdapter.kt */
        /* renamed from: com.iqoption.chat.component.aj$g$1 */
        static final class AnonymousClass1 implements Runnable {
            final /* synthetic */ g aQC;

            AnonymousClass1(g gVar) {
                this.aQC = gVar;
            }

            public final void run() {
                this.aQC.this$0.aPY = true;
                this.aQC.this$0.W(this.aQC.this$0.aQe);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        g(aj ajVar, RecyclerView recyclerView) {
            this.this$0 = ajVar;
            this.aQB = recyclerView;
        }

        public void onAnimationEnd(Animation animation) {
            this.aQB.setLayoutAnimationListener((AnimationListener) null);
            com.iqoption.core.c.a.biN.postDelayed(new AnonymousClass1(this), 1000);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: RoomsAdapter.kt */
    static final class i<T> implements Comparator<com.iqoption.core.microservices.chat.response.k> {
        public static final i aQE = new i();

        i() {
        }

        /* renamed from: a */
        public final int compare(com.iqoption.core.microservices.chat.response.k kVar, com.iqoption.core.microservices.chat.response.k kVar2) {
            kotlin.jvm.a.b RK = aj.aQo;
            kotlin.jvm.internal.i.e(kVar, "o1");
            int intValue = ((Number) RK.invoke(kVar)).intValue();
            RK = aj.aQo;
            kotlin.jvm.internal.i.e(kVar2, "o2");
            return com.google.common.primitives.c.compare(intValue, ((Number) RK.invoke(kVar2)).intValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: RoomsAdapter.kt */
    static final class j<T> implements Comparator<com.iqoption.core.microservices.chat.response.k> {
        final /* synthetic */ aj this$0;

        j(aj ajVar) {
            this.this$0 = ajVar;
        }

        /* renamed from: a */
        public final int compare(com.iqoption.core.microservices.chat.response.k kVar, com.iqoption.core.microservices.chat.response.k kVar2) {
            m RL = aj.aQp;
            com.iqoption.chat.viewmodel.i f = this.this$0.aQl;
            kotlin.jvm.internal.i.e(kVar2, "o2");
            long longValue = ((Number) RL.w(f, kVar2)).longValue();
            m RL2 = aj.aQp;
            com.iqoption.chat.viewmodel.i f2 = this.this$0.aQl;
            kotlin.jvm.internal.i.e(kVar, "o1");
            return Longs.compare(longValue, ((Number) RL2.w(f2, kVar)).longValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032*\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "data", "Lcom/google/common/collect/ImmutableList;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "onFiltered", "com/iqoption/chat/component/RoomsAdapter$initFilter$1$1"})
    /* compiled from: RoomsAdapter.kt */
    static final class d<T> implements com.iqoption.core.util.s.b<com.iqoption.core.microservices.chat.response.k> {
        final /* synthetic */ List aQy;
        final /* synthetic */ aj this$0;

        d(aj ajVar, List list) {
            this.this$0 = ajVar;
            this.aQy = list;
        }

        public final void a(CharSequence charSequence, ImmutableList<com.iqoption.core.microservices.chat.response.k> immutableList) {
            this.this$0.W(immutableList);
            kotlin.jvm.a.b e = this.this$0.aPZ;
            if (e != null) {
                kotlin.jvm.internal.i.e(immutableList, "data");
                l lVar = (l) e.invoke(immutableList);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u000126\u0010\u0004\u001a2\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007 \u0003*\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u00050\u00052\u000e\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0002\b\n¨\u0006\u000b"}, bng = {"<anonymous>", "Lcom/google/common/collect/ImmutableList;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "index", "", "", "", "constraint", "", "performFilter", "com/iqoption/chat/component/RoomsAdapter$initFilter$1$3"})
    /* compiled from: RoomsAdapter.kt */
    static final class e<T, I> implements com.iqoption.core.util.s.c<com.iqoption.core.microservices.chat.response.k, Map<Character, ? extends List<? extends com.iqoption.core.microservices.chat.response.k>>> {
        final /* synthetic */ List aQy;
        final /* synthetic */ aj this$0;

        e(aj ajVar, List list) {
            this.this$0 = ajVar;
            this.aQy = list;
        }

        /* renamed from: a */
        public final ImmutableList<com.iqoption.core.microservices.chat.response.k> d(Map<Character, ? extends List<com.iqoption.core.microservices.chat.response.k>> map, CharSequence charSequence) {
            List list;
            if (TextUtils.isEmpty(charSequence)) {
                list = (List) map.get(null);
                if (list == null) {
                    list = m.emptyList();
                }
                return ImmutableList.m(list);
            }
            String obj = charSequence.toString();
            if (obj != null) {
                obj = v.trim(obj).toString();
                String str = "null cannot be cast to non-null type java.lang.String";
                if (obj != null) {
                    obj = obj.toLowerCase();
                    String str2 = "(this as java.lang.String).toLowerCase()";
                    kotlin.jvm.internal.i.e(obj, str2);
                    list = (List) map.get(Character.valueOf(obj.charAt(0)));
                    if (list == null) {
                        list = m.emptyList();
                    }
                    Collection arrayList = new ArrayList();
                    for (Object next : r10) {
                        String a = this.this$0.eX(((com.iqoption.core.microservices.chat.response.k) next).getName());
                        if (a != null) {
                            a = a.toLowerCase();
                            kotlin.jvm.internal.i.e(a, str2);
                            if (v.b((CharSequence) a, (CharSequence) obj, false, 2, null)) {
                                arrayList.add(next);
                            }
                        } else {
                            throw new TypeCastException(str);
                        }
                    }
                    return ImmutableList.m((List) arrayList);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0010%\n\u0002\u0010\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001az\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0004 \u0003*<\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0004\u0018\u00010\u00070\u00012*\u0010\b\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\t0\tH\n¢\u0006\u0002\b\n"}, bng = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "", "", "it", "Lcom/google/common/collect/ImmutableList;", "onCreateIndex"})
    /* compiled from: RoomsAdapter.kt */
    static final class f<T, I> implements com.iqoption.core.util.s.d<com.iqoption.core.microservices.chat.response.k, Map<Character, ? extends List<? extends com.iqoption.core.microservices.chat.response.k>>> {
        public static final f aQz = new f();

        f() {
        }

        /* renamed from: g */
        public final Map<Character, List<com.iqoption.core.microservices.chat.response.k>> f(ImmutableList<com.iqoption.core.microservices.chat.response.k> immutableList) {
            return s.a(immutableList, AnonymousClass1.aQA);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/component/RoomsAdapter$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ ai aQD;
        final /* synthetic */ aj this$0;

        public h(ai aiVar, aj ajVar) {
            this.aQD = aiVar;
            this.this$0 = ajVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.microservices.chat.response.k RF = this.aQD.RF();
            if (RF != null) {
                m RI = this.this$0.RI();
                if (RI != null) {
                    l lVar = (l) RI.w(RF, Integer.valueOf(this.aQD.getAdapterPosition()));
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "apply"})
    /* compiled from: RoomsAdapter.kt */
    static final class k<F, T> implements com.google.common.base.d<F, T> {
        final /* synthetic */ aj this$0;

        k(aj ajVar) {
            this.this$0 = ajVar;
        }

        /* renamed from: c */
        public final String apply(com.iqoption.core.microservices.chat.response.k kVar) {
            if (kVar != null) {
                String name = kVar.getName();
                if (name != null) {
                    return this.this$0.eX(name);
                }
            }
            return null;
        }
    }

    private final com.iqoption.core.ui.picasso.b RH() {
        kotlin.d dVar = this.aQh;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.core.ui.picasso.b) dVar.getValue();
    }

    public String a(@PluralsRes int i, int i2, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aPw.a(i, i2, objArr);
    }

    public int er(@DimenRes int i) {
        return this.aPw.er(i);
    }

    public float es(@DimenRes int i) {
        return this.aPw.es(i);
    }

    public int getColor(@ColorRes int i) {
        return this.aPw.getColor(i);
    }

    public Context getContext() {
        return this.aPw.getContext();
    }

    public Drawable getDrawable(@DrawableRes int i) {
        return this.aPw.getDrawable(i);
    }

    public String getString(@StringRes int i, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aPw.getString(i, objArr);
    }

    public aj(com.iqoption.chat.f fVar, LifecycleOwner lifecycleOwner, kotlin.jvm.a.b<? super ViewGroup, ? extends ah> bVar, q qVar, com.iqoption.chat.viewmodel.i iVar, kotlin.jvm.a.a<l> aVar) {
        kotlin.jvm.internal.i.f(fVar, "resourcer");
        kotlin.jvm.internal.i.f(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.i.f(bVar, "roomBindingFactory");
        kotlin.jvm.internal.i.f(qVar, "supportRoomViewModel");
        kotlin.jvm.internal.i.f(iVar, "messagesViewModel");
        kotlin.jvm.internal.i.f(aVar, "animationCallback");
        this.aPw = fVar;
        this.aNp = lifecycleOwner;
        this.aQj = bVar;
        this.aQk = qVar;
        this.aQl = iVar;
        this.aQm = aVar;
        setHasStableIds(true);
    }

    public final m<com.iqoption.core.microservices.chat.response.k, Integer, l> RI() {
        return this.aQi;
    }

    public final void c(m<? super com.iqoption.core.microservices.chat.response.k, ? super Integer, l> mVar) {
        this.aQi = mVar;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Picasso with = Picasso.with(recyclerView.getContext());
        kotlin.jvm.internal.i.e(with, "Picasso.with(context)");
        this.picasso = with;
        recyclerView.setLayoutAnimationListener(new g(this, recyclerView));
    }

    public long getItemId(int i) {
        return aOY.de(((com.iqoption.core.microservices.chat.response.k) this.aQe.get(i)).getId());
    }

    public int getItemCount() {
        return this.aQe.size();
    }

    /* renamed from: q */
    public ai onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        ai aiVar = new ai((ah) this.aQj.invoke(viewGroup));
        aiVar.RG().getRoot().setOnClickListener(new h(aiVar, this));
        return aiVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(ai aiVar, int i) {
        kotlin.jvm.internal.i.f(aiVar, "holder");
        com.iqoption.core.microservices.chat.response.k kVar = (com.iqoption.core.microservices.chat.response.k) this.aQe.get(i);
        aiVar.a(kVar);
        a(aiVar.RG(), kVar);
    }

    private final void a(ah ahVar, com.iqoption.core.microservices.chat.response.k kVar) {
        if (kVar.SG() == ChatRoomType.SUPPORT) {
            a(kVar, ahVar);
            TextView Rw = ahVar.Rw();
            Rw.setTextColor(com.iqoption.core.ext.a.g((View) Rw, com.iqoption.chat.e.a.colorAccent));
        } else {
            b(kVar, ahVar);
            ahVar.Rw().setTextColor(getColor(com.iqoption.chat.e.c.chat_room_title));
        }
        ahVar.Rw().setText(eX(kVar.getName()));
        String id = kVar.getId();
        com.iqoption.core.microservices.chat.response.e ff = this.aQl.ff(id);
        LiveData fg = this.aQl.fg(id);
        if (!fg.hasObservers()) {
            ahVar.getRoot().post(new b(fg, this, ahVar, id));
        }
        a(ahVar, kVar, ff, this.aQl.fi(id));
    }

    private final void a(com.iqoption.core.microservices.chat.response.k kVar, ah ahVar) {
        String str = (String) this.aQk.TZ().getValue();
        Picasso picasso = this.picasso;
        String str2 = "picasso";
        if (picasso == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        picasso.cancelRequest(ahVar.Rv());
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj != null) {
            ahVar.Rv().setImageDrawable(null);
            if (!this.aQk.Ua()) {
                this.aQk.Ub();
            }
            ahVar.getRoot().post(new c(this));
        } else if (!kotlin.jvm.internal.i.y(str, "no_avatar")) {
            Picasso picasso2 = this.picasso;
            if (picasso2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            RequestCreator load = picasso2.load(str);
            int i = this.aPg;
            load.resize(i, i).centerCrop().transform((Transformation) RH()).into(ahVar.Rv());
        } else if (TextUtils.isEmpty(kVar.acy())) {
            ahVar.Rv().setImageResource(com.iqoption.chat.e.e.chat_room_support);
        } else {
            Picasso picasso3 = this.picasso;
            if (picasso3 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            ApiConfig EE = com.iqoption.core.d.EE();
            String acy = kVar.acy();
            if (acy == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            picasso3.load(EE.fz(acy)).into(ahVar.Rv());
        }
    }

    private final void b(com.iqoption.core.microservices.chat.response.k kVar, ah ahVar) {
        if (TextUtils.isEmpty(kVar.acy())) {
            ahVar.Rv().setImageResource(com.iqoption.chat.e.e.chat_room_icon_placeholder);
            return;
        }
        Picasso picasso = this.picasso;
        if (picasso == null) {
            kotlin.jvm.internal.i.lG("picasso");
        }
        ApiConfig EE = com.iqoption.core.d.EE();
        String acy = kVar.acy();
        if (acy == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        picasso.load(EE.fz(acy)).into(ahVar.Rv());
    }

    private final String eX(String str) {
        String str2 = (String) this.aQa.get(str);
        if (str2 != null) {
            return str2;
        }
        str2 = LocalizationUtil.hr(str);
        Map map = this.aQa;
        kotlin.jvm.internal.i.e(str2, "this");
        map.put(str, str2);
        kotlin.jvm.internal.i.e(str2, "LocalizationUtil.transla…ons[key] = this\n        }");
        return str2;
    }

    private final void a(ah ahVar, com.iqoption.core.microservices.chat.response.k kVar, com.iqoption.core.microservices.chat.response.e eVar, boolean z) {
        if (eVar != null) {
            ahVar.Rx().setText(b(eVar));
            if (eVar.abU() || kVar.gr(eVar.getId())) {
                ahVar.Rx().setTextColor(getColor(com.iqoption.chat.e.c.chat_room_message_read));
                ahVar.Rz().setVisibility(4);
            } else {
                ahVar.Rx().setTextColor(getColor(com.iqoption.chat.e.c.chat_room_message_unread));
                ahVar.Rz().setVisibility(0);
            }
            ahVar.Ry().setText(m(Long.valueOf(eVar.getDate())));
            return;
        }
        if (!z || this.aQd.contains(kVar.getId())) {
            CharSequence string;
            TextView Rx = ahVar.Rx();
            int i = ak.aob[kVar.SG().ordinal()];
            if (i == 1) {
                string = getString(com.iqoption.chat.e.j.any_questions_feel_free_to_ask_and_we_ll, new Object[0]);
            } else if (i != 2) {
                string = null;
            } else {
                string = getString(com.iqoption.chat.e.j.please_leave_your_feedback_or_suggestion_here, new Object[0]);
            }
            Rx.setText(string);
        } else {
            ahVar.Rx().setText((CharSequence) null);
        }
        ahVar.Ry().setText((CharSequence) null);
        ahVar.Rz().setVisibility(4);
    }

    private final String m(Long l) {
        if (l == null) {
            return null;
        }
        if (com.iqoption.core.util.i.aP(l.longValue())) {
            return TimeUtil.bRM.aQ(l.longValue());
        }
        if (com.iqoption.core.util.i.aA(l.longValue())) {
            return getString(com.iqoption.chat.e.j.yesterday, new Object[0]);
        }
        if (com.iqoption.core.util.i.bl(l.longValue())) {
            return this.aQb.format(l);
        }
        if (com.iqoption.core.util.i.aB(l.longValue())) {
            return this.dateFormat.format(l);
        }
        return this.aQc.format(l);
    }

    private final String b(com.iqoption.core.microservices.chat.response.e eVar) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        if (eVar.abU()) {
            str = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(eVar.acb());
            stringBuilder2.append(": ");
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(c(eVar));
        return stringBuilder.toString();
    }

    private final String c(com.iqoption.core.microservices.chat.response.e eVar) {
        String text = eVar.getText();
        if (text != null) {
            if ((((CharSequence) text).length() > 0 ? 1 : null) == 1) {
                String text2 = eVar.getText();
                if (text2 != null) {
                    return text2;
                }
                kotlin.jvm.internal.i.bnJ();
                return text2;
            }
        }
        List ack = eVar.ack();
        if (ack == null || (ack.isEmpty() ^ 1) != 1) {
            return "";
        }
        List ack2 = eVar.ack();
        if (ack2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        if (((com.iqoption.core.microservices.chat.response.a) u.bW(ack2)).abS()) {
            return getString(com.iqoption.chat.e.j.image, new Object[0]);
        }
        return getString(com.iqoption.chat.e.j.file, new Object[0]);
    }

    public final void V(List<com.iqoption.core.microservices.chat.response.k> list) {
        kotlin.jvm.internal.i.f(list, "list");
        if (this.aQg == null) {
            this.aQg = s.z(list).a((com.iqoption.core.util.s.b) new d(this, list)).a((com.iqoption.core.util.s.d) f.aQz).a((com.iqoption.core.util.s.c) new e(this, list)).ano();
        }
        RJ();
    }

    public final void filter(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        if (!kotlin.jvm.internal.i.y(charSequence, this.aQf)) {
            this.aQf = charSequence;
            RJ();
        }
    }

    public final void RJ() {
        Filter filter = this.aQg;
        if (filter != null) {
            filter.filter(this.aQf);
        }
    }

    private final void W(List<com.iqoption.core.microservices.chat.response.k> list) {
        List list2;
        Object obj = null;
        if ((list2 != null ? list2.isEmpty() ^ 1 : 0) != 0 && this.aQe.isEmpty()) {
            obj = 1;
        }
        if (list2 == null) {
            list2 = m.emptyList();
        }
        this.aQe = list2;
        Iterable iterable = this.aQe;
        Ordering ordering = this.ordering;
        kotlin.jvm.internal.i.e(ordering, "ordering");
        this.aQe = u.a(iterable, (Comparator) ordering);
        notifyDataSetChanged();
        if ((this.aQe.isEmpty() ^ 1) != 0 && obj != null) {
            this.aQm.invoke();
        }
    }

    public final void a(com.iqoption.core.microservices.chat.response.e eVar) {
        kotlin.jvm.internal.i.f(eVar, "message");
        Object obj = null;
        int i = 0;
        for (com.iqoption.core.microservices.chat.response.k id : this.aQe) {
            if (kotlin.jvm.internal.i.y(id.getId(), eVar.SJ())) {
                break;
            }
            i++;
        }
        i = -1;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            obj = 1;
        }
        if (obj == null) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            if (this.aPY) {
                W(this.aQe);
            }
        }
    }

    public final int eY(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        int i = 0;
        for (com.iqoption.core.microservices.chat.response.k id : this.aQe) {
            if (kotlin.jvm.internal.i.y(id.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
