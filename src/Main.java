public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        boolean tandf= true && false;
        boolean torf = true || false;
        System.out.println("True and False is " + tandf);
        System.out.println("True or False is " + torf);
        boolean complex = (5>8) || (3<9);
        System.out.println("The output of complex is: " + complex);

        char t = 't';
        String mystring = "This is IT1090";
        String titlestring = "Computer Programming";
        System.out.println("My string is: " + mystring);
        String lower = mystring.toLowerCase();
        System.out.println("lover case string is : " + lower);

        String complexstring= "Name: "+ mystring + "\n" + "Title: " +titlestring;
        System.out.println(complexstring);

        String complexstring1= "Name: "+ mystring + "\t" + "Title: " +titlestring;
        System.out.println(complexstring1);

    }
}