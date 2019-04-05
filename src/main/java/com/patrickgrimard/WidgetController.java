package com.patrickgrimard;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XTL on 8/14/2014.
 */
@RequestMapping("/api")
@RestController
public class WidgetController {

    @RequestMapping(value = "/{user}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index(@PathVariable(value="user") String user) {
        return new Widget(user, 10, 7);
    }
}
