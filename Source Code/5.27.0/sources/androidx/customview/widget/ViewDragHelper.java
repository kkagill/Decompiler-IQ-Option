package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }
    };
    private int mActivePointerId = -1;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @Px int i3, @Px int i4) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (((float) create.mTouchSlop) * (1.0f / f));
        return create;
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (callback != null) {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mEdgeSize = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = new OverScroller(context, sInterpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public void setMinVelocity(float f) {
        this.mMinVelocity = f;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.mTrackingEdges = i;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public void captureChildView(@NonNull View view, int i) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i;
            this.mCallback.onViewCaptured(view, i);
            setDragState(1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        stringBuilder.append(this.mParentView);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i, int i2) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        if (!(forceSettleCapturedViewAt || this.mDragState != 0 || this.mCapturedView == null)) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i, i2, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        i -= left;
        i2 -= top;
        if (i == 0 && i2 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i, i2, computeSettleDuration(this.mCapturedView, i, i2, i3, i4));
        setDragState(2);
        return true;
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        i3 = clampMag(i3, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        i4 = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int abs4 = Math.abs(i4);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (i3 != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        f /= f2;
        if (i4 != 0) {
            f3 = (float) abs4;
            f2 = (float) i5;
        } else {
            f3 = (float) abs2;
            f2 = (float) i6;
        }
        f3 /= f2;
        return (int) ((((float) computeAxisDuration(i, i3, this.mCallback.getViewHorizontalDragRange(view))) * f) + (((float) computeAxisDuration(i2, i4, this.mCallback.getViewVerticalDragRange(view))) * f3));
    }

    private int computeAxisDuration(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f = (float) (width / 2);
        f += distanceInfluenceForSnapDuration(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f;
        i2 = Math.abs(i2);
        if (i2 > 0) {
            i = Math.round(Math.abs(f / ((float) i2)) * 1000.0f) * 4;
        } else {
            i = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i, 600);
    }

    private int clampMag(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    private float clampMag(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (this.mReleaseInProgress) {
            this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i, i3, i2, i4);
            setDragState(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public boolean continueSettling(boolean z) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (!(left == 0 && top == 0)) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        if (this.mDragState == 2) {
            return true;
        }
        return false;
    }

    private void dispatchViewReleased(float f, float f2) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f, f2);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private void clearMotionHistory(int i) {
        if (this.mInitialMotionX != null && isPointerDown(i)) {
            this.mInitialMotionX[i] = 0.0f;
            this.mInitialMotionY[i] = 0.0f;
            this.mLastMotionX[i] = 0.0f;
            this.mLastMotionY[i] = 0.0f;
            this.mInitialEdgesTouched[i] = 0;
            this.mEdgeDragsInProgress[i] = 0;
            this.mEdgeDragsLocked[i] = 0;
            this.mPointersDown = ((1 << i) ^ -1) & this.mPointersDown;
        }
    }

    private void ensureMotionHistorySizeForId(int i) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i) {
            i++;
            fArr = new float[i];
            float[] fArr2 = new float[i];
            float[] fArr3 = new float[i];
            float[] fArr4 = new float[i];
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            float[] fArr5 = this.mInitialMotionX;
            if (fArr5 != null) {
                System.arraycopy(fArr5, 0, fArr, 0, fArr5.length);
                fArr5 = this.mInitialMotionY;
                System.arraycopy(fArr5, 0, fArr2, 0, fArr5.length);
                fArr5 = this.mLastMotionX;
                System.arraycopy(fArr5, 0, fArr3, 0, fArr5.length);
                fArr5 = this.mLastMotionY;
                System.arraycopy(fArr5, 0, fArr4, 0, fArr5.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                iArr4 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                iArr4 = this.mEdgeDragsLocked;
                System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            }
            this.mInitialMotionX = fArr;
            this.mInitialMotionY = fArr2;
            this.mLastMotionX = fArr3;
            this.mLastMotionY = fArr4;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i] = f;
        fArr[i] = f;
        fArr = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        fArr[i] = f2;
        this.mInitialEdgesTouched[i] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << i;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public boolean isPointerDown(int i) {
        return ((1 << i) & this.mPointersDown) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void setDragState(int i) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i) {
            this.mDragState = i;
            this.mCallback.onViewDragStateChanged(i);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean tryCaptureViewForDrag(View view, int i) {
        if (view == this.mCapturedView && this.mActivePointerId == i) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i)) {
            return false;
        }
        this.mActivePointerId = i;
        captureChildView(view, i);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean canScroll(@NonNull View view, boolean z, int i, int i2, int i3, int i4) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i4 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!(z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2)))) {
            z2 = false;
        }
        return z2;
    }

    /* JADX WARNING: Missing block: B:45:0x00dd, code skipped:
            if (r12 != r11) goto L_0x00e6;
     */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r17.getActionMasked();
        r3 = r17.getActionIndex();
        if (r2 != 0) goto L_0x0011;
    L_0x000e:
        r16.cancel();
    L_0x0011:
        r4 = r0.mVelocityTracker;
        if (r4 != 0) goto L_0x001b;
    L_0x0015:
        r4 = android.view.VelocityTracker.obtain();
        r0.mVelocityTracker = r4;
    L_0x001b:
        r4 = r0.mVelocityTracker;
        r4.addMovement(r1);
        r4 = 2;
        r6 = 1;
        if (r2 == 0) goto L_0x0104;
    L_0x0024:
        if (r2 == r6) goto L_0x00ff;
    L_0x0026:
        if (r2 == r4) goto L_0x0070;
    L_0x0028:
        r7 = 3;
        if (r2 == r7) goto L_0x00ff;
    L_0x002b:
        r7 = 5;
        if (r2 == r7) goto L_0x003c;
    L_0x002e:
        r4 = 6;
        if (r2 == r4) goto L_0x0034;
    L_0x0031:
        r5 = 0;
        goto L_0x0135;
    L_0x0034:
        r1 = r1.getPointerId(r3);
        r0.clearMotionHistory(r1);
        goto L_0x0031;
    L_0x003c:
        r2 = r1.getPointerId(r3);
        r7 = r1.getX(r3);
        r1 = r1.getY(r3);
        r0.saveInitialMotion(r7, r1, r2);
        r3 = r0.mDragState;
        if (r3 != 0) goto L_0x0060;
    L_0x004f:
        r1 = r0.mInitialEdgesTouched;
        r1 = r1[r2];
        r3 = r0.mTrackingEdges;
        r4 = r1 & r3;
        if (r4 == 0) goto L_0x0031;
    L_0x0059:
        r4 = r0.mCallback;
        r1 = r1 & r3;
        r4.onEdgeTouched(r1, r2);
        goto L_0x0031;
    L_0x0060:
        if (r3 != r4) goto L_0x0031;
    L_0x0062:
        r3 = (int) r7;
        r1 = (int) r1;
        r1 = r0.findTopChildUnder(r3, r1);
        r3 = r0.mCapturedView;
        if (r1 != r3) goto L_0x0031;
    L_0x006c:
        r0.tryCaptureViewForDrag(r1, r2);
        goto L_0x0031;
    L_0x0070:
        r2 = r0.mInitialMotionX;
        if (r2 == 0) goto L_0x0031;
    L_0x0074:
        r2 = r0.mInitialMotionY;
        if (r2 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0031;
    L_0x0079:
        r2 = r17.getPointerCount();
        r3 = 0;
    L_0x007e:
        if (r3 >= r2) goto L_0x00fa;
    L_0x0080:
        r4 = r1.getPointerId(r3);
        r7 = r0.isValidPointerForActionMove(r4);
        if (r7 != 0) goto L_0x008c;
    L_0x008a:
        goto L_0x00f7;
    L_0x008c:
        r7 = r1.getX(r3);
        r8 = r1.getY(r3);
        r9 = r0.mInitialMotionX;
        r9 = r9[r4];
        r9 = r7 - r9;
        r10 = r0.mInitialMotionY;
        r10 = r10[r4];
        r10 = r8 - r10;
        r7 = (int) r7;
        r8 = (int) r8;
        r7 = r0.findTopChildUnder(r7, r8);
        if (r7 == 0) goto L_0x00b0;
    L_0x00a8:
        r8 = r0.checkTouchSlop(r7, r9, r10);
        if (r8 == 0) goto L_0x00b0;
    L_0x00ae:
        r8 = 1;
        goto L_0x00b1;
    L_0x00b0:
        r8 = 0;
    L_0x00b1:
        if (r8 == 0) goto L_0x00e6;
    L_0x00b3:
        r11 = r7.getLeft();
        r12 = (int) r9;
        r13 = r11 + r12;
        r14 = r0.mCallback;
        r12 = r14.clampViewPositionHorizontal(r7, r13, r12);
        r13 = r7.getTop();
        r14 = (int) r10;
        r15 = r13 + r14;
        r5 = r0.mCallback;
        r5 = r5.clampViewPositionVertical(r7, r15, r14);
        r14 = r0.mCallback;
        r14 = r14.getViewHorizontalDragRange(r7);
        r15 = r0.mCallback;
        r15 = r15.getViewVerticalDragRange(r7);
        if (r14 == 0) goto L_0x00df;
    L_0x00db:
        if (r14 <= 0) goto L_0x00e6;
    L_0x00dd:
        if (r12 != r11) goto L_0x00e6;
    L_0x00df:
        if (r15 == 0) goto L_0x00fa;
    L_0x00e1:
        if (r15 <= 0) goto L_0x00e6;
    L_0x00e3:
        if (r5 != r13) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00fa;
    L_0x00e6:
        r0.reportNewEdgeDrags(r9, r10, r4);
        r5 = r0.mDragState;
        if (r5 != r6) goto L_0x00ee;
    L_0x00ed:
        goto L_0x00fa;
    L_0x00ee:
        if (r8 == 0) goto L_0x00f7;
    L_0x00f0:
        r4 = r0.tryCaptureViewForDrag(r7, r4);
        if (r4 == 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00fa;
    L_0x00f7:
        r3 = r3 + 1;
        goto L_0x007e;
    L_0x00fa:
        r16.saveLastMotion(r17);
        goto L_0x0031;
    L_0x00ff:
        r16.cancel();
        goto L_0x0031;
    L_0x0104:
        r2 = r17.getX();
        r3 = r17.getY();
        r5 = 0;
        r1 = r1.getPointerId(r5);
        r0.saveInitialMotion(r2, r3, r1);
        r2 = (int) r2;
        r3 = (int) r3;
        r2 = r0.findTopChildUnder(r2, r3);
        r3 = r0.mCapturedView;
        if (r2 != r3) goto L_0x0125;
    L_0x011e:
        r3 = r0.mDragState;
        if (r3 != r4) goto L_0x0125;
    L_0x0122:
        r0.tryCaptureViewForDrag(r2, r1);
    L_0x0125:
        r2 = r0.mInitialEdgesTouched;
        r2 = r2[r1];
        r3 = r0.mTrackingEdges;
        r4 = r2 & r3;
        if (r4 == 0) goto L_0x0135;
    L_0x012f:
        r4 = r0.mCallback;
        r2 = r2 & r3;
        r4.onEdgeTouched(r2, r1);
    L_0x0135:
        r1 = r0.mDragState;
        if (r1 != r6) goto L_0x013a;
    L_0x0139:
        r5 = 1;
    L_0x013a:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i = 0;
        float x;
        float y;
        int pointerId;
        if (actionMasked == 0) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            pointerId = motionEvent.getPointerId(0);
            View findTopChildUnder = findTopChildUnder((int) x, (int) y);
            saveInitialMotion(x, y, pointerId);
            tryCaptureViewForDrag(findTopChildUnder, pointerId);
            actionMasked = this.mInitialEdgesTouched[pointerId];
            actionIndex = this.mTrackingEdges;
            if ((actionMasked & actionIndex) != 0) {
                this.mCallback.onEdgeTouched(actionMasked & actionIndex, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.mDragState == 1) {
                    dispatchViewReleased(0.0f, 0.0f);
                }
                cancel();
            } else if (actionMasked == 5) {
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                saveInitialMotion(x2, y2, actionMasked);
                if (this.mDragState == 0) {
                    tryCaptureViewForDrag(findTopChildUnder((int) x2, (int) y2), actionMasked);
                    pointerId = this.mInitialEdgesTouched[actionMasked];
                    actionIndex = this.mTrackingEdges;
                    if ((pointerId & actionIndex) != 0) {
                        this.mCallback.onEdgeTouched(pointerId & actionIndex, actionMasked);
                    }
                } else if (isCapturedViewUnder((int) x2, (int) y2)) {
                    tryCaptureViewForDrag(this.mCapturedView, actionMasked);
                }
            } else if (actionMasked == 6) {
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.mDragState == 1 && actionMasked == this.mActivePointerId) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (pointerId2 != this.mActivePointerId) {
                            View findTopChildUnder2 = findTopChildUnder((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view = this.mCapturedView;
                            if (findTopChildUnder2 == view && tryCaptureViewForDrag(view, pointerId2)) {
                                pointerId = this.mActivePointerId;
                                break;
                            }
                        }
                        i++;
                    }
                    pointerId = -1;
                    if (pointerId == -1) {
                        releaseViewForPointerUp();
                    }
                }
                clearMotionHistory(actionMasked);
            }
        } else if (this.mDragState != 1) {
            actionMasked = motionEvent.getPointerCount();
            while (i < actionMasked) {
                actionIndex = motionEvent.getPointerId(i);
                if (isValidPointerForActionMove(actionIndex)) {
                    float x3 = motionEvent.getX(i);
                    float y3 = motionEvent.getY(i);
                    float f = x3 - this.mInitialMotionX[actionIndex];
                    float f2 = y3 - this.mInitialMotionY[actionIndex];
                    reportNewEdgeDrags(f, f2, actionIndex);
                    if (this.mDragState != 1) {
                        View findTopChildUnder3 = findTopChildUnder((int) x3, (int) y3);
                        if (checkTouchSlop(findTopChildUnder3, f, f2) && tryCaptureViewForDrag(findTopChildUnder3, actionIndex)) {
                            break;
                        }
                    }
                    break;
                }
                i++;
            }
            saveLastMotion(motionEvent);
        } else if (isValidPointerForActionMove(this.mActivePointerId)) {
            actionMasked = motionEvent.findPointerIndex(this.mActivePointerId);
            y = motionEvent.getX(actionMasked);
            x = motionEvent.getY(actionMasked);
            float[] fArr = this.mLastMotionX;
            int i2 = this.mActivePointerId;
            actionIndex = (int) (y - fArr[i2]);
            actionMasked = (int) (x - this.mLastMotionY[i2]);
            dragTo(this.mCapturedView.getLeft() + actionIndex, this.mCapturedView.getTop() + actionMasked, actionIndex, actionMasked);
            saveLastMotion(motionEvent);
        }
    }

    private void reportNewEdgeDrags(float f, float f2, int i) {
        int i2 = 1;
        if (!checkNewEdgeDrag(f, f2, i, 1)) {
            i2 = 0;
        }
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i] = iArr[i] | i2;
            this.mCallback.onEdgeDragStarted(i2, i);
        }
    }

    private boolean checkNewEdgeDrag(float f, float f2, int i, int i2) {
        f = Math.abs(f);
        f2 = Math.abs(f2);
        boolean z = false;
        if (!((this.mInitialEdgesTouched[i] & i2) != i2 || (this.mTrackingEdges & i2) == 0 || (this.mEdgeDragsLocked[i] & i2) == i2 || (this.mEdgeDragsInProgress[i] & i2) == i2)) {
            int i3 = this.mTouchSlop;
            if (f > ((float) i3) || f2 > ((float) i3)) {
                if (f < f2 * 0.5f && this.mCallback.onEdgeLock(i2)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.mEdgeDragsInProgress[i] & i2) == 0 && f > ((float) this.mTouchSlop)) {
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Object obj = this.mCallback.getViewHorizontalDragRange(view) > 0 ? 1 : null;
        Object obj2 = this.mCallback.getViewVerticalDragRange(view) > 0 ? 1 : null;
        if (obj != null && obj2 != null) {
            f = (f * f) + (f2 * f2);
            int i = this.mTouchSlop;
            if (f > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.mTouchSlop)) {
                z = true;
            }
            return z;
        } else {
            if (obj2 != null && Math.abs(f2) > ((float) this.mTouchSlop)) {
                z = true;
            }
            return z;
        }
    }

    public boolean checkTouchSlop(int i) {
        int length = this.mInitialMotionX.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        boolean z = false;
        if (!isPointerDown(i2)) {
            return false;
        }
        Object obj = (i & 1) == 1 ? 1 : null;
        Object obj2 = (i & 2) == 2 ? 1 : null;
        float f = this.mLastMotionX[i2] - this.mInitialMotionX[i2];
        float f2 = this.mLastMotionY[i2] - this.mInitialMotionY[i2];
        if (obj != null && obj2 != null) {
            f = (f * f) + (f2 * f2);
            i = this.mTouchSlop;
            if (f > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (obj != null) {
            if (Math.abs(f) > ((float) this.mTouchSlop)) {
                z = true;
            }
            return z;
        } else {
            if (obj2 != null && Math.abs(f2) > ((float) this.mTouchSlop)) {
                z = true;
            }
            return z;
        }
    }

    public boolean isEdgeTouched(int i) {
        int length = this.mInitialEdgesTouched.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (i & this.mInitialEdgesTouched[i2]) != 0;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i3 != 0) {
            i = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i, i3);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i2, i4);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, i5, i6, i5 - left, i6 - top);
        }
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.mCapturedView, i, i2);
    }

    public boolean isViewUnder(@Nullable View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    @Nullable
    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = i < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i2 < this.mParentView.getTop() + this.mEdgeSize) {
            i3 |= 4;
        }
        if (i > this.mParentView.getRight() - this.mEdgeSize) {
            i3 |= 2;
        }
        return i2 > this.mParentView.getBottom() - this.mEdgeSize ? i3 | 8 : i3;
    }

    private boolean isValidPointerForActionMove(int i) {
        if (isPointerDown(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e(TAG, stringBuilder.toString());
        return false;
    }
}
