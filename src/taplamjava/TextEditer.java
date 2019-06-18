package taplamjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TextEditer extends javax.swing.JFrame implements ActionListener {

    private String day;
    private JMenuItem mniNew, mniOpen, mniSave, mniExit, mniRedo, mniUndo;
    private JCheckBox cbwrap;
    private String cur = "", Undo = "", Undo1 = "";
    private int undo = 0;

    public TextEditer() {
        initComponents();
        this.setTitle("Notepad Demo");
        lbinfor.setText("Nguyễn Hoài Danh    ");
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy");

        day = timeFormat.format(today.getTime());
        lbStatusbar.setText(day + "    --  Text editer");
        lbinfor.setHorizontalAlignment(JLabel.RIGHT);

        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaText = new javax.swing.JTextArea();
        lbStatusbar = new javax.swing.JLabel();
        lbinfor = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEdit = new javax.swing.JMenu();
        mnFormat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtaText.setColumns(20);
        txtaText.setRows(5);
        txtaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaTextMouseClicked(evt);
            }
        });
        txtaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaTextKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtaText);

        lbStatusbar.setText("  Text editer");
        lbStatusbar.setToolTipText("Danh's production 2018");

        lbinfor.setText("Nguyễn Hoài Danh");

        menuFile.setText("File");
        menubar.add(menuFile);

        menuEdit.setText("Edit");
        menubar.add(menuEdit);

        mnFormat.setText("Format");
        menubar.add(mnFormat);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbStatusbar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbinfor, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbinfor, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lbStatusbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaTextMouseClicked
        if (evt.getClickCount() == 3) {
            txtaText.selectAll();
        }
        lbinfor.setText("Clicked Position: (" + evt.getPoint().x + "," + evt.getPoint().y + ")");
        lbinfor.setHorizontalAlignment(JLabel.RIGHT);

    }//GEN-LAST:event_txtaTextMouseClicked

    private void txtaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaTextKeyPressed

        lbStatusbar.setText(day + "    --  Typing .");

    }//GEN-LAST:event_txtaTextKeyPressed

    private void txtaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaTextKeyReleased
        Undo=Undo1;Undo1=cur;cur=txtaText.getText();
        lbStatusbar.setText(day + "    --  Typing . . .");
    }//GEN-LAST:event_txtaTextKeyReleased

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
            java.util.logging.Logger.getLogger(TextEditer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditer().setVisible(true);
            }
        });
    }

    public void init() {

        //menu File
        mniNew = new JMenuItem("New");
        mniNew.setMnemonic(KeyEvent.VK_N);
        mniNew.addActionListener(this);
        menuFile.add(mniNew);

        mniOpen = new JMenuItem("Open");
        mniOpen.setMnemonic(KeyEvent.VK_O);
        mniOpen.addActionListener(this);
        menuFile.add(mniOpen);

        mniSave = new JMenuItem("Save");
        mniSave.setMnemonic(KeyEvent.VK_S);
        mniSave.addActionListener(this);
        menuFile.add(mniSave);

        menuFile.addSeparator();
        mniExit = new JMenuItem("Exit");
        mniExit.addActionListener(this);
        mniExit.setMnemonic(KeyEvent.VK_X);
        menuFile.add(mniExit);

        //Menu edit
        mniUndo = new JMenuItem("Undo");
        mniUndo.setToolTipText("Chỉ được Undo 2 lần nhá babe");
        mniUndo.setMnemonic(KeyEvent.VK_U);
        mniUndo.addActionListener(this);
        menuEdit.add(mniUndo);

        mniRedo = new JMenuItem("Redo");
        mniRedo.setMnemonic(KeyEvent.VK_R);
        mniRedo.setToolTipText("Chỉ được Redo 2 lần nhá babe");
        mniRedo.addActionListener(this);
        menuEdit.add(mniRedo);

        //Menu format
        cbwrap = new JCheckBox("Wrap word");
        cbwrap.setToolTipText("Cái này nếu chọn thì viết nó sẽ tự động xuống hàng nha");
        cbwrap.addActionListener(this);
        mnFormat.add(cbwrap);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbStatusbar;
    private javax.swing.JLabel lbinfor;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu mnFormat;
    private javax.swing.JTextArea txtaText;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        //File
        if (e.getSource() == mniNew) {
           
            this.setTitle("Notepad Demo - new.txt");
            new tool().newfile(txtaText);
            return;
        }
        if (e.getSource() == mniOpen) {
            tool t = new tool();
            String file = t.openfile(txtaText);
            this.setTitle("Notepad Demo - " + file);
            //open file return string
            return;
        }
        if (e.getSource() == mniSave) {

            new tool().savefile(txtaText);
            return;
        }
        if (e.getSource() == mniExit) {

            System.exit(0);
        }

        //menu edit
        if (e.getSource() == mniUndo) { //dc phep undo ,redo 2 lan
            if (undo == 2) {
                return;
            }
            undo++;
            if (undo == 1) {
                txtaText.setText(Undo1);
                return;
            }
            if (undo == 2) {
                txtaText.setText(Undo);
            }
        }
        if (e.getSource() == mniRedo) {
            if (undo == 0) {
                return;
            }
            undo--;
            if (undo == 1) {
                txtaText.setText(Undo1);
                return;
            }
            if (undo == 0) {
                txtaText.setText(cur);
            }
        }

        //Check box trong Format
       
        if (e.getSource() == cbwrap ) {
            txtaText.setWrapStyleWord(cbwrap.isSelected());
            txtaText.setLineWrap(cbwrap.isSelected());
            txtaText.setText(txtaText.getText());
        }
    }
}
