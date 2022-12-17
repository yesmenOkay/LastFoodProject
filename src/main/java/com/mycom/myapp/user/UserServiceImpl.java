//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;

    public UserServiceImpl() {
    }

    public UserVO getUser(UserVO vo) {
        return this.userDAO.getUser(vo);
    }
}
