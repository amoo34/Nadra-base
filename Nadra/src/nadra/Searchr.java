/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadra;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Dhemob
 */
public class Searchr extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    Statement st=null;
    /**
     * Creates new form Searchr
     */
    public Searchr() {
        this.setUndecorated(true);
        //this.setAlwaysOnTop(true);
        this.setResizable(false);
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        view = new javax.swing.JLabel();
        ff = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        an = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setText("Search By Account");

        jLabel4.setText("Search By CNIC");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Search By First Name");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(view, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ff)
                            .addComponent(cnic)
                            .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
      {
           con=MysqlConnect.ConnectDB();
            String s="select (c.F_Name)Name,a.CNIC,(a.A_ID)Account_Number,a.Expense,a.Payment_Type,(i.Inventory_Title)Title from citizen c,inventory i,account a where  c.CNIC=a.CNIC  and a.A_ID=i.A_ID and c.F_Name=?;";
             pst=con.prepareStatement(s);
            pst.setString(1,ff.getText());
            
            

            rs=pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
      String ss="select i.image_adress  from citizen c,images i where i.CNIC=c.CNIC and c.F_Name=?;";
             pst=con.prepareStatement(ss);
            pst.setString(1,ff.getText());
            
            
            

            rs=pst.executeQuery();
            
       // JOptionPane.showMessageDialog(null,"Done");
      
        while(rs.next())
        {
       
            String path=rs.getString("image_adress");
        JOptionPane.showMessageDialog(null,"Done"); 
            //byte[] img=rs.getBytes(2);
        
           
            ImageIcon image=new ImageIcon(path);
            Image im=image.getImage();
           
                     
                  
               
            Image myImg=im.getScaledInstance(view.getWidth(), view.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon neImage=new ImageIcon(myImg);
            
            view.setIcon(neImage);
            
       }   
                  
            
          
      }catch(Exception sms)
      {
          
      }


            
            
          
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          
                try
      {
           con=MysqlConnect.ConnectDB();
            String s="select (c.F_Name)Name,a.CNIC,(a.A_ID)Account_Number,a.Expense,a.Payment_Type,(i.Inventory_Title)Title from citizen c,inventory i,account a where  c.CNIC=a.CNIC  and a.A_ID=i.A_ID and c.CNIC=?;";
             pst=con.prepareStatement(s);
            pst.setString(1,cnic.getText());
            
            

            rs=pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
      String ss="select image_adress from images where CNIC=?";
             pst=con.prepareStatement(ss);
            pst.setString(1,cnic.getText());
            
            
            

            rs=pst.executeQuery();
            
       // JOptionPane.showMessageDialog(null,"Done");
      
        while(rs.next())
        {
       
            String path=rs.getString("image_adress");
        JOptionPane.showMessageDialog(null,"Done"); 
            //byte[] img=rs.getBytes(2);
        
           
            ImageIcon image=new ImageIcon(path);
            Image im=image.getImage();
           
                     
                  
               
            Image myImg=im.getScaledInstance(view.getWidth(), view.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon neImage=new ImageIcon(myImg);
            
            view.setIcon(neImage);
            
       }   
            
                  
            
          
      }catch(Exception ss)
      {
          
      }


        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                try
      {
           con=MysqlConnect.ConnectDB();
            String s="select (c.F_Name)Name,c.CNIC,(a.A_ID)Account_Number,a.Expense,a.Payment_Type,(i.Inventory_Title)Title from citizen c, account a ,Inventory i where c.CNIC=a.CNIC and a.A_ID=? and a.A_ID=i.A_ID;    ";
             pst=con.prepareStatement(s);
            pst.setString(1,an.getText());
            
            

            rs=pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
      String ss="select i.image_adress  from account c,images i where i.CNIC=c.CNIC and c.A_ID=?; ";
             pst=con.prepareStatement(ss);
            pst.setString(1,an.getText());
            
            
            

            rs=pst.executeQuery();
            
       // JOptionPane.showMessageDialog(null,"Done");
      
        while(rs.next())
        {
       
            String path=rs.getString("image_adress");
        JOptionPane.showMessageDialog(null,"Done"); 
            //byte[] img=rs.getBytes(2);
        
           
            ImageIcon image=new ImageIcon(path);
            Image im=image.getImage();
           
                     
                  
               
            Image myImg=im.getScaledInstance(view.getWidth(), view.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon neImage=new ImageIcon(myImg);
            
            view.setIcon(neImage);
            
       }   
            
                  
            
          
      }catch(Exception ss)
      {
          
      }
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Searchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField an;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField ff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
