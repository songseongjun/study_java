package card;

import java.security.DomainCombiner;

public class Card {
 int number; // 순서 2, 3, 4 ........10 , J,Q,K,A
 int kind;  // spade ,diamond ,heart , clover
 Card (int kind, int number){
	 this.kind=kind;
	 this.number=number;
 }
 
 public String toString() {
	 //0,1 
	 String numbers ="23456789XJQKA";
	 String kinds = "♣♥◆♠";
	 return "[" + kinds.charAt(kind)+","+numbers.charAt(number)+ "]";
	
 }
}
