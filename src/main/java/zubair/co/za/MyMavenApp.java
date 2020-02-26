package zubair.co.za;

public class MyMavenApp {
    
    private String FirstName, Surname;
    
    public MyMavenApp(String FirstName, String Surname){
        this.FirstName = FirstName;
        this.Surname = Surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
    

}
