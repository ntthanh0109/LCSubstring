package lcs;

import java.util.*;
import org.slf4j.*;

public class Validate {

    Logger logger = LoggerFactory.getLogger(Validate.class);

    Scanner u = new Scanner(System.in);

    public String getString(String mess, String error) {
        String txt = "";
        while (true) {
//            System.out.print(mess);
            logger.info(mess);
            txt = u.nextLine();
            if (!txt.trim().isEmpty()) {
                break;
            } else {
//                System.out.println(error);
                logger.info(error);
            }
        }
        return txt;
    }
}
