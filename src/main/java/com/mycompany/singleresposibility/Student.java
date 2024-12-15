
package com.mycompany.singleresposibility;

public class Student {
   
    private String Name , Age , Grade ;

    public Student(String Name, String Age, String Grade) {
        this.Name = Name;
        this.Age = Age;
        this.Grade = Grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    public void StoreStudent(String name,String age,String grade){
        
    }
    
    public void PrintStudentDetails(){
        
    }
}
