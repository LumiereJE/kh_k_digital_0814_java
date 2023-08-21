package 문자열_다루기;
/*
toCharArray() :
*/
public class ToChar {
    public static void main(String[] args) {

        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char eCh : chName) System.out.print(eCh);

    }
}
