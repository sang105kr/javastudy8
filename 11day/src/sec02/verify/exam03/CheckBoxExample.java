package sec02.verify.exam03;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setListener(
				new CheckBox.OnSelectListener() {
					
					@Override
					public void onSelect() {
						System.out.println("����� �����մϴ�.");
						
					}
				}
		);
		checkBox.select();
	}

}
