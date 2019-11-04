package com.jumio.core.mvp.model;

import android.os.Handler;
import android.os.Looper;
import com.jumio.core.util.ReflectionUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Publisher<Result> {
    private List<Subscriber<Result>> mSubscribers = new ArrayList();

    public boolean add(Subscriber<Result> subscriber) {
        return !getSubscribers().contains(subscriber) && getSubscribers().add(subscriber);
    }

    /* Access modifiers changed, original: protected */
    public List<Subscriber<Result>> getSubscribers() {
        return this.mSubscribers;
    }

    public boolean remove(Subscriber<Result> subscriber) {
        return getSubscribers().remove(subscriber);
    }

    /* Access modifiers changed, original: protected|final */
    public final void publishResult(final Result result) {
        for (final Subscriber subscriber : getSubscribers()) {
            if (subscriber != null) {
                try {
                    String str = "onResult";
                    Class[] clsArr = new Class[1];
                    InvokeOnUiThread invokeOnUiThread = null;
                    clsArr[0] = result != null ? result.getClass() : null;
                    Method method = ReflectionUtil.getMethod(subscriber, str, clsArr);
                    if (method != null) {
                        invokeOnUiThread = (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class);
                    }
                    if (invokeOnUiThread == null || invokeOnUiThread.value()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                subscriber.onResult(result);
                            }
                        });
                    } else {
                        subscriber.onResult(result);
                    }
                } catch (NoSuchMethodException unused) {
                    subscriber.onResult(result);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void publishError(final Throwable th) {
        for (final Subscriber subscriber : getSubscribers()) {
            if (subscriber != null) {
                try {
                    Method method = ReflectionUtil.getMethod(subscriber, "onError", Throwable.class);
                    InvokeOnUiThread invokeOnUiThread = null;
                    if (method != null) {
                        invokeOnUiThread = (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class);
                    }
                    if (invokeOnUiThread == null || invokeOnUiThread.value()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                subscriber.onError(th);
                            }
                        });
                    } else {
                        subscriber.onError(th);
                    }
                } catch (NoSuchMethodException unused) {
                    subscriber.onError(th);
                }
            }
        }
    }
}
