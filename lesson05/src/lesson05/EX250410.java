package lesson05;
public class EX250410 {
	public static void main(String[] args) {
		// 상자 갯수세기
		//사과를한상자당 10개씩 과일을 담을수있습니다
		//사과의 갯수를 123개라고했을때 필요한 상자의 갯수구하기(상자갯수는 13개가필요)
		//연산자만사용
		int box=10;
		int apple =123;
		int boxs =(apple/box)+(apple%box==0? 0:1);
		System.out.println("박스의갯수는:"+boxs);
		
		
		
		//2.합계구하기
		// 1+(-2)+3+(-4)..(-98) + 99 + (-100)
		//반복문사용
		
	   int sum = 0;
	   for(int i = 1; i<=100;i++){
//	   if( i%2==0) {
//		   sum+=-i;
//	   }
//	   else {
//		   sum+=-i;
//	   } 
	   sum+=i%2==0?-i:i;
	   }
	   
		System.out.println(sum);
		
		
		
		// 소수판정(prime number)
		//지정된 자연수가 소수인지 아닌지를출력
		// 반복문사용 아까약수구할려는식과비슷
         int num =7;
         int count =0;
         
         for(int i =1; i<=num; i++) {
        	 System.out.printf("%d:%d>>%s\n",i,num%i == 0 ?"약수":"약수아님");
        	 if(num%i==0) {
        		 count++;
        	 }
         }
    System.out.println(count == 2 ?"소수":"소수아님");
	
		
	}

}
