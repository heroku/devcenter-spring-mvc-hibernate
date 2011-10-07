package com.springsource.petclinic.web;

import com.springsource.petclinic.domain.Owner;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "owners", formBackingObject = Owner.class)
@RequestMapping("/owners")
@Controller
public class OwnerController {
}
