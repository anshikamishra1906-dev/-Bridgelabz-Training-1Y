public class Xyz {
    Calculator sum = (a,b) -> a+b;
    Calculator prod = (a,b) -> a*b;
    Calculator div = (a,b) -> a/b;

    static void Calculate(Calculator impl,int a, int b) {
        impl.Calculate(a,b);
    }
}
