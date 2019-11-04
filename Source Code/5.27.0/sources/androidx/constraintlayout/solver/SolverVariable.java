package androidx.constraintlayout.solver;

import com.iqoption.dto.entity.ActiveQuote;
import java.util.Arrays;

public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 7;
    public static final int STRENGTH_BARRIER = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 6;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId;
    public int id;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private String mName;
    Type mType;
    public int strength;
    float[] strengthVector;
    public int usageInRowCount;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = new int[Type.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = androidx.constraintlayout.solver.SolverVariable.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = r0;
            r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable$AnonymousClass1.<clinit>():void");
        }
    }

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static void increaseErrorId() {
        uniqueErrorId++;
    }

    private static String getUniqueName(Type type, String str) {
        StringBuilder stringBuilder;
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(uniqueErrorId);
            return stringBuilder.toString();
        }
        int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[type.ordinal()];
        if (i == 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(ActiveQuote.PHASE_UNKNOWN);
            i = uniqueUnrestrictedId + 1;
            uniqueUnrestrictedId = i;
            stringBuilder.append(i);
            return stringBuilder.toString();
        } else if (i == 2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(ActiveQuote.PHASE_CLOSED);
            i = uniqueConstantId + 1;
            uniqueConstantId = i;
            stringBuilder.append(i);
            return stringBuilder.toString();
        } else if (i == 3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("S");
            i = uniqueSlackId + 1;
            uniqueSlackId = i;
            stringBuilder.append(i);
            return stringBuilder.toString();
        } else if (i == 4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("e");
            i = uniqueErrorId + 1;
            uniqueErrorId = i;
            stringBuilder.append(i);
            return stringBuilder.toString();
        } else if (i == 5) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("V");
            i = uniqueId + 1;
            uniqueId = i;
            stringBuilder.append(i);
            return stringBuilder.toString();
        } else {
            throw new AssertionError(type.name());
        }
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mName = str;
        this.mType = type;
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mType = type;
    }

    /* Access modifiers changed, original: 0000 */
    public void clearStrengths() {
        for (int i = 0; i < 7; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String strengthsToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append("[");
        String stringBuilder2 = stringBuilder.toString();
        Object obj = null;
        Object obj2 = 1;
        for (int i = 0; i < this.strengthVector.length; i++) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(this.strengthVector[i]);
            stringBuilder2 = stringBuilder3.toString();
            float[] fArr = this.strengthVector;
            if (fArr[i] > 0.0f) {
                obj = null;
            } else if (fArr[i] < 0.0f) {
                obj = 1;
            }
            if (this.strengthVector[i] != 0.0f) {
                obj2 = null;
            }
            if (i < this.strengthVector.length - 1) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(", ");
                stringBuilder2 = stringBuilder3.toString();
            } else {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("] ");
                stringBuilder2 = stringBuilder3.toString();
            }
        }
        if (obj != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(" (-)");
            stringBuilder2 = stringBuilder.toString();
        }
        if (obj2 == null) {
            return stringBuilder2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" (*)");
        return stringBuilder.toString();
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.mClientEquationsCount;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i2 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                arrayRowArr = this.mClientEquations;
                i2 = this.mClientEquationsCount;
                arrayRowArr[i2] = arrayRow;
                this.mClientEquationsCount = i2 + 1;
                return;
            } else if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mClientEquations[i2] == arrayRow) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i4 = i2 + i3;
                    arrayRowArr[i4] = arrayRowArr[i4 + 1];
                }
                this.mClientEquationsCount--;
                return;
            }
        }
    }

    public final void updateReferencesWithNewDefinition(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].variables.updateFromRow(this.mClientEquations[i2], arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.mName);
        return stringBuilder.toString();
    }
}
