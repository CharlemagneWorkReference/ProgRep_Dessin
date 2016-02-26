/**
 * Created by cyprien on 23/02/16.
 */
import java.awt.Color;
import java.io.Serializable;

public class Dessin{
    public int x, y;
    public Color c;

    public String toString(){
        return "Dessin : ("+this.x+", "+this.y+") couleur = "+this.c ;
    }
}