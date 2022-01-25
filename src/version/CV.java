package version;

import java.util.Scanner;

import static version.Version.*;

public interface CV {

    static void CheckVersion () {

        System.out.println(c.rs + "Running " + ProjectName + " version " + c.cy + Version + c.wh + " (" + Build + ")" + c.rs);


        Scanner wait = new Scanner(System.in);

        String connection = ".f";
        connection = URL.read("https://raw.githubusercontent.com/" + API + "/main/src/API/.api");

        if (connection.equals(".f")) {

            System.out.println(c.rd + "Cannot connect to " + ProjectName + " API"+ c.rs);
            System.out.println(c.rd + "API error, make sure you're on the latest version of " + ProjectName + c.rs);
            wait.nextLine();
            System.exit(0);

        } else if (!connection.equals("api") && !connection.equals("api\n")) {
            System.out.println(c.wh + "The API's .api file did not return \"api\"" + c.rs);
            System.out.println(c.rd + "API error, make sure you're on the latest version of " + ProjectName + c.rs);
            wait.nextLine();
            System.exit(0);
        }

        String fetchLatest = ".f";
        fetchLatest = URL.read("https://raw.githubusercontent.com/" + API + "/main/src/API/" + Build + ".latest");


        if (fetchLatest.equals(Version) || fetchLatest.equals(Version + "\n")) {

            System.out.println(c.gr + "You are running the latest version of " + ProjectName + c.rs);

        } else if (fetchLatest.equals(".f")) {

            System.out.println(c.rd + "Cannot connect to " + ProjectName + " API"+ c.rs);
            System.out.println(c.rd + "API error, make sure you're on the latest version of " + ProjectName + c.rs);
            wait.nextLine();
            System.exit(0);

        } else {
            System.out.print(c.yw + "You are running " + ProjectName + " " + c.cy + Version + c.yw + ", the latest version is " + c.cy + fetchLatest.replace("\n", "") + c.yw + ".");
            System.out.println(c.rd + "\nYou are on an unsupported version of " + ProjectName + ". Please update to the latest version of " + ProjectName + "." + c.rs);
            System.out.println(c.cy + "Download the latest version of " + ProjectName + ": " + DownloadsURL);
            wait.nextLine();
            System.exit(0);
        }

    }

}
