package com.jumio.nv.barcode.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.jumio.commons.PersistWith;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.UploadDataModel;
import java.text.SimpleDateFormat;
import org.json.JSONObject;

@PersistWith("BarcodeDataModel")
public class BarcodeDataModel extends DocumentDataModel implements StaticModel {
    public static final Creator<BarcodeDataModel> CREATOR = new Creator<BarcodeDataModel>() {
        /* renamed from: a */
        public BarcodeDataModel createFromParcel(Parcel parcel) {
            return new BarcodeDataModel(parcel);
        }

        /* renamed from: a */
        public BarcodeDataModel[] newArray(int i) {
            return new BarcodeDataModel[i];
        }
    };
    private String rawBarcodeData;

    public BarcodeDataModel(Parcel parcel) {
        super(parcel);
        this.rawBarcodeData = parcel.readString();
    }

    public String getRawBarcodeData() {
        return this.rawBarcodeData;
    }

    public void setRawBarcodeData(String str) {
        this.rawBarcodeData = str;
    }

    public void fillRequest(JSONObject jSONObject, SimpleDateFormat simpleDateFormat, SelectionModel selectionModel, UploadDataModel uploadDataModel) {
        super.fillRequest(jSONObject, simpleDateFormat, selectionModel, uploadDataModel);
        String str = this.rawBarcodeData;
        if (str != null && str.length() != 0) {
            appendValue(jSONObject, "rawBarcodeData", Base64.encodeToString(this.rawBarcodeData.getBytes(), 2));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.rawBarcodeData);
    }
}
