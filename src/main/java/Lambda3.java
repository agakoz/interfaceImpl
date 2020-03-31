//TODO3 String go(String name)
public class Lambda3 {
    public static void main(String[] args) {
        //todo 3c anonimowa
    myInterfac3 anonimowa = new myInterfac3() {
        @Override
        public String go(String name) {
            return "anonimowa " + name;
        }
    };
        //todo 3d lambda
        myInterfac3 lambda = name -> "lambda "+ name;
    }

}
//todo 3a tworzenie int
interface myInterfac3{
    String go(String name);
}
//todo 3b impl klasyczna
class klasyczna3 implements myInterfac3{

    @Override
    public String go(String name) {
        return "klasyczna "+ name;
    }
}