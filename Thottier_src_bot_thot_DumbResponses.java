package bot.thot;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class DumbResponses extends ListenerAdapter {
    public DumbResponses() {
    }

    public void onGuildMessageReceived(GuildMessageReceivedEvent message) {
        String thotMessage = message.getMessage().getContentRaw();
        int prob;
        if (thotMessage.contentEquals("-mirror")) {
            if (message.getAuthor().isBot()) {
                return;
            }

            message.getChannel().sendTyping().queue();
            message.getChannel().sendMessage(message.getMessage().getAuthor().getAsMention() + " Mirror mirror on the wall, whose the thottiest of them all?").queue();
            prob = (int)(Math.random() * 4.0D) + 1;
            if (prob == 3) {
                message.getChannel().sendMessage("Ur mum lol").queue();
            } else if (prob == 2) {
                message.getChannel().sendMessage("Why you, of course " + message.getMessage().getAuthor().getAsMention()).queue();
            } else {
                message.getChannel().sendMessage("You wish you could compare to the thottiness that exists within <@317396511690588160>").queue();
            }
        }

        if (thotMessage.contentEquals("-roses")) {
            if (message.getAuthor().isBot()) {
                return;
            }

            message.getChannel().sendTyping().queue();
            prob = (int)(Math.random() * 3.0D);
            if (prob == 2) {
                message.getChannel().sendTyping().queue();
                message.getChannel().sendMessage("Roses are red, violets are blue, ain't no one on this Earth thottier than you :0").queue();
            } else {
                message.getChannel().sendTyping().queue();
                message.getChannel().sendMessage("A rose by any other name wouldn't be as thotty as youuu").queue();
            }
        }

    }
}
