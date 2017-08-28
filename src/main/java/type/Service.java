package type;

import java.util.Arrays;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class Service {

    public static void main(String[] args) {

        final Beer jhongaspar = BeerServise.getBeer(BeerType.JHONGASPAR);
        final Beer hopfen = BeerServise.getBeer(BeerType.HOPFEN);
        final Beer obolon = BeerServise.getBeer(BeerType.OBOLON);

        jhongaspar.drink();
        hopfen.drink();
        obolon.drink();

        System.out.println(Arrays.toString(BeerType.values()));

        for (BeerType beerType : BeerType.values()) {
            System.out.println(beerType);
        }
    }
}
