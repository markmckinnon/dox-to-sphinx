/*
 * Autopsy Forensic Browser
 *
 * Copyright 2019-2021 Basis Technology Corp.
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
package org.sleuthkit.autopsy.experimental.autoingest;

import java.awt.BorderLayout;
import java.util.logging.Level;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.Mode;
import org.openide.windows.WindowManager;
import org.sleuthkit.autopsy.casemodule.multiusercasesbrowser.MultiUserCasesBrowserPanel;
import org.sleuthkit.autopsy.coreutils.Logger;

/**
 * A top component that provides an adminstrative dashboard for multi-user
 * cases.
 */
@TopComponent.Description(
        preferredID = "CasesDashboardTopComponent",
        persistenceType = TopComponent.PERSISTENCE_NEVER
)
@TopComponent.Registration(
        mode = "dashboard",
        openAtStartup = false
)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_CasesDashboardTopComponent",
        preferredID = "CasesDashboardTopComponent"
)
@Messages({
    "CTL_CasesDashboardAction=Multi-User Cases Dashboard",
    "CTL_CasesDashboardTopComponent=Cases",
    "HINT_CasesDashboardTopComponent=This is an adminstrative dashboard for multi-user cases"
})
@SuppressWarnings("PMD.SingularField") // Prevent warnings about generated code
public final class CasesDashboardTopComponent extends TopComponent implements ExplorerManager.Provider {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(CasesDashboardTopComponent.class.getName());
    private final ExplorerManager explorerManager;
    private final MultiUserCasesBrowserPanel caseBrowserPanel;

    /**
     * Opens a singleton top component that provides an adminstrative dashboard
     * for multi-user cases. The top component is docked into the "dashboard
     * mode" defined by the auto ingest jobs top component.
     */
    public static void openTopComponent() {
        CasesDashboardTopComponent topComponent = (CasesDashboardTopComponent) WindowManager.getDefault().findTopComponent("CasesDashboardTopComponent"); // NON-NLS
        if (topComponent == null) {
            logger.log(Level.SEVERE, "Failed to find CasesDashboardTopComponent"); // NON-NLS
            return;
        }

        Mode mode = WindowManager.getDefault().findMode("dashboard"); // NON-NLS
        if (mode == null) {
            logger.log(Level.SEVERE, "Failed to find dashboard for CasesDashboardTopComponent, will not display"); // NON-NLS
            return;
        }

        if (!topComponent.isOpened()) {
            mode.dockInto(topComponent);
            topComponent.open();
        }
        topComponent.toFront();
        topComponent.requestActive();
    }

    /**
     * Constructs a singleton top component that provides an adminstrative
     * dashboard for multi-user cases. The top component is docked into the
     * "dashboard mode" defined by the auto ingest jobs top component.
     */
    public CasesDashboardTopComponent() {
        initComponents();
        setName(Bundle.CTL_CasesDashboardTopComponent());
        setToolTipText(Bundle.HINT_CasesDashboardTopComponent());
        explorerManager = new ExplorerManager();
        associateLookup(ExplorerUtils.createLookup(explorerManager, getActionMap()));
        caseBrowserPanel = new MultiUserCasesBrowserPanel(explorerManager, new CasesDashboardCustomizer());
        mainPanel.add(caseBrowserPanel, BorderLayout.CENTER);
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return explorerManager;
    }

    @Override
    protected void componentOpened() {
        caseBrowserPanel.displayCases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        caseBrowserScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        deleteOrphanCaseNodesButton = new javax.swing.JButton();
        deleteOrphanManifestNodesButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        mainPanel.setLayout(new java.awt.BorderLayout());

        bottomPanel.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setLayout(new java.awt.GridLayout());

        org.openide.awt.Mnemonics.setLocalizedText(refreshButton, org.openide.util.NbBundle.getMessage(CasesDashboardTopComponent.class, "CasesDashboardTopComponent.refreshButton.text")); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(refreshButton);

        org.openide.awt.Mnemonics.setLocalizedText(deleteOrphanCaseNodesButton, org.openide.util.NbBundle.getMessage(CasesDashboardTopComponent.class, "CasesDashboardTopComponent.deleteOrphanCaseNodesButton.text")); // NOI18N
        deleteOrphanCaseNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrphanCaseNodesButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteOrphanCaseNodesButton);

        org.openide.awt.Mnemonics.setLocalizedText(deleteOrphanManifestNodesButton, org.openide.util.NbBundle.getMessage(CasesDashboardTopComponent.class, "CasesDashboardTopComponent.deleteOrphanManifestNodesButton.text")); // NOI18N
        deleteOrphanManifestNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrphanManifestNodesButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteOrphanManifestNodesButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        bottomPanel.add(buttonPanel, gridBagConstraints);

        mainPanel.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        caseBrowserScrollPane.setViewportView(mainPanel);

        add(caseBrowserScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        caseBrowserPanel.displayCases();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteOrphanCaseNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrphanCaseNodesButtonActionPerformed
        new DeleteOrphanCaseNodesAction().actionPerformed(evt);
    }//GEN-LAST:event_deleteOrphanCaseNodesButtonActionPerformed

    private void deleteOrphanManifestNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrphanManifestNodesButtonActionPerformed
        new DeleteOrphanManifestNodesAction().actionPerformed(evt);
    }//GEN-LAST:event_deleteOrphanManifestNodesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane caseBrowserScrollPane;
    private javax.swing.JButton deleteOrphanCaseNodesButton;
    private javax.swing.JButton deleteOrphanManifestNodesButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables

}