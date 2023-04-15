package org.sleuthkit.autopsy.modules.drones;
/** Localizable strings for {@link org.sleuthkit.autopsy.modules.drones}. */
class Bundle {
    /**
     * @return <i>Processing DJI DAT file: %s</i>
     * @see DATExtractor
     */
    static String DATExtractor_process_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DATExtractor_process_message");
    }
    /**
     * @return <i>DAT File Extractor</i>
     * @see DATExtractor
     */
    static String DATFileExtractor_Extractor_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DATFileExtractor_Extractor_Name");
    }
    /**
     * @return <i>Analyzes files generated by some DJI drones.</i>
     * @see DroneIngestModuleFactory
     */
    static String DroneIngestModule_Description() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DroneIngestModule_Description");
    }
    /**
     * @return <i>DJI Drone Analyzer</i>
     * @see DroneIngestModuleFactory
     */
    static String DroneIngestModule_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DroneIngestModule_Name");
    }
    /**
     * @param AbstractFileName AbstractFileName
     * @return <i>Started </i>{@code AbstractFileName}
     * @see DroneIngestModule
     */
    static String DroneIngestModule_process_start(Object AbstractFileName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DroneIngestModule_process_start", AbstractFileName);
    }
    private Bundle() {}
}