public class Demo1{
    static int x = 12;
    int z = 24;
    public static void m2(){
        int y = 10;
        System.out.println(y);
    }
    public static void m1(){
        int y = 23;
        System.out.println(y);
        m2();
    }
    void m3(){
        int a = 45;
        System.out.println(a);
    }
    public static void main(String[] args){
        int y = 90;
        System.out.println("HelloWorld");
        System.out.println(x);
        System.out.println(y);
        m1();
        Demo1 obj = new Demo1();
        System.out.println(obj.z);
        obj.m3();
		System.out.println(args[0]);
		System.out.println(args[0]+args[1]);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
    }
}