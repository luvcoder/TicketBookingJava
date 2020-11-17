public class General extends Passenger {
    public General(String name,int age, String address,int idCard,long contact ){
        this.setName(name);
        this.setAge(age);
        this.setContact(contact);
        this.setAddress(address);
        this.setIdCard(idCard);
    }
    @Override
    public PassengerType getPassengerType() {return  PassengerType.GENERAL;}
}
