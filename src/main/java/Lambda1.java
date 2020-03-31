public class Lambda1 {
    public static void main(String[] args) {
        //todo 1c anonimowa implem
        MyInterface anonimowa = new MyInterface() {
            public void go() {
                System.out.println("anonimowa implementacja! ");
            }
        };
        //todo 1d lambda
        MyInterface lambda = () -> System.out.println("lambda!");
    }
}

//todo 1a - tworzymy interface
interface MyInterface {
    void go();
}

// todo 1b klasyczna impl

class Klasyczna implements MyInterface {

    public void go() {
        System.out.println("klasyczna implementacja!");
    }
}