package ga.hzcgw.vo;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@XmlRootElement
public class Message {

    @XmlElement
    private String title;

//    @JSONField(format = "yyyy年MM月dd日")
//    @JsonFormat(pattern = "yyyy年MM月dd日")
    @XmlElement
    private Date pubdate;

    @XmlElement
    private String content;
}
