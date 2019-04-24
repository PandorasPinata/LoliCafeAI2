package core;


import commands.Commands;
import listeners.EventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import util.SECRETS;

public class Main {

    public static void main(String args[]) throws Exception
    {
        JDA jda = new JDABuilder(SECRETS.TOKEN).build();

        jda.addEventListener(new EventListener());
        jda.addEventListener(new Commands());


    }
}
