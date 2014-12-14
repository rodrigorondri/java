class ExercicioX {
	public static void main (String[] args){
	
		/* System.out.println("Numeros de 150 a 300");
		for(int x = 150;x <= 300;x++){
			System.out.println(x);
		} */
		
		//Soma de 1 a 1000
		int soma = 0,y = 1;
		while(y <= 1000){
			soma += y;
			y++;}
		System.out.println("Somas de 1 a 1000: " + soma);
		
		// Multiplos de 3
		System.out.println("\nMultiplos de 3");
		for(int x = 1; x <= 100;x++){
			if(x%3 == 0){
				System.out.println(x);
			}
		}	
		// Fatoral de numeros
		System.out.println("\nFatoral de 1 a 10");
		for( long n = 1, fatorial = 1; n <= 10; n++){
			fatorial *= n;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
		
		//Fibonacci
		System.out.println("\nSequencia de Fibonacci de 0 a 100");
		long aux1 = 0,aux2 = 1, fibo;
		for(int x = 0;x <= 100;x++){
			if(x == 0){
				fibo = 0;
			}
			else{
				if (x == 1){
					fibo = 1;
				}
				else{
					fibo = aux1 + aux2;
					aux1 = aux2;
					aux2 = fibo;
				}	
				
			}
			
			System.out.println(fibo);
			if(fibo > 100){
				break;
			}
		}
		
		// Da prova do cesar
		System.out.println("\nExercicio do Cesar");
		int valorx = 13, valory = 0;
		
		while(valory != 1){
			if(valorx%2 == 0){
				valory = valorx / 2;
			}
			else {
				valory = 3 * valorx + 1;
			}
			valorx = valory;
			System.out.print(valory + " ");
		}
				
		
		
	}
}