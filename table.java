public class table extends javax.swing.JFrame {
    public table() {
        initComponents();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
              String str = jTextField1.getText();
              int num = Integer.parseInt(str);
              int i = 0;
              for(i = 1; i <11; i++)
              {
                  jTextArea1.setText(jTextArea1.getText()+"\n" + num + " *  " + i +  " = " +(num*i));
              }

    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
        jTextArea1.setText("");
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }
