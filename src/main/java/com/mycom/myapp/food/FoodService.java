//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myapp.food;

import java.util.List;

public interface FoodService {
    int insertFood(FoodVO vo);

    int deleteFood(int seq);

    int updateFood(FoodVO vo);

    FoodVO getFood(int seq);

    List<FoodVO> getFoodList();
}
