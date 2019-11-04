package io.reactivex.internal.operators.flowable;

import io.reactivex.b.f;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableReplay<T> extends io.reactivex.a.a<T> implements io.reactivex.internal.disposables.c {
    static final Callable eRS = new a();
    final AtomicReference<ReplaySubscriber<T>> current;
    final org.a.b<T> eRL;
    final Callable<? extends b<T>> eRR;
    final e<T> eRc;

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    static final class a implements Callable<Object> {
        a() {
        }

        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    interface b<T> {
        void a(InnerSubscription<T> innerSubscription);

        void ah(Throwable th);

        void cR(T t);

        void complete();
    }

    static final class c<T> implements Callable<b<T>> {
        private final int bufferSize;

        c(int i) {
            this.bufferSize = i;
        }

        /* renamed from: bma */
        public b<T> call() {
            return new SizeBoundReplayBuffer(this.bufferSize);
        }
    }

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements b<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        /* Access modifiers changed, original: 0000 */
        public void blW() {
        }

        /* Access modifiers changed, original: 0000 */
        public Object cS(Object obj) {
            return obj;
        }

        /* Access modifiers changed, original: 0000 */
        public Object cT(Object obj) {
            return obj;
        }

        BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.tail = node;
            set(node);
        }

        /* Access modifiers changed, original: final */
        public final void a(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        /* Access modifiers changed, original: final */
        public final void blU() {
            Node node = (Node) ((Node) get()).get();
            if (node != null) {
                this.size--;
                b(node);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        /* Access modifiers changed, original: final */
        public final void b(Node node) {
            set(node);
        }

        public final void cR(T t) {
            Object cS = cS(NotificationLite.next(t));
            long j = this.index + 1;
            this.index = j;
            a(new Node(cS, j));
            blW();
        }

        public final void ah(Throwable th) {
            Object cS = cS(NotificationLite.error(th));
            long j = this.index + 1;
            this.index = j;
            a(new Node(cS, j));
            blX();
        }

        public final void complete() {
            Object cS = cS(NotificationLite.complete());
            long j = this.index + 1;
            this.index = j;
            a(new Node(cS, j));
            blX();
        }

        /* Access modifiers changed, original: final */
        public final void blV() {
            Node node = (Node) get();
            if (node.value != null) {
                Node node2 = new Node(null, 0);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        /* JADX WARNING: Missing block: B:10:0x0012, code skipped:
            if (r15.isDisposed() == false) goto L_0x0017;
     */
        /* JADX WARNING: Missing block: B:11:0x0014, code skipped:
            r15.index = null;
     */
        /* JADX WARNING: Missing block: B:12:0x0016, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:13:0x0017, code skipped:
            r3 = r15.get();
     */
        /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            if (r3 != Long.MAX_VALUE) goto L_0x0027;
     */
        /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            r5 = 1;
     */
        /* JADX WARNING: Missing block: B:16:0x0027, code skipped:
            r5 = null;
     */
        /* JADX WARNING: Missing block: B:17:0x0028, code skipped:
            r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r15.blZ();
     */
        /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            if (r6 != null) goto L_0x003f;
     */
        /* JADX WARNING: Missing block: B:19:0x0032, code skipped:
            r6 = blY();
            r15.index = r6;
            io.reactivex.internal.util.b.a(r15.totalRequested, r6.index);
     */
        /* JADX WARNING: Missing block: B:20:0x003f, code skipped:
            r9 = 0;
     */
        /* JADX WARNING: Missing block: B:22:0x0042, code skipped:
            if (r3 == 0) goto L_0x0087;
     */
        /* JADX WARNING: Missing block: B:23:0x0044, code skipped:
            r11 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r6.get();
     */
        /* JADX WARNING: Missing block: B:24:0x004a, code skipped:
            if (r11 == null) goto L_0x0087;
     */
        /* JADX WARNING: Missing block: B:25:0x004c, code skipped:
            r6 = cT(r11.value);
     */
        /* JADX WARNING: Missing block: B:28:0x0058, code skipped:
            if (io.reactivex.internal.util.NotificationLite.accept(r6, r15.child) == false) goto L_0x005d;
     */
        /* JADX WARNING: Missing block: B:29:0x005a, code skipped:
            r15.index = null;
     */
        /* JADX WARNING: Missing block: B:30:0x005c, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:31:0x005d, code skipped:
            r9 = r9 + 1;
            r3 = r3 - 1;
     */
        /* JADX WARNING: Missing block: B:32:0x0065, code skipped:
            if (r15.isDisposed() == false) goto L_0x006a;
     */
        /* JADX WARNING: Missing block: B:33:0x0067, code skipped:
            r15.index = null;
     */
        /* JADX WARNING: Missing block: B:34:0x0069, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:35:0x006a, code skipped:
            r6 = r11;
     */
        /* JADX WARNING: Missing block: B:36:0x006c, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:37:0x006d, code skipped:
            io.reactivex.exceptions.a.ad(r0);
            r15.index = null;
            r15.dispose();
     */
        /* JADX WARNING: Missing block: B:41:0x0081, code skipped:
            r15.child.onError(r0);
     */
        /* JADX WARNING: Missing block: B:42:0x0086, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:44:0x0089, code skipped:
            if (r9 == 0) goto L_0x0092;
     */
        /* JADX WARNING: Missing block: B:45:0x008b, code skipped:
            r15.index = r6;
     */
        /* JADX WARNING: Missing block: B:46:0x008d, code skipped:
            if (r5 != null) goto L_0x0092;
     */
        /* JADX WARNING: Missing block: B:47:0x008f, code skipped:
            r15.cU(r9);
     */
        /* JADX WARNING: Missing block: B:48:0x0092, code skipped:
            monitor-enter(r15);
     */
        /* JADX WARNING: Missing block: B:51:0x0095, code skipped:
            if (r15.missed != false) goto L_0x009b;
     */
        /* JADX WARNING: Missing block: B:52:0x0097, code skipped:
            r15.emitting = false;
     */
        /* JADX WARNING: Missing block: B:53:0x0099, code skipped:
            monitor-exit(r15);
     */
        /* JADX WARNING: Missing block: B:54:0x009a, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:55:0x009b, code skipped:
            r15.missed = false;
     */
        /* JADX WARNING: Missing block: B:56:0x009d, code skipped:
            monitor-exit(r15);
     */
        public final void a(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r15) {
            /*
            r14 = this;
            monitor-enter(r15);
            r0 = r15.emitting;	 Catch:{ all -> 0x00a3 }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r15.missed = r1;	 Catch:{ all -> 0x00a3 }
            monitor-exit(r15);	 Catch:{ all -> 0x00a3 }
            return;
        L_0x000a:
            r15.emitting = r1;	 Catch:{ all -> 0x00a3 }
            monitor-exit(r15);	 Catch:{ all -> 0x00a3 }
        L_0x000d:
            r0 = r15.isDisposed();
            r2 = 0;
            if (r0 == 0) goto L_0x0017;
        L_0x0014:
            r15.index = r2;
            return;
        L_0x0017:
            r3 = r15.get();
            r5 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r0 = 0;
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r7 != 0) goto L_0x0027;
        L_0x0025:
            r5 = 1;
            goto L_0x0028;
        L_0x0027:
            r5 = 0;
        L_0x0028:
            r6 = r15.blZ();
            r6 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r6;
            r7 = 0;
            if (r6 != 0) goto L_0x003f;
        L_0x0032:
            r6 = r14.blY();
            r15.index = r6;
            r9 = r15.totalRequested;
            r10 = r6.index;
            io.reactivex.internal.util.b.a(r9, r10);
        L_0x003f:
            r9 = r7;
        L_0x0040:
            r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
            if (r11 == 0) goto L_0x0087;
        L_0x0044:
            r11 = r6.get();
            r11 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r11;
            if (r11 == 0) goto L_0x0087;
        L_0x004c:
            r6 = r11.value;
            r6 = r14.cT(r6);
            r12 = r15.child;	 Catch:{ Throwable -> 0x006c }
            r12 = io.reactivex.internal.util.NotificationLite.accept(r6, r12);	 Catch:{ Throwable -> 0x006c }
            if (r12 == 0) goto L_0x005d;
        L_0x005a:
            r15.index = r2;	 Catch:{ Throwable -> 0x006c }
            return;
        L_0x005d:
            r12 = 1;
            r9 = r9 + r12;
            r3 = r3 - r12;
            r6 = r15.isDisposed();
            if (r6 == 0) goto L_0x006a;
        L_0x0067:
            r15.index = r2;
            return;
        L_0x006a:
            r6 = r11;
            goto L_0x0040;
        L_0x006c:
            r0 = move-exception;
            io.reactivex.exceptions.a.ad(r0);
            r15.index = r2;
            r15.dispose();
            r1 = io.reactivex.internal.util.NotificationLite.isError(r6);
            if (r1 != 0) goto L_0x0086;
        L_0x007b:
            r1 = io.reactivex.internal.util.NotificationLite.isComplete(r6);
            if (r1 != 0) goto L_0x0086;
        L_0x0081:
            r15 = r15.child;
            r15.onError(r0);
        L_0x0086:
            return;
        L_0x0087:
            r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
            if (r2 == 0) goto L_0x0092;
        L_0x008b:
            r15.index = r6;
            if (r5 != 0) goto L_0x0092;
        L_0x008f:
            r15.cU(r9);
        L_0x0092:
            monitor-enter(r15);
            r2 = r15.missed;	 Catch:{ all -> 0x00a0 }
            if (r2 != 0) goto L_0x009b;
        L_0x0097:
            r15.emitting = r0;	 Catch:{ all -> 0x00a0 }
            monitor-exit(r15);	 Catch:{ all -> 0x00a0 }
            return;
        L_0x009b:
            r15.missed = r0;	 Catch:{ all -> 0x00a0 }
            monitor-exit(r15);	 Catch:{ all -> 0x00a0 }
            goto L_0x000d;
        L_0x00a0:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x00a0 }
            throw r0;
        L_0x00a3:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x00a3 }
            goto L_0x00a7;
        L_0x00a6:
            throw r0;
        L_0x00a7:
            goto L_0x00a6;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer.a(io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription):void");
        }

        /* Access modifiers changed, original: 0000 */
        public void blX() {
            blV();
        }

        /* Access modifiers changed, original: 0000 */
        public Node blY() {
            return (Node) get();
        }
    }

    static final class InnerSubscription<T> extends AtomicLong implements io.reactivex.disposables.b, org.a.d {
        private static final long serialVersionUID = -4453897557930727610L;
        final org.a.c<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        InnerSubscription(ReplaySubscriber<T> replaySubscriber, org.a.c<? super T> cVar) {
            this.parent = replaySubscriber;
            this.child = cVar;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j) && io.reactivex.internal.util.b.b(this, j) != Long.MIN_VALUE) {
                io.reactivex.internal.util.b.a(this.totalRequested, j);
                this.parent.bmb();
                this.parent.buffer.a(this);
            }
        }

        public long cU(long j) {
            return io.reactivex.internal.util.b.d(this, j);
        }

        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        public void cancel() {
            dispose();
        }

        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.c(this);
                this.parent.bmb();
                this.index = null;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public <U> U blZ() {
            return this.index;
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements b<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        public void cR(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        public void ah(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        /* JADX WARNING: Missing block: B:9:0x000d, code skipped:
            r0 = r15.child;
     */
        /* JADX WARNING: Missing block: B:11:0x0013, code skipped:
            if (r15.isDisposed() == false) goto L_0x0016;
     */
        /* JADX WARNING: Missing block: B:12:0x0015, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:13:0x0016, code skipped:
            r1 = r14.size;
            r2 = (java.lang.Integer) r15.blZ();
     */
        /* JADX WARNING: Missing block: B:14:0x001f, code skipped:
            if (r2 == null) goto L_0x0026;
     */
        /* JADX WARNING: Missing block: B:15:0x0021, code skipped:
            r2 = r2.intValue();
     */
        /* JADX WARNING: Missing block: B:16:0x0026, code skipped:
            r2 = 0;
     */
        /* JADX WARNING: Missing block: B:17:0x0027, code skipped:
            r4 = r15.get();
            r8 = r4;
            r10 = 0;
     */
        /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            if (r8 == 0) goto L_0x0065;
     */
        /* JADX WARNING: Missing block: B:20:0x0033, code skipped:
            if (r2 >= r1) goto L_0x0065;
     */
        /* JADX WARNING: Missing block: B:21:0x0035, code skipped:
            r12 = get(r2);
     */
        /* JADX WARNING: Missing block: B:23:?, code skipped:
            r12 = io.reactivex.internal.util.NotificationLite.accept(r12, r0);
     */
        /* JADX WARNING: Missing block: B:24:0x003d, code skipped:
            if (r12 == null) goto L_0x0040;
     */
        /* JADX WARNING: Missing block: B:25:0x003f, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:27:0x0044, code skipped:
            if (r15.isDisposed() == false) goto L_0x0047;
     */
        /* JADX WARNING: Missing block: B:28:0x0046, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:29:0x0047, code skipped:
            r2 = r2 + 1;
            r8 = r8 - 1;
            r10 = r10 + 1;
     */
        /* JADX WARNING: Missing block: B:30:0x004e, code skipped:
            r1 = move-exception;
     */
        /* JADX WARNING: Missing block: B:31:0x004f, code skipped:
            io.reactivex.exceptions.a.ad(r1);
            r15.dispose();
     */
        /* JADX WARNING: Missing block: B:35:0x0061, code skipped:
            r0.onError(r1);
     */
        /* JADX WARNING: Missing block: B:36:0x0064, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:38:0x0067, code skipped:
            if (r10 == 0) goto L_0x007b;
     */
        /* JADX WARNING: Missing block: B:39:0x0069, code skipped:
            r15.index = java.lang.Integer.valueOf(r2);
     */
        /* JADX WARNING: Missing block: B:40:0x0076, code skipped:
            if (r4 == Long.MAX_VALUE) goto L_0x007b;
     */
        /* JADX WARNING: Missing block: B:41:0x0078, code skipped:
            r15.cU(r10);
     */
        /* JADX WARNING: Missing block: B:42:0x007b, code skipped:
            monitor-enter(r15);
     */
        /* JADX WARNING: Missing block: B:45:0x007e, code skipped:
            if (r15.missed != false) goto L_0x0084;
     */
        /* JADX WARNING: Missing block: B:46:0x0080, code skipped:
            r15.emitting = false;
     */
        /* JADX WARNING: Missing block: B:47:0x0082, code skipped:
            monitor-exit(r15);
     */
        /* JADX WARNING: Missing block: B:48:0x0083, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:49:0x0084, code skipped:
            r15.missed = false;
     */
        /* JADX WARNING: Missing block: B:50:0x0086, code skipped:
            monitor-exit(r15);
     */
        public void a(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r15) {
            /*
            r14 = this;
            monitor-enter(r15);
            r0 = r15.emitting;	 Catch:{ all -> 0x008b }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r15.missed = r1;	 Catch:{ all -> 0x008b }
            monitor-exit(r15);	 Catch:{ all -> 0x008b }
            return;
        L_0x000a:
            r15.emitting = r1;	 Catch:{ all -> 0x008b }
            monitor-exit(r15);	 Catch:{ all -> 0x008b }
            r0 = r15.child;
        L_0x000f:
            r1 = r15.isDisposed();
            if (r1 == 0) goto L_0x0016;
        L_0x0015:
            return;
        L_0x0016:
            r1 = r14.size;
            r2 = r15.blZ();
            r2 = (java.lang.Integer) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0026;
        L_0x0021:
            r2 = r2.intValue();
            goto L_0x0027;
        L_0x0026:
            r2 = 0;
        L_0x0027:
            r4 = r15.get();
            r6 = 0;
            r8 = r4;
            r10 = r6;
        L_0x002f:
            r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r12 == 0) goto L_0x0065;
        L_0x0033:
            if (r2 >= r1) goto L_0x0065;
        L_0x0035:
            r12 = r14.get(r2);
            r12 = io.reactivex.internal.util.NotificationLite.accept(r12, r0);	 Catch:{ Throwable -> 0x004e }
            if (r12 == 0) goto L_0x0040;
        L_0x003f:
            return;
        L_0x0040:
            r12 = r15.isDisposed();
            if (r12 == 0) goto L_0x0047;
        L_0x0046:
            return;
        L_0x0047:
            r2 = r2 + 1;
            r12 = 1;
            r8 = r8 - r12;
            r10 = r10 + r12;
            goto L_0x002f;
        L_0x004e:
            r1 = move-exception;
            io.reactivex.exceptions.a.ad(r1);
            r15.dispose();
            r15 = io.reactivex.internal.util.NotificationLite.isError(r12);
            if (r15 != 0) goto L_0x0064;
        L_0x005b:
            r15 = io.reactivex.internal.util.NotificationLite.isComplete(r12);
            if (r15 != 0) goto L_0x0064;
        L_0x0061:
            r0.onError(r1);
        L_0x0064:
            return;
        L_0x0065:
            r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
            if (r1 == 0) goto L_0x007b;
        L_0x0069:
            r1 = java.lang.Integer.valueOf(r2);
            r15.index = r1;
            r1 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
            if (r6 == 0) goto L_0x007b;
        L_0x0078:
            r15.cU(r10);
        L_0x007b:
            monitor-enter(r15);
            r1 = r15.missed;	 Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x0084;
        L_0x0080:
            r15.emitting = r3;	 Catch:{ all -> 0x0088 }
            monitor-exit(r15);	 Catch:{ all -> 0x0088 }
            return;
        L_0x0084:
            r15.missed = r3;	 Catch:{ all -> 0x0088 }
            monitor-exit(r15);	 Catch:{ all -> 0x0088 }
            goto L_0x000f;
        L_0x0088:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x0088 }
            throw r0;
        L_0x008b:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x008b }
            goto L_0x008f;
        L_0x008e:
            throw r0;
        L_0x008f:
            goto L_0x008e;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay$UnboundedReplayBuffer.a(io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription):void");
        }
    }

    static final class d<T> implements org.a.b<T> {
        private final AtomicReference<ReplaySubscriber<T>> eRM;
        private final Callable<? extends b<T>> eRR;

        d(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends b<T>> callable) {
            this.eRM = atomicReference;
            this.eRR = callable;
        }

        public void subscribe(org.a.c<? super T> cVar) {
            ReplaySubscriber replaySubscriber;
            while (true) {
                replaySubscriber = (ReplaySubscriber) this.eRM.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber replaySubscriber2 = new ReplaySubscriber((b) this.eRR.call());
                    if (this.eRM.compareAndSet(null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    EmptySubscription.error(th, cVar);
                    return;
                }
            }
            InnerSubscription innerSubscription = new InnerSubscription(replaySubscriber, cVar);
            cVar.onSubscribe(innerSubscription);
            replaySubscriber.b(innerSubscription);
            if (innerSubscription.isDisposed()) {
                replaySubscriber.c(innerSubscription);
                return;
            }
            replaySubscriber.bmb();
            replaySubscriber.buffer.a(innerSubscription);
        }
    }

    static final class ReplaySubscriber<T> extends AtomicReference<org.a.d> implements io.reactivex.disposables.b, h<T> {
        static final InnerSubscription[] eRT = new InnerSubscription[0];
        static final InnerSubscription[] eRU = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final b<T> buffer;
        boolean done;
        final AtomicInteger management = new AtomicInteger();
        long maxChildRequested;
        long maxUpstreamRequested;
        final AtomicBoolean shouldConnect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference(eRT);

        ReplaySubscriber(b<T> bVar) {
            this.buffer = bVar;
        }

        public boolean isDisposed() {
            return this.subscribers.get() == eRU;
        }

        public void dispose() {
            this.subscribers.set(eRU);
            SubscriptionHelper.cancel(this);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean b(InnerSubscription<T> innerSubscription) {
            if (innerSubscription != null) {
                InnerSubscription[] innerSubscriptionArr;
                InnerSubscription[] innerSubscriptionArr2;
                do {
                    innerSubscriptionArr = (InnerSubscription[]) this.subscribers.get();
                    if (innerSubscriptionArr == eRU) {
                        return false;
                    }
                    int length = innerSubscriptionArr.length;
                    innerSubscriptionArr2 = new InnerSubscription[(length + 1)];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                    innerSubscriptionArr2[length] = innerSubscription;
                } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
                return true;
            }
            throw new NullPointerException();
        }

        /* Access modifiers changed, original: 0000 */
        public void c(InnerSubscription<T> innerSubscription) {
            InnerSubscription[] innerSubscriptionArr;
            Object obj;
            do {
                innerSubscriptionArr = (InnerSubscription[]) this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (innerSubscriptionArr[i2].equals(innerSubscription)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = eRT;
                        } else {
                            Object obj2 = new InnerSubscription[(length - 1)];
                            System.arraycopy(innerSubscriptionArr, 0, obj2, 0, i);
                            System.arraycopy(innerSubscriptionArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, obj));
        }

        public void onSubscribe(org.a.d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                bmb();
                for (InnerSubscription a : (InnerSubscription[]) this.subscribers.get()) {
                    this.buffer.a(a);
                }
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                this.buffer.cR(t);
                for (InnerSubscription a : (InnerSubscription[]) this.subscribers.get()) {
                    this.buffer.a(a);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            this.done = true;
            this.buffer.ah(th);
            for (InnerSubscription a : (InnerSubscription[]) this.subscribers.getAndSet(eRU)) {
                this.buffer.a(a);
            }
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                for (InnerSubscription a : (InnerSubscription[]) this.subscribers.getAndSet(eRU)) {
                    this.buffer.a(a);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void bmb() {
            if (this.management.getAndIncrement() == 0) {
                int i = 1;
                while (!isDisposed()) {
                    InnerSubscription[] innerSubscriptionArr = (InnerSubscription[]) this.subscribers.get();
                    long j = this.maxChildRequested;
                    long j2 = j;
                    for (InnerSubscription innerSubscription : innerSubscriptionArr) {
                        j2 = Math.max(j2, innerSubscription.totalRequested.get());
                    }
                    long j3 = this.maxUpstreamRequested;
                    org.a.d dVar = (org.a.d) get();
                    j = j2 - j;
                    if (j != 0) {
                        this.maxChildRequested = j2;
                        if (dVar == null) {
                            j3 += j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                            this.maxUpstreamRequested = j3;
                        } else if (j3 != 0) {
                            this.maxUpstreamRequested = 0;
                            dVar.request(j3 + j);
                        } else {
                            dVar.request(j);
                        }
                    } else if (!(j3 == 0 || dVar == null)) {
                        this.maxUpstreamRequested = 0;
                        dVar.request(j3);
                    }
                    i = this.management.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        /* Access modifiers changed, original: 0000 */
        public void blW() {
            if (this.size > this.limit) {
                blU();
            }
        }
    }

    public static <T> io.reactivex.a.a<T> j(e<? extends T> eVar) {
        return a((e) eVar, eRS);
    }

    public static <T> io.reactivex.a.a<T> a(e<T> eVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return j((e) eVar);
        }
        return a((e) eVar, new c(i));
    }

    static <T> io.reactivex.a.a<T> a(e<T> eVar, Callable<? extends b<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.c.a.a(new FlowableReplay(new d(atomicReference, callable), eVar, atomicReference, callable));
    }

    private FlowableReplay(org.a.b<T> bVar, e<T> eVar, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends b<T>> callable) {
        this.eRL = bVar;
        this.eRc = eVar;
        this.current = atomicReference;
        this.eRR = callable;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super T> cVar) {
        this.eRL.subscribe(cVar);
    }

    public void i(io.reactivex.disposables.b bVar) {
        this.current.compareAndSet((ReplaySubscriber) bVar, null);
    }

    public void j(f<? super io.reactivex.disposables.b> fVar) {
        h hVar;
        RuntimeException aj;
        while (true) {
            hVar = (ReplaySubscriber) this.current.get();
            if (hVar != null && !hVar.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber replaySubscriber = new ReplaySubscriber((b) this.eRR.call());
                if (this.current.compareAndSet(hVar, replaySubscriber)) {
                    hVar = replaySubscriber;
                    break;
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                aj = ExceptionHelper.aj(th);
            }
        }
        Object obj = (hVar.shouldConnect.get() || !hVar.shouldConnect.compareAndSet(false, true)) ? null : 1;
        try {
            fVar.accept(hVar);
            if (obj != null) {
                this.eRc.a(hVar);
            }
        } catch (Throwable th2) {
            if (obj != null) {
                hVar.shouldConnect.compareAndSet(true, false);
            }
            io.reactivex.exceptions.a.ad(th2);
            aj = ExceptionHelper.aj(th2);
        }
    }
}
