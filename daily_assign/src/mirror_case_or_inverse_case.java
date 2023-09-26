public class mirror_case_or_inverse_case {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hemanth raj jk");
        for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >=97 && s.charAt(i) <=122) {
                    int temp = s.charAt(i) - 32;
                    s.setCharAt(i, (char) temp);
                } else {
                    if (s.charAt(i) >=65 && s.charAt(i) <=90) {
                        int temp = s.charAt(i) + 32;
                        s.setCharAt(i, (char) temp);
                    }
                }
            }
        System.out.println(s);
    }
}
