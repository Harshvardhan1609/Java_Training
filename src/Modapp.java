class Mod{
    int a ,b;
    void num(int x){
        this.a = x;
    }
    void mod(){
        if(a<0)
            this.b = a*(-1);

    }
    void print(){
        System.out.println(b);
    }
}

public class Modapp {
    public static void main(String[] args){
        Mod m = new Mod();
        m.num(-9);
        m.mod();
        m.print();
    }
}