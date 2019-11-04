package com.iqoption.fragment.leftmenu.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.iqoption.core.ui.picasso.a;
import com.iqoption.e.qd;
import com.iqoption.fragment.leftmenu.b.c;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ#\u0010\r\u001a\u00020\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/leftmenu/holder/ProfileHolder;", "Lcom/iqoption/fragment/leftmenu/LeftMenuAdapter$ViewHolder;", "binding", "Lcom/iqoption/databinding/LeftMenuItemProfileBinding;", "(Lcom/iqoption/databinding/LeftMenuItemProfileBinding;)V", "avatarTransformation", "Lcom/iqoption/core/ui/picasso/CircleTransformation;", "bind", "", "account", "Lcom/iqoption/app/IQAccount;", "menuVerificationState", "Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "setStatusIcon", "iconResId", "", "intrinsicBounds", "", "(Ljava/lang/Integer;Z)V", "app_optionXRelease"})
/* compiled from: ProfileHolder.kt */
public final class d extends c {
    private final a aPf = new a();
    private final qd djv;

    public d(qd qdVar) {
        kotlin.jvm.internal.i.f(qdVar, "binding");
        super(qdVar, R.layout.left_menu_item_profile);
        this.djv = qdVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f  */
    public final void a(com.iqoption.app.b r12, com.iqoption.fragment.leftmenu.g r13) {
        /*
        r11 = this;
        r0 = "account";
        kotlin.jvm.internal.i.f(r12, r0);
        r0 = r11.djv;
        r0 = r0.getRoot();
        r1 = "binding.root";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.getContext();
        r1 = r12.getAvatar();
        r2 = 0;
        if (r1 == 0) goto L_0x0038;
    L_0x001b:
        r3 = r11.djv;
        r3 = r3.chM;
        r4 = "binding.userAvatar";
        kotlin.jvm.internal.i.e(r3, r4);
        r3 = r3.getMeasuredWidth();
        r5 = r11.djv;
        r5 = r5.chM;
        kotlin.jvm.internal.i.e(r5, r4);
        r4 = r5.getMeasuredHeight();
        r1 = r1.am(r3, r4);
        goto L_0x003b;
    L_0x0038:
        r1 = r2;
        r1 = (com.iqoption.core.microservices.avatar.d) r1;
    L_0x003b:
        r3 = 2131231392; // 0x7f0802a0 float:1.8078864E38 double:1.052968214E-314;
        if (r1 == 0) goto L_0x0069;
    L_0x0040:
        r4 = com.squareup.picasso.Picasso.with(r0);
        r1 = r1.getUrl();
        r1 = r4.load(r1);
        r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3);
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r1.placeholder(r0);
    L_0x0055:
        r0 = r11.aPf;
        r0 = (com.squareup.picasso.Transformation) r0;
        r0 = r1.transform(r0);
        r0 = r0.fit();
        r1 = r11.djv;
        r1 = r1.chM;
        r0.into(r1);
        goto L_0x0070;
    L_0x0069:
        r0 = r11.djv;
        r0 = r0.chM;
        r0.setImageResource(r3);
    L_0x0070:
        r0 = r12.getFirstName();
        r1 = "account.firstName";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r12.getLastName();
        r3 = "account.lastName";
        kotlin.jvm.internal.i.e(r1, r3);
        r3 = r0;
        r3 = (java.lang.CharSequence) r3;
        r4 = android.text.TextUtils.isEmpty(r3);
        r5 = "binding.userName";
        r6 = 0;
        r7 = 1;
        if (r4 != 0) goto L_0x00d6;
    L_0x008f:
        r4 = r1;
        r4 = (java.lang.CharSequence) r4;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x00d6;
    L_0x0098:
        r3 = r11.djv;
        r3 = r3.cmN;
        kotlin.jvm.internal.i.e(r3, r5);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r0 = " ";
        r4.append(r0);
        if (r1 != 0) goto L_0x00b1;
    L_0x00ae:
        kotlin.jvm.internal.i.bnJ();
    L_0x00b1:
        if (r1 == 0) goto L_0x00ce;
    L_0x00b3:
        r0 = r1.substring(r6, r7);
        r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        kotlin.jvm.internal.i.e(r0, r1);
        r4.append(r0);
        r0 = ".";
        r4.append(r0);
        r0 = r4.toString();
        r0 = (java.lang.CharSequence) r0;
        r3.setText(r0);
        goto L_0x0109;
    L_0x00ce:
        r12 = new kotlin.TypeCastException;
        r13 = "null cannot be cast to non-null type java.lang.String";
        r12.<init>(r13);
        throw r12;
    L_0x00d6:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x00e9;
    L_0x00dc:
        r0 = r11.djv;
        r0 = r0.cmN;
        kotlin.jvm.internal.i.e(r0, r5);
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        goto L_0x0109;
    L_0x00e9:
        r1 = (java.lang.CharSequence) r1;
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 == 0) goto L_0x00fc;
    L_0x00f1:
        r0 = r11.djv;
        r0 = r0.cmN;
        kotlin.jvm.internal.i.e(r0, r5);
        r0.setText(r3);
        goto L_0x0109;
    L_0x00fc:
        r0 = r11.djv;
        r0 = r0.cmN;
        kotlin.jvm.internal.i.e(r0, r5);
        r1 = r2;
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
    L_0x0109:
        if (r13 == 0) goto L_0x0116;
    L_0x010b:
        r0 = r13.aEv();
        if (r0 == 0) goto L_0x0116;
    L_0x0111:
        r0 = r0.ath();
        goto L_0x0117;
    L_0x0116:
        r0 = r2;
    L_0x0117:
        if (r13 == 0) goto L_0x011e;
    L_0x0119:
        r1 = r13.aEw();
        goto L_0x011f;
    L_0x011e:
        r1 = r2;
    L_0x011f:
        r3 = java.lang.Boolean.valueOf(r7);
        r1 = kotlin.jvm.internal.i.y(r1, r3);
        if (r13 == 0) goto L_0x013a;
    L_0x0129:
        r3 = r13.aEu();
        if (r3 == 0) goto L_0x013a;
    L_0x012f:
        r3 = r3.aeH();
        if (r3 == 0) goto L_0x013a;
    L_0x0135:
        r3 = r3.aeL();
        goto L_0x013b;
    L_0x013a:
        r3 = r2;
    L_0x013b:
        if (r0 == 0) goto L_0x0146;
    L_0x013d:
        r4 = com.iqoption.deposit.verification.c.a(r0);
        r4 = java.lang.Integer.valueOf(r4);
        goto L_0x0147;
    L_0x0146:
        r4 = r2;
    L_0x0147:
        r5 = r11.djv;
        r5 = r5.cmO;
        r8 = 2131099992; // 0x7f060158 float:1.7812353E38 double:1.052903294E-314;
        r8 = com.iqoption.core.ext.a.b(r11, r8);
        r5.setTextColor(r8);
        r5 = r12.Ej();
        r8 = "binding.userStatus";
        if (r5 == 0) goto L_0x017f;
    L_0x015d:
        r12 = r11.djv;
        r12 = r12.cmO;
        kotlin.jvm.internal.i.e(r12, r8);
        r13 = r2;
        r13 = (java.lang.CharSequence) r13;
        r12.setText(r13);
        r12 = r11.djv;
        r12 = r12.cmO;
        r12 = (android.widget.TextView) r12;
        com.iqoption.util.ak.q(r12);
        r12 = r11.djv;
        r12 = r12.cmO;
        kotlin.jvm.internal.i.e(r12, r8);
        r12.setTag(r2);
        goto L_0x027c;
    L_0x017f:
        r5 = 2;
        if (r1 == 0) goto L_0x01a3;
    L_0x0182:
        if (r3 == 0) goto L_0x01a3;
    L_0x0184:
        r9 = new com.iqoption.core.microservices.kyc.response.VerificationLevelIndicator[r5];
        r10 = com.iqoption.core.microservices.kyc.response.VerificationLevelIndicator.REQUIRED;
        r9[r6] = r10;
        r10 = com.iqoption.core.microservices.kyc.response.VerificationLevelIndicator.NEED_ACTION;
        r9[r7] = r10;
        r9 = com.iqoption.core.ext.c.b(r3, r9);
        if (r9 != r7) goto L_0x01a3;
    L_0x0194:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131887767; // 0x7f120697 float:1.941015E38 double:1.0532925065E-314;
        r12.setText(r13);
        a(r11, r4, r6, r5, r2);
        goto L_0x027c;
    L_0x01a3:
        if (r1 == 0) goto L_0x01b8;
    L_0x01a5:
        r9 = com.iqoption.core.microservices.kyc.response.VerificationLevelIndicator.WAIT;
        if (r3 != r9) goto L_0x01b8;
    L_0x01a9:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131888737; // 0x7f120a61 float:1.9412118E38 double:1.0532929857E-314;
        r12.setText(r13);
        a(r11, r4, r6, r5, r2);
        goto L_0x027c;
    L_0x01b8:
        r3 = com.iqoption.deposit.verification.VerificationState.NEED_ADDITIONAL_ACTION;
        if (r0 != r3) goto L_0x01cb;
    L_0x01bc:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131886167; // 0x7f120057 float:1.9406905E38 double:1.053291716E-314;
        r12.setText(r13);
        a(r11, r4, r6, r5, r2);
        goto L_0x027c;
    L_0x01cb:
        r0 = r12.Ef();
        if (r0 == 0) goto L_0x01e7;
    L_0x01d1:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131888056; // 0x7f1207b8 float:1.9410737E38 double:1.0532926492E-314;
        r12.setText(r13);
        r12 = 2131231695; // 0x7f0803cf float:1.8079478E38 double:1.052968364E-314;
        r12 = java.lang.Integer.valueOf(r12);
        r11.a(r12, r7);
        goto L_0x027c;
    L_0x01e7:
        r0 = r12.Em();
        if (r0 == 0) goto L_0x0203;
    L_0x01ed:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131888058; // 0x7f1207ba float:1.941074E38 double:1.05329265E-314;
        r12.setText(r13);
        r12 = 2131231772; // 0x7f08041c float:1.8079634E38 double:1.052968402E-314;
        r12 = java.lang.Integer.valueOf(r12);
        r11.a(r12, r7);
        goto L_0x027c;
    L_0x0203:
        r12 = r12.En();
        if (r12 == 0) goto L_0x022c;
    L_0x0209:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131887190; // 0x7f120456 float:1.940898E38 double:1.0532922214E-314;
        r12.setText(r13);
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131100043; // 0x7f06018b float:1.7812456E38 double:1.052903319E-314;
        r13 = com.iqoption.core.ext.a.b(r11, r13);
        r12.setTextColor(r13);
        r12 = 2131231581; // 0x7f08035d float:1.8079247E38 double:1.0529683075E-314;
        r12 = java.lang.Integer.valueOf(r12);
        r11.a(r12, r7);
        goto L_0x027c;
    L_0x022c:
        if (r1 == 0) goto L_0x025b;
    L_0x022e:
        if (r13 == 0) goto L_0x0241;
    L_0x0230:
        r12 = r13.aEu();
        if (r12 == 0) goto L_0x0241;
    L_0x0236:
        r12 = r12.aeH();
        if (r12 == 0) goto L_0x0241;
    L_0x023c:
        r12 = r12.aeK();
        goto L_0x0242;
    L_0x0241:
        r12 = r2;
    L_0x0242:
        r13 = com.iqoption.core.microservices.kyc.response.VerificationLevel.ENHANCED;
        if (r12 != r13) goto L_0x025b;
    L_0x0246:
        r12 = r11.djv;
        r12 = r12.cmO;
        r13 = 2131888740; // 0x7f120a64 float:1.9412124E38 double:1.053292987E-314;
        r12.setText(r13);
        r12 = 2131231769; // 0x7f080419 float:1.8079628E38 double:1.0529684004E-314;
        r12 = java.lang.Integer.valueOf(r12);
        a(r11, r12, r6, r5, r2);
        goto L_0x027c;
    L_0x025b:
        r12 = r11.djv;
        r12 = r12.cmO;
        kotlin.jvm.internal.i.e(r12, r8);
        r13 = "";
        r13 = (java.lang.CharSequence) r13;
        r12.setText(r13);
        r12 = r11.djv;
        r12 = r12.cmO;
        r12 = (android.widget.TextView) r12;
        com.iqoption.util.ak.q(r12);
        r12 = r11.djv;
        r12 = r12.cmO;
        kotlin.jvm.internal.i.e(r12, r8);
        r12.setTag(r2);
    L_0x027c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.leftmenu.a.d.a(com.iqoption.app.b, com.iqoption.fragment.leftmenu.g):void");
    }

    static /* synthetic */ void a(d dVar, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dVar.a(num, z);
    }

    private final void a(@DrawableRes Integer num, boolean z) {
        if ((kotlin.jvm.internal.i.y(num, this.djv.cmO.getTag(R.id.iconTag)) ^ 1) != 0) {
            this.djv.cmO.setTag(R.id.iconTag, num);
            String str = "binding.userStatus";
            if (num != null) {
                RobotoTextView robotoTextView = this.djv.cmO;
                kotlin.jvm.internal.i.e(robotoTextView, str);
                com.iqoption.core.ext.a.ak(robotoTextView);
                View root = this.djv.getRoot();
                kotlin.jvm.internal.i.e(root, "binding.root");
                Context context = root.getContext();
                kotlin.jvm.internal.i.e(context, "context");
                Drawable n = com.iqoption.core.ext.a.n(context, num.intValue());
                if (z) {
                    n.setBounds(0, 0, n.getIntrinsicWidth(), n.getIntrinsicHeight());
                } else {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp12);
                    n.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                }
                RobotoTextView robotoTextView2 = this.djv.cmO;
                kotlin.jvm.internal.i.e(robotoTextView2, str);
                com.iqoption.core.ext.a.d((TextView) robotoTextView2, n);
                return;
            }
            RobotoTextView robotoTextView3 = this.djv.cmO;
            kotlin.jvm.internal.i.e(robotoTextView3, str);
            com.iqoption.core.ext.a.al(robotoTextView3);
        }
    }
}
