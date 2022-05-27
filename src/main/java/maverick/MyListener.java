package maverick;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        // We don't want to respond to other bot accounts, including ourself
        Message message = event.getMessage();
        String content = message.getContentRaw();
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
        if (content.equals("!ping"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Pong!").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        } else if (content.toLowerCase().contains("tom cruise"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Did someone mention the best actor in the world, Tom Cruise?").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        }else if (content.toLowerCase().contains("hector"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("What a guy, that Hector!").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        }
        else if (content.toLowerCase().contains("js"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Ew, javascript sucks").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        }
        else if (content.toLowerCase().contains("java"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Java rules!!").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        }
    }


}
