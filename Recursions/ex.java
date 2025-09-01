package Recursions;

public class ex {
    public static void printName(String name,int count){
        if(count==0){
            return;
        }
        System.out.println(name);
printName(name, count-1);
    }
    public static void printLinear(int n){
        if(n==0) return;
        
        printLinear(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //printName("Sreshta",5);
        printLinear(10);
    }
}
