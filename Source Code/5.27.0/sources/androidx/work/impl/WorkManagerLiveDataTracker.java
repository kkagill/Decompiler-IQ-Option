package androidx.work.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

class WorkManagerLiveDataTracker {
    @VisibleForTesting
    final Set<LiveData> mLiveDataSet = Collections.newSetFromMap(new IdentityHashMap());

    static class TrackedLiveData<T> extends MediatorLiveData<T> {
        private final WorkManagerLiveDataTracker mContainer;

        TrackedLiveData(WorkManagerLiveDataTracker workManagerLiveDataTracker, LiveData<T> liveData) {
            this.mContainer = workManagerLiveDataTracker;
            addSource(liveData, new Observer<T>() {
                public void onChanged(@Nullable T t) {
                    TrackedLiveData.this.setValue(t);
                }
            });
        }

        /* Access modifiers changed, original: protected */
        public void onActive() {
            super.onActive();
            this.mContainer.onActive(this);
        }

        /* Access modifiers changed, original: protected */
        public void onInactive() {
            super.onInactive();
            this.mContainer.onInactive(this);
        }
    }

    WorkManagerLiveDataTracker() {
    }

    public <T> LiveData<T> track(LiveData<T> liveData) {
        return new TrackedLiveData(this, liveData);
    }

    /* Access modifiers changed, original: 0000 */
    public void onActive(LiveData liveData) {
        this.mLiveDataSet.add(liveData);
    }

    /* Access modifiers changed, original: 0000 */
    public void onInactive(LiveData liveData) {
        this.mLiveDataSet.remove(liveData);
    }
}
