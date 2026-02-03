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

}
