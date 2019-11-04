package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class PlusShare {
    @Deprecated
    public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
    @Deprecated
    public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    @Deprecated
    public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    @Deprecated
    public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
    @Deprecated
    public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    @Deprecated
    public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
    @Deprecated
    public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
    @Deprecated
    public static final String KEY_CALL_TO_ACTION_LABEL = "label";
    @Deprecated
    public static final String KEY_CALL_TO_ACTION_URL = "url";
    @Deprecated
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
    @Deprecated
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
    @Deprecated
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
    @Deprecated
    public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";

    @Deprecated
    @VisibleForTesting
    public static class Builder {
        private final Context mContext;
        private final Intent mIntent = new Intent().setAction("android.intent.action.SEND");
        private boolean zzp;
        private ArrayList<Uri> zzq;

        @Deprecated
        public Builder(Activity activity) {
            this.mContext = activity;
            this.mIntent.addFlags(524288);
            if (activity != null && activity.getComponentName() != null) {
                this.zzp = true;
            }
        }

        @Deprecated
        public Builder(Context context) {
            this.mContext = context;
        }

        @Deprecated
        public Builder addCallToAction(String str, Uri uri, String str2) {
            Preconditions.checkState(this.zzp, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
            boolean z = (uri == null || TextUtils.isEmpty(uri.toString())) ? false : true;
            Preconditions.checkArgument(z, "Must provide a call to action URL");
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(PlusShare.KEY_CALL_TO_ACTION_LABEL, str);
            }
            bundle.putString("url", uri.toString());
            if (!TextUtils.isEmpty(str2)) {
                Preconditions.checkState(PlusShare.zza(str2), "The specified deep-link ID was malformed.");
                bundle.putString(PlusShare.KEY_CALL_TO_ACTION_DEEP_LINK_ID, str2);
            }
            this.mIntent.putExtra(PlusShare.EXTRA_CALL_TO_ACTION, bundle);
            this.mIntent.putExtra(PlusShare.EXTRA_IS_INTERACTIVE_POST, true);
            this.mIntent.setType("text/plain");
            return this;
        }

        @Deprecated
        public Builder addStream(Uri uri) {
            Uri uri2 = (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri2 == null) {
                return setStream(uri);
            }
            if (this.zzq == null) {
                this.zzq = new ArrayList();
            }
            this.zzq.add(uri2);
            this.zzq.add(uri);
            return this;
        }

        @Deprecated
        public Intent getIntent() {
            ArrayList arrayList = this.zzq;
            boolean z = true;
            Object obj = (arrayList == null || arrayList.size() <= 1) ? null : 1;
            String str = "android.intent.action.SEND_MULTIPLE";
            boolean equals = str.equals(this.mIntent.getAction());
            boolean booleanExtra = this.mIntent.getBooleanExtra(PlusShare.EXTRA_IS_INTERACTIVE_POST, false);
            boolean z2 = obj == null || !booleanExtra;
            Preconditions.checkState(z2, "Call-to-action buttons are only available for URLs.");
            String str2 = PlusShare.EXTRA_CONTENT_URL;
            boolean z3 = !booleanExtra || this.mIntent.hasExtra(str2);
            Preconditions.checkState(z3, "The content URL is required for interactive posts.");
            String str3 = PlusShare.EXTRA_CONTENT_DEEP_LINK_ID;
            if (!(!booleanExtra || this.mIntent.hasExtra(str2) || this.mIntent.hasExtra(str3))) {
                z = false;
            }
            Preconditions.checkState(z, "Must set content URL or content deep-link ID to use a call-to-action button.");
            if (this.mIntent.hasExtra(str3)) {
                Preconditions.checkState(PlusShare.zza(this.mIntent.getStringExtra(str3)), "The specified deep-link ID was malformed.");
            }
            String str4 = "android.intent.extra.STREAM";
            if (obj == null && equals) {
                this.mIntent.setAction("android.intent.action.SEND");
                ArrayList arrayList2 = this.zzq;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.mIntent.removeExtra(str4);
                } else {
                    this.mIntent.putExtra(str4, (Parcelable) this.zzq.get(0));
                }
                this.zzq = null;
            }
            if (!(obj == null || equals)) {
                this.mIntent.setAction(str);
                arrayList = this.zzq;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.mIntent.removeExtra(str4);
                } else {
                    this.mIntent.putParcelableArrayListExtra(str4, this.zzq);
                }
            }
            String str5 = "com.google.android.gms";
            if (!"com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.mIntent.getAction())) {
                if (this.mIntent.hasExtra(str4)) {
                    this.mIntent.setPackage("com.google.android.apps.plus");
                    return this.mIntent;
                }
                this.mIntent.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
            }
            this.mIntent.setPackage(str5);
            return this.mIntent;
        }

        @Deprecated
        public Builder setContentDeepLinkId(String str) {
            return setContentDeepLinkId(str, null, null, null);
        }

        @Deprecated
        public Builder setContentDeepLinkId(String str, String str2, String str3, Uri uri) {
            Preconditions.checkArgument(this.zzp, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
            Preconditions.checkArgument(TextUtils.isEmpty(str) ^ 1, "The deepLinkId parameter is required.");
            Bundle bundle = new Bundle();
            bundle.putString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, str2);
            bundle.putString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, str3);
            if (uri != null) {
                bundle.putString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, uri.toString());
            }
            this.mIntent.putExtra(PlusShare.EXTRA_CONTENT_DEEP_LINK_ID, str);
            this.mIntent.putExtra(PlusShare.EXTRA_CONTENT_DEEP_LINK_METADATA, bundle);
            this.mIntent.setType("text/plain");
            return this;
        }

        @Deprecated
        public Builder setContentUrl(Uri uri) {
            CharSequence uri2 = uri != null ? uri.toString() : null;
            boolean isEmpty = TextUtils.isEmpty(uri2);
            String str = PlusShare.EXTRA_CONTENT_URL;
            if (isEmpty) {
                this.mIntent.removeExtra(str);
            } else {
                this.mIntent.putExtra(str, uri2);
            }
            return this;
        }

        @Deprecated
        public Builder setRecipients(Person person, List<Person> list) {
            this.mIntent.putExtra(PlusShare.EXTRA_SENDER_ID, person != null ? person.getId() : "0");
            int size = list != null ? list.size() : 0;
            String str = "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES";
            String str2 = "com.google.android.apps.plus.RECIPIENT_IDS";
            if (size == 0) {
                this.mIntent.removeExtra(str2);
                this.mIntent.removeExtra(str);
                return this;
            }
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Person person2 : list) {
                arrayList.add(person2.getId());
                arrayList2.add(person2.getDisplayName());
            }
            this.mIntent.putStringArrayListExtra(str2, arrayList);
            this.mIntent.putStringArrayListExtra(str, arrayList2);
            return this;
        }

        @Deprecated
        public Builder setStream(Uri uri) {
            this.zzq = null;
            this.mIntent.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        @Deprecated
        public Builder setText(CharSequence charSequence) {
            this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @Deprecated
        public Builder setType(String str) {
            this.mIntent.setType(str);
            return this;
        }
    }

    @Deprecated
    protected PlusShare() {
        throw new AssertionError();
    }

    @Deprecated
    @VisibleForTesting
    public static Person createPerson(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        } else if (!TextUtils.isEmpty(str2)) {
            return new zzr(str2, str, null, 0, null);
        } else {
            throw new IllegalArgumentException("Display name must not be empty.");
        }
    }

    @Deprecated
    public static String getDeepLinkId(Intent intent) {
        return (intent == null || intent.getData() == null) ? null : intent.getData().getQueryParameter(PARAM_CONTENT_DEEP_LINK_ID);
    }

    @VisibleForTesting
    protected static boolean zza(String str) {
        String str2 = "GooglePlusPlatform";
        if (TextUtils.isEmpty(str)) {
            str = "The provided deep-link ID is empty.";
        } else if (!str.contains(" ")) {
            return true;
        } else {
            str = "Spaces are not allowed in deep-link IDs.";
        }
        Log.e(str2, str);
        return false;
    }
}
