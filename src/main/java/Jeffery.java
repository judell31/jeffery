import constants.EnvironmentConstants;
import event_controller.EventController;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Jeffery {
    protected static JDA jda;

    //Todo: Update discord bot
    public static void main(String[] args) throws Exception{
        jda = JDABuilder.createDefault(EnvironmentConstants.TOKEN).build();
        jda.addEventListener(new EventController());
    }
}
