package Ex_27072024;

public class Lab151 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer

        // StringBuilder - Non synchronized and Faster
        // StringBuffer - Synchronized and slower due to synchronization
        String s1 = "PRAMOD";
        s1 = "Dutta";
        System.out.println(s1);

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        System.out.println(stringBuffer);
        stringBuffer.append("JI"); //PramodDuttaJI
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        System.out.println(stringBuilder);
        stringBuilder.append("Jiii");
        System.out.println(stringBuilder);

        // Thread Safety?

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
