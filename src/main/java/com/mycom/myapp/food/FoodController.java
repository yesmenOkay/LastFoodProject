//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myapp.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/food"})
public class FoodController {
    @Autowired
    FoodServiceImpl foodService;

    public FoodController() {
    }

    @RequestMapping(
            value = {"/list"},
            method = {RequestMethod.GET}
    )
    public String foodlist(Model model) {
        model.addAttribute("list", this.foodService.getFoodList());
        return "food/list";
    }

    @RequestMapping(
            value = {"/add"},
            method = {RequestMethod.GET}
    )
    public String addPost() {
        return "food/addpostform";
    }

    @RequestMapping(
            value = {"/addok"},
            method = {RequestMethod.POST}
    )
    public String addPostOK(FoodVO vo) {
        if (this.foodService.insertFood(vo) == 0) {
            System.out.println("데이터 추가 실패");
        } else {
            System.out.println("데이터 추가 성공!!!");
        }

        return "redirect:list";
    }

    @RequestMapping(
            value = {"/editform/{id}"},
            method = {RequestMethod.GET}
    )
    public String editPost(@PathVariable("id") int id, Model model) {
        FoodVO foodVO = this.foodService.getFood(id);
        model.addAttribute("u", foodVO);
        return "food/editform";
    }

    @RequestMapping(
            value = {"/editok"},
            method = {RequestMethod.POST}
    )
    public String editPostOK(FoodVO vo) {
        if (this.foodService.updateFood(vo) == 0) {
            System.out.println("데이터 수정 실패!!");
        } else {
            System.out.println("데이터 수정 성공!!!");
        }

        return "redirect:list";
    }

    @RequestMapping(
            value = {"/deleteok/{id}"},
            method = {RequestMethod.GET}
    )
    public String deletePostOK(@PathVariable("id") int id) {
        if (this.foodService.deleteFood(id) == 0) {
            System.out.println("데이터 삭제 실패");
        } else {
            System.out.println("데이터 삭제 성공!!!");
        }

        return "redirect:../list";
    }
}
