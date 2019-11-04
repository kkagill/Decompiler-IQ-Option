package com.iqoption.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.iqoption.a.h;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.k;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.app.managers.tab.TabHelper.j;
import com.iqoption.core.ext.a;
import com.iqoption.core.util.u;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.dto.Event;
import com.iqoption.fragment.b.b;
import com.iqoption.util.ak;
import com.iqoption.view.ClippedInMiddleRecyclerViewPager;
import com.iqoption.view.d.d;
import com.iqoption.view.drumview.recyclerviewpager.ScrolledToPositionInZoneLinearLayoutManager;
import com.iqoption.widget.c;
import com.iqoption.x.R;
import java.util.List;

/* compiled from: ChartTypeToolsFragment */
public class e extends b {
    public static final String TAG = "com.iqoption.fragment.e";
    private SwitchCompat aIj;
    private LinearLayout bgn;
    private ClippedInMiddleRecyclerViewPager cUA;
    private h cUB;
    private ClippedInMiddleRecyclerViewPager cUC;
    private h cUD;
    private OnCheckedChangeListener cUE;
    private View cUp;
    private View cUq;
    private View cUr;
    private View cUs;
    private View cUt;
    private View cUu;
    private View cUv;
    private View cUw;
    private SwitchCompat cUx;
    private View cUy;
    private View cUz;

    private boolean fU(int i) {
        return i == 1 || i == 3;
    }

    public static e axv() {
        return new e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.chart_type_tools_fragment, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        i Jh = TabHelper.IM().Jh();
        if (Jh == null) {
            onClose();
            return;
        }
        final j JF = Jh.JF();
        view.findViewById(R.id.everything).setOnClickListener(new -$$Lambda$e$XV-GBc7gdeyR_VWsnWUe6Bsi77A(this));
        this.bgn = (LinearLayout) view.findViewById(R.id.mainContent);
        this.cUt = view.findViewById(R.id.contentLayout);
        this.bgn.setLayoutTransition(ak.anP());
        this.cUx = (SwitchCompat) view.findViewById(R.id.switchAutoScalling);
        this.cUx.setTypeface(a.d((Fragment) this, (int) R.font.medium));
        this.cUp = view.findViewById(R.id.zoneChart);
        this.cUq = view.findViewById(R.id.linerChart);
        this.cUr = view.findViewById(R.id.candleChart);
        this.cUs = view.findViewById(R.id.barChart);
        this.cUp.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.setChartType(0);
                    e.this.fT(0);
                    e.this.i(false, JF.awJ);
                    e.this.axy();
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "chart_chart-type-changed").setValue(Double.valueOf(0.0d)).build());
                }
            }
        });
        this.cUq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.setChartType(2);
                    e.this.fT(2);
                    e.this.i(false, JF.awJ);
                    e.this.axy();
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "chart_chart-type-changed").setValue(Double.valueOf(1.0d)).build());
                    k.j(e.this.getContext(), 32);
                }
            }
        });
        this.cUr.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.setChartType(1);
                    e.this.fT(1);
                    e.this.i(true, JF.awJ);
                    e.this.axy();
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "chart_chart-type-changed").setValue(Double.valueOf(2.0d)).build());
                    k.j(e.this.getContext(), 32);
                }
            }
        });
        this.cUs.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.setChartType(3);
                    e.this.fT(3);
                    e.this.i(true, JF.awJ);
                    e.this.axy();
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "chart_chart-type-changed").setValue(Double.valueOf(3.0d)).build());
                    k.j(e.this.getContext(), 32);
                }
            }
        });
        this.cUu = view.findViewById(R.id.colorCandleContainer);
        this.cUv = this.cUu.findViewById(R.id.grayCandle);
        this.cUw = this.cUu.findViewById(R.id.colorCandle);
        this.cUv.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                e.this.h(true, false);
            }
        });
        this.cUw.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                e.this.h(false, false);
            }
        });
        int fA = fA(R.dimen.dp43);
        this.cUA = (ClippedInMiddleRecyclerViewPager) view.findViewById(R.id.timerIntervalList);
        boolean z = false;
        this.cUA.u(fA, false);
        this.cUC = (ClippedInMiddleRecyclerViewPager) view.findViewById(R.id.timerIntervalListWhite);
        this.cUC.u(fA, true);
        ScrolledToPositionInZoneLinearLayoutManager scrolledToPositionInZoneLinearLayoutManager = new ScrolledToPositionInZoneLinearLayoutManager(getContext(), 0);
        ScrolledToPositionInZoneLinearLayoutManager scrolledToPositionInZoneLinearLayoutManager2 = new ScrolledToPositionInZoneLinearLayoutManager(getContext(), 0);
        this.cUA.setLayoutManager(scrolledToPositionInZoneLinearLayoutManager);
        this.cUC.setLayoutManager(scrolledToPositionInZoneLinearLayoutManager2);
        fA *= 2;
        this.cUA.addItemDecoration(new c(fA, true, true));
        this.cUC.addItemDecoration(new c(fA, true, true));
        this.cUB = new h(getContext(), ContextCompat.getColor(getContext(), R.color.white), true, new com.iqoption.a.b.a() {
            public void onItemClick(View view, int i) {
                e.this.cUA.smoothScrollToPosition(e.this.cUA.as(i, e.this.cUB.getItemCount()));
            }
        });
        this.cUB.setHasStableIds(true);
        this.cUD = new h(getContext(), ContextCompat.getColor(getContext(), R.color.grey_blue_50), false, null);
        this.cUD.setHasStableIds(true);
        this.cUA.setAdapter(this.cUB);
        this.cUC.setAdapter(this.cUD);
        this.cUA.a(new -$$Lambda$e$iBgKaZWannTfblUil4AcW1B4yfE(this));
        this.cUA.addOnScrollListener(new OnScrollListener() {
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                e.this.cUC.scrollBy(i, i2);
            }
        });
        this.aIj = (SwitchCompat) view.findViewById(R.id.switchHeikenAshi);
        this.aIj.setChecked(JF.awI);
        ((LinearLayout) view.findViewById(R.id.heikenAshiContainer)).setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                int isChecked = e.this.aIj.isChecked() ^ 1;
                i Jh = TabHelper.IM().Jh();
                if (Jh != null) {
                    Jh.bH(isChecked);
                    e.this.aIj.setChecked(isChecked);
                    e.this.axy();
                }
            }
        });
        this.cUz = view.findViewById(R.id.infoTextHeikenAshi);
        this.cUy = view.findViewById(R.id.infoIconHeikenAshi);
        this.cUy.setOnTouchListener(new d());
        this.cUy.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                int isSelected = e.this.cUy.isSelected() ^ 1;
                e.this.cUy.setSelected(isSelected);
                e.this.cUz.setVisibility(isSelected != 0 ? 0 : 8);
            }
        });
        if (!(JF.chartType == 0 || JF.chartType == 2)) {
            z = true;
        }
        this.cUE = -$$Lambda$e$xxE8VSc5g-jjhOm37Gyc0EqyjNU.INSTANCE;
        this.cUx.setOnCheckedChangeListener(this.cUE);
        i(z, JF.awJ);
        fT(JF.chartType);
        h(JF.awH, true);
        fV(JF.candleSize);
    }

    private /* synthetic */ void aS(View view) {
        onClose();
    }

    private /* synthetic */ void au(int i, int i2) {
        if (isAdded() && i != i2) {
            ChartTimeInterval chartTimeInterval = (ChartTimeInterval) this.cUB.getItems().get(i2);
            i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                Jh.eh(chartTimeInterval.value);
                axy();
                EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "chart_chart-scale-changed").setParameters(u.anp().o("instrument_type", Jh.getInstrumentType()).anr()).setValue(Double.valueOf((double) chartTimeInterval.value)).build());
            }
        }
    }

    private static /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            Jh.bI(z);
        }
    }

    private void h(boolean z, boolean z2) {
        i Jh = TabHelper.IM().Jh();
        if (!(Jh == null || z2)) {
            Jh.bG(z);
        }
        if (z) {
            this.cUv.setSelected(true);
            this.cUw.setSelected(false);
            return;
        }
        this.cUv.setSelected(false);
        this.cUw.setSelected(true);
    }

    private void fT(int i) {
        this.cUp.setSelected(false);
        this.cUq.setSelected(false);
        this.cUr.setSelected(false);
        this.cUs.setSelected(false);
        this.cUu.setVisibility(8);
        int dn = dn(fU(i));
        int axx = axx();
        if (i == 0) {
            this.cUp.setSelected(true);
        } else if (i == 1) {
            this.cUr.setSelected(true);
            this.cUu.setVisibility(0);
        } else if (i == 2) {
            this.cUq.setSelected(true);
        } else if (i == 3) {
            this.cUs.setSelected(true);
        }
        this.cUB.du(dn);
        this.cUD.du(dn);
        this.cUA.setMinPosition(dn);
        this.cUB.dv(axx);
        this.cUD.dv(axx);
        this.cUA.setMaxPosition(axx);
        this.cUB.notifyDataSetChanged();
        this.cUD.notifyDataSetChanged();
    }

    private int dn(boolean z) {
        int axw = axw();
        return (axw == 0 && z) ? axw + 1 : axw;
    }

    private int axw() {
        int IX = TabHelper.IM().IX();
        int i = 0;
        for (ChartTimeInterval chartTimeInterval : this.cUD.getItems()) {
            if (com.iqoption.app.managers.a.GM().a(Integer.valueOf(IX), chartTimeInterval.value)) {
                break;
            }
            i++;
        }
        return i;
    }

    private int axx() {
        int itemCount = this.cUD.getItemCount() - 1;
        int IX = TabHelper.IM().IX();
        int i = itemCount;
        while (itemCount >= 0 && !com.iqoption.app.managers.a.GM().a(Integer.valueOf(IX), ((ChartTimeInterval) this.cUD.getItems().get(itemCount)).value)) {
            i--;
            itemCount--;
        }
        return i;
    }

    public void axy() {
        ah PM = PM();
        if (PM != null) {
            PM.ayv();
        }
    }

    private void fV(int i) {
        if (this.cUA != null) {
            h hVar = this.cUB;
            if (hVar != null) {
                List items = hVar.getItems();
                for (int i2 = 0; i2 < items.size(); i2++) {
                    if (((ChartTimeInterval) items.get(i2)).value == i) {
                        this.cUA.postDelayed(new -$$Lambda$e$mXKZMnvBkxSgauV2ZfLmZmajoSQ(this, i2), 50);
                        return;
                    }
                }
            }
        }
    }

    private /* synthetic */ void fW(int i) {
        ClippedInMiddleRecyclerViewPager clippedInMiddleRecyclerViewPager = this.cUA;
        clippedInMiddleRecyclerViewPager.smoothScrollToPosition(clippedInMiddleRecyclerViewPager.as(i, this.cUB.getItemCount()));
    }

    public boolean onClose() {
        TabHelper.IM().IS();
        ah PM = PM();
        if (!(PM == null || PM.cXR == null)) {
            PM.cXR.setSelected(false);
        }
        getFragmentManager().popBackStack();
        return true;
    }

    private void i(boolean z, boolean z2) {
        this.cUx.setClickable(z);
        if (z) {
            this.cUx.animate().alpha(1.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
            this.cUx.setChecked(z2);
            m8do(z2);
            return;
        }
        this.cUx.setChecked(true);
        this.cUx.animate().alpha(0.5f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        m8do(true);
    }

    /* renamed from: do */
    private void m8do(boolean z) {
        i Jh = TabHelper.IM().Jh();
        if (Jh == null) {
            onClose();
        } else {
            Jh.bI(z);
        }
    }

    public void att() {
        this.cUt.setAlpha(0.0f);
        this.bgn.setAlpha(0.0f);
        this.cUt.setAlpha(1.0f);
        int fA = fA(R.dimen.dp12);
        float f = (float) (-fA);
        this.bgn.setTranslationX(f);
        float f2 = (float) fA;
        this.bgn.setTranslationY(f2);
        this.cUt.setTranslationX(f);
        this.cUt.setTranslationY(f2);
        this.cUt.setPivotX(1.0f);
        View view = this.cUt;
        view.setPivotY((float) view.getHeight());
        this.cUt.setScaleX(0.3f);
        this.cUt.setScaleY(0.3f);
        this.bgn.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250).setStartDelay(100).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        this.cUt.animate().scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        View view = this.cUt;
        if (view != null) {
            view.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(250).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        }
    }
}
