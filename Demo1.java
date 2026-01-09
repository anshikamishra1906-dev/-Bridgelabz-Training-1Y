public class Demo1{
static int x;
int z=19;
public static void m2(){
    int y = 30;
	System.out.println(y);
}

public static void m1(){
    int y = 20;
	System.out.println(y);
	m2();
}

public static void main(String[] args){
    int y = 10;
    System.out.println("HelloWorld");
    System.out.println(x);
    System.out.println(y);
    m1();
    Demo1 obj = new Demo1();
	System.out.println(obj.z);
	
}

}