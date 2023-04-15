package org.sleuthkit.autopsy.keywordsearch;
/** Localizable strings for {@link org.sleuthkit.autopsy.keywordsearch}. */
class Bundle {
    /**
     * @return <i>Credit Card Number</i>
     * @see AccountsText
     */
    static String AccountsText_creditCardNumber() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.creditCardNumber");
    }
    /**
     * @return <i>Credit Card Numbers</i>
     * @see AccountsText
     */
    static String AccountsText_creditCardNumbers() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.creditCardNumbers");
    }
    /**
     * @return <i>No next item.</i>
     * @see AccountsText
     */
    static String AccountsText_nextItem_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.nextItem.exception.msg");
    }
    /**
     * @return <i>No next page.</i>
     * @see AccountsText
     */
    static String AccountsText_nextPage_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.nextPage.exception.msg");
    }
    /**
     * @return <i>No previous item.</i>
     * @see AccountsText
     */
    static String AccountsText_previousItem_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.previousItem.exception.msg");
    }
    /**
     * @return <i>No previous page.</i>
     * @see AccountsText
     */
    static String AccountsText_previousPage_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AccountsText.previousPage.exception.msg");
    }
    /**
     * @return <i>Unable to run file type detection.</i>
     * @see KeywordSearchIngestModule
     */
    static String CannotRunFileTypeDetection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CannotRunFileTypeDetection");
    }
    /**
     * @return <i>Unable to add data to text index. All future text indexing for the current case will be skipped.</i>
     * @see Server
     */
    static String Collection_unableToIndexData_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Collection.unableToIndexData.error");
    }
    /**
     * @return <i>Ad Hoc Search data source filter is selected</i>
     * @see DropdownListSearchPanel
     */
    static String DropdownListSearchPanel_selected() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DropdownListSearchPanel.selected");
    }
    /**
     * @return <i>Ad Hoc Search data source filter is selected</i>
     * @see DropdownSingleTermSearchPanel
     */
    static String DropdownSingleTermSearchPanel_selected() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DropdownSingleTermSearchPanel.selected");
    }
    /**
     * @return <i>Boundary characters ^ and $ do not match word boundaries. Consider<br>replacing with an explicit list of boundary characters, such as [ \.,]</i>
     * @see DropdownSingleTermSearchPanel
     */
    static String DropdownSingleTermSearchPanel_warning_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DropdownSingleTermSearchPanel.warning.text");
    }
    /**
     * @return <i>Warning</i>
     * @see DropdownSingleTermSearchPanel
     */
    static String DropdownSingleTermSearchPanel_warning_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DropdownSingleTermSearchPanel.warning.title");
    }
    /**
     * @return <i>Extracts all unique words out of the current case. NOTE: The extracted words are lower-cased.</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_description_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.description.text");
    }
    /**
     * @return <i>No currently open case.</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_error_noOpenCase() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.error.noOpenCase");
    }
    /**
     * @return <i>Unique Word Extraction Complete</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_exportComplete() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.exportComplete");
    }
    /**
     * @return <i>Error During Unique Word Extraction</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_export_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.export.error");
    }
    /**
     * @return <i>Extract Unique Words</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_getName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.getName.text");
    }
    /**
     * @param Number_of_extracted_terms Number of extracted terms
     * @return <i>Extracted </i>{@code Number_of_extracted_terms}<i> terms...</i>
     * @see Server
     */
    static String ExtractAllTermsReport_numberExtractedTerms(Object Number_of_extracted_terms) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.numberExtractedTerms", Number_of_extracted_terms);
    }
    /**
     * @return <i>&lt;html>Keyword Search Ingest is currently running.&lt;br />Not all files have been indexed and unique word extraction might yield incomplete results.&lt;br />Do you want to proceed with unique word extraction anyway?&lt;/html></i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_search_ingestInProgressBody() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.search.ingestInProgressBody");
    }
    /**
     * @param Keyword_search_commit_frequency Keyword search commit frequency
     * @return <i>No files are in index yet. Try again later. Index is updated every </i>{@code Keyword_search_commit_frequency}<i> minutes.</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_search_noFilesInIdxMsg(Object Keyword_search_commit_frequency) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.search.noFilesInIdxMsg", Keyword_search_commit_frequency);
    }
    /**
     * @return <i>No files are in index yet. Try again later</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_search_noFilesInIdxMsg2() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.search.noFilesInIdxMsg2");
    }
    /**
     * @return <i>Keyword Search Ingest in Progress</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_search_searchIngestInProgressTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.search.searchIngestInProgressTitle");
    }
    /**
     * @return <i>Starting Unique Word Extraction</i>
     * @see ExtractAllTermsReport
     */
    static String ExtractAllTermsReport_startExport() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractAllTermsReport.startExport");
    }
    /**
     * @param Content_name Content name
     * @return <i>Loading text for </i>{@code Content_name}
     * @see ExtractedContentPanel
     */
    static String ExtractedContentPanel_SetMarkup_progress_loading(Object Content_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractedContentPanel.SetMarkup.progress.loading", Content_name);
    }
    /**
     * @return <i>&lt;span style='font-style:italic'>Loading text... Please wait&lt;/span></i>
     * @see ExtractedContentPanel
     */
    static String ExtractedContentPanel_setMarkup_panelTxt() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractedContentPanel.setMarkup.panelTxt");
    }
    /**
     * @return <i>Edit Keyword</i>
     * @see GlobalEditListPanel
     */
    static String GlobalEditListPanel_editKeyword_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GlobalEditListPanel.editKeyword.title");
    }
    /**
     * @return <i>Boundary characters ^ and $ do not match word boundaries. Consider<br>replacing with an explicit list of boundary characters, such as [ \.,]</i>
     * @see GlobalEditListPanel
     */
    static String GlobalEditListPanel_warning_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GlobalEditListPanel.warning.text");
    }
    /**
     * @return <i>Warning</i>
     * @see GlobalEditListPanel
     */
    static String GlobalEditListPanel_warning_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GlobalEditListPanel.warning.title");
    }
    /**
     * @return <i>&lt;span style='font-style:italic'>Error retrieving indexed text.&lt;/span></i>
     * @see IndexedText
     */
    static String IndexedText_errorMessage_errorGettingText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IndexedText.errorMessage.errorGettingText");
    }
    /**
     * @return <i>&lt;span style='font-style:italic'>This file is a known file (based on MD5 hash) and does not have indexed text.&lt;/span></i>
     * @see IndexedText
     */
    static String IndexedText_warningMessage_knownFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IndexedText.warningMessage.knownFile");
    }
    /**
     * @return <i>&lt;span style='font-style:italic'>No indexed text for this file.&lt;/span></i>
     * @see IndexedText
     */
    static String IndexedText_warningMessage_noTextAvailable() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IndexedText.warningMessage.noTextAvailable");
    }
    /**
     * @return <i>Only process images which are over 100KB in size or extracted from a document. (Beta) (Requires Windows 64-bit)</i>
     * @see KeywordSearchGlobalSearchSettingsPanel
     */
    static String KeywordSearchGlobalSearchSettingsPanel_customizeComponents_windowsLimitedOCR() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchGlobalSearchSettingsPanel.customizeComponents.windowsLimitedOCR");
    }
    /**
     * @return <i>Enable Optical Character Recognition (OCR) (Requires Windows 64-bit)</i>
     * @see KeywordSearchGlobalSearchSettingsPanel
     */
    static String KeywordSearchGlobalSearchSettingsPanel_customizeComponents_windowsOCR() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchGlobalSearchSettingsPanel.customizeComponents.windowsOCR");
    }
    /**
     * @return <i>Global Keyword Search Settings</i>
     * @see KeywordSearchGlobalSettingsPanel
     */
    static String KeywordSearchGlobalSettingsPanel_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchGlobalSettingsPanel.Title");
    }
    /**
     * @return <i>Keyword search server was not properly initialized, cannot run keyword search ingest.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_badInitMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.badInitMsg");
    }
    /**
     * @param Reason_for_not_connecting_to_Solr Reason for not connecting to Solr
     * @return <i>Error connecting to SOLR server: </i>{@code Reason_for_not_connecting_to_Solr}<i>.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_exception_errConnToSolr_msg(Object Reason_for_not_connecting_to_Solr) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.exception.errConnToSolr.msg", Reason_for_not_connecting_to_Solr);
    }
    /**
     * @param Reason_for_not_starting_Solr Reason for not starting Solr
     * @return {@code Reason_for_not_starting_Solr}<i>&lt;br />Please try stopping Java Solr processes if any exist and restart the application.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_init_tryStopSolrMsg(Object Reason_for_not_starting_Solr) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.init.tryStopSolrMsg", Reason_for_not_starting_Solr);
    }
    /**
     * @return <i>METADATA</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_metadataTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.metadataTitle");
    }
    /**
     * @return <i>No open case available.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_noOpenCase_errMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.noOpenCase.errMsg");
    }
    /**
     * @return <i>The index could not be opened or does not exist.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startUp_noOpenCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startUp.noOpenCore.msg");
    }
    /**
     * @param schema_version_number schema version number
     * @return <i>Adding text no longer supported for schema version </i>{@code schema_version_number}<i> of the text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupException_indexSchemaNotSupported(Object schema_version_number) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupException.indexSchemaNotSupported", schema_version_number);
    }
    /**
     * @param Solr_version_number Solr version number
     * @return <i>Adding text no longer supported for Solr version </i>{@code Solr_version_number}<i> of the text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupException_indexSolrVersionNotSupported(Object Solr_version_number) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupException.indexSolrVersionNotSupported", Solr_version_number);
    }
    /**
     * @return <i>Failed to get schema version for text index.</i>
     * @see KeywordSearchIngestModule
     */
    static String KeywordSearchIngestModule_startupMessage_failedToGetIndexSchema() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchIngestModule.startupMessage.failedToGetIndexSchema");
    }
    /**
     * @return <i>No results found.</i>
     * @see AdHocSearchChildFactory
     */
    static String KeywordSearchResultFactory_createNodeForKey_noResultsFound_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchResultFactory.createNodeForKey.noResultsFound.text");
    }
    /**
     * @return <i>Could not perform the query </i>
     * @see AdHocSearchChildFactory
     */
    static String KeywordSearchResultFactory_query_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KeywordSearchResultFactory.query.exception.msg");
    }
    /**
     * @return <i>File Text</i>
     * @see RawText
     */
    static String RawText_FileText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RawText.FileText");
    }
    /**
     * @return <i>Result Text</i>
     * @see RawText
     */
    static String RawText_ResultText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RawText.ResultText");
    }
    /**
     * @return <i>Error performing query:</i>
     * @see IngestSearchRunner
     */
    static String SearchRunner_query_exception_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SearchRunner.query.exception.msg");
    }
    /**
     * @param colelction_name colelction name
     * @return <i>Failed to delete Solr colelction </i>{@code colelction_name}
     * @see Server
     */
    static String Server_deleteCore_exception_msg(Object colelction_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.deleteCore.exception.msg", colelction_name);
    }
    /**
     * @return <i>Unable to backup Solr collection</i>
     * @see Server
     */
    static String Server_exceptionMessage_unableToBackupCollection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.exceptionMessage.unableToBackupCollection");
    }
    /**
     * @return <i>Unable to create Solr collection</i>
     * @see Server
     */
    static String Server_exceptionMessage_unableToCreateCollection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.exceptionMessage.unableToCreateCollection");
    }
    /**
     * @return <i>Unable to restore Solr collection</i>
     * @see Server
     */
    static String Server_exceptionMessage_unableToRestoreCollection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.exceptionMessage.unableToRestoreCollection");
    }
    /**
     * @return <i>Extraction of all unique Solr terms failed:</i>
     * @see Server
     */
    static String Server_getAllTerms_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.getAllTerms.error");
    }
    /**
     * @return <i>Local Solr server did not respond to status request. This may be because the server failed to start or is taking too long to initialize.</i>
     * @see Server
     */
    static String Server_status_failed_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Server.status.failed.msg");
    }
    /**
     * @return <i>Invalid port number.</i>
     * @see KeywordSearchIngestModule
     */
    static String SolrConnectionCheck_Port() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrConnectionCheck.Port");
    }
    /**
     * @param index_folder_path index folder path
     * @return <i>Failed to delete text index files at </i>{@code index_folder_path}
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_failedToDeleteIndexFiles(Object index_folder_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.failedToDeleteIndexFiles", index_folder_path);
    }
    /**
     * @return <i>IndexMetadata did not contain a current Solr core so could not delete the case</i>
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_noCurrentSolrCore() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.noCurrentSolrCore");
    }
    /**
     * @param case_directory case directory
     * @return <i>Unable to create IndexMetaData from case directory: </i>{@code case_directory}
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_noIndexMetadata(Object case_directory) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.noIndexMetadata", case_directory);
    }
    /**
     * @param collection_name collection name
     * @return <i>Unable to delete collection </i>{@code collection_name}
     * @see SolrSearchService
     */
    static String SolrSearchService_exceptionMessage_unableToDeleteCollection(Object collection_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearchService.exceptionMessage.unableToDeleteCollection", collection_name);
    }
    /**
     * @return <i>Looking for text index with latest Solr and schema version</i>
     * @see SolrSearchService
     */
    static String SolrSearch_checkingForLatestIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.checkingForLatestIndex.msg");
    }
    /**
     * @return <i>Text index successfully opened</i>
     * @see SolrSearchService
     */
    static String SolrSearch_complete_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.complete.msg");
    }
    /**
     * @return <i>Creating new text index</i>
     * @see SolrSearchService
     */
    static String SolrSearch_creatingNewIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.creatingNewIndex.msg");
    }
    /**
     * @return <i>Looking for existing text index directories</i>
     * @see SolrSearchService
     */
    static String SolrSearch_findingIndexes_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.findingIndexes.msg");
    }
    /**
     * @param futureVersion futureVersion
     * @param currentVersion currentVersion
     * @return <i>The text index for the case is for Solr </i>{@code futureVersion}<i>. This version of Autopsy is compatible with Solr </i>{@code currentVersion}<i>.</i>
     * @see SolrSearchService
     */
    static String SolrSearch_futureIndexVersion_msg(Object futureVersion, Object currentVersion) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.futureIndexVersion.msg", futureVersion, currentVersion);
    }
    /**
     * @return <i>Identifying text index to use</i>
     * @see SolrSearchService
     */
    static String SolrSearch_indentifyingIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.indentifyingIndex.msg");
    }
    /**
     * @return <i>Looking for text index metadata file</i>
     * @see SolrSearchService
     */
    static String SolrSearch_lookingForMetadata_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.lookingForMetadata.msg");
    }
    /**
     * @return <i>Opening text index. For large cases this may take several minutes.</i>
     * @see SolrSearchService
     */
    static String SolrSearch_openCore_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.openCore.msg");
    }
    /**
     * @return <i>Reading text index metadata file</i>
     * @see SolrSearchService
     */
    static String SolrSearch_readingIndexes_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.readingIndexes.msg");
    }
    /**
     * @return <i>Unable to find index that can be used for this case</i>
     * @see SolrSearchService
     */
    static String SolrSearch_unableToFindIndex_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SolrSearch.unableToFindIndex.msg");
    }
    /**
     * @return 
     * @see TextZoomPanel
     */
    static String TextZoomPanel_zoomInButton_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TextZoomPanel.zoomInButton.text");
    }
    /**
     * @return 
     * @see TextZoomPanel
     */
    static String TextZoomPanel_zoomOutButton_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TextZoomPanel.zoomOutButton.text");
    }
    /**
     * @return <i>Reset</i>
     * @see TextZoomPanel
     */
    static String TextZoomPanel_zoomResetButton_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TextZoomPanel.zoomResetButton.text");
    }
    /**
     * @return 
     * @see TextZoomPanel
     */
    static String TextZoomPanel_zoomTextField_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TextZoomPanel.zoomTextField.text");
    }
    private Bundle() {}
}
