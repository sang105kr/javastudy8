package sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	//case4
	public List<Board> getBoardList() {
		List<Board> list =
			List.of(
				new Board("����1","����1"),
				new Board("����2","����2"),
				new Board("����3","����3")
			);
		return list;
	}

//	public List<Board> getBoardList() {
//		List<Board> list = new ArrayList<>();
//		//case1)
//		Board b1 = new Board("����1","����1");
//		Board b2 = new Board("����2","����2");
//		Board b3 = new Board("����3","����3");
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//		
//		//case2)
////		list.add(new Board("����1","����1"));
////		list.add(new Board("����2","����2"));
////		list.add(new Board("����3","����3"));
//		
//		//case3)
////		for(int i=1; i<=3; i++) {
////			list.add(new Board("����"+i,"����"+i));
////		}
//		
//		return list;
//	}
}
