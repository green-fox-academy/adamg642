package exercisetwo;

import exerciseone.ExerciseOneMain;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ExerciseTwo {
    HashMap<String, Integer> hashMap = new HashMap<>();
    List<String> lines;

    public static void main(String[] args) {

        ExerciseTwo exerciseTwo = new ExerciseTwo();
        exerciseTwo.putMentorMetrics("responses.txt");

    }

    public void putMentorMetrics(String fileName) {

        try {
            String filePathWithName = ".\\megalotis-foundation-normal-exam\\" + fileName;
            Path filePath = Paths.get(filePathWithName);
            lines = Files.readAllLines(filePath);

        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }

        for (int k = 0; k < lines.size(); k++) {
            String fl = lines.get(k);
            String[] helpStringArray = fl.split("\\s+");

            for (int i = 0; i < helpStringArray.length; i++) {
                int helpInt;
                int helpInt2;
                helpInt = Integer.parseInt(helpStringArray[i]);
                if (i == 0) {

                    if (hashMap.containsKey("matReview")) {
                        helpInt2 = helpInt + hashMap.get("matReview");
                        hashMap.put("matReview", helpInt2);
                    } else {
                        hashMap.put("matReview", helpInt);
                    }
                }

                if (i == 1) {
                    if (hashMap.containsKey("presSkills")) {
                        helpInt2 = helpInt + hashMap.get("presSkills");
                        hashMap.put("presSkills", helpInt2);
                    } else {
                        hashMap.put("presSkills", helpInt);
                    }
                }
                if (i == 2) {
                    if (hashMap.containsKey("helpfulness")) {
                        helpInt2 = helpInt + hashMap.get("helpfulness");
                        hashMap.put("helpfulness", helpInt2);
                    } else {
                        hashMap.put("helpfulness", helpInt);
                    }
                }
                if (i == 3) {
                    if (hashMap.containsKey("explanations")) {
                        helpInt2 = helpInt + hashMap.get("explanations");
                        hashMap.put("explanations", helpInt2);
                    } else {
                        hashMap.put("explanations", helpInt);
                    }
                }
            }
            System.out.println(fl);
            System.out.println(helpStringArray[0]);
            System.out.println(lines.get(0));

            for (String name : hashMap.keySet()) {

                String key = name.toString();
                double avarage = (double) hashMap.get(name) / lines.size();
                String value = hashMap.get(name).toString();
                System.out.println(key + "  avarage: " + avarage);


            }
        }
    }


}




