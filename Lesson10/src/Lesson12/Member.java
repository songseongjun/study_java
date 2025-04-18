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
	public Object clone() {
	try {
		return super.clone();	
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
		
	}
	return null;
	}
  }
  

