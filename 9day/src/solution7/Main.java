package solution7;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new Aservice());
		controller.service.login();

	}

}
