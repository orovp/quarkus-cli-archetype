#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.command;

import ${package}.service.DummyService;
import picocli.CommandLine;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
@CommandLine.Command(name = "dummy", description = "Dummy Command")
public class DummyCommand implements Runnable {

    @Inject
    DummyService dummyService;

    @Override
    public void run() {
        System.out.println("Hello from " + dummyService.dummyOutput() + " Command.");
    }
}