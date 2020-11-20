public abstract class Passenger {
    private String name;
    private  int age;
    public  String address;
    private long idCard;
    private long contact;
    public String getAddress(){return  address;}
    public void setAddress(String address){this.address=address;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public long getIdCard(){return  idCard;}
    public void setIdCard(long idCard){this.idCard=idCard;}
    public long getContact(){return  contact;}
    public void setContact(long contact){this.contact=contact;}
    public int getAge(){return  age;}
    public void setAge(int age){this.age=age;}
    public abstract PassengerType getPassengerType();
}
