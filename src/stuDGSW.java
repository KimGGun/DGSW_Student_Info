import java.util.Scanner;

public class stuDGSW {
    public static void showMenu(){
        System.out.println("1. 데이터 입력");
        System.out.println("2. 프로그램 종료");
        System.out.print("선택 >> ");
    }

    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학번 : ");
        int sNum = scanner.nextInt();
        System.out.print("이름 : ");
        String sName = scanner.next();
        System.out.println();

        PersonInfo person = new PersonInfo(sNum, sName);
        person.ShowPersonInfo();
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            showMenu();
            int command = sc.nextInt();
            if (command == 1) {
                readData();
            }
            else if (command == 2 ) {
                System.exit(0);
            }
        }
    }
}
