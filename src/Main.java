
public class Main {
    int a = 10;
    String s = "ABC";
    void show(){
        System.out.println(a+" "+s);
    }
    public static void main(String [] args) {
        Main m = new Main();
        Main m2 = new Main();
        System.out.println("Reference ID  + " + m); //It will show the reference id
        System.out.println("Reference ID  + " + m2);
        m.show();
        m2.show();
    }
}