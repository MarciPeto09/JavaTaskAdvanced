package school;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        final List<String> names = new ArrayList<>();
          // adding an item to the end of the list
        names.add(0,"Gregory");names.add(1,"Andrew"); // adding an item to the end of the list
        for (final String name: names) {
            System.out.println(name);
        }
        }}

