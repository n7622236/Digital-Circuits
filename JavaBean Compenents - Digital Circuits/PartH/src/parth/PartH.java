/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parth;

/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class PartH extends javax.swing.JFrame {

    /**
     * Creates new form PartH
     */
    public PartH() {
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

        circuitBoard1 = new Digital.CircuitBoard();
        decimalInput1 = new Digital.DecimalInput();
        decimalInput2 = new Digital.DecimalInput();
        decimalOutput1 = new Digital.DecimalOutput();
        bitAdderComponent1 = new Digital.BitAdderComponent();
        bitAdderComponent2 = new Digital.BitAdderComponent();
        bitAdderComponent3 = new Digital.BitAdderComponent();
        bitAdderComponent4 = new Digital.BitAdderComponent();
        lED1 = new Digital.LED();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        circuitBoard1.setLayout(null);
        circuitBoard1.add(decimalInput1);
        decimalInput1.setBounds(30, 90, 72, 44);
        circuitBoard1.add(decimalInput2);
        decimalInput2.setBounds(30, 210, 72, 44);

        decimalOutput1.setInput0(bitAdderComponent1.getOutput0());
        decimalOutput1.setInput1(bitAdderComponent2.getOutput0());
        decimalOutput1.setInput2(bitAdderComponent3.getOutput0());
        decimalOutput1.setInput3(bitAdderComponent4.getOutput0());

        javax.swing.GroupLayout decimalOutput1Layout = new javax.swing.GroupLayout(decimalOutput1);
        decimalOutput1.setLayout(decimalOutput1Layout);
        decimalOutput1Layout.setHorizontalGroup(
            decimalOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        decimalOutput1Layout.setVerticalGroup(
            decimalOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        circuitBoard1.add(decimalOutput1);
        decimalOutput1.setBounds(440, 90, 64, 44);

        bitAdderComponent1.setInput1(decimalInput1.getOutput0());
        bitAdderComponent1.setInput2(decimalInput2.getOutput0());

        javax.swing.GroupLayout bitAdderComponent1Layout = new javax.swing.GroupLayout(bitAdderComponent1);
        bitAdderComponent1.setLayout(bitAdderComponent1Layout);
        bitAdderComponent1Layout.setHorizontalGroup(
            bitAdderComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent1Layout.setVerticalGroup(
            bitAdderComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        circuitBoard1.add(bitAdderComponent1);
        bitAdderComponent1.setBounds(160, 70, 48, 31);

        bitAdderComponent2.setInput0(bitAdderComponent1.getOutput1());
        bitAdderComponent2.setInput1(decimalInput1.getOutput1());
        bitAdderComponent2.setInput2(decimalInput2.getOutput1());

        javax.swing.GroupLayout bitAdderComponent2Layout = new javax.swing.GroupLayout(bitAdderComponent2);
        bitAdderComponent2.setLayout(bitAdderComponent2Layout);
        bitAdderComponent2Layout.setHorizontalGroup(
            bitAdderComponent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent2Layout.setVerticalGroup(
            bitAdderComponent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        circuitBoard1.add(bitAdderComponent2);
        bitAdderComponent2.setBounds(230, 110, 48, 31);

        bitAdderComponent3.setInput0(bitAdderComponent2.getOutput1());
        bitAdderComponent3.setInput1(decimalInput1.getOutput2());
        bitAdderComponent3.setInput2(decimalInput2.getOutput2());

        javax.swing.GroupLayout bitAdderComponent3Layout = new javax.swing.GroupLayout(bitAdderComponent3);
        bitAdderComponent3.setLayout(bitAdderComponent3Layout);
        bitAdderComponent3Layout.setHorizontalGroup(
            bitAdderComponent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent3Layout.setVerticalGroup(
            bitAdderComponent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        circuitBoard1.add(bitAdderComponent3);
        bitAdderComponent3.setBounds(290, 150, 48, 31);

        bitAdderComponent4.setInput0(bitAdderComponent3.getOutput1());
        bitAdderComponent4.setInput1(decimalInput1.getOutput3());
        bitAdderComponent4.setInput2(decimalInput2.getOutput3());

        javax.swing.GroupLayout bitAdderComponent4Layout = new javax.swing.GroupLayout(bitAdderComponent4);
        bitAdderComponent4.setLayout(bitAdderComponent4Layout);
        bitAdderComponent4Layout.setHorizontalGroup(
            bitAdderComponent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent4Layout.setVerticalGroup(
            bitAdderComponent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        circuitBoard1.add(bitAdderComponent4);
        bitAdderComponent4.setBounds(360, 190, 48, 31);

        lED1.setInput(bitAdderComponent4.getOutput1());

        javax.swing.GroupLayout lED1Layout = new javax.swing.GroupLayout(lED1);
        lED1.setLayout(lED1Layout);
        lED1Layout.setHorizontalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED1Layout.setVerticalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard1.add(lED1);
        lED1.setBounds(460, 220, 30, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(circuitBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(circuitBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PartH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartH().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Digital.BitAdderComponent bitAdderComponent1;
    private Digital.BitAdderComponent bitAdderComponent2;
    private Digital.BitAdderComponent bitAdderComponent3;
    private Digital.BitAdderComponent bitAdderComponent4;
    private Digital.CircuitBoard circuitBoard1;
    private Digital.DecimalInput decimalInput1;
    private Digital.DecimalInput decimalInput2;
    private Digital.DecimalOutput decimalOutput1;
    private Digital.LED lED1;
    // End of variables declaration//GEN-END:variables
}