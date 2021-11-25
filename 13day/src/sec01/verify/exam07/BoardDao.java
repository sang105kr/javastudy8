package sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	//case4
	public List<Board> getBoardList() {
		List<Board> list =
			List.of(
				new Board("力格1","力格1"),
				new Board("力格2","力格2"),
				new Board("力格3","力格3")
			);
		return list;
	}

//	public List<Board> getBoardList() {
//		List<Board> list = new ArrayList<>();
//		//case1)
//		Board b1 = new Board("力格1","力格1");
//		Board b2 = new Board("力格2","力格2");
//		Board b3 = new Board("力格3","力格3");
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//		
//		//case2)
////		list.add(new Board("力格1","郴侩1"));
////		list.add(new Board("力格2","郴侩2"));
////		list.add(new Board("力格3","郴侩3"));
//		
//		//case3)
////		for(int i=1; i<=3; i++) {
////			list.add(new Board("力格"+i,"郴侩"+i));
////		}
//		
//		return list;
//	}
}
