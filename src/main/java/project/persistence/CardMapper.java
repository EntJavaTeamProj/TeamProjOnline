package project.persistence;

public class CardMapper {

    /*
    Example from https://www.javatpoint.com/convert-java-object-to-json

    CLASS THAT MAPS OBJECT TO JSON:

    package JavaTpoint.JavaObjectToJSON;
    import java.io.IOException;
    import com.fasterxml.jackson.databind.ObjectMapper;
    public class ObjectToJson {
            public static void main(String[] a)
            {
                // Creating object of Product
                Product product = new Product();
                // Inserting the data into the object
                product = getObjectData(product);
                // Creating Object of ObjectMapper define in Jackson API
                ObjectMapper Obj = new ObjectMapper();
                try {
                    // Converting the Java object into a JSON string
                    String jsonStr = Obj.writeValueAsString(product);
                    // Displaying Java object into a JSON string
                    System.out.println(jsonStr);
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // Getting data that we want to insert into an object
            public static Product getObjectData(Product product)
            {
                // Insert the data
                product.setId(101);
                product.setName("Spark 131");
                product.setPrice(10000);
                // Returning the product object
                return product;
            }




            PRODUCT CLASS:


            package JavaTpoint.JavaObjectToJSON;

            //Creating Product class
            public class Product {
                //Creating properties of Product class
                private int id;
                private String name;
                private int price;
                //Getter and Setters
                public int getId() {
                    return id;
                }
                public void setId(int id) {
                    this.id = id;
                }
                public String getName() {
                    return name;
                }
                public void setName(String name) {
                    this.name = name;
                }
                public int getPrice() {
                    return price;
                }
                public void setPrice(int price) {
                    this.price = price;
                }
                @Override
                public String toString() {
                    // auto-generated method stub
                    return "\"Product [ProductId "+ id + ", ProductName = " + name + ", ProductPrice = " + price + "]";
                }
            }
            }
     */
}
