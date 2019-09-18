
package db;
import java.util.ArrayList;
import modelos.Produto;

public class Mock {
   private static ArrayList<Produto> lista;
   public static void makeMock() {

      if (lista == null) {
         lista = Produto.getLista ();

         Produto caneta = new Produto ();
         caneta.setDescricao("Caneta Bic");
         caneta.setPreco (8.5f);
         caneta.setOferta (true);
         lista.add(caneta);

             Produto caderno = new Produto ();
         caderno.setDescricao("caderno Bic");
         caderno.setPreco (7.5f);
         caderno.setOferta (true);
         lista.add(caderno);

         Produto caneca = new Produto ();
         caneca.setDescricao("caneca Bic");
         caneca.setPreco (6.5f);
         caneca.setOferta (false);
         lista.add(caneca);

         Produto lapis = new Produto ();
         lapis .setDescricao("lapis Bic");
         lapis .setPreco (5.5f);
         lapis .setOferta (false);
         lista.add(lapis );

         Produto borracha = new Produto ();
         borracha .setDescricao("borracha Bic");
         borracha .setPreco (4.5f);
         borracha .setOferta (false);
         lista.add(borracha );

         Produto seila = new Produto ();
         seila .setDescricao("seila Bic");
         seila .setPreco (3.5f);
         seila .setOferta (false);
         lista.add(seila );

         Produto naosei = new Produto ();
         naosei.setDescricao("naosei Bic");
         naosei .setPreco (2.5f);
         naosei .setOferta (false);
         lista.add(naosei );


      }


   }
}
