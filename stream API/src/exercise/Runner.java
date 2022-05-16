package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import exercise.GameCharacter.Continent;

public class Runner {
	
	public static void main(String[] args) {
		//List of names 
		List<GameCharacter> characters = Arrays.asList(
				new GameCharacter("Arthas Menethil", "Lich King", "Icecrown", 80, 1500,Continent.Northrend),
				new GameCharacter("Thrall", "Warchief", "Orgrimmar", 90, 1200, Continent.Kalimdor),
				new GameCharacter("Jaina Proudmoore", "Lord Admiral", "Kul Tiras", 120, 1000, Continent.Eastern_Kingdoms),
				new GameCharacter("Tyrande Whisperwind", "Priestess of Elune", "Teldrassil", 120, 1100, Continent.Kalimdor),
				new GameCharacter("Sylvanas Windrunner", "Dark Ranger", "Undercity", 120, 1100, Continent.Eastern_Kingdoms));
		
		List<String> kalimdorNames = characters.stream().filter((character)-> character.getContinent()==Continent.Kalimdor).
									map(character -> character.getName()).collect(Collectors.toList());
		kalimdorNames.forEach(System.out::println);
		
		
		//sorted by hit points
		characters.stream().sorted((character1,character2) -> { double delta = character1.getHitPoints() - character2.getHitPoints();
												return delta == 0.0 ? 0 : (delta > 0 ? 1 : -1);
		}).forEach(System.out::println);
		
		
		//average hit points in level 120 
		List<Double> ListOfHitPoints = characters.stream().filter((character) -> character.getLevel() == 120)
				.map(character -> character.getHitPoints()).collect(Collectors.toList());
		double avg = ListOfHitPoints.stream().reduce(0.0, (acc, next) -> acc + next) / ListOfHitPoints.size();
		System.out.println("average hit points in level 120: " + avg);
		
		
		//create a list of 5 game characters out of a list of 5 names of characters. 
		List<String> ListOfNames = Arrays.asList("Arthas Menethil", "Thrall", "Jaina Proudmoore", "Tyrande Whisperwind", "Sylvanas Windrunner"); 
		List<GameCharacter> newCharacters = ListOfNames.stream().map((name) -> new GameCharacter(name, "Lord Admiral", "Kul Tiras", 90, 1200, Continent.Kalimdor))
				.collect(Collectors.toList());
		System.out.println("new list of game characters out of a list of names of characters: ");
		System.out.println(newCharacters);
		
	}

	
}

