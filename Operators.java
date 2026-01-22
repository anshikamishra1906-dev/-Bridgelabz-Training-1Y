public class Operators{
    public static void main(String[] args){
	int i = 0;
	System.out.println("val :"+i); //0
	i++;
	System.out.println("val a:"+i++); //1
	System.out.println("val b:"+i); //2
	++i;
	System.out.println("val c:"+i++); //3
	System.out.println("val a:"+i++); //4
	

	for (int a=0; a<10 ; a++) {
	    System.out.println("a: "+a);
	}

    int j=10;
    while (j>0) {	
	    System.out.println("j: "+j);
		j--;
	}
    
     
    int k = 10;
    do {
		System.out.println("k: "+k);
		k--;
	}while (k>0);
	
	}
}
	
	