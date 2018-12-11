package workshop.sb.scope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sb.scope.service.ScopeService;

@RestController
public class ScopeController {

    @Autowired
    @Qualifier("default-scope")
    private ScopeService defaultScope;

    // TODO 4 wstrzyknij request i session

    @GetMapping("/scope-default")
    public String getValueForDefault() {
        return defaultScope.responseMessage();
    }

    // TODO 5 zaimplementuj metody zwracające responseMessage z dodanych implementorów "/scope-request", "/scope-session"

}
