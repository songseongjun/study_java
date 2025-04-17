package Lesson9_1;

public class Complexer implements ComplexerInter {
	@Override
	public void send(String tel) {
		System.out.println(fAX_NUMBER+"에서"+tel+"로 FAX전송");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel+"에서"+fAX_NUMBER+"로 FAX수신");
	}
	@Override
	public void scan() {
		System.out.println("스캔실행");
	}
	@Override
	public void print() {
		System.out.println("출력실행");
	}
}
