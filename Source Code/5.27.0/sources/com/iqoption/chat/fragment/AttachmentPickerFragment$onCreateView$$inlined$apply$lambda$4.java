package com.iqoption.chat.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.chat.a.c;
import com.iqoption.chat.viewmodel.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.d;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/iqoption/chat/databinding/ChatAttachmentImageItemBinding;", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "invoke", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$adapter$2"})
/* compiled from: AttachmentPickerFragment.kt */
final class AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4 extends Lambda implements m<c, b, l> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ Bundle $savedInstanceState$inlined;
    final /* synthetic */ a this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "Ljava/io/File;", "invoke", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$adapter$2$3"})
    /* compiled from: AttachmentPickerFragment.kt */
    /* renamed from: com.iqoption.chat.fragment.AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4$3 */
    static final class AnonymousClass3 extends Lambda implements kotlin.jvm.a.b<List<? extends File>, l> {
        final /* synthetic */ AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4 this$0;

        AnonymousClass3(AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4 attachmentPickerFragment$onCreateView$$inlined$apply$lambda$4) {
            this.this$0 = attachmentPickerFragment$onCreateView$$inlined$apply$lambda$4;
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            X((List) obj);
            return l.eVB;
        }

        public final void X(List<? extends File> list) {
            kotlin.jvm.internal.i.f(list, "it");
            a aVar = this.this$0.this$0;
            Iterable<File> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (File fromFile : iterable) {
                arrayList.add(Uri.fromFile(fromFile));
            }
            aVar.a((List) arrayList, false);
        }
    }

    AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
        this.this$0 = aVar;
        this.$activity$inlined = fragmentActivity;
        this.$savedInstanceState$inlined = bundle;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        b((c) obj, (b) obj2);
        return l.eVB;
    }

    public final void b(c cVar, b bVar) {
        kotlin.jvm.internal.i.f(cVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.f(bVar, "preview");
        List list = (List) a.b(this.this$0).Ta().getValue();
        if (list != null && (list.isEmpty() ^ 1) != 0) {
            com.iqoption.chat.b.b.ST().a((Fragment) this.this$0, l.aTB.a(this.this$0.aSl, list, list.indexOf(bVar), new kotlin.jvm.a.b<b, ImageView>(this.this$0) {
                public final d RW() {
                    return k.G(a.class);
                }

                public final String RX() {
                    return "getPreviewView(Lcom/iqoption/chat/viewmodel/AttachmentPreview;)Landroid/widget/ImageView;";
                }

                public final String getName() {
                    return "getPreviewView";
                }

                /* renamed from: e */
                public final ImageView invoke(b bVar) {
                    kotlin.jvm.internal.i.f(bVar, "p1");
                    return ((a) this.receiver).c(bVar);
                }
            }, new kotlin.jvm.a.b<b, ImageView>(this.this$0) {
                public final d RW() {
                    return k.G(a.class);
                }

                public final String RX() {
                    return "getSelectorView(Lcom/iqoption/chat/viewmodel/AttachmentPreview;)Landroid/widget/ImageView;";
                }

                public final String getName() {
                    return "getSelectorView";
                }

                /* renamed from: e */
                public final ImageView invoke(b bVar) {
                    kotlin.jvm.internal.i.f(bVar, "p1");
                    return ((a) this.receiver).d(bVar);
                }
            }, new AnonymousClass3(this)));
        }
    }
}
