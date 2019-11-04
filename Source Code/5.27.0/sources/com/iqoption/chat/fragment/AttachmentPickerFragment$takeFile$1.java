package com.iqoption.chat.fragment;

import android.net.Uri;
import java.io.File;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke"})
/* compiled from: AttachmentPickerFragment.kt */
final class AttachmentPickerFragment$takeFile$1 extends Lambda implements b<File, l> {
    final /* synthetic */ a this$0;

    AttachmentPickerFragment$takeFile$1(a aVar) {
        this.this$0 = aVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        q((File) obj);
        return l.eVB;
    }

    public final void q(File file) {
        kotlin.jvm.internal.i.f(file, "it");
        a.a(this.this$0, l.listOf(Uri.fromFile(file)), false, 2, null);
    }
}
