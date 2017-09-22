package blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description://TODO
 * @User: 62102.
 * @Contact: wechat: 13810414691
 * @Time: 2017/9/22.
 */
@Controller
@RequestMapping(value = "/blog")
public class BlogController  implements Constant{

    @Autowired
    BlogService blogService;
    @ModelAttribute(value = "blog")
    public Blog newBlog(){
        return new Blog();
    }
    @ModelAttribute(value = "blog")
    public List<Blog> getBlogsByUser(User user){
        return blogService.getBlogsByUser(user);
    }

    @ApiOperation(value = "获取指定用户所有博客", response = User.class, responseContainer = "List")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getBlogsByUserId(Model model) {

//        getBlogsByUser(user);
        return "blog";
    }
    @ApiOperation(value = "获取指定用户所有博客", response = User.class, responseContainer = "List")
    @RequestMapping(value = "/listByUserId/{id}", method = RequestMethod.GET)
    public String getBlogsByUserId(@PathVariable("id")int id, Model model) {
        User user = new User();
        user.setId(id);
        getBlogsByUser(user);
        return "blog";
    }

}