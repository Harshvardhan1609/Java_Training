public class Student {
    int rollNo;
    static String cname = "JIET";
    String sname;
    void show(int rollNo , String sname){
        this.rollNo =  rollNo;
        this.sname = sname;
    }
    void display(){
        System.out.println(rollNo + " " + sname + " " + cname);
        System.out.println("object from method show() : ");
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.show(12309,  "harsh");
        s1.display();
        s2.show(121,  "harsh2");
        s2.display();
        s3.show(123,  "harsh3");
        s3.display();
        s4.show(124,  "harsh4");
        s4.display();
    }
}
