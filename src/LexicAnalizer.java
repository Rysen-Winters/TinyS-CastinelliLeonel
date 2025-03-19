import java.io.FileReader;
import java.io.IOException;

public class LexicAnalizer 
{
    FileReader file; // El FileReader para leer el archivo con el codigo fuente.
    int readCharacter; // El caracter leído en codigo ascii.
    String analizedString; // La string analizada hasta el momento.
    int ln; // La linea en la que se está leyendo.
    int cl; // La columna en la que se está leyendo.

    public LexicAnalizer(String fileLocation)
    {
        this.setFileReader(fileLocation);
        this.setReadCharacter(-2);
        this.setAnalizedString("");
        this.setLn(0);
        this.setCl(0);
    }

    public FileReader getFileReader()
    {
        return this.file;
    }

    public String getAnalizedString()
    {
        return this.analizedString;
    }

    public int getCurrentLn()
    {
        return this.ln;
    }

    public int getCurrentCl()
    {
        return this.cl;
    }

    public void setFileReader(String fileLocation)
    {  
        try 
        {
            this.file = new FileReader(fileLocation);
        } 
        catch (IOException e)
        {
            System.out.println("Se detuvo la ejecución debido a una IOException: "+ e.getMessage());
        }
    }

    public void setReadCharacter(int code)
    {
        this.readCharacter = code;
    }

    public void setAnalizedString(String str)
    {
        this.analizedString = str;
    }

    public void setLn(int newLn)
    {
        this.ln = newLn;
    }

    public void setCl(int newCl)
    {
        this.cl = newCl;
    }

    public int readNextCharacter()
    {
        int readCode = -100;
        try
        {
            readCode = this.file.read();
            this.setReadCharacter(readCode);
        }
        catch (IOException e)
        {
            System.out.println("Se detuvo la ejecución debido a una IOException: "+ e.getMessage());
        }
        return readCode;
    }
}
