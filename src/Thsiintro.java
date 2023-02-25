public class Thsiintro {
        int x = 10;
        void show(int x){
            System.out.println(x);
            System.out.println(this.x);
        }
        public static void main(String[] args)
        {
            Thsiintro tm = new Thsiintro();
            tm.show(90);
        }


}
