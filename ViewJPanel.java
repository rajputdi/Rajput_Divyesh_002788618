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
        JDelete = new javax.swing.JButton();
        jViewEmp = new javax.swing.JButton();
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
        jUpdate = new javax.swing.JButton();
        jProfilePic = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 655, 322));

        JDelete.setText("Delete");
        JDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDeleteActionPerformed(evt);
            }
        });
        add(JDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 404, 108, -1));

        jViewEmp.setText("View details");
        jViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewEmpActionPerformed(evt);
            }
        });
        add(jViewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 404, 108, -1));

        jLabel9.setText("Team Info");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 605, 65, 19));
        add(jTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 603, 123, -1));

        jLabel10.setText("Position");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 639, 65, -1));
        add(jPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 636, 328, -1));

        jLabel11.setText("Phone No");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 670, -1, -1));

        jCellNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCellNoActionPerformed(evt);
            }
        });
        add(jCellNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 670, 328, -1));

        jLabel12.setText("Email Address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 713, -1, -1));
        add(jEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 710, 328, -1));
        add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 404, 211, -1));
        add(jNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 438, 131, -1));

        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });
        add(jGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 506, 91, -1));
        add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 472, 102, -1));
        add(jStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 540, 106, -1));

        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 407, 73, -1));
        add(jLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 574, 91, 20));

        jLabel4.setText("Employee ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 441, 73, -1));

        jLabel5.setText("Age");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 475, 73, -1));

        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 509, 73, -1));

        jLabel7.setText("Start Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 543, 73, -1));

        jLabel8.setText("Level");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 574, 73, -1));

        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        add(jUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 100, -1));

        jProfilePic.setText("jLabel2");
        add(jProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 190, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void JDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDeleteActionPerformed
        // TODO add your handling code here:
        
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

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        if(tblEmployees.getSelectedRowCount()==1){
            String upName = jName.getText();
            String upEmpId = jNumber.getText();
            String upAge = jAge.getText();
            String upGender = jGender.getText();
            String upDate = jStartDate.getText();
            String upLevel = jLevel.getText();
            String upTeamInfo =jTeamInfo.getText();
            String upPosition =jPosition.getText();
            String upCellNo =jCellNo.getText();
            String upEmailAdd = jEmailAdd.getText();
            
                    
            model.setValueAt(upName,tblEmployees.getSelectedRow(), 0);
            model.setValueAt(upEmpId,tblEmployees.getSelectedRow(), 1);
            model.setValueAt(upAge,tblEmployees.getSelectedRow(), 2);
            model.setValueAt(upGender,tblEmployees.getSelectedRow(), 3);
            model.setValueAt(upDate,tblEmployees.getSelectedRow(), 4);
            model.setValueAt(upLevel,tblEmployees.getSelectedRow(), 5);
            model.setValueAt(upTeamInfo,tblEmployees.getSelectedRow(), 6);
            model.setValueAt(upPosition,tblEmployees.getSelectedRow(), 7);
            model.setValueAt(upCellNo,tblEmployees.getSelectedRow(), 8);
            model.setValueAt(upEmailAdd,tblEmployees.getSelectedRow(), 9);
            
            
        }
        
       
    }//GEN-LAST:event_jUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JDelete;
    private javax.swing.JTextField jAge;
    private javax.swing.JTextField jCellNo;
    private javax.swing.JTextField jEmailAdd;
    private javax.swing.JTextField jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jStartDate;
    private javax.swing.JTextField jTeamInfo;
    private javax.swing.JButton jUpdate;
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
