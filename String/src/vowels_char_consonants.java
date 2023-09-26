public class vowels_char_consonants {
    public static void main(String[] args) {
        String a = "Hemanth Raj @2002";
        count_characters(a);
    }

    public static void count_characters(String s){
        int uppercase = 0, lowercase = 0, vowels = 0, consonants = 0, special_charcters = 0, space = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                uppercase++;
            }
            if (s.charAt(i) >= 96 && s.charAt(i) <= 122) {
                lowercase++;
            }
            if(s.charAt(i) == 32){
                space++;
            }
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                vowels++;
            }
            if(s.charAt(i) <= 65 && s.charAt(i) >= 90 || s.charAt(i) <= 96 && s.charAt(i) >= 122){
                special_charcters++;
            }
        }
        consonants = s.length() - (uppercase + lowercase +space + vowels +special_charcters) ;
        System.out.println("Uppercases : "+uppercase);
        System.out.println("Lowercase : "+lowercase);
        System.out.println("Spaces : "+ space);
        System.out.println("Vowels : "+ vowels);
        System.out.println("Special characters : "+ special_charcters);
        System.out.println("Consonants : "+consonants);

    }
}
