package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
public static void main(String[] args) {
	List<Integer> l =new ArrayList<Integer>(Arrays.asList(10,20,30,10,30,22,11,2,3,4));
	System.out.println(l);

	
	
//	Arrays.asList(new Integer[] {10,20,30});//원래는 이거임위에껀줄인거
	                                        //타입은 리스트인데 add하면터짐
//	List<Integer> list =new ArrayList<Integer>();
	Comparator<Integer> comparator =new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return (o1-o2);//이게 오름차순임30,30,22,20,이케나옴
			               //앞에 -부히면이게내림차순으로나옴 2,3,45,6,7,
		}
	};
	l.sort(comparator);
	System.out.println(l);
	
l.sort(new Comparator<Integer>() {
	@Override//이거부를려면 Alt 누르고 s하고 v누르면됨 그게 오버라이드부르는것!
	public int compare(Integer o1, Integer o2) {//compare애가 이름 애가처리한게Comparator임
		
 		return o2 - o1;
	}
});


	l.sort((Integer o1, Integer o2)-> {      
		return o2-o1;
		}
	);
	
//      l.sort((o1,o2)->o2-o1);
      


}
}
