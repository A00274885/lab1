import java.util.Scanner;

public class lightSwitch
{
    private boolean on = false;
    private boolean working = true;

    public lightSwitch()
    {
    }

    public void switchOn()
    {
        if(!on)
        {
            on = true;

            if (Math.random() < 0.5)
            {
                working = false;
            }

        }
    }

    public void switchOff()
    {
        if (on)
        {
            on = false;
        }
    }

    public boolean status()
    {
        return on;
    }

    public boolean working()
    {
        return working;
    }

    public static void main(String [] args)
    {
        lightSwitch l = new lightSwitch();

        while (l.working())
        {
            if(l.status())
            {
                System.out.println("The light is on");
            }
            else
            {
                System.out.println("The Light is off");
            }

            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            if(s.equals("+"))
            {
                l.switchOn();
            }
            else if(s.equals("-"))
            {
                l.switchOff();
            }
            else
            {
                System.out.println("Please enter a + or a -");
            }

        }

        System.out.print("The light has blown");
    }
}
