package version;

import org.jetbrains.annotations.NotNull;

public final @NotNull class Version {

    // Using Semantic versioning

    public @NotNull final static String Version = "0.1.0"; // THIS = CLIENT VERSION (Semantic versioning recommended)

    public @NotNull final static String Build = "Stable"; // THIS = BUILD TYPE (Stable, Beta, Alpha, etc)

    private @NotNull final static String API_URL = "https://github.com/afkvido-development/AutoUpdate-Java-API"; // THIS = URL of the API repository

    public @NotNull final static String API = API_URL.replace("https://github.com/", ""); // DO NOT TOUCH

    public @NotNull final static String ProjectName = "AutoUpdate"; // THIS = THE NAME OF YOUR PROJECT

    public @NotNull final static String DownloadsURL = "https://github.com/afkvido-development/AutoUpdate-Java/releases"; // THIS = DOWNLOADS URL FOR YOUR PROJECT (ex. Releases or GitHub pages)

}
