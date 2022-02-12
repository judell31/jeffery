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
        System.out.println(event.getGuild().getRolesByName("role name", true));

        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("This is a test: " + x).queue();
    }

    private Role getRole(GuildMessageReceivedEvent event, String name) {
        return event.getGuild().getRolesByName(name, true).get(0);
    }
}
