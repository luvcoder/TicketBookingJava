public class Ticket {
    private long ticketID;
    private  String status;
    private long trainID;
    private long stationID_D;
    private long stationID_A;
    private int berthnumber;
    private int DepartureTime;
    public long getTicketID(){return  ticketID;}
    public void setTicketID(long ticketID){this.ticketID=ticketID;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
    public long getTrainID(){return  trainID;}
    public void setTrainID(int trainID){this.trainID=trainID;}
    public long getStationID_D(){return  stationID_D;}
    public void setStationID_D(long stationID_D){this.stationID_D=stationID_D;}
    public long getStationID_A(){return  stationID_A;}
    public void setStationID_A(long stationID_A){this.stationID_A=stationID_A;}
    public int getBerthnumber(){return berthnumber;}
    public void setBerthnumber(int berthnumber){this.berthnumber=berthnumber;}
    public int getDepartureTime(){return DepartureTime;}
    public void setDepartureTime(int DepartureTime){this.DepartureTime=DepartureTime;}
}
