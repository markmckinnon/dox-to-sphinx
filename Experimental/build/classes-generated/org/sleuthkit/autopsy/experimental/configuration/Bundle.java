package org.sleuthkit.autopsy.experimental.configuration;
/** Localizable strings for {@link org.sleuthkit.autopsy.experimental.configuration}. */
class Bundle {
    /**
     * @return <i>Friday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Friday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Friday_Label");
    }
    /**
     * @return <i>Monday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Monday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Monday_Label");
    }
    /**
     * @return <i>Saturday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Saturday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Saturday_Label");
    }
    /**
     * @return <i>Sunday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Sunday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Sunday_Label");
    }
    /**
     * @return <i>Thursday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Thursday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Thursday_Label");
    }
    /**
     * @return <i>Tuesday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Tuesday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Tuesday_Label");
    }
    /**
     * @return <i>Wednesday</i>
     * @see AdvancedAutoIngestSettingsPanel
     */
    static String DayOfTheWeekRenderer_Wednesday_Label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DayOfTheWeekRenderer_Wednesday_Label");
    }
    /**
     * @param errorMessage errorMessage
     * @return <i>Critical error running data source processor on test data source: </i>{@code errorMessage}
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_criticalError(Object errorMessage) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.criticalError", errorMessage);
    }
    /**
     * @return <i>Ingest manager error while starting ingest job</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_errorStartingIngestJob() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.errorStartingIngestJob");
    }
    /**
     * @param cancellationReason cancellationReason
     * @return <i>Ingest cancelled due to </i>{@code cancellationReason}
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_ingestCancelled(Object cancellationReason) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.ingestCancelled", cancellationReason);
    }
    /**
     * @return <i>Failed to analyze data source due to ingest settings errors</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_ingestSettingsError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.ingestSettingsError");
    }
    /**
     * @return <i>Test data source failed to produce content</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_noContent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.noContent");
    }
    /**
     * @param serviceName serviceName
     * @return <i>Multi User service is down: </i>{@code serviceName}
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_serviceDown(Object serviceName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.serviceDown", serviceName);
    }
    /**
     * @return <i>Failed to analyze data source due to ingest job startup error</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_startupError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.startupError");
    }
    /**
     * @return <i>Unable to add test file as data source to case</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableAddFileAsDataSource() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableAddFileAsDataSource");
    }
    /**
     * @return <i>Unable to create a file in case output directory</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableCreatFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableCreatFile");
    }
    /**
     * @param serviceName serviceName
     * @return <i>Unable to check Multi User service state: </i>{@code serviceName}
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToCheckService(Object serviceName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToCheckService", serviceName);
    }
    /**
     * @return <i>Unable to create case</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToCreateCase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToCreateCase");
    }
    /**
     * @return <i>Case database was not successfully initialized</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToInitializeDatabase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToInitializeDatabase");
    }
    /**
     * @return <i>Unable to initialize File Type Detector</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToInitializeFilTypeDetector() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToInitializeFilTypeDetector");
    }
    /**
     * @return <i>Unable to read from case database</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToReadDatabase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToReadDatabase");
    }
    /**
     * @return <i>Unable to read test file info from case database</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToReadTestFileFromDatabase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToReadTestFileFromDatabase");
    }
    /**
     * @return <i>Unable to run ingest on test data source</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToRunIngest() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToRunIngest");
    }
    /**
     * @return <i>Unable to write to Keyword Search index</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unableToUpdateKWSIndex() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unableToUpdateKWSIndex");
    }
    /**
     * @return <i>Unexpected error while performing Multi User test</i>
     * @see MultiUserTestTool
     */
    static String MultiUserTestTool_unexpectedError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiUserTestTool.unexpectedError");
    }
    private Bundle() {}
}
