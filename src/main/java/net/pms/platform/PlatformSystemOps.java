package net.pms.platform;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;
import net.pms.io.IPipeProcess;
import net.pms.io.OutputParams;
import net.pms.service.process.AbstractProcessTerminator;
import net.pms.service.process.ProcessManager;
import net.pms.service.sleep.AbstractSleepWorker;
import net.pms.service.sleep.PreventSleepMode;
import net.pms.service.sleep.SleepManager;

// Contains methods related to system operations, refactored from IPlatformUtils.java before.
public interface PlatformSystemOps {

    /**
     * Determines whether or not the program has admin/root permissions.
     *
     * @return true if the program has admin/root permissions
     */
    public abstract boolean isAdmin();

    /**
     * Enumerates the default shared folders.
     *
     * @return The default shared folders.
     */
    public abstract List<Path> getDefaultFolders();

    /**
     * Returns the iTunes XML file.This file has all the information of the iTunes database.
     *
     * @return (String) Absolute path to the iTunes XML file.
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public abstract String getiTunesFile() throws IOException, URISyntaxException;

    /**
     * Checks whether system sleep prevention is supported for the current
     * {@link Platform}.
     *
     * @return {@code true} if system sleep prevention is supported,
     *         {@code false} otherwise.
     */
    public abstract boolean isPreventSleepSupported();

    /**
     * creates a sleep worker for the current {@link Platform}.
     *
     * @param owner SleepManager
     * @param mode PreventSleepMode
     * @return the created {@link AbstractSleepWorker}
     * @throws IllegalStateException If no {@link AbstractSleepWorker}
     *             implementation is available for this {@link Platform}.
     */
    public abstract AbstractSleepWorker getSleepWorker(SleepManager owner, PreventSleepMode mode);

    public abstract AbstractProcessTerminator getProcessTerminator(ProcessManager processManager);

    public abstract IPipeProcess getPipeProcess(String pipeName, OutputParams params, String... extras);

    public abstract IPipeProcess getPipeProcess(String pipeName, String... extras);

    public abstract void appendErrorString(StringBuilder sb, int exitCode);

    public abstract List<String> getRestartCommand(boolean hasOptions);

    public abstract String[] getShutdownCommand();

    public abstract String getJvmExecutableName();

    public abstract void destroyProcess(Process p);
}
