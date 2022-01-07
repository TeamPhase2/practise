interface  A
{
    void show(int i);
}
/*class Xyz implements A
{

    public void show(int i) {
        System.out.println("Hello"+ i);
    }
}*/

    public class LambdaExpression {
        public static void main(String args[]) {


           // Xyz Obj = new Xyz();
           /* A obj = new A() {

                public void show() {
                    System.out.println("Hello"+ i);

                }
            };*/
            A obj;
           obj = (int i)-> {System.out.println("Hello"+ i);};
            obj.show(9);
            }
    }
