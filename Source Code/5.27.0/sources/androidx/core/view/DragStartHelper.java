package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;

public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final OnLongClickListener mLongClickListener = new OnLongClickListener() {
        public boolean onLongClick(View view) {
            return DragStartHelper.this.onLongClick(view);
        }
    };
    private final OnTouchListener mTouchListener = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return DragStartHelper.this.onTouch(view, motionEvent);
        }
    };
    private final View mView;

    public interface OnDragStartListener {
        boolean onDragStart(View view, DragStartHelper dragStartHelper);
    }

    public DragStartHelper(View view, OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARNING: Missing block: B:7:0x0018, code skipped:
            if (r2 != 3) goto L_0x004f;
     */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        r6 = this;
        r0 = r8.getX();
        r0 = (int) r0;
        r1 = r8.getY();
        r1 = (int) r1;
        r2 = r8.getAction();
        r3 = 0;
        if (r2 == 0) goto L_0x004b;
    L_0x0011:
        r4 = 1;
        if (r2 == r4) goto L_0x0048;
    L_0x0014:
        r5 = 2;
        if (r2 == r5) goto L_0x001b;
    L_0x0017:
        r7 = 3;
        if (r2 == r7) goto L_0x0048;
    L_0x001a:
        goto L_0x004f;
    L_0x001b:
        r2 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        r2 = androidx.core.view.MotionEventCompat.isFromSource(r8, r2);
        if (r2 == 0) goto L_0x004f;
    L_0x0023:
        r8 = r8.getButtonState();
        r8 = r8 & r4;
        if (r8 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x004f;
    L_0x002b:
        r8 = r6.mDragging;
        if (r8 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x004f;
    L_0x0030:
        r8 = r6.mLastTouchX;
        if (r8 != r0) goto L_0x0039;
    L_0x0034:
        r8 = r6.mLastTouchY;
        if (r8 != r1) goto L_0x0039;
    L_0x0038:
        goto L_0x004f;
    L_0x0039:
        r6.mLastTouchX = r0;
        r6.mLastTouchY = r1;
        r8 = r6.mListener;
        r7 = r8.onDragStart(r7, r6);
        r6.mDragging = r7;
        r7 = r6.mDragging;
        return r7;
    L_0x0048:
        r6.mDragging = r3;
        goto L_0x004f;
    L_0x004b:
        r6.mLastTouchX = r0;
        r6.mLastTouchY = r1;
    L_0x004f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DragStartHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onLongClick(View view) {
        return this.mListener.onDragStart(view, this);
    }

    public void getTouchPosition(Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
