package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.databinding.CallbackRegistry.NotifierCallback;
import androidx.databinding.ObservableList.OnListChangedCallback;

public class ListChangeRegistry extends CallbackRegistry<OnListChangedCallback, ObservableList, ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final NotifierCallback<OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new NotifierCallback<OnListChangedCallback, ObservableList, ListChanges>() {
        public void onNotifyCallback(OnListChangedCallback onListChangedCallback, ObservableList observableList, int i, ListChanges listChanges) {
            if (i == 1) {
                onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count);
            } else if (i == 2) {
                onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
            } else if (i == 3) {
                onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.to, listChanges.count);
            } else if (i != 4) {
                onListChangedCallback.onChanged(observableList);
            } else {
                onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count);
            }
        }
    };
    private static final int REMOVED = 4;
    private static final SynchronizedPool<ListChanges> sListChanges = new SynchronizedPool(10);

    static class ListChanges {
        public int count;
        public int start;
        public int to;

        ListChanges() {
        }
    }

    public void notifyChanged(@NonNull ObservableList observableList) {
        notifyCallbacks(observableList, 0, null);
    }

    public void notifyChanged(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 1, acquire(i, 0, i2));
    }

    public void notifyInserted(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 2, acquire(i, 0, i2));
    }

    public void notifyMoved(@NonNull ObservableList observableList, int i, int i2, int i3) {
        notifyCallbacks(observableList, 3, acquire(i, i2, i3));
    }

    public void notifyRemoved(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 4, acquire(i, 0, i2));
    }

    private static ListChanges acquire(int i, int i2, int i3) {
        ListChanges listChanges = (ListChanges) sListChanges.acquire();
        if (listChanges == null) {
            listChanges = new ListChanges();
        }
        listChanges.start = i;
        listChanges.to = i2;
        listChanges.count = i3;
        return listChanges;
    }

    public synchronized void notifyCallbacks(@NonNull ObservableList observableList, int i, ListChanges listChanges) {
        super.notifyCallbacks(observableList, i, listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }
}
