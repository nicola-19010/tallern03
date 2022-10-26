import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Mesero {
	public ArrayList<Pedido> pedidoArrayList = new ArrayList<>();

	private void atenderPedido() {
		mostrarMenu();
	}

	private void mostrarMenu(){
		System.out.println("Bienvenido, tenga el menu");
		System.out.println("""
				Platos principales:
				1-x
				2-y""");
		System.out.println("""
				Bebestibles:
				1-x
				2-y""");
	}

	private void PedirQueClienteDigaSuPedido(){
		int  platoPrincipal = ingresar();
		int  bebestible = ingresar();
		Pedido pedido = new Pedido();
		pedido.setPlatoPrincipal();
		pedido.setBebestible();
	}

	public static int ingresar() {
		Scanner teclado = new Scanner(System.in);
		boolean esNumero = false;
		int opcion = 0;

		do {
			try {
				opcion = teclado.nextInt();
				esNumero = true;
			} catch (Exception e) {
				teclado.next();
				System.out.println("Ingrese una opcion valida del menu");
			}
		} while (!esNumero);

		if (opcion < 1 || opcion > 2) {
			System.out.println("Ingrese una opcion valida del menu");
			return ingresar();
		}
		return opcion;
	}

	//Método para validar una entrada.


}