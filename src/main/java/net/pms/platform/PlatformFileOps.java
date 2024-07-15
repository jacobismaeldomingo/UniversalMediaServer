package net.pms.platform;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import net.pms.util.Version;

// Contains methods related to file operations, refactored from IPlatformUtils.java before.
public interface PlatformFileOps {

    public abstract String getShortPathNameW(String longPathName);

    public abstract String getDiskLabel(File f);

    public abstract File getAvsPluginsDir();

    public abstract File getKLiteFiltersDir();

    public abstract String getTrayIcon();

    /** Move the given file to the system trash, if one is available.
     * @param file file to move
     * @throws IOException on failure.
     */
    public abstract void moveToTrash(File file) throws IOException;

    /**
     * Determines the file version of library or executable.
     *
     * @return The file version or null.
     */
    public abstract Version getFileVersionInfo(String filePath);

    /**
     * The default {@link Charset} for console
     * @return Charset
     */
    public abstract Charset getDefaultCharset();

    public abstract String getDefaultFontPath();
}
