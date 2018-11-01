public class SpainGreeter implements Greeter {
	@Override
	public void login(Account guest) {
		System.out.println(String.format("Buenos Dias, %s.", guest.getName()));
	}


	@Override 
	public void logout(Account guest) {
		System.out.println("Hasta luego");
	}


	@Override
	public void like(Account guest) {
		System.out.println("Gracias");
	}
}
