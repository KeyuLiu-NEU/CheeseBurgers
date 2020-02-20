/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Airplane;
import UserInterface.ManageAirliners.ManageAirlinersJPanel;
import UserInterface.ManageAirliners.ManageFlights.ManageFlightsJPanel;
import UserInterface.Search.SearchFlightJPanel;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Keyu Liu
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TracelAgencyMain
     */
    private AirlinerDirectory airlinerList;
    public TravelAgencyMain() {
        initComponents();
        airlinerList = new AirlinerDirectory();
        readAirlinerCsv();
        readAllFlightsCsv();
    }
    
    public void readAirlinerCsv(){
        try {
            BufferedReader br=null;
            br = new BufferedReader(new FileReader("src/data/Airliners.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] split=line.split(","); 
                Airliner a = airlinerList.addAirliner();
                a.setName(split[0]);
                
                a.setNumOfFlight(Integer.valueOf(split[1]));
                a.setDelayProbability(Float.valueOf(split[2]));
                a.setCustomerEvaluation(split[3]);  
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageAirlinersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManageAirlinersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readAllFlightsCsv(){
        try {
            for(Airliner airliner : airlinerList.getAirlinerDirectory()){
                BufferedReader br=null;
                br = new BufferedReader(new FileReader("src/data/" + airliner.getName() + ".csv"));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] split=line.split(","); 
                    
                    Airplane airplane = airliner.addAirplane();
                    
                    airplane.setAirplaneNum(split[0]);
                    airplane.setDepartureLocation(split[1]);
                    airplane.setArrivalLocation(split[2]);
                    airplane.setPreferTime(split[3]);
                    airplane.setDate(split[4]);
                    airplane.updateSeatsTable(Integer.valueOf(split[5]));

                }
                    
            }
                      
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageFlightsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManageFlightsJPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        AbsoluteJPanel = new javax.swing.JPanel();
        btnManageAirliners = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        CardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbsoluteJPanel.setBackground(new java.awt.Color(0, 153, 153));
        AbsoluteJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageAirliners.setText("Manage Airliners");
        btnManageAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinersActionPerformed(evt);
            }
        });
        AbsoluteJPanel.add(btnManageAirliners, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 40));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        AbsoluteJPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 40));

        jSplitPane1.setLeftComponent(AbsoluteJPanel);

        CardSequenceJPanel.setBackground(new java.awt.Color(0, 153, 153));
        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(CardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        CardSequenceJPanel.add(new SearchFlightJPanel(CardSequenceJPanel, airlinerList));
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnManageAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinersActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        CardSequenceJPanel.add(new ManageAirlinersJPanel(CardSequenceJPanel, airlinerList));
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageAirlinersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbsoluteJPanel;
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JButton btnManageAirliners;
    private javax.swing.JButton btnSearch;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
