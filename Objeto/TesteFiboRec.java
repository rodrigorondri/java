class Fibonacci {
	
	static long calcula(int n) {
		// usando operador condicional ternario
		return (n < 2)?  n :  calcula(n-1) + calcula(n -2);
		//usando modo convencional
/* 		if(n < 2) {
			return n;
		}
		else {
			return calcula(n -1) + calcula(n - 2);
		} */
	}
}

class TesteFiboRec {
	public static void main(String[] args){
		Fibonacci fibo = new Fibonacci();
		
		long i = fibo.calcula(6);
		System.out.println(i);
	}
}