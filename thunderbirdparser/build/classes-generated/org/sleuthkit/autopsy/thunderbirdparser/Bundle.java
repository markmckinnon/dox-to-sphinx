package org.sleuthkit.autopsy.thunderbirdparser;
/** Localizable strings for {@link org.sleuthkit.autopsy.thunderbirdparser}. */
class Bundle {
    /**
     * @return <i>Exception while getting open case.</i>
     * @see MimeJ4MessageParser
     */
    static String MimeJ4MessageParser_handleAttch_noOpenCase_errMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MimeJ4MessageParser.handleAttch.noOpenCase.errMsg");
    }
    /**
     * @return <i>Exception while getting open case.</i>
     * @see PstParser
     */
    static String PstParser_noOpenCase_errMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PstParser.noOpenCase.errMsg");
    }
    /**
     * @return <i>Failed to index email message detected artifact for keyword search.</i>
     * @see ThunderbirdMboxFileIngestModule
     */
    static String ThunderbirdMboxFileIngestModule_addArtifact_indexError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ThunderbirdMboxFileIngestModule.addArtifact.indexError.message");
    }
    /**
     * @param file_name file name
     * @param file_ID file ID
     * @return <i>Out of disk space. Cannot copy '</i>{@code file_name}<i>' (id=</i>{@code file_ID}<i>) to parse.</i>
     * @see ThunderbirdMboxFileIngestModule
     */
    static String ThunderbirdMboxFileIngestModule_errorMessage_outOfDiskSpace(Object file_name, Object file_ID) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ThunderbirdMboxFileIngestModule.errorMessage.outOfDiskSpace", file_name, file_ID);
    }
    /**
     * @return <i>Failed to add attachments to email message.</i>
     * @see ThunderbirdMboxFileIngestModule
     */
    static String ThunderbirdMboxFileIngestModule_handleAttch_addAttachmentsErrorMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ThunderbirdMboxFileIngestModule.handleAttch.addAttachmentsErrorMsg");
    }
    /**
     * @return <i>Exception while getting open case.</i>
     * @see ThunderbirdMboxFileIngestModule
     */
    static String ThunderbirdMboxFileIngestModule_noOpenCase_errMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ThunderbirdMboxFileIngestModule.noOpenCase.errMsg");
    }
    /**
     * @return <i>Failed to index encryption detected artifact for keyword search.</i>
     * @see ThunderbirdMboxFileIngestModule
     */
    static String ThunderbirdMboxFileIngestModule_processPst_indexError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ThunderbirdMboxFileIngestModule.processPst.indexError.message");
    }
    /**
     * @return <i>Failed to index the contact artifact for keyword search.</i>
     * @see VcardParser
     */
    static String VcardParser_addContactArtifact_indexError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VcardParser.addContactArtifact.indexError");
    }
    private Bundle() {}
}
