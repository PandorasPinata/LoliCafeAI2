package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        //String botId = ""
        String[] message = e.getMessage().getContentRaw().split(" ");
        if (message[0].equalsIgnoreCase("dings")){
            //if (e.getMessage().getMentionedUsers().get(0).getId() == botId){

            switch (message[1]) {
                case "thng":
                    e.getChannel().sendMessage("https://cdn.discordapp.com/attachments/216355162074120192/424245204212776991/hqdefault.png").queue();
                    break;
                case "id":
                    String botId = e.getMessage().getMentionedUsers().get(0).getId();
                    e.getChannel().sendMessage(botId).queue();
                default:
                    e.getChannel().sendMessage("what the fuck you want from me >:c").queue();
            }

        }
    }
}
