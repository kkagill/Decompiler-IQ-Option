package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.PagedList.Callback;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncDifferConfig.Builder;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class AsyncPagedListDiffer<T> {
    final AsyncDifferConfig<T> mConfig;
    private boolean mIsContiguous;
    private final List<PagedListListener<T>> mListeners = new CopyOnWriteArrayList();
    Executor mMainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
    int mMaxScheduledGeneration;
    private PagedList<T> mPagedList;
    private Callback mPagedListCallback = new Callback() {
        public void onInserted(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onInserted(i, i2);
        }

        public void onRemoved(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onRemoved(i, i2);
        }

        public void onChanged(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onChanged(i, i2, null);
        }
    };
    private PagedList<T> mSnapshot;
    final ListUpdateCallback mUpdateCallback;

    public interface PagedListListener<T> {
        void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2);
    }

    public AsyncPagedListDiffer(@NonNull Adapter adapter, @NonNull ItemCallback<T> itemCallback) {
        this.mUpdateCallback = new AdapterListUpdateCallback(adapter);
        this.mConfig = new Builder(itemCallback).build();
    }

    public AsyncPagedListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
    }

    @Nullable
    public T getItem(int i) {
        PagedList pagedList = this.mPagedList;
        if (pagedList == null) {
            pagedList = this.mSnapshot;
            if (pagedList != null) {
                return pagedList.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList.loadAround(i);
        return this.mPagedList.get(i);
    }

    public int getItemCount() {
        PagedList pagedList = this.mPagedList;
        if (pagedList != null) {
            return pagedList.size();
        }
        pagedList = this.mSnapshot;
        return pagedList == null ? 0 : pagedList.size();
    }

    public void submitList(@Nullable PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public void submitList(@Nullable PagedList<T> pagedList, @Nullable Runnable runnable) {
        if (pagedList != null) {
            if (this.mPagedList == null && this.mSnapshot == null) {
                this.mIsContiguous = pagedList.isContiguous();
            } else if (pagedList.isContiguous() != this.mIsContiguous) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        PagedList pagedList2 = this.mPagedList;
        if (pagedList == pagedList2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        PagedList pagedList3 = this.mSnapshot;
        if (pagedList3 != null) {
            pagedList2 = pagedList3;
        }
        PagedList pagedList4;
        if (pagedList == null) {
            int itemCount = getItemCount();
            pagedList4 = this.mPagedList;
            if (pagedList4 != null) {
                pagedList4.removeWeakCallback(this.mPagedListCallback);
                this.mPagedList = null;
            } else if (this.mSnapshot != null) {
                this.mSnapshot = null;
            }
            this.mUpdateCallback.onRemoved(0, itemCount);
            onCurrentListChanged(pagedList2, null, runnable);
        } else if (this.mPagedList == null && this.mSnapshot == null) {
            this.mPagedList = pagedList;
            pagedList.addWeakCallback(null, this.mPagedListCallback);
            this.mUpdateCallback.onInserted(0, pagedList.size());
            onCurrentListChanged(null, pagedList, runnable);
        } else {
            pagedList2 = this.mPagedList;
            if (pagedList2 != null) {
                pagedList2.removeWeakCallback(this.mPagedListCallback);
                this.mSnapshot = (PagedList) this.mPagedList.snapshot();
                this.mPagedList = null;
            }
            pagedList4 = this.mSnapshot;
            if (pagedList4 == null || this.mPagedList != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            final PagedList pagedList5 = (PagedList) pagedList.snapshot();
            final PagedList<T> pagedList6 = pagedList;
            final Runnable runnable2 = runnable;
            this.mConfig.getBackgroundThreadExecutor().execute(new Runnable() {
                public void run() {
                    final DiffResult computeDiff = PagedStorageDiffHelper.computeDiff(pagedList4.mStorage, pagedList5.mStorage, AsyncPagedListDiffer.this.mConfig.getDiffCallback());
                    AsyncPagedListDiffer.this.mMainThreadExecutor.execute(new Runnable() {
                        public void run() {
                            if (AsyncPagedListDiffer.this.mMaxScheduledGeneration == i) {
                                AsyncPagedListDiffer.this.latchPagedList(pagedList6, pagedList5, computeDiff, pagedList4.mLastLoad, runnable2);
                            }
                        }
                    });
                }
            });
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void latchPagedList(@NonNull PagedList<T> pagedList, @NonNull PagedList<T> pagedList2, @NonNull DiffResult diffResult, int i, @Nullable Runnable runnable) {
        PagedList pagedList3 = this.mSnapshot;
        if (pagedList3 == null || this.mPagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.mPagedList = pagedList;
        this.mSnapshot = null;
        PagedStorageDiffHelper.dispatchDiff(this.mUpdateCallback, pagedList3.mStorage, pagedList.mStorage, diffResult);
        pagedList.addWeakCallback(pagedList2, this.mPagedListCallback);
        if (!this.mPagedList.isEmpty()) {
            int transformAnchorIndex = PagedStorageDiffHelper.transformAnchorIndex(diffResult, pagedList3.mStorage, pagedList2.mStorage, i);
            PagedList pagedList4 = this.mPagedList;
            pagedList4.loadAround(Math.max(0, Math.min(pagedList4.size() - 1, transformAnchorIndex)));
        }
        onCurrentListChanged(pagedList3, this.mPagedList, runnable);
    }

    private void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2, @Nullable Runnable runnable) {
        for (PagedListListener onCurrentListChanged : this.mListeners) {
            onCurrentListChanged.onCurrentListChanged(pagedList, pagedList2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addPagedListListener(@NonNull PagedListListener<T> pagedListListener) {
        this.mListeners.add(pagedListListener);
    }

    public void removePagedListListener(@NonNull PagedListListener<T> pagedListListener) {
        this.mListeners.remove(pagedListListener);
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        PagedList pagedList = this.mSnapshot;
        if (pagedList != null) {
            return pagedList;
        }
        return this.mPagedList;
    }
}
