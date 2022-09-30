/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemgmnt;
import java.io.*;
/**
 *
 * @author Divyesh Rajput
 */
public class CreateEmployee implements Serializable {
    private String eName;
    private String eNumber;
    private short eAge;
    private String eGender;
    private String eDate;
    private String eLevel;
    private String eTeamInfo;
    private String ePosition;
    private String eCellNo;
    private String emailAdd;

  /**  public CreateEmployee(String eName, String eNumber, short eAge, String eGender, String eDate, String eLevel, String eTeamInfo, String ePosition, String eCellNo, String emailAdd) {
        this.eName = eName;
        this.eNumber = eNumber;
        this.eAge = eAge;
        this.eGender = eGender;
        this.eDate = eDate;
        this.eLevel = eLevel;
        this.eTeamInfo = eTeamInfo;
        this.ePosition = ePosition;
        this.eCellNo = eCellNo;
        this.emailAdd = emailAdd;
    }
**/
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber;
    }

    public short geteAge() {
        return eAge;
    }

    public void seteAge(short eAge) {
        this.eAge = eAge;
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }

    public String geteLevel() {
        return eLevel;
    }

    public void seteLevel(String eLevel) {
        this.eLevel = eLevel;
    }

    public String geteTeamInfo() {
        return eTeamInfo;
    }

    public void seteTeamInfo(String eTeamInfo) {
        this.eTeamInfo = eTeamInfo;
    }

    public String getePosition() {
        return ePosition;
    }

    public void setePosition(String ePosition) {
        this.ePosition = ePosition;
    }

    public String geteCellNo() {
        return eCellNo;
    }

    public void seteCellNo(String eCellNo) {
        this.eCellNo = eCellNo;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    
    @Override 
    public String toString(){
        return eName;
    }
    
    
    
}
