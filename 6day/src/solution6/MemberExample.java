package solution6;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member();
		member.name = "ÃÖÇÏ¾á";
		member.age = 23;
		
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.id);
		System.out.println(member.password);
		
		Member[] members = new Member[3];
		members[0] = new Member();
		members[0].name ="È«±æµ¿1";
		members[0].age = 10;
		
		
		members[1] = new Member();
		members[1].name ="È«±æµ¿2";
		members[1].age = 20;
		
		members[2] = new Member();
		members[2].name ="È«±æµ¿3";
		members[2].age = 30;
		
		for(Member m : members) {
			System.out.println(m.name);
			System.out.println(m.age);
			System.out.println(m.id);
			System.out.println(m.password);
			
			m.smile();
			System.out.println("===");
		}
		
		Member member2 = new Member("È«±æµ¿", "hong");
		System.out.println(member2.name);
		System.out.println(member2.id);
	
	}
}
