/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2019 Basis Technology Corp.
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import javax.swing.JDialog;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Panel for displaying the case information, including case details.
 */
@SuppressWarnings("PMD.SingularField") // UI widgets cause lots of false positives
class CaseInformationPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private CaseDetailsPanel caseDetailsPanel;

    /**
     * Constructs a panel for displaying the case information including case
     * details.
     */
    CaseInformationPanel() {
        initComponents();
        customizeComponents();
    }

    @Messages({
        "CaseInformationPanel.caseDetails.header=Details",
        "CaseInformationPanel.editDetailsButton.text=Edit Details",
        "CaseInformationPanel.editDetailsDialog.title=Edit Case Details"
    })
    private void customizeComponents() {
        try {
            caseDetailsPanel = new CaseDetailsPanel(Case.getCurrentCaseThrows());
        } catch (NoCurrentCaseException ex) {
            Logger.getLogger(CaseInformationPanel.class.getName()).log(Level.INFO, "Exception while getting open case.", ex);
        }
        caseDetailsPanel.setSize(caseDetailsPanel.getPreferredSize());
        this.detailsPanel.add(caseDetailsPanel);
        this.detailsPanel.setPreferredSize(caseDetailsPanel.getPreferredSize());
    }

    /**
     * Adds an action listener to the Close button of the panel.
     *
     * @param action
     */
    void addCloseButtonAction(ActionListener action) {
        this.closeButton.addActionListener(action);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outerDetailsPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        editDetailsButton = new javax.swing.JButton();
        detailsPanel = new javax.swing.JPanel();

        org.openide.awt.Mnemonics.setLocalizedText(closeButton, org.openide.util.NbBundle.getMessage(CaseInformationPanel.class, "CaseInformationPanel.closeButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(editDetailsButton, org.openide.util.NbBundle.getMessage(CaseInformationPanel.class, "CaseInformationPanel.editDetailsButton.text")); // NOI18N
        editDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout outerDetailsPanelLayout = new javax.swing.GroupLayout(outerDetailsPanel);
        outerDetailsPanel.setLayout(outerDetailsPanelLayout);
        outerDetailsPanelLayout.setHorizontalGroup(
            outerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
            .addGroup(outerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outerDetailsPanelLayout.setVerticalGroup(
            outerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(outerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(editDetailsButton))
                .addContainerGap())
            .addGroup(outerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outerDetailsPanelLayout.createSequentialGroup()
                    .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 43, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(outerDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDetailsButtonActionPerformed
        JDialog editCasePropertiesDialog = new JDialog(WindowManager.getDefault().getMainWindow(), Bundle.CaseInformationPanel_editDetailsDialog_title(), true);
        EditOptionalCasePropertiesPanel editCasePropertiesPanel = new EditOptionalCasePropertiesPanel();
        editCasePropertiesPanel.addCancelButtonAction((ActionEvent e) -> {
            editCasePropertiesDialog.setVisible(false);
        });
        editCasePropertiesPanel.addSaveButtonAction((ActionEvent e) -> {
            editCasePropertiesDialog.setVisible(false);
            editCasePropertiesPanel.saveProperties();
            caseDetailsPanel.updateCaseInfo();

        });

        editCasePropertiesDialog.add(editCasePropertiesPanel);
        editCasePropertiesDialog.setResizable(true);
        editCasePropertiesDialog.pack();
        editCasePropertiesDialog.setLocationRelativeTo(this);
        // Workaround to ensure dialog is not hidden on macOS
        editCasePropertiesDialog.setAlwaysOnTop(true);
        editCasePropertiesDialog.setVisible(true);
        editCasePropertiesDialog.toFront();
        caseDetailsPanel.updateCaseInfo();
    }//GEN-LAST:event_editDetailsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JButton editDetailsButton;
    private javax.swing.JPanel outerDetailsPanel;
    // End of variables declaration//GEN-END:variables
}