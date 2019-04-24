package listeners;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EventListener extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("sup")){
            if (!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("not much what about you?").queue();
            }
        }
    }
}
