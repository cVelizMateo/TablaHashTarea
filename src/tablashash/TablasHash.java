
package tablashash;

/**
 *
 * @author Christofer Josué Véliz Mateo 
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
          hashTable tablaHash = new hashTable(11);
        //Se insertan elementos en la tabla hash
       /* tablaHash.insertar(2);
        tablaHash.insertar(8);
        tablaHash.insertar(3);
        tablaHash.insertar(11);
        tablaHash.insertar(46);
        tablaHash.insertar(18);
        tablaHash.insertar(6);
        tablaHash.insertar(34);
        tablaHash.insertar(26);
        tablaHash.insertar(16);
        tablaHash.insertar(42);
        tablaHash.insertar(30);*/
       
       
        tablaHash.mostrarTablaHash();
      
        tablaHash.insertar(26); 
       
         
        tablaHash.mostrarTablaHash();
       
        tablaHash.insertar(28); 
       

        tablaHash.mostrarTablaHash();
    }
    
}
