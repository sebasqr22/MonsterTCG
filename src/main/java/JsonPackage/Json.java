package JsonPackage;


import Assets.CartasTotal;
import Assets.MovimientoTotal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
/**
 * @author David de la Hoz
 */

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    /**
     * Metodo para iniciar el ObjectMapper
     * @return un object mapper
     */
    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultobjectmapper = new ObjectMapper();
        return defaultobjectmapper;
    }

    /**
     * Metodo para pasar de un string a un Json Node
     * @param jsonSource
     * @return objeto Json Node
     * @throws JsonProcessingException
     */
    public static JsonNode parse(String jsonSource) throws JsonProcessingException {
        return objectMapper.readTree(jsonSource);
    }

    /**
     * Metodo para pasar de un json node a una instancia de una clase determinada
     * @param node
     * @param clazz
     * @param <A>
     * @return Objeto de tipo clase determinada
     * @throws JsonProcessingException
     */
    public static <A> A fromJsonNode(JsonNode node, Class<A> clazz) throws JsonProcessingException{
        return objectMapper.treeToValue(node,clazz);
    }

    /**
     * Metodo para pasar de instancia a JsonNode
     * @param o
     * @return JsonNode
     */
   public static JsonNode toJsonNode(Object o){
        return objectMapper.valueToTree(o);
   }

    /**
     * Metodo para pasar de JSON node a String
     * @param node
     * @param pretty
     * @return String
     * @throws JsonProcessingException
     */
   public static String generateString(JsonNode node, boolean pretty) throws JsonProcessingException{
       ObjectWriter objectWriter = objectMapper.writer();

       if(pretty){
           objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
       }
       return objectWriter.writeValueAsString(node);
   }

    /**
     * Metodo para leer las cartas de alrchivo Cartas.json
     * @return
     * @throws IOException
     */
    public static CartasTotal initializeCartas() throws IOException {

        return objectMapper.readerFor(CartasTotal.class).readValue(new File("Cartas.json"));
    }

    /**
     * Metodo para escribir un movimiento en un documento tipo JSON
     * @param movimientos
     * @throws IOException
     */
    public static void writetoJsonMov(MovimientoTotal movimientos) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("Historial.json"), movimientos);
    }

    /**
     * Metodo para leer movimientos registrados
     * @return
     * @throws IOException
     */
    public static MovimientoTotal initiaizeMovimientos() throws IOException {

        return objectMapper.readerFor(MovimientoTotal.class).readValue(new File("Historial.json"));
    }
}
