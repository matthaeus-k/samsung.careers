package com.samsung.careers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ModelAttributeController {

    @ModelAttribute
    public void addAttributes(HttpServletRequest req, Model model) {
        addCommonAttributes(req, model);
    }

    public void addCommonAttributes(HttpServletRequest req, Model model) {
        String uri = req.getRequestURI();
        String queryString = req.getQueryString() == null ? "" : "?" + req.getQueryString();
        model.addAttribute("uri", uri + queryString);
    }

}
