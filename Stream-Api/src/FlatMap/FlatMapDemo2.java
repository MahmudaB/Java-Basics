package FlatMap;

import java.util.*;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> teamA= Arrays.asList("John","Abraham","Kinjal");
        List<String> teamB= Arrays.asList("Mahm","Lipi","Sani");
        List<String> teamC= Arrays.asList("Shelly" ,"Abrar","nifyi");

        List<List<String>> teams = Arrays.asList(teamA, teamB, teamC);

        //Without Stream
        for(List<String> team : teams) {
            for(String teamName : team) {
                System.out.println(teamName);
            }
        }

        //without Stream
        teams.stream().flatMap(team -> team.stream()).forEach(System.out::println);
    }
}
