package solution7.problem3;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

	private static void method(HttpServlet servlet) {
		servlet.service();
	}
	
	

}
