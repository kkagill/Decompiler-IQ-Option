package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagedList.BoundaryCallback;
import androidx.paging.PagedList.Callback;
import androidx.paging.PagedList.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.concurrent.Executor;

class ContiguousPagedList<K, V> extends PagedList<V> implements Callback {
    private static final int DONE_FETCHING = 2;
    private static final int FETCHING = 1;
    static final int LAST_LOAD_UNSPECIFIED = -1;
    private static final int READY_TO_FETCH = 0;
    int mAppendItemsRequested = 0;
    int mAppendWorkerState = 0;
    final ContiguousDataSource<K, V> mDataSource;
    int mPrependItemsRequested = 0;
    int mPrependWorkerState = 0;
    Receiver<V> mReceiver = new Receiver<V>() {
        @AnyThread
        public void onPageResult(int i, @NonNull PageResult<V> pageResult) {
            if (pageResult.isInvalid()) {
                ContiguousPagedList.this.detach();
            } else if (!ContiguousPagedList.this.isDetached()) {
                List list = pageResult.page;
                boolean z = true;
                if (i == 0) {
                    ContiguousPagedList.this.mStorage.init(pageResult.leadingNulls, list, pageResult.trailingNulls, pageResult.positionOffset, ContiguousPagedList.this);
                    if (ContiguousPagedList.this.mLastLoad == -1) {
                        ContiguousPagedList.this.mLastLoad = (pageResult.leadingNulls + pageResult.positionOffset) + (list.size() / 2);
                    }
                } else {
                    Object obj = ContiguousPagedList.this.mLastLoad > ContiguousPagedList.this.mStorage.getMiddleOfLoadedRange() ? 1 : null;
                    Object obj2 = (ContiguousPagedList.this.mShouldTrim && ContiguousPagedList.this.mStorage.shouldPreTrimNewPage(ContiguousPagedList.this.mConfig.maxSize, ContiguousPagedList.this.mRequiredRemainder, list.size())) ? 1 : null;
                    ContiguousPagedList contiguousPagedList;
                    if (i == 1) {
                        if (obj2 == null || obj != null) {
                            ContiguousPagedList.this.mStorage.appendPage(list, ContiguousPagedList.this);
                        } else {
                            contiguousPagedList = ContiguousPagedList.this;
                            contiguousPagedList.mAppendItemsRequested = 0;
                            contiguousPagedList.mAppendWorkerState = 0;
                        }
                    } else if (i != 2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unexpected resultType ");
                        stringBuilder.append(i);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (obj2 == null || obj == null) {
                        ContiguousPagedList.this.mStorage.prependPage(list, ContiguousPagedList.this);
                    } else {
                        contiguousPagedList = ContiguousPagedList.this;
                        contiguousPagedList.mPrependItemsRequested = 0;
                        contiguousPagedList.mPrependWorkerState = 0;
                    }
                    if (ContiguousPagedList.this.mShouldTrim) {
                        if (obj != null) {
                            if (ContiguousPagedList.this.mPrependWorkerState != 1 && ContiguousPagedList.this.mStorage.trimFromFront(ContiguousPagedList.this.mReplacePagesWithNulls, ContiguousPagedList.this.mConfig.maxSize, ContiguousPagedList.this.mRequiredRemainder, ContiguousPagedList.this)) {
                                ContiguousPagedList.this.mPrependWorkerState = 0;
                            }
                        } else if (ContiguousPagedList.this.mAppendWorkerState != 1 && ContiguousPagedList.this.mStorage.trimFromEnd(ContiguousPagedList.this.mReplacePagesWithNulls, ContiguousPagedList.this.mConfig.maxSize, ContiguousPagedList.this.mRequiredRemainder, ContiguousPagedList.this)) {
                            ContiguousPagedList.this.mAppendWorkerState = 0;
                        }
                    }
                }
                if (ContiguousPagedList.this.mBoundaryCallback != null) {
                    boolean z2 = ContiguousPagedList.this.mStorage.size() == 0;
                    boolean z3 = !z2 && i == 2 && pageResult.page.size() == 0;
                    if (!(!z2 && i == 1 && pageResult.page.size() == 0)) {
                        z = false;
                    }
                    ContiguousPagedList.this.deferBoundaryCallbacks(z2, z3, z);
                }
            }
        }
    };
    boolean mReplacePagesWithNulls = false;
    final boolean mShouldTrim;

    @Retention(RetentionPolicy.SOURCE)
    @interface FetchState {
    }

    static int getAppendItemsRequested(int i, int i2, int i3) {
        return ((i2 + i) + 1) - i3;
    }

    static int getPrependItemsRequested(int i, int i2, int i3) {
        return i - (i2 - i3);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isContiguous() {
        return true;
    }

    ContiguousPagedList(@NonNull ContiguousDataSource<K, V> contiguousDataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<V> boundaryCallback, @NonNull Config config, @Nullable K k, int i) {
        super(new PagedStorage(), executor, executor2, boundaryCallback, config);
        boolean z = false;
        this.mDataSource = contiguousDataSource;
        this.mLastLoad = i;
        if (this.mDataSource.isInvalid()) {
            detach();
        } else {
            this.mDataSource.dispatchLoadInitial(k, this.mConfig.initialLoadSizeHint, this.mConfig.pageSize, this.mConfig.enablePlaceholders, this.mMainThreadExecutor, this.mReceiver);
        }
        if (this.mDataSource.supportsPageDropping() && this.mConfig.maxSize != Integer.MAX_VALUE) {
            z = true;
        }
        this.mShouldTrim = z;
    }

    /* Access modifiers changed, original: 0000 */
    @MainThread
    public void dispatchUpdatesSinceSnapshot(@NonNull PagedList<V> pagedList, @NonNull Callback callback) {
        PagedStorage pagedStorage = pagedList.mStorage;
        int numberAppended = this.mStorage.getNumberAppended() - pagedStorage.getNumberAppended();
        int numberPrepended = this.mStorage.getNumberPrepended() - pagedStorage.getNumberPrepended();
        int trailingNullCount = pagedStorage.getTrailingNullCount();
        int leadingNullCount = pagedStorage.getLeadingNullCount();
        if (pagedStorage.isEmpty() || numberAppended < 0 || numberPrepended < 0 || this.mStorage.getTrailingNullCount() != Math.max(trailingNullCount - numberAppended, 0) || this.mStorage.getLeadingNullCount() != Math.max(leadingNullCount - numberPrepended, 0) || this.mStorage.getStorageCount() != (pagedStorage.getStorageCount() + numberAppended) + numberPrepended) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (numberAppended != 0) {
            trailingNullCount = Math.min(trailingNullCount, numberAppended);
            numberAppended -= trailingNullCount;
            int leadingNullCount2 = pagedStorage.getLeadingNullCount() + pagedStorage.getStorageCount();
            if (trailingNullCount != 0) {
                callback.onChanged(leadingNullCount2, trailingNullCount);
            }
            if (numberAppended != 0) {
                callback.onInserted(leadingNullCount2 + trailingNullCount, numberAppended);
            }
        }
        if (numberPrepended != 0) {
            int min = Math.min(leadingNullCount, numberPrepended);
            numberPrepended -= min;
            if (min != 0) {
                callback.onChanged(leadingNullCount, min);
            }
            if (numberPrepended != 0) {
                callback.onInserted(0, numberPrepended);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    @MainThread
    public void loadAroundInternal(int i) {
        int prependItemsRequested = getPrependItemsRequested(this.mConfig.prefetchDistance, i, this.mStorage.getLeadingNullCount());
        i = getAppendItemsRequested(this.mConfig.prefetchDistance, i, this.mStorage.getLeadingNullCount() + this.mStorage.getStorageCount());
        this.mPrependItemsRequested = Math.max(prependItemsRequested, this.mPrependItemsRequested);
        if (this.mPrependItemsRequested > 0) {
            schedulePrepend();
        }
        this.mAppendItemsRequested = Math.max(i, this.mAppendItemsRequested);
        if (this.mAppendItemsRequested > 0) {
            scheduleAppend();
        }
    }

    @MainThread
    private void schedulePrepend() {
        if (this.mPrependWorkerState == 0) {
            this.mPrependWorkerState = 1;
            final int leadingNullCount = this.mStorage.getLeadingNullCount() + this.mStorage.getPositionOffset();
            final Object firstLoadedItem = this.mStorage.getFirstLoadedItem();
            this.mBackgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    if (!ContiguousPagedList.this.isDetached()) {
                        if (ContiguousPagedList.this.mDataSource.isInvalid()) {
                            ContiguousPagedList.this.detach();
                        } else {
                            ContiguousPagedList.this.mDataSource.dispatchLoadBefore(leadingNullCount, firstLoadedItem, ContiguousPagedList.this.mConfig.pageSize, ContiguousPagedList.this.mMainThreadExecutor, ContiguousPagedList.this.mReceiver);
                        }
                    }
                }
            });
        }
    }

    @MainThread
    private void scheduleAppend() {
        if (this.mAppendWorkerState == 0) {
            this.mAppendWorkerState = 1;
            final int leadingNullCount = ((this.mStorage.getLeadingNullCount() + this.mStorage.getStorageCount()) - 1) + this.mStorage.getPositionOffset();
            final Object lastLoadedItem = this.mStorage.getLastLoadedItem();
            this.mBackgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    if (!ContiguousPagedList.this.isDetached()) {
                        if (ContiguousPagedList.this.mDataSource.isInvalid()) {
                            ContiguousPagedList.this.detach();
                        } else {
                            ContiguousPagedList.this.mDataSource.dispatchLoadAfter(leadingNullCount, lastLoadedItem, ContiguousPagedList.this.mConfig.pageSize, ContiguousPagedList.this.mMainThreadExecutor, ContiguousPagedList.this.mReceiver);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    public DataSource<?, V> getDataSource() {
        return this.mDataSource;
    }

    @Nullable
    public Object getLastKey() {
        return this.mDataSource.getKey(this.mLastLoad, this.mLastItem);
    }

    @MainThread
    public void onInitialized(int i) {
        boolean z = false;
        notifyInserted(0, i);
        if (this.mStorage.getLeadingNullCount() > 0 || this.mStorage.getTrailingNullCount() > 0) {
            z = true;
        }
        this.mReplacePagesWithNulls = z;
    }

    @MainThread
    public void onPagePrepended(int i, int i2, int i3) {
        this.mPrependItemsRequested = (this.mPrependItemsRequested - i2) - i3;
        this.mPrependWorkerState = 0;
        if (this.mPrependItemsRequested > 0) {
            schedulePrepend();
        }
        notifyChanged(i, i2);
        notifyInserted(0, i3);
        offsetAccessIndices(i3);
    }

    @MainThread
    public void onEmptyPrepend() {
        this.mPrependWorkerState = 2;
    }

    @MainThread
    public void onPageAppended(int i, int i2, int i3) {
        this.mAppendItemsRequested = (this.mAppendItemsRequested - i2) - i3;
        this.mAppendWorkerState = 0;
        if (this.mAppendItemsRequested > 0) {
            scheduleAppend();
        }
        notifyChanged(i, i2);
        notifyInserted(i + i2, i3);
    }

    @MainThread
    public void onEmptyAppend() {
        this.mAppendWorkerState = 2;
    }

    @MainThread
    public void onPagePlaceholderInserted(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @MainThread
    public void onPageInserted(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    public void onPagesRemoved(int i, int i2) {
        notifyRemoved(i, i2);
    }

    public void onPagesSwappedToPlaceholder(int i, int i2) {
        notifyChanged(i, i2);
    }
}
