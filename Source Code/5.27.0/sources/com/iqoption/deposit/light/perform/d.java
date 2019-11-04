package com.iqoption.deposit.light.perform;

import android.widget.EditText;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, bng = {"setTextWithoutCycledUpdate", "", "Landroid/widget/EditText;", "text", "", "watcher", "Lcom/iqoption/deposit/light/perform/AmountWatcher;", "deposit_release"})
/* compiled from: DepositPerformLightFragment.kt */
public final class d {
    private static final void a(EditText editText, CharSequence charSequence, b bVar) {
        bVar.cP(false);
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        editText.setText(charSequence);
        editText.setSelection(Math.min(selectionStart, editText.getText().length()), Math.min(selectionEnd, editText.getText().length()));
        bVar.cP(true);
    }
}
