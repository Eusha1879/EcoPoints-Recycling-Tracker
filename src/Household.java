//import LocalDate a
import java.time.LocalDate;
import java.util.ArrayList;
public class Household {// Creating class and declaring with private fields
    private ArrayList<RecyclingEvent>events;
    private String id;
    private String name;
    private String address;
    private LocalDate joiningDate;
    private double totalPoints;
public Household(String id,String name,String address// Adding Constructor
                 ){
    this.id=id;
    this.name=name;
    this.address=address;
    this.events = new ArrayList<>();
    this.joiningDate = LocalDate.now();
    this.totalPoints = 0.0;
}
public String getId(){
    return id;
}
public String getName(){
    return name;
}
public String getAddress(){
    return address;

}
public LocalDate getJoiningDate(){
    return joiningDate;
}
public ArrayList<RecyclingEvent> getEvents(){
    return events;
}
public double getTotalPoints(){
    return totalPoints;
}
    public void addEvent(RecyclingEvent event) {
        this.events.add(event);
        this.totalPoints += event.getEcopoints();
    }

    public double getTotalWeight() {
        double total = 0.0;

        for (RecyclingEvent event : events) {
            total += event.getWeight();
        }

        return total;
    }
}
