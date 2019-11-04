package com.iqoption.core.connect.bus;

import com.iqoption.core.connect.f;
import com.iqoption.core.d.c;
import io.reactivex.e;
import io.reactivex.o;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.Executors;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002klB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020RH\u0016J\u0010\u0010U\u001a\u00020V2\u0006\u0010S\u001a\u00020\u0004H\u0002J\u0014\u0010W\u001a\u00020V2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010%H\u0002J\u001d\u0010Y\u001a\u00020V2\u0006\u0010Z\u001a\u00020\u00042\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\H\bJ\u001d\u0010]\u001a\u00020V2\u0006\u0010Z\u001a\u00020\u00042\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\H\bJ:\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002Ha0`0_\"\u0004\b\u0000\u0010a2\f\u0010b\u001a\b\u0012\u0004\u0012\u0002Ha0c2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u0002Ha0eJ\u000e\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u0004\u0018\u00010\u0004*\u000207H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0002R\u000e\u0010\u0019\u001a\u00020\u001aXT¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001d0\u001d0\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R+\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%8B@BX\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010.0.0\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\n \u0017*\u0004\u0018\u00010707X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u000e\u0010:\u001a\u00020;X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020?8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020?0CX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020?0EX\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R\u001b\u0010K\u001a\u00020L8@X\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bM\u0010N¨\u0006m"}, bng = {"Lcom/iqoption/core/connect/bus/IQBusImpl;", "Lcom/iqoption/core/connect/IQBus;", "()V", "EVENT_HEARTBEAT", "", "EVENT_PROFILE", "EVENT_TIME_SYNC", "KEY_MICROSERVICE", "KEY_MSG", "KEY_NAME", "KEY_REQUEST_ID", "KEY_STATUS", "LOGGING_ENABLED", "", "getLOGGING_ENABLED", "()Z", "setLOGGING_ENABLED", "(Z)V", "MESSAGE_SEND", "MESSAGE_SUBSCRIBE", "MESSAGE_UNSUBSCRIBE", "PATH_WS", "TAG", "kotlin.jvm.PlatformType", "TAG$annotations", "TIMEOUT", "", "commandProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/iqoption/core/connect/bus/CommandMessage;", "getCommandProcessor$core_release", "()Lio/reactivex/processors/PublishProcessor;", "connection", "Lio/reactivex/disposables/CompositeDisposable;", "disconnectLock", "", "<set-?>", "Lcom/iqoption/core/connect/bus/IQBusError;", "disconnectReason", "getDisconnectReason", "()Lcom/iqoption/core/connect/bus/IQBusError;", "setDisconnectReason", "(Lcom/iqoption/core/connect/bus/IQBusError;)V", "disconnectReason$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventProcessor", "Lcom/iqoption/core/connect/bus/IQBusMessage;", "getEventProcessor$core_release", "heartbeatListener", "Lcom/iqoption/core/connect/bus/IQBusImpl$TimeListener;", "getHeartbeatListener", "()Lcom/iqoption/core/connect/bus/IQBusImpl$TimeListener;", "setHeartbeatListener", "(Lcom/iqoption/core/connect/bus/IQBusImpl$TimeListener;)V", "jsonReader", "Lcom/iqoption/core/util/json/ReusableJsonReader;", "getJsonReader$core_release", "()Lcom/iqoption/core/util/json/ReusableJsonReader;", "scheduler", "Lio/reactivex/Scheduler;", "selfDisconnect", "Lio/reactivex/disposables/SerialDisposable;", "state", "Lcom/iqoption/core/connect/bus/IQBusState;", "getState", "()Lcom/iqoption/core/connect/bus/IQBusState;", "stateProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "stateStream", "Lio/reactivex/Flowable;", "getStateStream", "()Lio/reactivex/Flowable;", "timeSyncListener", "getTimeSyncListener", "setTimeSyncListener", "ws", "Lcom/iqoption/core/connect/ws/WebSocketDelegate;", "getWs$core_release", "()Lcom/iqoption/core/connect/ws/WebSocketDelegate;", "ws$delegate", "Lkotlin/Lazy;", "connect", "Lio/reactivex/Completable;", "ssid", "disconnect", "doConnect", "", "doDisconnect", "reason", "logDebug", "msg", "error", "", "logError", "sendCommand", "Lio/reactivex/Single;", "Lcom/iqoption/core/connect/bus/CommandResult;", "T", "command", "Lcom/iqoption/core/connect/bus/Command;", "parser", "Lkotlin/Function1;", "Lcom/google/gson/stream/JsonReader;", "sendSubscription", "subscription", "Lcom/iqoption/core/connect/bus/Subscription;", "readName", "Parser", "TimeListener", "core_release"})
/* compiled from: IQBusImpl.kt */
public final class b implements f {
    private static final String TAG = b.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "ws", "getWs$core_release()Lcom/iqoption/core/connect/ws/WebSocketDelegate;")), k.a(new MutablePropertyReference1Impl(k.G(b.class), "disconnectReason", "getDisconnectReason()Lcom/iqoption/core/connect/bus/IQBusError;"))};
    private static final d bac = g.c(IQBusImpl$ws$2.bap);
    private static final com.iqoption.core.util.a.a bad = com.iqoption.core.util.a.a.cL(true);
    private static final PublishProcessor<Object> bae;
    private static final PublishProcessor<Object> baf;
    private static final io.reactivex.disposables.a bag = new io.reactivex.disposables.a();
    private static final io.reactivex.disposables.d bah = new io.reactivex.disposables.d();
    private static final Object bai = new Object();
    private static final com.iqoption.core.rx.d<IQBusState> baj = com.iqoption.core.rx.d.bER.bQ(IQBusState.DISCONNECTED);
    private static final e<IQBusState> bak;
    private static final kotlin.f.d bal = c.bK(c.baq);
    private static a ban;
    public static final b bao = new b();
    private static final o scheduler;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/connect/bus/IQBusImpl$TimeListener;", "", "onUpdate", "", "time", "", "core_release"})
    /* compiled from: IQBusImpl.kt */
    public interface a {
    }

    static {
        o b = io.reactivex.d.a.b(Executors.newSingleThreadExecutor());
        kotlin.jvm.internal.i.e(b, "Schedulers.from(Executor…ewSingleThreadExecutor())");
        scheduler = b;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<CommandMessage>()");
        bae = bmK;
        bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<IQBusMessage>()");
        baf = bmK;
        e c = baj.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "stateProcessor.observeOn(bg)");
        bak = c;
    }

    private b() {
    }

    public e<IQBusState> Ux() {
        return bak;
    }

    public IQBusState Uy() {
        IQBusState iQBusState = (IQBusState) baj.getValue();
        return iQBusState != null ? iQBusState : IQBusState.DISCONNECTED;
    }

    public final void a(a aVar) {
        ban = aVar;
    }
}
