/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import business.Airlines;
import business.Airplane;
import business.Flight;
import business.TravelAgency;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheetal Sekhar
 */
public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBestFlightDealsJPanel
     */
    
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;
    public ViewBestFlightDealsJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.travelAgency=travelAgency;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFieldPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldSource = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldDepartureDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        scrollPaneViewBestFlights = new javax.swing.JScrollPane();
        tblViewBestFlights = new javax.swing.JTable();
        btnSelectBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFieldDestination = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Book Flights");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        txtFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldPriceKeyPressed(evt);
            }
        });
        add(txtFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 83, 130, -1));

        jLabel2.setText("Price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 86, -1, -1));

        jLabel3.setText("Source ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 117, -1, -1));

        txtFieldSource.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldSourceKeyPressed(evt);
            }
        });
        add(txtFieldSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 114, 130, -1));

        jLabel4.setText("Destination");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 148, -1, -1));
        add(txtFieldDepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 130, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 220, 90, -1));

        tblViewBestFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Source", "Destination", "Departure Time", "Airliner", "Seats Available", "Price", "Serial number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneViewBestFlights.setViewportView(tblViewBestFlights);
        if (tblViewBestFlights.getColumnModel().getColumnCount() > 0) {
            tblViewBestFlights.getColumnModel().getColumn(0).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(1).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(2).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(3).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(4).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(5).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(6).setResizable(false);
            tblViewBestFlights.getColumnModel().getColumn(7).setResizable(false);
        }

        add(scrollPaneViewBestFlights, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 870, 134));

        btnSelectBook.setText("Select And Book");
        btnSelectBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectBookActionPerformed(evt);
            }
        });
        add(btnSelectBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel6.setText("Departure Date:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        txtFieldDestination.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldDestinationKeyPressed(evt);
            }
        });
        add(txtFieldDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 145, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectBookActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = tblViewBestFlights.getSelectedRow();
        
        if(selectedrow <0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        else {
            
        Flight flight = (Flight) tblViewBestFlights.getValueAt(selectedrow, 0);
        Airlines airlines1 = (Airlines)tblViewBestFlights.getValueAt(selectedrow, 4);
        Airplane airplane = (Airplane)tblViewBestFlights.getValueAt(selectedrow, 7);
        
        BookCustomersJPanel panel = new BookCustomersJPanel(userProcessContainer, travelAgency,flight,airplane,airlines1);
        userProcessContainer.add("BookCustomersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
        }
    }//GEN-LAST:event_btnSelectBookActionPerformed

    public void populateTable(){
        
                       try{ 
        String source = txtFieldSource.getText();
        String destination = txtFieldDestination.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String departureTime = txtFieldDepartureDate.getText();
        int price = Integer.parseInt(txtFieldPrice.getText());
        
        DefaultTableModel dtm = (DefaultTableModel)tblViewBestFlights.getModel();
        dtm.setRowCount(0);
        
        
        for(Airlines airlines : travelAgency.getAirlineDirectory().getAirlinesList()){
            
            for(Airplane airplane : airlines.getAirplaneFleet().getAirplaneFleet()){
                
                for(Flight flight : airplane.getFlight()){
                     
                   String departureDate = dateFormat.format(flight.getDepartureTime());
            
       
        
        if (flight.getSource().equalsIgnoreCase(source) || flight.getDestination().equalsIgnoreCase(destination) ||(departureDate.equalsIgnoreCase(departureTime)) || flight.getPrice() <= price){
                
            Object row[] = new Object[8];
            row[0] = flight;
            row[4] = airlines;
            row[1] = flight.getSource();
            row[2] = flight.getDestination();
            row[3] = flight.getDepartureTime();
            row[5] = (airplane.getNumOfSeats() - flight.getSeat().size());
            row[6] = flight.getPrice();
            row[7] = airplane;
            
            dtm.addRow(row);
                
                
            }
        }
        }
        }
        if(dtm.getRowCount()<1){
            
            JOptionPane.showMessageDialog(null, "Flights are not Available");
        
       
        }
       }

       catch(NumberFormatException ne){
           
           JOptionPane.showMessageDialog(null, "Enter Integer Value for price");
       }
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
         populateTable();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFieldPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldPriceKeyPressed
        // TODO add your handling code here:
        
     /*  char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||
         (c == evt.VK_BACK_SPACE) ||
         (c == evt.VK_DELETE))) {
        
       JOptionPane.showMessageDialog(null, "Enter Valid Numbers");
          txtFieldPrice.setText("");
      }*/
    }//GEN-LAST:event_txtFieldPriceKeyPressed

    private void txtFieldSourceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldSourceKeyPressed
        // TODO add your handling code here:
        
     /* char c = evt.getKeyChar();
      if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'z') || (c == evt.VK_CAPS_LOCK) || (c == evt.VK_SPACE)||
         (c == evt.VK_BACK_SPACE) ||
         (c == evt.VK_DELETE))) {
        
       JOptionPane.showMessageDialog(null, "Enter Valid Source Name");
          txtFieldSource.setText("");
      }*/
	  
    }//GEN-LAST:event_txtFieldSourceKeyPressed

    private void txtFieldDestinationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldDestinationKeyPressed
        // TODO add your handling code here:
     /* char c = evt.getKeyChar();
      if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'z') || (c == evt.VK_CAPS_LOCK) || (c == evt.VK_SPACE)||
         (c == evt.VK_BACK_SPACE) ||
         (c == evt.VK_DELETE))) {
        
       JOptionPane.showMessageDialog(null, "Enter Valid Destination Name");
          txtFieldDestination.setText("");
      }*/
	  
        
        
    }//GEN-LAST:event_txtFieldDestinationKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane scrollPaneViewBestFlights;
    private javax.swing.JTable tblViewBestFlights;
    private javax.swing.JTextField txtFieldDepartureDate;
    private javax.swing.JTextField txtFieldDestination;
    private javax.swing.JTextField txtFieldPrice;
    private javax.swing.JTextField txtFieldSource;
    // End of variables declaration//GEN-END:variables
}
