package com.google.android.gms.wallet;

import android.content.Intent;
import androidx.annotation.NonNull;

public interface AutoResolvableResult {
    void putIntoIntent(@NonNull Intent intent);
}
