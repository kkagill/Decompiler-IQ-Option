package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;

public class Transformations {
    private Transformations() {
    }

    @MainThread
    public static <X, Y> LiveData<Y> map(@NonNull LiveData<X> liveData, @NonNull final Function<X, Y> function) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() {
            public void onChanged(@Nullable X x) {
                mediatorLiveData.setValue(function.apply(x));
            }
        });
        return mediatorLiveData;
    }

    @MainThread
    public static <X, Y> LiveData<Y> switchMap(@NonNull LiveData<X> liveData, @NonNull final Function<X, LiveData<Y>> function) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() {
            LiveData<Y> mSource;

            public void onChanged(@Nullable X x) {
                LiveData liveData = (LiveData) function.apply(x);
                LiveData liveData2 = this.mSource;
                if (liveData2 != liveData) {
                    if (liveData2 != null) {
                        mediatorLiveData.removeSource(liveData2);
                    }
                    this.mSource = liveData;
                    liveData = this.mSource;
                    if (liveData != null) {
                        mediatorLiveData.addSource(liveData, new Observer<Y>() {
                            public void onChanged(@Nullable Y y) {
                                mediatorLiveData.setValue(y);
                            }
                        });
                    }
                }
            }
        });
        return mediatorLiveData;
    }
}
