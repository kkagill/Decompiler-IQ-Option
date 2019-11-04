package androidx.core.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class GestureDetectorCompat {
    private final GestureDetectorCompatImpl mImpl;

    interface GestureDetectorCompatImpl {
        boolean isLongpressEnabled();

        boolean onTouchEvent(MotionEvent motionEvent);

        void setIsLongpressEnabled(boolean z);

        void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener);
    }

    static class GestureDetectorCompatImplBase implements GestureDetectorCompatImpl {
        private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
        private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        MotionEvent mCurrentDownEvent;
        boolean mDeferConfirmSingleTap;
        OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        final OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private MotionEvent mPreviousUpEvent;
        boolean mStillDown;
        private int mTouchSlopSquare;
        private VelocityTracker mVelocityTracker;

        private class GestureHandler extends Handler {
            GestureHandler() {
            }

            GestureHandler(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    GestureDetectorCompatImplBase.this.mListener.onShowPress(GestureDetectorCompatImplBase.this.mCurrentDownEvent);
                } else if (i == 2) {
                    GestureDetectorCompatImplBase.this.dispatchLongPress();
                } else if (i != 3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown message ");
                    stringBuilder.append(message);
                    throw new RuntimeException(stringBuilder.toString());
                } else if (GestureDetectorCompatImplBase.this.mDoubleTapListener == null) {
                } else {
                    if (GestureDetectorCompatImplBase.this.mStillDown) {
                        GestureDetectorCompatImplBase.this.mDeferConfirmSingleTap = true;
                    } else {
                        GestureDetectorCompatImplBase.this.mDoubleTapListener.onSingleTapConfirmed(GestureDetectorCompatImplBase.this.mCurrentDownEvent);
                    }
                }
            }
        }

        GestureDetectorCompatImplBase(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.mHandler = new GestureHandler(handler);
            } else {
                this.mHandler = new GestureHandler();
            }
            this.mListener = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                setOnDoubleTapListener((OnDoubleTapListener) onGestureListener);
            }
            init(context);
        }

        private void init(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.mListener != null) {
                this.mIsLongpressEnabled = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
                this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
            this.mDoubleTapListener = onDoubleTapListener;
        }

        public void setIsLongpressEnabled(boolean z) {
            this.mIsLongpressEnabled = z;
        }

        public boolean isLongpressEnabled() {
            return this.mIsLongpressEnabled;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            /*
            r12 = this;
            r0 = r13.getAction();
            r1 = r12.mVelocityTracker;
            if (r1 != 0) goto L_0x000e;
        L_0x0008:
            r1 = android.view.VelocityTracker.obtain();
            r12.mVelocityTracker = r1;
        L_0x000e:
            r1 = r12.mVelocityTracker;
            r1.addMovement(r13);
            r0 = r0 & 255;
            r1 = 6;
            r2 = 1;
            r3 = 0;
            if (r0 != r1) goto L_0x001c;
        L_0x001a:
            r4 = 1;
            goto L_0x001d;
        L_0x001c:
            r4 = 0;
        L_0x001d:
            if (r4 == 0) goto L_0x0024;
        L_0x001f:
            r5 = r13.getActionIndex();
            goto L_0x0025;
        L_0x0024:
            r5 = -1;
        L_0x0025:
            r6 = r13.getPointerCount();
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
        L_0x002d:
            if (r8 >= r6) goto L_0x003f;
        L_0x002f:
            if (r5 != r8) goto L_0x0032;
        L_0x0031:
            goto L_0x003c;
        L_0x0032:
            r11 = r13.getX(r8);
            r9 = r9 + r11;
            r11 = r13.getY(r8);
            r10 = r10 + r11;
        L_0x003c:
            r8 = r8 + 1;
            goto L_0x002d;
        L_0x003f:
            if (r4 == 0) goto L_0x0044;
        L_0x0041:
            r4 = r6 + -1;
            goto L_0x0045;
        L_0x0044:
            r4 = r6;
        L_0x0045:
            r4 = (float) r4;
            r9 = r9 / r4;
            r10 = r10 / r4;
            r4 = 2;
            r5 = 3;
            if (r0 == 0) goto L_0x01bf;
        L_0x004c:
            r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            if (r0 == r2) goto L_0x0131;
        L_0x0050:
            if (r0 == r4) goto L_0x00ba;
        L_0x0052:
            if (r0 == r5) goto L_0x00b5;
        L_0x0054:
            r2 = 5;
            if (r0 == r2) goto L_0x00a8;
        L_0x0057:
            if (r0 == r1) goto L_0x005b;
        L_0x0059:
            goto L_0x024e;
        L_0x005b:
            r12.mLastFocusX = r9;
            r12.mDownFocusX = r9;
            r12.mLastFocusY = r10;
            r12.mDownFocusY = r10;
            r0 = r12.mVelocityTracker;
            r1 = r12.mMaximumFlingVelocity;
            r1 = (float) r1;
            r0.computeCurrentVelocity(r8, r1);
            r0 = r13.getActionIndex();
            r1 = r13.getPointerId(r0);
            r2 = r12.mVelocityTracker;
            r2 = r2.getXVelocity(r1);
            r4 = r12.mVelocityTracker;
            r1 = r4.getYVelocity(r1);
            r4 = 0;
        L_0x0080:
            if (r4 >= r6) goto L_0x024e;
        L_0x0082:
            if (r4 != r0) goto L_0x0085;
        L_0x0084:
            goto L_0x00a5;
        L_0x0085:
            r5 = r13.getPointerId(r4);
            r8 = r12.mVelocityTracker;
            r8 = r8.getXVelocity(r5);
            r8 = r8 * r2;
            r9 = r12.mVelocityTracker;
            r5 = r9.getYVelocity(r5);
            r5 = r5 * r1;
            r8 = r8 + r5;
            r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
            if (r5 >= 0) goto L_0x00a5;
        L_0x009e:
            r13 = r12.mVelocityTracker;
            r13.clear();
            goto L_0x024e;
        L_0x00a5:
            r4 = r4 + 1;
            goto L_0x0080;
        L_0x00a8:
            r12.mLastFocusX = r9;
            r12.mDownFocusX = r9;
            r12.mLastFocusY = r10;
            r12.mDownFocusY = r10;
            r12.cancelTaps();
            goto L_0x024e;
        L_0x00b5:
            r12.cancel();
            goto L_0x024e;
        L_0x00ba:
            r0 = r12.mInLongPress;
            if (r0 == 0) goto L_0x00c0;
        L_0x00be:
            goto L_0x024e;
        L_0x00c0:
            r0 = r12.mLastFocusX;
            r0 = r0 - r9;
            r1 = r12.mLastFocusY;
            r1 = r1 - r10;
            r6 = r12.mIsDoubleTapping;
            if (r6 == 0) goto L_0x00d3;
        L_0x00ca:
            r0 = r12.mDoubleTapListener;
            r13 = r0.onDoubleTapEvent(r13);
            r3 = r3 | r13;
            goto L_0x024e;
        L_0x00d3:
            r6 = r12.mAlwaysInTapRegion;
            if (r6 == 0) goto L_0x0111;
        L_0x00d7:
            r6 = r12.mDownFocusX;
            r6 = r9 - r6;
            r6 = (int) r6;
            r7 = r12.mDownFocusY;
            r7 = r10 - r7;
            r7 = (int) r7;
            r6 = r6 * r6;
            r7 = r7 * r7;
            r6 = r6 + r7;
            r7 = r12.mTouchSlopSquare;
            if (r6 <= r7) goto L_0x0108;
        L_0x00ea:
            r7 = r12.mListener;
            r8 = r12.mCurrentDownEvent;
            r13 = r7.onScroll(r8, r13, r0, r1);
            r12.mLastFocusX = r9;
            r12.mLastFocusY = r10;
            r12.mAlwaysInTapRegion = r3;
            r0 = r12.mHandler;
            r0.removeMessages(r5);
            r0 = r12.mHandler;
            r0.removeMessages(r2);
            r0 = r12.mHandler;
            r0.removeMessages(r4);
            goto L_0x0109;
        L_0x0108:
            r13 = 0;
        L_0x0109:
            r0 = r12.mTouchSlopSquare;
            if (r6 <= r0) goto L_0x01bc;
        L_0x010d:
            r12.mAlwaysInBiggerTapRegion = r3;
            goto L_0x01bc;
        L_0x0111:
            r2 = java.lang.Math.abs(r0);
            r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r2 >= 0) goto L_0x0123;
        L_0x011b:
            r2 = java.lang.Math.abs(r1);
            r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r2 < 0) goto L_0x024e;
        L_0x0123:
            r2 = r12.mListener;
            r3 = r12.mCurrentDownEvent;
            r3 = r2.onScroll(r3, r13, r0, r1);
            r12.mLastFocusX = r9;
            r12.mLastFocusY = r10;
            goto L_0x024e;
        L_0x0131:
            r12.mStillDown = r3;
            r0 = android.view.MotionEvent.obtain(r13);
            r1 = r12.mIsDoubleTapping;
            if (r1 == 0) goto L_0x0143;
        L_0x013b:
            r1 = r12.mDoubleTapListener;
            r13 = r1.onDoubleTapEvent(r13);
            r13 = r13 | r3;
            goto L_0x019b;
        L_0x0143:
            r1 = r12.mInLongPress;
            if (r1 == 0) goto L_0x014f;
        L_0x0147:
            r13 = r12.mHandler;
            r13.removeMessages(r5);
            r12.mInLongPress = r3;
            goto L_0x0191;
        L_0x014f:
            r1 = r12.mAlwaysInTapRegion;
            if (r1 == 0) goto L_0x0166;
        L_0x0153:
            r1 = r12.mListener;
            r1 = r1.onSingleTapUp(r13);
            r5 = r12.mDeferConfirmSingleTap;
            if (r5 == 0) goto L_0x0164;
        L_0x015d:
            r5 = r12.mDoubleTapListener;
            if (r5 == 0) goto L_0x0164;
        L_0x0161:
            r5.onSingleTapConfirmed(r13);
        L_0x0164:
            r13 = r1;
            goto L_0x019b;
        L_0x0166:
            r1 = r12.mVelocityTracker;
            r5 = r13.getPointerId(r3);
            r6 = r12.mMaximumFlingVelocity;
            r6 = (float) r6;
            r1.computeCurrentVelocity(r8, r6);
            r6 = r1.getYVelocity(r5);
            r1 = r1.getXVelocity(r5);
            r5 = java.lang.Math.abs(r6);
            r7 = r12.mMinimumFlingVelocity;
            r7 = (float) r7;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 > 0) goto L_0x0193;
        L_0x0185:
            r5 = java.lang.Math.abs(r1);
            r7 = r12.mMinimumFlingVelocity;
            r7 = (float) r7;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 <= 0) goto L_0x0191;
        L_0x0190:
            goto L_0x0193;
        L_0x0191:
            r13 = 0;
            goto L_0x019b;
        L_0x0193:
            r5 = r12.mListener;
            r7 = r12.mCurrentDownEvent;
            r13 = r5.onFling(r7, r13, r1, r6);
        L_0x019b:
            r1 = r12.mPreviousUpEvent;
            if (r1 == 0) goto L_0x01a2;
        L_0x019f:
            r1.recycle();
        L_0x01a2:
            r12.mPreviousUpEvent = r0;
            r0 = r12.mVelocityTracker;
            if (r0 == 0) goto L_0x01ae;
        L_0x01a8:
            r0.recycle();
            r0 = 0;
            r12.mVelocityTracker = r0;
        L_0x01ae:
            r12.mIsDoubleTapping = r3;
            r12.mDeferConfirmSingleTap = r3;
            r0 = r12.mHandler;
            r0.removeMessages(r2);
            r0 = r12.mHandler;
            r0.removeMessages(r4);
        L_0x01bc:
            r3 = r13;
            goto L_0x024e;
        L_0x01bf:
            r0 = r12.mDoubleTapListener;
            if (r0 == 0) goto L_0x01fb;
        L_0x01c3:
            r0 = r12.mHandler;
            r0 = r0.hasMessages(r5);
            if (r0 == 0) goto L_0x01d0;
        L_0x01cb:
            r1 = r12.mHandler;
            r1.removeMessages(r5);
        L_0x01d0:
            r1 = r12.mCurrentDownEvent;
            if (r1 == 0) goto L_0x01f3;
        L_0x01d4:
            r6 = r12.mPreviousUpEvent;
            if (r6 == 0) goto L_0x01f3;
        L_0x01d8:
            if (r0 == 0) goto L_0x01f3;
        L_0x01da:
            r0 = r12.isConsideredDoubleTap(r1, r6, r13);
            if (r0 == 0) goto L_0x01f3;
        L_0x01e0:
            r12.mIsDoubleTapping = r2;
            r0 = r12.mDoubleTapListener;
            r1 = r12.mCurrentDownEvent;
            r0 = r0.onDoubleTap(r1);
            r0 = r0 | r3;
            r1 = r12.mDoubleTapListener;
            r1 = r1.onDoubleTapEvent(r13);
            r0 = r0 | r1;
            goto L_0x01fc;
        L_0x01f3:
            r0 = r12.mHandler;
            r1 = DOUBLE_TAP_TIMEOUT;
            r6 = (long) r1;
            r0.sendEmptyMessageDelayed(r5, r6);
        L_0x01fb:
            r0 = 0;
        L_0x01fc:
            r12.mLastFocusX = r9;
            r12.mDownFocusX = r9;
            r12.mLastFocusY = r10;
            r12.mDownFocusY = r10;
            r1 = r12.mCurrentDownEvent;
            if (r1 == 0) goto L_0x020b;
        L_0x0208:
            r1.recycle();
        L_0x020b:
            r1 = android.view.MotionEvent.obtain(r13);
            r12.mCurrentDownEvent = r1;
            r12.mAlwaysInTapRegion = r2;
            r12.mAlwaysInBiggerTapRegion = r2;
            r12.mStillDown = r2;
            r12.mInLongPress = r3;
            r12.mDeferConfirmSingleTap = r3;
            r1 = r12.mIsLongpressEnabled;
            if (r1 == 0) goto L_0x0237;
        L_0x021f:
            r1 = r12.mHandler;
            r1.removeMessages(r4);
            r1 = r12.mHandler;
            r3 = r12.mCurrentDownEvent;
            r5 = r3.getDownTime();
            r3 = TAP_TIMEOUT;
            r7 = (long) r3;
            r5 = r5 + r7;
            r3 = LONGPRESS_TIMEOUT;
            r7 = (long) r3;
            r5 = r5 + r7;
            r1.sendEmptyMessageAtTime(r4, r5);
        L_0x0237:
            r1 = r12.mHandler;
            r3 = r12.mCurrentDownEvent;
            r3 = r3.getDownTime();
            r5 = TAP_TIMEOUT;
            r5 = (long) r5;
            r3 = r3 + r5;
            r1.sendEmptyMessageAtTime(r2, r3);
            r1 = r12.mListener;
            r13 = r1.onDown(r13);
            r3 = r0 | r13;
        L_0x024e:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase.onTouchEvent(android.view.MotionEvent):boolean");
        }

        private void cancel() {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mIsDoubleTapping = false;
            this.mStillDown = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }

        private void cancelTaps() {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mIsDoubleTapping = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }

        private boolean isConsideredDoubleTap(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.mAlwaysInBiggerTapRegion || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) DOUBLE_TAP_TIMEOUT)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.mDoubleTapSlopSquare) {
                z = true;
            }
            return z;
        }

        /* Access modifiers changed, original: 0000 */
        public void dispatchLongPress() {
            this.mHandler.removeMessages(3);
            this.mDeferConfirmSingleTap = false;
            this.mInLongPress = true;
            this.mListener.onLongPress(this.mCurrentDownEvent);
        }
    }

    static class GestureDetectorCompatImplJellybeanMr2 implements GestureDetectorCompatImpl {
        private final GestureDetector mDetector;

        GestureDetectorCompatImplJellybeanMr2(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.mDetector = new GestureDetector(context, onGestureListener, handler);
        }

        public boolean isLongpressEnabled() {
            return this.mDetector.isLongpressEnabled();
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.mDetector.onTouchEvent(motionEvent);
        }

        public void setIsLongpressEnabled(boolean z) {
            this.mDetector.setIsLongpressEnabled(z);
        }

        public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
            this.mDetector.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public GestureDetectorCompat(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.mImpl = new GestureDetectorCompatImplJellybeanMr2(context, onGestureListener, handler);
        } else {
            this.mImpl = new GestureDetectorCompatImplBase(context, onGestureListener, handler);
        }
    }

    public boolean isLongpressEnabled() {
        return this.mImpl.isLongpressEnabled();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mImpl.onTouchEvent(motionEvent);
    }

    public void setIsLongpressEnabled(boolean z) {
        this.mImpl.setIsLongpressEnabled(z);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.mImpl.setOnDoubleTapListener(onDoubleTapListener);
    }
}
