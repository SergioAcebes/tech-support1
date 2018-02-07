import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random numAleatorio;
    ArrayList<String> respuesta;
        
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        numAleatorio = new Random();
        respuesta = new ArrayList<>();
        respuesta.add("Le escucho");
        respuesta.add("Le pasare con el servicio tecnico,espere un segundo gracias");
        respuesta.add("Ya estamos trabajando en ello");
        respuesta.add("¿Algo más que necesite saber?");
        respuesta.add("Siga contandome mientras trato de solucionarlo");
        respuesta.add("¿Se enciende una luz en el lateral?");
        respuesta.add("Ahora debe reiniciar el equipo para que pueda seguir arreglandole el problema");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int num = numAleatorio.nextInt(6);
        return respuesta.get(num);
    }
}
