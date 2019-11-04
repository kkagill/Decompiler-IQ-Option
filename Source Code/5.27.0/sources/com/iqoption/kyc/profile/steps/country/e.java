package com.iqoption.kyc.profile.steps.country;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aFX = new int[CountryMode.values().length];
    public static final /* synthetic */ int[] aob = new int[CountryMode.values().length];
    public static final /* synthetic */ int[] axg = new int[CountryMode.values().length];

    static {
        aob[CountryMode.RESIDENCE.ordinal()] = 1;
        aob[CountryMode.CITIZENSHIP.ordinal()] = 2;
        axg[CountryMode.RESIDENCE.ordinal()] = 1;
        axg[CountryMode.CITIZENSHIP.ordinal()] = 2;
        aFX[CountryMode.RESIDENCE.ordinal()] = 1;
        aFX[CountryMode.CITIZENSHIP.ordinal()] = 2;
    }
}
