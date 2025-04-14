package lesson07;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
		Tv tv=new Tv();
		System.out.println("Tv리모컨입니다~");
		Scanner scanner =new Scanner(System.in);
		boolean running =true;
		while(true) {
			System.out.println("현재Tv는"+(tv.power ? "켜":"꺼")+"져있습니다");
			System.out.println("채널은"+tv.channel+",볼륨은"+tv.volume+"입니다");
			System.out.println("수행할 메뉴를 선택하세요");
			System.out.println("1.전원관리2.채널업3.채널다운.4볼륨업.5볼륨다운");
			int input =scanner.nextInt();
			switch (input) {
			case 1:
			tv.dopower();
			break;
			case 2:
			tv.channelup();
			break;
			case 3:
			tv.channelDown();
			break;
			case 4:
			tv.volumeUp();
			break;
			case 5:
			tv.volumeUpDown();
			break;
			case 6:
			running =false;
			break;
			default:
			System.out.println("잘못된입력입니다.");
			}
			
		}
	}

}
