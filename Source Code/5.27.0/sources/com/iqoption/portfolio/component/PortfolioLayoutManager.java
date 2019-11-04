package com.iqoption.portfolio.component;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.State;
import com.iqoption.util.e;

public final class PortfolioLayoutManager extends LayoutManager implements ScrollVectorProvider {
    public static final String TAG = "com.iqoption.portfolio.component.PortfolioLayoutManager";
    private final SparseArray<View> dLZ;
    private final b dMa;
    private int dMb;
    private int dMc;
    private View dMd;
    private View dMe;
    private final a dMf;
    private int dMg;
    private int dMh;

    private static final class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            /* renamed from: ak */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: gR */
            public a[] newArray(int i) {
                return new a[i];
            }
        };
        int bottom;
        int position;
        int top;

        public int describeContents() {
            return 0;
        }

        a() {
        }

        /* Access modifiers changed, original: 0000 */
        public void a(a aVar) {
            this.top = aVar.top;
            this.bottom = aVar.bottom;
            this.position = aVar.position;
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            this.top = 0;
            this.bottom = 0;
            this.position = 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.top);
            parcel.writeInt(this.bottom);
            parcel.writeInt(this.position);
        }

        protected a(Parcel parcel) {
            this.top = parcel.readInt();
            this.bottom = parcel.readInt();
            this.position = parcel.readInt();
        }

        public boolean a(PortfolioLayoutManager portfolioLayoutManager) {
            return this.position >= portfolioLayoutManager.getItemCount();
        }
    }

    public interface b {
        int gS(int i);
    }

    private boolean gN(int i) {
        return i == 1 || i == 4;
    }

    private boolean gO(int i) {
        return i == 2 || i == 5;
    }

    private boolean gP(int i) {
        return i == -3 || i == 3 || i == 6;
    }

    public boolean canScrollVertically() {
        return true;
    }

    public Parcelable onSaveInstanceState() {
        return new e().a("key.anchor", this.dMf).toBundle();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            this.dMf.a((a) ((Bundle) parcelable).getParcelable("key.anchor"));
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        Recycler recycler2;
        detachAndScrapAttachedViews(recycler);
        this.dLZ.clear();
        if (this.dMf.a(this)) {
            this.dMf.reset();
        }
        this.dMd = null;
        this.dMb = -1;
        this.dMe = null;
        this.dMc = -1;
        b(recycler, state);
        c(recycler, state);
        int childCount = getChildCount();
        if (childCount <= state.getItemCount()) {
            int paddingBottom = (getPaddingBottom() + getHeight()) - getDecoratedBottom(getChildAt(childCount - 1));
            if (paddingBottom > 0) {
                View childAt = getChildAt(0);
                int position = getPosition(childAt) - 1;
                int top = childAt.getTop();
                int i = position;
                Object obj = 1;
                int i2 = 0;
                while (obj != null && i >= 0) {
                    View viewForPosition = recycler.getViewForPosition(i);
                    addView(viewForPosition, 0);
                    measureChildWithMargins(viewForPosition, 0, 0);
                    int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
                    layoutDecoratedWithMargins(viewForPosition, 0, top - decoratedMeasuredHeight, getDecoratedMeasuredWidth(viewForPosition), top);
                    top = getDecoratedTop(viewForPosition);
                    i2 += decoratedMeasuredHeight;
                    obj = paddingBottom > i2 ? 1 : null;
                    i--;
                }
                recycler2 = recycler;
                offsetChildrenVertical(Math.min(paddingBottom, i2));
                aRl();
                a(recycler, state);
                if (this.dMg != -1 && this.dMh != -1) {
                    this.dMg = -1;
                    this.dMh = -1;
                    return;
                }
            }
        }
        recycler2 = recycler;
        aRl();
        a(recycler, state);
        if (this.dMg != -1) {
        }
    }

    private void a(Recycler recycler, State state) {
        if (getChildCount() > 1) {
            int i = 0;
            View childAt = getChildAt(0);
            int position = getPosition(childAt);
            int itemViewType = getItemViewType(childAt);
            View childAt2 = getChildAt(1);
            int position2 = getPosition(childAt2);
            int itemViewType2 = getItemViewType(childAt2);
            View view;
            View view2;
            int decoratedMeasuredHeight;
            if (this.dMd != null) {
                int decoratedTop;
                int i2;
                if (gN(itemViewType) && gP(itemViewType2)) {
                    itemViewType = this.dMb;
                    if (position >= itemViewType || position2 <= itemViewType) {
                        this.dMd = childAt;
                        this.dMb = position;
                        detachView(this.dMd);
                        attachView(this.dMd);
                        view = this.dMd;
                        layoutDecoratedWithMargins(view, 0, 0, getDecoratedMeasuredWidth(view), getDecoratedMeasuredHeight(this.dMd));
                    } else {
                        attachView(this.dMd, 1);
                        this.dLZ.remove(this.dMb);
                        decoratedTop = getDecoratedTop(childAt2);
                        position2 = getDecoratedBottom(childAt);
                        view = this.dMd;
                        layoutDecoratedWithMargins(view, 0, position2, getDecoratedMeasuredWidth(view), decoratedTop);
                        this.dMd = null;
                        this.dMb = -1;
                    }
                    aRl();
                } else if (gP(itemViewType)) {
                    int gS = this.dMa.gS(position);
                    if (gS != this.dMb) {
                        itemViewType = getChildCount() - getHeadersCount();
                        i2 = 0;
                        while (i2 < itemViewType) {
                            position2 = i2 + 1;
                            childAt2 = getChildAt(i2);
                            if (this.dMb - getPosition(childAt2) == 1) {
                                attachView(this.dMd, position2);
                                this.dLZ.remove(this.dMb);
                                position2 = getDecoratedBottom(childAt2);
                                decoratedTop = position2 + getDecoratedMeasuredHeight(this.dMd);
                                view = this.dMd;
                                layoutDecoratedWithMargins(view, 0, position2, getDecoratedMeasuredWidth(view), decoratedTop);
                                aRl();
                                break;
                            }
                            i2 = position2 + 1;
                        }
                        this.dMb = gS;
                    }
                    view2 = (View) this.dLZ.get(this.dMb);
                    if (view2 == null) {
                        this.dMd = recycler.getViewForPosition(this.dMa.gS(position));
                        addView(this.dMd);
                        measureChildWithMargins(this.dMd, 0, 0);
                    } else {
                        this.dMd = view2;
                        attachView(this.dMd);
                        this.dLZ.remove(this.dMb);
                    }
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(this.dMd);
                    view = this.dMd;
                    layoutDecoratedWithMargins(view, 0, 0, getDecoratedMeasuredWidth(view), decoratedMeasuredHeight);
                    a(childAt, this.dMd, decoratedMeasuredHeight);
                } else {
                    if (position - this.dMb != 1 || getDecoratedTop(childAt) <= 0) {
                        itemViewType = getChildCount() - getHeadersCount();
                        i2 = getPosition(getChildAt(itemViewType - 1));
                        position2 = this.dMb;
                        if (position2 > position && position2 < i2) {
                            while (i < itemViewType) {
                                i2 = i + 1;
                                View childAt3 = getChildAt(i);
                                if (this.dMb - getPosition(childAt3) == 1) {
                                    attachView(this.dMd, i2);
                                    this.dLZ.remove(this.dMb);
                                    position2 = getDecoratedBottom(childAt3);
                                    decoratedTop = position2 + getDecoratedMeasuredHeight(this.dMd);
                                    view = this.dMd;
                                    layoutDecoratedWithMargins(view, 0, position2, getDecoratedMeasuredWidth(view), decoratedTop);
                                    aRl();
                                    break;
                                }
                                i = i2 + 1;
                            }
                        }
                    } else {
                        attachView(this.dMd, 0);
                        this.dLZ.remove(this.dMb);
                    }
                    this.dMd = null;
                    this.dMb = -1;
                }
            } else if (gN(itemViewType) && gP(itemViewType2) && getDecoratedTop(childAt) < 0) {
                this.dMd = childAt;
                this.dMb = position;
                detachView(this.dMd);
                attachView(this.dMd);
                view = this.dMd;
                layoutDecoratedWithMargins(view, 0, 0, getDecoratedMeasuredWidth(view), getDecoratedMeasuredHeight(this.dMd));
                aRl();
            } else if (gP(itemViewType)) {
                this.dMb = this.dMa.gS(position);
                view2 = (View) this.dLZ.get(this.dMb);
                if (view2 == null) {
                    this.dMd = recycler.getViewForPosition(this.dMa.gS(position));
                    addView(this.dMd);
                    measureChildWithMargins(this.dMd, 0, 0);
                } else {
                    this.dMd = view2;
                    attachView(this.dMd);
                    this.dLZ.remove(this.dMb);
                }
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(this.dMd);
                view = this.dMd;
                layoutDecoratedWithMargins(view, 0, 0, getDecoratedMeasuredWidth(view), decoratedMeasuredHeight);
                a(childAt, this.dMd, decoratedMeasuredHeight);
            } else {
                this.dMd = null;
                this.dMb = -1;
            }
        }
    }

    private void a(View view, View view2, int i) {
        int decoratedBottom = getDecoratedBottom(view);
        int i2 = 1;
        while (decoratedBottom < i) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            decoratedBottom += getDecoratedBottom(childAt);
            int itemViewType = getItemViewType(childAt);
            if (gN(itemViewType) || gO(itemViewType)) {
                i -= getDecoratedTop(childAt);
                break;
            }
            i2 = i3;
        }
        i = 0;
        if (i != 0) {
            ViewCompat.offsetTopAndBottom(view2, -i);
        }
    }

    private boolean gQ(int i) {
        return i == this.dMb || i == this.dMc;
    }

    private int getHeadersCount() {
        if (this.dMd == null) {
            return 0;
        }
        if (this.dMe != null) {
            return 2;
        }
        return 1;
    }

    private void b(Recycler recycler, State state) {
        int i = this.dMf.position - 1;
        int i2 = this.dMf.top;
        int i3 = i;
        Object obj = 1;
        while (obj != null && i3 >= 0) {
            if (gQ(i3)) {
                i2 -= getDecoratedMeasuredHeight(this.dMd);
            } else {
                View view = (View) this.dLZ.get(i3);
                if (view == null) {
                    view = recycler.getViewForPosition(i3);
                    addView(view, 0);
                    measureChildWithMargins(view, 0, 0);
                    layoutDecoratedWithMargins(view, 0, i2 - getDecoratedMeasuredHeight(view), getDecoratedMeasuredWidth(view), i2);
                } else {
                    attachView(view, 0);
                    this.dLZ.remove(i3);
                }
                i2 = getDecoratedTop(view);
            }
            obj = i2 > 0 ? 1 : null;
            i3--;
        }
    }

    private void c(Recycler recycler, State state) {
        int height = getHeight();
        int itemCount = state.getItemCount();
        int i = this.dMf.position;
        int i2 = this.dMf.top;
        int i3 = i;
        Object obj = 1;
        while (obj != null && i3 < itemCount) {
            View view = (View) this.dLZ.get(i3);
            if (view == null) {
                view = recycler.getViewForPosition(i3);
                addView(view);
                measureChildWithMargins(view, 0, 0);
                layoutDecoratedWithMargins(view, 0, i2, getDecoratedMeasuredWidth(view), i2 + getDecoratedMeasuredHeight(view));
            } else {
                attachView(view);
                this.dLZ.remove(i3);
            }
            i2 = getDecoratedBottom(view);
            obj = i2 <= height ? 1 : null;
            i3++;
        }
    }

    private void aRl() {
        this.dMf.reset();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (getDecoratedTop(childAt) >= 0) {
                this.dMf.position = getPosition(childAt);
                this.dMf.top = getDecoratedTop(childAt);
                this.dMf.bottom = getDecoratedBottom(childAt);
                return;
            }
        }
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        int i2;
        i = a(i, state);
        offsetChildrenVertical(-i);
        aRl();
        this.dLZ.clear();
        int childCount = getChildCount();
        while (true) {
            i2 = 0;
            if (childCount == 0) {
                break;
            }
            View childAt = getChildAt(0);
            this.dLZ.put(getPosition(childAt), childAt);
            detachView(childAt);
            childCount--;
        }
        b(recycler, state);
        c(recycler, state);
        a(recycler, state);
        int size = this.dLZ.size();
        while (i2 < size) {
            recycler.recycleView((View) this.dLZ.valueAt(i2));
            i2++;
        }
        return i;
    }

    private int a(int i, State state) {
        int childCount = getChildCount();
        int itemCount = state.getItemCount();
        if (childCount == 0) {
            return 0;
        }
        if (i < 0) {
            View childAt = getChildAt(0);
            childCount = getPosition(childAt);
            if (this.dMd != null) {
                int i2 = this.dMb;
                if (childCount - i2 == 1) {
                    if (i2 <= 0) {
                        i = Math.max(getDecoratedTop(childAt) - getDecoratedBottom(this.dMd), i);
                    }
                }
            }
            if (childCount <= 0) {
                i = Math.max(getDecoratedTop(childAt), i);
            }
        } else if (i > 0) {
            View childAt2 = getChildAt((childCount - 1) - getHeadersCount());
            if (getPosition(childAt2) >= itemCount - 1) {
                i = Math.min(getDecoratedBottom(childAt2) - getHeight(), i);
            }
        } else {
            i = 0;
        }
        return i;
    }

    public void scrollToPosition(int i) {
        this.dMf.reset();
        if (i != -1) {
            this.dMf.position = i;
        }
        requestLayout();
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        return new PointF(0.0f, (float) (i < getPosition(getChildAt(0)) ? -1 : 1));
    }
}
