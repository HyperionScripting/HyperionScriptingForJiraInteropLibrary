package hyperion.jira.interop.models;

public class ResourceVersion {
    public static final ResourceVersion V7_2 = new ResourceVersion(7, 2);
    public static final ResourceVersion V7_3 = new ResourceVersion(7, 3);
    public static final ResourceVersion V7_4 = new ResourceVersion(7, 4);
    public static final ResourceVersion V7_5 = new ResourceVersion(7, 5);
    public static final ResourceVersion V7_6 = new ResourceVersion(7, 6);
    public static final ResourceVersion V7_7 = new ResourceVersion(7, 7);
    public static final ResourceVersion V7_8 = new ResourceVersion(7, 8);
    public static final ResourceVersion V7_9 = new ResourceVersion(7, 9);
    public static final ResourceVersion V7_10 = new ResourceVersion(7, 10);
    public static final ResourceVersion V7_11 = new ResourceVersion(7, 11);
    public static final ResourceVersion LOWER_UNBOUND = new ResourceVersion(0, 0);
    public static final ResourceVersion UPPER_UNBOUND = new ResourceVersion(9999, 9999);
    private int majorVersion;
    private int minorVersion;

    public ResourceVersion(int majorVersion, int minorVersion) {
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }
}
