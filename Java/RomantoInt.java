import java.util.*;
class MyClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a Roman Number: ");  
        String str= sc.nextLine();             
        System.out.print("Its Integer is: "+romanToInt(str));   
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};        
        int sum=map.get(s.charAt(s.length() - 1));
        for (int i=s.length()-2; i>= 0;--i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) sum -= map.get(s.charAt(i));
            else sum += map.get(s.charAt(i));
        }           
        return sum;
    }
}