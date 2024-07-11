package Hw28;

import java.io.Serializable;

public class IceCreamOneScoop implements Serializable {

    String scoopTaste;
    String iceCreamCone;

    public IceCreamOneScoop(String scoopTaste, String iceCreamCone) {
        this.scoopTaste = scoopTaste;
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public String toString() {
        return "IceCreamOneScoop{" +
                "scoopTaste='" + scoopTaste + '\'' +
                ", iceCreamCone='" + iceCreamCone + '\'' +
                '}';
    }

    public String getScoopTaste() {
        return scoopTaste;
    }

    public void setScoopTaste(String scoopTaste) {
        this.scoopTaste = scoopTaste;
    }

    public String getIceCreamCone() {
        return iceCreamCone;
    }

    public void setIceCreamCone(String iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

}
