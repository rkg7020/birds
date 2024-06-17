package com.unitedinternet.mam.um.recruiting;

import com.unitedinternet.mam.um.recruiting.pojo.Bird;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BirdsMain {
    private static final String FILE_PATH = "src/main/resources/birds.csv";
    private static final List<String> IUCN_ORDER = List.of("LC", "NT", "VU", "EN", "CR", "EW", "EX", "DD");

    public static void main(String[] args) {

        System.out.println("hawk");
        List<Bird> hawks = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 4) {
                    Bird bird = new Bird(fields[0], fields[1], fields[2], fields[3]);
                    hawks.add(bird);
                    //  if ("Hawks, eagles".equalsIgnoreCase(bird.getFamily())) {
                  //      hawks.add(bird);
                  //  }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        hawks.stream().filter( (b)-> b.getFamily().equals("Hawks, eagles") ).sorted(Comparator.comparingInt(bird -> IUCN_ORDER.indexOf(bird.getCategory().name()))).forEach(System.out::println);


    }
}
