package sg.edu.rp.c346.id21012377.democustomcontactlist;

public class Contact {
    String name;
    int countryCode;
    int phoneNum;
    char gender;

    Contact(String name, int countryCode, int phoneNum, char gender){
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }
}
