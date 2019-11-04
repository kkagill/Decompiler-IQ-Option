package com.iqoption.chat.viewmodel;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DiffUtil.Callback;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0001\u0001\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010S\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\u0006\u0010V\u001a\u00020\u0011H\u0002J(\u0010W\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0002J\u0010\u0010X\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u001bH\u0007J\u0016\u0010Z\u001a\u00020T2\u0006\u00107\u001a\u0002082\u0006\u0010[\u001a\u00020=J\u0006\u0010\\\u001a\u00020\u0011J\u0018\u0010]\u001a\u00020T2\u0006\u00107\u001a\u0002082\u0006\u0010[\u001a\u00020=H\u0002J,\u0010^\u001a\u00020T2\u0006\u0010_\u001a\u00020\u001b2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0002J\u0006\u0010b\u001a\u00020TJ\u0006\u0010c\u001a\u00020TJ*\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0002J0\u0010e\u001a\u00020T2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\b\b\u0002\u0010V\u001a\u00020\u0011H\u0002J\u0010\u0010f\u001a\u00020T2\u0006\u0010g\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020T2\u0006\u0010g\u001a\u00020hH\u0016J\b\u0010j\u001a\u00020TH\u0014J\u0016\u0010k\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\tH\u0016J\u0010\u0010l\u001a\u00020T2\u0006\u0010g\u001a\u00020hH\u0002J$\u0010m\u001a\u00020T2\u0006\u0010n\u001a\u0002082\u0006\u0010o\u001a\u00020\u00112\n\b\u0002\u0010p\u001a\u0004\u0018\u000108H\u0002J\u001c\u0010q\u001a\u00020T2\u0006\u0010o\u001a\u00020\u00112\n\b\u0002\u0010p\u001a\u0004\u0018\u000108H\u0002J\b\u0010r\u001a\u00020TH\u0002J\"\u0010s\u001a\u00020T2\u0006\u0010n\u001a\u0002082\u0006\u0010t\u001a\u00020R2\n\b\u0002\u0010u\u001a\u0004\u0018\u000108J\u0018\u0010v\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u0011H\u0007J\u000e\u0010x\u001a\u00020T2\u0006\u0010Y\u001a\u000208J\u0010\u0010y\u001a\u00020T2\u0006\u0010z\u001a\u00020{H\u0007J\u000e\u0010|\u001a\u00020T2\u0006\u0010}\u001a\u000208J\u0006\u0010~\u001a\u00020TJ\b\u0010\u001a\u00020TH\u0002J\u0007\u0010\u0001\u001a\u00020TR)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0004¢\u0006\u0002\n\u0000Rc\u0010\u001d\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001aj\u0002`\u001c2\"\u0010\u0019\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001aj\u0002`\u001c8B@BX\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b02X\u0004¢\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010\rR\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002040\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00078F¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u0002080CX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0CX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010\rR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00078F¢\u0006\u0006\u001a\u0004\bK\u0010\rR\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010O\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0PX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "Lcom/iqoption/chat/repository/PublicTypingListener;", "Lcom/iqoption/chat/repository/TypingListener;", "()V", "adapterItems", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getAdapterItems", "()Landroidx/lifecycle/LiveData;", "adapterItemsData", "Landroidx/lifecycle/MutableLiveData;", "canLoadMore", "", "getCanLoadMore", "()Z", "canLoadMoreInternal", "chatRoom", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getChatRoom", "chatRoomData", "<set-?>", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Lcom/iqoption/chat/viewmodel/MessagesConverter;", "converter", "getConverter", "()Lkotlin/jvm/functions/Function1;", "setConverter", "(Lkotlin/jvm/functions/Function1;)V", "converter$delegate", "Lkotlin/properties/ReadWriteProperty;", "diffCallback", "Lcom/iqoption/chat/viewmodel/RoomViewModel$DiffCallback;", "initialized", "isDenying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isResolving", "loadingMissing", "loadingMore", "messageFilter", "Lcom/iqoption/chat/viewmodel/MessageFilter;", "messageList", "messageLock", "", "messagesToMerge", "", "rateSupportEvent", "Lcom/iqoption/chat/component/RateSupportEvent;", "getRateSupportEvent", "rateSupportEventData", "roomId", "", "getRoomId", "()Ljava/lang/String;", "roomIdInternal", "roomTypeInternal", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "sendMessageEvent", "Lcom/iqoption/chat/component/ResultEvent;", "getSendMessageEvent", "sendMessageEventData", "sendTextTypingLimiter", "Lcom/iqoption/chat/viewmodel/RoomViewModel$WorkLimiter;", "sendTypingLimiter", "Ljava/lang/Void;", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "getState", "typingEvent", "Lcom/iqoption/chat/viewmodel/RoomViewModel$TypingInfo;", "getTypingEvent", "typingEventData", "typingHandler", "Landroid/os/Handler;", "typingMap", "", "Lcom/iqoption/core/microservices/chat/event/ChatTypingUser;", "", "convertAndPostResult", "", "messages", "setLastSeen", "convertToAdapterItems", "denySupportBot", "message", "init", "roomType", "isInitialized", "loadData", "loadMissing", "firstMsg", "src", "diff", "loadMoreMessages", "markRoomRead", "merge", "mergeAndPostResult", "onChatPublicTypingEvent", "event", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "onChatTypingEvent", "onCleared", "onMessageEvent", "onTyping", "postRateSupportEvent", "messageId", "success", "error", "postSendMessageEvent", "postTypingEvent", "rateSupport", "rating", "comment", "resolveSupport", "isResolved", "sendMessage", "sendSuggestion", "suggestion", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "sendTextTyping", "text", "sendTyping", "setLastSeenMessage", "subscribeForTyping", "Companion", "DiffCallback", "TypingInfo", "WorkLimiter", "chat_release"})
/* compiled from: RoomViewModel.kt */
public final class k extends com.iqoption.core.ui.f.d implements com.iqoption.chat.c.a.a {
    private static final String TAG;
    public static final a aYb = new a();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "converter", "getConverter()Lkotlin/jvm/functions/Function1;"))};
    private boolean aXF;
    private final MutableLiveData<com.iqoption.core.microservices.chat.response.k> aXG = new MutableLiveData();
    private final MutableLiveData<Pair<List<com.iqoption.chat.component.y>, DiffResult>> aXH = new MutableLiveData();
    private final MutableLiveData<com.iqoption.chat.component.ag> aXI = new MutableLiveData();
    private final MutableLiveData<com.iqoption.chat.component.af> aXJ = new MutableLiveData();
    private final Object aXK = new Object();
    private final j aXL = new j();
    private List<com.iqoption.core.microservices.chat.response.e> aXM;
    private final List<com.iqoption.core.microservices.chat.response.e> aXN = new ArrayList();
    private AtomicBoolean aXO = new AtomicBoolean();
    private String aXP = "unknown";
    private ChatRoomType aXQ = ChatRoomType.SUPPORT;
    private boolean aXR = true;
    private final Map<com.iqoption.core.microservices.chat.a.e, Integer> aXS = new LinkedHashMap();
    private final MutableLiveData<c> aXT = new MutableLiveData();
    private final Handler aXU = new Handler();
    private final b aXV = new b();
    private final kotlin.f.d aXW = kotlin.f.a.eWg.bnQ();
    private final d<Void> aXX = new d(new RoomViewModel$sendTypingLimiter$1(this), null, null, 6, null);
    private final d<String> aXY = new d(new RoomViewModel$sendTextTypingLimiter$1(this), null, null, 6, null);
    private final AtomicBoolean aXZ = new AtomicBoolean();
    private final AtomicBoolean aYa = new AtomicBoolean();
    private boolean initialized;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomViewModel$Companion;", "", "()V", "TAG", "", "get", "Lcom/iqoption/chat/viewmodel/RoomViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "chat_release"})
    /* compiled from: RoomViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final k m(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(k.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…oomViewModel::class.java]");
            return (k) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomViewModel$TypingInfo;", "", "name", "", "count", "", "(Ljava/lang/String;I)V", "getCount", "()I", "getName", "()Ljava/lang/String;", "chat_release"})
    /* compiled from: RoomViewModel.kt */
    public static final class c {
        private final int count;
        private final String name;

        public c(String str, int i) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            this.name = str;
            this.count = i;
        }

        public final int getCount() {
            return this.count;
        }

        public final String getName() {
            return this.name;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomViewModel$WorkLimiter;", "T", "", "callback", "Lkotlin/Function1;", "", "rateLimiter", "Lcom/google/common/util/concurrent/RateLimiter;", "scheduler", "Ljava/util/concurrent/Executor;", "(Lkotlin/jvm/functions/Function1;Lcom/google/common/util/concurrent/RateLimiter;Ljava/util/concurrent/Executor;)V", "lastArg", "Ljava/lang/Object;", "doWork", "arg", "(Ljava/lang/Object;)V", "chat_release"})
    /* compiled from: RoomViewModel.kt */
    public static final class d<T> {
        private volatile T aYe;
        private final kotlin.jvm.a.b<T, kotlin.l> aYf;
        private final com.google.common.util.concurrent.z aYg;
        private final Executor aYh;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "T", "run"})
        /* compiled from: RoomViewModel.kt */
        static final class a implements Runnable {
            final /* synthetic */ d aYi;

            a(d dVar) {
                this.aYi = dVar;
            }

            public final void run() {
                this.aYi.aYg.vJ();
                Object b = this.aYi.aYe;
                if (b != null) {
                    this.aYi.aYf.invoke(b);
                }
                this.aYi.aYe = null;
            }
        }

        public d(kotlin.jvm.a.b<? super T, kotlin.l> bVar, com.google.common.util.concurrent.z zVar, Executor executor) {
            kotlin.jvm.internal.i.f(bVar, "callback");
            kotlin.jvm.internal.i.f(zVar, "rateLimiter");
            kotlin.jvm.internal.i.f(executor, "scheduler");
            this.aYf = bVar;
            this.aYg = zVar;
            this.aYh = executor;
        }

        public /* synthetic */ d(kotlin.jvm.a.b bVar, com.google.common.util.concurrent.z zVar, Executor executor, int i, f fVar) {
            if ((i & 2) != 0) {
                zVar = com.google.common.util.concurrent.z.a(1.0d, 1, TimeUnit.SECONDS);
                kotlin.jvm.internal.i.e(zVar, "RateLimiter.create(1.0, 1, TimeUnit.SECONDS)");
            }
            if ((i & 4) != 0) {
                com.google.common.util.concurrent.w wVar = com.iqoption.core.c.a.biL;
                kotlin.jvm.internal.i.e(wVar, "Schedulers.io");
                executor = wVar;
            }
            this(bVar, zVar, executor);
        }

        public final void bE(T t) {
            if (this.aYg.tryAcquire()) {
                this.aYf.invoke(t);
                return;
            }
            Object obj = this.aYe == null ? 1 : null;
            this.aYe = t;
            if (obj == null) {
                this.aYh.execute(new a(this));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class r<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((com.iqoption.core.microservices.chat.response.e) t).getDate()), Long.valueOf(((com.iqoption.core.microservices.chat.response.e) t2).getDate()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: RoomViewModel.kt */
    static final class s implements Runnable {
        final /* synthetic */ com.iqoption.core.microservices.chat.a.e aYq;
        final /* synthetic */ k this$0;

        s(k kVar, com.iqoption.core.microservices.chat.a.e eVar) {
            this.this$0 = kVar;
            this.aYq = eVar;
        }

        public final void run() {
            Integer num = (Integer) this.this$0.aXS.get(this.aYq);
            int intValue = (num != null ? num.intValue() : 1) - 1;
            if (intValue == 0) {
                this.this$0.aXS.remove(this.aYq);
            } else {
                this.this$0.aXS.put(this.aYq, Integer.valueOf(intValue));
            }
            this.this$0.TJ();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class aa<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ k this$0;

        aa(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.d(false, th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class ab<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.e>> {
        public static final ab aYu = new ab();

        ab() {
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.e> cVar) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class ac<T> implements io.reactivex.b.f<Throwable> {
        public static final ac aYv = new ac();

        ac() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class ad<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.a.d> {
        final /* synthetic */ k this$0;

        ad(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: d */
        public final void accept(com.iqoption.core.microservices.chat.a.d dVar) {
            k kVar = this.this$0;
            kotlin.jvm.internal.i.e(dVar, "it");
            kVar.b(dVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class ae<T> implements io.reactivex.b.f<Throwable> {
        public static final ae aYA = new ae();

        ae() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class af<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.a.d> {
        final /* synthetic */ k this$0;

        af(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: d */
        public final void accept(com.iqoption.core.microservices.chat.a.d dVar) {
            k kVar = this.this$0;
            kotlin.jvm.internal.i.e(dVar, "it");
            kVar.a(dVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class ag<T> implements io.reactivex.b.f<Throwable> {
        public static final ag aYB = new ag();

        ag() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomViewModel$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "()V", "idSupplier", "Lcom/iqoption/chat/component/MessageIdSupplier;", "newList", "", "Lcom/iqoption/chat/component/MessageAdapterItem;", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "oldList", "getOldList", "setOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "reset", "", "chat_release"})
    /* compiled from: RoomViewModel.kt */
    private static final class b extends Callback {
        private final com.iqoption.chat.component.z aPc = new com.iqoption.chat.component.z();
        private List<? extends com.iqoption.chat.component.y> aYc = m.emptyList();
        private List<? extends com.iqoption.chat.component.y> aYd = m.emptyList();

        public final void ag(List<? extends com.iqoption.chat.component.y> list) {
            kotlin.jvm.internal.i.f(list, "<set-?>");
            this.aYc = list;
        }

        public final void ah(List<? extends com.iqoption.chat.component.y> list) {
            kotlin.jvm.internal.i.f(list, "<set-?>");
            this.aYd = list;
        }

        public int getOldListSize() {
            return this.aYc.size();
        }

        public int getNewListSize() {
            return this.aYd.size();
        }

        public boolean areItemsTheSame(int i, int i2) {
            return this.aPc.a((com.iqoption.chat.component.y) this.aYc.get(i)) == this.aPc.a((com.iqoption.chat.component.y) this.aYd.get(i2));
        }

        public boolean areContentsTheSame(int i, int i2) {
            return kotlin.jvm.internal.i.y((com.iqoption.chat.component.y) this.aYc.get(i), (com.iqoption.chat.component.y) this.aYd.get(i2));
        }

        public final void reset() {
            this.aYc = m.emptyList();
            this.aYd = m.emptyList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.j> {
        final /* synthetic */ k this$0;

        e(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.chat.response.j jVar) {
            this.this$0.aYa.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ k this$0;

        f(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.aYa.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "it", "", "apply"})
    /* compiled from: RoomViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g aYj = new g();

        g() {
        }

        /* renamed from: ad */
        public final com.iqoption.core.microservices.chat.response.k apply(List<com.iqoption.core.microservices.chat.response.k> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                Object obj;
                if (((com.iqoption.core.microservices.chat.response.k) next).SG() == ChatRoomType.SUPPORT) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            return (com.iqoption.core.microservices.chat.response.k) next2;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.k> {
        final /* synthetic */ k this$0;

        h(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: f */
        public final void accept(com.iqoption.core.microservices.chat.response.k kVar) {
            if (kVar != null) {
                this.this$0.c(kVar.getId(), kVar.SG());
                this.this$0.TP();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class i<T> implements io.reactivex.b.f<Throwable> {
        public static final i aYk = new i();

        i() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class j<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.k> {
        final /* synthetic */ k this$0;

        j(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: f */
        public final void accept(com.iqoption.core.microservices.chat.response.k kVar) {
            this.this$0.aXG.postValue(kVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class k<T> implements io.reactivex.b.f<Throwable> {
        public static final k aYl = new k();

        k() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestions;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class l<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.n>> {
        final /* synthetic */ k this$0;

        l(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.n> cVar) {
            this.this$0.i((kotlin.jvm.a.b) new p(((com.iqoption.core.microservices.chat.response.n) cVar.getData()).acv(), new RoomViewModel$loadData$3$1(this), new RoomViewModel$loadData$3$2(this)));
            this.this$0.TN();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class m<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ k this$0;

        m(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.i((kotlin.jvm.a.b) new p(m.emptyList(), new RoomViewModel$loadData$4$1(this), new RoomViewModel$loadData$4$2(this)));
            this.this$0.TN();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/chat/viewmodel/RoomViewModel$loadMissing$3$1"})
    /* compiled from: RoomViewModel.kt */
    static final class n<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ com.iqoption.core.microservices.chat.response.e aYm;
        final /* synthetic */ List aYn;
        final /* synthetic */ k this$0;

        n(k kVar, com.iqoption.core.microservices.chat.response.e eVar, List list) {
            this.this$0 = kVar;
            this.aYm = eVar;
            this.aYn = list;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            k kVar = this.this$0;
            kotlin.jvm.internal.i.e(list, "it");
            k.a(kVar, (List) list, this.aYn, false, 4, null);
            Pair pair = new Pair(u.bU(list), u.bW(list));
            this.this$0.aXO.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "com/iqoption/chat/viewmodel/RoomViewModel$loadMissing$3$2"})
    /* compiled from: RoomViewModel.kt */
    static final class o<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ com.iqoption.core.microservices.chat.response.e aYm;
        final /* synthetic */ List aYn;
        final /* synthetic */ k this$0;

        o(k kVar, com.iqoption.core.microservices.chat.response.e eVar, List list) {
            this.this$0 = kVar;
            this.aYm = eVar;
            this.aYn = list;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.aXO.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class p<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ long aYo;
        final /* synthetic */ k this$0;

        p(k kVar, long j) {
            this.this$0 = kVar;
            this.aYo = j;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            this.this$0.aXF = false;
            this.this$0.aXR = list.size() == 20;
            synchronized (this.this$0.aXK) {
                kotlin.l lVar;
                if (this.aYo == 0) {
                    k kVar = this.this$0;
                    kotlin.jvm.internal.i.e(list, "newMessages");
                    k.a(kVar, (List) list, this.this$0.aXN, false, 4, null);
                    lVar = kotlin.l.eVB;
                } else {
                    List e = this.this$0.aXM;
                    if (e != null) {
                        Collection collection = e;
                        kotlin.jvm.internal.i.e(list, "newMessages");
                        List b = u.b(collection, (Iterable) list);
                        this.this$0.aXM = b;
                        this.this$0.b(b, false);
                        lVar = kotlin.l.eVB;
                    }
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class q<T> implements io.reactivex.b.f<Throwable> {
        public static final q aYp = new q();

        q() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatResponse;", "apply"})
    /* compiled from: RoomViewModel.kt */
    static final class t<T, R> implements io.reactivex.b.g<T, R> {
        public static final t aYr = new t();

        t() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(b((com.iqoption.core.microservices.chat.response.j) obj));
        }

        public final boolean b(com.iqoption.core.microservices.chat.response.j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            if (jVar.isSuccessful()) {
                return true;
            }
            throw new RuntimeException(jVar.getErrorMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: RoomViewModel.kt */
    static final class u<T> implements io.reactivex.b.f<Boolean> {
        final /* synthetic */ String aYs;
        final /* synthetic */ k this$0;

        u(k kVar, String str) {
            this.this$0 = kVar;
            this.aYs = str;
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            k.a(this.this$0, this.aYs, true, null, 4, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class v<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ String aYs;
        final /* synthetic */ k this$0;

        v(k kVar, String str) {
            this.this$0 = kVar;
            this.aYs = str;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.a(this.aYs, false, th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class w<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.j> {
        final /* synthetic */ k this$0;

        w(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.chat.response.j jVar) {
            this.this$0.aXZ.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class x<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ k this$0;

        x(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.this$0.aXZ.set(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "it", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "apply"})
    /* compiled from: RoomViewModel.kt */
    static final class y<T, R> implements io.reactivex.b.g<T, R> {
        public static final y aYt = new y();

        y() {
        }

        /* renamed from: c */
        public final com.iqoption.core.microservices.chat.response.e apply(com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.e> cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            if (cVar.isSuccessful()) {
                return (com.iqoption.core.microservices.chat.response.e) cVar.getData();
            }
            throw new RuntimeException(cVar.getErrorMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomViewModel.kt */
    static final class z<T> implements io.reactivex.b.f<com.iqoption.core.microservices.chat.response.e> {
        final /* synthetic */ k this$0;

        z(k kVar) {
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final void accept(com.iqoption.core.microservices.chat.response.e eVar) {
            this.this$0.aa(l.listOf(eVar));
            k.a(this.this$0, true, null, 2, null);
        }
    }

    private final kotlin.jvm.a.b<List<com.iqoption.core.microservices.chat.response.e>, List<com.iqoption.chat.component.y>> TK() {
        return (kotlin.jvm.a.b) this.aXW.b(this, anY[0]);
    }

    private final void i(kotlin.jvm.a.b<? super List<com.iqoption.core.microservices.chat.response.e>, ? extends List<? extends com.iqoption.chat.component.y>> bVar) {
        this.aXW.a(this, anY[0], bVar);
    }

    public k() {
        com.iqoption.chat.c.a.aVS.a(this);
        com.iqoption.chat.c.c.aWg.SW();
    }

    static {
        String simpleName = k.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RoomViewModel::class.java.simpleName");
        TAG = simpleName;
    }

    public final LiveData<com.iqoption.core.microservices.chat.response.k> TD() {
        return this.aXG;
    }

    public final LiveData<Pair<List<com.iqoption.chat.component.y>, DiffResult>> TE() {
        return this.aXH;
    }

    public final LiveData<com.iqoption.chat.component.ag> TF() {
        return this.aXI;
    }

    public final LiveData<com.iqoption.chat.component.af> TG() {
        return this.aXJ;
    }

    public final LiveData<com.iqoption.core.microservices.chat.response.l> getState() {
        return com.iqoption.chat.c.c.aWg.getState();
    }

    public final String SJ() {
        return this.aXP;
    }

    public final boolean TH() {
        return this.aXR;
    }

    public final LiveData<c> TI() {
        return this.aXT;
    }

    public void aa(List<com.iqoption.core.microservices.chat.response.e> list) {
        kotlin.jvm.internal.i.f(list, "messages");
        com.iqoption.core.microservices.chat.response.k kVar = (com.iqoption.core.microservices.chat.response.k) this.aXG.getValue();
        if (kVar != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.chat.response.e) next).SJ(), kVar.getId())) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (!list2.isEmpty()) {
                synchronized (this.aXK) {
                    kotlin.l lVar;
                    if (this.aXM != null) {
                        a(this, list2, null, false, 6, null);
                        lVar = kotlin.l.eVB;
                    } else {
                        this.aXN.addAll(list2);
                        for (Object next2 : this.aXN) {
                            if ((((com.iqoption.core.microservices.chat.response.e) next2).aci() ^ 1) != 0) {
                                break;
                            }
                        }
                        Object next22 = null;
                        com.iqoption.core.microservices.chat.response.e eVar = (com.iqoption.core.microservices.chat.response.e) next22;
                        if (eVar != null) {
                            com.iqoption.core.microservices.chat.response.k.bqO.am(SJ(), eVar.getId());
                            lVar = kotlin.l.eVB;
                        }
                    }
                }
            }
        }
    }

    public void a(com.iqoption.core.microservices.chat.a.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "event");
        c(dVar);
    }

    public void b(com.iqoption.core.microservices.chat.a.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "event");
        c(dVar);
    }

    private final void TJ() {
        int size = this.aXS.keySet().size();
        this.aXT.postValue(new c(size == 1 ? ((com.iqoption.core.microservices.chat.a.e) u.J(this.aXS.keySet())).getName() : "", size));
    }

    private final void c(com.iqoption.core.microservices.chat.a.d dVar) {
        if ((kotlin.jvm.internal.i.y(this.aXP, dVar.SJ()) ^ 1) == 0) {
            com.iqoption.core.microservices.chat.a.e abN = dVar.abN();
            Integer num = (Integer) this.aXS.get(abN);
            if (num == null || num.intValue() == 0) {
                this.aXS.put(abN, Integer.valueOf(1));
            } else {
                this.aXS.put(abN, Integer.valueOf(num.intValue() + 1));
            }
            TJ();
            this.aXU.postDelayed(new s(this, abN), 3000);
        }
    }

    private final void a(List<com.iqoption.core.microservices.chat.response.e> list, List<com.iqoption.core.microservices.chat.response.e> list2, boolean z) {
        List d = d((List) list2, (List) list);
        this.aXM = d;
        b(d, z);
    }

    private final void b(List<com.iqoption.core.microservices.chat.response.e> list, boolean z) {
        MutableLiveData mutableLiveData = this.aXH;
        kotlin.jvm.a.b bVar = this.aXL;
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        mutableLiveData.postValue(af((List) arrayList));
        if (z) {
            TL();
        }
    }

    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r1 != null) goto L_0x0019;
     */
    private final kotlin.Pair<java.util.List<com.iqoption.chat.component.y>, androidx.recyclerview.widget.DiffUtil.DiffResult> af(java.util.List<com.iqoption.core.microservices.chat.response.e> r3) {
        /*
        r2 = this;
        r0 = r2.aXV;
        r1 = r2.aXH;
        r1 = r1.getValue();
        r1 = (kotlin.Pair) r1;
        if (r1 == 0) goto L_0x0015;
    L_0x000c:
        r1 = r1.getFirst();
        r1 = (java.util.List) r1;
        if (r1 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0019;
    L_0x0015:
        r1 = kotlin.collections.m.emptyList();
    L_0x0019:
        r0.ag(r1);
        r0 = r2.TK();
        r3 = r0.invoke(r3);
        r3 = (java.util.List) r3;
        r0 = r2.aXV;
        r0.ah(r3);
        r0 = r2.aXV;
        r0 = (androidx.recyclerview.widget.DiffUtil.Callback) r0;
        r1 = 0;
        r0 = androidx.recyclerview.widget.DiffUtil.calculateDiff(r0, r1);
        r1 = "DiffUtil.calculateDiff(diffCallback, false)";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r2.aXV;
        r1.reset();
        r1 = new kotlin.Pair;
        r1.<init>(r3, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.viewmodel.k.af(java.util.List):kotlin.Pair");
    }

    private final void TL() {
        List list = this.aXM;
        if (list != null) {
            com.iqoption.core.microservices.chat.response.e eVar = (com.iqoption.core.microservices.chat.response.e) u.bV(list);
            if (eVar != null) {
                com.iqoption.core.microservices.chat.response.k.bqO.am(SJ(), eVar.getId());
            }
        }
    }

    private final List<com.iqoption.core.microservices.chat.response.e> d(List<com.iqoption.core.microservices.chat.response.e> list, List<com.iqoption.core.microservices.chat.response.e> list2) {
        if (list.isEmpty()) {
            return list2;
        }
        List<com.iqoption.core.microservices.chat.response.e> I = u.I(list);
        Pair x = kotlin.j.x(u.bU(I), u.bW(I));
        com.iqoption.core.microservices.chat.response.e eVar = (com.iqoption.core.microservices.chat.response.e) x.bnj();
        com.iqoption.core.microservices.chat.response.e eVar2 = (com.iqoption.core.microservices.chat.response.e) x.bnk();
        long date = eVar.getDate();
        long date2 = eVar2.getDate();
        for (com.iqoption.core.microservices.chat.response.e eVar3 : u.a((Iterable) list2, (Comparator) new r())) {
            int i = 0;
            if (eVar3.aci()) {
                for (com.iqoption.core.microservices.chat.response.e id : I) {
                    if (kotlin.jvm.internal.i.y(id.getId(), eVar3.getId())) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i != -1) {
                    I.set(i, eVar3);
                }
            } else if (eVar3.getDate() <= date) {
                long date3 = eVar3.getDate();
                if (date2 <= date3) {
                    if (date >= date3) {
                        int i2 = 0;
                        for (com.iqoption.core.microservices.chat.response.e id2 : I) {
                            if (kotlin.jvm.internal.i.y(id2.getId(), eVar3.getId())) {
                                break;
                            }
                            i2++;
                        }
                        i2 = -1;
                        if (i2 != -1) {
                            I.set(i2, eVar3);
                        } else {
                            for (com.iqoption.core.microservices.chat.response.e id3 : I) {
                                if (kotlin.jvm.internal.i.y(id3.getId(), eVar3.acl())) {
                                    break;
                                }
                                i++;
                            }
                            i = -1;
                            if (i != -1) {
                                I.add(i, eVar3);
                            }
                        }
                    }
                }
            } else if (kotlin.jvm.internal.i.y(eVar.getId(), eVar3.acl())) {
                I.add(0, eVar3);
                date = eVar3.getDate();
                eVar = eVar3;
            } else if (!this.aXO.get()) {
                this.aXO.set(true);
                a(eVar, (List) I, (List) list2);
            }
        }
        return I;
    }

    private final void a(com.iqoption.core.microservices.chat.response.e eVar, List<com.iqoption.core.microservices.chat.response.e> list, List<com.iqoption.core.microservices.chat.response.e> list2) {
        Object obj;
        Collection arrayList = new ArrayList();
        for (Object next : list2) {
            if ((((com.iqoption.core.microservices.chat.response.e) next).aci() ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        Iterator it = ((List) arrayList).iterator();
        if (it.hasNext()) {
            Object next2 = it.next();
            long date = ((com.iqoption.core.microservices.chat.response.e) next2).getDate();
            while (it.hasNext()) {
                Object next3 = it.next();
                long date2 = ((com.iqoption.core.microservices.chat.response.e) next3).getDate();
                if (date < date2) {
                    next2 = next3;
                    date = date2;
                }
            }
            obj = next2;
        } else {
            obj = null;
        }
        com.iqoption.core.microservices.chat.response.e eVar2 = (com.iqoption.core.microservices.chat.response.e) obj;
        if (eVar2 != null) {
            com.iqoption.chat.c.a.a(com.iqoption.chat.c.a.aVS, SJ(), eVar.getId(), eVar2.getId(), 0, 8, null).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new n(this, eVar, list), (io.reactivex.b.f) new o(this, eVar, list));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aXU.removeCallbacks(null);
        com.iqoption.chat.c.a.aVS.b(this);
    }

    public final void b(String str, ChatRoomType chatRoomType) {
        kotlin.jvm.internal.i.f(str, "roomId");
        kotlin.jvm.internal.i.f(chatRoomType, "roomType");
        if (kotlin.jvm.internal.i.y(str, "unknown")) {
            kotlin.jvm.internal.i.e(com.iqoption.chat.c.b.aVX.SU().t(g.aYj).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new h(this), (io.reactivex.b.f) i.aYk), "RoomRepository.getRooms(…                   }, {})");
            return;
        }
        c(str, chatRoomType);
        TP();
    }

    private final void c(String str, ChatRoomType chatRoomType) {
        if (!this.initialized) {
            this.aXP = str;
            this.aXQ = chatRoomType;
            this.initialized = true;
            com.iqoption.chat.c.b.aVX.fb(str).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new j(this), (io.reactivex.b.f) k.aYl);
            if (chatRoomType == ChatRoomType.SUPPORT) {
                kotlin.jvm.internal.i.e(com.iqoption.core.microservices.chat.a.bpz.gn(this.aXP).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new l(this), (io.reactivex.b.f) new m(this)), "ChatRequests.requestChat…                       })");
                return;
            }
            i((kotlin.jvm.a.b) new d(new RoomViewModel$loadData$5(this), new RoomViewModel$loadData$6(this)));
            TN();
        }
    }

    public final void TM() {
        TL();
        com.iqoption.chat.c.b.aVX.fc(SJ());
    }

    public final void TN() {
        if (this.initialized) {
            List list = this.aXM;
            com.iqoption.core.microservices.chat.response.e eVar = list != null ? (com.iqoption.core.microservices.chat.response.e) u.bW(list) : null;
            if (!this.aXF && TH()) {
                this.aXF = true;
                long date = eVar != null ? eVar.getDate() : 0;
                com.iqoption.chat.c.a.aVS.a(SJ(), date, 20).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new p(this, date), (io.reactivex.b.f) q.aYp);
            }
        }
    }

    public final void fk(String str) {
        kotlin.jvm.internal.i.f(str, "message");
        com.iqoption.core.microservices.chat.a.a(com.iqoption.core.microservices.chat.a.bpz, SJ(), null, str, null, null, 26, null).t(y.aYt).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new z(this), (io.reactivex.b.f) new aa(this));
    }

    static /* synthetic */ void a(k kVar, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = (String) null;
        }
        kVar.d(z, str);
    }

    private final void d(boolean z, String str) {
        this.aXI.postValue(new com.iqoption.chat.component.ag(SystemClock.elapsedRealtime(), z, str));
    }

    public final void b(String str, int i, String str2) {
        kotlin.jvm.internal.i.f(str, "messageId");
        String str3 = null;
        if (!(str2 == null || (u.Y(str2) ^ 1) == 0)) {
            str3 = str2;
        }
        com.iqoption.core.microservices.chat.a.bpz.c(str, i, str3).t(t.aYr).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new u(this, str), (io.reactivex.b.f) new v(this, str));
    }

    private final void a(String str, boolean z, String str2) {
        this.aXJ.postValue(new com.iqoption.chat.component.af(str, SystemClock.elapsedRealtime(), z, str2));
    }

    public final void TO() {
        this.aXX.bE(null);
    }

    public final void fl(String str) {
        kotlin.jvm.internal.i.f(str, "text");
        this.aXY.bE(str);
    }

    public final void TP() {
        String str = "ChatRequests.getChatTypi…                   }, {})";
        io.reactivex.disposables.b a;
        if (this.aXQ == ChatRoomType.SUPPORT || this.aXQ == ChatRoomType.VIP) {
            a = com.iqoption.core.microservices.chat.a.bpz.abF().d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new ad(this), (io.reactivex.b.f) ae.aYA);
            kotlin.jvm.internal.i.e(a, str);
            b(a);
        } else if (this.aXQ == ChatRoomType.GLOBAL) {
            a = com.iqoption.core.microservices.chat.a.bpz.gq(this.aXP).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new af(this), (io.reactivex.b.f) ag.aYB);
            kotlin.jvm.internal.i.e(a, str);
            b(a);
        }
    }

    @MainThread
    public final void c(com.iqoption.core.microservices.chat.response.e eVar, boolean z) {
        kotlin.jvm.internal.i.f(eVar, "message");
        if (!this.aXZ.get()) {
            this.aXZ.set(true);
            com.iqoption.core.microservices.chat.a.bpz.p(eVar.getId(), z).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new w(this), (io.reactivex.b.f) new x(this));
        }
    }

    @MainThread
    public final void g(com.iqoption.core.microservices.chat.response.e eVar) {
        kotlin.jvm.internal.i.f(eVar, "message");
        if (!this.aYa.get()) {
            this.aYa.set(true);
            com.iqoption.core.microservices.chat.a.bpz.gm(eVar.getId()).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) new f(this));
        }
    }

    @MainThread
    public final void c(com.iqoption.core.microservices.chat.response.m mVar) {
        kotlin.jvm.internal.i.f(mVar, "suggestion");
        com.iqoption.core.microservices.chat.a.a(com.iqoption.core.microservices.chat.a.bpz, SJ(), null, mVar.getName(), null, mVar.getId(), 10, null).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) ab.aYu, (io.reactivex.b.f) ac.aYv);
    }
}
