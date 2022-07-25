package String;

public class CheckVowels {
    public static void main(String[] args) {
        String str="Hello Java";
        int i,count=0;
        for(i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((c=='A'||c=='a')||(c=='I'||c=='i')||(c=='O'||c=='o')||(c=='U'||c=='u')||(c=='E'||c=='e'))
              count++;
        }
        if(count!=0)
            System.out.println("The number of vowels present in the string: "+count);
            else System.out.println("No vowels is present in the string");
    }
}
