import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};

        List<Employee> listFromCSV = Parser.parceCSV(columnMapping, "data.csv");
        List<Employee> listFromXML = Parser.parceXML("data.xml");

        String jsonFromCSV = Parser.listToJson(listFromCSV);
        String jsonFromXML = Parser.listToJson(listFromXML);

        Parser.writeString(jsonFromCSV, "data.json");
        Parser.writeString(jsonFromXML, "data2.json");

        String jsonData = Parser.readString("data.json");

        List<Employee> jsonToListData = Parser.jsonToList(jsonData);

        for (Employee e : jsonToListData) {
            System.out.println(e);
        }
    }
}
