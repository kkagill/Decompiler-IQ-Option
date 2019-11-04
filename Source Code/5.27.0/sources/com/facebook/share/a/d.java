package com.facebook.share.a;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.z;
import com.facebook.share.b.a;
import com.facebook.share.b.b;
import com.facebook.share.b.c;
import com.facebook.share.b.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebDialogParameters */
public class d {
    public static Bundle a(c cVar) {
        Bundle b = b((a) cVar);
        z.a(b, "href", cVar.ml());
        z.b(b, "quote", cVar.mp());
        return b;
    }

    public static Bundle b(g gVar) {
        Bundle b = b((a) gVar);
        z.b(b, "action_type", gVar.ms().mq());
        try {
            JSONObject a = c.a(c.a(gVar), false);
            if (a != null) {
                z.b(b, "action_properties", a.toString());
            }
            return b;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    public static Bundle b(a aVar) {
        Bundle bundle = new Bundle();
        b mm = aVar.mm();
        if (mm != null) {
            z.b(bundle, "hashtag", mm.mn());
        }
        return bundle;
    }
}
