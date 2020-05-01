#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.command.DummyCommand;
import ${package}.command.MainCommand;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.apache.maven.shared.utils.cli.CommandLineUtils;
import org.jboss.logging.Logger;
import picocli.CommandLine;

import javax.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    public static final Logger LOGGER = Logger.getLogger(Main.class);

    @Inject
    DummyCommand dummyCommand;

    @Override
    public int run(String... args) throws Exception {
        if (args.length == 0){
            Quarkus.waitForExit();
            return 0;
        }
        if (args.length == 1){
            args = CommandLineUtils.translateCommandline(args[0]);
        }
        return new CommandLine(MainCommand.class)
                .addSubcommand(dummyCommand)
                .execute(args);
    }

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

}
