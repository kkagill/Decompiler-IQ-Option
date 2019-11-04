package com.jumio.core.network;

import android.content.Context;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall.DynamicProvider;
import java.io.OutputStream;

public abstract class SimpleApiCall<T> extends ApiCall<T> {
    private String request;

    /* Access modifiers changed, original: protected */
    public String getBoundary() {
        return null;
    }

    public abstract String getRequest();

    public SimpleApiCall(Context context, DynamicProvider dynamicProvider, Subscriber<T> subscriber) {
        super(context, dynamicProvider, subscriber);
    }

    public SimpleApiCall(Context context, DynamicProvider dynamicProvider) {
        super(context, dynamicProvider);
    }

    /* Access modifiers changed, original: protected */
    public int prepareRequest() {
        this.request = getRequest();
        LogUtils.logServerRequest(getClass().getSimpleName(), this.request);
        return this.request.getBytes().length;
    }

    /* Access modifiers changed, original: protected */
    public void fillRequest(OutputStream outputStream) {
        outputStream.write(this.request.getBytes());
    }
}
