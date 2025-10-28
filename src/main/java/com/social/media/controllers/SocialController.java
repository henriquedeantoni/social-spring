package com.social.media.controllers;

import com.social.media.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialController {

    @Autowired
    private SocialService socialService;
}
