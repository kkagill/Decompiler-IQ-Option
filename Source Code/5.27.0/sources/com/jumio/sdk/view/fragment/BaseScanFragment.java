package com.jumio.sdk.view.fragment;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.jumio.commons.enums.Rotation;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.commons.view.ImageSwitcherViewDrawable;
import com.jumio.commons.view.ImageSwitcherViewDrawable.OnImageSwitchedListener;
import com.jumio.core.R;
import com.jumio.gui.DrawView;
import com.jumio.gui.DrawView.DrawViewInterface;
import com.jumio.gui.Images;
import com.jumio.sdk.presentation.BaseScanPresenter;
import com.jumio.sdk.presentation.BaseScanPresenterBase.BaseScanControl;
import com.jumio.sdk.view.interactors.BaseScanView;
import java.util.ArrayList;

public abstract class BaseScanFragment<Presenter extends BaseScanPresenter, FragmentCallback extends IBaseFragmentCallback> extends BaseFragment<Presenter, FragmentCallback> implements OnImageSwitchedListener, BaseScanView {
    private static final String KEY_OLD_HEIGHT = "KEY_OLD_HEIGHT";
    private static final String KEY_OLD_WIDTH = "KEY_OLD_WIDTH";
    protected MenuItem cameraMenuItem;
    protected ImageSwitcherViewDrawable cameraSwitcher;
    protected MenuItem flashMenuItem;
    protected ImageSwitcherViewDrawable flashSwitcher;
    private GlobalLayoutImplementation globalLayoutImplementation;
    protected Bitmap jumioBitmap;
    protected RelativeLayout mFragmentRootView;
    protected ViewGroup mRootView;
    private int oldHeight = 0;
    private int oldWidth = 0;
    protected DrawView overlayView;
    protected ImageView poweredBy;
    protected DeviceRotationManager rotationManager;
    protected TextureView textureView;

    private class GlobalLayoutImplementation implements OnGlobalLayoutListener {
        private Configuration configuration;

        GlobalLayoutImplementation(Configuration configuration) {
            this.configuration = configuration;
        }

        public void onGlobalLayout() {
            if (this.configuration != null) {
                BaseScanFragment baseScanFragment;
                int width = BaseScanFragment.this.textureView.getWidth();
                if (!(BaseScanFragment.this.textureView.getHeight() == BaseScanFragment.this.oldHeight || width == BaseScanFragment.this.oldWidth)) {
                    baseScanFragment = BaseScanFragment.this;
                    boolean z = true;
                    if (!(this.configuration.orientation == 1 || BaseScanFragment.this.getRotationManager().isTablet())) {
                        z = false;
                    }
                    baseScanFragment.onLayoutRotated(z);
                    BaseScanFragment.this.textureView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                baseScanFragment = BaseScanFragment.this;
                baseScanFragment.oldWidth = baseScanFragment.textureView.getWidth();
                baseScanFragment = BaseScanFragment.this;
                baseScanFragment.oldHeight = baseScanFragment.textureView.getHeight();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mRootView = viewGroup;
        this.mFragmentRootView = (RelativeLayout) layoutInflater.inflate(R.layout.jumio_fragment_scan, viewGroup, false);
        this.textureView = (TextureView) this.mFragmentRootView.findViewById(R.id.textureView);
        this.overlayView = (DrawView) this.mFragmentRootView.findViewById(R.id.overlayView);
        this.jumioBitmap = Images.getImage(getResources());
        this.poweredBy = new ImageView(viewGroup.getContext());
        this.poweredBy.setLayoutParams(new LayoutParams(-2, -2));
        this.poweredBy.setAdjustViewBounds(true);
        this.poweredBy.setImageBitmap(this.jumioBitmap);
        CompatibilityLayer.setImageViewAlpha(this.poweredBy, 0);
        this.mFragmentRootView.addView(this.poweredBy);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
        int i = typedValue.data;
        int dpToPx = ScreenUtil.dpToPx(viewGroup.getContext(), 56);
        int dpToPx2 = ScreenUtil.dpToPx(viewGroup.getContext(), 16);
        ArrayList arrayList = new ArrayList();
        arrayList.add(CompatibilityLayer.getDrawable(getResources(), R.drawable.jumio_ic_flash_on));
        arrayList.add(CompatibilityLayer.getDrawable(getResources(), R.drawable.jumio_ic_flash_off));
        ((Drawable) arrayList.get(0)).setColorFilter(i, Mode.SRC_ATOP);
        ((Drawable) arrayList.get(1)).setColorFilter(i, Mode.SRC_ATOP);
        this.flashSwitcher = new ImageSwitcherViewDrawable(viewGroup.getContext());
        this.flashSwitcher.setLayoutParams(new LinearLayoutCompat.LayoutParams(dpToPx, dpToPx));
        this.flashSwitcher.setImages(arrayList, dpToPx2).setOnImageSwitchedListener(this);
        this.flashSwitcher.setVisibility(4);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(CompatibilityLayer.getDrawable(getResources(), R.drawable.jumio_ic_camera_switch));
        ((Drawable) arrayList2.get(0)).setColorFilter(i, Mode.SRC_ATOP);
        this.cameraSwitcher = new ImageSwitcherViewDrawable(viewGroup.getContext());
        this.cameraSwitcher.setLayoutParams(new LinearLayoutCompat.LayoutParams(dpToPx, dpToPx));
        this.cameraSwitcher.setImages(arrayList2, dpToPx2).setOnImageSwitchedListener(this);
        this.cameraSwitcher.setVisibility(4);
        this.rotationManager = new DeviceRotationManager(getActivity(), Rotation.NATIVE);
        this.rotationManager.setAngleFromScreen();
        this.textureView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                BaseScanFragment.this.textureView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BaseScanFragment baseScanFragment = BaseScanFragment.this;
                baseScanFragment.oldWidth = baseScanFragment.textureView.getWidth();
                baseScanFragment = BaseScanFragment.this;
                baseScanFragment.oldHeight = baseScanFragment.textureView.getHeight();
            }
        });
        return this.mFragmentRootView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = this.jumioBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.poweredBy.setImageBitmap(null);
            this.jumioBitmap.recycle();
            this.jumioBitmap = null;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.overlayView.setDrawViewInterface((DrawViewInterface) getPresenter());
        if (bundle != null) {
            if (this.oldWidth == 0) {
                this.oldWidth = bundle.getInt(KEY_OLD_WIDTH);
            }
            if (this.oldHeight == 0) {
                this.oldHeight = bundle.getInt(KEY_OLD_HEIGHT);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(KEY_OLD_WIDTH, this.oldWidth);
        bundle.putInt(KEY_OLD_HEIGHT, this.oldHeight);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.globalLayoutImplementation != null) {
            this.textureView.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutImplementation);
        }
        this.globalLayoutImplementation = new GlobalLayoutImplementation(configuration);
        this.textureView.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutImplementation);
    }

    /* Access modifiers changed, original: protected */
    public void onLayoutRotated(boolean z) {
        handleBranding(CompatibilityLayer.getImageViewAlpha(this.poweredBy) != 0.0f);
        if (((BaseScanPresenter) getPresenter()).control(BaseScanControl.isFlashOn)) {
            this.flashSwitcher.switchToImageWithIndex(0);
            ((BaseScanPresenter) getPresenter()).control(BaseScanControl.toggleFlash);
            if (((BaseScanPresenter) getPresenter()).control(BaseScanControl.flashOnStartupEnabled)) {
                this.flashSwitcher.postDelayed(new Runnable() {
                    public void run() {
                        BaseScanFragment.this.flashSwitcher.switchToImageWithIndex(1);
                        ((BaseScanPresenter) BaseScanFragment.this.getPresenter()).control(BaseScanControl.toggleFlash);
                    }
                }, 250);
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        boolean control = ((BaseScanPresenter) getPresenter()).control(BaseScanControl.hasFlash);
        String str = "";
        this.flashMenuItem = menu.add(1, 1, 1, str);
        this.flashMenuItem.setEnabled(control);
        this.flashMenuItem.setVisible(control);
        this.flashMenuItem.setShowAsAction(2);
        this.flashMenuItem.setIcon(R.drawable.jumio_ic_flash_off);
        this.flashMenuItem.setActionView(this.flashSwitcher);
        this.flashSwitcher.setContentDescription(getResources().getString(R.string.jumio_accessibility_flash_activate));
        this.flashSwitcher.switchToImageWithIndex(0);
        control = ((BaseScanPresenter) getPresenter()).control(BaseScanControl.hasMultipleCameras);
        boolean control2 = ((BaseScanPresenter) getPresenter()).control(BaseScanControl.isCameraFrontfacing);
        this.cameraMenuItem = menu.add(2, 2, 2, str);
        this.cameraMenuItem.setEnabled(control);
        this.cameraMenuItem.setVisible(control);
        this.cameraMenuItem.setShowAsAction(2);
        this.cameraSwitcher.setContentDescription(getResources().getString(control2 ? R.string.jumio_accessibility_camera_switch_to_back : R.string.jumio_accessibility_camera_switch_to_front));
        this.cameraMenuItem.setIcon(R.drawable.jumio_ic_camera_switch);
        this.cameraMenuItem.setActionView(this.cameraSwitcher);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return menuItem.getItemId() != 16908332 ? super.onOptionsItemSelected(menuItem) : false;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public DeviceRotationManager getRotationManager() {
        return this.rotationManager;
    }

    public void invalidateDrawView(final boolean z) {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (BaseScanFragment.this.overlayView != null) {
                    if (z) {
                        BaseScanFragment.this.overlayView.requestLayout();
                    }
                    BaseScanFragment.this.overlayView.invalidate();
                }
            }
        });
    }

    public void resetCameraControls(boolean z, final boolean z2) {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                BaseScanFragment.this.flashSwitcher.switchToImageWithIndex(z2);
            }
        });
    }

    public void updateCameraControls(final boolean z, final boolean z2) {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                BaseScanFragment.this.handleControls(z, z2);
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void handleControls(boolean z, boolean z2) {
        if (!isDetached()) {
            try {
                if (this.cameraMenuItem != null) {
                    this.cameraMenuItem.setEnabled(z);
                    this.cameraMenuItem.setVisible(z);
                    this.cameraSwitcher.setContentDescription(getResources().getString(((BaseScanPresenter) getPresenter()).control(BaseScanControl.isCameraFrontfacing) ? R.string.jumio_accessibility_camera_switch_to_back : R.string.jumio_accessibility_camera_switch_to_front));
                }
                if (this.flashMenuItem != null) {
                    this.flashSwitcher.switchToImageWithIndex(0);
                    this.flashSwitcher.setContentDescription(getResources().getString(R.string.jumio_accessibility_flash_activate));
                    this.flashMenuItem.setEnabled(z2);
                    this.flashMenuItem.setVisible(z2);
                }
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
    }

    public void updateBranding(final boolean z) {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                BaseScanFragment.this.handleBranding(z);
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void handleBranding(boolean z) {
        if (!isDetached()) {
            if (z) {
                Rect extractionArea = ((BaseScanPresenter) getPresenter()).getExtractionArea();
                if (extractionArea != null && (extractionArea.right != 0 || extractionArea.bottom != 0)) {
                    Context context = getContext();
                    if (context != null) {
                        int dpToPx = ScreenUtil.dpToPx(context, 8);
                        this.poweredBy.setX((float) ((extractionArea.right - this.poweredBy.getWidth()) - dpToPx));
                        this.poweredBy.setY((float) ((extractionArea.bottom - this.poweredBy.getHeight()) - dpToPx));
                        if (CompatibilityLayer.getImageViewAlpha(this.poweredBy) == 0.0f) {
                            CompatibilityLayer.setImageViewAlpha(this.poweredBy, 1);
                            ObjectAnimator imageViewAlphaObjectAnimator = CompatibilityLayer.getImageViewAlphaObjectAnimator(this.poweredBy, 1, 255);
                            imageViewAlphaObjectAnimator.setDuration(200);
                            imageViewAlphaObjectAnimator.start();
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            CompatibilityLayer.setImageViewAlpha(this.poweredBy, 0);
        }
    }

    public void onImageSwitchStarted(ImageSwitcherViewDrawable imageSwitcherViewDrawable) {
        if (imageSwitcherViewDrawable == this.cameraSwitcher) {
            ((BaseScanPresenter) getPresenter()).control(BaseScanControl.toggleCamera);
        } else if (imageSwitcherViewDrawable == this.flashSwitcher) {
            ((BaseScanPresenter) getPresenter()).control(BaseScanControl.toggleFlash);
        }
    }

    public void onImageSwitchFinished(ImageSwitcherViewDrawable imageSwitcherViewDrawable) {
        if (imageSwitcherViewDrawable == this.flashSwitcher && this.flashMenuItem.getIcon() != null) {
            this.flashSwitcher.setContentDescription(getResources().getString(((BaseScanPresenter) getPresenter()).control(BaseScanControl.isFlashOn) ? R.string.jumio_accessibility_flash_deactivate : R.string.jumio_accessibility_flash_activate));
        }
    }

    public static Drawable createShutterButton(Context context) {
        TypedValue typedValue = new TypedValue();
        Theme theme = context.getTheme();
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = CompatibilityLayer.getDrawable(context.getResources(), R.drawable.jumio_shutter_button_pressed);
        theme.resolveAttribute(R.attr.jumio_shutterbutton_pressed, typedValue, true);
        drawable.setColorFilter(typedValue.data, Mode.SRC_ATOP);
        stateListDrawable.addState(new int[]{16842919}, drawable);
        stateListDrawable.addState(new int[]{16842908}, drawable);
        drawable = CompatibilityLayer.getDrawable(context.getResources(), R.drawable.jumio_shutter_button);
        theme.resolveAttribute(R.attr.jumio_shutterbutton_default, typedValue, true);
        drawable.setColorFilter(typedValue.data, Mode.SRC_ATOP);
        stateListDrawable.addState(new int[0], drawable);
        r3 = new Drawable[2];
        theme.resolveAttribute(R.attr.jumio_shutterbutton_background, typedValue, true);
        r3[0] = CompatibilityLayer.getDrawable(context.getResources(), R.drawable.jumio_shutter_button_background);
        r3[0].setColorFilter(typedValue.data, Mode.SRC_ATOP);
        r3[1] = stateListDrawable;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.jumio_shutter_button_padding);
        LayerDrawable layerDrawable = new LayerDrawable(r3);
        layerDrawable.setLayerInset(1, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        return layerDrawable;
    }
}
