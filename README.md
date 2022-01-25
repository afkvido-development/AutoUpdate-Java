# AutoUpdate

[<img src="https://raw.githubusercontent.com/afkvido/image-repository/ImageRepo/Modern%20Download%20Button.png" width="225"/>](https://github.com/afkvido-development/AutoUpdate-Java/releases)


Automatically enforce updates to the latest version! (For **Java**)


## How to set this up for your project
If you want updates to be automatically enforced in your Java project, follow these steps.

### Part 1: Set up the API

- [Generate the API](https://github.com/afkvido-development/AutoUpdate-Java-API/generate)
- In your newly generated API, go to `src/API/Stable.latest`, and make the file content exactly what your projects latest stable version is (ex. `0.1.0`)
- If your project also has a beta test, go to `src/API/Beta.latest` and make the file content exactly what your projects latest beta version is (ex. `0.1.1-beta`)
- I recommend [Semantic Versioning](https://semver.org), it's quite clean
- Make sure that your API is a **public** repository.
- Your API should be ready. Remember: you need to update your API every time you update your project version.

### Part 2: Add AutoUpdate to your project

- Git clone this repo `https://github.com/afkvido-development/AutoUpdate-Java.git`
- Copy the **version** folder (`src/version/`) into your Java project.

### Part 3: Configure Autoupdate

- Go to `src/version/Version.java`
- In Version.java:
- Change `Version` to your project's latest version (The same one you put in your API).
- Change `Build` to your project's build. (The same one you put in your API).
- Change `API_URL` to your API's repository URL. (ex. `https://github.com/afkvido-development/AutoUpdate-Java-API`)
- Don't touch `API`, you'll probbably screw this up if you do.
- Change `ProjectName` to whatever your project is called (ex. `myCoolJavaProject`)
- Change `DownloadsURL` to a link where people can download your projects (I reccomend the releases tab of your repository)
- Save Version.java, you should be done for now. Remember: you need to update this file every time you update your project version.

### Part 4: Activate AutoUpdate

- Go to your project's main class
- Import version `import version.CV;`
- In the main function, add `CV.CheckVersion();` at the very start.
