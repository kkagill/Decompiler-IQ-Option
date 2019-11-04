package com.iqoption.feed.fetching;

import com.iqoption.core.microservices.feed.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "os", "Ljava/io/OutputStream;", "invoke"})
/* compiled from: ImageDownloader.kt */
final class ImageDownloader$readImageContent$1 extends Lambda implements b<OutputStream, Boolean> {
    final /* synthetic */ InputStream $byteStream;
    final /* synthetic */ d $previewable;
    final /* synthetic */ f this$0;

    ImageDownloader$readImageContent$1(f fVar, InputStream inputStream, d dVar) {
        this.this$0 = fVar;
        this.$byteStream = inputStream;
        this.$previewable = dVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(c((OutputStream) obj));
    }

    public final boolean c(OutputStream outputStream) {
        kotlin.jvm.internal.i.f(outputStream, "os");
        try {
            this.this$0.b(this.$byteStream, outputStream);
            return true;
        } catch (IOException unused) {
            this.$previewable.adE();
            return false;
        }
    }
}
