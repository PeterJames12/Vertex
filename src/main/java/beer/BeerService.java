package beer;

/**
 * @author Vladimir on 8/21/2017.
 */
public class BeerService {

    public static Beer getBeer(BeerType beerType){
        switch (beerType) {
            case HOEGAARDEN:
                return new Hoegaarden();
            case PILSNER:
                return new Pilsner();
            case GARAGE:
                return new Garage();
            case KELLERBEER:
                return new KellerBeer();
            default:
                    return null;
        }
    }
}
