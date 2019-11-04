package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface zze extends IInterface {
    Bundle zza(Account account);

    Bundle zza(Account account, String str, Bundle bundle);

    Bundle zza(String str);

    Bundle zza(String str, Bundle bundle);

    AccountChangeEventsResponse zza(AccountChangeEventsRequest accountChangeEventsRequest);
}
