package com.springsource.petclinic.web;

import com.springsource.petclinic.domain.Pet;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "pets", formBackingObject = Pet.class)
@RequestMapping("/pets")
@Controller
public class PetController {
}
