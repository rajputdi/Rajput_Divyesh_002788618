/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.employeemgmnt;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divyesh Rajput
 */
public class SearchPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form SearchPanel
     */
    EmployeeList employee;
    public SearchPanel(EmployeeList employee) {
        
        initComponents();
        this.employee = employee;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSearchName = new javax.swing.JTextField();
        jSearchEmpNo = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();
        jViewSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTeamInfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPosition = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCellNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jEmailAdd = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jNumber = new javax.swing.JTextField();
        jGender = new javax.swing.JTextField();
        jAge = new javax.swing.JTextField();
        jStartDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLevel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jUpdateEmployee = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel1.setText("Search Employee");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position", "Cell Phone No", "Email Id"
            }
        ));
        jScrollPane1.setViewportView(tblEmployees);

        jLabel2.setText("Name");

        jLabel3.setText("Employee Number");

        jSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchNameActionPerformed(evt);
            }
        });

        jbtnSearch.setBackground(new java.awt.Color(255, 255, 204));
        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jViewSearch.setBackground(new java.awt.Color(204, 204, 255));
        jViewSearch.setText("View Details");
        jViewSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewSearchActionPerformed(evt);
            }
        });

        jLabel9.setText("Team Info");

        jLabel10.setText("Position");

        jLabel11.setText("Phone No");

        jCellNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCellNoActionPerformed(evt);
            }
        });

        jLabel12.setText("Email Address");

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Employee ID");

        jLabel6.setText("Age");

        jLabel7.setText("Gender");

        jLabel8.setText("Start Date");

        jLabel13.setText("Level");

        jUpdateEmployee.setBackground(new java.awt.Color(204, 204, 255));
        jUpdateEmployee.setText("Update ");
        jUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jSearchEmpNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jViewSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCellNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTeamInfo)
                                .addComponent(jLevel)
                                .addComponent(jStartDate)
                                .addComponent(jGender)
                                .addComponent(jAge)
                                .addComponent(jNumber)
                                .addComponent(jName))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jUpdateEmployee, jViewSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jViewSearch)
                    .addComponent(jUpdateEmployee))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCellNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jUpdateEmployee, jViewSearch});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jGender, jStartDate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCellNo, jEmailAdd, jLevel, jPosition, jTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAge, jNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void jSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchNameActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // TODO add your handling code here:
      String nameSearch =  jSearchName.getText();
      String searchEmpId = jSearchEmpNo.getText();
      
      searchEmployee(nameSearch, searchEmpId);
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jViewSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewSearchActionPerformed
        // TODO add your handling code here:
        viewSearchedEmployee(tblEmployees);
    }//GEN-LAST:event_jViewSearchActionPerformed

    private void jCellNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCellNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCellNoActionPerformed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateEmployeeActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow();
        
      
        
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a record to view details");
        }
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        CreateEmployee selectedEmployee;
        selectedEmployee = (CreateEmployee) model.getValueAt(selectedRowIndex , 0);
        
        if (jNumber.getText().length()!= 6 && jNumber.getText().isEmpty()){
         
         JOptionPane.showMessageDialog(this, "Employee Number should be of 6 characters and cannot be left empty");
         return;
     }
        if(jEmailAdd.getText().isEmpty() || !jEmailAdd.getText().contains("@")|| !jEmailAdd.getText().contains(".com")){
            JOptionPane.showMessageDialog(this, "Email ID cannot be empty or invalid");
            return;
        }
        
        if(jAge.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Age cannot be Empty");
            return;
        }
        
        Short empAge = Short.valueOf(jAge.getText());
        selectedEmployee.seteName(jName.getText());
        selectedEmployee.seteNumber(jNumber.getText());
        selectedEmployee.seteAge(empAge);
        selectedEmployee.seteGender(jGender.getText());
        selectedEmployee.seteLevel(jLevel.getText());
        selectedEmployee.setePosition(jPosition.getText());
        selectedEmployee.seteTeamInfo(jTeamInfo.getText());
        selectedEmployee.seteCellNo(jCellNo.getText());
        selectedEmployee.setEmailAdd(jEmailAdd.getText());
        
        model.setValueAt(selectedEmployee, selectedRowIndex, 0);
        model.setValueAt(selectedEmployee.geteNumber(), selectedRowIndex, 1);
        model.setValueAt(selectedEmployee.geteAge(), selectedRowIndex, 2);
        model.setValueAt(selectedEmployee.geteGender(), selectedRowIndex, 3);
        model.setValueAt(selectedEmployee.geteDate(), selectedRowIndex, 4);
        model.setValueAt(selectedEmployee.geteLevel(), selectedRowIndex, 5);
        model.setValueAt(selectedEmployee.geteTeamInfo(), selectedRowIndex, 6);
        model.setValueAt(selectedEmployee.getePosition(), selectedRowIndex, 7);
        model.setValueAt(selectedEmployee.geteCellNo(), selectedRowIndex, 8);
        model.setValueAt(selectedEmployee.getEmailAdd(), selectedRowIndex, 9);
        
        JOptionPane.showMessageDialog(this, "Record Updated Successfully!!!");
        
        
    }//GEN-LAST:event_jUpdateEmployeeActionPerformed

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAge;
    private javax.swing.JTextField jCellNo;
    private javax.swing.JTextField jEmailAdd;
    private javax.swing.JTextField jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLevel;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jNumber;
    private javax.swing.JTextField jPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchEmpNo;
    private javax.swing.JTextField jSearchName;
    private javax.swing.JTextField jStartDate;
    private javax.swing.JTextField jTeamInfo;
    private javax.swing.JButton jUpdateEmployee;
    private javax.swing.JButton jViewSearch;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JTable tblEmployees;
    // End of variables declaration//GEN-END:variables

    private void searchEmployee(String nameSearch, String searchEmpId) {
        DefaultTableModel tblmodel = (DefaultTableModel) tblEmployees.getModel();
        tblmodel.setRowCount(0);
        int flag = -1;
        
        for (CreateEmployee ce : employee.getEmployee()){
            Object[] row = new Object[10];
            if(!"".equals(nameSearch) && !"".equals(searchEmpId) ){
                if (ce.geteName().equals(nameSearch) && ce.geteNumber().equals(searchEmpId)){
                    row[0] = ce;
                    row[1]= ce.geteNumber();
                    row[2]= ce.geteAge();
                    row[3]= ce.geteGender();
                    row[4]= ce.geteDate();
                    row[5]= ce.geteLevel();
                    row[6]= ce.geteTeamInfo();
                    row[7]= ce.getePosition();
                    row[8]= ce.geteCellNo();
                    row[9]= ce.getEmailAdd();
                    
                    tblmodel.addRow(row);
                    flag = 1;
                    
                }
            }
            else if (!"".equals (nameSearch)){
                if (ce.geteName().equals(nameSearch)){
                    row[0] = ce;
                    row[1]= ce.geteNumber();
                    row[2]= ce.geteAge();
                    row[3]= ce.geteGender();
                    row[4]= ce.geteDate();
                    row[5]= ce.geteLevel();
                    row[6]= ce.geteTeamInfo();
                    row[7]= ce.getePosition();
                    row[8]= ce.geteCellNo();
                    row[9]= ce.getEmailAdd();
                    
                    tblmodel.addRow(row);
                    flag = 1;
                }
            } else if (!"".equals (searchEmpId)){
                if (ce.geteNumber().equals(searchEmpId)){
                    row[0] = ce;
                    row[1]= ce.geteNumber();
                    row[2]= ce.geteAge();
                    row[3]= ce.geteGender();
                    row[4]= ce.geteDate();
                    row[5]= ce.geteLevel();
                    row[6]= ce.geteTeamInfo();
                    row[7]= ce.getePosition();
                    row[8]= ce.geteCellNo();
                    row[9]= ce.getEmailAdd();
                    
                    tblmodel.addRow(row);
                    flag = 1; 
                }    
        } else {
                flag = -1;
            }
            
    }
    if (flag <0){
                JOptionPane.showMessageDialog(this, "Employee Record Not Found!!!");
            }    
   }
    
    public void viewSearchedEmployee (javax.swing.JTable tblEmp){
        int selectedRowIndex = tblEmp.getSelectedRow();
        
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a record to view details");
        }
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        CreateEmployee selectedEmployee;
        selectedEmployee = (CreateEmployee) model.getValueAt(selectedRowIndex , 0);
        
        jName.setText(String.valueOf(selectedEmployee.geteName()));
        jNumber.setText(selectedEmployee.geteNumber());
        jAge.setText(String.valueOf(selectedEmployee.geteAge()));
        jGender.setText(selectedEmployee.geteGender());
        jStartDate.setText(selectedEmployee.geteDate());
        jLevel.setText(selectedEmployee.geteLevel());
        jTeamInfo.setText(selectedEmployee.geteTeamInfo());
        jPosition.setText(selectedEmployee.getePosition());
        jCellNo.setText(selectedEmployee.geteCellNo());
        jEmailAdd.setText(selectedEmployee.getEmailAdd());
        
        
        
    }
        
}
