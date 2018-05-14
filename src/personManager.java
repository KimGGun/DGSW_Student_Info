import java.util.Scanner;

public class personManager {
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

    public void inputData(){
       /*
        for(int i = 0 ; i < MAX_CNT;  i++){
            if(personInfo[i] == null){
                Scanner scanner = new Scanner(System.in);
                System.out.print("학번 : ");
                int sNum = scanner.nextInt();
                System.out.print("이름 : ");
                String sName = scanner.next();
                System.out.println();

                personInfo[i] = new PersonInfo(sNum, sName);
                System.out.println("데이터 입력 완료");
                System.out.println(personInfo[i].sNum+" "+personInfo[i].sName);
                break;
            }
        }
        */

       System.out.print("학번 : ");
       int num = Integer.parseInt(scanner.next());
       System.out.print("이름 : ");
       String name = scanner.next();
       personInfo[cnt++] = new PersonInfo(num, name);
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
