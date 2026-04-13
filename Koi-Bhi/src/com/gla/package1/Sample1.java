package com.gla.package1;

public class Sample1 {
    private int varA;
    private static int varB;
    private void methodA(){

    };
    private static void methodB(){

    };
     int varC;
     static int varD;
     void methodC(){

    };
     static void methodD(){

    };
    public int varE;
    public static int varF;
    public void methodE(){

    };
    public static void methodF(){

    };

    protected int varG;
    protected static int varH;
    protected void methodG(){

    };
    protected static void methodH(){

    };
    public static void main(String[] args){
        System.out.println(varB);
        methodB();
        Sample1 obj = new Sample1();
        obj.methodA();
        System.out.println(obj.varA);
        System.out.println(obj.varC);
        System.out.println(varD);
        obj.methodC();
        methodD();
        System.out.println(obj.varE);
        System.out.println(varF);
        obj.methodE();
        methodF();
        System.out.println(obj.varG);
        System.out.println(varH);
        obj.methodG();
        methodH();

        Student obj1 = new Student();
        obj1.setName("Anshika");
        System.out.println(obj1.getName());
    }
}
