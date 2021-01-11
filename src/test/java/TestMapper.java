import com.weng.ssm.blog.entity.Article;
import com.weng.ssm.blog.entity.Notice;
import com.weng.ssm.blog.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class TestMapper {


    @Autowired
    private ArticleTagRefMapper articleTagRefMapper;

    @Autowired
    private ArticleCategoryRefMapper articleCategoryRefMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private CategoryMapper categorMapper;

    @Autowired
    private LinkMapper linkMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private OptionsMapper optionsMapper;

    @Autowired
    private PageMapper pageMapper;

    @Autowired
    private TagMapper tagMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;



    @Test
    public void test() {
        for(Article a:articleMapper.listArticle()){
            System.out.println(a);
        }

    }
}
