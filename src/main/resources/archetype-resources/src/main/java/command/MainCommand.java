#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.command;

import picocli.CommandLine;

@CommandLine.Command(subcommands = {
        CommandLine.HelpCommand.class
})
public class MainCommand {
}
