package Version;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public @NotNull interface URL {

    private static @NotNull String check(String c) throws Exception {


        java.net.URL oracle = new java.net.URL(c);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        StringBuilder r = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            r.append(inputLine).append("\n");

        in.close();
        return r.toString();

    }

    static @NotNull String read (String f) {

        String  c = f;
        String e = "";

        try {
            e = check(c);
        } catch (Exception ignored) {} ;

        return e;
    }


}
