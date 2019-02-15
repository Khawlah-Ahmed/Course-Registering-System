
package AlgorithmProject;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Khawla
 */
public class CycleFreePlan extends javax.swing.JFrame {  
    DefaultTableModel model;
    DefaultTableModel model2;
    Graph graph;
    public CycleFreePlan(Graph g) {
        this.graph = g;
        initComponents();
        TableColumnModel column = neededCourses.getColumnModel();
        column.getColumn(0).setPreferredWidth(30);
        column.getColumn(1).setPreferredWidth(100);
        column.getColumn(2).setPreferredWidth(30);
        model = (DefaultTableModel) neededCourses.getModel();      
        neededCourses.setRowHeight(30);
        column = semesterPlan.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model2 = (DefaultTableModel) semesterPlan.getModel();      
        semesterPlan.setRowHeight(30);
    }
    int totalCredits;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        semcb = new javax.swing.JComboBox<>();
        yearcb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        semesterPlan = new javax.swing.JTable();
        totalCredit = new javax.swing.JLabel();
        semNo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        neededCourses = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(247, 241, 222));
        jTabbedPane1.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(242, 237, 223));

        jLabel1.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel1.setText("Select year");

        semcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester" }));
        semcb.setMinimumSize(new java.awt.Dimension(108, 25));
        semcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semcbActionPerformed(evt);
            }
        });

        yearcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));
        yearcb.setMinimumSize(new java.awt.Dimension(108, 20));
        yearcb.setPreferredSize(new java.awt.Dimension(108, 25));
        yearcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcbActionPerformed(evt);
            }
        });

        jButton1.setText("Display Courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel2.setText("Select semester");

        jPanel4.setBackground(new java.awt.Color(242, 237, 223));
        jPanel4.setLayout(null);

        semesterPlan.setAutoCreateRowSorter(true);
        semesterPlan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan.setFillsViewportHeight(true);
        semesterPlan.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(semesterPlan);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 580, 200);

        totalCredit.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jPanel4.add(totalCredit);
        totalCredit.setBounds(400, 10, 190, 20);

        semNo.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jPanel4.add(semNo);
        semNo.setBounds(120, 10, 270, 20);

        jLabel8.setBackground(java.awt.SystemColor.controlDkShadow);
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Study Plan for CS Department");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearcb, 0, 122, Short.MAX_VALUE)
                    .addComponent(semcb, 0, 122, Short.MAX_VALUE))
                .addGap(170, 170, 170)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(yearcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semcb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1)))
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("View Study Plan", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 235, 217));

        jLabel9.setFont(new java.awt.Font("Century", 0, 19)); // NOI18N
        jLabel9.setText("Cilck here to make changes to the plan");

        jButton2.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jButton2.setText("Make Changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton2))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Make Some Changes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(240, 236, 223));
        jPanel3.setPreferredSize(new java.awt.Dimension(650, 505));

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Show what courses are needed to be complete<br>-------before registering a desired course--------</html>");

        jComboBox3.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jComboBox3.setMaximumRowCount(6);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(graph.courseNames()));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel5.setText("Choose a desired course");

        jLabel6.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel6.setText("The course/s needed to be complete:");

        neededCourses.setAutoCreateRowSorter(true);
        neededCourses.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        neededCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours"
            }
        ));
        neededCourses.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        neededCourses.setFillsViewportHeight(true);
        neededCourses.setPreferredSize(new java.awt.Dimension(255, 0));
        neededCourses.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(neededCourses);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6))))
                            .addGap(87, 87, 87))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Show Needed Courses", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semcbActionPerformed

    private void yearcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Integer> topSort = new ArrayList<>();
        int[] topArray = graph.topologicalSort();
        for(int i=0 ; i<topArray.length ; i++)
            topSort.add(topArray[i]);
        Graph.Semester sem[]=graph.createSemesters(topSort);
        model2.setRowCount(0);
        semNo.setText("");
        totalCredit.setText("");
        if(yearcb.getSelectedIndex()==0 && semcb.getSelectedIndex() == 0){
        for (Course crs : sem[0].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[0].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[0].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==0 && semcb.getSelectedIndex() == 1){
        for (Course crs : sem[1].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[1].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[1].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==1 && semcb.getSelectedIndex() == 0){
        for (Course crs : sem[2].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[2].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[2].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==1 && semcb.getSelectedIndex() == 1){
        for (Course crs : sem[3].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[3].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[3].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==2 && semcb.getSelectedIndex() == 0){
        for (Course crs : sem[4].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[4].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[4].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==2 && semcb.getSelectedIndex() == 1){
        for (Course crs : sem[5].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[5].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[5].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==3 && semcb.getSelectedIndex() == 0){
        for (Course crs : sem[6].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[6].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[6].totalCredit);
        }
        
        else if(yearcb.getSelectedIndex()==3 && semcb.getSelectedIndex() == 1){
        for (Course crs : sem[7].semCourses){                                
            model2.addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)}); 
        }
        semNo.setText("First Semester"+" ("+sem[7].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[7].totalCredit);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        model.setRowCount(0);
        jLabel7.setText("");
        jTextArea1.setText("");
        for(String needed : graph.neededCourses(graph.adjLists[jComboBox3.getSelectedIndex()].course.code)){
            jTextArea1.append(" --> " + graph.adjLists[graph.searchCourse(needed)].course.name);
            model.addRow(new Object[]{graph.adjLists[graph.searchCourse(needed)].course.code,
                graph.adjLists[graph.searchCourse(needed)].course.name,
                graph.adjLists[graph.searchCourse(needed)].course.credit}); 
        }       
        if(model.getRowCount()==0)
            jLabel7.setText("No courses are needed to register!");
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StudyPlan studyPlan = new StudyPlan(graph);
        studyPlan.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        studyPlan.setExtendedState(JFrame.MAXIMIZED_BOTH);
        studyPlan.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(CycleFreePlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CycleFreePlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CycleFreePlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CycleFreePlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CycleFreePlan(g).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable neededCourses;
    private javax.swing.JLabel semNo;
    private javax.swing.JComboBox<String> semcb;
    private javax.swing.JTable semesterPlan;
    private javax.swing.JLabel totalCredit;
    private javax.swing.JComboBox<String> yearcb;
    // End of variables declaration//GEN-END:variables
}
