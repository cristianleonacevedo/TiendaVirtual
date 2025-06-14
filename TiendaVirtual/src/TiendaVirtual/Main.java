package TiendaVirtual;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
		Carrito cato = new Carrito();
		Catalogo cata = new Catalogo(cato);
		
		String accion;
		
		boolean retro = true;
		
		do {
			
			cata.encabezado();
			cata.pdctList();
			int opcion = scann.nextInt();
			scann.nextLine();
			
			boolean retroceso = true;
			
			do {
				cata.infoProducto(opcion, retroceso);
				accion = scann.nextLine();
				cato.añaCarrito(cata.getProducto(),cata.getPrecio(), opcion, accion);
				retroceso = cata.retroceso(retroceso, accion);
				if (accion != "añadir" && accion != "R") {
					
					System.out.println("opcion inexistente");
					System.out.println("");
				}
			}while(retroceso);
			
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		}while(retro);
		
		scann.close();
	}

}