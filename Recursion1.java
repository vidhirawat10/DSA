
public class Main { 
    void printNum(int n) {
        if (n == 0) {  
            return;
        } 
        System.out.print(n + " "); 
        printNum(n - 1);
    }

    public static void main(String[] args) {
        Main obj = new Main(); 
        obj.printNum(5); 
    }
}

