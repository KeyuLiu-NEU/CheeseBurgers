/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import UserInterface.ManageAirliners.ManageFlights.ManageFlightsJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keyu Liu
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    private AirlinerDirectory airlinerList;
    private JPanel cardSequencePanel;
    /**
     * Creates new form ManageAirliners
     */

    public ManageAirlinersJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlinerList) {
        initComponents();
        this.airlinerList = airlinerList;
        this.cardSequencePanel = CardSequenceJPanel;
        populateAirliners();
    }
    
    public void populateAirliners(){

            
            DefaultTableModel dtm = (DefaultTableModel) tblAirliners.getModel();
            dtm.setRowCount(0);
            for(Airliner airliner: airlinerList.getAirlinerDirectory()){
                Object[] row = new Object[4];
                row[0] = airliner;
                row[1] = airliner.getNumOfFlight();
                row[2] = airliner.getDelayProbability();
                row[3] = airliner.getCustomerEvaluation();
                
                dtm.addRow(row);
            }
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirliners = new javax.swing.JTable();
        btnViewAirliner = new javax.swing.JButton();
        btnNewAirliner = new javax.swing.JButton();
        btnBack3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(893, 598));

        tblAirliners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number Of Flights", "Delay Probability", "Public Evaluation"
            }
        ));
        jScrollPane1.setViewportView(tblAirliners);

        btnViewAirliner.setText("View Airliner");
        btnViewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerActionPerformed(evt);
            }
        });

        btnNewAirliner.setText("New Airliner");
        btnNewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAirlinerActionPerformed(evt);
            }
        });

        btnBack3.setText("Back ->");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(btnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliners.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Airliner airliner = (Airliner) tblAirliners.getValueAt(selectedRow, 0);
            ManageFlightsJPanel panel = new ManageFlightsJPanel(cardSequencePanel, airlinerList, airliner);
            cardSequencePanel.add("ManageFlightsJPanel", panel);
            CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
            layout.next(cardSequencePanel);
        }
    }//GEN-LAST:event_btnViewAirlinerActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnNewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAirlinerActionPerformed
        // TODO add your handling code here:
        CreateNewAirlinerJPanel panel = new CreateNewAirlinerJPanel(cardSequencePanel, airlinerList);
        cardSequencePanel.add("CreateNewAirlinerJPanel", panel);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnNewAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnNewAirliner;
    private javax.swing.JButton btnViewAirliner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAirliners;
    // End of variables declaration//GEN-END:variables
}
