/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Bima
 */
public class Person {

String fName, lName, stuID,  stuStatus;

    public Person (String fName, String lName, String stuID, String stuStatus){
        
        this.fName = fName;
        this.lName = lName;
        this.stuID = stuID;
        this.stuStatus = stuStatus;
    }
    public String getfName(){
        return fName;
    }
    public void setfname(){
        this.fName = fName;
    }
    public String getlName(){
        return lName;
    }
    public void setlName(){
        this.lName = lName; 
    }
    public String getstuID(){
        return stuID;
    }
    public void setstuID(){
        this.stuID = stuID;
    }
    public String getstuStatus(){
        return stuStatus;
    }
    public void setstuStatus(){
        this.stuStatus = stuStatus;
    }
    public static void main(String[] args) {
        
        Person student = new Person ("Lisa ", "Palambo", "123456789", "Active");
        
        System.out.println("Nama Siswa :" +student.fName +student.lName);
        System.out.println("ID Siswa :" +student.stuID);
        System.out.println("Status Siswa :" +student.stuStatus);
    }

    
}
