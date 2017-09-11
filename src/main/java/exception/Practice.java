package exception;


import java.util.LinkedList;
import java.util.List;

/**
 * @author Vladimir on 8/31/2017.
 */
public class Practice {

    public static void main(String[] args) {
        int check = 0;

        try {
            check = check("");
        } catch (NoProtocolException e) {
            e.printStackTrace();
        } catch (NoUrlException e) {
            e.printStackTrace();
        } catch (SiteNotFoundException e) {
            e.printStackTrace();
        } finally {
            switch (check){
                case 400:
                    System.out.println("400");
                    break;
                case 200:
                    System.out.println("200");
                default:
            }
        }
    }

    static int check(String url) throws NoProtocolException, NoUrlException, SiteNotFoundException {
        List<String> okSites = new LinkedList<>();
        List<String> badSites = new LinkedList<>();

        okSites.add("https://facebook.com");
        badSites.add("https://vk.com");


        if (url.isEmpty()){
            throw new NoUrlException();
        }else if (!url.startsWith("https://")){
            throw new NoProtocolException();
        } else if (okSites.contains(url)){
            return 200;
        } else if (badSites.contains(url)) {
            return 400;
        } else if (!okSites.contains(url) && !badSites.contains(url)){
            throw new SiteNotFoundException();
        }

        return 0;
    }

}
