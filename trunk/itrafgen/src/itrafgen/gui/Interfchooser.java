/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Interfchooser.java
 *
 * Created on 9 janv. 2009, 16:12:52
 */

package itrafgen.gui;

import itrafgen.ItrafgenApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import org.jdesktop.application.Application;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 *
 * @author sebastienhoerner
 */
public class Interfchooser extends javax.swing.JFrame {
    public String[] strings;
    /** Creates new form Interfchooser */
    public Interfchooser() {
       File entryFile = new File("protocol/Ethernet.xml");

        if(!entryFile.exists()){
            System.out.println("pas de dossier protocol !");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AttentionBox dialog = new AttentionBox(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setLocation(
        (screenSize.width-dialog.getWidth())/2,
        (screenSize.height-dialog.getHeight())/2
        );

                dialog.getJLabel1().setText("Pas de dossier protocol, copier le dossier et redemarrez");
                dialog.setVisible(true);
            }

        });
        }
        else{

        initComponents();
        if(ItrafgenApp.devices.length==0){
            System.out.println("redemarrer en root");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AttentionBox dialog = new AttentionBox(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setLocation(
        (screenSize.width-dialog.getWidth())/2,
        (screenSize.height-dialog.getHeight())/2
        );
                dialog.setVisible(true);
            }
        });
        }
        strings = new String[ItrafgenApp.devices.length];
        for(int i = 0;i<ItrafgenApp.devices.length;i++){
            strings[i] = ItrafgenApp.devices[i].name;

        }
        jList1.setModel(new javax.swing.AbstractListModel() {

            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
         jList2.setModel(new javax.swing.AbstractListModel() {

            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList();
        jScrollPane2 = new JScrollPane();
        jList2 = new JList();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jSeparator1 = new JSeparator();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        ResourceMap resourceMap = Application.getInstance(ItrafgenApp.class).getContext().getResourceMap(Interfchooser.class);
        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jList1.setModel(new AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setName("jList1"); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jList2.setModel(new AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.setName("jList2"); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jSeparator1.setOrientation(SwingConstants.VERTICAL);
        jSeparator1.setName("jSeparator1"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(GroupLayout.LEADING)
                            .add(jScrollPane1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2))
                        .addPreferredGap(LayoutStyle.RELATED, 29, Short.MAX_VALUE)
                        .add(jSeparator1, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(GroupLayout.LEADING)
                            .add(jScrollPane2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)))
                    .add(GroupLayout.TRAILING, jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(13, 13, 13)
                        .add(layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jLabel3))
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(GroupLayout.LEADING)
                            .add(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .add(jSeparator1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hide();
        ItrafgenApp.intemission = ItrafgenApp.devices[jList1.getSelectedIndex()];
    	ItrafgenApp.intreception = ItrafgenApp.devices[jList2.getSelectedIndex()];
        ItrafgenApp.launch(ItrafgenApp.class, null);

    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JList jList1;
    private JList jList2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}