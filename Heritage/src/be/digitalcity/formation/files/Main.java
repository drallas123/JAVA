package be.digitalcity.formation.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        LireFichier("./fichier.txt");

    }

    public static void LireFichier(String path) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            byte[] buffer = new byte[8];

            int i = 0;
            while ((i = fis.read(buffer)) != -1)
            {
                System.out.println((char)i);

            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            fis.close();
        }
    }

}

