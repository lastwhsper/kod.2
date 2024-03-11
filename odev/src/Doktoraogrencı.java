public class Doktoraogrencı extends Sınıf{
    String tezkonusu;
    String danışman;
    boolean yeterlilik;
    public String geç(boolean yeterlilik){
        if (yeterlilik==true){
            return " geçti";

        }else {
            return "geçemedi";
        }
    }
}
