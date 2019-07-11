package com.webcore.api.about

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
@RequestMapping("api/about")
class AboutAPIController {

    @RequestMapping(value = "/aboutme", method = RequestMethod.GET, produces = "application/json")
    static ResponseEntity<AboutMe> aboutme() {
        AboutMe aboutMe = new AboutMe()
        aboutMe.name = "bob"
        aboutMe.email = "bobby@mailinator.com"
        aboutMe.website = "https://www.linkedin.com"
        new ResponseEntity<AboutMe>(aboutMe, HttpStatus.OK)
    }
}