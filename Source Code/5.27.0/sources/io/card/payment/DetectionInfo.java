package io.card.payment;

class DetectionInfo {
    public boolean bottomEdge;
    public boolean complete = false;
    public CreditCard detectedCard;
    public int expiry_month;
    public int expiry_year;
    public float focusScore;
    public boolean leftEdge;
    public int[] prediction = new int[16];
    public boolean rightEdge;
    public boolean topEdge;

    public DetectionInfo() {
        int[] iArr = this.prediction;
        iArr[0] = -1;
        iArr[15] = -1;
        this.detectedCard = new CreditCard();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(DetectionInfo detectionInfo) {
        return detectionInfo.topEdge == this.topEdge && detectionInfo.bottomEdge == this.bottomEdge && detectionInfo.leftEdge == this.leftEdge && detectionInfo.rightEdge == this.rightEdge;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean biD() {
        return this.topEdge && this.bottomEdge && this.rightEdge && this.leftEdge;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean biE() {
        return this.complete;
    }

    /* Access modifiers changed, original: 0000 */
    public CreditCard biF() {
        String str = new String();
        int i = 0;
        while (i < 16) {
            int[] iArr = this.prediction;
            if (iArr[i] < 0 || iArr[i] >= 10) {
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(String.valueOf(this.prediction[i]));
            str = stringBuilder.toString();
            i++;
        }
        CreditCard creditCard = this.detectedCard;
        creditCard.cardNumber = str;
        creditCard.expiryMonth = this.expiry_month;
        creditCard.expiryYear = this.expiry_year;
        return creditCard;
    }

    /* Access modifiers changed, original: 0000 */
    public int biG() {
        return ((this.topEdge + this.bottomEdge) + this.leftEdge) + this.rightEdge;
    }
}
