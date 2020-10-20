
public class Main {

	public static void main(String[] args) {
		Fiat carro = new Fiat();
		Honda moto = new Honda();
		
		System.out.println(carro.marca());
		System.out.println(carro.marca("Brava"));
		System.out.println(moto.marca());

	}

}
