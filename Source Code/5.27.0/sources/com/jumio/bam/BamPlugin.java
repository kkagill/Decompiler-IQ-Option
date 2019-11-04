package com.jumio.bam;

import android.content.Context;
import android.os.Bundle;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.Plugin;
import com.jumio.sdk.extraction.ExtractionClient;
import jumio.bam.i;
import jumio.bam.q;

public class BamPlugin implements Plugin {
    public <T> void populateData(Context context, T t) {
    }

    public ExtractionClient getExtractionClient(Context context) {
        return new i(context);
    }

    public Overlay getOverlay(Context context, Bundle bundle) {
        return new q(context);
    }
}
