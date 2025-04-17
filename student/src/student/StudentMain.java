package student;

public class StudentMain {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        System.out.println("========== 학생 점수 관리 프로그램 ==========");

        while (true) {
            int menu = StudentUtils.nexInt("\n1. 등록  2. 조회  3. 수정  4. 삭제 5.과목별 평균 6.석차순 조회  7.종료\n메뉴를 선택하세요 > ");

            switch (menu) {
                case 1:
                    System.out.println("[학생 등록 기능 실행]");
                    service.register();
                    break;
                case 2:
                    System.out.println("[학생 전체 조회 기능 실행]");
                    service.read();
                    break;
                case 3:
                    System.out.println("[학생 정보 수정 기능 실행]");
                    service.modify();
                    break;
                
                case 4:
                    System.out.println("[학생 정보 삭제 기능 실행]");
                    service.remove();
                    break;
                case 5:
                	System.out.println("[과목별 평균 기능 실행");
                	service.avg();
                	break;
                case 6:
                	System.out.println("석차순 조회");
                	service.sbts();
                	break;
                case 7:
                    System.out.println("프로그램을 종료합니다. Bye~!");
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 입력입니다. 1~5 사이의 숫자를 입력해주세요.");
            }
        }
    }
}

