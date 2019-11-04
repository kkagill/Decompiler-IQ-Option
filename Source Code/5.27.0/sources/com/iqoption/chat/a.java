package com.iqoption.chat;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.chat.fragment.aa;
import com.iqoption.chat.fragment.ae;
import com.iqoption.chat.fragment.d;
import com.iqoption.chat.fragment.e;
import com.iqoption.chat.fragment.j;
import com.iqoption.chat.fragment.k;
import com.iqoption.chat.fragment.l;
import com.iqoption.chat.fragment.n;
import com.iqoption.chat.fragment.v;
import com.iqoption.chat.fragment.w;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010 2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H 0!H\u0016J \u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020*H\u0016¨\u0006+"}, bng = {"Lcom/iqoption/chat/ChatRouter;", "Lcom/iqoption/chat/navigation/IChatRouter;", "()V", "back", "", "source", "Landroidx/fragment/app/Fragment;", "backTo", "tag", "", "isInclusive", "", "closeChat", "getChatHost", "child", "getRoomHost", "isRoomListOpen", "isSearchRoomOpen", "openAttachmentPicker", "target", "Lcom/iqoption/chat/fragment/AttachmentPickerFragment;", "openCantSendDialog", "Lcom/iqoption/chat/fragment/CantSendReasonDialog;", "openFeedbackDialog", "Lcom/iqoption/chat/fragment/FeedbackDialog;", "openFilePicker", "Lcom/iqoption/chat/fragment/FilePickerFragment;", "openImagePreview", "Lcom/iqoption/chat/fragment/ImagePreviewFragment;", "openImagePreviewSlider", "Lcom/iqoption/chat/fragment/ImagePreviewSliderFragment;", "openMessageOptionsDialog", "T", "Lcom/iqoption/chat/fragment/MessageOptionsDialog;", "openRoom", "Lcom/iqoption/chat/fragment/RoomFragment;", "addToBackStack", "openRoomList", "Lcom/iqoption/chat/fragment/RoomListFragment;", "openSearchRoom", "Lcom/iqoption/chat/fragment/SearchRoomFragment;", "openUserInfoDialog", "Lcom/iqoption/chat/fragment/UserInfoDialog;", "app_optionXRelease"})
/* compiled from: ChatRouter.kt */
public final class a implements com.iqoption.chat.b.a {
    public static final a aNW = new a();

    private a() {
    }

    public Fragment h(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "child");
        return fragment instanceof e ? fragment : com.iqoption.core.ext.a.a(fragment, e.class);
    }

    public boolean i(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "source");
        return com.iqoption.core.ext.a.u(fragment).findFragmentById(R.id.chatContentLayer) != null;
    }

    public void a(Fragment fragment, aa aaVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(aaVar, "target");
        FragmentManager u = com.iqoption.core.ext.a.u(fragment);
        FragmentTransaction beginTransaction = u.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatContentLayer, aaVar, aa.aVn.Bx());
        beginTransaction.commitAllowingStateLoss();
        u.executePendingTransactions();
    }

    public boolean j(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "source");
        return com.iqoption.core.ext.a.u(fragment).findFragmentById(R.id.roomList) != null;
    }

    public void a(Fragment fragment, w wVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(wVar, "target");
        FragmentManager u = com.iqoption.core.ext.a.u(fragment);
        FragmentTransaction beginTransaction = u.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.roomList, wVar, w.aVc.Bx());
        beginTransaction.commitAllowingStateLoss();
        u.executePendingTransactions();
    }

    public void a(Fragment fragment, v vVar, boolean z) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(vVar, "target");
        FragmentManager u = com.iqoption.core.ext.a.u(fragment);
        FragmentTransaction beginTransaction = u.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatContentLayer, vVar, v.aUR.Bx());
        if (z) {
            beginTransaction.addToBackStack(v.aUR.Bx());
        }
        beginTransaction.commitAllowingStateLoss();
        u.executePendingTransactions();
    }

    public void a(Fragment fragment, com.iqoption.chat.fragment.a aVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(aVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, aVar, com.iqoption.chat.fragment.a.aSp.Bx());
        beginTransaction.addToBackStack(com.iqoption.chat.fragment.a.aSp.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, j jVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(jVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.setCustomAnimations(R.anim.slide_in_up_fast, R.anim.slide_out_down_fast, R.anim.slide_in_up_fast, R.anim.slide_out_down_fast);
        beginTransaction.add(R.id.chatDialogLayer, jVar, j.aTc.Bx());
        beginTransaction.addToBackStack(j.aTc.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, l lVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(lVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, lVar, l.aTB.Bx());
        beginTransaction.addToBackStack(l.aTB.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, k kVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(kVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, kVar, k.aTi.Bx());
        beginTransaction.addToBackStack(k.aTi.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, ae aeVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(aeVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, aeVar, ae.aVD.Bx());
        beginTransaction.addToBackStack(ae.aVD.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, d dVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(dVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, dVar, d.aSz.Bx());
        beginTransaction.addToBackStack(d.aSz.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public <T> void a(Fragment fragment, n<T> nVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(nVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, nVar, n.aTX.Bx());
        beginTransaction.addToBackStack(n.aTX.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void a(Fragment fragment, com.iqoption.chat.fragment.i iVar) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(iVar, "target");
        FragmentManager t = com.iqoption.core.ext.a.t(fragment);
        FragmentTransaction beginTransaction = t.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.add(R.id.chatDialogLayer, iVar, com.iqoption.chat.fragment.i.aSV.Bx());
        beginTransaction.addToBackStack(com.iqoption.chat.fragment.i.aSV.Bx());
        beginTransaction.commitAllowingStateLoss();
        t.executePendingTransactions();
    }

    public void k(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "source");
        com.iqoption.core.ext.a.t(fragment).popBackStack();
    }

    public void a(Fragment fragment, String str, boolean z) {
        kotlin.jvm.internal.i.f(fragment, "source");
        kotlin.jvm.internal.i.f(str, "tag");
        com.iqoption.core.ext.a.t(fragment).popBackStack(str, (int) z);
    }
}
