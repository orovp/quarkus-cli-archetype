#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DummyService {
    public String dummyOutput() {
        return "Dummy";
    }
}
