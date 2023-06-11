public class demo {
    public int id = 1234;
    public String name="meet jani";
    public void display() {
        System.out.println("How are you??");
    }
}

class b extends demo {
    public static void main(String args[]) {
        demo d = new demo();
        System.out.println(d.id);
        System.out.println(d.name);
        d.display();
    }
}
