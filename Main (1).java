import java.util.Scanner;


public class Main {  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);

    //Given a String, return a new string made of 3 copies of the last 2 chars of the original String. Assume the input String length will be at least 2 characters. For example, the String “Hello” should result in “lololo”.
    System.out.println("Please input a string and i will return the last two letter 3 times!");
    String s = input.nextLine(); // I'm just going to keep reassigning this variable until for easier readablility.
    System.out.println(lastTwoLetters(s));

    //Given a String, return the String made of its first two chars, so the String “Hello” yields “He”. If the String is shorter than length 2, return whatever there is, so “X” yields “X”, and the empty String " " yields the empty String " ".
    System.out.println("please input a string and I will remove the first and last character.");
    s = input.nextLine();
    System.out.println(removeFirstAndLast(s));

    //Given a String, return a version without the first and last char, so "Hello" yields "ell". The String length will be at least 2.
    System.out.println("please input a string and I will return the first two characters.");
    s = input.nextLine();
    System.out.println(firstTwoChars(s));

    //Given 2 Strings, return their concatenation, omitting the first char of each. The Strings will be at least length 1. For example, Strings “Hello” and “There” should result in “ellohere”.
    System.out.println("please input 2 strings and I will concatinate them without their first or last characters. str 1:");
    s = input.nextLine();
    System.out.println("str 2:");
    String s2 = input.nextLine();
    System.out.println(concatWithoutFirstAndLast(s, s2)); //------------------+
//                                                                            |
    input.close(); //                                                         |
  } //                                                                        |
//                                                                            |
  public static String concatWithoutFirstAndLast(String s, String s2){ //-----+
    return removeFirstAndLast(s) + removeFirstAndLast(s2); // I LOVE FUNCTIONS
  }

  public static String firstTwoChars(String s) {
    if (s.length() < 2){ //will error if if-statement isn't present.
      return s;
    }
    return s.substring(0, 2);
  }
  
  public static String removeFirstAndLast(String s) {
    if (s.length() < 2){ //will error if if-statement isn't present.
      return s;
    }
    return s.substring(1, s.length()-1);
  }

  public static String lastTwoLetters(String s) {
    String new_str = ""; 
    if (s.length() < 2){ //will error if if-statement isn't present.
        return s;
    }
    for (int i = 0; i < 3; i++){ // I could just run it 3 times but a for loop is easier to understand in this use case.
      new_str += s.substring(s.length()-2);
    }
    return new_str;
  }
}


