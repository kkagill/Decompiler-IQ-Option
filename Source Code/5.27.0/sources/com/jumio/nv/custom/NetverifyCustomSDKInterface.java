package com.jumio.nv.custom;

import com.jumio.nv.NetverifyDocumentData;
import java.util.HashMap;

public interface NetverifyCustomSDKInterface {
    void onNetverifyCountriesReceived(HashMap<String, NetverifyCountry> hashMap, String str);

    void onNetverifyError(String str, String str2, boolean z, String str3);

    void onNetverifyFinished(NetverifyDocumentData netverifyDocumentData, String str);

    void onNetverifyResourcesLoaded();
}
