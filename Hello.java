import java.util.*;
class Hello
{
    public static void main (String[] args)
    {
       Scanner biodata = new Scanner(System.in);
       
        System.out.println("enter your name:");
        String name = biodata.nextLine();
        System.out.println("name:" + name);
        
        biodata.nextLine();
        System.out.println("enter your initial:");
         char initial = biodata.next().charAt(0);
        System.out.println("initial:" + initial);
        
        biodata.nextLine();
        System.out.println("enter your age:");
         int age = biodata.nextInt();
        System.out.println("age:" + age);
        
        biodata.nextLine();
        System.out.println("enter your phonenumber:");
        long phonenumber = biodata.nextLong();
        System.out.println("phone number:" + phonenumber);
        
         biodata.nextLine();
        System.out.println("enter your gender:");
         String gender = biodata.nextLine();
        System.out.println("gender:" + gender);
        
        biodata.nextLine();
        System.out.println("enter your blood group:");
         String bloodgroup = biodata.nextLine();
        System.out.println("blood group:" + bloodgroup);
        
        biodata.nextLine();
        System.out.println("enter your email:");
        String email = biodata.nextLine();
        System.out.println("email:" + email);
        
         biodata.nextLine();
        System.out.println("enter your height:");
        float height = biodata.nextFloat();
        System.out.println("height:" + height);
        
         biodata.nextLine();
        System.out.println("enter your address:");
         String address = biodata.nextLine();
        System.out.println("address:" + address);
        
        
    }
}
