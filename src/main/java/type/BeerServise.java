package type;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class BeerServise {

    public static Beer getBeer(BeerType beerType){

        switch (beerType){
            case JHONGASPAR:
                return new Jhongaspar();
            case HOPFEN:
                return new Hopfen();
            case OBOLON:
                return new Obolon();
            default:
                return null;
        }
    }
}
