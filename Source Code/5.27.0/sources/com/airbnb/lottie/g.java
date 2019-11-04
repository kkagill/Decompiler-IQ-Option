package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.b.b;
import com.airbnb.lottie.c.s;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.d.e;
import com.airbnb.lottie.e.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: LottieDrawable */
public class g extends Drawable implements Animatable, Callback {
    private static final String TAG = "g";
    private int alpha = 255;
    private final e dL = new e();
    private float dM = 1.0f;
    private boolean dN = true;
    private final Set<Object> dO = new HashSet();
    private final ArrayList<a> dP = new ArrayList();
    @Nullable
    private b dQ;
    @Nullable
    private c dR;
    @Nullable
    private com.airbnb.lottie.b.a dS;
    @Nullable
    b dT;
    @Nullable
    s dU;
    private boolean dV;
    @Nullable
    private com.airbnb.lottie.model.layer.b dW;
    private boolean dX;
    private boolean dY = false;
    private e df;
    @Nullable
    private String dk;
    private final Matrix matrix = new Matrix();

    /* compiled from: LottieDrawable */
    private interface a {
        void c(e eVar);
    }

    public int getOpacity() {
        return -3;
    }

    public g() {
        this.dL.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (g.this.dW != null) {
                    g.this.dW.setProgress(g.this.dL.cJ());
                }
            }
        });
    }

    public boolean as() {
        return this.dV;
    }

    public void o(boolean z) {
        if (this.dV != z) {
            if (VERSION.SDK_INT < 19) {
                d.warning("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.dV = z;
            if (this.df != null) {
                at();
            }
        }
    }

    public void o(@Nullable String str) {
        this.dk = str;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.dk;
    }

    public boolean b(e eVar) {
        if (this.df == eVar) {
            return false;
        }
        this.dY = false;
        ae();
        this.df = eVar;
        at();
        this.dL.setComposition(eVar);
        setProgress(this.dL.getAnimatedFraction());
        setScale(this.dM);
        ax();
        Iterator it = new ArrayList(this.dP).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c(eVar);
            it.remove();
        }
        this.dP.clear();
        eVar.setPerformanceTrackingEnabled(this.dX);
        return true;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.dX = z;
        e eVar = this.df;
        if (eVar != null) {
            eVar.setPerformanceTrackingEnabled(z);
        }
    }

    @Nullable
    public p getPerformanceTracker() {
        e eVar = this.df;
        return eVar != null ? eVar.getPerformanceTracker() : null;
    }

    private void at() {
        this.dW = new com.airbnb.lottie.model.layer.b(this, s.e(this.df), this.df.al(), this.df);
    }

    public void ae() {
        if (this.dL.isRunning()) {
            this.dL.cancel();
        }
        this.df = null;
        this.dW = null;
        this.dQ = null;
        this.dL.ae();
        invalidateSelf();
    }

    public void invalidateSelf() {
        if (!this.dY) {
            this.dY = true;
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.alpha = i;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.alpha;
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        d.warning("Use addColorFilter instead.");
    }

    public void draw(@NonNull Canvas canvas) {
        this.dY = false;
        String str = "Drawable#draw";
        d.beginSection(str);
        if (this.dW != null) {
            float f = this.dM;
            float d = d(canvas);
            if (f > d) {
                f = this.dM / d;
            } else {
                d = f;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.df.getBounds().width()) / 2.0f;
                float height = ((float) this.df.getBounds().height()) / 2.0f;
                float f2 = width * d;
                float f3 = height * d;
                canvas.translate((getScale() * width) - f2, (getScale() * height) - f3);
                canvas.scale(f, f, f2, f3);
            }
            this.matrix.reset();
            this.matrix.preScale(d, d);
            this.dW.a(canvas, this.matrix, this.alpha);
            d.k(str);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    @MainThread
    public void start() {
        Z();
    }

    @MainThread
    public void stop() {
        au();
    }

    public boolean isRunning() {
        return isAnimating();
    }

    @MainThread
    public void Z() {
        if (this.dW == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.Z();
                }
            });
            return;
        }
        if (this.dN || getRepeatCount() == 0) {
            this.dL.Z();
        }
        if (!this.dN) {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
    }

    @MainThread
    public void au() {
        this.dP.clear();
        this.dL.au();
    }

    @MainThread
    public void aa() {
        if (this.dW == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.aa();
                }
            });
        } else {
            this.dL.aa();
        }
    }

    public void setMinFrame(final int i) {
        if (this.df == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMinFrame(i);
                }
            });
        } else {
            this.dL.setMinFrame(i);
        }
    }

    public float getMinFrame() {
        return this.dL.getMinFrame();
    }

    public void setMinProgress(final float f) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMinProgress(f);
                }
            });
        } else {
            setMinFrame((int) com.airbnb.lottie.d.g.lerp(eVar.aj(), this.df.ak(), f));
        }
    }

    public void setMaxFrame(final int i) {
        if (this.df == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMaxFrame(i);
                }
            });
        } else {
            this.dL.i(((float) i) + 0.99f);
        }
    }

    public float getMaxFrame() {
        return this.dL.getMaxFrame();
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMaxProgress(f);
                }
            });
        } else {
            setMaxFrame((int) com.airbnb.lottie.d.g.lerp(eVar.aj(), this.df.ak(), f));
        }
    }

    public void setMinFrame(final String str) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMinFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g n = eVar.n(str);
        if (n != null) {
            setMinFrame((int) n.dw);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(str);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setMaxFrame(final String str) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMaxFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g n = eVar.n(str);
        if (n != null) {
            setMaxFrame((int) (n.dw + n.hy));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(str);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setMinAndMaxFrame(final String str) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setMinAndMaxFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g n = eVar.n(str);
        if (n != null) {
            int i = (int) n.dw;
            a(i, ((int) n.hy) + i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find marker with name ");
        stringBuilder.append(str);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void a(final int i, final int i2) {
        if (this.df == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.a(i, i2);
                }
            });
        } else {
            this.dL.f((float) i, ((float) i2) + 0.99f);
        }
    }

    public void setSpeed(float f) {
        this.dL.setSpeed(f);
    }

    public float getSpeed() {
        return this.dL.getSpeed();
    }

    public void a(AnimatorListener animatorListener) {
        this.dL.addListener(animatorListener);
    }

    public void b(AnimatorListener animatorListener) {
        this.dL.removeListener(animatorListener);
    }

    public void ab() {
        this.dL.removeAllListeners();
    }

    public void setFrame(final int i) {
        if (this.df == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setFrame(i);
                }
            });
        } else {
            this.dL.setFrame(i);
        }
    }

    public int getFrame() {
        return (int) this.dL.cK();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        e eVar = this.df;
        if (eVar == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.setProgress(f);
                }
            });
        } else {
            setFrame((int) com.airbnb.lottie.d.g.lerp(eVar.aj(), this.df.ak(), f));
        }
    }

    public void setRepeatMode(int i) {
        this.dL.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.dL.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.dL.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.dL.getRepeatCount();
    }

    public boolean isAnimating() {
        return this.dL.isRunning();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Boolean bool) {
        this.dN = bool.booleanValue();
    }

    public void setScale(float f) {
        this.dM = f;
        ax();
    }

    public void setImageAssetDelegate(c cVar) {
        this.dR = cVar;
        b bVar = this.dQ;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setFontAssetDelegate(b bVar) {
        this.dT = bVar;
        com.airbnb.lottie.b.a aVar = this.dS;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    public void setTextDelegate(s sVar) {
        this.dU = sVar;
    }

    @Nullable
    public s av() {
        return this.dU;
    }

    public boolean aw() {
        return this.dU == null && this.df.am().size() > 0;
    }

    public float getScale() {
        return this.dM;
    }

    public e getComposition() {
        return this.df;
    }

    private void ax() {
        if (this.df != null) {
            float scale = getScale();
            setBounds(0, 0, (int) (((float) this.df.getBounds().width()) * scale), (int) (((float) this.df.getBounds().height()) * scale));
        }
    }

    public void ac() {
        this.dP.clear();
        this.dL.cancel();
    }

    public void ad() {
        this.dP.clear();
        this.dL.ad();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.dL.cJ();
    }

    public int getIntrinsicWidth() {
        e eVar = this.df;
        return eVar == null ? -1 : (int) (((float) eVar.getBounds().width()) * getScale());
    }

    public int getIntrinsicHeight() {
        e eVar = this.df;
        return eVar == null ? -1 : (int) (((float) eVar.getBounds().height()) * getScale());
    }

    public List<com.airbnb.lottie.model.d> a(com.airbnb.lottie.model.d dVar) {
        if (this.dW == null) {
            d.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.dW.a(dVar, 0, (List) arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    public <T> void a(final com.airbnb.lottie.model.d dVar, final T t, final c<T> cVar) {
        if (this.dW == null) {
            this.dP.add(new a() {
                public void c(e eVar) {
                    g.this.a(dVar, t, cVar);
                }
            });
            return;
        }
        int i = 1;
        if (dVar.bk() != null) {
            dVar.bk().a(t, cVar);
        } else {
            List a = a(dVar);
            for (int i2 = 0; i2 < a.size(); i2++) {
                ((com.airbnb.lottie.model.d) a.get(i2)).bk().a(t, cVar);
            }
            i = 1 ^ a.isEmpty();
        }
        if (i != 0) {
            invalidateSelf();
            if (t == l.eM) {
                setProgress(getProgress());
            }
        }
    }

    @Nullable
    public Bitmap p(String str) {
        b ay = ay();
        return ay != null ? ay.u(str) : null;
    }

    private b ay() {
        if (getCallback() == null) {
            return null;
        }
        b bVar = this.dQ;
        if (!(bVar == null || bVar.e(getContext()))) {
            this.dQ = null;
        }
        if (this.dQ == null) {
            this.dQ = new b(getCallback(), this.dk, this.dR, this.df.ao());
        }
        return this.dQ;
    }

    @Nullable
    public Typeface g(String str, String str2) {
        com.airbnb.lottie.b.a az = az();
        return az != null ? az.g(str, str2) : null;
    }

    private com.airbnb.lottie.b.a az() {
        if (getCallback() == null) {
            return null;
        }
        if (this.dS == null) {
            this.dS = new com.airbnb.lottie.b.a(getCallback(), this.dT);
        }
        return this.dS;
    }

    @Nullable
    private Context getContext() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    private float d(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.df.getBounds().width()), ((float) canvas.getHeight()) / ((float) this.df.getBounds().height()));
    }
}
