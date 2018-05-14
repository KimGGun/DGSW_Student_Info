import java.util.Scanner;

public class Menu {
    public static Scanner input= new Scanner(System.in);
    public static personManager pm = new personManager();

    public static void ShowMenu(){
        System.out.println("=========DGSW 학생 정보시스템=========");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택 >> ");
        int command = input.nextInt();
        if (command == 1) {
            pm.inputData();
        }
        else if(command == 2) {
            pm.searchData();
        }

        else if(command == 3) {
            pm.deleteData();
        }

        else if (command == 4) {
            System.exit(0);
        }
    }
}
