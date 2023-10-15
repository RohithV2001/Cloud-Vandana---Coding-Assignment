import java.util.*;
class MyClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the String(lower-case): ");  
        String str= sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch='a';ch<='z';ch++){
            map.put(ch,1);
        }
        for (char ch : str.toCharArray()){
            map.put(ch,0);
        }
        int flag=0;
        for (char key : map.keySet()) {
            if(map.get(key)==1){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not a Pangram");
        }
        else{
            System.out.println("It is a Pangram");
        }
    }
}