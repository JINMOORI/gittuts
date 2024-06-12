public class file {

    public static void main(String[] args) {
        file m = new file();
        m.sayHello();
        m.addnumbers(65,75);
        m.addnumbers(100,450);
        m.addnumbers(50,200);
        int k=m.multiplynumbers(8,9);
        
        System.out.println(k);

    }

    void sayHello()
    {
        System.out.println("HI");
    }
    void addnumbers(int a,int b)
    {
        System.out.println(a+b);
    }
    int multiplynumbers(int a,int b)
    {
        int x = a*b;
        return x;
    }
}
