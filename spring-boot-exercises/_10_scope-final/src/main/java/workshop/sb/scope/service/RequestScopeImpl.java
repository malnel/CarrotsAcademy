package workshop.sb.scope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service("request-scope")
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeImpl implements ScopeService {

    private int i = 0;


    @Override
    public String responseMessage() {
        String msg = "The nuber is: " + i;
        i++;
        return msg;
    }
}
