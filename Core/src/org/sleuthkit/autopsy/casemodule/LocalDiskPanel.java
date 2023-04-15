/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2021 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.casemodule;

import java.io.File;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import org.openide.util.NbBundle;
import org.sleuthkit.autopsy.corecomponentinterfaces.DataSourceProcessor;
import org.sleuthkit.autopsy.coreutils.LocalDisk;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.autopsy.coreutils.MessageNotifyUtil;
import org.sleuthkit.autopsy.coreutils.PlatformUtil;
import org.sleuthkit.autopsy.coreutils.TimeZoneUtils;
import org.sleuthkit.autopsy.guiutils.JFileChooserFactory;
import org.sleuthkit.autopsy.imagewriter.ImageWriterSettings;

/**
 * ImageTypePanel for adding a local disk or partition such as PhysicalDrive0 or
 * C:.
 */
@NbBundle.Messages({
    "LocalDiskPanel.errorMessage.noOpenCaseTitle=No open case available",
    "LocalDiskPanel.errorMessage.noOpenCaseBody=LocalDiskPanel listener couldn't get the open case.",
    "LocalDiskPanel.imageWriterError.directoryNotExist=Error - directory does not exist",
    "LocalDiskPanel.imageWriterError.emptyPath=Error - enter path for VHD",
    "LocalDiskPanel.imageWriterError.isDirectory=Error - VHD path is a directory",
    "LocalDiskPanel.imageWriterError.fileExists=Error - VHD path already exists",
    "LocalDiskPanel.moduleErrorMessage.title=Module Error",
    "LocalDiskPanel.moduleErrorMessage.body=A module caused an error listening to LocalDiskPanel updates. See log to determine which module. Some data could be incomplete.",
    "LocalDiskPanel.localDiskMessage.unspecified=Unspecified"
})
@SuppressWarnings("PMD.SingularField") // UI widgets cause lots of false positives
final class LocalDiskPanel extends JPanel {

    private static final Logger logger = Logger.getLogger(LocalDiskPanel.class.getName());
    private static final String[] SECTOR_SIZE_CHOICES = {"Auto Detect", "512", "1024", "2048", "4096"};
    private static LocalDiskPanel instance;
    private static final long serialVersionUID = 1L;
    private LocalDisk localDisk;
    private boolean enableNext = false;
    private JFileChooser fc;
    private final JFileChooserFactory chooserHelper;

    /**
     * Creates new form LocalDiskPanel
     */
    LocalDiskPanel() {
        initComponents();
        customInit();
        createTimeZoneList();
        createSectorSizeList();
        chooserHelper = new JFileChooserFactory();
    }

    /**
     * Get the default instance of this panel.
     */
    static synchronized LocalDiskPanel getDefault() {
        if (instance == null) {
            instance = new LocalDiskPanel();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    private void customInit() {
        imageWriterErrorLabel.setVisible(false);
        imageWriterErrorLabel.setText("");
        if (!PlatformUtil.isWindowsOS()) {
            copyImageCheckbox.setSelected(false);
            copyImageCheckbox.setEnabled(false);
        }
        pathTextField.setEnabled(copyImageCheckbox.isSelected());
        browseButton.setEnabled(copyImageCheckbox.isSelected());
        changeDatabasePathCheckbox.setEnabled(copyImageCheckbox.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeZoneLabel = new javax.swing.JLabel();
        timeZoneComboBox = new javax.swing.JComboBox<>();
        noFatOrphansCheckbox = new javax.swing.JCheckBox();
        descLabel = new javax.swing.JLabel();
        copyImageCheckbox = new javax.swing.JCheckBox();
        pathTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imageWriterErrorLabel = new javax.swing.JLabel();
        changeDatabasePathCheckbox = new javax.swing.JCheckBox();
        sectorSizeLabel = new javax.swing.JLabel();
        sectorSizeComboBox = new javax.swing.JComboBox<>();
        selectDiskButton = new javax.swing.JButton();
        localDiskLabel = new javax.swing.JLabel();
        localDiskNameTextField = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(0, 420));
        setPreferredSize(new java.awt.Dimension(485, 410));

        org.openide.awt.Mnemonics.setLocalizedText(timeZoneLabel, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.timeZoneLabel.text")); // NOI18N

        timeZoneComboBox.setMaximumRowCount(30);

        org.openide.awt.Mnemonics.setLocalizedText(noFatOrphansCheckbox, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.noFatOrphansCheckbox.text")); // NOI18N
        noFatOrphansCheckbox.setToolTipText(org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.noFatOrphansCheckbox.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(descLabel, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.descLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(copyImageCheckbox, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.copyImageCheckbox.text")); // NOI18N
        copyImageCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyImageCheckboxActionPerformed(evt);
            }
        });

        pathTextField.setText(org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.pathTextField.text")); // NOI18N
        pathTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pathTextFieldKeyReleased(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.jLabel1.text")); // NOI18N

        imageWriterErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(imageWriterErrorLabel, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.imageWriterErrorLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(changeDatabasePathCheckbox, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.changeDatabasePathCheckbox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(sectorSizeLabel, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.sectorSizeLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(selectDiskButton, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.selectDiskButton.text")); // NOI18N
        selectDiskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDiskButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(localDiskLabel, org.openide.util.NbBundle.getMessage(LocalDiskPanel.class, "LocalDiskPanel.localDiskLabel.text")); // NOI18N

        localDiskNameTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localDiskLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(localDiskNameTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectDiskButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeZoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timeZoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noFatOrphansCheckbox)
                            .addComponent(copyImageCheckbox)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browseButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(sectorSizeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sectorSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descLabel)
                                    .addComponent(changeDatabasePathCheckbox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1))
                                    .addComponent(imageWriterErrorLabel))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localDiskLabel)
                    .addComponent(selectDiskButton)
                    .addComponent(localDiskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeZoneLabel)
                    .addComponent(timeZoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(noFatOrphansCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLabel)
                .addGap(18, 18, 18)
                .addComponent(copyImageCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addGap(13, 13, 13)
                .addComponent(changeDatabasePathCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageWriterErrorLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectorSizeLabel)
                    .addComponent(sectorSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void copyImageCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyImageCheckboxActionPerformed
        pathTextField.setEnabled(copyImageCheckbox.isSelected());
        browseButton.setEnabled(copyImageCheckbox.isSelected());
        changeDatabasePathCheckbox.setEnabled(copyImageCheckbox.isSelected());
        changeDatabasePathCheckbox.setSelected(copyImageCheckbox.isSelected());
        fireUpdateEvent();
    }//GEN-LAST:event_copyImageCheckboxActionPerformed

    private void pathTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pathTextFieldKeyReleased
        fireUpdateEvent();
    }//GEN-LAST:event_pathTextFieldKeyReleased

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        fc = chooserHelper.getChooser();
        String oldText = pathTextField.getText();
        // set the current directory of the FileChooser if the ImagePath Field is valid
        File currentFile = new File(oldText);
        if ((currentFile.getParentFile() != null) && (currentFile.getParentFile().exists())) {
            fc.setSelectedFile(currentFile);
        }

        int retval = fc.showOpenDialog(this);
        if (retval == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            pathTextField.setText(path);
        }
        fireUpdateEvent();
    }//GEN-LAST:event_browseButtonActionPerformed

    private void selectDiskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDiskButtonActionPerformed
        LocalDiskSelectionDialog selectionDialog = new LocalDiskSelectionDialog();
        selectionDialog.display();
        LocalDisk selectedLocalDisk = selectionDialog.getLocalDiskSelection();
        if (selectedLocalDisk != null) {
            localDisk = selectedLocalDisk;
            localDiskNameTextField.setText(selectedLocalDisk.getName());
            
            enableNext = true;
            try {
                setPotentialImageWriterPath(localDisk);
                firePropertyChange(DataSourceProcessor.DSP_PANEL_EVENT.UPDATE_UI.toString(), false, true);
            } catch (NoCurrentCaseException ex) {
                logger.log(Level.SEVERE, "Exception while getting open case.", ex); //NON-NLS
                MessageNotifyUtil.Notify.show(Bundle.LocalDiskPanel_errorMessage_noOpenCaseTitle(),
                        Bundle.LocalDiskPanel_errorMessage_noOpenCaseBody(),
                        MessageNotifyUtil.MessageType.ERROR);
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "LocalDiskPanel listener threw exception", ex); //NON-NLS
                MessageNotifyUtil.Notify.show(Bundle.LocalDiskPanel_moduleErrorMessage_title(),
                        Bundle.LocalDiskPanel_moduleErrorMessage_body(),
                        MessageNotifyUtil.MessageType.ERROR);
            }
        }
    }//GEN-LAST:event_selectDiskButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JCheckBox changeDatabasePathCheckbox;
    private javax.swing.JCheckBox copyImageCheckbox;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel imageWriterErrorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel localDiskLabel;
    private javax.swing.JTextField localDiskNameTextField;
    private javax.swing.JCheckBox noFatOrphansCheckbox;
    private javax.swing.JTextField pathTextField;
    private javax.swing.JComboBox<String> sectorSizeComboBox;
    private javax.swing.JLabel sectorSizeLabel;
    private javax.swing.JButton selectDiskButton;
    private javax.swing.JComboBox<String> timeZoneComboBox;
    private javax.swing.JLabel timeZoneLabel;
    // End of variables declaration//GEN-END:variables

    private void fireUpdateEvent() {
        try {
            firePropertyChange(DataSourceProcessor.DSP_PANEL_EVENT.UPDATE_UI.toString(), false, true);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "LocalDiskPanel listener threw exception", e); //NON-NLS
            MessageNotifyUtil.Notify.show(Bundle.LocalDiskPanel_moduleErrorMessage_title(),
                    Bundle.LocalDiskPanel_moduleErrorMessage_body(),
                    MessageNotifyUtil.MessageType.ERROR);
        }
    }
    
    /**
     * Reset the local disk selection to "Unspecified".
     */
    void resetLocalDiskSelection() {
        localDisk = null;
        localDiskNameTextField.setText(Bundle.LocalDiskPanel_localDiskMessage_unspecified());
        enableNext = false;
    }

    /**
     * Return the currently selected disk path.
     *
     * @return String selected disk path
     */
    String getContentPath() {
        if (localDisk != null) {
            return localDisk.getPath();
        } else {
            return "";
        }
    }

    /**
     * Get the sector size.
     *
     * @return 0 if autodetect; otherwise the value selected.
     */
    int getSectorSize() {
        int sectorSizeSelectionIndex = sectorSizeComboBox.getSelectedIndex();

        if (sectorSizeSelectionIndex == 0) {
            return 0;
        }

        return Integer.valueOf((String) sectorSizeComboBox.getSelectedItem());
    }

    String getTimeZone() {
        String tz = timeZoneComboBox.getSelectedItem().toString();
        return tz.substring(tz.indexOf(")") + 2).trim();

    }

    boolean getNoFatOrphans() {
        return noFatOrphansCheckbox.isSelected();
    }

    private static String getDefaultImageWriterFolder() throws NoCurrentCaseException {
        return Paths.get(Case.getCurrentCaseThrows().getModuleDirectory(), "Image Writer").toString();
    }

    private void setPotentialImageWriterPath(LocalDisk disk) throws NoCurrentCaseException {

        File subDirectory = Paths.get(getDefaultImageWriterFolder()).toFile();
        if (!subDirectory.exists()) {
            subDirectory.mkdirs();
        }

        String path = disk.getName();

        // Remove any character that isn't alphanumeric, a space, parent, or underscore.
        // If the name ends up empty or starting with a space, prepend "localDisk"
        path = path.replaceAll("[^0-9A-Za-z _()]", ""); // NON-NLS
        if (path.isEmpty() || path.startsWith(" ")) {
            path = "localDisk" + path;
        }

        path += " " + System.currentTimeMillis();
        path += ".vhd";
        pathTextField.setText(Paths.get(getDefaultImageWriterFolder(), path).toString());
    }

    private boolean imageWriterPathIsValid() {
        if ((!copyImageCheckbox.isSelected()) || localDisk == null) {
            imageWriterErrorLabel.setVisible(false);
            imageWriterErrorLabel.setText("");
            return true;
        }

        if (pathTextField.getText().isEmpty()) {
            imageWriterErrorLabel.setVisible(true);
            imageWriterErrorLabel.setText(Bundle.LocalDiskPanel_imageWriterError_emptyPath());
            return false;
        }

        File f = new File(pathTextField.getText());
        if (((f.getParentFile() != null) && (!f.getParentFile().exists()))
                || (f.getParentFile() == null)) {
            imageWriterErrorLabel.setVisible(true);
            imageWriterErrorLabel.setText(Bundle.LocalDiskPanel_imageWriterError_directoryNotExist());
            return false;
        }
        if (f.isDirectory()) {
            imageWriterErrorLabel.setVisible(true);
            imageWriterErrorLabel.setText(Bundle.LocalDiskPanel_imageWriterError_isDirectory());
            return false;
        }
        if (f.exists()) {
            imageWriterErrorLabel.setVisible(true);
            imageWriterErrorLabel.setText(Bundle.LocalDiskPanel_imageWriterError_fileExists());
            return false;
        }
        imageWriterErrorLabel.setVisible(false);
        imageWriterErrorLabel.setText("");
        return true;
    }

    boolean getImageWriterEnabled() {
        return copyImageCheckbox.isSelected();
    }

    ImageWriterSettings getImageWriterSettings() {
        return new ImageWriterSettings(pathTextField.getText(), changeDatabasePathCheckbox.isSelected());
    }

    /**
     * Should we enable the wizard's next button? We control all the possible
     * selections except for Image Writer.
     *
     * @return true if panel is valid
     */
    boolean validatePanel() {
        if (!imageWriterPathIsValid()) {
            return false;
        }
        return enableNext;
    }

    /**
     * Creates the drop down list for the time zones and defaults the selection
     * to the local machine time zone.
     */
    public void createTimeZoneList() {
        List<String> timeZoneList = TimeZoneUtils.createTimeZoneList();
        for (String timeZone : timeZoneList) {
            timeZoneComboBox.addItem(timeZone);
        }

        // set the selected timezone
        timeZoneComboBox.setSelectedItem(TimeZoneUtils.createTimeZoneString(Calendar.getInstance().getTimeZone()));
    }

    /**
     * Creates the drop down list for the sector size and defaults the selection
     * to "Auto Detect".
     */
    private void createSectorSizeList() {
        for (String choice : SECTOR_SIZE_CHOICES) {
            sectorSizeComboBox.addItem(choice);
        }
        sectorSizeComboBox.setSelectedIndex(0);
    }
}
