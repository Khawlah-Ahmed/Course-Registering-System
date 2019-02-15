package AlgorithmProject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Khawla
 */
public class StudyPlan extends javax.swing.JFrame {
    DefaultTableModel model[] = new DefaultTableModel[8];

    Graph graph;
    public Graph.Semester sem[];
    public StudyPlan(Graph g) {
        this.graph = g;
        initComponents();
        TableColumnModel column = semesterPlan.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[0] = (DefaultTableModel) semesterPlan.getModel();      
        semesterPlan.setRowHeight(20); 
        column = semesterPlan1.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[1] = (DefaultTableModel) semesterPlan1.getModel();      
        semesterPlan1.setRowHeight(20);

        column = semesterPlan2.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[2] = (DefaultTableModel) semesterPlan2.getModel();      
        semesterPlan2.setRowHeight(20);

        column = semesterPlan3.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[3] = (DefaultTableModel) semesterPlan3.getModel();      
        semesterPlan3.setRowHeight(20);

        column = semesterPlan4.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[4] = (DefaultTableModel) semesterPlan4.getModel();      
        semesterPlan4.setRowHeight(20);
        
        column = semesterPlan5.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[5] = (DefaultTableModel) semesterPlan5.getModel();      
        semesterPlan5.setRowHeight(20);

        column = semesterPlan6.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[6] = (DefaultTableModel) semesterPlan6.getModel();      
        semesterPlan6.setRowHeight(20);
        
        column = semesterPlan7.getColumnModel();
        column.getColumn(0).setPreferredWidth(15);
        column.getColumn(1).setPreferredWidth(180);
        column.getColumn(2).setPreferredWidth(15);
        column.getColumn(3).setPreferredWidth(15);
        model[7] = (DefaultTableModel) semesterPlan7.getModel();      
        semesterPlan7.setRowHeight(20);
        
        
        ArrayList<Integer> topSort = new ArrayList<>();
        int[] topArray = graph.topologicalSort();
        for(int i=0 ; i<topArray.length ; i++)
            topSort.add(topArray[i]);
        sem = graph.createSemesters(topSort);
        
        for (Course crs : sem[0].semCourses)                                
            model[0].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
            
        for (Course crs : sem[1].semCourses)                               
            model[1].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
            
        for (Course crs : sem[2].semCourses)                                
            model[2].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
        for (Course crs : sem[3].semCourses)                                
            model[3].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
        for (Course crs : sem[4].semCourses)                                
            model[4].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
        for (Course crs : sem[5].semCourses)                                
            model[5].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
        for (Course crs : sem[6].semCourses)                                
            model[6].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
        for (Course crs : sem[7].semCourses)                                
            model[7].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
        
    
        semNo.setText("First Semester"+" ("+sem[0].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[0].totalCredit);
        
        semNo1.setText("Second Semester"+" ("+sem[1].semCourses.size()+" Courses)");
        totalCredit1.setText("Total credits:"+ sem[1].totalCredit);
        
        semNo2.setText("Third Semester"+" ("+sem[2].semCourses.size()+" Courses)");
        totalCredit2.setText("Total credits:"+ sem[2].totalCredit);
        
        semNo3.setText("Fourth Semester"+" ("+sem[3].semCourses.size()+" Courses)");
        totalCredit3.setText("Total credits:"+ sem[3].totalCredit);
        
        semNo4.setText("Fifth Semester"+" ("+sem[4].semCourses.size()+" Courses)");
        totalCredit4.setText("Total credits:"+ sem[4].totalCredit);
        
        semNo5.setText("Sixth Semester"+" ("+sem[5].semCourses.size()+" Courses)");
        totalCredit5.setText("Total credits:"+ sem[5].totalCredit);
        
        semNo6.setText("Seventh Semester"+" ("+sem[6].semCourses.size()+" Courses)");
        totalCredit6.setText("Total credits:"+ sem[6].totalCredit);
        
        semNo7.setText("Eighth Semester"+" ("+sem[7].semCourses.size()+" Courses)");
        totalCredit7.setText("Total credits:"+ sem[7].totalCredit);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        semesterPlan = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        semesterPlan1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        semesterPlan2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        semesterPlan3 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        semesterPlan4 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        semesterPlan5 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        semesterPlan6 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        semesterPlan7 = new javax.swing.JTable();
        totalCredit = new javax.swing.JLabel();
        semNo = new javax.swing.JLabel();
        totalCredit1 = new javax.swing.JLabel();
        semNo1 = new javax.swing.JLabel();
        totalCredit2 = new javax.swing.JLabel();
        semNo2 = new javax.swing.JLabel();
        totalCredit3 = new javax.swing.JLabel();
        semNo3 = new javax.swing.JLabel();
        totalCredit4 = new javax.swing.JLabel();
        semNo4 = new javax.swing.JLabel();
        totalCredit5 = new javax.swing.JLabel();
        semNo5 = new javax.swing.JLabel();
        totalCredit6 = new javax.swing.JLabel();
        semNo6 = new javax.swing.JLabel();
        totalCredit7 = new javax.swing.JLabel();
        semNo7 = new javax.swing.JLabel();
        courses = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        semesters = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        semesters1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        semesterPlan1.setAutoCreateRowSorter(true);
        semesterPlan1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan1.setFillsViewportHeight(true);
        semesterPlan1.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan1.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(semesterPlan1);

        semesterPlan2.setAutoCreateRowSorter(true);
        semesterPlan2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan2.setFillsViewportHeight(true);
        semesterPlan2.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan2.setRequestFocusEnabled(false);
        jScrollPane5.setViewportView(semesterPlan2);

        semesterPlan3.setAutoCreateRowSorter(true);
        semesterPlan3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan3.setFillsViewportHeight(true);
        semesterPlan3.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan3.setRequestFocusEnabled(false);
        jScrollPane6.setViewportView(semesterPlan3);

        semesterPlan4.setAutoCreateRowSorter(true);
        semesterPlan4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan4.setFillsViewportHeight(true);
        semesterPlan4.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan4.setRequestFocusEnabled(false);
        jScrollPane7.setViewportView(semesterPlan4);

        semesterPlan5.setAutoCreateRowSorter(true);
        semesterPlan5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan5.setFillsViewportHeight(true);
        semesterPlan5.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan5.setRequestFocusEnabled(false);
        jScrollPane8.setViewportView(semesterPlan5);

        semesterPlan6.setAutoCreateRowSorter(true);
        semesterPlan6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan6.setFillsViewportHeight(true);
        semesterPlan6.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan6.setRequestFocusEnabled(false);
        jScrollPane9.setViewportView(semesterPlan6);

        semesterPlan7.setAutoCreateRowSorter(true);
        semesterPlan7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        semesterPlan7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credit Hours", "Prerequisite"
            }
        ));
        semesterPlan7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        semesterPlan7.setFillsViewportHeight(true);
        semesterPlan7.setPreferredSize(new java.awt.Dimension(255, 0));
        semesterPlan7.setRequestFocusEnabled(false);
        jScrollPane10.setViewportView(semesterPlan7);

        totalCredit.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit1.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo1.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit2.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo2.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit3.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo3.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit4.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo4.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit5.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo5.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit6.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo6.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        totalCredit7.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        semNo7.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N

        courses.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        courses.setMaximumRowCount(6);
        courses.setModel(new javax.swing.DefaultComboBoxModel<>(graph.courseNames()));
        courses.setEnabled(false);
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel5.setText("Change course from semester:");

        jLabel2.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        jLabel2.setText("Select destination semester");

        semesters.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        semesters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester", "Third Semester", "Fourth Semester", "Fifth Semester", "Sixth Semester", "Seventh Semester", "Eighth Semester" }));
        semesters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestersActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jButton1.setText("Apply Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        semesters1.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        semesters1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester", "Third Semester", "Fourth Semester", "Fifth Semester", "Sixth Semester", "Seventh Semester", "Eighth Semester" }));
        semesters1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesters1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(semNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalCredit4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(semNo7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totalCredit7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(242, 242, 242))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(semNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(totalCredit5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(semesters, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(semNo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(totalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(semNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalCredit2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(semNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalCredit1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(semNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalCredit3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(semNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalCredit6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(semesters1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButton1)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCredit5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(semesters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(semNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalCredit6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(semNo7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalCredit7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(semesters1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesActionPerformed

    private void semestersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestersActionPerformed
        int s = semesters.getSelectedIndex();
        int i = 0;
        String courseNames[] = new String[sem[s].semCourses.size()];
        for (Course c : sem[s].semCourses) {              
            courseNames[i] = c.name;
            i++;
            }    
        courses.setEnabled(true);
        courses.setModel(new javax.swing.DefaultComboBoxModel<>(courseNames)); 
    }//GEN-LAST:event_semestersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.print(graph.adjLists[0].adjList);
        Course crs = new Course();
        int s = semesters.getSelectedIndex();
        int s2 = semesters1.getSelectedIndex();//destination semester
        Boolean preIncluded = true;
        Boolean prevsem=true;
        Boolean depIncluded=true;
        int index = graph.searchCourse(sem[s].semCourses.get(courses.getSelectedIndex()).code);
        System.out.print(prevsem );
        for(Integer dep : graph.adjLists[index].adjList){
            for(int i=0 ; i<=s2 ; i++){
                for(Course course : sem[i].semCourses){
                    if(course.code.equals(""+dep))
                    depIncluded = false;
                }
            }
        }
        System.out.print(depIncluded );
        if(!sem[s].semCourses.get(courses.getSelectedIndex()).preReq.get(0).equals("null")){
        for(String n : graph.neededCourses(sem[s].semCourses.get(courses.getSelectedIndex()).code)){
            prevsem = false;
            for(Course course : sem[s2].semCourses){
                if(course.code.equals(n))
                    preIncluded = false;
                }
            for(int j=0 ; j<s2 ; j++){
                for(int k=0 ; k<sem[j].semCourses.size() ; k++){
                if (sem[j].semCourses.get(k).code.equals(n)){
                    prevsem = true;
                }
                }
            }
        }
        }
        

        if(sem[s2].semCourses.size()>5)     
            JOptionPane.showMessageDialog(rootPane, "Change inapplicable\nSemester "
                    +(s2+1)+" will exceed 6 courses");
        else if(!preIncluded)
            JOptionPane.showMessageDialog(rootPane, "Change inapplicable\nThere"
                    + " are prerequisites in the same semester");
        else if(!prevsem)
            JOptionPane.showMessageDialog(rootPane, "Change inapplicable\nPrerequisite"
                    + " courses are not completed in previous semesters");
        else if(!depIncluded)
            JOptionPane.showMessageDialog(rootPane, "Change inapplicable\nThere are course "
                    + " depending on this course");
        else{
            for(int i =0 ; i<sem[s].semCourses.size() ; i++){
                if (sem[s].semCourses.get(i).name.equals(courses.getSelectedItem())){
                    crs = sem[s].semCourses.get(i);
                    sem[s].semCourses.remove(i);
                    repaint();
                    break;
                }                    
            }
            sem[s2].semCourses.add(crs);
            sem[s2].totalCredit = sem[s2].totalCredit+Integer.parseInt((crs.credit));
            sem[s].totalCredit = sem[s].totalCredit-Integer.parseInt((crs.credit));
            model[s2].addRow(new Object[]{crs.code,crs.name,crs.credit,crs.preReq.get(0)});
            for (int i = 0; i < model[s].getRowCount(); i++) {
            if (((String)model[s].getValueAt(i, 0)).equals(crs.code)) {
                model[s].removeRow(i);
            }
        }
            
            
        semNo.setText("First Semester"+" ("+sem[0].semCourses.size()+" Courses)");
        totalCredit.setText("Total credits:"+ sem[0].totalCredit);
        
        semNo1.setText("Second Semester"+" ("+sem[1].semCourses.size()+" Courses)");
        totalCredit1.setText("Total credits:"+ sem[1].totalCredit);
        
        semNo2.setText("Third Semester"+" ("+sem[2].semCourses.size()+" Courses)");
        totalCredit2.setText("Total credits:"+ sem[2].totalCredit);
        
        semNo3.setText("Fourth Semester"+" ("+sem[3].semCourses.size()+" Courses)");
        totalCredit3.setText("Total credits:"+ sem[3].totalCredit);
        
        semNo4.setText("Fifth Semester"+" ("+sem[4].semCourses.size()+" Courses)");
        totalCredit4.setText("Total credits:"+ sem[4].totalCredit);
        
        semNo5.setText("Sixth Semester"+" ("+sem[5].semCourses.size()+" Courses)");
        totalCredit5.setText("Total credits:"+ sem[5].totalCredit);
        
        semNo6.setText("Seventh Semester"+" ("+sem[6].semCourses.size()+" Courses)");
        totalCredit6.setText("Total credits:"+ sem[6].totalCredit);
        
        semNo7.setText("Eighth Semester"+" ("+sem[7].semCourses.size()+" Courses)");
        totalCredit7.setText("Total credits:"+ sem[7].totalCredit);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void semesters1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesters1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesters1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StudyPlan(graph).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel semNo;
    private javax.swing.JLabel semNo1;
    private javax.swing.JLabel semNo2;
    private javax.swing.JLabel semNo3;
    private javax.swing.JLabel semNo4;
    private javax.swing.JLabel semNo5;
    private javax.swing.JLabel semNo6;
    private javax.swing.JLabel semNo7;
    private javax.swing.JTable semesterPlan;
    private javax.swing.JTable semesterPlan1;
    private javax.swing.JTable semesterPlan2;
    private javax.swing.JTable semesterPlan3;
    private javax.swing.JTable semesterPlan4;
    private javax.swing.JTable semesterPlan5;
    private javax.swing.JTable semesterPlan6;
    private javax.swing.JTable semesterPlan7;
    private javax.swing.JComboBox<String> semesters;
    private javax.swing.JComboBox<String> semesters1;
    private javax.swing.JLabel totalCredit;
    private javax.swing.JLabel totalCredit1;
    private javax.swing.JLabel totalCredit2;
    private javax.swing.JLabel totalCredit3;
    private javax.swing.JLabel totalCredit4;
    private javax.swing.JLabel totalCredit5;
    private javax.swing.JLabel totalCredit6;
    private javax.swing.JLabel totalCredit7;
    // End of variables declaration//GEN-END:variables
}
