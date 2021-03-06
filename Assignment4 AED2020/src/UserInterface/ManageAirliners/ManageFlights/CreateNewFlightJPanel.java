/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners.ManageFlights;

import Business.Airliner;
import Business.Airplane;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Keyu Liu
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirliners
     */
    private JPanel CardSequenceForFlightJPanel;
    private Airliner airliner;
    public CreateNewFlightJPanel(JPanel CardSequenceForFlightJPanel, Airliner airliner) {
        initComponents();
        this.CardSequenceForFlightJPanel = CardSequenceForFlightJPanel;
        this.airliner = airliner;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPreferredTimeOfDay = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepartureLocation = new javax.swing.JTextField();
        txtArrivalLocation = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtArrivalDate = new javax.swing.JTextField();
        radioBtnMorning = new javax.swing.JRadioButton();
        radioBtnDayTime = new javax.swing.JRadioButton();
        radioBtnEvening = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtAvailableSeatsNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDepartureDate = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(700, 596));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Create New Flight");

        jLabel2.setText("Flight number");

        jLabel3.setText("Preferred time of day");

        jLabel4.setText("Arrival locaiton");

        jLabel5.setText("Departure location");

        txtDepartureLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureLocationActionPerformed(evt);
            }
        });

        btnBack.setText("Cancel");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel6.setText("Arrival Date");

        btnGroupPreferredTimeOfDay.add(radioBtnMorning);
        radioBtnMorning.setText("Morning");

        btnGroupPreferredTimeOfDay.add(radioBtnDayTime);
        radioBtnDayTime.setText("Day time");

        btnGroupPreferredTimeOfDay.add(radioBtnEvening);
        radioBtnEvening.setText("Evening");

        jLabel7.setText("Available seats number");

        jLabel8.setText("Departure Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnMorning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnDayTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnEvening))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(55, 55, 55))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAvailableSeatsNum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartureLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtArrivalLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartureLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrivalLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnMorning)
                    .addComponent(radioBtnEvening)
                    .addComponent(radioBtnDayTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailableSeatsNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartureLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureLocationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceForFlightJPanel.remove(this);
        CardLayout layout = (CardLayout) CardSequenceForFlightJPanel.getLayout();
        layout.previous(CardSequenceForFlightJPanel);        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        //Validation of prefer time
        Airplane airplane = airliner.addAirplane();   
        if(radioBtnMorning.isSelected()){       
            airplane.setPreferTime("Morning");       
        }
        else if(radioBtnDayTime.isSelected()){
            airplane.setPreferTime("Day time");       
        }
        else if(radioBtnEvening.isSelected()){
            airplane.setPreferTime("Evening");
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a prefered time of day for this airplane!", "Warning",JOptionPane.WARNING_MESSAGE); 
        }

        try{
                Integer.parseInt(txtAvailableSeatsNum.getText());
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a number for available seats number!", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        //Get user's input
        String airplaneNum = txtFlightNum.getText();
        String departureLocation = txtDepartureLocation.getText();
        String arrivalLocation = txtArrivalLocation.getText();
        int availableSeatsNum = Integer.parseInt(txtAvailableSeatsNum.getText());
        String arrivalDate = txtArrivalDate.getText();  
        String departureDate = txtDepartureDate.getText();
        
        //Validation of airplane number
        if (airplaneNum == null || airplaneNum.equals("")){
            JOptionPane.showMessageDialog(null, "You should enter at least one airplane number for this plane", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        for(Airplane a : airliner.getAirplaneDirectory()){
            if(airplaneNum == a.getAirplaneNum()){
                JOptionPane.showMessageDialog(null, "This airplane number is already exist!", "Warning",JOptionPane.WARNING_MESSAGE);
                return;           
            }
        }
        
        //validation of depature location and arrival location
        if (departureLocation  == null || departureLocation .equals("")){
            JOptionPane.showMessageDialog(null, "departureLocation  can't be empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (arrivalLocation == null || arrivalLocation.equals("")){
            JOptionPane.showMessageDialog(null, "arrivalLocation can't be empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(arrivalLocation.equals(departureLocation)){
            JOptionPane.showMessageDialog(null, "Arrival location can't same as departure location!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //validation of availabe seat number
        if (txtAvailableSeatsNum.getText() == null ||txtAvailableSeatsNum.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Available Seats Number can't be empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;   
        }
        
        airplane.setAirplaneNum(airplaneNum);
        airplane.setDepartureLocation(departureLocation );
        airplane.setArrivalLocation(arrivalLocation);
        airplane.setArrivalDate(arrivalDate);
        airplane.setDepartureDate(departureDate);
        
        //validation of arrival date and departure date
        if(airplane.isDateUnnormal()){
           JOptionPane.showMessageDialog(null, "Flight arrival time cannot ealier than departure time!!", "Warning", JOptionPane.WARNING_MESSAGE);
           return;
        }
        
        JOptionPane.showMessageDialog(null, "Airplane data successfully created!");

        txtFlightNum.setText("");
        txtDepartureLocation.setText("");
        txtArrivalLocation.setText("");
        txtAvailableSeatsNum.setText("");
        txtArrivalDate.setText("");
        txtArrivalDate.setText("");
        radioBtnMorning.setSelected(false);
        radioBtnDayTime.setSelected(false);
        radioBtnEvening.setSelected(false);
        
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnGroupPreferredTimeOfDay;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioBtnDayTime;
    private javax.swing.JRadioButton radioBtnEvening;
    private javax.swing.JRadioButton radioBtnMorning;
    private javax.swing.JTextField txtArrivalDate;
    private javax.swing.JTextField txtArrivalLocation;
    private javax.swing.JTextField txtAvailableSeatsNum;
    private javax.swing.JTextField txtDepartureDate;
    private javax.swing.JTextField txtDepartureLocation;
    private javax.swing.JTextField txtFlightNum;
    // End of variables declaration//GEN-END:variables
}
