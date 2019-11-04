package org.yaml.snakeyaml.d;

/* compiled from: PlatformFeatureDetector */
public class b {
    private Boolean fMS = null;

    public boolean bWf() {
        if (this.fMS == null) {
            String property = System.getProperty("java.runtime.name");
            boolean z = property != null && property.startsWith("Android Runtime");
            this.fMS = Boolean.valueOf(z);
        }
        return this.fMS.booleanValue();
    }
}
