package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;

public class ConstraintWidget {
    protected static final int ANCHOR_BASELINE = 4;
    protected static final int ANCHOR_BOTTOM = 3;
    protected static final int ANCHOR_LEFT = 0;
    protected static final int ANCHOR_RIGHT = 1;
    protected static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    ConstraintWidgetGroup mBelongingGroup;
    ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    protected float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    private int mDrawHeight;
    private int mDrawWidth;
    private int mDrawX;
    private int mDrawY;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    boolean mIsHeightWrapContent;
    boolean mIsWidthWrapContent;
    ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    protected ConstraintAnchor[] mListAnchors;
    protected DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    int mMatchConstraintDefaultHeight;
    int mMatchConstraintDefaultWidth;
    int mMatchConstraintMaxHeight;
    int mMatchConstraintMaxWidth;
    int mMatchConstraintMinHeight;
    int mMatchConstraintMinWidth;
    float mMatchConstraintPercentHeight;
    float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    boolean mOptimizerMeasured;
    ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    ResolutionDimension mResolutionHeight;
    ResolutionDimension mResolutionWidth;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    int[] mResolvedMatchConstraintDefault;
    ConstraintAnchor mRight;
    boolean mRightHasCentered;
    ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    float[] mWeight;
    int mWidth;
    private int mWrapHeight;
    private int mWrapWidth;
    protected int mX;
    protected int mY;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = new int[DimensionBehaviour.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        static {
            /*
            r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = r0;
            r0 = 1;
            r1 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values();
            r4 = r4.length;
            r4 = new int[r4];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r4;
            r4 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0093 }
        L_0x0093:
            r0 = $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;	 Catch:{ NoSuchFieldError -> 0x009f }
            r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE;	 Catch:{ NoSuchFieldError -> 0x009f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x009f }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x009f }
        L_0x009f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget$AnonymousClass1.<clinit>():void");
        }
    }

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public void connectedTo(ConstraintWidget constraintWidget) {
    }

    public void resolve() {
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mWrapWidth = 0;
        this.mWrapHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        ResolutionDimension resolutionDimension = this.mResolutionWidth;
        if (resolutionDimension != null) {
            resolutionDimension.reset();
        }
        resolutionDimension = this.mResolutionHeight;
        if (resolutionDimension != null) {
            resolutionDimension.reset();
        }
        this.mBelongingGroup = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
    }

    public void resetResolutionNodes() {
        for (int i = 0; i < 6; i++) {
            this.mListAnchors[i].getResolutionNode().reset();
        }
    }

    public void updateResolutionNodes() {
        for (int i = 0; i < 6; i++) {
            this.mListAnchors[i].getResolutionNode().update();
        }
    }

    public void analyze(int i) {
        Optimizer.analyze(i, this);
    }

    public boolean isFullyResolved() {
        if (this.mLeft.getResolutionNode().state == 1 && this.mRight.getResolutionNode().state == 1 && this.mTop.getResolutionNode().state == 1 && this.mBottom.getResolutionNode().state == 1) {
            return true;
        }
        return false;
    }

    public ResolutionDimension getResolutionWidth() {
        if (this.mResolutionWidth == null) {
            this.mResolutionWidth = new ResolutionDimension();
        }
        return this.mResolutionWidth;
    }

    public ResolutionDimension getResolutionHeight() {
        if (this.mResolutionHeight == null) {
            this.mResolutionHeight = new ResolutionDimension();
        }
        return this.mResolutionHeight;
    }

    public ConstraintWidget() {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mBelongingGroup = null;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList();
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mBelongingGroup = null;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList();
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
        forceUpdateDrawPosition();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isRootContainer() {
        if (this instanceof ConstraintWidgetContainer) {
            ConstraintWidget constraintWidget = this.mParent;
            if (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) {
                return true;
            }
        }
        return false;
    }

    public boolean isInsideConstraintLayout() {
        ConstraintWidget parent = getParent();
        if (parent == null) {
            return false;
        }
        while (parent != null) {
            if (parent instanceof ConstraintWidgetContainer) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public boolean hasAncestor(ConstraintWidget constraintWidget) {
        ConstraintWidget parent = getParent();
        if (parent == constraintWidget) {
            return true;
        }
        if (parent == constraintWidget.getParent()) {
            return false;
        }
        while (parent != null) {
            if (parent == constraintWidget || parent == constraintWidget.getParent()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public WidgetContainer getRootWidgetContainer() {
        ConstraintWidget constraintWidget = this;
        while (constraintWidget.getParent() != null) {
            constraintWidget = constraintWidget.getParent();
        }
        return constraintWidget instanceof WidgetContainer ? (WidgetContainer) constraintWidget : null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(Type.CENTER, constraintWidget, Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".left");
        createObjectVariable.setName(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".top");
        createObjectVariable2.setName(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".right");
        createObjectVariable3.setName(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".bottom");
        createObjectVariable4.setName(stringBuilder2.toString());
        if (this.mBaselineDistance > 0) {
            SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(".baseline");
            createObjectVariable5.setName(stringBuilder2.toString());
        }
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        String str = " ";
        String str2 = "";
        if (this.mType != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("type: ");
            stringBuilder.append(this.mType);
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.mDebugName != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("id: ");
            stringBuilder.append(this.mDebugName);
            stringBuilder.append(str);
            str2 = stringBuilder.toString();
        }
        stringBuilder3.append(str2);
        stringBuilder3.append("(");
        stringBuilder3.append(this.mX);
        stringBuilder3.append(", ");
        stringBuilder3.append(this.mY);
        stringBuilder3.append(") - (");
        stringBuilder3.append(this.mWidth);
        stringBuilder2 = " x ";
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(this.mHeight);
        stringBuilder3.append(") wrap: (");
        stringBuilder3.append(this.mWrapWidth);
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(this.mWrapHeight);
        stringBuilder3.append(")");
        return stringBuilder3.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public int getInternalDrawX() {
        return this.mDrawX;
    }

    /* Access modifiers changed, original: 0000 */
    public int getInternalDrawY() {
        return this.mDrawY;
    }

    public int getInternalDrawRight() {
        return this.mDrawX + this.mDrawWidth;
    }

    public int getInternalDrawBottom() {
        return this.mDrawY + this.mDrawHeight;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int i = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                this.mWidth = i;
            } else {
                i = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxWidth;
        return (i2 <= 0 || i2 >= i) ? i : i2;
    }

    public int getOptimizerWrapHeight() {
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i);
        } else {
            i = this.mMatchConstraintMinHeight;
            if (i > 0) {
                this.mHeight = i;
            } else {
                i = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxHeight;
        return (i2 <= 0 || i2 >= i) ? i : i2;
    }

    public int getWrapWidth() {
        return this.mWrapWidth;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getWrapHeight() {
        return this.mWrapHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        return i == 1 ? getHeight() : 0;
    }

    public int getDrawX() {
        return this.mDrawX + this.mOffsetX;
    }

    public int getDrawY() {
        return this.mDrawY + this.mOffsetY;
    }

    public int getDrawWidth() {
        return this.mDrawWidth;
    }

    public int getDrawHeight() {
        return this.mDrawHeight;
    }

    public int getDrawBottom() {
        return getDrawY() + this.mDrawHeight;
    }

    public int getDrawRight() {
        return getDrawX() + this.mDrawWidth;
    }

    /* Access modifiers changed, original: protected */
    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    /* Access modifiers changed, original: protected */
    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        return i == 1 ? this.mVerticalBiasPercent : -1.0f;
    }

    public boolean hasBaseline() {
        return this.mBaselineDistance > 0;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(Type type, int i) {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
        } else if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        }
    }

    public void updateDrawPosition() {
        int i = this.mX;
        int i2 = this.mY;
        int i3 = this.mWidth + i;
        int i4 = this.mHeight + i2;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = i3 - i;
        this.mDrawHeight = i4 - i2;
    }

    public void forceUpdateDrawPosition() {
        int i = this.mX;
        int i2 = this.mY;
        int i3 = this.mWidth + i;
        int i4 = this.mHeight + i2;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = i3 - i;
        this.mDrawHeight = i4 - i2;
    }

    public void setDrawOrigin(int i, int i2) {
        this.mDrawX = i - this.mOffsetX;
        this.mDrawY = i2 - this.mOffsetY;
        this.mX = this.mDrawX;
        this.mY = this.mDrawY;
    }

    public void setDrawX(int i) {
        this.mDrawX = i - this.mOffsetX;
        this.mX = this.mDrawX;
    }

    public void setDrawY(int i) {
        this.mDrawY = i - this.mOffsetY;
        this.mY = this.mDrawY;
    }

    public void setDrawWidth(int i) {
        this.mDrawWidth = i;
    }

    public void setDrawHeight(int i) {
        this.mDrawHeight = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        i = this.mWidth;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        i = this.mHeight;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f < 1.0f && this.mMatchConstraintDefaultWidth == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f < 1.0f && this.mMatchConstraintDefaultHeight == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    public void setDimensionRatio(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = 1;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0084;
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0084;
    L_0x0067:
        if (r1 != r5) goto L_0x006f;
    L_0x0069:
        r9 = r9 / r2;
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x006f:
        r2 = r2 / r9;
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.mDimensionRatio = r9;
        r8.mDimensionRatioSide = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.mDimensionRatio = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setDimensionRatio(java.lang.String):void");
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setWrapWidth(int i) {
        this.mWrapWidth = i;
    }

    public void setWrapHeight(int i) {
        this.mWrapHeight = i;
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        i = this.mWidth;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        i = this.mHeight;
        i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    /* JADX WARNING: Missing block: B:7:0x001c, code skipped:
            if (r4 < r2) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:12:0x002b, code skipped:
            if (r5 < r3) goto L_0x002f;
     */
    public void setFrame(int r2, int r3, int r4, int r5) {
        /*
        r1 = this;
        r4 = r4 - r2;
        r5 = r5 - r3;
        r1.mX = r2;
        r1.mY = r3;
        r2 = r1.mVisibility;
        r3 = 0;
        r0 = 8;
        if (r2 != r0) goto L_0x0012;
    L_0x000d:
        r1.mWidth = r3;
        r1.mHeight = r3;
        return;
    L_0x0012:
        r2 = r1.mListDimensionBehaviors;
        r2 = r2[r3];
        r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        if (r2 != r3) goto L_0x001f;
    L_0x001a:
        r2 = r1.mWidth;
        if (r4 >= r2) goto L_0x001f;
    L_0x001e:
        goto L_0x0020;
    L_0x001f:
        r2 = r4;
    L_0x0020:
        r3 = r1.mListDimensionBehaviors;
        r4 = 1;
        r3 = r3[r4];
        r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        if (r3 != r0) goto L_0x002e;
    L_0x0029:
        r3 = r1.mHeight;
        if (r5 >= r3) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r3 = r5;
    L_0x002f:
        r1.mWidth = r2;
        r1.mHeight = r3;
        r2 = r1.mHeight;
        r3 = r1.mMinHeight;
        if (r2 >= r3) goto L_0x003b;
    L_0x0039:
        r1.mHeight = r3;
    L_0x003b:
        r2 = r1.mWidth;
        r3 = r1.mMinWidth;
        if (r2 >= r3) goto L_0x0043;
    L_0x0041:
        r1.mWidth = r3;
    L_0x0043:
        r1.mOptimizerMeasured = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setFrame(int, int, int, int):void");
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
        this.mOptimizerMeasured = true;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        this.mWidth = i2 - i;
        i = this.mWidth;
        i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        this.mHeight = i2 - i;
        i = this.mHeight;
        i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        return i == 1 ? this.mRelY : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(Type type, ConstraintWidget constraintWidget, Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, Strength.STRONG, 0, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2) {
        connect(constraintAnchor, constraintAnchor2, i, Strength.STRONG, i2);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        connect(constraintAnchor, constraintAnchor2, i, Strength.STRONG, 0);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, Strength strength, int i2) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i, strength, i2);
        }
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i) {
        connect(type, constraintWidget, type2, i, Strength.STRONG);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2) {
        connect(type, constraintWidget, type2, 0, Strength.STRONG);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength) {
        connect(type, constraintWidget, type2, i, strength, 0);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength, int i2) {
        Type type3 = type;
        ConstraintWidget constraintWidget2 = constraintWidget;
        Type type4 = type2;
        int i3 = i2;
        int i4 = 0;
        ConstraintAnchor anchor;
        ConstraintAnchor anchor2;
        ConstraintAnchor anchor3;
        if (type3 == Type.CENTER) {
            ConstraintWidget constraintWidget3;
            Strength strength2;
            int i5;
            if (type4 == Type.CENTER) {
                Object obj;
                anchor = getAnchor(Type.LEFT);
                anchor2 = getAnchor(Type.RIGHT);
                ConstraintAnchor anchor4 = getAnchor(Type.TOP);
                ConstraintAnchor anchor5 = getAnchor(Type.BOTTOM);
                Object obj2 = 1;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    constraintWidget3 = constraintWidget;
                    strength2 = strength;
                    i5 = i2;
                    connect(Type.LEFT, constraintWidget3, Type.LEFT, 0, strength2, i5);
                    connect(Type.RIGHT, constraintWidget3, Type.RIGHT, 0, strength2, i5);
                    obj = 1;
                } else {
                    obj = null;
                }
                if ((anchor4 == null || !anchor4.isConnected()) && (anchor5 == null || !anchor5.isConnected())) {
                    constraintWidget3 = constraintWidget;
                    strength2 = strength;
                    i5 = i2;
                    connect(Type.TOP, constraintWidget3, Type.TOP, 0, strength2, i5);
                    connect(Type.BOTTOM, constraintWidget3, Type.BOTTOM, 0, strength2, i5);
                } else {
                    obj2 = null;
                }
                if (obj != null && obj2 != null) {
                    getAnchor(Type.CENTER).connect(constraintWidget2.getAnchor(Type.CENTER), 0, i3);
                } else if (obj != null) {
                    getAnchor(Type.CENTER_X).connect(constraintWidget2.getAnchor(Type.CENTER_X), 0, i3);
                } else if (obj2 != null) {
                    getAnchor(Type.CENTER_Y).connect(constraintWidget2.getAnchor(Type.CENTER_Y), 0, i3);
                }
            } else if (type4 == Type.LEFT || type4 == Type.RIGHT) {
                connect(Type.LEFT, constraintWidget, type2, 0, strength, i2);
                try {
                    connect(Type.RIGHT, constraintWidget, type2, 0, strength, i2);
                    getAnchor(Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i3);
                } catch (Throwable th) {
                    Throwable th2 = th;
                }
            } else if (type4 == Type.TOP || type4 == Type.BOTTOM) {
                constraintWidget3 = constraintWidget;
                Type type5 = type2;
                strength2 = strength;
                i5 = i2;
                connect(Type.TOP, constraintWidget3, type5, 0, strength2, i5);
                connect(Type.BOTTOM, constraintWidget3, type5, 0, strength2, i5);
                getAnchor(Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i3);
            }
        } else if (type3 == Type.CENTER_X && (type4 == Type.LEFT || type4 == Type.RIGHT)) {
            anchor = getAnchor(Type.LEFT);
            anchor2 = constraintWidget.getAnchor(type2);
            anchor3 = getAnchor(Type.RIGHT);
            anchor.connect(anchor2, 0, i3);
            anchor3.connect(anchor2, 0, i3);
            getAnchor(Type.CENTER_X).connect(anchor2, 0, i3);
        } else if (type3 == Type.CENTER_Y && (type4 == Type.TOP || type4 == Type.BOTTOM)) {
            anchor = constraintWidget.getAnchor(type2);
            getAnchor(Type.TOP).connect(anchor, 0, i3);
            getAnchor(Type.BOTTOM).connect(anchor, 0, i3);
            getAnchor(Type.CENTER_Y).connect(anchor, 0, i3);
        } else if (type3 == Type.CENTER_X && type4 == Type.CENTER_X) {
            getAnchor(Type.LEFT).connect(constraintWidget2.getAnchor(Type.LEFT), 0, i3);
            getAnchor(Type.RIGHT).connect(constraintWidget2.getAnchor(Type.RIGHT), 0, i3);
            getAnchor(Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0, i3);
        } else if (type3 == Type.CENTER_Y && type4 == Type.CENTER_Y) {
            getAnchor(Type.TOP).connect(constraintWidget2.getAnchor(Type.TOP), 0, i3);
            getAnchor(Type.BOTTOM).connect(constraintWidget2.getAnchor(Type.BOTTOM), 0, i3);
            getAnchor(Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0, i3);
        } else {
            anchor2 = getAnchor(type);
            anchor3 = constraintWidget.getAnchor(type2);
            if (anchor2.isValidConnection(anchor3)) {
                ConstraintAnchor anchor6;
                if (type3 == Type.BASELINE) {
                    anchor = getAnchor(Type.TOP);
                    anchor6 = getAnchor(Type.BOTTOM);
                    if (anchor != null) {
                        anchor.reset();
                    }
                    if (anchor6 != null) {
                        anchor6.reset();
                    }
                } else {
                    if (type3 == Type.TOP || type3 == Type.BOTTOM) {
                        anchor6 = getAnchor(Type.BASELINE);
                        if (anchor6 != null) {
                            anchor6.reset();
                        }
                        anchor6 = getAnchor(Type.CENTER);
                        if (anchor6.getTarget() != anchor3) {
                            anchor6.reset();
                        }
                        anchor = getAnchor(type).getOpposite();
                        anchor6 = getAnchor(Type.CENTER_Y);
                        if (anchor6.isConnected()) {
                            anchor.reset();
                            anchor6.reset();
                        }
                    } else if (type3 == Type.LEFT || type3 == Type.RIGHT) {
                        anchor6 = getAnchor(Type.CENTER);
                        if (anchor6.getTarget() != anchor3) {
                            anchor6.reset();
                        }
                        anchor = getAnchor(type).getOpposite();
                        anchor6 = getAnchor(Type.CENTER_X);
                        if (anchor6.isConnected()) {
                            anchor.reset();
                            anchor6.reset();
                        }
                    }
                    i4 = i;
                }
                anchor2.connect(anchor3, i4, strength, i3);
                anchor3.getOwner().connectedTo(anchor2.getOwner());
            }
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
        if (!(this instanceof ConstraintWidgetContainer)) {
            if (getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                if (getWidth() == getWrapWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                } else if (getWidth() > getMinWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
            }
            if (getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                if (getHeight() == getWrapHeight()) {
                    setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                } else if (getHeight() > getMinHeight()) {
                    setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
            }
        }
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor6) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                    anchor.reset();
                    anchor2.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor7) {
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
                if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor5.reset();
                }
            } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i = 0; i < size; i++) {
                ((ConstraintAnchor) this.mAnchors.get(i)).reset();
            }
        }
    }

    public void resetAnchors(int i) {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintAnchor constraintAnchor = (ConstraintAnchor) this.mAnchors.get(i2);
                if (i == constraintAnchor.getConnectionCreator()) {
                    if (constraintAnchor.isVerticalAnchor()) {
                        setVerticalBiasPercent(DEFAULT_BIAS);
                    } else {
                        setHorizontalBiasPercent(DEFAULT_BIAS);
                    }
                    constraintAnchor.reset();
                }
            }
        }
    }

    public void disconnectWidget(ConstraintWidget constraintWidget) {
        ArrayList anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget) {
                constraintAnchor.reset();
            }
        }
    }

    public void disconnectUnlockedWidget(ConstraintWidget constraintWidget) {
        ArrayList anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget && constraintAnchor.getConnectionCreator() == 2) {
                constraintAnchor.reset();
            }
        }
    }

    public ConstraintAnchor getAnchor(Type type) {
        switch (type) {
            case LEFT:
                return this.mLeft;
            case TOP:
                return this.mTop;
            case RIGHT:
                return this.mRight;
            case BOTTOM:
                return this.mBottom;
            case BASELINE:
                return this.mBaseline;
            case CENTER:
                return this.mCenter;
            case CENTER_X:
                return this.mCenterX;
            case CENTER_Y:
                return this.mCenterY;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        return i == 1 ? getVerticalDimensionBehaviour() : null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setWidth(this.mWrapWidth);
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setHeight(this.mWrapHeight);
        }
    }

    public boolean isInHorizontalChain() {
        return (this.mLeft.mTarget != null && this.mLeft.mTarget.mTarget == this.mLeft) || (this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight);
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintWidget constraintWidget3;
            ConstraintAnchor anchor = constraintWidget.getAnchor(Type.LEFT);
            if (anchor == null) {
                anchor = null;
            } else {
                anchor = anchor.getTarget();
            }
            if (anchor == null) {
                constraintWidget3 = null;
            } else {
                constraintWidget3 = anchor.getOwner();
            }
            if (constraintWidget3 == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchor;
            if (constraintWidget3 == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = constraintWidget3.getAnchor(Type.RIGHT).getTarget();
            }
            if (constraintAnchor == null || constraintAnchor.getOwner() == constraintWidget) {
                constraintWidget = constraintWidget3;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        return (this.mTop.mTarget != null && this.mTop.mTarget.mTarget == this.mTop) || (this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom);
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintWidget constraintWidget3;
            ConstraintAnchor anchor = constraintWidget.getAnchor(Type.TOP);
            if (anchor == null) {
                anchor = null;
            } else {
                anchor = anchor.getTarget();
            }
            if (anchor == null) {
                constraintWidget3 = null;
            } else {
                constraintWidget3 = anchor.getOwner();
            }
            if (constraintWidget3 == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchor;
            if (constraintWidget3 == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = constraintWidget3.getAnchor(Type.BOTTOM).getTarget();
            }
            if (constraintAnchor == null || constraintAnchor.getOwner() == constraintWidget) {
                constraintWidget = constraintWidget3;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        i *= 2;
        if (this.mListAnchors[i].mTarget != null) {
            ConstraintAnchor constraintAnchor = this.mListAnchors[i].mTarget.mTarget;
            ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i]) {
                i++;
                if (constraintAnchorArr[i].mTarget != null && this.mListAnchors[i].mTarget.mTarget == this.mListAnchors[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARNING: Missing block: B:101:0x01b6, code skipped:
            if (r1 == -1) goto L_0x01ba;
     */
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r39) {
        /*
        r38 = this;
        r15 = r38;
        r14 = r39;
        r0 = r15.mLeft;
        r21 = r14.createObjectVariable(r0);
        r0 = r15.mRight;
        r10 = r14.createObjectVariable(r0);
        r0 = r15.mTop;
        r6 = r14.createObjectVariable(r0);
        r0 = r15.mBottom;
        r4 = r14.createObjectVariable(r0);
        r0 = r15.mBaseline;
        r3 = r14.createObjectVariable(r0);
        r0 = r15.mParent;
        r1 = 8;
        r2 = 1;
        r13 = 0;
        if (r0 == 0) goto L_0x00b0;
    L_0x002a:
        if (r0 == 0) goto L_0x0036;
    L_0x002c:
        r0 = r0.mListDimensionBehaviors;
        r0 = r0[r13];
        r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r0 != r5) goto L_0x0036;
    L_0x0034:
        r0 = 1;
        goto L_0x0037;
    L_0x0036:
        r0 = 0;
    L_0x0037:
        r5 = r15.mParent;
        if (r5 == 0) goto L_0x0045;
    L_0x003b:
        r5 = r5.mListDimensionBehaviors;
        r5 = r5[r2];
        r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r5 != r7) goto L_0x0045;
    L_0x0043:
        r5 = 1;
        goto L_0x0046;
    L_0x0045:
        r5 = 0;
    L_0x0046:
        r7 = r15.isChainHead(r13);
        if (r7 == 0) goto L_0x0055;
    L_0x004c:
        r7 = r15.mParent;
        r7 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r7;
        r7.addChain(r15, r13);
        r7 = 1;
        goto L_0x0059;
    L_0x0055:
        r7 = r38.isInHorizontalChain();
    L_0x0059:
        r8 = r15.isChainHead(r2);
        if (r8 == 0) goto L_0x0068;
    L_0x005f:
        r8 = r15.mParent;
        r8 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r8;
        r8.addChain(r15, r2);
        r8 = 1;
        goto L_0x006c;
    L_0x0068:
        r8 = r38.isInVerticalChain();
    L_0x006c:
        if (r0 == 0) goto L_0x0089;
    L_0x006e:
        r9 = r15.mVisibility;
        if (r9 == r1) goto L_0x0089;
    L_0x0072:
        r9 = r15.mLeft;
        r9 = r9.mTarget;
        if (r9 != 0) goto L_0x0089;
    L_0x0078:
        r9 = r15.mRight;
        r9 = r9.mTarget;
        if (r9 != 0) goto L_0x0089;
    L_0x007e:
        r9 = r15.mParent;
        r9 = r9.mRight;
        r9 = r14.createObjectVariable(r9);
        r14.addGreaterThan(r9, r10, r13, r2);
    L_0x0089:
        if (r5 == 0) goto L_0x00aa;
    L_0x008b:
        r9 = r15.mVisibility;
        if (r9 == r1) goto L_0x00aa;
    L_0x008f:
        r9 = r15.mTop;
        r9 = r9.mTarget;
        if (r9 != 0) goto L_0x00aa;
    L_0x0095:
        r9 = r15.mBottom;
        r9 = r9.mTarget;
        if (r9 != 0) goto L_0x00aa;
    L_0x009b:
        r9 = r15.mBaseline;
        if (r9 != 0) goto L_0x00aa;
    L_0x009f:
        r9 = r15.mParent;
        r9 = r9.mBottom;
        r9 = r14.createObjectVariable(r9);
        r14.addGreaterThan(r9, r4, r13, r2);
    L_0x00aa:
        r12 = r5;
        r16 = r7;
        r22 = r8;
        goto L_0x00b6;
    L_0x00b0:
        r0 = 0;
        r12 = 0;
        r16 = 0;
        r22 = 0;
    L_0x00b6:
        r5 = r15.mWidth;
        r7 = r15.mMinWidth;
        if (r5 >= r7) goto L_0x00bd;
    L_0x00bc:
        r5 = r7;
    L_0x00bd:
        r7 = r15.mHeight;
        r8 = r15.mMinHeight;
        if (r7 >= r8) goto L_0x00c4;
    L_0x00c3:
        r7 = r8;
    L_0x00c4:
        r8 = r15.mListDimensionBehaviors;
        r8 = r8[r13];
        r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r8 == r9) goto L_0x00ce;
    L_0x00cc:
        r8 = 1;
        goto L_0x00cf;
    L_0x00ce:
        r8 = 0;
    L_0x00cf:
        r9 = r15.mListDimensionBehaviors;
        r9 = r9[r2];
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r9 == r11) goto L_0x00d9;
    L_0x00d7:
        r9 = 1;
        goto L_0x00da;
    L_0x00d9:
        r9 = 0;
    L_0x00da:
        r11 = r15.mDimensionRatioSide;
        r15.mResolvedDimensionRatioSide = r11;
        r11 = r15.mDimensionRatio;
        r15.mResolvedDimensionRatio = r11;
        r2 = r15.mMatchConstraintDefaultWidth;
        r13 = r15.mMatchConstraintDefaultHeight;
        r18 = 0;
        r19 = 4;
        r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r11 <= 0) goto L_0x019b;
    L_0x00ee:
        r11 = r15.mVisibility;
        r1 = 8;
        if (r11 == r1) goto L_0x019b;
    L_0x00f4:
        r1 = r15.mListDimensionBehaviors;
        r11 = 0;
        r1 = r1[r11];
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r23 = r3;
        r3 = 3;
        if (r1 != r11) goto L_0x0103;
    L_0x0100:
        if (r2 != 0) goto L_0x0103;
    L_0x0102:
        r2 = 3;
    L_0x0103:
        r1 = r15.mListDimensionBehaviors;
        r11 = 1;
        r1 = r1[r11];
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r1 != r11) goto L_0x010f;
    L_0x010c:
        if (r13 != 0) goto L_0x010f;
    L_0x010e:
        r13 = 3;
    L_0x010f:
        r1 = r15.mListDimensionBehaviors;
        r11 = 0;
        r1 = r1[r11];
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r1 != r11) goto L_0x012a;
    L_0x0118:
        r1 = r15.mListDimensionBehaviors;
        r11 = 1;
        r1 = r1[r11];
        r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r1 != r11) goto L_0x012a;
    L_0x0121:
        if (r2 != r3) goto L_0x012a;
    L_0x0123:
        if (r13 != r3) goto L_0x012a;
    L_0x0125:
        r15.setupDimensionRatio(r0, r12, r8, r9);
        goto L_0x0190;
    L_0x012a:
        r1 = r15.mListDimensionBehaviors;
        r8 = 0;
        r1 = r1[r8];
        r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r1 != r9) goto L_0x0156;
    L_0x0133:
        if (r2 != r3) goto L_0x0156;
    L_0x0135:
        r15.mResolvedDimensionRatioSide = r8;
        r1 = r15.mResolvedDimensionRatio;
        r3 = r15.mHeight;
        r3 = (float) r3;
        r1 = r1 * r3;
        r1 = (int) r1;
        r3 = r15.mListDimensionBehaviors;
        r8 = 1;
        r3 = r3[r8];
        r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r3 == r5) goto L_0x0151;
    L_0x0148:
        r28 = r1;
        r29 = r7;
        r26 = r13;
        r25 = 4;
        goto L_0x01a5;
    L_0x0151:
        r28 = r1;
        r25 = r2;
        goto L_0x0194;
    L_0x0156:
        r8 = 1;
        r1 = r15.mListDimensionBehaviors;
        r1 = r1[r8];
        r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r1 != r9) goto L_0x0190;
    L_0x015f:
        if (r13 != r3) goto L_0x0190;
    L_0x0161:
        r15.mResolvedDimensionRatioSide = r8;
        r1 = r15.mDimensionRatioSide;
        r3 = -1;
        if (r1 != r3) goto L_0x016f;
    L_0x0168:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = r15.mResolvedDimensionRatio;
        r1 = r1 / r3;
        r15.mResolvedDimensionRatio = r1;
    L_0x016f:
        r1 = r15.mResolvedDimensionRatio;
        r3 = r15.mWidth;
        r3 = (float) r3;
        r1 = r1 * r3;
        r1 = (int) r1;
        r3 = r15.mListDimensionBehaviors;
        r7 = 0;
        r3 = r3[r7];
        r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r3 == r7) goto L_0x0189;
    L_0x0180:
        r29 = r1;
        r25 = r2;
        r28 = r5;
        r26 = 4;
        goto L_0x01a5;
    L_0x0189:
        r29 = r1;
        r25 = r2;
        r28 = r5;
        goto L_0x0196;
    L_0x0190:
        r25 = r2;
        r28 = r5;
    L_0x0194:
        r29 = r7;
    L_0x0196:
        r26 = r13;
        r27 = 1;
        goto L_0x01a7;
    L_0x019b:
        r23 = r3;
        r25 = r2;
        r28 = r5;
        r29 = r7;
        r26 = r13;
    L_0x01a5:
        r27 = 0;
    L_0x01a7:
        r1 = r15.mResolvedMatchConstraintDefault;
        r2 = 0;
        r1[r2] = r25;
        r2 = 1;
        r1[r2] = r26;
        if (r27 == 0) goto L_0x01bd;
    L_0x01b1:
        r1 = r15.mResolvedDimensionRatioSide;
        if (r1 == 0) goto L_0x01b9;
    L_0x01b5:
        r2 = -1;
        if (r1 != r2) goto L_0x01be;
    L_0x01b8:
        goto L_0x01ba;
    L_0x01b9:
        r2 = -1;
    L_0x01ba:
        r24 = 1;
        goto L_0x01c0;
    L_0x01bd:
        r2 = -1;
    L_0x01be:
        r24 = 0;
    L_0x01c0:
        r1 = r15.mListDimensionBehaviors;
        r3 = 0;
        r1 = r1[r3];
        r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r1 != r3) goto L_0x01d0;
    L_0x01c9:
        r1 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
        if (r1 == 0) goto L_0x01d0;
    L_0x01cd:
        r30 = 1;
        goto L_0x01d2;
    L_0x01d0:
        r30 = 0;
    L_0x01d2:
        r1 = r15.mCenter;
        r1 = r1.isConnected();
        r3 = 1;
        r31 = r1 ^ 1;
        r1 = r15.mHorizontalResolution;
        r13 = 2;
        r32 = 0;
        if (r1 == r13) goto L_0x0249;
    L_0x01e2:
        r1 = r15.mParent;
        if (r1 == 0) goto L_0x01ef;
    L_0x01e6:
        r1 = r1.mRight;
        r1 = r14.createObjectVariable(r1);
        r20 = r1;
        goto L_0x01f1;
    L_0x01ef:
        r20 = r32;
    L_0x01f1:
        r1 = r15.mParent;
        if (r1 == 0) goto L_0x01fe;
    L_0x01f5:
        r1 = r1.mLeft;
        r1 = r14.createObjectVariable(r1);
        r33 = r1;
        goto L_0x0200;
    L_0x01fe:
        r33 = r32;
    L_0x0200:
        r1 = r15.mListDimensionBehaviors;
        r17 = 0;
        r5 = r1[r17];
        r7 = r15.mLeft;
        r8 = r15.mRight;
        r9 = r15.mX;
        r11 = r15.mMinWidth;
        r1 = r15.mMaxDimension;
        r1 = r1[r17];
        r34 = r12;
        r12 = r1;
        r1 = r15.mHorizontalBiasPercent;
        r13 = r1;
        r1 = r15.mMatchConstraintMinWidth;
        r17 = r1;
        r1 = r15.mMatchConstraintMaxWidth;
        r18 = r1;
        r1 = r15.mMatchConstraintPercentWidth;
        r19 = r1;
        r35 = r0;
        r0 = r38;
        r1 = r39;
        r3 = -1;
        r2 = r35;
        r36 = r23;
        r3 = r33;
        r23 = r4;
        r4 = r20;
        r37 = r6;
        r6 = r30;
        r30 = r10;
        r10 = r28;
        r14 = r24;
        r15 = r16;
        r16 = r25;
        r20 = r31;
        r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x0253;
    L_0x0249:
        r37 = r6;
        r30 = r10;
        r34 = r12;
        r36 = r23;
        r23 = r4;
    L_0x0253:
        r15 = r38;
        r0 = r15.mVerticalResolution;
        r1 = 2;
        if (r0 != r1) goto L_0x025b;
    L_0x025a:
        return;
    L_0x025b:
        r0 = r15.mListDimensionBehaviors;
        r14 = 1;
        r0 = r0[r14];
        r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r0 != r1) goto L_0x026a;
    L_0x0264:
        r0 = r15 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
        if (r0 == 0) goto L_0x026a;
    L_0x0268:
        r6 = 1;
        goto L_0x026b;
    L_0x026a:
        r6 = 0;
    L_0x026b:
        if (r27 == 0) goto L_0x0277;
    L_0x026d:
        r0 = r15.mResolvedDimensionRatioSide;
        if (r0 == r14) goto L_0x0274;
    L_0x0271:
        r1 = -1;
        if (r0 != r1) goto L_0x0277;
    L_0x0274:
        r16 = 1;
        goto L_0x0279;
    L_0x0277:
        r16 = 0;
    L_0x0279:
        r0 = r15.mBaselineDistance;
        if (r0 <= 0) goto L_0x02b6;
    L_0x027d:
        r0 = r15.mBaseline;
        r0 = r0.getResolutionNode();
        r0 = r0.state;
        if (r0 != r14) goto L_0x0293;
    L_0x0287:
        r0 = r15.mBaseline;
        r0 = r0.getResolutionNode();
        r10 = r39;
        r0.addResolvedValue(r10);
        goto L_0x02b8;
    L_0x0293:
        r10 = r39;
        r0 = r38.getBaselineDistance();
        r1 = 6;
        r2 = r36;
        r4 = r37;
        r10.addEquality(r2, r4, r0, r1);
        r0 = r15.mBaseline;
        r0 = r0.mTarget;
        if (r0 == 0) goto L_0x02ba;
    L_0x02a7:
        r0 = r15.mBaseline;
        r0 = r0.mTarget;
        r0 = r10.createObjectVariable(r0);
        r3 = 0;
        r10.addEquality(r2, r0, r3, r1);
        r20 = 0;
        goto L_0x02bc;
    L_0x02b6:
        r10 = r39;
    L_0x02b8:
        r4 = r37;
    L_0x02ba:
        r20 = r31;
    L_0x02bc:
        r0 = r15.mParent;
        if (r0 == 0) goto L_0x02c9;
    L_0x02c0:
        r0 = r0.mBottom;
        r0 = r10.createObjectVariable(r0);
        r24 = r0;
        goto L_0x02cb;
    L_0x02c9:
        r24 = r32;
    L_0x02cb:
        r0 = r15.mParent;
        if (r0 == 0) goto L_0x02d7;
    L_0x02cf:
        r0 = r0.mTop;
        r0 = r10.createObjectVariable(r0);
        r3 = r0;
        goto L_0x02d9;
    L_0x02d7:
        r3 = r32;
    L_0x02d9:
        r0 = r15.mListDimensionBehaviors;
        r5 = r0[r14];
        r7 = r15.mTop;
        r8 = r15.mBottom;
        r9 = r15.mY;
        r11 = r15.mMinHeight;
        r0 = r15.mMaxDimension;
        r12 = r0[r14];
        r13 = r15.mVerticalBiasPercent;
        r0 = r15.mMatchConstraintMinHeight;
        r17 = r0;
        r0 = r15.mMatchConstraintMaxHeight;
        r18 = r0;
        r0 = r15.mMatchConstraintPercentHeight;
        r19 = r0;
        r0 = r38;
        r1 = r39;
        r2 = r34;
        r25 = r4;
        r4 = r24;
        r10 = r29;
        r14 = r16;
        r15 = r22;
        r16 = r26;
        r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        if (r27 == 0) goto L_0x0337;
    L_0x030e:
        r6 = 6;
        r7 = r38;
        r0 = r7.mResolvedDimensionRatioSide;
        r1 = 1;
        if (r0 != r1) goto L_0x0326;
    L_0x0316:
        r5 = r7.mResolvedDimensionRatio;
        r0 = r39;
        r1 = r23;
        r2 = r25;
        r3 = r30;
        r4 = r21;
        r0.addRatio(r1, r2, r3, r4, r5, r6);
        goto L_0x0339;
    L_0x0326:
        r5 = r7.mResolvedDimensionRatio;
        r6 = 6;
        r0 = r39;
        r1 = r30;
        r2 = r21;
        r3 = r23;
        r4 = r25;
        r0.addRatio(r1, r2, r3, r4, r5, r6);
        goto L_0x0339;
    L_0x0337:
        r7 = r38;
    L_0x0339:
        r0 = r7.mCenter;
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x0361;
    L_0x0341:
        r0 = r7.mCenter;
        r0 = r0.getTarget();
        r0 = r0.getOwner();
        r1 = r7.mCircleConstraintAngle;
        r2 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r1 = r1 + r2;
        r1 = (double) r1;
        r1 = java.lang.Math.toRadians(r1);
        r1 = (float) r1;
        r2 = r7.mCenter;
        r2 = r2.getMargin();
        r3 = r39;
        r3.addCenterPoint(r7, r0, r1, r2);
    L_0x0361:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.solver.LinearSystem):void");
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && !(this.mLeft.isConnected() && this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && !(this.mTop.isConnected() && this.mBottom.isConnected() && this.mLeft.isConnected() && this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z && !z2) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z && z2) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (this.mMatchConstraintMinWidth > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1 && z && z2) {
            this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd  */
    private void applyConstraints(androidx.constraintlayout.solver.LinearSystem r26, boolean r27, androidx.constraintlayout.solver.SolverVariable r28, androidx.constraintlayout.solver.SolverVariable r29, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r30, boolean r31, androidx.constraintlayout.solver.widgets.ConstraintAnchor r32, androidx.constraintlayout.solver.widgets.ConstraintAnchor r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
        r25 = this;
        r0 = r25;
        r10 = r26;
        r11 = r28;
        r12 = r29;
        r13 = r32;
        r14 = r33;
        r1 = r36;
        r2 = r37;
        r15 = r10.createObjectVariable(r13);
        r9 = r10.createObjectVariable(r14);
        r3 = r32.getTarget();
        r8 = r10.createObjectVariable(r3);
        r3 = r33.getTarget();
        r7 = r10.createObjectVariable(r3);
        r3 = r10.graphOptimizer;
        r6 = 1;
        r4 = 6;
        r5 = 0;
        if (r3 == 0) goto L_0x0066;
    L_0x002f:
        r3 = r32.getResolutionNode();
        r3 = r3.state;
        if (r3 != r6) goto L_0x0066;
    L_0x0037:
        r3 = r33.getResolutionNode();
        r3 = r3.state;
        if (r3 != r6) goto L_0x0066;
    L_0x003f:
        r1 = androidx.constraintlayout.solver.LinearSystem.getMetrics();
        if (r1 == 0) goto L_0x0050;
    L_0x0045:
        r1 = androidx.constraintlayout.solver.LinearSystem.getMetrics();
        r2 = r1.resolvedWidgets;
        r6 = 1;
        r2 = r2 + r6;
        r1.resolvedWidgets = r2;
    L_0x0050:
        r1 = r32.getResolutionNode();
        r1.addResolvedValue(r10);
        r1 = r33.getResolutionNode();
        r1.addResolvedValue(r10);
        if (r40 != 0) goto L_0x0065;
    L_0x0060:
        if (r27 == 0) goto L_0x0065;
    L_0x0062:
        r10.addGreaterThan(r12, r9, r5, r4);
    L_0x0065:
        return;
    L_0x0066:
        r3 = androidx.constraintlayout.solver.LinearSystem.getMetrics();
        if (r3 == 0) goto L_0x0078;
    L_0x006c:
        r3 = androidx.constraintlayout.solver.LinearSystem.getMetrics();
        r4 = r3.nonresolvedWidgets;
        r16 = 1;
        r4 = r4 + r16;
        r3.nonresolvedWidgets = r4;
    L_0x0078:
        r16 = r32.isConnected();
        r17 = r33.isConnected();
        r3 = r0.mCenter;
        r20 = r3.isConnected();
        if (r16 == 0) goto L_0x008a;
    L_0x0088:
        r3 = 1;
        goto L_0x008b;
    L_0x008a:
        r3 = 0;
    L_0x008b:
        if (r17 == 0) goto L_0x008f;
    L_0x008d:
        r3 = r3 + 1;
    L_0x008f:
        if (r20 == 0) goto L_0x0093;
    L_0x0091:
        r3 = r3 + 1;
    L_0x0093:
        r5 = r3;
        if (r39 == 0) goto L_0x0098;
    L_0x0096:
        r3 = 3;
        goto L_0x009a;
    L_0x0098:
        r3 = r41;
    L_0x009a:
        r21 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;
        r22 = r30.ordinal();
        r4 = r21[r22];
        r14 = 2;
        r13 = 4;
        if (r4 == r6) goto L_0x00ad;
    L_0x00a6:
        if (r4 == r14) goto L_0x00ad;
    L_0x00a8:
        r14 = 3;
        if (r4 == r14) goto L_0x00ad;
    L_0x00ab:
        if (r4 == r13) goto L_0x00af;
    L_0x00ad:
        r4 = 0;
        goto L_0x00b3;
    L_0x00af:
        if (r3 != r13) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00ad;
    L_0x00b2:
        r4 = 1;
    L_0x00b3:
        r14 = r0.mVisibility;
        r13 = 8;
        if (r14 != r13) goto L_0x00bc;
    L_0x00b9:
        r4 = 0;
        r13 = 0;
        goto L_0x00bf;
    L_0x00bc:
        r13 = r4;
        r4 = r35;
    L_0x00bf:
        if (r45 == 0) goto L_0x00da;
    L_0x00c1:
        if (r16 != 0) goto L_0x00cd;
    L_0x00c3:
        if (r17 != 0) goto L_0x00cd;
    L_0x00c5:
        if (r20 != 0) goto L_0x00cd;
    L_0x00c7:
        r14 = r34;
        r10.addEquality(r15, r14);
        goto L_0x00da;
    L_0x00cd:
        if (r16 == 0) goto L_0x00da;
    L_0x00cf:
        if (r17 != 0) goto L_0x00da;
    L_0x00d1:
        r14 = r32.getMargin();
        r6 = 6;
        r10.addEquality(r15, r8, r14, r6);
        goto L_0x00db;
    L_0x00da:
        r6 = 6;
    L_0x00db:
        if (r13 != 0) goto L_0x0109;
    L_0x00dd:
        if (r31 == 0) goto L_0x00f6;
    L_0x00df:
        r6 = 0;
        r14 = 3;
        r10.addEquality(r9, r15, r6, r14);
        if (r1 <= 0) goto L_0x00eb;
    L_0x00e6:
        r4 = 6;
        r10.addGreaterThan(r9, r15, r1, r4);
        goto L_0x00ec;
    L_0x00eb:
        r4 = 6;
    L_0x00ec:
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 >= r6) goto L_0x00f4;
    L_0x00f1:
        r10.addLowerThan(r9, r15, r2, r4);
    L_0x00f4:
        r6 = 6;
        goto L_0x00fa;
    L_0x00f6:
        r14 = 3;
        r10.addEquality(r9, r15, r4, r6);
    L_0x00fa:
        r14 = r43;
        r31 = r3;
        r0 = r5;
        r24 = r7;
        r23 = r8;
        r1 = 0;
        r2 = 2;
        r3 = r42;
        goto L_0x01f3;
    L_0x0109:
        r14 = 3;
        r2 = -2;
        r14 = r42;
        if (r14 != r2) goto L_0x0113;
    L_0x010f:
        r14 = r43;
        r6 = r4;
        goto L_0x0116;
    L_0x0113:
        r6 = r14;
        r14 = r43;
    L_0x0116:
        if (r14 != r2) goto L_0x0119;
    L_0x0118:
        r14 = r4;
    L_0x0119:
        if (r6 <= 0) goto L_0x0124;
    L_0x011b:
        r2 = 6;
        r10.addGreaterThan(r9, r15, r6, r2);
        r4 = java.lang.Math.max(r4, r6);
        goto L_0x0125;
    L_0x0124:
        r2 = 6;
    L_0x0125:
        if (r14 <= 0) goto L_0x012e;
    L_0x0127:
        r10.addLowerThan(r9, r15, r14, r2);
        r4 = java.lang.Math.min(r4, r14);
    L_0x012e:
        r2 = 1;
        if (r3 != r2) goto L_0x0159;
    L_0x0131:
        if (r27 == 0) goto L_0x0145;
    L_0x0133:
        r2 = 6;
        r10.addEquality(r9, r15, r4, r2);
        r31 = r3;
        r0 = r5;
        r24 = r7;
        r23 = r8;
        r35 = r13;
        r1 = 0;
        r8 = r4;
        r13 = r6;
        goto L_0x01d6;
    L_0x0145:
        r2 = 6;
        if (r40 == 0) goto L_0x0150;
    L_0x0148:
        r35 = r13;
        r13 = 4;
        r10.addEquality(r9, r15, r4, r13);
        goto L_0x01cc;
    L_0x0150:
        r35 = r13;
        r2 = 1;
        r13 = 4;
        r10.addEquality(r9, r15, r4, r2);
        goto L_0x01cc;
    L_0x0159:
        r35 = r13;
        r2 = 2;
        r13 = 4;
        if (r3 != r2) goto L_0x01cc;
    L_0x015f:
        r2 = r32.getType();
        r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP;
        if (r2 == r13) goto L_0x018b;
    L_0x0167:
        r2 = r32.getType();
        r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        if (r2 != r13) goto L_0x0170;
    L_0x016f:
        goto L_0x018b;
    L_0x0170:
        r2 = r0.mParent;
        r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT;
        r2 = r2.getAnchor(r13);
        r2 = r10.createObjectVariable(r2);
        r13 = r0.mParent;
        r31 = r2;
        r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r2 = r13.getAnchor(r2);
        r2 = r10.createObjectVariable(r2);
        goto L_0x01a5;
    L_0x018b:
        r2 = r0.mParent;
        r13 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP;
        r2 = r2.getAnchor(r13);
        r2 = r10.createObjectVariable(r2);
        r13 = r0.mParent;
        r31 = r2;
        r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r2 = r13.getAnchor(r2);
        r2 = r10.createObjectVariable(r2);
    L_0x01a5:
        r22 = r31;
        r13 = r2;
        r2 = r26.createRow();
        r18 = 1;
        r21 = 6;
        r0 = r3;
        r3 = r9;
        r31 = r0;
        r23 = r8;
        r0 = 6;
        r8 = r4;
        r4 = r15;
        r0 = r5;
        r1 = 0;
        r5 = r13;
        r13 = r6;
        r6 = r22;
        r24 = r7;
        r7 = r44;
        r2 = r2.createRowDimensionRatio(r3, r4, r5, r6, r7);
        r10.addConstraint(r2);
        r5 = 0;
        goto L_0x01d8;
    L_0x01cc:
        r31 = r3;
        r0 = r5;
        r13 = r6;
        r24 = r7;
        r23 = r8;
        r1 = 0;
        r8 = r4;
    L_0x01d6:
        r5 = r35;
    L_0x01d8:
        if (r5 == 0) goto L_0x01f0;
    L_0x01da:
        r2 = 2;
        if (r0 == r2) goto L_0x01f1;
    L_0x01dd:
        if (r39 != 0) goto L_0x01f1;
    L_0x01df:
        r3 = java.lang.Math.max(r13, r8);
        if (r14 <= 0) goto L_0x01e9;
    L_0x01e5:
        r3 = java.lang.Math.min(r14, r3);
    L_0x01e9:
        r4 = 6;
        r10.addEquality(r9, r15, r3, r4);
        r3 = r13;
        r13 = 0;
        goto L_0x01f3;
    L_0x01f0:
        r2 = 2;
    L_0x01f1:
        r3 = r13;
        r13 = r5;
    L_0x01f3:
        if (r45 == 0) goto L_0x0331;
    L_0x01f5:
        if (r40 == 0) goto L_0x01f9;
    L_0x01f7:
        goto L_0x0331;
    L_0x01f9:
        r0 = 5;
        if (r16 != 0) goto L_0x0207;
    L_0x01fc:
        if (r17 != 0) goto L_0x0207;
    L_0x01fe:
        if (r20 != 0) goto L_0x0207;
    L_0x0200:
        if (r27 == 0) goto L_0x0326;
    L_0x0202:
        r10.addGreaterThan(r12, r9, r1, r0);
        goto L_0x0326;
    L_0x0207:
        if (r16 == 0) goto L_0x0212;
    L_0x0209:
        if (r17 != 0) goto L_0x0212;
    L_0x020b:
        if (r27 == 0) goto L_0x0326;
    L_0x020d:
        r10.addGreaterThan(r12, r9, r1, r0);
        goto L_0x0326;
    L_0x0212:
        if (r16 != 0) goto L_0x0228;
    L_0x0214:
        if (r17 == 0) goto L_0x0228;
    L_0x0216:
        r2 = r33.getMargin();
        r2 = -r2;
        r8 = r24;
        r3 = 6;
        r10.addEquality(r9, r8, r2, r3);
        if (r27 == 0) goto L_0x0326;
    L_0x0223:
        r10.addGreaterThan(r15, r11, r1, r0);
        goto L_0x0326;
    L_0x0228:
        r8 = r24;
        if (r16 == 0) goto L_0x0326;
    L_0x022c:
        if (r17 == 0) goto L_0x0326;
    L_0x022e:
        if (r13 == 0) goto L_0x029e;
    L_0x0230:
        if (r27 == 0) goto L_0x023a;
    L_0x0232:
        r7 = 0;
        if (r36 != 0) goto L_0x023b;
    L_0x0235:
        r1 = 6;
        r10.addGreaterThan(r9, r15, r7, r1);
        goto L_0x023b;
    L_0x023a:
        r7 = 0;
    L_0x023b:
        if (r31 != 0) goto L_0x0265;
    L_0x023d:
        if (r14 > 0) goto L_0x0245;
    L_0x023f:
        if (r3 <= 0) goto L_0x0242;
    L_0x0241:
        goto L_0x0245;
    L_0x0242:
        r1 = 6;
        r6 = 0;
        goto L_0x0247;
    L_0x0245:
        r1 = 4;
        r6 = 1;
    L_0x0247:
        r2 = r32.getMargin();
        r5 = r23;
        r10.addEquality(r15, r5, r2, r1);
        r2 = r33.getMargin();
        r2 = -r2;
        r10.addEquality(r9, r8, r2, r1);
        if (r14 > 0) goto L_0x025f;
    L_0x025a:
        if (r3 <= 0) goto L_0x025d;
    L_0x025c:
        goto L_0x025f;
    L_0x025d:
        r1 = 0;
        goto L_0x0260;
    L_0x025f:
        r1 = 1;
    L_0x0260:
        r16 = r6;
        r6 = 1;
        r14 = 5;
        goto L_0x0270;
    L_0x0265:
        r4 = r31;
        r5 = r23;
        r6 = 1;
        if (r4 != r6) goto L_0x0273;
    L_0x026c:
        r1 = 1;
        r14 = 6;
        r16 = 1;
    L_0x0270:
        r4 = r25;
        goto L_0x02a8;
    L_0x0273:
        r1 = 3;
        if (r4 != r1) goto L_0x029a;
    L_0x0276:
        if (r39 != 0) goto L_0x0283;
    L_0x0278:
        r4 = r25;
        r1 = r4.mResolvedDimensionRatioSide;
        r2 = -1;
        if (r1 == r2) goto L_0x0285;
    L_0x027f:
        if (r14 > 0) goto L_0x0285;
    L_0x0281:
        r1 = 6;
        goto L_0x0286;
    L_0x0283:
        r4 = r25;
    L_0x0285:
        r1 = 4;
    L_0x0286:
        r2 = r32.getMargin();
        r10.addEquality(r15, r5, r2, r1);
        r2 = r33.getMargin();
        r2 = -r2;
        r10.addEquality(r9, r8, r2, r1);
        r1 = 1;
        r14 = 5;
        r16 = 1;
        goto L_0x02a8;
    L_0x029a:
        r4 = r25;
        r1 = 0;
        goto L_0x02a5;
    L_0x029e:
        r5 = r23;
        r6 = 1;
        r7 = 0;
        r4 = r25;
        r1 = 1;
    L_0x02a5:
        r14 = 5;
        r16 = 0;
    L_0x02a8:
        if (r1 == 0) goto L_0x02ed;
    L_0x02aa:
        r17 = r32.getMargin();
        r18 = r33.getMargin();
        r1 = r26;
        r2 = r15;
        r3 = r5;
        r4 = r17;
        r17 = r5;
        r5 = r38;
        r19 = 1;
        r6 = r8;
        r0 = 0;
        r7 = r9;
        r12 = r8;
        r0 = r17;
        r8 = r18;
        r11 = r9;
        r9 = r14;
        r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9);
        r1 = r32;
        r2 = r1.mTarget;
        r2 = r2.mOwner;
        r2 = r2 instanceof androidx.constraintlayout.solver.widgets.Barrier;
        r3 = r33;
        r4 = r3.mTarget;
        r4 = r4.mOwner;
        r4 = r4 instanceof androidx.constraintlayout.solver.widgets.Barrier;
        if (r2 == 0) goto L_0x02e5;
    L_0x02dd:
        if (r4 != 0) goto L_0x02e5;
    L_0x02df:
        r19 = r27;
        r2 = 1;
        r4 = 5;
        r5 = 6;
        goto L_0x02fa;
    L_0x02e5:
        if (r2 != 0) goto L_0x02f4;
    L_0x02e7:
        if (r4 == 0) goto L_0x02f4;
    L_0x02e9:
        r2 = r27;
        r4 = 6;
        goto L_0x02f9;
    L_0x02ed:
        r1 = r32;
        r3 = r33;
        r0 = r5;
        r12 = r8;
        r11 = r9;
    L_0x02f4:
        r2 = r27;
        r19 = r2;
        r4 = 5;
    L_0x02f9:
        r5 = 5;
    L_0x02fa:
        if (r16 == 0) goto L_0x02fe;
    L_0x02fc:
        r4 = 6;
        r5 = 6;
    L_0x02fe:
        if (r13 != 0) goto L_0x0302;
    L_0x0300:
        if (r19 != 0) goto L_0x0304;
    L_0x0302:
        if (r16 == 0) goto L_0x030b;
    L_0x0304:
        r1 = r32.getMargin();
        r10.addGreaterThan(r15, r0, r1, r4);
    L_0x030b:
        if (r13 != 0) goto L_0x030f;
    L_0x030d:
        if (r2 != 0) goto L_0x0311;
    L_0x030f:
        if (r16 == 0) goto L_0x0319;
    L_0x0311:
        r0 = r33.getMargin();
        r0 = -r0;
        r10.addLowerThan(r11, r12, r0, r5);
    L_0x0319:
        if (r27 == 0) goto L_0x0324;
    L_0x031b:
        r0 = r28;
        r1 = r11;
        r2 = 6;
        r3 = 0;
        r10.addGreaterThan(r15, r0, r3, r2);
        goto L_0x0329;
    L_0x0324:
        r1 = r11;
        goto L_0x0327;
    L_0x0326:
        r1 = r9;
    L_0x0327:
        r2 = 6;
        r3 = 0;
    L_0x0329:
        if (r27 == 0) goto L_0x0330;
    L_0x032b:
        r4 = r29;
        r10.addGreaterThan(r4, r1, r3, r2);
    L_0x0330:
        return;
    L_0x0331:
        r5 = r0;
        r1 = r9;
        r0 = r11;
        r4 = r12;
        r2 = 6;
        r3 = 0;
        r6 = 2;
        if (r5 >= r6) goto L_0x0342;
    L_0x033a:
        if (r27 == 0) goto L_0x0342;
    L_0x033c:
        r10.addGreaterThan(r15, r0, r3, r2);
        r10.addGreaterThan(r4, r1, r3, r2);
    L_0x0342:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.solver.LinearSystem, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }
}
