package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.aa;
import com.google.android.gms.common.Scopes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileCache */
final class m {
    private final SharedPreferences sA = f.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    m() {
    }

    /* Access modifiers changed, original: 0000 */
    public l hM() {
        String string = this.sA.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new l(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(l lVar) {
        aa.b((Object) lVar, Scopes.PROFILE);
        JSONObject gq = lVar.gq();
        if (gq != null) {
            this.sA.edit().putString("com.facebook.ProfileManager.CachedProfile", gq.toString()).apply();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void clear() {
        this.sA.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
