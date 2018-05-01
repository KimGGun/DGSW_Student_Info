public class PersonInfo {
    public static int sNum;
    public static String sName;

    public PersonInfo(int sNum, String sName){
        this.sNum = sNum;
        this.sName = sName;
    }

    public void ShowPersonInfo(){
        System.out.println("입력된 정보 출력...");
        System.out.println("학번 : "+sNum);
        System.out.println("이름 : "+sName);
    }
}
