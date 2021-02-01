package iodatastream.training;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeManager {

    public static void main(String[] args) {
        Path path = Path.of("src\\main\\resources\\iodatastream\\data.dat");

        try (DataOutputStream bufferedOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            bufferedOutputStream.writeUTF("John Doe");
            bufferedOutputStream.writeInt(200_000);

        } catch (IOException ioException){
            throw new IllegalStateException("Can't write file ", ioException);
        }

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
            String name = dataInputStream.readUTF();
            int salary = dataInputStream.readInt();
            System.out.println(name + " " + salary);

        } catch (IOException ioe){
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

}
