/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;


import java.awt.Color;
import java.util.Date;


/**
 *
 * @author bipin
 */
public class BookingFrame extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public BookingFrame(Hotel hotel, int noRoomsUser[], int noPeople, int nights, Date checkIn, Date checkOut) {
        this.hotel = hotel;
        this.noPeople = noPeople;
        this.nights = nights;
        this.noRoomsBooked = noRoomsUser;
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
        initComponents();
        numberTextField.setName("                     Enter the Aadhar Number / Pan Card Number");
        numberTextField.setForeground(new Color(100,100,100));
        hotelSelected.setText(hotel.getName());
        typeOfRoom.setText(noRoomsUser[0] + " x single room(s) + " + noRoomsUser[1] + " x double room(s)");
        datesLabel.setText(MyDate.toStringInit(checkIn) + " - " + MyDate.toStringInit(checkOut));
        totalCostLabel.setText("\u20B9 " + (hotel.getCostArr()[0] * noRoomsUser[0] + hotel.getCostArr()[1] * noRoomsUser[1]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        optionPane = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        typeOfRoom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aadharLabel = new javax.swing.JRadioButton();
        panLabel = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        hotelSelected = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        datesLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(510, 140, 900, 900));
        setSize(new java.awt.Dimension(900, 900));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Booking Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 36), new java.awt.Color(51, 102, 255))); // NOI18N

        typeOfRoom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        typeOfRoom.setForeground(new java.awt.Color(102, 102, 102));
        typeOfRoom.setText("Type of room");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Rooms Selected                  :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Hotel Selected                     :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Total Amount Payable         :");

        buttonGroup.add(aadharLabel);
        aadharLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aadharLabel.setText("              Aadhar Card");

        buttonGroup.add(panLabel);
        panLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panLabel.setText("               Pan Card");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Please select an ID Proof    :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Enter The Number               :");

        numberTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numberTextField.setText("                     Enter the Aadhar Number / Pan Card Number");
        numberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusLost(evt);
            }
        });

        bookBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        hotelSelected.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hotelSelected.setForeground(new java.awt.Color(102, 102, 102));
        hotelSelected.setText("Hotel");

        totalCostLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalCostLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalCostLabel.setText("Rs. XXXX");

        datesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datesLabel.setForeground(new java.awt.Color(102, 102, 102));
        datesLabel.setText("Rs. XXXX");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Check in -  Check out date  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hotelSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeOfRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aadharLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aadharLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        String proofType = "";
        if(aadharLabel.isSelected()){
            System.out.println("Aadhar");
            proofType+="aadhar";
        }else if(panLabel.isSelected()){
            System.out.println("PAN");
            proofType+="pan";
        }else{
            optionPane.showMessageDialog(this, "Please select an ID proof!");
            return;
        }
        String proofValue = numberTextField.getText();
        if(proofValue.isEmpty() || proofValue.equals(numberTextField.getName())){
            optionPane.showMessageDialog(this, "Please enter the id proof.");
            return;
        }
        Booking b = new Booking(TheHotelFinder.curUser, hotel, noRoomsBooked, noPeople, checkInDate, checkOutDate, proofType, proofValue);
        TheHotelFinder.db.addBooking(b);
        optionPane.showMessageDialog(this, "Hotel Succesfully Booked. Your Reference No: " + b.getBookingRef());
        this.dispose();
    }//GEN-LAST:event_bookBtnActionPerformed

    private void numberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusGained
        // TODO add your handling code here:
        numberTextField.setForeground(new Color(0,0,0));
        numberTextField.setText("");
        
    }//GEN-LAST:event_numberTextFieldFocusGained

    private void numberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusLost
        // TODO add your handling code here:
        if(numberTextField.getText().isEmpty()){
            numberTextField.setForeground(new Color(100,100,100));
            numberTextField.setText(numberTextField.getName());
        }
    }//GEN-LAST:event_numberTextFieldFocusLost


    private Hotel hotel;
    private int noPeople;
    private int nights;
    private int noRoomsBooked[];
    private Date checkInDate;
    private Date checkOutDate;
    private boolean available = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aadharLabel;
    private javax.swing.JButton bookBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel datesLabel;
    private javax.swing.JLabel hotelSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JOptionPane optionPane;
    private javax.swing.JRadioButton panLabel;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JLabel typeOfRoom;
    // End of variables declaration//GEN-END:variables
}
