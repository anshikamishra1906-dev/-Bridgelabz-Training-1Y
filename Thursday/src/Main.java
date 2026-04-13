public class Main {

    static void Calculate(Calculator impl,int a, int b) {
        impl.Calculate(a,b);
    }
    static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.Calculate(1,7));

        Multiplication prod = new Multiplication();
        System.out.println(prod.Calculate(1,7));

        Division div = new Division();
        System.out.println(sum.Calculate(1,7));

        System.out.println(sum.Calculate(1,7));
        System.out.println(prod.Calculate(1,7));
        System.out.println(div.Calculate(1,7));
    }
}
