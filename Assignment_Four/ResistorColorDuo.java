public class ResistorColorDuo {
    public static void main(String[] args) {
        String[] colors={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};  
        System.out.print("Enter the 2 digit number : ");
        int digit=new java.util.Scanner(System.in).nextInt();
        System.out.println("The Encoded color is "+colors[digit/10]+""+colors[digit%10]);

    }
}
