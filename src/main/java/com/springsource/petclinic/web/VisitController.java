package com.springsource.petclinic.web;

import com.springsource.petclinic.domain.Visit;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "visits", formBackingObject = Visit.class)
@RequestMapping("/visits")
@Controller
public class VisitController {
}
