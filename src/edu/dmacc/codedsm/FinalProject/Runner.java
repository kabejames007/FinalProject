package edu.dmacc.codedsm.FinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Runner {
    public static void main(String[] args) {
        Map<Integer, String> dataLoaded = new HashMap<>();
        dataLoaded = initial_load();
        for (Integer key : dataLoaded.keySet()) {
            String value = dataLoaded.get(key);
            System.out.println(key + " " + value);
        }

        PayrollController controller = new PayrollControllerImpl();
        InputView view = controller.process(initial_load());
        view.render();
    }

    private static Map<Integer, String> initial_load(){
        Map<Integer, String> data = new HashMap<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "initial_load.txt"));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
               // System.out.println(line.split(",")[2]);
                data.put(Integer.parseInt(line.split(",")[0]), line.split(",")[1]+","+line.split(",")[2]);

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }


}
