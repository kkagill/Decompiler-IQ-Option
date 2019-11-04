package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AsyncDifferConfig.Builder;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

public abstract class ListAdapter<T, VH extends ViewHolder> extends Adapter<VH> {
    private final AsyncListDiffer<T> mHelper;

    protected ListAdapter(@NonNull ItemCallback<T> itemCallback) {
        this.mHelper = new AsyncListDiffer(new AdapterListUpdateCallback(this), new Builder(itemCallback).build());
    }

    protected ListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.mHelper = new AsyncListDiffer(new AdapterListUpdateCallback(this), (AsyncDifferConfig) asyncDifferConfig);
    }

    public void submitList(@Nullable List<T> list) {
        this.mHelper.submitList(list);
    }

    /* Access modifiers changed, original: protected */
    public T getItem(int i) {
        return this.mHelper.getCurrentList().get(i);
    }

    public int getItemCount() {
        return this.mHelper.getCurrentList().size();
    }
}
