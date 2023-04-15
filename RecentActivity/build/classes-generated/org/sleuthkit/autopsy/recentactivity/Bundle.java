package org.sleuthkit.autopsy.recentactivity;
/** Localizable strings for {@link org.sleuthkit.autopsy.recentactivity}. */
class Bundle {
    /**
     * @return <i>Chrome Cache: Adding %d artifacts for analysis.</i>
     * @see ChromeCacheExtractor
     */
    static String ChromeCacheExtract_adding_artifacts_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ChromeCacheExtract_adding_artifacts_msg");
    }
    /**
     * @return <i>Chrome Cache: Adding %d extracted files for analysis.</i>
     * @see ChromeCacheExtractor
     */
    static String ChromeCacheExtract_adding_extracted_files_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ChromeCacheExtract_adding_extracted_files_msg");
    }
    /**
     * @return <i>Chrome Cache: Loading files from %s.</i>
     * @see ChromeCacheExtractor
     */
    static String ChromeCacheExtract_loading_files_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ChromeCacheExtract_loading_files_msg");
    }
    /**
     * @param module_name module name
     * @param row_number row number
     * @param table_length table length
     * @param cache_path cache path
     * @return {@code module_name}<i>: Extracting cache entry </i>{@code row_number}<i> of </i>{@code table_length}<i> entries from </i>{@code cache_path}
     * @see ChromeCacheExtractor
     */
    static String ChromeCacheExtractor_progressMsg(Object module_name, Object row_number, Object table_length, Object cache_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ChromeCacheExtractor.progressMsg", module_name, row_number, table_length, cache_path);
    }
    /**
     * @param OS_name OS name
     * @return <i>OS Drive (</i>{@code OS_name}<i>)</i>
     * @see DataSourceUsageAnalyzer
     */
    static String DataSourceUsageAnalyzer_customVolume_label(Object OS_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceUsageAnalyzer.customVolume.label", OS_name);
    }
    /**
     * @return <i>Data Source Usage Analyzer</i>
     * @see DataSourceUsageAnalyzer
     */
    static String DataSourceUsageAnalyzer_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceUsageAnalyzer.displayName");
    }
    /**
     * @return <i>Android Media Card</i>
     * @see DataSourceUsageAnalyzer
     */
    static String DataSourceUsage_AndroidMedia() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceUsage_AndroidMedia");
    }
    /**
     * @return <i>DJI Internal SD Card</i>
     * @see DataSourceUsageAnalyzer
     */
    static String DataSourceUsage_DJU_Drone_DAT() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceUsage_DJU_Drone_DAT");
    }
    /**
     * @return <i>Flash Drive</i>
     * @see DataSourceUsageAnalyzer
     */
    static String DataSourceUsage_FlashDrive() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourceUsage_FlashDrive");
    }
    /**
     * @return <i>Search Engine</i>
     * @see DefaultPriorityDomainCategorizer
     */
    static String DefaultPriorityDomainCategorizer_searchEngineCategory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DefaultPriorityDomainCategorizer_searchEngineCategory");
    }
    /**
     * @return <i>Finding Domain Types</i>
     * @see DomainCategoryRunner
     */
    static String DomainCategoryRunner_Progress_Message_Domain_Types() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DomainCategoryRunner_Progress_Message_Domain_Types");
    }
    /**
     * @return <i>Domain Category Analyzer</i>
     * @see DomainCategoryRunner
     */
    static String DomainCategoryRunner_moduleName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DomainCategoryRunner_moduleName_text");
    }
    /**
     * @return <i>Recent Activity</i>
     * @see DomainCategoryRunner
     */
    static String DomainCategoryRunner_parentModuleName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DomainCategoryRunner_parentModuleName");
    }
    /**
     * @return <i>Microsoft Edge Analyzer</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_Module_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_Module_Name");
    }
    /**
     * @return <i>Error while trying to analyze Edge history</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_getHistory_containerFileNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_getHistory_containerFileNotFound");
    }
    /**
     * @return <i>Error trying to retrieving Edge WebCacheV01 file</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_process_errMsg_errGettingWebCacheFiles() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_process_errMsg_errGettingWebCacheFiles");
    }
    /**
     * @return <i>Failure processing Microsoft Edge spartan.edb file</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_process_errMsg_spartanFail() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_process_errMsg_spartanFail");
    }
    /**
     * @return <i>Unable to find ESEDatabaseViewer</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_process_errMsg_unableFindESEViewer() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_process_errMsg_unableFindESEViewer");
    }
    /**
     * @return <i>Failure processing Microsoft Edge WebCacheV01.dat file</i>
     * @see ExtractEdge
     */
    static String ExtractEdge_process_errMsg_webcacheFail() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractEdge_process_errMsg_webcacheFail");
    }
    /**
     * @return <i>Favicon</i>
     * @see Chromium
     */
    static String ExtractFavicon_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractFavicon_Display_Name");
    }
    /**
     * @param sub_module_name sub module name
     * @return {@code sub_module_name}<i>: Error analyzing Internet Explorer web history</i>
     * @see ExtractIE
     */
    static String ExtractIE_executePasco_errMsg_errorRunningPasco(Object sub_module_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractIE_executePasco_errMsg_errorRunningPasco", sub_module_name);
    }
    /**
     * @return <i>Checking for OS</i>
     * @see ExtractOs
     */
    static String ExtractOS_progressMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOS_progressMessage");
    }
    /**
     * @return <i>Android</i>
     * @see ExtractOs
     */
    static String ExtractOs_androidOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.androidOs.label");
    }
    /**
     * @return <i>OS Drive (Android)</i>
     * @see ExtractOs
     */
    static String ExtractOs_androidVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.androidVolume.label");
    }
    /**
     * @return <i>Linux (Debian)</i>
     * @see ExtractOs
     */
    static String ExtractOs_debianLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.debianLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Debian)</i>
     * @see ExtractOs
     */
    static String ExtractOs_debianLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.debianLinuxVolume.label");
    }
    /**
     * @return <i>OS Info Analyzer</i>
     * @see ExtractOs
     */
    static String ExtractOs_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.displayName");
    }
    /**
     * @return <i>Linux (Fedora)</i>
     * @see ExtractOs
     */
    static String ExtractOs_fedoraLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.fedoraLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Fedora)</i>
     * @see ExtractOs
     */
    static String ExtractOs_fedoraLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.fedoraLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Gentoo)</i>
     * @see ExtractOs
     */
    static String ExtractOs_gentooLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.gentooLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Gentoo)</i>
     * @see ExtractOs
     */
    static String ExtractOs_gentooLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.gentooLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Mandrake)</i>
     * @see ExtractOs
     */
    static String ExtractOs_mandrakeLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.mandrakeLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Mandrake)</i>
     * @see ExtractOs
     */
    static String ExtractOs_mandrakeLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.mandrakeLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Novell SUSE)</i>
     * @see ExtractOs
     */
    static String ExtractOs_novellSUSEOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.novellSUSEOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Novell SUSE)</i>
     * @see ExtractOs
     */
    static String ExtractOs_novellSUSEVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.novellSUSEVolume.label");
    }
    /**
     * @return <i>OS Drive (OS X)</i>
     * @see ExtractOs
     */
    static String ExtractOs_osxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.osxVolume.label");
    }
    /**
     * @return <i>Mac OS X</i>
     * @see ExtractOs
     */
    static String ExtractOs_osx_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.osx.label");
    }
    /**
     * @return <i>Linux (Redhat)</i>
     * @see ExtractOs
     */
    static String ExtractOs_redhatLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.redhatLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Redhat)</i>
     * @see ExtractOs
     */
    static String ExtractOs_redhatLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.redhatLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Slackware)</i>
     * @see ExtractOs
     */
    static String ExtractOs_slackwareLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.slackwareLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Slackware)</i>
     * @see ExtractOs
     */
    static String ExtractOs_slackwareLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.slackwareLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Solaris/Sparc)</i>
     * @see ExtractOs
     */
    static String ExtractOs_solarisSparcOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.solarisSparcOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Solaris/Sparc)</i>
     * @see ExtractOs
     */
    static String ExtractOs_solarisSparcVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.solarisSparcVolume.label");
    }
    /**
     * @return <i>Linux (Sun JDS)</i>
     * @see ExtractOs
     */
    static String ExtractOs_sunJDSLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.sunJDSLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Sun JDS)</i>
     * @see ExtractOs
     */
    static String ExtractOs_sunJDSLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.sunJDSLinuxVolume.label");
    }
    /**
     * @return <i>Linux (Ubuntu)</i>
     * @see ExtractOs
     */
    static String ExtractOs_ubuntuLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.ubuntuLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Ubuntu)</i>
     * @see ExtractOs
     */
    static String ExtractOs_ubuntuLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.ubuntuLinuxVolume.label");
    }
    /**
     * @return <i>Linux (United Linux)</i>
     * @see ExtractOs
     */
    static String ExtractOs_unitedLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.unitedLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux United Linux)</i>
     * @see ExtractOs
     */
    static String ExtractOs_unitedLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.unitedLinuxVolume.label");
    }
    /**
     * @return <i>OS Drive (Windows)</i>
     * @see ExtractOs
     */
    static String ExtractOs_windowsVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.windowsVolume.label");
    }
    /**
     * @return <i>Linux (Yellow Dog)</i>
     * @see ExtractOs
     */
    static String ExtractOs_yellowDogLinuxOs_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.yellowDogLinuxOs.label");
    }
    /**
     * @return <i>OS Drive (Linux Yellow Dog)</i>
     * @see ExtractOs
     */
    static String ExtractOs_yellowDogLinuxVolume_label() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractOs.yellowDogLinuxVolume.label");
    }
    /**
     * @param sub_module_name sub module name
     * @return {@code sub_module_name}<i>: Error analyzing prefetch files</i>
     * @see ExtractPrefetch
     */
    static String ExtractPrefetch_errMsg_prefetchParsingFailed(Object sub_module_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractPrefetch_errMsg_prefetchParsingFailed", sub_module_name);
    }
    /**
     * @return <i>Windows Prefetch Analyzer</i>
     * @see ExtractPrefetch
     */
    static String ExtractPrefetch_module_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractPrefetch_module_name");
    }
    /**
     * @return <i>Recycle Bin</i>
     * @see ExtractRecycleBin
     */
    static String ExtractRecycleBin_Recyle_Bin_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractRecycleBin_Recyle_Bin_Display_Name");
    }
    /**
     * @return <i>Recycle Bin Analyzer</i>
     * @see ExtractRecycleBin
     */
    static String ExtractRecycleBin_module_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractRecycleBin_module_name");
    }
    /**
     * @return <i>An error occurred while processing Safari history files.</i>
     * @see ExtractSafari
     */
    static String ExtractSafari_Error_Getting_History() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSafari_Error_Getting_History");
    }
    /**
     * @return <i>An error occured while processing Safari Bookmark files</i>
     * @see ExtractSafari
     */
    static String ExtractSafari_Error_Parsing_Bookmark() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSafari_Error_Parsing_Bookmark");
    }
    /**
     * @return <i>An error occured while processing Safari Cookies files</i>
     * @see ExtractSafari
     */
    static String ExtractSafari_Error_Parsing_Cookies() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSafari_Error_Parsing_Cookies");
    }
    /**
     * @return <i>Safari Analyzer</i>
     * @see ExtractSafari
     */
    static String ExtractSafari_Module_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSafari_Module_Name");
    }
    /**
     * @return <i>Error finding export_srudb program</i>
     * @see ExtractSru
     */
    static String ExtractSru_error_finding_export_srudb_program() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_error_finding_export_srudb_program");
    }
    /**
     * @return <i>System Resource Usage Analyzer</i>
     * @see ExtractSru
     */
    static String ExtractSru_module_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_module_name");
    }
    /**
     * @return <i>Error running export_srudb program</i>
     * @see ExtractSru
     */
    static String ExtractSru_process_error_executing_export_srudb_program() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_process_error_executing_export_srudb_program");
    }
    /**
     * @return <i>Unable to find SOFTWARE HIVE file</i>
     * @see ExtractSru
     */
    static String ExtractSru_process_errormsg_find_software_hive() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_process_errormsg_find_software_hive");
    }
    /**
     * @return <i>Unable to find srudb.dat file</i>
     * @see ExtractSru
     */
    static String ExtractSru_process_errormsg_find_srudb_dat() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_process_errormsg_find_srudb_dat");
    }
    /**
     * @return <i>Unable to write SOFTWARE HIVE file</i>
     * @see ExtractSru
     */
    static String ExtractSru_process_errormsg_write_software_hive() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_process_errormsg_write_software_hive");
    }
    /**
     * @return <i>Unable to write srudb.dat file</i>
     * @see ExtractSru
     */
    static String ExtractSru_process_errormsg_write_srudb_dat() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractSru_process_errormsg_write_srudb_dat");
    }
    /**
     * @return <i>Administrator role</i>
     * @see ExtractWebAccountType
     */
    static String ExtractWebAccountType_role_admin() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractWebAccountType.role.admin");
    }
    /**
     * @return <i>Moderator role</i>
     * @see ExtractWebAccountType
     */
    static String ExtractWebAccountType_role_moderator() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractWebAccountType.role.moderator");
    }
    /**
     * @return <i>User role</i>
     * @see ExtractWebAccountType
     */
    static String ExtractWebAccountType_role_user() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractWebAccountType.role.user");
    }
    /**
     * @return <i>Internet Zone</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_Internet() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_Internet");
    }
    /**
     * @return <i>Local Intranet Zone</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_Local_Intranet() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_Local_Intranet");
    }
    /**
     * @return <i>Local Machine Zone</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_Local_Machine() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_Local_Machine");
    }
    /**
     * @return <i>Restricted Sites Zone</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_Restricted() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_Restricted");
    }
    /**
     * @return <i>Trusted Sites Zone</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_Trusted() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_Trusted");
    }
    /**
     * @return <i> Zone Identifier Analyzer</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_displayName");
    }
    /**
     * @return <i>An error occured processing ':Zone.Indentifier' files.</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_process_errMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_process_errMsg");
    }
    /**
     * @return <i>A failure occured while searching for :Zone.Indentifier files.</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_process_errMsg_find() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_process_errMsg_find");
    }
    /**
     * @return <i>Extracting :Zone.Identifer files</i>
     * @see ExtractZoneIdentifier
     */
    static String ExtractZone_progress_Msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractZone_progress_Msg");
    }
    /**
     * @return <i>Chrome Cache: Adding %d extracted files for analysis.</i>
     * @see ExtractJumpLists
     */
    static String Jumplist_adding_extracted_files_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Jumplist_adding_extracted_files_msg");
    }
    /**
     * @return <i>Windows Jumplist Analyzer</i>
     * @see ExtractJumpLists
     */
    static String Jumplist_module_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Jumplist_module_name");
    }
    /**
     * @return <i>Analyzing Registry Files</i>
     * @see ExtractRegistry
     */
    static String Progress_Message_Analyze_Registry() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Analyze_Registry");
    }
    /**
     * @return <i>Data Sources Usage Analysis</i>
     * @see DataSourceUsageAnalyzer
     */
    static String Progress_Message_Analyze_Usage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Analyze_Usage");
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome Auto Fill Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_AutoFill(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_AutoFill", browserName);
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome Bookmarks Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Bookmarks(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Bookmarks", browserName);
    }
    /**
     * @return <i>Chrome Cache</i>
     * @see Chromium
     */
    static String Progress_Message_Chrome_Cache() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Cache");
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome Cookies Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Cookies(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Cookies", browserName);
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome Downloads Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Downloads(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Downloads", browserName);
    }
    /**
     * @return <i>Chrome Extensions </i>{@code arg0}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Extensions(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Extensions", arg0);
    }
    /**
     * @return <i>Chrome Downloads Favicons </i>{@code arg0}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Favicons(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Favicons", arg0);
    }
    /**
     * @return <i>Chrome Form History</i>
     * @see Chromium
     */
    static String Progress_Message_Chrome_FormHistory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_FormHistory");
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome History Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_History(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_History", browserName);
    }
    /**
     * @param browserName browserName
     * @return <i>Chrome Logins Browser </i>{@code browserName}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Logins(Object browserName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Logins", browserName);
    }
    /**
     * @return <i>Chrome Profiles </i>{@code arg0}
     * @see Chromium
     */
    static String Progress_Message_Chrome_Profiles(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Chrome_Profiles", arg0);
    }
    /**
     * @return <i>Microsoft Edge Bookmarks</i>
     * @see ExtractEdge
     */
    static String Progress_Message_Edge_Bookmarks() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Edge_Bookmarks");
    }
    /**
     * @return <i>Microsoft Edge Cookies</i>
     * @see ExtractEdge
     */
    static String Progress_Message_Edge_Cookies() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Edge_Cookies");
    }
    /**
     * @return <i>Microsoft Edge History</i>
     * @see ExtractEdge
     */
    static String Progress_Message_Edge_History() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Edge_History");
    }
    /**
     * @return <i>Recent Documents</i>
     * @see RecentDocumentsByLnk
     */
    static String Progress_Message_Extract_Resent_Docs() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Extract_Resent_Docs");
    }
    /**
     * @return <i>Find Search Queries</i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String Progress_Message_Find_Search_Query() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Find_Search_Query");
    }
    /**
     * @return <i>Firefox Auto Fill</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_AutoFill() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_AutoFill");
    }
    /**
     * @return <i>Firefox Bookmarks</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_Bookmarks() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_Bookmarks");
    }
    /**
     * @return <i>Firefox Cookies</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_Cookies() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_Cookies");
    }
    /**
     * @return <i>Firefox Downloads</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_Downloads() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_Downloads");
    }
    /**
     * @return <i>Firefox Form History</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_FormHistory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_FormHistory");
    }
    /**
     * @return <i>Firefox History</i>
     * @see Firefox
     */
    static String Progress_Message_Firefox_History() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Firefox_History");
    }
    /**
     * @return <i>IE Auto Fill</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_AutoFill() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_AutoFill");
    }
    /**
     * @return <i>IE Bookmarks</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_Bookmarks() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_Bookmarks");
    }
    /**
     * @return <i>IE Cookies</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_Cookies() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_Cookies");
    }
    /**
     * @return <i>IE Downloads</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_Downloads() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_Downloads");
    }
    /**
     * @return <i>IE Form History</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_FormHistory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_FormHistory");
    }
    /**
     * @return <i>IE History</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_History() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_History");
    }
    /**
     * @return <i>IE Logins</i>
     * @see ExtractIE
     */
    static String Progress_Message_IE_Logins() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_IE_Logins");
    }
    /**
     * @return <i>Safari Bookmarks</i>
     * @see ExtractSafari
     */
    static String Progress_Message_Safari_Bookmarks() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Safari_Bookmarks");
    }
    /**
     * @return <i>Safari Cookies</i>
     * @see ExtractSafari
     */
    static String Progress_Message_Safari_Cookies() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Safari_Cookies");
    }
    /**
     * @return <i>Safari Downloads</i>
     * @see ExtractSafari
     */
    static String Progress_Message_Safari_Downloads() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Safari_Downloads");
    }
    /**
     * @return <i>Safari History</i>
     * @see ExtractSafari
     */
    static String Progress_Message_Safari_History() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Progress_Message_Safari_History");
    }
    /**
     * @return <i>Recent Documents by Link Analyzer</i>
     * @see RecentDocumentsByLnk
     */
    static String RecentDocumentsByLnk_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RecentDocumentsByLnk_displayName");
    }
    /**
     * @return <i>Recently opened according to Adobe MRU</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Adobe() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Adobe");
    }
    /**
     * @return <i>Recently opened according to Applets registry key</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Applets() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Applets");
    }
    /**
     * @return <i>Recently opened by 7Zip</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_ArcHistory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_ArcHistory");
    }
    /**
     * @return <i>Recently opened according to Media Player MRU</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Mediaplayer() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Mediaplayer");
    }
    /**
     * @return <i>Recently opened according to Windows Management Console MRU</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Mmc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Mmc");
    }
    /**
     * @return <i>Stored in TrustRecords because Office security exception was granted</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Office_Trustrecords() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Office_Trustrecords");
    }
    /**
     * @return <i>Recently opened according to Office MRU</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Officedocs() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Officedocs");
    }
    /**
     * @return <i>Recently opened according to WinRAR MRU</i>
     * @see ExtractRegistry
     */
    static String Recently_Used_Artifacts_Winrar() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Recently_Used_Artifacts_Winrar");
    }
    /**
     * @return <i>Full version RegRipper executable not found.</i>
     * @see ExtractRegistry
     */
    static String RegRipperFullNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RegRipperFullNotFound");
    }
    /**
     * @return <i>Autopsy RegRipper executable not found.</i>
     * @see ExtractRegistry
     */
    static String RegRipperNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RegRipperNotFound");
    }
    /**
     * @return <i>Recently Executed according to Background Activity Moderator (BAM)</i>
     * @see ExtractRegistry
     */
    static String Registry_System_Bam() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Registry_System_Bam");
    }
    /**
     * @return <i>Security Answer 1</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Answer_1_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Answer_1_Attribute_Display_Name");
    }
    /**
     * @return <i>Security Answer 2</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Answer_2_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Answer_2_Attribute_Display_Name");
    }
    /**
     * @return <i>Security Answer 3</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Answer_3_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Answer_3_Attribute_Display_Name");
    }
    /**
     * @return <i>Security Question 1</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Question_1_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Question_1_Attribute_Display_Name");
    }
    /**
     * @return <i>Security Question 2</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Question_2_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Question_2_Attribute_Display_Name");
    }
    /**
     * @return <i>Security Question 3</i>
     * @see ExtractRegistry
     */
    static String Sam_Security_Question_3_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Sam_Security_Question_3_Attribute_Display_Name");
    }
    /**
     * @param file_name file name
     * @return <i>Unable to find </i>{@code file_name}<i>.</i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String SearchEngineURLQueryAnalyzer_init_exception_msg(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SearchEngineURLQueryAnalyzer.init.exception.msg", file_name);
    }
    /**
     * @return <i>Shell Bags</i>
     * @see ExtractRegistry
     */
    static String Shellbag_Artifact_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Shellbag_Artifact_Display_Name");
    }
    /**
     * @return <i>Key</i>
     * @see ExtractRegistry
     */
    static String Shellbag_Key_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Shellbag_Key_Attribute_Display_Name");
    }
    /**
     * @return <i>Last Write</i>
     * @see ExtractRegistry
     */
    static String Shellbag_Last_Write_Attribute_Display_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Shellbag_Last_Write_Attribute_Display_Name");
    }
    /**
     * @return <i>Unable to build XML parser: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotBuildXmlParser() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotBuildXmlParser");
    }
    /**
     * @return <i>Unable to load Search Engine URL Query Analyzer settings file, SEUQAMappings.xml: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotLoadSEUQA() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotLoadSEUQA");
    }
    /**
     * @return <i>Unable to parse XML file: </i>
     * @see SearchEngineURLQueryAnalyzer
     */
    static String cannotParseXml() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cannotParseXml");
    }
    private Bundle() {}
}
