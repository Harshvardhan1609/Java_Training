class Bike{
    int a;
    int b;
    Bike(int q , int p){
        this.a = q;
        this.b = p;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}

class JIET{
    int J;
    int I;
    JIET(int m){
        this.J = m;
    }
    void mutiply(){
        System.out.println("The multiplication is " + 2*J );
    }
}

public class Obljects {

    public static void main(String[] args){
        Bike b = new Bike(10,2);
        b.print();
        JIET j = new JIET(10);
        j.mutiply();
    }
}
