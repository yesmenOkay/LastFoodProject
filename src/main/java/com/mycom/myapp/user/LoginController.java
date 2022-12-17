//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.swing.*;

@Controller
@RequestMapping({"/login"})
public class LoginController {
    @Autowired
    UserServiceImpl service;

    public LoginController() {
    }

    @RequestMapping(
            value = {"/login"},
            method = {RequestMethod.GET}
    )
    public String login() {
        return "login/login";
    }

    @RequestMapping(
            value = {"/loginOk"},
            method = {RequestMethod.POST}
    )
    public String loginCheck(HttpSession session, UserVO vo) {
        String returnURL = "";
        if (session.getAttribute("login") != null) {
            session.removeAttribute("login");
        }

        UserVO loginvo = this.service.getUser(vo);
        if (loginvo != null) {
            System.out.println("login success");
            session.setAttribute("login", vo);
            returnURL = "redirect:/food/list";
        } else {
            JOptionPane.showMessageDialog(null,"로그인 실패하였습니다", "로그인", JOptionPane.PLAIN_MESSAGE);
            returnURL = "redirect:/login/login";
        }

        return returnURL;
    }

    @RequestMapping({"logout"})
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login/login";
    }
}
