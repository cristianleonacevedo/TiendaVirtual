Algoritmo TiendaVirtual
	Definir opcion como entero;
	Definir i Como Entero;
	Definir OpCarrito, producto1, producto2, producto3, producto4, producto5, carrito, respuesta como texto;
	Definir precio1, precio2, precio3, precio4, precio5 como entero;
	Definir retroceder Como Logico;
	Definir precios Como Entero;
	Definir it, ite, total, ra, ProductoE Como entero;
	retroceder = Verdadero;
	ProductoE = 0;
	total = 0;
	ite = 0;
	i = 0;
	ra = 0;
	Dimensionar carrito[10];
	Dimensionar precios[10];
	precios[0] =0;
	precios[1] =0;
	precios[2] =0;
	precios[3] =0;
	precios[4] =0;


	Repetir
		Escribir "|| Catalogo ||";
		Escribir "||0. Carrito ||";
		Escribir "";
		producto1 = "1.Guantes de calavera";
		Escribir producto1;
		producto2 = "2.Pijama hello kitty";
		Escribir producto2;
		producto3 = "3.Pantalon de cuadros";
		Escribir producto3;
		producto4 = "4.Aretes de fresa";
		Escribir producto4;
		producto5 = "5.Collar de flor";
		Escribir producto5;
		Leer opcion;
		Segun opcion Hacer
			caso 0:
				Limpiar Pantalla;
				si precios[0] = 0 Entonces
					Escribir "Error carrito vacio, porfavor reinicia el programa o añade un producto";
				FinSi
				para it = 0 Hasta i-1 Hacer
					Escribir carrito[it];
				FinPara
				para ite = ra Hasta i-1 Hacer
					si precios[ite] = 0 Entonces
						Escribir "vacio";
					SiNo 
						total = total + precios[ite];
						ra = ra +1;
					FinSi
				FinPara
				Escribir "";
				Escribir "El total del carrito es: " + ConvertirATexto(total);
				Escribir "";
				Escribir Sin Saltar "Quieres eliminar un producto de tu carrito?(si/no): ";
				Leer respuesta;
				si respuesta = "si" Entonces
					Escribir "Que producto deseas eliminar?(orden de 0-cantidad de productos-1): ";
					Leer ProductoE;
					precios[ProductoE] = 0;
					carrito[ProductoE] = "vacio";
					Escribir "Producto eliminado con exito del carrito";
					Esperar Tecla;
					Limpiar Pantalla;
				SiNo
					Esperar Tecla;
					Limpiar Pantalla;
					
				FinSi
				
			caso 1:
				Limpiar Pantalla;
				Escribir "°° producto °°";
				Escribir "";
				Escribir "Precio:15000 ";
				Escribir "Añadir al carrito";
				Leer OpCarrito;
				si OpCarrito = "añadir" Entonces
					precio1 = 15000;
					carrito[i] = producto1;					
					precios[i] = precio1;
					i = i + 1;
					
				FinSi
				Limpiar Pantalla;
				
			caso 2:
				Limpiar Pantalla;
				Escribir "°° producto °°";
				Escribir "";
				Escribir "Precio:45000 ";
				Escribir "Añadir al carrito";
				Leer OpCarrito;
				si OpCarrito = "añadir" Entonces
					precio2 = 45000;
					carrito[i] = producto2;					
					precios[i] = precio2;
					i = i + 1;
					
				FinSi
				Limpiar Pantalla;
				
			caso 3:
				Limpiar Pantalla;
				Escribir "°° producto °°";
				Escribir "";
				Escribir "Precio:28000 ";
				Escribir "Añadir al carrito";
				Leer OpCarrito;
				si OpCarrito = "añadir" Entonces
					precio3 = 28000;
					carrito[i] = producto3;					
					precios[i] = precio3;
					i = i + 1;
					
				FinSi
				Limpiar Pantalla;
				
			caso 4:
				Limpiar Pantalla;
				Escribir "°° producto °°";
				Escribir "";
				Escribir "Precio:7500 ";
				Escribir "Añadir al carrito";
				Leer OpCarrito;
				si OpCarrito = "añadir" Entonces
					precio4 = 7500;
					carrito[i] = producto4;					
					precios[i] = precio4;
					i = i + 1;
					
				FinSi
				Limpiar Pantalla;
				
			caso 5:	
				Limpiar Pantalla;
				Escribir "°° producto °°";
				Escribir "";
				Escribir "Precio:12400 ";
				Escribir "Añadir al carrito";
				Leer OpCarrito;
				si OpCarrito = "añadir" Entonces
					precio5 = 12400;
					carrito[i] = producto5;					
					precios[i] = precio5;
					i = i + 1;
					
				FinSi
				Limpiar Pantalla;
				
			De Otro Modo:
				Limpiar Pantalla;
				Escribir "Producto inexistente, presiona una tecla para volver al catalogo...";
				Esperar Tecla;
				Limpiar Pantalla;
				Escribir "Volviendo al catalogo...";
				Escribir "";
		FinSegun
	Mientras Que retroceder = Verdadero

FinAlgoritmo
