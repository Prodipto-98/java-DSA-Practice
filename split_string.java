// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.List;

public class split_string {
    public static void main(String[] args) {
        List<Float> f = new ArrayList<>();
        List<String> s = new ArrayList<>();
        List<Integer> v = new ArrayList<>();

        // Example input string
        String input_data = "3.14,hello,42;2.71,world,24;5.78,earth,78";

        // Split the input_data by ';' delimiter
        String[] entries = input_data.split(";");

        for (String entry : entries) {
            // Split the entry by ',' to get the float, string, and integer parts
            String[] parts = entry.split(",");

            // Parse and store the values in the appropriate lists
            f.add(Float.parseFloat(parts[0]));  // Convert string to float and store in list f
            s.add(parts[1]);                    // Store string in list s
            v.add(Integer.parseInt(parts[2]));  // Convert string to int and store in list v
        }

        // Output the stored values to verify
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Float: " + f.get(i) + ", String: " + s.get(i) + ", Integer: " + v.get(i));
        }
    }
}