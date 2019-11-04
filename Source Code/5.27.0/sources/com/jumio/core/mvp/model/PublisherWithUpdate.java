package com.jumio.core.mvp.model;

import android.os.Handler;
import android.os.Looper;
import com.jumio.core.util.ReflectionUtil;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class PublisherWithUpdate<Update, Result> {
    private List<SubscriberWithUpdate<Update, Result>> mSubscribers = new CopyOnWriteArrayList();

    /* Access modifiers changed, original: protected|final */
    public final void publishUpdate(final Update update) {
        for (final SubscriberWithUpdate subscriberWithUpdate : getSubscribers()) {
            if (subscriberWithUpdate != null) {
                try {
                    String str = "onUpdate";
                    Class[] clsArr = new Class[1];
                    InvokeOnUiThread invokeOnUiThread = null;
                    clsArr[0] = update != null ? update.getClass() : null;
                    Method method = ReflectionUtil.getMethod(subscriberWithUpdate, str, clsArr);
                    if (method != null) {
                        invokeOnUiThread = (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class);
                    }
                    if (invokeOnUiThread == null || invokeOnUiThread.value()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                subscriberWithUpdate.onUpdate(update);
                            }
                        });
                    } else {
                        subscriberWithUpdate.onUpdate(update);
                    }
                } catch (NoSuchMethodException unused) {
                    subscriberWithUpdate.onUpdate(update);
                }
            }
        }
    }

    public boolean subscribe(SubscriberWithUpdate<Update, Result> subscriberWithUpdate) {
        return (subscriberWithUpdate == null || getSubscribers().contains(subscriberWithUpdate) || !getSubscribers().add(subscriberWithUpdate)) ? false : true;
    }

    /* Access modifiers changed, original: protected */
    public List<SubscriberWithUpdate<Update, Result>> getSubscribers() {
        return this.mSubscribers;
    }

    public boolean unsubscribe(SubscriberWithUpdate<Update, Result> subscriberWithUpdate) {
        return getSubscribers().remove(subscriberWithUpdate);
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
