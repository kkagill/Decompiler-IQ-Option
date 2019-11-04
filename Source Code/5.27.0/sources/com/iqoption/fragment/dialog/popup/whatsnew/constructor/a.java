package com.iqoption.fragment.dialog.popup.whatsnew.constructor;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.b.e;
import com.iqoption.e.hg;
import com.iqoption.e.hi;
import com.iqoption.e.hk;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\u001a(\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\"\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000f"}, bng = {"bindWithBtn", "Landroid/view/View;", "fragment", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewDialog;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "viewModel", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel;", "bindWithoutBtn", "initImageMediaContent", "mediaContentRoot", "initMediaContent", "initVideoMediaContent", "app_optionXRelease"})
/* compiled from: WhatsNewBinding.kt */
public final class a {

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Landroid/media/MediaPlayer;", "kotlin.jvm.PlatformType", "onPrepared", "com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$initVideoMediaContent$1$1$1", "com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$$special$$inlined$apply$lambda$1"})
    /* compiled from: WhatsNewBinding.kt */
    static final class c implements OnPreparedListener {
        final /* synthetic */ d dfN;
        final /* synthetic */ b dfO;
        final /* synthetic */ hi dfP;
        final /* synthetic */ com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.c dfQ;
        final /* synthetic */ ViewGroup dfR;

        c(hi hiVar, com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.c cVar, b bVar, ViewGroup viewGroup, d dVar) {
            this.dfP = hiVar;
            this.dfQ = cVar;
            this.dfO = bVar;
            this.dfR = viewGroup;
            this.dfN = dVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            ProgressBar progressBar = this.dfP.bYs;
            kotlin.jvm.internal.i.e(progressBar, NotificationCompat.CATEGORY_PROGRESS);
            com.iqoption.core.ext.a.al(progressBar);
            mediaPlayer.setScreenOnWhilePlaying(true);
            kotlin.jvm.internal.i.e(mediaPlayer, "it");
            mediaPlayer.setLooping(this.dfQ.aCL());
            if (this.dfQ.aCM()) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$bindWithBtn$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: WhatsNewBinding.kt */
    public static final class a extends g {
        final /* synthetic */ d dfN;
        final /* synthetic */ b dfO;

        a(d dVar, b bVar) {
            this.dfN = dVar;
            this.dfO = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.btnClose /*2131362042*/:
                case R.id.veil /*2131364324*/:
                    this.dfN.aCq();
                    return;
                case R.id.btnNegative /*2131362067*/:
                    this.dfN.aCG();
                    return;
                case R.id.btnPositive /*2131362072*/:
                    this.dfN.aCH();
                    return;
                default:
                    return;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$$special$$inlined$setOnDelayedClickListener$1", "com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$$special$$inlined$apply$lambda$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ d dfN;
        final /* synthetic */ b dfO;
        final /* synthetic */ com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.c dfQ;
        final /* synthetic */ ViewGroup dfR;
        final /* synthetic */ hk dfS;

        public d(hk hkVar, com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.c cVar, b bVar, ViewGroup viewGroup, d dVar) {
            this.dfS = hkVar;
            this.dfQ = cVar;
            this.dfO = bVar;
            this.dfR = viewGroup;
            this.dfN = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            String aCJ = this.dfQ.aCJ();
            if (aCJ != null) {
                com.iqoption.o.d F = com.iqoption.o.d.dUK.F(com.iqoption.core.ext.a.r(this.dfO));
                ImageView imageView = this.dfS.De;
                kotlin.jvm.internal.i.e(imageView, "image");
                F.a(aCJ, com.iqoption.core.ext.a.ah(imageView), com.iqoption.fragment.dialog.popup.b.deN.m(this.dfN.aCn().getId().longValue(), aCJ));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewBindingKt$bindWithBtn$1$3", "Lcom/iqoption/core/util/link/OpenBrowserClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "app_optionXRelease"})
    /* compiled from: WhatsNewBinding.kt */
    public static final class b extends com.iqoption.core.util.b.g {
        final /* synthetic */ d dfN;
        final /* synthetic */ b dfO;

        b(Context context, d dVar, b bVar) {
            this.dfN = dVar;
            this.dfO = bVar;
            super(context);
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            super.onLinkClicked(aVar);
            com.iqoption.fragment.dialog.popup.b.deN.l(this.dfN.aCn().getId().longValue(), aVar.getUrl());
        }
    }

    public static final View a(b bVar, LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar) {
        TextView textView;
        Integer aCP;
        b bVar2 = bVar;
        d dVar2 = dVar;
        kotlin.jvm.internal.i.f(bVar2, "fragment");
        LayoutInflater layoutInflater2 = layoutInflater;
        kotlin.jvm.internal.i.f(layoutInflater2, "inflater");
        kotlin.jvm.internal.i.f(dVar2, "viewModel");
        hg hgVar = (hg) com.iqoption.core.ext.a.a(layoutInflater2, (int) R.layout.dialog_whats_new, viewGroup, false, 4, null);
        OnClickListener aVar = new a(dVar2, bVar2);
        hgVar.cdJ.setOnClickListener(aVar);
        hgVar.bYA.setOnClickListener(aVar);
        hgVar.cdG.setOnClickListener(aVar);
        hgVar.cdF.setOnClickListener(aVar);
        FrameLayout frameLayout = hgVar.cdI;
        kotlin.jvm.internal.i.e(frameLayout, "mediaContent");
        a(frameLayout, bVar2, dVar2);
        TextView textView2 = hgVar.cdH;
        kotlin.jvm.internal.i.e(textView2, "headerTitle");
        textView2.setText(dVar.aCF().getHeader());
        Integer aCN = dVar.aCF().aCN();
        if (aCN != null) {
            hgVar.cdH.setTextColor(aCN.intValue());
        }
        textView2 = hgVar.alH;
        kotlin.jvm.internal.i.e(textView2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView2.setText(dVar.aCF().getTitle());
        aCN = dVar.aCF().aCO();
        if (aCN != null) {
            hgVar.alH.setTextColor(aCN.intValue());
        }
        String message = dVar.aCF().getMessage();
        String str = "message";
        if (dVar.aCF().aCt() == null || message == null) {
            textView = hgVar.bfF;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(message);
            aCP = dVar.aCF().aCP();
            if (aCP != null) {
                hgVar.bfF.setTextColor(aCP.intValue());
            }
        } else {
            TextView textView3 = hgVar.bfF;
            kotlin.jvm.internal.i.e(textView3, str);
            com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{r4};
            com.iqoption.core.util.b.d.a(new e(aVarArr, textView3, message, 0, 0, false, new b(com.iqoption.core.ext.a.q(bVar2), dVar2, bVar2), 56, null));
        }
        textView = hgVar.cdE;
        kotlin.jvm.internal.i.e(textView, "bottomText");
        textView.setText(dVar.aCF().aCQ());
        aCP = dVar.aCF().aCR();
        if (aCP != null) {
            hgVar.cdE.setTextColor(aCP.intValue());
        }
        textView = hgVar.cdF;
        message = "btnNegative";
        kotlin.jvm.internal.i.e(textView, message);
        textView.setText(dVar.aCF().aCS().getTitle());
        textView = hgVar.cdG;
        String str2 = "btnPositive";
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setText(dVar.aCF().aCT().getTitle());
        if (kotlin.jvm.internal.i.y(dVar.aCF().aCS(), com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY)) {
            textView = hgVar.cdF;
            kotlin.jvm.internal.i.e(textView, message);
            com.iqoption.core.ext.a.al(textView);
        }
        if (kotlin.jvm.internal.i.y(dVar.aCF().aCT(), com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY)) {
            textView = hgVar.cdG;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
        }
        View root = hgVar.getRoot();
        kotlin.jvm.internal.i.e(root, "inflater.inflateBinding<…e()\n        }\n\n    }.root");
        return root;
    }

    private static final View a(ViewGroup viewGroup, b bVar, d dVar) {
        View c = dVar.aCF().aCJ() != null ? c(viewGroup, bVar, dVar) : dVar.aCF().getImage() != null ? b(viewGroup, bVar, dVar) : null;
        if (c == null) {
            return null;
        }
        viewGroup.addView(c);
        return c;
    }

    private static final View b(ViewGroup viewGroup, b bVar, d dVar) {
        Fragment fragment = bVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(com.iqoption.core.ext.a.q(fragment));
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        Picasso.with(com.iqoption.core.ext.a.q(fragment)).load(dVar.aCF().getImage()).resize(layoutParams.width, layoutParams.height).centerCrop().transform((Transformation) new com.iqoption.core.ui.picasso.c(com.iqoption.core.ext.a.c(fragment, (int) R.dimen.dp8))).placeholder((int) R.drawable.rect_grey_blur_05_rounded_8).into((ImageView) appCompatImageView);
        return appCompatImageView;
    }

    private static final View c(ViewGroup viewGroup, b bVar, d dVar) {
        com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.c aCF = dVar.aCF();
        View root;
        if (aCF.aCK()) {
            hi hiVar = (hi) com.iqoption.core.ext.a.a((Fragment) bVar, (int) R.layout.dialog_whats_new_video_autoplay_delegate, viewGroup, false, 4, null);
            hiVar.cdK.setVideoPath(aCF.aCJ());
            hiVar.cdK.setOnPreparedListener(new c(hiVar, aCF, bVar, viewGroup, dVar));
            bVar.getLifecycle().addObserver(new WhatsNewBindingKt$initVideoMediaContent$1$1$2(hiVar));
            root = hiVar.getRoot();
            kotlin.jvm.internal.i.e(root, "fragment.inflateBinding<…    })\n            }.root");
            return root;
        }
        Fragment fragment = bVar;
        hk hkVar = (hk) com.iqoption.core.ext.a.a(fragment, (int) R.layout.dialog_whats_new_video_delegate, viewGroup, false, 4, null);
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        Picasso.with(com.iqoption.core.ext.a.q(fragment)).load(aCF.getImage()).resize(layoutParams.width, layoutParams.height).centerCrop().transform((Transformation) new com.iqoption.core.ui.picasso.c(com.iqoption.core.ext.a.c(fragment, (int) R.dimen.dp8))).placeholder((int) R.drawable.rect_grey_blur_05_rounded_8).into(hkVar.De);
        ImageView imageView = hkVar.cdL;
        kotlin.jvm.internal.i.e(imageView, "btnPlayVideo");
        imageView.setOnClickListener(new d(hkVar, aCF, bVar, viewGroup, dVar));
        root = hkVar.getRoot();
        kotlin.jvm.internal.i.e(root, "fragment.inflateBinding<…     }\n            }.root");
        return root;
    }
}
