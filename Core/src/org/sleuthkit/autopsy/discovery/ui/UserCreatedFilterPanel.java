/*
 * Autopsy
 *
 * Copyright 2020 Basis Technology Corp.
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
package org.sleuthkit.autopsy.discovery.ui;

import org.sleuthkit.autopsy.discovery.search.AbstractFilter;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;
import org.sleuthkit.autopsy.coreutils.ThreadConfined;
import org.sleuthkit.autopsy.discovery.search.SearchFiltering;

/**
 * Panel to allow configuration of the User Created Filter.
 */
final class UserCreatedFilterPanel extends AbstractDiscoveryFilterPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form UserCreatedFilterPanel.
     */
    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    UserCreatedFilterPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userCreatedCheckbox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(userCreatedCheckbox, org.openide.util.NbBundle.getMessage(UserCreatedFilterPanel.class, "UserCreatedFilterPanel.userCreatedCheckbox.text_1")); // NOI18N
        userCreatedCheckbox.setMaximumSize(new java.awt.Dimension(150, 25));
        userCreatedCheckbox.setMinimumSize(new java.awt.Dimension(150, 25));
        userCreatedCheckbox.setPreferredSize(new java.awt.Dimension(150, 25));

        setMinimumSize(new java.awt.Dimension(250, 30));
        setPreferredSize(new java.awt.Dimension(250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    @Override
    void configurePanel(boolean selected, List<?> selectedItems) {
        userCreatedCheckbox.setSelected(selected);
    }

    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    @Override
    JCheckBox getCheckbox() {
        return userCreatedCheckbox;
    }

    @Override
    JLabel getAdditionalLabel() {
        return null;
    }

    @Override
    String checkForError() {
        //this filter currently has no errors it generates
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox userCreatedCheckbox;
    // End of variables declaration//GEN-END:variables

    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    @Override
    AbstractFilter getFilter() {
        if (userCreatedCheckbox.isSelected()) {
            return new SearchFiltering.UserCreatedFilter();
        }
        return null;
    }

    @Override
    boolean hasPanel() {
        return false;
    }
    
    @Override
    void addListSelectionListener(ListSelectionListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    boolean isFilterSupported() {
        return true;
    }
    
}
