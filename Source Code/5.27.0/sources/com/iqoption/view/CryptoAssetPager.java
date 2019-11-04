package com.iqoption.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.e.ov;
import com.iqoption.util.ab;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.Map;
import java.util.Set;

public final class CryptoAssetPager extends ViewPager {
    private OnClickListener aHB;
    private Set<String> dmC;
    private Set<String> dmD;
    private Map<String, c> eeH;
    private a eeI;
    private ov eeJ;
    private f eeK;
    private g eeL;
    private ObjectAnimator eeM;
    private AnimatorSet eeN;
    private final OnTouchListener eeO;

    public static final class c {
        int eeT;
        int image;

        public c(int i, int i2) {
            this.image = i;
            this.eeT = i2;
        }
    }

    public interface f {
        void e(@NonNull j jVar);
    }

    public interface g {
        void f(@NonNull j jVar);
    }

    private final class a extends PagerAdapter {
        private final LayoutInflater aPl;
        private ImmutableList<j> eeR;

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* synthetic */ a(CryptoAssetPager cryptoAssetPager, ImmutableList immutableList, LayoutInflater layoutInflater, AnonymousClass1 anonymousClass1) {
            this(immutableList, layoutInflater);
        }

        private a(ImmutableList<j> immutableList, LayoutInflater layoutInflater) {
            this.eeR = immutableList;
            this.aPl = layoutInflater;
        }

        public int getCount() {
            return this.eeR.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int i2;
            int i3;
            int i4 = 0;
            ov q = ov.q(this.aPl, viewGroup, false);
            View root = q.getRoot();
            viewGroup.addView(root);
            j hC = hC(i);
            q.aoo.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(hC));
            c cVar = (c) CryptoAssetPager.this.eeH.get(hC.getInstrumentId());
            if (cVar != null) {
                i2 = cVar.image;
                i3 = cVar.eeT;
            } else {
                i2 = R.drawable.crypto_placeholder;
                i3 = R.drawable.crypto_placeholder_na;
            }
            q.De.setImageResource(i2);
            q.cmg.setImageResource(i3);
            View view = q.cme;
            if (com.iqoption.util.c.a.z(hC)) {
                i4 = 4;
            }
            view.setVisibility(i4);
            q.ciq.setOnClickListener(CryptoAssetPager.this.aHB);
            root.setTag(Integer.valueOf(i));
            if (CryptoAssetPager.this.eeJ == null && CryptoAssetPager.this.getCurrentItem() == i) {
                CryptoAssetPager.this.aXV();
            }
            return root;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @NonNull
        private j hC(int i) {
            return (j) this.eeR.get(i);
        }
    }

    private static class b implements PageTransformer {
        private ov eeS;

        /* Access modifiers changed, original: protected */
        public float ae(float f) {
            return (f * 0.25f) + 0.75f;
        }

        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        public ov aXW() {
            return this.eeS;
        }

        public void transformPage(View view, float f) {
            this.eeS = (ov) DataBindingUtil.getBinding(view);
            float abs = Math.abs(f);
            float f2 = 1.0f - abs;
            float ae = ae(f2);
            this.eeS.cmf.setScaleX(ae);
            this.eeS.cmf.setScaleY(ae);
            this.eeS.cmf.setAlpha(2.0f - abs);
            this.eeS.De.setAlpha(f2);
            this.eeS.cmc.setAlpha(ab.i(f2, 0.66f, 1.0f));
            this.eeS.cmg.setAlpha(abs);
            this.eeS.aoo.setAlpha(f2);
        }
    }

    @TargetApi(21)
    private static final class d extends b {
        private d() {
            super();
        }

        /* synthetic */ d(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void transformPage(View view, float f) {
            super.transformPage(view, f);
            View root = aXW().getRoot();
            root.setTranslationX(-((((float) view.getWidth()) / 1.3f) * f));
            root.setZ(1.0f - Math.abs(f));
        }
    }

    private static class e extends b {
        /* Access modifiers changed, original: protected */
        public float ae(float f) {
            return (f * 0.35f) + 0.65f;
        }

        private e() {
            super();
        }

        /* synthetic */ e(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void transformPage(View view, float f) {
            super.transformPage(view, f);
            aXW().getRoot().setTranslationX(-((((float) view.getWidth()) / 1.9f) * f));
        }
    }

    public void setIconsMap(Map<String, c> map) {
        this.eeH.clear();
        if (map != null) {
            this.eeH.putAll(map);
        }
    }

    public void setBumperedAssets(Set<String> set) {
        this.dmC.clear();
        if (set != null) {
            this.dmC.addAll(set);
        }
        if (this.eeJ != null) {
            aXV();
        }
    }

    public void setClickableAssets(Set<String> set) {
        this.dmD.clear();
        if (set != null) {
            this.dmD.addAll(set);
        }
    }

    private boolean h(j jVar) {
        return jVar != null && this.dmC.contains(jVar.getInstrumentId());
    }

    private boolean i(j jVar) {
        return jVar != null && this.dmD.contains(jVar.getInstrumentId());
    }

    public CryptoAssetPager(Context context) {
        this(context, null);
    }

    public CryptoAssetPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.eeH = new ArrayMap();
        this.dmC = new ArraySet();
        this.dmD = new ArraySet();
        this.aHB = new OnClickListener() {
            public void onClick(View view) {
                j selectedAsset = CryptoAssetPager.this.getSelectedAsset();
                if (selectedAsset != null && CryptoAssetPager.this.eeL != null) {
                    CryptoAssetPager.this.eeL.f(selectedAsset);
                }
            }
        };
        this.eeO = new com.iqoption.view.d.e(new com.iqoption.view.d.f(0.95f)) {
            public boolean d(View view, MotionEvent motionEvent) {
                if (CryptoAssetPager.this.eeN != null) {
                    CryptoAssetPager.this.eeN.cancel();
                }
                return false;
            }
        };
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            addOnPageChangeListener(new OnPageChangeListener() {
                private int eeQ;

                public void onPageScrolled(int i, float f, int i2) {
                }

                public void onPageSelected(int i) {
                }

                public void onPageScrollStateChanged(int i) {
                    if (i == 0 && this.eeQ != CryptoAssetPager.this.getCurrentItem()) {
                        this.eeQ = CryptoAssetPager.this.getCurrentItem();
                        if (CryptoAssetPager.this.eeK != null) {
                            CryptoAssetPager.this.eeK.e(((a) CryptoAssetPager.this.getAdapter()).hC(this.eeQ));
                        }
                        CryptoAssetPager.this.aXV();
                    }
                }
            });
            setOffscreenPageLimit(7);
            setPageTransformer(false, af.ebR ? new d() : new e());
        }
    }

    public void setAssetChangeListener(f fVar) {
        this.eeK = fVar;
    }

    public void setAssetClickListener(g gVar) {
        this.eeL = gVar;
    }

    public void setActives(Iterable<com.iqoption.core.microservices.tradingengine.response.active.a> iterable) {
        if (iterable != null) {
            this.eeI = new a(this, ImmutableList.f(i.b((Iterable) iterable).a(-$$Lambda$CryptoAssetPager$RTU3OBQ1jdZVyRbAUuFCh9ABpVM.INSTANCE)), LayoutInflater.from(getContext()), null);
            setAdapter(this.eeI);
            setCurrentItem(this.eeI.getCount() / 2);
            return;
        }
        this.eeI = null;
        setAdapter(null);
    }

    private static /* synthetic */ j an(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return (aVar == null || aVar.getInstrumentType() != InstrumentType.CRYPTO_INSTRUMENT) ? null : (j) aVar;
    }

    public void setSelectedAsset(int i) {
        a aVar = this.eeI;
        if (aVar != null) {
            int count = aVar.getCount();
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                j a = this.eeI.hC(i3);
                if (a.getActiveId() == i) {
                    String instrumentId = a.getInstrumentId();
                    if (!this.eeH.containsKey(instrumentId)) {
                        instrumentId = null;
                    }
                    com.iqoption.view.drawable.d.jT(instrumentId);
                    i2 = i3;
                    setCurrentItem(i2, true);
                }
            }
            setCurrentItem(i2, true);
        }
    }

    public j getSelectedAsset() {
        a aVar = this.eeI;
        if (aVar == null) {
            return null;
        }
        return aVar.hC(getCurrentItem());
    }

    public Rect getCoinRect() {
        ov ovVar = this.eeJ;
        if (ovVar == null) {
            return null;
        }
        return ak.ah(ovVar.De);
    }

    public void aXT() {
        ov ovVar = this.eeJ;
        if (ovVar != null) {
            ovVar.cmc.aXX();
            ObjectAnimator objectAnimator = this.eeM;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.eeM = ObjectAnimator.ofFloat(this.eeJ.cmc, View.ROTATION, new float[]{0.0f, 360.0f}).setDuration(700);
            this.eeM.setInterpolator(com.iqoption.view.a.a.c.egR);
            this.eeM.setRepeatCount(-1);
            this.eeM.start();
        }
    }

    public void aLa() {
        ov ovVar = this.eeJ;
        if (ovVar != null) {
            ovVar.cmc.aXY();
            ObjectAnimator objectAnimator = this.eeM;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.eeM = null;
            }
        }
    }

    public void aXU() {
        if (this.eeJ != null) {
            AnimatorSet animatorSet = this.eeN;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.eeN = new AnimatorSet();
            CryptoBumperView cryptoBumperView = this.eeJ.cmc;
            r1 = new PropertyValuesHolder[3];
            r1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.9f, 1.0f});
            r1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.9f, 1.0f});
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(cryptoBumperView, r1).setDuration(400);
            duration.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    CryptoAssetPager.this.eeJ.cmc.setDrawStatic(true);
                }
            });
            duration.setInterpolator(com.iqoption.view.a.a.c.egR);
            ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this.eeJ.ciq, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.95f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.95f})}).setDuration(400);
            duration2.setRepeatCount(-1);
            duration2.setRepeatMode(2);
            this.eeN.playSequentially(new Animator[]{duration, duration2});
            this.eeN.start();
        }
    }

    private void aXV() {
        j selectedAsset = getSelectedAsset();
        boolean i = i(selectedAsset);
        boolean h = h(selectedAsset);
        if (this.eeJ != null) {
            AnimatorSet animatorSet = this.eeN;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.eeJ.cmc.setDrawStatic(false);
            this.eeJ.ciq.setOnTouchListener(null);
            this.eeJ = null;
        }
        this.eeJ = (ov) DataBindingUtil.getBinding(findViewWithTag(Integer.valueOf(getCurrentItem())));
        ov ovVar = this.eeJ;
        if (ovVar != null) {
            if (i) {
                ovVar.ciq.setOnTouchListener(this.eeO);
            }
            if (h) {
                aXU();
            }
        }
    }
}
