package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String s) {
  String s2 = s.replaceAll("\\W", "");
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
    System.out.println(isPalindrome(""));
  }
}