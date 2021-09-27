package ga.hzcgw.action;

import ga.hzcgw.common.action.abs.AbstractBaseAction;
import ga.hzcgw.vo.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/*")
public class MessageAction extends AbstractBaseAction {
//    private static final Logger LOGGER = LoggerFactory.getLogger(MessageAction.class);

    @RequestMapping("echo")
    public Object echo(Message message) {
//        LOGGER.info("GOT msg = " + msg);
//        return "ECHO is " + msg;
        message.setTitle("【ECHO】" + message.getTitle());
        message.setContent("【ECHO】" + message.getContent());
        return message;
    }
}
