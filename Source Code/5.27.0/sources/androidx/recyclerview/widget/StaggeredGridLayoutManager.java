package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private final Runnable mCheckForGapsRunnable = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };
    private int mFullSizeSpec;
    private int mGapStrategy = 2;
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    @NonNull
    private final LayoutState mLayoutState;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    private int[] mPrefetchDistances;
    @NonNull
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    boolean mReverseLayout = false;
    @NonNull
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout = false;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled = true;
    private int mSpanCount = -1;
    Span[] mSpans;
    private final Rect mTmpRect = new Rect();

    class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i = 0; i < length; i++) {
                this.mSpanReferenceLines[i] = spanArr[i].getStartLine(Integer.MIN_VALUE);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void assignCoordinateFromPadding() {
            int endAfterPadding;
            if (this.mLayoutFromEnd) {
                endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            } else {
                endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            }
            this.mOffset = endAfterPadding;
        }

        /* Access modifiers changed, original: 0000 */
        public void assignCoordinateFromPadding(int i) {
            if (this.mLayoutFromEnd) {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i;
            } else {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i;
            }
        }
    }

    static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        int[] mData;
        List<FullSpanItem> mFullSpanItems;

        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            };
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.mHasUnwantedGapAfter = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.mGapPerSpan = new int[readInt];
                    parcel.readIntArray(this.mGapPerSpan);
                }
            }

            FullSpanItem() {
            }

            /* Access modifiers changed, original: 0000 */
            public int getGapForSpan(int i) {
                int[] iArr = this.mGapPerSpan;
                return iArr == null ? 0 : iArr[i];
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.mGapPerSpan);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FullSpanItem{mPosition=");
                stringBuilder.append(this.mPosition);
                stringBuilder.append(", mGapDir=");
                stringBuilder.append(this.mGapDir);
                stringBuilder.append(", mHasUnwantedGapAfter=");
                stringBuilder.append(this.mHasUnwantedGapAfter);
                stringBuilder.append(", mGapPerSpan=");
                stringBuilder.append(Arrays.toString(this.mGapPerSpan));
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        LazySpanLookup() {
        }

        /* Access modifiers changed, original: 0000 */
        public int forceInvalidateAfter(int i) {
            List list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.mFullSpanItems.get(size)).mPosition >= i) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i);
        }

        /* Access modifiers changed, original: 0000 */
        public int invalidateAfter(int i) {
            int[] iArr = this.mData;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int invalidateFullSpansAfter = invalidateFullSpansAfter(i);
            if (invalidateFullSpansAfter == -1) {
                iArr = this.mData;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.mData.length;
            }
            invalidateFullSpansAfter++;
            Arrays.fill(this.mData, i, invalidateFullSpansAfter, -1);
            return invalidateFullSpansAfter;
        }

        /* Access modifiers changed, original: 0000 */
        public int getSpan(int i) {
            int[] iArr = this.mData;
            return (iArr == null || i >= iArr.length) ? -1 : iArr[i];
        }

        /* Access modifiers changed, original: 0000 */
        public void setSpan(int i, Span span) {
            ensureSize(i);
            this.mData[i] = span.mIndex;
        }

        /* Access modifiers changed, original: 0000 */
        public int sizeForPosition(int i) {
            int length = this.mData.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* Access modifiers changed, original: 0000 */
        public void ensureSize(int i) {
            int[] iArr = this.mData;
            if (iArr == null) {
                this.mData = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.mData, -1);
            } else if (i >= iArr.length) {
                this.mData = new int[sizeForPosition(i)];
                System.arraycopy(iArr, 0, this.mData, 0, iArr.length);
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        /* Access modifiers changed, original: 0000 */
        public void offsetForRemoval(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                iArr = this.mData;
                Arrays.fill(iArr, iArr.length - i2, iArr.length, -1);
                offsetFullSpansForRemoval(i, i2);
            }
        }

        private void offsetFullSpansForRemoval(int i, int i2) {
            List list = this.mFullSpanItems;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                    if (fullSpanItem.mPosition >= i) {
                        if (fullSpanItem.mPosition < i3) {
                            this.mFullSpanItems.remove(size);
                        } else {
                            fullSpanItem.mPosition -= i2;
                        }
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void offsetForAddition(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.mData, i, i3, -1);
                offsetFullSpansForAddition(i, i2);
            }
        }

        private void offsetFullSpansForAddition(int i, int i2) {
            List list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                    if (fullSpanItem.mPosition >= i) {
                        fullSpanItem.mPosition += i2;
                    }
                }
            }
        }

        private int invalidateFullSpansAfter(int i) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            FullSpanItem fullSpanItem = getFullSpanItem(i);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i2 = 0;
            while (i2 < size) {
                if (((FullSpanItem) this.mFullSpanItems.get(i2)).mPosition >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem2 = (FullSpanItem) this.mFullSpanItems.get(i2);
            this.mFullSpanItems.remove(i2);
            return fullSpanItem2.mPosition;
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.mFullSpanItems.get(i);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.mFullSpanItems.remove(i);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.mFullSpanItems.add(i, fullSpanItem);
                    return;
                }
            }
            this.mFullSpanItems.add(fullSpanItem);
        }

        public FullSpanItem getFullSpanItem(int i) {
            List list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                if (fullSpanItem.mPosition == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i, int i2, int i3, boolean z) {
            List list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(i4);
                if (fullSpanItem.mPosition >= i2) {
                    return null;
                }
                if (fullSpanItem.mPosition >= i && (i3 == 0 || fullSpanItem.mGapDir == i3 || (z && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            this.mSpanOffsetsSize = parcel.readInt();
            int i = this.mSpanOffsetsSize;
            if (i > 0) {
                this.mSpanOffsets = new int[i];
                parcel.readIntArray(this.mSpanOffsets);
            }
            this.mSpanLookupSize = parcel.readInt();
            i = this.mSpanLookupSize;
            if (i > 0) {
                this.mSpanLookup = new int[i];
                parcel.readIntArray(this.mSpanLookup);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.mLastLayoutRTL = z;
            this.mFullSpanItems = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout);
            parcel.writeInt(this.mAnchorLayoutFromEnd);
            parcel.writeInt(this.mLastLayoutRTL);
            parcel.writeList(this.mFullSpanItems);
        }
    }

    class Span {
        static final int INVALID_LINE = Integer.MIN_VALUE;
        int mCachedEnd = Integer.MIN_VALUE;
        int mCachedStart = Integer.MIN_VALUE;
        int mDeletedSize = 0;
        final int mIndex;
        ArrayList<View> mViews = new ArrayList();

        Span(int i) {
            this.mIndex = i;
        }

        /* Access modifiers changed, original: 0000 */
        public int getStartLine(int i) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        /* Access modifiers changed, original: 0000 */
        public void calculateCachedStart() {
            View view = (View) this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan) {
                FullSpanItem fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.mGapDir == -1) {
                    this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public int getStartLine() {
            int i = this.mCachedStart;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        /* Access modifiers changed, original: 0000 */
        public int getEndLine(int i) {
            int i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        /* Access modifiers changed, original: 0000 */
        public void calculateCachedEnd() {
            ArrayList arrayList = this.mViews;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan) {
                FullSpanItem fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.mGapDir == 1) {
                    this.mCachedEnd += fullSpanItem.getGapForSpan(this.mIndex);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public int getEndLine() {
            int i = this.mCachedEnd;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        /* Access modifiers changed, original: 0000 */
        public void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cacheReferenceLineAndClear(boolean z, int i) {
            int endLine;
            if (z) {
                endLine = getEndLine(Integer.MIN_VALUE);
            } else {
                endLine = getStartLine(Integer.MIN_VALUE);
            }
            clear();
            if (endLine != Integer.MIN_VALUE) {
                if ((!z || endLine >= StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) && (z || endLine <= StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding())) {
                    if (i != Integer.MIN_VALUE) {
                        endLine += i;
                    }
                    this.mCachedEnd = endLine;
                    this.mCachedStart = endLine;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: 0000 */
        public void setLine(int i) {
            this.mCachedStart = i;
            this.mCachedEnd = i;
        }

        /* Access modifiers changed, original: 0000 */
        public void popEnd() {
            int size = this.mViews.size();
            View view = (View) this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: 0000 */
        public void popStart() {
            View view = (View) this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        /* Access modifiers changed, original: 0000 */
        public LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* Access modifiers changed, original: 0000 */
        public void onOffset(int i) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                this.mCachedStart = i2 + i;
            }
            i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                this.mCachedEnd = i2 + i;
            }
        }

        public int findFirstVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(this.mViews.size() - 1, -1, false);
            }
            return findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
            }
            return findOnePartiallyVisibleChild(0, this.mViews.size(), true);
        }

        public int findFirstCompletelyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(this.mViews.size() - 1, -1, true);
            }
            return findOneVisibleChild(0, this.mViews.size(), true);
        }

        public int findLastVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(0, this.mViews.size(), false);
            }
            return findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        public int findLastPartiallyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOnePartiallyVisibleChild(0, this.mViews.size(), true);
            }
            return findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
        }

        public int findLastCompletelyVisibleItemPosition() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return findOneVisibleChild(0, this.mViews.size(), true);
            }
            return findOneVisibleChild(this.mViews.size() - 1, -1, true);
        }

        /* Access modifiers changed, original: 0000 */
        public int findOnePartiallyOrCompletelyVisibleChild(int i, int i2, boolean z, boolean z2, boolean z3) {
            int startAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.mViews.get(i);
                int decoratedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
                Object obj = null;
                Object obj2 = (z3 ? decoratedStart > endAfterPadding : decoratedStart >= endAfterPadding) ? null : 1;
                if (z3 ? decoratedEnd < startAfterPadding : decoratedEnd <= startAfterPadding) {
                    obj = 1;
                }
                if (!(obj2 == null || obj == null)) {
                    if (z && z2) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else {
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* Access modifiers changed, original: 0000 */
        public int findOneVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, z, true, false);
        }

        /* Access modifiers changed, original: 0000 */
        public int findOnePartiallyVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, false, false, z);
        }

        public View getFocusableViewAfter(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                i2 = this.mViews.size() - 1;
                while (i2 >= 0) {
                    View view2 = (View) this.mViews.get(i2);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i2--;
                    view = view2;
                }
            } else {
                i2 = this.mViews.size();
                int i3 = 0;
                while (i3 < i2) {
                    View view3 = (View) this.mViews.get(i3);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public final int getSpanIndex() {
            Span span = this.mSpan;
            if (span == null) {
                return -1;
            }
            return span.mIndex;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.mOrientation = i2;
        setSpanCount(i);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean checkForGaps() {
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        int lastChildPosition;
        int firstChildPosition;
        if (this.mShouldReverseLayout) {
            lastChildPosition = getLastChildPosition();
            firstChildPosition = getFirstChildPosition();
        } else {
            lastChildPosition = getFirstChildPosition();
            firstChildPosition = getLastChildPosition();
        }
        if (lastChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.clear();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.mLaidOutInvalidFullSpan) {
            return false;
        } else {
            int i = this.mShouldReverseLayout ? -1 : 1;
            firstChildPosition++;
            FullSpanItem firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(lastChildPosition, firstChildPosition, i, true);
            if (firstFullSpanItemInRange == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.forceInvalidateAfter(firstChildPosition);
                return false;
            }
            FullSpanItem firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(lastChildPosition, firstFullSpanItemInRange.mPosition, i * -1, true);
            if (firstFullSpanItemInRange2 == null) {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.mPosition);
            } else {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange2.mPosition + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].clear();
        }
        recyclerView.requestLayout();
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:28:0x0074, code skipped:
            if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:32:0x0086, code skipped:
            if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:34:0x008a, code skipped:
            r10 = null;
     */
    public android.view.View hasGapsToFix() {
        /*
        r12 = this;
        r0 = r12.getChildCount();
        r1 = 1;
        r0 = r0 - r1;
        r2 = new java.util.BitSet;
        r3 = r12.mSpanCount;
        r2.<init>(r3);
        r3 = r12.mSpanCount;
        r4 = 0;
        r2.set(r4, r3, r1);
        r3 = r12.mOrientation;
        r5 = -1;
        if (r3 != r1) goto L_0x0020;
    L_0x0018:
        r3 = r12.isLayoutRTL();
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r3 = 1;
        goto L_0x0021;
    L_0x0020:
        r3 = -1;
    L_0x0021:
        r6 = r12.mShouldReverseLayout;
        if (r6 == 0) goto L_0x0027;
    L_0x0025:
        r6 = -1;
        goto L_0x002b;
    L_0x0027:
        r0 = r0 + 1;
        r6 = r0;
        r0 = 0;
    L_0x002b:
        if (r0 >= r6) goto L_0x002e;
    L_0x002d:
        r5 = 1;
    L_0x002e:
        if (r0 == r6) goto L_0x00ab;
    L_0x0030:
        r7 = r12.getChildAt(r0);
        r8 = r7.getLayoutParams();
        r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8;
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r9 = r2.get(r9);
        if (r9 == 0) goto L_0x0054;
    L_0x0044:
        r9 = r8.mSpan;
        r9 = r12.checkSpanForGap(r9);
        if (r9 == 0) goto L_0x004d;
    L_0x004c:
        return r7;
    L_0x004d:
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r2.clear(r9);
    L_0x0054:
        r9 = r8.mFullSpan;
        if (r9 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x00a9;
    L_0x0059:
        r9 = r0 + r5;
        if (r9 == r6) goto L_0x00a9;
    L_0x005d:
        r9 = r12.getChildAt(r9);
        r10 = r12.mShouldReverseLayout;
        if (r10 == 0) goto L_0x0077;
    L_0x0065:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedEnd(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedEnd(r9);
        if (r10 >= r11) goto L_0x0074;
    L_0x0073:
        return r7;
    L_0x0074:
        if (r10 != r11) goto L_0x008a;
    L_0x0076:
        goto L_0x0088;
    L_0x0077:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedStart(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedStart(r9);
        if (r10 <= r11) goto L_0x0086;
    L_0x0085:
        return r7;
    L_0x0086:
        if (r10 != r11) goto L_0x008a;
    L_0x0088:
        r10 = 1;
        goto L_0x008b;
    L_0x008a:
        r10 = 0;
    L_0x008b:
        if (r10 == 0) goto L_0x00a9;
    L_0x008d:
        r9 = r9.getLayoutParams();
        r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9;
        r8 = r8.mSpan;
        r8 = r8.mIndex;
        r9 = r9.mSpan;
        r9 = r9.mIndex;
        r8 = r8 - r9;
        if (r8 >= 0) goto L_0x00a0;
    L_0x009e:
        r8 = 1;
        goto L_0x00a1;
    L_0x00a0:
        r8 = 0;
    L_0x00a1:
        if (r3 >= 0) goto L_0x00a5;
    L_0x00a3:
        r9 = 1;
        goto L_0x00a6;
    L_0x00a5:
        r9 = 0;
    L_0x00a6:
        if (r8 == r9) goto L_0x00a9;
    L_0x00a8:
        return r7;
    L_0x00a9:
        r0 = r0 + r5;
        goto L_0x002e;
    L_0x00ab:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    private boolean checkSpanForGap(Span span) {
        if (this.mShouldReverseLayout) {
            if (span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding()) {
                return span.getLayoutParams((View) span.mViews.get(span.mViews.size() - 1)).mFullSpan ^ 1;
            }
        } else if (span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding()) {
            return span.getLayoutParams((View) span.mViews.get(0)).mFullSpan ^ 1;
        }
        return false;
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (i = 0; i < this.mSpanCount; i++) {
                this.mSpans[i] = new Span(i);
            }
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation) {
                this.mOrientation = i;
                OrientationHelper orientationHelper = this.mPrimaryOrientation;
                this.mPrimaryOrientation = this.mSecondaryOrientation;
                this.mSecondaryOrientation = orientationHelper;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mReverseLayout == z)) {
            this.mPendingSavedState.mReverseLayout = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mGapStrategy) {
            if (i == 0 || i == 2) {
                this.mGapStrategy = i;
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout ^ 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize = LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i = LayoutManager.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            i = LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize = LayoutManager.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i, chooseSize);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        onLayoutChildren(recycler, state, true);
    }

    /* JADX WARNING: Missing block: B:83:0x0161, code skipped:
            if (checkForGaps() != false) goto L_0x0165;
     */
    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
        r8 = this;
        r0 = r8.mAnchorInfo;
        r1 = r8.mPendingSavedState;
        r2 = -1;
        if (r1 != 0) goto L_0x000b;
    L_0x0007:
        r1 = r8.mPendingScrollPosition;
        if (r1 == r2) goto L_0x0018;
    L_0x000b:
        r1 = r10.getItemCount();
        if (r1 != 0) goto L_0x0018;
    L_0x0011:
        r8.removeAndRecycleAllViews(r9);
        r0.reset();
        return;
    L_0x0018:
        r1 = r0.mValid;
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x0029;
    L_0x001e:
        r1 = r8.mPendingScrollPosition;
        if (r1 != r2) goto L_0x0029;
    L_0x0022:
        r1 = r8.mPendingSavedState;
        if (r1 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r1 = 0;
        goto L_0x002a;
    L_0x0029:
        r1 = 1;
    L_0x002a:
        if (r1 == 0) goto L_0x0043;
    L_0x002c:
        r0.reset();
        r5 = r8.mPendingSavedState;
        if (r5 == 0) goto L_0x0037;
    L_0x0033:
        r8.applyPendingSavedState(r0);
        goto L_0x003e;
    L_0x0037:
        r8.resolveShouldLayoutReverse();
        r5 = r8.mShouldReverseLayout;
        r0.mLayoutFromEnd = r5;
    L_0x003e:
        r8.updateAnchorInfoForLayout(r10, r0);
        r0.mValid = r4;
    L_0x0043:
        r5 = r8.mPendingSavedState;
        if (r5 != 0) goto L_0x0060;
    L_0x0047:
        r5 = r8.mPendingScrollPosition;
        if (r5 != r2) goto L_0x0060;
    L_0x004b:
        r5 = r0.mLayoutFromEnd;
        r6 = r8.mLastLayoutFromEnd;
        if (r5 != r6) goto L_0x0059;
    L_0x0051:
        r5 = r8.isLayoutRTL();
        r6 = r8.mLastLayoutRTL;
        if (r5 == r6) goto L_0x0060;
    L_0x0059:
        r5 = r8.mLazySpanLookup;
        r5.clear();
        r0.mInvalidateOffsets = r4;
    L_0x0060:
        r5 = r8.getChildCount();
        if (r5 <= 0) goto L_0x00cb;
    L_0x0066:
        r5 = r8.mPendingSavedState;
        if (r5 == 0) goto L_0x006e;
    L_0x006a:
        r5 = r5.mSpanOffsetsSize;
        if (r5 >= r4) goto L_0x00cb;
    L_0x006e:
        r5 = r0.mInvalidateOffsets;
        if (r5 == 0) goto L_0x0090;
    L_0x0072:
        r1 = 0;
    L_0x0073:
        r5 = r8.mSpanCount;
        if (r1 >= r5) goto L_0x00cb;
    L_0x0077:
        r5 = r8.mSpans;
        r5 = r5[r1];
        r5.clear();
        r5 = r0.mOffset;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == r6) goto L_0x008d;
    L_0x0084:
        r5 = r8.mSpans;
        r5 = r5[r1];
        r6 = r0.mOffset;
        r5.setLine(r6);
    L_0x008d:
        r1 = r1 + 1;
        goto L_0x0073;
    L_0x0090:
        if (r1 != 0) goto L_0x00b1;
    L_0x0092:
        r1 = r8.mAnchorInfo;
        r1 = r1.mSpanReferenceLines;
        if (r1 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00b1;
    L_0x0099:
        r1 = 0;
    L_0x009a:
        r5 = r8.mSpanCount;
        if (r1 >= r5) goto L_0x00cb;
    L_0x009e:
        r5 = r8.mSpans;
        r5 = r5[r1];
        r5.clear();
        r6 = r8.mAnchorInfo;
        r6 = r6.mSpanReferenceLines;
        r6 = r6[r1];
        r5.setLine(r6);
        r1 = r1 + 1;
        goto L_0x009a;
    L_0x00b1:
        r1 = 0;
    L_0x00b2:
        r5 = r8.mSpanCount;
        if (r1 >= r5) goto L_0x00c4;
    L_0x00b6:
        r5 = r8.mSpans;
        r5 = r5[r1];
        r6 = r8.mShouldReverseLayout;
        r7 = r0.mOffset;
        r5.cacheReferenceLineAndClear(r6, r7);
        r1 = r1 + 1;
        goto L_0x00b2;
    L_0x00c4:
        r1 = r8.mAnchorInfo;
        r5 = r8.mSpans;
        r1.saveSpanReferenceLines(r5);
    L_0x00cb:
        r8.detachAndScrapAttachedViews(r9);
        r1 = r8.mLayoutState;
        r1.mRecycle = r3;
        r8.mLaidOutInvalidFullSpan = r3;
        r1 = r8.mSecondaryOrientation;
        r1 = r1.getTotalSpace();
        r8.updateMeasureSpecs(r1);
        r1 = r0.mPosition;
        r8.updateLayoutState(r1, r10);
        r1 = r0.mLayoutFromEnd;
        if (r1 == 0) goto L_0x0102;
    L_0x00e6:
        r8.setLayoutStateDirection(r2);
        r1 = r8.mLayoutState;
        r8.fill(r9, r1, r10);
        r8.setLayoutStateDirection(r4);
        r1 = r8.mLayoutState;
        r2 = r0.mPosition;
        r5 = r8.mLayoutState;
        r5 = r5.mItemDirection;
        r2 = r2 + r5;
        r1.mCurrentPosition = r2;
        r1 = r8.mLayoutState;
        r8.fill(r9, r1, r10);
        goto L_0x011d;
    L_0x0102:
        r8.setLayoutStateDirection(r4);
        r1 = r8.mLayoutState;
        r8.fill(r9, r1, r10);
        r8.setLayoutStateDirection(r2);
        r1 = r8.mLayoutState;
        r2 = r0.mPosition;
        r5 = r8.mLayoutState;
        r5 = r5.mItemDirection;
        r2 = r2 + r5;
        r1.mCurrentPosition = r2;
        r1 = r8.mLayoutState;
        r8.fill(r9, r1, r10);
    L_0x011d:
        r8.repositionToWrapContentIfNecessary();
        r1 = r8.getChildCount();
        if (r1 <= 0) goto L_0x0137;
    L_0x0126:
        r1 = r8.mShouldReverseLayout;
        if (r1 == 0) goto L_0x0131;
    L_0x012a:
        r8.fixEndGap(r9, r10, r4);
        r8.fixStartGap(r9, r10, r3);
        goto L_0x0137;
    L_0x0131:
        r8.fixStartGap(r9, r10, r4);
        r8.fixEndGap(r9, r10, r3);
    L_0x0137:
        if (r11 == 0) goto L_0x0164;
    L_0x0139:
        r11 = r10.isPreLayout();
        if (r11 != 0) goto L_0x0164;
    L_0x013f:
        r11 = r8.mGapStrategy;
        if (r11 == 0) goto L_0x0155;
    L_0x0143:
        r11 = r8.getChildCount();
        if (r11 <= 0) goto L_0x0155;
    L_0x0149:
        r11 = r8.mLaidOutInvalidFullSpan;
        if (r11 != 0) goto L_0x0153;
    L_0x014d:
        r11 = r8.hasGapsToFix();
        if (r11 == 0) goto L_0x0155;
    L_0x0153:
        r11 = 1;
        goto L_0x0156;
    L_0x0155:
        r11 = 0;
    L_0x0156:
        if (r11 == 0) goto L_0x0164;
    L_0x0158:
        r11 = r8.mCheckForGapsRunnable;
        r8.removeCallbacks(r11);
        r11 = r8.checkForGaps();
        if (r11 == 0) goto L_0x0164;
    L_0x0163:
        goto L_0x0165;
    L_0x0164:
        r4 = 0;
    L_0x0165:
        r11 = r10.isPreLayout();
        if (r11 == 0) goto L_0x0170;
    L_0x016b:
        r11 = r8.mAnchorInfo;
        r11.reset();
    L_0x0170:
        r11 = r0.mLayoutFromEnd;
        r8.mLastLayoutFromEnd = r11;
        r11 = r8.isLayoutRTL();
        r8.mLastLayoutRTL = r11;
        if (r4 == 0) goto L_0x0184;
    L_0x017c:
        r11 = r8.mAnchorInfo;
        r11.reset();
        r8.onLayoutChildren(r9, r10, r3);
    L_0x0184:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() != 1073741824) {
            int i;
            int childCount = getChildCount();
            float f = 0.0f;
            for (i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float decoratedMeasurement = (float) this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                        decoratedMeasurement = (decoratedMeasurement * 1.0f) / ((float) this.mSpanCount);
                    }
                    f = Math.max(f, decoratedMeasurement);
                }
            }
            i = this.mSizePerSpan;
            int round = Math.round(f * ((float) this.mSpanCount));
            if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
                round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
            }
            updateMeasureSpecs(round);
            if (this.mSizePerSpan != i) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt2 = getChildAt(i2);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.mFullSpan) {
                        if (isLayoutRTL() && this.mOrientation == 1) {
                            childAt2.offsetLeftAndRight(((-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * this.mSizePerSpan) - ((-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * i));
                        } else {
                            int i3 = layoutParams.mSpan.mIndex * this.mSizePerSpan;
                            int i4 = layoutParams.mSpan.mIndex * i;
                            if (this.mOrientation == 1) {
                                childAt2.offsetLeftAndRight(i3 - i4);
                            } else {
                                childAt2.offsetTopAndBottom(i3 - i4);
                            }
                        }
                    }
                }
            }
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].clear();
                    int i2 = this.mPendingSavedState.mSpanOffsets[i];
                    if (i2 != Integer.MIN_VALUE) {
                        int endAfterPadding;
                        if (this.mPendingSavedState.mAnchorLayoutFromEnd) {
                            endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        } else {
                            endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        }
                        i2 += endAfterPadding;
                    }
                    this.mSpans[i].setLine(i2);
                }
            } else {
                this.mPendingSavedState.invalidateSpanInfo();
                SavedState savedState = this.mPendingSavedState;
                savedState.mAnchorPosition = savedState.mVisibleAnchorPosition;
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
        setReverseLayout(this.mPendingSavedState.mReverseLayout);
        resolveShouldLayoutReverse();
        if (this.mPendingSavedState.mAnchorPosition != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            anchorInfo.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
        } else {
            anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
        }
        if (this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.mData = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.mFullSpanItems = this.mPendingSavedState.mFullSpanItems;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateAnchorInfoForLayout(State state, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingData(state, anchorInfo) && !updateAnchorFromChildren(state, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            anchorInfo.mPosition = 0;
        }
    }

    private boolean updateAnchorFromChildren(State state, AnchorInfo anchorInfo) {
        int findLastReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findLastReferenceChildPosition = findLastReferenceChildPosition(state.getItemCount());
        } else {
            findLastReferenceChildPosition = findFirstReferenceChildPosition(state.getItemCount());
        }
        anchorInfo.mPosition = findLastReferenceChildPosition;
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean updateAnchorFromPendingData(State state, AnchorInfo anchorInfo) {
        boolean z = false;
        if (!state.isPreLayout()) {
            int i = this.mPendingScrollPosition;
            if (i != -1) {
                if (i < 0 || i >= state.getItemCount()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    SavedState savedState = this.mPendingSavedState;
                    if (savedState == null || savedState.mAnchorPosition == -1 || this.mPendingSavedState.mSpanOffsetsSize < 1) {
                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        int endAfterPadding;
                        if (findViewByPosition != null) {
                            int lastChildPosition;
                            if (this.mShouldReverseLayout) {
                                lastChildPosition = getLastChildPosition();
                            } else {
                                lastChildPosition = getFirstChildPosition();
                            }
                            anchorInfo.mPosition = lastChildPosition;
                            if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                                if (anchorInfo.mLayoutFromEnd) {
                                    anchorInfo.mOffset = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                } else {
                                    anchorInfo.mOffset = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                                }
                                return true;
                            } else if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                                if (anchorInfo.mLayoutFromEnd) {
                                    endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                                } else {
                                    endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                                }
                                anchorInfo.mOffset = endAfterPadding;
                                return true;
                            } else {
                                lastChildPosition = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                                if (lastChildPosition < 0) {
                                    anchorInfo.mOffset = -lastChildPosition;
                                    return true;
                                }
                                lastChildPosition = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                if (lastChildPosition < 0) {
                                    anchorInfo.mOffset = lastChildPosition;
                                    return true;
                                }
                                anchorInfo.mOffset = Integer.MIN_VALUE;
                            }
                        } else {
                            anchorInfo.mPosition = this.mPendingScrollPosition;
                            endAfterPadding = this.mPendingScrollPositionOffset;
                            if (endAfterPadding == Integer.MIN_VALUE) {
                                if (calculateScrollDirectionForPosition(anchorInfo.mPosition) == 1) {
                                    z = true;
                                }
                                anchorInfo.mLayoutFromEnd = z;
                                anchorInfo.assignCoordinateFromPadding();
                            } else {
                                anchorInfo.assignCoordinateFromPadding(endAfterPadding);
                            }
                            anchorInfo.mInvalidateOffsets = true;
                        }
                    } else {
                        anchorInfo.mOffset = Integer.MIN_VALUE;
                        anchorInfo.mPosition = this.mPendingScrollPosition;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.getMode());
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findLastVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int computeHorizontalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    private int computeScrollOffset(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public int computeVerticalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    private int computeScrollExtent(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    public int computeVerticalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollRange(State state) {
        return computeScrollRange(state);
    }

    private int computeScrollRange(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    public int computeVerticalScrollRange(State state) {
        return computeScrollRange(state);
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false), LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i = updateSpecWithExtra(i, layoutParams.leftMargin + this.mTmpRect.left, layoutParams.rightMargin + this.mTmpRect.right);
        i2 = updateSpecWithExtra(i2, layoutParams.topMargin + this.mTmpRect.top, layoutParams.bottomMargin + this.mTmpRect.bottom);
        if (z) {
            z = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            z = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (z) {
            view.measure(i, i2);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        savedState = new SavedState();
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        int i = 0;
        if (lazySpanLookup == null || lazySpanLookup.mData == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = this.mLazySpanLookup.mData;
            savedState.mSpanLookupSize = savedState.mSpanLookup.length;
            savedState.mFullSpanItems = this.mLazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() > 0) {
            int lastChildPosition;
            if (this.mLastLayoutFromEnd) {
                lastChildPosition = getLastChildPosition();
            } else {
                lastChildPosition = getFirstChildPosition();
            }
            savedState.mAnchorPosition = lastChildPosition;
            savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            lastChildPosition = this.mSpanCount;
            savedState.mSpanOffsetsSize = lastChildPosition;
            savedState.mSpanOffsets = new int[lastChildPosition];
            while (i < this.mSpanCount) {
                int endAfterPadding;
                if (this.mLastLayoutFromEnd) {
                    lastChildPosition = this.mSpans[i].getEndLine(Integer.MIN_VALUE);
                    if (lastChildPosition != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = lastChildPosition;
                        i++;
                    }
                } else {
                    lastChildPosition = this.mSpans[i].getStartLine(Integer.MIN_VALUE);
                    if (lastChildPosition != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = lastChildPosition;
                        i++;
                    }
                }
                lastChildPosition -= endAfterPadding;
                savedState.mSpanOffsets[i] = lastChildPosition;
                i++;
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (this.mOrientation == 0) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.mFullSpan ? this.mSpanCount : 1, -1, -1, layoutParams2.mFullSpan, false));
            } else {
                accessibilityNodeInfoCompat.setCollectionItemInfo(CollectionItemInfoCompat.obtain(-1, -1, layoutParams2.getSpanIndex(), layoutParams2.mFullSpan ? this.mSpanCount : 1, layoutParams2.mFullSpan, false));
            }
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd;
        if (this.mShouldReverseLayout) {
            findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(true);
        } else {
            findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToStart(true);
        }
        if (findFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToEnd);
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        return super.getRowCountForAccessibility(recycler, state);
    }

    public int getColumnCountForAccessibility(Recycler recycler, State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    /* Access modifiers changed, original: 0000 */
    public View findFirstVisibleItemClosestToStart(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* Access modifiers changed, original: 0000 */
    public View findFirstVisibleItemClosestToEnd(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private void fixEndGap(Recycler recycler, State state, boolean z) {
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE) {
            int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd;
            if (endAfterPadding > 0) {
                endAfterPadding -= -scrollBy(-endAfterPadding, recycler, state);
                if (z && endAfterPadding > 0) {
                    this.mPrimaryOrientation.offsetChildren(endAfterPadding);
                }
            }
        }
    }

    private void fixStartGap(Recycler recycler, State state, boolean z) {
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE) {
            minStart -= this.mPrimaryOrientation.getStartAfterPadding();
            if (minStart > 0) {
                minStart -= scrollBy(minStart, recycler, state);
                if (z && minStart > 0) {
                    this.mPrimaryOrientation.offsetChildren(-minStart);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    private void updateLayoutState(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
        r4 = this;
        r0 = r4.mLayoutState;
        r1 = 0;
        r0.mAvailable = r1;
        r0.mCurrentPosition = r5;
        r0 = r4.isSmoothScrolling();
        r2 = 1;
        if (r0 == 0) goto L_0x002e;
    L_0x000e:
        r6 = r6.getTargetScrollPosition();
        r0 = -1;
        if (r6 == r0) goto L_0x002e;
    L_0x0015:
        r0 = r4.mShouldReverseLayout;
        if (r6 >= r5) goto L_0x001b;
    L_0x0019:
        r5 = 1;
        goto L_0x001c;
    L_0x001b:
        r5 = 0;
    L_0x001c:
        if (r0 != r5) goto L_0x0025;
    L_0x001e:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getTotalSpace();
        goto L_0x002f;
    L_0x0025:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getTotalSpace();
        r6 = r5;
        r5 = 0;
        goto L_0x0030;
    L_0x002e:
        r5 = 0;
    L_0x002f:
        r6 = 0;
    L_0x0030:
        r0 = r4.getClipToPadding();
        if (r0 == 0) goto L_0x004d;
    L_0x0036:
        r0 = r4.mLayoutState;
        r3 = r4.mPrimaryOrientation;
        r3 = r3.getStartAfterPadding();
        r3 = r3 - r6;
        r0.mStartLine = r3;
        r6 = r4.mLayoutState;
        r0 = r4.mPrimaryOrientation;
        r0 = r0.getEndAfterPadding();
        r0 = r0 + r5;
        r6.mEndLine = r0;
        goto L_0x005d;
    L_0x004d:
        r0 = r4.mLayoutState;
        r3 = r4.mPrimaryOrientation;
        r3 = r3.getEnd();
        r3 = r3 + r5;
        r0.mEndLine = r3;
        r5 = r4.mLayoutState;
        r6 = -r6;
        r5.mStartLine = r6;
    L_0x005d:
        r5 = r4.mLayoutState;
        r5.mStopInFocusable = r1;
        r5.mRecycle = r2;
        r6 = r4.mPrimaryOrientation;
        r6 = r6.getMode();
        if (r6 != 0) goto L_0x0074;
    L_0x006b:
        r6 = r4.mPrimaryOrientation;
        r6 = r6.getEnd();
        if (r6 != 0) goto L_0x0074;
    L_0x0073:
        r1 = 1;
    L_0x0074:
        r5.mInfinite = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.updateLayoutState(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    private void setLayoutStateDirection(int i) {
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i;
        int i2 = 1;
        if (this.mShouldReverseLayout != (i == -1)) {
            i2 = -1;
        }
        layoutState.mItemDirection = i2;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A:{RETURN} */
    private void handleUpdate(int r7, int r8, int r9) {
        /*
        r6 = this;
        r0 = r6.mShouldReverseLayout;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r6.getLastChildPosition();
        goto L_0x000d;
    L_0x0009:
        r0 = r6.getFirstChildPosition();
    L_0x000d:
        r1 = 8;
        if (r9 != r1) goto L_0x001b;
    L_0x0011:
        if (r7 >= r8) goto L_0x0016;
    L_0x0013:
        r2 = r8 + 1;
        goto L_0x001d;
    L_0x0016:
        r2 = r7 + 1;
        r3 = r2;
        r2 = r8;
        goto L_0x001f;
    L_0x001b:
        r2 = r7 + r8;
    L_0x001d:
        r3 = r2;
        r2 = r7;
    L_0x001f:
        r4 = r6.mLazySpanLookup;
        r4.invalidateAfter(r2);
        r4 = 1;
        if (r9 == r4) goto L_0x003e;
    L_0x0027:
        r5 = 2;
        if (r9 == r5) goto L_0x0038;
    L_0x002a:
        if (r9 == r1) goto L_0x002d;
    L_0x002c:
        goto L_0x0043;
    L_0x002d:
        r9 = r6.mLazySpanLookup;
        r9.offsetForRemoval(r7, r4);
        r7 = r6.mLazySpanLookup;
        r7.offsetForAddition(r8, r4);
        goto L_0x0043;
    L_0x0038:
        r9 = r6.mLazySpanLookup;
        r9.offsetForRemoval(r7, r8);
        goto L_0x0043;
    L_0x003e:
        r9 = r6.mLazySpanLookup;
        r9.offsetForAddition(r7, r8);
    L_0x0043:
        if (r3 > r0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r7 = r6.mShouldReverseLayout;
        if (r7 == 0) goto L_0x004f;
    L_0x004a:
        r7 = r6.getFirstChildPosition();
        goto L_0x0053;
    L_0x004f:
        r7 = r6.getLastChildPosition();
    L_0x0053:
        if (r2 > r7) goto L_0x0058;
    L_0x0055:
        r6.requestLayout();
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    private int fill(Recycler recycler, LayoutState layoutState, State state) {
        int i;
        int i2;
        int span;
        Recycler recycler2 = recycler;
        LayoutState layoutState2 = layoutState;
        int i3 = 0;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.mInfinite) {
            i = layoutState2.mLayoutDirection == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (layoutState2.mLayoutDirection == 1) {
                i2 = layoutState2.mEndLine + layoutState2.mAvailable;
            } else {
                i2 = layoutState2.mStartLine - layoutState2.mAvailable;
            }
            i = i2;
        }
        updateAllRemainingSpans(layoutState2.mLayoutDirection, i);
        if (this.mShouldReverseLayout) {
            i2 = this.mPrimaryOrientation.getEndAfterPadding();
        } else {
            i2 = this.mPrimaryOrientation.getStartAfterPadding();
        }
        int i4 = i2;
        Object obj = null;
        while (layoutState.hasMore(state) && (this.mLayoutState.mInfinite || !this.mRemainingSpans.isEmpty())) {
            Span nextSpan;
            int decoratedMeasurement;
            int i5;
            int decoratedMeasurement2;
            View next = layoutState2.next(recycler2);
            LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
            i2 = layoutParams.getViewLayoutPosition();
            span = this.mLazySpanLookup.getSpan(i2);
            Object obj2 = span == -1 ? 1 : null;
            if (obj2 != null) {
                nextSpan = layoutParams.mFullSpan ? this.mSpans[i3] : getNextSpan(layoutState2);
                this.mLazySpanLookup.setSpan(i2, nextSpan);
            } else {
                nextSpan = this.mSpans[span];
            }
            Span span2 = nextSpan;
            layoutParams.mSpan = span2;
            if (layoutState2.mLayoutDirection == 1) {
                addView(next);
            } else {
                addView(next, i3);
            }
            measureChildWithDecorationsAndMargin(next, layoutParams, i3);
            FullSpanItem createFullSpanItemFromEnd;
            if (layoutState2.mLayoutDirection == 1) {
                if (layoutParams.mFullSpan) {
                    span = getMaxEnd(i4);
                } else {
                    span = span2.getEndLine(i4);
                }
                decoratedMeasurement = this.mPrimaryOrientation.getDecoratedMeasurement(next) + span;
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromEnd(span);
                    createFullSpanItemFromEnd.mGapDir = -1;
                    createFullSpanItemFromEnd.mPosition = i2;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i5 = decoratedMeasurement;
                decoratedMeasurement = span;
            } else {
                if (layoutParams.mFullSpan) {
                    span = getMinStart(i4);
                } else {
                    span = span2.getStartLine(i4);
                }
                decoratedMeasurement = span - this.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromStart(span);
                    createFullSpanItemFromEnd.mGapDir = 1;
                    createFullSpanItemFromEnd.mPosition = i2;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i5 = span;
            }
            if (layoutParams.mFullSpan && layoutState2.mItemDirection == -1) {
                if (obj2 != null) {
                    this.mLaidOutInvalidFullSpan = true;
                } else {
                    if (layoutState2.mLayoutDirection == 1) {
                        span = areAllEndsEqual();
                    } else {
                        span = areAllStartsEqual();
                    }
                    if ((span ^ 1) != 0) {
                        FullSpanItem fullSpanItem = this.mLazySpanLookup.getFullSpanItem(i2);
                        if (fullSpanItem != null) {
                            fullSpanItem.mHasUnwantedGapAfter = true;
                        }
                        this.mLaidOutInvalidFullSpan = true;
                    }
                }
            }
            attachViewToSpans(next, layoutParams, layoutState2);
            if (isLayoutRTL() && this.mOrientation == 1) {
                if (layoutParams.mFullSpan) {
                    i2 = this.mSecondaryOrientation.getEndAfterPadding();
                } else {
                    i2 = this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - span2.mIndex) * this.mSizePerSpan);
                }
                i3 = i2;
                decoratedMeasurement2 = i2 - this.mSecondaryOrientation.getDecoratedMeasurement(next);
            } else {
                if (layoutParams.mFullSpan) {
                    i2 = this.mSecondaryOrientation.getStartAfterPadding();
                } else {
                    i2 = (span2.mIndex * this.mSizePerSpan) + this.mSecondaryOrientation.getStartAfterPadding();
                }
                decoratedMeasurement2 = i2;
                i3 = this.mSecondaryOrientation.getDecoratedMeasurement(next) + i2;
            }
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(next, decoratedMeasurement2, decoratedMeasurement, i3, i5);
            } else {
                layoutDecoratedWithMargins(next, decoratedMeasurement, decoratedMeasurement2, i5, i3);
            }
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(this.mLayoutState.mLayoutDirection, i);
            } else {
                updateRemainingSpans(span2, this.mLayoutState.mLayoutDirection, i);
            }
            recycle(recycler2, this.mLayoutState);
            if (this.mLayoutState.mStopInFocusable && next.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    this.mRemainingSpans.clear();
                } else {
                    this.mRemainingSpans.set(span2.mIndex, false);
                    obj = 1;
                    i3 = 0;
                }
            }
            obj = 1;
            i3 = 0;
        }
        if (obj == null) {
            recycle(recycler2, this.mLayoutState);
        }
        if (this.mLayoutState.mLayoutDirection == -1) {
            span = this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding());
        } else {
            span = getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        }
        if (span > 0) {
            return Math.min(layoutState2.mAvailable, span);
        }
        return 0;
    }

    private FullSpanItem createFullSpanItemFromEnd(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.mGapPerSpan[i2] = i - this.mSpans[i2].getEndLine(i);
        }
        return fullSpanItem;
    }

    private FullSpanItem createFullSpanItemFromStart(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.mGapPerSpan[i2] = this.mSpans[i2].getStartLine(i) - i;
        }
        return fullSpanItem;
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.appendToSpan(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private void recycle(Recycler recycler, LayoutState layoutState) {
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            int maxStart;
            int i;
            if (layoutState.mAvailable == 0) {
                if (layoutState.mLayoutDirection == -1) {
                    recycleFromEnd(recycler, layoutState.mEndLine);
                } else {
                    recycleFromStart(recycler, layoutState.mStartLine);
                }
            } else if (layoutState.mLayoutDirection == -1) {
                maxStart = layoutState.mStartLine - getMaxStart(layoutState.mStartLine);
                if (maxStart < 0) {
                    i = layoutState.mEndLine;
                } else {
                    i = layoutState.mEndLine - Math.min(maxStart, layoutState.mAvailable);
                }
                recycleFromEnd(recycler, i);
            } else {
                maxStart = getMinEnd(layoutState.mEndLine) - layoutState.mEndLine;
                if (maxStart < 0) {
                    i = layoutState.mStartLine;
                } else {
                    i = Math.min(maxStart, layoutState.mAvailable) + layoutState.mStartLine;
                }
                recycleFromStart(recycler, i);
            }
        }
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].appendToSpan(view);
        }
    }

    private void prependViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].prependToSpan(view);
        }
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private void updateRemainingSpans(Span span, int i, int i2) {
        int deletedSize = span.getDeletedSize();
        if (i == -1) {
            if (span.getStartLine() + deletedSize <= i2) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
        } else if (span.getEndLine() - deletedSize >= i2) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    private int getMaxStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
    }

    private int getMaxEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private void recycleFromStart(Recycler recycler, int i) {
        while (getChildCount() > 0) {
            int i2 = 0;
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > i || this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i3 = 0;
                while (i3 < this.mSpanCount) {
                    if (this.mSpans[i3].mViews.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                while (i2 < this.mSpanCount) {
                    this.mSpans[i2].popStart();
                    i2++;
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popStart();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void recycleFromEnd(Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) < i || this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i2 = 0;
                while (i2 < this.mSpanCount) {
                    if (this.mSpans[i2].mViews.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].popEnd();
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popEnd();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private boolean preferLastSpan(int i) {
        boolean z = true;
        if (this.mOrientation == 0) {
            if ((i == -1) == this.mShouldReverseLayout) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.mShouldReverseLayout) != isLayoutRTL()) {
            z = false;
        }
        return z;
    }

    private Span getNextSpan(LayoutState layoutState) {
        int i;
        int i2;
        int i3 = -1;
        if (preferLastSpan(layoutState.mLayoutDirection)) {
            i = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.mSpanCount;
            i2 = 1;
        }
        Span span = null;
        int i4;
        int startAfterPadding;
        Span span2;
        int endLine;
        if (layoutState.mLayoutDirection == 1) {
            i4 = Integer.MAX_VALUE;
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            while (i != i3) {
                span2 = this.mSpans[i];
                endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i4) {
                    span = span2;
                    i4 = endLine;
                }
                i += i2;
            }
            return span;
        }
        i4 = Integer.MIN_VALUE;
        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        while (i != i3) {
            span2 = this.mSpans[i];
            endLine = span2.getStartLine(startAfterPadding);
            if (endLine > i4) {
                span = span2;
                i4 = endLine;
            }
            i += i2;
        }
        return span;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    private int calculateScrollDirectionForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.mShouldReverseLayout) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < getFirstChildPosition()) == this.mShouldReverseLayout) {
            i2 = 1;
        }
        return i2;
    }

    public PointF computeScrollVectorForPosition(int i) {
        i = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (i == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = (float) i;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i;
        }
        return pointF;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public void scrollToPosition(int i) {
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mAnchorPosition == i)) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        requestLayout();
    }

    @RestrictTo({Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            prepareLayoutStateForDelta(i, state);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            i = 0;
            int i3 = 0;
            for (i2 = 0; i2 < this.mSpanCount; i2++) {
                int i4;
                int startLine;
                if (this.mLayoutState.mItemDirection == -1) {
                    i4 = this.mLayoutState.mStartLine;
                    startLine = this.mSpans[i2].getStartLine(this.mLayoutState.mStartLine);
                } else {
                    i4 = this.mSpans[i2].getEndLine(this.mLayoutState.mEndLine);
                    startLine = this.mLayoutState.mEndLine;
                }
                i4 -= startLine;
                if (i4 >= 0) {
                    this.mPrefetchDistances[i3] = i4;
                    i3++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i3);
            while (i < i3 && this.mLayoutState.hasMore(state)) {
                layoutPrefetchRegistry.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[i]);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
                i++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void prepareLayoutStateForDelta(int i, State state) {
        int lastChildPosition;
        int i2;
        if (i > 0) {
            lastChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            lastChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        this.mLayoutState.mRecycle = true;
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i2);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = lastChildPosition + layoutState.mItemDirection;
        this.mLayoutState.mAvailable = Math.abs(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int scrollBy(int i, Recycler recycler, State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.mAvailable >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.offsetChildren(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mAvailable = 0;
        recycle(recycler, layoutState);
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* Access modifiers changed, original: 0000 */
    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Nullable
    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        if (getChildCount() == 0) {
            return null;
        }
        view = findContainingItemView(view);
        if (view == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        i = convertFocusDirectionToLayoutDirection(i);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        int lastChildPosition;
        View focusableViewAfter;
        int findFirstPartiallyVisibleItemPosition;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        if (i == 1) {
            lastChildPosition = getLastChildPosition();
        } else {
            lastChildPosition = getFirstChildPosition();
        }
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = layoutState.mItemDirection + lastChildPosition;
        this.mLayoutState.mAvailable = (int) (((float) this.mPrimaryOrientation.getTotalSpace()) * MAX_SCROLL_FACTOR);
        layoutState = this.mLayoutState;
        layoutState.mStopInFocusable = true;
        int i2 = 0;
        layoutState.mRecycle = false;
        fill(recycler, layoutState, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z) {
            View focusableViewAfter2 = span.getFocusableViewAfter(lastChildPosition, i);
            if (!(focusableViewAfter2 == null || focusableViewAfter2 == view)) {
                return focusableViewAfter2;
            }
        }
        int i3;
        if (preferLastSpan(i)) {
            for (i3 = this.mSpanCount - 1; i3 >= 0; i3--) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        } else {
            for (i3 = 0; i3 < this.mSpanCount; i3++) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        }
        Object obj = (this.mReverseLayout ^ 1) == (i == -1 ? 1 : 0) ? 1 : null;
        if (!z) {
            if (obj != null) {
                findFirstPartiallyVisibleItemPosition = span.findFirstPartiallyVisibleItemPosition();
            } else {
                findFirstPartiallyVisibleItemPosition = span.findLastPartiallyVisibleItemPosition();
            }
            focusableViewAfter = findViewByPosition(findFirstPartiallyVisibleItemPosition);
            if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                return focusableViewAfter;
            }
        }
        if (preferLastSpan(i)) {
            for (i = this.mSpanCount - 1; i >= 0; i--) {
                if (i != span.mIndex) {
                    if (obj != null) {
                        findFirstPartiallyVisibleItemPosition = this.mSpans[i].findFirstPartiallyVisibleItemPosition();
                    } else {
                        findFirstPartiallyVisibleItemPosition = this.mSpans[i].findLastPartiallyVisibleItemPosition();
                    }
                    focusableViewAfter = findViewByPosition(findFirstPartiallyVisibleItemPosition);
                    if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                        return focusableViewAfter;
                    }
                }
            }
        } else {
            while (i2 < this.mSpanCount) {
                if (obj != null) {
                    i = this.mSpans[i2].findFirstPartiallyVisibleItemPosition();
                } else {
                    i = this.mSpans[i2].findLastPartiallyVisibleItemPosition();
                }
                View findViewByPosition = findViewByPosition(i);
                if (findViewByPosition != null && findViewByPosition != view) {
                    return findViewByPosition;
                }
                i2++;
            }
        }
        return null;
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        } else {
            if (i == 2) {
                return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
            } else {
                if (i == 17) {
                    if (this.mOrientation != 0) {
                        i2 = Integer.MIN_VALUE;
                    }
                    return i2;
                } else if (i == 33) {
                    if (this.mOrientation != 1) {
                        i2 = Integer.MIN_VALUE;
                    }
                    return i2;
                } else if (i == 66) {
                    if (this.mOrientation != 0) {
                        i3 = Integer.MIN_VALUE;
                    }
                    return i3;
                } else if (i != 130) {
                    return Integer.MIN_VALUE;
                } else {
                    if (this.mOrientation != 1) {
                        i3 = Integer.MIN_VALUE;
                    }
                    return i3;
                }
            }
        }
    }
}
