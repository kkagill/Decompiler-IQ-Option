package com.iqoption.portfolio;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.common.collect.Sets;
import com.iqoption.util.ae;
import com.iqoption.util.e;
import java.util.Collections;
import java.util.Set;

/* compiled from: PortfolioSelection */
public class i {
    private final a dLH;
    private Set<String> dLI = Sets.uw();
    private String dLJ;

    /* compiled from: PortfolioSelection */
    public interface a {
        boolean aB(String str, String str2);
    }

    public i(@NonNull a aVar) {
        com.google.common.base.i.checkNotNull(aVar);
        this.dLH = aVar;
    }

    public boolean ju(String str) {
        return this.dLI.contains(str);
    }

    public boolean jv(String str) {
        String str2 = this.dLJ;
        return str2 != null && ae.equals(str2, str);
    }

    public String aQZ() {
        return this.dLJ;
    }

    public boolean jw(String str) {
        boolean z = this.dLI.add(str) || !this.dLI.remove(str);
        String str2 = this.dLJ;
        if (!(str2 == null || z || !this.dLH.aB(str2, str))) {
            this.dLJ = null;
        }
        return z;
    }

    public boolean jx(String str) {
        String str2 = this.dLJ;
        if (str2 == null) {
            this.dLJ = str;
            return true;
        } else if (ae.equals(str2, str)) {
            this.dLJ = null;
            return false;
        } else {
            this.dLJ = str;
            return true;
        }
    }

    public Bundle aRa() {
        e eVar = new e();
        Set set = this.dLI;
        return eVar.b("key.groups", (String[]) set.toArray(new String[set.size()])).aF("key.item", this.dLJ).toBundle();
    }

    public void T(Bundle bundle) {
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray("key.groups");
            if (stringArray != null) {
                Collections.addAll(this.dLI, stringArray);
            }
            this.dLJ = bundle.getString("key.item");
        }
    }

    public boolean a(i iVar) {
        if (iVar != null && this.dLI.equals(iVar.dLI)) {
            return ae.equals(this.dLJ, iVar.dLJ);
        }
        return false;
    }
}
