package solution7.problem4;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
	}

	private static void method(HttpServlet servlet) {
		servlet.service();	
	}	
}
