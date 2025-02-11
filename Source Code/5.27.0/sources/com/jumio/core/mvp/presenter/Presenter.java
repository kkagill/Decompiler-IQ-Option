package com.jumio.core.mvp.presenter;

import com.jumio.commons.log.Log;

public abstract class Presenter<V> {
    private final String LOGTAG = "PresenterLifecycle";
    private boolean isActive = false;
    private V mView;

    /* Access modifiers changed, original: protected */
    public void onCreate() {
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
    }

    public abstract void onStart();

    public abstract void onStop();

    public V getView() {
        return this.mView;
    }

    public final void attachView(V v) {
        if (this.mView != v) {
            this.mView = v;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name());
            stringBuilder.append("#onCreate()");
            Log.i("PresenterLifecycle", stringBuilder.toString());
            onCreate();
        }
    }

    public final void detachView() {
        if (this.mView != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name());
            stringBuilder.append("#onDestroy()");
            Log.i("PresenterLifecycle", stringBuilder.toString());
            onDestroy();
            this.mView = null;
        }
    }

    public final void activate() {
        if (!this.isActive) {
            this.isActive = true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name());
            stringBuilder.append("#onStart()");
            Log.i("PresenterLifecycle", stringBuilder.toString());
            onStart();
        }
    }

    public final void deactivate() {
        if (this.isActive) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name());
            stringBuilder.append("#onStop()");
            Log.i("PresenterLifecycle", stringBuilder.toString());
            onStop();
            this.isActive = false;
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean isActive() {
        return this.isActive;
    }

    /* Access modifiers changed, original: protected */
    public boolean hasView() {
        return this.mView != null;
    }

    private String name() {
        return getClass().getSimpleName();
    }
}
