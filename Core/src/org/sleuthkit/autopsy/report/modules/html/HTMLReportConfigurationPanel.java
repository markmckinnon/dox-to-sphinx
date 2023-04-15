/*
 * Autopsy Forensic Browser
 *
 * Copyright 2018 Basis Technology Corp.
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
package org.sleuthkit.autopsy.report.modules.html;

/**
 * The panel shown for all TableReportModules when configuring report modules.
 */
@SuppressWarnings("PMD.SingularField") // UI widgets cause lots of false positives
final class HTMLReportConfigurationPanel extends javax.swing.JPanel {

    /**
     * Creates new form DefaultReportConfigurationPanel
     */
    HTMLReportConfigurationPanel() {
        initComponents();        
        headerTextField.setText("");
        footerTextField.setText("");
    }
    
    void setConfiguration(HTMLReportModuleSettings settings) {
        headerTextField.setText(settings.getHeader());
        footerTextField.setText(settings.getFooter());
    }
    
    HTMLReportModuleSettings getConfiguration() {
        return new HTMLReportModuleSettings(headerTextField.getText(), footerTextField.getText());
    }
    
    /**
     * Get the header text.
     * 
     * @return The header text.
     */
    String getHeader() {
        return headerTextField.getText();
    }
    
    /**
     * Get the footer text.
     * 
     * @return The footer text.
     */
    String getFooter() {
        return footerTextField.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        footerLabel = new javax.swing.JLabel();
        headerTextField = new javax.swing.JTextField();
        footerTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(headerLabel, org.openide.util.NbBundle.getMessage(HTMLReportConfigurationPanel.class, "HTMLReportConfigurationPanel.headerLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(footerLabel, org.openide.util.NbBundle.getMessage(HTMLReportConfigurationPanel.class, "HTMLReportConfigurationPanel.footerLabel.text")); // NOI18N

        headerTextField.setText(org.openide.util.NbBundle.getMessage(HTMLReportConfigurationPanel.class, "HTMLReportConfigurationPanel.headerTextField.text")); // NOI18N

        footerTextField.setText(org.openide.util.NbBundle.getMessage(HTMLReportConfigurationPanel.class, "HTMLReportConfigurationPanel.footerTextField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel)
                    .addComponent(footerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerTextField)
                    .addComponent(footerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerLabel)
                    .addComponent(headerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(footerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footerLabel))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel footerLabel;
    private javax.swing.JTextField footerTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTextField headerTextField;
    // End of variables declaration//GEN-END:variables
}