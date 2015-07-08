package model.locations;

/**
 * {@link Exception} thrown by the {@link LocationTranslator} class when it is passed a String
 * that is not of the format [A-Ha-h][1-8]
 */
public class InvalidLocationStringException extends Exception
{
    public InvalidLocationStringException(String message){
        super(message);
    }
}
