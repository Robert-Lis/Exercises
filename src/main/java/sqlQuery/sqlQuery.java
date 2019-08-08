package sqlQuery;

public class sqlQuery {


    String query = "SELECT r.name FROM roles r WHERE r.id NOT IN (SELECT ur.role_id FROM users_roles ur WHERE ur.user_id = 1);";
}
