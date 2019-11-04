package com.iqoption.charttools.tools;

import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.charttools.model.indicator.v;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.tools.data.SettingType;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import com.iqoption.x.R;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 a2\u00020\u0001:\u0003abcB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020=J0\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050B2\u0006\u0010C\u001a\u00020\u00132\u0012\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0EH\u0002J\"\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020'0\u0005H\u0002J\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004J\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004J\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u00042\u0006\u0010C\u001a\u00020\u0013J\u0006\u0010K\u001a\u00020=J\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\b\u0010M\u001a\u00020=H\u0014J\u0006\u0010N\u001a\u00020=J\u000e\u0010O\u001a\u00020=2\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u000e\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u000200J\u000e\u0010U\u001a\u00020\f2\u0006\u0010P\u001a\u00020QJ\u0006\u0010V\u001a\u00020=J\u0006\u0010W\u001a\u00020=J\u0016\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020\u00132\u0006\u0010C\u001a\u00020ZJ\u000e\u0010[\u001a\u00020=2\u0006\u0010C\u001a\u00020ZJ\u0010\u0010\\\u001a\u00020=2\b\u0010]\u001a\u0004\u0018\u00010,J\u000e\u0010^\u001a\u00020=2\u0006\u0010_\u001a\u000203J\u000e\u0010`\u001a\u00020=2\u0006\u0010P\u001a\u00020QR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0 X\u0004¢\u0006\u0002\n\u0000R&\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#0\"X\u0004¢\u0006\u0002\n\u0000R&\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\n0\"X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\bR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u000100000#X\u0004¢\u0006\u0002\n\u0000R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\nX\u0004¢\u0006\u0002\n\u0000¨\u0006d"}, bng = {"Lcom/iqoption/charttools/tools/ToolsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "activeIndicators", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/charttools/tools/data/ActiveIndicatorItem;", "getActiveIndicators", "()Landroidx/lifecycle/LiveData;", "activeIndicatorsData", "Landroidx/lifecycle/MutableLiveData;", "activeToolsClearAllMode", "", "getActiveToolsClearAllMode", "activeToolsClearAllModeData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "calculateTemplatesProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "categoryItems", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "getCategoryItems", "categoryItemsData", "countActiveIndicators", "", "countAppliedTemplates", "currentActiveId", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "events", "Lcom/iqoption/charttools/tools/Event;", "getEvents", "eventsData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "expandedProcessors", "", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/charttools/tools/ToolsViewModel$ExpandedMeta;", "indicatorsDataMap", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "isDisabledActiveIndicators", "isSearchEnabled", "isSearchEnabledData", "screen", "Lcom/iqoption/charttools/tools/ToolsScreen;", "getScreen", "screenData", "searchConstraintProcessor", "", "kotlin.jvm.PlatformType", "settingItems", "Lcom/iqoption/charttools/tools/data/SettingItem;", "getSettingItems", "settingItemsData", "tabId", "", "templateItems", "Lcom/iqoption/charttools/tools/data/TemplateAdapterItem;", "getTemplateItems", "templateItemsData", "applyTemplate", "", "templateItem", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "cancelSearch", "createIndicatorsStream", "Lio/reactivex/Flowable;", "item", "processor", "Lio/reactivex/processors/FlowableProcessor;", "createSearchStream", "indicators", "getCountActiveIndicatorsLiveData", "getCountAppliedTemplates", "getIndicators", "hideActiveToolsClearAllMode", "isDisabledActiveIndicatorsLiveData", "onCleared", "removeAllInstruments", "removeInstrument", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "removeTemplate", "searchIndicators", "constraint", "selectIndicator", "showActiveToolsClearAllMode", "startSearch", "toggleExpanded", "categoryAdapterItem", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "toggleFavorites", "toggleScreen", "toolsScreen", "toggleSetting", "settingItem", "updateIndicatorVisibility", "Companion", "ExpandedMeta", "OnTemplateApplied", "app_optionXRelease"})
/* compiled from: ToolsViewModel.kt */
public final class h extends ViewModel {
    private static final String TAG = h.class.getSimpleName();
    private static final io.reactivex.b.f<Throwable> aMn = d.aMy;
    private static final io.reactivex.b.f<Object> aMo = c.aMx;
    private static final io.reactivex.b.a aMp = b.aMw;
    private static final int aMq = com.iqoption.core.d.getColor(R.color.grey_blue_70);
    private static final List<com.iqoption.charttools.tools.data.e> aMr = l.listOf(com.iqoption.charttools.tools.data.e.aMW);
    public static final a aMs = new a();
    private String aEK;
    private final com.iqoption.core.data.b.c<Integer> aLP;
    private final com.iqoption.core.data.b.c<Integer> aLQ;
    private final com.iqoption.core.data.b.c<Boolean> aLR;
    private final MutableLiveData<ToolsScreen> aLS = new MutableLiveData();
    private final LiveData<ToolsScreen> aLT = this.aLS;
    private final MutableLiveData<List<com.iqoption.charttools.tools.data.c>> aLU = new MutableLiveData();
    private final LiveData<List<com.iqoption.charttools.tools.data.c>> aLV = this.aLU;
    private final com.iqoption.core.data.b.c<Boolean> aLW;
    private final LiveData<Boolean> aLX;
    private final BehaviorProcessor<CharSequence> aLY;
    private final Map<com.iqoption.charttools.tools.data.c, BehaviorProcessor<Optional<e>>> aLZ;
    private final Map<com.iqoption.charttools.tools.data.c, MutableLiveData<List<com.iqoption.charttools.tools.data.h>>> aMa;
    private final MutableLiveData<List<com.iqoption.charttools.tools.data.a>> aMb;
    private final LiveData<List<com.iqoption.charttools.tools.data.a>> aMc;
    private final com.iqoption.core.data.b.c<Boolean> aMd;
    private final LiveData<Boolean> aMe;
    private final MutableLiveData<List<com.iqoption.charttools.tools.data.l>> aMf;
    private final LiveData<List<com.iqoption.charttools.tools.data.l>> aMg;
    private int aMh;
    private final com.iqoption.core.data.b.c<List<com.iqoption.charttools.tools.data.k>> aMi;
    private final LiveData<List<com.iqoption.charttools.tools.data.k>> aMj;
    private final com.iqoption.core.data.b.b<b> aMk;
    private final LiveData<b> aMl;
    private final com.iqoption.core.rx.d<Boolean> aMm;
    private final io.reactivex.disposables.a aqB;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002JD\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0%H\u0002JL\u0010&\u001a\u00020'*\u00020 2\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0%2\u0006\u0010(\u001a\u00020)H\u0002J\f\u0010*\u001a\u00020+*\u00020,H\u0002J2\u0010-\u001a\u00020,*\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\f\u00101\u001a\b\u0012\u0004\u0012\u00020.0\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0002JF\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\b*\b\u0012\u0004\u0012\u00020.042\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u0002062\f\u00101\u001a\b\u0012\u0004\u0012\u00020.0\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0002J4\u00107\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r08H\u0002J\u0014\u00109\u001a\u00020\u001f*\u00020:2\u0006\u0010;\u001a\u00020\u001fH\u0002J(\u0010<\u001a\u00020\u001f*\u00020\u00182\u0006\u0010=\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0>H\u0002J4\u0010?\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0>H\u0002J\u0014\u0010A\u001a\u00020\u001f*\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, bng = {"Lcom/iqoption/charttools/tools/ToolsViewModel$Companion;", "", "()V", "EMPTY_ACTION", "Lio/reactivex/functions/Action;", "EMPTY_CONSUMER", "Lio/reactivex/functions/Consumer;", "EMPTY_INDICATORS", "", "Lcom/iqoption/charttools/tools/data/EmptyIndicatorItem;", "LOGGING_CONSUMER", "", "PARAMS_COLOR", "", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "f", "Landroidx/fragment/app/Fragment;", "mapActive", "Lcom/iqoption/charttools/tools/data/ActiveIndicatorItem;", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "search", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "indicators", "constraint", "", "isApplied", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "isVolumeEnabled", "currentIndicators", "currentFigures", "mapping", "Landroidx/collection/ArrayMap;", "map", "Lcom/iqoption/charttools/tools/data/TemplateItem;", "appliedCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "mapInfo", "Lcom/iqoption/charttools/tools/data/InfoIndicatorItem;", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "mapTitle", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "expanded", "Lcom/iqoption/charttools/tools/ToolsViewModel$ExpandedMeta;", "favorites", "active", "mapToSortedList", "Lkotlin/sequences/Sequence;", "item", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "matchIndicators", "", "matches", "Lcom/iqoption/charttools/model/chart/ChartConfig;", "isVolumeIndicatorEnabled", "matchesFigure", "figure", "", "matchesFigures", "lines", "matchesIndicator", "app_optionXRelease"})
    /* compiled from: ToolsViewModel.kt */
    public static final class a {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return b.c(((com.iqoption.charttools.tools.data.n) t).getTitle(), ((com.iqoption.charttools.tools.data.n) t2).getTitle());
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final boolean a(com.iqoption.charttools.model.a.a aVar, boolean z) {
            TabHelper IM = TabHelper.IM();
            kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
            com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
            if (Jh == null) {
                return false;
            }
            int ordinal;
            boolean booleanValue;
            boolean booleanValue2;
            com.iqoption.l.b aTS;
            ChartType NT = aVar.NT();
            String str = "tab";
            if (NT != null) {
                ordinal = NT.ordinal();
                kotlin.jvm.internal.i.e(Jh, str);
                if (ordinal != Jh.JF().chartType) {
                    return false;
                }
            }
            ChartColor NU = aVar.NU();
            if (NU != null) {
                ordinal = NU.ordinal();
                kotlin.jvm.internal.i.e(Jh, str);
                if (ordinal != (Jh.JF().awH ^ 1)) {
                    return false;
                }
            }
            Integer NV = aVar.NV();
            if (NV != null) {
                ordinal = NV.intValue();
                kotlin.jvm.internal.i.e(Jh, str);
                if (ordinal != Jh.JF().candleSize) {
                    return false;
                }
            }
            Boolean NW = aVar.NW();
            if (NW != null) {
                booleanValue = NW.booleanValue();
                kotlin.jvm.internal.i.e(Jh, str);
                if (booleanValue != Jh.JF().awJ) {
                    return false;
                }
            }
            NW = aVar.NX();
            if (NW != null) {
                booleanValue = NW.booleanValue();
                kotlin.jvm.internal.i.e(Jh, str);
                if (booleanValue != Jh.JF().awI) {
                    return false;
                }
            }
            Boolean NY = aVar.NY();
            String str2 = "SettingsManager.instance()";
            if (NY != null) {
                booleanValue2 = NY.booleanValue();
                aTS = com.iqoption.l.b.aTS();
                kotlin.jvm.internal.i.e(aTS, str2);
                if (booleanValue2 != aTS.Pk()) {
                    return false;
                }
            }
            NY = aVar.NZ();
            if (NY != null) {
                booleanValue2 = NY.booleanValue();
                aTS = com.iqoption.l.b.aTS();
                kotlin.jvm.internal.i.e(aTS, str2);
                if (booleanValue2 != aTS.Pl()) {
                    return false;
                }
            }
            Boolean Oa = aVar.Oa();
            if (Oa == null || Oa.booleanValue() == z) {
                return true;
            }
            return false;
        }

        private final boolean a(com.iqoption.charttools.model.indicator.h hVar, com.iqoption.charttools.model.indicator.h hVar2) {
            return (kotlin.jvm.internal.i.y(hVar.MH(), hVar2.MH()) ^ 1) == 0 && hVar.isHidden() == hVar2.isHidden() && (kotlin.jvm.internal.i.y(hVar.Oh(), hVar2.Oh()) ^ 1) == 0;
        }

        private final boolean a(List<com.iqoption.charttools.model.indicator.h> list, List<com.iqoption.charttools.model.indicator.h> list2, Map<Integer, Integer> map) {
            if (list.size() != list2.size()) {
                return false;
            }
            for (com.iqoption.charttools.model.indicator.h hVar : list) {
                for (Object next : list2) {
                    if (h.aMs.a(hVar, (com.iqoption.charttools.model.indicator.h) next)) {
                        break;
                    }
                }
                Object next2 = null;
                com.iqoption.charttools.model.indicator.h hVar2 = (com.iqoption.charttools.model.indicator.h) next2;
                if (hVar2 == null) {
                    return false;
                }
                map.put(Integer.valueOf(hVar.getIndex()), Integer.valueOf(hVar2.getIndex()));
            }
            return true;
        }

        private final boolean a(com.iqoption.charttools.model.indicator.h hVar, com.iqoption.charttools.model.indicator.h hVar2, Map<Integer, Integer> map) {
            x MH = hVar.MH();
            if (MH != null) {
                com.iqoption.charttools.model.indicator.k kVar = (com.iqoption.charttools.model.indicator.k) MH;
                if ((kotlin.jvm.internal.i.y(kVar, hVar2.MH()) ^ 1) != 0) {
                    return false;
                }
                int a = kVar.a(hVar.Oh());
                Integer num = (Integer) map.get(Integer.valueOf(a));
                kVar.a(num != null ? num.intValue() : -1, hVar.Oh());
                boolean a2 = a(hVar, hVar2);
                kVar.a(a, hVar.Oh());
                return a2;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.model.indicator.Figure");
        }

        private final boolean b(List<com.iqoption.charttools.model.indicator.h> list, List<com.iqoption.charttools.model.indicator.h> list2, Map<Integer, Integer> map) {
            if (list.size() != list2.size()) {
                return false;
            }
            Iterator it = list.iterator();
            boolean z;
            do {
                z = true;
                if (!it.hasNext()) {
                    return true;
                }
                com.iqoption.charttools.model.indicator.h hVar = (com.iqoption.charttools.model.indicator.h) it.next();
                Iterable<com.iqoption.charttools.model.indicator.h> iterable = list2;
                if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                    for (com.iqoption.charttools.model.indicator.h a : iterable) {
                        if (h.aMs.a(hVar, a, (Map) map)) {
                            continue;
                            break;
                        }
                    }
                }
                z = false;
                continue;
            } while (z);
            return false;
        }

        private final boolean a(com.iqoption.charttools.model.b.a aVar, boolean z, List<com.iqoption.charttools.model.indicator.h> list, List<com.iqoption.charttools.model.indicator.h> list2, ArrayMap<Integer, Integer> arrayMap) {
            com.iqoption.charttools.model.a.a OW = aVar.OW();
            if (OW != null && !h.aMs.a(OW, z)) {
                return false;
            }
            arrayMap.clear();
            a aVar2 = this;
            Map map = arrayMap;
            if (aVar2.a(aVar.LV(), (List) list, map) && aVar2.b(aVar.Ms(), list2, map)) {
                return true;
            }
            return false;
        }

        private final com.iqoption.charttools.tools.data.m a(com.iqoption.charttools.model.b.a aVar, boolean z, List<com.iqoption.charttools.model.indicator.h> list, List<com.iqoption.charttools.model.indicator.h> list2, ArrayMap<Integer, Integer> arrayMap, AtomicInteger atomicInteger) {
            String a;
            if ((aVar.LV().isEmpty() ^ 1) != 0) {
                a = u.a(aVar.LV(), ", ", null, null, 0, null, ToolsViewModel$Companion$map$1.aMz, 30, null);
            } else {
                a = com.iqoption.core.d.getString(R.string.chart_settings_only);
            }
            boolean a2 = a(aVar, z, (List) list, (List) list2, (ArrayMap) arrayMap);
            if (a2) {
                atomicInteger.incrementAndGet();
            }
            com.iqoption.charttools.model.b.a aVar2 = aVar;
            return new com.iqoption.charttools.tools.data.m(aVar, a, a2);
        }

        private final List<com.iqoption.charttools.tools.data.h> a(kotlin.sequences.h<? extends x> hVar, e eVar, com.iqoption.charttools.tools.data.c cVar, List<? extends x> list, List<com.iqoption.charttools.model.indicator.h> list2) {
            List<com.iqoption.charttools.tools.data.h> g = n.g(n.a(n.f(hVar, new ToolsViewModel$Companion$mapToSortedList$1(eVar, list, list2)), (Comparator) new a()));
            if (eVar != null && kotlin.jvm.internal.i.y(eVar.Qv(), cVar)) {
                int i = 0;
                for (com.iqoption.charttools.tools.data.h id : g) {
                    if (kotlin.jvm.internal.i.y((String) id.getId(), eVar.Qw().getId())) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i != -1) {
                    g.add(i + 1, h.aMs.b(eVar.Qw()));
                }
            }
            return g;
        }

        private final List<com.iqoption.charttools.tools.data.h> a(List<? extends com.iqoption.charttools.tools.data.h> list, CharSequence charSequence) {
            if (((charSequence.length() > 0 ? 1 : null) != null ? charSequence : null) == null) {
                return list;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                com.iqoption.charttools.tools.data.h hVar = (com.iqoption.charttools.tools.data.h) next;
                boolean b = hVar instanceof com.iqoption.charttools.tools.data.n ? v.b((CharSequence) ((com.iqoption.charttools.tools.data.n) hVar).MH().Os(), charSequence, true) : hVar instanceof com.iqoption.charttools.tools.data.i ? v.b((CharSequence) ((com.iqoption.charttools.tools.data.i) hVar).MH().Os(), charSequence, true) : false;
                if (b) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }

        private final com.iqoption.charttools.tools.data.a o(com.iqoption.charttools.model.indicator.h hVar) {
            String string;
            int eK;
            x MH = hVar.MH();
            if (MH instanceof com.iqoption.charttools.model.indicator.k) {
                com.iqoption.charttools.model.indicator.k kVar = (com.iqoption.charttools.model.indicator.k) MH;
                int d = kVar.d(hVar.Oh());
                if (d == 1) {
                    string = com.iqoption.core.d.getString(R.string.thin);
                } else if (d == 2) {
                    string = com.iqoption.core.d.getString(R.string.medium);
                } else if (d != 3) {
                    string = "";
                } else {
                    string = com.iqoption.core.d.getString(R.string.thick);
                }
                eK = com.iqoption.core.ext.a.eK(kVar.c(hVar.Oh()));
            } else {
                string = com.iqoption.charttools.k.aDB.b(hVar);
                eK = h.aMq;
            }
            return new com.iqoption.charttools.tools.data.a(MH.On(), string, eK, hVar);
        }

        private final com.iqoption.charttools.tools.data.n a(x xVar, e eVar, List<? extends x> list, List<com.iqoption.charttools.model.indicator.h> list2) {
            int i;
            Object MH;
            Iterable<com.iqoption.charttools.model.indicator.h> iterable = list2;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (com.iqoption.charttools.model.indicator.h MH2 : iterable) {
                    if (kotlin.jvm.internal.i.y(MH2.MH(), xVar)) {
                        i++;
                        if (i < 0) {
                            m.bnp();
                        }
                    }
                }
            }
            int Oe = xVar.Oe();
            boolean z = Oe == 0 || Oe > i;
            String On = xVar.On();
            com.iqoption.core.data.model.e Op = xVar.Op();
            String info = xVar.getInfo();
            if (eVar != null) {
                com.iqoption.charttools.tools.data.n Qw = eVar.Qw();
                if (Qw != null) {
                    MH = Qw.MH();
                    return new com.iqoption.charttools.tools.data.n(xVar, On, Op, info, kotlin.jvm.internal.i.y(MH, xVar), list.contains(xVar), z);
                }
            }
            MH = null;
            return new com.iqoption.charttools.tools.data.n(xVar, On, Op, info, kotlin.jvm.internal.i.y(MH, xVar), list.contains(xVar), z);
        }

        private final com.iqoption.charttools.tools.data.i b(com.iqoption.charttools.tools.data.n nVar) {
            x MH = nVar.MH();
            String info = nVar.getInfo();
            if (info == null) {
                info = "";
            }
            return new com.iqoption.charttools.tools.data.i(MH, info, nVar.MH().Oq());
        }

        public final h g(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (h) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, bng = {"Lcom/iqoption/charttools/tools/ToolsViewModel$ExpandedMeta;", "", "categoryAdapterItem", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "item", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "(Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;)V", "getCategoryAdapterItem", "()Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "getItem", "()Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "equals", "", "other", "hashCode", "", "app_optionXRelease"})
    /* compiled from: ToolsViewModel.kt */
    private static final class e {
        private final com.iqoption.charttools.tools.data.c aMA;
        private final com.iqoption.charttools.tools.data.n aMB;

        public e(com.iqoption.charttools.tools.data.c cVar, com.iqoption.charttools.tools.data.n nVar) {
            kotlin.jvm.internal.i.f(cVar, "categoryAdapterItem");
            kotlin.jvm.internal.i.f(nVar, "item");
            this.aMA = cVar;
            this.aMB = nVar;
        }

        public final com.iqoption.charttools.tools.data.c Qv() {
            return this.aMA;
        }

        public final com.iqoption.charttools.tools.data.n Qw() {
            return this.aMB;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                e eVar = (e) obj;
                if (this.aMA.getId() == eVar.aMA.getId() && (kotlin.jvm.internal.i.y(this.aMB.getId(), eVar.aMB.getId()) ^ 1) == 0) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.tools.ToolsViewModel.ExpandedMeta");
        }

        public int hashCode() {
            return (Long.valueOf(this.aMA.getId()).hashCode() * 31) + this.aMB.getId().hashCode();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/charttools/tools/ToolsViewModel$OnTemplateApplied;", "Lcom/iqoption/app/events/IQEvent;", "()V", "app_optionXRelease"})
    /* compiled from: ToolsViewModel.kt */
    public static final class f {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ToolsViewModel.kt */
    static final class g implements Runnable {
        final /* synthetic */ com.iqoption.charttools.model.b.a aCZ;

        g(com.iqoption.charttools.model.b.a aVar) {
            this.aCZ = aVar;
        }

        public final void run() {
            com.iqoption.charttools.model.a.a OW = this.aCZ.OW();
            if (OW != null) {
                TabHelper IM = TabHelper.IM();
                kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
                com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
                if (Jh != null) {
                    boolean booleanValue;
                    com.iqoption.l.b aTS;
                    ChartType NT = OW.NT();
                    int ordinal = NT != null ? NT.ordinal() : Jh.JF().chartType;
                    Integer NV = OW.NV();
                    Jh.ab(ordinal, NV != null ? NV.intValue() : Jh.JF().candleSize);
                    ChartColor NU = OW.NU();
                    if (NU != null) {
                        ordinal = i.aFX[NU.ordinal()];
                        if (ordinal == 1) {
                            Jh.bG(true);
                        } else if (ordinal == 2) {
                            Jh.bG(false);
                        }
                    }
                    Boolean NW = OW.NW();
                    if (NW != null) {
                        Jh.bI(NW.booleanValue());
                    }
                    NW = OW.NX();
                    if (NW != null) {
                        Jh.bH(NW.booleanValue());
                    }
                    Boolean NY = OW.NY();
                    String str = "SettingsManager.instance()";
                    if (NY != null) {
                        booleanValue = NY.booleanValue();
                        aTS = com.iqoption.l.b.aTS();
                        kotlin.jvm.internal.i.e(aTS, str);
                        aTS.setTradersMoodEnabled(booleanValue);
                    }
                    NY = OW.NZ();
                    if (NY != null) {
                        booleanValue = NY.booleanValue();
                        aTS = com.iqoption.l.b.aTS();
                        kotlin.jvm.internal.i.e(aTS, str);
                        aTS.setLiveDealsEnabled(booleanValue);
                    }
                    Boolean Oa = OW.Oa();
                    if (Oa != null) {
                        com.iqoption.charttools.f.aCQ.bK(Oa.booleanValue());
                    }
                }
            }
            TabHelper.IM().IR();
            IQApp.Ex().bd(new f());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ToolsViewModel.kt */
    static final class r implements Runnable {
        final /* synthetic */ com.iqoption.charttools.model.indicator.h aML;
        final /* synthetic */ h aMt;

        r(h hVar, com.iqoption.charttools.model.indicator.h hVar2) {
            this.aMt = hVar;
            this.aML = hVar2;
        }

        public final void run() {
            com.iqoption.gl.c.aIy().instrumentSelect(this.aMt.aEK, this.aML.getIndex());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ToolsViewModel.kt */
    /* renamed from: com.iqoption.charttools.tools.h$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<com.iqoption.charttools.j> {
        final /* synthetic */ h aMt;

        AnonymousClass1(h hVar) {
            this.aMt = hVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.charttools.j jVar) {
            List arrayList = new ArrayList();
            arrayList.add(com.iqoption.charttools.tools.data.b.aMU);
            arrayList.add(com.iqoption.charttools.tools.data.g.aMY);
            if (com.iqoption.app.managers.feature.a.ef("script-indicators") && (jVar.Mk().isEmpty() ^ 1) != 0) {
                for (com.iqoption.charttools.model.a aVar : jVar.Mk()) {
                    arrayList.add(new com.iqoption.charttools.tools.data.d(aVar, com.iqoption.core.ext.c.fU(aVar.getName())));
                }
            }
            this.aMt.aLU.postValue(arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "indicators", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ToolsViewModel.kt */
    /* renamed from: com.iqoption.charttools.tools.h$3 */
    static final class AnonymousClass3<T> implements io.reactivex.b.f<List<? extends com.iqoption.charttools.model.indicator.h>> {
        final /* synthetic */ h aMt;

        AnonymousClass3(h hVar) {
            this.aMt = hVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.charttools.model.indicator.h> list) {
            MutableLiveData f = this.aMt.aMb;
            kotlin.jvm.internal.i.e(list, "indicators");
            Iterable<com.iqoption.charttools.model.indicator.h> iterable = list;
            a aVar = h.aMs;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.charttools.model.indicator.h a : iterable) {
                arrayList.add(aVar.o(a));
            }
            f.postValue((List) arrayList);
            int size = list.size();
            this.aMt.aLP.postValue(Integer.valueOf(size));
            this.aMt.aLR.postValue(Boolean.valueOf(size == 0));
            if (size == 0 && ((ToolsScreen) this.aMt.Qd().getValue()) == ToolsScreen.ACTIVE_TOOLS) {
                this.aMt.aLS.postValue(null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ToolsViewModel.kt */
    static final class b implements io.reactivex.b.a {
        public static final b aMw = new b();

        b() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "accept"})
    /* compiled from: ToolsViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Object> {
        public static final c aMx = new c();

        c() {
        }

        public final void accept(Object obj) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ToolsViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d aMy = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "indicators", "apply", "com/iqoption/charttools/tools/ToolsViewModel$createIndicatorsStream$5$2$1", "com/iqoption/charttools/tools/ToolsViewModel$$special$$inlined$let$lambda$2"})
    /* compiled from: ToolsViewModel.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ com.iqoption.charttools.tools.data.c aMC;
        final /* synthetic */ h aMt;

        h(h hVar, com.iqoption.charttools.tools.data.c cVar) {
            this.aMt = hVar;
            this.aMC = cVar;
        }

        /* renamed from: H */
        public final io.reactivex.e<List<com.iqoption.charttools.tools.data.h>> apply(List<? extends com.iqoption.charttools.tools.data.h> list) {
            kotlin.jvm.internal.i.f(list, "indicators");
            return this.aMt.U(list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "it", "Lcom/iqoption/charttools/IndicatorsLibrary;", "apply"})
    /* compiled from: ToolsViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, R> {
        public static final i aMD = new i();

        i() {
        }

        /* renamed from: e */
        public final List<x> apply(com.iqoption.charttools.j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            return jVar.LV();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "it", "Lcom/iqoption/charttools/IndicatorsLibrary;", "apply"})
    /* compiled from: ToolsViewModel.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, R> {
        public static final j aME = new j();

        j() {
        }

        /* renamed from: e */
        public final List<x> apply(com.iqoption.charttools.j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            Collection arrayList = new ArrayList();
            for (Object next : jVar.Ml()) {
                if (((x) next) instanceof v) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "it", "apply"})
    /* compiled from: ToolsViewModel.kt */
    static final class k<T, R> implements io.reactivex.b.g<T, R> {
        public static final k aMF = new k();

        k() {
        }

        public final List<x> apply(List<? extends x> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((x) next) instanceof v) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "it", "apply"})
    /* compiled from: ToolsViewModel.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, R> {
        public static final l aMG = new l();

        l() {
        }

        public final List<com.iqoption.charttools.model.indicator.h> apply(List<com.iqoption.charttools.model.indicator.h> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((com.iqoption.charttools.model.indicator.h) next).MH() instanceof v) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "constraint", "", "apply"})
    /* compiled from: ToolsViewModel.kt */
    static final class m<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ List aDf;

        m(List list) {
            this.aDf = list;
        }

        /* renamed from: v */
        public final List<com.iqoption.charttools.tools.data.h> apply(CharSequence charSequence) {
            kotlin.jvm.internal.i.f(charSequence, "constraint");
            return h.aMs.a(this.aDf, charSequence);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/charttools/tools/ToolsViewModel$getIndicators$1$1$1", "com/iqoption/charttools/tools/ToolsViewModel$$special$$inlined$let$lambda$1"})
    /* compiled from: ToolsViewModel.kt */
    static final class n<T> implements io.reactivex.b.f<List<? extends com.iqoption.charttools.tools.data.h>> {
        final /* synthetic */ com.iqoption.charttools.tools.data.c aMC;
        final /* synthetic */ MutableLiveData aMH;
        final /* synthetic */ h aMt;

        n(MutableLiveData mutableLiveData, h hVar, com.iqoption.charttools.tools.data.c cVar) {
            this.aMH = mutableLiveData;
            this.aMt = hVar;
            this.aMC = cVar;
        }

        /* renamed from: v */
        public final void accept(List<? extends com.iqoption.charttools.tools.data.h> list) {
            Object list2;
            MutableLiveData mutableLiveData = this.aMH;
            kotlin.jvm.internal.i.e(list2, "it");
            if ((list2.isEmpty() ^ 1) == 0) {
                list2 = null;
            }
            if (list2 == null) {
                list2 = h.aMr;
            }
            mutableLiveData.postValue(list2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ToolsViewModel.kt */
    static final class o<T> implements io.reactivex.b.f<Throwable> {
        public static final o aMI = new o();

        o() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ToolsViewModel.kt */
    static final class p implements io.reactivex.b.a {
        final /* synthetic */ h aMt;

        p(h hVar) {
            this.aMt = hVar;
        }

        public final void run() {
            this.aMt.aMk.postValue(d.aLz);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ToolsViewModel.kt */
    static final class q<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ List aMJ;
        final /* synthetic */ h aMt;

        q(h hVar, List list) {
            this.aMt = hVar;
            this.aMJ = list;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aMt.aMf.postValue(this.aMJ);
            this.aMt.aMk.postValue(new c(com.iqoption.core.d.getString(R.string.could_not_delete_template)));
        }
    }

    public h() {
        Boolean valueOf = Boolean.valueOf(false);
        Integer valueOf2 = Integer.valueOf(0);
        this.aLP = new com.iqoption.core.data.b.c(valueOf2);
        this.aLQ = new com.iqoption.core.data.b.c(valueOf2);
        Boolean valueOf3 = Boolean.valueOf(true);
        this.aLR = new com.iqoption.core.data.b.c(valueOf3);
        this.aLW = new com.iqoption.core.data.b.c(valueOf);
        this.aLX = this.aLW;
        BehaviorProcessor cX = BehaviorProcessor.cX("");
        kotlin.jvm.internal.i.e(cX, "BehaviorProcessor.createDefault<CharSequence>(\"\")");
        this.aLY = cX;
        this.aLZ = new LinkedHashMap();
        this.aMa = new LinkedHashMap();
        this.aMb = new MutableLiveData();
        this.aMc = this.aMb;
        this.aMd = new com.iqoption.core.data.b.c(valueOf);
        this.aMe = this.aMd;
        this.aMf = new MutableLiveData();
        this.aMg = this.aMf;
        this.aMh = -1;
        String str = TabHelper.awb;
        kotlin.jvm.internal.i.e(str, "TabHelper.NOT_INITILIZED_TAB_ID_STRING");
        this.aEK = str;
        this.aMk = new com.iqoption.core.data.b.b();
        this.aMl = this.aMk;
        this.aMm = com.iqoption.core.rx.d.bER.bQ(valueOf3);
        this.aqB = new io.reactivex.disposables.a();
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        if (Jh != null) {
            kotlin.jvm.internal.i.e(Jh, "it");
            this.aMh = Jh.Jv();
            str = Jh.Ju();
            kotlin.jvm.internal.i.e(str, "it.idString");
            this.aEK = str;
        }
        this.aqB.e(com.iqoption.charttools.k.aDB.Mn().h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass1(this), aMn));
        if (com.iqoption.app.managers.feature.a.eg("templates")) {
            final ArrayMap arrayMap = new ArrayMap();
            final AtomicInteger atomicInteger = new AtomicInteger();
            this.aqB.e(com.iqoption.core.rx.g.a(com.iqoption.charttools.q.aEd.Mw(), com.iqoption.charttools.f.aCQ.ez(this.aEK), com.iqoption.charttools.f.aCQ.Mc(), this.aMm, new io.reactivex.b.i<List<? extends com.iqoption.charttools.model.b.a>, List<? extends com.iqoption.charttools.model.indicator.h>, Boolean, Boolean, kotlin.l>(this) {
                final /* synthetic */ h aMt;

                public final void a(List<com.iqoption.charttools.model.b.a> list, List<com.iqoption.charttools.model.indicator.h> list2, boolean z, boolean z2) {
                    kotlin.jvm.internal.i.f(list, "templates");
                    kotlin.jvm.internal.i.f(list2, "indicators");
                    MutableLiveData f = this.aMt.aMb;
                    Iterable<com.iqoption.charttools.model.indicator.h> iterable = list2;
                    a aVar = h.aMs;
                    Collection arrayList = new ArrayList(n.e(iterable, 10));
                    for (com.iqoption.charttools.model.indicator.h a : iterable) {
                        arrayList.add(aVar.o(a));
                    }
                    f.postValue((List) arrayList);
                    int size = list2.size();
                    this.aMt.aLP.postValue(Integer.valueOf(size));
                    this.aMt.aLR.postValue(Boolean.valueOf(size == 0));
                    if (size == 0 && ((ToolsScreen) this.aMt.Qd().getValue()) == ToolsScreen.ACTIVE_TOOLS) {
                        this.aMt.aLS.postValue(null);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object next : iterable) {
                        if (((com.iqoption.charttools.model.indicator.h) next).MH() instanceof com.iqoption.charttools.model.indicator.k) {
                            arrayList2.add(next);
                        } else {
                            arrayList3.add(next);
                        }
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    List list3 = (List) pair.bnj();
                    List list4 = (List) pair.bnk();
                    atomicInteger.set(0);
                    MutableLiveData d = this.aMt.aMf;
                    List arrayList4 = new ArrayList();
                    for (com.iqoption.charttools.model.b.a a2 : list) {
                        arrayList4.add(h.aMs.a(a2, z, list4, list3, arrayMap, atomicInteger));
                    }
                    this.aMt.aLQ.postValue(Integer.valueOf(atomicInteger.get()));
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(com.iqoption.charttools.tools.data.f.aMX);
                    }
                    d.postValue(arrayList4);
                }
            }).d(com.iqoption.core.rx.i.aki()).a(aMo, aMn));
        } else {
            this.aqB.e(com.iqoption.charttools.f.aCQ.ez(this.aEK).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass3(this), aMn, aMp));
        }
        List arrayList = new ArrayList();
        SettingType settingType = SettingType.TRADERS_MOOD;
        com.iqoption.l.b aTS = com.iqoption.l.b.aTS();
        String str2 = "SettingsManager.instance()";
        kotlin.jvm.internal.i.e(aTS, str2);
        arrayList.add(new com.iqoption.charttools.tools.data.k(settingType, aTS.Pk()));
        if (com.iqoption.h.a.aNv()) {
            settingType = SettingType.LIVE_DEALS;
            aTS = com.iqoption.l.b.aTS();
            kotlin.jvm.internal.i.e(aTS, str2);
            arrayList.add(new com.iqoption.charttools.tools.data.k(settingType, aTS.Pl()));
        }
        arrayList.add(new com.iqoption.charttools.tools.data.k(SettingType.APPLY_TO_ALL_ASSETS, com.iqoption.charttools.f.aCQ.Me()));
        arrayList.add(new com.iqoption.charttools.tools.data.k(SettingType.VOLUME, com.iqoption.charttools.f.aCQ.Md()));
        this.aMi = new com.iqoption.core.data.b.c(arrayList);
        this.aMj = this.aMi;
    }

    public final LiveData<ToolsScreen> Qd() {
        return this.aLT;
    }

    public final LiveData<List<com.iqoption.charttools.tools.data.c>> Qe() {
        return this.aLV;
    }

    public final LiveData<Boolean> Qf() {
        return this.aLX;
    }

    public final LiveData<List<com.iqoption.charttools.tools.data.a>> Qg() {
        return this.aMc;
    }

    public final LiveData<Boolean> Qh() {
        return this.aMe;
    }

    public final LiveData<List<com.iqoption.charttools.tools.data.l>> Qi() {
        return this.aMg;
    }

    public final LiveData<List<com.iqoption.charttools.tools.data.k>> Qj() {
        return this.aMj;
    }

    public final LiveData<b> Qk() {
        return this.aMl;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aqB.clear();
    }

    public final LiveData<Boolean> Ql() {
        return this.aLR;
    }

    public final LiveData<Integer> Qm() {
        return this.aLP;
    }

    public final LiveData<Integer> Qn() {
        return this.aLQ;
    }

    public final void a(com.iqoption.charttools.tools.data.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "settingItem");
        Object Qz = kVar.Qz();
        int i = i.aob[kVar.QA().ordinal()];
        String str = "SettingsManager.instance()";
        com.iqoption.l.b aTS;
        if (i == 1) {
            aTS = com.iqoption.l.b.aTS();
            kotlin.jvm.internal.i.e(aTS, str);
            aTS.setTradersMoodEnabled(Qz.isEnabled());
            this.aMm.onNext(Boolean.valueOf(true));
            e.aLA.bZ(Qz.isEnabled());
        } else if (i == 2) {
            aTS = com.iqoption.l.b.aTS();
            kotlin.jvm.internal.i.e(aTS, str);
            aTS.setLiveDealsEnabled(Qz.isEnabled());
            this.aMm.onNext(Boolean.valueOf(true));
        } else if (i == 3) {
            com.iqoption.charttools.f.aCQ.k(this.aEK, Qz.isEnabled()).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
            e.aLA.ca(Qz.isEnabled());
        } else if (i == 4) {
            com.iqoption.charttools.f.aCQ.bK(Qz.isEnabled());
            e.aLA.cb(Qz.isEnabled());
        }
        List<com.iqoption.charttools.tools.data.k> list = (List) this.aMi.getValue();
        int i2 = 0;
        for (com.iqoption.charttools.tools.data.k QA : list) {
            if ((QA.QA() == kVar.QA() ? 1 : null) != null) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            this.aMi.setValue(com.iqoption.core.ext.c.a((List) list, i2, Qz));
        }
    }

    public final void e(ToolsScreen toolsScreen) {
        Object toolsScreen2;
        MutableLiveData mutableLiveData = this.aLS;
        if (((ToolsScreen) mutableLiveData.getValue()) == toolsScreen2) {
            toolsScreen2 = null;
        }
        com.iqoption.core.ext.a.d(mutableLiveData, toolsScreen2);
        if (toolsScreen2 != null) {
            int i = i.axg[toolsScreen2.ordinal()];
            if (i == 1) {
                e.aLA.PH();
            } else if (i == 2) {
                e.aLA.PG();
            } else if (i == 3) {
                e.aLA.PI();
            }
        }
    }

    public final void Qo() {
        com.iqoption.charttools.f.aCQ.eB(this.aEK).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
    }

    public final void l(com.iqoption.charttools.model.indicator.h hVar) {
        kotlin.jvm.internal.i.f(hVar, "indicator");
        com.iqoption.charttools.f.aCQ.v(this.aEK, hVar.getIndex()).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
    }

    public final void b(com.iqoption.charttools.tools.data.m mVar) {
        kotlin.jvm.internal.i.f(mVar, "templateItem");
        com.iqoption.charttools.model.b.a QB = mVar.QB();
        e.aLA.ae(QB.LV().size(), QB.Ms().size());
        com.iqoption.charttools.f.aCQ.a(this.aEK, this.aMh, QB).b((io.reactivex.c) io.reactivex.a.l(new g(QB))).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
    }

    public final void m(com.iqoption.charttools.model.indicator.h hVar) {
        kotlin.jvm.internal.i.f(hVar, "indicator");
        com.iqoption.charttools.f.a(com.iqoption.charttools.f.aCQ, this.aEK, hVar.getIndex(), Boolean.valueOf(hVar.isHidden() ^ 1), null, false, 24, null).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
    }

    public final boolean n(com.iqoption.charttools.model.indicator.h hVar) {
        kotlin.jvm.internal.i.f(hVar, "indicator");
        if (!(hVar.MH() instanceof com.iqoption.charttools.model.indicator.k)) {
            return false;
        }
        io.reactivex.a.l(new r(this, hVar)).b(com.iqoption.core.rx.i.akl()).a(aMp, aMn);
        return true;
    }

    public final void c(com.iqoption.charttools.tools.data.m mVar) {
        kotlin.jvm.internal.i.f(mVar, "templateItem");
        List<com.iqoption.charttools.tools.data.l> list = (List) this.aMg.getValue();
        if (list != null) {
            int i = 0;
            for (com.iqoption.charttools.tools.data.l id : list) {
                if (kotlin.jvm.internal.i.y((String) id.getId(), mVar.getId())) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                this.aMf.setValue(com.iqoption.core.ext.c.b((List) list, i));
            }
        }
        com.iqoption.charttools.model.b.a QB = mVar.QB();
        e.aLA.ac(QB.LV().size(), QB.Ms().size());
        com.iqoption.charttools.q.aEd.ax(mVar.QB().getId()).b(com.iqoption.core.rx.i.aki()).a(new p(this), new q(this, list));
    }

    public final void Qp() {
        com.iqoption.core.ext.a.a(this.aMd, Boolean.valueOf(true));
    }

    public final void Qq() {
        com.iqoption.core.ext.a.a(this.aMd, Boolean.valueOf(false));
    }

    public final void a(com.iqoption.charttools.tools.data.c cVar, com.iqoption.charttools.tools.data.n nVar) {
        kotlin.jvm.internal.i.f(cVar, "categoryAdapterItem");
        kotlin.jvm.internal.i.f(nVar, "item");
        BehaviorProcessor behaviorProcessor = (BehaviorProcessor) this.aLZ.get(cVar);
        if (behaviorProcessor != null) {
            Optional optional = (Optional) behaviorProcessor.getValue();
            if (optional != null) {
                e eVar = new e(cVar, nVar);
                if (kotlin.jvm.internal.i.y(eVar, (e) optional.pN())) {
                    behaviorProcessor.onNext(Optional.pW());
                } else {
                    behaviorProcessor.onNext(Optional.am(eVar));
                }
            }
        }
    }

    public final void a(com.iqoption.charttools.tools.data.n nVar) {
        kotlin.jvm.internal.i.f(nVar, "item");
        if (nVar.QE()) {
            com.iqoption.charttools.i.aDs.b(nVar.MH()).b(com.iqoption.core.rx.i.aki()).a(aMp, aMn);
        } else {
            com.iqoption.charttools.i.aDs.a(nVar.MH()).b(com.iqoption.core.rx.i.aki()).a(aMp, aMn);
        }
    }

    public final LiveData<List<com.iqoption.charttools.tools.data.h>> a(com.iqoption.charttools.tools.data.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "item");
        MutableLiveData mutableLiveData = (MutableLiveData) this.aMa.get(cVar);
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        mutableLiveData = new MutableLiveData();
        BehaviorProcessor cX = BehaviorProcessor.cX(Optional.pW());
        Map map = this.aLZ;
        kotlin.jvm.internal.i.e(cX, "processor");
        map.put(cVar, cX);
        this.aqB.e(a(cVar, (io.reactivex.processors.a) cX).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new n(mutableLiveData, this, cVar), (io.reactivex.b.f) o.aMI));
        this.aMa.put(cVar, mutableLiveData);
        return mutableLiveData;
    }

    private final io.reactivex.e<List<com.iqoption.charttools.tools.data.h>> a(com.iqoption.charttools.tools.data.c cVar, io.reactivex.processors.a<Optional<e>> aVar) {
        kotlin.jvm.a.b toolsViewModel$createIndicatorsStream$combiner$1;
        List arrayList = new ArrayList();
        String str = "IndicatorsLibraryManager…            .toFlowable()";
        io.reactivex.e bkO;
        if (com.iqoption.app.managers.feature.a.ef("script-indicators")) {
            if ((kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.g.aMY) ^ 1) != 0) {
                bkO = com.iqoption.charttools.k.aDB.Mn().t(i.aMD).bkO();
                kotlin.jvm.internal.i.e(bkO, str);
                arrayList.add(bkO);
            }
            arrayList.add(com.iqoption.charttools.i.aDs.JZ());
            arrayList.add(com.iqoption.charttools.f.aCQ.ez(this.aEK));
        } else {
            if ((kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.g.aMY) ^ 1) != 0) {
                bkO = com.iqoption.charttools.k.aDB.Mn().t(j.aME).bkO();
                kotlin.jvm.internal.i.e(bkO, str);
                arrayList.add(bkO);
            }
            bkO = com.iqoption.charttools.i.aDs.JZ().g(k.aMF);
            kotlin.jvm.internal.i.e(bkO, "FavoriteIndicatorsManage… it is LocalIndicator } }");
            arrayList.add(bkO);
            bkO = com.iqoption.charttools.f.aCQ.ez(this.aEK).g(l.aMG);
            kotlin.jvm.internal.i.e(bkO, "ActiveIndicatorsManager.…eta is LocalIndicator } }");
            arrayList.add(bkO);
        }
        io.reactivex.e c = aVar.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "processor.observeOn(bg)");
        arrayList.add(c);
        if (kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.b.aMU) || kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.j.aNa)) {
            toolsViewModel$createIndicatorsStream$combiner$1 = new ToolsViewModel$createIndicatorsStream$combiner$1(cVar);
        } else if (kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.g.aMY)) {
            toolsViewModel$createIndicatorsStream$combiner$1 = new ToolsViewModel$createIndicatorsStream$combiner$2(cVar);
        } else if (cVar instanceof com.iqoption.charttools.tools.data.d) {
            toolsViewModel$createIndicatorsStream$combiner$1 = new ToolsViewModel$createIndicatorsStream$combiner$3(cVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.e<List<com.iqoption.charttools.tools.data.h>> a = io.reactivex.e.a((Iterable) arrayList, (io.reactivex.b.g) new j(toolsViewModel$createIndicatorsStream$combiner$1));
        io.reactivex.e eVar = kotlin.jvm.internal.i.y(cVar, com.iqoption.charttools.tools.data.j.aNa) ? a : null;
        if (eVar != null) {
            io.reactivex.e<List<com.iqoption.charttools.tools.data.h>> k = eVar.k(new h(this, cVar));
            if (k != null) {
                return k;
            }
        }
        kotlin.jvm.internal.i.e(a, "indicatorsStream");
        return a;
    }

    private final io.reactivex.e<List<com.iqoption.charttools.tools.data.h>> U(List<? extends com.iqoption.charttools.tools.data.h> list) {
        io.reactivex.e g = this.aLY.c(com.iqoption.core.rx.i.aki()).k(250, TimeUnit.MILLISECONDS).g(new m(list));
        kotlin.jvm.internal.i.e(g, "searchConstraintProcesso…traint)\n                }");
        return g;
    }

    public final void Qr() {
        com.iqoption.core.data.b.c cVar = this.aLW;
        if (!((Boolean) cVar.getValue()).booleanValue()) {
            cVar.setValue(Boolean.valueOf(true));
        }
    }

    public final void Qs() {
        com.iqoption.core.data.b.c cVar = this.aLW;
        if (((Boolean) cVar.getValue()).booleanValue()) {
            cVar.setValue(Boolean.valueOf(false));
        }
    }

    public final void u(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        this.aLY.onNext(charSequence);
    }
}
