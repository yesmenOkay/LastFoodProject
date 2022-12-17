//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myapp.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    SqlSessionTemplate sqlSession;

    public UserDAO() {
    }

    public UserVO getUser(UserVO vo) {
        return (UserVO)this.sqlSession.selectOne("User.getUser", vo);
    }
}
