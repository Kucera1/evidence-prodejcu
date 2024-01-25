import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String jmenoPrijmeni = "Jaroslav Kučera";
        LocalDate.of(1992, 4, 9);
        int pocetDosudSjednanychSmluv = 10;
        int celkoveMnozstviProdaneMrkveVTunach = 50;
        String nazevMestaKdeProdejceSidli = "Praha";
        String registracniZnackaVozidla = "3E3 1234";
        String ipAdresaVerzeCtyriFiremnihoPocitace = "0.0.0.0/8";

        float prumerProdaneMrkveNaJednuSmlouvy = celkoveMnozstviProdaneMrkveVTunach/pocetDosudSjednanychSmluv;
        System.out.println("Průměr prodané mrkve na jednu smlouvu je: " +prumerProdaneMrkveNaJednuSmlouvy);




    }
}
