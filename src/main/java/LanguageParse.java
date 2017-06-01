import java.util.ArrayList;
import java.util.List;

public class LanguageParse {

    List getDetail(String language) {
        List list = new ArrayList();
        if (language.equals("Java")) {
            list.add("可以用来后台开发");
            list.add("可以用来移动开发");
        } else {
            //TODO
        }
        return list;
    }
}
