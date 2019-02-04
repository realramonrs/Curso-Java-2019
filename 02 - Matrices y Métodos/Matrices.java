package sintaxis;

import java.util.Arrays;
import java.util.Random;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int []numeros = new int[10];
			int []numeros2 = {5,3,2,1,3,6,8};
		
			
			for(int i = 0;i<numeros.length;i++) {
				System.out.print(numeros[i] + " ");
			}
			
			//Los arrays se manipulan con referencias
			numeros = numeros2; //numeros y numeros pasan a apuntar al misma zona de memoria
			
			numeros[0] = 87;
			
			//La clase Arrays contiene funciones que permiten realizar
			//Los algoritmos más comune
			
			//CopyOf
			int numeros3[] = new int[10];
			
			numeros3 = Arrays.copyOf(numeros2,numeros2.length);
			
			System.out.println();
			//sort
			int nueva[] = {1,2,1,2,1,2,1,2};
			Arrays.sort(nueva);
			
			//For each de java
			for(int numero : nueva) {
				System.out.print(numero + " ");
			}
			System.out.println();
			//binarySearch
			int posicion = Arrays.binarySearch(nueva, 2);
			
			System.out.println(posicion);
			
			
			//Matrices 2D
			
			int matriz2D[][] = new int[3][5];
			int otraMatriz2D[][] = {{1,2,3},{9,8,6}};
			
			Random r = new Random();
			
			System.out.println("Numero de filas: " + matriz2D.length);
			System.out.println("Columnas fila 0 " + matriz2D[0].length);			
			
			for(int i = 0;i<matriz2D.length;i++) {
				for(int j = 0;j<matriz2D[i].length;j++) {
					matriz2D[i][j] = r.nextInt(90) + 1;
				}
			}
			
			for(int i = 0;i<matriz2D.length;i++) {
				for(int j = 0;j<matriz2D[i].length;j++) {
					System.out.print(matriz2D[i][j]+" ");
				}
				System.out.println();
			}		
			
			
	}

}
