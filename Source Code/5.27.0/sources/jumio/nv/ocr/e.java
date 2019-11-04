package jumio.nv.ocr;

import com.jumio.clientlib.impl.templatematcher.FrameProcessingCallbackTemplateMatcher;
import com.jumio.clientlib.impl.templatematcher.FrameQueue;
import com.jumio.clientlib.impl.templatematcher.LibImage;
import com.jumio.clientlib.impl.templatematcher.TemplateInfo;

/* compiled from: TemplateMatcherFrameCallback */
public class e extends FrameProcessingCallbackTemplateMatcher {
    private boolean a = false;
    private final Object b = new Object();
    private a c;

    /* compiled from: TemplateMatcherFrameCallback */
    interface a {
        void a();

        void a(LibImage libImage, a aVar);

        void b(LibImage libImage, a aVar);
    }

    public e(a aVar) {
        this.c = aVar;
    }

    public void intermediateResult(FrameQueue frameQueue, TemplateInfo templateInfo) {
        synchronized (this.b) {
            if (!this.a) {
                a aVar = new a(templateInfo);
                if (this.c != null) {
                    this.c.a(frameQueue.getFrameByID(templateInfo.getFrameIndex()), aVar);
                }
            }
        }
    }

    public void finalResult(FrameQueue frameQueue, TemplateInfo templateInfo) {
        synchronized (this.b) {
            if (!this.a) {
                this.a = true;
                a aVar = new a(templateInfo);
                if (this.c != null) {
                    this.c.b(frameQueue.getFrameByID(templateInfo.getFrameIndex()), aVar);
                }
                frameQueue.clear();
            }
        }
    }

    public void noResult(FrameQueue frameQueue) {
        synchronized (this.b) {
            this.a = false;
            if (frameQueue != null) {
                frameQueue.clear();
            }
            if (this.c != null) {
                this.c.a();
            }
        }
    }

    public void a() {
        synchronized (this.b) {
            this.a = false;
        }
    }
}
