package ru.task5.balda;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameMainProcessorImpl implements GameMainProcessor {
  private Set<String> introducedWords;
  private Scanner scanner;
  private String mainGamingWord;

  private String currentPlayerWord;
  private String currentPlayerName;

  private String[] lettersInMainGameWord;

  public GameMainProcessorImpl() {
    introducedWords = new HashSet<>();
    scanner = new Scanner(System.in);
  }

  public void startGame() {
    configureGame();
    boolean resultOfTurn;
    currentPlayerName = "FirstPlayer";

    do {
      doPlayerTurn(currentPlayerName);
      changePlayers();
    } while (!((currentPlayerWord.equals(" "))));
    System.out.println("Count of all enterd words : " + introducedWords.size());
  }

  private void changePlayers() {
    if (currentPlayerName.equals("FirstPlayer")) {
      currentPlayerName = "SecondPlayer";
    } else if (currentPlayerName.equals("SecondPlayer")) {
      currentPlayerName = "FirstPlayer";
    }
  }

  public void doPlayerTurn(String playerName) {
    boolean resultOfTurn;
    resultOfTurn = false;
    while (!resultOfTurn) {
      resultOfTurn = scanPlayerWord(playerName);
    }
    ;
  }

  public void configureGame() {
    System.out.println("Please, enter word :");
    mainGamingWord = scanner.nextLine();
    lettersInMainGameWord = mainGamingWord.split("");
    System.out.println(mainGamingWord + " : Was entered");
  }

  public boolean scanPlayerWord(String playerName) {
    System.out.println(playerName + "should enter word: ");
    currentPlayerWord = scanner.nextLine();
    return resolveWord(currentPlayerWord);
  }

  public boolean resolveWord(String word) {

    if (word.equals(" ")) {
      return true;
    }
    if (word.equals("")) {
      return false;
    }

    for (String letter : word.split("")) {
      if (!mainGamingWord.contains(letter)) {
        System.out.println("Your word contains letters that do not occur in the target word");
        return false;
      }
    }
    if (!introducedWords.add(word)) {
      System.out.println("Sorry,but this word was written in the past ,try another");
      return false;
    }
    System.out.println("Scored word " + word);
    return true;
  }
}
