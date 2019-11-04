package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.RequestHandler.Result;
import java.io.InputStream;

class ContactsPhotoRequestHandler extends RequestHandler {
    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final UriMatcher matcher = new UriMatcher(-1);
    private final Context context;

    @TargetApi(14)
    private static class ContactPhotoStreamIcs {
        private ContactPhotoStreamIcs() {
        }

        static InputStream get(ContentResolver contentResolver, Uri uri) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        String str = "com.android.contacts";
        matcher.addURI(str, "contacts/lookup/*/#", 1);
        matcher.addURI(str, "contacts/lookup/*", 1);
        matcher.addURI(str, "contacts/#/photo", 2);
        matcher.addURI(str, "contacts/#", 3);
        matcher.addURI(str, "display_photo/#", 4);
    }

    ContactsPhotoRequestHandler(Context context) {
        this.context = context;
    }

    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && matcher.match(request.uri) != -1;
    }

    public Result load(Request request, int i) {
        InputStream inputStream = getInputStream(request);
        return inputStream != null ? new Result(inputStream, LoadedFrom.DISK) : null;
    }

    private InputStream getInputStream(Request request) {
        ContentResolver contentResolver = this.context.getContentResolver();
        Uri uri = request.uri;
        int match = matcher.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid uri: ");
                        stringBuilder.append(uri);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return ContactPhotoStreamIcs.get(contentResolver, uri);
    }
}
