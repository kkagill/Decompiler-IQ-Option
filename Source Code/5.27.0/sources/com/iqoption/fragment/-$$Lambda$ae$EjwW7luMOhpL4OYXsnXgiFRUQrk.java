package com.iqoption.fragment;

import com.iqoption.dto.PushSetting;
import com.iqoption.view.SettingItemView;
import com.iqoption.view.SettingItemView.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ae$EjwW7luMOhpL4OYXsnXgiFRUQrk implements a {
    private final /* synthetic */ ae f$0;
    private final /* synthetic */ PushSetting f$1;
    private final /* synthetic */ SettingItemView f$2;

    public /* synthetic */ -$$Lambda$ae$EjwW7luMOhpL4OYXsnXgiFRUQrk(ae aeVar, PushSetting pushSetting, SettingItemView settingItemView) {
        this.f$0 = aeVar;
        this.f$1 = pushSetting;
        this.f$2 = settingItemView;
    }

    public final void onToggled(SettingItemView settingItemView, boolean z) {
        this.f$0.a(this.f$1, this.f$2, settingItemView, z);
    }
}
