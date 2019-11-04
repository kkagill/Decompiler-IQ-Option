package com.jumio.dv.b;

import android.os.Handler;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.iqoption.dto.ToastEntity;
import com.jumio.commons.log.Log;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.dv.api.calls.DvBackend;
import com.jumio.dv.models.DvScanPartModel;
import com.jumio.dv.view.interactors.CompleteView;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;

/* compiled from: CompletePresenter */
public class a extends Presenter<CompleteView> implements Subscriber<Object> {
    private a a;

    /* compiled from: CompletePresenter */
    private class a implements Subscriber<String> {
        private a() {
        }

        /* renamed from: a */
        public void onResult(final String str) {
            if (a.this.isActive()) {
                Log.d("CompletePresenter", "complete call finished");
                ((CompleteView) a.this.getView()).uploadComplete();
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        a.this.a(str);
                    }
                }, ToastEntity.ERROR_TOAST_DURATION);
            }
        }

        public void onError(Throwable th) {
            if (a.this.isActive()) {
                Log.d("CompletePresenter", "finalize call finished");
                a aVar = a.this;
                aVar.onError(DvBackend.errorFromThrowable(((CompleteView) aVar.getView()).getContext(), th, com.jumio.dv.api.calls.a.class));
            }
        }
    }

    public void onResult(Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        Log.i("CompletePresenter", "registering for updates");
        this.a = new a();
        DvScanPartModel dvScanPartModel = (DvScanPartModel) DataAccess.load(((CompleteView) getView()).getContext(), DvScanPartModel.class);
        if (dvScanPartModel != null) {
            DvBackend.complete(((CompleteView) getView()).getContext(), ((CompleteView) getView()).getCredentialsModel(), dvScanPartModel.getScannedImage(), this.a);
        }
    }

    public void onError(Throwable th) {
        if (isActive()) {
            ((CompleteView) getView()).onError(th);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(String str) {
        if (isActive()) {
            LocalBroadcastManager.getInstance(((CompleteView) getView()).getContext()).sendBroadcast(new com.jumio.dv.a(str));
        }
    }

    public void a(JumioError jumioError) {
        LocalBroadcastManager.getInstance(((CompleteView) getView()).getContext()).sendBroadcast(new com.jumio.dv.a(jumioError.getErrorCode(), jumioError.getLocalizedError(((CompleteView) getView()).getContext())));
    }

    public void a() {
        DvScanPartModel dvScanPartModel = (DvScanPartModel) DataAccess.load(((CompleteView) getView()).getContext(), DvScanPartModel.class);
        if (dvScanPartModel != null) {
            DvBackend.complete(((CompleteView) getView()).getContext(), ((CompleteView) getView()).getCredentialsModel(), dvScanPartModel.getScannedImage(), this.a);
        }
    }
}
