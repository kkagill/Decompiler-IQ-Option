package com.pro100svitlo.creditCardNfcReader.model.enums;

import com.google.android.gms.wallet.WalletConstants;

public enum CurrencyEnum implements a {
    AED(784, Digits.DIGITS_2, "United Arab Emirates dirham", new CountryCodeEnum[]{CountryCodeEnum.AE}),
    AFN(971, Digits.DIGITS_2, "Afghan afghani", new CountryCodeEnum[]{CountryCodeEnum.AF}),
    ALL(8, Digits.DIGITS_2, "Albanian lek", new CountryCodeEnum[]{CountryCodeEnum.AL}),
    AMD(51, Digits.DIGITS_2, "Armenian dram", new CountryCodeEnum[]{CountryCodeEnum.AM}),
    ANG(532, Digits.DIGITS_2, "Netherlands Antillean guilder", new CountryCodeEnum[]{CountryCodeEnum.CW, CountryCodeEnum.SX}),
    AOA(973, Digits.DIGITS_2, "Angolan kwanza", new CountryCodeEnum[]{CountryCodeEnum.AO}),
    ARS(32, Digits.DIGITS_2, "Argentine peso", new CountryCodeEnum[]{CountryCodeEnum.AR}),
    AUD(36, Digits.DIGITS_2, "Australian dollar", new CountryCodeEnum[]{CountryCodeEnum.AU, CountryCodeEnum.CX, CountryCodeEnum.CC, CountryCodeEnum.HM, CountryCodeEnum.KI, CountryCodeEnum.NR, CountryCodeEnum.NF, CountryCodeEnum.TV}),
    AWG(533, Digits.DIGITS_2, "Aruban florin", new CountryCodeEnum[]{CountryCodeEnum.AW}),
    AZN(944, Digits.DIGITS_2, "Azerbaijani manat", new CountryCodeEnum[]{CountryCodeEnum.AZ}),
    BAM(977, Digits.DIGITS_2, "Bosnia and Herzegovina convertible mark", new CountryCodeEnum[]{CountryCodeEnum.BA}),
    BBD(52, Digits.DIGITS_2, "Barbados dollar", new CountryCodeEnum[]{CountryCodeEnum.BB}),
    BDT(50, Digits.DIGITS_2, "Bangladeshi taka", new CountryCodeEnum[]{CountryCodeEnum.BD}),
    BGN(975, Digits.DIGITS_2, "Bulgarian lev", new CountryCodeEnum[]{CountryCodeEnum.BG}),
    BHD(48, Digits.DIGITS_3, "Bahraini dinar", new CountryCodeEnum[]{CountryCodeEnum.BH}),
    BIF(108, Digits.DIGITS_0, "Burundian franc", new CountryCodeEnum[]{CountryCodeEnum.BI}),
    BMD(60, Digits.DIGITS_2, "Bermudian dollar", new CountryCodeEnum[]{CountryCodeEnum.BM}),
    BND(96, Digits.DIGITS_2, "Brunei dollar", new CountryCodeEnum[]{CountryCodeEnum.BN, CountryCodeEnum.SG}),
    BOB(68, Digits.DIGITS_2, "Boliviano", new CountryCodeEnum[]{CountryCodeEnum.BO}),
    BOV(984, Digits.DIGITS_2, "Bolivian Mvdol (funds code)", new CountryCodeEnum[]{CountryCodeEnum.BO}),
    BRL(986, Digits.DIGITS_2, "Brazilian real", new CountryCodeEnum[]{CountryCodeEnum.BR}),
    BSD(44, Digits.DIGITS_2, "Bahamian dollar", new CountryCodeEnum[]{CountryCodeEnum.BS}),
    BTN(64, Digits.DIGITS_2, "Bhutanese ngultrum", new CountryCodeEnum[]{CountryCodeEnum.BT}),
    BWP(72, Digits.DIGITS_2, "Botswana pula", new CountryCodeEnum[]{CountryCodeEnum.BW}),
    BYR(974, Digits.DIGITS_0, "Belarusian ruble", new CountryCodeEnum[]{CountryCodeEnum.BY}),
    BZD(84, Digits.DIGITS_2, "Belize dollar", new CountryCodeEnum[]{CountryCodeEnum.BZ}),
    CAD(124, Digits.DIGITS_2, "Canadian dollar", new CountryCodeEnum[]{CountryCodeEnum.CA}),
    CDF(976, Digits.DIGITS_2, "Congolese franc", new CountryCodeEnum[]{CountryCodeEnum.CD}),
    CHE(947, Digits.DIGITS_2, "WIR Euro (complementary currency)", new CountryCodeEnum[]{CountryCodeEnum.CH}),
    CHF(756, Digits.DIGITS_2, "Swiss franc", new CountryCodeEnum[]{CountryCodeEnum.CH, CountryCodeEnum.LI}),
    CHW(948, Digits.DIGITS_2, "WIR Franc (complementary currency)", new CountryCodeEnum[]{CountryCodeEnum.CH}),
    CLF(990, Digits.DIGITS_0, "Unidad de Fomento (funds code)", new CountryCodeEnum[]{CountryCodeEnum.CL}),
    CLP(152, Digits.DIGITS_0, "Chilean peso", new CountryCodeEnum[]{CountryCodeEnum.CL}),
    CNY(156, Digits.DIGITS_2, "Chinese yuan", new CountryCodeEnum[]{CountryCodeEnum.CN}),
    COP(170, Digits.DIGITS_2, "Colombian peso", new CountryCodeEnum[]{CountryCodeEnum.CO}),
    COU(970, Digits.DIGITS_2, "Unidad de Valor Real", new CountryCodeEnum[]{CountryCodeEnum.CO}),
    CRC(188, Digits.DIGITS_2, "Costa Rican colon", new CountryCodeEnum[]{CountryCodeEnum.CR}),
    CUC(931, Digits.DIGITS_2, "Cuban convertible peso", new CountryCodeEnum[]{CountryCodeEnum.CU}),
    CUP(192, Digits.DIGITS_2, "Cuban peso", new CountryCodeEnum[]{CountryCodeEnum.CU}),
    CVE(132, Digits.DIGITS_0, "Cape Verde escudo", new CountryCodeEnum[]{CountryCodeEnum.CV}),
    CZK(203, Digits.DIGITS_2, "Czech koruna", new CountryCodeEnum[]{CountryCodeEnum.CZ}),
    DJF(262, Digits.DIGITS_0, "Djiboutian franc", new CountryCodeEnum[]{CountryCodeEnum.DJ}),
    DKK(208, Digits.DIGITS_2, "Danish krone", new CountryCodeEnum[]{CountryCodeEnum.DK, CountryCodeEnum.FO, CountryCodeEnum.GL}),
    DOP(214, Digits.DIGITS_2, "Dominican peso", new CountryCodeEnum[]{CountryCodeEnum.DO}),
    DZD(12, Digits.DIGITS_2, "Algerian dinar", new CountryCodeEnum[]{CountryCodeEnum.DZ}),
    EGP(818, Digits.DIGITS_2, "Egyptian pound", new CountryCodeEnum[]{CountryCodeEnum.EG}),
    ERN(232, Digits.DIGITS_2, "Eritrean nakfa", new CountryCodeEnum[]{CountryCodeEnum.ER}),
    ETB(230, Digits.DIGITS_2, "Ethiopian birr", new CountryCodeEnum[]{CountryCodeEnum.ET}),
    EUR(978, Digits.DIGITS_2, "Euro", new CountryCodeEnum[]{CountryCodeEnum.AD, CountryCodeEnum.AT, CountryCodeEnum.BE, CountryCodeEnum.CY, CountryCodeEnum.EE, CountryCodeEnum.FI, CountryCodeEnum.FR, CountryCodeEnum.DE, CountryCodeEnum.GR, CountryCodeEnum.IE, CountryCodeEnum.IT, CountryCodeEnum.LU, CountryCodeEnum.MT, CountryCodeEnum.MC, CountryCodeEnum.ME, CountryCodeEnum.NL, CountryCodeEnum.PT, CountryCodeEnum.SM, CountryCodeEnum.SK, CountryCodeEnum.SI, CountryCodeEnum.ES, CountryCodeEnum.VA}),
    FJD(242, Digits.DIGITS_2, "Fiji dollar", new CountryCodeEnum[]{CountryCodeEnum.FJ}),
    FKP(238, Digits.DIGITS_2, "Falkland Islands pound", new CountryCodeEnum[]{CountryCodeEnum.FK}),
    GBP(826, Digits.DIGITS_2, "Pound sterling", new CountryCodeEnum[]{CountryCodeEnum.GB, CountryCodeEnum.IM, CountryCodeEnum.GS, CountryCodeEnum.IO}),
    GEL(981, Digits.DIGITS_2, "Georgian lari", new CountryCodeEnum[]{CountryCodeEnum.GE}),
    GHS(936, Digits.DIGITS_2, "Ghanaian cedi", new CountryCodeEnum[]{CountryCodeEnum.GH}),
    GIP(292, Digits.DIGITS_2, "Gibraltar pound", new CountryCodeEnum[]{CountryCodeEnum.GI}),
    GMD(270, Digits.DIGITS_2, "Gambian dalasi", new CountryCodeEnum[]{CountryCodeEnum.GM}),
    GNF(324, Digits.DIGITS_0, "Guinean franc", new CountryCodeEnum[]{CountryCodeEnum.GN}),
    GTQ(320, Digits.DIGITS_2, "Guatemalan quetzal", new CountryCodeEnum[]{CountryCodeEnum.GT}),
    GYD(328, Digits.DIGITS_2, "Guyanese dollar", new CountryCodeEnum[]{CountryCodeEnum.GY}),
    HKD(344, Digits.DIGITS_2, "Hong Kong dollar", new CountryCodeEnum[]{CountryCodeEnum.HK, CountryCodeEnum.MO}),
    HNL(340, Digits.DIGITS_2, "Honduran lempira", new CountryCodeEnum[]{CountryCodeEnum.HN}),
    HRK(191, Digits.DIGITS_2, "Croatian kuna", new CountryCodeEnum[]{CountryCodeEnum.HR}),
    HTG(332, Digits.DIGITS_2, "Haitian gourde", new CountryCodeEnum[]{CountryCodeEnum.HT}),
    HUF(348, Digits.DIGITS_2, "Hungarian forint", new CountryCodeEnum[]{CountryCodeEnum.HU}),
    IDR(360, Digits.DIGITS_2, "Indonesian rupiah", new CountryCodeEnum[]{CountryCodeEnum.ID}),
    ILS(376, Digits.DIGITS_2, "Israeli new shekel", new CountryCodeEnum[]{CountryCodeEnum.IL, CountryCodeEnum.PS}),
    INR(356, Digits.DIGITS_2, "Indian rupee", new CountryCodeEnum[]{CountryCodeEnum.IN}),
    IQD(368, Digits.DIGITS_3, "Iraqi dinar", new CountryCodeEnum[]{CountryCodeEnum.IQ}),
    IRR(364, Digits.DIGITS_0, "Iranian rial", new CountryCodeEnum[]{CountryCodeEnum.IR}),
    ISK(352, Digits.DIGITS_0, "Icelandic króna", new CountryCodeEnum[]{CountryCodeEnum.IS}),
    JMD(388, Digits.DIGITS_2, "Jamaican dollar", new CountryCodeEnum[]{CountryCodeEnum.JM}),
    JOD(400, Digits.DIGITS_3, "Jordanian dinar", new CountryCodeEnum[]{CountryCodeEnum.JO}),
    JPY(392, Digits.DIGITS_0, "Japanese yen", new CountryCodeEnum[]{CountryCodeEnum.JP}),
    KES(WalletConstants.ERROR_CODE_INVALID_PARAMETERS, Digits.DIGITS_2, "Kenyan shilling", new CountryCodeEnum[]{CountryCodeEnum.KE}),
    KGS(417, Digits.DIGITS_2, "Kyrgyzstani som", new CountryCodeEnum[]{CountryCodeEnum.KG}),
    KHR(116, Digits.DIGITS_2, "Cambodian riel", new CountryCodeEnum[]{CountryCodeEnum.KH}),
    KMF(174, Digits.DIGITS_0, "Comoro franc", new CountryCodeEnum[]{CountryCodeEnum.KM}),
    KPW(408, Digits.DIGITS_0, "North Korean won", new CountryCodeEnum[]{CountryCodeEnum.KP}),
    KRW(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, Digits.DIGITS_0, "South Korean won", new CountryCodeEnum[]{CountryCodeEnum.KR}),
    KWD(414, Digits.DIGITS_3, "Kuwaiti dinar", new CountryCodeEnum[]{CountryCodeEnum.KW}),
    KYD(136, Digits.DIGITS_2, "Cayman Islands dollar", new CountryCodeEnum[]{CountryCodeEnum.KY}),
    KZT(398, Digits.DIGITS_2, "Kazakhstani tenge", new CountryCodeEnum[]{CountryCodeEnum.KZ}),
    LAK(418, Digits.DIGITS_0, "Lao kip", new CountryCodeEnum[]{CountryCodeEnum.LA}),
    LBP(422, Digits.DIGITS_0, "Lebanese pound", new CountryCodeEnum[]{CountryCodeEnum.LB}),
    LKR(144, Digits.DIGITS_2, "Sri Lankan rupee", new CountryCodeEnum[]{CountryCodeEnum.LK}),
    LRD(430, Digits.DIGITS_2, "Liberian dollar", new CountryCodeEnum[]{CountryCodeEnum.LR}),
    LSL(426, Digits.DIGITS_2, "Lesotho loti", new CountryCodeEnum[]{CountryCodeEnum.LS}),
    LTL(440, Digits.DIGITS_2, "Lithuanian litas", new CountryCodeEnum[]{CountryCodeEnum.LT}),
    LVL(428, Digits.DIGITS_2, "Latvian lats", new CountryCodeEnum[]{CountryCodeEnum.LV}),
    LYD(434, Digits.DIGITS_3, "Libyan dinar", new CountryCodeEnum[]{CountryCodeEnum.LY}),
    MAD(504, Digits.DIGITS_2, "Moroccan dirham", new CountryCodeEnum[]{CountryCodeEnum.MA}),
    MDL(498, Digits.DIGITS_2, "Moldovan leu", new CountryCodeEnum[]{CountryCodeEnum.MD}),
    MGA(969, Digits.DIGITS_07, "Malagasy ariary", new CountryCodeEnum[]{CountryCodeEnum.MG}),
    MKD(807, Digits.DIGITS_0, "Macedonian denar", new CountryCodeEnum[]{CountryCodeEnum.MK}),
    MMK(104, Digits.DIGITS_0, "Myanma kyat", new CountryCodeEnum[]{CountryCodeEnum.MM}),
    MNT(496, Digits.DIGITS_2, "Mongolian tugrik", new CountryCodeEnum[]{CountryCodeEnum.MN}),
    MOP(446, Digits.DIGITS_2, "Macanese pataca", new CountryCodeEnum[]{CountryCodeEnum.MO}),
    MRO(478, Digits.DIGITS_07, "Mauritanian ouguiya", new CountryCodeEnum[]{CountryCodeEnum.MR}),
    MUR(480, Digits.DIGITS_2, "Mauritian rupee", new CountryCodeEnum[]{CountryCodeEnum.MU}),
    MVR(462, Digits.DIGITS_2, "Maldivian rufiyaa", new CountryCodeEnum[]{CountryCodeEnum.MV}),
    MWK(454, Digits.DIGITS_2, "Malawian kwacha", new CountryCodeEnum[]{CountryCodeEnum.MW}),
    MXN(484, Digits.DIGITS_2, "Mexican peso", new CountryCodeEnum[]{CountryCodeEnum.MX}),
    MXV(979, Digits.DIGITS_2, "Mexican Unidad de Inversion (UDI) (funds code)", new CountryCodeEnum[]{CountryCodeEnum.MX}),
    MYR(458, Digits.DIGITS_2, "Malaysian ringgit", new CountryCodeEnum[]{CountryCodeEnum.MY}),
    MZN(943, Digits.DIGITS_2, "Mozambican metical", new CountryCodeEnum[]{CountryCodeEnum.MZ}),
    NAD(516, Digits.DIGITS_2, "Namibian dollar", new CountryCodeEnum[]{CountryCodeEnum.NA}),
    NGN(566, Digits.DIGITS_2, "Nigerian naira", new CountryCodeEnum[]{CountryCodeEnum.NG}),
    NIO(558, Digits.DIGITS_2, "Nicaraguan córdoba", new CountryCodeEnum[]{CountryCodeEnum.NI}),
    NOK(578, Digits.DIGITS_2, "Norwegian krone", new CountryCodeEnum[]{CountryCodeEnum.NO, CountryCodeEnum.SJ, CountryCodeEnum.BV}),
    NPR(524, Digits.DIGITS_2, "Nepalese rupee", new CountryCodeEnum[]{CountryCodeEnum.NP}),
    NZD(554, Digits.DIGITS_2, "New Zealand dollar", new CountryCodeEnum[]{CountryCodeEnum.CK, CountryCodeEnum.NZ, CountryCodeEnum.NU, CountryCodeEnum.PN, CountryCodeEnum.TK}),
    OMR(512, Digits.DIGITS_3, "Omani rial", new CountryCodeEnum[]{CountryCodeEnum.OM}),
    PAB(590, Digits.DIGITS_2, "Panamanian balboa", new CountryCodeEnum[]{CountryCodeEnum.PA}),
    PEN(604, Digits.DIGITS_2, "Peruvian nuevo sol", new CountryCodeEnum[]{CountryCodeEnum.PE}),
    PGK(598, Digits.DIGITS_2, "Papua New Guinean kina", new CountryCodeEnum[]{CountryCodeEnum.PG}),
    PHP(608, Digits.DIGITS_2, "Philippine peso", new CountryCodeEnum[]{CountryCodeEnum.PH}),
    PKR(586, Digits.DIGITS_2, "Pakistani rupee", new CountryCodeEnum[]{CountryCodeEnum.PK}),
    PLN(985, Digits.DIGITS_2, "Polish złoty", new CountryCodeEnum[]{CountryCodeEnum.PL}),
    PYG(600, Digits.DIGITS_0, "Paraguayan guaraní", new CountryCodeEnum[]{CountryCodeEnum.PY}),
    QAR(634, Digits.DIGITS_2, "Qatari riyal", new CountryCodeEnum[]{CountryCodeEnum.QA}),
    RON(946, Digits.DIGITS_2, "Romanian new leu", new CountryCodeEnum[]{CountryCodeEnum.RO}),
    RSD(941, Digits.DIGITS_2, "Serbian dinar", new CountryCodeEnum[]{CountryCodeEnum.RS}),
    RUB(643, Digits.DIGITS_2, "Russian rouble", new CountryCodeEnum[]{CountryCodeEnum.RU}),
    RWF(646, Digits.DIGITS_0, "Rwandan franc", new CountryCodeEnum[]{CountryCodeEnum.RW}),
    SAR(682, Digits.DIGITS_2, "Saudi riyal", new CountryCodeEnum[]{CountryCodeEnum.SA}),
    SBD(90, Digits.DIGITS_2, "Solomon Islands dollar", new CountryCodeEnum[]{CountryCodeEnum.SB}),
    SCR(690, Digits.DIGITS_2, "Seychelles rupee", new CountryCodeEnum[]{CountryCodeEnum.SC}),
    SDG(938, Digits.DIGITS_2, "Sudanese pound", new CountryCodeEnum[]{CountryCodeEnum.SD}),
    SEK(752, Digits.DIGITS_2, "Swedish krona/kronor", new CountryCodeEnum[]{CountryCodeEnum.SE}),
    SGD(702, Digits.DIGITS_2, "Singapore dollar", new CountryCodeEnum[]{CountryCodeEnum.SG, CountryCodeEnum.BN}),
    SHP(654, Digits.DIGITS_2, "Saint Helena pound", new CountryCodeEnum[]{CountryCodeEnum.SH}),
    SLL(694, Digits.DIGITS_0, "Sierra Leonean leone", new CountryCodeEnum[]{CountryCodeEnum.SL}),
    SOS(706, Digits.DIGITS_2, "Somali shilling", new CountryCodeEnum[]{CountryCodeEnum.SO}),
    SRD(968, Digits.DIGITS_2, "Surinamese dollar", new CountryCodeEnum[]{CountryCodeEnum.SR}),
    SSP(728, Digits.DIGITS_2, "South Sudanese pound", new CountryCodeEnum[]{CountryCodeEnum.SS}),
    STD(678, Digits.DIGITS_0, "São Tomé and Príncipe dobra", new CountryCodeEnum[]{CountryCodeEnum.ST}),
    SYP(760, Digits.DIGITS_2, "Syrian pound", new CountryCodeEnum[]{CountryCodeEnum.SY}),
    SZL(748, Digits.DIGITS_2, "Swazi lilangeni", new CountryCodeEnum[]{CountryCodeEnum.SZ}),
    THB(764, Digits.DIGITS_2, "Thai baht", new CountryCodeEnum[]{CountryCodeEnum.TH}),
    TJS(972, Digits.DIGITS_2, "Tajikistani somoni", new CountryCodeEnum[]{CountryCodeEnum.TJ}),
    TMT(934, Digits.DIGITS_2, "Turkmenistani manat", new CountryCodeEnum[]{CountryCodeEnum.TM}),
    TND(788, Digits.DIGITS_3, "Tunisian dinar", new CountryCodeEnum[]{CountryCodeEnum.TN}),
    TOP(776, Digits.DIGITS_2, "Tongan paʻanga", new CountryCodeEnum[]{CountryCodeEnum.TO}),
    TRY(949, Digits.DIGITS_2, "Turkish lira", new CountryCodeEnum[]{CountryCodeEnum.TR}),
    TTD(780, Digits.DIGITS_2, "Trinidad and Tobago dollar", new CountryCodeEnum[]{CountryCodeEnum.TT}),
    TWD(901, Digits.DIGITS_2, "New Taiwan dollar", new CountryCodeEnum[]{CountryCodeEnum.TW}),
    TZS(834, Digits.DIGITS_2, "Tanzanian shilling", new CountryCodeEnum[]{CountryCodeEnum.TZ}),
    UAH(980, Digits.DIGITS_2, "Ukrainian hryvnia", new CountryCodeEnum[]{CountryCodeEnum.UA}),
    UGX(800, Digits.DIGITS_2, "Ugandan shilling", new CountryCodeEnum[]{CountryCodeEnum.UG}),
    USD(840, Digits.DIGITS_2, "United States dollar", new CountryCodeEnum[]{CountryCodeEnum.AS, CountryCodeEnum.BB, CountryCodeEnum.BM, CountryCodeEnum.IO, CountryCodeEnum.VG, CountryCodeEnum.BQ, CountryCodeEnum.EC, CountryCodeEnum.SV, CountryCodeEnum.GU, CountryCodeEnum.HT, CountryCodeEnum.MH, CountryCodeEnum.FM, CountryCodeEnum.MP, CountryCodeEnum.PW, CountryCodeEnum.PA, CountryCodeEnum.PR, CountryCodeEnum.TL, CountryCodeEnum.TC, CountryCodeEnum.US, CountryCodeEnum.VI, CountryCodeEnum.ZW}),
    USN(997, Digits.DIGITS_2, "United States dollar (next day) (funds code)", new CountryCodeEnum[]{CountryCodeEnum.US}),
    USS(998, Digits.DIGITS_2, "United States dollar (same day) (funds code)", new CountryCodeEnum[]{CountryCodeEnum.US}),
    UYI(940, Digits.DIGITS_0, "Uruguay Peso en Unidades Indexadas (URUIURUI) (funds code)", new CountryCodeEnum[]{CountryCodeEnum.UY}),
    UYU(858, Digits.DIGITS_2, "Uruguayan peso", new CountryCodeEnum[]{CountryCodeEnum.UY}),
    UZS(860, Digits.DIGITS_2, "Uzbekistan som", new CountryCodeEnum[]{CountryCodeEnum.UZ}),
    VEF(937, Digits.DIGITS_2, "Venezuelan bolívar fuerte", new CountryCodeEnum[]{CountryCodeEnum.VE}),
    VND(704, Digits.DIGITS_0, "Vietnamese dong", new CountryCodeEnum[]{CountryCodeEnum.VN}),
    VUV(548, Digits.DIGITS_0, "Vanuatu vatu", new CountryCodeEnum[]{CountryCodeEnum.VU}),
    WST(882, Digits.DIGITS_2, "Samoan tala", new CountryCodeEnum[]{CountryCodeEnum.WS}),
    XAF(950, Digits.DIGITS_0, "CFA franc BEAC", new CountryCodeEnum[]{CountryCodeEnum.CM, CountryCodeEnum.CF, CountryCodeEnum.CD, CountryCodeEnum.TD, CountryCodeEnum.GQ, CountryCodeEnum.GA}),
    XAG(961, Digits.DIGITS_NO, "Silver (one troy ounce)", new CountryCodeEnum[0]),
    XAU(959, Digits.DIGITS_NO, "Gold (one troy ounce)", new CountryCodeEnum[0]),
    XBA(955, Digits.DIGITS_NO, "European Composite Unit (EURCO) (bond market unit)", new CountryCodeEnum[0]),
    XBB(956, Digits.DIGITS_NO, "European Monetary Unit (E.M.U.-6) (bond market unit)", new CountryCodeEnum[0]),
    XBC(957, Digits.DIGITS_NO, "European Unit of Account 9 (E.U.A.-9) (bond market unit)", new CountryCodeEnum[0]),
    XBD(958, Digits.DIGITS_NO, "European Unit of Account 17 (E.U.A.-17) (bond market unit)", new CountryCodeEnum[0]),
    XCD(951, Digits.DIGITS_2, "East Caribbean dollar", new CountryCodeEnum[]{CountryCodeEnum.AI, CountryCodeEnum.AG, CountryCodeEnum.DM, CountryCodeEnum.GD, CountryCodeEnum.MS, CountryCodeEnum.KN, CountryCodeEnum.LC, CountryCodeEnum.VC}),
    XDR(960, Digits.DIGITS_NO, "Special drawing rights  International Monetary Fund", new CountryCodeEnum[0]),
    XFU(-1, Digits.DIGITS_NO, "UIC franc (special settlement currency)", new CountryCodeEnum[0]),
    XOF(952, Digits.DIGITS_0, "CFA franc BCEAO", new CountryCodeEnum[]{CountryCodeEnum.BJ, CountryCodeEnum.BF, CountryCodeEnum.CI, CountryCodeEnum.GW, CountryCodeEnum.ML, CountryCodeEnum.NE, CountryCodeEnum.SN, CountryCodeEnum.TG}),
    XPD(964, Digits.DIGITS_NO, "Palladium (one troy ounce)", new CountryCodeEnum[0]),
    XPF(953, Digits.DIGITS_0, "CFP franc", new CountryCodeEnum[]{CountryCodeEnum.PF, CountryCodeEnum.NC, CountryCodeEnum.WF}),
    XPT(962, Digits.DIGITS_NO, "Platinum (one troy ounce)", new CountryCodeEnum[0]),
    XTS(963, Digits.DIGITS_NO, "Code reserved for testing purposes", new CountryCodeEnum[0]),
    XXX(0, Digits.DIGITS_NO, "No currency", new CountryCodeEnum[0]),
    YER(886, Digits.DIGITS_2, "Yemeni rial", new CountryCodeEnum[]{CountryCodeEnum.YE}),
    ZAR(710, Digits.DIGITS_2, "South African rand", new CountryCodeEnum[]{CountryCodeEnum.ZA}),
    ZMK(894, Digits.DIGITS_2, "Zambian kwacha", new CountryCodeEnum[]{CountryCodeEnum.ZM});
    
    private final String code;
    private final CountryCodeEnum[] countries;
    private final Digits digits;
    private final String name;
    private final int numeric;

    /* renamed from: com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eGL = null;

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0072 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        static {
            /*
            r0 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.values();
            r0 = r0.length;
            r0 = new int[r0];
            eGM = r0;
            r0 = 1;
            r1 = eGM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.BO;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = eGM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.CH;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = eGM;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.CL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = eGM;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.MX;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = eGM;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.US;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = eGM;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum.UY;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = 6;
            r5[r6] = r7;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r5 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.values();
            r5 = r5.length;
            r5 = new int[r5];
            eGL = r5;
            r5 = eGL;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.DIGITS_0;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005e }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r0 = eGL;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.DIGITS_2;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0068 }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            r0 = eGL;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.DIGITS_3;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r0 = eGL;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.DIGITS_07;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = eGL;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum.Digits.DIGITS_NO;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum$AnonymousClass1.<clinit>():void");
        }
    }

    private enum Digits {
        private static final /* synthetic */ Digits[] $VALUES = null;
        public static final Digits DIGITS_0 = null;
        public static final Digits DIGITS_07 = null;
        public static final Digits DIGITS_2 = null;
        public static final Digits DIGITS_3 = null;
        public static final Digits DIGITS_NO = null;

        private Digits(String str, int i) {
        }

        public static Digits valueOf(String str) {
            return (Digits) Enum.valueOf(Digits.class, str);
        }

        public static Digits[] values() {
            return (Digits[]) $VALUES.clone();
        }

        static {
            DIGITS_0 = new Digits("DIGITS_0", 0);
            DIGITS_2 = new Digits("DIGITS_2", 1);
            DIGITS_3 = new Digits("DIGITS_3", 2);
            DIGITS_07 = new Digits("DIGITS_07", 3);
            DIGITS_NO = new Digits("DIGITS_NO", 4);
            $VALUES = new Digits[]{DIGITS_0, DIGITS_2, DIGITS_3, DIGITS_07, DIGITS_NO};
        }
    }

    private CurrencyEnum(int i, Digits digits, String str, CountryCodeEnum[] countryCodeEnumArr) {
        this.code = name().toUpperCase();
        this.name = str;
        this.numeric = i;
        this.digits = digits;
        this.countries = countryCodeEnumArr;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public CountryCodeEnum[] getCountries() {
        return this.countries;
    }

    public String format(long j) {
        String valueOf;
        StringBuilder stringBuilder;
        int i = AnonymousClass1.eGL[this.digits.ordinal()];
        if (i != 1) {
            String str = "0";
            String str2 = ".";
            String valueOf2;
            if (i == 2) {
                valueOf2 = String.valueOf(j / 100);
                valueOf = String.valueOf(j % 100);
                while (valueOf.length() < 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    valueOf = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(valueOf2);
                stringBuilder.append(str2);
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
            } else if (i != 3) {
                valueOf = i != 4 ? i != 5 ? String.valueOf(j) : String.valueOf(j) : String.valueOf(j);
            } else {
                valueOf2 = String.valueOf(j / 1000);
                valueOf = String.valueOf(j % 1000);
                while (valueOf.length() < 3) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    valueOf = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(valueOf2);
                stringBuilder.append(str2);
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
            }
        } else {
            valueOf = String.valueOf(j);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(getCode());
        stringBuilder.append(" ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public static CurrencyEnum find(String str) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].getCode().equals(str)) {
                return values()[i];
            }
        }
        return null;
    }

    public static CurrencyEnum find(CountryCodeEnum countryCodeEnum) {
        CurrencyEnum currencyEnum = null;
        if (countryCodeEnum != null) {
            switch (countryCodeEnum) {
                case BO:
                    return BOB;
                case CH:
                    return CHF;
                case CL:
                    return CLP;
                case MX:
                    return MXN;
                case US:
                    return USD;
                case UY:
                    return UYU;
                default:
                    CurrencyEnum currencyEnum2 = null;
                    int i = 0;
                    while (i < values().length) {
                        CurrencyEnum currencyEnum3 = currencyEnum2;
                        for (CountryCodeEnum countryCodeEnum2 : values()[i].getCountries()) {
                            if (countryCodeEnum2 == countryCodeEnum) {
                                if (currencyEnum3 != null) {
                                    return null;
                                }
                                currencyEnum3 = values()[i];
                            }
                        }
                        i++;
                        currencyEnum2 = currencyEnum3;
                    }
                    currencyEnum = currencyEnum2;
                    break;
            }
        }
        return currencyEnum;
    }

    public static CurrencyEnum find(CountryCodeEnum countryCodeEnum, CurrencyEnum currencyEnum) {
        CurrencyEnum find = find(countryCodeEnum);
        return find == null ? currencyEnum : find;
    }

    public String getISOCodeAlpha() {
        return name();
    }

    public int getISOCodeNumeric() {
        return this.numeric;
    }

    public String toString() {
        return this.code;
    }

    public int getKey() {
        return this.numeric;
    }
}
