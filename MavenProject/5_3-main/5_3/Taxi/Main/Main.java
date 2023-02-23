import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        List<Road> roadList = new ArrayList<>();
        Collections.addAll(roadList,
                new Road(10,"Business"),
                new Road(40,"Default"));

        calculation.calculationPrice(roadList);
    }
}
