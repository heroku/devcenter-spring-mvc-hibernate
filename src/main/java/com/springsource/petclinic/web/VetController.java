package com.springsource.petclinic.web;

import com.springsource.petclinic.domain.Vet;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vets", formBackingObject = Vet.class)
@RequestMapping("/vets")
@Controller
public class VetController {
}
