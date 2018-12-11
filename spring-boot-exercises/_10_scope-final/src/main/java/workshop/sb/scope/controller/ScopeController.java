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

    @Autowired
    @Qualifier("request-scope")
    private ScopeService requestScope;

    @Autowired
    @Qualifier("session-scope")
    private ScopeService sessionScope;

    @GetMapping("/scope-default")
    public String getValueForDefault() {
        return defaultScope.responseMessage();
    }

    @GetMapping("/scope-request")
    public String getValueForRequest() {
        return requestScope.responseMessage();
    }

    @GetMapping("/scope-session")
    public String getValueForSession() {
        return sessionScope.responseMessage();
    }
}
