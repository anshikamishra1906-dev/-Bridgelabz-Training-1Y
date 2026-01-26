public class Ascii{
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
        Ascii obj = new Ascii();
        System.out.println(obj.z);
        obj.m3();
		System.out.println(args[0]);
		System.out.println(args[0]+args[1]);
		//System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		String s = args[0];
        for (int i = 0; i < s.length(); i++) {
		System.out.println(s.charAt(i) + " = " + (int)s.charAt(i));
		}
		String t = args[1];
        for (int i = 0; i < t.length(); i++) {
		System.out.println(t.charAt(i) + " = " + (int)t.charAt(i));
		}
    }
}