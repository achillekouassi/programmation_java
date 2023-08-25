import java.io.*;
import java.util.*;

public class JavaExample {
    public static void main(String[] args) {
        // Utilisation de Vector
        Vector<String> vector = new Vector<>();
        vector.add("Premier element");
        vector.add("Deuxieme element");
        System.out.println("Vector : " + vector);

        // Utilisation de LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList : " + linkedList);

        // Utilisation de FileInputStream et FileOutputStream pour copier un fichier
        try {
            FileInputStream inputFile = new FileInputStream("source.txt");
            FileOutputStream outputFile = new FileOutputStream("destination.txt");

            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }

            inputFile.close();
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Utilisation d'ObjectOutputStream pour sérialiser un objet
        try {
            ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("object.ser"));
            String message = "Ceci est un objet .";
            objectOutput.writeObject(message);
            objectOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Utilisation d'ObjectInputStream pour désérialiser un objet
        try {
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("object.ser"));
            String deserializedMessage = (String) objectInput.readObject();
            System.out.println("Objet  : " + deserializedMessage);
            objectInput.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
