package com.jumio.core.util;

import com.jumio.core.environment.CpuInfo;
import com.jumio.core.environment.Environment;

public class DeviceUtil {
    public static boolean isSupportedPlatform(boolean z) {
        Environment.loadCpuInfoLib();
        String cpuFeatures = getCpuFeatures();
        String cpuFamily = getCpuFamily();
        Object obj = (cpuFamily.equals("ARM") && cpuFeatures.contains("ARMv7") && cpuFeatures.contains("NEON")) ? 1 : null;
        boolean equals = cpuFamily.equals("ARM64");
        Object obj2 = (cpuFamily.equals("X86") && z) ? 1 : null;
        Object obj3 = (cpuFamily.equals("X86_64") && z) ? 1 : null;
        if (obj == null && !equals && obj2 == null && obj3 == null) {
            return false;
        }
        return true;
    }

    public static String getCpuFamily() {
        int cpuFamily = CpuInfo.getCpuFamily();
        switch (cpuFamily) {
            case 1:
                return "ARM";
            case 2:
                return "X86";
            case 3:
                return "MIPS";
            case 4:
                return "ARM64";
            case 5:
                return "X86_64";
            case 6:
                return "MIPS64";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UNKNOWN (");
                stringBuilder.append(cpuFamily);
                stringBuilder.append(")");
                return stringBuilder.toString();
        }
    }

    public static String getCpuFeatures() {
        int cpuFamily = CpuInfo.getCpuFamily();
        int cpuFeatures = CpuInfo.getCpuFeatures();
        String str = "CRC32 ";
        String str2 = "SHA2 ";
        String str3 = "SHA1 ";
        String str4 = "PMULL ";
        String str5 = "AES ";
        String str6 = "";
        StringBuilder stringBuilder;
        if (cpuFamily == 1) {
            if ((cpuFeatures & 1) == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("ARMv7 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 2) == 2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("VFPv3 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 4) == 4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("NEON ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 8) == 8) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("LDREX_STREX ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 16) == 16) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("VFPv2 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 32) == 32) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("VFP_D32 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 64) == 64) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("VFP_FP16 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 128) == 128) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("VFP_FMA ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 256) == 256) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("NEON_FMA ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 512) == 512) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("IDIV_ARM ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 1024) == 1024) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("IDIV_THUMB2 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 2048) == 2048) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("iWMMXt ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 4096) == 4096) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str5);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 8192) == 8192) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str4);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 16384) == 16384) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str3);
                str6 = stringBuilder.toString();
            }
            if ((32768 & cpuFeatures) == 32768) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str2);
                str6 = stringBuilder.toString();
            }
            if ((65536 & cpuFeatures) == 65536) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str);
                str6 = stringBuilder.toString();
            }
            return str6;
        } else if (cpuFamily == 2) {
            if ((cpuFeatures & 1) == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("SSSE3 ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 2) == 2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("POPCNT ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 4) == 4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("MOVBE ");
                str6 = stringBuilder.toString();
            }
            return str6;
        } else if (cpuFamily != 4) {
            return str6;
        } else {
            if ((cpuFeatures & 1) == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("FP ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 2) == 2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append("ASIMD ");
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 4) == 4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str5);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 8) == 8) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str4);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 16) == 16) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str3);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 32) == 32) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str2);
                str6 = stringBuilder.toString();
            }
            if ((cpuFeatures & 64) == 64) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str6);
                stringBuilder.append(str);
                str6 = stringBuilder.toString();
            }
            return str6;
        }
    }

    public static String getCpuCount() {
        return Integer.toString(CpuInfo.getCpuCount());
    }
}
