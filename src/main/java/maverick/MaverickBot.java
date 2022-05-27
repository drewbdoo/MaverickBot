package maverick;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class MaverickBot {
    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("OTc5NzI5NjU3NzE0ODUxOTgw.GbpyXr.HLpNp8jxyvzBR9Kqpg-ObIQbWcGaQ_BhCSJQlc")
                .setActivity(Activity.playing("Rocket League, even though it is for babies"))
                .addEventListeners(new MyListener())
                .build();

    }


}
