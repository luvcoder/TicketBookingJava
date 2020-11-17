public class SeniorCitizen extends Passenger{
    public static int minAge;
    static{minAge=60;}
    public SeniorCitizen(String name, int age, String address,int idCard,long contact){
        this.setName(name);
        this.setAge(age);
        this.setContact(contact);
        this.setAddress(address);
        this.setIdCard(idCard);
    }
    @Override
    public PassengerType getPassengerType(){return PassengerType.SENIOR_CITIZEN;}
    public void evaluate(int age){
        if(age<minAge)
            System.out.println("Book general or child ticket as applicable.");
    }
}
