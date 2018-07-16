public class Obliczenia {

    private Double kg;
    private Double g;
    private Double mg;
    private Double m;
    private Double cm;
    private Double mm;

    public boolean sprawdzenieDlugosci(String metry, String milimetry, String centymetry) {
        if ((metry!=null && !"".equals(metry))) {
            m = Double.valueOf(metry);
            if (m < 0)
                return false;
        } else if (centymetry!=null && !"".equals(centymetry)) {
            cm = Double.valueOf(centymetry);
            if (cm < 0)
                return false;
        } else if (milimetry!=null && !"".equals(milimetry)) {
            mm = Double.valueOf(milimetry);
            if (mm < 0)
                return false;
        } else
            return false;
        return true;
    }
    public boolean sprawdzenieMasy(String kilogramy, String gramy, String miligramy) {
        if (kilogramy!=null &&!"".equals(kilogramy) ) {
            kg = Double.valueOf(kilogramy);
            if (kg < 0)
                return false;
        } else if (gramy!=null&&!"".equals(gramy)) {
            g = Double.valueOf(gramy);
            if (g < 0)
                return false;
        } else if (miligramy!=null&& !"".equals(miligramy)) {
            mg = Double.valueOf(miligramy);
            if (mg < 0)
                return false;
        } else {
            return false;
        }
        return true;
    }
    public String obliczeniaWag(String kilogramy, String gramy, String miligramy) {
        System.out.println("Przeliczono wartości wag: ");
        if (kilogramy!=null && !"".equals(kilogramy)) {
            kg = Double.valueOf(kilogramy);
            g = kg * 1000;
            mg = g * 1000;
            System.out.println("Podana wartość to kilogramy: "+kg);
            System.out.println("Gramy: "+g);
            System.out.println("Miligramy: "+mg);
        } else if (gramy!=null && !"".equals(gramy)) {
            g = Double.valueOf(gramy);
            kg = g / 1000;
            mg = g * 1000;
            System.out.println("Podana wartość to gramy: "+g);
            System.out.println("Kilogramy: "+kg);
            System.out.println("Miligramy: "+mg);
        } else if (miligramy!=null&& !"".equals(miligramy)) {
            mg = Double.valueOf(miligramy);
            g = mg / 1000;
            kg = g / 1000;
            System.out.println("Podana wartość to miligramy: "+mg);
            System.out.println("Kilogramy: "+kg);
            System.out.println("gramy: "+g);
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartość wag przeliczona na: " + "\n" + "Kilogramy: " + kg + "\n" + "Gramy: " + g + "\n" + "Miligramy: " + mg;
    }
    public String obliczeniaMiar(String metry, String milimetry, String centymetry) {
        System.out.println("Przeliczono wartość miar: ");
        if (metry!=null && !"".equals(metry)) {
            m = Double.valueOf(metry);
            cm = m * 100;
            mm = cm * 10;
            System.out.println("Podana wartość to metry: "+m);
            System.out.println("Centymetry: "+cm);
            System.out.println("milimetry: "+mm);
        } else if (centymetry!=null && !"".equals(centymetry)) {
            cm = Double.valueOf(centymetry);
            m = cm / 100;
            mm = cm * 10;
            System.out.println("Podana wartość to centymetry: "+cm);
            System.out.println("Metry: "+m);
            System.out.println("Milimetry: "+mm);
        } else if (milimetry!=null && !"".equals(milimetry)) {
            mm = Double.valueOf(milimetry);
            cm = mm / 10;
            m = cm / 100;
            System.out.println("Podana wartość to milimetry: "+mm);
            System.out.println("Metry: "+m);
            System.out.println("Centymetry: "+cm);
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartosc miar przeliczona na: " + "\n" + "Metry: " + m + "\n" + "Centymetry: " + cm + "\n" + "Milimetry: " + mm;
    }
}
