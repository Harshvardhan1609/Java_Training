class Si{
    float p , r , t , si;
    void initialize(float p , float r , float t){
        this.p = p;
        this.r = r;
        this.t  = t;
    }
    void calculation(){
        si = (this.p*this.r*this.t)/100;
    }
    void printresults(){
        System.out.println(si);
    }
}

public class SimpleInterest {
    public static void main(String[] args){
        Si s = new Si();
        s.initialize(2.3f,7.8f,8.9f);
        s.calculation();
        s.printresults();
    }

}
