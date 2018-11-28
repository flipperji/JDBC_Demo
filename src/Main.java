import com.flippey.utils.C3p0Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection cnn = C3p0Util.getConnection();
            System.out.println(cnn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
