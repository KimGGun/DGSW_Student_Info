public class CompanyPersonInfo extends PersonInfo {
    public String company;

    public CompanyPersonInfo(int sNum, String sName, String company){
        super(sNum, sName);
        this.company = company;
    }

    @Override
    public void ShowPersonInfo() {
        super.ShowPersonInfo();
        System.out.println("회사 : "+company);
    }
}
