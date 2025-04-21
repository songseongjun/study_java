package Lesson12;

public class Member implements Cloneable{
  String name;
  String tel;
  
  
  Member(String name, String tel){
	  this.name=name;
	  this.tel= tel;
  }
	public String toString() {
		return "name:" + name +",tel:"+tel;
	}
	@Override
	public boolean equals(Object obj) {  //1.set의특징 중복을 허용하지않는다
		return obj !=null && obj instanceof Member
		&&((Member)obj).tel.equals(this.tel);			
	}
	public Member clone() {//클론은 반환타입을 부모타입이든 자식타입이든 바꿀수있다 
		Member member =null;
	try {
		member=(Member)super.clone();	
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
		
	}
	return member;
	}
  }
  

