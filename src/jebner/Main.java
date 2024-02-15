package jebner;

public class Main {
    public static void main(String[] args) {
        // new stack
        Stack<String> s = new Stack<>(5);

        // push it full
        s.push("hi bro");
        s.push("ho");
        s.push("hü");
        s.push("he");
        s.push("ha");
//        s.push("ha");

        System.out.println(s.peek());
        // pop until it is empty anjd the expcetion accurs
        System.out.println(s.list());
        s.pop();
        System.out.println(s.list());
        s.pop();
        System.out.println(s.list());
        s.pop();
        System.out.println(s.list());
        s.pop();
        System.out.println(s.list());



    }
}
