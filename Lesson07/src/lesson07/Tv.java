package lesson07;

public class Tv {
   //필드 (맴버 변수)
	// 전원, 채널 , 볼륨
	
	// 메서드(함수,기능을담당)
	//전원조절,채널 업 다운, 볼륨 업 다운
	
	
	boolean power;
	int channel;
	int volume;
	
	void dopower() {
		power=!power;
	}
	void channelup() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void volumeUp() {
		volume++;
	}
	void volumeUpDown() {
		volume--;
	}
	}

