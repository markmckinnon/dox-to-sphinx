package org.sleuthkit.autopsy.experimental.volatilityDSP;
/** Localizable strings for {@link org.sleuthkit.autopsy.experimental.volatilityDSP}. */
class Bundle {
    /**
     * @param exception_message exception message
     * @return <i> Critical error: </i>{@code exception_message}
     * @see AddMemoryImageTask
     */
    static String AddMemoryImageTask_errorMessage_criticalException(Object exception_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddMemoryImageTask_errorMessage_criticalException", exception_message);
    }
    /**
     * @param image_file_path image file path
     * @param device_id device id
     * @return <i> Memory image file </i>{@code image_file_path}<i> for device </i>{@code device_id}<i> does not exist</i>
     * @see AddMemoryImageTask
     */
    static String AddMemoryImageTask_exceptionMessage_noImageFile(Object image_file_path, Object device_id) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddMemoryImageTask_exceptionMessage_noImageFile", image_file_path, device_id);
    }
    /**
     * @param image_file_path image file path
     * @return <i> Adding memory image </i>{@code image_file_path}
     * @see AddMemoryImageTask
     */
    static String AddMemoryImageTask_progressMessage_addingImageFile(Object image_file_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddMemoryImageTask_progressMessage_addingImageFile", image_file_path);
    }
    /**
     * @return <i>Path to multi-user data source is on "C:" drive</i>
     * @see MemoryDSInputPanel
     */
    static String MemoryDSInputPanel_errorMsg_dataSourcePathOnCdrive() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MemoryDSInputPanel_errorMsg_dataSourcePathOnCdrive");
    }
    /**
     * @return <i>No open case</i>
     * @see MemoryDSInputPanel
     */
    static String MemoryDSInputPanel_errorMsg_noOpenCase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MemoryDSInputPanel_errorMsg_noOpenCase");
    }
    /**
     * @return <i>Memory Image File (Volatility)</i>
     * @see MemoryDSProcessor
     */
    static String MemoryDSProcessor_dataSourceType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MemoryDSProcessor.dataSourceType");
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Volatility Plugin </i>{@code plugin_name}
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_artifactAttribute_interestingFileSet(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_artifactAttribute_interestingFileSet", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Error finding files parsed from output of </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_errorMessage_errorFindingFiles(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_errorMessage_errorFindingFiles", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Error indexing artifact from output of </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_errorMessage_failedToIndexArtifact(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_errorMessage_failedToIndexArtifact", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Error parsing output for </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_errorMessage_outputParsingError(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_errorMessage_outputParsingError", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Failed to add output for </i>{@code plugin_name}<i> to case</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_errorAddingOutput(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_errorAddingOutput", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Error creating artifact for output of </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_errorCreatingArtifact(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_errorCreatingArtifact", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Error indexing output for </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_errorIndexingOutput(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_errorIndexingOutput", plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Volatility error running </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_errorRunningPlugin(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_errorRunningPlugin", plugin_name);
    }
    /**
     * @return <i>Could not parse image info</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_failedToParseImageInfo() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_failedToParseImageInfo");
    }
    /**
     * @return <i>Could not run Volatility</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_failedToRunVolatilityExe() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_failedToRunVolatilityExe");
    }
    /**
     * @param file_path file path
     * @param file_name file name
     * @param plugin_name plugin name
     * @return <i>File </i>{@code file_path}<i>/</i>{@code file_name}<i> not found for ouput of </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_fileNotFound(Object file_path, Object file_name, Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_fileNotFound", file_path, file_name, plugin_name);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Keyword search service not found, output for </i>{@code plugin_name}<i> plugin not indexed</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_searchServiceNotFound(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_searchServiceNotFound", plugin_name);
    }
    /**
     * @return <i>Volatility executable not found</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_exceptionMessage_volatilityExeNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_exceptionMessage_volatilityExeNotFound");
    }
    /**
     * @return <i>Failed to get current case</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_progressMessage_noCurrentCase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_progressMessage_noCurrentCase");
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Running </i>{@code plugin_name}<i> plugin</i>
     * @see VolatilityProcessor
     */
    static String VolatilityProcessor_progressMessage_runningImageInfo(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VolatilityProcessor_progressMessage_runningImageInfo", plugin_name);
    }
    private Bundle() {}
}
