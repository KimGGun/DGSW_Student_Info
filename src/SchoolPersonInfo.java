public class SchoolPersonInfo extends PersonInfo {
    public String major;
    public int year;


    public SchoolPersonInfo(int sNum, String sName, String major, int year) {

        super(sNum,sName);
        this.major = major;
        this.year = year;

    }

    @Override
    public void ShowPersonInfo() {

        super.ShowPersonInfo();
        System.out.println("전공 : "+ major);
        System.out.println("학년 : "+ year);

    }
}
