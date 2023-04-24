
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hhe80
 */
public class Room extends javax.swing.JFrame {

    /**
     * Creates new form Room
     */
    public Room() {
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

        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Room_type = new javax.swing.JTextField();
        PatientId = new javax.swing.JTextField();
        Room_status1 = new javax.swing.JTextField();
        Room_Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Room_Data_Delete = new javax.swing.JButton();
        Room_Table_Show = new javax.swing.JButton();
        Room_back4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Room_Charge = new javax.swing.JTextField();
        Room_No = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Room_Type");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Room_No");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Status");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Room");

        PatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIdActionPerformed(evt);
            }
        });

        Room_status1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_status1ActionPerformed(evt);
            }
        });

        Room_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Room_Add.setText("Add");
        Room_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_AddActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Room_Data_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Room_Data_Delete.setText("Delete");
        Room_Data_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_Data_DeleteActionPerformed(evt);
            }
        });

        Room_Table_Show.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Room_Table_Show.setText("All Room");
        Room_Table_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_Table_ShowActionPerformed(evt);
            }
        });

        Room_back4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Room_back4.setText("Back");
        Room_back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_back4ActionPerformed(evt);
            }
        });

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room_No", "PatientId", "Room-Type", "Status", "Room_Charge"
            }
        ));
        jScrollPane1.setViewportView(jTable10);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Room_Charge");

        Room_Charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_ChargeActionPerformed(evt);
            }
        });

        Room_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_NoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("PatientID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)
                        .addGap(175, 175, 175))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(Room_Charge, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Room_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Room_type, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(53, 53, 53)
                                .addComponent(Room_No, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Room_Table_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_back4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_Data_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Room_back4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Room_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(Room_No, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room_Data_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_type, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room_Table_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Room_Charge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIdActionPerformed

    private void Room_status1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_status1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room_status1ActionPerformed

    private void Room_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_AddActionPerformed
        // TODO add your handling code here:
        
              String Room_Id = Room_No.getText();
              String P_Id = PatientId.getText();
              String Room_Type = Room_type.getText();
              String Room_Status = Room_status1.getText();
              String Room_charge = Room_Charge.getText();
              
                 
                 
               try {
              
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/HDS?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "hoangluan");
   
   
         
             
       String  sqlquery = "INSERT INTO Room(Room_No,PatientID ,Room_Type,Room_Status,Room_Charge) VALUES ('"+Room_Id+"','"+P_Id+"','"+Room_Type+"','"+Room_Status +"','"+Room_charge+"')";
         
         PreparedStatement pst = connection.prepareStatement(sqlquery);
        
         pst.execute();
         JOptionPane.showMessageDialog(null, "Registration Complete");
        
      
        
         
        
       ////////////////Clear The Text Field
        
        Room_No.setText("");
        PatientId.setText("");
        Room_type.setText("");
        Room_status1.setText("");
        Room_Charge.setText("");
        
       
       
         // this.hide();
       // new login().show();     
             
       
        } catch (Exception e) {
            e.printStackTrace();
        }  
                     
              
             
        
        
        
    }//GEN-LAST:event_Room_AddActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
            
        PatientId.setText("");
        Room_type.setText("");
        Room_status1.setText("");
        Room_Charge.setText("");
        
        
    }//GEN-LAST:event_ClearActionPerformed

    private void Room_Data_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_Data_DeleteActionPerformed
        // TODO add your handling code here:
        
        
         try {

             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/HDS?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "hoangluan");
            int row = jTable10.getSelectedRow();
            String value = Room_No.getText();
            String  sql = "DELETE FROM Room WHERE Room_No ="+value;
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable10.getModel();
          model.setRowCount(0);
         JOptionPane.showMessageDialog(null, "DELETE Complete");
            } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_Room_Data_DeleteActionPerformed

    private void Room_Table_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_Table_ShowActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel model = (DefaultTableModel)jTable10.getModel();
          model.setRowCount(0);
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/HDS?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "hoangluan");

            Statement st = connection.createStatement();
            String sql = "select *from Room";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){

              String Room_Id = String.valueOf(rs.getString("Room_No"));
              String P_id =  String.valueOf(rs.getString("PatientID"));
              String Room_Type = String.valueOf(rs.getString("Room_Type"));
              String Room_Status = String.valueOf(rs.getString("Room_Status"));
              String Room_Charge = String.valueOf(rs.getString("Room_Charge"));
              

                String tbData[] = {Room_Id ,P_id,Room_Type,Room_Status,Room_Charge};

                DefaultTableModel tblModel = (DefaultTableModel)jTable10.getModel();

                tblModel.addRow(tbData);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

            
        
    }//GEN-LAST:event_Room_Table_ShowActionPerformed

    private void Room_back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_back4ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        new Admin().show();
    }//GEN-LAST:event_Room_back4ActionPerformed

    private void Room_ChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_ChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room_ChargeActionPerformed

    private void Room_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room_NoActionPerformed

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField PatientId;
    private javax.swing.JButton Room_Add;
    private javax.swing.JTextField Room_Charge;
    private javax.swing.JButton Room_Data_Delete;
    private javax.swing.JTextField Room_No;
    private javax.swing.JButton Room_Table_Show;
    private javax.swing.JButton Room_back4;
    private javax.swing.JTextField Room_status1;
    private javax.swing.JTextField Room_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable10;
    // End of variables declaration//GEN-END:variables
}
