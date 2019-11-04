package com.iqoption.tradinghistory.materialcalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;
import com.iqoption.tradinghistory.g.h;
import com.iqoption.tradinghistory.materialcalendar.a.e;
import com.iqoption.tradinghistory.materialcalendar.a.f;
import com.iqoption.tradinghistory.materialcalendar.a.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MaterialCalendarView extends ViewGroup {
    private static final g dZS = new com.iqoption.tradinghistory.materialcalendar.a.d();
    private final TextView alH;
    private final r dZT;
    private final l dZU;
    private final l dZV;
    private final c dZW;
    private d<?> dZX;
    private b dZY;
    private LinearLayout dZZ;
    private b dZm;
    private b dZn;
    private CalendarMode eaa;
    private boolean eab;
    private final ArrayList<i> eac;
    private final OnClickListener ead;
    private final OnPageChangeListener eae;
    private o eaf;
    private p eag;
    private q eah;
    CharSequence eai;
    private int eaj;
    private int eak;
    private Drawable eal;
    private Drawable eam;
    private int ean;
    private int eao;
    private int eap;
    private boolean eaq;
    private c ear;
    private int firstDayOfWeek;

    /* renamed from: com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] eat = new int[CalendarMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.tradinghistory.materialcalendar.CalendarMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            eat = r0;
            r0 = eat;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.tradinghistory.materialcalendar.CalendarMode.MONTHS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eat;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.tradinghistory.materialcalendar.CalendarMode.WEEKS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView$AnonymousClass4.<clinit>():void");
        }
    }

    protected static class a extends MarginLayoutParams {
        public a(int i) {
            super(-1, i);
        }
    }

    public static class b extends BaseSavedState {
        public static final Creator<b> CREATOR = new Creator<b>() {
            /* renamed from: am */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: hn */
            public b[] newArray(int i) {
                return new b[i];
            }
        };
        int color;
        b dZY;
        int dZl;
        b dZm;
        b dZn;
        List<b> dZp;
        int dateTextAppearance;
        CalendarMode eaa;
        int eap;
        boolean eaq;
        int eau;
        int eav;
        boolean eaw;
        boolean eax;
        boolean eay;
        int firstDayOfWeek;
        int orientation;
        int weekDayTextAppearance;

        /* synthetic */ b(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        b(Parcelable parcelable) {
            super(parcelable);
            this.color = 0;
            this.dateTextAppearance = 0;
            this.weekDayTextAppearance = 0;
            this.dZl = 4;
            this.eaq = true;
            this.dZm = null;
            this.dZn = null;
            this.dZp = new ArrayList();
            this.firstDayOfWeek = 1;
            this.orientation = 0;
            this.eau = -1;
            this.eav = -1;
            this.eaw = true;
            this.eap = 1;
            this.eax = false;
            this.eaa = CalendarMode.MONTHS;
            this.dZY = null;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.color);
            parcel.writeInt(this.dateTextAppearance);
            parcel.writeInt(this.weekDayTextAppearance);
            parcel.writeInt(this.dZl);
            parcel.writeByte((byte) this.eaq);
            parcel.writeParcelable(this.dZm, 0);
            parcel.writeParcelable(this.dZn, 0);
            parcel.writeTypedList(this.dZp);
            parcel.writeInt(this.firstDayOfWeek);
            parcel.writeInt(this.orientation);
            parcel.writeInt(this.eau);
            parcel.writeInt(this.eav);
            parcel.writeInt(this.eaw);
            parcel.writeInt(this.eap);
            parcel.writeInt(this.eax);
            parcel.writeInt(this.eaa == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.dZY, 0);
            parcel.writeByte((byte) this.eay);
        }

        private b(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.color = 0;
            this.dateTextAppearance = 0;
            this.weekDayTextAppearance = 0;
            this.dZl = 4;
            this.eaq = true;
            this.dZm = null;
            this.dZn = null;
            this.dZp = new ArrayList();
            this.firstDayOfWeek = 1;
            this.orientation = 0;
            this.eau = -1;
            this.eav = -1;
            this.eaw = true;
            this.eap = 1;
            this.eax = false;
            this.eaa = CalendarMode.MONTHS;
            this.dZY = null;
            this.color = parcel.readInt();
            this.dateTextAppearance = parcel.readInt();
            this.weekDayTextAppearance = parcel.readInt();
            this.dZl = parcel.readInt();
            this.eaq = parcel.readByte() != (byte) 0;
            ClassLoader classLoader = b.class.getClassLoader();
            this.dZm = (b) parcel.readParcelable(classLoader);
            this.dZn = (b) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.dZp, b.CREATOR);
            this.firstDayOfWeek = parcel.readInt();
            this.orientation = parcel.readInt();
            this.eau = parcel.readInt();
            this.eav = parcel.readInt();
            this.eaw = parcel.readInt() == 1;
            this.eap = parcel.readInt();
            this.eax = parcel.readInt() == 1;
            this.eaa = parcel.readInt() == 1 ? CalendarMode.WEEKS : CalendarMode.MONTHS;
            this.dZY = (b) parcel.readParcelable(classLoader);
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.eay = z;
        }
    }

    public class c {
        private final b dZm;
        private final b dZn;
        private final CalendarMode eaa;
        private final boolean eay;
        private final int firstDayOfWeek;

        /* synthetic */ c(MaterialCalendarView materialCalendarView, d dVar, AnonymousClass1 anonymousClass1) {
            this(dVar);
        }

        private c(d dVar) {
            this.eaa = dVar.eaa;
            this.firstDayOfWeek = dVar.firstDayOfWeek;
            this.dZm = dVar.dZm;
            this.dZn = dVar.dZn;
            this.eay = dVar.eay;
        }

        public d aWE() {
            return new d(MaterialCalendarView.this, this, null);
        }
    }

    public class d {
        private b dZm;
        private b dZn;
        private CalendarMode eaa;
        private boolean eay;
        private int firstDayOfWeek;

        /* synthetic */ d(MaterialCalendarView materialCalendarView, c cVar, AnonymousClass1 anonymousClass1) {
            this(cVar);
        }

        public d() {
            this.eaa = CalendarMode.MONTHS;
            this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            this.eay = false;
            this.dZm = null;
            this.dZn = null;
        }

        private d(c cVar) {
            this.eaa = CalendarMode.MONTHS;
            this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            this.eay = false;
            this.dZm = null;
            this.dZn = null;
            this.eaa = cVar.eaa;
            this.firstDayOfWeek = cVar.firstDayOfWeek;
            this.dZm = cVar.dZm;
            this.dZn = cVar.dZn;
            this.eay = cVar.eay;
        }

        public d ho(int i) {
            this.firstDayOfWeek = i;
            return this;
        }

        public d a(CalendarMode calendarMode) {
            this.eaa = calendarMode;
            return this;
        }

        public d j(@Nullable b bVar) {
            this.dZm = bVar;
            return this;
        }

        public d k(@Nullable b bVar) {
            this.dZn = bVar;
            return this;
        }

        public d fl(boolean z) {
            this.eay = z;
            return this;
        }

        public void commit() {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.a(new c(materialCalendarView, this, null));
        }
    }

    public static boolean hk(int i) {
        return (i & 1) != 0;
    }

    public static boolean hl(int i) {
        return (i & 2) != 0;
    }

    public static boolean hm(int i) {
        return (i & 4) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public MaterialCalendarView(Context context) {
        this(context, null);
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.eac = new ArrayList();
        this.ead = new OnClickListener() {
            public void onClick(View view) {
                if (view == MaterialCalendarView.this.dZV) {
                    MaterialCalendarView.this.dZW.setCurrentItem(MaterialCalendarView.this.dZW.getCurrentItem() + 1, true);
                } else if (view == MaterialCalendarView.this.dZU) {
                    MaterialCalendarView.this.dZW.setCurrentItem(MaterialCalendarView.this.dZW.getCurrentItem() - 1, true);
                }
            }
        };
        this.eae = new OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                MaterialCalendarView.this.dZT.m(MaterialCalendarView.this.dZY);
                MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
                materialCalendarView.dZY = materialCalendarView.dZX.hi(i);
                MaterialCalendarView.this.aWr();
                MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
                materialCalendarView2.h(materialCalendarView2.dZY);
            }
        };
        this.dZm = null;
        this.dZn = null;
        this.eaj = 0;
        this.eak = ViewCompat.MEASURED_STATE_MASK;
        this.ean = -10;
        this.eao = -10;
        this.eap = 1;
        this.eaq = true;
        if (VERSION.SDK_INT >= 19) {
            setClipToPadding(false);
            setClipChildren(false);
        } else {
            setClipChildren(true);
            setClipToPadding(true);
        }
        this.dZU = new l(getContext());
        this.dZU.setContentDescription("Previous");
        this.alH = new TextView(getContext());
        this.dZV = new l(getContext());
        this.dZV.setContentDescription("Next");
        this.dZW = new c(getContext());
        this.dZU.setOnClickListener(this.ead);
        this.dZV.setOnClickListener(this.ead);
        this.dZT = new r(this.alH);
        this.dZT.setTitleFormatter(dZS);
        this.dZW.setOnPageChangeListener(this.eae);
        this.dZW.setPageTransformer(false, new PageTransformer() {
            public void transformPage(View view, float f) {
                view.setAlpha((float) Math.sqrt((double) (1.0f - Math.abs(f))));
            }
        });
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.MaterialCalendarView, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(h.MaterialCalendarView_mcv_calendarMode, 0);
            this.firstDayOfWeek = obtainStyledAttributes.getInteger(h.MaterialCalendarView_mcv_firstDayOfWeek, -1);
            this.dZT.setOrientation(obtainStyledAttributes.getInteger(h.MaterialCalendarView_mcv_titleAnimationOrientation, 0));
            if (this.firstDayOfWeek < 0) {
                this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            }
            aWD().ho(this.firstDayOfWeek).a(CalendarMode.values()[integer]).commit();
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(h.MaterialCalendarView_mcv_tileSize, -10);
            if (layoutDimension > -10) {
                setTileSize(layoutDimension);
            }
            layoutDimension = obtainStyledAttributes.getLayoutDimension(h.MaterialCalendarView_mcv_tileWidth, -10);
            if (layoutDimension > -10) {
                setTileWidth(layoutDimension);
            }
            layoutDimension = obtainStyledAttributes.getLayoutDimension(h.MaterialCalendarView_mcv_tileHeight, -10);
            if (layoutDimension > -10) {
                setTileHeight(layoutDimension);
            }
            setArrowColor(obtainStyledAttributes.getColor(h.MaterialCalendarView_mcv_arrowColor, ViewCompat.MEASURED_STATE_MASK));
            Drawable drawable = obtainStyledAttributes.getDrawable(h.MaterialCalendarView_mcv_leftArrowMask);
            if (drawable == null) {
                drawable = getResources().getDrawable(com.iqoption.tradinghistory.g.c.ic_arrow_calendar_left);
            }
            setLeftArrowMask(drawable);
            drawable = obtainStyledAttributes.getDrawable(h.MaterialCalendarView_mcv_rightArrowMask);
            if (drawable == null) {
                drawable = getResources().getDrawable(com.iqoption.tradinghistory.g.c.ic_arrow_calendar_right);
            }
            setRightArrowMask(drawable);
            setSelectionColor(obtainStyledAttributes.getColor(h.MaterialCalendarView_mcv_selectionColor, ContextCompat.getColor(context, com.iqoption.tradinghistory.g.a.grey_blur_50)));
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(h.MaterialCalendarView_mcv_weekDayLabels);
            if (textArray != null) {
                setWeekDayFormatter(new com.iqoption.tradinghistory.materialcalendar.a.a(textArray));
            }
            textArray = obtainStyledAttributes.getTextArray(h.MaterialCalendarView_mcv_monthLabels);
            if (textArray != null) {
                setTitleFormatter(new f(textArray));
            }
            setHeaderTextAppearance(obtainStyledAttributes.getResourceId(h.MaterialCalendarView_mcv_headerTextAppearance, com.iqoption.tradinghistory.g.g.TextAppearance_MaterialCalendarWidget_Header));
            setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(h.MaterialCalendarView_mcv_weekDayTextAppearance, com.iqoption.tradinghistory.g.g.TextAppearance_MaterialCalendarWidget_WeekDay));
            setDateTextAppearance(obtainStyledAttributes.getResourceId(h.MaterialCalendarView_mcv_dateTextAppearance, com.iqoption.tradinghistory.g.g.TextAppearance_MaterialCalendarWidget_Date));
            setShowOtherDates(obtainStyledAttributes.getInteger(h.MaterialCalendarView_mcv_showOtherDates, 4));
            setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(h.MaterialCalendarView_mcv_allowClickDaysOutsideCurrentMonth, true));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
        obtainStyledAttributes.recycle();
        this.dZX.setTitleFormatter(dZS);
        aWx();
        this.dZY = b.aWk();
        setCurrentDate(this.dZY);
        if (isInEditMode()) {
            removeView(this.dZW);
            n nVar = new n(this, this.dZY, getFirstDayOfWeek());
            nVar.setSelectionColor(getSelectionColor());
            nVar.setDateTextAppearance(this.dZX.getDateTextAppearance());
            nVar.setWeekDayTextAppearance(this.dZX.getWeekDayTextAppearance());
            nVar.setShowOtherDates(getShowOtherDates());
            addView(nVar, new a(this.eaa.visibleWeeksCount + 1));
        }
    }

    private void aWx() {
        this.dZZ = new LinearLayout(getContext());
        this.dZZ.setOrientation(0);
        this.dZZ.setClipChildren(false);
        this.dZZ.setClipToPadding(false);
        addView(this.dZZ, new a(1));
        this.dZU.setScaleType(ScaleType.CENTER_INSIDE);
        this.dZZ.addView(this.dZU, new LayoutParams(0, -1, 1.0f));
        this.alH.setGravity(17);
        this.dZZ.addView(this.alH, new LayoutParams(0, -1, 5.0f));
        this.dZV.setScaleType(ScaleType.CENTER_INSIDE);
        this.dZZ.addView(this.dZV, new LayoutParams(0, -1, 1.0f));
        this.dZW.setId(com.iqoption.tradinghistory.g.d.mcv_pager);
        this.dZW.setOffscreenPageLimit(1);
        addView(this.dZW, new a(this.eaa.visibleWeeksCount + 1));
    }

    private void aWr() {
        this.dZT.l(this.dZY);
        this.dZU.setEnabled(canGoBack());
        this.dZV.setEnabled(canGoForward());
    }

    public void setSelectionMode(int i) {
        int i2 = this.eap;
        this.eap = i;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.eap = 0;
                    if (i2 != 0) {
                        clearSelection();
                    }
                } else {
                    clearSelection();
                }
            }
        } else if ((i2 == 2 || i2 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        d dVar = this.dZX;
        if (this.eap != 0) {
            z = true;
        }
        dVar.setSelectionEnabled(z);
    }

    public void aWy() {
        if (canGoBack()) {
            c cVar = this.dZW;
            cVar.setCurrentItem(cVar.getCurrentItem() - 1, true);
        }
    }

    public void aWz() {
        if (canGoForward()) {
            c cVar = this.dZW;
            cVar.setCurrentItem(cVar.getCurrentItem() + 1, true);
        }
    }

    public int getSelectionMode() {
        return this.eap;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.ean, this.eao);
    }

    public void setTileSize(int i) {
        this.eao = i;
        this.ean = i;
        requestLayout();
    }

    public void setTileSizeDp(int i) {
        setTileSize(aZ(i));
    }

    public int getTileHeight() {
        return this.ean;
    }

    public void setTileHeight(int i) {
        this.ean = i;
        requestLayout();
    }

    public void setTileHeightDp(int i) {
        setTileHeight(aZ(i));
    }

    public int getTileWidth() {
        return this.eao;
    }

    public void setTileWidth(int i) {
        this.eao = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(aZ(i));
    }

    private int aZ(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    public boolean canGoForward() {
        return this.dZW.getCurrentItem() < this.dZX.getCount() - 1;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.dZW.dispatchTouchEvent(motionEvent);
    }

    public boolean canGoBack() {
        return this.dZW.getCurrentItem() > 0;
    }

    public int getSelectionColor() {
        return this.eaj;
    }

    public void setSelectionColor(int i) {
        if (i == 0) {
            if (isInEditMode()) {
                i = -7829368;
            } else {
                return;
            }
        }
        this.eaj = i;
        this.dZX.setSelectionColor(i);
        invalidate();
    }

    public int getArrowColor() {
        return this.eak;
    }

    public void setArrowColor(int i) {
        if (i != 0) {
            this.eak = i;
            this.dZU.setColor(i);
            this.dZV.setColor(i);
            invalidate();
        }
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.dZU.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.dZV.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.eai = charSequence;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.eai;
        return charSequence != null ? charSequence : "Calendar";
    }

    public Drawable getLeftArrowMask() {
        return this.eal;
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.eal = drawable;
        this.dZU.setImageDrawable(drawable);
    }

    public Drawable getRightArrowMask() {
        return this.eam;
    }

    public void setRightArrowMask(Drawable drawable) {
        this.eam = drawable;
        this.dZV.setImageDrawable(drawable);
    }

    public void setHeaderTextAppearance(int i) {
        this.alH.setTextAppearance(getContext(), i);
    }

    public void setDateTextAppearance(int i) {
        this.dZX.setDateTextAppearance(i);
    }

    public void setWeekDayTextAppearance(int i) {
        this.dZX.setWeekDayTextAppearance(i);
    }

    public b getSelectedDate() {
        List selectedDates = this.dZX.getSelectedDates();
        if (selectedDates.isEmpty()) {
            return null;
        }
        return (b) selectedDates.get(selectedDates.size() - 1);
    }

    @NonNull
    public List<b> getSelectedDates() {
        return this.dZX.getSelectedDates();
    }

    public void clearSelection() {
        List<b> selectedDates = getSelectedDates();
        this.dZX.aWn();
        for (b c : selectedDates) {
            c(c, false);
        }
    }

    public void setSelectedDate(@Nullable Calendar calendar) {
        setSelectedDate(b.b(calendar));
    }

    public void setSelectedDate(@Nullable Date date) {
        setSelectedDate(b.b(date));
    }

    public void setSelectedDate(@Nullable b bVar) {
        clearSelection();
        if (bVar != null) {
            a(bVar, true);
        }
    }

    public void a(@Nullable b bVar, boolean z) {
        if (bVar != null) {
            this.dZX.a(bVar, z);
        }
    }

    public void setCurrentDate(@Nullable Calendar calendar) {
        setCurrentDate(b.b(calendar));
    }

    public void setCurrentDate(@Nullable Date date) {
        setCurrentDate(b.b(date));
    }

    public b getCurrentDate() {
        return this.dZX.hi(this.dZW.getCurrentItem());
    }

    public void setCurrentDate(@Nullable b bVar) {
        b(bVar, true);
    }

    public void b(@Nullable b bVar, boolean z) {
        if (bVar != null) {
            this.dZW.setCurrentItem(this.dZX.c(bVar), z);
            aWr();
        }
    }

    public b getMinimumDate() {
        return this.dZm;
    }

    public b getMaximumDate() {
        return this.dZn;
    }

    public void setShowOtherDates(int i) {
        this.dZX.setShowOtherDates(i);
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.eaq = z;
    }

    public void setWeekDayFormatter(com.iqoption.tradinghistory.materialcalendar.a.h hVar) {
        d dVar = this.dZX;
        if (hVar == null) {
            hVar = com.iqoption.tradinghistory.materialcalendar.a.h.eaO;
        }
        dVar.setWeekDayFormatter(hVar);
    }

    public void setDayFormatter(e eVar) {
        d dVar = this.dZX;
        if (eVar == null) {
            eVar = e.eaM;
        }
        dVar.setDayFormatter(eVar);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new com.iqoption.tradinghistory.materialcalendar.a.a(charSequenceArr));
    }

    public void setWeekDayLabels(@ArrayRes int i) {
        setWeekDayLabels(getResources().getTextArray(i));
    }

    public int getShowOtherDates() {
        return this.dZX.getShowOtherDates();
    }

    public boolean aWA() {
        return this.eaq;
    }

    public void setTitleFormatter(g gVar) {
        if (gVar == null) {
            gVar = dZS;
        }
        this.dZT.setTitleFormatter(gVar);
        this.dZX.setTitleFormatter(gVar);
        aWr();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new f(charSequenceArr));
    }

    public void setTitleMonths(@ArrayRes int i) {
        setTitleMonths(getResources().getTextArray(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.dZT.setOrientation(i);
    }

    public int getTitleAnimationOrientation() {
        return this.dZT.getOrientation();
    }

    public void setTopbarVisible(boolean z) {
        this.dZZ.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public boolean getTopbarVisible() {
        return this.dZZ.getVisibility() == 0;
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.color = getSelectionColor();
        bVar.dateTextAppearance = this.dZX.getDateTextAppearance();
        bVar.weekDayTextAppearance = this.dZX.getWeekDayTextAppearance();
        bVar.dZl = getShowOtherDates();
        bVar.eaq = aWA();
        bVar.dZm = getMinimumDate();
        bVar.dZn = getMaximumDate();
        bVar.dZp = getSelectedDates();
        bVar.firstDayOfWeek = getFirstDayOfWeek();
        bVar.orientation = getTitleAnimationOrientation();
        bVar.eap = getSelectionMode();
        bVar.eau = getTileWidth();
        bVar.eav = getTileHeight();
        bVar.eaw = getTopbarVisible();
        bVar.eaa = this.eaa;
        bVar.eax = this.eab;
        bVar.dZY = this.dZY;
        bVar.eay = this.ear.eay;
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        aWD().ho(bVar.firstDayOfWeek).a(bVar.eaa).j(bVar.dZm).k(bVar.dZn).fl(bVar.eay).commit();
        setSelectionColor(bVar.color);
        setDateTextAppearance(bVar.dateTextAppearance);
        setWeekDayTextAppearance(bVar.weekDayTextAppearance);
        setShowOtherDates(bVar.dZl);
        setAllowClickDaysOutsideCurrentMonth(bVar.eaq);
        setCurrentDate(bVar.dZY);
        setSelectionMode(bVar.eap);
        clearSelection();
        for (b a : bVar.dZp) {
            a(a, true);
        }
        setTitleAnimationOrientation(bVar.orientation);
        setTopbarVisible(bVar.eaw);
        setDynamicHeightEnabled(bVar.eax);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchSaveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void c(b bVar, b bVar2) {
        b bVar3 = this.dZY;
        this.dZX.c(bVar, bVar2);
        this.dZY = bVar3;
        if (bVar != null) {
            if (!bVar.b(this.dZY)) {
                bVar = this.dZY;
            }
            this.dZY = bVar;
        }
        this.dZW.setCurrentItem(this.dZX.c(bVar3), false);
        aWr();
    }

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.eab = z;
    }

    public void aWl() {
        this.dZX.aWl();
    }

    public void setOnDateChangedListener(o oVar) {
        this.eaf = oVar;
    }

    public void setOnMonthChangedListener(p pVar) {
        this.eag = pVar;
    }

    public void setOnRangeSelectedListener(q qVar) {
        this.eah = qVar;
    }

    public void setOnTitleClickListener(OnClickListener onClickListener) {
        this.alH.setOnClickListener(onClickListener);
    }

    /* Access modifiers changed, original: protected */
    public void c(b bVar, boolean z) {
        o oVar = this.eaf;
        if (oVar != null) {
            oVar.a(this, bVar, z);
        }
    }

    /* Access modifiers changed, original: protected */
    public void d(b bVar, b bVar2) {
        q qVar = this.eah;
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTime(bVar.getDate());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(bVar2.getDate());
        while (true) {
            if (!instance.before(instance2) && !instance.equals(instance2)) {
                break;
            }
            bVar2 = b.b(instance);
            this.dZX.a(bVar2, true);
            arrayList.add(bVar2);
            instance.add(5, 1);
        }
        if (qVar != null) {
            qVar.a(this, arrayList);
        }
    }

    /* Access modifiers changed, original: protected */
    public void h(b bVar) {
        p pVar = this.eag;
        if (pVar != null) {
            pVar.b(this, bVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public void d(@NonNull b bVar, boolean z) {
        int i = this.eap;
        if (i == 2) {
            this.dZX.a(bVar, z);
            c(bVar, z);
        } else if (i != 3) {
            this.dZX.aWn();
            this.dZX.a(bVar, true);
            c(bVar, true);
        } else {
            this.dZX.a(bVar, z);
            if (this.dZX.getSelectedDates().size() > 2) {
                this.dZX.aWn();
                this.dZX.a(bVar, z);
                c(bVar, z);
            } else if (this.dZX.getSelectedDates().size() == 2) {
                List selectedDates = this.dZX.getSelectedDates();
                if (((b) selectedDates.get(0)).b((b) selectedDates.get(1))) {
                    d((b) selectedDates.get(1), (b) selectedDates.get(0));
                } else {
                    d((b) selectedDates.get(0), (b) selectedDates.get(1));
                }
            } else {
                this.dZX.a(bVar, z);
                c(bVar, z);
            }
        }
    }

    public void e(b bVar, b bVar2) {
        clearSelection();
        if (bVar != null && bVar2 != null) {
            if (bVar.b(bVar2)) {
                d(bVar2, bVar);
            } else {
                d(bVar, bVar2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(h hVar) {
        b currentDate = getCurrentDate();
        b aWt = hVar.aWt();
        int month = currentDate.getMonth();
        int month2 = aWt.getMonth();
        if (this.eaa == CalendarMode.MONTHS && this.eaq && month != month2) {
            if (currentDate.b(aWt)) {
                aWy();
            } else if (currentDate.a(aWt)) {
                aWz();
            }
        }
        d(hVar.aWt(), hVar.isChecked() ^ 1);
    }

    /* Access modifiers changed, original: protected */
    public void i(b bVar) {
        c(bVar, false);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: aWB */
    public a generateDefaultLayoutParams() {
        return new a(1);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        size = (size - getPaddingLeft()) - getPaddingRight();
        size2 = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        size /= 7;
        size2 /= weekCountBasedOnMode;
        int i3 = -1;
        if (this.eao == -10 && this.ean == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    size = Math.min(size, size2);
                }
                i3 = size;
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                i3 = size2;
            }
            size = -1;
            mode = -1;
        } else {
            mode = this.eao;
            if (mode > 0) {
                size = mode;
            }
            mode = this.ean;
            if (mode <= 0) {
                mode = size2;
            }
        }
        if (i3 > 0) {
            mode = i3;
        } else if (i3 <= 0) {
            if (size <= 0) {
                size = aZ(44);
            }
            i3 = size;
            if (mode <= 0) {
                mode = aZ(44);
            }
        } else {
            i3 = size;
        }
        size = i3 * 7;
        setMeasuredDimension(aE((getPaddingLeft() + getPaddingRight()) + size, i), aE((weekCountBasedOnMode * mode) + (getPaddingTop() + getPaddingBottom()), i2));
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            if (i3 > 0 && mode > 0) {
                childAt.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(aVar.height * mode, 1073741824));
            }
        }
    }

    private int getWeekCountBasedOnMode() {
        int i = this.eaa.visibleWeeksCount;
        if (this.eaa.equals(CalendarMode.MONTHS) && this.eab) {
            d dVar = this.dZX;
            if (dVar != null) {
                c cVar = this.dZW;
                if (cVar != null) {
                    Calendar calendar = (Calendar) dVar.hi(cVar.getCurrentItem()).getCalendar().clone();
                    calendar.set(5, calendar.getActualMaximum(5));
                    calendar.setFirstDayOfWeek(getFirstDayOfWeek());
                    i = calendar.get(4);
                }
            }
        }
        return i + 1;
    }

    private static int aE(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : i2;
        } else {
            return Math.min(i, i2);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i2 = getPaddingLeft();
        i3 = ((i3 - i) - i2) - getPaddingRight();
        i = getPaddingTop();
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i5 = ((i3 - measuredWidth) / 2) + i2;
                int measuredHeight = childAt.getMeasuredHeight() + i;
                childAt.layout(i5, i, measuredWidth + i5, measuredHeight);
                i = measuredHeight;
            }
        }
    }

    /* renamed from: f */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(1);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* Access modifiers changed, original: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(1);
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    public void setPagingEnabled(boolean z) {
        this.dZW.setPagingEnabled(z);
        aWr();
    }

    public c aWC() {
        return this.ear;
    }

    public d aWD() {
        return new d();
    }

    /* JADX WARNING: Missing block: B:14:0x0047, code skipped:
            if (r3.a(r4) == false) goto L_0x007c;
     */
    private void a(com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView.c r8) {
        /*
        r7 = this;
        r0 = r7.dZX;
        r1 = 2;
        r2 = 1;
        if (r0 == 0) goto L_0x007b;
    L_0x0006:
        r0 = r8.eay;
        if (r0 == 0) goto L_0x007b;
    L_0x000c:
        r0 = r7.dZX;
        r3 = r7.dZW;
        r3 = r3.getCurrentItem();
        r0 = r0.hi(r3);
        r3 = r7.eaa;
        r4 = r8.eaa;
        if (r3 == r4) goto L_0x007c;
    L_0x0020:
        r3 = r7.getSelectedDate();
        r4 = r7.eaa;
        r5 = com.iqoption.tradinghistory.materialcalendar.CalendarMode.MONTHS;
        if (r4 != r5) goto L_0x004a;
    L_0x002a:
        if (r3 == 0) goto L_0x004a;
    L_0x002c:
        r4 = r0.getCalendar();
        r4.add(r1, r2);
        r4 = com.iqoption.tradinghistory.materialcalendar.b.b(r4);
        r5 = r3.equals(r0);
        if (r5 != 0) goto L_0x0077;
    L_0x003d:
        r5 = r3.b(r0);
        if (r5 == 0) goto L_0x007c;
    L_0x0043:
        r4 = r3.a(r4);
        if (r4 == 0) goto L_0x007c;
    L_0x0049:
        goto L_0x0077;
    L_0x004a:
        r4 = r7.eaa;
        r5 = com.iqoption.tradinghistory.materialcalendar.CalendarMode.WEEKS;
        if (r4 != r5) goto L_0x007c;
    L_0x0050:
        r4 = r0.getCalendar();
        r5 = 7;
        r6 = 6;
        r4.add(r5, r6);
        r4 = com.iqoption.tradinghistory.materialcalendar.b.b(r4);
        if (r3 == 0) goto L_0x0079;
    L_0x005f:
        r5 = r3.equals(r0);
        if (r5 != 0) goto L_0x0077;
    L_0x0065:
        r5 = r3.equals(r4);
        if (r5 != 0) goto L_0x0077;
    L_0x006b:
        r0 = r3.b(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0071:
        r0 = r3.a(r4);
        if (r0 == 0) goto L_0x0079;
    L_0x0077:
        r0 = r3;
        goto L_0x007c;
    L_0x0079:
        r0 = r4;
        goto L_0x007c;
    L_0x007b:
        r0 = 0;
    L_0x007c:
        r7.ear = r8;
        r3 = r8.eaa;
        r7.eaa = r3;
        r3 = r8.firstDayOfWeek;
        r7.firstDayOfWeek = r3;
        r3 = r8.dZm;
        r7.dZm = r3;
        r8 = r8.dZn;
        r7.dZn = r8;
        r8 = com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView.AnonymousClass4.eat;
        r3 = r7.eaa;
        r3 = r3.ordinal();
        r8 = r8[r3];
        if (r8 == r2) goto L_0x00b2;
    L_0x00a2:
        if (r8 != r1) goto L_0x00aa;
    L_0x00a4:
        r8 = new com.iqoption.tradinghistory.materialcalendar.t;
        r8.<init>(r7);
        goto L_0x00b7;
    L_0x00aa:
        r8 = new java.lang.IllegalArgumentException;
        r0 = "Provided display mode which is not yet implemented";
        r8.<init>(r0);
        throw r8;
    L_0x00b2:
        r8 = new com.iqoption.tradinghistory.materialcalendar.m;
        r8.<init>(r7);
    L_0x00b7:
        r1 = r7.dZX;
        if (r1 != 0) goto L_0x00be;
    L_0x00bb:
        r7.dZX = r8;
        goto L_0x00c4;
    L_0x00be:
        r8 = r1.a(r8);
        r7.dZX = r8;
    L_0x00c4:
        r8 = r7.dZW;
        r1 = r7.dZX;
        r8.setAdapter(r1);
        r8 = r7.dZm;
        r1 = r7.dZn;
        r7.c(r8, r1);
        r8 = r7.dZW;
        r1 = new com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView$a;
        r3 = r7.eaa;
        r3 = r3.visibleWeeksCount;
        r3 = r3 + r2;
        r1.<init>(r3);
        r8.setLayoutParams(r1);
        r8 = r7.eap;
        if (r8 != r2) goto L_0x00ff;
    L_0x00e5:
        r8 = r7.dZX;
        r8 = r8.getSelectedDates();
        r8 = r8.isEmpty();
        if (r8 != 0) goto L_0x00ff;
    L_0x00f1:
        r8 = r7.dZX;
        r8 = r8.getSelectedDates();
        r1 = 0;
        r8 = r8.get(r1);
        r8 = (com.iqoption.tradinghistory.materialcalendar.b) r8;
        goto L_0x0103;
    L_0x00ff:
        r8 = com.iqoption.tradinghistory.materialcalendar.b.aWk();
    L_0x0103:
        r7.setCurrentDate(r8);
        if (r0 == 0) goto L_0x0113;
    L_0x0108:
        r8 = r7.dZW;
        r1 = r7.dZX;
        r0 = r1.c(r0);
        r8.setCurrentItem(r0);
    L_0x0113:
        r7.aWl();
        r7.aWr();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView.a(com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView$c):void");
    }
}
