/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package enrollmentsystem;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mercy
 */
public class subjectsform extends javax.swing.JFrame {
        String filterString = ";";
        String stID;
    /**
     * Creates new form subjectsform
     */
    public subjectsform() {
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
        subID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subOde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        subUnits = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        subSchedule = new javax.swing.JTextField();
        savebut = new javax.swing.JButton();
        updatebut = new javax.swing.JButton();
        deletebut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logicOP1 = new javax.swing.JComboBox<>();
        choose1 = new javax.swing.JComboBox<>();
        idFilter = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        snameFilter = new javax.swing.JTextField();
        enameFilter = new javax.swing.JTextField();
        choose2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        codeFilter = new javax.swing.JTextField();
        choose4 = new javax.swing.JComboBox<>();
        choose5 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        unitsFilter = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        schedFilter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Enter Subject ID:");

        subID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Subject Code:");

        subOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOdeActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Subject Description:");

        subDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDescriptionActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Subject Units:");

        subUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUnitsActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Subject Schedule:");

        subSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subScheduleActionPerformed(evt);
            }
        });

        savebut.setText("Save");
        savebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebutActionPerformed(evt);
            }
        });

        updatebut.setText("Update");
        updatebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutActionPerformed(evt);
            }
        });

        deletebut.setText("Delete");
        deletebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));

        jLabel7.setText("Subject ID");

        logicOP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "<=", ">=", "<>" }));
        logicOP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logicOP1ActionPerformed(evt);
            }
        });

        choose1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OR", "AND" }));
        choose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose1ActionPerformed(evt);
            }
        });

        idFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFilterActionPerformed(evt);
            }
        });
        idFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idFilterKeyReleased(evt);
            }
        });

        jLabel8.setText("Subject Description");

        jLabel9.setText("Starts");

        jLabel10.setText("Ends");

        snameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameFilterActionPerformed(evt);
            }
        });
        snameFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snameFilterKeyReleased(evt);
            }
        });

        enameFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enameFilterKeyReleased(evt);
            }
        });

        choose2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OR", "AND" }));
        choose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Subject Code");

        codeFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeFilterKeyReleased(evt);
            }
        });

        choose4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OR", "AND" }));
        choose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose4ActionPerformed(evt);
            }
        });

        choose5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OR", "AND" }));
        choose5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose5ActionPerformed(evt);
            }
        });

        jLabel15.setText("Subject Units");

        unitsFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsFilterActionPerformed(evt);
            }
        });
        unitsFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitsFilterKeyReleased(evt);
            }
        });

        jLabel16.setText("Subject Schedule");

        schedFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedFilterActionPerformed(evt);
            }
        });
        schedFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schedFilterKeyReleased(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(snameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(choose2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choose4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choose5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logicOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(choose1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codeFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(unitsFilter)
                                    .addComponent(schedFilter))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logicOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(snameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(codeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choose4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(unitsFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choose5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(schedFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject ID", "Subject Code", "Subject Description", "Subject Units", "Subject Schedule"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");

        jMenuItem3.setText("Teachers");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Subjects");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subOde, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(subID)))
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(subSchedule)
                                            .addComponent(subUnits, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(savebut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatebut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(subID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(subOde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(subDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(subUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(subSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebut)
                            .addComponent(updatebut)
                            .addComponent(deletebut)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowStudRec(){
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        tblmodel.setRowCount(0);
        
        if(!idFilter.getText().equals("")){
            filterString = " WHERE subID " + logicOP1.getSelectedItem() + idFilter.getText();
        }
        if(!snameFilter.getText().equals("")){
            if(idFilter.getText().equals("")){
                filterString = String.format("WHERE subDescription like '%s%%'", snameFilter.getText());
            }else if(!enameFilter.getText().equals("")){
                filterString += String.format(" %s subDescription like '%s%%'", choose1.getSelectedItem(), snameFilter.getText());
            }else{
                filterString += String.format(" %s subDescription like '%s%%'", choose1.getSelectedItem(), snameFilter.getText());
            }
            //filterString = " WHERE studName like '" + snameFilter.getText() + "%' ";
        }
        if(!enameFilter.getText().equals("")){
            if(idFilter.getText().equals("") && snameFilter.getText().equals("")){
                filterString = String.format("WHERE subDescription like '%%%s'", enameFilter.getText());
            }else if(snameFilter.getText().equals("")){
                filterString += String.format(" %s subDescription like '%%%s'", choose1.getSelectedItem(), enameFilter.getText());
            }else if(!snameFilter.getText().equals("") && idFilter.getText().equals("")){
                filterString += String.format(" AND subDescription like '$$$s'", enameFilter.getText());
            }else{
                filterString += String.format(" AND subDescription like '$$$s'", enameFilter.getText());
            }
            //filterString = " WHERE studName like '%" + enameFilter.getText() + "' ";
        }
        if(!codeFilter.getText().equals("")){
            if(idFilter.getText().equals("") && snameFilter.getText().equals("") && enameFilter.getText().equals("")){
                filterString = String.format("WHERE subOde like '%s%%'", codeFilter.getText());
            }else{
                filterString += String.format(" %s subOde like '%s%%'", choose2.getSelectedItem(), codeFilter.getText());
            }
            //filterString = " WHERE subOde='" + codeFilter.getText() + "' ";
        }
        if(!unitsFilter.getText().equals("")){
            if(idFilter.getText().equals("") && snameFilter.getText().equals("") && enameFilter.getText().equals("") && codeFilter.getText().equals("")){
                filterString = String.format("WHERE subUnits='%s'", unitsFilter.getText());
            }else{
                filterString += String.format(" %s subUnits='%s'", choose4.getSelectedItem(), unitsFilter.getText());
            }
            //filterString = " WHERE studGender='" + unitsFilter.getText() + "' ";
        }
        if(!schedFilter.getText().equals("")){
            if(idFilter.getText().equals("") && snameFilter.getText().equals("") && enameFilter.getText().equals("") && codeFilter.getText().equals("") && unitsFilter.getText().equals("")){
                filterString = String.format("WHERE subSchedule like '%s%%'", schedFilter.getText());
            }else{
                filterString += String.format(" %s subSchedule like '%s%%'", choose5.getSelectedItem(), schedFilter.getText());
            }
            //filterString = " WHERE studYearLvl='" + yearlvlFilter.getText() + "' ";
        }
         
        DBConnect connector = new DBConnect();
        
        try{
            String query = "SELECT * FROM subjects" + filterString;
            connector.rs = connector.st.executeQuery(query);
                while(connector.rs.next()){
                    String id = connector.rs.getString("subID");
                    String name = connector.rs.getString("subOde");
                    String address = connector.rs.getString("subDescription");
                    String course = connector.rs.getString("subUnits");
                    String gender = connector.rs.getString("subSchedule");
                    String[] item = {id,name,address,course,gender};
                    tblmodel.addRow(item);
                }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    private void subOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subOdeActionPerformed

    private void subDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subDescriptionActionPerformed

    private void subScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subScheduleActionPerformed

    private void deletebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutActionPerformed
        subjects subs = new subjects();
        subs.DeleteSubjects(filterString);
        ShowStudRec();
    }//GEN-LAST:event_deletebutActionPerformed

    private void savebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebutActionPerformed
        subjects subs = new subjects();
        subs.AddSubjects(Integer.parseInt(subID.getText()), subOde.getText(), subDescription.getText(), Integer.parseInt(subUnits.getText()), subSchedule.getText());
        ShowStudRec();
    }//GEN-LAST:event_savebutActionPerformed

    private void updatebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutActionPerformed
        subjects subs = new subjects();
        subs.UpdateSubjects(Integer.parseInt(subID.getText()), subOde.getText(), subDescription.getText(), Integer.parseInt(subUnits.getText()), subSchedule.getText());
        ShowStudRec();
    }//GEN-LAST:event_updatebutActionPerformed

    private void subIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subIDActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ShowStudRec();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String name;
        String address;
        String course;
        String gender;
        String year;
        
        int[] selectRow = jTable1.getSelectedRows();
        stID = (String) jTable1.getValueAt(selectRow[0],0);
        subID.setText(stID);
        name = (String) jTable1.getValueAt(selectRow[0],1);
        subOde.setText(name);
        address = (String) jTable1.getValueAt(selectRow[0],2);
        subDescription.setText(address);
        course = (String) jTable1.getValueAt(selectRow[0],3);
        subUnits.setText(course);
        gender = (String) jTable1.getValueAt(selectRow[0],4);
        subSchedule.setText(gender);
    }//GEN-LAST:event_jTable1MouseClicked

    private void schedFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schedFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_schedFilterKeyReleased

    private void unitsFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitsFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_unitsFilterKeyReleased

    private void unitsFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsFilterActionPerformed

    private void choose5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose5ActionPerformed
        ShowStudRec();
    }//GEN-LAST:event_choose5ActionPerformed

    private void choose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose4ActionPerformed
        ShowStudRec();
    }//GEN-LAST:event_choose4ActionPerformed

    private void codeFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_codeFilterKeyReleased

    private void choose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose2ActionPerformed
        ShowStudRec();
    }//GEN-LAST:event_choose2ActionPerformed

    private void enameFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_enameFilterKeyReleased

    private void snameFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_snameFilterKeyReleased

    private void snameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameFilterActionPerformed

    private void idFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFilterKeyReleased
        ShowStudRec();
    }//GEN-LAST:event_idFilterKeyReleased

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose1ActionPerformed
        ShowStudRec();
    }//GEN-LAST:event_choose1ActionPerformed

    private void logicOP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logicOP1ActionPerformed
        ShowStudRec();
    }//GEN-LAST:event_logicOP1ActionPerformed

    private void subUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subUnitsActionPerformed

    private void idFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFilterActionPerformed

    private void schedFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schedFilterActionPerformed

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
            java.util.logging.Logger.getLogger(subjectsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjectsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjectsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjectsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjectsform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choose1;
    private javax.swing.JComboBox<String> choose2;
    private javax.swing.JComboBox<String> choose4;
    private javax.swing.JComboBox<String> choose5;
    private javax.swing.JTextField codeFilter;
    private javax.swing.JButton deletebut;
    private javax.swing.JTextField enameFilter;
    private javax.swing.JTextField idFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> logicOP1;
    private javax.swing.JButton savebut;
    private javax.swing.JTextField schedFilter;
    private javax.swing.JTextField snameFilter;
    private javax.swing.JTextField subDescription;
    private javax.swing.JTextField subID;
    private javax.swing.JTextField subOde;
    private javax.swing.JTextField subSchedule;
    private javax.swing.JTextField subUnits;
    private javax.swing.JTextField unitsFilter;
    private javax.swing.JButton updatebut;
    // End of variables declaration//GEN-END:variables
}
