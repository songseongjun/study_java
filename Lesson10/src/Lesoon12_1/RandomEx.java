package Lesoon12_1;

import java.util.Random;

public class RandomEx {
public static void main(String[] args) {
	Random random =new Random(0);// seed값을 0으로 고정해준거s eed가 값이 같으면 같은게계속나온다
	                             //seed에의해 이미 값은 정해져있다!
	random.nextDouble(); //Math.random();
	                     //
    	for(int i=0; i<10;i++) {
		System.out.println(random.nextInt(6)+1);
	}
}
}
