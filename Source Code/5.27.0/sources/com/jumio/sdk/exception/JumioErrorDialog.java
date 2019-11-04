package com.jumio.sdk.exception;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.core.R;
import com.jumio.gui.Colors;

public class JumioErrorDialog {

    public interface ErrorInterface {
        void getAction();

        int getCaption();

        int getColorID();
    }

    public static AlertDialog getAlertDialogBuilder(Context context, JumioError jumioError, final ErrorInterface errorInterface, final ErrorInterface errorInterface2) {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("code", jumioError.getErrorCode());
        boolean z = jumioError.isRetryable() && errorInterface != null;
        metaInfo.put("retryPossible", Boolean.valueOf(z));
        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.ERROR, metaInfo));
        Builder builder = new Builder(context);
        builder.setTitle(R.string.jumio_error_dialog_title);
        builder.setMessage(jumioError.getLocalizedError(context));
        builder.setCancelable(false);
        if (jumioError.isRetryable() && errorInterface != null) {
            builder.setPositiveButton(errorInterface.getCaption(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    errorInterface.getAction();
                }
            });
        }
        if (errorInterface2 != null) {
            builder.setNegativeButton(errorInterface2.getCaption(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    errorInterface2.getAction();
                }
            });
        }
        AlertDialog show = builder.show();
        if (errorInterface != null) {
            show.getButton(-1).setTextColor(Colors.parseColorStateList(context, errorInterface.getColorID(), -6832627));
        }
        if (errorInterface2 != null) {
            show.getButton(-2).setTextColor(Colors.parseColorStateList(context, errorInterface2.getColorID(), Colors.DIALOG_NEGATIVE_ACTION_COLOR));
        }
        return show;
    }
}
