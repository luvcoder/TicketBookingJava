import java.util.Map;
import java.util.HashMap;
public class Train {
    private int trainID;
    private String trainName;
    private Map<Station,Double>trainStationsWithFares;
    public Train(int ID,String trainName,Station[] stations){
        trainStationsWithFares=new HashMap<Station,Double>();
        for (Station s: stations) trainStationsWithFares.put(s,(0.0));
    }
    public String getTrainName(){return trainName;}
    public void setTrainName(String trainName){this.trainName=trainName;}
    public int getTrainID(){return trainID;}
    public void setTrainID(int trainID){this.trainID=trainID;}
}
