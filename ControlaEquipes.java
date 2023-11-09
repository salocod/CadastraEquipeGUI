
import java.util.ArrayList;

public class ControlaEquipes {
    
      private ArrayList<Equipe> listaEquipe;
      
      public ControlaEquipes() {
          listaEquipe = new ArrayList<>();
      }
      
      public boolean adicionarEquipe(Equipe equipe) {
        if(equipe==null) return false;
          for(Equipe var : listaEquipe) {
              if(equipe.getCodinome().equals(var.getCodinome())) {
                  return false;
              }             
          }
          return listaEquipe.add(equipe);
      }
      
      @Override
      public String toString() {
        if(listaEquipe.isEmpty()) return "Lista vazia.";
          listaEquipe.sort((nome1, nome2) -> nome1.getCodinome().compareTo(nome2.getCodinome()));
          String lista = "";
          for(Equipe e : listaEquipe) {
              lista += "\nCodinome: " + e.getCodinome() +
                      "\nQuantidade: " + e.getquantidade() +
                      "\nLatitude: " + e.getLatitude() +
                      "\nLongitude: " + e.getLongitude() + "\n";
          }
          return lista;
      }
    
}
