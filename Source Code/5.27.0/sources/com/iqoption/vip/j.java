package com.iqoption.vip;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.util.concurrent.o;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.fragment.leftmenu.e;
import com.iqoption.microservice.vip.f;
import com.iqoption.util.ah;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 32\u00020\u0001:\u000223B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0014\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ0\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010 \u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J5\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\b0\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0011J\u0016\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012J$\u0010-\u001a\u00020\u00182\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010/\u001a\u00020\u000eH\u0002J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u000bH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, bng = {"Lcom/iqoption/vip/VipManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "vipManagerLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/util/Resource;", "Lcom/iqoption/microservice/vip/VipManager;", "calculateDayDiff", "", "weekDay", "canOrderCallback", "", "chooseFirstWorkingDate", "Lkotlin/Pair;", "Ljava/util/Date;", "Lcom/iqoption/vip/WorkingPeriod;", "managerWorkPeriodUtc", "", "Lcom/iqoption/vip/WeekDay;", "getCallPeriods", "Lkotlin/Triple;", "Lcom/iqoption/vip/VipManagerViewModel$CallPeriod;", "getPreferredStartDate", "period", "getVipManager", "Landroidx/lifecycle/LiveData;", "initialize", "", "nextWorkingDate", "date", "requestCall", "Ljava/lang/Void;", "context", "Landroid/content/Context;", "time", "", "traningSession", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "requestCallTimeFormat", "selectedDate", "selectedPeriod", "splitPeriod", "periodPair", "choosePreffered", "weekDayByDayOfWeek", "dayOfWeek", "CallPeriod", "Companion", "app_optionXRelease"})
/* compiled from: VipManagerViewModel.kt */
public final class j extends ViewModel {
    public static final b ejY = new b();
    private final Calendar calendar = Calendar.getInstance();
    private final MutableLiveData<ah<com.iqoption.microservice.vip.d>> ejX = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, bng = {"Lcom/iqoption/vip/VipManagerViewModel$CallPeriod;", "", "date", "Ljava/util/Date;", "titleDate", "", "periods", "", "Lcom/iqoption/vip/WorkingPeriod;", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/util/Date;", "getPeriods", "()Ljava/util/List;", "getTitleDate", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_optionXRelease"})
    /* compiled from: VipManagerViewModel.kt */
    public static final class a {
        private final List<k> byn;
        private final Date date;
        private final String ejZ;

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.byn, r3.byn) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.vip.j.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.vip.j.a) r3;
            r0 = r2.date;
            r1 = r3.date;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.ejZ;
            r1 = r3.ejZ;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.byn;
            r3 = r3.byn;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.vip.j$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Date date = this.date;
            int i = 0;
            int hashCode = (date != null ? date.hashCode() : 0) * 31;
            String str = this.ejZ;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            List list = this.byn;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CallPeriod(date=");
            stringBuilder.append(this.date);
            stringBuilder.append(", titleDate=");
            stringBuilder.append(this.ejZ);
            stringBuilder.append(", periods=");
            stringBuilder.append(this.byn);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(Date date, String str, List<k> list) {
            kotlin.jvm.internal.i.f(date, "date");
            kotlin.jvm.internal.i.f(str, "titleDate");
            kotlin.jvm.internal.i.f(list, "periods");
            this.date = date;
            this.ejZ = str;
            this.byn = list;
        }

        public final String aZq() {
            return this.ejZ;
        }

        public final List<k> ahf() {
            return this.byn;
        }

        public final Date getDate() {
            return this.date;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/vip/VipManagerViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/vip/VipManagerViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: VipManagerViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final j K(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(j.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…gerViewModel::class.java)");
            return (j) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, bng = {"com/iqoption/vip/VipManagerViewModel$initialize$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/iqoption/microservice/vip/VipManagerResponse;", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: VipManagerViewModel.kt */
    public static final class c implements o<f> {
        final /* synthetic */ j eka;

        c(j jVar) {
            this.eka = jVar;
        }

        /* renamed from: a */
        public void onSuccess(f fVar) {
            if (fVar == null) {
                return;
            }
            if (!fVar.RD() || fVar.aOQ() == null) {
                this.eka.ejX.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, null, null, 7, null));
                return;
            }
            this.eka.ejX.postValue(ah.ebV.cr(fVar.aOQ()));
            e.aEi().dN(true);
        }

        public void l(Throwable th) {
            this.eka.ejX.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, null, null, 7, null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, bng = {"com/iqoption/vip/VipManagerViewModel$requestCall$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/iqoption/microservice/vip/BasicResponse;", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: VipManagerViewModel.kt */
    public static final class d implements o<com.iqoption.microservice.vip.a> {
        final /* synthetic */ MutableLiveData cxL;

        d(MutableLiveData mutableLiveData) {
            this.cxL = mutableLiveData;
        }

        /* renamed from: a */
        public void onSuccess(com.iqoption.microservice.vip.a aVar) {
            if (aVar == null || !aVar.RD()) {
                this.cxL.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, null, null, 7, null));
            } else {
                this.cxL.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, 1, null));
            }
        }

        public void l(Throwable th) {
            this.cxL.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, null, null, 7, null));
        }
    }

    private final int hQ(int i) {
        return i != 6 ? i != 7 ? 1 : 2 : 3;
    }

    public final void initialize() {
        if (com.iqoption.app.managers.feature.a.ef("vip-manager")) {
            v.a(com.iqoption.microservice.vip.e.dHD.aOP(), (o) new c(this));
        }
    }

    public final LiveData<ah<com.iqoption.microservice.vip.d>> aZn() {
        return this.ejX;
    }

    public final Triple<a, a, a> aZo() {
        ah ahVar = (ah) this.ejX.getValue();
        if (ahVar != null) {
            com.iqoption.microservice.vip.d dVar = (com.iqoption.microservice.vip.d) ahVar.getData();
            if (dVar == null || dVar.aOO().isEmpty()) {
                return null;
            }
            Pair O = O(dVar.aOO());
            Calendar calendar = this.calendar;
            String str = "calendar";
            kotlin.jvm.internal.i.e(calendar, str);
            calendar.setTime((Date) O.getFirst());
            this.calendar.add(5, 1);
            calendar = this.calendar;
            kotlin.jvm.internal.i.e(calendar, str);
            Date time = calendar.getTime();
            String str2 = "calendar.time";
            kotlin.jvm.internal.i.e(time, str2);
            Pair a = a(time, dVar.aOO());
            Calendar calendar2 = this.calendar;
            kotlin.jvm.internal.i.e(calendar2, str);
            calendar2.setTime((Date) a.getFirst());
            this.calendar.add(5, 1);
            Calendar calendar3 = this.calendar;
            kotlin.jvm.internal.i.e(calendar3, str);
            Date time2 = calendar3.getTime();
            kotlin.jvm.internal.i.e(time2, str2);
            return new Triple(a(O, true), a(a, false), a(a(time2, dVar.aOO()), false));
        }
        return null;
    }

    private final a a(Pair<? extends Date, k> pair, boolean z) {
        List arrayList = new ArrayList();
        Calendar calendar = this.calendar;
        String str = "calendar";
        kotlin.jvm.internal.i.e(calendar, str);
        calendar.setTime((Date) pair.getFirst());
        int i = this.calendar.get(5);
        Calendar calendar2 = this.calendar;
        kotlin.jvm.internal.i.e(calendar2, str);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        int i2 = this.calendar.get(11);
        int i3 = this.calendar.get(12);
        Object obj = i == this.calendar.get(5) ? 1 : null;
        Date b = z ? b((k) pair.bni()) : ((k) pair.bni()).getStartDate();
        Date endDate = ((k) pair.bni()).getEndDate();
        Calendar calendar3 = this.calendar;
        kotlin.jvm.internal.i.e(calendar3, str);
        calendar3.setTime(b);
        while (b.compareTo(endDate) < 0) {
            String str2 = "calendar.time";
            if ((obj == null || this.calendar.get(11) >= i2) && (this.calendar.get(11) != i2 || this.calendar.get(12) >= i3)) {
                this.calendar.add(12, 15);
                Calendar calendar4 = this.calendar;
                kotlin.jvm.internal.i.e(calendar4, str);
                Date time = calendar4.getTime();
                kotlin.jvm.internal.i.e(time, str2);
                arrayList.add(new k(b, time));
                b = time;
            } else {
                this.calendar.add(12, 15);
                Calendar calendar5 = this.calendar;
                kotlin.jvm.internal.i.e(calendar5, str);
                b = calendar5.getTime();
                kotlin.jvm.internal.i.e(b, str2);
            }
        }
        Object format = arrayList.isEmpty() ? "" : TimeUtil.bRz.format((Date) pair.getFirst());
        Date date = (Date) pair.getFirst();
        kotlin.jvm.internal.i.e(format, "titleDate");
        return new a(date, format, arrayList);
    }

    private final Date b(k kVar) {
        Calendar calendar = this.calendar;
        String str = "calendar";
        kotlin.jvm.internal.i.e(calendar, str);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = this.calendar.get(11);
        int i2 = this.calendar.get(12);
        Calendar calendar2 = this.calendar;
        kotlin.jvm.internal.i.e(calendar2, str);
        calendar2.setTime(kVar.getStartDate());
        if (i < this.calendar.get(11)) {
            return kVar.getStartDate();
        }
        Date startDate = kVar.getStartDate();
        while (i <= this.calendar.get(11) && this.calendar.get(12) <= i2) {
            this.calendar.add(12, 15);
            Calendar calendar3 = this.calendar;
            kotlin.jvm.internal.i.e(calendar3, str);
            startDate = calendar3.getTime();
            kotlin.jvm.internal.i.e(startDate, "calendar.time");
        }
        return startDate;
    }

    private final Pair<Date, k> a(Date date, Map<WeekDay, k> map) {
        int i = this.calendar.get(7);
        k kVar = (k) map.get(hR(i));
        if (kVar == null) {
            return new Pair(new Date(), new k(new Date(), new Date()));
        }
        if (i != 7 && i != 1) {
            return new Pair(date, kVar);
        }
        Calendar calendar = this.calendar;
        String str = "calendar";
        kotlin.jvm.internal.i.e(calendar, str);
        calendar.setTime(date);
        this.calendar.add(5, hQ(i));
        Calendar calendar2 = this.calendar;
        kotlin.jvm.internal.i.e(calendar2, str);
        return new Pair(calendar2.getTime(), kVar);
    }

    private final Pair<Date, k> O(Map<WeekDay, k> map) {
        Calendar calendar = this.calendar;
        String str = "calendar";
        kotlin.jvm.internal.i.e(calendar, str);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = this.calendar.get(7);
        int i2 = this.calendar.get(11);
        k kVar = (k) map.get(hR(i));
        if (kVar == null) {
            return new Pair(new Date(), new k(new Date(), new Date()));
        }
        Calendar calendar2 = this.calendar;
        kotlin.jvm.internal.i.e(calendar2, str);
        calendar2.setTime(kVar.getEndDate());
        if (i2 < this.calendar.get(11)) {
            return new Pair(new Date(), kVar);
        }
        k kVar2 = (k) map.get(hR(i + 1));
        if (kVar2 == null) {
            return new Pair(new Date(), new k(new Date(), new Date()));
        }
        Calendar calendar3 = this.calendar;
        kotlin.jvm.internal.i.e(calendar3, str);
        calendar3.setTimeInMillis(System.currentTimeMillis());
        this.calendar.add(5, hQ(i));
        calendar3 = this.calendar;
        kotlin.jvm.internal.i.e(calendar3, str);
        return new Pair(calendar3.getTime(), kVar2);
    }

    private final WeekDay hR(int i) {
        if (i == 3) {
            return WeekDay.TUE;
        }
        if (i == 4) {
            return WeekDay.WED;
        }
        if (i == 5) {
            return WeekDay.THU;
        }
        if (i != 6) {
            return WeekDay.MON;
        }
        return WeekDay.FRI;
    }

    public final LiveData<ah<Void>> a(Context context, String str, Long l) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (aZp()) {
            v.a(com.iqoption.microservice.vip.e.dHD.b(str, l), (o) new d(mutableLiveData));
        } else {
            mutableLiveData.postValue(com.iqoption.util.ah.a.a(ah.ebV, null, context != null ? context.getString(R.string.this_option_is_not_available_yet) : null, null, 5, null));
        }
        return mutableLiveData;
    }

    private final boolean aZp() {
        ah ahVar = (ah) this.ejX.getValue();
        com.iqoption.microservice.vip.d dVar = ahVar != null ? (com.iqoption.microservice.vip.d) ahVar.getData() : null;
        return dVar == null || dVar.aOC();
    }

    public final String e(long j, k kVar) {
        kotlin.jvm.internal.i.f(kVar, "selectedPeriod");
        Calendar instance = Calendar.getInstance();
        kotlin.jvm.internal.i.e(instance, "calendar");
        instance.setTime(kVar.getStartDate());
        int i = instance.get(11);
        int i2 = instance.get(12);
        instance.setTimeInMillis(j);
        instance.set(11, i);
        instance.set(12, i2);
        Date time = instance.getTime();
        kotlin.jvm.internal.i.e(time, "calendar.time");
        return g(time);
    }

    public final String g(Date date) {
        kotlin.jvm.internal.i.f(date, "date");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.i.e(format, "df.format(date)");
        return format;
    }
}
