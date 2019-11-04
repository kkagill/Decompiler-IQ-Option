package jumio.bam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.bam.enums.BamErrorCase;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import com.jumio.sdk.models.BaseScanPartModel;
import com.jumio.sdk.presentation.BaseScanPresenter;
import java.util.ArrayList;

/* compiled from: BamScanPresenter */
public class x extends BaseScanPresenter<ag, ExtractionUpdate, w> {
    protected h a;
    protected boolean b;
    protected JumioError c;
    protected ArrayList<String> d;
    private t e;
    private v f;
    private u g;
    private w h;
    private ConditionVariable i;
    private Handler j;

    /* compiled from: BamScanPresenter */
    class a implements Subscriber<String> {
        private a() {
        }

        /* synthetic */ a(x xVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public void onResult(String str) {
            if (!x.this.isActive()) {
            }
        }

        public void onError(Throwable th) {
            if (x.this.isActive()) {
                b.a(b.a(th, c.class) == null);
            }
        }
    }

    /* compiled from: BamScanPresenter */
    class b implements Subscriber<u> {
        private b() {
        }

        /* synthetic */ b(x xVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public void onResult(u uVar) {
            x.this.i.block();
            if (x.this.isActive()) {
                if (uVar != null) {
                    x.this.g = uVar;
                    x.this.d.add(uVar.a());
                } else {
                    x.this.g = new u();
                    x.this.d.add("");
                }
                b.a(x.this.g.b() ^ 1);
                DataAccess.update(((ag) x.this.getView()).getContext(), u.class, x.this.g);
                x.this.mExtractionClient.setDataExtractionActive(true);
                x.this.a = h.SCAN;
                ((ag) x.this.getView()).updateBranding(x.this.g.d());
            }
        }

        public void onError(Throwable th) {
            x.this.i.block();
            if (x.this.isActive()) {
                JumioError a = b.a(th, d.class);
                b.a(a == null);
                x.this.g = new u();
                DataAccess.update(((ag) x.this.getView()).getContext(), u.class, x.this.g);
                if (a != null) {
                    x.this.onError(a);
                } else {
                    x.this.mExtractionClient.setDataExtractionActive(true);
                }
            }
        }
    }

    /* compiled from: BamScanPresenter */
    class c implements Subscriber<String> {
        private c() {
        }

        /* synthetic */ c(x xVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public void onResult(String str) {
            if (!x.this.isActive()) {
            }
        }

        public void onError(Throwable th) {
            if (x.this.isActive()) {
                b.a(b.a(th, e.class) == null);
            }
        }
    }

    public x() {
        this.a = h.STOP;
        this.b = false;
        this.c = null;
        this.d = null;
        this.j = new Handler(Looper.getMainLooper());
        this.d = new ArrayList();
        this.i = new ConditionVariable(false);
        this.e = new t(ScanSide.FRONT, DocumentScanMode.CREDIT);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.i.open();
    }

    public void onPreviewAvailable(PreviewProperties previewProperties) {
        super.onPreviewAvailable(previewProperties);
        this.mExtractionClient.setDataExtractionActive(this.g != null);
    }

    /* Access modifiers changed, original: protected */
    public BaseScanPartModel getScanPartModel() {
        return this.e;
    }

    /* Access modifiers changed, original: protected */
    public PluginMode getScanPluginMode() {
        return PluginMode.CARD;
    }

    /* Access modifiers changed, original: protected */
    public boolean startCameraFrontfacing() {
        return this.f.l();
    }

    /* Access modifiers changed, original: protected */
    public boolean canSwitchCamera() {
        return this.cameraManager.hasMultipleCameras();
    }

    /* Access modifiers changed, original: protected */
    public boolean enableFlashOnStart() {
        return this.f.i();
    }

    public w a() {
        if (this.h == null) {
            this.h = new w();
        }
        return this.h;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        DataAccess.delete(((ag) getView()).getContext(), u.class);
        if (this.f == null) {
            this.f = (v) DataAccess.load(((ag) getView()).getContext(), v.class);
            if (this.f == null) {
                ((ag) getView()).onError(new IllegalStateException("Settings model not present! Be sure to persist it before scanning!"));
                return;
            }
        }
        super.onCreate();
        this.d.clear();
        b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.f, new b(this, null));
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        DataAccess.update(((ag) getView()).getContext(), t.class, this.e);
        DataAccess.delete(((ag) getView()).getContext(), u.class);
    }

    /* renamed from: a */
    public void onUpdate(final ExtractionUpdate extractionUpdate) {
        if (extractionUpdate != null && isActive()) {
            int state = extractionUpdate.getState();
            if (state == ExtractionUpdateState.shotTaken) {
                ((ag) getView()).c();
                this.cameraManager.getImageData(this.e.getScannedImage());
                this.cameraManager.stopPreview(true);
                this.mOrientationListener.disable();
                if (this.f.g()) {
                    try {
                        ((Vibrator) ((ag) getView()).getContext().getSystemService("vibrator")).vibrate(100);
                    } catch (Exception unused) {
                    }
                }
                if (this.f.j() != -1) {
                    try {
                        MediaPlayer create = MediaPlayer.create(((ag) getView()).getContext(), this.f.j());
                        create.setOnCompletionListener(new OnCompletionListener() {
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        create.start();
                    } catch (Exception unused2) {
                    }
                }
            } else if (state == ExtractionUpdateState.notifyFlash) {
                this.cameraManager.requestFlashHint(((Boolean) extractionUpdate.getData()).booleanValue());
            } else if (state == ExtractionUpdateState.notifyFocus) {
                this.cameraManager.requestFocus();
            } else if (state == j.b) {
                b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.e.getScannedImage(), this.g.a(), new a(this, null), (byte[]) extractionUpdate.getData());
            } else {
                this.j.post(new Runnable() {
                    public void run() {
                        if (x.this.mOverlay != null) {
                            x.this.mOverlay.update(extractionUpdate);
                            if (x.this.getView() != null) {
                                ((ag) x.this.getView()).invalidateDrawView(false);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void onResult(w wVar) {
        super.onResult(wVar);
        Log.d("BamScanPresenter", "onResult");
        if (this.a != h.ADDITIONAL_ENTRY && isActive() && this.g != null) {
            if (wVar.f() && this.c == null) {
                this.h = wVar;
                this.cameraManager.stopPreview(true);
                y.c();
                b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.f, wVar, this.g.a(), new c(this, null));
                if (((ag) getView()).a(wVar, this.f)) {
                    ((ag) getView()).b(wVar, this.f);
                    this.a = h.ADDITIONAL_ENTRY;
                    return;
                }
                a(false, false);
                return;
            }
            JumioError jumioError = this.c;
            if (jumioError == null) {
                return;
            }
            if (jumioError.isErrorCase(BamErrorCase.CREDIT_CARD_EXPIRED) || this.c.isErrorCase(BamErrorCase.CREDIT_CARD_NOT_SUPPORTED)) {
                b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.f, wVar, this.g.a(), new c(this, null));
            }
        }
    }

    public ArrayList<String> b() {
        return this.d;
    }

    public void c() {
        JumioError jumioError = this.c;
        if (jumioError == null || jumioError.isRetryable()) {
            this.c = null;
            this.b = false;
            this.a = h.INIT;
            this.mOrientationListener.enable();
            this.mExtractionClient.setDataExtractionActive(false);
            onStart();
            ((ag) getView()).updateCameraControls(canSwitchCamera(), this.cameraManager.isFlashSupported());
            if (this.g != null) {
                ((ag) getView()).updateBranding(this.g.d());
            }
            DataAccess.delete(((ag) getView()).getContext(), u.class);
            b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.f, new b(this, null));
            this.mExtractionClient.reinit();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Retry not possible after receiving error: ");
        stringBuilder.append(this.c.getErrorCode());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public void a(boolean z, boolean z2) {
        if (!this.b) {
            Intent aVar;
            this.b = true;
            if (z) {
                if (z2) {
                    this.c = new JumioError(BamErrorCase.CANCEL_TYPE_BACKGROUND);
                } else if (this.c == null) {
                    this.c = new JumioError(BamErrorCase.CANCEL_TYPE_USER);
                }
                aVar = new a(this.c.getErrorCode(), this.c.getLocalizedError(((ag) getView()).getContext()), new ArrayList(this.d));
            } else {
                if (this.h != null) {
                    b.a(((ag) getView()).getContext(), ((ag) getView()).d(), this.h, this.g.a());
                }
                w wVar = this.h;
                aVar = new a(wVar != null ? wVar.a() : null, new ArrayList(this.d));
            }
            DataAccess.delete(((ag) getView()).getContext(), u.class);
            DataAccess.delete(((ag) getView()).getContext(), t.class);
            DataAccess.delete(((ag) getView()).getContext(), v.class);
            DataAccess.delete(((ag) getView()).getContext(), w.class);
            LocalBroadcastManager.getInstance(((ag) getView()).getContext()).sendBroadcast(aVar);
            this.d.clear();
            b.a();
        }
    }

    public void onCameraError(Throwable th) {
        onError(new JumioError(BamErrorCase.NO_CAMERA_CONNECTION));
    }

    @InvokeOnUiThread
    public void onError(Throwable th) {
        if (isActive() && this.a != h.ADDITIONAL_ENTRY) {
            this.a = h.ERROR;
            Log.printStackTrace(th);
            this.cameraManager.stopPreview(true);
            if (th instanceof JumioError) {
                this.c = (JumioError) th;
            }
            super.onError(th);
        }
    }
}
