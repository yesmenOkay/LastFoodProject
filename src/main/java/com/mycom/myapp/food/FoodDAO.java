
package myapp.food;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodDAO {
	@Autowired
	SqlSession sqlSession;

	public int insertFood(FoodVO vo) {
		int result = this.sqlSession.insert("Food.insertFood", vo);
		return result;
	}

	public int deleteFood(int seq) {
		int result = this.sqlSession.delete("Food.deleteFood", seq);
		return result;
	}

	public int updateFood(FoodVO vo) {
		int result = this.sqlSession.update("Food.updateFood", vo);
		return result;
	}

	public FoodVO getFood(int seq) {
		FoodVO one = (FoodVO)this.sqlSession.selectOne("Food.getFood", seq);
		return one;
	}

	public List<FoodVO> getFoodList() {
		List<FoodVO> list = this.sqlSession.selectList("Food.getFoodList");
		return list;
	}
}
