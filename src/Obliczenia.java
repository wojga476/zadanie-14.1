public class Obliczenia {

    private Double kg;
    private Double g;
    private Double mg;
    private Double m;
    private Double cm;
    private Double mm;

    public String obliczeniaWag(String kilogramy, String gramy, String miligramy) {
        System.out.println("Przeliczono wartość miar");
        if (kilogramy!=null && !"".equals(kilogramy)) {
            kg = Double.valueOf(kilogramy);
            g = kg * 1000;
            mg = g * 1000;
        } else if (gramy!=null && !"".equals(gramy)) {
            g = Double.valueOf(gramy);
            kg = g / 1000;
            mg = g * 1000;
        } else if (miligramy!=null&& !"".equals(miligramy)) {
            mg = Double.valueOf(miligramy);
            g = mg / 1000;
            kg = g / 1000;
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartosc wag przeliczona na: " + "\n" + "Kilogramy: " + kg + "\n" + "Gramy: " + g + "\n" + "Miligramy: " + mg;
    }

    public String obliczeniaMiar(String metry, String milimetry, String centymetry) {
        System.out.println("Przeliczono wartość miar ");
        if (metry!=null && !"".equals(metry)) {
            m = Double.valueOf(metry);
            cm = m * 100;
            mm = cm * 10;
        } else if (centymetry!=null && !"".equals(centymetry)) {
            cm = Double.valueOf(centymetry);
            m = cm / 100;
            mm = cm * 10;
        } else if (milimetry!=null&& !"".equals(milimetry)) {
            mm = Double.valueOf(milimetry);
            cm = mm / 10;
            m = cm / 100;
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartosc miar przeliczona na: " + "\n" + "Metry: " + m + "\n" + "Centymetry: " + cm + "\n" + "Milimetry: " + mm;
    }
}
