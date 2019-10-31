package bot.thot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

public class Main {
    public static JDA jda;

    public Main() {
    }

    public static void main(String[] args) throws LoginException {
        jda = (new JDABuilder(AccountType.BOT)).setToken("Blank for security purposes!").build();
        jda.getPresence().setGame(Game.playing("The Thot Game"));
        jda.addEventListener(new DumbResponses());
    }
}
