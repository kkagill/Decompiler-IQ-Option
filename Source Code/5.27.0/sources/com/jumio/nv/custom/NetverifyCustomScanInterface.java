package com.jumio.nv.custom;

import com.jumio.core.data.document.ScanSide;

public interface NetverifyCustomScanInterface {
    void onNetverifyCameraAvailable();

    void onNetverifyDisplayBlurHint();

    void onNetverifyDisplayFlipDocumentHint();

    void onNetverifyExtractionStarted();

    void onNetverifyFaceInLandscape();

    void onNetverifyNoUSAddressFound();

    void onNetverifyPresentConfirmationView();

    void onNetverifyScanForPartFinished(ScanSide scanSide, boolean z);

    void onNetverifyShowLegalAdvice(String str);
}
