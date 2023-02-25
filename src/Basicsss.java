public class Basicsss {
    int x = 10;
    void show(Basicsss tm , int x){
        System.out.println(tm.x);
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        Basicsss tm = new Basicsss();
        tm.show(tm,20);
    }

}
