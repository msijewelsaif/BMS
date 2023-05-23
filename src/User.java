public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Profile getProfile(){
        return new Profile(this);
    }

    public Profile setProfile(String blood_group, String address){
        return new Profile(this, blood_group, address);
    }
}
