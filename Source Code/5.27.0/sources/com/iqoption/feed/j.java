package com.iqoption.feed;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.ShareCompat.IntentBuilder;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.iqoption.core.microservices.feed.response.FeedPriority;
import com.iqoption.core.ui.Status;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.u;
import com.iqoption.dto.ToastEntity;
import com.iqoption.feed.a.aa;
import com.iqoption.feed.a.ae;
import com.iqoption.feed.a.m;
import com.iqoption.feed.feedlist.c;
import com.iqoption.feed.i.e;
import com.iqoption.feed.i.f;
import com.iqoption.feed.i.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: SmartFeedFragment */
public class j extends d implements d {
    public static final String TAG = "com.iqoption.feed.j";
    private boolean btw;
    private c cPa;
    private int cPb;
    private ae cPc;
    private m cPd;
    private aa cPe;
    private f cPf;
    private AudioManager cPg;
    private int cPh;
    private boolean cPi;
    private b cPj;
    private int cPk = -1;
    private final Set<Integer> cPl = new HashSet();
    private final Map<String, com.iqoption.core.microservices.tradingengine.response.active.a> cPm = new HashMap();
    private final Runnable cPn = new -$$Lambda$j$Es0MJuAxCypOSo6YgvhGPofOv7g(this);
    private final Runnable cPo = new -$$Lambda$j$2K9MU1G0nl5IAscQr15UN9ant5E(this);
    private final OnChildAttachStateChangeListener cPp = new OnChildAttachStateChangeListener() {
        public void onChildViewAttachedToWindow(View view) {
        }

        public void onChildViewDetachedFromWindow(View view) {
            if (view.getId() == e.video_feed) {
                ViewHolder findContainingViewHolder = j.this.avF().findContainingViewHolder(view);
                if (findContainingViewHolder instanceof com.iqoption.feed.feedlist.j) {
                    ((com.iqoption.feed.feedlist.j) findContainingViewHolder).awg();
                }
            }
        }
    };
    private final OnScrollListener cPq = new OnScrollListener() {
        private int cPs;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                j.this.h(recyclerView);
                j.this.avy();
                return;
            }
            j.this.avx();
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            i = recyclerView.getChildCount();
            if (i != 0 && recyclerView.getAdapter() != null) {
                j.this.cPk = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                if (j.this.cPk % 10 == 0) {
                    fO(j.this.cPk);
                }
                if (j.this.btw) {
                    i = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i - 1));
                    if (!j.this.cPi && i > recyclerView.getAdapter().getItemCount() - 15) {
                        j jVar = j.this;
                        jVar.fN(jVar.cPh);
                    }
                }
            }
        }

        private void fO(int i) {
            if (this.cPs < i) {
                this.cPs = i;
                com.iqoption.core.d.Um().EC().e("smart-feed_scroll", (double) i);
            }
        }
    };

    /* compiled from: SmartFeedFragment */
    /* renamed from: com.iqoption.feed.j$5 */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] cPu = new int[Status.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.ui.Status.values();
            r0 = r0.length;
            r0 = new int[r0];
            cPu = r0;
            r0 = cPu;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.ui.Status.LOADING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = cPu;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.ui.Status.SUCCESS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = cPu;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.ui.Status.ERROR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.j$AnonymousClass5.<clinit>():void");
        }
    }

    /* compiled from: SmartFeedFragment */
    public interface a {
        void a(com.google.android.youtube.player.c cVar, YouTubePlayer youTubePlayer);

        void onError();
    }

    /* compiled from: SmartFeedFragment */
    public static class b {
        @Nullable
        private YouTubePlayer cPA;
        @Nullable
        private com.google.android.youtube.player.c cPB;
        private final Map<SurfaceView, ViewGroup> cPC = new HashMap();
        private final com.google.android.youtube.player.b cPv;
        private final Map<String, Integer> cPw = new ArrayMap();
        private boolean cPx;
        private boolean cPy;
        @Nullable
        private String cPz;

        b(com.google.android.youtube.player.b bVar) {
            this.cPv = bVar;
        }

        public void a(a aVar) {
            if (this.cPx) {
                aVar.onError();
                return;
            }
            com.google.android.youtube.player.c cVar = this.cPB;
            if (cVar == null) {
                this.cPx = true;
                b(aVar);
            } else {
                aVar.a(cVar, this.cPA);
            }
        }

        public void bK(String str) {
            if (this.cPA != null) {
                String str2 = this.cPz;
                if (!(str2 == null || TextUtils.equals(str2, str) || !this.cPA.isPlaying())) {
                    hW(this.cPz);
                }
                this.cPz = str;
                this.cPA.bK(str);
            }
        }

        public void hW(String str) {
            try {
                if (this.cPA != null && hX(str) && this.cPA.isPlaying()) {
                    this.cPA.pause();
                    this.cPw.put(str, Integer.valueOf(this.cPA.pr()));
                    this.cPz = null;
                }
            } catch (IllegalStateException unused) {
            }
        }

        public boolean hX(String str) {
            return TextUtils.equals(this.cPz, str);
        }

        private boolean onBackPressed() {
            YouTubePlayer youTubePlayer = this.cPA;
            if (youTubePlayer == null || !this.cPy) {
                return false;
            }
            youTubePlayer.setFullscreen(false);
            return true;
        }

        private void b(final a aVar) {
            if (this.cPv.isAdded()) {
                com.google.android.youtube.player.b bVar = this.cPv;
                bVar.a(bVar.getString(g.you_tube_key), new com.google.android.youtube.player.YouTubePlayer.b() {
                    public void a(YouTubePlayer.e eVar, YouTubeInitializationResult youTubeInitializationResult) {
                    }

                    public void a(YouTubePlayer.e eVar, YouTubePlayer youTubePlayer, boolean z) {
                        com.google.android.youtube.player.c cVar = (com.google.android.youtube.player.c) b.this.cPv.getView();
                        if (cVar == null) {
                            b.this.cPx = false;
                            aVar.onError();
                            return;
                        }
                        b.this.cPB = cVar;
                        b.this.cPB.setLayoutParams(new LayoutParams(-1, -1));
                        b.this.cPB.setId(e.youtube_video);
                        b.this.cPA = youTubePlayer;
                        b.this.cPA.a(new -$$Lambda$j$b$1$iLxxQ-t0XUSqCjDuSEssW8rzoMg(this));
                        b.this.cPA.a(new YouTubePlayer.d() {
                            public void a(ErrorReason errorReason) {
                            }

                            public void pv() {
                            }

                            public void pw() {
                            }

                            public void pu() {
                                b.this.k(b.this.cPB);
                            }

                            public void bL(String str) {
                                if (TextUtils.equals(b.this.cPz, str)) {
                                    Integer num = (Integer) b.this.cPw.get(str);
                                    if (num != null) {
                                        b.this.cPA.bk(num.intValue());
                                        b.this.cPA.play();
                                    }
                                }
                            }

                            public void px() {
                                b.this.cPA.bk(0);
                                b.this.cPA.play();
                            }
                        });
                        b.this.cPA.a(new YouTubePlayer.c() {
                            public void ag(boolean z) {
                            }

                            public void bl(int i) {
                            }

                            public void onStopped() {
                            }

                            public void pt() {
                            }

                            public void onPaused() {
                                if (b.this.cPz != null) {
                                    b.this.cPw.put(b.this.cPz, Integer.valueOf(b.this.cPA.pr()));
                                }
                            }
                        });
                        b.this.cPx = false;
                        aVar.a(b.this.cPB, b.this.cPA);
                    }

                    private /* synthetic */ void dh(boolean z) {
                        b.this.cPy = z;
                    }
                });
                return;
            }
            aVar.onError();
        }

        private void k(com.google.android.youtube.player.c cVar) {
            aT(cVar);
            for (Entry entry : this.cPC.entrySet()) {
                ViewGroup viewGroup = (ViewGroup) entry.getValue();
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.post(new -$$Lambda$j$b$fazP2ZDIyJxAWZVcnQ5dbwERyF8(entry, viewGroup2, viewGroup));
                }
            }
        }

        private static /* synthetic */ void a(Entry entry, ViewGroup viewGroup, ViewGroup viewGroup2) {
            ((SurfaceView) entry.getKey()).setZOrderMediaOverlay(true);
            viewGroup.addView(viewGroup2);
        }

        private SurfaceView aT(View view) {
            if (view instanceof SurfaceView) {
                return (SurfaceView) view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    SurfaceView aT = aT(viewGroup.getChildAt(i));
                    if (aT != null) {
                        aT = aT;
                        this.cPC.put(aT, viewGroup);
                        return aT;
                    }
                }
            }
            return null;
        }
    }

    public static j avw() {
        return new j();
    }

    private /* synthetic */ void JN() {
        if (isAdded()) {
            RecyclerView recyclerView = avJ().cQi;
            if (recyclerView.getScrollState() == 0) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                    if (findContainingViewHolder instanceof com.iqoption.feed.feedlist.a) {
                        com.iqoption.feed.feedlist.a aVar = (com.iqoption.feed.feedlist.a) findContainingViewHolder;
                        if (aVar.Ng() && !aVar.avM() && com.iqoption.core.ext.a.aj(childAt) >= 0.8f) {
                            aVar.avN();
                            break;
                        }
                    }
                }
            }
        }
    }

    private /* synthetic */ void avL() {
        if (isAdded()) {
            RecyclerView recyclerView;
            if (isPortrait()) {
                recyclerView = avH().cQi;
            } else {
                recyclerView = avJ().cQi;
            }
            if (recyclerView.getScrollState() == 0) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                    if (findContainingViewHolder instanceof com.iqoption.feed.feedlist.b) {
                        Integer avW = ((com.iqoption.feed.feedlist.b) findContainingViewHolder).avW();
                        float aj = com.iqoption.core.ext.a.aj(childAt);
                        if (avW != null && aj >= 0.5f) {
                            this.cPf.fL(avW.intValue());
                        }
                    }
                }
            }
        }
    }

    private void avx() {
        com.iqoption.core.c.a.biN.removeCallbacks(this.cPo);
        if (this.cPb != 1) {
            com.iqoption.core.c.a.biN.removeCallbacks(this.cPn);
        }
    }

    private void avy() {
        com.iqoption.core.c.a.biN.removeCallbacks(this.cPo);
        com.iqoption.core.c.a.biN.postDelayed(this.cPo, 500);
        if (this.cPb != 1) {
            com.iqoption.core.c.a.biN.removeCallbacks(this.cPn);
            com.iqoption.core.c.a.biN.postDelayed(this.cPn, ToastEntity.ERROR_TOAST_DURATION);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.cPf = f.cOG.X(this);
        this.cPg = (AudioManager) requireContext().getSystemService("audio");
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cPc = (ae) DataBindingUtil.inflate(layoutInflater, f.smart_feed_fragment, viewGroup, false);
        this.cPb = -1;
        avA();
        a(this.cPj);
        b(getResources().getConfiguration());
        e.cOv.avk().observe(this, new -$$Lambda$j$1H86Tdhhh11SvhU_qrw7gHM9JZ0(this));
        if (this.cPb == 2) {
            e.cOv.avh().observe(this, new -$$Lambda$j$mz5Re-w3LalukyhisFgQpOg_FxQ(this));
        }
        avG();
        Fragment findFragmentByTag = avB().findFragmentByTag(c.TAG);
        if (findFragmentByTag != null) {
            ((c) findFragmentByTag).a((d) this);
        }
        return this.cPc.getRoot();
    }

    private /* synthetic */ void D(Map map) {
        if (map != null && !map.isEmpty()) {
            this.cPa.E(map);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        b bVar = this.cPj;
        return (bVar != null && bVar.onBackPressed()) || avz();
    }

    private boolean avz() {
        View findViewWithTag = this.cPc.cQC.findViewWithTag("OPTIONS_VIEW");
        if (findViewWithTag == null) {
            return false;
        }
        this.cPc.cQC.removeView(findViewWithTag);
        return true;
    }

    public void onStart() {
        super.onStart();
        avD();
    }

    public void onStop() {
        avE();
        super.onStop();
    }

    public void onDestroyView() {
        avx();
        this.cPe = null;
        this.cPd = null;
        super.onDestroyView();
    }

    private boolean isPortrait() {
        return this.cPb == 1;
    }

    private void h(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getId() == e.video_feed) {
                ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                if ((findContainingViewHolder instanceof com.iqoption.feed.feedlist.j) && com.iqoption.core.ext.a.aj(childAt) >= 0.75f) {
                    ((com.iqoption.feed.feedlist.j) findContainingViewHolder).awf();
                    return;
                }
            }
        }
    }

    private void avA() {
        Fragment bVar = new com.google.android.youtube.player.b();
        getChildFragmentManager().executePendingTransactions();
        getChildFragmentManager().beginTransaction().add(bVar, "YOU_TUBE").commitNow();
        this.cPj = new b(bVar);
    }

    private void a(com.iqoption.core.analytics.b bVar, com.iqoption.core.microservices.feed.response.a aVar) {
        FeedPriority adL = aVar.adL();
        bVar.a(u.anp().o("news_id", Integer.valueOf(aVar.getId())).o("news_topic", "smart-feed").o("news_likes", Integer.valueOf(aVar.getRating())).o("news_views", Integer.valueOf(aVar.adO())).o("ordering_priority", adL != null ? Integer.valueOf(adL.getServerValue()) : null).anr());
        bVar.Cc();
    }

    private void a(b bVar) {
        this.cPa = new c(bVar, new com.iqoption.feed.feedlist.c.a() {
            public void hV(String str) {
                j.this.hU(str);
            }

            public void e(com.iqoption.core.microservices.feed.response.a aVar) {
                j.this.cPf.fK(aVar.getId());
                if ("YouTube".equals(aVar.getSource())) {
                    j.this.d(aVar);
                } else {
                    j.this.c(aVar.adH(), aVar);
                }
                j.this.a(com.iqoption.core.d.Um().EC().dj("smart-feed_open-news"), aVar);
            }

            public boolean l(com.iqoption.feed.feedlist.d dVar) {
                com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
                j.this.a(com.iqoption.core.d.Um().EC().d("smart-feed_news-like", YQ.adM() ? 0.0d : 1.0d), YQ);
                j.this.cPf.a(YQ).observe(j.this, new -$$Lambda$j$3$wTlJRm6BC5Zm6HOHEHXv1YI5FGY(this, dVar));
                return true;
            }

            public void a(View view, com.iqoption.feed.feedlist.d dVar) {
                if (j.this.cPb == 2) {
                    j.this.a(dVar, view);
                } else {
                    j.this.g(dVar);
                }
                j.this.a(com.iqoption.core.d.Um().EC().dj("smart-feed_news-settings"), dVar.YQ());
            }

            public void f(@NonNull com.iqoption.core.microservices.feed.response.a aVar) {
                j.this.b(aVar, true, true);
            }

            public void fP(int i) {
                j.this.cPl.add(Integer.valueOf(i));
            }
        });
        avy();
    }

    private void b(@NonNull com.iqoption.core.microservices.feed.response.a aVar, boolean z, boolean z2) {
        if (!isPortrait()) {
            aly();
        }
        this.cPf.a(aVar, z, z2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void g(com.iqoption.feed.feedlist.d dVar) {
        com.iqoption.core.ui.d.c a = c.a(dVar);
        c cVar = (c) a.bh(getContext());
        cVar.a((d) this);
        avB().beginTransaction().add(avC(), cVar, a.getName()).addToBackStack(a.getName()).commitAllowingStateLoss();
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public FragmentManager avB() {
        return getChildFragmentManager();
    }

    /* Access modifiers changed, original: protected */
    @IdRes
    public int avC() {
        return e.feedOther;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void a(com.iqoption.feed.feedlist.d dVar, View view) {
        com.iqoption.feed.a.c cVar = (com.iqoption.feed.a.c) DataBindingUtil.inflate(LayoutInflater.from(getContext()), f.feed_options, null, false);
        View root = cVar.getRoot();
        com.iqoption.core.ext.a.an(root);
        com.iqoption.core.ui.widget.i.a aVar = new com.iqoption.core.ui.widget.i.a();
        aVar.e(root, root.getMeasuredWidth(), root.getMeasuredHeight());
        cVar.cPQ.setOnClickListener(new -$$Lambda$j$5SEUJ7EnIOY8gEj1W_-Hhcuprdw(this, dVar, aVar));
        cVar.cPN.setOnClickListener(new -$$Lambda$j$n_GtbD15JiX3LNObJxdX14A7UQ0(this, dVar, aVar));
        cVar.cPO.setOnClickListener(new -$$Lambda$j$_2GoAZFMF4g0zf4XrIJcyTtmdfQ(this, dVar, aVar));
        aVar.ak(view);
    }

    private /* synthetic */ void c(com.iqoption.feed.feedlist.d dVar, com.iqoption.core.ui.widget.i.a aVar, View view) {
        j(dVar);
        aVar.dismiss();
    }

    private void h(final com.iqoption.feed.feedlist.d dVar) {
        int n = this.cPa.n(dVar);
        if (n != -1) {
            com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
            a(com.iqoption.core.d.Um().EC().dj("smart-feed_news-settings-remove"), YQ);
            ((Snackbar) Snackbar.a(this.cPc.getRoot(), g.you_wont_see_this_post, 0).a(g.undo, new -$$Lambda$j$a-1hTqY766NzYWbkudhlm8eOJzE(this, YQ, dVar, n)).aW(com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.feed.i.b.green)).a((com.google.android.material.snackbar.BaseTransientBottomBar.a) new com.google.android.material.snackbar.BaseTransientBottomBar.a<Snackbar>() {
                public void a(Snackbar snackbar, int i) {
                    if (i != 1) {
                        j.this.cPf.f(dVar);
                    }
                }
            })).show();
        }
    }

    private void i(com.iqoption.feed.feedlist.d dVar) {
        a(com.iqoption.core.d.Um().EC().dj("smart-feed_news-settings-copy"), dVar.YQ());
        String adG = dVar.YQ().adG();
        if (!TextUtils.isEmpty(adG) && ag.au("FEED", adG)) {
            com.iqoption.core.d.eF(g.link_copied);
        }
    }

    private void j(com.iqoption.feed.feedlist.d dVar) {
        a(com.iqoption.core.d.Um().EC().dj("smart-feed_news-settings-share"), dVar.YQ());
        String adG = dVar.YQ().adG();
        if (!TextUtils.isEmpty(adG)) {
            IntentBuilder.from(requireActivity()).setType("text/plain").setText(adG).setChooserTitle(g.share).startChooser();
        }
    }

    private void hU(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) this.cPm.get(str);
            if (aVar != null) {
                this.cPf.b(aVar.instrumentType, aVar.getActiveId());
                if (!isPortrait()) {
                    aly();
                }
            }
        }
    }

    private void d(com.iqoption.core.microservices.feed.response.a aVar) {
        c(aVar.adH(), aVar);
    }

    private void avD() {
        if (VERSION.SDK_INT < 23 || this.cPg.isStreamMute(3)) {
            this.cPg.setStreamMute(3, true);
            return;
        }
        try {
            this.cPg.adjustStreamVolume(3, -100, 0);
        } catch (SecurityException unused) {
        }
    }

    private void avE() {
        if (VERSION.SDK_INT >= 23) {
            try {
                this.cPg.adjustStreamVolume(3, 100, 0);
                return;
            } catch (SecurityException unused) {
                return;
            }
        }
        this.cPg.setStreamMute(3, false);
    }

    private void c(String str, @NonNull com.iqoption.core.microservices.feed.response.a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.cPf.a(str, aVar);
        }
    }

    private void b(Configuration configuration) {
        int i = configuration.orientation;
        if (this.cPb != i) {
            this.cPb = i;
            if (i == 1) {
                this.cPa.di(true);
                this.cPc.cQC.addView(avH().getRoot());
                i(avH().cQi);
            } else if (i == 2) {
                this.cPa.di(false);
                this.cPc.cQC.addView(avJ().getRoot());
                i(avJ().cQi);
            }
        }
    }

    private RecyclerView avF() {
        if (this.cPb == 2) {
            return avJ().cQi;
        }
        return avH().cQi;
    }

    private void i(@NonNull RecyclerView recyclerView) {
        int i = this.cPk;
        recyclerView.setAdapter(this.cPa);
        recyclerView.addOnScrollListener(this.cPq);
        recyclerView.setHasFixedSize(true);
        recyclerView.removeOnChildAttachStateChangeListener(this.cPp);
        recyclerView.addOnChildAttachStateChangeListener(this.cPp);
        if (i != -1) {
            recyclerView.post(new -$$Lambda$j$pHiyInpRQEdEdHjIuzi1i0B4_ks(recyclerView, fM(i)));
        }
        recyclerView.setRecyclerListener(-$$Lambda$j$9GsOiK-gmVV75WWd4864EH7nZro.INSTANCE);
        i = this.cPb;
        if (i != 1) {
            if (i == 2 && recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.iqoption.feed.feedlist.b.d(com.iqoption.core.ext.a.e((Fragment) this, i.d.feed_item_separator), getResources().getDimensionPixelOffset(i.c.dp12)));
            }
        } else if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.iqoption.core.ui.widget.e(getResources().getDimensionPixelOffset(i.c.dp12)));
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(0);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        h(recyclerView);
    }

    private int fM(int i) {
        if (isPortrait()) {
            return Math.max(0, i - 1);
        }
        return Math.max(0, i + 1);
    }

    private void avG() {
        this.cPh = 0;
        this.cPi = true;
        this.cPf.dg(false).observe(this, new -$$Lambda$j$-XVZFdTK3FjVbPOyL73Kbv3N8Wg(this));
    }

    private void fN(int i) {
        this.cPi = true;
        this.cPf.fJ(i).observe(this, new -$$Lambda$j$Cvu1rEec9OmanF7jZ003Y6lGFtM(this));
    }

    private m avH() {
        if (this.cPd == null) {
            avI();
        }
        return this.cPd;
    }

    private void avI() {
        this.cPd = (m) DataBindingUtil.inflate(LayoutInflater.from(getContext()), f.macro_smart_feed, this.cPc.cQC, false);
    }

    private aa avJ() {
        if (this.cPe == null) {
            avK();
        }
        return this.cPe;
    }

    private void avK() {
        this.cPe = (aa) DataBindingUtil.inflate(LayoutInflater.from(getContext()), f.micro_smart_feed, this.cPc.cQC, false);
    }

    public void b(com.iqoption.feed.feedlist.d dVar) {
        j(dVar);
    }

    public void c(com.iqoption.feed.feedlist.d dVar) {
        i(dVar);
    }

    public void d(com.iqoption.feed.feedlist.d dVar) {
        h(dVar);
    }

    public void onClose() {
        avB().popBackStack();
    }
}
