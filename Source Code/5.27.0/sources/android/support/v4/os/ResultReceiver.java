package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver.Stub;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        /* renamed from: m */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: s */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };
    final boolean bt = false;
    IResultReceiver bu;
    final Handler mHandler = null;

    class MyRunnable implements Runnable {
        final Bundle bw;
        final int mResultCode;

        MyRunnable(int i, Bundle bundle) {
            this.mResultCode = i;
            this.bw = bundle;
        }

        public void run() {
            ResultReceiver.this.onReceiveResult(this.mResultCode, this.bw);
        }
    }

    class MyResultReceiver extends Stub {
        MyResultReceiver() {
        }

        public void send(int i, Bundle bundle) {
            if (ResultReceiver.this.mHandler != null) {
                ResultReceiver.this.mHandler.post(new MyRunnable(i, bundle));
            } else {
                ResultReceiver.this.onReceiveResult(i, bundle);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.bt) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new MyRunnable(i, bundle));
            } else {
                onReceiveResult(i, bundle);
            }
            return;
        }
        IResultReceiver iResultReceiver = this.bu;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.bu == null) {
                this.bu = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.bu.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.bu = Stub.c(parcel.readStrongBinder());
    }
}
