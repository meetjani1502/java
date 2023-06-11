class Test {
    void mnumber(){
        System.out.println("6354299736");
    }
    final void atmpin(){
          System.out.println("8944");
    }
}
class thif extends Test{
 void mnumber(){
        System.out.println("6354299736");
    }
    void atmpin(){
          System.out.println("8944");
    }
}
class Final{
    public static void main(String[] args) {
        thif t=new thif();
        t.mnumber();
        t.atmpin();
    }
}