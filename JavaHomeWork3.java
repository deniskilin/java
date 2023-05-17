public class JavaHomeWork3 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] parts = input.replaceAll("[{}\"]", "").split(",");

        StringBuilder sql = new StringBuilder("SELECT * FROM students WHERE ");
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            if (!value.equals("null")) {
                sql.append(key).append(" = \"").append(value).append("\" AND ");
            }
        }
        // Удаление последнего "AND "
        sql.delete(sql.length() - 5, sql.length());

        System.out.println(sql.toString());
    }
}