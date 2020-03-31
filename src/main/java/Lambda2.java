//TODO String go();
public class Lambda2 {
    public static void main(String[] args) {
        //todo 2c
        myInterface2 anonimowa = new myInterface2() {
            @Override
            public String go() {
                return "anonimowa";
            }
        };
        //todo 2d
        myInterface2 lambda = () -> "lambda";
    }
}
//todo 2a tworzenie int
interface myInterface2 {
    String go();
}
//todo 2b
class KlasycznaImpl implements myInterface2 {

    @Override
    public String go() {
        return "klasyczna implementacja";
    }
}