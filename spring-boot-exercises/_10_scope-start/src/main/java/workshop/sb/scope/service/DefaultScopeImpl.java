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

/* TODO 2 -  w nowym pliku dodaj implementora - RequestScopeImpl

      ustaw scope na request (użyj stałej)
      ustaw proxyMode na TARGET_CLASS (enum)
*/

// TODO 3 -  w nowym pliku dodaj implementora - SessionScopeImpl - analogicznie do TODO 2