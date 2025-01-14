package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.State;

class LayoutState {
    static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    static final String TAG = "LayoutState";
    int mAvailable;
    int mCurrentPosition;
    int mEndLine = 0;
    boolean mInfinite;
    int mItemDirection;
    int mLayoutDirection;
    boolean mRecycle = true;
    int mStartLine = 0;
    boolean mStopInFocusable;

    LayoutState() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasMore(State state) {
        int i = this.mCurrentPosition;
        return i >= 0 && i < state.getItemCount();
    }

    /* Access modifiers changed, original: 0000 */
    public View next(Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutState{mAvailable=");
        stringBuilder.append(this.mAvailable);
        stringBuilder.append(", mCurrentPosition=");
        stringBuilder.append(this.mCurrentPosition);
        stringBuilder.append(", mItemDirection=");
        stringBuilder.append(this.mItemDirection);
        stringBuilder.append(", mLayoutDirection=");
        stringBuilder.append(this.mLayoutDirection);
        stringBuilder.append(", mStartLine=");
        stringBuilder.append(this.mStartLine);
        stringBuilder.append(", mEndLine=");
        stringBuilder.append(this.mEndLine);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
