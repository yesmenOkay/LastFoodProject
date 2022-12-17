
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package myapp.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements com.mycom.myapp.food.FoodService {
    @Autowired
    com.mycom.myapp.food.FoodDAO foodDAO;

    public int insertFood(com.mycom.myapp.food.FoodVO vo) {return foodDAO.insertFood(vo);}

    public int deleteFood(int seq) { return foodDAO.deleteFood(seq); }

    public int updateFood(com.mycom.myapp.food.FoodVO vo) { return foodDAO.updateFood(vo); }

    public com.mycom.myapp.food.FoodVO getFood(int seq) { return foodDAO.getFood((seq)); }

    public java.util.List<com.mycom.myapp.food.FoodVO> getFoodList() { return foodDAO.getFoodList(); }
}