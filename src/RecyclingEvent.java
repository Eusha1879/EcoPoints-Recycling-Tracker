import java.io.Serializable;
import java.time.LocalDate;
public class RecyclingEvent implements Serializable {
    private String materialType;
    private double weight;
    private double ecopoints;
    private LocalDate date;

    public RecyclingEvent(String materialType, double weight){
        this.materialType = materialType;
        this.weight = weight;
        this.date = LocalDate.now();
        this.ecopoints = weight*10;
    }
    public String getMaterialType(){
        return materialType;
    }
    public double getWeight(){
        return weight;
    }
    public LocalDate getDate(){
        return date;
    }
    public double getEcopoints(){
        return ecopoints;
    }
    @Override
    public String toString() {
        return "Date: "+this.date+
                "\nMaterial Type: "
                +this.materialType+"\nWeight: "
                +this.weight+"\nEco-Points: "
                +this.ecopoints;
    }
}

