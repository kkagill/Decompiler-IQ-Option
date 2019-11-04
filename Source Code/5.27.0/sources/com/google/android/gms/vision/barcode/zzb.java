package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;
import com.google.android.gms.vision.barcode.Barcode.ContactInfo;
import com.google.android.gms.vision.barcode.Barcode.DriverLicense;
import com.google.android.gms.vision.barcode.Barcode.Email;
import com.google.android.gms.vision.barcode.Barcode.GeoPoint;
import com.google.android.gms.vision.barcode.Barcode.Phone;
import com.google.android.gms.vision.barcode.Barcode.Sms;
import com.google.android.gms.vision.barcode.Barcode.UrlBookmark;
import com.google.android.gms.vision.barcode.Barcode.WiFi;

public final class zzb implements Creator<Barcode> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = str;
        Point[] pointArr = str2;
        Email email = pointArr;
        Phone phone = email;
        Sms sms = phone;
        WiFi wiFi = sms;
        UrlBookmark urlBookmark = wiFi;
        GeoPoint geoPoint = urlBookmark;
        CalendarEvent calendarEvent = geoPoint;
        ContactInfo contactInfo = calendarEvent;
        DriverLicense driverLicense = contactInfo;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Point.CREATOR);
                    break;
                case 7:
                    email = (Email) SafeParcelReader.createParcelable(parcel2, readHeader, Email.CREATOR);
                    break;
                case 8:
                    phone = (Phone) SafeParcelReader.createParcelable(parcel2, readHeader, Phone.CREATOR);
                    break;
                case 9:
                    sms = (Sms) SafeParcelReader.createParcelable(parcel2, readHeader, Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (WiFi) SafeParcelReader.createParcelable(parcel2, readHeader, WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (UrlBookmark) SafeParcelReader.createParcelable(parcel2, readHeader, UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (GeoPoint) SafeParcelReader.createParcelable(parcel2, readHeader, GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (CalendarEvent) SafeParcelReader.createParcelable(parcel2, readHeader, CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (ContactInfo) SafeParcelReader.createParcelable(parcel2, readHeader, ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (DriverLicense) SafeParcelReader.createParcelable(parcel2, readHeader, DriverLicense.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new Barcode(i, str, str2, i2, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense);
    }
}
