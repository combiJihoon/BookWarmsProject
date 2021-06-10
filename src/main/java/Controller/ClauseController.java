package Controller;

import Service.ClauseMM;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClauseController {

    private static final Logger logger = LoggerFactory.getLogger(DriverController.class);

    @Autowired
    private ClauseMM cm;
    ModelAndView mav;

    //마이 글귀 목록
    @GetMapping(value = "/getMyClauseList")
    public ModelAndView getMyClauseList(HttpSession session){ //로그인시 session에 내 정보 저장한 것
        mav = cm.getMyClauseList(session);
        return mav;
    }
}