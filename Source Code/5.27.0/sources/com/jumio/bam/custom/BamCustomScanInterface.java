package com.jumio.bam.custom;

import com.jumio.bam.BamCardInformation;
import java.util.ArrayList;

public interface BamCustomScanInterface {
    void onBamCameraAvailable();

    void onBamError(String str, String str2, boolean z, ArrayList<String> arrayList);

    void onBamExtractionFinished(BamCardInformation bamCardInformation, ArrayList<String> arrayList);

    void onBamExtractionStarted();
}
