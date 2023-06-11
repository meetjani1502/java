class A{
    int a,b;
    A(int x,int y)
    {
        a=x; b=y;
    }
    
    A(int x, String y) {
        System.out.println(x+" "+y);
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
}
class B{
    public static void main(String[] args) {
    A ref=new A(100,500);
    ref.display();
    A r=new A(1000,"meet");
}
}