package com.microblink.secured;

import com.microblink.hardware.camera.camera1.frame.Camera1PreviewFrame;
import java.util.Map;

/* compiled from: line */
public final class o {
    public a ewT;

    /* compiled from: line */
    public class a extends x {
        private Map<byte[], Camera1PreviewFrame> ewU;

        public final void dispose() {
            Map map = this.ewU;
            if (map != null) {
                for (byte[] bArr : map.keySet()) {
                    ((Camera1PreviewFrame) this.ewU.get(bArr)).dispose();
                }
                this.ewU.clear();
            }
            this.ewU = null;
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            dispose();
            super.finalize();
        }
    }
}
