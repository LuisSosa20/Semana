public class Conversion {
    public double convertir(double metros) {
        return metros * 100;
     }
    
     public double convertir(double metros, String unidaddestino) {
        if (unidaddestino.equalsIgnoreCase("km")) {
            return metros/1000;
        } else{
            return metros;
        }
     }
    public static void main(String[] args) throws Exception {
        Conversion conv = new Conversion();
        System.out.println("5 metros a cm: "+ conv.convertir(5)+"cm");
    }
}
