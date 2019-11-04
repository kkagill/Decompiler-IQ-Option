package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PagedList<T> extends AbstractList<T> {
    @NonNull
    final Executor mBackgroundThreadExecutor;
    @Nullable
    final BoundaryCallback<T> mBoundaryCallback;
    boolean mBoundaryCallbackBeginDeferred = false;
    boolean mBoundaryCallbackEndDeferred = false;
    private final ArrayList<WeakReference<Callback>> mCallbacks = new ArrayList();
    @NonNull
    final Config mConfig;
    private final AtomicBoolean mDetached = new AtomicBoolean(false);
    private int mHighestIndexAccessed = Integer.MIN_VALUE;
    T mLastItem = null;
    int mLastLoad = 0;
    private int mLowestIndexAccessed = Integer.MAX_VALUE;
    @NonNull
    final Executor mMainThreadExecutor;
    final int mRequiredRemainder;
    @NonNull
    final PagedStorage<T> mStorage;

    @MainThread
    public static abstract class BoundaryCallback<T> {
        public void onItemAtEndLoaded(@NonNull T t) {
        }

        public void onItemAtFrontLoaded(@NonNull T t) {
        }

        public void onZeroItemsLoaded() {
        }
    }

    public static final class Builder<Key, Value> {
        private BoundaryCallback mBoundaryCallback;
        private final Config mConfig;
        private final DataSource<Key, Value> mDataSource;
        private Executor mFetchExecutor;
        private Key mInitialKey;
        private Executor mNotifyExecutor;

        public Builder(@NonNull DataSource<Key, Value> dataSource, @NonNull Config config) {
            if (dataSource == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (config != null) {
                this.mDataSource = dataSource;
                this.mConfig = config;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }

        public Builder(@NonNull DataSource<Key, Value> dataSource, int i) {
            this((DataSource) dataSource, new Builder().setPageSize(i).build());
        }

        @NonNull
        public Builder<Key, Value> setNotifyExecutor(@NonNull Executor executor) {
            this.mNotifyExecutor = executor;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setFetchExecutor(@NonNull Executor executor) {
            this.mFetchExecutor = executor;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setBoundaryCallback(@Nullable BoundaryCallback boundaryCallback) {
            this.mBoundaryCallback = boundaryCallback;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setInitialKey(@Nullable Key key) {
            this.mInitialKey = key;
            return this;
        }

        @WorkerThread
        @NonNull
        public PagedList<Value> build() {
            Executor executor = this.mNotifyExecutor;
            if (executor != null) {
                Executor executor2 = this.mFetchExecutor;
                if (executor2 != null) {
                    return PagedList.create(this.mDataSource, executor, executor2, this.mBoundaryCallback, this.mConfig, this.mInitialKey);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }
    }

    public static abstract class Callback {
        public abstract void onChanged(int i, int i2);

        public abstract void onInserted(int i, int i2);

        public abstract void onRemoved(int i, int i2);
    }

    public static class Config {
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int maxSize;
        public final int pageSize;
        public final int prefetchDistance;

        public static final class Builder {
            static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            private boolean mEnablePlaceholders = true;
            private int mInitialLoadSizeHint = -1;
            private int mMaxSize = Integer.MAX_VALUE;
            private int mPageSize = -1;
            private int mPrefetchDistance = -1;

            @NonNull
            public Builder setPageSize(@IntRange(from = 1) int i) {
                if (i >= 1) {
                    this.mPageSize = i;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            @NonNull
            public Builder setPrefetchDistance(@IntRange(from = 0) int i) {
                this.mPrefetchDistance = i;
                return this;
            }

            @NonNull
            public Builder setEnablePlaceholders(boolean z) {
                this.mEnablePlaceholders = z;
                return this;
            }

            @NonNull
            public Builder setInitialLoadSizeHint(@IntRange(from = 1) int i) {
                this.mInitialLoadSizeHint = i;
                return this;
            }

            @NonNull
            public Builder setMaxSize(@IntRange(from = 2) int i) {
                this.mMaxSize = i;
                return this;
            }

            @NonNull
            public Config build() {
                if (this.mPrefetchDistance < 0) {
                    this.mPrefetchDistance = this.mPageSize;
                }
                if (this.mInitialLoadSizeHint < 0) {
                    this.mInitialLoadSizeHint = this.mPageSize * 3;
                }
                if (this.mEnablePlaceholders || this.mPrefetchDistance != 0) {
                    int i = this.mMaxSize;
                    if (i == Integer.MAX_VALUE || i >= this.mPageSize + (this.mPrefetchDistance * 2)) {
                        return new Config(this.mPageSize, this.mPrefetchDistance, this.mEnablePlaceholders, this.mInitialLoadSizeHint, this.mMaxSize);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
                    stringBuilder.append(this.mPageSize);
                    stringBuilder.append(", prefetchDist=");
                    stringBuilder.append(this.mPrefetchDistance);
                    stringBuilder.append(", maxSize=");
                    stringBuilder.append(this.mMaxSize);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }
        }

        Config(int i, int i2, boolean z, int i3, int i4) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
            this.maxSize = i4;
        }
    }

    public abstract void dispatchUpdatesSinceSnapshot(@NonNull PagedList<T> pagedList, @NonNull Callback callback);

    @NonNull
    public abstract DataSource<?, T> getDataSource();

    @Nullable
    public abstract Object getLastKey();

    public abstract boolean isContiguous();

    public abstract void loadAroundInternal(int i);

    PagedList(@NonNull PagedStorage<T> pagedStorage, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config) {
        this.mStorage = pagedStorage;
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mBoundaryCallback = boundaryCallback;
        this.mConfig = config;
        this.mRequiredRemainder = (this.mConfig.prefetchDistance * 2) + this.mConfig.pageSize;
    }

    @NonNull
    static <K, T> PagedList<T> create(@NonNull DataSource<K, T> dataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config, @Nullable K k) {
        int intValue;
        if (dataSource.isContiguous() || !config.enablePlaceholders) {
            if (!dataSource.isContiguous()) {
                dataSource = ((PositionalDataSource) dataSource).wrapAsContiguousWithoutPlaceholders();
                if (k != null) {
                    intValue = ((Integer) k).intValue();
                    return new ContiguousPagedList((ContiguousDataSource) dataSource, executor, executor2, boundaryCallback, config, k, intValue);
                }
            }
            intValue = -1;
            return new ContiguousPagedList((ContiguousDataSource) dataSource, executor, executor2, boundaryCallback, config, k, intValue);
        }
        PositionalDataSource positionalDataSource = (PositionalDataSource) dataSource;
        if (k != null) {
            intValue = ((Integer) k).intValue();
        } else {
            intValue = 0;
        }
        return new TiledPagedList(positionalDataSource, executor, executor2, boundaryCallback, config, intValue);
    }

    @Nullable
    public T get(int i) {
        Object obj = this.mStorage.get(i);
        if (obj != null) {
            this.mLastItem = obj;
        }
        return obj;
    }

    public void loadAround(int i) {
        if (i < 0 || i >= size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            stringBuilder.append(", Size: ");
            stringBuilder.append(size());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        this.mLastLoad = getPositionOffset() + i;
        loadAroundInternal(i);
        this.mLowestIndexAccessed = Math.min(this.mLowestIndexAccessed, i);
        this.mHighestIndexAccessed = Math.max(this.mHighestIndexAccessed, i);
        tryDispatchBoundaryCallbacks(true);
    }

    /* Access modifiers changed, original: 0000 */
    @AnyThread
    public void deferBoundaryCallbacks(final boolean z, final boolean z2, final boolean z3) {
        if (this.mBoundaryCallback != null) {
            if (this.mLowestIndexAccessed == Integer.MAX_VALUE) {
                this.mLowestIndexAccessed = this.mStorage.size();
            }
            if (this.mHighestIndexAccessed == Integer.MIN_VALUE) {
                this.mHighestIndexAccessed = 0;
            }
            if (z || z2 || z3) {
                this.mMainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        if (z) {
                            PagedList.this.mBoundaryCallback.onZeroItemsLoaded();
                        }
                        if (z2) {
                            PagedList.this.mBoundaryCallbackBeginDeferred = true;
                        }
                        if (z3) {
                            PagedList.this.mBoundaryCallbackEndDeferred = true;
                        }
                        PagedList.this.tryDispatchBoundaryCallbacks(false);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    /* Access modifiers changed, original: 0000 */
    public void tryDispatchBoundaryCallbacks(boolean z) {
        boolean z2 = true;
        final boolean z3 = this.mBoundaryCallbackBeginDeferred && this.mLowestIndexAccessed <= this.mConfig.prefetchDistance;
        if (!this.mBoundaryCallbackEndDeferred || this.mHighestIndexAccessed < (size() - 1) - this.mConfig.prefetchDistance) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.mBoundaryCallbackBeginDeferred = false;
            }
            if (z2) {
                this.mBoundaryCallbackEndDeferred = false;
            }
            if (z) {
                this.mMainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        PagedList.this.dispatchBoundaryCallbacks(z3, z2);
                    }
                });
            } else {
                dispatchBoundaryCallbacks(z3, z2);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dispatchBoundaryCallbacks(boolean z, boolean z2) {
        if (z) {
            this.mBoundaryCallback.onItemAtFrontLoaded(this.mStorage.getFirstLoadedItem());
        }
        if (z2) {
            this.mBoundaryCallback.onItemAtEndLoaded(this.mStorage.getLastLoadedItem());
        }
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void offsetAccessIndices(int i) {
        this.mLastLoad += i;
        this.mLowestIndexAccessed += i;
        this.mHighestIndexAccessed += i;
    }

    public int size() {
        return this.mStorage.size();
    }

    public int getLoadedCount() {
        return this.mStorage.getLoadedCount();
    }

    public boolean isImmutable() {
        return isDetached();
    }

    @NonNull
    public List<T> snapshot() {
        if (isImmutable()) {
            return this;
        }
        return new SnapshotPagedList(this);
    }

    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    public boolean isDetached() {
        return this.mDetached.get();
    }

    public void detach() {
        this.mDetached.set(true);
    }

    public int getPositionOffset() {
        return this.mStorage.getPositionOffset();
    }

    public void addWeakCallback(@Nullable List<T> list, @NonNull Callback callback) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                dispatchUpdatesSinceSnapshot((PagedList) list, callback);
            } else if (!this.mStorage.isEmpty()) {
                callback.onInserted(0, this.mStorage.size());
            }
        }
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            if (((Callback) ((WeakReference) this.mCallbacks.get(size)).get()) == null) {
                this.mCallbacks.remove(size);
            }
        }
        this.mCallbacks.add(new WeakReference(callback));
    }

    public void removeWeakCallback(@NonNull Callback callback) {
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            Callback callback2 = (Callback) ((WeakReference) this.mCallbacks.get(size)).get();
            if (callback2 == null || callback2 == callback) {
                this.mCallbacks.remove(size);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void notifyInserted(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = (Callback) ((WeakReference) this.mCallbacks.get(size)).get();
                if (callback != null) {
                    callback.onInserted(i, i2);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void notifyChanged(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = (Callback) ((WeakReference) this.mCallbacks.get(size)).get();
                if (callback != null) {
                    callback.onChanged(i, i2);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void notifyRemoved(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = (Callback) ((WeakReference) this.mCallbacks.get(size)).get();
                if (callback != null) {
                    callback.onRemoved(i, i2);
                }
            }
        }
    }
}
