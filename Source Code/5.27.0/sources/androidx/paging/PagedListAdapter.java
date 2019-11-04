package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.AsyncPagedListDiffer.PagedListListener;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public abstract class PagedListAdapter<T, VH extends ViewHolder> extends Adapter<VH> {
    final AsyncPagedListDiffer<T> mDiffer;
    private final PagedListListener<T> mListener = new PagedListListener<T>() {
        public void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
            PagedListAdapter.this.onCurrentListChanged(pagedList2);
            PagedListAdapter.this.onCurrentListChanged(pagedList, pagedList2);
        }
    };

    @Deprecated
    public void onCurrentListChanged(@Nullable PagedList<T> pagedList) {
    }

    public void onCurrentListChanged(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
    }

    protected PagedListAdapter(@NonNull ItemCallback<T> itemCallback) {
        this.mDiffer = new AsyncPagedListDiffer((Adapter) this, (ItemCallback) itemCallback);
        this.mDiffer.addPagedListListener(this.mListener);
    }

    protected PagedListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.mDiffer = new AsyncPagedListDiffer(new AdapterListUpdateCallback(this), (AsyncDifferConfig) asyncDifferConfig);
        this.mDiffer.addPagedListListener(this.mListener);
    }

    public void submitList(@Nullable PagedList<T> pagedList) {
        this.mDiffer.submitList(pagedList);
    }

    public void submitList(@Nullable PagedList<T> pagedList, @Nullable Runnable runnable) {
        this.mDiffer.submitList(pagedList, runnable);
    }

    /* Access modifiers changed, original: protected */
    @Nullable
    public T getItem(int i) {
        return this.mDiffer.getItem(i);
    }

    public int getItemCount() {
        return this.mDiffer.getItemCount();
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }
}
