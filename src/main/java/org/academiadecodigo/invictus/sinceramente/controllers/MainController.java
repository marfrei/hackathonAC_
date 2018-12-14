package org.academiadecodigo.invictus.sinceramente.controllers;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Institution;
import org.academiadecodigo.invictus.sinceramente.persistence.model.User;
import org.academiadecodigo.invictus.sinceramente.services.InstitutionService;
import org.academiadecodigo.invictus.sinceramente.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MainController {

    private InstitutionService institutionService;
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/main")
    public String main(){
        return "main";
    }
    @RequestMapping(method = RequestMethod.GET, path = "/institutions")
    public String listInstitutions(Model model){
        model.addAttribute("institutions", institutionService.list());
        return "institutions";
    }

    @RequestMapping(method = RequestMethod.GET, path = "institution/{iid}")
    public String showInstitution(Model model, @PathVariable Integer iid){
        model.addAttribute("institution",institutionService.get(iid));
        return "institutions";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uid}")
    public String showUser(Model model, @PathVariable Integer uid){
        model.addAttribute(userService.get(uid));
        return "user";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/signup")
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "forms/formuser";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uid}/edit")
    public String editUser(@PathVariable Integer uid, Model model){
        model.addAttribute(userService.get(uid));
        return "user/signup";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/formuser")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "formuser";
        }
        User savedUser=userService.save(user);
        return "redirect:/user/"+savedUser.getId();
    }

    @RequestMapping(method = RequestMethod.GET, path="/formdonate")
    public String addDonation( Model model){
        //Institution institution =institutionService.get(1);
        model.addAttribute("donation", new Donation());
        return "forms/formdonate";
    }
/*
    @RequestMapping(method = RequestMethod.POST, path = "/formdonate")
    public String saveDonation(){

        return "done";
    }*/


    @RequestMapping(method = RequestMethod.GET, path = "/institution/form")
    public String addInstitution(Model model){
        model.addAttribute("institution",new Institution());
        return "forms/forminstitution";
    }



    @RequestMapping(method = RequestMethod.POST, path = "/forminstitution")
    public String saveInstitution(@Valid @ModelAttribute("institution") Institution institution, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "forminstitution";
        }
        Institution savedInstitution = institutionService.save(institution);
        return "redirect:/institutions";
    }




    @Autowired
    public void setInstitutionService(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
