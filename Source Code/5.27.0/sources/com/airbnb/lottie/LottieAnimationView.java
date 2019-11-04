package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.view.View.BaseSavedState;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.model.d;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {
    private static final String TAG = "LottieAnimationView";
    private final i<e> cU = new i<e>() {
        /* renamed from: a */
        public void onResult(e eVar) {
            LottieAnimationView.this.setComposition(eVar);
        }
    };
    private final i<Throwable> cV = new i<Throwable>() {
        /* renamed from: a */
        public void onResult(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };
    private final g cW = new g();
    private String cX;
    @RawRes
    private int cY;
    private boolean cZ = false;
    private boolean da = false;
    private boolean db = false;
    private RenderMode dc = RenderMode.AUTOMATIC;
    private Set<k> dd = new HashSet();
    @Nullable
    private n<e> de;
    @Nullable
    private e df;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] dh = new int[RenderMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.airbnb.lottie.RenderMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            dh = r0;
            r0 = dh;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.airbnb.lottie.RenderMode.HARDWARE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = dh;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.airbnb.lottie.RenderMode.SOFTWARE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = dh;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.airbnb.lottie.RenderMode.AUTOMATIC;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView$AnonymousClass3.<clinit>():void");
        }
    }

    private static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = new Creator<a>() {
            /* renamed from: n */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            /* renamed from: t */
            public a[] newArray(int i) {
                return new a[i];
            }
        };
        String cX;
        int cY;
        float di;
        boolean dj;
        String dk;
        int repeatCount;
        int repeatMode;

        /* synthetic */ a(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.cX = parcel.readString();
            this.di = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.dj = z;
            this.dk = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.cX);
            parcel.writeFloat(this.di);
            parcel.writeInt(this.dj);
            parcel.writeString(this.dk);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init(null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(@Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.airbnb.lottie.q.a.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_url);
            String string;
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(com.airbnb.lottie.q.a.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                string = obtainStyledAttributes.getString(com.airbnb.lottie.q.a.LottieAnimationView_lottie_fileName);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (hasValue3) {
                string = obtainStyledAttributes.getString(com.airbnb.lottie.q.a.LottieAnimationView_lottie_url);
                if (string != null) {
                    setAnimationFromUrl(string);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(com.airbnb.lottie.q.a.LottieAnimationView_lottie_autoPlay, false)) {
            this.da = true;
            this.db = true;
        }
        if (obtainStyledAttributes.getBoolean(com.airbnb.lottie.q.a.LottieAnimationView_lottie_loop, false)) {
            this.cW.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(com.airbnb.lottie.q.a.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(com.airbnb.lottie.q.a.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(com.airbnb.lottie.q.a.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(com.airbnb.lottie.q.a.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(com.airbnb.lottie.q.a.LottieAnimationView_lottie_progress, 0.0f));
        o(obtainStyledAttributes.getBoolean(com.airbnb.lottie.q.a.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_colorFilter)) {
            r rVar = new r(obtainStyledAttributes.getColor(com.airbnb.lottie.q.a.LottieAnimationView_lottie_colorFilter, 0));
            a(new d("**"), l.eN, new c(rVar));
        }
        if (obtainStyledAttributes.hasValue(com.airbnb.lottie.q.a.LottieAnimationView_lottie_scale)) {
            this.cW.setScale(obtainStyledAttributes.getFloat(com.airbnb.lottie.q.a.LottieAnimationView_lottie_scale, 1.0f));
        }
        obtainStyledAttributes.recycle();
        g gVar = this.cW;
        if (h.f(getContext()) != 0.0f) {
            z = true;
        }
        gVar.b(Boolean.valueOf(z));
        af();
    }

    public void setImageResource(int i) {
        Y();
        super.setImageResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        Y();
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        Y();
        super.setImageBitmap(bitmap);
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.cW;
        if (drawable2 == drawable3) {
            super.invalidateDrawable(drawable3);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.cX = this.cX;
        aVar.cY = this.cY;
        aVar.di = this.cW.getProgress();
        aVar.dj = this.cW.isAnimating();
        aVar.dk = this.cW.getImageAssetsFolder();
        aVar.repeatMode = this.cW.getRepeatMode();
        aVar.repeatCount = this.cW.getRepeatCount();
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            super.onRestoreInstanceState(aVar.getSuperState());
            this.cX = aVar.cX;
            if (!TextUtils.isEmpty(this.cX)) {
                setAnimation(this.cX);
            }
            this.cY = aVar.cY;
            int i = this.cY;
            if (i != 0) {
                setAnimation(i);
            }
            setProgress(aVar.di);
            if (aVar.dj) {
                Z();
            }
            this.cW.o(aVar.dk);
            setRepeatMode(aVar.repeatMode);
            setRepeatCount(aVar.repeatCount);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        if (this.cW != null) {
            if (isShown()) {
                if (this.cZ) {
                    aa();
                    this.cZ = false;
                }
            } else if (isAnimating()) {
                ad();
                this.cZ = true;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.db && this.da) {
            Z();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        if (isAnimating()) {
            ac();
            this.da = true;
        }
        super.onDetachedFromWindow();
    }

    public void o(boolean z) {
        this.cW.o(z);
    }

    public void setAnimation(@RawRes int i) {
        this.cY = i;
        this.cX = null;
        setCompositionTask(f.a(getContext(), i));
    }

    public void setAnimation(String str) {
        this.cX = str;
        this.cY = 0;
        setCompositionTask(f.d(getContext(), str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        f(str, null);
    }

    public void f(String str, @Nullable String str2) {
        a(new JsonReader(new StringReader(str)), str2);
    }

    public void a(JsonReader jsonReader, @Nullable String str) {
        setCompositionTask(f.b(jsonReader, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(f.c(getContext(), str));
    }

    private void setCompositionTask(n<e> nVar) {
        ae();
        Y();
        this.de = nVar.a(this.cU).c(this.cV);
    }

    private void Y() {
        n nVar = this.de;
        if (nVar != null) {
            nVar.b(this.cU);
            this.de.d(this.cV);
        }
    }

    public void setComposition(@NonNull e eVar) {
        if (d.DBG) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Set Composition \n");
            stringBuilder.append(eVar);
            Log.v(str, stringBuilder.toString());
        }
        this.cW.setCallback(this);
        this.df = eVar;
        boolean b = this.cW.b(eVar);
        af();
        if (getDrawable() != this.cW || b) {
            setImageDrawable(null);
            setImageDrawable(this.cW);
            requestLayout();
            for (k d : this.dd) {
                d.d(eVar);
            }
        }
    }

    @Nullable
    public e getComposition() {
        return this.df;
    }

    @MainThread
    public void Z() {
        if (isShown()) {
            this.cW.Z();
            af();
            return;
        }
        this.cZ = true;
    }

    @MainThread
    public void aa() {
        if (isShown()) {
            this.cW.aa();
            af();
            return;
        }
        this.cZ = true;
    }

    public void setMinFrame(int i) {
        this.cW.setMinFrame(i);
    }

    public float getMinFrame() {
        return this.cW.getMinFrame();
    }

    public void setMinProgress(float f) {
        this.cW.setMinProgress(f);
    }

    public void setMaxFrame(int i) {
        this.cW.setMaxFrame(i);
    }

    public float getMaxFrame() {
        return this.cW.getMaxFrame();
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.cW.setMaxProgress(f);
    }

    public void setMinFrame(String str) {
        this.cW.setMinFrame(str);
    }

    public void setMaxFrame(String str) {
        this.cW.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.cW.setMinAndMaxFrame(str);
    }

    public void setSpeed(float f) {
        this.cW.setSpeed(f);
    }

    public float getSpeed() {
        return this.cW.getSpeed();
    }

    public void a(AnimatorListener animatorListener) {
        this.cW.a(animatorListener);
    }

    public void b(AnimatorListener animatorListener) {
        this.cW.b(animatorListener);
    }

    public void ab() {
        this.cW.ab();
    }

    @Deprecated
    public void p(boolean z) {
        this.cW.setRepeatCount(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.cW.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.cW.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.cW.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.cW.getRepeatCount();
    }

    public boolean isAnimating() {
        return this.cW.isAnimating();
    }

    public void setImageAssetsFolder(String str) {
        this.cW.o(str);
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.cW.getImageAssetsFolder();
    }

    public void setImageAssetDelegate(c cVar) {
        this.cW.setImageAssetDelegate(cVar);
    }

    public void setFontAssetDelegate(b bVar) {
        this.cW.setFontAssetDelegate(bVar);
    }

    public void setTextDelegate(s sVar) {
        this.cW.setTextDelegate(sVar);
    }

    public <T> void a(d dVar, T t, c<T> cVar) {
        this.cW.a(dVar, t, cVar);
    }

    public void setScale(float f) {
        this.cW.setScale(f);
        if (getDrawable() == this.cW) {
            setImageDrawable(null);
            setImageDrawable(this.cW);
        }
    }

    public float getScale() {
        return this.cW.getScale();
    }

    @MainThread
    public void ac() {
        this.cZ = false;
        this.cW.ac();
        af();
    }

    @MainThread
    public void ad() {
        this.da = false;
        this.cZ = false;
        this.cW.ad();
        af();
    }

    public void setFrame(int i) {
        this.cW.setFrame(i);
    }

    public int getFrame() {
        return this.cW.getFrame();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.cW.setProgress(f);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.cW.getProgress();
    }

    public long getDuration() {
        e eVar = this.df;
        return eVar != null ? (long) eVar.ai() : 0;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.cW.setPerformanceTrackingEnabled(z);
    }

    @Nullable
    public p getPerformanceTracker() {
        return this.cW.getPerformanceTracker();
    }

    private void ae() {
        this.df = null;
        this.cW.ae();
    }

    public void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
        if (getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.dc = renderMode;
        af();
    }

    private void af() {
        int i = AnonymousClass3.dh[this.dc.ordinal()];
        int i2 = 2;
        if (i == 1) {
            setLayerType(2, null);
        } else if (i == 2) {
            setLayerType(1, null);
        } else if (i == 3) {
            e eVar = this.df;
            Object obj = null;
            if (eVar == null || !eVar.ag() || VERSION.SDK_INT >= 28) {
                eVar = this.df;
                if (eVar == null || eVar.ah() <= 4) {
                    obj = 1;
                }
            }
            if (obj == null) {
                i2 = 1;
            }
            setLayerType(i2, null);
        }
    }
}
