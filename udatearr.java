import java.util.*;

public class udatearr {
    public static void update(int marks[],int nonchang) {
        nonchang = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

   
    

    public static void main(String args[]) throws Exception {
        
        int marks[] = { 97, 99, 101, 103 };
        int nonchang = 5;
        update(marks,nonchang);
        System.out.println(nonchang);
       for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
    }
}
}