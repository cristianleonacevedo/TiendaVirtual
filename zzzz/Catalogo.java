import java.util.Scanner;

public class Catalogo {

	Scanner scan = new Scanner(System.in);
	Producto pdct = new Producto();
	
	private Carrito cato;
	
	public Catalogo(Carrito cato) {
	    this.cato = cato;
	}
	
	String producto[] = pdct.getProductos();
	double precio[] = pdct.getPrecios();
	
	public String[] getProducto() {
		return producto;
	}

	public double[] getPrecio() {
		return precio;
	}

	public void encabezado() {
		System.out.println("|| Catalogo ||");
		System.out.println ("|| Carrito(0) ||");
		System.out.println ("");
	}

	public void pdctList() {

		for(int i = 0; i < producto.length; i++) {
			
			System.out.println(producto[i] + "(" + (i+1) + ")");
			System.out.println("");
		}
	}
		
	public void infoProducto(int opcion, boolean retroceso) {
		
	switch (opcion) {
					
		case 0:
			
			cato.pdctCarrito();
			System.out.println("Retroceder(R)");
			break;
						
		case 1:
						
				System.out.println("°°" + producto[0] + "°°");
				System.out.println("");
				System.out.println("Precio= " + precio[0] + "$");
				System.out.println("Añadir al carrito(añadir)");
				System.out.println("Retroceder(R)");
					
					
			break;
					
		case 2:
					
				System.out.println("°°" + producto[1] + "°°");
				System.out.println("");
				System.out.println("Precio= " + precio[1] + "$");
				System.out.println("Añadir al carrito(añadir)");		
				System.out.println("Retroceder(R)");
					
			break;

		case 3:
					
				System.out.println("°°" + producto[2] + "°°");
				System.out.println("");
				System.out.println("Precio= " + precio[2] + "$");
				System.out.println("Añadir al carrito(añadir)");					
				System.out.println("Retroceder(R)");
				
			break;

		case 4:
					
				System.out.println("°°" + producto[3] + "°°");
				System.out.println("");
				System.out.println("Precio= " + precio[3] + "$");
				System.out.println("Añadir al carrito(añadir)");					
				System.out.println("Retroceder(R)");
				
			break;

		case 5:
					
				System.out.println("°°" + producto[4] + "°°");
				System.out.println("");
				System.out.println("Precio= " + precio[4] + "$");
				System.out.println("Añadir al carrito(añadir)");					
				System.out.println("Retroceder(R)");
				
			break;
			
		default:
			
			System.out.println("Opcion invalida");
			System.out.println("Escribe R para retroceder");
			retroceso = false;
			
			break;
					}
			
			
		}
	
	public boolean retroceso(boolean retroceso) {
	
		String accion = scan.nextLine();
		
		if("R".equals(accion)) {
			
			retroceso = false;
			
		}
		
		return retroceso;
	}
	
	public boolean retroceso(boolean retroceso, String accion) {
		
		
		if("R".equals(accion)) {
			
			retroceso = false;
			
		}
		
		return retroceso;
	}
	
}