package collections;

public class Taxi {
    private int taxiID;
    private float earning;
    private int availableTime;
    private int lastDrop;

    public int getLastDrop() {
        return lastDrop;
    }

    public void setLastDrop(int lastDrop) {
        this.lastDrop = lastDrop;
    }

    public int getTaxiID() {
        return taxiID;
    }

    public void setTaxiID(int taxiID) {
        this.taxiID = taxiID;
    }

    public float getEarning() {
        return earning;
    }

    public void setEarning(float earning) {
        this.earning = earning;
    }

    public int getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }

    @Override
    public String toString() {
        return "\nTaxi{" +
                "taxiID=" + taxiID +
                ", earning=" + earning +
                ", availableTime=" + availableTime +
                ", lastDrop=" + lastDrop +
                '}';
    }
}

