/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.employeemgmnt;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Divyesh Rajput
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeList employee;
    public ViewJPanel(EmployeeList employee) {
        initComponents();
        this.employee = employee;
        
        populateTable();
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
        jViewEmp = new javax.swing.JButton();
        JDelete = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
        jLevel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProfilePic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSearch = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 9), new java.awt.Dimension(0, 9), new java.awt.Dimension(32767, 9));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employees");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 661, 31));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 760, 322));

        jViewEmp.setText("View details");
        jViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewEmpActionPerformed(evt);
            }
        });
        add(jViewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 100, 30));

        JDelete.setText("Delete");
        JDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDeleteActionPerformed(evt);
            }
        });
        add(JDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 90, 30));

        jLabel9.setText("Team Info");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 65, 20));
        add(jTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 210, -1));

        jLabel10.setText("Position");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 70, 30));
        add(jPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 210, 30));

        jLabel11.setText("Phone No");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 70, 20));

        jCellNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCellNoActionPerformed(evt);
            }
        });
        add(jCellNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 328, -1));

        jLabel12.setText("Email Address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, -1));
        add(jEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 740, 328, -1));
        add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 211, -1));
        add(jNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 131, -1));

        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });
        add(jGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 80, 30));
        add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 498, 102, -1));
        add(jStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 130, 30));

        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 73, -1));
        add(jLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 130, -1));

        jLabel4.setText("Employee ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 73, -1));

        jLabel5.setText("Age");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 73, 20));

        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 73, 20));

        jLabel7.setText("Start Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 73, 20));

        jLabel8.setText("Level");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 73, 20));

        jProfilePic.setToolTipText("");
        jProfilePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 200, 210));

        jLabel2.setText("Search Employee: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });
        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyPressed(evt);
            }
        });
        add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 550, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Profile Picture");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 720, 120, 30));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void JDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow();
        
        CreateEmployee selectedEmployee = (CreateEmployee) tblEmployees.getValueAt(selectedRowIndex , 0);
        employee.deleteEmployee(selectedEmployee);
        DefaultTableModel tblModel = (DefaultTableModel) tblEmployees.getModel();
        
        //delete row
        if(tblEmployees.getSelectedRowCount()==1){
            
            tblModel.removeRow(tblEmployees.getSelectedRow());
        }else{
            if (tblEmployees.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Please select a record to delete");
                
            }
            else {
                JOptionPane.showMessageDialog(this, "Please select a single row only");
            }
        }

    }//GEN-LAST:event_JDeleteActionPerformed

    private void jViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewEmpActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a record to view");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
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
        
        ImageIcon ii = new ImageIcon(selectedEmployee.geteProfilePath());
//            Resize image to fit jlabel
        Image image = ii.getImage().getScaledInstance(jProfilePic.getWidth(), jProfilePic.getHeight(), Image.SCALE_SMOOTH);
             
        jProfilePic.setIcon(new ImageIcon(image));
        
        
    }//GEN-LAST:event_jViewEmpActionPerformed

    private void jCellNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCellNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCellNoActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchActionPerformed

    private void jSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblEmployees.setRowSorter (tr);
        tr.setRowFilter(RowFilter.regexFilter(jSearch.getText().trim()));
    }//GEN-LAST:event_jSearchKeyPressed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JDelete;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JLabel jProfilePic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearch;
    private javax.swing.JTextField jStartDate;
    private javax.swing.JTextField jTeamInfo;
    private javax.swing.JButton jViewEmp;
    private javax.swing.JTable tblEmployees;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        for (CreateEmployee ce : employee.getEmployee()){
            Object[] row = new Object[11];
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
            row[10] = ce.geteProfilePath(); //change profile picture
            
            model.addRow(row);
        }
        
    }
}
