package com.iqoption.widget.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.Nullable;
import com.iqoption.core.ext.a;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

public class ErrorBubbleHelper {
    private int dp10;
    private int eoQ;
    private PopupWindow eoR;
    private int eoS;
    private int eoT;
    private LayoutInflater layoutInflater;
    private int textSize;

    /* renamed from: com.iqoption.widget.helper.ErrorBubbleHelper$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] eoX = new int[BubbleGravity.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity.values();
            r0 = r0.length;
            r0 = new int[r0];
            eoX = r0;
            r0 = eoX;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity.right;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eoX;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity.left;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eoX;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity.top;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = eoX;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity.bottom;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.widget.helper.ErrorBubbleHelper$AnonymousClass2.<clinit>():void");
        }
    }

    public enum BubbleGravity {
        left,
        right,
        top,
        bottom
    }

    public ErrorBubbleHelper(Context context, LayoutInflater layoutInflater) {
        this.eoQ = (int) context.getResources().getDimension(R.dimen.deposit_card_error_bubble_top_bubble_height);
        this.eoS = (int) context.getResources().getDimension(R.dimen.deposit_card_item_height);
        this.eoT = (int) context.getResources().getDimension(R.dimen.deposit_card_error_bubble_width);
        this.dp10 = (int) context.getResources().getDimension(R.dimen.dp10);
        this.textSize = context.getResources().getDimensionPixelSize(R.dimen.dp12);
        this.layoutInflater = layoutInflater;
    }

    public boolean d(Context context, View view) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if ((iArr[1] + view.getHeight()) + this.eoQ <= displayMetrics.heightPixels) {
            return true;
        }
        return false;
    }

    public boolean a(View view, BubbleGravity bubbleGravity, @Nullable String str) {
        bbQ();
        if ((bubbleGravity == BubbleGravity.top || bubbleGravity == BubbleGravity.bottom) && a.aj(view) < 0.99f) {
            return false;
        }
        PopupWindow a = a(view.getContext(), view, bubbleGravity, str);
        View contentView = a.getContentView();
        contentView.setAlpha(0.0f);
        contentView.animate().alpha(1.0f);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = AnonymousClass2.eoX[bubbleGravity.ordinal()];
        if (i3 == 1) {
            i += view.getWidth();
        } else if (i3 == 2) {
            i -= this.eoT;
        } else if (i3 == 3) {
            i += (view.getWidth() / 2) - (this.eoT / 2);
            i2 -= this.eoQ;
        } else if (i3 == 4) {
            i += (view.getWidth() / 2) - (this.eoT / 2);
            i2 += view.getHeight();
        }
        a.showAtLocation(view, 0, i, i2);
        this.eoR = a;
        return true;
    }

    public void bbQ() {
        PopupWindow popupWindow = this.eoR;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.eoR = null;
        }
    }

    public void q(Context context, @DimenRes int i) {
        this.eoS = (int) context.getResources().getDimension(i);
    }

    public void r(Context context, @DimenRes int i) {
        this.eoT = (int) context.getResources().getDimension(i);
    }

    public void s(Context context, @DimenRes int i) {
        this.textSize = context.getResources().getDimensionPixelSize(i);
    }

    private View a(ViewGroup viewGroup, BubbleGravity bubbleGravity) {
        int i = AnonymousClass2.eoX[bubbleGravity.ordinal()];
        View inflate;
        if (i == 1) {
            inflate = this.layoutInflater.inflate(R.layout.deposit_card_error_bubble_left, viewGroup, false);
            i(inflate, 16, this.dp10);
            return inflate;
        } else if (i == 2) {
            inflate = this.layoutInflater.inflate(R.layout.deposit_card_error_bubble_right, viewGroup, false);
            i(inflate, 16, this.dp10);
            return inflate;
        } else if (i == 3) {
            inflate = this.layoutInflater.inflate(R.layout.deposit_card_error_bubble_top, viewGroup, false);
            i(inflate, 17, 0);
            return inflate;
        } else if (i == 4) {
            inflate = this.layoutInflater.inflate(R.layout.deposit_card_error_bubble_bottom, viewGroup, false);
            i(inflate, 17, 0);
            return inflate;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unknown gravity ");
            stringBuilder.append(bubbleGravity);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void i(View view, int i, int i2) {
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(R.id.ic_deposit_error_text);
        robotoTextView.getLayoutParams().height = this.eoS;
        robotoTextView.getLayoutParams().width = this.eoT;
        robotoTextView.setGravity(i);
        robotoTextView.setPadding(i2, i2, i2, i2);
        robotoTextView.setTextSize(0, (float) this.textSize);
        robotoTextView.reinit();
    }

    private PopupWindow a(Context context, View view, BubbleGravity bubbleGravity, @Nullable String str) {
        final PopupWindow popupWindow = new PopupWindow(context);
        if (!(view instanceof ViewGroup)) {
            view = view.getParent();
        }
        final View a = a((ViewGroup) view, bubbleGravity);
        a.getLayoutParams().height = this.eoS;
        a.getLayoutParams().width = this.eoT;
        if (!(TextUtils.isEmpty(str) || a.findViewById(R.id.ic_deposit_error_text) == null)) {
            ((TextView) a.findViewById(R.id.ic_deposit_error_text)).setText(str);
        }
        popupWindow.setContentView(a);
        popupWindow.setBackgroundDrawable(null);
        popupWindow.setHeight(-2);
        a.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                a.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        popupWindow.dismiss();
                    }
                });
            }
        });
        return popupWindow;
    }
}
