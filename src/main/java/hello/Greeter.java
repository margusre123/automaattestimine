package hello;

public class Greeter {



    static String sayHello1() {
        return "Hello world!";
    }

    static String sayHello2() {
        return "Greetings!";
    }

    static String sayHello3() {
        return "Welcome to the earth!";
    }


    public static void main(String[] args) {
        String name = "Margus";
        Counter nameLength = new Counter();
        int nameLengthValue = nameLength.nameLengthCounter(name);

        if (nameLengthValue > 4) {
            sayHello1();
        }

        else if (nameLengthValue > 6) {
            sayHello2();
        }

        else {
            sayHello3();
        }




    }
}



class Counter {
    static int nameLengthCounter(String name){
        return name.length();
    }
}