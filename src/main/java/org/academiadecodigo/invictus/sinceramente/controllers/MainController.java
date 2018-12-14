package org.academiadecodigo.invictus.sinceramente.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Institution;
import org.academiadecodigo.invictus.sinceramente.persistence.model.User;
import org.academiadecodigo.invictus.sinceramente.services.InstitutionService;
import org.academiadecodigo.invictus.sinceramente.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String main(){
        return "index";
    }
    @RequestMapping(method = RequestMethod.GET, path = "/institutions")
    public String listInstitutions(Model model){
        model.addAttribute("institutions", institutionService.list());
        return "institutions";
    }

    @RequestMapping(method = RequestMethod.GET, path = "institution/{iid}")
    public String showInstitution(Model model, @PathVariable Integer iid){
        model.addAttribute(institutionService.get(iid));
        return "institution";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uid}")
    public String showUser(Model model, @PathVariable Integer uid){
        model.addAttribute(userService.get(uid));
        return "user";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/signup")
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "user/signup";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uid}/edit")
    public String editUser(@PathVariable Integer uid, Model model){
        model.addAttribute(userService.get(uid));
        return "user/signup";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/user/signup")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "user/signup";
        }
        User savedUser=userService.save(user);
        return "redirect:/user/"+savedUser.getId();
    }

    @RequestMapping(method = RequestMethod.GET, path="/user/{uid}/institution/{iid}/donate")
    public String addDonation(@PathVariable Integer iid, Model model){
        Institution institution =institutionService.get(iid);
        model.addAttribute("institution",institution);
        return "institution/donate";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/user/{uid}/institution/{iid}/donate")
    public String saveDonation(@PathVariable Integer uid, @PathVariable Integer iid, @Valid @ModelAttribute("donation") Donation donation, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "institution/donate";
        }
        donation.setInstitution(institutionService.get(iid));
        donation.setUser(userService.get(uid));
        userService.addDonation(donation);
        return "redirect:/user/";
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
