package solution6;
/*
 * 싱글턴 디자인 패턴 : 가상세계에서 유일한 객체를 생성하고자 하는 디자인 패턴
 *  
 */
public class ShopService {
	//private : 외부에서 값을 수정하지못하도록함.
	//static  : 프로그램이 시작되기전에 초기화하기 위함.
	private static ShopService shopService = new ShopService();
	
	//private : 외부에서 생성자를 호출하지 못하도록 생성자 앞에 private를 붙인다.
	private ShopService() {
		
	}
	//public : 외부에서 내부에 생성된 객체를 가져가게하기 위함.
	//static : 1.클래스(정적)멤버필드를 참조해야야함.
	//         2.객체 생성없이 getInstance()를 외부에서 호출할 수 있게 하기위함.
	public static ShopService getInstance() {
		return shopService;
	}
}
