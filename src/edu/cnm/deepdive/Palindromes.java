package edu.cnm.deepdive;

public class Palindromes {

  static String s = " A man, a plan, a canal, Panama!";
  static String s2;

  public static boolean isPalindrome() {

  s2 = s.replaceAll("\\W", "");
  s2 = s2.toLowerCase();
  char[] chars = s2.toCharArray();
  for (int i = 0, j = chars.length -1; i < j; i++, j--) {
    if (chars [i] != chars [j]) {
      return false;
    }
  }
  return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome());
    System.out.println(s2);
  }
}