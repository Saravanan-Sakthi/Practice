interface Drawable{
    public int draw(int n);
    public static void method(){
        System.out.println("method");
    }
}
public class PracticeTest {

        public static void main(String[] args) {
            int width=10;

            //without lambda, Drawable implementation using anonymous class
            Drawable d = (b)-> b+9;
            System.out.println(d.draw(10));
        }
    }
