package com.company;

class Student{

    private String ditno;
    private String name;
    private static String batchID;

    //Static properties are allow to do changes
    //Static properties are global variables

    public Student(String mditno, String mname, String mbatchID){

        ditno = mditno;
        name = mname;
        batchID = mbatchID;
    }

    public void setBatchID(String mbatchID){

        batchID = mbatchID;
    }

    public void setName(String mname){
        name = mname;
    }

    public void setDitno(String mdiitno){

        ditno = mdiitno;
    }

    public String getBatchID(){

        return batchID;
    }
    public String getName(){

        return name;
    }
    public String getDitno(){

        return ditno;
    }

    public void DisplayDetails(){

        System.out.println(" ");
        System.out.println("IT no is: "+ditno+"\nName is: "+name+"\nBatch is: "+batchID);

    }

    //Static methods only work with static properties

    public static void SetBatch(String mbatchID){

        batchID = mbatchID;

    }

    static {

        System.out.println("Just Running some static code");
    }

}

class Utility{
    public static int add(int no1,int no2){
     return no1 + no2;

    }

}

public class Main {

    public static void main(String[] args) {

        int ans = Utility.add(70,70);
        System.out.println(ans);


        Student st1 = new Student("IT20126124","Sachintha","Group 4");

        //Class.method; is a static method
        Student.SetBatch("Malabe weekday group 4.1");

        Student st2 = new Student("IT20000000","Amal","Group 4");
        Student st3 = new Student("IT30000000","Kamal","Group 4");
        Student st4 = new Student("IT40000000","Randy","Group 4");

        st1.setBatchID("Weekday Group 4");

        st1.DisplayDetails();
        st2.DisplayDetails();
        st3.DisplayDetails();
        st4.DisplayDetails();


        // write your code here
    }
}
