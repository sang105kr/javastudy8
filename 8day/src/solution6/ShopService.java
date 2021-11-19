package solution6;
/*
 * �̱��� ������ ���� : ���󼼰迡�� ������ ��ü�� �����ϰ��� �ϴ� ������ ����
 *  
 */
public class ShopService {
	//private : �ܺο��� ���� �����������ϵ�����.
	//static  : ���α׷��� ���۵Ǳ����� �ʱ�ȭ�ϱ� ����.
	private static ShopService shopService = new ShopService();
	
	//private : �ܺο��� �����ڸ� ȣ������ ���ϵ��� ������ �տ� private�� ���δ�.
	private ShopService() {
		
	}
	//public : �ܺο��� ���ο� ������ ��ü�� ���������ϱ� ����.
	//static : 1.Ŭ����(����)����ʵ带 �����ؾ߾���.
	//         2.��ü �������� getInstance()�� �ܺο��� ȣ���� �� �ְ� �ϱ�����.
	public static ShopService getInstance() {
		return shopService;
	}
}
