package com.webcore.page.error

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class ErrorPage {

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    static String error() {
        "error"
    }
}