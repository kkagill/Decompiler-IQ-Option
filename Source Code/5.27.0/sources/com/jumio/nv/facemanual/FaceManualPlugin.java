package com.jumio.nv.facemanual;

import android.content.Context;
import android.os.Bundle;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.Plugin;
import com.jumio.sdk.extraction.ExtractionClient;
import jumio.nv.core.q;
import jumio.nv.core.r;

public class FaceManualPlugin implements Plugin {
    public <T> void populateData(Context context, T t) {
    }

    public ExtractionClient getExtractionClient(Context context) {
        return new q(context);
    }

    public Overlay getOverlay(Context context, Bundle bundle) {
        return new r(context);
    }
}
