package jumio.nv.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.data.document.ScanSide;
import com.jumio.nv.liveness.overlay.LivenessOverlay;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.jumio.sdk.extraction.ExtractionUpdateState;
import com.jumio.sdk.view.fragment.BaseScanFragment;

/* compiled from: FaceManualOverlay */
public class r extends LivenessOverlay {
    private ImageView a;
    private int b;
    private int c;

    public r(Context context) {
        super(context);
        this.a = new ImageView(context);
    }

    public void calculate(@NonNull DocumentScanMode documentScanMode, @NonNull DocumentFormat documentFormat, Rect rect) {
        super.calculate(documentScanMode, documentFormat, rect);
        this.b = rect.width();
        this.c = rect.height();
    }

    public void addViews(@NonNull ViewGroup viewGroup) {
        super.addViews(viewGroup);
        this.descriptionTextView.setVisibility(4);
        this.a.setImageDrawable(BaseScanFragment.createShutterButton(viewGroup.getContext()));
        this.a.setAdjustViewBounds(true);
        this.a.setLayoutParams(new LayoutParams(-2, -2));
        this.a.setVisibility(0);
        this.a.setContentDescription("Shutter");
        this.a.setClickable(true);
        viewGroup.addView(this.a);
    }

    public void setVisible(int i) {
        super.setVisible(i);
        this.a.setVisibility(i);
    }

    public void prepareDraw(ScanSide scanSide, boolean z, boolean z2) {
        super.prepareDraw(scanSide, z, z2);
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        int dipToPx = (int) ScreenUtil.dipToPx(this.a.getContext(), 4.0f);
        ImageView imageView;
        if (z2) {
            layoutParams.addRule(14, 1);
            layoutParams.addRule(15, 0);
            this.a.setTranslationX(0.0f);
            imageView = this.a;
            imageView.setTranslationY((float) ((this.c - imageView.getHeight()) - dipToPx));
            return;
        }
        layoutParams.addRule(14, 0);
        layoutParams.addRule(15, 1);
        imageView = this.a;
        imageView.setTranslationX((float) ((this.b - imageView.getWidth()) - dipToPx));
        this.a.setTranslationY(0.0f);
    }

    public void update(ExtractionUpdate extractionUpdate) {
        super.update(extractionUpdate);
        if (extractionUpdate.getState() == ExtractionUpdateState.receiveClickListener) {
            this.a.setOnClickListener((OnClickListener) extractionUpdate.getData());
        } else if (extractionUpdate.getState() == s.a) {
            this.a.setVisibility(((Integer) extractionUpdate.getData()).intValue());
        }
    }
}
