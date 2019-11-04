package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class LiveDataReactiveStreams {

    private static final class LiveDataPublisher<T> implements b<T> {
        final LifecycleOwner mLifecycle;
        final LiveData<T> mLiveData;

        static final class LiveDataSubscription<T> implements Observer<T>, d {
            volatile boolean mCanceled;
            @Nullable
            T mLatest;
            final LifecycleOwner mLifecycle;
            final LiveData<T> mLiveData;
            boolean mObserving;
            long mRequested;
            final c<? super T> mSubscriber;

            LiveDataSubscription(c<? super T> cVar, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = cVar;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }

            public void onChanged(@Nullable T t) {
                if (!this.mCanceled) {
                    if (this.mRequested > 0) {
                        this.mLatest = null;
                        this.mSubscriber.onNext(t);
                        long j = this.mRequested;
                        if (j != Long.MAX_VALUE) {
                            this.mRequested = j - 1;
                        }
                    } else {
                        this.mLatest = t;
                    }
                }
            }

            public void request(final long j) {
                if (!this.mCanceled) {
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        public void run() {
                            if (!LiveDataSubscription.this.mCanceled) {
                                LiveDataSubscription liveDataSubscription;
                                if (j <= 0) {
                                    liveDataSubscription = LiveDataSubscription.this;
                                    liveDataSubscription.mCanceled = true;
                                    if (liveDataSubscription.mObserving) {
                                        LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                        LiveDataSubscription.this.mObserving = false;
                                    }
                                    liveDataSubscription = LiveDataSubscription.this;
                                    liveDataSubscription.mLatest = null;
                                    liveDataSubscription.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                                    return;
                                }
                                liveDataSubscription = LiveDataSubscription.this;
                                liveDataSubscription.mRequested = liveDataSubscription.mRequested + j >= LiveDataSubscription.this.mRequested ? LiveDataSubscription.this.mRequested + j : Long.MAX_VALUE;
                                if (!LiveDataSubscription.this.mObserving) {
                                    liveDataSubscription = LiveDataSubscription.this;
                                    liveDataSubscription.mObserving = true;
                                    liveDataSubscription.mLiveData.observe(LiveDataSubscription.this.mLifecycle, LiveDataSubscription.this);
                                } else if (LiveDataSubscription.this.mLatest != null) {
                                    liveDataSubscription = LiveDataSubscription.this;
                                    liveDataSubscription.onChanged(liveDataSubscription.mLatest);
                                    LiveDataSubscription.this.mLatest = null;
                                }
                            }
                        }
                    });
                }
            }

            public void cancel() {
                if (!this.mCanceled) {
                    this.mCanceled = true;
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        public void run() {
                            if (LiveDataSubscription.this.mObserving) {
                                LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription.this.mLatest = null;
                        }
                    });
                }
            }
        }

        LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }

        public void subscribe(c<? super T> cVar) {
            cVar.onSubscribe(new LiveDataSubscription(cVar, this.mLifecycle, this.mLiveData));
        }
    }

    private static class PublisherLiveData<T> extends LiveData<T> {
        private final b<T> mPublisher;
        final AtomicReference<LiveDataSubscriber> mSubscriber = new AtomicReference();

        final class LiveDataSubscriber extends AtomicReference<d> implements c<T> {
            LiveDataSubscriber() {
            }

            public void onSubscribe(d dVar) {
                if (compareAndSet(null, dVar)) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.cancel();
                }
            }

            public void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            public void onError(final Throwable th) {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            public void onComplete() {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
            }

            public void cancelSubscription() {
                d dVar = (d) get();
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }

        PublisherLiveData(@NonNull b<T> bVar) {
            this.mPublisher = bVar;
        }

        /* Access modifiers changed, original: protected */
        public void onActive() {
            super.onActive();
            LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        /* Access modifiers changed, original: protected */
        public void onInactive() {
            super.onInactive();
            LiveDataSubscriber liveDataSubscriber = (LiveDataSubscriber) this.mSubscriber.getAndSet(null);
            if (liveDataSubscriber != null) {
                liveDataSubscriber.cancelSubscription();
            }
        }
    }

    private LiveDataReactiveStreams() {
    }

    @NonNull
    public static <T> b<T> toPublisher(@NonNull LifecycleOwner lifecycleOwner, @NonNull LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }

    @NonNull
    public static <T> LiveData<T> fromPublisher(@NonNull b<T> bVar) {
        return new PublisherLiveData(bVar);
    }
}
