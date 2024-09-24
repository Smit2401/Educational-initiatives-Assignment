package facade2;

public class executive {
    public static String getCar(carModel carModel){
        specs spec = new specs();
        switch(carModel)
        {
            case X7M:
                bmw x7 = new X7();
                String x7specs = spec.getX7_specs();
                x7.carSpecs(x7specs);
                return x7.getCar();

            case M5_S:
                bmw m5 = new M5();
                String m5specs = spec.getM5_specs();
                m5.carSpecs(m5specs);
                return m5.getCar();
        }
        return null;
    }
}
