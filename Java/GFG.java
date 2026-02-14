// Java Program to illustrate the 
// java.net.PasswordAuthentication
// Class

import java.net.PasswordAuthentication;

class GFG {

    public static void main(String args[])
    {
        GFG acc = new GFG();
        acc.proceed();
    }

    private void proceed()
    {
        // Initializing the user name
        String userName = "Geek";
      
        // Initializing the password - This is a char
        // array since the PasswordAuthentication
        // supports this argument
        char[] password = { 'g', 'e', 'e', 'k', 'g', 'o',
                            'r', 'g', 'e', 'e', 'k', 's' };

        PasswordAuthentication passwordAuthentication
            = new PasswordAuthentication(userName,
                                         password);
        System.out.println(
            "UserName: "
            + passwordAuthentication.getUserName());
      
        // The below getPassword actually returns the
        // reference to the password as per the Java API
        // documentation.
        System.out.println(
            "Password: "
            + passwordAuthentication.getPassword());
      
        // You can get the password in normal string
        System.out.println(
            "Password: "
            + String.copyValueOf(
                passwordAuthentication.getPassword()));
    }
}