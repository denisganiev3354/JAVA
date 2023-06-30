package lesson_2.HW.task_1;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String sqlQuery = "select * from students where ";
        JSONObject filters = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        StringBuilder whereClause = new StringBuilder();
        for (String key : filters.keySet()) {
            if (!filters.isNull(key)) {
                whereClause.append(key).append(" = '").append(filters.get(key)).append("' and ");
            }
        }

        if (whereClause.length() > 0) {
            whereClause.delete(whereClause.length() - 5, whereClause.length()); // remove the last " and "
        } else {
            System.out.println("No filters found.");
        }

        String fullQuery = sqlQuery + whereClause;
        System.out.println("Full SQL query: " + fullQuery);
    }
}