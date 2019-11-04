package com.pro100svitlo.creditCardNfcReader.iso7816emv.a;

import com.pro100svitlo.creditCardNfcReader.enums.TagTypeEnum;
import com.pro100svitlo.creditCardNfcReader.enums.TagValueTypeEnum;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.ITag;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.ITag.Class;
import java.util.Arrays;

/* compiled from: TagImpl */
public final class a implements ITag {
    private final String description;
    private final byte[] eGD;
    private final TagValueTypeEnum eGE;
    private final Class eGF;
    private final TagTypeEnum eGG;
    public final String name;

    public a(String str, TagValueTypeEnum tagValueTypeEnum, String str2, String str3) {
        this(com.pro100svitlo.creditCardNfcReader.a.a.kX(str), tagValueTypeEnum, str2, str3);
    }

    public a(byte[] bArr, TagValueTypeEnum tagValueTypeEnum, String str, String str2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Param id cannot be null");
        } else if (bArr.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        } else if (tagValueTypeEnum != null) {
            this.eGD = bArr;
            this.name = str;
            this.description = str2;
            this.eGE = tagValueTypeEnum;
            if (com.pro100svitlo.creditCardNfcReader.a.a.aL(this.eGD[0], 5)) {
                this.eGG = TagTypeEnum.CONSTRUCTED;
            } else {
                this.eGG = TagTypeEnum.PRIMITIVE;
            }
            byte b = (byte) ((this.eGD[0] >>> 6) & 3);
            if (b == (byte) 1) {
                this.eGF = Class.APPLICATION;
            } else if (b == (byte) 2) {
                this.eGF = Class.CONTEXT_SPECIFIC;
            } else if (b != (byte) 3) {
                this.eGF = Class.UNIVERSAL;
            } else {
                this.eGF = Class.PRIVATE;
            }
        } else {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
    }

    public boolean bgw() {
        return this.eGG == TagTypeEnum.CONSTRUCTED;
    }

    public byte[] bgx() {
        return this.eGD;
    }

    public String getName() {
        return this.name;
    }

    public TagValueTypeEnum bgA() {
        return this.eGE;
    }

    public TagTypeEnum bgB() {
        return this.eGG;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ITag)) {
            return false;
        }
        ITag iTag = (ITag) obj;
        if (bgx().length != iTag.bgx().length) {
            return false;
        }
        return Arrays.equals(bgx(), iTag.bgx());
    }

    public int hashCode() {
        return 177 + Arrays.hashCode(this.eGD);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tag[");
        stringBuilder.append(com.pro100svitlo.creditCardNfcReader.a.a.P(bgx()));
        stringBuilder.append("] Name=");
        stringBuilder.append(getName());
        stringBuilder.append(", TagType=");
        stringBuilder.append(bgB());
        stringBuilder.append(", ValueType=");
        stringBuilder.append(bgA());
        stringBuilder.append(", Class=");
        stringBuilder.append(this.eGF);
        return stringBuilder.toString();
    }
}
