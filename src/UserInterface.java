import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(":");
            Vessel v = new Vessel(data[0], data[1],
                    Double.parseDouble(data[2]), data[3]);
            util.addVesselPerformance(v);
        }

        String id = sc.nextLine();

        Vessel found = util.getVesselById(id);
        if (found != null) {
            System.out.println(found.getVesselId() + " | " +
                    found.getVesselName() + " | " +
                    found.getVesselType() + " | " +
                    found.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }

        List<Vessel> list = util.getHighPerformanceVessels();
        for (int i = 0; i < list.size(); i++) {
            Vessel v = list.get(i);
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed() + " knots");
        }
    }
}
