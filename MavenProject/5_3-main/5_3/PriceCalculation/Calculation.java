import java.util.List;

public class Calculation {

    public void calculationPrice (List<Road> roadList){
        for ( Road road : roadList ) {
            if (road.getType().equals("Business")) {
                int price = road.getLength() * 10;
                System.out.println("Type of taxi " + road.getType() + " length " + road.getLength() + " price " + price);
            }
            if (road.getType().equals("Default")) {
                int price = road.getLength() * 5;
                System.out.println("Type of taxi " + road.getType() + " length " + road.getLength() + " price " + price);
            }
        }

    }
}
