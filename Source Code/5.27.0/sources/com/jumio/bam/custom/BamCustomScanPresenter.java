package com.jumio.bam.custom;

import com.jumio.sdk.presentation.BaseScanPresenterBase.BaseScanControl;
import jumio.bam.g;
import jumio.bam.x;

public class BamCustomScanPresenter {
    private g inlineScanViewController;
    private x scanPresenter;

    public BamCustomScanPresenter(g gVar, x xVar) {
        this.inlineScanViewController = gVar;
        this.scanPresenter = xVar;
    }

    public void onActivityPause() {
        x xVar = this.scanPresenter;
        if (xVar != null) {
            xVar.a(true, true);
        }
    }

    public void retryScan() {
        this.inlineScanViewController.a();
        this.scanPresenter.activate();
        this.scanPresenter.c();
    }

    public void stopScan() {
        x xVar = this.scanPresenter;
        if (xVar != null) {
            xVar.deactivate();
        }
    }

    public void clearSDK() {
        this.inlineScanViewController.b();
        x xVar = this.scanPresenter;
        if (xVar != null) {
            xVar.deactivate();
            this.scanPresenter.detachView();
            this.scanPresenter = null;
        }
    }

    public boolean hasFlash() {
        return this.scanPresenter.control(BaseScanControl.hasFlash);
    }

    public boolean isFlashOn() {
        return this.scanPresenter.control(BaseScanControl.isFlashOn);
    }

    public void toggleFlash() {
        this.scanPresenter.control(BaseScanControl.toggleFlash);
    }

    public boolean hasMultipleCameras() {
        return this.scanPresenter.control(BaseScanControl.hasMultipleCameras);
    }

    public boolean isCameraFrontFacing() {
        return this.scanPresenter.control(BaseScanControl.isCameraFrontfacing);
    }

    public void switchCamera() {
        this.scanPresenter.control(BaseScanControl.toggleCamera);
    }
}
