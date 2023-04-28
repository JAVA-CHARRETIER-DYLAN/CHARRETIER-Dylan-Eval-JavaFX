package com.example;
 
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
 
public class telechargement {
 
    public static void main(String[] args) {
        char response;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Voulez vous mettre a jour la table base"); //Demande si l'utilisateur veux proceder
            response = scan.nextLine().charAt(0); //On recupere la reponse
        }
 
        while(response == 'o') { //Si oui, on execute le code
         
            try {
                System.out.println("Telechargement du fichier veuillez patienter");
                String fileName = "C:/Documents"; //L'emplacement du fichier pour la sauvegarde
                URL link = new URL("https://download.data.grandlyon.com/ws/grandlyon/pvo_patrimoine_voirie.pvostationvelov/all.json?maxfeatures=-1"); //le lien du fichier a telecharger
                 
                 //L'emplacement du fichier pour la sauvegarde
                 
                 
                //Code to download
 
                BufferedInputStream in = new BufferedInputStream(link.openStream());
 
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int n = 0;
                while (-1!=(n=in.read(buf)))
                {
                    out.write(buf, 0, n);
                     
                }
                out.close();
                in.close();
                FileOutputStream fos = new FileOutputStream(fileName);
                fos.write(response);
                fos.close();
                 
                 
                 
                //End download code
            }catch(IOException e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
            break;
        }
    }
}