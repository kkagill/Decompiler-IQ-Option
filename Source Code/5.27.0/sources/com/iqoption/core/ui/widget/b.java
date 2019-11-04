package com.iqoption.core.ui.widget;

import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLTextureView */
public class b extends TextureView implements SurfaceTextureListener, OnLayoutChangeListener {
    private static final j bKm = new j();
    private final WeakReference<b> bKn;
    private i bKo;
    private m bKp;
    private e bKq;
    private f bKr;
    private g bKs;
    private k bKt;
    private int bKu;
    private int bKv;
    private boolean bKw;
    private boolean mDetached;

    /* compiled from: GLTextureView */
    public interface e {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: GLTextureView */
    public interface f {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: GLTextureView */
    public interface g {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: GLTextureView */
    private static class h {
        private WeakReference<b> bKG;
        EGL10 bKH;
        EGLDisplay bKI;
        EGLSurface bKJ;
        EGLConfig bKK;
        EGLContext bKL;

        public h(WeakReference<b> weakReference) {
            this.bKG = weakReference;
        }

        public void start() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("start() tid=");
            stringBuilder.append(Thread.currentThread().getId());
            String str = "EglHelper";
            Log.w(str, stringBuilder.toString());
            this.bKH = (EGL10) EGLContext.getEGL();
            this.bKI = this.bKH.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.bKI != EGL10.EGL_NO_DISPLAY) {
                if (this.bKH.eglInitialize(this.bKI, new int[2])) {
                    b bVar = (b) this.bKG.get();
                    if (bVar == null) {
                        this.bKK = null;
                        this.bKL = null;
                    } else {
                        this.bKK = bVar.bKq.chooseConfig(this.bKH, this.bKI);
                        this.bKL = bVar.bKr.createContext(this.bKH, this.bKI, this.bKK);
                    }
                    EGLContext eGLContext = this.bKL;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.bKL = null;
                        hk("createContext");
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("createContext ");
                    stringBuilder.append(this.bKL);
                    stringBuilder.append(" tid=");
                    stringBuilder.append(Thread.currentThread().getId());
                    Log.w(str, stringBuilder.toString());
                    this.bKJ = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        public boolean alQ() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createSurface()  tid=");
            stringBuilder.append(Thread.currentThread().getId());
            String str = "EglHelper";
            Log.w(str, stringBuilder.toString());
            if (this.bKH == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.bKI == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.bKK != null) {
                alU();
                b bVar = (b) this.bKG.get();
                if (bVar != null) {
                    this.bKJ = bVar.bKs.createWindowSurface(this.bKH, this.bKI, this.bKK, bVar.getSurfaceTexture());
                } else {
                    this.bKJ = null;
                }
                EGLSurface eGLSurface = this.bKJ;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.bKH.eglGetError() == 12299) {
                        Log.e(str, "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                EGL10 egl10 = this.bKH;
                EGLDisplay eGLDisplay = this.bKI;
                EGLSurface eGLSurface2 = this.bKJ;
                if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.bKL)) {
                    return true;
                }
                b("EGLHelper", "eglMakeCurrent", this.bKH.eglGetError());
                return false;
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        /* Access modifiers changed, original: 0000 */
        public GL alR() {
            GL gl = this.bKL.getGL();
            b bVar = (b) this.bKG.get();
            if (bVar == null) {
                return gl;
            }
            if (bVar.bKt != null) {
                gl = bVar.bKt.wrap(gl);
            }
            if ((bVar.bKu & 3) == 0) {
                return gl;
            }
            int i = 0;
            Writer writer = null;
            if ((bVar.bKu & 1) != 0) {
                i = 1;
            }
            if ((bVar.bKu & 2) != 0) {
                writer = new l();
            }
            return GLDebugHelper.wrap(gl, i, writer);
        }

        public int alS() {
            return !this.bKH.eglSwapBuffers(this.bKI, this.bKJ) ? this.bKH.eglGetError() : 12288;
        }

        public void alT() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("destroySurface()  tid=");
            stringBuilder.append(Thread.currentThread().getId());
            Log.w("EglHelper", stringBuilder.toString());
            alU();
        }

        private void alU() {
            EGLSurface eGLSurface = this.bKJ;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                this.bKH.eglMakeCurrent(this.bKI, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                b bVar = (b) this.bKG.get();
                if (bVar != null) {
                    bVar.bKs.destroySurface(this.bKH, this.bKI, this.bKJ);
                }
                this.bKJ = null;
            }
        }

        public void finish() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("finish() tid=");
            stringBuilder.append(Thread.currentThread().getId());
            Log.w("EglHelper", stringBuilder.toString());
            if (this.bKL != null) {
                b bVar = (b) this.bKG.get();
                if (bVar != null) {
                    bVar.bKr.destroyContext(this.bKH, this.bKI, this.bKL);
                }
                this.bKL = null;
            }
            EGLDisplay eGLDisplay = this.bKI;
            if (eGLDisplay != null) {
                this.bKH.eglTerminate(eGLDisplay);
                this.bKI = null;
            }
        }

        private void hk(String str) {
            F(str, this.bKH.eglGetError());
        }

        public static void F(String str, int i) {
            str = G(str, i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("throwEglException tid=");
            stringBuilder.append(Thread.currentThread().getId());
            stringBuilder.append(" ");
            stringBuilder.append(str);
            Log.e("EglHelper", stringBuilder.toString());
            throw new RuntimeException(str);
        }

        public static void b(String str, String str2, int i) {
            Log.w(str, G(str2, i));
        }

        public static String G(String str, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" failed: ");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
    }

    /* compiled from: GLTextureView */
    static class i extends Thread {
        private WeakReference<b> bKG;
        private boolean bKM;
        private boolean bKN;
        private boolean bKO;
        private boolean bKP;
        private boolean bKQ;
        private boolean bKR;
        private boolean bKS;
        private boolean bKT;
        private boolean bKU;
        private int bKV = 1;
        private boolean bKW = true;
        private boolean bKX;
        private ArrayList<Runnable> bKY = new ArrayList();
        private boolean bKZ = true;
        private h bLa;
        private int mHeight = 0;
        private boolean mPaused;
        private int mWidth = 0;

        i(WeakReference<b> weakReference) {
            this.bKG = weakReference;
        }

        public void run() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GLThread ");
            stringBuilder.append(getId());
            setName(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("starting tid=");
            stringBuilder.append(getId());
            Log.i("GLThread", stringBuilder.toString());
            try {
                alX();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                b.bKm.a(this);
            }
            b.bKm.a(this);
        }

        private void alV() {
            if (this.bKT) {
                this.bKT = false;
                this.bLa.alT();
            }
        }

        private void alW() {
            if (this.bKS) {
                this.bLa.finish();
                this.bKS = false;
                b.bKm.c(this);
            }
        }

        /* JADX WARNING: Missing block: B:106:0x0261, code skipped:
            if (r7 == null) goto L_0x026c;
     */
        /* JADX WARNING: Missing block: B:108:?, code skipped:
            r7.run();
            r5 = r17;
            r7 = null;
     */
        /* JADX WARNING: Missing block: B:109:0x026c, code skipped:
            if (r9 == null) goto L_0x0296;
     */
        /* JADX WARNING: Missing block: B:110:0x026e, code skipped:
            android.util.Log.w("GLThread", "egl createSurface");
     */
        /* JADX WARNING: Missing block: B:111:0x027b, code skipped:
            if (r1.bLa.alQ() != false) goto L_0x0295;
     */
        /* JADX WARNING: Missing block: B:112:0x027d, code skipped:
            r5 = com.iqoption.core.ui.widget.b.alP();
     */
        /* JADX WARNING: Missing block: B:113:0x0281, code skipped:
            monitor-enter(r5);
     */
        /* JADX WARNING: Missing block: B:116:?, code skipped:
            r1.bKQ = true;
            com.iqoption.core.ui.widget.b.alP().notifyAll();
     */
        /* JADX WARNING: Missing block: B:117:0x028c, code skipped:
            monitor-exit(r5);
     */
        /* JADX WARNING: Missing block: B:118:0x028d, code skipped:
            r5 = r17;
     */
        /* JADX WARNING: Missing block: B:123:0x0295, code skipped:
            r9 = null;
     */
        /* JADX WARNING: Missing block: B:124:0x0296, code skipped:
            if (r10 == null) goto L_0x02aa;
     */
        /* JADX WARNING: Missing block: B:125:0x0298, code skipped:
            r0 = (javax.microedition.khronos.opengles.GL10) r1.bLa.alR();
            com.iqoption.core.ui.widget.b.alP().a(r0);
            r5 = r0;
            r10 = null;
     */
        /* JADX WARNING: Missing block: B:126:0x02aa, code skipped:
            r5 = r17;
     */
        /* JADX WARNING: Missing block: B:127:0x02ac, code skipped:
            if (r8 == null) goto L_0x02cb;
     */
        /* JADX WARNING: Missing block: B:128:0x02ae, code skipped:
            android.util.Log.w("GLThread", "onSurfaceCreated");
            r0 = (com.iqoption.core.ui.widget.b) r1.bKG.get();
     */
        /* JADX WARNING: Missing block: B:129:0x02bd, code skipped:
            if (r0 == null) goto L_0x02ca;
     */
        /* JADX WARNING: Missing block: B:130:0x02bf, code skipped:
            com.iqoption.core.ui.widget.b.h(r0).onSurfaceCreated(r5, r1.bLa.bKK);
     */
        /* JADX WARNING: Missing block: B:131:0x02ca, code skipped:
            r8 = null;
     */
        /* JADX WARNING: Missing block: B:132:0x02cb, code skipped:
            if (r12 == null) goto L_0x0302;
     */
        /* JADX WARNING: Missing block: B:133:0x02cd, code skipped:
            r12 = new java.lang.StringBuilder();
            r12.append("onSurfaceChanged(");
            r12.append(r4);
            r12.append(", ");
            r12.append(r6);
            r12.append(")");
            android.util.Log.w("GLThread", r12.toString());
            r0 = (com.iqoption.core.ui.widget.b) r1.bKG.get();
     */
        /* JADX WARNING: Missing block: B:134:0x02f8, code skipped:
            if (r0 == null) goto L_0x0301;
     */
        /* JADX WARNING: Missing block: B:135:0x02fa, code skipped:
            com.iqoption.core.ui.widget.b.h(r0).onSurfaceChanged(r5, r4, r6);
     */
        /* JADX WARNING: Missing block: B:136:0x0301, code skipped:
            r12 = null;
     */
        /* JADX WARNING: Missing block: B:138:?, code skipped:
            r0 = (com.iqoption.core.ui.widget.b) r1.bKG.get();
     */
        /* JADX WARNING: Missing block: B:139:0x030a, code skipped:
            if (r0 == null) goto L_0x0313;
     */
        /* JADX WARNING: Missing block: B:141:?, code skipped:
            com.iqoption.core.ui.widget.b.h(r0).onDrawFrame(r5);
     */
        /* JADX WARNING: Missing block: B:143:?, code skipped:
            r0 = r1.bLa.alS();
     */
        /* JADX WARNING: Missing block: B:145:0x031b, code skipped:
            if (r0 == 12288) goto L_0x0358;
     */
        /* JADX WARNING: Missing block: B:147:0x031f, code skipped:
            if (r0 == 12302) goto L_0x033c;
     */
        /* JADX WARNING: Missing block: B:149:?, code skipped:
            com.iqoption.core.ui.widget.b.h.b("GLThread", "eglSwapBuffers", r0);
            r2 = com.iqoption.core.ui.widget.b.alP();
     */
        /* JADX WARNING: Missing block: B:150:0x032c, code skipped:
            monitor-enter(r2);
     */
        /* JADX WARNING: Missing block: B:153:?, code skipped:
            r1.bKQ = true;
            com.iqoption.core.ui.widget.b.alP().notifyAll();
     */
        /* JADX WARNING: Missing block: B:154:0x0337, code skipped:
            monitor-exit(r2);
     */
        /* JADX WARNING: Missing block: B:162:?, code skipped:
            r11 = new java.lang.StringBuilder();
            r11.append("egl context lost tid=");
            r11.append(getId());
            android.util.Log.i("GLThread", r11.toString());
     */
        /* JADX WARNING: Missing block: B:163:0x0357, code skipped:
            r11 = 1;
     */
        /* JADX WARNING: Missing block: B:164:0x0358, code skipped:
            if (r13 == null) goto L_0x035b;
     */
        /* JADX WARNING: Missing block: B:165:0x035a, code skipped:
            r14 = 1;
     */
        /* JADX WARNING: Missing block: B:166:0x035b, code skipped:
            r1 = r19;
     */
        /* JADX WARNING: Missing block: B:167:0x0360, code skipped:
            r0 = th;
     */
        /* JADX WARNING: Missing block: B:168:0x0361, code skipped:
            r2 = r19;
     */
        /* JADX WARNING: Missing block: B:187:0x0409, code skipped:
            monitor-enter(com.iqoption.core.ui.widget.b.alP());
     */
        /* JADX WARNING: Missing block: B:189:?, code skipped:
            alV();
            alW();
     */
        /* JADX WARNING: Missing block: B:191:0x0411, code skipped:
            throw r0;
     */
        private void alX() {
            /*
            r19 = this;
            r1 = r19;
            r0 = new com.iqoption.core.ui.widget.b$h;
            r2 = r1.bKG;
            r0.<init>(r2);
            r1.bLa = r0;
            r0 = 0;
            r1.bKS = r0;
            r1.bKT = r0;
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
        L_0x001c:
            r15 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0403 }
            monitor-enter(r15);	 Catch:{ all -> 0x0403 }
        L_0x0021:
            r2 = r1.bKM;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x0036;
        L_0x0025:
            monitor-exit(r15);	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r2);
            r19.alV();	 Catch:{ all -> 0x0033 }
            r19.alW();	 Catch:{ all -> 0x0033 }
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            return;
        L_0x0033:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            throw r0;
        L_0x0036:
            r2 = r1.bKY;	 Catch:{ all -> 0x03fb }
            r2 = r2.isEmpty();	 Catch:{ all -> 0x03fb }
            if (r2 != 0) goto L_0x004d;
        L_0x003e:
            r2 = r1.bKY;	 Catch:{ all -> 0x03fb }
            r7 = 0;
            r2 = r2.remove(r7);	 Catch:{ all -> 0x03fb }
            r2 = (java.lang.Runnable) r2;	 Catch:{ all -> 0x03fb }
            r7 = r2;
            r17 = r5;
            r2 = 0;
            goto L_0x0260;
        L_0x004d:
            r2 = r1.mPaused;	 Catch:{ all -> 0x03fb }
            r0 = r1.bKO;	 Catch:{ all -> 0x03fb }
            if (r2 == r0) goto L_0x008b;
        L_0x0053:
            r0 = r1.bKO;	 Catch:{ all -> 0x03fb }
            r2 = r1.bKO;	 Catch:{ all -> 0x03fb }
            r1.mPaused = r2;	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.notifyAll();	 Catch:{ all -> 0x03fb }
            r2 = "GLThread";
            r16 = r0;
            r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r0.<init>();	 Catch:{ all -> 0x03fb }
            r17 = r3;
            r3 = "mPaused is now ";
            r0.append(r3);	 Catch:{ all -> 0x03fb }
            r3 = r1.mPaused;	 Catch:{ all -> 0x03fb }
            r0.append(r3);	 Catch:{ all -> 0x03fb }
            r3 = " tid=";
            r0.append(r3);	 Catch:{ all -> 0x03fb }
            r18 = r4;
            r3 = r19.getId();	 Catch:{ all -> 0x03fb }
            r0.append(r3);	 Catch:{ all -> 0x03fb }
            r0 = r0.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r0);	 Catch:{ all -> 0x03fb }
            goto L_0x0091;
        L_0x008b:
            r17 = r3;
            r18 = r4;
            r16 = 0;
        L_0x0091:
            r0 = r1.bKU;	 Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x00ba;
        L_0x0095:
            r0 = "GLThread";
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r2.<init>();	 Catch:{ all -> 0x03fb }
            r3 = "releasing EGL context because asked to tid=";
            r2.append(r3);	 Catch:{ all -> 0x03fb }
            r3 = r19.getId();	 Catch:{ all -> 0x03fb }
            r2.append(r3);	 Catch:{ all -> 0x03fb }
            r2 = r2.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r0, r2);	 Catch:{ all -> 0x03fb }
            r19.alV();	 Catch:{ all -> 0x03fb }
            r19.alW();	 Catch:{ all -> 0x03fb }
            r0 = 0;
            r1.bKU = r0;	 Catch:{ all -> 0x03fb }
            r0 = 1;
            goto L_0x00bc;
        L_0x00ba:
            r0 = r17;
        L_0x00bc:
            if (r11 == 0) goto L_0x00c5;
        L_0x00be:
            r19.alV();	 Catch:{ all -> 0x03fb }
            r19.alW();	 Catch:{ all -> 0x03fb }
            r11 = 0;
        L_0x00c5:
            if (r16 == 0) goto L_0x00eb;
        L_0x00c7:
            r2 = r1.bKT;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x00eb;
        L_0x00cb:
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "releasing EGL surface because paused tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r17 = r5;
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
            r19.alV();	 Catch:{ all -> 0x03fb }
            goto L_0x00ed;
        L_0x00eb:
            r17 = r5;
        L_0x00ed:
            if (r16 == 0) goto L_0x012f;
        L_0x00ef:
            r2 = r1.bKS;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x012f;
        L_0x00f3:
            r2 = r1.bKG;	 Catch:{ all -> 0x03fb }
            r2 = r2.get();	 Catch:{ all -> 0x03fb }
            r2 = (com.iqoption.core.ui.widget.b) r2;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x0105;
        L_0x00fd:
            r2 = r2.bKw;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x0105;
        L_0x0103:
            r2 = 1;
            goto L_0x0106;
        L_0x0105:
            r2 = 0;
        L_0x0106:
            if (r2 == 0) goto L_0x0112;
        L_0x0108:
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2 = r2.ame();	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x012f;
        L_0x0112:
            r19.alW();	 Catch:{ all -> 0x03fb }
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "releasing EGL context because paused tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
        L_0x012f:
            if (r16 == 0) goto L_0x015b;
        L_0x0131:
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2 = r2.amf();	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x015b;
        L_0x013b:
            r2 = r1.bLa;	 Catch:{ all -> 0x03fb }
            r2.finish();	 Catch:{ all -> 0x03fb }
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "terminating EGL because paused tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
        L_0x015b:
            r2 = r1.bKP;	 Catch:{ all -> 0x03fb }
            if (r2 != 0) goto L_0x0191;
        L_0x015f:
            r2 = r1.bKR;	 Catch:{ all -> 0x03fb }
            if (r2 != 0) goto L_0x0191;
        L_0x0163:
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "noticed surfaceView surface lost tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
            r2 = r1.bKT;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x0184;
        L_0x0181:
            r19.alV();	 Catch:{ all -> 0x03fb }
        L_0x0184:
            r2 = 1;
            r1.bKR = r2;	 Catch:{ all -> 0x03fb }
            r2 = 0;
            r1.bKQ = r2;	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.notifyAll();	 Catch:{ all -> 0x03fb }
        L_0x0191:
            r2 = r1.bKP;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x01bd;
        L_0x0195:
            r2 = r1.bKR;	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x01bd;
        L_0x0199:
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "noticed surfaceView surface acquired tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
            r2 = 0;
            r1.bKR = r2;	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.notifyAll();	 Catch:{ all -> 0x03fb }
        L_0x01bd:
            if (r14 == 0) goto L_0x01e5;
        L_0x01bf:
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r4 = "sending render notification tid=";
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r4 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r4);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
            r2 = 1;
            r1.bKX = r2;	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.notifyAll();	 Catch:{ all -> 0x03fb }
            r13 = 0;
            r14 = 0;
        L_0x01e5:
            r2 = r19.alZ();	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x036a;
        L_0x01eb:
            r2 = r1.bKS;	 Catch:{ all -> 0x0365 }
            if (r2 != 0) goto L_0x0217;
        L_0x01ef:
            if (r0 == 0) goto L_0x01f3;
        L_0x01f1:
            r0 = 0;
            goto L_0x0217;
        L_0x01f3:
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2 = r2.b(r1);	 Catch:{ all -> 0x03fb }
            if (r2 == 0) goto L_0x0217;
        L_0x01fd:
            r2 = r1.bLa;	 Catch:{ RuntimeException -> 0x020e }
            r2.start();	 Catch:{ RuntimeException -> 0x020e }
            r2 = 1;
            r1.bKS = r2;	 Catch:{ all -> 0x03fb }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.notifyAll();	 Catch:{ all -> 0x03fb }
            r8 = 1;
            goto L_0x0217;
        L_0x020e:
            r0 = move-exception;
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x03fb }
            r2.c(r1);	 Catch:{ all -> 0x03fb }
            throw r0;	 Catch:{ all -> 0x03fb }
        L_0x0217:
            r2 = r1.bKS;	 Catch:{ all -> 0x0365 }
            if (r2 == 0) goto L_0x0225;
        L_0x021b:
            r2 = r1.bKT;	 Catch:{ all -> 0x03fb }
            if (r2 != 0) goto L_0x0225;
        L_0x021f:
            r2 = 1;
            r1.bKT = r2;	 Catch:{ all -> 0x03fb }
            r9 = 1;
            r10 = 1;
            r12 = 1;
        L_0x0225:
            r2 = r1.bKT;	 Catch:{ all -> 0x0365 }
            if (r2 == 0) goto L_0x036a;
        L_0x0229:
            r2 = r1.bKZ;	 Catch:{ all -> 0x0365 }
            if (r2 == 0) goto L_0x0253;
        L_0x022d:
            r4 = r1.mWidth;	 Catch:{ all -> 0x03fb }
            r6 = r1.mHeight;	 Catch:{ all -> 0x03fb }
            r2 = "GLThread";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03fb }
            r3.<init>();	 Catch:{ all -> 0x03fb }
            r5 = "noticing that we want render notification tid=";
            r3.append(r5);	 Catch:{ all -> 0x03fb }
            r12 = r19.getId();	 Catch:{ all -> 0x03fb }
            r3.append(r12);	 Catch:{ all -> 0x03fb }
            r3 = r3.toString();	 Catch:{ all -> 0x03fb }
            android.util.Log.i(r2, r3);	 Catch:{ all -> 0x03fb }
            r2 = 0;
            r1.bKZ = r2;	 Catch:{ all -> 0x03fb }
            r2 = 0;
            r9 = 1;
            r12 = 1;
            r13 = 1;
            goto L_0x0256;
        L_0x0253:
            r4 = r18;
            r2 = 0;
        L_0x0256:
            r1.bKW = r2;	 Catch:{ all -> 0x0365 }
            r3 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0365 }
            r3.notifyAll();	 Catch:{ all -> 0x0365 }
            r3 = r0;
        L_0x0260:
            monitor-exit(r15);	 Catch:{ all -> 0x0365 }
            if (r7 == 0) goto L_0x026c;
        L_0x0263:
            r7.run();	 Catch:{ all -> 0x0403 }
            r5 = r17;
            r0 = 0;
            r7 = 0;
            goto L_0x001c;
        L_0x026c:
            if (r9 == 0) goto L_0x0296;
        L_0x026e:
            r0 = "GLThread";
            r5 = "egl createSurface";
            android.util.Log.w(r0, r5);	 Catch:{ all -> 0x0403 }
            r0 = r1.bLa;	 Catch:{ all -> 0x0403 }
            r0 = r0.alQ();	 Catch:{ all -> 0x0403 }
            if (r0 != 0) goto L_0x0295;
        L_0x027d:
            r5 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0403 }
            monitor-enter(r5);	 Catch:{ all -> 0x0403 }
            r0 = 1;
            r1.bKQ = r0;	 Catch:{ all -> 0x0292 }
            r0 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0292 }
            r0.notifyAll();	 Catch:{ all -> 0x0292 }
            monitor-exit(r5);	 Catch:{ all -> 0x0292 }
            r5 = r17;
            r0 = 0;
            goto L_0x001c;
        L_0x0292:
            r0 = move-exception;
            monitor-exit(r5);	 Catch:{ all -> 0x0292 }
            throw r0;	 Catch:{ all -> 0x0403 }
        L_0x0295:
            r9 = 0;
        L_0x0296:
            if (r10 == 0) goto L_0x02aa;
        L_0x0298:
            r0 = r1.bLa;	 Catch:{ all -> 0x0403 }
            r0 = r0.alR();	 Catch:{ all -> 0x0403 }
            r0 = (javax.microedition.khronos.opengles.GL10) r0;	 Catch:{ all -> 0x0403 }
            r5 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0403 }
            r5.a(r0);	 Catch:{ all -> 0x0403 }
            r5 = r0;
            r10 = 0;
            goto L_0x02ac;
        L_0x02aa:
            r5 = r17;
        L_0x02ac:
            if (r8 == 0) goto L_0x02cb;
        L_0x02ae:
            r0 = "GLThread";
            r8 = "onSurfaceCreated";
            android.util.Log.w(r0, r8);	 Catch:{ all -> 0x0403 }
            r0 = r1.bKG;	 Catch:{ all -> 0x0403 }
            r0 = r0.get();	 Catch:{ all -> 0x0403 }
            r0 = (com.iqoption.core.ui.widget.b) r0;	 Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x02ca;
        L_0x02bf:
            r0 = r0.bKp;	 Catch:{ all -> 0x0403 }
            r8 = r1.bLa;	 Catch:{ all -> 0x0403 }
            r8 = r8.bKK;	 Catch:{ all -> 0x0403 }
            r0.onSurfaceCreated(r5, r8);	 Catch:{ all -> 0x0403 }
        L_0x02ca:
            r8 = 0;
        L_0x02cb:
            if (r12 == 0) goto L_0x0302;
        L_0x02cd:
            r0 = "GLThread";
            r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0403 }
            r12.<init>();	 Catch:{ all -> 0x0403 }
            r15 = "onSurfaceChanged(";
            r12.append(r15);	 Catch:{ all -> 0x0403 }
            r12.append(r4);	 Catch:{ all -> 0x0403 }
            r15 = ", ";
            r12.append(r15);	 Catch:{ all -> 0x0403 }
            r12.append(r6);	 Catch:{ all -> 0x0403 }
            r15 = ")";
            r12.append(r15);	 Catch:{ all -> 0x0403 }
            r12 = r12.toString();	 Catch:{ all -> 0x0403 }
            android.util.Log.w(r0, r12);	 Catch:{ all -> 0x0403 }
            r0 = r1.bKG;	 Catch:{ all -> 0x0403 }
            r0 = r0.get();	 Catch:{ all -> 0x0403 }
            r0 = (com.iqoption.core.ui.widget.b) r0;	 Catch:{ all -> 0x0403 }
            if (r0 == 0) goto L_0x0301;
        L_0x02fa:
            r0 = r0.bKp;	 Catch:{ all -> 0x0403 }
            r0.onSurfaceChanged(r5, r4, r6);	 Catch:{ all -> 0x0403 }
        L_0x0301:
            r12 = 0;
        L_0x0302:
            r0 = r1.bKG;	 Catch:{ all -> 0x0360 }
            r0 = r0.get();	 Catch:{ all -> 0x0360 }
            r0 = (com.iqoption.core.ui.widget.b) r0;	 Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x0313;
        L_0x030c:
            r0 = r0.bKp;	 Catch:{ all -> 0x0403 }
            r0.onDrawFrame(r5);	 Catch:{ all -> 0x0403 }
        L_0x0313:
            r0 = r1.bLa;	 Catch:{ all -> 0x0360 }
            r0 = r0.alS();	 Catch:{ all -> 0x0360 }
            r15 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
            if (r0 == r15) goto L_0x0358;
        L_0x031d:
            r15 = 12302; // 0x300e float:1.7239E-41 double:6.078E-320;
            if (r0 == r15) goto L_0x033c;
        L_0x0321:
            r15 = "GLThread";
            r2 = "eglSwapBuffers";
            com.iqoption.core.ui.widget.b.h.b(r15, r2, r0);	 Catch:{ all -> 0x0403 }
            r2 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0403 }
            monitor-enter(r2);	 Catch:{ all -> 0x0403 }
            r0 = 1;
            r1.bKQ = r0;	 Catch:{ all -> 0x0339 }
            r15 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0339 }
            r15.notifyAll();	 Catch:{ all -> 0x0339 }
            monitor-exit(r2);	 Catch:{ all -> 0x0339 }
            goto L_0x0358;
        L_0x0339:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0339 }
            throw r0;	 Catch:{ all -> 0x0403 }
        L_0x033c:
            r0 = 1;
            r2 = "GLThread";
            r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0360 }
            r11.<init>();	 Catch:{ all -> 0x0360 }
            r15 = "egl context lost tid=";
            r11.append(r15);	 Catch:{ all -> 0x0360 }
            r0 = r19.getId();	 Catch:{ all -> 0x0360 }
            r11.append(r0);	 Catch:{ all -> 0x0360 }
            r0 = r11.toString();	 Catch:{ all -> 0x0360 }
            android.util.Log.i(r2, r0);	 Catch:{ all -> 0x0360 }
            r11 = 1;
        L_0x0358:
            if (r13 == 0) goto L_0x035b;
        L_0x035a:
            r14 = 1;
        L_0x035b:
            r0 = 0;
            r1 = r19;
            goto L_0x001c;
        L_0x0360:
            r0 = move-exception;
            r2 = r19;
            goto L_0x0405;
        L_0x0365:
            r0 = move-exception;
            r2 = r19;
            goto L_0x03fd;
        L_0x036a:
            r3 = r0;
            r0 = "GLThread";
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0365 }
            r1.<init>();	 Catch:{ all -> 0x0365 }
            r2 = "waiting tid=";
            r1.append(r2);	 Catch:{ all -> 0x0365 }
            r4 = r19.getId();	 Catch:{ all -> 0x0365 }
            r1.append(r4);	 Catch:{ all -> 0x0365 }
            r2 = " mHaveEglContext: ";
            r1.append(r2);	 Catch:{ all -> 0x0365 }
            r2 = r19;
            r4 = r2.bKS;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mHaveEglSurface: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKT;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mPaused: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.mPaused;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mHasSurface: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKP;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mSurfaceIsBad: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKQ;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mWaitingForSurface: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKR;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mWidth: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.mWidth;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mHeight: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.mHeight;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mRequestRender: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKW;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = " mRenderMode: ";
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r4 = r2.bKV;	 Catch:{ all -> 0x0401 }
            r1.append(r4);	 Catch:{ all -> 0x0401 }
            r1 = r1.toString();	 Catch:{ all -> 0x0401 }
            android.util.Log.i(r0, r1);	 Catch:{ all -> 0x0401 }
            r0 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0401 }
            r0.wait();	 Catch:{ all -> 0x0401 }
            r1 = r2;
            r5 = r17;
            r4 = r18;
            r0 = 0;
            goto L_0x0021;
        L_0x03fb:
            r0 = move-exception;
            r2 = r1;
        L_0x03fd:
            monitor-exit(r15);	 Catch:{ all -> 0x0401 }
            throw r0;	 Catch:{ all -> 0x03ff }
        L_0x03ff:
            r0 = move-exception;
            goto L_0x0405;
        L_0x0401:
            r0 = move-exception;
            goto L_0x03fd;
        L_0x0403:
            r0 = move-exception;
            r2 = r1;
        L_0x0405:
            r1 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r1);
            r19.alV();	 Catch:{ all -> 0x0412 }
            r19.alW();	 Catch:{ all -> 0x0412 }
            monitor-exit(r1);	 Catch:{ all -> 0x0412 }
            throw r0;
        L_0x0412:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0412 }
            goto L_0x0416;
        L_0x0415:
            throw r0;
        L_0x0416:
            goto L_0x0415;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.alX():void");
        }

        public boolean alY() {
            return this.bKS && this.bKT && alZ();
        }

        private boolean alZ() {
            return !this.mPaused && this.bKP && !this.bKQ && this.mWidth > 0 && this.mHeight > 0 && (this.bKW || this.bKV == 1);
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (b.bKm) {
                this.bKV = i;
                b.bKm.notifyAll();
            }
        }

        public int getRenderMode() {
            int i;
            synchronized (b.bKm) {
                i = this.bKV;
            }
            return i;
        }

        public void requestRender() {
            synchronized (b.bKm) {
                this.bKW = true;
                b.bKm.notifyAll();
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|22) */
        /* JADX WARNING: Missing block: B:12:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void ama() {
            /*
            r5 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r1 = "GLThread";
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0043 }
            r2.<init>();	 Catch:{ all -> 0x0043 }
            r3 = "surfaceCreated tid=";
            r2.append(r3);	 Catch:{ all -> 0x0043 }
            r3 = r5.getId();	 Catch:{ all -> 0x0043 }
            r2.append(r3);	 Catch:{ all -> 0x0043 }
            r2 = r2.toString();	 Catch:{ all -> 0x0043 }
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x0043 }
            r1 = 1;
            r5.bKP = r1;	 Catch:{ all -> 0x0043 }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0043 }
            r1.notifyAll();	 Catch:{ all -> 0x0043 }
        L_0x0029:
            r1 = r5.bKR;	 Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0041;
        L_0x002d:
            r1 = r5.bKN;	 Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0041;
        L_0x0031:
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x0039 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0039 }
            goto L_0x0029;
        L_0x0039:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0043 }
            r1.interrupt();	 Catch:{ all -> 0x0043 }
            goto L_0x0029;
        L_0x0041:
            monitor-exit(r0);	 Catch:{ all -> 0x0043 }
            return;
        L_0x0043:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0043 }
            goto L_0x0047;
        L_0x0046:
            throw r1;
        L_0x0047:
            goto L_0x0046;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.ama():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|22) */
        /* JADX WARNING: Missing block: B:12:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void amb() {
            /*
            r5 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r1 = "GLThread";
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0043 }
            r2.<init>();	 Catch:{ all -> 0x0043 }
            r3 = "surfaceDestroyed tid=";
            r2.append(r3);	 Catch:{ all -> 0x0043 }
            r3 = r5.getId();	 Catch:{ all -> 0x0043 }
            r2.append(r3);	 Catch:{ all -> 0x0043 }
            r2 = r2.toString();	 Catch:{ all -> 0x0043 }
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x0043 }
            r1 = 0;
            r5.bKP = r1;	 Catch:{ all -> 0x0043 }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0043 }
            r1.notifyAll();	 Catch:{ all -> 0x0043 }
        L_0x0029:
            r1 = r5.bKR;	 Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0041;
        L_0x002d:
            r1 = r5.bKN;	 Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0041;
        L_0x0031:
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x0039 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0039 }
            goto L_0x0029;
        L_0x0039:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0043 }
            r1.interrupt();	 Catch:{ all -> 0x0043 }
            goto L_0x0029;
        L_0x0041:
            monitor-exit(r0);	 Catch:{ all -> 0x0043 }
            return;
        L_0x0043:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0043 }
            goto L_0x0047;
        L_0x0046:
            throw r1;
        L_0x0047:
            goto L_0x0046;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.amb():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|23) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void onPause() {
            /*
            r5 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r1 = "GLThread";
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
            r2.<init>();	 Catch:{ all -> 0x004a }
            r3 = "onPause tid=";
            r2.append(r3);	 Catch:{ all -> 0x004a }
            r3 = r5.getId();	 Catch:{ all -> 0x004a }
            r2.append(r3);	 Catch:{ all -> 0x004a }
            r2 = r2.toString();	 Catch:{ all -> 0x004a }
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x004a }
            r1 = 1;
            r5.bKO = r1;	 Catch:{ all -> 0x004a }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x004a }
            r1.notifyAll();	 Catch:{ all -> 0x004a }
        L_0x0029:
            r1 = r5.bKN;	 Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0048;
        L_0x002d:
            r1 = r5.mPaused;	 Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0048;
        L_0x0031:
            r1 = "Main thread";
            r2 = "onPause waiting for mPaused.";
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x004a }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x0040 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0040 }
            goto L_0x0029;
        L_0x0040:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x004a }
            r1.interrupt();	 Catch:{ all -> 0x004a }
            goto L_0x0029;
        L_0x0048:
            monitor-exit(r0);	 Catch:{ all -> 0x004a }
            return;
        L_0x004a:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x004a }
            goto L_0x004e;
        L_0x004d:
            throw r1;
        L_0x004e:
            goto L_0x004d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.onPause():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|26) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void onResume() {
            /*
            r5 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r1 = "GLThread";
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0053 }
            r2.<init>();	 Catch:{ all -> 0x0053 }
            r3 = "onResume tid=";
            r2.append(r3);	 Catch:{ all -> 0x0053 }
            r3 = r5.getId();	 Catch:{ all -> 0x0053 }
            r2.append(r3);	 Catch:{ all -> 0x0053 }
            r2 = r2.toString();	 Catch:{ all -> 0x0053 }
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x0053 }
            r1 = 0;
            r5.bKO = r1;	 Catch:{ all -> 0x0053 }
            r2 = 1;
            r5.bKW = r2;	 Catch:{ all -> 0x0053 }
            r5.bKX = r1;	 Catch:{ all -> 0x0053 }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0053 }
            r1.notifyAll();	 Catch:{ all -> 0x0053 }
        L_0x002e:
            r1 = r5.bKN;	 Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051;
        L_0x0032:
            r1 = r5.mPaused;	 Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0051;
        L_0x0036:
            r1 = r5.bKX;	 Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051;
        L_0x003a:
            r1 = "Main thread";
            r2 = "onResume waiting for !mPaused.";
            android.util.Log.i(r1, r2);	 Catch:{ all -> 0x0053 }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x0049 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0049 }
            goto L_0x002e;
        L_0x0049:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0053 }
            r1.interrupt();	 Catch:{ all -> 0x0053 }
            goto L_0x002e;
        L_0x0051:
            monitor-exit(r0);	 Catch:{ all -> 0x0053 }
            return;
        L_0x0053:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0053 }
            goto L_0x0057;
        L_0x0056:
            throw r1;
        L_0x0057:
            goto L_0x0056;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.onResume():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|29) */
        /* JADX WARNING: Missing block: B:17:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void ap(int r4, int r5) {
            /*
            r3 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r3.mWidth = r4;	 Catch:{ all -> 0x0056 }
            r3.mHeight = r5;	 Catch:{ all -> 0x0056 }
            r4 = 1;
            r3.bKZ = r4;	 Catch:{ all -> 0x0056 }
            r3.bKW = r4;	 Catch:{ all -> 0x0056 }
            r4 = 0;
            r3.bKX = r4;	 Catch:{ all -> 0x0056 }
            r4 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0056 }
            r4.notifyAll();	 Catch:{ all -> 0x0056 }
        L_0x0018:
            r4 = r3.bKN;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0054;
        L_0x001c:
            r4 = r3.mPaused;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0054;
        L_0x0020:
            r4 = r3.bKX;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0054;
        L_0x0024:
            r4 = r3.alY();	 Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0054;
        L_0x002a:
            r4 = "Main thread";
            r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0056 }
            r5.<init>();	 Catch:{ all -> 0x0056 }
            r1 = "onWindowResize waiting for render complete from tid=";
            r5.append(r1);	 Catch:{ all -> 0x0056 }
            r1 = r3.getId();	 Catch:{ all -> 0x0056 }
            r5.append(r1);	 Catch:{ all -> 0x0056 }
            r5 = r5.toString();	 Catch:{ all -> 0x0056 }
            android.util.Log.i(r4, r5);	 Catch:{ all -> 0x0056 }
            r4 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x004c }
            r4.wait();	 Catch:{ InterruptedException -> 0x004c }
            goto L_0x0018;
        L_0x004c:
            r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0056 }
            r4.interrupt();	 Catch:{ all -> 0x0056 }
            goto L_0x0018;
        L_0x0054:
            monitor-exit(r0);	 Catch:{ all -> 0x0056 }
            return;
        L_0x0056:
            r4 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0056 }
            goto L_0x005a;
        L_0x0059:
            throw r4;
        L_0x005a:
            goto L_0x0059;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.ap(int, int):void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|20) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void amc() {
            /*
            r2 = this;
            r0 = com.iqoption.core.ui.widget.b.bKm;
            monitor-enter(r0);
            r1 = 1;
            r2.bKM = r1;	 Catch:{ all -> 0x0025 }
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ all -> 0x0025 }
            r1.notifyAll();	 Catch:{ all -> 0x0025 }
        L_0x000f:
            r1 = r2.bKN;	 Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0023;
        L_0x0013:
            r1 = com.iqoption.core.ui.widget.b.bKm;	 Catch:{ InterruptedException -> 0x001b }
            r1.wait();	 Catch:{ InterruptedException -> 0x001b }
            goto L_0x000f;
        L_0x001b:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0025 }
            r1.interrupt();	 Catch:{ all -> 0x0025 }
            goto L_0x000f;
        L_0x0023:
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            return;
        L_0x0025:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            goto L_0x0029;
        L_0x0028:
            throw r1;
        L_0x0029:
            goto L_0x0028;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.b$i.amc():void");
        }

        public void amd() {
            this.bKU = true;
            b.bKm.notifyAll();
        }
    }

    /* compiled from: GLTextureView */
    private static class j {
        private static String TAG = "GLThreadManager";
        private boolean bLb;
        private int bLc;
        private boolean bLd;
        private boolean bLe;
        private boolean bLf;
        private i bLg;

        private j() {
        }

        public synchronized void a(i iVar) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("exiting tid=");
            stringBuilder.append(iVar.getId());
            Log.i("GLThread", stringBuilder.toString());
            iVar.bKN = true;
            if (this.bLg == iVar) {
                this.bLg = null;
            }
            notifyAll();
        }

        public boolean b(i iVar) {
            i iVar2 = this.bLg;
            if (iVar2 == iVar || iVar2 == null) {
                this.bLg = iVar;
                notifyAll();
                return true;
            }
            amg();
            if (this.bLe) {
                return true;
            }
            iVar = this.bLg;
            if (iVar != null) {
                iVar.amd();
            }
            return false;
        }

        public void c(i iVar) {
            if (this.bLg == iVar) {
                this.bLg = null;
            }
            notifyAll();
        }

        public synchronized boolean ame() {
            return this.bLf;
        }

        public synchronized boolean amf() {
            amg();
            return this.bLe ^ 1;
        }

        public synchronized void a(GL10 gl10) {
            if (!this.bLd) {
                amg();
                String glGetString = gl10.glGetString(7937);
                boolean z = false;
                if (this.bLc < 131072) {
                    this.bLe = !glGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                if (!this.bLe) {
                    z = true;
                }
                this.bLf = z;
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("checkGLDriver renderer = \"");
                stringBuilder.append(glGetString);
                stringBuilder.append("\" multipleContextsAllowed = ");
                stringBuilder.append(this.bLe);
                stringBuilder.append(" mLimitedGLESContexts = ");
                stringBuilder.append(this.bLf);
                Log.w(str, stringBuilder.toString());
                this.bLd = true;
            }
        }

        private void amg() {
            if (!this.bLb) {
                this.bLb = true;
            }
        }
    }

    /* compiled from: GLTextureView */
    public interface k {
        GL wrap(GL gl);
    }

    /* compiled from: GLTextureView */
    static class l extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        l() {
        }

        public void close() {
            flushBuilder();
        }

        public void flush() {
            flushBuilder();
        }

        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                Log.v("GLTextureView", this.mBuilder.toString());
                StringBuilder stringBuilder = this.mBuilder;
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
    }

    /* compiled from: GLTextureView */
    public interface m {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    /* compiled from: GLTextureView */
    private abstract class a implements e {
        protected int[] bKx;

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            this.bKx = g(iArr);
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.bKx, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.bKx, eGLConfigArr, i, iArr)) {
                        EGLConfig a = a(egl10, eGLDisplay, eGLConfigArr);
                        if (a != null) {
                            return a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }

        private int[] g(int[] iArr) {
            if (b.this.bKv != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[(length + 2)];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* compiled from: GLTextureView */
    private class c implements f {
        private int EGL_CONTEXT_CLIENT_VERSION;

        private c() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = new int[]{this.EGL_CONTEXT_CLIENT_VERSION, b.this.bKv, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (b.this.bKv == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("display:");
                stringBuilder.append(eGLDisplay);
                stringBuilder.append(" context: ");
                stringBuilder.append(eGLContext);
                String str = "DefaultContextFactory";
                Log.e(str, stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("tid=");
                stringBuilder2.append(Thread.currentThread().getId());
                Log.i(str, stringBuilder2.toString());
                h.F("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    /* compiled from: GLTextureView */
    private static class d implements g {
        private d() {
        }

        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
                return eGLSurface;
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return eGLSurface;
            }
        }

        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: GLTextureView */
    private class b extends a {
        protected int bKA;
        protected int bKB;
        protected int bKC;
        protected int bKD;
        protected int bKE;
        protected int bKF;
        private int[] bKz = new int[1];

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.bKA = i;
            this.bKB = i2;
            this.bKC = i3;
            this.bKD = i4;
            this.bKE = i5;
            this.bKF = i6;
        }

        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= this.bKE && a2 >= this.bKF) {
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfig2 = eGLConfig;
                    a = a(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                    int a3 = a(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                    int a4 = a(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                    a2 = a(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                    if (a == this.bKA && a3 == this.bKB && a4 == this.bKC && a2 == this.bKD) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.bKz) ? this.bKz[0] : i2;
        }
    }

    /* compiled from: GLTextureView */
    private class n extends b {
        public n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            if (this.bKo != null) {
                this.bKo.amc();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public void setGLWrapper(k kVar) {
        this.bKt = kVar;
    }

    public void setDebugFlags(int i) {
        this.bKu = i;
    }

    public int getDebugFlags() {
        return this.bKu;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.bKw = z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.bKw;
    }

    public void setRenderer(m mVar) {
        alO();
        if (this.bKq == null) {
            this.bKq = new n(true);
        }
        if (this.bKr == null) {
            this.bKr = new c();
        }
        if (this.bKs == null) {
            this.bKs = new d();
        }
        this.bKp = mVar;
        this.bKo = new i(this.bKn);
        this.bKo.start();
    }

    public void setEGLContextFactory(f fVar) {
        alO();
        this.bKr = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        alO();
        this.bKs = gVar;
    }

    public void setEGLConfigChooser(e eVar) {
        alO();
        this.bKq = eVar;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new n(z));
    }

    public void setEGLContextClientVersion(int i) {
        alO();
        this.bKv = i;
    }

    public void setRenderMode(int i) {
        this.bKo.setRenderMode(i);
    }

    public int getRenderMode() {
        return this.bKo.getRenderMode();
    }

    public void requestRender() {
        this.bKo.requestRender();
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.bKo.ama();
    }

    public void b(SurfaceTexture surfaceTexture) {
        this.bKo.amb();
    }

    public void a(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        this.bKo.ap(i2, i3);
    }

    public void onPause() {
        this.bKo.onPause();
    }

    public void onResume() {
        this.bKo.onResume();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAttachedToWindow reattach =");
        stringBuilder.append(this.mDetached);
        Log.d("GLTextureView", stringBuilder.toString());
        if (this.mDetached && this.bKp != null) {
            i iVar = this.bKo;
            int renderMode = iVar != null ? iVar.getRenderMode() : 1;
            this.bKo = new i(this.bKn);
            if (renderMode != 1) {
                this.bKo.setRenderMode(renderMode);
            }
            this.bKo.start();
        }
        this.mDetached = false;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        Log.d("GLTextureView", "onDetachedFromWindow");
        i iVar = this.bKo;
        if (iVar != null) {
            iVar.amc();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(getSurfaceTexture(), 0, i3 - i, i4 - i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        a(surfaceTexture);
        a(surfaceTexture, 0, i, i2);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        a(surfaceTexture, 0, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b(surfaceTexture);
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        requestRender();
    }

    private void alO() {
        if (this.bKo != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }
}
