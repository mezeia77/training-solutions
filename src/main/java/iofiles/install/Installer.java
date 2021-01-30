package iofiles.install;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    public void install(String folder){
        Path target = Path.of(folder);
        if(!Files.exists(target) ||!Files.isDirectory(target)){
            throw new IllegalArgumentException("No such directory");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("\\install\\install.txt")))){
            String line;
            while ((line=bufferedReader.readLine()) !=null){
                if (line.endsWith("/")) {
                    Files.createDirectories(target.resolve(line));
                } else {
                    Files.copy(this.getClass().getResourceAsStream("\\install\\" + line), target.resolve(line), StandardCopyOption.REPLACE_EXISTING);
                }
            }

            } catch (IOException ioe){
            throw new IllegalStateException("Can't copy files ", ioe);
        }

    }
}
