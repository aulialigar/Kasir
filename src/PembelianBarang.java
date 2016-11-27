
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkomm
 */
public class PembelianBarang extends javax.swing.JFrame {

    /**
     * Creates new form PembelianBarang
     */
    public PembelianBarang() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HB = new javax.swing.JTextField();
        NB = new javax.swing.JTextField();
        JB = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pembelian Barang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 140, 230, 20);

        jLabel2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 210, 120, 10);

        jLabel3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah Barang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 260, 120, 20);

        jLabel4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 310, 120, 20);

        HB.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        getContentPane().add(HB);
        HB.setBounds(20, 330, 190, 30);

        NB.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        getContentPane().add(NB);
        NB.setBounds(20, 230, 190, 30);

        JB.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        getContentPane().add(JB);
        JB.setBounds(20, 280, 190, 30);

        btnTambah.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(0, 0, 102));
        btnTambah.setText("Tambah Item");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(20, 380, 190, 30);

        btnOK.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 0, 102));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(80, 420, 80, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Jumlah Barang", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 210, 450, 240);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pembayaran.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 700, 470);

        setBounds(0, 0, 715, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String nama = NB.getText();
        int jumlah = Integer.parseInt(HB.getText());
        int harga = Integer.parseInt(JB.getText());
        
        new CetakStruk(nama, harga, jumlah).setVisible(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String nama = NB.getText();
        int jumlah = Integer.parseInt(JB.getText());
        int harga = Integer.parseInt(HB.getText());
        int total = jumlah*harga;
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new String[]{NB.getText(),
            JB.getText(),HB.getText()+" X "+jumlah+" = "+total});
        
        NB.setText("");
        JB.setText("");
        HB.setText("");
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(PembelianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembelianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembelianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembelianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembelianBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HB;
    private javax.swing.JTextField JB;
    private javax.swing.JTextField NB;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
