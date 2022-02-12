package responses;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public class TextResponse {

    public static void textResponse(GuildMessageReceivedEvent event) {
        Member member = event.getMessage().getMember();

        System.out.println(event.getGuild().getBotRole().getAsMention());
        List<Role> x = event.getGuild().getRoles();

        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("This is a test: " + getRole(event, 581328836923359232L).getAsMention()).queue();
    }

    private static Role getRole(GuildMessageReceivedEvent event, long id) {
        return event.getGuild().getRoleById(id);
    }
}
