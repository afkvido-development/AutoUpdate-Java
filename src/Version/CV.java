package Version;

import java.util.Scanner;
import static Version.Version.API_URL;

public interface CV {

    static void CheckVersion () {

        Scanner wait = new Scanner(System.in);

        String connection = URL.read(API_URL + "/tree/main");

    }

}
