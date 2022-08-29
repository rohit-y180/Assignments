class check_vowel {
  
    public static void main(String args[]) {
      
      //String str = new String("bcdfghjkl ghjkl mnklgh");
      String str = new String("this is a test string which contains lots of vowels");
      int vowel_falg=0;

      for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
            str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
            str.charAt(i) == 'u')
            vowel_falg=1;
      }
      if(vowel_falg==1)
      System.out.println("String contains Vowel");
      else
      System.out.println("No Vowels found.");

    }
  }