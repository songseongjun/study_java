package card;

import java.util.Arrays;

public class Player {
    Card[]cards =new Card[5];
    String name;
    
    Player(String name){
    	this.name=name;
    }
    public String toString() {
    	return Arrays.toString(cards);
	return "[" + kinds.charAt(kind) + "," + numbers.charAt(number) +  "]";
    }

}
