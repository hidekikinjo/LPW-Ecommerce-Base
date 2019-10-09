
package db;
import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

public class Mock {

   private static String https;

   public static void makeMock() {
      createUsers ();
      createProducts();

   }
   private static void createUsers() {
      ArrayList<Usuario> lista;

      if(Usuario.getLista().isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("123");
         gerente.setNome("Fulano de Tal");
         lista.add(gerente);
      }
   }
   private static void createProducts() {
     ArrayList<Produto> lista;

      if (Produto.getLista() .isEmpty()){
         lista = Produto.getLista ();

         Produto caneta = new Produto ();
         caneta.setDescricao("Caneta Bic");
         caneta.setPreco (8.5f);
         caneta.setImagem ("https://www.noffice.com.br/wp-content/uploads/2019/08/caneta-esferografica-bic-07-azul-600x600.jpg");
         caneta.setOferta (true);
         lista.add(caneta);

             Produto caderno = new Produto ();
         caderno.setDescricao("Caderno Bic");
         caderno.setPreco (7.5f);
         caderno.setOferta (true);
         lista.add(caderno);

         Produto caneca = new Produto ();
         caneca.setDescricao("Caneca Bic");
         caneca.setPreco (6.5f);
         caneca.setOferta (false);
         lista.add(caneca);

         Produto lapis = new Produto ();
         lapis .setDescricao("Lapis Bic");
         lapis .setPreco (5.5f);
         lapis .setOferta (false);
         lista.add(lapis );

         Produto borracha = new Produto ();
         borracha .setDescricao("Borracha Bic");
         borracha .setPreco (4.5f);
         borracha .setOferta (false);
         lista.add(borracha );

         Produto seila = new Produto ();
         seila .setDescricao("Seila Bic");
         seila .setPreco (3.5f);
         seila .setOferta (false);
         lista.add(seila );

         Produto naosei = new Produto ();
         naosei.setDescricao("Naosei Bic");
         naosei .setPreco (2.5f);
         naosei .setOferta (false);
         lista.add(naosei );


      }


   }
}
