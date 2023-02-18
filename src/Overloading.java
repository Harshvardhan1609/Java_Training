class Over{
    void Harsh(int a){
        System.out.println(a);
    }
    void Harsh(String h){
        System.out.println(h);
    }
    void Harsh(float b){
        System.out.println(b);
    }
}

public class Overloading {
    public static void main(String []args){
        Over o1 = new Over();
        o1.Harsh(9);
        o1.Harsh("Harsh");
        o1.Harsh(9.1f);
    }
}
