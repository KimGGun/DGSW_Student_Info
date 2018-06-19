import java.util.Scanner;

public class personManager implements command{
    final int MAX_CNT = 100;
    PersonInfo[] personInfo = new PersonInfo[MAX_CNT];

    int cnt = 0;
    Scanner scanner = new Scanner(System.in);

    public int search (int snum){
        for(int i = 0 ; i < cnt ; i++){
            if(personInfo[i].sNum == snum){
                System.out.println();
                return i;
            }
        }

        return -1;
    }

    private PersonInfo InputInfo(){
        System.out.print("학번 : ");
        int num = Integer.parseInt(scanner.next());
        System.out.print("이름 : ");
        String name = scanner.next();

        PersonInfo temp = new PersonInfo(num, name);

        return temp;
    }

    private PersonInfo SchoolInputInfo(){
        System.out.print("학번 : ");
        int num = Integer.parseInt(scanner.next());
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.printf("전공 : ");
        String major = scanner.next();
        System.out.printf("학년 : ");
        int year = Integer.parseInt(scanner.next());

        PersonInfo temp = new SchoolPersonInfo(num, name, major, year);

        return temp;
    }

    private PersonInfo CompanyInputInfo(){
        System.out.print("학번 : ");
        int num = Integer.parseInt(scanner.next());
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.printf("회사 : ");
        String company = scanner.next();

        PersonInfo temp = new CompanyPersonInfo(num, name, company);

        return temp;
    }

    public void inputData(){
        System.out.println("1. 일반 / 2. 학교 / 3. 회사");
        System.out.print("선택 >> ");
        int command = scanner.nextInt();

        if(command == m_one){
            personInfo[cnt++] = InputInfo();
        }

        if(command == m_two){
            personInfo[cnt++] = SchoolInputInfo();
        }

        if(command == m_three){
            personInfo[cnt++] = CompanyInputInfo();
        }

        return;
    }

    public void deleteData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 정보의 학번 : ");
        int sNum = scanner.nextInt();
        int temp = -1;
        if((temp=search(sNum))!=-1)
        {
           for(int i = temp; i < cnt-1; i++)
           {
               personInfo[i] = personInfo[i+1];
           }
           personInfo[cnt--] = null;
           System.out.println("데이터 삭제 완료");
        }
    }

    public void searchData() {
        int temp = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 학생의 학번을 입력하세요 : ");
        int sNum = scanner.nextInt();
        if((temp = search(sNum)) == -1){
            System.out.println("해당 데이터가 존재하지 않습니다.");
            return;
        }
        personInfo[temp].ShowPersonInfo();
        System.out.println("데이터 검색이 완료되었습니다.");
        return;
    }

}
