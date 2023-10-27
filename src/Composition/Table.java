import java.util.ArrayList;

public class Table {
    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs, Integer length)
    {
        for (int i = 0; i < numLegs; i++)
        {
            legs.add(new Leg(length));
        }
    }
}
