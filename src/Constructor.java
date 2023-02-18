class Test{
    int a;
    Test(int x){
        System.out.println("Hello");
    }
    Test(){
        System.out.println(a);
    }

}

public class Constructor {
    public static void main(String[] args){
        Test t1 = new Test(12);
        Test t2 = new Test();
    }

}
