package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() {
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = new int[]{16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
    private int mActivePointerId = -1;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems = new ArrayList();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit = 1;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem = new ItemInfo();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @Px int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f);
    }

    private class PagerObserver extends DataSetObserver {
        PagerObserver() {
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.isDecor == layoutParams2.isDecor) {
                return layoutParams.position - layoutParams2.position;
            }
            return layoutParams.isDecor ? 1 : -1;
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager;
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
        }

        private boolean canScroll() {
            return ViewPager.this.mAdapter != null && ViewPager.this.mAdapter.getCount() > 1;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.position);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        initViewPager();
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* Access modifiers changed, original: 0000 */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            private final Rect mTempRect = new Rect();

            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (!(scroller == null || scroller.isFinished())) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: 0000 */
    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        int i = 0;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                ItemInfo itemInfo = (ItemInfo) this.mItems.get(i2);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        pagerAdapter2 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            while (i < size) {
                ((OnAdapterChangeListener) this.mAdapterChangeListeners.get(i)).onAdapterChanged(this, pagerAdapter2, pagerAdapter);
                i++;
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, this.mFirstLayout ^ 1, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    /* Access modifiers changed, original: 0000 */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            z2 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (i3 = 0; i3 < this.mItems.size(); i3++) {
                    ((ItemInfo) this.mItems.get(i3)).scrolling = true;
                }
            }
            if (this.mCurItem == i) {
                z2 = false;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z2) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
            } else {
                populate(i);
                scrollToItem(i, z, i2, z2);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        ItemInfo infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    public void clearOnPageChangeListeners() {
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer, int i) {
        int i2 = 1;
        boolean z2 = pageTransformer != null;
        Object obj = z2 != (this.mPageTransformer != null) ? 1 : null;
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (obj != null) {
            populate();
        }
    }

    /* Access modifiers changed, original: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).childIndex;
    }

    /* Access modifiers changed, original: 0000 */
    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to ");
            stringBuilder.append(1);
            Log.w(TAG, stringBuilder.toString());
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* Access modifiers changed, original: 0000 */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void smoothScrollTo(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int currX;
        Scroller scroller = this.mScroller;
        Object obj = (scroller == null || scroller.isFinished()) ? null : 1;
        if (obj != null) {
            currX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            currX = getScrollX();
        }
        int i4 = currX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i = getClientWidth();
        i2 = i / 2;
        float f = (float) i;
        float f2 = (float) i2;
        f2 += distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f)) * f2;
        i3 = Math.abs(i3);
        if (i3 > 0) {
            i = Math.round(Math.abs(f2 / ((float) i3)) * 1000.0f) * 4;
        } else {
            i = (int) (((((float) Math.abs(i5)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* Access modifiers changed, original: 0000 */
    public ItemInfo addNewItem(int i, int i2) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i2, itemInfo);
        }
        return itemInfo;
    }

    /* Access modifiers changed, original: 0000 */
    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        Object obj = (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) ? null : 1;
        Object obj2 = obj;
        int i = this.mCurItem;
        int i2 = 0;
        Object obj3 = null;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (obj3 == null) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        obj3 = 1;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    if (this.mCurItem == itemInfo.position) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (itemInfo.position != itemPosition) {
                    if (itemInfo.position == this.mCurItem) {
                        i = itemPosition;
                    }
                    itemInfo.position = itemPosition;
                }
                obj2 = 1;
            }
            i2++;
        }
        if (obj3 != null) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (obj2 != null) {
            count = getChildCount();
            for (i2 = 0; i2 < count; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void populate() {
        populate(this.mCurItem);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:23:0x0064, code skipped:
            if (r8.position == r0.mCurItem) goto L_0x006b;
     */
    public void populate(int r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.mCurItem;
        if (r2 == r1) goto L_0x000f;
    L_0x0008:
        r2 = r0.infoForPosition(r2);
        r0.mCurItem = r1;
        goto L_0x0010;
    L_0x000f:
        r2 = 0;
    L_0x0010:
        r1 = r0.mAdapter;
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r17.sortChildDrawingOrder();
        return;
    L_0x0018:
        r1 = r0.mPopulatePending;
        if (r1 == 0) goto L_0x0020;
    L_0x001c:
        r17.sortChildDrawingOrder();
        return;
    L_0x0020:
        r1 = r17.getWindowToken();
        if (r1 != 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        r1 = r0.mAdapter;
        r1.startUpdate(r0);
        r1 = r0.mOffscreenPageLimit;
        r4 = r0.mCurItem;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.mAdapter;
        r6 = r6.getCount();
        r7 = r6 + -1;
        r8 = r0.mCurItem;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.mExpectedAdapterCount;
        if (r6 != r7) goto L_0x0215;
    L_0x0049:
        r7 = 0;
    L_0x004a:
        r8 = r0.mItems;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x006a;
    L_0x0052:
        r8 = r0.mItems;
        r8 = r8.get(r7);
        r8 = (androidx.viewpager.widget.ViewPager.ItemInfo) r8;
        r9 = r8.position;
        r10 = r0.mCurItem;
        if (r9 < r10) goto L_0x0067;
    L_0x0060:
        r9 = r8.position;
        r10 = r0.mCurItem;
        if (r9 != r10) goto L_0x006a;
    L_0x0066:
        goto L_0x006b;
    L_0x0067:
        r7 = r7 + 1;
        goto L_0x004a;
    L_0x006a:
        r8 = 0;
    L_0x006b:
        if (r8 != 0) goto L_0x0075;
    L_0x006d:
        if (r6 <= 0) goto L_0x0075;
    L_0x006f:
        r8 = r0.mCurItem;
        r8 = r0.addNewItem(r8, r7);
    L_0x0075:
        r9 = 0;
        if (r8 == 0) goto L_0x01a2;
    L_0x0078:
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x0085;
    L_0x007c:
        r11 = r0.mItems;
        r11 = r11.get(r10);
        r11 = (androidx.viewpager.widget.ViewPager.ItemInfo) r11;
        goto L_0x0086;
    L_0x0085:
        r11 = 0;
    L_0x0086:
        r12 = r17.getClientWidth();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 > 0) goto L_0x0090;
    L_0x008e:
        r3 = 0;
        goto L_0x009d;
    L_0x0090:
        r14 = r8.widthFactor;
        r14 = r13 - r14;
        r15 = r17.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
    L_0x009d:
        r14 = r0.mCurItem;
        r14 = r14 + -1;
        r15 = r10;
        r10 = r7;
        r7 = 0;
    L_0x00a4:
        if (r14 < 0) goto L_0x0104;
    L_0x00a6:
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x00d2;
    L_0x00aa:
        if (r14 >= r4) goto L_0x00d2;
    L_0x00ac:
        if (r11 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x0104;
    L_0x00af:
        r5 = r11.position;
        if (r14 != r5) goto L_0x0100;
    L_0x00b3:
        r5 = r11.scrolling;
        if (r5 != 0) goto L_0x0100;
    L_0x00b7:
        r5 = r0.mItems;
        r5.remove(r15);
        r5 = r0.mAdapter;
        r11 = r11.object;
        r5.destroyItem(r0, r14, r11);
        r15 = r15 + -1;
        r10 = r10 + -1;
        if (r15 < 0) goto L_0x00fe;
    L_0x00c9:
        r5 = r0.mItems;
        r5 = r5.get(r15);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x00ff;
    L_0x00d2:
        if (r11 == 0) goto L_0x00e8;
    L_0x00d4:
        r5 = r11.position;
        if (r14 != r5) goto L_0x00e8;
    L_0x00d8:
        r5 = r11.widthFactor;
        r7 = r7 + r5;
        r15 = r15 + -1;
        if (r15 < 0) goto L_0x00fe;
    L_0x00df:
        r5 = r0.mItems;
        r5 = r5.get(r15);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x00ff;
    L_0x00e8:
        r5 = r15 + 1;
        r5 = r0.addNewItem(r14, r5);
        r5 = r5.widthFactor;
        r7 = r7 + r5;
        r10 = r10 + 1;
        if (r15 < 0) goto L_0x00fe;
    L_0x00f5:
        r5 = r0.mItems;
        r5 = r5.get(r15);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x00ff;
    L_0x00fe:
        r5 = 0;
    L_0x00ff:
        r11 = r5;
    L_0x0100:
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00a4;
    L_0x0104:
        r3 = r8.widthFactor;
        r4 = r10 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x0196;
    L_0x010c:
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x011d;
    L_0x0114:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x011e;
    L_0x011d:
        r5 = 0;
    L_0x011e:
        if (r12 > 0) goto L_0x0122;
    L_0x0120:
        r7 = 0;
        goto L_0x012a;
    L_0x0122:
        r7 = r17.getPaddingRight();
        r7 = (float) r7;
        r11 = (float) r12;
        r7 = r7 / r11;
        r7 = r7 + r13;
    L_0x012a:
        r11 = r0.mCurItem;
    L_0x012c:
        r11 = r11 + 1;
        if (r11 >= r6) goto L_0x0196;
    L_0x0130:
        r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r12 < 0) goto L_0x0160;
    L_0x0134:
        if (r11 <= r1) goto L_0x0160;
    L_0x0136:
        if (r5 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x0196;
    L_0x0139:
        r12 = r5.position;
        if (r11 != r12) goto L_0x0195;
    L_0x013d:
        r12 = r5.scrolling;
        if (r12 != 0) goto L_0x0195;
    L_0x0141:
        r12 = r0.mItems;
        r12.remove(r4);
        r12 = r0.mAdapter;
        r5 = r5.object;
        r12.destroyItem(r0, r11, r5);
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015e;
    L_0x0155:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x0195;
    L_0x015e:
        r5 = 0;
        goto L_0x0195;
    L_0x0160:
        if (r5 == 0) goto L_0x017c;
    L_0x0162:
        r12 = r5.position;
        if (r11 != r12) goto L_0x017c;
    L_0x0166:
        r5 = r5.widthFactor;
        r3 = r3 + r5;
        r4 = r4 + 1;
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015e;
    L_0x0173:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x0195;
    L_0x017c:
        r5 = r0.addNewItem(r11, r4);
        r4 = r4 + 1;
        r5 = r5.widthFactor;
        r3 = r3 + r5;
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x015e;
    L_0x018d:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
    L_0x0195:
        goto L_0x012c;
    L_0x0196:
        r0.calculatePageOffsets(r8, r10, r2);
        r1 = r0.mAdapter;
        r2 = r0.mCurItem;
        r3 = r8.object;
        r1.setPrimaryItem(r0, r2, r3);
    L_0x01a2:
        r1 = r0.mAdapter;
        r1.finishUpdate(r0);
        r1 = r17.getChildCount();
        r2 = 0;
    L_0x01ac:
        if (r2 >= r1) goto L_0x01d5;
    L_0x01ae:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4;
        r4.childIndex = r2;
        r5 = r4.isDecor;
        if (r5 != 0) goto L_0x01d2;
    L_0x01be:
        r5 = r4.widthFactor;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x01d2;
    L_0x01c4:
        r3 = r0.infoForChild(r3);
        if (r3 == 0) goto L_0x01d2;
    L_0x01ca:
        r5 = r3.widthFactor;
        r4.widthFactor = r5;
        r3 = r3.position;
        r4.position = r3;
    L_0x01d2:
        r2 = r2 + 1;
        goto L_0x01ac;
    L_0x01d5:
        r17.sortChildDrawingOrder();
        r1 = r17.hasFocus();
        if (r1 == 0) goto L_0x0214;
    L_0x01de:
        r1 = r17.findFocus();
        if (r1 == 0) goto L_0x01e9;
    L_0x01e4:
        r3 = r0.infoForAnyChild(r1);
        goto L_0x01ea;
    L_0x01e9:
        r3 = 0;
    L_0x01ea:
        if (r3 == 0) goto L_0x01f2;
    L_0x01ec:
        r1 = r3.position;
        r2 = r0.mCurItem;
        if (r1 == r2) goto L_0x0214;
    L_0x01f2:
        r1 = 0;
    L_0x01f3:
        r2 = r17.getChildCount();
        if (r1 >= r2) goto L_0x0214;
    L_0x01f9:
        r2 = r0.getChildAt(r1);
        r3 = r0.infoForChild(r2);
        if (r3 == 0) goto L_0x0211;
    L_0x0203:
        r3 = r3.position;
        r4 = r0.mCurItem;
        if (r3 != r4) goto L_0x0211;
    L_0x0209:
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 == 0) goto L_0x0211;
    L_0x0210:
        goto L_0x0214;
    L_0x0211:
        r1 = r1 + 1;
        goto L_0x01f3;
    L_0x0214:
        return;
    L_0x0215:
        r1 = r17.getResources();	 Catch:{ NotFoundException -> 0x0222 }
        r2 = r17.getId();	 Catch:{ NotFoundException -> 0x0222 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0222 }
        goto L_0x022a;
    L_0x0222:
        r1 = r17.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x022a:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.append(r4);
        r4 = r0.mExpectedAdapterCount;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r17.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.mAdapter;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        goto L_0x026e;
    L_0x026d:
        throw r2;
    L_0x026e:
        goto L_0x026d;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056 A:{LOOP_END, LOOP:2: B:19:0x0052->B:21:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d A:{LOOP_END, LOOP:5: B:34:0x0099->B:36:0x009d} */
    private void calculatePageOffsets(androidx.viewpager.widget.ViewPager.ItemInfo r11, int r12, androidx.viewpager.widget.ViewPager.ItemInfo r13) {
        /*
        r10 = this;
        r0 = r10.mAdapter;
        r0 = r0.getCount();
        r1 = r10.getClientWidth();
        if (r1 <= 0) goto L_0x0012;
    L_0x000c:
        r2 = r10.mPageMargin;
        r2 = (float) r2;
        r1 = (float) r1;
        r2 = r2 / r1;
        goto L_0x0013;
    L_0x0012:
        r2 = 0;
    L_0x0013:
        r1 = 0;
        if (r13 == 0) goto L_0x00b1;
    L_0x0016:
        r3 = r13.position;
        r4 = r11.position;
        if (r3 >= r4) goto L_0x006a;
    L_0x001c:
        r4 = r13.offset;
        r13 = r13.widthFactor;
        r4 = r4 + r13;
        r4 = r4 + r2;
        r3 = r3 + 1;
        r13 = 0;
    L_0x0025:
        r5 = r11.position;
        if (r3 > r5) goto L_0x00b1;
    L_0x0029:
        r5 = r10.mItems;
        r5 = r5.size();
        if (r13 >= r5) goto L_0x00b1;
    L_0x0031:
        r5 = r10.mItems;
        r5 = r5.get(r13);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
    L_0x0039:
        r6 = r5.position;
        if (r3 <= r6) goto L_0x0052;
    L_0x003d:
        r6 = r10.mItems;
        r6 = r6.size();
        r6 = r6 + -1;
        if (r13 >= r6) goto L_0x0052;
    L_0x0047:
        r13 = r13 + 1;
        r5 = r10.mItems;
        r5 = r5.get(r13);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x0039;
    L_0x0052:
        r6 = r5.position;
        if (r3 >= r6) goto L_0x0061;
    L_0x0056:
        r6 = r10.mAdapter;
        r6 = r6.getPageWidth(r3);
        r6 = r6 + r2;
        r4 = r4 + r6;
        r3 = r3 + 1;
        goto L_0x0052;
    L_0x0061:
        r5.offset = r4;
        r5 = r5.widthFactor;
        r5 = r5 + r2;
        r4 = r4 + r5;
        r3 = r3 + 1;
        goto L_0x0025;
    L_0x006a:
        r4 = r11.position;
        if (r3 <= r4) goto L_0x00b1;
    L_0x006e:
        r4 = r10.mItems;
        r4 = r4.size();
        r4 = r4 + -1;
        r13 = r13.offset;
        r3 = r3 + -1;
    L_0x007a:
        r5 = r11.position;
        if (r3 < r5) goto L_0x00b1;
    L_0x007e:
        if (r4 < 0) goto L_0x00b1;
    L_0x0080:
        r5 = r10.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
    L_0x0088:
        r6 = r5.position;
        if (r3 >= r6) goto L_0x0099;
    L_0x008c:
        if (r4 <= 0) goto L_0x0099;
    L_0x008e:
        r4 = r4 + -1;
        r5 = r10.mItems;
        r5 = r5.get(r4);
        r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5;
        goto L_0x0088;
    L_0x0099:
        r6 = r5.position;
        if (r3 <= r6) goto L_0x00a8;
    L_0x009d:
        r6 = r10.mAdapter;
        r6 = r6.getPageWidth(r3);
        r6 = r6 + r2;
        r13 = r13 - r6;
        r3 = r3 + -1;
        goto L_0x0099;
    L_0x00a8:
        r6 = r5.widthFactor;
        r6 = r6 + r2;
        r13 = r13 - r6;
        r5.offset = r13;
        r3 = r3 + -1;
        goto L_0x007a;
    L_0x00b1:
        r13 = r10.mItems;
        r13 = r13.size();
        r3 = r11.offset;
        r4 = r11.position;
        r4 = r4 + -1;
        r5 = r11.position;
        if (r5 != 0) goto L_0x00c4;
    L_0x00c1:
        r5 = r11.offset;
        goto L_0x00c7;
    L_0x00c4:
        r5 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
    L_0x00c7:
        r10.mFirstOffset = r5;
        r5 = r11.position;
        r0 = r0 + -1;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r5 != r0) goto L_0x00d8;
    L_0x00d1:
        r5 = r11.offset;
        r7 = r11.widthFactor;
        r5 = r5 + r7;
        r5 = r5 - r6;
        goto L_0x00db;
    L_0x00d8:
        r5 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
    L_0x00db:
        r10.mLastOffset = r5;
        r5 = r12 + -1;
    L_0x00df:
        if (r5 < 0) goto L_0x010a;
    L_0x00e1:
        r7 = r10.mItems;
        r7 = r7.get(r5);
        r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7;
    L_0x00e9:
        r8 = r7.position;
        if (r4 <= r8) goto L_0x00f9;
    L_0x00ed:
        r8 = r10.mAdapter;
        r9 = r4 + -1;
        r4 = r8.getPageWidth(r4);
        r4 = r4 + r2;
        r3 = r3 - r4;
        r4 = r9;
        goto L_0x00e9;
    L_0x00f9:
        r8 = r7.widthFactor;
        r8 = r8 + r2;
        r3 = r3 - r8;
        r7.offset = r3;
        r7 = r7.position;
        if (r7 != 0) goto L_0x0105;
    L_0x0103:
        r10.mFirstOffset = r3;
    L_0x0105:
        r5 = r5 + -1;
        r4 = r4 + -1;
        goto L_0x00df;
    L_0x010a:
        r3 = r11.offset;
        r4 = r11.widthFactor;
        r3 = r3 + r4;
        r3 = r3 + r2;
        r11 = r11.position;
        r11 = r11 + 1;
        r12 = r12 + 1;
    L_0x0116:
        if (r12 >= r13) goto L_0x0145;
    L_0x0118:
        r4 = r10.mItems;
        r4 = r4.get(r12);
        r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4;
    L_0x0120:
        r5 = r4.position;
        if (r11 >= r5) goto L_0x0130;
    L_0x0124:
        r5 = r10.mAdapter;
        r7 = r11 + 1;
        r11 = r5.getPageWidth(r11);
        r11 = r11 + r2;
        r3 = r3 + r11;
        r11 = r7;
        goto L_0x0120;
    L_0x0130:
        r5 = r4.position;
        if (r5 != r0) goto L_0x013a;
    L_0x0134:
        r5 = r4.widthFactor;
        r5 = r5 + r3;
        r5 = r5 - r6;
        r10.mLastOffset = r5;
    L_0x013a:
        r4.offset = r3;
        r4 = r4.widthFactor;
        r4 = r4 + r2;
        r3 = r3 + r4;
        r12 = r12 + 1;
        r11 = r11 + 1;
        goto L_0x0116;
    L_0x0145:
        r10.mNeedCalculatePageOffsets = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.calculatePageOffsets(androidx.viewpager.widget.ViewPager$ItemInfo, int, androidx.viewpager.widget.ViewPager$ItemInfo):void");
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            PagerAdapter pagerAdapter = this.mAdapter;
            if (pagerAdapter != null) {
                pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
                setCurrentItemInternal(savedState.position, false, true);
            } else {
                this.mRestoredCurItem = savedState.position;
                this.mRestoredAdapterState = savedState.adapterState;
                this.mRestoredClassLoader = savedState.loader;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.isDecor |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.isDecor) {
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ItemInfo infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public ItemInfo infoForAnyChild(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public ItemInfo infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i2);
            if (itemInfo.position == i) {
                return itemInfo;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    public void onMeasure(int r17, int r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = 0;
        r2 = r17;
        r2 = getDefaultSize(r1, r2);
        r3 = r18;
        r3 = getDefaultSize(r1, r3);
        r0.setMeasuredDimension(r2, r3);
        r2 = r16.getMeasuredWidth();
        r3 = r2 / 10;
        r4 = r0.mDefaultGutterSize;
        r3 = java.lang.Math.min(r3, r4);
        r0.mGutterSize = r3;
        r3 = r16.getPaddingLeft();
        r2 = r2 - r3;
        r3 = r16.getPaddingRight();
        r2 = r2 - r3;
        r3 = r16.getMeasuredHeight();
        r4 = r16.getPaddingTop();
        r3 = r3 - r4;
        r4 = r16.getPaddingBottom();
        r3 = r3 - r4;
        r4 = r16.getChildCount();
        r5 = r3;
        r3 = r2;
        r2 = 0;
    L_0x003f:
        r6 = 8;
        r7 = 1;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 >= r4) goto L_0x00c7;
    L_0x0046:
        r9 = r0.getChildAt(r2);
        r10 = r9.getVisibility();
        if (r10 == r6) goto L_0x00c2;
    L_0x0050:
        r6 = r9.getLayoutParams();
        r6 = (androidx.viewpager.widget.ViewPager.LayoutParams) r6;
        if (r6 == 0) goto L_0x00c2;
    L_0x0058:
        r10 = r6.isDecor;
        if (r10 == 0) goto L_0x00c2;
    L_0x005c:
        r10 = r6.gravity;
        r10 = r10 & 7;
        r11 = r6.gravity;
        r11 = r11 & 112;
        r12 = 48;
        if (r11 == r12) goto L_0x006f;
    L_0x0068:
        r12 = 80;
        if (r11 != r12) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r11 = 0;
        goto L_0x0070;
    L_0x006f:
        r11 = 1;
    L_0x0070:
        r12 = 3;
        if (r10 == r12) goto L_0x0078;
    L_0x0073:
        r12 = 5;
        if (r10 != r12) goto L_0x0077;
    L_0x0076:
        goto L_0x0078;
    L_0x0077:
        r7 = 0;
    L_0x0078:
        r10 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r11 == 0) goto L_0x007f;
    L_0x007c:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0084;
    L_0x007f:
        if (r7 == 0) goto L_0x0084;
    L_0x0081:
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0086;
    L_0x0084:
        r12 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0086:
        r13 = r6.width;
        r14 = -1;
        r15 = -2;
        if (r13 == r15) goto L_0x0098;
    L_0x008c:
        r10 = r6.width;
        if (r10 == r14) goto L_0x0094;
    L_0x0090:
        r10 = r6.width;
        r13 = r10;
        goto L_0x0095;
    L_0x0094:
        r13 = r3;
    L_0x0095:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0099;
    L_0x0098:
        r13 = r3;
    L_0x0099:
        r1 = r6.height;
        if (r1 == r15) goto L_0x00a6;
    L_0x009d:
        r1 = r6.height;
        if (r1 == r14) goto L_0x00a4;
    L_0x00a1:
        r1 = r6.height;
        goto L_0x00a8;
    L_0x00a4:
        r1 = r5;
        goto L_0x00a8;
    L_0x00a6:
        r1 = r5;
        r8 = r12;
    L_0x00a8:
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
        r9.measure(r6, r1);
        if (r11 == 0) goto L_0x00bb;
    L_0x00b5:
        r1 = r9.getMeasuredHeight();
        r5 = r5 - r1;
        goto L_0x00c2;
    L_0x00bb:
        if (r7 == 0) goto L_0x00c2;
    L_0x00bd:
        r1 = r9.getMeasuredWidth();
        r3 = r3 - r1;
    L_0x00c2:
        r2 = r2 + 1;
        r1 = 0;
        goto L_0x003f;
    L_0x00c7:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
        r0.mChildWidthMeasureSpec = r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8);
        r0.mChildHeightMeasureSpec = r1;
        r0.mInLayout = r7;
        r16.populate();
        r1 = 0;
        r0.mInLayout = r1;
        r2 = r16.getChildCount();
    L_0x00df:
        if (r1 >= r2) goto L_0x0109;
    L_0x00e1:
        r4 = r0.getChildAt(r1);
        r5 = r4.getVisibility();
        if (r5 == r6) goto L_0x0106;
    L_0x00eb:
        r5 = r4.getLayoutParams();
        r5 = (androidx.viewpager.widget.ViewPager.LayoutParams) r5;
        if (r5 == 0) goto L_0x00f7;
    L_0x00f3:
        r7 = r5.isDecor;
        if (r7 != 0) goto L_0x0106;
    L_0x00f7:
        r7 = (float) r3;
        r5 = r5.widthFactor;
        r7 = r7 * r5;
        r5 = (int) r7;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8);
        r7 = r0.mChildHeightMeasureSpec;
        r4.measure(r5, r7);
    L_0x0106:
        r1 = r1 + 1;
        goto L_0x00df;
    L_0x0109:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            i2 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i2, i2);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            ItemInfo infoForPosition = infoForPosition(this.mCurItem);
            i = (int) ((infoForPosition != null ? Math.min(infoForPosition.offset, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                completeScroll(false);
                scrollTo(i, getScrollY());
            }
        } else if (this.mScroller.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i9 = layoutParams.gravity & 7;
                    int i10 = layoutParams.gravity & 112;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor) {
                    ItemInfo infoForChild = infoForChild(childAt2);
                    if (infoForChild != null) {
                        float f = (float) i5;
                        int i11 = ((int) (infoForChild.offset * f)) + paddingTop;
                        if (layoutParams2.needsMeasure) {
                            layoutParams2.needsMeasure = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.widthFactor), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        this.mTopPageBounds = paddingBottom;
        this.mBottomPageBounds = i6 - i7;
        this.mDecorChildCount = i8;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private boolean pageScrolled(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.mItems.size() != 0) {
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = infoForCurrentScrollPosition.position;
            float f3 = ((((float) i) / f) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + f2);
            int i5 = (int) (((float) i3) * f3);
            this.mCalledSuper = false;
            onPageScrolled(i4, f3, i5);
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    @androidx.annotation.CallSuper
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
        r12 = this;
        r0 = r12.mDecorChildCount;
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x006d;
    L_0x0006:
        r0 = r12.getScrollX();
        r3 = r12.getPaddingLeft();
        r4 = r12.getPaddingRight();
        r5 = r12.getWidth();
        r6 = r12.getChildCount();
        r7 = r4;
        r4 = r3;
        r3 = 0;
    L_0x001d:
        if (r3 >= r6) goto L_0x006d;
    L_0x001f:
        r8 = r12.getChildAt(r3);
        r9 = r8.getLayoutParams();
        r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9;
        r10 = r9.isDecor;
        if (r10 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x006a;
    L_0x002e:
        r9 = r9.gravity;
        r9 = r9 & 7;
        if (r9 == r2) goto L_0x004f;
    L_0x0034:
        r10 = 3;
        if (r9 == r10) goto L_0x0049;
    L_0x0037:
        r10 = 5;
        if (r9 == r10) goto L_0x003c;
    L_0x003a:
        r9 = r4;
        goto L_0x005e;
    L_0x003c:
        r9 = r5 - r7;
        r10 = r8.getMeasuredWidth();
        r9 = r9 - r10;
        r10 = r8.getMeasuredWidth();
        r7 = r7 + r10;
        goto L_0x005b;
    L_0x0049:
        r9 = r8.getWidth();
        r9 = r9 + r4;
        goto L_0x005e;
    L_0x004f:
        r9 = r8.getMeasuredWidth();
        r9 = r5 - r9;
        r9 = r9 / 2;
        r9 = java.lang.Math.max(r9, r4);
    L_0x005b:
        r11 = r9;
        r9 = r4;
        r4 = r11;
    L_0x005e:
        r4 = r4 + r0;
        r10 = r8.getLeft();
        r4 = r4 - r10;
        if (r4 == 0) goto L_0x0069;
    L_0x0066:
        r8.offsetLeftAndRight(r4);
    L_0x0069:
        r4 = r9;
    L_0x006a:
        r3 = r3 + 1;
        goto L_0x001d;
    L_0x006d:
        r12.dispatchOnPageScrolled(r13, r14, r15);
        r13 = r12.mPageTransformer;
        if (r13 == 0) goto L_0x00a1;
    L_0x0074:
        r13 = r12.getScrollX();
        r14 = r12.getChildCount();
    L_0x007c:
        if (r1 >= r14) goto L_0x00a1;
    L_0x007e:
        r15 = r12.getChildAt(r1);
        r0 = r15.getLayoutParams();
        r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0;
        r0 = r0.isDecor;
        if (r0 == 0) goto L_0x008d;
    L_0x008c:
        goto L_0x009e;
    L_0x008d:
        r0 = r15.getLeft();
        r0 = r0 - r13;
        r0 = (float) r0;
        r3 = r12.getClientWidth();
        r3 = (float) r3;
        r0 = r0 / r3;
        r3 = r12.mPageTransformer;
        r3.transformPage(r15, r0);
    L_0x009e:
        r1 = r1 + 1;
        goto L_0x007c;
    L_0x00a1:
        r12.mCalledSuper = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        onPageChangeListener = this.mInternalPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        onPageChangeListener = this.mInternalPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        onPageChangeListener = this.mInternalPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    private void completeScroll(boolean z) {
        Object obj = this.mScrollState == 2 ? 1 : null;
        if (obj != null) {
            setScrollingCacheEnabled(false);
            if ((this.mScroller.isFinished() ^ 1) != 0) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        Object obj2 = obj;
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                obj2 = 1;
            }
        }
        if (obj2 == null) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            x = motionEvent.getY();
            this.mInitialMotionY = x;
            this.mLastMotionY = x;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            action = this.mActivePointerId;
            if (action != -1) {
                action = motionEvent2.findPointerIndex(action);
                float x2 = motionEvent2.getX(action);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y = motionEvent2.getY(action);
                float abs2 = Math.abs(y - this.mInitialMotionY);
                if (!(f == 0.0f || isGutterDrag(this.mLastMotionX, f))) {
                    if (canScroll(this, false, (int) f, (int) x2, (int) y)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                if (abs > ((float) this.mTouchSlop) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    this.mLastMotionX = f > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                    this.mLastMotionY = y;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.mTouchSlop)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        float x;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            x = motionEvent.getY();
            this.mInitialMotionY = x;
            this.mLastMotionY = x;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    action = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (action == -1) {
                        z = resetTouch();
                    } else {
                        float x2 = motionEvent.getX(action);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        x = motionEvent.getY(action);
                        float abs2 = Math.abs(x - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            abs = this.mInitialMotionX;
                            this.mLastMotionX = x2 - abs > 0.0f ? abs + ((float) this.mTouchSlop) : abs - ((float) this.mTouchSlop);
                            this.mLastMotionY = x;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    action = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(action);
                    this.mActivePointerId = motionEvent.getPointerId(action);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            action = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f = (float) clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((((float) scrollX) / f) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (((float) this.mPageMargin) / f)), action, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, action);
            z = resetTouch();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        Object obj;
        Object obj2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) getClientWidth();
        float f3 = this.mFirstOffset * f2;
        float f4 = this.mLastOffset * f2;
        boolean z = false;
        ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
        ArrayList arrayList = this.mItems;
        ItemInfo itemInfo2 = (ItemInfo) arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f3 = itemInfo.offset * f2;
            obj = null;
        } else {
            obj = 1;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f4 = itemInfo2.offset * f2;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (f < f3) {
            if (obj != null) {
                this.mLeftEdge.onPull(Math.abs(f3 - f) / f2);
                z = true;
            }
            f = f3;
        } else if (f > f4) {
            if (obj2 != null) {
                this.mRightEdge.onPull(Math.abs(f - f4) / f2);
                z = true;
            }
            f = f4;
        }
        int i = (int) f;
        this.mLastMotionX += f - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z;
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        ItemInfo itemInfo = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.mItems.size()) {
            ItemInfo itemInfo2 = (ItemInfo) this.mItems.get(i);
            if (obj == null) {
                i2++;
                if (itemInfo2.position != i2) {
                    itemInfo2 = this.mTempItem;
                    itemInfo2.offset = (f2 + f3) + f;
                    itemInfo2.position = i2;
                    itemInfo2.widthFactor = this.mAdapter.getPageWidth(itemInfo2.position);
                    i--;
                }
            }
            f2 = itemInfo2.offset;
            float f4 = (itemInfo2.widthFactor + f2) + f;
            if (obj == null && scrollX < f2) {
                return itemInfo;
            }
            if (scrollX < f4 || i == this.mItems.size() - 1) {
                return itemInfo2;
            }
            i2 = itemInfo2.position;
            f3 = itemInfo2.widthFactor;
            i++;
            itemInfo = itemInfo2;
            obj = null;
        }
        return itemInfo;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
        ArrayList arrayList = this.mItems;
        return Math.max(itemInfo.position, Math.min(i, ((ItemInfo) arrayList.get(arrayList.size() - 1)).position));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Missing block: B:7:0x0015, code skipped:
            if (r0.getCount() > 1) goto L_0x0024;
     */
    public void draw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        super.draw(r8);
        r0 = r7.getOverScrollMode();
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x000a:
        r2 = 1;
        if (r0 != r2) goto L_0x0018;
    L_0x000d:
        r0 = r7.mAdapter;
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = r0.getCount();
        if (r0 <= r2) goto L_0x0018;
    L_0x0017:
        goto L_0x0024;
    L_0x0018:
        r8 = r7.mLeftEdge;
        r8.finish();
        r8 = r7.mRightEdge;
        r8.finish();
        goto L_0x00a9;
    L_0x0024:
        r0 = r7.mLeftEdge;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x0065;
    L_0x002c:
        r0 = r8.save();
        r2 = r7.getHeight();
        r3 = r7.getPaddingTop();
        r2 = r2 - r3;
        r3 = r7.getPaddingBottom();
        r2 = r2 - r3;
        r3 = r7.getWidth();
        r4 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r8.rotate(r4);
        r4 = -r2;
        r5 = r7.getPaddingTop();
        r4 = r4 + r5;
        r4 = (float) r4;
        r5 = r7.mFirstOffset;
        r6 = (float) r3;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.mLeftEdge;
        r4.setSize(r2, r3);
        r2 = r7.mLeftEdge;
        r2 = r2.draw(r8);
        r1 = r1 | r2;
        r8.restoreToCount(r0);
    L_0x0065:
        r0 = r7.mRightEdge;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x00a9;
    L_0x006d:
        r0 = r8.save();
        r2 = r7.getWidth();
        r3 = r7.getHeight();
        r4 = r7.getPaddingTop();
        r3 = r3 - r4;
        r4 = r7.getPaddingBottom();
        r3 = r3 - r4;
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r8.rotate(r4);
        r4 = r7.getPaddingTop();
        r4 = -r4;
        r4 = (float) r4;
        r5 = r7.mLastOffset;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = (float) r2;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.mRightEdge;
        r4.setSize(r3, r2);
        r2 = r7.mRightEdge;
        r2 = r2.draw(r8);
        r1 = r1 | r2;
        r8.restoreToCount(r0);
    L_0x00a9:
        if (r1 == 0) goto L_0x00ae;
    L_0x00ab:
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7);
    L_0x00ae:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) this.mPageMargin) / f;
            int i = 0;
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
            float f3 = itemInfo.offset;
            int size = this.mItems.size();
            int i2 = itemInfo.position;
            int i3 = ((ItemInfo) this.mItems.get(size - 1)).position;
            while (i2 < i3) {
                float f4;
                float f5;
                while (i2 > itemInfo.position && i < size) {
                    i++;
                    itemInfo = (ItemInfo) this.mItems.get(i);
                }
                if (i2 == itemInfo.position) {
                    f3 = (itemInfo.offset + itemInfo.widthFactor) * f;
                    f4 = (itemInfo.offset + itemInfo.widthFactor) + f2;
                } else {
                    f4 = this.mAdapter.getPageWidth(i2);
                    f4 = f3 + (f4 + f2);
                    f3 = (f3 + f4) * f;
                }
                if (((float) this.mPageMargin) + f3 > ((float) scrollX)) {
                    f5 = f2;
                    this.mMarginDrawable.setBounds(Math.round(f3), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f3), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f5 = f2;
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i2++;
                    f3 = f4;
                    f2 = f5;
                } else {
                    return;
                }
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            f = (float) getClientWidth();
            float f2 = this.mFirstOffset * f;
            float f3 = this.mLastOffset * f;
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
            ArrayList arrayList = this.mItems;
            ItemInfo itemInfo2 = (ItemInfo) arrayList.get(arrayList.size() - 1);
            if (itemInfo.position != 0) {
                f2 = itemInfo.offset * f;
            }
            if (itemInfo2.position != this.mAdapter.getCount() - 1) {
                f3 = itemInfo2.offset * f;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(actionIndex);
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset))) {
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!(z && view.canScrollHorizontally(-i))) {
            z2 = false;
        }
        return z2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    public boolean arrowScroll(int i) {
        View findFocus = findFocus();
        boolean z = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (Object parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ");
                        stringBuilder.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    stringBuilder2.append(stringBuilder.toString());
                    Log.e(TAG, stringBuilder2.toString());
                }
            }
            view = findFocus;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findFocus != null && findFocus != view) {
            boolean requestFocus;
            int i2;
            int i3;
            if (i == 17) {
                i2 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                i3 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = pageLeft();
                }
            } else if (i == 66) {
                i2 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                i3 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i2 > i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = pageRight();
                }
            }
            z = requestFocus;
        } else if (i == 17 || i == 1) {
            z = pageLeft();
        } else if (i == 66 || i == 2) {
            z = pageRight();
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    ItemInfo infoForChild = infoForChild(childAt);
                    if (infoForChild != null && infoForChild.position == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (!(((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null)) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) != 0) {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        } else {
            childCount--;
            i2 = -1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
