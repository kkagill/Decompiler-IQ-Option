package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import com.squareup.picasso.RequestHandler.Result;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

class BitmapHunter implements Runnable {
    private static final Object DECODE_LOCK = new Object();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() {
        public boolean canHandleRequest(Request request) {
            return true;
        }

        public Result load(Request request, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unrecognized type of request: ");
            stringBuilder.append(request);
            throw new IllegalStateException(stringBuilder.toString());
        }
    };
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() {
        /* Access modifiers changed, original: protected */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;

    static int getExifRotation(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int getExifTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z, int i, int i2, int i3, int i4) {
        return !z || ((i3 != 0 && i > i3) || (i4 != 0 && i2 > i4));
    }

    BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    static Bitmap decodeStream(InputStream inputStream, Request request) {
        MarkableInputStream markableInputStream = new MarkableInputStream(inputStream);
        markableInputStream.allowMarksToExpire(false);
        long savePosition = markableInputStream.savePosition(1024);
        Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = RequestHandler.requiresInSampleSize(createBitmapOptions);
        boolean isWebPFile = Utils.isWebPFile(markableInputStream);
        Object obj = (!request.purgeable || VERSION.SDK_INT >= 21) ? null : 1;
        markableInputStream.reset(savePosition);
        if (isWebPFile || obj != null) {
            byte[] toByteArray = Utils.toByteArray(markableInputStream);
            if (requiresInSampleSize) {
                BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length, createBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            }
            return BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length, createBitmapOptions);
        }
        if (requiresInSampleSize) {
            BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            markableInputStream.reset(savePosition);
        }
        markableInputStream.allowMarksToExpire(true);
        Bitmap decodeStream = BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public void run() {
        String str = "Picasso-Idle";
        try {
            updateThreadName(this.data);
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
            }
            this.result = hunt();
            if (this.result == null) {
                this.dispatcher.dispatchFailed(this);
            } else {
                this.dispatcher.dispatchComplete(this);
            }
        } catch (ResponseException e) {
            if (!(e.localCacheOnly && e.responseCode == 504)) {
                this.exception = e;
            }
            this.dispatcher.dispatchFailed(this);
        } catch (ContentLengthException e2) {
            this.exception = e2;
            this.dispatcher.dispatchRetry(this);
        } catch (IOException e3) {
            this.exception = e3;
            this.dispatcher.dispatchRetry(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
            this.exception = new RuntimeException(stringWriter.toString(), e4);
            this.dispatcher.dispatchFailed(this);
        } catch (Exception e5) {
            this.exception = e5;
            this.dispatcher.dispatchFailed(this);
        } catch (Throwable th) {
            Thread.currentThread().setName(str);
        }
        Thread.currentThread().setName(str);
    }

    /* Access modifiers changed, original: 0000 */
    public Bitmap hunt() {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        }
        bitmap = null;
        this.data.networkPolicy = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        Result load = this.requestHandler.load(this.data, this.networkPolicy);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                InputStream stream = load.getStream();
                try {
                    Bitmap decodeStream = decodeStream(stream, this.data);
                    bitmap = decodeStream;
                } finally {
                    Utils.closeQuietly(stream);
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    if (this.data.needsMatrixTransform() || this.exifOrientation != 0) {
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId());
                        }
                    }
                    if (this.data.hasCustomTransformations()) {
                        bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* Access modifiers changed, original: 0000 */
    public void attach(Action action) {
        boolean z = this.picasso.loggingEnabled;
        Request request = action.request;
        String str = "to ";
        String str2 = "joined";
        String str3 = "Hunter";
        if (this.action == null) {
            this.action = action;
            if (z) {
                List list = this.actions;
                if (list == null || list.isEmpty()) {
                    Utils.log(str3, str2, request.logId(), "to empty hunter");
                } else {
                    Utils.log(str3, str2, request.logId(), Utils.getLogIdsForHunter(this, str));
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z) {
            Utils.log(str3, str2, request.logId(), Utils.getLogIdsForHunter(this, str));
        }
        Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void detach(Action action) {
        boolean z;
        if (this.action == action) {
            this.action = null;
            z = true;
        } else {
            List list = this.actions;
            z = list != null ? list.remove(action) : false;
        }
        if (z && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    private Priority computeNewPriority() {
        Priority priority = Priority.LOW;
        List list = this.actions;
        Object obj = 1;
        Object obj2 = (list == null || list.isEmpty()) ? null : 1;
        if (this.action == null && obj2 == null) {
            obj = null;
        }
        if (obj == null) {
            return priority;
        }
        Action action = this.action;
        if (action != null) {
            priority = action.getPriority();
        }
        if (obj2 != null) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                Priority priority2 = ((Action) this.actions.get(i)).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cancel() {
        if (this.action != null) {
            return false;
        }
        List list = this.actions;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        Future future = this.future;
        if (future == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isCancelled() {
        Future future = this.future;
        return future != null && future.isCancelled();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        if ((this.retryCount > 0 ? 1 : null) == null) {
            return false;
        }
        this.retryCount--;
        return this.requestHandler.shouldRetry(z, networkInfo);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }

    /* Access modifiers changed, original: 0000 */
    public Bitmap getResult() {
        return this.result;
    }

    /* Access modifiers changed, original: 0000 */
    public String getKey() {
        return this.key;
    }

    /* Access modifiers changed, original: 0000 */
    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    /* Access modifiers changed, original: 0000 */
    public Request getData() {
        return this.data;
    }

    /* Access modifiers changed, original: 0000 */
    public Action getAction() {
        return this.action;
    }

    /* Access modifiers changed, original: 0000 */
    public Picasso getPicasso() {
        return this.picasso;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Action> getActions() {
        return this.actions;
    }

    /* Access modifiers changed, original: 0000 */
    public Exception getException() {
        return this.exception;
    }

    /* Access modifiers changed, original: 0000 */
    public LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    /* Access modifiers changed, original: 0000 */
    public Priority getPriority() {
        return this.priority;
    }

    static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder stringBuilder = (StringBuilder) NAME_BUILDER.get();
        stringBuilder.ensureCapacity(name.length() + 8);
        stringBuilder.replace(8, stringBuilder.length(), name);
        Thread.currentThread().setName(stringBuilder.toString());
    }

    static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i = 0; i < size; i++) {
            RequestHandler requestHandler = (RequestHandler) requestHandlers.get(i);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final Transformation transformation = (Transformation) list.get(i);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Transformation ");
                    stringBuilder.append(transformation.key());
                    stringBuilder.append(" returned null after ");
                    stringBuilder.append(i);
                    stringBuilder.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (Transformation key : list) {
                        stringBuilder.append(key.key());
                        stringBuilder.append(10);
                    }
                    Picasso.HANDLER.post(new Runnable() {
                        public void run() {
                            throw new NullPointerException(stringBuilder.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() {
                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Transformation ");
                            stringBuilder.append(transformation.key());
                            stringBuilder.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = transform;
                } else {
                    Picasso.HANDLER.post(new Runnable() {
                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Transformation ");
                            stringBuilder.append(transformation.key());
                            stringBuilder.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.HANDLER.post(new Runnable() {
                    public void run() {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Transformation ");
                        stringBuilder.append(transformation.key());
                        stringBuilder.append(" crashed with exception.");
                        throw new RuntimeException(stringBuilder.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c2  */
    static android.graphics.Bitmap transformResult(com.squareup.picasso.Request r28, android.graphics.Bitmap r29, int r30) {
        /*
        r0 = r28;
        r1 = r29.getWidth();
        r2 = r29.getHeight();
        r3 = r0.onlyScaleDown;
        r9 = new android.graphics.Matrix;
        r9.<init>();
        r4 = r28.needsMatrixTransform();
        if (r4 != 0) goto L_0x001f;
    L_0x0017:
        if (r30 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001f;
    L_0x001a:
        r5 = r2;
        r3 = r9;
        r2 = r1;
        goto L_0x02b2;
    L_0x001f:
        r4 = r0.targetWidth;
        r6 = r0.targetHeight;
        r7 = r0.rotationDegrees;
        r8 = 0;
        r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r8 == 0) goto L_0x0198;
    L_0x002a:
        r10 = (double) r7;
        r12 = java.lang.Math.toRadians(r10);
        r12 = java.lang.Math.cos(r12);
        r10 = java.lang.Math.toRadians(r10);
        r10 = java.lang.Math.sin(r10);
        r4 = r0.hasRotationPivot;
        if (r4 == 0) goto L_0x0109;
    L_0x003f:
        r4 = r0.rotationPivotX;
        r6 = r0.rotationPivotY;
        r9.setRotate(r7, r4, r6);
        r4 = r0.rotationPivotX;
        r6 = (double) r4;
        r14 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r14 = r14 - r12;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r14;
        r4 = r0.rotationPivotY;
        r16 = r6;
        r5 = (double) r4;
        java.lang.Double.isNaN(r5);
        r5 = r5 * r10;
        r6 = r16 + r5;
        r4 = r0.rotationPivotY;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r4 = r4 * r14;
        r14 = r0.rotationPivotX;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r10;
        r4 = r4 - r14;
        r14 = r0.targetWidth;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r12;
        r14 = r14 + r6;
        r8 = r0.targetWidth;
        r17 = r2;
        r18 = r3;
        r2 = (double) r8;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r10;
        r2 = r2 + r4;
        r8 = r0.targetWidth;
        r19 = r9;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r12;
        r8 = r8 + r6;
        r20 = r1;
        r1 = r0.targetHeight;
        r21 = r2;
        r1 = (double) r1;
        java.lang.Double.isNaN(r1);
        r1 = r1 * r10;
        r8 = r8 - r1;
        r1 = r0.targetWidth;
        r1 = (double) r1;
        java.lang.Double.isNaN(r1);
        r1 = r1 * r10;
        r1 = r1 + r4;
        r3 = r0.targetHeight;
        r23 = r8;
        r8 = (double) r3;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r12;
        r1 = r1 + r8;
        r3 = r0.targetHeight;
        r8 = (double) r3;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r10;
        r8 = r6 - r8;
        r3 = r0.targetHeight;
        r10 = (double) r3;
        java.lang.Double.isNaN(r10);
        r10 = r10 * r12;
        r10 = r10 + r4;
        r12 = java.lang.Math.max(r6, r14);
        r25 = r10;
        r10 = r23;
        r12 = java.lang.Math.max(r10, r12);
        r12 = java.lang.Math.max(r8, r12);
        r6 = java.lang.Math.min(r6, r14);
        r6 = java.lang.Math.min(r10, r6);
        r6 = java.lang.Math.min(r8, r6);
        r8 = r21;
        r10 = java.lang.Math.max(r4, r8);
        r10 = java.lang.Math.max(r1, r10);
        r14 = r25;
        r10 = java.lang.Math.max(r14, r10);
        r3 = java.lang.Math.min(r4, r8);
        r1 = java.lang.Math.min(r1, r3);
        r1 = java.lang.Math.min(r14, r1);
        r12 = r12 - r6;
        r3 = java.lang.Math.floor(r12);
        r4 = (int) r3;
        r10 = r10 - r1;
        r1 = java.lang.Math.floor(r10);
        r6 = (int) r1;
        goto L_0x01a0;
    L_0x0109:
        r20 = r1;
        r17 = r2;
        r18 = r3;
        r1 = r9;
        r1.setRotate(r7);
        r2 = r0.targetWidth;
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r12;
        r4 = r0.targetWidth;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r4 = r4 * r10;
        r6 = r0.targetWidth;
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r12;
        r8 = r0.targetHeight;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r10;
        r6 = r6 - r8;
        r8 = r0.targetWidth;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r10;
        r14 = r0.targetHeight;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r12;
        r8 = r8 + r14;
        r14 = r0.targetHeight;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r10;
        r10 = -r14;
        r14 = r0.targetHeight;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r12;
        r12 = 0;
        r19 = r1;
        r0 = java.lang.Math.max(r12, r2);
        r0 = java.lang.Math.max(r6, r0);
        r0 = java.lang.Math.max(r10, r0);
        r2 = java.lang.Math.min(r12, r2);
        r2 = java.lang.Math.min(r6, r2);
        r2 = java.lang.Math.min(r10, r2);
        r6 = java.lang.Math.max(r12, r4);
        r6 = java.lang.Math.max(r8, r6);
        r6 = java.lang.Math.max(r14, r6);
        r4 = java.lang.Math.min(r12, r4);
        r4 = java.lang.Math.min(r8, r4);
        r4 = java.lang.Math.min(r14, r4);
        r0 = r0 - r2;
        r0 = java.lang.Math.floor(r0);
        r0 = (int) r0;
        r6 = r6 - r4;
        r1 = java.lang.Math.floor(r6);
        r6 = (int) r1;
        r4 = r0;
        goto L_0x01a0;
    L_0x0198:
        r20 = r1;
        r17 = r2;
        r18 = r3;
        r19 = r9;
    L_0x01a0:
        if (r30 == 0) goto L_0x01cc;
    L_0x01a2:
        r0 = getExifRotation(r30);
        r1 = getExifTranslation(r30);
        if (r0 == 0) goto L_0x01c0;
    L_0x01ac:
        r2 = (float) r0;
        r3 = r19;
        r3.preRotate(r2);
        r2 = 90;
        if (r0 == r2) goto L_0x01ba;
    L_0x01b6:
        r2 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r0 != r2) goto L_0x01c2;
    L_0x01ba:
        r27 = r6;
        r6 = r4;
        r4 = r27;
        goto L_0x01c2;
    L_0x01c0:
        r3 = r19;
    L_0x01c2:
        r0 = 1;
        if (r1 == r0) goto L_0x01ce;
    L_0x01c5:
        r0 = (float) r1;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.postScale(r0, r1);
        goto L_0x01ce;
    L_0x01cc:
        r3 = r19;
    L_0x01ce:
        r0 = r28;
        r1 = r0.centerCrop;
        if (r1 == 0) goto L_0x0267;
    L_0x01d4:
        if (r4 == 0) goto L_0x01de;
    L_0x01d6:
        r1 = (float) r4;
        r2 = r20;
        r5 = (float) r2;
        r1 = r1 / r5;
        r5 = r17;
        goto L_0x01e5;
    L_0x01de:
        r2 = r20;
        r1 = (float) r6;
        r5 = r17;
        r7 = (float) r5;
        r1 = r1 / r7;
    L_0x01e5:
        if (r6 == 0) goto L_0x01ea;
    L_0x01e7:
        r7 = (float) r6;
        r8 = (float) r5;
        goto L_0x01ec;
    L_0x01ea:
        r7 = (float) r4;
        r8 = (float) r2;
    L_0x01ec:
        r7 = r7 / r8;
        r8 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r8 <= 0) goto L_0x021d;
    L_0x01f1:
        r8 = (float) r5;
        r7 = r7 / r1;
        r8 = r8 * r7;
        r7 = (double) r8;
        r7 = java.lang.Math.ceil(r7);
        r7 = (int) r7;
        r8 = r0.centerCropGravity;
        r9 = 48;
        r8 = r8 & r9;
        if (r8 != r9) goto L_0x0204;
    L_0x0202:
        r0 = 0;
        goto L_0x0212;
    L_0x0204:
        r0 = r0.centerCropGravity;
        r8 = 80;
        r0 = r0 & r8;
        if (r0 != r8) goto L_0x020e;
    L_0x020b:
        r0 = r5 - r7;
        goto L_0x0212;
    L_0x020e:
        r0 = r5 - r7;
        r0 = r0 / 2;
    L_0x0212:
        r8 = (float) r6;
        r9 = (float) r7;
        r8 = r8 / r9;
        r9 = r2;
        r10 = r7;
        r16 = 0;
        r7 = r1;
        r1 = r18;
        goto L_0x0258;
    L_0x021d:
        r8 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r8 >= 0) goto L_0x0250;
    L_0x0221:
        r8 = (float) r2;
        r1 = r1 / r7;
        r8 = r8 * r1;
        r8 = (double) r8;
        r8 = java.lang.Math.ceil(r8);
        r1 = (int) r8;
        r8 = r0.centerCropGravity;
        r9 = 3;
        r8 = r8 & r9;
        if (r8 != r9) goto L_0x0233;
    L_0x0231:
        r0 = 0;
        goto L_0x0240;
    L_0x0233:
        r0 = r0.centerCropGravity;
        r8 = 5;
        r0 = r0 & r8;
        if (r0 != r8) goto L_0x023c;
    L_0x0239:
        r0 = r2 - r1;
        goto L_0x0240;
    L_0x023c:
        r0 = r2 - r1;
        r0 = r0 / 2;
    L_0x0240:
        r8 = (float) r4;
        r9 = (float) r1;
        r8 = r8 / r9;
        r16 = r0;
        r9 = r1;
        r10 = r5;
        r1 = r18;
        r0 = 0;
        r27 = r8;
        r8 = r7;
        r7 = r27;
        goto L_0x0258;
    L_0x0250:
        r9 = r2;
        r10 = r5;
        r8 = r7;
        r1 = r18;
        r0 = 0;
        r16 = 0;
    L_0x0258:
        r1 = shouldResize(r1, r2, r5, r4, r6);
        if (r1 == 0) goto L_0x0261;
    L_0x025e:
        r3.preScale(r7, r8);
    L_0x0261:
        r6 = r0;
        r7 = r9;
        r8 = r10;
        r5 = r16;
        goto L_0x02b6;
    L_0x0267:
        r5 = r17;
        r1 = r18;
        r2 = r20;
        r0 = r0.centerInside;
        if (r0 == 0) goto L_0x0291;
    L_0x0271:
        if (r4 == 0) goto L_0x0276;
    L_0x0273:
        r0 = (float) r4;
        r7 = (float) r2;
        goto L_0x0278;
    L_0x0276:
        r0 = (float) r6;
        r7 = (float) r5;
    L_0x0278:
        r0 = r0 / r7;
        if (r6 == 0) goto L_0x027e;
    L_0x027b:
        r7 = (float) r6;
        r8 = (float) r5;
        goto L_0x0280;
    L_0x027e:
        r7 = (float) r4;
        r8 = (float) r2;
    L_0x0280:
        r7 = r7 / r8;
        r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r8 >= 0) goto L_0x0286;
    L_0x0285:
        goto L_0x0287;
    L_0x0286:
        r0 = r7;
    L_0x0287:
        r1 = shouldResize(r1, r2, r5, r4, r6);
        if (r1 == 0) goto L_0x02b2;
    L_0x028d:
        r3.preScale(r0, r0);
        goto L_0x02b2;
    L_0x0291:
        if (r4 != 0) goto L_0x0295;
    L_0x0293:
        if (r6 == 0) goto L_0x02b2;
    L_0x0295:
        if (r4 != r2) goto L_0x0299;
    L_0x0297:
        if (r6 == r5) goto L_0x02b2;
    L_0x0299:
        if (r4 == 0) goto L_0x029e;
    L_0x029b:
        r0 = (float) r4;
        r7 = (float) r2;
        goto L_0x02a0;
    L_0x029e:
        r0 = (float) r6;
        r7 = (float) r5;
    L_0x02a0:
        r0 = r0 / r7;
        if (r6 == 0) goto L_0x02a6;
    L_0x02a3:
        r7 = (float) r6;
        r8 = (float) r5;
        goto L_0x02a8;
    L_0x02a6:
        r7 = (float) r4;
        r8 = (float) r2;
    L_0x02a8:
        r7 = r7 / r8;
        r1 = shouldResize(r1, r2, r5, r4, r6);
        if (r1 == 0) goto L_0x02b2;
    L_0x02af:
        r3.preScale(r0, r7);
    L_0x02b2:
        r7 = r2;
        r8 = r5;
        r5 = 0;
        r6 = 0;
    L_0x02b6:
        r10 = 1;
        r4 = r29;
        r9 = r3;
        r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10);
        r1 = r29;
        if (r0 == r1) goto L_0x02c6;
    L_0x02c2:
        r29.recycle();
        goto L_0x02c7;
    L_0x02c6:
        r0 = r1;
    L_0x02c7:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.BitmapHunter.transformResult(com.squareup.picasso.Request, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
