public class PersonInfo {
    public int sNum;
    public String sName;

    public PersonInfo(int sNum, String sName){
        this.sNum = sNum;
        this.sName = sName;
    }

    public void ShowPersonInfo(){
        System.out.println("학번 : "+sNum);
        System.out.println("이름 : "+sName);
    }
}
