package embeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class JefferyEmbedBuilder {
    private static final EmbedBuilder response = new EmbedBuilder();

    public static MessageEmbed responseEmbedBuilder(String description, int color){
        response.setTitle("Response");
        response.setDescription(description);
        response.setColor(color);
        return response.build();
    }
}
