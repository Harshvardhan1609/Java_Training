public class OverloadingMainMethod {

    public static void main(int a){
        System.out.println(a);
    }
    public static void main(String ar[])
    {
        main(90);
        System.out.println("Hello");
    }

}
