package com.microblink.directApi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.microblink.a.d;
import com.microblink.geometry.c;
import com.microblink.image.Image;
import com.microblink.image.ImageFrame;
import com.microblink.recognition.FeatureNotSupportedException;
import com.microblink.recognition.InvalidLicenceKeyException;
import com.microblink.recognition.NativeRecognizerWrapper;
import com.microblink.recognition.NativeRecognizerWrapper.b;
import com.microblink.recognition.RecognizerError;
import com.microblink.recognition.Right;
import com.microblink.recognition.RightsManager;
import com.microblink.recognition.callback.RecognitionProcessCallback;
import com.microblink.recognizers.BaseRecognitionResult;
import com.microblink.recognizers.settings.RecognitionSettings;
import com.microblink.recognizers.settings.RecognizerSettings;
import com.microblink.secured.aa;
import com.microblink.secured.al;
import com.microblink.secured.l;
import com.microblink.secured.m;
import com.microblink.settings.NativeLibraryInfo;
import com.microblink.util.Log;
import com.microblink.view.NotSupportedReason;
import com.microblink.view.recognition.a;

/* compiled from: line */
public class Recognizer {
    @SuppressLint({"StaticFieldLeak"})
    private static Recognizer eum = new Recognizer();
    private NativeRecognizerWrapper eub = null;
    private a euc = null;
    private a eud = null;
    private RecognitionSettings eue = new RecognitionSettings();
    private d euf = null;
    private long eug = 1000000;
    private boolean euh = false;
    private String eui = null;
    private String euj = null;
    private RecognitionProcessCallback euk = new RecognitionProcessCallback(null, null, null, 0);
    private State eul = State.OFFLINE;
    private NativeRecognizerWrapper.a eun = new NativeRecognizerWrapper.a() {
        public void a(BaseRecognitionResult[] baseRecognitionResultArr) {
            Recognizer.a(Recognizer.this, baseRecognitionResultArr);
        }

        public void b(BaseRecognitionResult[] baseRecognitionResultArr) {
            Recognizer.a(Recognizer.this, baseRecognitionResultArr);
        }
    };
    private b euo = new b() {
        public void a(RecognizerError recognizerError) {
            Recognizer.this.eud.onRecognizerError(recognizerError);
            synchronized (Recognizer.this) {
                if (Recognizer.this.eul == State.WORKING) {
                    Recognizer.this.eul = State.READY;
                }
            }
        }
    };
    private Context mContext = null;

    /* compiled from: line */
    public enum State {
        OFFLINE,
        UNLOCKED,
        READY,
        WORKING
    }

    private Recognizer() {
    }

    public static Recognizer bdl() {
        if (aa.bew()) {
            return eum;
        }
        throw new FeatureNotSupportedException(NotSupportedReason.UNSUPPORTED_PROCESSOR_ARCHITECTURE);
    }

    public final synchronized void J(@NonNull Context context, @NonNull String str) {
        StringBuilder stringBuilder;
        if (this.eul == State.OFFLINE) {
            this.eui = str;
            try {
                if (this.eub == null) {
                    this.eub = NativeRecognizerWrapper.IlIllIlIIl;
                }
                String llIIlIlIIl = this.eub.llIIlIlIIl(str, context);
                if (llIIlIlIIl != null) {
                    stringBuilder = new StringBuilder("Failed to validate licence key. Reason: ");
                    stringBuilder.append(llIIlIlIIl);
                    llIIlIlIIl = stringBuilder.toString();
                } else if (this.eub.llIIlIlIIl().a(Right.ALLOW_CUSTOM_UI)) {
                    this.eul = State.UNLOCKED;
                } else {
                    this.eub.IIIllIlIIl();
                    Log.b(this, "Direct API requires license key that allows creation of custom UI!", new Object[0]);
                    llIIlIlIIl = "Direct API requires license key that allows creation of custom UI!";
                }
                throw new InvalidLicenceKeyException(llIIlIlIIl);
            } catch (Throwable th) {
                th.printStackTrace();
                InvalidLicenceKeyException invalidLicenceKeyException = new InvalidLicenceKeyException("Failed to validate licence key because of inner exception.", th);
            }
        } else {
            stringBuilder = new StringBuilder("Cannot unlock recognizer when not in offline state! State is ");
            stringBuilder.append(this.eul.name());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final synchronized void aJ(@NonNull String str, @NonNull String str2) {
        StringBuilder stringBuilder;
        if (this.eul == State.OFFLINE) {
            this.eui = str;
            this.euj = str2;
            try {
                if (this.eub == null) {
                    this.eub = NativeRecognizerWrapper.IlIllIlIIl;
                }
                str = this.eub.llIIlIlIIl(str, str2);
                if (str != null) {
                    stringBuilder = new StringBuilder("Failed to validate licence key. Reason: ");
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                } else if (this.eub.llIIlIlIIl().a(Right.ALLOW_CUSTOM_UI)) {
                    this.eul = State.UNLOCKED;
                } else {
                    this.eub.IIIllIlIIl();
                    Log.b(this, "Direct API requires license key that allows creation of custom UI!", new Object[0]);
                    str = "Direct API requires license key that allows creation of custom UI!";
                }
                throw new InvalidLicenceKeyException(str);
            } catch (Throwable th) {
                th.printStackTrace();
                InvalidLicenceKeyException invalidLicenceKeyException = new InvalidLicenceKeyException("Failed to validate licence key because of inner exception.", th);
            }
        } else {
            stringBuilder = new StringBuilder("Cannot unlock recognizer when not in offline state! State is ");
            stringBuilder.append(this.eul.name());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final synchronized void a(@NonNull Context context, @NonNull RecognitionSettings recognitionSettings, @NonNull a aVar) {
        if (this.eul != State.OFFLINE) {
            if (this.eul != State.UNLOCKED) {
                throw new IllegalStateException("Cannot initialize already initialized recognizer!");
            }
        }
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        } else if (aVar != null) {
            if (recognitionSettings == null) {
                recognitionSettings = new RecognitionSettings();
            }
            RecognizerSettings[] bdS = recognitionSettings.bdS();
            if (bdS == null || bdS.length == 0) {
                throw new NullPointerException("Recognizer settings array inside Recognition settings cannot be null nor empty!");
            }
            if (this.eul == State.OFFLINE) {
                if (NativeLibraryInfo.isProtectionEnabled()) {
                    throw new RuntimeException("Failed to initialize recognizer: invalid license key!");
                }
            }
            this.eue = recognitionSettings;
            this.eud = aVar;
            this.eub = NativeRecognizerWrapper.IlIllIlIIl;
            aa aaVar = new aa(context, true);
            this.mContext = context;
            if (NativeLibraryInfo.isProtectionEnabled()) {
                RightsManager llIIlIlIIl = this.eub.llIIlIlIIl();
                if (llIIlIlIIl.a(Right.PING_USED)) {
                    this.euh = true;
                    al.b.eyR.a(this.mContext, new l(this.eui, this.euj, RightsManager.nativeGetPingInterval(llIIlIlIIl.IlIllIlIIl)));
                }
            }
            this.eub.llIIlIlIIl(aaVar, recognitionSettings, this.euo);
            this.eul = State.READY;
        } else {
            throw new NullPointerException("Error listener cannot be null!");
        }
    }

    @UiThread
    public final void a(@NonNull Image image, @NonNull a aVar) {
        a(image, aVar, this.eue);
    }

    @UiThread
    public final void a(@NonNull Image image, @NonNull a aVar, RecognitionSettings recognitionSettings) {
        if (this.eul != State.READY) {
            throw new IllegalStateException("Cannot recognize image. Recognizer not ready!");
        } else if (aVar != null) {
            if (recognitionSettings != this.eue) {
                if (recognitionSettings == null) {
                    recognitionSettings = new RecognitionSettings();
                }
                RecognizerSettings[] bdS = recognitionSettings.bdS();
                if (bdS == null || bdS.length == 0) {
                    throw new NullPointerException("Recognizer settings array inside Recognition settings cannot be null nor empty!");
                }
            }
            RecognitionSettings recognitionSettings2 = recognitionSettings;
            this.euc = aVar;
            this.euk.fG(false);
            if (this.euf != null) {
                Rect bdw = image.bdw();
                this.euk.a(new c(((float) bdw.left) / ((float) image.getWidth()), ((float) bdw.top) / ((float) image.getHeight()), ((float) bdw.width()) / ((float) image.getWidth()), ((float) bdw.height()) / ((float) image.getHeight())));
            }
            NativeRecognizerWrapper nativeRecognizerWrapper = this.eub;
            if (image.isDisposed()) {
                throw new IllegalStateException("Cannot recognize disposed image!");
            }
            long j = this.eug;
            this.eug = 1 + j;
            m imageFrame = new ImageFrame(image, j);
            if (imageFrame.cD(0)) {
                nativeRecognizerWrapper.llIIlIlIIl(imageFrame, recognitionSettings2, this.euk, this.eun, this.euo, true);
                this.eul = State.WORKING;
                return;
            }
            imageFrame.recycle();
            throw new RuntimeException("Failed to process given image. See ADB log for more info.");
        } else {
            throw new NullPointerException("Result listener cannot be null!");
        }
    }

    public synchronized void terminate() {
        if (this.eul != State.OFFLINE) {
            this.euk.fG(true);
            this.eub.terminate();
            this.eul = State.OFFLINE;
            this.eub = null;
            this.eue = null;
            this.euc = null;
            this.eud = null;
            this.euf = null;
            this.mContext = null;
            this.euk = new RecognitionProcessCallback(null, null, null, 0);
        }
    }
}
