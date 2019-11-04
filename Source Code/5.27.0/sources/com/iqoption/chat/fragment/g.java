package com.iqoption.chat.fragment;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.chat.f;
import com.iqoption.chat.f.b;
import com.iqoption.chat.viewmodel.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, bng = {"Lcom/iqoption/chat/fragment/DelegateContext;", "Lcom/iqoption/chat/Resourcer;", "Landroidx/lifecycle/LifecycleOwner;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "bottomBarLayout", "Landroid/view/ViewGroup;", "getBottomBarLayout", "()Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "topBarLayout", "getTopBarLayout", "viewModel", "Lcom/iqoption/chat/viewmodel/RoomViewModel;", "getViewModel", "()Lcom/iqoption/chat/viewmodel/RoomViewModel;", "hideKeyboard", "", "openAttachmentPicker", "openCantSendReasonDialog", "message", "", "showKeyboard", "view", "Landroid/view/View;", "chat_release"})
/* compiled from: DelegateContext.kt */
public interface g extends LifecycleOwner, f {

    @i(bne = {1, 1, 15})
    /* compiled from: DelegateContext.kt */
    public static final class a {
        public static int a(g gVar, @DimenRes int i) {
            return b.a(gVar, i);
        }

        public static String a(g gVar, @PluralsRes int i, int i2, Object... objArr) {
            kotlin.jvm.internal.i.f(objArr, "formatArgs");
            return b.a(gVar, i, i2, objArr);
        }

        public static String a(g gVar, @StringRes int i, Object... objArr) {
            kotlin.jvm.internal.i.f(objArr, "formatArgs");
            return b.a(gVar, i, objArr);
        }

        public static float b(g gVar, @DimenRes int i) {
            return b.b(gVar, i);
        }

        public static int c(g gVar, @ColorRes int i) {
            return b.c(gVar, i);
        }

        public static Drawable d(g gVar, @DrawableRes int i) {
            return b.d(gVar, i);
        }
    }

    ViewGroup Sd();

    ViewGroup Se();

    k Sf();

    void Sg();

    void Sh();

    void ad(View view);

    void x(CharSequence charSequence);
}
