import java.util.*;

public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId) {
        for (int i = 0; i < vesselList.size(); i++) {
            if (vesselList.get(i).getVesselId().equals(vesselId)) {
                return vesselList.get(i);
            }
        }
        return null;
    }
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> result = new ArrayList<>();
        double maxSpeed = 0;

        for (int i = 0; i < vesselList.size(); i++) {
            if (vesselList.get(i).getAverageSpeed() > maxSpeed) {
                maxSpeed = vesselList.get(i).getAverageSpeed();
            }
        }

        for (int i = 0; i < vesselList.size(); i++) {
            if (vesselList.get(i).getAverageSpeed() == maxSpeed) {
                result.add(vesselList.get(i));
            }
        }

        return result;
    }


}
