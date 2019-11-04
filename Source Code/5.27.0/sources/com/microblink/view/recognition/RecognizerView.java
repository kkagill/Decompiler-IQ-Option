package com.microblink.view.recognition;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.microblink.geometry.c;
import com.microblink.hardware.orientation.Orientation;
import com.microblink.recognition.InvalidLicenceKeyException;
import com.microblink.recognition.NativeRecognizerWrapper;
import com.microblink.recognition.Right;
import com.microblink.recognition.RightsManager;
import com.microblink.recognizers.settings.RecognitionSettings;
import com.microblink.recognizers.settings.RecognizerSettings;
import com.microblink.secured.aa;
import com.microblink.secured.al.b;
import com.microblink.secured.f;
import com.microblink.secured.i;
import com.microblink.secured.l;
import com.microblink.settings.NativeLibraryInfo;
import com.microblink.util.Log;
import com.microblink.view.BaseCameraView.CameraViewState;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: line */
public class RecognizerView extends f {
    protected RecognitionSettings eue;
    private boolean euh;
    private String euj;
    private String ewm;
    private NativeRecognizerWrapper ezp;
    private RightsManager ezq;
    private c ezr;
    private a ezs;

    private static native long initializeNativeFrameSupport(long[] jArr, int i, int i2, double d);

    private static native void terminateNativeFrameSupport(long j);

    private static native void updateNativeFrameSupport(long j, long[] jArr, int i, int i2);

    static {
        i.bed();
    }

    private long[] getRecognizerSettingses() {
        RecognizerSettings[] bdS = this.eue.bdS();
        if (bdS == null || bdS.length == 0) {
            return null;
        }
        long[] jArr = new long[bdS.length];
        for (int i = 0; i < bdS.length; i++) {
            if (bdS[i] != null) {
                jArr[i] = bdS[i].bdL();
            } else {
                jArr[i] = 0;
            }
        }
        return jArr;
    }

    private final void setRecognitionTimeout(int i) {
        NativeRecognizerWrapper nativeRecognizerWrapper = this.ezp;
        if (nativeRecognizerWrapper.f664IlIllIlIIl == null) {
            Log.a(nativeRecognizerWrapper, "Scheduling timeout after {} miliseconds", Integer.valueOf(i));
            nativeRecognizerWrapper.f664IlIllIlIIl = new Timer();
            nativeRecognizerWrapper.IIIlIIlIll = false;
            nativeRecognizerWrapper.f664IlIllIlIIl.schedule(new TimerTask() {
                public final void run() {
                    NativeRecognizerWrapper.this.IlllllIIIl = 0;
                    NativeRecognizerWrapper.this.IlllllIIIl = 0;
                }
            }, (long) i);
        }
    }

    private Orientation getOrientationForRecognition() {
        Orientation currentOrientation = getCurrentOrientation();
        if (currentOrientation == null || currentOrientation == Orientation.ORIENTATION_UNKNOWN) {
            currentOrientation = getInitialOrientation();
        }
        if (beM()) {
            currentOrientation = currentOrientation.rotate180();
        }
        Log.a(this, "Current orientation for recognition: {}", currentOrientation);
        return currentOrientation;
    }

    @UiThread
    public final void setLicenseKey(@NonNull String str) {
        if (this.eyX != CameraViewState.DESTROYED) {
            throw new IllegalStateException("You must call setLicenseKey prior calling create()");
        } else if (aa.bew()) {
            this.ewm = str;
            this.euj = null;
            this.ezq = null;
            try {
                if (this.ezp == null) {
                    this.ezp = NativeRecognizerWrapper.IlIllIlIIl;
                }
                String llIIlIlIIl = this.ezp.llIIlIlIIl(this.ewm, getContext());
                this.ezq = this.ezp.llIIlIlIIl();
                if (llIIlIlIIl != null) {
                    StringBuilder stringBuilder = new StringBuilder("Failed to validate licence key. Reason: ");
                    stringBuilder.append(llIIlIlIIl);
                    throw new InvalidLicenceKeyException(stringBuilder.toString());
                } else if (NativeLibraryInfo.isProtectionEnabled() && this.ezq.a(Right.PING_USED)) {
                    this.euh = true;
                    b.eyR.a(getContext().getApplicationContext(), new l(str, null, RightsManager.nativeGetPingInterval(this.ezq.IlIllIlIIl)));
                }
            } catch (Throwable th) {
                Log.a(this, th, "Failed to unlock library", new Object[0]);
                this.ewm = null;
                InvalidLicenceKeyException invalidLicenceKeyException = new InvalidLicenceKeyException("Failed to validate licence key because of inner exception.", th);
            }
        } else {
            throw new InvalidLicenceKeyException("Incompatible processor. This device is not supported!");
        }
    }

    public c getScanningRegion() {
        return this.ezr;
    }

    private RightsManager getRightsManager() {
        return this.ezq;
    }

    public static String getNativeLibraryVersionString() {
        return NativeLibraryInfo.getNativeBuildVersion();
    }

    public RecognitionSettings getRecognitionSettings() {
        return this.eue;
    }

    @UiThread
    public void setRecognitionSettings(RecognitionSettings recognitionSettings) {
        if (this.eyX != CameraViewState.DESTROYED) {
            throw new IllegalStateException("Method setGenericRecognizerSettings must be called before calling create()");
        } else if (recognitionSettings != null) {
            this.eue = recognitionSettings;
        }
    }

    @UiThread
    public void setScanResultListener(@NonNull a aVar) {
        if (this.eyX == CameraViewState.DESTROYED) {
            this.ezs = aVar;
            return;
        }
        throw new IllegalStateException("Method setScanResultListener must be called before calling create()");
    }

    public a getScanResultListener() {
        return this.ezs;
    }
}
