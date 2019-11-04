package com.google.zxing.datamatrix.encoder;

import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;

/* compiled from: Base256Encoder */
final class b implements g {
    public int yM() {
        return 5;
    }

    b() {
    }

    public void a(h hVar) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        stringBuilder.append(0);
        while (hVar.yU()) {
            stringBuilder.append(hVar.yP());
            hVar.pos++;
            if (j.c(hVar.getMessage(), hVar.pos, yM()) != yM()) {
                hVar.da(0);
                break;
            }
        }
        int length = stringBuilder.length() - 1;
        int yR = (hVar.yR() + length) + 1;
        hVar.db(yR);
        Object obj = hVar.yX().zg() - yR > 0 ? 1 : null;
        if (hVar.yU() || obj != null) {
            if (length <= 249) {
                stringBuilder.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                stringBuilder.setCharAt(0, (char) ((length / Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                stringBuilder.insert(1, (char) (length % Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        length = stringBuilder.length();
        while (i < length) {
            hVar.m(a(stringBuilder.charAt(i), hVar.yR() + 1));
            i++;
        }
    }

    private static char a(char c, int i) {
        int i2 = c + (((i * 149) % 255) + 1);
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }
}
