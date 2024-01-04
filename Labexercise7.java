
interface ApplianceTest {
    boolean test(Appliance appliance);
}


class Appliance {
    private String name;
    private boolean isOn;

    public Appliance(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }
}

public class Labexercise7 {
    public static void main(String[] args) {
        
        Appliance refrigerator = new Appliance("Refrigerator", true);
        Appliance washingMachine = new Appliance("Washing Machine", false);

        
        ApplianceTest isOnTest = appliance -> appliance.isOn();
        ApplianceTest isRefrigeratorTest = appliance -> appliance.getName().equalsIgnoreCase("Refrigerator");

       
        System.out.println("Is the refrigerator on? " + isOnTest.test(refrigerator));
        System.out.println("Is the washing machine on? " + isOnTest.test(washingMachine));

        System.out.println("Is it a refrigerator? " + isRefrigeratorTest.test(refrigerator));
        System.out.println("Is it a refrigerator? " + isRefrigeratorTest.test(washingMachine));
    }
}
