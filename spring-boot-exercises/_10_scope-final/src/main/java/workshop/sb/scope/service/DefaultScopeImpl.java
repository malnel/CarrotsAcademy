package workshop.sb.scope.service;

import org.springframework.stereotype.Service;

@Service("default-scope")
public class DefaultScopeImpl implements ScopeService {

    private int i = 0;


    @Override
    public String responseMessage() {
        String msg = "The nuber is: " + i;
        i++;
        return msg;
    }
}

