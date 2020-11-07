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


public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();


    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultobjectmapper = new ObjectMapper();
        return defaultobjectmapper;
    }

    public static JsonNode parse(String jsonSource) throws JsonProcessingException {
        return objectMapper.readTree(jsonSource);
    }

    public static <A> A fromJsonNode(JsonNode node, Class<A> clazz) throws JsonProcessingException{
        return objectMapper.treeToValue(node,clazz);
    }

   public static JsonNode toJsonNode(Object o){
        return objectMapper.valueToTree(o);
   }

   public static String generateString(JsonNode node, boolean pretty) throws JsonProcessingException{
       ObjectWriter objectWriter = objectMapper.writer();

       if(pretty){
           objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
       }
       return objectWriter.writeValueAsString(node);
   }

    public static CartasTotal initializeCartas() throws IOException {

        return objectMapper.readerFor(CartasTotal.class).readValue(new File("Cartas.json"));
    }

    public static void writetoJsonMov(MovimientoTotal movimientos) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("Historial.json"), movimientos);
    }

    public static MovimientoTotal initiaizeMovimientos() throws IOException {

        return objectMapper.readerFor(MovimientoTotal.class).readValue(new File("Historial.json"));
    }
}
