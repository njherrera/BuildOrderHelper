package com.mucholabs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BuildOrder {

    private List<Event> build;

    public BuildOrder(){
        this.build = new ArrayList<Event>();
    }

    public List<Event> getBuildOrder(){
        return this.build;
    }

    public void loadBuildFromFile(String filePath) throws IOException {
        File buildOrderFile = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(buildOrderFile));
        String st;
        while((st = reader.readLine()) != null){
            String[] currentAction = st.split(" ", 6);
            String supplyCount = currentAction[2].trim();
            int count  = Integer.valueOf(supplyCount);
            Event newEvent = new Event(currentAction[4], count, currentAction[5]);
            this.build.add(newEvent);
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Event action : this.build){
            str.append(action.toString() + "\n");
        }
        return str.toString();
    }
}
