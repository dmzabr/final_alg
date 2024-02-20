import java.util.Iterator;


public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        hashMap.put("+79005554433", "Андрей");
        hashMap.put("+79005554432", "Алексей");
        hashMap.put("+79005554432", "Алексе22");
        hashMap.put("+79005554433", "Дарья2");
        hashMap.put("+79005554434", "Дарья3");
        hashMap.put("+79005554435", "Дарья4");
        hashMap.put("+79005554436", "Дарья5");
        hashMap.put("+79005554437", "Дарья6");
        hashMap.put("+79005554438", "Дарья7");
        hashMap.put("+79005554439", "Дарья8");


        Iterator<HashMap.Entity> iterator = hashMap.iterator();
        while (iterator.hasNext()) {
            HashMap.Entity element = iterator.next();
            System.out.println(element.key + " - " + element.value);
        }
    }
}
