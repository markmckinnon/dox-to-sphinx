package org.sleuthkit.autopsy.experimental.objectdetection;
/** Localizable strings for {@link org.sleuthkit.autopsy.experimental.objectdetection}. */
class Bundle {
    /**
     * @param detectionCount detectionCount
     * @return <i>Classifier detected </i>{@code detectionCount}<i> object(s)</i>
     * @see ObjectDetectectionFileIngestModule
     */
    static String ObjectDetectionFileIngestModule_classifierDetection_text(Object detectionCount) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionFileIngestModule.classifierDetection.text", detectionCount);
    }
    /**
     * @param classifierDir classifierDir
     * @return <i>No classifiers were found in </i>{@code classifierDir}<i>, object detection will not be executed.</i>
     * @see ObjectDetectectionFileIngestModule
     */
    static String ObjectDetectionFileIngestModule_noClassifiersFound_message(Object classifierDir) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionFileIngestModule.noClassifiersFound.message", classifierDir);
    }
    /**
     * @return <i>No classifiers found.</i>
     * @see ObjectDetectectionFileIngestModule
     */
    static String ObjectDetectionFileIngestModule_noClassifiersFound_subject() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionFileIngestModule.noClassifiersFound.subject");
    }
    /**
     * @return <i>This module is only available on Windows.</i>
     * @see ObjectDetectectionFileIngestModule
     */
    static String ObjectDetectionFileIngestModule_notWindowsError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionFileIngestModule.notWindowsError");
    }
    /**
     * @return <i>OpenCV was not loaded, but is required to run.</i>
     * @see ObjectDetectectionFileIngestModule
     */
    static String ObjectDetectionFileIngestModule_openCVNotLoaded() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionFileIngestModule.openCVNotLoaded");
    }
    /**
     * @return <i>Use object classifiers to identify objects in pictures.</i>
     * @see ObjectDetectionModuleFactory
     */
    static String ObjectDetectionModuleFactory_moduleDescription_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionModuleFactory.moduleDescription.text");
    }
    /**
     * @return <i>Object Detection</i>
     * @see ObjectDetectionModuleFactory
     */
    static String ObjectDetectionModuleFactory_moduleName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ObjectDetectionModuleFactory.moduleName.text");
    }
    private Bundle() {}
}
