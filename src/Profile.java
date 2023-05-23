public class Profile implements IProfile{
    User user;
    String blood_group;
    String address;
    public Profile(User user, String blood_group, String address) {
        this.user = user;
        this.blood_group = blood_group;
        this.address = address;
    }

    @Override
    public void donateBlood(Profile receiver) {
        if (this.blood_group.equals(receiver.blood_group)){
            System.out.println("Can donate blood");
        }else{
            System.out.println("Can't donate blood");
        }
    }

    public Profile(User user) {
        this.user = user;
    }

    void show(){
        String name = this.user.username;
        String my_address = this.address;
        String blood_group = this.blood_group;
        System.out.println("###### Profile ########");
        System.out.println("Name\taddress\tblood_group");
        System.out.println(name + "\t" + my_address + "\t" + blood_group);
    }
}
