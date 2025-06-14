package TiendaVirtual;

import java.util.Scanner;

public class Carrito {

	Scanner scan = new Scanner(System.in);
	
	private int i = 0;
	private double total = 0;
	private String[] carritoPdct = new String[100];
	private double[] carritoPrecio = new double[100];


	public void añaCarrito(String[] product, double[] precio, int opcion, String accion) {

		
		if ("añadir".equals(accion)) { 
			
			if(opcion == 1) {
				
				carritoPdct[i] = product[0];
				carritoPrecio[i] = precio[0];
				
				i++;
				
				System.out.println("Añadido al carrito!!!");
				System.out.println("");
				
			} else if(opcion == 2) {
				
				carritoPdct[i] = product[1];
				carritoPrecio[i] = precio[1];
				
				i++;
				
				System.out.println("Añadido al carrito!!!");
				System.out.println("");
				
			} else if(opcion == 3) {
				
				carritoPdct[i] = product[2];
				carritoPrecio[i] = precio[2];
				
				i++;
				
				System.out.println("Añadido al carrito!!!");
				System.out.println("");
				
			} else if(opcion == 4) {
				
				carritoPdct[i] = product[3];
				carritoPrecio[i] = precio[3];
				
				i++;
				
				System.out.println("Añadido al carrito!!!");
				System.out.println("");
					
			} else if(opcion == 5) {
				
			    carritoPdct[i] = product[4];
			    carritoPrecio[i] = precio[4];
			    
			    i++;
			    
			    System.out.println("Añadido al carrito!!!");
			    System.out.println("");
			    
			} else {
				
				System.out.println("opcion inexistente");
				System.out.println("");
				
			}
			
		}
		
	}
	
	public void pdctCarrito() {
		
		for(int j = 0; j < i; j++) {
			
			total = total + carritoPrecio[j];
			
			System.out.println(carritoPdct[j]);
			System.out.println(carritoPrecio[j] + "$");
			System.out.println("");
		}
		System.out.println("Total en el carrito = " + total + "$");
		total = 0;
	}
	
}